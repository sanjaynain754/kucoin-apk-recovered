package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004HÖ\u0001¨\u0006\f"}, m90084d2 = {"Lcoil/size/OriginalSize;", "Lcoil/size/Size;", "()V", "describeContents", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class OriginalSize extends Size {

    @NotNull
    public static final OriginalSize INSTANCE = new OriginalSize();

    @NotNull
    public static final Parcelable.Creator<OriginalSize> CREATOR = new C5049a();

    /* JADX INFO: renamed from: coil.size.OriginalSize$a */
    /* JADX INFO: compiled from: Size.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5049a implements Parcelable.Creator<OriginalSize> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OriginalSize[] newArray(int i11) {
            return new OriginalSize[i11];
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OriginalSize createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return OriginalSize.INSTANCE;
        }
    }

    private OriginalSize() {
        super(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
