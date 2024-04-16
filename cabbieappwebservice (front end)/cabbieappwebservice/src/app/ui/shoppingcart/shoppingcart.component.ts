import { Component } from '@angular/core';
import { CabbieService } from '../../service/cabbiesrv.service';
import { Cabcompany } from '../../model/cabcompany';
import { Payment } from '../../model/payment';
import { Order } from '../../model/order';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrl: './shoppingcart.component.css'
})
export class ShoppingcartComponent {
  cabCompanies:Array<Cabcompany>
  payment:Payment

  constructor(public cabbieSrv:CabbieService){ 
    this.cabCompanies = new Array<Cabcompany>
    this.payment
    this.getShoppingCart()
  }
  getShoppingCart():void{
    this.cabbieSrv.getShoppingCart()
  }
  removeCabCompany(cabcompany:Cabcompany):void{
    this.cabCompanies = this.cabCompanies.filter( (c) => c.cabCompanyName != cabcompany.cabCompanyName)
  }
  submitOrder():void{
    let order:Order = new Order()
    order.cabcompany = this.cab
  }

}
