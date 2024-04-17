import { Component } from '@angular/core';
import { CabbieService } from '../../service/cabbiesrv.service';
import { Cab } from '../../model/cab';
  

@Component({
  selector: 'app-cabs',
  templateUrl: './cabs.component.html',
  styleUrl: './cabs.component.css'
})
export class CabsComponent {
  cabCompany: any;
  cabs: Array<Cab>

  constructor(public cabbieSrv: CabbieService) {
    this.cabs = new Array<Cab>
  }

  selectItem(item: Cab): void {
    this.cabs.push(item);
  }
  removeItem(item: Cab): void {
    this.cabs = this.cabs.filter((i) => { i.number != item.number })
  }
  addtoShoppingCart(): void {
    this.cabCompany.cabs = this.cabs
    this.cabbieSrv.addToShoppingCart(this.cabCompany)
  }

}
