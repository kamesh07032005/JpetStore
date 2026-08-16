import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
@Component({ template: '<section class="placeholder"><h1>{{ feature }}</h1><p>This feature will be introduced in a future version.</p></section>' })
export class PlaceholderComponent {
  feature = '';
  constructor(route: ActivatedRoute) { this.feature = route.snapshot.data['feature']; }
}
