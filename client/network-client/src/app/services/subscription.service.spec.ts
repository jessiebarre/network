import { TestBed } from '@angular/core/testing';

import { SubscriptionService } from './subscription.service';

describe('SubscriptionServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SubscriptionService = TestBed.get(SubscriptionService);
    expect(service).toBeTruthy();
  });
});
