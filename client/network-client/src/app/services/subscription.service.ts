import { Injectable } from "@angular/core";
import { Subscriber } from "../models/subscriber";
import { Observable, Observer } from "rxjs";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root",
})
export class SubscriptionService {
  
  subscriberObserver: Observer<Subscriber>;

  subscriberObservable: Observable<Subscriber>;

  constructor(private http: HttpClient) {
    this.subscriberObservable = new Observable<Subscriber>(observer => {
      this.subscriberObserver = observer;
    });
  }

  public createAccount(subscriber: Subscriber): Observable<any> {
    return this.http.post("http://localhost:8080/network/register", subscriber);
  }
}
