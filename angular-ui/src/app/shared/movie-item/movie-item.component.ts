import { Component, Input } from '@angular/core';
import { Movie } from '../movie.model';
import { trigger, transition, style, animate } from '@angular/animations';

@Component({
  selector: 'app-movie-item',
  templateUrl: './movie-item.component.html',
  styleUrls: ['./movie-item.component.css'],
  animations: [
    trigger('fadeIn', [
      transition(':enter', [
        style({ opacity: 0 }),
        animate('1200ms', style({ opacity: 1 })),
      ]),
    ]),
  ],
})
export class MovieItemComponent {
  @Input() movieItem!: Movie;
}
