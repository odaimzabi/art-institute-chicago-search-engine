import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Artwork } from './types';
import { ArtworkService } from './services/artwork.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgxEnvModule } from '@ngx-env/core';
import { CardComponent } from './components/card/card.component';
@Component({
  selector: 'app-root',
  imports: [CommonModule, FormsModule, CardComponent],
  templateUrl: './app.component.html',

  styleUrl: './app.component.css',
})
export class AppComponent {
  artworks: Artwork[] = [];
  query: string = '';
  error: string | null = null;
  isLoading: boolean = false;

  constructor(private artworkService: ArtworkService) {}

  public onSearch() {
    this.error = null;
    this.isLoading = true;

    if (!this.query.trim()) {
      this.error = 'Please enter a search term.';
      return;
    }

    this.artworkService.getArtworks(this.query.trim()).subscribe({
      next: (value) => {
        this.artworks = value.data;
      },
      error: (err) => {
        this.error = 'An error occurred while fetching results.';
        console.error(err);
      },
      complete: () => {
        this.isLoading = false;
      },
    });
  }
}
