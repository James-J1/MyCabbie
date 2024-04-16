import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CabcompaniesComponent } from './cabcompanies.component';

describe('CabcompaniesComponent', () => {
  let component: CabcompaniesComponent;
  let fixture: ComponentFixture<CabcompaniesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CabcompaniesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CabcompaniesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
