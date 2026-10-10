package com.kubi.home.empty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kucoin.home.cards.BaseCardData;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EmptyCardData.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/empty/EmptyCardData;", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "<init>", "()V", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EmptyCardData extends BaseCardData {

    @NotNull
    public static final Parcelable.Creator<EmptyCardData> CREATOR = new C14546a();

    /* JADX INFO: renamed from: com.kubi.home.empty.EmptyCardData$a */
    /* JADX INFO: compiled from: EmptyCardData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14546a implements Parcelable.Creator<EmptyCardData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmptyCardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new EmptyCardData();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EmptyCardData[] newArray(int i11) {
            return new EmptyCardData[i11];
        }
    }

    public EmptyCardData() {
        super(0, -1, 0, false, 0, "EMPTY", "empty", 0, BuiltinOperator.UNSORTED_SEGMENT_MIN, null);
    }

    @NotNull
    public String toString() {
        return "EMPTY";
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
