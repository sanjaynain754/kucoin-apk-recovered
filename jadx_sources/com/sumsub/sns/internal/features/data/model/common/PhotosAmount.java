package com.sumsub.sns.internal.features.data.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/data/model/common/PhotosAmount;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "com/sumsub/sns/internal/features/data/model/common/L2", "ONE", "TWO", "SOME", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum PhotosAmount implements Parcelable {
    ONE,
    TWO,
    SOME;


    @NotNull
    private static final String TAG = "PhotosAmount";
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C29026L2 Companion = new C29026L2();

    @NotNull
    public static final Parcelable.Creator<PhotosAmount> CREATOR = new Parcelable.Creator() { // from class: com.sumsub.sns.internal.features.data.model.common.M2
        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new PhotosAmount[i11];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return PhotosAmount.valueOf(parcel.readString());
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public static EnumEntries<PhotosAmount> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.writeString(name());
    }
}
