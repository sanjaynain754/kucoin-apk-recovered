package com.kubi.mvi.state;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.mvi.common.C19243e;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.state.BaseStateVM;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$string;
import com.kubi.utils.ToastCompat;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.channels.ChannelResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: StateDelegate.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u0007B+\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\u001c\u0010%\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0'\u0012\u0006\u0012\u0004\u0018\u00010(0&¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020,J\u000b\u0010-\u001a\u00028\u0001¢\u0006\u0002\u0010.J\u001c\u0010/\u001a\u00020!2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020!\u0018\u00010&J\u001e\u00102\u001a\u00020!2\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020!\u0018\u00010&H\u0002J\b\u00103\u001a\u00020!H\u0002J\u001a\u00104\u001a\u00020!2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020!\u0018\u000106H\u0002J\b\u00107\u001a\u00020!H\u0002J\u001a\u00108\u001a\u00020!2\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020!\u0018\u000106H\u0002J\b\u00109\u001a\u00020!H\u0002J\b\u0010:\u001a\u00020!H\u0002J\b\u0010;\u001a\u00020!H\u0002J\u0010\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020,H\u0002J\u000e\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@J\u0013\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00028\u00012\u0006\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010EJI\u0010F\u001a\u00020!\"\u0004\b\u0003\u0010G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002HG0I2\"\u0010J\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002HG\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0'\u0012\u0006\u0012\u0004\u0018\u00010(0K¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020!H\u0016J\b\u0010N\u001a\u00020!H\u0016J\u0006\u0010O\u001a\u00020!J\b\u0010F\u001a\u00020!H\u0016J\b\u0010P\u001a\u00020!H\u0016J\b\u0010Q\u001a\u00020!H\u0016J\b\u0010R\u001a\u00020!H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00028\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006S"}, m90084d2 = {"Lcom/kubi/mvi/state/StateDelegate;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", "VM", "Lcom/kubi/mvi/state/BaseStateVM;", "Lcom/kubi/mvi/state/StateLifecycle;", "mviConfig", "Lcom/kubi/mvi/state/MviConfig;", "vmClass", "Lkotlin/reflect/KClass;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Lcom/kubi/mvi/state/MviConfig;Lkotlin/reflect/KClass;Landroidx/fragment/app/Fragment;)V", "getMviConfig", "()Lcom/kubi/mvi/state/MviConfig;", "getVmClass", "()Lkotlin/reflect/KClass;", "getFragment", "()Landroidx/fragment/app/Fragment;", "taskFlow", "Lcom/kubi/mvi/state/TaskFlow;", "getTaskFlow", "()Lcom/kubi/mvi/state/TaskFlow;", "taskFlow$delegate", "Lkotlin/Lazy;", "vm", "getVm", "()Lcom/kubi/mvi/state/BaseStateVM;", "vm$delegate", "emitTask", "", JPushConstants.Operation.KEY_SEQUENCE, "", "mainThread", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(ZZLkotlin/jvm/functions/Function1;)V", "logPage", "msg", "", "getState", "()Lcom/kubi/mvi/state/IState;", "startHandleSingleEvent", "singleIntentHandler", "Lcom/kubi/mvi/event/ISingleEvent;", "handleSingleEvent", "showContentView", "showErrorView", "call", "Lkotlin/Function0;", "showEmptyView", "showFailView", "showLoadingView", "showLoadingDialog", "hideLoadingDialog", "showToast", "toast", "sendLifeEvent", "lifeEvent", "Lcom/kubi/mvi/vm/WidgetLifeEvent;", "sendIntent", "i", "(Lcom/kubi/mvi/state/IIntent;)V", "sendSyncIntent", "(Lcom/kubi/mvi/state/IIntent;)Lcom/kubi/mvi/state/IState;", "bindState", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "kProperty1", "Lkotlin/reflect/KProperty1;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V", "onCreate", "initView", "init", "onDestroy", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StateDelegate<I extends InterfaceC19282d, S extends InterfaceC19284f, VM extends BaseStateVM<I, S>> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MviConfig f35660a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final KClass<? extends VM> f35661b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final Fragment f35662c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f35663d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f35664e;

    /* JADX INFO: renamed from: O */
    public final void m42623O() {
        C19243e.m42539h("showLoadingDialog", null, 1, null);
        Fragment fragment = this.f35662c;
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (baseFragment != null) {
            baseFragment.showLoadingDialog();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m42624P() {
        C19243e.m42539h("showLoadingView", null, 1, null);
        Fragment fragment = this.f35662c;
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (baseFragment != null) {
            BaseFragment.showLoadingView$default(baseFragment, 0, 0, 3, null);
        }
    }

    public StateDelegate(@NotNull MviConfig mviConfig, @NotNull KClass<? extends VM> vmClass, @Nullable Fragment fragment) {
        Intrinsics.checkNotNullParameter(mviConfig, "mviConfig");
        Intrinsics.checkNotNullParameter(vmClass, "vmClass");
        this.f35660a = mviConfig;
        this.f35661b = vmClass;
        this.f35662c = fragment;
        this.f35663d = LazyKt.lazy(new Function0() { // from class: com.kubi.mvi.state.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateDelegate.m42594S();
            }
        });
        this.f35664e = LazyKt.lazy(new Function0() { // from class: com.kubi.mvi.state.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateDelegate.m42595T(this.f35696b);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static final void m42592L(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m42593N(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: S */
    public static final TaskFlow m42594S() {
        return new TaskFlow();
    }

    /* JADX INFO: renamed from: T */
    public static final BaseStateVM m42595T(StateDelegate stateDelegate) {
        BaseStateVM baseStateVM;
        ViewModelProvider.Factory factoryM42569i = stateDelegate.f35660a.m42569i();
        return (factoryM42569i == null || (baseStateVM = (BaseStateVM) MviExKt.m42513i(stateDelegate.f35660a.getViewModelStoreOwner(), stateDelegate.f35661b, factoryM42569i)) == null) ? (BaseStateVM) MviExKt.m42514j(stateDelegate.f35660a.getViewModelStoreOwner(), stateDelegate.f35661b, null, 2, null) : baseStateVM;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m42610r(StateDelegate stateDelegate, boolean z11, boolean z12, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        stateDelegate.m42629q(z11, z12, function1);
    }

    /* JADX INFO: renamed from: A */
    public void m42611A() {
        C19243e.m42538g(this.f35660a.m42567g() + " initView", this.f35660a.m42567g());
    }

    /* JADX INFO: renamed from: B */
    public final void m42612B(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C19243e.m42538g(msg, this.f35660a.m42567g());
    }

    /* JADX INFO: renamed from: C */
    public void m42613C() {
        C19243e.m42538g(this.f35660a.m42567g() + " onCreate", this.f35660a.m42567g());
    }

    /* JADX INFO: renamed from: E */
    public void m42615E() {
        C19243e.m42539h(this.f35660a.m42567g() + " onHide", null, 1, null);
        m42610r(this, false, false, new StateDelegate$onHide$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: F */
    public void m42616F() {
        C19243e.m42539h(this.f35660a.m42567g() + " onShow", null, 1, null);
        m42610r(this, false, false, new StateDelegate$onShow$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m42617G(@NotNull I i11) {
        Intrinsics.checkNotNullParameter(i11, "i");
        m42610r(this, false, false, new StateDelegate$sendIntent$1(this, i11, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final S m42618H(@NotNull I i11) {
        Intrinsics.checkNotNullParameter(i11, "i");
        return (S) m42634w().sendSyncIntent(i11);
    }

    /* JADX INFO: renamed from: I */
    public final void m42619I() {
        C19243e.m42539h(this.f35660a.m42567g() + " showContentView", null, 1, null);
        Fragment fragment = this.f35662c;
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (baseFragment != null) {
            baseFragment.showContentView();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m42620J() {
        C19243e.m42539h(this.f35660a.m42567g() + "  showEmptyView", null, 1, null);
        Fragment fragment = this.f35662c;
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (baseFragment != null) {
            BaseFragment.showEmptyView$default(baseFragment, R$string.common_no_data, 0, (View.OnClickListener) null, 6, (Object) null);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m42621K(final Function0<Unit> function0) {
        C19243e.m42539h(this.f35660a.m42567g() + "  showErrorView", null, 1, null);
        if (function0 == null) {
            Fragment fragment = this.f35662c;
            BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
            if (baseFragment != null) {
                BaseFragment.showEmptyView$default(baseFragment, R$string.network_error, R$drawable.ic2_common_network_error, (View.OnClickListener) null, 4, (Object) null);
                return;
            }
            return;
        }
        Fragment fragment2 = this.f35662c;
        BaseFragment baseFragment2 = fragment2 instanceof BaseFragment ? (BaseFragment) fragment2 : null;
        if (baseFragment2 != null) {
            baseFragment2.showEmptyView(R$string.network_error, R$drawable.ic2_common_network_error, new View.OnClickListener() { // from class: com.kubi.mvi.state.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StateDelegate.m42592L(function0, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m42622M(final Function0<Unit> function0) {
        C19243e.m42539h(this.f35660a.m42567g() + "  showFailView", null, 1, null);
        if (function0 == null) {
            Fragment fragment = this.f35662c;
            BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
            if (baseFragment != null) {
                BaseFragment.showFailView$default(baseFragment, 0, 0, (View.OnClickListener) null, 7, (Object) null);
                return;
            }
            return;
        }
        Fragment fragment2 = this.f35662c;
        BaseFragment baseFragment2 = fragment2 instanceof BaseFragment ? (BaseFragment) fragment2 : null;
        if (baseFragment2 != null) {
            BaseFragment.showFailView$default(baseFragment2, 0, 0, new View.OnClickListener() { // from class: com.kubi.mvi.state.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StateDelegate.m42593N(function0, view);
                }
            }, 3, (Object) null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m42625Q(String str) {
        C19243e.m42539h(this.f35660a.m42567g() + "  showToast:" + str, null, 1, null);
        ToastCompat.m66441G(str, new Object[0]);
    }

    /* JADX INFO: renamed from: o */
    public void m42627o() {
        C19243e.m42538g(this.f35660a.m42567g() + " bindState", this.f35660a.m42567g());
    }

    /* JADX INFO: renamed from: p */
    public final <A> void m42628p(@NotNull KProperty1<S, ? extends A> kProperty1, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(kProperty1, "kProperty1");
        Intrinsics.checkNotNullParameter(action, "action");
        m42610r(this, false, false, new StateDelegate$bindState$1(this, kProperty1, action, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m42629q(boolean z11, boolean z12, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (ChannelResult.m90676i(m42633v().m42656e(z11, z12, block))) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(m42634w()), null, null, new StateDelegate$emitTask$1(this, z11, z12, block, null), 3, null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Fragment getF35662c() {
        return this.f35662c;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final MviConfig getF35660a() {
        return this.f35660a;
    }

    /* JADX INFO: renamed from: v */
    public final TaskFlow m42633v() {
        return (TaskFlow) this.f35663d.getValue();
    }

    /* JADX INFO: renamed from: w */
    public final VM m42634w() {
        return (VM) this.f35664e.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final void m42635x(Function1<? super InterfaceC36952a, Unit> function1) {
        MviExKt.m42519o(this.f35660a.getLifecycleOwner(), new StateDelegate$handleSingleEvent$1(this, function1, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m42636y() {
        C19243e.m42539h(this.f35660a.m42567g() + " hideLoadingDialog", null, 1, null);
        Fragment fragment = this.f35662c;
        BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
        if (baseFragment != null) {
            BaseFragment.hideLoadingDialog$default(baseFragment, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m42614D() {
        m42633v().m42655d();
        m42634w().destroyMVIContext();
        C19243e.m42538g(this.f35660a.m42567g() + " onDestroy", this.f35660a.m42567g());
        this.f35660a.getHandler().removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: R */
    public final void m42626R(@Nullable Function1<? super InterfaceC36952a, Unit> function1) {
        m42635x(function1);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final S m42632u() {
        return (S) m42634w().getState();
    }

    /* JADX INFO: renamed from: z */
    public final void m42637z() {
        m42634w().setMVIContext(this.f35660a);
    }
}
