import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApiResponse, Artwork } from '../types';
import { firstValueFrom, Observable } from 'rxjs';
import { environment } from '../../environments/environment';
@Injectable({
  providedIn: 'root',
})
export class ArtworkService {
  private url: string | undefined = environment.apiUrl;

  constructor(private http: HttpClient) {}

  public getArtworks(query: string): Observable<ApiResponse<Artwork[]>> {
    console.log(this.url);
    const response = this.http.get<ApiResponse<Artwork[]>>(
      `${this.url}/artworks`,
      {
        params: {
          query,
        },
        headers: {
          Accept: 'application/json',
        },
      }
    );

    return response;
  }
}
