import { Injectable } from '@angular/core';
import { ApiService } from './api.service';

export interface HealthResponse {
  status: string;
}

@Injectable({ providedIn: 'root' })
export class HealthService {
  constructor(private api: ApiService) { }

  // Calls GET http://localhost:8080/api/health
  check() {
    return this.api.get<HealthResponse>('health');
  }
}
