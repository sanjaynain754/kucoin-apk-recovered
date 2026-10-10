package com.kubi.profit.loss.analysis.lib;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.C19244f;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import su.C44545a;
import w00.C45681e;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisFragment.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\b\u0010 \u001a\u00020\u0018H\u0014J\b\u0010!\u001a\u00020\"H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020%0$X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006("}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragmentContract$UIState;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "mFragment", "Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisContentFragment;", "guidePop", "Landroid/widget/PopupWindow;", "binding", "Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisBinding;", "getBinding", "()Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mHandler", "Landroid/os/Handler;", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroy", "bindFlowEvent", "showFragment", "hideFragment", "startShowChartAnimator", "showAnimation", "bindState", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsProfitLossAnalysisFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsProfitLossAnalysisFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,160:1\n143#2,20:161\n81#3,2:181\n158#3,2:183\n32#4,8:185\n*S KotlinDebug\n*F\n+ 1 AssetsProfitLossAnalysisFragment.kt\ncom/kubi/profit/loss/analysis/lib/AssetsProfitLossAnalysisFragment\n*L\n36#1:161,20\n68#1:181,2\n79#1:183,2\n92#1:185,8\n*E\n"})
public final class AssetsProfitLossAnalysisFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f40624a0 = {Reflection.property1(new PropertyReference1Impl(AssetsProfitLossAnalysisFragment.class, "binding", "getBinding()Lcom/kubi/profit/loss/analysis/lib/databinding/FragmentProfitAnalysisBinding;", 0))};

    /* JADX INFO: renamed from: U */
    public boolean f40625U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public AssetsProfitLossAnalysisContentFragment f40626V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public PopupWindow f40627W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f40628X = C45681e.m100799e(this, new Function1<AssetsProfitLossAnalysisFragment, C44545a>() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44545a invoke(@NotNull AssetsProfitLossAnalysisFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44545a.m98609a(fragment.requireView());
        }
    }, new Function1<C44545a, Unit>() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44545a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44545a c44545a) {
            invoke(c44545a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public Handler f40629Y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final KClass<? extends AbstractC19290l<UIState>> f40630Z = Reflection.getOrCreateKotlinClass(AssetsProfitLossAnalysisVM.class);

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindState$2", m90122f = "AssetsProfitLossAnalysisFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C215042 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C215042) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C215042(Continuation<? super C215042> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215042 c215042 = AssetsProfitLossAnalysisFragment.this.new C215042(continuation);
            c215042.L$0 = obj;
            return c215042;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (bool != null) {
                AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment = AssetsProfitLossAnalysisFragment.this;
                boolean zBooleanValue = bool.booleanValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("change_");
                ValueEntity dayValueEntity = AssetsProfitLossAnalysisFragment.m50036o3(assetsProfitLossAnalysisFragment).getDayValueEntity();
                sb2.append(dayValueEntity != null ? dayValueEntity.getCurrentRange() : null);
                C21535v.m50071i(null, sb2.toString(), null, null, 13, null);
                if (zBooleanValue) {
                    assetsProfitLossAnalysisFragment.m50044w3();
                } else {
                    assetsProfitLossAnalysisFragment.m50043u3();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetsProfitLossAnalysisFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment$bindState$4", m90122f = "AssetsProfitLossAnalysisFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C215064 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C215064) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C215064(Continuation<? super C215064> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C215064 c215064 = AssetsProfitLossAnalysisFragment.this.new C215064(continuation);
            c215064.L$0 = obj;
            return c215064;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinearLayout root;
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (bool != null) {
                AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment = AssetsProfitLossAnalysisFragment.this;
                boolean zBooleanValue = bool.booleanValue();
                C44545a c44545aM50042t3 = assetsProfitLossAnalysisFragment.m50042t3();
                if (c44545aM50042t3 != null && (root = c44545aM50042t3.getRoot()) != null) {
                    C19244f.m42542a(root, zBooleanValue);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_profit_analysis;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF40625U() {
        return this.f40625U;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return this.f40630Z;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f40625U = z11;
    }

    /* JADX INFO: renamed from: t3 */
    public final C44545a m50042t3() {
        return (C44545a) this.f40628X.getValue(this, f40624a0[0]);
    }

    /* JADX INFO: renamed from: u3 */
    public final void m50043u3() {
        AssetsProfitLossAnalysisManager assetsProfitLossAnalysisManager = AssetsProfitLossAnalysisManager.f40608a;
        assetsProfitLossAnalysisManager.m49944f();
        assetsProfitLossAnalysisManager.m49951m();
    }

    /* JADX INFO: renamed from: w3 */
    public final void m50044w3() {
        if (this.f40626V == null) {
            AssetsProfitLossAnalysisContentFragment assetsProfitLossAnalysisContentFragment = new AssetsProfitLossAnalysisContentFragment();
            this.f40626V = assetsProfitLossAnalysisContentFragment;
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
            fragmentTransactionBeginTransaction.replace(R$id.ProfitLossAnalysisFragment_Container, assetsProfitLossAnalysisContentFragment);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            AssetsProfitLossAnalysisManager.f40608a.m49950l();
        }
        AssetsProfitLossAnalysisManager.f40608a.m49945g();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m50045x3(boolean z11) {
        ImageView imageView;
        RotateAnimation rotateAnimation = z11 ? new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f) : new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setInterpolator(new AccelerateInterpolator());
        C44545a c44545aM50042t3 = m50042t3();
        if (c44545aM50042t3 == null || (imageView = c44545aM50042t3.f98758c) == null) {
            return;
        }
        imageView.startAnimation(rotateAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o3 */
    public static final /* synthetic */ UIState m50036o3(AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment) {
        return (UIState) assetsProfitLossAnalysisFragment.getState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v3 */
    public static final Unit m50041v3(AssetsProfitLossAnalysisFragment assetsProfitLossAnalysisFragment) {
        assetsProfitLossAnalysisFragment.m50045x3(C27025c.m66566d(((UIState) assetsProfitLossAnalysisFragment.getState()).getNeedShowChartLayout()));
        assetsProfitLossAnalysisFragment.sendIntent(new C21509xeff1afab());
        if (C27025c.m66566d(((UIState) assetsProfitLossAnalysisFragment.getState()).getNeedShowChartLayout())) {
            C43852m.m96595g("B1overview", "asset", "trendFold", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "line_chart_entrance".length();
        }
        C12572a.m23692a(this, true, new C21501x364c18e2("line_chart_entrance", null, this));
        if (c12573b.m23696a()) {
            "click_mini_line_chart".length();
        }
        C12572a.m23692a(this, true, new C21502x364c18e3("click_mini_line_chart", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getNeedShowChartLayout();
            }
        }, new C215042(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowContent();
            }
        }, new C215064(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        ImageView imageView;
        LinearLayout root;
        super.initView();
        C44545a c44545aM50042t3 = m50042t3();
        if (c44545aM50042t3 != null && (root = c44545aM50042t3.getRoot()) != null) {
            C21535v.m50074l(root, true);
        }
        C44545a c44545aM50042t4 = m50042t3();
        if (c44545aM50042t4 != null && (imageView = c44545aM50042t4.f98758c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.profit.loss.analysis.lib.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetsProfitLossAnalysisFragment.m50041v3(this.f40741b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f40629Y.removeCallbacksAndMessages(null);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        PopupWindow popupWindow = this.f40627W;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f40629Y.removeCallbacksAndMessages(null);
    }
}
