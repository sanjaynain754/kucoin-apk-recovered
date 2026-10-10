package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$RespOrderItem, reason: from toString */
/* JADX INFO: compiled from: UtaCancelOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaCancelOrderData$RespOrderItem;", "Landroid/os/Parcelable;", "code", "", "msg", "orderId", "ts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMsg", "getOrderId", "getTs", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RespOrderItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RespOrderItem> CREATOR = new C26939a();

    @Nullable
    private final String code;

    @Nullable
    private final String msg;

    @Nullable
    private final String orderId;

    @Nullable
    private final String ts;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaCancelOrderData$RespOrderItem$a */
    /* JADX INFO: compiled from: UtaCancelOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26939a implements Parcelable.Creator<RespOrderItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RespOrderItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RespOrderItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RespOrderItem[] newArray(int i11) {
            return new RespOrderItem[i11];
        }
    }

    public static /* synthetic */ RespOrderItem copy$default(RespOrderItem respOrderItem, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = respOrderItem.code;
        }
        if ((i11 & 2) != 0) {
            str2 = respOrderItem.msg;
        }
        if ((i11 & 4) != 0) {
            str3 = respOrderItem.orderId;
        }
        if ((i11 & 8) != 0) {
            str4 = respOrderItem.ts;
        }
        return respOrderItem.copy(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespOrderItem)) {
            return false;
        }
        RespOrderItem respOrderItem = (RespOrderItem) other;
        return Intrinsics.areEqual(this.code, respOrderItem.code) && Intrinsics.areEqual(this.msg, respOrderItem.msg) && Intrinsics.areEqual(this.orderId, respOrderItem.orderId) && Intrinsics.areEqual(this.ts, respOrderItem.ts);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTs() {
        return this.ts;
    }

    @NotNull
    public final RespOrderItem copy(@Nullable String code, @Nullable String msg, @Nullable String orderId, @Nullable String ts2) {
        return new RespOrderItem(code, msg, orderId, ts2);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getTs() {
        return this.ts;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.orderId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ts;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RespOrderItem(code=" + this.code + ", msg=" + this.msg + ", orderId=" + this.orderId + ", ts=" + this.ts + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.msg);
        dest.writeString(this.orderId);
        dest.writeString(this.ts);
    }

    public RespOrderItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.code = str;
        this.msg = str2;
        this.orderId = str3;
        this.ts = str4;
    }
}
