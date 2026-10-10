package com.kubi.otc.otc.order;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37633i1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FastTradeOrderHistoryFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/otc/otc/order/FastTradeOrderHistoryFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentFragmentFastBuyHistoryBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyHistoryBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isOneTimePurchase", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", "refreshTab", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastTradeOrderHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastTradeOrderHistoryFragment.kt\ncom/kubi/otc/otc/order/FastTradeOrderHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,77:1\n147#2,16:78\n*S KotlinDebug\n*F\n+ 1 FastTradeOrderHistoryFragment.kt\ncom/kubi/otc/otc/order/FastTradeOrderHistoryFragment\n*L\n18#1:78,16\n*E\n"})
public final class FastTradeOrderHistoryFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f37833W = {Reflection.property1(new PropertyReference1Impl(FastTradeOrderHistoryFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentFragmentFastBuyHistoryBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f37834U = C45681e.m100799e(this, new Function1<FastTradeOrderHistoryFragment, C37633i1>() { // from class: com.kubi.otc.otc.order.FastTradeOrderHistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37633i1 invoke(@NotNull FastTradeOrderHistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37633i1.m84848a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37633i1, Unit>() { // from class: com.kubi.otc.otc.order.FastTradeOrderHistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37633i1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37633i1 c37633i1) {
            invoke(c37633i1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public boolean f37835V = true;

    /* JADX INFO: renamed from: n3 */
    public static final Unit m44969n3(FastTradeOrderHistoryFragment fastTradeOrderHistoryFragment) {
        if (fastTradeOrderHistoryFragment.f37835V) {
            return Unit.INSTANCE;
        }
        fastTradeOrderHistoryFragment.f37835V = true;
        fastTradeOrderHistoryFragment.m44971p3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m44970o3(FastTradeOrderHistoryFragment fastTradeOrderHistoryFragment) {
        if (!fastTradeOrderHistoryFragment.f37835V) {
            return Unit.INSTANCE;
        }
        fastTradeOrderHistoryFragment.f37835V = false;
        fastTradeOrderHistoryFragment.m44971p3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    private final void m44971p3() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        if (this.f37835V) {
            C37633i1 c37633i1M44972l3 = m44972l3();
            if (c37633i1M44972l3 != null && (baseTextView8 = c37633i1M44972l3.f84035c) != null) {
                baseTextView8.setBackgroundResource(R$drawable.shape_cover4_4r);
            }
            C37633i1 c37633i1M44972l4 = m44972l3();
            if (c37633i1M44972l4 != null && (baseTextView7 = c37633i1M44972l4.f84035c) != null) {
                baseTextView7.setTextColor(getColorRes(R$color.c_text));
            }
            C37633i1 c37633i1M44972l5 = m44972l3();
            if (c37633i1M44972l5 != null && (baseTextView6 = c37633i1M44972l5.f84036d) != null) {
                baseTextView6.setBackground(null);
            }
            C37633i1 c37633i1M44972l6 = m44972l3();
            if (c37633i1M44972l6 != null && (baseTextView5 = c37633i1M44972l6.f84036d) != null) {
                baseTextView5.setTextColor(getColorRes(R$color.c_text40));
            }
            getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, new OtcBankListFragment()).commitNowAllowingStateLoss();
            return;
        }
        C37633i1 c37633i1M44972l7 = m44972l3();
        if (c37633i1M44972l7 != null && (baseTextView4 = c37633i1M44972l7.f84035c) != null) {
            baseTextView4.setBackground(null);
        }
        C37633i1 c37633i1M44972l8 = m44972l3();
        if (c37633i1M44972l8 != null && (baseTextView3 = c37633i1M44972l8.f84035c) != null) {
            baseTextView3.setTextColor(getColorRes(R$color.c_text40));
        }
        C37633i1 c37633i1M44972l9 = m44972l3();
        if (c37633i1M44972l9 != null && (baseTextView2 = c37633i1M44972l9.f84036d) != null) {
            baseTextView2.setBackgroundResource(R$drawable.shape_cover4_4r);
        }
        C37633i1 c37633i1M44972l10 = m44972l3();
        if (c37633i1M44972l10 != null && (baseTextView = c37633i1M44972l10.f84036d) != null) {
            baseTextView.setTextColor(getColorRes(R$color.c_text));
        }
        getChildFragmentManager().beginTransaction().replace(R$id.fragment_container, new RecurringHistoryFragment()).commitNowAllowingStateLoss();
    }

    /* JADX INFO: renamed from: l3 */
    public final C37633i1 m44972l3() {
        return (C37633i1) this.f37834U.getValue(this, f37833W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.payment_fragment_fast_buy_history, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m44968m3();
    }

    /* JADX INFO: renamed from: m3 */
    private final void m44968m3() {
        C37633i1 c37633i1M44972l3 = m44972l3();
        if (c37633i1M44972l3 == null) {
            return;
        }
        BaseTextView tvOneTimePurchase = c37633i1M44972l3.f84035c;
        Intrinsics.checkNotNullExpressionValue(tvOneTimePurchase, "tvOneTimePurchase");
        C27046k.m66711z(tvOneTimePurchase, 0L, new Function0() { // from class: com.kubi.otc.otc.order.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeOrderHistoryFragment.m44969n3(this.f37845b);
            }
        }, 1, null);
        BaseTextView tvRecurring = c37633i1M44972l3.f84036d;
        Intrinsics.checkNotNullExpressionValue(tvRecurring, "tvRecurring");
        C27046k.m66711z(tvRecurring, 0L, new Function0() { // from class: com.kubi.otc.otc.order.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastTradeOrderHistoryFragment.m44970o3(this.f37846b);
            }
        }, 1, null);
        m44971p3();
    }
}
