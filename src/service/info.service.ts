import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Info } from 'src/info';

@Injectable({
  providedIn: 'root'
})
export class InfoService {

  constructor(private http:HttpClient) { }

  Save(info:Info):Observable<any>{
    console.log(info)
    let url = 'http://localhost:8081/api/info/add'
    return this.http.post<any>(url,info)
  }
}
