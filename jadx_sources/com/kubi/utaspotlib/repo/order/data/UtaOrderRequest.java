package com.kubi.utaspotlib.repo.order.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utaspot.api.UtaTradeType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p721wc.InterfaceC45789a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaMakeOrderData.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u00104\u001a\u00020\u0000J\u0006\u00105\u001a\u00020\u0000J\b\u00106\u001a\u000207H\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000207H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010,\"\u0004\b3\u0010.¨\u0006="}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/order/data/UtaOrderRequest;", "Lcom/kubi/core/base/arch/api/IRequest;", "Landroid/os/Parcelable;", AppsFlyerProperties.CHANNEL, "", "tradeType", "orderType", "symbol", "side", FirebaseAnalytics.Param.PRICE, "size", "funds", "triggerPrice", "triggerDirection", "postOnly", "", "timeInForce", "triggerPriceType", "isFullPercent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "getTradeType", "setTradeType", "getOrderType", "setOrderType", "getSymbol", "setSymbol", "getSide", "setSide", "getPrice", "setPrice", "getSize", "setSize", "getFunds", "setFunds", "getTriggerPrice", "setTriggerPrice", "getTriggerDirection", "setTriggerDirection", "getPostOnly", "()Z", "setPostOnly", "(Z)V", "getTimeInForce", "setTimeInForce", "getTriggerPriceType", "setTriggerPriceType", "setFullPercent", "asSpot", "asMargin", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class UtaOrderRequest implements InterfaceC45789a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<UtaOrderRequest> CREATOR = new C26951a();

    @NotNull
    private String channel;

    @Nullable
    private String funds;
    private boolean isFullPercent;

    @NotNull
    private String orderType;
    private boolean postOnly;

    @Nullable
    private String price;

    @Nullable
    private String side;

    @Nullable
    private String size;

    @Nullable
    private String symbol;

    @Nullable
    private String timeInForce;

    @NotNull
    private String tradeType;

    @Nullable
    private String triggerDirection;

    @Nullable
    private String triggerPrice;

    @Nullable
    private String triggerPriceType;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.repo.order.data.UtaOrderRequest$a */
    /* JADX INFO: compiled from: UtaMakeOrderData.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26951a implements Parcelable.Creator<UtaOrderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UtaOrderRequest createFromParcel(Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z12 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string11 = parcel.readString();
            boolean z13 = z11;
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            return new UtaOrderRequest(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, z12, string11, string12, z13);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UtaOrderRequest[] newArray(int i11) {
            return new UtaOrderRequest[i11];
        }
    }

    public UtaOrderRequest(@NotNull String channel, @NotNull String tradeType, @NotNull String orderType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z11, @Nullable String str8, @Nullable String str9, boolean z12) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.channel = channel;
        this.tradeType = tradeType;
        this.orderType = orderType;
        this.symbol = str;
        this.side = str2;
        this.price = str3;
        this.size = str4;
        this.funds = str5;
        this.triggerPrice = str6;
        this.triggerDirection = str7;
        this.postOnly = z11;
        this.timeInForce = str8;
        this.triggerPriceType = str9;
        this.isFullPercent = z12;
    }

    public int describeContents() {
        return 0;
    }

    @NotNull
    public final UtaOrderRequest asMargin() {
        this.tradeType = UtaTradeType.MARGIN.getValue();
        return this;
    }

    @NotNull
    public final UtaOrderRequest asSpot() {
        this.tradeType = UtaTradeType.SPOT.getValue();
        return this;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getFunds() {
        return this.funds;
    }

    @NotNull
    public final String getOrderType() {
        return this.orderType;
    }

    public final boolean getPostOnly() {
        return this.postOnly;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getTimeInForce() {
        return this.timeInForce;
    }

    @NotNull
    public final String getTradeType() {
        return this.tradeType;
    }

    @Nullable
    public final String getTriggerDirection() {
        return this.triggerDirection;
    }

    @Nullable
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    @Nullable
    public final String getTriggerPriceType() {
        return this.triggerPriceType;
    }

    /* JADX INFO: renamed from: isFullPercent, reason: from getter */
    public final boolean getIsFullPercent() {
        return this.isFullPercent;
    }

    public final void setChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.channel = str;
    }

    public final void setFullPercent(boolean z11) {
        this.isFullPercent = z11;
    }

    public final void setFunds(@Nullable String str) {
        this.funds = str;
    }

    public final void setOrderType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderType = str;
    }

    public final void setPostOnly(boolean z11) {
        this.postOnly = z11;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setSize(@Nullable String str) {
        this.size = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTimeInForce(@Nullable String str) {
        this.timeInForce = str;
    }

    public final void setTradeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tradeType = str;
    }

    public final void setTriggerDirection(@Nullable String str) {
        this.triggerDirection = str;
    }

    public final void setTriggerPrice(@Nullable String str) {
        this.triggerPrice = str;
    }

    public final void setTriggerPriceType(@Nullable String str) {
        this.triggerPriceType = str;
    }

    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.channel);
        dest.writeString(this.tradeType);
        dest.writeString(this.orderType);
        dest.writeString(this.symbol);
        dest.writeString(this.side);
        dest.writeString(this.price);
        dest.writeString(this.size);
        dest.writeString(this.funds);
        dest.writeString(this.triggerPrice);
        dest.writeString(this.triggerDirection);
        dest.writeInt(this.postOnly ? 1 : 0);
        dest.writeString(this.timeInForce);
        dest.writeString(this.triggerPriceType);
        dest.writeInt(this.isFullPercent ? 1 : 0);
    }

    public /* synthetic */ UtaOrderRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z11, String str11, String str12, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "ANDROID" : str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? false : z11, (i11 & 2048) != 0 ? null : str11, (i11 & 4096) != 0 ? null : str12, (i11 & 8192) != 0 ? false : z12);
    }
}
