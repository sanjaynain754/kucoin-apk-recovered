package com.kubi.kumex.record.done.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.record.C16700e0;
import com.kubi.kumex.record.done.adapter.TwapDelegateRecordAdapter;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.resources.C22890g;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33954u6;
import fm.C37567b;
import fm.C37568c;
import fm.C37569d;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.util.MultiTypeDelegate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import ki.C41050b;
import ki.InterfaceC41049a;
import li.C42227b;
import li.C42230e;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p832zh.C46855g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import t30.C44681a;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "records", "", "<init>", "(Ljava/util/List;)V", "convert", "", "helper", "item", "bindRecord", C33954u6.f72238i, "orderEntity", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "getAvgPriceText", "", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "order", "getStatusText", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTwapDelegateRecordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwapDelegateRecordAdapter.kt\ncom/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n*L\n1#1,201:1\n55#2:202\n55#2:203\n*S KotlinDebug\n*F\n+ 1 TwapDelegateRecordAdapter.kt\ncom/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter\n*L\n97#1:202\n102#1:203\n*E\n"})
public final class TwapDelegateRecordAdapter extends BaseQuickAdapter<DelegateRecordItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Companion f30185i = new Companion(null);

    /* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter$Companion;", "", "<init>", "()V", "ORDER", "", "EMPTY", "NO_MORE", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.done.adapter.TwapDelegateRecordAdapter$a */
    /* JADX INFO: compiled from: TwapDelegateRecordAdapter.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/record/done/adapter/TwapDelegateRecordAdapter$1", "Lio/chad/library/adapter/base/util/MultiTypeDelegate;", "Lcom/kubi/kumex/record/done/adapter/DelegateRecordItem;", "getItemType", "", "item", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16672a extends MultiTypeDelegate<DelegateRecordItem> {
        @Override // io.chad.library.adapter.base.util.MultiTypeDelegate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int getItemType(DelegateRecordItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof DelegateRecordItem.TwapOrderInfo) {
                return 1;
            }
            if (item instanceof DelegateRecordItem.a) {
                return 2;
            }
            if (item instanceof DelegateRecordItem.b) {
                return 3;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: l */
    public final CharSequence m35697l(OrderEntity orderEntity) {
        Object objM103844constructorimpl;
        String strM66516f;
        BigDecimal bigDecimalDivide;
        try {
            Result.Companion companion = Result.INSTANCE;
            BigDecimal dealSize = orderEntity.getDealSize();
            objM103844constructorimpl = Result.m103844constructorimpl((dealSize == null || (bigDecimalDivide = dealSize.divide(orderEntity.getSize(), 4, RoundingMode.DOWN)) == null) ? null : C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 63, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        String strM66669i = C27041f.m66669i((String) obj, C42180b.m92642g(ZERO, null, null, 0, false, false, false, 63, null));
        StringBuilder sb2 = new StringBuilder();
        if (Intrinsics.areEqual(orderEntity.getStatus(), OrderDetailInfo.ORDER_STATUS_CANCELED)) {
            strM66516f = C27017c.f54310a.m66516f(R$string.canceled, new Object[0]);
        } else {
            strM66516f = Intrinsics.areEqual(orderEntity.getStatus(), "DONE") ? C27017c.f54310a.m66516f(R$string.completed, new Object[0]) : "";
        }
        sb2.append(strM66516f);
        sb2.append(" (");
        sb2.append(C42828b.m93915p(strM66669i));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwapDelegateRecordAdapter(@NotNull List<? extends DelegateRecordItem> records) {
        super(records);
        Intrinsics.checkNotNullParameter(records, "records");
        C16672a c16672a = new C16672a();
        c16672a.registerItemType(1, R$layout.bkumex_item_delegate_record_twap);
        c16672a.registerItemType(2, R$layout.view_empty);
        c16672a.registerItemType(3, R$layout.view_end);
        setMultiTypeDelegate(c16672a);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m35693i(OrderEntity orderEntity) {
        Router.f46192a.m56184f("futures/history/delegation/twapDetails").m4038a("orderId", C27041f.m66668h(orderEntity.getId())).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final void m35694h(BaseViewHolder baseViewHolder, final OrderEntity orderEntity) {
        String strM84684y;
        String strM84684y2;
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: rm.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TwapDelegateRecordAdapter.m35693i(orderEntity);
            }
        }, 1, null);
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(orderEntity.getSymbol()), false, 2, null);
        if (contractEntityM99529O == null) {
            return;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) baseViewHolder.itemView.findViewById(R$id.side);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setText(C16700e0.m35734n(orderEntity, context));
        Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView.setTextColor(C22890g.m54281f(context2, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) baseViewHolder.itemView.findViewById(R$id.close);
        Intrinsics.checkNotNull(appCompatTextView2);
        C27046k.m66684G(appCompatTextView2, C16700e0.m35733m(orderEntity));
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(R$string.kumex_close_position_brief));
        Context context3 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView2.setTextColor(C22890g.m54281f(context3, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) baseViewHolder.itemView.findViewById(R$id.reduceOnlyAndHidden);
        Context context4 = appCompatTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        CharSequence charSequenceM35729i = C16700e0.m35729i(orderEntity, context4, null, 2, null);
        if (charSequenceM35729i.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView3);
            C27046k.m66684G(appCompatTextView3, false);
        } else {
            Intrinsics.checkNotNull(appCompatTextView3);
            C27046k.m66684G(appCompatTextView3, true);
            appCompatTextView3.setText(charSequenceM35729i);
        }
        ((AppCompatTextView) baseViewHolder.itemView.findViewById(R$id.marginMode)).setText(C37568c.m84634e(orderEntity) ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]));
        if (C37568c.m84634e(orderEntity)) {
            baseViewHolder.setGone(R$id.leverage, false);
        } else {
            baseViewHolder.setGone(R$id.leverage, true);
        }
        baseViewHolder.setText(R$id.leverage, C17054k0.m36530d(orderEntity.getLeverage(), false, 1, null));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.symbol)).setText(C27041f.m66667g(FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O), C27041f.m66668h(orderEntity.getSymbol())));
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) baseViewHolder.itemView.findViewById(R$id.time);
        Long createdAt = orderEntity.getCreatedAt();
        appCompatTextView4.setText(C27041f.m66668h(createdAt != null ? C44681a.m98835b(createdAt.longValue(), null, false, false, null, 15, null) : null));
        ((TextView) baseViewHolder.itemView.findViewById(R$id.status)).setText(m35697l(orderEntity));
        View viewFindViewById = baseViewHolder.itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66684G(viewFindViewById, orderEntity.isTrialFunds());
        InterfaceC41049a interfaceC41049aM90019b = C41050b.f91264a.m90019b(contractEntityM99529O);
        if (interfaceC41049aM90019b instanceof C42230e) {
            interfaceC41049aM90019b = new C42227b();
        }
        String strMo90014h = interfaceC41049aM90019b.mo90014h(C37567b.m84629s(contractEntityM99529O));
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(R$id.amount);
        C27017c c27017c = C27017c.f54310a;
        textView.setText(c27017c.m66516f(R$string.bkumex_order_delegate_total_qty_stub, strMo90014h));
        baseViewHolder.setText(R$id.amountValue, C16700e0.m35722b(orderEntity, contractEntityM99529O, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getSize(), null, 1, null), false, 8, null));
        TextView textView2 = (TextView) baseViewHolder.itemView.findViewById(R$id.dealAmount);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c27017c.m66516f(R$string.dealed, new Object[0]));
        sb2.append("(");
        sb2.append(strMo90014h);
        sb2.append(")");
        textView2.setText(sb2);
        baseViewHolder.setText(R$id.dealAmountValue, C16700e0.m35722b(orderEntity, contractEntityM99529O, interfaceC41049aM90019b, C41014a.m89922G(orderEntity.getDealSize(), null, 1, null), false, 8, null));
        baseViewHolder.setText(R$id.avgPriceValue, m35696k(contractEntityM99529O, orderEntity));
        int i11 = R$id.totalDurationValue;
        Long twapDurationSec = orderEntity.getTwapDurationSec();
        if (twapDurationSec == null || (strM84684y = C46855g.m103205f(twapDurationSec.longValue())) == null) {
            strM84684y = C37569d.m84684y();
        }
        baseViewHolder.setText(i11, strM84684y);
        int i12 = R$id.usedDurationValue;
        Long twapUsedDurationSec = orderEntity.getTwapUsedDurationSec();
        if (twapUsedDurationSec == null || (strM84684y2 = C46855g.m103205f(twapUsedDurationSec.longValue())) == null) {
            strM84684y2 = C37569d.m84684y();
        }
        baseViewHolder.setText(i12, strM84684y2);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @Nullable DelegateRecordItem delegateRecordItem) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        int itemViewType = helper.getItemViewType();
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            helper.setText(R$id.empty_tips, R$string.no_more_data);
        } else {
            DelegateRecordItem.TwapOrderInfo twapOrderInfo = delegateRecordItem instanceof DelegateRecordItem.TwapOrderInfo ? (DelegateRecordItem.TwapOrderInfo) delegateRecordItem : null;
            if (twapOrderInfo != null) {
                m35694h(helper, twapOrderInfo.getOrderEntity());
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final CharSequence m35696k(@Nullable ContractEntity contractEntity, @NotNull OrderEntity order) {
        BigDecimal bigDecimalM11724a;
        Intrinsics.checkNotNullParameter(order, "order");
        String plainString = null;
        if (contractEntity != null) {
            BigDecimal avgDealPrice = order.getAvgDealPrice();
            return C27041f.m66669i(avgDealPrice != null ? C42180b.m92640e(avgDealPrice, null, C27039d.m66650j(Integer.valueOf(C37567b.m84618h(contractEntity))), true, false, true, 0, null, 105, null) : null, C37569d.m84684y());
        }
        BigDecimal avgDealPrice2 = order.getAvgDealPrice();
        if (avgDealPrice2 != null && (bigDecimalM11724a = C6447a.m11724a(avgDealPrice2)) != null) {
            plainString = bigDecimalM11724a.toPlainString();
        }
        return C27041f.m66669i(plainString, C37569d.m84684y());
    }
}
