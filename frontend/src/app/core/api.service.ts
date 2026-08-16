import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { API_CONFIG } from './api.config';

@Injectable({ providedIn: 'root' })
export class ApiService {
  constructor(private http: HttpClient) { }

  // Reusable GET request for the Spring Boot API.
  get<T>(path: string) {
    return this.http.get<T>(API_CONFIG.baseUrl + '/' + path);
  }
}
