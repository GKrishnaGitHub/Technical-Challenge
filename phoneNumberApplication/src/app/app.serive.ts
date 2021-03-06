import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AppService {

    constructor (private http:HttpClient){}

    fetchData(number, pageNo, pageSize) {
        return this.http.get('http://localhost:8080/getPossibleCombinations?number='+number+'&pageNo='+pageNo+'&pageSize='+pageSize);
    }
}