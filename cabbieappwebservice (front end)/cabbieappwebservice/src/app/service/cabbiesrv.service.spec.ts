import { TestBed } from '@angular/core/testing';

import { CabbieService } from './cabbiesrv.service';

describe('CabbiesrvService', () => {
  let service: CabbieService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CabbieService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
