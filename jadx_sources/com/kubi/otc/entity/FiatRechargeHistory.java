package com.kubi.otc.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.otc.R$string;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006."}, m90084d2 = {"Lcom/kubi/otc/entity/FiatRechargeHistory;", "Landroid/os/Parcelable;", "amount", "", "appealStatus", "coin", TUIConstantDefine.CREATE_TIME, "", "orderId", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getAppealStatus", "getCoin", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOrderId", "getStatus", "getStatusString", "context", "Landroid/content/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/FiatRechargeHistory;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatRechargeHistory implements Parcelable {

    @NotNull
    private static final String STATUS_DELAYED = "6";

    @NotNull
    private static final String STATUS_FAILED = "2";

    @NotNull
    private static final String STATUS_PROCESSING = "0";

    @NotNull
    private static final String STATUS_REFUND_COMPLETED = "5";

    @NotNull
    private static final String STATUS_REFUND_FAILED = "7";

    @NotNull
    private static final String STATUS_REFUND_PROCESSING = "4";

    @NotNull
    private static final String STATUS_SUCCESSFUL = "1";

    @Nullable
    private final String amount;

    @Nullable
    private final String appealStatus;

    @Nullable
    private final String coin;

    @Nullable
    private final Long createTime;

    @Nullable
    private final String orderId;

    @Nullable
    private final String status;

    @NotNull
    public static final Parcelable.Creator<FiatRechargeHistory> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatRechargeHistory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatRechargeHistory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatRechargeHistory(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatRechargeHistory[] newArray(int i11) {
            return new FiatRechargeHistory[i11];
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
        if (!(other instanceof FiatRechargeHistory)) {
            return false;
        }
        FiatRechargeHistory fiatRechargeHistory = (FiatRechargeHistory) other;
        return Intrinsics.areEqual(this.amount, fiatRechargeHistory.amount) && Intrinsics.areEqual(this.appealStatus, fiatRechargeHistory.appealStatus) && Intrinsics.areEqual(this.coin, fiatRechargeHistory.coin) && Intrinsics.areEqual(this.createTime, fiatRechargeHistory.createTime) && Intrinsics.areEqual(this.orderId, fiatRechargeHistory.orderId) && Intrinsics.areEqual(this.status, fiatRechargeHistory.status);
    }

    public static /* synthetic */ FiatRechargeHistory copy$default(FiatRechargeHistory fiatRechargeHistory, String str, String str2, String str3, Long l11, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatRechargeHistory.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatRechargeHistory.appealStatus;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatRechargeHistory.coin;
        }
        if ((i11 & 8) != 0) {
            l11 = fiatRechargeHistory.createTime;
        }
        if ((i11 & 16) != 0) {
            str4 = fiatRechargeHistory.orderId;
        }
        if ((i11 & 32) != 0) {
            str5 = fiatRechargeHistory.status;
        }
        String str6 = str4;
        String str7 = str5;
        return fiatRechargeHistory.copy(str, str2, str3, l11, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoin() {
        return this.coin;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final FiatRechargeHistory copy(@Nullable String amount, @Nullable String appealStatus, @Nullable String coin, @Nullable Long createTime, @Nullable String orderId, @Nullable String status) {
        return new FiatRechargeHistory(amount, appealStatus, coin, createTime, orderId, status);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getAppealStatus() {
        return this.appealStatus;
    }

    @Nullable
    public final String getCoin() {
        return this.coin;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    @NotNull
    public final String getStatusString(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.status;
        if (str != null) {
            switch (str.hashCode()) {
                case 48:
                    if (!str.equals("0")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.in_progress);
                    }
                    break;
                case 49:
                    if (!str.equals("1")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.completed);
                    }
                    break;
                case 50:
                    if (!str.equals("2")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.failed);
                    }
                    break;
                case 51:
                default:
                    string = context.getString(R$string.in_progress);
                    break;
                case 52:
                    if (!str.equals("4")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_under_refund);
                    }
                    break;
                case 53:
                    if (!str.equals("5")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_refunded);
                    }
                    break;
                case 54:
                    if (!str.equals(STATUS_DELAYED)) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_delayed_settlement);
                    }
                    break;
                case 55:
                    if (!str.equals("7")) {
                        string = context.getString(R$string.in_progress);
                    } else {
                        string = context.getString(R$string.payment_order_refunded_failure);
                    }
                    break;
            }
        } else {
            string = context.getString(R$string.in_progress);
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appealStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coin;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.createTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.orderId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.status;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatRechargeHistory(amount=" + this.amount + ", appealStatus=" + this.appealStatus + ", coin=" + this.coin + ", createTime=" + this.createTime + ", orderId=" + this.orderId + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.amount);
        dest.writeString(this.appealStatus);
        dest.writeString(this.coin);
        Long l11 = this.createTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.orderId);
        dest.writeString(this.status);
    }

    public FiatRechargeHistory(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4, @Nullable String str5) {
        this.amount = str;
        this.appealStatus = str2;
        this.coin = str3;
        this.createTime = l11;
        this.orderId = str4;
        this.status = str5;
    }
}
