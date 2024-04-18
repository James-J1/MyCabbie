import { Component } from '@angular/core';
import { CabbieService } from '../../service/cabbiesrv.service';
import { Cab } from '../../model/cab';
import { DatashareService } from '../../service/datashare.service';
  

@Component({
  selector: 'app-cabs',
  templateUrl: './cabs.component.html',
  styleUrl: './cabs.component.css'
})
export class CabsComponent {
  cabCompany: any;

  constructor(public cabbieSrv: CabbieService, private dataSrvc:DatashareService) {
    this.cabCompany = dataSrvc.getData()
  }

  selectItem(item: Cab): void {
    this.cabCompany.cabs.push(item);
  }
  removeItem(item: Cab): void {
    this.cabCompany.cabs =  this.cabCompany.cabs.filter((i:Cab) => { i.number != item.number })
  }
  addtoShoppingCart(): void {
    this.cabbieSrv.addToShoppingCart(this.cabCompany)
  }

}
