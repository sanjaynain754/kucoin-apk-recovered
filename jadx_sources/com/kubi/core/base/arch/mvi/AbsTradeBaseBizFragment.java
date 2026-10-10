package com.kubi.core.base.arch.mvi;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import be.InterfaceC4578a;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizVM;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.core.biz.CoreBizShareViewModel;
import com.kubi.core.biz.symbol.C12247g;
import com.kubi.core.biz.symbol.ShareSymbolBizVM;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p722wd.C45792a;
import p722wd.InterfaceC45793b;
import p827zc.AbstractC46753c;
import p827zc.C46755e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: AbsTradeBaseBizFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\u0014\b\u0002\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00062\u00020\u00072\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020)H\u0004J\u0015\u0010*\u001a\u00028\u00022\u0006\u0010+\u001a\u00020,H&¢\u0006\u0002\u0010-J\n\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0014J\u000e\u00103\u001a\u0002012\u0006\u00104\u001a\u000205JP\u00106\u001a\u000201\"\u0004\b\u0003\u00107*\n\u0012\u0006\u0012\u0004\u0018\u0001H70821\u00109\u001a-\b\u0001\u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\n\u0012\b\u0012\u0004\u0012\u0002010>\u0012\u0006\u0012\u0004\u0018\u00010?0:¢\u0006\u0002\u0010@JN\u0010A\u001a\u000201\"\u0004\b\u0003\u00107*\b\u0012\u0004\u0012\u0002H70821\u00109\u001a-\b\u0001\u0012\u0013\u0012\u0011H7¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\n\u0012\b\u0012\u0004\u0012\u0002010>\u0012\u0006\u0012\u0004\u0018\u00010?0:¢\u0006\u0002\u0010@R\u001b\u0010\u000b\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00028\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&¨\u0006B"}, m90084d2 = {"Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "I", "Lcom/kubi/mvi/state/IIntent;", ExifInterface.LATITUDE_SOUTH, "Lcom/kubi/mvi/state/IState;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/mvi/state/BaseStateFragment;", "<init>", "()V", "bizShareViewModel", "Lcom/kubi/core/biz/CoreBizShareViewModel;", "getBizShareViewModel$TradeCoreBizLib_googleRelease", "()Lcom/kubi/core/biz/CoreBizShareViewModel;", "bizShareViewModel$delegate", "Lkotlin/Lazy;", "getParentContainerFragment", "Landroidx/fragment/app/Fragment;", "asyncInit", "", "getAsyncInit", "()Z", "symbolBizVM", "Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "getSymbolBizVM", "()Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "symbolBizVM$delegate", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "needLoadingView", "getNeedLoadingView", "setNeedLoadingView", "(Z)V", "bizVm", "getBizVm$TradeCoreBizLib_googleRelease", "()Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "bizVm$delegate", "getBaseTradeCoreFragment", "Lcom/kubi/core/biz/BaseTradeCoreFragment;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "(Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;)Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizVM;", "getViewModeFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "updateBizFragmentVisible", "", ViewProps.VISIBLE, "sendShareEvent", "event", "Lcom/kubi/core/biz/sharevm/IShareCoreBizEvent;", "collectNotNullLatest", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "collectLatestData", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsTradeBaseBizFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsTradeBaseBizFragment.kt\ncom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n106#2,15:129\n477#3:144\n127#3,2:145\n183#3,2:147\n1#4:149\n*S KotlinDebug\n*F\n+ 1 AbsTradeBaseBizFragment.kt\ncom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment\n*L\n40#1:129,15\n49#1:144\n76#1:145,2\n59#1:147,2\n*E\n"})
public abstract class AbsTradeBaseBizFragment<I extends InterfaceC19282d, S extends InterfaceC19284f, V extends AbsTradeBaseBizVM<I, S>> extends BaseStateFragment<I, S, V> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f20063U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f20064V;

    /* JADX INFO: renamed from: W */
    public boolean f20065W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f20066X;

    /* JADX INFO: renamed from: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$a */
    /* JADX INFO: compiled from: _Sequences.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3218:1\n*E\n"})
    public static final class C11585a implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: b */
        public static final C11585a f20067b = new C11585a();

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof BaseTradeCoreFragment);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$b */
    /* JADX INFO: compiled from: AbsTradeBaseBizFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment$getViewModeFactory$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11586b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbsTradeBaseBizFragment<I, S, V> f20068a;

        public C11586b(AbsTradeBaseBizFragment<I, S, V> absTradeBaseBizFragment) {
            this.f20068a = absTradeBaseBizFragment;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            AbsTradeBaseBizFragment<I, S, V> absTradeBaseBizFragment = this.f20068a;
            T tCast = modelClass.cast(absTradeBaseBizFragment.mo21017v3(C46755e.m103018c(absTradeBaseBizFragment, null, 1, null)));
            Intrinsics.checkNotNullExpressionValue(tCast, "cast(...)");
            return tCast;
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public boolean getAsyncInit() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: v3 */
    public abstract V mo21017v3(@NotNull AbstractC46753c abstractC46753c);

    @NotNull
    /* JADX INFO: renamed from: y3 */
    public abstract InterfaceC4578a getF20887b0();

    /* JADX INFO: renamed from: C3 */
    public static final Fragment m20999C3(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Fragment m21001G3(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }

    /* JADX INFO: renamed from: x3 */
    public static final Fragment m21010x3(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }

    @NotNull
    /* JADX INFO: renamed from: A3 */
    public final V m21011A3() {
        return (V) this.f20066X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: D3 */
    public final ShareSymbolBizVM m21013D3() {
        return (ShareSymbolBizVM) this.f20064V.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public final void m21014E3(@NotNull InterfaceC45793b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m21020z3().m21740s(event);
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17467W() {
        return this.f20065W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @Nullable
    public ViewModelProvider.Factory getViewModeFactory() {
        return new C11586b(this);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f20065W = z11;
    }

    /* JADX INFO: renamed from: u3 */
    public final <T> void m21016u3(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(interfaceC41634e, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AbsTradeBaseBizFragment$collectLatestData$1(interfaceC41634e, action, null));
    }

    @NotNull
    /* JADX INFO: renamed from: z3 */
    public final CoreBizShareViewModel m21020z3() {
        return (CoreBizShareViewModel) this.f20063U.getValue();
    }

    public AbsTradeBaseBizFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.base.arch.mvi.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsTradeBaseBizFragment.m21008s3(this.f20071b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f20063U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CoreBizShareViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f20064V = LazyKt.lazy(new Function0() { // from class: com.kubi.core.base.arch.mvi.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsTradeBaseBizFragment.m21000F3(this.f20072b);
            }
        });
        this.f20066X = LazyKt.lazy(new Function0() { // from class: com.kubi.core.base.arch.mvi.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsTradeBaseBizFragment.m21009t3(this.f20073b);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public static final ShareSymbolBizVM m21000F3(AbsTradeBaseBizFragment absTradeBaseBizFragment) {
        Object next;
        BaseTradeCoreFragment baseTradeCoreFragment;
        ShareSymbolBizVM shareSymbolBizVMM21244w3;
        Iterator it = SequencesKt.generateSequence(absTradeBaseBizFragment.requireParentFragment(), (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: com.kubi.core.base.arch.mvi.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsTradeBaseBizFragment.m21001G3((Fragment) obj);
            }
        }).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof BaseTradeCoreFragment));
        if (next instanceof BaseTradeCoreFragment) {
            baseTradeCoreFragment = (BaseTradeCoreFragment) next;
        } else {
            baseTradeCoreFragment = null;
        }
        if (baseTradeCoreFragment != null && (shareSymbolBizVMM21244w3 = baseTradeCoreFragment.m21244w3()) != null) {
            return shareSymbolBizVMM21244w3;
        }
        return C12247g.m22750b(absTradeBaseBizFragment, null, 2, null);
    }

    /* JADX INFO: renamed from: s3 */
    public static final ViewModelStoreOwner m21008s3(AbsTradeBaseBizFragment absTradeBaseBizFragment) {
        return absTradeBaseBizFragment.m21012B3();
    }

    /* JADX INFO: renamed from: t3 */
    public static final AbsTradeBaseBizVM m21009t3(AbsTradeBaseBizFragment absTradeBaseBizFragment) {
        AbsTradeBaseBizVM absTradeBaseBizVM;
        ViewModelProvider.Factory viewModeFactory = absTradeBaseBizFragment.getViewModeFactory();
        if (viewModeFactory != null && (absTradeBaseBizVM = (AbsTradeBaseBizVM) MviExKt.m42513i(absTradeBaseBizFragment, absTradeBaseBizFragment.getVmClass(), viewModeFactory)) != null) {
            return absTradeBaseBizVM;
        }
        return (AbsTradeBaseBizVM) MviExKt.m42514j(absTradeBaseBizFragment, absTradeBaseBizFragment.getVmClass(), null, 2, null);
    }

    /* JADX INFO: renamed from: B3 */
    public final Fragment m21012B3() {
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.generateSequence(getParentFragment(), (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: com.kubi.core.base.arch.mvi.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsTradeBaseBizFragment.m20999C3((Fragment) obj);
            }
        }), C11585a.f20067b);
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        BaseTradeCoreFragment baseTradeCoreFragment = (BaseTradeCoreFragment) SequencesKt.firstOrNull(sequenceFilter);
        if (baseTradeCoreFragment != null) {
            return baseTradeCoreFragment;
        }
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: H3 */
    public final void m21015H3(boolean z11) {
        m21020z3().m21740s(new C45792a(getF20887b0(), m21013D3().m22740t().getSymbol(), z11));
    }

    @NotNull
    /* JADX INFO: renamed from: w3 */
    public final BaseTradeCoreFragment m21018w3() {
        for (Object obj : SequencesKt.generateSequence(requireParentFragment(), (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: com.kubi.core.base.arch.mvi.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbsTradeBaseBizFragment.m21010x3((Fragment) obj2);
            }
        })) {
            if (((Fragment) obj) instanceof BaseTradeCoreFragment) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.kubi.core.biz.BaseTradeCoreFragment");
                return (BaseTradeCoreFragment) obj;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }
}
