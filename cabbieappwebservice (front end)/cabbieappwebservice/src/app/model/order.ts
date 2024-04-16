import { Cabcompany } from "./cabcompany";
import { Payment } from "./payment";

export class Order {

    cabcompany:Cabcompany = null;
	payment:Payment = null;
    constructor(){
        this.cabcompany = new Cabcompany();
        this.payment = new Payment();
    }
}
