package com.kubi.assets.options;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.options.assets.OptionsAssetListFragment;
import com.kubi.assets.options.positions.OptionsPositionsFragment;
import com.kubi.assets.options.view.OptionsPnlHeaderView;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27103z;
import hb0.InterfaceC38162f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import jb0.InterfaceC40373g;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44865t0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetOptionsFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 =2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001=B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u00100\u001a\u000201H\u0014J\b\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u000203H\u0016J\b\u00105\u001a\u000203H\u0014J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0014J\b\u00109\u001a\u000203H\u0016J\u0012\u0010:\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010$H\u0016J\b\u0010<\u001a\u000203H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R+\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\n0&j\b\u0012\u0004\u0012\u00020\n`(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b.\u0010*¨\u0006>"}, m90084d2 = {"Lcom/kubi/assets/options/AssetOptionsFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/options/AssetOptionsContract$UiIntent;", "Lcom/kubi/assets/options/AssetOptionsContract$UIState;", "Lcom/kubi/assets/options/AssetOptionsViewModel;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "binding", "Lcom/kubi/assets/databinding/AssetFragmentOptionsBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentOptionsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "optionsOverviewEntity", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "fragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "getFragmentList", "()Ljava/util/ArrayList;", "fragmentList$delegate", "Lkotlin/Lazy;", "titleList", "getTitleList", "titleList$delegate", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onRefresh", "onAssetsGet", "myAssetEntity", "loadData", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetOptionsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOptionsFragment.kt\ncom/kubi/assets/options/AssetOptionsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n147#2,16:147\n135#3,2:163\n1#4:165\n*S KotlinDebug\n*F\n+ 1 AssetOptionsFragment.kt\ncom/kubi/assets/options/AssetOptionsFragment\n*L\n51#1:147,16\n102#1:163,2\n*E\n"})
public final class AssetOptionsFragment extends BaseStateFragment<AssetOptionsContract$UiIntent, UIState, AssetOptionsViewModel> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    public boolean f18114V;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f18116X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public OptionsOverviewEntity f18117Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public AssetV2OverviewEntity f18118Z;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f18112d0 = {Reflection.property1(new PropertyReference1Impl(AssetOptionsFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentOptionsBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f18111c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @Nullable
    public String f18113U = "B4optionsAccount";

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f18115W = C45681e.m100799e(this, new Function1<AssetOptionsFragment, C44865t0>() { // from class: com.kubi.assets.options.AssetOptionsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44865t0 invoke(@NotNull AssetOptionsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44865t0.m99254a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44865t0, Unit>() { // from class: com.kubi.assets.options.AssetOptionsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44865t0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44865t0 c44865t0) {
            invoke(c44865t0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f18119a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOptionsFragment.m18064t3();
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f18120b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.options.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetOptionsFragment.m18056A3(this.f18142b);
        }
    });

    /* JADX INFO: compiled from: AssetOptionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/options/AssetOptionsFragment$Companion;", "", "<init>", "()V", "DEFAULT_POSITION", "", "newInstance", "Lcom/kubi/assets/options/AssetOptionsFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetOptionsFragment newInstance() {
            return new AssetOptionsFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.AssetOptionsFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetOptionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.AssetOptionsFragment$bindState$2", m90122f = "AssetOptionsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105162 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C105162(Continuation<? super C105162> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105162 c105162 = AssetOptionsFragment.this.new C105162(continuation);
            c105162.Z$0 = ((Boolean) obj).booleanValue();
            return c105162;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C105162) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetOptionsHeaderView assetOptionsHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44865t0 c44865t0M18069u3 = AssetOptionsFragment.this.m18069u3();
            ShowHideTextView.m54778d(c44865t0M18069u3 != null ? c44865t0M18069u3.f100856d : null, z11);
            C44865t0 c44865t0M18069u4 = AssetOptionsFragment.this.m18069u3();
            if (c44865t0M18069u4 != null && (assetOptionsHeaderView = c44865t0M18069u4.f100856d) != null && (accountInfoHeader = assetOptionsHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.options.AssetOptionsFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetOptionsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/OptionsOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.options.AssetOptionsFragment$bindState$4", m90122f = "AssetOptionsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105184 extends SuspendLambda implements Function2<OptionsOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(OptionsOverviewEntity optionsOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C105184) create(optionsOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C105184(Continuation<? super C105184> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105184 c105184 = AssetOptionsFragment.this.new C105184(continuation);
            c105184.L$0 = obj;
            return c105184;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetOptionsHeaderView assetOptionsHeaderView;
            AssetOptionsHeaderView assetOptionsHeaderView2;
            OptionsPnlHeaderView pnlViewHeader;
            OptionsOverviewEntity optionsOverviewEntity = (OptionsOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (optionsOverviewEntity != null) {
                AssetOptionsFragment assetOptionsFragment = AssetOptionsFragment.this;
                assetOptionsFragment.f18117Y = optionsOverviewEntity;
                C44865t0 c44865t0M18069u3 = assetOptionsFragment.m18069u3();
                if (c44865t0M18069u3 != null && (assetOptionsHeaderView2 = c44865t0M18069u3.f100856d) != null && (pnlViewHeader = assetOptionsHeaderView2.getPnlViewHeader()) != null) {
                    pnlViewHeader.m18191a(optionsOverviewEntity);
                }
                C44865t0 c44865t0M18069u4 = assetOptionsFragment.m18069u3();
                if (c44865t0M18069u4 != null && (assetOptionsHeaderView = c44865t0M18069u4.f100856d) != null) {
                    assetOptionsHeaderView.m18076d(optionsOverviewEntity, assetOptionsFragment.f18118Z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: z3 */
    private final void m18068z3() {
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(new AssetOptionsContract$UiIntent.FetchOptionsOverview(AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency()));
    }

    /* JADX INFO: renamed from: A3 */
    public static final ArrayList m18056A3(AssetOptionsFragment assetOptionsFragment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(assetOptionsFragment.getString(R$string.option_position));
        arrayList.add(assetOptionsFragment.getString(R$string.option_assets));
        return arrayList;
    }

    /* JADX INFO: renamed from: t3 */
    public static final ArrayList m18064t3() {
        return CollectionsKt.arrayListOf(OptionsPositionsFragment.f18162c0.newInstance(), OptionsAssetListFragment.f18133Z.newInstance());
    }

    /* JADX INFO: renamed from: w3 */
    private final ArrayList<String> m18065w3() {
        return (ArrayList) this.f18120b0.getValue();
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m18066x3(AssetOptionsFragment assetOptionsFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetOptionsFragment.sendIntent(new AssetOptionsContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m18067y3(AssetOptionsFragment assetOptionsFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetOptionsFragment.m18068z3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.options.AssetOptionsFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C105162(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.options.AssetOptionsFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getOptionsOverviewEntity();
            }
        }, new C105184(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            C44865t0 c44865t0M18069u3 = m18069u3();
            if (c44865t0M18069u3 != null && (kuCoinRefreshLayout = c44865t0M18069u3.f100857e) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView = this.f18116X;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_options;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF34299W() {
        return this.f18114V;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF34298V() {
        return this.f18113U;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetOptionsViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetOptionsViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18114V = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f18113U = str;
    }

    /* JADX INFO: renamed from: u3 */
    public final C44865t0 m18069u3() {
        return (C44865t0) this.f18115W.getValue(this, f18112d0[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final ArrayList<BaseFragment> m18070v3() {
        return (ArrayList) this.f18119a0.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        SlidingTabLayout slidingTabLayout;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        CustomViewPager customViewPager;
        CustomViewPager customViewPager2;
        CustomViewPager customViewPager3;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        AssetOptionsHeaderView assetOptionsHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        AssetOptionsHeaderView assetOptionsHeaderView2;
        C44865t0 c44865t0M18069u3 = m18069u3();
        CustomViewPager customViewPager4 = null;
        if (c44865t0M18069u3 != null) {
            coordinatorLayout = c44865t0M18069u3.f100855c;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f18116X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44865t0 c44865t0M18069u4 = m18069u3();
        if (c44865t0M18069u4 != null && (assetOptionsHeaderView2 = c44865t0M18069u4.f100856d) != null) {
            assetOptionsHeaderView2.m18075c(this);
        }
        C44865t0 c44865t0M18069u5 = m18069u3();
        if (c44865t0M18069u5 != null && (assetOptionsHeaderView = c44865t0M18069u5.f100856d) != null && (accountInfoHeader = assetOptionsHeaderView.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.options.d
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AssetOptionsFragment.m18066x3(this.f18143b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44865t0 c44865t0M18069u6 = m18069u3();
        if (c44865t0M18069u6 != null && (kuCoinRefreshLayout = c44865t0M18069u6.f100857e) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.options.e
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetOptionsFragment.m18067y3(this.f18150b, interfaceC38162f);
                }
            });
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C27103z c27103z = new C27103z(childFragmentManager, m18070v3(), m18065w3());
        C44865t0 c44865t0M18069u7 = m18069u3();
        if (c44865t0M18069u7 != null && (customViewPager3 = c44865t0M18069u7.f100859g) != null) {
            customViewPager3.setAdapter(c27103z);
        }
        C44865t0 c44865t0M18069u8 = m18069u3();
        if (c44865t0M18069u8 != null && (customViewPager2 = c44865t0M18069u8.f100859g) != null) {
            customViewPager2.setOffscreenPageLimit(m18070v3().size());
        }
        C44865t0 c44865t0M18069u9 = m18069u3();
        if (c44865t0M18069u9 != null && (customViewPager = c44865t0M18069u9.f100859g) != null) {
            customViewPager.setCurrentItem(0);
        }
        C44865t0 c44865t0M18069u10 = m18069u3();
        if (c44865t0M18069u10 != null && (slidingTabLayout3 = c44865t0M18069u10.f100858f) != null) {
            C44865t0 c44865t0M18069u11 = m18069u3();
            if (c44865t0M18069u11 != null) {
                customViewPager4 = c44865t0M18069u11.f100859g;
            }
            slidingTabLayout3.setViewPager(customViewPager4);
        }
        C44865t0 c44865t0M18069u12 = m18069u3();
        if (c44865t0M18069u12 != null && (slidingTabLayout2 = c44865t0M18069u12.f100858f) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        C44865t0 c44865t0M18069u13 = m18069u3();
        if (c44865t0M18069u13 != null && (slidingTabLayout = c44865t0M18069u13.f100858f) != null) {
            slidingTabLayout.setCurrentTab(0);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        if (!isShowing()) {
            return;
        }
        C44865t0 c44865t0M18069u3 = m18069u3();
        if (c44865t0M18069u3 != null && (kuCoinRefreshLayout = c44865t0M18069u3.f100857e) != null) {
            kuCoinRefreshLayout.setRefreshing(true);
        }
        m18068z3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m18068z3();
        sendIntent(new AssetOptionsContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44865t0 c44865t0M18069u3;
        AssetOptionsHeaderView assetOptionsHeaderView;
        if (getContext() != null && isShowing()) {
            this.f18118Z = assetV2OverviewEntity;
            OptionsOverviewEntity optionsOverviewEntity = this.f18117Y;
            if (optionsOverviewEntity != null && (c44865t0M18069u3 = m18069u3()) != null && (assetOptionsHeaderView = c44865t0M18069u3.f100856d) != null) {
                assetOptionsHeaderView.m18076d(optionsOverviewEntity, this.f18118Z);
            }
        }
    }
}
