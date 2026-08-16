import { Component } from '@angular/core';
import { HealthService } from '../../core/health.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html'
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
    // Ask the backend whether it is running when the home page opens.
    this.healthService.check().subscribe(
      () => { this.healthLoading = false; },
      () => { this.healthLoading = false; this.healthError = 'The store API is currently unavailable.'; }
    );
  }
}
