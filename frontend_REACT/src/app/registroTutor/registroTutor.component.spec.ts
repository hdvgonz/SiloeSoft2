import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistroTutorComponent} from './registroTutor.component';

describe('registroTutorComponent', () => {
  let component: RegistroTutorComponent;
  let fixture: ComponentFixture<RegistroTutorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistroTutorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistroTutorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
