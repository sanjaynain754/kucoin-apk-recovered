package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33826o0;
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
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u0093\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0006\u0010:\u001a\u00020;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020;HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020;R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006G"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingAlphaEntity;", "Landroid/os/Parcelable;", "chainIcon", "", "currencyUnit", "displayToken", "externalChain", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "priceRate", InterfaceC33826o0.f71244p, "tokenBridgeId", "tokenIcon", "tradingVolume", "alphaMarks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)V", "getChainIcon", "()Ljava/lang/String;", "setChainIcon", "(Ljava/lang/String;)V", "getCurrencyUnit", "setCurrencyUnit", "getDisplayToken", "setDisplayToken", "getExternalChain", "setExternalChain", "getPrice", "()Ljava/math/BigDecimal;", "setPrice", "(Ljava/math/BigDecimal;)V", "getPriceRate", "setPriceRate", "getToken", "setToken", "getTokenBridgeId", "setTokenBridgeId", "getTokenIcon", "setTokenIcon", "getTradingVolume", "setTradingVolume", "getAlphaMarks", "()Ljava/util/List;", "setAlphaMarks", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingAlphaEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingAlphaEntity> CREATOR = new C21891a();

    @Nullable
    private List<String> alphaMarks;

    @Nullable
    private String chainIcon;

    @Nullable
    private String currencyUnit;

    @Nullable
    private String displayToken;

    @Nullable
    private String externalChain;

    @Nullable
    private BigDecimal price;

    @Nullable
    private BigDecimal priceRate;

    @Nullable
    private String token;

    @Nullable
    private String tokenBridgeId;

    @Nullable
    private String tokenIcon;

    @Nullable
    private BigDecimal tradingVolume;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingAlphaEntity$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21891a implements Parcelable.Creator<HoldingAlphaEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingAlphaEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingAlphaEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingAlphaEntity[] newArray(int i11) {
            return new HoldingAlphaEntity[i11];
        }
    }

    public HoldingAlphaEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingAlphaEntity)) {
            return false;
        }
        HoldingAlphaEntity holdingAlphaEntity = (HoldingAlphaEntity) other;
        return Intrinsics.areEqual(this.chainIcon, holdingAlphaEntity.chainIcon) && Intrinsics.areEqual(this.currencyUnit, holdingAlphaEntity.currencyUnit) && Intrinsics.areEqual(this.displayToken, holdingAlphaEntity.displayToken) && Intrinsics.areEqual(this.externalChain, holdingAlphaEntity.externalChain) && Intrinsics.areEqual(this.price, holdingAlphaEntity.price) && Intrinsics.areEqual(this.priceRate, holdingAlphaEntity.priceRate) && Intrinsics.areEqual(this.token, holdingAlphaEntity.token) && Intrinsics.areEqual(this.tokenBridgeId, holdingAlphaEntity.tokenBridgeId) && Intrinsics.areEqual(this.tokenIcon, holdingAlphaEntity.tokenIcon) && Intrinsics.areEqual(this.tradingVolume, holdingAlphaEntity.tradingVolume) && Intrinsics.areEqual(this.alphaMarks, holdingAlphaEntity.alphaMarks);
    }

    public HoldingAlphaEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal3, @Nullable List<String> list) {
        this.chainIcon = str;
        this.currencyUnit = str2;
        this.displayToken = str3;
        this.externalChain = str4;
        this.price = bigDecimal;
        this.priceRate = bigDecimal2;
        this.token = str5;
        this.tokenBridgeId = str6;
        this.tokenIcon = str7;
        this.tradingVolume = bigDecimal3;
        this.alphaMarks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingAlphaEntity copy$default(HoldingAlphaEntity holdingAlphaEntity, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str5, String str6, String str7, BigDecimal bigDecimal3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = holdingAlphaEntity.chainIcon;
        }
        if ((i11 & 2) != 0) {
            str2 = holdingAlphaEntity.currencyUnit;
        }
        if ((i11 & 4) != 0) {
            str3 = holdingAlphaEntity.displayToken;
        }
        if ((i11 & 8) != 0) {
            str4 = holdingAlphaEntity.externalChain;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = holdingAlphaEntity.price;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = holdingAlphaEntity.priceRate;
        }
        if ((i11 & 64) != 0) {
            str5 = holdingAlphaEntity.token;
        }
        if ((i11 & 128) != 0) {
            str6 = holdingAlphaEntity.tokenBridgeId;
        }
        if ((i11 & 256) != 0) {
            str7 = holdingAlphaEntity.tokenIcon;
        }
        if ((i11 & 512) != 0) {
            bigDecimal3 = holdingAlphaEntity.tradingVolume;
        }
        if ((i11 & 1024) != 0) {
            list = holdingAlphaEntity.alphaMarks;
        }
        BigDecimal bigDecimal4 = bigDecimal3;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        BigDecimal bigDecimal5 = bigDecimal2;
        String str10 = str5;
        BigDecimal bigDecimal6 = bigDecimal;
        String str11 = str3;
        return holdingAlphaEntity.copy(str, str2, str11, str4, bigDecimal6, bigDecimal5, str10, str8, str9, bigDecimal4, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    public final List<String> component11() {
        return this.alphaMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @NotNull
    public final HoldingAlphaEntity copy(@Nullable String chainIcon, @Nullable String currencyUnit, @Nullable String displayToken, @Nullable String externalChain, @Nullable BigDecimal price, @Nullable BigDecimal priceRate, @Nullable String token, @Nullable String tokenBridgeId, @Nullable String tokenIcon, @Nullable BigDecimal tradingVolume, @Nullable List<String> alphaMarks) {
        return new HoldingAlphaEntity(chainIcon, currencyUnit, displayToken, externalChain, price, priceRate, token, tokenBridgeId, tokenIcon, tradingVolume, alphaMarks);
    }

    @Nullable
    public final List<String> getAlphaMarks() {
        return this.alphaMarks;
    }

    @Nullable
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final String getCurrencyUnit() {
        return this.currencyUnit;
    }

    @Nullable
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final BigDecimal getTradingVolume() {
        return this.tradingVolume;
    }

    public int hashCode() {
        String str = this.chainIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyUnit;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.externalChain;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.price;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.priceRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str5 = this.token;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tokenBridgeId;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tokenIcon;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.tradingVolume;
        int iHashCode10 = (iHashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        List<String> list = this.alphaMarks;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    public final void setAlphaMarks(@Nullable List<String> list) {
        this.alphaMarks = list;
    }

    public final void setChainIcon(@Nullable String str) {
        this.chainIcon = str;
    }

    public final void setCurrencyUnit(@Nullable String str) {
        this.currencyUnit = str;
    }

    public final void setDisplayToken(@Nullable String str) {
        this.displayToken = str;
    }

    public final void setExternalChain(@Nullable String str) {
        this.externalChain = str;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setPriceRate(@Nullable BigDecimal bigDecimal) {
        this.priceRate = bigDecimal;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTokenBridgeId(@Nullable String str) {
        this.tokenBridgeId = str;
    }

    public final void setTokenIcon(@Nullable String str) {
        this.tokenIcon = str;
    }

    public final void setTradingVolume(@Nullable BigDecimal bigDecimal) {
        this.tradingVolume = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "HoldingAlphaEntity(chainIcon=" + this.chainIcon + ", currencyUnit=" + this.currencyUnit + ", displayToken=" + this.displayToken + ", externalChain=" + this.externalChain + ", price=" + this.price + ", priceRate=" + this.priceRate + ", token=" + this.token + ", tokenBridgeId=" + this.tokenBridgeId + ", tokenIcon=" + this.tokenIcon + ", tradingVolume=" + this.tradingVolume + ", alphaMarks=" + this.alphaMarks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainIcon);
        dest.writeString(this.currencyUnit);
        dest.writeString(this.displayToken);
        dest.writeString(this.externalChain);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.priceRate);
        dest.writeString(this.token);
        dest.writeString(this.tokenBridgeId);
        dest.writeString(this.tokenIcon);
        dest.writeSerializable(this.tradingVolume);
        dest.writeStringList(this.alphaMarks);
    }

    public /* synthetic */ HoldingAlphaEntity(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str5, String str6, String str7, BigDecimal bigDecimal3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : bigDecimal3, (i11 & 1024) != 0 ? null : list);
    }
}
