package com.kubi.kumex.record;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.futures.dialog.TIF;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.logic.calculator.Calculator;
import com.kubi.kumex.utils.C17033a;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import fm.C37567b;
import fm.C37568c;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import ki.C41050b;
import ki.InterfaceC41049a;
import li.C42226a;
import li.C42227b;
import li.C42230e;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.record.e0 */
/* JADX INFO: compiled from: OrderObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\f\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u0002\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004\u001a$\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a6\u0010\u0014\u001a\u00020\u0006*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\t\u001a \u0010\u0019\u001a\u0004\u0018\u00010\u0010*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002\u001a\n\u0010\u001b\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u001e"}, m90084d2 = {"getReduceOnlyHiddenPostOnlyText", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "context", "Landroid/content/Context;", "split", "", "side", "isOneWayClose", "", "getTpSlTypeLabel", "getProfitAndLoss", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getTriggerStopPrice", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "precision", "", "getPriceText", "formatQty", "qtyUnitStrategy", "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;", "qty", "useDelegationPrice", "getDealPrice", "defaultPrice", "getTsoActivePriceStr", "getConditionText", "getDealPriceText", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderObjects.kt\ncom/kubi/kumex/record/OrderObjectsKt\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n*L\n1#1,671:1\n55#2:672\n55#2:673\n89#2,4:674\n*S KotlinDebug\n*F\n+ 1 OrderObjects.kt\ncom/kubi/kumex/record/OrderObjectsKt\n*L\n187#1:672\n213#1:673\n402#1:674,4\n*E\n"})
public final class C16700e0 {
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final CharSequence m35727g(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        BigDecimal bigDecimalM66656p = C27039d.m66656p(orderEntity.getTriggerStopUpPrice());
        BigDecimal bigDecimalM66656p2 = C27039d.m66656p(orderEntity.getTriggerStopDownPrice());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Integer numValueOf = null;
        if (C17054k0.m36528b(bigDecimalM66656p, bigDecimal) && C17054k0.m36528b(bigDecimalM66656p2, bigDecimal)) {
            return null;
        }
        C27096v0 c27096v0 = new C27096v0();
        if (Intrinsics.areEqual(orderEntity.getStopPriceType(), "TP")) {
            if (contractEntity != null) {
                numValueOf = Integer.valueOf(C37567b.m84618h(contractEntity));
            }
        } else if (contractEntity != null) {
            numValueOf = Integer.valueOf(C37567b.m84612b(contractEntity));
        }
        int iM66650j = C27039d.m66650j(numValueOf);
        if (Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
            if (C17054k0.m36528b(bigDecimalM66656p, bigDecimal)) {
                C27017c c27017c = C27017c.f54310a;
                c27096v0.m66903c(c27017c.m66516f(R$string.stub, new Object[0]), new ForegroundColorSpan(c27017c.m66512a(R$color.emphasis60)));
            } else {
                c27096v0.m66903c(m35731k(bigDecimalM66656p, contractEntity, iM66650j), new ForegroundColorSpan(C22890g.m54291p(context)));
            }
        } else if (C17054k0.m36528b(bigDecimalM66656p2, bigDecimal)) {
            C27017c c27017c2 = C27017c.f54310a;
            c27096v0.m66903c(c27017c2.m66516f(R$string.stub, new Object[0]), new ForegroundColorSpan(c27017c2.m66512a(R$color.emphasis60)));
        } else {
            c27096v0.m66903c(m35731k(bigDecimalM66656p2, contractEntity, iM66650j), new ForegroundColorSpan(C22890g.m54291p(context)));
        }
        C27017c c27017c3 = C27017c.f54310a;
        c27096v0.m66903c(" / ", new ForegroundColorSpan(c27017c3.m66512a(R$color.emphasis40)));
        if (Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
            if (C17054k0.m36528b(bigDecimalM66656p2, bigDecimal)) {
                c27096v0.m66903c(c27017c3.m66516f(R$string.stub, new Object[0]), new ForegroundColorSpan(c27017c3.m66512a(R$color.emphasis60)));
                return c27096v0;
            }
            c27096v0.m66903c(m35731k(bigDecimalM66656p2, contractEntity, iM66650j), new ForegroundColorSpan(C22890g.m54289n(context)));
            return c27096v0;
        }
        if (C17054k0.m36528b(bigDecimalM66656p, bigDecimal)) {
            c27096v0.m66903c(c27017c3.m66516f(R$string.stub, new Object[0]), new ForegroundColorSpan(c27017c3.m66512a(R$color.emphasis60)));
            return c27096v0;
        }
        c27096v0.m66903c(m35731k(bigDecimalM66656p, contractEntity, iM66650j), new ForegroundColorSpan(C22890g.m54289n(context)));
        return c27096v0;
    }

    /* JADX INFO: renamed from: k */
    public static final String m35731k(BigDecimal bigDecimal, ContractEntity contractEntity, int i11) {
        BigDecimal bigDecimalM11724a;
        String plainString = null;
        if (contractEntity != null) {
            return C27041f.m66669i(bigDecimal != null ? C42180b.m92640e(bigDecimal, null, i11, true, false, true, 0, null, 105, null) : null, C37569d.m84684y());
        }
        if (bigDecimal != null && (bigDecimalM11724a = C6447a.m11724a(bigDecimal)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        return C27041f.m66669i(plainString, C37569d.m84684y());
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m35721a(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity, @Nullable InterfaceC41049a interfaceC41049a, @Nullable BigDecimal bigDecimal, boolean z11) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (bigDecimal == null) {
            bigDecimal = orderEntity.getSize();
        }
        BigDecimal bigDecimalAbs = bigDecimal != null ? bigDecimal.abs() : null;
        if (bigDecimalAbs == null) {
            return C37569d.m84684y();
        }
        if (bigDecimalAbs.compareTo(BigDecimal.ZERO) == 0) {
            return "0";
        }
        if (contractEntity == null) {
            return C42180b.m92640e(bigDecimalAbs, null, 0, false, false, false, 0, null, 125, null);
        }
        if (interfaceC41049a == null) {
            interfaceC41049a = C41050b.f91264a.m90019b(contractEntity);
        }
        InterfaceC38213a interfaceC38213aM84629s = C37567b.m84629s(contractEntity);
        if (C37568c.m84636g(orderEntity) || C37568c.m84635f(orderEntity) || C37568c.m84640k(orderEntity) || C37568c.m84633d(orderEntity)) {
            return interfaceC41049a.mo90008b(interfaceC38213aM84629s, z11 ? orderEntity.getPrice() : m35724d(orderEntity, contractEntity, orderEntity.getPrice()), bigDecimalAbs, null).toString();
        }
        if (C37568c.m84637h(orderEntity)) {
            return interfaceC41049a.mo90008b(interfaceC38213aM84629s, Calculator.a.isolated().b(contractEntity.isInverse(), C27039d.m66656p(contractEntity.getMultiplier()), C27039d.m66656p(orderEntity.getDealValue()), C27039d.m66656p(orderEntity.getDealSize()), C27039d.m66656p(contractEntity.getMaxPrice())), bigDecimalAbs, null).toString();
        }
        if (C37568c.m84641l(orderEntity)) {
            return interfaceC41049a.mo90008b(interfaceC38213aM84629s, m35724d(orderEntity, contractEntity, orderEntity.getStopPrice()), bigDecimalAbs, null).toString();
        }
        if (C37568c.m84646q(orderEntity)) {
            return interfaceC41049a.mo90008b(interfaceC38213aM84629s, C41014a.m89917B(orderEntity.getPrice()) ? m35724d(orderEntity, contractEntity, orderEntity.getActivationPrice()) : orderEntity.getPrice(), bigDecimalAbs, null).toString();
        }
        if (!C37568c.m84647r(orderEntity)) {
            return interfaceC41049a.mo90008b(interfaceC38213aM84629s, null, bigDecimalAbs, null).toString();
        }
        if ((interfaceC41049a instanceof C42230e) || (interfaceC41049a instanceof C42226a)) {
            interfaceC41049a = new C42227b();
        }
        return interfaceC41049a.mo90008b(interfaceC38213aM84629s, null, bigDecimalAbs, null).toString();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35722b(OrderEntity orderEntity, ContractEntity contractEntity, InterfaceC41049a interfaceC41049a, BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC41049a = null;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return m35721a(orderEntity, contractEntity, interfaceC41049a, bigDecimal, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m35723c(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity) {
        String strM66516f;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (TextUtils.isEmpty(orderEntity.getStop())) {
            return null;
        }
        String strM93906g = C42828b.m93906g(C37568c.m84631b(orderEntity, contractEntity), C17033a.m36493a(StringsKt.equals(orderEntity.getStop(), "up", true)), false, false, 6, null);
        String stopPriceType = orderEntity.getStopPriceType();
        if (Intrinsics.areEqual(stopPriceType, "MP")) {
            strM66516f = C27017c.f54310a.m66516f(R$string.mark_price, new Object[0]);
        } else {
            strM66516f = Intrinsics.areEqual(stopPriceType, "IP") ? C27017c.f54310a.m66516f(R$string.index_price, new Object[0]) : C27017c.f54310a.m66516f(R$string.last_price, new Object[0]);
        }
        return C42828b.m93906g(strM93906g, strM66516f, false, false, 6, null);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m35725e(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity) {
        Boolean boolValueOf;
        BigDecimal bigDecimalDivide;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (C41014a.m89922G(orderEntity.getDealSize(), null, 1, null).doubleValue() <= 0.0d) {
            return null;
        }
        if (contractEntity != null) {
            try {
                boolValueOf = Boolean.valueOf(contractEntity.isInverse());
            } catch (Exception e11) {
                C37214b.m83255a(e11, "DelegationRecordAdapter-getDealPriceText");
                return null;
            }
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66567e(boolValueOf, true)) {
            bigDecimalDivide = C41014a.m89922G(orderEntity.getDealSize(), null, 1, null).divide(C41014a.m89922G(orderEntity.getDealValue(), null, 1, null), C27039d.m66650j(contractEntity != null ? Integer.valueOf(C37567b.m84618h(contractEntity)) : null), RoundingMode.HALF_UP);
        } else {
            BigDecimal bigDecimalM89922G = C41014a.m89922G(orderEntity.getDealValue(), null, 1, null);
            BigDecimal bigDecimalMultiply = C41014a.m89922G(orderEntity.getDealSize(), null, 1, null).multiply(C41014a.m89921F(contractEntity != null ? contractEntity.getMultiplier() : null, "1"));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimalDivide = bigDecimalM89922G.divide(bigDecimalMultiply, C27039d.m66650j(contractEntity != null ? Integer.valueOf(C37567b.m84618h(contractEntity)) : null), RoundingMode.HALF_UP);
        }
        BigDecimal bigDecimal = bigDecimalDivide;
        Intrinsics.checkNotNull(bigDecimal);
        return C42180b.m92640e(bigDecimal, null, C27039d.m66650j(contractEntity != null ? Integer.valueOf(C37567b.m84618h(contractEntity)) : null), true, false, true, 0, null, 105, null);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final CharSequence m35726f(@NotNull OrderEntity orderEntity, @Nullable ContractEntity contractEntity) {
        BigDecimal bigDecimalM11724a;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (Intrinsics.areEqual(orderEntity.getType(), "market")) {
            return C27017c.f54310a.m66516f(R$string.market_price, new Object[0]);
        }
        String plainString = null;
        if (contractEntity != null) {
            BigDecimal price = orderEntity.getPrice();
            return C27041f.m66669i(price != null ? C42180b.m92640e(price, null, C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntity))), true, false, true, 0, null, 105, null) : null, C37569d.m84684y());
        }
        BigDecimal price2 = orderEntity.getPrice();
        if (price2 != null && (bigDecimalM11724a = C6447a.m11724a(price2)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        return C27041f.m66669i(plainString, C37569d.m84684y());
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final CharSequence m35728h(@NotNull OrderEntity orderEntity, @NotNull Context context, @NotNull String split) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(split, "split");
        StringBuilder sb2 = new StringBuilder();
        if (!C27025c.m66566d(orderEntity.getFromReduce()) && C27025c.m66566d(orderEntity.getCloseOnly())) {
            sb2.append(context.getString(R$string.only_reduce_position));
        }
        if (C27025c.m66566d(orderEntity.getPostOnly())) {
            if (sb2.length() > 0) {
                sb2.append(split);
            }
            sb2.append(context.getString(R$string.passive_delegation));
        }
        String timeInForce = orderEntity.getTimeInForce();
        if (timeInForce != null && !StringsKt.isBlank(timeInForce) && !Intrinsics.areEqual(orderEntity.getTimeInForce(), TIF.PostOnly.getTifForBackendRequest())) {
            if (sb2.length() > 0) {
                sb2.append(split);
            }
            sb2.append(orderEntity.getTimeInForce());
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m35729i(OrderEntity orderEntity, Context context, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = " | ";
        }
        return m35728h(orderEntity, context, str);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final String m35730j(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (BrokerConfig.f19211a.m20201d().mo4515x() != MultiBizType.UNIFIED || !m35733m(orderEntity)) {
            return null;
        }
        if (!C37568c.m84640k(orderEntity) && !C37568c.m84641l(orderEntity)) {
            return null;
        }
        String side = orderEntity.getSide();
        boolean z11 = side != null && StringsKt.equals(side, "buy", true);
        String stop = orderEntity.getStop();
        boolean z12 = stop != null && StringsKt.equals(stop, "up", true);
        if (!z11 && z12) {
            return C27017c.f54310a.m66516f(R$string.stop_profit, new Object[0]);
        }
        if (!z11 && !z12) {
            return C27017c.f54310a.m66516f(R$string.stop_loss, new Object[0]);
        }
        if (z11 && !z12) {
            return C27017c.f54310a.m66516f(R$string.stop_profit, new Object[0]);
        }
        if (z11 && z12) {
            return C27017c.f54310a.m66516f(R$string.stop_loss, new Object[0]);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final CharSequence m35732l(@NotNull OrderEntity orderEntity) {
        String strM92640e;
        String strM66669i;
        String strM93906g;
        BigDecimal bigDecimalM11724a;
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        boolean zAreEqual = Intrinsics.areEqual(orderEntity.getAdvancedStatus(), "OPEN");
        String strM66516f = "--";
        if (zAreEqual && orderEntity.getActivationPrice() == null) {
            strM93906g = C27017c.f54310a.m66516f(R$string.market_price, new Object[0]);
        } else {
            String plainString = null;
            if (C37568c.m84630a(orderEntity) == null) {
                BigDecimal activationPrice = orderEntity.getActivationPrice();
                if (activationPrice != null && (bigDecimalM11724a = C6447a.m11724a(activationPrice)) != null) {
                    plainString = bigDecimalM11724a.toPlainString();
                }
                strM66669i = C27041f.m66669i(plainString, "--");
            } else {
                Integer numValueOf = null;
                BigDecimal activationPrice2 = orderEntity.getActivationPrice();
                if (activationPrice2 != null) {
                    ContractEntity contractEntityM84630a = C37568c.m84630a(orderEntity);
                    if (contractEntityM84630a != null) {
                        numValueOf = Integer.valueOf(C37567b.m84618h(contractEntityM84630a));
                    }
                    strM92640e = C42180b.m92640e(activationPrice2, null, C27039d.m66650j(numValueOf), true, false, true, 0, null, 105, null);
                } else {
                    strM92640e = null;
                }
                strM66669i = C27041f.m66669i(strM92640e, "--");
            }
            strM93906g = C42828b.m93906g(strM66669i, (!zAreEqual || TextUtils.isEmpty(orderEntity.getStop())) ? "" : C17033a.m36493a(StringsKt.equals(orderEntity.getStop(), "up", true)), false, zAreEqual && !TextUtils.isEmpty(orderEntity.getStop()), 2, null);
        }
        C27017c c27017c = C27017c.f54310a;
        int iM66512a = c27017c.m66512a(R$color.c_text40);
        if (!TextUtils.isEmpty(orderEntity.getAdvancedStatus())) {
            strM66516f = c27017c.m66516f(zAreEqual ? R$string.kumex_tso_order_unactive : R$string.kumex_tso_order_actived, new Object[0]);
        }
        C27096v0 c27096v0M66905e = new C27096v0().append(C42828b.m93915p(strM93906g)).m66905e(" | ", iM66512a);
        if (!zAreEqual) {
            iM66512a = c27017c.m66512a(R$color.c_text);
        }
        C27096v0 c27096v0M66905e2 = c27096v0M66905e.m66905e(strM66516f, iM66512a);
        Intrinsics.checkNotNullExpressionValue(c27096v0M66905e2, "appendForeground(...)");
        return c27096v0M66905e2;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m35733m(@NotNull OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        if (Intrinsics.areEqual(orderEntity.getPositionSide(), "BOTH") || orderEntity.getPositionSide() == null) {
            return C27025c.m66566d(orderEntity.getCloseOrder()) || C27025c.m66566d(orderEntity.getCloseOnly());
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m35734n(@NotNull OrderEntity orderEntity, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(orderEntity, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(orderEntity.getSide(), "buy")) {
            if (Intrinsics.areEqual(orderEntity.getPositionSide(), SharedPositionInfo.SIDE_LONG)) {
                String string = context.getString(R$string.kumex_hedge_long);
                Intrinsics.checkNotNull(string);
                return string;
            }
            if (Intrinsics.areEqual(orderEntity.getPositionSide(), SharedPositionInfo.SIDE_SHORT)) {
                String string2 = context.getString(R$string.kumex_hedge_close_short);
                Intrinsics.checkNotNull(string2);
                return string2;
            }
            String string3 = context.getString(R$string.contract_long);
            Intrinsics.checkNotNull(string3);
            return string3;
        }
        if (Intrinsics.areEqual(orderEntity.getPositionSide(), SharedPositionInfo.SIDE_LONG)) {
            String string4 = context.getString(R$string.kumex_hedge_close_long);
            Intrinsics.checkNotNull(string4);
            return string4;
        }
        if (Intrinsics.areEqual(orderEntity.getPositionSide(), SharedPositionInfo.SIDE_SHORT)) {
            String string5 = context.getString(R$string.kumex_hedge_short);
            Intrinsics.checkNotNull(string5);
            return string5;
        }
        String string6 = context.getString(R$string.contract_short);
        Intrinsics.checkNotNull(string6);
        return string6;
    }

    /* JADX INFO: renamed from: d */
    public static final BigDecimal m35724d(OrderEntity orderEntity, ContractEntity contractEntity, BigDecimal bigDecimal) {
        BigDecimal bigDecimalM66656p = C27039d.m66656p(orderEntity.getDealSize());
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalM66656p.compareTo(bigDecimal2) > 0 && C27039d.m66656p(orderEntity.getDealValue()).compareTo(bigDecimal2) > 0) {
            BigDecimal bigDecimalB = Calculator.a.isolated().b(contractEntity.isInverse(), C27039d.m66656p(contractEntity.getMultiplier()), C27039d.m66656p(orderEntity.getDealValue()), C27039d.m66656p(orderEntity.getDealSize()), C27039d.m66656p(contractEntity.getMaxPrice()));
            if (bigDecimalB.compareTo(bigDecimal2) != 0) {
                return bigDecimalB;
            }
        }
        return bigDecimal;
    }
}
