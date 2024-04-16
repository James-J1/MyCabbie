import { Component } from '@angular/core';
import { Cabcompany } from '../../model/cabcompany';
import { CabbieService } from '../../service/cabbiesrv.service';

@Component({
  selector: 'app-cabcompanies',
  templateUrl: './cabcompanies.component.html',
  styleUrl: './cabcompanies.component.css'
})
export class CabcompaniesComponent {
  cabcompany:Cabcompany = new Cabcompany()
  constructor(public cabbieSrv:CabbieService){}

  getCabCompanies():Array<Cabcompany> {
    return this.cabbieSrv.getCabCompanies()
  }
  selectCabCompany():void{
    
  }

}
