export type ApiResponse<T> = {
  message: string;
  data: T;
};

export type ArtworkThumbnail = {
  lqip: string;
  width: number;
  height: number;
  alt_text: string;
};

export type Artwork = {
  id: number;
  thumbnail: ArtworkThumbnail;
  title: string;
  image_id: string;
};
