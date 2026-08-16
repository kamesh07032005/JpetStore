import { Component } from '@angular/core';
import { HealthService } from '../../core/services/health.service';

@Component({
  selector: 'app-home',
  template: `
    <section class="hero"><p class="eyebrow">Welcome to</p><h1>JPetStore</h1><p>Everything your pet needs, thoughtfully organized.</p></section>
    <app-loading *ngIf="healthLoading"></app-loading>
    <app-error-message *ngIf="healthError" [message]="healthError"></app-error-message>
    <section aria-labelledby="categories"><h2 id="categories">Shop by pet</h2><div class="categories">
      <a class="category" routerLink="/catalog" *ngFor="let category of categories"><span>{{ category.icon }}</span><h3>{{ category.name }}</h3><p>{{ category.description }}</p></a>
    </div></section>`
})
export class HomeComponent {
  healthLoading = true;
  healthError = '';
  categories = [
    { name: 'Fish', icon: '🐠', description: 'Aquatic companions' },
    { name: 'Dogs', icon: '🐕', description: 'For canine friends' },
    { name: 'Cats', icon: '🐈', description: 'For feline friends' },
    { name: 'Reptiles', icon: '🦎', description: 'Terrarium pets' },
    { name: 'Birds', icon: '🦜', description: 'Feathered companions' }
  ];

  constructor(private healthService: HealthService) {
    this.healthService.check().subscribe(
      () => { this.healthLoading = false; },
      () => { this.healthLoading = false; this.healthError = 'The store API is currently unavailable.'; }
    );
  }
}
