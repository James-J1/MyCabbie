import { Component } from '@angular/core';
import { Cabcompany } from '../../model/cabcompany';
import { CabbieService } from '../../service/cabbiesrv.service';

@Component({
  selector: 'app-cabcompanies',
  templateUrl: './cabcompanies.component.html',
  styleUrl: './cabcompanies.component.css'
})
export class CabcompaniesComponent {
  cabCompanies: Array<Cabcompany>

  constructor(public cabbieSrv: CabbieService) {
    this.cabCompanies = new Array<Cabcompany>
    this.getCabCompanies()
  }

  getCabCompanies(): void {
    this.cabbieSrv.getCabCompanies().subscribe({
      next: (data: any) => { this.cabCompanies = data },
      error: (error: any) => { console.log("[CabCompaniesComponent] getCabCompanies error", error) },
      complete: () => { console.log("[CabCompaniesComponent] getCabCompanies complete") }
    })
  }
  selectCabCompany(cabcompany: Cabcompany): void {
    console.log("[CabCompanies Component] selectCabCompany " + cabcompany.cabCompanyName)
  }

}
