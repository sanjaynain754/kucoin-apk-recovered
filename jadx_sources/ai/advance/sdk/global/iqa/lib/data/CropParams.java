package ai.advance.sdk.global.iqa.lib.data;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes23.dex */
public class CropParams implements Parcelable {
    public static final Parcelable.Creator<CropParams> CREATOR = new C0357a();
    public Rect cropRect;
    public int previewHeight;
    public int previewWidth;
    public int quality;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.data.CropParams$a */
    public class C0357a implements Parcelable.Creator<CropParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CropParams createFromParcel(Parcel parcel) {
            return new CropParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CropParams[] newArray(int i11) {
            return new CropParams[i11];
        }
    }

    public CropParams() {
        this.quality = 80;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CropParams(Parcel parcel) {
        this.quality = 80;
        this.previewWidth = parcel.readInt();
        this.previewHeight = parcel.readInt();
        this.quality = parcel.readInt();
        this.cropRect = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public String toString() {
        return "CropParams{previewWidth=" + this.previewWidth + ", previewHeight=" + this.previewHeight + ", quality=" + this.quality + ", cropRect=" + this.cropRect + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeInt(this.quality);
        parcel.writeParcelable(this.cropRect, i11);
    }
}
