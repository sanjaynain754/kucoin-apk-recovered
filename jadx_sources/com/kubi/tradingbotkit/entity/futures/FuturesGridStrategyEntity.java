package com.kubi.tradingbotkit.entity.futures;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.tradingbotkit.entity.StrategyEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesGridStrategyEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u00104\u001a\u00020\u0012J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\u001c\u0010$\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R \u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010¨\u0006:"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/futures/FuturesGridStrategyEntity;", "Lcom/kubi/tradingbotkit/entity/StrategyEntity;", "Landroid/os/Parcelable;", "<init>", "()V", "leverage", "Ljava/math/BigDecimal;", "getLeverage", "()Ljava/math/BigDecimal;", "setLeverage", "(Ljava/math/BigDecimal;)V", "direction", "", "getDirection", "()Ljava/lang/String;", "setDirection", "(Ljava/lang/String;)V", "pricePrecision", "", "getPricePrecision", "()Ljava/lang/Integer;", "setPricePrecision", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "profitPrecision", "getProfitPrecision", "setProfitPrecision", FirebaseAnalytics.Param.PRICE, "getPrice", "setPrice", "blowUpPrice", "getBlowUpPrice", "setBlowUpPrice", "fundingFee", "getFundingFee", "setFundingFee", "symbolCode", "getSymbolCode", "setSymbolCode", "riskLimitTime", "", "getRiskLimitTime", "()Ljava/lang/Long;", "setRiskLimitTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "quoteName", "getQuoteName", "setQuoteName", "futuresQuoteCode", "getFuturesQuoteCode", "setFuturesQuoteCode", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesGridStrategyEntity extends StrategyEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FuturesGridStrategyEntity> CREATOR = new C26223a();

    @Nullable
    private BigDecimal blowUpPrice;

    @Nullable
    private String direction;

    @Nullable
    private BigDecimal fundingFee;

    @SerializedName("quote")
    @Nullable
    private String futuresQuoteCode;

    @Nullable
    private BigDecimal leverage;

    @Nullable
    private BigDecimal price;

    @Nullable
    private Integer pricePrecision;

    @Nullable
    private Integer profitPrecision;

    @Nullable
    private String quoteName;

    @Nullable
    private Long riskLimitTime;

    @Nullable
    private String symbolCode;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.futures.FuturesGridStrategyEntity$a */
    /* JADX INFO: compiled from: FuturesGridStrategyEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26223a implements Parcelable.Creator<FuturesGridStrategyEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuturesGridStrategyEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new FuturesGridStrategyEntity();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuturesGridStrategyEntity[] newArray(int i11) {
            return new FuturesGridStrategyEntity[i11];
        }
    }

    @Override // com.kubi.tradingbotkit.entity.StrategyEntity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FuturesGridStrategyEntity() {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    @Nullable
    public final BigDecimal getBlowUpPrice() {
        return this.blowUpPrice;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
    }

    @Nullable
    public final String getFuturesQuoteCode() {
        return this.futuresQuoteCode;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getPricePrecision() {
        return this.pricePrecision;
    }

    @Nullable
    public final Integer getProfitPrecision() {
        return this.profitPrecision;
    }

    @Nullable
    public final String getQuoteName() {
        return this.quoteName;
    }

    @Nullable
    public final Long getRiskLimitTime() {
        return this.riskLimitTime;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    public final void setBlowUpPrice(@Nullable BigDecimal bigDecimal) {
        this.blowUpPrice = bigDecimal;
    }

    public final void setDirection(@Nullable String str) {
        this.direction = str;
    }

    public final void setFundingFee(@Nullable BigDecimal bigDecimal) {
        this.fundingFee = bigDecimal;
    }

    public final void setFuturesQuoteCode(@Nullable String str) {
        this.futuresQuoteCode = str;
    }

    public final void setLeverage(@Nullable BigDecimal bigDecimal) {
        this.leverage = bigDecimal;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPricePrecision(@Nullable Integer num) {
        this.pricePrecision = num;
    }

    public final void setProfitPrecision(@Nullable Integer num) {
        this.profitPrecision = num;
    }

    public final void setQuoteName(@Nullable String str) {
        this.quoteName = str;
    }

    public final void setRiskLimitTime(@Nullable Long l11) {
        this.riskLimitTime = l11;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    @Override // com.kubi.tradingbotkit.entity.StrategyEntity, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
