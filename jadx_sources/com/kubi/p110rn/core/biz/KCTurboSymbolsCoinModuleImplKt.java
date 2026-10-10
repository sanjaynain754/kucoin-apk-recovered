package com.kubi.p110rn.core.biz;

import androidx.core.app.NotificationCompat;
import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.p110rn.core.turbo.FuturesCoinInfo;
import com.kubi.p110rn.core.turbo.FuturesSymbolInfo;
import com.kubi.p110rn.core.turbo.SpotCoinInfo;
import com.kubi.p110rn.core.turbo.SpotSymbolInfo;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCTurboSymbolsCoinModuleImpl.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a \u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a\u000e\u0010\b\u001a\u00020\u0004*\u0004\u0018\u00010\u0006H\u0002\u001a\u0018\u0010\t\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002¨\u0006\u0014"}, m90084d2 = {"toBatchSpotCoinInfo", "Lcom/kubi/rn/core/turbo/SpotCoinInfo;", "Lcom/kubi/data/entity/CoinInfoEntity;", "str", "", "", "", "key", "orEmptyString", "toFuturesCoinInfo", "Lcom/kubi/rn/core/turbo/FuturesCoinInfo;", "toFuturesSymbolInfo", "Lcom/kubi/rn/core/turbo/FuturesSymbolInfo;", NotificationCompat.CATEGORY_SERVICE, "Lcom/kubi/kumex/api/IKuMexService;", "fallbackSymbol", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "toSpotSymbolInfo", "Lcom/kubi/rn/core/turbo/SpotSymbolInfo;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "BReactNativeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTurboSymbolsCoinModuleImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTurboSymbolsCoinModuleImpl.kt\ncom/kubi/rn/core/biz/KCTurboSymbolsCoinModuleImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,455:1\n1#2:456\n*E\n"})
public final class KCTurboSymbolsCoinModuleImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesSymbolInfo toFuturesSymbolInfo(Map<String, ? extends Object> map, IKuMexService iKuMexService, String str) {
        String str2 = str(map, "type");
        String str3 = str(map, "isInverse");
        String str4 = str(map, "symbol");
        return new FuturesSymbolInfo(str2, str3, str4.length() == 0 ? str : str4, str(map, "rootSymbol"), str(map, "baseCurrency"), str(map, "displayBaseCurrency"), str(map, "quoteCurrency"), str(map, "status"), str(map, "createdAt"), str(map, "expireDate"), str(map, "updatedAt"), str(map, "fairMethod"), str(map, "firstOpenDate"), str(map, "fundingBaseSymbol"), str(map, "fundingQuoteSymbol"), str(map, "fundingRateSymbol"), str(map, "indexSymbol"), str(map, "initialMargin"), str(map, "isDeleverage"), str(map, "isQuanto"), str(map, "lotSize"), str(map, "maintainMargin"), str(map, "makerFeeRate"), str(map, "makerFixFee"), str(map, "markMethod"), str(map, "maxOrderQty"), str(map, "indexPriceTickSize"), str(map, "maxPrice"), str(map, "maxRiskLimit"), str(map, "minRiskLimit"), str(map, "riskStep"), str(map, "settleCurrency"), str(map, "settleDate"), str(map, "settlementFee"), str(map, "takerFeeRate"), str(map, "takerFixFee"), str(map, "tickSize"), str(map, "multiplier"), iKuMexService.mo33264M(str), iKuMexService.mo33289s(str), str(map, "maxLeverage"), str(map, "imgUrl"), str(map, "marketStage"), str(map, "preMarketToPerpDate"));
    }

    private static final String orEmptyString(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesCoinInfo toFuturesCoinInfo(Map<String, ? extends Object> map) {
        Object objM103844constructorimpl;
        String str = str(map, "code");
        String str2 = str(map, FirebaseAnalytics.Param.CURRENCY);
        String str3 = str(map, "name");
        String str4 = str(map, "iconUrl");
        String str5 = str(map, "withdrawDisabledTip");
        String str6 = str(map, "depositDisabledTip");
        String str7 = str(map, "type");
        String str8 = str(map, "precision");
        String str9 = str(map, "status");
        String str10 = str(map, "withdrawEnableAt");
        String str11 = str(map, "depositEnableAt");
        String str12 = str(map, "withdrawMinFee");
        String str13 = str(map, "withdrawMinSize");
        String str14 = str(map, "innerWithdrawMinFee");
        String str15 = str(map, "availableBalance");
        String str16 = str(map, "totalBalance");
        String str17 = str(map, "isDepositEnabled");
        String str18 = str(map, "isWithdrawEnabled");
        String str19 = str(map, "isDisplayWithdraw");
        String str20 = str(map, "isDisplayDeposit");
        String str21 = str(map, "isMarginEnabled");
        String str22 = str(map, "isDebitEnabled");
        String str23 = str(map, "isPoolXEnabled");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object obj = map.get("properties");
            objM103844constructorimpl = Result.m103844constructorimpl(obj != null ? C27029c.m66606i(obj) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str24 = (String) objM103844constructorimpl;
        if (str24 == null) {
            str24 = "{}";
        }
        return new FuturesCoinInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, Boolean.valueOf(C27041f.m66673m(str(map, "isEarnEnabled"), false, 1, null)), Boolean.valueOf(C27041f.m66673m(str(map, "isDigitalCoin"), false, 1, null)), Boolean.valueOf(C27041f.m66673m(str(map, "isStableCoin"), false, 1, null)), Boolean.valueOf(C27041f.m66673m(str(map, "isDelistingCoin"), false, 1, null)), Boolean.valueOf(C27041f.m66673m(str(map, "isTransferEnabled"), false, 1, null)), str24);
    }

    private static final String str(Map<String, ? extends Object> map, String str) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpotCoinInfo toBatchSpotCoinInfo(CoinInfoEntity coinInfoEntity) {
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
        return new SpotCoinInfo(str, str2, str3, str4, String.valueOf(coinInfoEntity.getPrecision()), String.valueOf(coinInfoEntity.getStatus()), String.valueOf(coinInfoEntity.getWithdrawMinFee()), String.valueOf(coinInfoEntity.getWithdrawMinSize()), String.valueOf(coinInfoEntity.getWithdrawEnableAt()), String.valueOf(coinInfoEntity.getDepositEnableAt()), "", String.valueOf(coinInfoEntity.isDigital()), String.valueOf(coinInfoEntity.isWithdrawEnabled()), String.valueOf(coinInfoEntity.isDepositEnabled()), Boolean.valueOf(coinInfoEntity.isDigital()), Boolean.valueOf(coinInfoEntity.getProperties().isStableCoin()), Boolean.valueOf(Intrinsics.areEqual("TRUE", coinInfoEntity.getProperties().isDelisting())), Boolean.valueOf(coinInfoEntity.isDebitEnabled()), Boolean.valueOf(coinInfoEntity.isEarnEnabled()), Boolean.valueOf(!Intrinsics.areEqual(coinInfoEntity.getProperties().getIsTransferEnabled(), CredentialEntry.FALSE_STRING)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SpotSymbolInfo toSpotSymbolInfo(SymbolInfoEntity symbolInfoEntity) {
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
        String strValueOf13 = String.valueOf(symbolInfoEntity.isBotEnabled());
        String strValueOf14 = String.valueOf(symbolInfoEntity.isIsolatedMarginEnabled());
        String string2 = symbolInfoEntity.getEnableAuctionTrade().toString();
        String disabledTip = symbolInfoEntity.getDisabledTip();
        if (disabledTip == null) {
            str12 = "";
        } else {
            str12 = disabledTip;
        }
        return new SpotSymbolInfo(str, "", str2, str3, strValueOf, strValueOf2, strValueOf3, strValueOf4, string, strValueOf5, str4, "", str5, strValueOf6, strValueOf7, str6, strValueOf8, strValueOf9, str7, strValueOf10, strValueOf11, str8, Double.valueOf(symbolInfoEntity.getPriceIncrementPrecision()), Double.valueOf(symbolInfoEntity.getBaseIncrementPrecision()), Double.valueOf(symbolInfoEntity.getQuoteIncrementPrecision()), str9, str10, str11, strValueOf12, strValueOf14, string2, strValueOf13, str12, String.valueOf(symbolInfoEntity.getPriceProtectionRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FuturesSymbolInfo toFuturesSymbolInfo(ContractEntity contractEntity, IKuMexService iKuMexService) {
        String symbol = contractEntity.getSymbol();
        String str = symbol == null ? "" : symbol;
        String type = contractEntity.getType();
        String str2 = type == null ? "" : type;
        String strValueOf = String.valueOf(contractEntity.isInverse());
        String rootSymbol = contractEntity.getRootSymbol();
        String str3 = rootSymbol == null ? "" : rootSymbol;
        String baseCurrency = contractEntity.getBaseCurrency();
        String str4 = baseCurrency == null ? "" : baseCurrency;
        String displayBaseCurrency = contractEntity.getDisplayBaseCurrency();
        String str5 = displayBaseCurrency == null ? "" : displayBaseCurrency;
        String quoteCurrency = contractEntity.getQuoteCurrency();
        String str6 = quoteCurrency == null ? "" : quoteCurrency;
        String status = contractEntity.getStatus();
        String str7 = status == null ? "" : status;
        String strValueOf2 = String.valueOf(contractEntity.getCreatedAt());
        String strValueOf3 = String.valueOf(contractEntity.getExpireDate());
        String strValueOf4 = String.valueOf(contractEntity.getUpdatedAt());
        String fairMethod = contractEntity.getFairMethod();
        String str8 = fairMethod == null ? "" : fairMethod;
        String strValueOf5 = String.valueOf(contractEntity.getFirstOpenDate());
        String fundingBaseSymbol = contractEntity.getFundingBaseSymbol();
        String str9 = fundingBaseSymbol == null ? "" : fundingBaseSymbol;
        String fundingQuoteSymbol = contractEntity.getFundingQuoteSymbol();
        String str10 = fundingQuoteSymbol == null ? "" : fundingQuoteSymbol;
        String fundingRateSymbol = contractEntity.getFundingRateSymbol();
        String str11 = fundingRateSymbol == null ? "" : fundingRateSymbol;
        String indexSymbol = contractEntity.getIndexSymbol();
        String str12 = indexSymbol == null ? "" : indexSymbol;
        String strOrEmptyString = orEmptyString(contractEntity.getInitialMargin());
        String strValueOf6 = String.valueOf(contractEntity.isDeleverage());
        String strValueOf7 = String.valueOf(contractEntity.isQuanto());
        String strOrEmptyString2 = orEmptyString(contractEntity.getLotSize());
        String strOrEmptyString3 = orEmptyString(contractEntity.getMaintainMargin());
        String strOrEmptyString4 = orEmptyString(contractEntity.getMakerFeeRate());
        String strOrEmptyString5 = orEmptyString(contractEntity.getMakerFixFee());
        String markMethod = contractEntity.getMarkMethod();
        String str13 = markMethod == null ? "" : markMethod;
        String strOrEmptyString6 = orEmptyString(contractEntity.getMaxOrderQty());
        String strOrEmptyString7 = orEmptyString(contractEntity.getIndexPriceTickSize());
        String strOrEmptyString8 = orEmptyString(contractEntity.getMaxPrice());
        String strOrEmptyString9 = orEmptyString(contractEntity.getMaxRiskLimit());
        String strOrEmptyString10 = orEmptyString(contractEntity.getMinRiskLimit());
        String strOrEmptyString11 = orEmptyString(contractEntity.getRiskStep());
        String settleCurrency = contractEntity.getSettleCurrency();
        String str14 = settleCurrency == null ? "" : settleCurrency;
        Long settleDate = contractEntity.getSettleDate();
        String string = settleDate != null ? settleDate.toString() : null;
        return new FuturesSymbolInfo(str2, strValueOf, str, str3, str4, str5, str6, str7, strValueOf2, strValueOf3, strValueOf4, str8, strValueOf5, str9, str10, str11, str12, strOrEmptyString, strValueOf6, strValueOf7, strOrEmptyString2, strOrEmptyString3, strOrEmptyString4, strOrEmptyString5, str13, strOrEmptyString6, strOrEmptyString7, strOrEmptyString8, strOrEmptyString9, strOrEmptyString10, strOrEmptyString11, str14, string == null ? "" : string, orEmptyString(contractEntity.getSettlementFee()), orEmptyString(contractEntity.getTakerFeeRate()), orEmptyString(contractEntity.getTakerFixFee()), orEmptyString(contractEntity.getTickSize()), orEmptyString(contractEntity.getMultiplier()), iKuMexService.mo33264M(str), iKuMexService.mo33289s(str), orEmptyString(contractEntity.getMaxLeverage()), contractEntity.getImgUrl(), contractEntity.getMarketStage(), orEmptyString(contractEntity.getPreMarketToPerpDate()));
    }
}
