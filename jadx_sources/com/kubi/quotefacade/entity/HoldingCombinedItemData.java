package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldingEntity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b?\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J©\u0002\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0006\u0010N\u001a\u00020OJ\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SHÖ\u0003J\t\u0010T\u001a\u00020OHÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001J\u0016\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020OR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*¨\u0006["}, m90084d2 = {"Lcom/kubi/quotefacade/entity/HoldingCombinedItemData;", "Landroid/os/Parcelable;", "totalAmountUSD", "", "symbol", "baseCurrency", "quoteCurrency", "currentPrice", "changeRate", "value", "recQuote", "displayCrypto", "fullNameCrypto", TUIConstants.TUIChat.INPUT_MORE_ICON, "cryptoMarks", "", "tokenBridgeId", InterfaceC33826o0.f71244p, "externalChain", "tradingVolume", FirebaseAnalytics.Param.PRICE, "priceRate", "displayToken", "tokenIcon", "chainIcon", "kcChain", "alphaMarks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalAmountUSD", "()Ljava/lang/String;", "getSymbol", "getBaseCurrency", "getQuoteCurrency", "getCurrentPrice", "getChangeRate", "getValue", "getRecQuote", "getDisplayCrypto", "getFullNameCrypto", "getIcon", "getCryptoMarks", "()Ljava/util/List;", "getTokenBridgeId", "getToken", "getExternalChain", "getTradingVolume", "getPrice", "getPriceRate", "getDisplayToken", "getTokenIcon", "getChainIcon", "getKcChain", "getAlphaMarks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class HoldingCombinedItemData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<HoldingCombinedItemData> CREATOR = new C21894a();

    @Nullable
    private final List<String> alphaMarks;

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final String chainIcon;

    @Nullable
    private final String changeRate;

    @Nullable
    private final List<String> cryptoMarks;

    @Nullable
    private final String currentPrice;

    @Nullable
    private final String displayCrypto;

    @Nullable
    private final String displayToken;

    @Nullable
    private final String externalChain;

    @Nullable
    private final String fullNameCrypto;

    @Nullable
    private final String icon;

    @Nullable
    private final String kcChain;

    @Nullable
    private final String price;

    @Nullable
    private final String priceRate;

    @Nullable
    private final String quoteCurrency;

    @Nullable
    private final String recQuote;

    @Nullable
    private final String symbol;

    @Nullable
    private final String token;

    @Nullable
    private final String tokenBridgeId;

    @Nullable
    private final String tokenIcon;

    @Nullable
    private final String totalAmountUSD;

    @Nullable
    private final String tradingVolume;

    @Nullable
    private final String value;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.HoldingCombinedItemData$a */
    /* JADX INFO: compiled from: HoldingEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21894a implements Parcelable.Creator<HoldingCombinedItemData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HoldingCombinedItemData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HoldingCombinedItemData[] newArray(int i11) {
            return new HoldingCombinedItemData[i11];
        }
    }

    public HoldingCombinedItemData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingCombinedItemData copy$default(HoldingCombinedItemData holdingCombinedItemData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list2, int i11, Object obj) {
        List list3;
        String str22;
        String str23 = (i11 & 1) != 0 ? holdingCombinedItemData.totalAmountUSD : str;
        String str24 = (i11 & 2) != 0 ? holdingCombinedItemData.symbol : str2;
        String str25 = (i11 & 4) != 0 ? holdingCombinedItemData.baseCurrency : str3;
        String str26 = (i11 & 8) != 0 ? holdingCombinedItemData.quoteCurrency : str4;
        String str27 = (i11 & 16) != 0 ? holdingCombinedItemData.currentPrice : str5;
        String str28 = (i11 & 32) != 0 ? holdingCombinedItemData.changeRate : str6;
        String str29 = (i11 & 64) != 0 ? holdingCombinedItemData.value : str7;
        String str30 = (i11 & 128) != 0 ? holdingCombinedItemData.recQuote : str8;
        String str31 = (i11 & 256) != 0 ? holdingCombinedItemData.displayCrypto : str9;
        String str32 = (i11 & 512) != 0 ? holdingCombinedItemData.fullNameCrypto : str10;
        String str33 = (i11 & 1024) != 0 ? holdingCombinedItemData.icon : str11;
        List list4 = (i11 & 2048) != 0 ? holdingCombinedItemData.cryptoMarks : list;
        String str34 = (i11 & 4096) != 0 ? holdingCombinedItemData.tokenBridgeId : str12;
        String str35 = (i11 & 8192) != 0 ? holdingCombinedItemData.token : str13;
        String str36 = str23;
        String str37 = (i11 & 16384) != 0 ? holdingCombinedItemData.externalChain : str14;
        String str38 = (i11 & 32768) != 0 ? holdingCombinedItemData.tradingVolume : str15;
        String str39 = (i11 & 65536) != 0 ? holdingCombinedItemData.price : str16;
        String str40 = (i11 & 131072) != 0 ? holdingCombinedItemData.priceRate : str17;
        String str41 = (i11 & 262144) != 0 ? holdingCombinedItemData.displayToken : str18;
        String str42 = (i11 & 524288) != 0 ? holdingCombinedItemData.tokenIcon : str19;
        String str43 = (i11 & 1048576) != 0 ? holdingCombinedItemData.chainIcon : str20;
        String str44 = (i11 & 2097152) != 0 ? holdingCombinedItemData.kcChain : str21;
        if ((i11 & 4194304) != 0) {
            str22 = str44;
            list3 = holdingCombinedItemData.alphaMarks;
        } else {
            list3 = list2;
            str22 = str44;
        }
        return holdingCombinedItemData.copy(str36, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, list4, str34, str35, str37, str38, str39, str40, str41, str42, str43, str22, list3);
    }

    @NotNull
    public final HoldingCombinedItemData copy(@Nullable String totalAmountUSD, @Nullable String symbol, @Nullable String baseCurrency, @Nullable String quoteCurrency, @Nullable String currentPrice, @Nullable String changeRate, @Nullable String value, @Nullable String recQuote, @Nullable String displayCrypto, @Nullable String fullNameCrypto, @Nullable String icon, @Nullable List<String> cryptoMarks, @Nullable String tokenBridgeId, @Nullable String token, @Nullable String externalChain, @Nullable String tradingVolume, @Nullable String price, @Nullable String priceRate, @Nullable String displayToken, @Nullable String tokenIcon, @Nullable String chainIcon, @Nullable String kcChain, @Nullable List<String> alphaMarks) {
        return new HoldingCombinedItemData(totalAmountUSD, symbol, baseCurrency, quoteCurrency, currentPrice, changeRate, value, recQuote, displayCrypto, fullNameCrypto, icon, cryptoMarks, tokenBridgeId, token, externalChain, tradingVolume, price, priceRate, displayToken, tokenIcon, chainIcon, kcChain, alphaMarks);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoldingCombinedItemData)) {
            return false;
        }
        HoldingCombinedItemData holdingCombinedItemData = (HoldingCombinedItemData) other;
        return Intrinsics.areEqual(this.totalAmountUSD, holdingCombinedItemData.totalAmountUSD) && Intrinsics.areEqual(this.symbol, holdingCombinedItemData.symbol) && Intrinsics.areEqual(this.baseCurrency, holdingCombinedItemData.baseCurrency) && Intrinsics.areEqual(this.quoteCurrency, holdingCombinedItemData.quoteCurrency) && Intrinsics.areEqual(this.currentPrice, holdingCombinedItemData.currentPrice) && Intrinsics.areEqual(this.changeRate, holdingCombinedItemData.changeRate) && Intrinsics.areEqual(this.value, holdingCombinedItemData.value) && Intrinsics.areEqual(this.recQuote, holdingCombinedItemData.recQuote) && Intrinsics.areEqual(this.displayCrypto, holdingCombinedItemData.displayCrypto) && Intrinsics.areEqual(this.fullNameCrypto, holdingCombinedItemData.fullNameCrypto) && Intrinsics.areEqual(this.icon, holdingCombinedItemData.icon) && Intrinsics.areEqual(this.cryptoMarks, holdingCombinedItemData.cryptoMarks) && Intrinsics.areEqual(this.tokenBridgeId, holdingCombinedItemData.tokenBridgeId) && Intrinsics.areEqual(this.token, holdingCombinedItemData.token) && Intrinsics.areEqual(this.externalChain, holdingCombinedItemData.externalChain) && Intrinsics.areEqual(this.tradingVolume, holdingCombinedItemData.tradingVolume) && Intrinsics.areEqual(this.price, holdingCombinedItemData.price) && Intrinsics.areEqual(this.priceRate, holdingCombinedItemData.priceRate) && Intrinsics.areEqual(this.displayToken, holdingCombinedItemData.displayToken) && Intrinsics.areEqual(this.tokenIcon, holdingCombinedItemData.tokenIcon) && Intrinsics.areEqual(this.chainIcon, holdingCombinedItemData.chainIcon) && Intrinsics.areEqual(this.kcChain, holdingCombinedItemData.kcChain) && Intrinsics.areEqual(this.alphaMarks, holdingCombinedItemData.alphaMarks);
    }

    public HoldingCombinedItemData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable List<String> list, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable List<String> list2) {
        this.totalAmountUSD = str;
        this.symbol = str2;
        this.baseCurrency = str3;
        this.quoteCurrency = str4;
        this.currentPrice = str5;
        this.changeRate = str6;
        this.value = str7;
        this.recQuote = str8;
        this.displayCrypto = str9;
        this.fullNameCrypto = str10;
        this.icon = str11;
        this.cryptoMarks = list;
        this.tokenBridgeId = str12;
        this.token = str13;
        this.externalChain = str14;
        this.tradingVolume = str15;
        this.price = str16;
        this.priceRate = str17;
        this.displayToken = str18;
        this.tokenIcon = str19;
        this.chainIcon = str20;
        this.kcChain = str21;
        this.alphaMarks = list2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalAmountUSD() {
        return this.totalAmountUSD;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFullNameCrypto() {
        return this.fullNameCrypto;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<String> component12() {
        return this.cryptoMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getExternalChain() {
        return this.externalChain;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPriceRate() {
        return this.priceRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getDisplayToken() {
        return this.displayToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    public final List<String> component23() {
        return this.alphaMarks;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRecQuote() {
        return this.recQuote;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisplayCrypto() {
        return this.displayCrypto;
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
    public final String getChainIcon() {
        return this.chainIcon;
    }

    @Nullable
    public final String getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final List<String> getCryptoMarks() {
        return this.cryptoMarks;
    }

    @Nullable
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    @Nullable
    public final String getDisplayCrypto() {
        return this.displayCrypto;
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
    public final String getFullNameCrypto() {
        return this.fullNameCrypto;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getKcChain() {
        return this.kcChain;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final String getPriceRate() {
        return this.priceRate;
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

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final String getTotalAmountUSD() {
        return this.totalAmountUSD;
    }

    @Nullable
    public final String getTradingVolume() {
        return this.tradingVolume;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.totalAmountUSD;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseCurrency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quoteCurrency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.changeRate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.value;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.recQuote;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.displayCrypto;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fullNameCrypto;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.icon;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list = this.cryptoMarks;
        int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str12 = this.tokenBridgeId;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.token;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.externalChain;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.tradingVolume;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.price;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.priceRate;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.displayToken;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.tokenIcon;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.chainIcon;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.kcChain;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        List<String> list2 = this.alphaMarks;
        return iHashCode22 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HoldingCombinedItemData(totalAmountUSD=" + this.totalAmountUSD + ", symbol=" + this.symbol + ", baseCurrency=" + this.baseCurrency + ", quoteCurrency=" + this.quoteCurrency + ", currentPrice=" + this.currentPrice + ", changeRate=" + this.changeRate + ", value=" + this.value + ", recQuote=" + this.recQuote + ", displayCrypto=" + this.displayCrypto + ", fullNameCrypto=" + this.fullNameCrypto + ", icon=" + this.icon + ", cryptoMarks=" + this.cryptoMarks + ", tokenBridgeId=" + this.tokenBridgeId + ", token=" + this.token + ", externalChain=" + this.externalChain + ", tradingVolume=" + this.tradingVolume + ", price=" + this.price + ", priceRate=" + this.priceRate + ", displayToken=" + this.displayToken + ", tokenIcon=" + this.tokenIcon + ", chainIcon=" + this.chainIcon + ", kcChain=" + this.kcChain + ", alphaMarks=" + this.alphaMarks + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.totalAmountUSD);
        dest.writeString(this.symbol);
        dest.writeString(this.baseCurrency);
        dest.writeString(this.quoteCurrency);
        dest.writeString(this.currentPrice);
        dest.writeString(this.changeRate);
        dest.writeString(this.value);
        dest.writeString(this.recQuote);
        dest.writeString(this.displayCrypto);
        dest.writeString(this.fullNameCrypto);
        dest.writeString(this.icon);
        dest.writeStringList(this.cryptoMarks);
        dest.writeString(this.tokenBridgeId);
        dest.writeString(this.token);
        dest.writeString(this.externalChain);
        dest.writeString(this.tradingVolume);
        dest.writeString(this.price);
        dest.writeString(this.priceRate);
        dest.writeString(this.displayToken);
        dest.writeString(this.tokenIcon);
        dest.writeString(this.chainIcon);
        dest.writeString(this.kcChain);
        dest.writeStringList(this.alphaMarks);
    }

    public /* synthetic */ HoldingCombinedItemData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : list, (i11 & 4096) != 0 ? null : str12, (i11 & 8192) != 0 ? null : str13, (i11 & 16384) != 0 ? null : str14, (i11 & 32768) != 0 ? null : str15, (i11 & 65536) != 0 ? null : str16, (i11 & 131072) != 0 ? null : str17, (i11 & 262144) != 0 ? null : str18, (i11 & 524288) != 0 ? null : str19, (i11 & 1048576) != 0 ? null : str20, (i11 & 2097152) != 0 ? null : str21, (i11 & 4194304) != 0 ? null : list2);
    }
}
