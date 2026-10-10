package com.kubi.tradingbotkit.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesGridSymbolPriceModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradingbotkit/model/FuturesGridSymbolPriceModel;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "showLatestPrice", "", "showLatestPriceBd", "symbolCode", "symbolName", "priceChgPct", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getShowLatestPrice", "()Ljava/lang/String;", "setShowLatestPrice", "(Ljava/lang/String;)V", "getShowLatestPriceBd", "setShowLatestPriceBd", "getSymbolCode", "setSymbolCode", "getSymbolName", "setSymbolName", "getPriceChgPct", "setPriceChgPct", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesGridSymbolPriceModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesGridSymbolPriceModel> CREATOR = new C26233a();

    @Nullable
    private BigDecimal price;

    @Nullable
    private BigDecimal priceChgPct;

    @Nullable
    private String showLatestPrice;

    @Nullable
    private BigDecimal showLatestPriceBd;

    @Nullable
    private String symbolCode;

    @Nullable
    private String symbolName;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.model.FuturesGridSymbolPriceModel$a */
    /* JADX INFO: compiled from: FuturesGridSymbolPriceModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26233a implements Parcelable.Creator<FuturesGridSymbolPriceModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesGridSymbolPriceModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FuturesGridSymbolPriceModel((BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesGridSymbolPriceModel[] newArray(int i11) {
            return new FuturesGridSymbolPriceModel[i11];
        }
    }

    public FuturesGridSymbolPriceModel() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FuturesGridSymbolPriceModel(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal3) {
        this.price = bigDecimal;
        this.showLatestPrice = str;
        this.showLatestPriceBd = bigDecimal2;
        this.symbolCode = str2;
        this.symbolName = str3;
        this.priceChgPct = bigDecimal3;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final String getShowLatestPrice() {
        return this.showLatestPrice;
    }

    @Nullable
    public final BigDecimal getShowLatestPriceBd() {
        return this.showLatestPriceBd;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getSymbolName() {
        return this.symbolName;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPriceChgPct(@Nullable BigDecimal bigDecimal) {
        this.priceChgPct = bigDecimal;
    }

    public final void setShowLatestPrice(@Nullable String str) {
        this.showLatestPrice = str;
    }

    public final void setShowLatestPriceBd(@Nullable BigDecimal bigDecimal) {
        this.showLatestPriceBd = bigDecimal;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setSymbolName(@Nullable String str) {
        this.symbolName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.price);
        dest.writeString(this.showLatestPrice);
        dest.writeSerializable(this.showLatestPriceBd);
        dest.writeString(this.symbolCode);
        dest.writeString(this.symbolName);
        dest.writeSerializable(this.priceChgPct);
    }

    public /* synthetic */ FuturesGridSymbolPriceModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, String str3, BigDecimal bigDecimal3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal3);
    }
}
