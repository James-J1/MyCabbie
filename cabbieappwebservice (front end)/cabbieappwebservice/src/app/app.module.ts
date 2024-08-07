import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CabcompaniesComponent } from './ui/cabcompanies/cabcompanies.component';
import { CabsComponent } from './ui/cabs/cabs.component';
import { ShoppingcartComponent } from './ui/shoppingcart/shoppingcart.component';


@NgModule({
  declarations: [
    AppComponent,
    CabcompaniesComponent,
    CabsComponent,
    ShoppingcartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
