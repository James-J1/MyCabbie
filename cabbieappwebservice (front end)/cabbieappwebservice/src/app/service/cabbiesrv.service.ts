import { Injectable } from '@angular/core';
import { Order } from '../model/order';
import { Cabcompany } from '../model/cabcompany';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CabbieService {

  constructor(public http: HttpClient) { }

  getShoppingCart(): Array<Cabcompany> {
    let result: Array<Cabcompany> = new Array<Cabcompany>()
    this.http.get("http://localhost:8080/api/getshoppingcart").subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[CabbieService] getShoppingCart:Error::", error) },
      complete: () => { "[CabbieService] getShoppingCart:Complete" }
    })
    return result
  }

  addToShoppingCart(cabcompany: Cabcompany): Array<Cabcompany> {
    let result: Array<Cabcompany> = new Array<Cabcompany>()
    this.http.post("http://localhost:8080/api/addtoshoppingcart", cabcompany).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[CabbieService] addToShoppingCart:Error::", error) },
      complete: () => { "[CabbieService] addToShoppingCart:Complete" }
    })
    return result
  }

  removeFromShoppingCart(cabcompany: Cabcompany): Array<Cabcompany> {
    let result: Array<Cabcompany> = new Array<Cabcompany>()
    this.http.post("http://localhost:8080/api/removefromshoppingcart", cabcompany).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[CabbieService] removeFromShoppingCart:Error::", error) },
      complete: () => { console.log("[CabbieService] removeFromShoppingCart:Complete") }
    })
    return result
  }
  getCabCompanies(): Observable<Array<Cabcompany>> {
   return this.http.get<Array<Cabcompany>>("http://localhost:8080/api/getcabcompanies")

  }

  getCabCompany(cabCompanyName: String): Cabcompany {
    let result: Cabcompany = new Cabcompany()
    this.http.get("http://localhost:8080/api/getcabcompany?integratorName=" + cabCompanyName).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[CabbieService] getCabCompany:Error::", error) },
      complete: () => { console.log("[CabbieService] getCabCompany:Complete") }
    })
    return result
  }

  submitOrder(order: Order): Response {
    let result: Response = new Response()
    this.http.post("http://localhost:8080/api/submitorder", order).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[CabbieService] submitOrder:Error::", error) },
      complete: () => { console.log("[CabbieService] submitOrder:Complete") }
    })
    return result
  }

}
