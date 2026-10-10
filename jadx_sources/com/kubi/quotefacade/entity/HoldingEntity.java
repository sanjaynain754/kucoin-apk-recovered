package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import io.chad.library.adapter.base.entity.MultiItemEntity;
import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B¯\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010=\u001a\u00020>H\u0016J\u0006\u0010?\u001a\u00020\u0004J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0012HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015HÆ\u0003JÁ\u0001\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015HÆ\u0001J\u0006\u0010P\u001a\u00020>J\u0013\u0010Q\u001a\u00020\u00122\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020>HÖ\u0001J\t\u0010U\u001a\u00020\u0004HÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020>R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u00104\"\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u0010\u001bR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006\\"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingEntity;", "Landroid/os/Parcelable;", "Lio/chad/library/adapter/base/entity/MultiItemEntity;", "symbol", "", "baseCurrency", "quoteCurrency", "currentPrice", "Ljava/math/BigDecimal;", "changeRate", "value", "recQuote", InterfaceC33826o0.f71244p, "chain", "logoUrl", "chainLogo", "tokenBridgeId", "isAlphaItem", "", "displayCrypto", "alphaMarks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getBaseCurrency", "setBaseCurrency", "getQuoteCurrency", "setQuoteCurrency", "getCurrentPrice", "()Ljava/math/BigDecimal;", "setCurrentPrice", "(Ljava/math/BigDecimal;)V", "getChangeRate", "setChangeRate", "getValue", "setValue", "getRecQuote", "setRecQuote", "getToken", "setToken", "getChain", "setChain", "getLogoUrl", "setLogoUrl", "getChainLogo", "setChainLogo", "getTokenBridgeId", "setTokenBridgeId", "()Z", "setAlphaItem", "(Z)V", "getDisplayCrypto", "setDisplayCrypto", "getAlphaMarks", "()Ljava/util/List;", "setAlphaMarks", "(Ljava/util/List;)V", "getItemType", "", "getUniqueCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingEntity implements Parcelable, MultiItemEntity {
    public static final int ITEM_TYPE_ALPHA = 2;
    public static final int ITEM_TYPE_CRYPTO = 1;

    @Nullable
    private List<String> alphaMarks;

    @Nullable
    private String baseCurrency;

    @Nullable
    private String chain;

    @Nullable
    private String chainLogo;

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private BigDecimal currentPrice;

    @Nullable
    private String displayCrypto;
    private boolean isAlphaItem;

    @Nullable
    private String logoUrl;

    @Nullable
    private String quoteCurrency;

    @Nullable
    private String recQuote;

    @Nullable
    private String symbol;

    @Nullable
    private String token;

    @Nullable
    private String tokenBridgeId;

    @Nullable
    private BigDecimal value;

    @NotNull
    public static final Parcelable.Creator<HoldingEntity> CREATOR = new C21898a();

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingEntity$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21898a implements Parcelable.Creator<HoldingEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingEntity(parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingEntity[] newArray(int i11) {
            return new HoldingEntity[i11];
        }
    }

    public HoldingEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z11, @Nullable String str10, @Nullable List<String> list) {
        this.symbol = str;
        this.baseCurrency = str2;
        this.quoteCurrency = str3;
        this.currentPrice = bigDecimal;
        this.changeRate = bigDecimal2;
        this.value = bigDecimal3;
        this.recQuote = str4;
        this.token = str5;
        this.chain = str6;
        this.logoUrl = str7;
        this.chainLogo = str8;
        this.tokenBridgeId = str9;
        this.isAlphaItem = z11;
        this.displayCrypto = str10;
        this.alphaMarks = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingEntity)) {
            return false;
        }
        HoldingEntity holdingEntity = (HoldingEntity) other;
        return Intrinsics.areEqual(this.symbol, holdingEntity.symbol) && Intrinsics.areEqual(this.baseCurrency, holdingEntity.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, holdingEntity.quoteCurrency) && Intrinsics.areEqual(this.currentPrice, holdingEntity.currentPrice) && Intrinsics.areEqual(this.changeRate, holdingEntity.changeRate) && Intrinsics.areEqual(this.value, holdingEntity.value) && Intrinsics.areEqual(this.recQuote, holdingEntity.recQuote) && Intrinsics.areEqual(this.token, holdingEntity.token) && Intrinsics.areEqual(this.chain, holdingEntity.chain) && Intrinsics.areEqual(this.logoUrl, holdingEntity.logoUrl) && Intrinsics.areEqual(this.chainLogo, holdingEntity.chainLogo) && Intrinsics.areEqual(this.tokenBridgeId, holdingEntity.tokenBridgeId) && this.isAlphaItem == holdingEntity.isAlphaItem && Intrinsics.areEqual(this.displayCrypto, holdingEntity.displayCrypto) && Intrinsics.areEqual(this.alphaMarks, holdingEntity.alphaMarks);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsAlphaItem() {
        return this.isAlphaItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    @Nullable
    public final List<String> component15() {
        return this.alphaMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRecQuote() {
        return this.recQuote;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChain() {
        return this.chain;
    }

    @NotNull
    public final HoldingEntity copy(@Nullable String symbol, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable BigDecimal currentPrice, @Nullable BigDecimal changeRate, @Nullable BigDecimal value, @Nullable String recQuote, @Nullable String token, @Nullable String chain, @Nullable String logoUrl, @Nullable String chainLogo, @Nullable String tokenBridgeId, boolean isAlphaItem, @Nullable String displayCrypto, @Nullable List<String> alphaMarks) {
        return new HoldingEntity(symbol, baseCurrency, quoteCurrency, currentPrice, changeRate, value, recQuote, token, chain, logoUrl, chainLogo, tokenBridgeId, isAlphaItem, displayCrypto, alphaMarks);
    }

    @Nullable
    public final List<String> getAlphaMarks() {
        return this.alphaMarks;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    public final String getDisplayCrypto() {
        return this.displayCrypto;
    }

    @Override // io.chad.library.adapter.base.entity.MultiItemEntity
    /* JADX INFO: renamed from: getItemType */
    public int getF17248b() {
        return this.isAlphaItem ? 2 : 1;
    }

    @Nullable
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @Nullable
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getRecQuote() {
        return this.recQuote;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @NotNull
    public final String getUniqueCode() {
        return this.token + '-' + this.token;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.baseCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentPrice;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.changeRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.value;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str4 = this.recQuote;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.token;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chain;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.logoUrl;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.chainLogo;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.tokenBridgeId;
        int iHashCode12 = (((iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31) + Boolean.hashCode(this.isAlphaItem)) * 31;
        String str10 = this.displayCrypto;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.alphaMarks;
        return iHashCode13 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isAlphaItem() {
        return this.isAlphaItem;
    }

    public final void setAlphaItem(boolean z11) {
        this.isAlphaItem = z11;
    }

    public final void setAlphaMarks(@Nullable List<String> list) {
        this.alphaMarks = list;
    }

    public final void setBaseCurrency(@Nullable String str) {
        this.baseCurrency = str;
    }

    public final void setChain(@Nullable String str) {
        this.chain = str;
    }

    public final void setChainLogo(@Nullable String str) {
        this.chainLogo = str;
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setCurrentPrice(@Nullable BigDecimal bigDecimal) {
        this.currentPrice = bigDecimal;
    }

    public final void setDisplayCrypto(@Nullable String str) {
        this.displayCrypto = str;
    }

    public final void setLogoUrl(@Nullable String str) {
        this.logoUrl = str;
    }

    public final void setQuoteCurrency(@Nullable String str) {
        this.quoteCurrency = str;
    }

    public final void setRecQuote(@Nullable String str) {
        this.recQuote = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTokenBridgeId(@Nullable String str) {
        this.tokenBridgeId = str;
    }

    public final void setValue(@Nullable BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "HoldingEntity(symbol=" + this.symbol + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", currentPrice=" + this.currentPrice + ", changeRate=" + this.changeRate + ", value=" + this.value + ", recQuote=" + this.recQuote + ", token=" + this.token + ", chain=" + this.chain + ", logoUrl=" + this.logoUrl + ", chainLogo=" + this.chainLogo + ", tokenBridgeId=" + this.tokenBridgeId + ", isAlphaItem=" + this.isAlphaItem + ", displayCrypto=" + this.displayCrypto + ", alphaMarks=" + this.alphaMarks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.baseCurrency);
        dest.writeString(this.quoteCurrency);
        dest.writeSerializable(this.currentPrice);
        dest.writeSerializable(this.changeRate);
        dest.writeSerializable(this.value);
        dest.writeString(this.recQuote);
        dest.writeString(this.token);
        dest.writeString(this.chain);
        dest.writeString(this.logoUrl);
        dest.writeString(this.chainLogo);
        dest.writeString(this.tokenBridgeId);
        dest.writeInt(this.isAlphaItem ? 1 : 0);
        dest.writeString(this.displayCrypto);
        dest.writeStringList(this.alphaMarks);
    }

    public /* synthetic */ HoldingEntity(String str, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z11, String str10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bigDecimal, bigDecimal2, bigDecimal3, str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? false : z11, str10, (i11 & 16384) != 0 ? null : list);
    }
}
