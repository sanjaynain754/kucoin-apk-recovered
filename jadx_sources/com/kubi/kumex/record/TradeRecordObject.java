package com.kubi.kumex.record;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.TradeRecordEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import ki.C41050b;
import ki.InterfaceC41049a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t30.C44681a;
import th.InterfaceC44980d;

/* JADX INFO: renamed from: com.kubi.kumex.record.u1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010,\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010-\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0011\u0010!\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013R\u0011\u0010#\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0013\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013R\u0013\u0010'\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0013R\u0011\u0010)\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0013R\u0011\u0010+\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0013¨\u0006."}, m90084d2 = {"Lcom/kubi/kumex/record/TradeRecordObject;", "", "record", "Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "<init>", "(Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;)V", "getRecord", "()Lcom/kubi/kumex/data/assets/model/TradeRecordEntity;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "symbolText", "", "getSymbolText", "()Ljava/lang/CharSequence;", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "side", "getSide", "marginMode", "getMarginMode", "timeText", "getTimeText", "amount", "getAmount", "dealValueCurrency", "value", "getValue", "fee", "getFee", "feeWithCurrency", "getFeeWithCurrency", "settleCurrency", "getSettleCurrency", "realisedPnl", "getRealisedPnl", "liquidityRole", "getLiquidityRole", FirebaseAnalytics.Param.TAX, "getTax", FirebaseAnalytics.Param.PRICE, "getPrice", "getType", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/TradeRecordObject\n+ 2 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,1120:1\n28#2:1121\n20#2:1122\n28#2:1123\n20#2:1124\n28#2:1125\n20#2:1126\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/TradeRecordObject\n*L\n988#1:1121\n988#1:1122\n1002#1:1123\n1002#1:1124\n1019#1:1125\n1019#1:1126\n*E\n"})
public final class TradeRecordObject {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeRecordEntity f30344a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final ContractEntity f30345b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CharSequence f30346c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f30347d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f30348e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f30349f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final String f30350g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f30351h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f30352i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f30353j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final String f30354k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f30355l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final String f30356m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public final String f30357n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final String f30358o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final String f30359p;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: p */
    public final CharSequence m35840p() {
        String lowerCase;
        String fillType = this.f30344a.getFillType();
        String lowerCase2 = null;
        if (fillType != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = fillType.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1367724422:
                    if (lowerCase.equals("cancel")) {
                        return C27017c.f54310a.m66516f(R$string.canceled, new Object[0]);
                    }
                    break;
                case -1102567108:
                    if (lowerCase.equals("liquid")) {
                        return C27017c.f54310a.m66516f(R$string.force_close_position, new Object[0]);
                    }
                    break;
                case 96425:
                    if (lowerCase.equals("adl")) {
                        return C27017c.f54310a.m66516f(R$string.auto_reduce_position, new Object[0]);
                    }
                    break;
                case 73828649:
                    if (lowerCase.equals("settlement")) {
                        return C27017c.f54310a.m66516f(R$string.settlement, new Object[0]);
                    }
                    break;
                case 110621028:
                    if (lowerCase.equals("trade")) {
                        String displayType = this.f30344a.getDisplayType();
                        if (displayType != null) {
                            Locale ENGLISH2 = Locale.ENGLISH;
                            Intrinsics.checkNotNullExpressionValue(ENGLISH2, "ENGLISH");
                            lowerCase2 = displayType.toLowerCase(ENGLISH2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        }
                        if (lowerCase2 != null) {
                            switch (lowerCase2.hashCode()) {
                                case -1749118458:
                                    if (lowerCase2.equals("limit_stop")) {
                                        return C27017c.f54310a.m66516f(R$string.condition_price, new Object[0]);
                                    }
                                    break;
                                case -1247980987:
                                    if (lowerCase2.equals("trailing_stop")) {
                                        return C27017c.f54310a.m66516f(R$string.kumex_tso_order, new Object[0]);
                                    }
                                    break;
                                case -1217487446:
                                    if (lowerCase2.equals(ViewProps.HIDDEN)) {
                                        return C27017c.f54310a.m66516f(R$string.kumex_order_hidden, new Object[0]);
                                    }
                                    break;
                                case -1102567108:
                                    if (lowerCase2.equals("liquid")) {
                                        return C27017c.f54310a.m66516f(R$string.force_close_position, new Object[0]);
                                    }
                                    break;
                                case -1081306052:
                                    if (lowerCase2.equals("market")) {
                                        return C27017c.f54310a.m66516f(R$string.market_price, new Object[0]);
                                    }
                                    break;
                                case 96425:
                                    if (lowerCase2.equals("adl")) {
                                        return C27017c.f54310a.m66516f(R$string.auto_reduce_position, new Object[0]);
                                    }
                                    break;
                                case 73828649:
                                    if (lowerCase2.equals("settlement")) {
                                        return C27017c.f54310a.m66516f(R$string.settlement, new Object[0]);
                                    }
                                    break;
                                case 102976443:
                                    if (lowerCase2.equals(TUIConstants.TUIContact.LIMIT)) {
                                        return C27017c.f54310a.m66516f(R$string.limit_price, new Object[0]);
                                    }
                                    break;
                                case 285438501:
                                    if (lowerCase2.equals("market_stop")) {
                                        return C27017c.f54310a.m66516f(R$string.market_stop, new Object[0]);
                                    }
                                    break;
                                case 713937635:
                                    if (lowerCase2.equals("reconciliation")) {
                                        return C27017c.f54310a.m66516f(R$string.kumex_liquidation_reconciliation, new Object[0]);
                                    }
                                    break;
                                case 1389163870:
                                    if (lowerCase2.equals("advanced_limit")) {
                                        return C27017c.f54310a.m66516f(R$string.kumex_order_limit_advanced, new Object[0]);
                                    }
                                    break;
                            }
                        }
                        return C27017c.f54310a.m66516f(R$string.other, new Object[0]);
                    }
                    break;
                case 713937635:
                    if (lowerCase.equals("reconciliation")) {
                        return C27017c.f54310a.m66516f(R$string.kumex_liquidation_reconciliation, new Object[0]);
                    }
                    break;
            }
        }
        return C27017c.f54310a.m66516f(R$string.other, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x015a  */
    /* JADX WARN: Code duplicated, block: B:81:0x020c  */
    /* JADX WARN: Code duplicated, block: B:99:0x029b  */
    public TradeRecordObject(@NotNull TradeRecordEntity record) {
        String strM92640e;
        String strM92640e2;
        String strM93906g;
        String lowerCase;
        PropertyEntity properties;
        String strM93902c;
        PropertyEntity properties2;
        PropertyEntity properties3;
        Intrinsics.checkNotNullParameter(record, "record");
        this.f30344a = record;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        String strM92640e3 = null;
        shortDisplayPrecision = null;
        Integer shortDisplayPrecision = null;
        strM92640e3 = null;
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(repositoryServiceLocator.m20288g(), C27041f.m66668h(record.getSymbol()), false, 2, null);
        this.f30345b = contractEntityM99529O;
        this.f30346c = C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, C27041f.m66668h(record.getSymbol()));
        String type = record.getType();
        this.f30347d = type != null ? TextUtils.isEmpty(type) ? "" : (Intrinsics.areEqual(record.getType(), TUIConstants.TUIContact.LIMIT) || Intrinsics.areEqual(record.getType(), "stop_limit")) ? C27017c.f54310a.m66516f(R$string.limit_price, new Object[0]) : C27017c.f54310a.m66516f(R$string.market_price, new Object[0]) : null;
        this.f30348e = Intrinsics.areEqual(record.getSide(), "buy") ? Intrinsics.areEqual(record.getPositionSide(), SharedPositionInfo.SIDE_LONG) ? C27017c.f54310a.m66516f(R$string.kumex_hedge_long, new Object[0]) : Intrinsics.areEqual(record.getPositionSide(), SharedPositionInfo.SIDE_SHORT) ? C27017c.f54310a.m66516f(R$string.kumex_hedge_close_short, new Object[0]) : C27017c.f54310a.m66516f(R$string.contract_long, new Object[0]) : Intrinsics.areEqual(record.getPositionSide(), SharedPositionInfo.SIDE_LONG) ? C27017c.f54310a.m66516f(R$string.kumex_hedge_close_long, new Object[0]) : Intrinsics.areEqual(record.getPositionSide(), SharedPositionInfo.SIDE_SHORT) ? C27017c.f54310a.m66516f(R$string.kumex_hedge_short, new Object[0]) : C27017c.f54310a.m66516f(R$string.contract_short, new Object[0]);
        this.f30349f = Intrinsics.areEqual(record.getMarginMode(), "CROSS") ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]);
        Long createdAt = record.getCreatedAt();
        this.f30350g = C27041f.m66668h(createdAt != null ? C44681a.m98835b(createdAt.longValue(), null, false, false, null, 15, null) : null);
        String feeCurrency = record.getFeeCurrency();
        if (feeCurrency == null) {
            if (C27025c.m66566d(contractEntityM99529O != null ? Boolean.valueOf(contractEntityM99529O.isInverse()) : null)) {
                if (contractEntityM99529O != null) {
                    feeCurrency = contractEntityM99529O.getDisplayBaseCurrency();
                } else {
                    feeCurrency = null;
                }
            } else if (contractEntityM99529O != null) {
                feeCurrency = contractEntityM99529O.getQuoteCurrency();
            } else {
                feeCurrency = null;
            }
        }
        this.f30351h = feeCurrency;
        BigDecimal value = record.getValue();
        if (value != null) {
            strM92640e = C42180b.m92640e(value, RoundingMode.UP, C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84623m(contractEntityM99529O)) : null), true, true, true, 0, null, 96, null);
        } else {
            strM92640e = null;
        }
        String strM66669i = C27041f.m66669i(strM92640e, C37569d.m84684y());
        String strM66677q = feeCurrency != null ? C27041f.m66677q(feeCurrency) : null;
        this.f30352i = C42828b.m93906g(strM66669i, strM66677q == null ? "" : strM66677q, true, false, 4, null);
        BigDecimal fee = record.getFee();
        if (fee != null) {
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            BigDecimal bigDecimalNegate = ONE.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
            BigDecimal bigDecimalMultiply = fee.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            if (bigDecimalMultiply != null) {
                CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(repositoryServiceLocator.m20288g(), C27041f.m66668h(record.getFeeCurrency()), false, 2, null);
                strM92640e2 = C42180b.m92640e(bigDecimalMultiply, null, C27039d.m66650j(Integer.valueOf(C27039d.m66651k((coinEntityM99528E == null || (properties3 = coinEntityM99528E.getProperties()) == null) ? null : properties3.getShortDisplayPrecision(), 4))), true, true, true, 0, null, 97, null);
            } else {
                strM92640e2 = null;
            }
        } else {
            strM92640e2 = null;
        }
        String strM66669i2 = C27041f.m66669i(strM92640e2, C37569d.m84684y());
        this.f30353j = strM66669i2;
        this.f30354k = C42828b.m93906g(C42828b.m93902c(strM66669i2), C42180b.m92647l(C27041f.m66677q(record.getFeeCurrency())), true, false, 4, null);
        String strM66669i3 = C27041f.m66669i(record.getSettleCurrency(), C27041f.m66668h(contractEntityM99529O != null ? contractEntityM99529O.getSettleCurrency() : null));
        this.f30355l = strM66669i3;
        BigDecimal fillPnl = record.getFillPnl();
        if (fillPnl == null) {
            strM93906g = null;
        } else {
            CoinEntity coinEntityM99528E2 = InterfaceC44980d.m99528E(repositoryServiceLocator.m20288g(), C27041f.m66668h(strM66669i3), false, 2, null);
            String strM92640e4 = C42180b.m92640e(fillPnl, null, C27039d.m66651k((coinEntityM99528E2 == null || (properties2 = coinEntityM99528E2.getProperties()) == null) ? null : properties2.getShortDisplayPrecision(), 4), true, true, true, 0, null, 97, null);
            if (strM92640e4 == null || (strM93902c = C42828b.m93902c(strM92640e4)) == null) {
                strM93906g = null;
            } else {
                strM93906g = C42828b.m93906g(strM93902c, C42180b.m92647l(C27041f.m66677q(strM66669i3)), true, false, 4, null);
            }
        }
        this.f30356m = strM93906g;
        String liquidityRole = record.getLiquidityRole();
        if (liquidityRole != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            lowerCase = liquidityRole.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        this.f30357n = Intrinsics.areEqual(lowerCase, "taker") ? C27017c.f54310a.m66516f(R$string.unify_order_detail_role_taker, new Object[0]) : Intrinsics.areEqual(lowerCase, "maker") ? C27017c.f54310a.m66516f(R$string.unify_order_detail_role_maker, new Object[0]) : null;
        BigDecimal tax = record.getTax();
        if (tax != null) {
            BigDecimal ONE2 = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE2, "ONE");
            BigDecimal bigDecimalNegate2 = ONE2.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate2, "negate(...)");
            BigDecimal bigDecimalMultiply2 = tax.multiply(bigDecimalNegate2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            if (bigDecimalMultiply2 != null) {
                CoinEntity coinEntityM99528E3 = InterfaceC44980d.m99528E(repositoryServiceLocator.m20288g(), C27041f.m66668h(record.getFeeCurrency()), false, 2, null);
                if (coinEntityM99528E3 != null && (properties = coinEntityM99528E3.getProperties()) != null) {
                    shortDisplayPrecision = properties.getShortDisplayPrecision();
                }
                strM92640e3 = C42180b.m92640e(bigDecimalMultiply2, null, C27039d.m66650j(Integer.valueOf(C27039d.m66651k(shortDisplayPrecision, 4))), true, true, true, 0, null, 97, null);
            }
        }
        this.f30358o = C27041f.m66669i(strM92640e3, C37569d.m84684y());
        this.f30359p = C42828b.m93906g(m35832h(record, contractEntityM99529O), C37567b.m84619i(contractEntityM99529O), true, false, 4, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m35825a() {
        BigDecimal size = this.f30344a.getSize();
        ContractEntity contractEntity = this.f30345b;
        if (size == null) {
            return C37569d.m84684y();
        }
        if (contractEntity == null) {
            return C42180b.m92640e(size, null, 0, false, false, false, 0, null, 125, null);
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntity);
        return C42828b.m93906g(interfaceC41049aM90019b.mo90008b(interfaceC38213aM84629s, this.f30344a.getPrice(), size, null).toString(), interfaceC41049aM90019b.mo90014h(interfaceC38213aM84629s), true, false, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContractEntity getF30345b() {
        return this.f30345b;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF30353j() {
        return this.f30353j;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF30354k() {
        return this.f30354k;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getF30357n() {
        return this.f30357n;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF30349f() {
        return this.f30349f;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF30359p() {
        return this.f30359p;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF30356m() {
        return this.f30356m;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final TradeRecordEntity getF30344a() {
        return this.f30344a;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getF30348e() {
        return this.f30348e;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final CharSequence getF30346c() {
        return this.f30346c;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getF30358o() {
        return this.f30358o;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getF30350g() {
        return this.f30350g;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getF30347d() {
        return this.f30347d;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getF30352i() {
        return this.f30352i;
    }

    /* JADX INFO: renamed from: h */
    public final String m35832h(TradeRecordEntity tradeRecordEntity, ContractEntity contractEntity) {
        BigDecimal price;
        BigDecimal bigDecimalM11724a;
        if (Intrinsics.areEqual(tradeRecordEntity.getDisplayType(), "liquid")) {
            price = tradeRecordEntity.getLiquidationPrice();
        } else {
            price = tradeRecordEntity.getPrice();
        }
        BigDecimal bigDecimal = price;
        String strM92640e = null;
        if (contractEntity == null) {
            if (bigDecimal != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) != null) {
                strM92640e = bigDecimalM11724a.toPlainString();
            }
            return C27041f.m66669i(strM92640e, C37569d.m84684y());
        }
        if (bigDecimal != null) {
            strM92640e = C42180b.m92640e(bigDecimal, null, C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntity))), true, false, true, 0, null, 105, null);
        }
        return C27041f.m66669i(strM92640e, C37569d.m84684y());
    }
}
