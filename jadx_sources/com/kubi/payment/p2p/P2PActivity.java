package com.kubi.payment.p2p;

import android.app.Application;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.chat.service.ChatClient;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.p2p.data.entities.BadgeInfo;
import com.kubi.payment.p2p.trade.P2PTradeMarketHomeFragment;
import com.kubi.resources.widget.RadioGroupPlus;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.function.looper.KuCoinLooper;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import dz.C36993c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37667p0;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45678b;
import zw.C46932c;

/* JADX INFO: compiled from: P2PActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\u0017\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010(J\u0017\u0010)\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010(J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0014J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001fH\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "<init>", "()V", "binding", "Lcom/kubi/otc/databinding/PaymentActivityP2pBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentActivityP2pBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentCheckId", "", "orderHistoryBadge", "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;", "chatBadge", "p2pHomeFragment", "Landroidx/fragment/app/Fragment;", "orderHistoryFragment", "chatListFragment", "profileFragment", "p2pVM", "Lcom/kubi/payment/p2p/P2PViewModel;", "heartBeatTask", "Lcom/kubi/sdk/function/looper/KuCoinLooperTask;", "kotlin.jvm.PlatformType", "getHeartBeatTask", "()Lcom/kubi/sdk/function/looper/KuCoinLooperTask;", "heartBeatTask$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initViewModel", "initViews", "initFragments", "showFragment", "refreshOrderHistoryBadge", "count", "(Ljava/lang/Integer;)V", "refreshChatBadge", "observeData", "onResume", "url", "", "onDestroy", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PActivity.kt\ncom/kubi/payment/p2p/P2PActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n*L\n1#1,266:1\n45#2,19:267\n*S KotlinDebug\n*F\n+ 1 P2PActivity.kt\ncom/kubi/payment/p2p/P2PActivity\n*L\n41#1:267,19\n*E\n"})
public final class P2PActivity extends BaseActivity implements KCMiniAppBaseProtocol {

    /* JADX INFO: renamed from: j */
    public int f39667j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public QBadgeView f39668k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public QBadgeView f39669l;

    /* JADX INFO: renamed from: m */
    public Fragment f39670m;

    /* JADX INFO: renamed from: n */
    public Fragment f39671n;

    /* JADX INFO: renamed from: o */
    public Fragment f39672o;

    /* JADX INFO: renamed from: p */
    public Fragment f39673p;

    /* JADX INFO: renamed from: q */
    public P2PViewModel f39674q;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ KProperty<Object>[] f39665t = {Reflection.property1(new PropertyReference1Impl(P2PActivity.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentActivityP2pBinding;", 0))};

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final Companion f39664s = new Companion(null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public final InterfaceC24293a f39666i = C45678b.m100788b(this, new Function1<C37667p0, Unit>() { // from class: com.kubi.payment.p2p.P2PActivity$special$$inlined$viewBindingActivity$default$1
        public final void invoke(@NotNull C37667p0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37667p0 c37667p0) {
            invoke(c37667p0);
            return Unit.INSTANCE;
        }
    }, new Function1<P2PActivity, C37667p0>() { // from class: com.kubi.payment.p2p.P2PActivity$special$$inlined$viewBindingActivity$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37667p0 invoke(@NotNull P2PActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return C37667p0.m84919a(C45678b.m100787a(activity));
        }
    });

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f39675r = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.p2p.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P2PActivity.m48389d0(this.f39695b);
        }
    });

    /* JADX INFO: compiled from: P2PActivity.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/p2p/P2PActivity$Companion;", "", "<init>", "()V", "LOOPER_HEART_BEAT_REPORT_TIME", "", "LOOPER_HEART_BEAT_REPORT_TASK_ID", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.P2PActivity$a */
    /* JADX INFO: compiled from: P2PActivity.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/payment/p2p/P2PActivity$initViews$1$1", "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/kubi/resources/widget/RadioGroupPlus;", "checkedId", "", "isChecked", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21066a implements RadioGroupPlus.InterfaceC22946c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C37667p0 f39677b;

        public C21066a(C37667p0 c37667p0) {
            this.f39677b = c37667p0;
        }

        @Override // com.kubi.resources.widget.RadioGroupPlus.InterfaceC22946c
        /* JADX INFO: renamed from: a */
        public void mo16018a(RadioGroupPlus radioGroupPlus, int i11, boolean z11) {
            if (P2PActivity.this.f39667j == i11) {
                this.f39677b.f84384b.m54743f(P2PActivity.this.f39667j);
                return;
            }
            P2PActivity.this.f39667j = i11;
            P2PViewModel p2PViewModel = P2PActivity.this.f39674q;
            if (p2PViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("p2pVM");
                p2PViewModel = null;
            }
            p2PViewModel.m48464C();
            P2PActivity.this.m48396n0();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.P2PActivity$b */
    /* JADX INFO: compiled from: P2PActivity.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21067b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39678b;

        public C21067b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39678b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39678b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39678b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final C36993c m48389d0(final P2PActivity p2PActivity) {
        return new C36993c.b("p2pHeartBeatReport").m82829i(30L).m82826f(new Runnable() { // from class: com.kubi.payment.p2p.d
            @Override // java.lang.Runnable
            public final void run() {
                P2PActivity.m48390e0(this.f39702b);
            }
        }).m82828h();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m48390e0(P2PActivity p2PActivity) {
        C44128b.m97265i("p2p heart beat report");
        P2PViewModel p2PViewModel = p2PActivity.f39674q;
        if (p2PViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("p2pVM");
            p2PViewModel = null;
        }
        p2PViewModel.m48463B();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m48391g0() {
        Application application = BaseApplication.INSTANCE.get();
        this.f39674q = (P2PViewModel) new ViewModelProvider(this, new P2PViewModelFactory(P2PServiceLocator.m48466d(application), application)).get(P2PViewModel.class);
        if (OtcDepend.f38138a.m45466o()) {
            KuCoinLooper.INSTANCE.addTask(m48398c0());
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m48393i0() {
        P2PViewModel p2PViewModel = this.f39674q;
        if (p2PViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("p2pVM");
            p2PViewModel = null;
        }
        p2PViewModel.m48465z().observe(this, new C21067b(new Function1() { // from class: com.kubi.payment.p2p.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return P2PActivity.m48394j0(this.f39699b, (BadgeInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m48395k0() {
        ChatClient chatClient = ChatClient.INSTANCE.get();
        if (chatClient != null) {
            chatClient.m20392g();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public final C37667p0 m48397b0() {
        return (C37667p0) this.f39666i.getValue(this, f39665t[0]);
    }

    /* JADX INFO: renamed from: c0 */
    public final C36993c m48398c0() {
        return (C36993c) this.f39675r.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m48399f0() {
        this.f39670m = new P2PTradeMarketHomeFragment();
        this.f39671n = new P2POrderHistoryFragment();
        this.f39672o = P2PChatListFragment.f39679Y.newInstance();
        this.f39673p = P2PProfileFragment.f39690Y.newInstance();
    }

    /* JADX INFO: renamed from: l0 */
    public final void m48400l0(Integer num) {
        QBadgeView qBadgeView = this.f39669l;
        if (qBadgeView != null) {
            qBadgeView.mo55426c(C46932c.m103406c(qBadgeView, C5275i0.m6236a(24.0f)), C5275i0.m6236a(2.0f), false);
            int iM66650j = C27039d.m66650j(num);
            if (iM66650j <= 0) {
                qBadgeView.mo55425b(0);
            } else if (iM66650j > 9) {
                qBadgeView.m55420C("9+");
            } else {
                qBadgeView.mo55425b(iM66650j);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48401m0(Integer num) {
        QBadgeView qBadgeView = this.f39668k;
        if (qBadgeView != null) {
            qBadgeView.mo55426c(C46932c.m103406c(qBadgeView, C5275i0.m6236a(24.0f)), C5275i0.m6236a(2.0f), false);
            int iM66650j = C27039d.m66650j(num);
            if (iM66650j <= 0) {
                QBadgeView qBadgeView2 = this.f39668k;
                if (qBadgeView2 != null) {
                    qBadgeView2.mo55425b(0);
                    return;
                }
                return;
            }
            if (iM66650j > 9) {
                QBadgeView qBadgeView3 = this.f39668k;
                if (qBadgeView3 != null) {
                    qBadgeView3.m55420C("9+");
                    return;
                }
                return;
            }
            QBadgeView qBadgeView4 = this.f39668k;
            if (qBadgeView4 != null) {
                qBadgeView4.mo55425b(iM66650j);
            }
        }
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return "otc?type=0";
    }

    /* JADX INFO: renamed from: h0 */
    private final void m48392h0() {
        C37667p0 c37667p0M48397b0 = m48397b0();
        if (c37667p0M48397b0 == null) {
            return;
        }
        getTitleBar().m58934f();
        RadioGroupPlus radioGroupPlus = c37667p0M48397b0.f84384b;
        ViewParent parent = c37667p0M48397b0.f84388f.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f39668k = (QBadgeView) C46932c.m103404a(new QBadgeView(viewGroup.getContext())).mo55429f(viewGroup);
        ViewParent parent2 = c37667p0M48397b0.f84385c.getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) parent2;
        this.f39669l = (QBadgeView) C46932c.m103404a(new QBadgeView(viewGroup2.getContext())).mo55429f(viewGroup2);
        radioGroupPlus.setOnCheckedChangeListener(new C21066a(c37667p0M48397b0));
        radioGroupPlus.m54743f(R$id.p2p);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m48394j0(P2PActivity p2PActivity, BadgeInfo badgeInfo) {
        p2PActivity.m48401m0(badgeInfo.getProcessingOrderCount());
        p2PActivity.m48400l0(badgeInfo.getMessageUnreadCount());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final void m48396n0() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            if (fragment.isAdded() && !(fragment instanceof DialogFragment)) {
                fragmentTransactionBeginTransaction.hide(fragment);
                fragmentTransactionBeginTransaction.setMaxLifecycle(fragment, Lifecycle.State.STARTED);
            }
        }
        int i11 = this.f39667j;
        Fragment fragment2 = null;
        if (i11 == R$id.orderHistory) {
            Fragment fragment3 = this.f39671n;
            if (fragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderHistoryFragment");
                fragment3 = null;
            }
            if (!fragment3.isAdded()) {
                int i12 = R$id.fragmentContainer;
                Fragment fragment4 = this.f39671n;
                if (fragment4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderHistoryFragment");
                    fragment4 = null;
                }
                fragmentTransactionBeginTransaction.add(i12, fragment4, "orderHistoryFragment");
            } else {
                Fragment fragment5 = this.f39671n;
                if (fragment5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderHistoryFragment");
                    fragment5 = null;
                }
                fragmentTransactionBeginTransaction.show(fragment5);
            }
            Fragment fragment6 = this.f39671n;
            if (fragment6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderHistoryFragment");
                fragment6 = null;
            }
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragment6, Lifecycle.State.RESUMED);
            C43852m.m96599k("B7P2POrders", null, 2, null);
        } else if (i11 == R$id.chat) {
            Fragment fragment7 = this.f39672o;
            if (fragment7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListFragment");
                fragment7 = null;
            }
            if (!fragment7.isAdded()) {
                int i13 = R$id.fragmentContainer;
                Fragment fragment8 = this.f39672o;
                if (fragment8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatListFragment");
                    fragment8 = null;
                }
                fragmentTransactionBeginTransaction.add(i13, fragment8, "chatFragment");
            } else {
                Fragment fragment9 = this.f39672o;
                if (fragment9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chatListFragment");
                    fragment9 = null;
                }
                fragmentTransactionBeginTransaction.show(fragment9);
            }
            Fragment fragment10 = this.f39672o;
            if (fragment10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("chatListFragment");
                fragment10 = null;
            }
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragment10, Lifecycle.State.RESUMED);
            C43852m.m96599k("B7P2PChat", null, 2, null);
        } else if (i11 == R$id.profile) {
            Fragment fragment11 = this.f39673p;
            if (fragment11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("profileFragment");
                fragment11 = null;
            }
            if (!fragment11.isAdded()) {
                int i14 = R$id.fragmentContainer;
                Fragment fragment12 = this.f39673p;
                if (fragment12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("profileFragment");
                    fragment12 = null;
                }
                fragmentTransactionBeginTransaction.add(i14, fragment12, "profileFragment");
            } else {
                Fragment fragment13 = this.f39673p;
                if (fragment13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("profileFragment");
                    fragment13 = null;
                }
                fragmentTransactionBeginTransaction.show(fragment13);
            }
            Fragment fragment14 = this.f39673p;
            if (fragment14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("profileFragment");
                fragment14 = null;
            }
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragment14, Lifecycle.State.RESUMED);
            C43852m.m96599k("B7P2PProfile", null, 2, null);
        } else {
            Fragment fragment15 = this.f39670m;
            if (fragment15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("p2pHomeFragment");
                fragment15 = null;
            }
            if (!fragment15.isAdded()) {
                int i15 = R$id.fragmentContainer;
                Fragment fragment16 = this.f39670m;
                if (fragment16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("p2pHomeFragment");
                    fragment16 = null;
                }
                fragmentTransactionBeginTransaction.add(i15, fragment16, "p2pHomeFragment");
            } else {
                Fragment fragment17 = this.f39670m;
                if (fragment17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("p2pHomeFragment");
                    fragment17 = null;
                }
                fragmentTransactionBeginTransaction.show(fragment17);
            }
            Fragment fragment18 = this.f39670m;
            if (fragment18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("p2pHomeFragment");
            } else {
                fragment2 = fragment18;
            }
            Intrinsics.checkNotNull(fragmentTransactionBeginTransaction.setMaxLifecycle(fragment2, Lifecycle.State.RESUMED));
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        EdgeToEdgeCompat.f48106a.m58279q(this, Integer.valueOf(ContextCompat.getColor(this, R$color.c_overlay)));
        setContentView(R$layout.payment_activity_p2p);
        m48391g0();
        m48399f0();
        m48392h0();
        m48393i0();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        super.onDestroy();
        C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.p2p.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PActivity.m48395k0();
            }
        });
        KuCoinLooper.INSTANCE.removeTask("p2pHeartBeatReport");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        P2PViewModel p2PViewModel = this.f39674q;
        if (p2PViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("p2pVM");
            p2PViewModel = null;
        }
        p2PViewModel.m48464C();
    }
}
