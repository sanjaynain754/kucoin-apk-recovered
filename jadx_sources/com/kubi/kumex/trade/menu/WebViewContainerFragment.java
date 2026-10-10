package com.kubi.kumex.trade.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.web.KWebView;
import com.kubi.utils.C27051h;
import com.kubi.widget.web.ui.KWebContainer;
import com.kubi.widget.web.ui.KWebUIConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36809n3;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import s80.C44363a;
import w00.C45681e;

/* JADX INFO: compiled from: WebViewContainerFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0006\u0010\u001a\u001a\u00020\u0015R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/WebViewContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/kumex/databinding/BkumexFragmentWebviewContainerBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentWebviewContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "kWebContainer", "Lcom/kubi/widget/web/ui/KWebContainer;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "onDestroyView", "reload", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebViewContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewContainerFragment.kt\ncom/kubi/kumex/trade/menu/WebViewContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,97:1\n147#2,16:98\n*S KotlinDebug\n*F\n+ 1 WebViewContainerFragment.kt\ncom/kubi/kumex/trade/menu/WebViewContainerFragment\n*L\n41#1:98,16\n*E\n"})
public final class WebViewContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f30578U = C45681e.m100799e(this, new Function1<WebViewContainerFragment, C36809n3>() { // from class: com.kubi.kumex.trade.menu.WebViewContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36809n3 invoke(@NotNull WebViewContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36809n3.m82479a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36809n3, Unit>() { // from class: com.kubi.kumex.trade.menu.WebViewContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36809n3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36809n3 c36809n3) {
            invoke(c36809n3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @Nullable
    public KWebContainer f30579V;

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f30577X = {Reflection.property1(new PropertyReference1Impl(WebViewContainerFragment.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexFragmentWebviewContainerBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f30576W = new Companion(null);

    /* JADX INFO: compiled from: WebViewContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/trade/menu/WebViewContainerFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/trade/menu/WebViewContainerFragment;", "url", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WebViewContainerFragment newInstance(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            WebViewContainerFragment webViewContainerFragment = new WebViewContainerFragment();
            webViewContainerFragment.setArguments(new C27051h().m66724h("url", url).m66724h("loading", "2").m66717a());
            return webViewContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.trade.menu.WebViewContainerFragment$onViewCreated$2 */
    /* JADX INFO: compiled from: WebViewContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kumex.trade.menu.WebViewContainerFragment$onViewCreated$2", m90122f = "WebViewContainerFragment.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C169112 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C169112(Continuation<? super C169112> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebViewContainerFragment.this.new C169112(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C169112) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                KWebContainer kWebContainer = WebViewContainerFragment.this.f30579V;
                if (kWebContainer != null) {
                    this.label = 1;
                    obj = kWebContainer.m67479E(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final C36809n3 m36336k3() {
        return (C36809n3) this.f30578U.getValue(this, f30577X[0]);
    }

    /* JADX INFO: renamed from: l3 */
    public final void m36337l3() {
        KWebView f55267b;
        KWebContainer kWebContainer = this.f30579V;
        if (kWebContainer == null || (f55267b = kWebContainer.getF55267b()) == null) {
            return;
        }
        f55267b.reload();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_webview_container, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        KWebUIConfig kWebUIConfigFromBundle;
        KWebView f55267b;
        KWebContainer kWebContainer;
        KWebView f55267b2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (kWebUIConfigFromBundle = KWebUIConfig.f55294m.fromBundle(arguments)) == null) {
            return;
        }
        C36809n3 c36809n3M36336k3 = m36336k3();
        this.f30579V = c36809n3M36336k3 != null ? c36809n3M36336k3.f80679b : null;
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity != null && (kWebContainer = this.f30579V) != null && (f55267b2 = kWebContainer.getF55267b()) != null) {
            C44363a.f98027a.m97858b(f55267b2, baseActivity);
        }
        KWebContainer kWebContainer2 = this.f30579V;
        if (kWebContainer2 != null) {
            kWebContainer2.m67489Q(kWebUIConfigFromBundle);
        }
        KWebContainer kWebContainer3 = this.f30579V;
        if (kWebContainer3 != null && (f55267b = kWebContainer3.getF55267b()) != null) {
            f55267b.setVerticalScrollBarEnabled(false);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C169112(null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KWebContainer kWebContainer = this.f30579V;
        if (kWebContainer != null) {
            kWebContainer.m67482J();
        }
        this.f30579V = null;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        KWebView f55267b;
        super.onLoad();
        KWebContainer kWebContainer = this.f30579V;
        if (kWebContainer != null && (f55267b = kWebContainer.getF55267b()) != null) {
            f55267b.reload();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g(C17060n0.m36552b(), "Futures_Tutorial", "1", null, 8, null);
    }
}
