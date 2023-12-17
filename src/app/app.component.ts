import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Info } from 'src/info';
import { InfoService } from 'src/service/info.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  
  constructor(private fromBuilder: FormBuilder,
    private infoService:InfoService, private toastr:ToastrService) {
  }


  bilgi: FormGroup;

  ngOnInit(): void {
 
     this.createForm()
    
  }

  createForm() {
    this.bilgi = this.fromBuilder.group({
      name: ["", Validators.required],
      tc:  ["",[  Validators.required,Validators.pattern('^[0-9]+$')]],
      email: ["", Validators.required],
      phone: ["",[  Validators.required,Validators.pattern('^[0-9]+$')]],
      adress: ["", Validators.required],
      birthDate: ["", Validators.required],
      parakende: ["", Validators.required],
      ek: ["", Validators.required],
      semt: ["", Validators.required],
      reason: ["", Validators.required],
      quantity:  ["",[  Validators.required,Validators.pattern('^[0-9]+$')]],

    })
  }

  Save() {
    if(this.bilgi.valid){
      let info :Info = Object.assign({}, this.bilgi.value)
      this.infoService.Save(info).subscribe(data=>{
        this.toastr.success('Eklendi')
      },
      ),
     
      this.bilgi.reset();
      
    }
  }

}


