package com.kubi.broker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.copytrading.ICopyTradingService;
import com.kubi.futures.entry.IFuturesFragmentController;
import com.kubi.futures.trade.vm.FuturesComposeStreamViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.sdk.BaseFragment;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import com.kubi.user.model.AccountState;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FuturesFacedFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0006H\u0002J\b\u0010'\u001a\u00020\u001bH\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u0006H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/broker/FuturesFacedFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/futures/entry/IFuturesFragmentController;", "<init>", "()V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "isTransactionExecuting", "setRootTopPadding", "getSetRootTopPadding", "setRootTopPadding$delegate", "Lkotlin/Lazy;", "currentFragment", "Lcom/kubi/kumex/trade/FuturesFragment;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onArguments", "bundle", "toggleFragmentByType", "isUnified", "isCopytd", "showLeaderGuideTip", "reloadCurrentFragment", "toggle2ClassicFragment", "toggle2CopytdFragment", "isNeedShowLeaderTips", "toggle2UnifiedFragment", "handleKlineInMaintenance", TIMPushProvider.f75062n, "refresh", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesFacedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFacedFragment.kt\ncom/kubi/broker/FuturesFacedFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1869#2,2:227\n1869#2,2:229\n1869#2,2:231\n*S KotlinDebug\n*F\n+ 1 FuturesFacedFragment.kt\ncom/kubi/broker/FuturesFacedFragment\n*L\n160#1:227,2\n180#1:229,2\n203#1:231,2\n*E\n"})
public final class FuturesFacedFragment extends BaseFragment implements IFuturesFragmentController {

    /* JADX INFO: renamed from: U */
    public boolean f19214U;

