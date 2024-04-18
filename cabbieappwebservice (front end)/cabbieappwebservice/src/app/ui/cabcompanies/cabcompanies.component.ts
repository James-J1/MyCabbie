import { Component } from '@angular/core';
import { Cabcompany } from '../../model/cabcompany';
import { CabbieService } from '../../service/cabbiesrv.service';
import { Router } from '@angular/router';
import { DatashareService } from '../../service/datashare.service';

@Component({
  selector: 'app-cabcompanies',
  templateUrl: './cabcompanies.component.html',
  styleUrl: './cabcompanies.component.css'
})
export class CabcompaniesComponent {
  cabCompanies: Array<Cabcompany>

  constructor(public cabbieSrv: CabbieService, private router:Router, private dataSrvc:DatashareService) {
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
    this.dataSrvc.setData(cabcompany)
    this.router.navigate(['/cabs'])
  }

}
