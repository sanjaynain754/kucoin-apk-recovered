package com.kubi.core.biz.menu.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.web.KWebView;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.widget.web.ui.KWebContainer;
import com.kubi.widget.web.ui.KWebUIConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
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
import ro.C44128b;
import s80.C44363a;
import v30.C45390k;
import w00.C45681e;

/* JADX INFO: compiled from: TradeWebContainerFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/TradeWebContainerFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkucoinTradeWebContainerFragmentBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkucoinTradeWebContainerFragmentBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "url", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initViews", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onLoad", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeWebContainerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeWebContainerFragment.kt\ncom/kubi/core/biz/menu/more/TradeWebContainerFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,95:1\n147#2,16:96\n*S KotlinDebug\n*F\n+ 1 TradeWebContainerFragment.kt\ncom/kubi/core/biz/menu/more/TradeWebContainerFragment\n*L\n37#1:96,16\n*E\n"})
public final class TradeWebContainerFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f20518U = C45681e.m100799e(this, new Function1<TradeWebContainerFragment, C45390k>() { // from class: com.kubi.core.biz.menu.more.TradeWebContainerFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45390k invoke(@NotNull TradeWebContainerFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45390k.m100314a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45390k, Unit>() { // from class: com.kubi.core.biz.menu.more.TradeWebContainerFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45390k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45390k c45390k) {
            invoke(c45390k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public String f20519V;

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f20517X = {Reflection.property1(new PropertyReference1Impl(TradeWebContainerFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkucoinTradeWebContainerFragmentBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f20516W = new Companion(null);

    /* JADX INFO: compiled from: TradeWebContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/core/biz/menu/more/TradeWebContainerFragment$Companion;", "", "<init>", "()V", "WEB_URL", "", "create", "Lcom/kubi/core/biz/menu/more/TradeWebContainerFragment;", "url", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TradeWebContainerFragment create(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            TradeWebContainerFragment tradeWebContainerFragment = new TradeWebContainerFragment();
            tradeWebContainerFragment.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("web_url", url)));
            return tradeWebContainerFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.menu.more.TradeWebContainerFragment$onLoad$1 */
    /* JADX INFO: compiled from: TradeWebContainerFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.menu.more.TradeWebContainerFragment$onLoad$1", m90122f = "TradeWebContainerFragment.kt", m90123i = {}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119731 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C119731(Continuation<? super C119731> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TradeWebContainerFragment.this.new C119731(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C119731) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KWebContainer kWebContainer;
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
                C45390k c45390kM21991k3 = TradeWebContainerFragment.this.m21991k3();
                if (c45390kM21991k3 != null && (kWebContainer = c45390kM21991k3.f102176b) != null) {
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
    public final C45390k m21991k3() {
        return (C45390k) this.f20518U.getValue(this, f20517X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkucoin_trade_web_container_fragment, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21990l3();
    }

    /* JADX INFO: renamed from: l3 */
    private final void m21990l3() {
        BaseActivity baseActivity;
        KWebView f55267b;
        C45390k c45390kM21991k3 = m21991k3();
        if (c45390kM21991k3 != null) {
            FragmentActivity activity = getActivity();
            String str = null;
            if (activity instanceof BaseActivity) {
                baseActivity = (BaseActivity) activity;
            } else {
                baseActivity = null;
            }
            if (baseActivity != null && (f55267b = c45390kM21991k3.f102176b.getF55267b()) != null) {
                C44363a.f98027a.m97858b(f55267b, baseActivity);
            }
            KWebContainer kWebContainer = c45390kM21991k3.f102176b;
            KWebUIConfig.Companion companion = KWebUIConfig.f55294m;
            String str2 = this.f20519V;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
            } else {
                str = str2;
            }
            KWebUIConfig kWebUIConfigFromBundle = companion.fromBundle(BundleKt.bundleOf(TuplesKt.m90091to("url", str), TuplesKt.m90091to("loading", "2")));
            Intrinsics.checkNotNull(kWebUIConfigFromBundle);
            kWebContainer.m67489Q(kWebUIConfigFromBundle);
            c45390kM21991k3.f102176b.setVerticalScrollBarEnabled(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        setNeedLoadingView(false);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("web_url")) == null) {
            string = "";
        }
        this.f20519V = string;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        C44128b.m97259c(getTAG(), "onLoad: ");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C119731(null), 3, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C44128b.m97259c(getTAG(), "onShow: ");
    }
}
