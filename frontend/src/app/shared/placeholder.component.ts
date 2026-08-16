import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  templateUrl: './placeholder.component.html'
})
export class PlaceholderComponent {
  feature = '';

  constructor(route: ActivatedRoute) {
    this.feature = route.snapshot.data['feature'];
  }
}
