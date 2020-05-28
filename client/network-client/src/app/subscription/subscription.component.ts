import { Component, OnInit } from "@angular/core";
import { SubscriptionService } from "../services/subscription.service";
import { Subscriber } from "../models/subscriber"

@Component({
  selector: "app-subscription",
  templateUrl: "./subscription.component.html",
  styleUrls: ["./subscription.component.css"],
})
export class SubscriptionComponent implements OnInit {
  
  subscriber: Subscriber = new Subscriber();

  constructor(private subscriptionService: SubscriptionService) {}

  ngOnInit() {}

  onSubscribe() {
    this.subscriptionService
      .createAccount(this.subscriber)
      .subscribe(
        () => {
          this.subscriptionService.subscriberObserver.next(this.subscriber);
          console.log("New account registered");
          this.subscriber = new Subscriber();
        },
        () => {
          alert("Error")
        });
  }
}
