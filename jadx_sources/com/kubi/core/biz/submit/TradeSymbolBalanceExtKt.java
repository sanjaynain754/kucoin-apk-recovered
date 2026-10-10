package com.kubi.core.biz.submit;

import android.os.SystemClock;
import androidx.lifecycle.ViewModelKt;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.tradebase.available.AvailableTradeAmountStatus;
import com.kubi.tradebase.marketamount.C25898h;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.utils.extensions.DowngradeExKt;
import ee.C37136a;
import java.math.BigDecimal;
import k30.AvailableTradeAmountState;
import k30.AvailableTradeAmountValue;
import k30.C40879a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p402kf.C41014a;
import p756xc.BalanceData;
import p756xc.TradeSymbolBalance;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeSymbolBalanceExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a&\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\n*\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u001c\u0010\u0016\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a$\u0010\u0017\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\nH\u0002\u001a\u001a\u0010\u0019\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012\u001a\f\u0010\u001a\u001a\u00020\r*\u00020\u000eH\u0000\u001a(\u0010\u001b\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u000e\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0010H\u0002\u001a\u000e\u0010!\u001a\u00020\"*\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"getTakerFeeWithTax", "Ljava/math/BigDecimal;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getAvailableTradeFeeRate", "createInvalidAvailableTradeAmount", "Lcom/kubi/tradebase/available/AvailableTradeAmountState;", "status", "Lcom/kubi/tradebase/available/AvailableTradeAmountStatus;", "USER_TRIGGER_DEBOUNCE_MS", "", "PUSH_TRIGGER_THROTTLE_MS", "fetchTradeBalanceData", "", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "state", "Lcom/kubi/core/biz/submit/TradeSubmitBizContract$UiState;", "utaOrderApi1", "Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "isUserTriggered", "", "calculateDelay", "executeBalanceFetch", "scheduleBalanceFetch", "delayMs", "fetchTradeBalanceDataInternal", "refreshAvailableTradeAmountFromCurrentBalance", "updateAvailableTradeAmount", "context", "Lcom/kubi/core/biz/submit/AvailableTradeAmountRequestContext;", "quoteAvailable", "baseAvailable", "toAvailableTradeAmountRequestContext", "normalizedKey", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeSymbolBalanceExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeSymbolBalanceExt.kt\ncom/kubi/core/biz/submit/TradeSymbolBalanceExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,460:1\n1#2:461\n*E\n"})
public final class TradeSymbolBalanceExtKt {
    /* JADX INFO: renamed from: b */
    public static final long m22489b(TradeSubmitVM tradeSubmitVM, boolean z11) {
        if (z11) {
            return 1000L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - tradeSubmitVM.getF20661h0().get();
        if (jElapsedRealtime >= 5000) {
            return 0L;
        }
        return RangesKt.coerceAtLeast(5000 - jElapsedRealtime, 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AvailableTradeAmountState m22490c(@Nullable SymbolInfoEntity symbolInfoEntity, @NotNull AvailableTradeAmountStatus status) {
        String str;
        Intrinsics.checkNotNullParameter(status, "status");
        String baseCurrencyName = symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrencyName() : null;
        if (baseCurrencyName == null) {
            baseCurrencyName = "";
        }
        if (StringsKt.isBlank(baseCurrencyName)) {
            baseCurrencyName = symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null;
            if (baseCurrencyName == null) {
                baseCurrencyName = "";
            }
        }
        AvailableTradeAmountValue availableTradeAmountValue = new AvailableTradeAmountValue(null, baseCurrencyName, symbolInfoEntity != null ? symbolInfoEntity.getBaseIncrementPrecision() : 0, status, 1, null);
        String quoteCurrencyName = symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrencyName() : null;
        if (quoteCurrencyName == null) {
            quoteCurrencyName = "";
        }
        if (StringsKt.isBlank(quoteCurrencyName)) {
            String quoteCurrency = symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null;
            str = quoteCurrency != null ? quoteCurrency : "";
        } else {
            str = quoteCurrencyName;
        }
        return new AvailableTradeAmountState(availableTradeAmountValue, new AvailableTradeAmountValue(null, str, symbolInfoEntity != null ? symbolInfoEntity.getQuoteIncrementPrecision() : 0, status, 1, null));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AvailableTradeAmountState m22491d(SymbolInfoEntity symbolInfoEntity, AvailableTradeAmountStatus availableTradeAmountStatus, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            availableTradeAmountStatus = AvailableTradeAmountStatus.INVALID;
        }
        return m22490c(symbolInfoEntity, availableTradeAmountStatus);
    }

    /* JADX INFO: renamed from: f */
    public static final void m22493f(@NotNull TradeSubmitVM tradeSubmitVM, @NotNull UiState state, @NotNull IMarginInfoApi utaOrderApi1, boolean z11) {
        Intrinsics.checkNotNullParameter(tradeSubmitVM, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(utaOrderApi1, "utaOrderApi1");
        if (state.getSymbolInfo() == null || !Intrinsics.areEqual(state.getSymbolInfo().getCode(), state.getSymbol())) {
            return;
        }
        long jM22489b = m22489b(tradeSubmitVM, z11);
        if (jM22489b == 0) {
            m22492e(tradeSubmitVM, state, utaOrderApi1);
        } else {
            m22500m(tradeSubmitVM, state, utaOrderApi1, jM22489b);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22494g(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m22493f(tradeSubmitVM, uiState, iMarginInfoApi, z11);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final void m22495h(@NotNull TradeSubmitVM tradeSubmitVM, @NotNull UiState state, @NotNull IMarginInfoApi utaOrderApi1) {
        String str;
        BigDecimal inputBuyPrice;
        BigDecimal bigDecimalM11724a;
        String plainString;
        BigDecimal inputSellPrice;
        BigDecimal bigDecimalM11724a2;
        String plainString2;
        BigDecimal inputBuyPrice2;
        BigDecimal bigDecimalM11724a3;
        String plainString3;
        BigDecimal inputSellPrice2;
        BigDecimal bigDecimalM11724a4;
        String plainString4;
        BigDecimal inputSellTriggerPrice;
        BigDecimal bigDecimalM11724a5;
        BigDecimal inputBuyTriggerPrice;
        BigDecimal bigDecimalM11724a6;
        Intrinsics.checkNotNullParameter(tradeSubmitVM, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(utaOrderApi1, "utaOrderApi1");
        UiState uiState = (UiState) tradeSubmitVM.getState();
        if (uiState.getSymbolInfo() == null || !Intrinsics.areEqual(uiState.getSymbolInfo().getCode(), uiState.getSymbol())) {
            return;
        }
        SymbolInfoEntity symbolInfo = uiState.getSymbolInfo();
        String str2 = Intrinsics.areEqual(tradeSubmitVM.getF20070W(), TradeAccountType.Margin.INSTANCE) ? "MARGIN" : "SPOT";
        String code = symbolInfo.getCode();
        TradeType tradeType = uiState.getTradeType();
        if (tradeType == null) {
            tradeType = TradeType.LIMIT;
        }
        if (tradeType == TradeType.MARKET) {
            str = "MARKET";
        } else {
            TradeType tradeType2 = uiState.getTradeType();
            if (tradeType2 == null) {
                tradeType2 = TradeType.LIMIT;
            }
            if (tradeType2 == TradeType.MARKET_STOP) {
                str = "MARKET";
            } else {
                str = "LIMIT";
            }
        }
        String str3 = str;
        TradeType tradeType3 = uiState.getTradeType();
        if (tradeType3 == null) {
            tradeType3 = TradeType.LIMIT;
        }
        TradeType tradeType4 = TradeType.LIMIT;
        if (tradeType3 == tradeType4 || uiState.getTradeType() == TradeType.ADVANCED_LIMIT || uiState.getTradeType() == TradeType.SEGMENT) {
            if (Intrinsics.areEqual(uiState.getPanelModel(), InterfaceC38170b.b.f85867a)) {
                inputBuyPrice = uiState.getInputBuyPrice();
                if (inputBuyPrice == null) {
                    inputBuyPrice = uiState.getInputSellPrice();
                }
            } else {
                inputBuyPrice = uiState.getInputBuyPrice();
            }
            if (C41014a.m89917B(inputBuyPrice) || inputBuyPrice == null || (bigDecimalM11724a = C6447a.m11724a(inputBuyPrice)) == null) {
                plainString = null;
            } else {
                plainString = bigDecimalM11724a.toPlainString();
            }
        } else {
            plainString = null;
        }
        TradeType tradeType5 = uiState.getTradeType();
        if (tradeType5 == null) {
            tradeType5 = tradeType4;
        }
        if (tradeType5 == tradeType4 || uiState.getTradeType() == TradeType.ADVANCED_LIMIT || uiState.getTradeType() == TradeType.SEGMENT) {
            if (Intrinsics.areEqual(uiState.getPanelModel(), InterfaceC38170b.b.f85867a)) {
                inputSellPrice = uiState.getInputSellPrice();
                if (inputSellPrice == null) {
                    inputSellPrice = uiState.getInputBuyPrice();
                }
            } else {
                inputSellPrice = uiState.getInputSellPrice();
            }
            if (C41014a.m89917B(inputSellPrice) || inputSellPrice == null || (bigDecimalM11724a2 = C6447a.m11724a(inputSellPrice)) == null) {
                plainString2 = null;
            } else {
                plainString2 = bigDecimalM11724a2.toPlainString();
            }
        } else {
            plainString2 = null;
        }
        TradeType tradeType6 = uiState.getTradeType();
        TradeType tradeType7 = TradeType.MARKET_STOP;
        if (tradeType6 == tradeType7) {
            if (C41014a.m89917B(uiState.getInputBuyTriggerPrice()) || (inputBuyTriggerPrice = uiState.getInputBuyTriggerPrice()) == null || (bigDecimalM11724a6 = C6447a.m11724a(inputBuyTriggerPrice)) == null) {
                plainString3 = null;
            } else {
                plainString3 = bigDecimalM11724a6.toPlainString();
            }
        } else if (uiState.getTradeType() != TradeType.LIMIT_STOP) {
            plainString3 = null;
        } else {
            if (Intrinsics.areEqual(uiState.getPanelModel(), InterfaceC38170b.b.f85867a)) {
                inputBuyPrice2 = uiState.getInputBuyPrice();
                if (inputBuyPrice2 == null) {
                    inputBuyPrice2 = uiState.getInputSellPrice();
                }
            } else {
                inputBuyPrice2 = uiState.getInputBuyPrice();
            }
            if (C41014a.m89917B(inputBuyPrice2) || inputBuyPrice2 == null || (bigDecimalM11724a3 = C6447a.m11724a(inputBuyPrice2)) == null) {
                plainString3 = null;
            } else {
                plainString3 = bigDecimalM11724a3.toPlainString();
            }
        }
        if (uiState.getTradeType() == tradeType7) {
            if (C41014a.m89917B(uiState.getInputSellTriggerPrice()) || (inputSellTriggerPrice = uiState.getInputSellTriggerPrice()) == null || (bigDecimalM11724a5 = C6447a.m11724a(inputSellTriggerPrice)) == null) {
                plainString4 = null;
            } else {
                plainString4 = bigDecimalM11724a5.toPlainString();
            }
        } else if (uiState.getTradeType() != TradeType.LIMIT_STOP) {
            plainString4 = null;
        } else {
            if (Intrinsics.areEqual(uiState.getPanelModel(), InterfaceC38170b.b.f85867a)) {
                inputSellPrice2 = uiState.getInputSellPrice();
                if (inputSellPrice2 == null) {
                    inputSellPrice2 = uiState.getInputBuyPrice();
                }
            } else {
                inputSellPrice2 = uiState.getInputSellPrice();
            }
            if (C41014a.m89917B(inputSellPrice2) || inputSellPrice2 == null || (bigDecimalM11724a4 = C6447a.m11724a(inputSellPrice2)) == null) {
                plainString4 = null;
            } else {
                plainString4 = bigDecimalM11724a4.toPlainString();
            }
        }
        InterfaceC41775x1 f20659f0 = tradeSubmitVM.getF20659f0();
        if (f20659f0 != null) {
            InterfaceC41775x1.a.m91377a(f20659f0, null, 1, null);
        }
        tradeSubmitVM.m22458L0(C41696j.m91104d(ViewModelKt.getViewModelScope(tradeSubmitVM), C42911a.m94120b(), null, new TradeSymbolBalanceExtKt$fetchTradeBalanceDataInternal$1(utaOrderApi1, str2, code, str3, plainString, plainString3, plainString2, plainString4, symbolInfo, uiState, tradeSubmitVM, null), 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final BigDecimal m22496i(@NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        BigDecimal bigDecimalM22497j = m22497j(symbolInfo);
        if (bigDecimalM22497j != null) {
            return bigDecimalM22497j;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final BigDecimal m22497j(@NotNull SymbolInfoEntity symbolInfo) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        C37136a c37136a = C37136a.f82407a;
        BigDecimal bigDecimalMo37956r = c37136a.m83062a().mo37956r(symbolInfo);
        BigDecimal bigDecimalMo37911J = c37136a.m83062a().mo37911J(symbolInfo);
        FeeEntity feeEntityMo37947m0 = c37136a.m83062a().mo37947m0(symbolInfo);
        return ((BigDecimal) ComparisonsKt.maxOf(bigDecimalMo37956r, bigDecimalMo37911J)).add(DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getBuyTaxRate() : null, null, 1, null));
    }

    /* JADX INFO: renamed from: k */
    public static final String m22498k(BigDecimal bigDecimal) {
        BigDecimal bigDecimalM11724a;
        String plainString = (bigDecimal == null || (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) == null) ? null : bigDecimalM11724a.toPlainString();
        return plainString == null ? "" : plainString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m22499l(@NotNull TradeSubmitVM tradeSubmitVM) {
        BalanceData base;
        BalanceData quote;
        Intrinsics.checkNotNullParameter(tradeSubmitVM, "<this>");
        UiState uiState = (UiState) tradeSubmitVM.getState();
        AvailableTradeAmountRequestContext availableTradeAmountRequestContextM22501n = m22501n(uiState);
        BigDecimal availableBalance = null;
        if (availableTradeAmountRequestContextM22501n == null) {
            tradeSubmitVM.m22463R0(m22491d(uiState.getSymbolInfo(), null, 2, null));
            return;
        }
        TradeSymbolBalance tradeBalance = uiState.getTradeBalance();
        BigDecimal availableBalance2 = (tradeBalance == null || (quote = tradeBalance.getQuote()) == null) ? null : quote.getAvailableBalance();
        TradeSymbolBalance tradeBalance2 = uiState.getTradeBalance();
        if (tradeBalance2 != null && (base = tradeBalance2.getBase()) != null) {
            availableBalance = base.getAvailableBalance();
        }
        m22502o(tradeSubmitVM, availableTradeAmountRequestContextM22501n, availableBalance2, availableBalance);
    }

    /* JADX INFO: renamed from: e */
    public static final void m22492e(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(tradeSubmitVM), C41782z0.m91393c(), null, new TradeSymbolBalanceExtKt$executeBalanceFetch$1(tradeSubmitVM, uiState, iMarginInfoApi, null), 2, null);
    }

    /* JADX INFO: renamed from: m */
    public static final void m22500m(TradeSubmitVM tradeSubmitVM, UiState uiState, IMarginInfoApi iMarginInfoApi, long j11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(tradeSubmitVM), C41782z0.m91393c(), null, new TradeSymbolBalanceExtKt$scheduleBalanceFetch$1(tradeSubmitVM, j11, uiState.getSymbol(), uiState.getTradeType(), iMarginInfoApi, null), 2, null);
    }

    /* JADX INFO: renamed from: n */
    public static final AvailableTradeAmountRequestContext m22501n(UiState uiState) {
        BigDecimal bigDecimalM63239a;
        BigDecimal bigDecimalM63239a2;
        SymbolInfoEntity symbolInfo = uiState.getSymbolInfo();
        if (symbolInfo == null || !Intrinsics.areEqual(symbolInfo.getCode(), uiState.getSymbol())) {
            return null;
        }
        TradeType tradeType = uiState.getTradeType();
        if (tradeType == null) {
            tradeType = TradeType.LIMIT;
        }
        TradeType tradeType2 = tradeType;
        if (tradeType2 != TradeType.MARKET && tradeType2 != TradeType.MARKET_STOP) {
            if (Intrinsics.areEqual(uiState.getPanelModel(), InterfaceC38170b.b.f85867a)) {
                bigDecimalM63239a = uiState.getInputBuyPrice();
                if (bigDecimalM63239a == null) {
                    bigDecimalM63239a = uiState.getInputSellPrice();
                }
                bigDecimalM63239a2 = uiState.getInputSellPrice();
                if (bigDecimalM63239a2 == null) {
                    bigDecimalM63239a2 = uiState.getInputBuyPrice();
                }
            } else {
                bigDecimalM63239a = uiState.getInputBuyPrice();
                bigDecimalM63239a2 = uiState.getInputSellPrice();
            }
        } else {
            OrderBookCenterEntity bbo = uiState.getBbo();
            if (bbo != null) {
                bigDecimalM63239a = C25898h.m63239a(bbo.getBestAsk());
            } else {
                bigDecimalM63239a = null;
            }
            OrderBookCenterEntity bbo2 = uiState.getBbo();
            if (bbo2 != null) {
                bigDecimalM63239a2 = C25898h.m63239a(bbo2.getBestBid());
            } else {
                bigDecimalM63239a2 = null;
            }
        }
        BigDecimal bigDecimal = bigDecimalM63239a;
        BigDecimal bigDecimal2 = bigDecimalM63239a2;
        String code = symbolInfo.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        return new AvailableTradeAmountRequestContext(code, tradeType2, bigDecimal, bigDecimal2, DowngradeExKt.m66535e(symbolInfo.getBaseIncrement(), null, 1, null), DowngradeExKt.m66535e(symbolInfo.getQuoteIncrement(), null, 1, null), symbolInfo.getBaseIncrementPrecision(), symbolInfo.getQuoteIncrementPrecision());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final void m22502o(TradeSubmitVM tradeSubmitVM, AvailableTradeAmountRequestContext availableTradeAmountRequestContext, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        BigDecimal bigDecimal3;
        AvailableTradeAmountStatus availableTradeAmountStatus;
        BigDecimal bigDecimal4;
        AvailableTradeAmountStatus availableTradeAmountStatus2;
        SymbolInfoEntity symbolInfo = ((UiState) tradeSubmitVM.getState()).getSymbolInfo();
        if (symbolInfo != null) {
            BigDecimal bigDecimalM22496i = m22496i(symbolInfo);
            String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{availableTradeAmountRequestContext.m22515d(), m22498k(bigDecimal), m22498k(bigDecimal2), m22498k(bigDecimalM22496i)}), "|", null, null, 0, null, null, 62, null);
            if (Intrinsics.areEqual(tradeSubmitVM.getF20662i0(), strJoinToString$default)) {
                return;
            }
            C40879a c40879a = C40879a.f90891a;
            BigDecimal bigDecimalM89478b = c40879a.m89478b(bigDecimal, availableTradeAmountRequestContext.m22514c(), bigDecimalM22496i, availableTradeAmountRequestContext.m22512a());
            BigDecimal bigDecimalM89479c = c40879a.m89479c(bigDecimal2, availableTradeAmountRequestContext.m22518g(), availableTradeAmountRequestContext.m22516e());
            tradeSubmitVM.m22456J0(strJoinToString$default);
            if (bigDecimalM89478b == null) {
                bigDecimal3 = BigDecimal.ZERO;
            } else {
                bigDecimal3 = bigDecimalM89478b;
            }
            Intrinsics.checkNotNull(bigDecimal3);
            String baseCurrencyName = symbolInfo.getBaseCurrencyName();
            String str = "";
            if (baseCurrencyName == null) {
                baseCurrencyName = "";
            }
            if (StringsKt.isBlank(baseCurrencyName) && (baseCurrencyName = symbolInfo.getBaseCurrency()) == null) {
                baseCurrencyName = "";
            }
            int iM22513b = availableTradeAmountRequestContext.m22513b();
            if (bigDecimalM89478b == null) {
                availableTradeAmountStatus = AvailableTradeAmountStatus.INVALID;
            } else {
                availableTradeAmountStatus = AvailableTradeAmountStatus.VALID;
            }
            AvailableTradeAmountValue availableTradeAmountValue = new AvailableTradeAmountValue(bigDecimal3, baseCurrencyName, iM22513b, availableTradeAmountStatus);
            if (bigDecimalM89479c == null) {
                bigDecimal4 = BigDecimal.ZERO;
            } else {
                bigDecimal4 = bigDecimalM89479c;
            }
            Intrinsics.checkNotNull(bigDecimal4);
            String quoteCurrencyName = symbolInfo.getQuoteCurrencyName();
            if (quoteCurrencyName == null) {
                quoteCurrencyName = "";
            }
            if (StringsKt.isBlank(quoteCurrencyName)) {
                String quoteCurrency = symbolInfo.getQuoteCurrency();
                if (quoteCurrency != null) {
                    str = quoteCurrency;
                }
                quoteCurrencyName = str;
            }
            int iM22517f = availableTradeAmountRequestContext.m22517f();
            if (bigDecimalM89479c == null) {
                availableTradeAmountStatus2 = AvailableTradeAmountStatus.INVALID;
            } else {
                availableTradeAmountStatus2 = AvailableTradeAmountStatus.VALID;
            }
            tradeSubmitVM.m22463R0(new AvailableTradeAmountState(availableTradeAmountValue, new AvailableTradeAmountValue(bigDecimal4, quoteCurrencyName, iM22517f, availableTradeAmountStatus2)));
        }
    }
}
