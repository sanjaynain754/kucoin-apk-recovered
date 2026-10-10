package com.kubi.home.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$dimen;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.CardsViewModel;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.common.card.HomeCardsRepository;
import com.kubi.home.common.card.HomeGroupCardViewHolder;
import com.kubi.home.main.refresh.HomePullRefresh;
import com.kubi.home.main.shimmer.HomeShimmerLayout;
import com.kubi.home.navigation.NavigationCard;
import com.kubi.home.navigation.NavigationState;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.BaseCardFragment;
import com.kubi.kucoin.home.cards.CardAdapter;
import com.kubi.kucoin.home.cards.ClassMapping;
import com.kubi.kucoin.home.cards.ICard;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36722g;
import fj.C37516e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.InterfaceC43850k;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: HomeFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J$\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u00104\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u0002032\u0006\u0010=\u001a\u0002072\b\u00104\u001a\u0004\u0018\u000105H\u0016J\u0010\u0010>\u001a\u0002032\u0006\u0010?\u001a\u00020\u0012H\u0002J\b\u0010@\u001a\u000203H\u0002J\b\u0010A\u001a\u000203H\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0016J\u0010\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020\u000bH\u0016J\b\u0010F\u001a\u000203H\u0016J\b\u0010G\u001a\u000203H\u0016J\b\u0010H\u001a\u000203H\u0016J\b\u0010I\u001a\u000203H\u0016J\b\u0010J\u001a\u000203H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R\u001d\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006L"}, m90084d2 = {"Lcom/kubi/home/main/HomeFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/home/databinding/KucoinFragmentHomeBinding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/KucoinFragmentHomeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "mPageIsShowIng", "mUpgradeCount", "", "mUpgradeHaveShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cardsViewModel", "Lcom/kubi/home/common/card/CardsViewModel;", "getCardsViewModel", "()Lcom/kubi/home/common/card/CardsViewModel;", "cardsViewModel$delegate", "Lkotlin/Lazy;", "homeVM", "Lcom/kubi/home/main/HomeVM;", "getHomeVM", "()Lcom/kubi/home/main/HomeVM;", "homeVM$delegate", "homeUIHelper", "Lcom/kubi/home/main/HomeUIHelper;", "getHomeUIHelper", "()Lcom/kubi/home/main/HomeUIHelper;", "homeUIHelper$delegate", "navigationCardFragment", "Lcom/kubi/home/navigation/NavigationCard;", "getNavigationCardFragment", "()Lcom/kubi/home/navigation/NavigationCard;", "navigationCardFragment$delegate", "homePullRefresh", "Lcom/kubi/home/main/refresh/HomePullRefresh;", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateNavLayout", "statusBarHeight", "initView", "observe", "bindFlowEvent", "onLoad", "onHiddenChanged", ViewProps.HIDDEN, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onResume", "onAgainShow", "checkUpgrade", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/kubi/home/main/HomeFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n147#2,16:302\n76#3,7:318\n76#3,7:325\n174#3,6:332\n76#3,7:338\n81#3,2:345\n76#3,7:347\n76#3,7:354\n153#3,7:361\n153#3,7:368\n220#4,5:375\n220#4,5:380\n1#5:385\n1869#6,2:386\n1869#6,2:388\n1869#6,2:390\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/kubi/home/main/HomeFragment\n*L\n74#1:302,16\n179#1:318,7\n186#1:325,7\n194#1:332,6\n197#1:338,7\n201#1:345,2\n207#1:347,7\n213#1:354,7\n224#1:361,7\n226#1:368,7\n85#1:375,5\n86#1:380,5\n139#1:386,2\n143#1:388,2\n158#1:390,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_home")
public final class HomeFragment extends BaseFragment {

    /* JADX INFO: renamed from: V */
    public boolean f25715V;

