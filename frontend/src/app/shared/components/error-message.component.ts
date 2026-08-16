import { Component, Input } from '@angular/core';
@Component({ selector: 'app-error-message', template: '<p class="error" role="alert">{{ message }}</p>' })
export class ErrorMessageComponent { @Input() message = ''; }
