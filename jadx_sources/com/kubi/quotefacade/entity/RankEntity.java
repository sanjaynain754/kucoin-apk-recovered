package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.sdk.res.R$string;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41015b;
import p809yu.C46566a0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: RankEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010>\u001a\u00020\u0004H\u0016J\u0006\u0010?\u001a\u00020\u0013J\u0010\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010A\u001a\u00020\u0006J\u000e\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006J\b\u0010C\u001a\u0004\u0018\u00010\u0006J\u0006\u0010*\u001a\u00020DJ\u0006\u0010E\u001a\u00020\u0006J\u0006\u0010F\u001a\u00020\u0006J\u000e\u0010G\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006J\u0010\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010S\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jª\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010VJ\u0006\u0010W\u001a\u00020\u0004J\u0013\u0010X\u001a\u00020\u00132\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\t\u0010[\u001a\u00020\u0004HÖ\u0001J\t\u0010\\\u001a\u00020\u0006HÖ\u0001J\u0016\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001f¨\u0006b"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/RankEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "order", "", FirebaseAnalytics.Param.CURRENCY, "", "symbol", "symbolCode", "quote", "changeRate", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "value", "markCap", "volValue", "openingTime", "", "inverseSymbol", "", "iconUrl", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSymbolCode", "setSymbolCode", "getQuote", "setQuote", "getChangeRate", "()Ljava/math/BigDecimal;", "setChangeRate", "(Ljava/math/BigDecimal;)V", "getPrice", "setPrice", "getValue", "setValue", "getMarkCap", "setMarkCap", "getVolValue", "setVolValue", "getOpeningTime", "()Ljava/lang/Long;", "setOpeningTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInverseSymbol", "()Ljava/lang/Boolean;", "setInverseSymbol", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIconUrl", "setIconUrl", "getItemType", "isCountDownType", "getUniqueCode", "catalog", "showSymbol", "getExposeKey", "", "getVolume", "getMarketCap", "getMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/quotefacade/entity/RankEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankEntity implements Parcelable, MultiItemEntity {

    @NotNull
    public static final Parcelable.Creator<RankEntity> CREATOR = new C21905a();

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private String currency;

    @Nullable
    private String iconUrl;

    @Nullable
    private Boolean inverseSymbol;

    @Nullable
    private BigDecimal markCap;

    @Nullable
    private Long openingTime;

    @Nullable
    private Integer order;

    @Nullable
    private BigDecimal price;

    @Nullable
    private String quote;

    @Nullable
    private String symbol;

    @Nullable
    private String symbolCode;

    @Nullable
    private BigDecimal value;

    @Nullable
    private BigDecimal volValue;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.RankEntity$a */
    /* JADX INFO: compiled from: RankEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21905a implements Parcelable.Creator<RankEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RankEntity(numValueOf, string, string2, string3, string4, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, lValueOf, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RankEntity[] newArray(int i11) {
            return new RankEntity[i11];
        }
    }

    public RankEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ RankEntity copy$default(RankEntity rankEntity, Integer num, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, Boolean bool, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = rankEntity.order;
        }
        return rankEntity.copy(num, (i11 & 2) != 0 ? rankEntity.currency : str, (i11 & 4) != 0 ? rankEntity.symbol : str2, (i11 & 8) != 0 ? rankEntity.symbolCode : str3, (i11 & 16) != 0 ? rankEntity.quote : str4, (i11 & 32) != 0 ? rankEntity.changeRate : bigDecimal, (i11 & 64) != 0 ? rankEntity.price : bigDecimal2, (i11 & 128) != 0 ? rankEntity.value : bigDecimal3, (i11 & 256) != 0 ? rankEntity.markCap : bigDecimal4, (i11 & 512) != 0 ? rankEntity.volValue : bigDecimal5, (i11 & 1024) != 0 ? rankEntity.openingTime : l11, (i11 & 2048) != 0 ? rankEntity.inverseSymbol : bool, (i11 & 4096) != 0 ? rankEntity.iconUrl : str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankEntity)) {
            return false;
        }
        RankEntity rankEntity = (RankEntity) other;
        return Intrinsics.areEqual(this.order, rankEntity.order) && Intrinsics.areEqual(this.currency, rankEntity.currency) && Intrinsics.areEqual(this.symbol, rankEntity.symbol) && Intrinsics.areEqual(this.symbolCode, rankEntity.symbolCode) && Intrinsics.areEqual(this.quote, rankEntity.quote) && Intrinsics.areEqual(this.changeRate, rankEntity.changeRate) && Intrinsics.areEqual(this.price, rankEntity.price) && Intrinsics.areEqual(this.value, rankEntity.value) && Intrinsics.areEqual(this.markCap, rankEntity.markCap) && Intrinsics.areEqual(this.volValue, rankEntity.volValue) && Intrinsics.areEqual(this.openingTime, rankEntity.openingTime) && Intrinsics.areEqual(this.inverseSymbol, rankEntity.inverseSymbol) && Intrinsics.areEqual(this.iconUrl, rankEntity.iconUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: getPrice, reason: collision with other method in class */
    public final BigDecimal m103798getPrice() {
        return this.price;
    }

    public RankEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Long l11, @Nullable Boolean bool, @Nullable String str5) {
        this.order = num;
        this.currency = str;
        this.symbol = str2;
        this.symbolCode = str3;
        this.quote = str4;
        this.changeRate = bigDecimal;
        this.price = bigDecimal2;
        this.value = bigDecimal3;
        this.markCap = bigDecimal4;
        this.volValue = bigDecimal5;
        this.openingTime = l11;
        this.inverseSymbol = bool;
        this.iconUrl = str5;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getMarkCap() {
        return this.markCap;
    }

    @NotNull
    public final RankEntity copy(@Nullable Integer order, @Nullable String currency, @Nullable String symbol, @Nullable String symbolCode, @Nullable String quote, @Nullable BigDecimal changeRate, @Nullable BigDecimal price, @Nullable BigDecimal value, @Nullable BigDecimal markCap, @Nullable BigDecimal volValue, @Nullable Long openingTime, @Nullable Boolean inverseSymbol, @Nullable String iconUrl) {
        return new RankEntity(order, currency, symbol, symbolCode, quote, changeRate, price, value, markCap, volValue, openingTime, inverseSymbol, iconUrl);
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getExposeKey() {
        String str = this.symbolCode;
        return str == null ? this.symbol : str;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @NotNull
    public final String getMargin(@NotNull String catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        return (Intrinsics.areEqual(catalog, "CONTRACT") && C46566a0.m102720b(this.symbol)) ? StringsKt.trim((CharSequence) C27017c.f54310a.m66516f(R$string.perpetual_contract, "")).toString() : "";
    }

    @Nullable
    public final BigDecimal getMarkCap() {
        return this.markCap;
    }

    @NotNull
    public final String getMarketCap() {
        String strM89929c;
        String strM51857h;
        BigDecimal bigDecimal = this.markCap;
        return (bigDecimal == null || (strM89929c = C41014a.m89929c(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimal, this.quote))), false, true, 1, null)) == null || (strM51857h = QuoteExKt.m51857h(strM89929c)) == null) ? "--" : strM51857h;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @NotNull
    public final CharSequence getPrice() {
        SpannableStringBuilder spannableStringBuilderM89960g;
        BigDecimal bigDecimal = this.price;
        return (bigDecimal == null || (spannableStringBuilderM89960g = C41015b.m89960g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimal, this.quote))), null, null, 0, 7, null)) == null) ? "--" : spannableStringBuilderM89960g;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final String getUniqueCode(@NotNull String catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        return Intrinsics.areEqual(catalog, "CONTRACT") ? this.symbol : this.symbolCode;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    @NotNull
    public final String getVolume() {
        BigDecimal bigDecimal = this.volValue;
        return C27041f.m66669i(bigDecimal != null ? C37885i.m85566e(bigDecimal.doubleValue(), this.quote) : null, "--");
    }

    public int hashCode() {
        Integer num = this.order;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quote;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.value;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.markCap;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.volValue;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Long l11 = this.openingTime;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.inverseSymbol;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.iconUrl;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isCountDownType() {
        Long l11 = this.openingTime;
        return (l11 != null ? l11.longValue() : 0L) > TimeSyncManager.f48123a.m58366p();
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setInverseSymbol(@Nullable Boolean bool) {
        this.inverseSymbol = bool;
    }

    public final void setMarkCap(@Nullable BigDecimal bigDecimal) {
        this.markCap = bigDecimal;
    }

    public final void setOpeningTime(@Nullable Long l11) {
        this.openingTime = l11;
    }

    public final void setOrder(@Nullable Integer num) {
        this.order = num;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setQuote(@Nullable String str) {
        this.quote = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setValue(@Nullable BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    public final void setVolValue(@Nullable BigDecimal bigDecimal) {
        this.volValue = bigDecimal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4.equals("SPOT") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4.equals("COIN") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r4 = gf.C37890n.f85269a.m85601B(r3.symbolCode);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r4 = r4.getBaseCurrencyName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r4 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        r4 = r3.symbolCode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return "--";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        return r4;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String showSymbol(@NotNull String catalog) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        int iHashCode = catalog.hashCode();
        if (iHashCode != 2074257) {
            if (iHashCode != 2552066) {
                if (iHashCode != 215679250 || !catalog.equals("CONTRACT") || this.symbol == null) {
                    return "--";
                }
                IKuMexService iKuMexService = IKuMexService.f28731a.get();
                String str = this.symbol;
                Intrinsics.checkNotNull(str);
                return iKuMexService.mo33264M(str);
            }
            return "--";
        }
    }

    @NotNull
    public String toString() {
        return "RankEntity(order=" + this.order + ", currency=" + this.currency + ", symbol=" + this.symbol + ", symbolCode=" + this.symbolCode + ", quote=" + this.quote + ", changeRate=" + this.changeRate + ", price=" + this.price + ", value=" + this.value + ", markCap=" + this.markCap + ", volValue=" + this.volValue + ", openingTime=" + this.openingTime + ", inverseSymbol=" + this.inverseSymbol + ", iconUrl=" + this.iconUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.order;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.symbol);
        dest.writeString(this.symbolCode);
        dest.writeString(this.quote);
        dest.writeSerializable(this.changeRate);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.value);
        dest.writeSerializable(this.markCap);
        dest.writeSerializable(this.volValue);
        Long l11 = this.openingTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Boolean bool = this.inverseSymbol;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.iconUrl);
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF42794b() {
        if (isCountDownType()) {
            return 1;
        }
        return 2;
    }

    public /* synthetic */ RankEntity(Integer num, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, Boolean bool, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? 0L : l11, (i11 & 2048) != 0 ? Boolean.FALSE : bool, (i11 & 4096) != 0 ? null : str5);
    }
}