    /* JADX INFO: renamed from: W */
    public boolean f25716W;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public HomePullRefresh f25723d0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f25713g0 = {Reflection.property1(new PropertyReference1Impl(HomeFragment.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/KucoinFragmentHomeBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f25712f0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f25714U = C45681e.m100799e(this, new Function1<HomeFragment, C37516e0>() { // from class: com.kubi.home.main.HomeFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37516e0 invoke(@NotNull HomeFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37516e0.m84492a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37516e0, Unit>() { // from class: com.kubi.home.main.HomeFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37516e0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37516e0 c37516e0) {
            invoke(c37516e0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public int f25717X = 2;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f25718Y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f25719Z = LazyKt.lazy(new Function0() { // from class: com.kubi.home.main.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragment.m29277A3(this.f25768b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f25720a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.main.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragment.m29279I3(this.f25770b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f25721b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.main.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragment.m29278H3(this.f25772b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f25722c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.main.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragment.m29283M3(this.f25774b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public String f25724e0 = HomeCardViewHolderProxy.PAGE_ID;

    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/main/HomeFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/home/main/HomeFragment;", "PAGE_ID", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeFragment newInstance() {
            return new HomeFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeFragment$a */
    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragment.kt\ncom/kubi/home/main/HomeFragment$bindFlowEvent$7$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n808#2,11:302\n2756#2:313\n1#3:314\n*S KotlinDebug\n*F\n+ 1 HomeFragment.kt\ncom/kubi/home/main/HomeFragment$bindFlowEvent$7$1\n*L\n218#1:302,11\n218#1:313\n218#1:314\n*E\n"})
    public static final class C14590a implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f25726c;

        public C14590a(boolean z11) {
            this.f25726c = z11;
        }

        /* JADX INFO: renamed from: a */
        public final void m29310a() {
            HomeFragment.this.setUserVisibleHint(!this.f25726c);
            List<Fragment> fragments = HomeFragment.this.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseCardFragment) {
                    arrayList.add(obj);
                }
            }
            boolean z11 = this.f25726c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseCardFragment) it.next()).setUserVisibleHint(!z11);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m29310a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeFragment$b */
    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14591b implements Function0<Unit> {
        public C14591b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m29311a() {
            HomePullRefresh homePullRefresh = HomeFragment.this.f25723d0;
            if (homePullRefresh != null) {
                homePullRefresh.m29431G();
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m29311a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeFragment$c */
    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14592c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f25728b;

        public C14592c(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25728b = function;
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
            return this.f25728b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25728b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.main.HomeFragment$onLoad$1 */
    /* JADX INFO: compiled from: HomeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.main.HomeFragment$onLoad$1", m90122f = "HomeFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C145931 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C145931(Continuation<? super C145931> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeFragment.this.new C145931(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C145931) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HomeFragment.this.m29306F3().m29380B();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static final NavigationCard m29283M3(HomeFragment homeFragment) {
        Object objM103844constructorimpl;
        FragmentContainerView fragmentContainerView;
        try {
            Result.Companion companion = Result.INSTANCE;
            C37516e0 c37516e0M29303C3 = homeFragment.m29303C3();
            objM103844constructorimpl = Result.m103844constructorimpl((c37516e0M29303C3 == null || (fragmentContainerView = c37516e0M29303C3.f83241c) == null) ? null : (NavigationCard) fragmentContainerView.getFragment());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (NavigationCard) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: A3 */
    public static final CardsViewModel m29277A3(HomeFragment homeFragment) {
        return (CardsViewModel) new ViewModelProvider(homeFragment).get(CardsViewModel.class);
    }

    /* JADX INFO: renamed from: H3 */
    public static final HomeUIHelper m29278H3(HomeFragment homeFragment) {
        return new HomeUIHelper(homeFragment.m29303C3());
    }

    /* JADX INFO: renamed from: I3 */
    public static final HomeVM m29279I3(HomeFragment homeFragment) {
        return (HomeVM) new ViewModelProvider(homeFragment).get(HomeVM.class);
    }

    /* JADX INFO: renamed from: K3 */
    public static final WindowInsetsCompat m29281K3(HomeFragment homeFragment, View v11, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        homeFragment.m29309P3(insets.getInsets(WindowInsetsCompat.Type.statusBars()).top);
        return insets;
    }

    private final void bindFlowEvent() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:shimmer_show".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:shimmer_show", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:indexHomeCard".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:indexHomeCard", null, this));
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$3(new String[]{"com.kubi.home.event.HomeEvent:updateHomeCards", "com.kubi.user.event.UserEvent:onConfigChange"}, null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:removeHomeCard".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$4("com.kubi.home.event.HomeEvent:removeHomeCard", null, this));
        if (c12573b.m23696a()) {
            "refresh_red_dot".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$1("refresh_red_dot", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:displaySpotlightBg".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$5("com.kubi.home.event.HomeEvent:displaySpotlightBg", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:switchDrawer".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$6("com.kubi.home.event.HomeEvent:switchDrawer", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$7("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
        if (c12573b.m23696a()) {
            "EVENT_FINISH_REFRESH_LOAD".length();
        }
        C12572a.m23692a(this, false, new HomeFragment$bindFlowEvent$$inlined$bindFlowEvent$default$8("EVENT_FINISH_REFRESH_LOAD", null, this));
    }

    private final void initView() {
        ImageView imageView;
        FragmentContainerView fragmentContainerView;
        m29309P3(EdgeToEdgeCompat.f48106a.m58272j());
        C37516e0 c37516e0M29303C3 = m29303C3();
        if (c37516e0M29303C3 != null && (fragmentContainerView = c37516e0M29303C3.f83241c) != null) {
            ViewCompat.setOnApplyWindowInsetsListener(fragmentContainerView, new OnApplyWindowInsetsListener() { // from class: com.kubi.home.main.l
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return HomeFragment.m29281K3(this.f25776b, view, windowInsetsCompat);
                }
            });
        }
        HomeUIHelper.m29339v(m29305E3(), new Function0() { // from class: com.kubi.home.main.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m29282L3(this.f25779b);
            }
        }, new Function0() { // from class: com.kubi.home.main.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragment.m29280J3(this.f25782b);
            }
        }, null, 4, null);
        C37516e0 c37516e0M29303C4 = m29303C3();
        if (c37516e0M29303C4 == null || (imageView = c37516e0M29303C4.f83242d) == null) {
            return;
        }
        imageView.setImageResource(DayNightThemeManager.f28592a.m33187l() ? R$mipmap.home_bg_top : R$mipmap.home_bg_top_dark);
    }

    /* JADX INFO: renamed from: B3 */
    public final void m29302B3() {
        if (this.f25717X <= 0 || this.f25718Y.get()) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFragment$checkUpgrade$1(this, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public final C37516e0 m29303C3() {
        return (C37516e0) this.f25714U.getValue(this, f25713g0[0]);
    }

    /* JADX INFO: renamed from: D3 */
    public final CardsViewModel m29304D3() {
        return (CardsViewModel) this.f25719Z.getValue();
    }

    /* JADX INFO: renamed from: E3 */
    public final HomeUIHelper m29305E3() {
        return (HomeUIHelper) this.f25721b0.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final HomeVM m29306F3() {
        return (HomeVM) this.f25720a0.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final NavigationCard m29307G3() {
        return (NavigationCard) this.f25722c0.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m29309P3(int i11) {
        View view;
        FragmentContainerView fragmentContainerView;
        int iM66635f = C27034h.m66635f(this, R$dimen.ui_title_bar_height) + i11;
        C37516e0 c37516e0M29303C3 = m29303C3();
        if (c37516e0M29303C3 != null && (fragmentContainerView = c37516e0M29303C3.f83241c) != null) {
            ViewExtKt.m66584o(fragmentContainerView, 0, i11, 0, 0);
        }
        C37516e0 c37516e0M29303C4 = m29303C3();
        if (c37516e0M29303C4 == null || (view = c37516e0M29303C4.f83245g) == null) {
            return;
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, iM66635f));
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17388Y() {
        return this.f25715V;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF26380U() {
        return this.f25724e0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_home, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37516e0 c37516e0M29303C3 = m29303C3();
        if (c37516e0M29303C3 == null) {
            return;
        }
        FragmentContainerView homeNavigation = c37516e0M29303C3.f83241c;
        Intrinsics.checkNotNullExpressionValue(homeNavigation, "homeNavigation");
        KuCoinRefreshLayout refreshLayout = c37516e0M29303C3.f83246h;
        Intrinsics.checkNotNullExpressionValue(refreshLayout, "refreshLayout");
        this.f25723d0 = new HomePullRefresh(this, homeNavigation, refreshLayout);
        initView();
        m29308N3();
        bindFlowEvent();
        HomePullRefresh homePullRefresh = this.f25723d0;
        if (homePullRefresh != null) {
            homePullRefresh.m29429B();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f25715V = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f25724e0 = str;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m29280J3(HomeFragment homeFragment) {
        ICard iCard;
        List<Fragment> fragments = homeFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof ICard) {
                iCard = (ICard) activityResultCaller;
            } else {
                iCard = null;
            }
            if (iCard != null) {
                iCard.mo28981P();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m29282L3(HomeFragment homeFragment) {
        ICard iCard;
        List<Fragment> fragments = homeFragment.getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        for (ActivityResultCaller activityResultCaller : fragments) {
            if (activityResultCaller instanceof ICard) {
                iCard = (ICard) activityResultCaller;
            } else {
                iCard = null;
            }
            if (iCard != null) {
                iCard.mo28982Q();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m29284O3(HomeFragment homeFragment, CardAdapter.a aVar, List list) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        int iHashCode;
        CardAdapter.a aVar2;
        RecyclerView recyclerView3;
        RecyclerView.RecycledViewPool recycledViewPool;
        RecyclerView recyclerView4;
        HomeShimmerLayout homeShimmerLayout;
        C37516e0 c37516e0M29303C3 = homeFragment.m29303C3();
        if (c37516e0M29303C3 != null && (homeShimmerLayout = c37516e0M29303C3.f83244f) != null) {
            homeShimmerLayout.m29475s();
        }
        C37516e0 c37516e0M29303C4 = homeFragment.m29303C3();
        if (c37516e0M29303C4 != null && (recyclerView4 = c37516e0M29303C4.f83240b) != null) {
            C27046k.m66685H(recyclerView4);
        }
        NavigationCard navigationCardM29307G3 = homeFragment.m29307G3();
        if (navigationCardM29307G3 != null) {
            navigationCardM29307G3.m29661Q3(NavigationState.ShowContent);
        }
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseCardData baseCardData = (BaseCardData) it.next();
            String code = baseCardData.getCode();
            if (code != null) {
                iHashCode = code.hashCode();
            } else {
                iHashCode = 0;
            }
            C37516e0 c37516e0M29303C5 = homeFragment.m29303C3();
            if (c37516e0M29303C5 != null && (recyclerView3 = c37516e0M29303C5.f83240b) != null && (recycledViewPool = recyclerView3.getRecycledViewPool()) != null) {
                recycledViewPool.setMaxRecycledViews(iHashCode, 0);
            }
            ClassMapping classMapping = HomeCardsRepository.f25606a.m29074k().m32209k().get(baseCardData.getType());
            if (classMapping != null) {
                aVar2 = aVar;
                if (CardAdapter.a.m32197c(aVar2, iHashCode, classMapping.m32218c(), null, null, 12, null) == null) {
                }
                aVar = aVar2;
            } else {
                aVar2 = aVar;
            }
            CardAdapter.a.m32197c(aVar2, iHashCode, HomeGroupCardViewHolder.class, null, null, 12, null);
            aVar = aVar2;
        }
        C37516e0 c37516e0M29303C6 = homeFragment.m29303C3();
        if (c37516e0M29303C6 != null && (recyclerView2 = c37516e0M29303C6.f83240b) != null) {
            recyclerView2.setItemViewCacheSize(list.size());
        }
        C37516e0 c37516e0M29303C7 = homeFragment.m29303C3();
        CardAdapter cardAdapter = null;
        if (c37516e0M29303C7 != null && (recyclerView = c37516e0M29303C7.f83240b) != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if (adapter instanceof CardAdapter) {
            cardAdapter = (CardAdapter) adapter;
        }
        if (cardAdapter != null) {
            cardAdapter.mo32194p(list);
        }
        homeFragment.m29305E3().m29352w(homeFragment.m29304D3().getF25602V(), list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public final void m29308N3() {
        final CardAdapter.a<BaseCardData> aVarM29348q = m29305E3().m29348q();
        m29304D3().m29055s().observe(getViewLifecycleOwner(), new C14592c(new Function1() { // from class: com.kubi.home.main.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragment.m29284O3(this.f25765b, aVarM29348q, (List) obj);
            }
        }));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        HomeShimmerLayout homeShimmerLayout;
        super.onAgainShow();
        C37516e0 c37516e0M29303C3 = m29303C3();
        if (c37516e0M29303C3 != null && (homeShimmerLayout = c37516e0M29303C3.f83244f) != null && homeShimmerLayout.getF25820d()) {
            return;
        }
        m29304D3().m29057u(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C36716a.m82240c(getFragmentManager());
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            m29306F3().m29383H();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m29306F3().onHide();
        this.f25716W = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m29306F3().m29382G();
        m29304D3().m29057u(true);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        LifecycleKt.getCoroutineScope(lifecycle).launchWhenResumed(new C145931(null));
        HomePullRefresh homePullRefresh = this.f25723d0;
        if (homePullRefresh != null) {
            homePullRefresh.m29436w();
        }
        C43841b.m96557d("event_load_home_grid_menu", "page_load_start", null, 4, null);
        C43841b.m96557d("event_load_home_mood", "page_load_start", null, 4, null);
        C43841b.m96557d("event_load_home_banner", "page_load_start", null, 4, null);
        C43841b.m96557d("event_load_home_gembox", "page_load_start", null, 4, null);
        C43841b.m96557d("event_load_home_rank", "page_load_start", null, 4, null);
        C43841b.m96557d("event_load_home_recommend", "page_load_start", null, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TracePageHelper.m42471f("open_home", "load_home", null, 4, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Throwable {
        super.onShow();
        C36722g.m82295i();
        m29306F3().onShow();
        this.f25716W = true;
        m29302B3();
        DayNightThemeManager.f28592a.m33185j();
    }
}
