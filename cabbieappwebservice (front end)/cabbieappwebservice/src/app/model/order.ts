import { Cabcompany } from "./cabcompany";
import { Payment } from "./payment";

export class Order {

    cabcompany:Cabcompany;
	payment:Payment;
    constructor(){
        this.cabcompany = new Cabcompany();
        this.payment = new Payment();
    }
}
