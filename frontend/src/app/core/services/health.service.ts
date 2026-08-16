import { Injectable } from '@angular/core';
import { ApiService } from './api.service';
export interface HealthResponse { status: string; }
@Injectable({ providedIn: 'root' })
export class HealthService {
  constructor(private api: ApiService) { }
  check() { return this.api.get<HealthResponse>('health'); }
}
