package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i11) {
            return new MotionPhotoMetadata[i11];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MotionPhotoMetadata.class == obj.getClass()) {
            MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
            if (this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize) {
                return true;
            }
        }
        return false;
    }

    public MotionPhotoMetadata(long j11, long j12, long j13, long j14, long j15) {
        this.photoStartPosition = j11;
        this.photoSize = j12;
        this.photoPresentationTimestampUs = j13;
        this.videoStartPosition = j14;
        this.videoSize = j15;
    }

    public int hashCode() {
        return ((((((((527 + Longs.hashCode(this.photoStartPosition)) * 31) + Longs.hashCode(this.photoSize)) * 31) + Longs.hashCode(this.photoPresentationTimestampUs)) * 31) + Longs.hashCode(this.videoStartPosition)) * 31) + Longs.hashCode(this.videoSize);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.photoStartPosition + ", photoSize=" + this.photoSize + ", photoPresentationTimestampUs=" + this.photoPresentationTimestampUs + ", videoStartPosition=" + this.videoStartPosition + ", videoSize=" + this.videoSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }
}
