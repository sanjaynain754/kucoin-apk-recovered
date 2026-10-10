package com.kubi.core.base.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$SegmentItem, reason: from toString */
/* JADX INFO: compiled from: MakeOrderData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/base/order/data/MakeOrderData$SegmentItem;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getSize", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SegmentItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SegmentItem> CREATOR = new C11612a();

    @NotNull
    private final String price;

    @NotNull
    private final String size;

    /* JADX INFO: renamed from: com.kubi.core.base.order.data.MakeOrderData$SegmentItem$a */
    /* JADX INFO: compiled from: MakeOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11612a implements Parcelable.Creator<SegmentItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SegmentItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SegmentItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SegmentItem[] newArray(int i11) {
            return new SegmentItem[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentItem)) {
            return false;
        }
        SegmentItem segmentItem = (SegmentItem) other;
        return Intrinsics.areEqual(this.price, segmentItem.price) && Intrinsics.areEqual(this.size, segmentItem.size);
    }

    public SegmentItem(@NotNull String price, @NotNull String size) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(size, "size");
        this.price = price;
        this.size = size;
    }

    public static /* synthetic */ SegmentItem copy$default(SegmentItem segmentItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = segmentItem.price;
        }
        if ((i11 & 2) != 0) {
            str2 = segmentItem.size;
        }
        return segmentItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final SegmentItem copy(@NotNull String price, @NotNull String size) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(size, "size");
        return new SegmentItem(price, size);
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.price.hashCode() * 31) + this.size.hashCode();
    }

    @NotNull
    public String toString() {
        return "SegmentItem(price=" + this.price + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.price);
        dest.writeString(this.size);
    }
}
