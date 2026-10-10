package com.kubi.payment.p2p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$layout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37689t2;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: P2PFallbackFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PFallbackFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentP2pFragmentFallbackBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentP2pFragmentFallbackBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PFallbackFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PFallbackFragment.kt\ncom/kubi/payment/p2p/P2PFallbackFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,56:1\n147#2,16:57\n*S KotlinDebug\n*F\n+ 1 P2PFallbackFragment.kt\ncom/kubi/payment/p2p/P2PFallbackFragment\n*L\n24#1:57,16\n*E\n"})
public final class P2PFallbackFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f39682U = C45681e.m100799e(this, new Function1<P2PFallbackFragment, C37689t2>() { // from class: com.kubi.payment.p2p.P2PFallbackFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37689t2 invoke(@NotNull P2PFallbackFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37689t2.m84969a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37689t2, Unit>() { // from class: com.kubi.payment.p2p.P2PFallbackFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37689t2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37689t2 c37689t2) {
            invoke(c37689t2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f39681W = {Reflection.property1(new PropertyReference1Impl(P2PFallbackFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentP2pFragmentFallbackBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public static final Companion f39680V = new Companion(null);

    /* JADX INFO: compiled from: P2PFallbackFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PFallbackFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.Companion.launch$default(BaseActivity.INSTANCE, context, P2PFallbackFragment.class, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m48406m3() {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final Unit m48407n3() {
        InterfaceC37758j.a.m85165n(C37304a.f82764a, 1L, null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final C37689t2 m48408l3() {
        return (C37689t2) this.f39682U.getValue(this, f39681W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.payment_p2p_fragment_fallback, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    private final void initView() {
        C37689t2 c37689t2M48408l3 = m48408l3();
        if (c37689t2M48408l3 == null) {
            return;
        }
        KcPrimaryButton tvFastTrade = c37689t2M48408l3.f84672d;
        Intrinsics.checkNotNullExpressionValue(tvFastTrade, "tvFastTrade");
        C27046k.m66711z(tvFastTrade, 0L, new Function0() { // from class: com.kubi.payment.p2p.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PFallbackFragment.m48406m3();
            }
        }, 1, null);
        KcPrimaryButton tvHistoryOrder = c37689t2M48408l3.f84673e;
        Intrinsics.checkNotNullExpressionValue(tvHistoryOrder, "tvHistoryOrder");
        C27046k.m66711z(tvHistoryOrder, 0L, new Function0() { // from class: com.kubi.payment.p2p.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PFallbackFragment.m48407n3();
            }
        }, 1, null);
    }
}
