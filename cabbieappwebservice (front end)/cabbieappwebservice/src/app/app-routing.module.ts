import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CabcompaniesComponent } from './ui/cabcompanies/cabcompanies.component';
import { CabsComponent } from './ui/cabs/cabs.component';
import { ShoppingcartComponent } from './ui/shoppingcart/shoppingcart.component';

const routes: Routes = [
  {path:'cabcompanies',component:CabcompaniesComponent},
  {path:'cabs',component:CabsComponent},
  {path:'shoppingcart',component:ShoppingcartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
