import { Component, Input } from '@angular/core';
import { Artwork } from '../../types';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-card',
  imports: [CommonModule],
  templateUrl: './card.component.html',
  styleUrl: './card.component.css',
})
export class CardComponent {
  @Input() artwork: Artwork | null = null;
  rawImageUrl: string | null = null;

  ngOnInit() {
    if (this.artwork) {
      this.setRawImageUrl(this.artwork.image_id);
    }
  }

  private setRawImageUrl(imageId: string) {
    this.rawImageUrl = `https://www.artic.edu/iiif/2/${imageId}/full/843,/0/default.jpg`;
  }
}
