package com.kubi.kumex.record;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.broker.IBrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.router.core.Router;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RecordObjects.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitRecordObjectProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/kumex/record/ProfitRecordObject;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "createView", "Landroid/view/View;", "bindView", "", "d", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRecordObjects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObjectProxy\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1120:1\n11#2,6:1121\n17#2,5:1129\n295#3,2:1127\n*S KotlinDebug\n*F\n+ 1 RecordObjects.kt\ncom/kubi/kumex/record/ProfitRecordObjectProxy\n*L\n394#1:1121,6\n394#1:1129,5\n394#1:1127,2\n*E\n"})
public final class ProfitRecordObjectProxy extends ViewHolderProxy<ProfitRecordObject> {

    @Nullable
    private final ItemCallBack<ProfitRecordObject> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<ProfitRecordObject> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfitRecordObjectProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<ProfitRecordObject> itemCallBack, @Nullable ItemCallBack<ProfitRecordObject> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$2$lambda$0(ProfitRecordObjectProxy profitRecordObjectProxy, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<ProfitRecordObject> shortCall = profitRecordObjectProxy.getShortCall();
        if (shortCall != null) {
            int adapterPosition = profitRecordObjectProxy.getHolder().getAdapterPosition();
            ProfitRecordObject data = profitRecordObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(it, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @SuppressLint({"SetTextI18n"})
    public void bindView(@NotNull ProfitRecordObject d11) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        View itemView = getHolder().itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ((BaseTextView) itemView.findViewById(R$id.profitSymbol)).setText(d11.getF29958j());
        BaseTextView baseTextView = (BaseTextView) itemView.findViewById(R$id.closeTypeTv);
        baseTextView.setText(d11.m35296b());
        Intrinsics.checkNotNull(baseTextView);
        boolean z11 = false;
        C27046k.m66684G(baseTextView, d11.m35296b().length() > 0);
        if (d11.m35298d() == null) {
            View viewFindViewById = itemView.findViewById(R$id.directionTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66700o(viewFindViewById);
        } else {
            int i11 = R$id.directionTv;
            View viewFindViewById2 = itemView.findViewById(i11);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            C27046k.m66685H(viewFindViewById2);
            KcTradeRateView kcTradeRateView = (KcTradeRateView) itemView.findViewById(i11);
            kcTradeRateView.setText(d11.m35298d());
            kcTradeRateView.setTextColor(d11.getF29940e());
        }
        ((BaseTextView) itemView.findViewById(R$id.marginMode)).setText(d11.getF29938c());
        if (d11.m35300f() == null) {
            View viewFindViewById3 = itemView.findViewById(R$id.leverageTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            C27046k.m66700o(viewFindViewById3);
        } else {
            int i12 = R$id.leverageTv;
            View viewFindViewById4 = itemView.findViewById(i12);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            C27046k.m66685H(viewFindViewById4);
            ((BaseTextView) itemView.findViewById(i12)).setText(d11.m35300f());
        }
        TextView textView = (TextView) itemView.findViewById(R$id.trialTag);
        Intrinsics.checkNotNull(textView);
        C27046k.m66684G(textView, d11.getF29936a().isTrialFunds());
        textView.setText(C27092t0.m66896a(d11.getF29936a().getPrizeType()));
        ((BaseTextView) itemView.findViewById(R$id.time)).setText(d11.getF29939d());
        ((BaseTextView) itemView.findViewById(R$id.profitAmount)).setText(d11.getF29959k());
        if (d11.getF29936a().getRoe() == null) {
            View viewFindViewById5 = itemView.findViewById(R$id.realisedPnlRateLabelTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            C27046k.m66700o(viewFindViewById5);
            View viewFindViewById6 = itemView.findViewById(R$id.realisedPnlRateValueTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            C27046k.m66700o(viewFindViewById6);
        } else {
            View viewFindViewById7 = itemView.findViewById(R$id.realisedPnlRateLabelTv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
            C27046k.m66685H(viewFindViewById7);
            BaseTextView baseTextView2 = (BaseTextView) itemView.findViewById(R$id.realisedPnlRateValueTv);
            Intrinsics.checkNotNull(baseTextView2);
            C27046k.m66685H(baseTextView2);
            baseTextView2.setText(d11.getF29960l());
        }
        MultiBizType multiBizType = d11.getRecord1().getMultiBizType();
        if (multiBizType == null) {
            multiBizType = MultiBizType.CLASSIC;
        }
        MultiBizType multiBizType2 = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(IBrokerConfig.class);
        Iterator it = listM56190l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizType);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
            Iterator it2 = listM56190l.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((InterfaceC43729a) next2).mo4515x() != multiBizType2);
            interfaceC43729a = (InterfaceC43729a) next2;
        }
        IBrokerConfig iBrokerConfig = (IBrokerConfig) interfaceC43729a;
        boolean zM66567e = C27025c.m66567e(iBrokerConfig != null ? Boolean.valueOf(iBrokerConfig.mo20239j0()) : null, true);
        if (!d11.getF29936a().isTrialFunds() && zM66567e) {
            z11 = true;
        }
        View viewFindViewById8 = itemView.findViewById(R$id.share);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        C27046k.m66684G(viewFindViewById8, z11);
        View viewFindViewById9 = itemView.findViewById(R$id.lineView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        C27046k.m66684G(viewFindViewById9, z11);
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ProfitRecordObject> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<ProfitRecordObject> getShortCall() {
        return this.shortCall;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createView$lambda$2$lambda$1(ProfitRecordObjectProxy profitRecordObjectProxy, View view) {
        ItemCallBack<ProfitRecordObject> shortCall = profitRecordObjectProxy.getShortCall();
        if (shortCall != null) {
            Intrinsics.checkNotNull(view);
            int adapterPosition = profitRecordObjectProxy.getHolder().getAdapterPosition();
            ProfitRecordObject data = profitRecordObjectProxy.getData();
            Intrinsics.checkNotNull(data);
            shortCall.mo24515a(view, adapterPosition, data);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        final View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.bkumex_item_profit_record, getParent(), false);
        View viewFindViewById = viewInflate.findViewById(R$id.share);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ViewExtKt.m66575f(viewFindViewById, new Function1() { // from class: com.kubi.kumex.record.d1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitRecordObjectProxy.createView$lambda$2$lambda$0(this.f30164b, (View) obj);
            }
        });
        Intrinsics.checkNotNull(viewInflate);
        C27046k.m66711z(viewInflate, 0L, new Function0() { // from class: com.kubi.kumex.record.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitRecordObjectProxy.createView$lambda$2$lambda$1(this.f30230b, viewInflate);
            }
        }, 1, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
