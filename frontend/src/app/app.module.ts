import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './shared/header.component';
import { HomeComponent } from './features/home/home.component';
import { ErrorMessageComponent } from './shared/error-message.component';
import { LoadingComponent } from './shared/loading.component';
import { PlaceholderComponent } from './shared/placeholder.component';

@NgModule({
  // Components used by this Version 1 application.
  declarations: [AppComponent, HeaderComponent, HomeComponent, LoadingComponent, ErrorMessageComponent, PlaceholderComponent],
  // Browser support, HTTP support, and route support.
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  // Angular begins with AppComponent.
  bootstrap: [AppComponent]
})
export class AppModule { }
