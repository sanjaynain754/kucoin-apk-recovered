package com.kubi.kumex.record;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.utils.C17033a;
import com.kubi.kumex.utils.C17054k0;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.resources.C22890g;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import fm.C37568c;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import t30.C44681a;
import th.InterfaceC44980d;

/* JADX INFO: compiled from: OrderObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/record/DelegationRecordObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "orderEntity", "bindViewByTSOOrder", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "getOrderProgressText", "Lcom/kubi/utils/StyledText;", "order", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getStatusText", "", "getConditionText", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderObjects.kt\ncom/kubi/kumex/record/DelegationRecordObjectProxy\n+ 2 OrderEntityEx.kt\ncom/kubi/kumex/extensions/OrderEntityExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,671:1\n55#2:672\n55#2:673\n89#2,4:675\n1#3:674\n*S KotlinDebug\n*F\n+ 1 OrderObjects.kt\ncom/kubi/kumex/record/DelegationRecordObjectProxy\n*L\n467#1:672\n472#1:673\n639#1:675,4\n*E\n"})
public final class DelegationRecordObjectProxy extends ViewHolderProxy<OrderEntity> {

    @Nullable
    private final ItemCallBack<OrderEntity> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<OrderEntity> shortCall;

    private final CharSequence getStatusText(OrderEntity order) {
        Object objM103844constructorimpl;
        String strM66516f;
        BigDecimal bigDecimalDivide;
        try {
            Result.Companion companion = Result.INSTANCE;
            BigDecimal dealSize = order.getDealSize();
            objM103844constructorimpl = Result.m103844constructorimpl((dealSize == null || (bigDecimalDivide = dealSize.divide(order.getSize(), 4, RoundingMode.DOWN)) == null) ? null : C42180b.m92642g(bigDecimalDivide, null, null, 0, false, false, false, 63, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Object obj = Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        String strM66669i = C27041f.m66669i((String) obj, C42180b.m92642g(ZERO, null, null, 0, false, false, false, 63, null));
        StringBuilder sb2 = new StringBuilder();
        if (C27025c.m66566d(order.getCancelExist()) && C41014a.m89917B(order.getDealSize())) {
            strM66516f = C27017c.f54310a.m66516f(R$string.canceled, new Object[0]);
        } else if (C27025c.m66566d(order.getStopTriggered()) && C41014a.m89917B(order.getDealSize())) {
            strM66516f = C27017c.f54310a.m66516f(R$string.order_has_trigger, new Object[0]);
        } else {
            strM66516f = C17054k0.m36528b(order.getDealSize(), order.getSize()) ? C27017c.f54310a.m66516f(R$string.full_deal, new Object[0]) : C27017c.f54310a.m66516f(R$string.partial_deal, new Object[0]);
        }
        sb2.append(strM66516f);
        sb2.append('(');
        sb2.append(C42828b.m93915p(strM66669i));
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegationRecordObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<OrderEntity> itemCallBack, @Nullable ItemCallBack<OrderEntity> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    private final void bindViewByTSOOrder(RecyclerView.ViewHolder holder, OrderEntity orderEntity) {
        Context context = holder.itemView.getContext();
        if (!Intrinsics.areEqual(orderEntity.getAdvancedType(), "trailing_stop")) {
            ((TextView) holder.itemView.findViewById(R$id.price)).setText(context.getString(R$string.price));
            ((TextView) holder.itemView.findViewById(R$id.fillPrice)).setText(context.getString(R$string.deal_price));
            ((TextView) holder.itemView.findViewById(R$id.condition)).setText(context.getString(R$string.trigger_price));
            View viewFindViewById = holder.itemView.findViewById(R$id.extraLabel);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById);
            View viewFindViewById2 = holder.itemView.findViewById(R$id.extraValue);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewExtKt.m66577h(viewFindViewById2);
            return;
        }
        TextView textView = (TextView) holder.itemView.findViewById(R$id.price);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66594y(textView);
        textView.setText(context.getString(R$string.trailing_stop_trailing_delta));
        TextView textView2 = (TextView) holder.itemView.findViewById(R$id.priceValue);
        Intrinsics.checkNotNull(textView2);
        ViewExtKt.m66594y(textView2);
        BigDecimal callbackRate = orderEntity.getCallbackRate();
        textView2.setText(C42180b.m92649n(callbackRate != null ? C42180b.m92642g(callbackRate, null, null, 1, false, false, false, 59, null) : null));
        TextView textView3 = (TextView) holder.itemView.findViewById(R$id.fillPrice);
        Intrinsics.checkNotNull(textView3);
        ViewExtKt.m66594y(textView3);
        textView3.setText(context.getString(R$string.kumex_tso_activie_price));
        TextView textView4 = (TextView) holder.itemView.findViewById(R$id.fillPriceValue);
        Intrinsics.checkNotNull(textView4);
        ViewExtKt.m66594y(textView4);
        textView4.setText(C16700e0.m35732l(orderEntity));
        TextView textView5 = (TextView) holder.itemView.findViewById(R$id.condition);
        Intrinsics.checkNotNull(textView5);
        ViewExtKt.m66594y(textView5);
        textView5.setText(context.getString(R$string.kumex_tso_delegation_price));
        TextView textView6 = (TextView) holder.itemView.findViewById(R$id.conditionValue);
        Intrinsics.checkNotNull(textView6);
        ViewExtKt.m66594y(textView6);
        textView6.setText(C16700e0.m35726f(orderEntity, C37568c.m84630a(orderEntity)));
        String strM35725e = C16700e0.m35725e(orderEntity, C37568c.m84630a(orderEntity));
        TextView textView7 = (TextView) holder.itemView.findViewById(R$id.extraLabel);
        Intrinsics.checkNotNull(textView7);
        C27046k.m66684G(textView7, !(strM35725e == null || strM35725e.length() == 0));
        textView7.setText(context.getString(R$string.deal_price));
        TextView textView8 = (TextView) holder.itemView.findViewById(R$id.extraValue);
        Intrinsics.checkNotNull(textView8);
        C27046k.m66684G(textView8, !(strM35725e == null || strM35725e.length() == 0));
        textView8.setText(C27041f.m66669i(strM35725e, "--"));
    }

    private final C27096v0 getOrderProgressText(OrderEntity orderEntity, ContractEntity contractEntity) {
        C27096v0 c27096v0 = new C27096v0();
        if (C27025c.m66566d(orderEntity.getShortcut())) {
            c27096v0.append(C27017c.f54310a.m66516f(R$string.kumex_tpsl_all_position, new Object[0]));
            return c27096v0;
        }
        if (C37568c.m84640k(orderEntity) || C37568c.m84641l(orderEntity)) {
            c27096v0.append(C16700e0.m35722b(orderEntity, contractEntity, null, null, false, 14, null));
            return c27096v0;
        }
        c27096v0.append(C16700e0.m35722b(orderEntity, contractEntity, null, orderEntity.getDealSize(), false, 10, null));
        C17056l0.m36544a(c27096v0, " / " + C16700e0.m35722b(orderEntity, contractEntity, null, null, true, 6, null), R$font.regular, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text40)));
        return c27096v0;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull final OrderEntity orderEntity) {
        Intrinsics.checkNotNullParameter(orderEntity, "orderEntity");
        super.bindView(orderEntity);
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), C27041f.m66668h(orderEntity.getSymbol()), false, 2, null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) getHolder().itemView.findViewById(R$id.tradeType);
        String strM35730j = C16700e0.m35730j(orderEntity);
        if (strM35730j == null) {
            strM35730j = C27041f.m66668h(orderEntity.getAdvancedDisplayType());
        }
        if (strM35730j.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView);
            C27046k.m66684G(appCompatTextView, false);
        } else {
            Intrinsics.checkNotNull(appCompatTextView);
            C27046k.m66684G(appCompatTextView, true);
            appCompatTextView.setText(strM35730j);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.side);
        Context context = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView2.setText(C16700e0.m35734n(orderEntity, context));
        Context context2 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView2.setTextColor(C22890g.m54281f(context2, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.close);
        Intrinsics.checkNotNull(appCompatTextView3);
        C27046k.m66684G(appCompatTextView3, C16700e0.m35733m(orderEntity));
        appCompatTextView3.setText(appCompatTextView3.getContext().getString(R$string.kumex_close_position_brief));
        Context context3 = appCompatTextView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView3.setTextColor(C22890g.m54281f(context3, Intrinsics.areEqual(orderEntity.getSide(), "buy")));
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.reduceOnlyAndHidden);
        Context context4 = appCompatTextView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        CharSequence charSequenceM35729i = C16700e0.m35729i(orderEntity, context4, null, 2, null);
        if (charSequenceM35729i.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView4);
            C27046k.m66684G(appCompatTextView4, false);
        } else {
            Intrinsics.checkNotNull(appCompatTextView4);
            C27046k.m66684G(appCompatTextView4, true);
            appCompatTextView4.setText(charSequenceM35729i);
        }
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.marginMode)).setText(C37568c.m84634e(orderEntity) ? C27017c.f54310a.m66516f(R$string.kumex_cross_position, new Object[0]) : C27017c.f54310a.m66516f(R$string.kumex_isolate_position, new Object[0]));
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.leverage)).setText(C17054k0.m36530d(orderEntity.getLeverage(), false, 1, null));
        ((TextView) getHolder().itemView.findViewById(R$id.symbol)).setText(C27041f.m66667g(contractEntityM99529O != null ? FuturesDisplayNameUtils.f22525a.m24440e(contractEntityM99529O) : null, C27041f.m66668h(orderEntity.getSymbol())));
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.time);
        Long createdAt = orderEntity.getCreatedAt();
        appCompatTextView5.setText(C27041f.m66668h(createdAt != null ? C44681a.m98835b(createdAt.longValue(), null, false, false, null, 15, null) : null));
        ((TextView) getHolder().itemView.findViewById(R$id.status)).setText(getStatusText(orderEntity));
        ((TextView) getHolder().itemView.findViewById(R$id.amount)).setText(C27017c.f54310a.m66516f(R$string.qty_stub, FuturesDisplayNameUtils.f22525a.m24439d(contractEntityM99529O)));
        ((AppCompatTextView) getHolder().itemView.findViewById(R$id.priceValue)).setText(C16700e0.m35726f(orderEntity, contractEntityM99529O));
        AppCompatTextView appCompatTextView6 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.fillPriceValue);
        String strM35725e = C16700e0.m35725e(orderEntity, contractEntityM99529O);
        if (strM35725e == null || strM35725e.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView6);
            C27046k.m66684G(appCompatTextView6, false);
            View viewFindViewById = getHolder().itemView.findViewById(R$id.fillPrice);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66684G(viewFindViewById, false);
        } else {
            View viewFindViewById2 = getHolder().itemView.findViewById(R$id.fillPrice);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66684G(viewFindViewById2, true);
            Intrinsics.checkNotNull(appCompatTextView6);
            C27046k.m66684G(appCompatTextView6, true);
            appCompatTextView6.setText(strM35725e);
        }
        AppCompatTextView appCompatTextView7 = (AppCompatTextView) getHolder().itemView.findViewById(R$id.conditionValue);
        CharSequence conditionText = getConditionText(contractEntityM99529O, orderEntity);
        if (conditionText == null || conditionText.length() == 0) {
            Intrinsics.checkNotNull(appCompatTextView7);
            C27046k.m66684G(appCompatTextView7, false);
            View viewFindViewById3 = getHolder().itemView.findViewById(R$id.condition);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66684G(viewFindViewById3, false);
        } else {
            View viewFindViewById4 = getHolder().itemView.findViewById(R$id.condition);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            C27046k.m66684G(viewFindViewById4, true);
            Intrinsics.checkNotNull(appCompatTextView7);
            C27046k.m66684G(appCompatTextView7, true);
            appCompatTextView7.setText(conditionText);
        }
        ((TextView) getHolder().itemView.findViewById(R$id.amountValue)).setText(getOrderProgressText(orderEntity, contractEntityM99529O));
        TextView textView = (TextView) getHolder().itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNull(textView);
        C27046k.m66684G(textView, orderEntity.isTrialFunds());
        textView.setText(C27092t0.m66896a(orderEntity.getPrizeType()));
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.kumex.record.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationRecordObjectProxy.bindView$lambda$8(this.f30360b, orderEntity);
            }
        }, 1, null);
        bindViewByTSOOrder(getHolder(), orderEntity);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<OrderEntity> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<OrderEntity> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(DelegationRecordObjectProxy delegationRecordObjectProxy, OrderEntity orderEntity) {
        Context context = delegationRecordObjectProxy.getHolder().itemView.getContext();
        String string = delegationRecordObjectProxy.getHolder().itemView.getContext().getString(R$string.deal_detail);
        String name = DelegationOrderDetailFragment.class.getName();
        C27051h c27051h = new C27051h();
        c27051h.m66721e("data", orderEntity);
        Unit unit = Unit.INSTANCE;
        BaseFragmentActivity.m56574n0(context, string, name, c27051h.m66717a());
        return Unit.INSTANCE;
    }

    private final CharSequence getConditionText(ContractEntity contract, OrderEntity order) {
        String strM66516f;
        if (TextUtils.isEmpty(order.getStop())) {
            return null;
        }
        String strM93906g = C42828b.m93906g(C37568c.m84631b(order, contract), C17033a.m36493a(StringsKt.equals(order.getStop(), "up", true)), false, false, 6, null);
        String stopPriceType = order.getStopPriceType();
        if (Intrinsics.areEqual(stopPriceType, "MP")) {
            strM66516f = C27017c.f54310a.m66516f(R$string.mark_price, new Object[0]);
        } else if (Intrinsics.areEqual(stopPriceType, "IP")) {
            strM66516f = C27017c.f54310a.m66516f(R$string.index_price, new Object[0]);
        } else {
            strM66516f = C27017c.f54310a.m66516f(R$string.last_price, new Object[0]);
        }
        return C42828b.m93906g(strM93906g, strM66516f, false, false, 6, null);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_delegation, getParent(), false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
