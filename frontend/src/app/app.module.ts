import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './core/layout/header.component';
import { HomeComponent } from './features/home/home.component';
import { ErrorMessageComponent } from './shared/components/error-message.component';
import { LoadingComponent } from './shared/components/loading.component';
import { PlaceholderComponent } from './shared/components/placeholder.component';

@NgModule({
  declarations: [AppComponent, HeaderComponent, HomeComponent, LoadingComponent, ErrorMessageComponent, PlaceholderComponent],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
