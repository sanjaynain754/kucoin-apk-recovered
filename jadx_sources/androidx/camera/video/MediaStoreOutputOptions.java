package androidx.camera.video;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
public final class MediaStoreOutputOptions extends OutputOptions {
    public static final ContentValues EMPTY_CONTENT_VALUES = new ContentValues();
    private final MediaStoreOutputOptionsInternal mMediaStoreOutputOptionsInternal;

    public static final class Builder extends OutputOptions.Builder<MediaStoreOutputOptions, Builder> {
        private final MediaStoreOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ContentResolver contentResolver, Uri uri) {
            super(new C1257xb232ee01.Builder());
            Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            MediaStoreOutputOptionsInternal.Builder builder = (MediaStoreOutputOptionsInternal.Builder) this.mRootInternalBuilder;
            this.mInternalBuilder = builder;
            builder.setContentResolver(contentResolver).setCollectionUri(uri).setContentValues(MediaStoreOutputOptions.EMPTY_CONTENT_VALUES);
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        public MediaStoreOutputOptions build() {
            return new MediaStoreOutputOptions(this.mInternalBuilder.build());
        }

        public Builder setContentValues(ContentValues contentValues) {
            Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.mInternalBuilder.setContentValues(contentValues);
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setDurationLimitMillis(@IntRange(from = 0) long j11) {
            return super.setDurationLimitMillis(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setFileSizeLimit(@IntRange(from = 0) long j11) {
            return super.setFileSizeLimit(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setLocation(Location location) {
            return super.setLocation(location);
        }
    }

    @AutoValue
    public static abstract class MediaStoreOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            public abstract MediaStoreOutputOptionsInternal build();

            public abstract Builder setCollectionUri(Uri uri);

            public abstract Builder setContentResolver(ContentResolver contentResolver);

            public abstract Builder setContentValues(ContentValues contentValues);
        }

        public abstract Uri getCollectionUri();

        public abstract ContentResolver getContentResolver();

        public abstract ContentValues getContentValues();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaStoreOutputOptions) {
            return this.mMediaStoreOutputOptionsInternal.equals(((MediaStoreOutputOptions) obj).mMediaStoreOutputOptionsInternal);
        }
        return false;
    }

    public Uri getCollectionUri() {
        return this.mMediaStoreOutputOptionsInternal.getCollectionUri();
    }

    public ContentResolver getContentResolver() {
        return this.mMediaStoreOutputOptionsInternal.getContentResolver();
    }

    public ContentValues getContentValues() {
        return this.mMediaStoreOutputOptionsInternal.getContentValues();
    }

    public int hashCode() {
        return this.mMediaStoreOutputOptionsInternal.hashCode();
    }

    public String toString() {
        return this.mMediaStoreOutputOptionsInternal.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }

    public MediaStoreOutputOptions(MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal) {
        super(mediaStoreOutputOptionsInternal);
        this.mMediaStoreOutputOptionsInternal = mediaStoreOutputOptionsInternal;
    }
}
