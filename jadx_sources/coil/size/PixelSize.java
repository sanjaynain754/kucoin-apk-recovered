package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Px;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final /* data */ class PixelSize extends Size {

    @NotNull
    public static final Parcelable.Creator<PixelSize> CREATOR = new C5050a();
    private final int height;
    private final int width;

    /* JADX INFO: renamed from: coil.size.PixelSize$a */
    /* JADX INFO: compiled from: Size.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5050a implements Parcelable.Creator<PixelSize> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PixelSize[] newArray(int i11) {
            return new PixelSize[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PixelSize createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixelSize(parcel.readInt(), parcel.readInt());
        }
    }

    public PixelSize(@Px int i11, @Px int i12) {
        super(null);
        this.width = i11;
        this.height = i12;
        if (!(i11 > 0 && i12 > 0)) {
            throw new IllegalArgumentException("width and height must be > 0.");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelSize)) {
            return false;
        }
        PixelSize pixelSize = (PixelSize) other;
        return this.width == pixelSize.width && this.height == pixelSize.height;
    }

    public static /* synthetic */ PixelSize copy$default(PixelSize pixelSize, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = pixelSize.width;
        }
        if ((i13 & 2) != 0) {
            i12 = pixelSize.height;
        }
        return pixelSize.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final PixelSize copy(@Px int width, @Px int height) {
        return new PixelSize(width, height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height);
    }

    @NotNull
    public String toString() {
        return "PixelSize(width=" + this.width + ", height=" + this.height + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
