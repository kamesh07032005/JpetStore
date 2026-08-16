import { Routes } from '@angular/router';
import { HomeComponent } from './features/home/home.component';
import { PlaceholderComponent } from './shared/placeholder.component';
export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'catalog', component: PlaceholderComponent, data: { feature: 'Catalog' } },
  { path: 'account', component: PlaceholderComponent, data: { feature: 'Account' } },
  { path: 'cart', component: PlaceholderComponent, data: { feature: 'Cart' } },
  { path: 'orders', component: PlaceholderComponent, data: { feature: 'Orders' } },
  { path: '**', redirectTo: '' }
];
