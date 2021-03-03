import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { RichiestaDto } from './richiesta-dto';
import { RispostaDto } from './risposta-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  op1s: number = 0;
  op2s: number = 0;
  op1d: number = 0;
  op2d: number = 0;
  op1m: number = 0;
  op2m: number = 0;
  op1dv: number = 0;
  op2dv: number = 0;
  op1md: number = 0;
  op2md: number = 0;
  risSomma: number;
  risSottr: number;
  risMolt: number;
  risDiv: number;
  risModulo: number;

  constructor(private http: HttpClient) { }

  somma() {
    let dto: RichiestaDto = new RichiestaDto();
    dto.operatore1 = this.op1s;
    dto.operatore2 = this.op2s;

    let oss: Observable<RispostaDto> = this.http.post<RispostaDto>("http://localhost:8080/somma", dto);
    oss.subscribe(d => this.risSomma = d.risultato);

  }
  sottrai() {

  }
  moltiplica() {

  }
  dividi() {

  }
  modulo() {

  }


}