    /* JADX INFO: renamed from: V */
    public boolean f19215V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f19216W = LazyKt.lazy(new Function0() { // from class: com.kubi.broker.e
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FuturesFacedFragment.m20213v3(this.f19221b));
        }
    });

    /* JADX INFO: renamed from: X */
    @Nullable
    public FuturesFragment f19217X;

    /* JADX INFO: renamed from: com.kubi.broker.FuturesFacedFragment$onViewCreated$1 */
    /* JADX INFO: compiled from: FuturesFacedFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/broker/IBrokerConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.broker.FuturesFacedFragment$onViewCreated$1", m90122f = "FuturesFacedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C113561 extends SuspendLambda implements Function2<IBrokerConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(IBrokerConfig iBrokerConfig, Continuation<? super Unit> continuation) {
            return ((C113561) create(iBrokerConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C113561(Continuation<? super C113561> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C113561 c113561 = FuturesFacedFragment.this.new C113561(continuation);
            c113561.L$0 = obj;
            return c113561;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IBrokerConfig iBrokerConfig = (IBrokerConfig) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FuturesFacedFragment.this.m20221z3(iBrokerConfig.mo4515x() == MultiBizType.UNIFIED, iBrokerConfig.mo4515x() == MultiBizType.COPY_TRADING, iBrokerConfig.getF79458a());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public static final Unit m20211s3(Throwable th2) {
        return Unit.INSTANCE;
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: B0 */
    public void mo20214B0() {
        FuturesFragment futuresFragment = this.f19217X;
        if (futuresFragment != null) {
            futuresFragment.mo20214B0();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF19214U() {
        return this.f19214U;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_futures_faced, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: p3 */
    public final boolean m20215p3() {
        return ((Boolean) this.f19216W.getValue()).booleanValue();
    }

    @Override // com.kubi.futures.entry.IFuturesFragmentController
    /* JADX INFO: renamed from: q1 */
    public void mo20216q1(boolean z11) {
        FuturesFragment futuresFragment = this.f19217X;
        if (futuresFragment != null) {
            futuresFragment.mo20216q1(z11);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f19214U = z11;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m20217u3() {
        if (this.f19215V || getChildFragmentManager().isDestroyed()) {
            return;
        }
        this.f19217X = null;
        boolean zMo64979C = IUnifyAccountService.f53155a.get().mo64979C();
        ICopyTradingService.Companion companion = ICopyTradingService.f19723a;
        m20221z3(zMo64979C, companion.get().mo20635p(), companion.get().mo20624e());
    }

    /* JADX INFO: renamed from: w3 */
    public final void m20218w3() {
        if (this.f19215V) {
            return;
        }
        FuturesFragment futuresFragment = this.f19217X;
        if ((futuresFragment != null ? futuresFragment.m36172c6() : null) == MultiBizType.CLASSIC) {
            return;
        }
        FuturesComposeStreamViewModel.m.resetTrialSwitchCache();
        this.f19215V = true;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            fragmentTransactionBeginTransaction.remove((Fragment) it.next());
        }
        int i11 = R$id.futuresFragmentId;
        FuturesFragment futuresFragmentNewInstance$default = FuturesFragment.Companion.newInstance$default(FuturesFragment.f30411o0, MultiBizType.CLASSIC, m20215p3(), false, 4, null);
        this.f19217X = futuresFragmentNewInstance$default;
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.add(i11, futuresFragmentNewInstance$default);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.f19215V = false;
    }

    /* JADX INFO: renamed from: x3 */
    public final void m20219x3(boolean z11) {
        if (this.f19215V) {
            return;
        }
        FuturesFragment futuresFragment = this.f19217X;
        if ((futuresFragment != null ? futuresFragment.m36172c6() : null) == MultiBizType.COPY_TRADING) {
            return;
        }
        this.f19215V = true;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            fragmentTransactionBeginTransaction.remove((Fragment) it.next());
        }
        int i11 = R$id.futuresFragmentId;
        FuturesFragment futuresFragmentNewInstance = FuturesFragment.f30411o0.newInstance(MultiBizType.COPY_TRADING, m20215p3(), z11);
        this.f19217X = futuresFragmentNewInstance;
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.add(i11, futuresFragmentNewInstance);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.f19215V = false;
    }

    /* JADX INFO: renamed from: y3 */
    public final void m20220y3() {
        if (this.f19215V) {
            return;
        }
        FuturesFragment futuresFragment = this.f19217X;
        if ((futuresFragment != null ? futuresFragment.m36172c6() : null) == MultiBizType.UNIFIED) {
            return;
        }
        FuturesComposeStreamViewModel.m.resetTrialSwitchCache();
        this.f19215V = true;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            fragmentTransactionBeginTransaction.remove((Fragment) it.next());
        }
        int i11 = R$id.futuresFragmentId;
        FuturesFragment futuresFragmentNewInstance$default = FuturesFragment.Companion.newInstance$default(FuturesFragment.f30411o0, MultiBizType.UNIFIED, m20215p3(), false, 4, null);
        this.f19217X = futuresFragmentNewInstance$default;
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.add(i11, futuresFragmentNewInstance$default);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        this.f19215V = false;
    }

    /* JADX INFO: renamed from: z3 */
    public final void m20221z3(boolean z11, boolean z12, boolean z13) {
        if (z12) {
            m20219x3(z13);
        } else if (z11) {
            m20220y3();
        } else {
            m20218w3();
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m20209q3(FuturesFacedFragment futuresFacedFragment, AccountEventState accountEventState) {
        if (accountEventState.getState() == AccountState.SwitchAccount || accountEventState.getState() == AccountState.Login) {
            futuresFacedFragment.m20217u3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final void m20210r3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m20212t3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v3 */
    public static final boolean m20213v3(FuturesFacedFragment futuresFacedFragment) {
        Boolean boolValueOf;
        Bundle arguments = futuresFacedFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("set_root_top_padding"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        super.onArguments(bundle);
        FuturesFragment futuresFragment = this.f19217X;
        if (futuresFragment != null) {
            futuresFragment.onArguments(bundle);
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C41636g.m90891O(C41636g.m90896T(BrokerConfig.f19211a.m20202e(), new C113561(null)), LifecycleOwnerKt.getLifecycleScope(this));
        boolean zMo64979C = IUnifyAccountService.f53155a.get().mo64979C();
        ICopyTradingService.Companion companion = ICopyTradingService.f19723a;
        m20221z3(zMo64979C, companion.get().mo20635p(), companion.get().mo20624e());
        Observable observableA = UserInfo.a.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.broker.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFacedFragment.m20209q3(this.f19218b, (AccountEventState) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.broker.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFacedFragment.m20210r3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.broker.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesFacedFragment.m20211s3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableA.subscribe(consumer, new Consumer() { // from class: com.kubi.broker.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FuturesFacedFragment.m20212t3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }
}
