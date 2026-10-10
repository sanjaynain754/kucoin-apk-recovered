package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatAdvCashInfo;", "Landroid/os/Parcelable;", "paymentOrderId", "", "redirectUrl", "channelInfo", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getPaymentOrderId", "()Ljava/lang/String;", "setPaymentOrderId", "(Ljava/lang/String;)V", "getRedirectUrl", "getChannelInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatAdvCashInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatAdvCashInfo> CREATOR = new Creator();

    @Nullable
    private final Map<String, String> channelInfo;

    @Nullable
    private String paymentOrderId;

    @Nullable
    private final String redirectUrl;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatAdvCashInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvCashInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FiatAdvCashInfo(string, string2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAdvCashInfo[] newArray(int i11) {
            return new FiatAdvCashInfo[i11];
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
        if (!(other instanceof FiatAdvCashInfo)) {
            return false;
        }
        FiatAdvCashInfo fiatAdvCashInfo = (FiatAdvCashInfo) other;
        return Intrinsics.areEqual(this.paymentOrderId, fiatAdvCashInfo.paymentOrderId) && Intrinsics.areEqual(this.redirectUrl, fiatAdvCashInfo.redirectUrl) && Intrinsics.areEqual(this.channelInfo, fiatAdvCashInfo.channelInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatAdvCashInfo copy$default(FiatAdvCashInfo fiatAdvCashInfo, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatAdvCashInfo.paymentOrderId;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatAdvCashInfo.redirectUrl;
        }
        if ((i11 & 4) != 0) {
            map = fiatAdvCashInfo.channelInfo;
        }
        return fiatAdvCashInfo.copy(str, str2, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentOrderId() {
        return this.paymentOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @Nullable
    public final Map<String, String> component3() {
        return this.channelInfo;
    }

    @NotNull
    public final FiatAdvCashInfo copy(@Nullable String paymentOrderId, @Nullable String redirectUrl, @Nullable Map<String, String> channelInfo) {
        return new FiatAdvCashInfo(paymentOrderId, redirectUrl, channelInfo);
    }

    @Nullable
    public final Map<String, String> getChannelInfo() {
        return this.channelInfo;
    }

    @Nullable
    public final String getPaymentOrderId() {
        return this.paymentOrderId;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        String str = this.paymentOrderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.channelInfo;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final void setPaymentOrderId(@Nullable String str) {
        this.paymentOrderId = str;
    }

    @NotNull
    public String toString() {
        return "FiatAdvCashInfo(paymentOrderId=" + this.paymentOrderId + ", redirectUrl=" + this.redirectUrl + ", channelInfo=" + this.channelInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentOrderId);
        dest.writeString(this.redirectUrl);
        Map<String, String> map = this.channelInfo;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public FiatAdvCashInfo(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.paymentOrderId = str;
        this.redirectUrl = str2;
        this.channelInfo = map;
    }
}
