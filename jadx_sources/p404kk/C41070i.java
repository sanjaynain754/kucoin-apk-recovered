package p404kk;

import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.coin.info.SymbolsInfo;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotSymbolInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kk.i */
/* JADX INFO: compiled from: KCJsBridgeCoin.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u00002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a \u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a\u0018\u0010\b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002\u001a\f\u0010\r\u001a\u00020\u0002*\u00020\u000eH\u0002¨\u0006\u000f"}, m90084d2 = {"loadSpotSymbolBatch", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolInfo;", "stringValue", "", "", "", "key", "toJsFuturesCoinInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesCoinInfo;", "toJsSpotCoinInfo", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotCoinInfo;", "Lcom/kubi/data/entity/CoinInfoEntity;", "toJsSpotSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "JsBridgeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJsBridgeCoin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJsBridgeCoin.kt\ncom/kubi/jsbridge/impl/coin/KCJsBridgeCoinKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,447:1\n1563#2:448\n1634#2,3:449\n1#3:452\n35#4,3:453\n*S KotlinDebug\n*F\n+ 1 KCJsBridgeCoin.kt\ncom/kubi/jsbridge/impl/coin/KCJsBridgeCoinKt\n*L\n348#1:448\n348#1:449,3\n378#1:453,3\n*E\n"})
public final class C41070i {
    /* JADX INFO: renamed from: g */
    public static final List<KCJSApiSymbolsCoinSpotSymbolInfo> m90044g() {
        List<SymbolInfoEntity> listM23631u = SymbolsInfo.f21457a.m23631u(new Function1() { // from class: kk.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C41070i.m90045h((SymbolInfoEntity) obj));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM23631u, 10));
        Iterator<T> it = listM23631u.iterator();
        while (it.hasNext()) {
            arrayList.add(m90049l((SymbolInfoEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m90045h(SymbolInfoEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isEnabled();
    }

    /* JADX INFO: renamed from: j */
    public static final KCJSApiSymbolsCoinFuturesCoinInfo m90047j(Map<String, ? extends Object> map) {
        String str;
        String str2;
        Object objM103844constructorimpl;
        String strM66919i;
        String strM90046i = m90046i(map, "code");
        String strM90046i2 = m90046i(map, FirebaseAnalytics.Param.CURRENCY);
        String strM90046i3 = m90046i(map, "name");
        String strM90046i4 = m90046i(map, "iconUrl");
        String strM90046i5 = m90046i(map, "withdrawDisabledTip");
        String strM90046i6 = m90046i(map, "depositDisabledTip");
        String strM90046i7 = m90046i(map, "type");
        String strM90046i8 = m90046i(map, "precision");
        String strM90046i9 = m90046i(map, "status");
        String strM90046i10 = m90046i(map, "withdrawEnableAt");
        String strM90046i11 = m90046i(map, "depositEnableAt");
        String strM90046i12 = m90046i(map, "withdrawMinFee");
        String strM90046i13 = m90046i(map, "withdrawMinSize");
        String strM90046i14 = m90046i(map, "innerWithdrawMinFee");
        String strM90046i15 = m90046i(map, "availableBalance");
        String strM90046i16 = m90046i(map, "totalBalance");
        String strM90046i17 = m90046i(map, "isDepositEnabled");
        String strM90046i18 = m90046i(map, "isWithdrawEnabled");
        String strM90046i19 = m90046i(map, "isDisplayWithdraw");
        String strM90046i20 = m90046i(map, "isDisplayDeposit");
        String strM90046i21 = m90046i(map, "isMarginEnabled");
        String strM90046i22 = m90046i(map, "isDebitEnabled");
        String strM90046i23 = m90046i(map, "isPoolXEnabled");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = map.get("properties");
            if (obj != null) {
                str = strM90046i2;
                str2 = strM90046i3;
                try {
                    strM66919i = C27099x.m66919i(obj, false, 2, null);
                    if (strM66919i == null) {
                        strM66919i = "";
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                str = strM90046i2;
                str2 = strM90046i3;
                strM66919i = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(strM66919i);
        } catch (Throwable th3) {
            th = th3;
            str = strM90046i2;
            str2 = strM90046i3;
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str3 = (String) objM103844constructorimpl;
        if (str3 == null) {
            str3 = "{}";
        }
        return new KCJSApiSymbolsCoinFuturesCoinInfo(strM90046i, str, str2, strM90046i4, strM90046i5, strM90046i6, strM90046i7, strM90046i8, strM90046i9, strM90046i10, strM90046i11, strM90046i12, strM90046i13, strM90046i14, strM90046i15, strM90046i16, strM90046i17, strM90046i18, strM90046i19, strM90046i20, strM90046i21, strM90046i22, strM90046i23, C27041f.m66673m(m90046i(map, "isEarnEnabled"), false, 1, null), C27041f.m66673m(m90046i(map, "isDigitalCoin"), false, 1, null), C27041f.m66673m(m90046i(map, "isStableCoin"), false, 1, null), C27041f.m66673m(m90046i(map, "isDelistingCoin"), false, 1, null), C27041f.m66673m(m90046i(map, "isTransferEnabled"), false, 1, null), str3);
    }

    /* JADX INFO: renamed from: i */
    public static final String m90046i(Map<String, ? extends Object> map, String str) {
        String string;
        Object obj = map.get(str);
        if (obj != null) {
            string = obj.toString();
        } else {
            string = null;
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    /* JADX INFO: renamed from: k */
    public static final KCJSApiSymbolsCoinSpotCoinInfo m90048k(CoinInfoEntity coinInfoEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String code = coinInfoEntity.getCode();
        if (code == null) {
            str = "";
        } else {
            str = code;
        }
        String currency = coinInfoEntity.getCurrency();
        if (currency == null) {
            str2 = "";
        } else {
            str2 = currency;
        }
        String name = coinInfoEntity.getName();
        if (name == null) {
            str3 = "";
        } else {
            str3 = name;
        }
        String iconUrl = coinInfoEntity.getIconUrl();
        if (iconUrl == null) {
            str4 = "";
        } else {
            str4 = iconUrl;
        }
        return new KCJSApiSymbolsCoinSpotCoinInfo(str, str2, str3, str4, String.valueOf(coinInfoEntity.getPrecision()), String.valueOf(coinInfoEntity.getStatus()), String.valueOf(coinInfoEntity.getWithdrawMinFee()), String.valueOf(coinInfoEntity.getWithdrawMinSize()), String.valueOf(coinInfoEntity.getWithdrawEnableAt()), String.valueOf(coinInfoEntity.getDepositEnableAt()), "", String.valueOf(coinInfoEntity.isDigital()), String.valueOf(coinInfoEntity.isWithdrawEnabled()), String.valueOf(coinInfoEntity.isDepositEnabled()), coinInfoEntity.isDigital(), coinInfoEntity.getProperties().isStableCoin(), Intrinsics.areEqual("TRUE", coinInfoEntity.getProperties().isDelisting()), coinInfoEntity.isDebitEnabled(), coinInfoEntity.isEarnEnabled(), !Intrinsics.areEqual(coinInfoEntity.getProperties().getIsTransferEnabled(), CredentialEntry.FALSE_STRING));
    }

    /* JADX INFO: renamed from: l */
    public static final KCJSApiSymbolsCoinSpotSymbolInfo m90049l(SymbolInfoEntity symbolInfoEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String code = symbolInfoEntity.getCode();
        if (code == null) {
            str = "";
        } else {
            str = code;
        }
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        if (baseCurrency == null) {
            str2 = "";
        } else {
            str2 = baseCurrency;
        }
        String quoteCurrency = symbolInfoEntity.getQuoteCurrency();
        if (quoteCurrency == null) {
            str3 = "";
        } else {
            str3 = quoteCurrency;
        }
        String strValueOf = String.valueOf(symbolInfoEntity.getMark());
        String strValueOf2 = String.valueOf(symbolInfoEntity.getBoard());
        String strValueOf3 = String.valueOf(symbolInfoEntity.getWeight());
        String strValueOf4 = String.valueOf(symbolInfoEntity.isEnableTrading());
        String string = symbolInfoEntity.getEnableAuctionTrade().toString();
        String strValueOf5 = String.valueOf(symbolInfoEntity.isDisplay());
        String market = symbolInfoEntity.getMarket();
        if (market == null) {
            str4 = "";
        } else {
            str4 = market;
        }
        String feeCode = symbolInfoEntity.getFeeCode();
        if (feeCode == null) {
            str5 = "";
        } else {
            str5 = feeCode;
        }
        String strValueOf6 = String.valueOf(symbolInfoEntity.getMakerFeeRate());
        String strValueOf7 = String.valueOf(symbolInfoEntity.getTakerFeeRate());
        String quoteIncrement = symbolInfoEntity.getQuoteIncrement();
        if (quoteIncrement == null) {
            str6 = "";
        } else {
            str6 = quoteIncrement;
        }
        String strValueOf8 = String.valueOf(symbolInfoEntity.getQuoteMinSize());
        String strValueOf9 = String.valueOf(symbolInfoEntity.getQuoteMaxSize());
        String baseIncrement = symbolInfoEntity.getBaseIncrement();
        if (baseIncrement == null) {
            str7 = "";
        } else {
            str7 = baseIncrement;
        }
        String strValueOf10 = String.valueOf(symbolInfoEntity.getBaseMinSize());
        String strValueOf11 = String.valueOf(symbolInfoEntity.getBaseMaxSize());
        String priceIncrement = symbolInfoEntity.getPriceIncrement();
        if (priceIncrement == null) {
            str8 = "";
        } else {
            str8 = priceIncrement;
        }
        String showSymbol = symbolInfoEntity.getShowSymbol();
        if (showSymbol == null) {
            str9 = "";
        } else {
            str9 = showSymbol;
        }
        String baseCurrencyName = symbolInfoEntity.getBaseCurrencyName();
        if (baseCurrencyName == null) {
            str10 = "";
        } else {
            str10 = baseCurrencyName;
        }
        String quoteCurrencyName = symbolInfoEntity.getQuoteCurrencyName();
        if (quoteCurrencyName == null) {
            str11 = "";
        } else {
            str11 = quoteCurrencyName;
        }
        String strValueOf12 = String.valueOf(symbolInfoEntity.isMarginEnabled());
        String strValueOf13 = String.valueOf(symbolInfoEntity.isIsolatedMarginEnabled());
        String string2 = symbolInfoEntity.getEnableAuctionTrade().toString();
        String strValueOf14 = String.valueOf(symbolInfoEntity.isBotEnabled());
        String disabledTip = symbolInfoEntity.getDisabledTip();
        if (disabledTip == null) {
            str12 = "";
        } else {
            str12 = disabledTip;
        }
        return new KCJSApiSymbolsCoinSpotSymbolInfo(str, "", str2, str3, strValueOf, strValueOf2, strValueOf3, strValueOf4, string, strValueOf5, str4, "", str5, strValueOf6, strValueOf7, str6, strValueOf8, strValueOf9, str7, strValueOf10, strValueOf11, str8, symbolInfoEntity.getPriceIncrementPrecision(), symbolInfoEntity.getBaseIncrementPrecision(), symbolInfoEntity.getQuoteIncrementPrecision(), str9, str10, str11, strValueOf12, strValueOf13, string2, strValueOf14, str12, String.valueOf(symbolInfoEntity.getPriceProtectionRate()));
    }
}
