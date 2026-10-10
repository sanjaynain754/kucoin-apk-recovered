package com.kubi.home.v2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.main.HomeVM;
import com.kubi.home.main.refresh.HomePullRefresh;
import com.kubi.home.navigation.NavigationCard;
import com.kubi.home.navigation.NavigationState;
import com.kubi.home.v2.biz.WidgetsViewLoadState;
import com.kubi.home.v2.card.CardsViewModelV2;
import com.kubi.home.v2.card.HomeCardsRepositoryV2;
import com.kubi.home.v2.guide.LiteGuideCenter;
import com.kubi.home.v2.guide.WidgetGuideCenter;
import com.kubi.home.widgets.HomeRecyclerView;
import com.kubi.home.widgets.feed.HomeFeedActionLayout;
import com.kubi.home.widgets.feed.HomeFeedWrapperTabLayout;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2;
import com.kubi.kucoin.home.p090v2.cards.ICardV2;
import com.kubi.kucoin.home.p090v2.cardsconfig.CardListRspV2;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36716a;
import dj.C36722g;
import fj.C37520g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p502oj.C43101f;
import p502oj.C43103h;
import p562qj.C43745a;
import p569qq.C43841b;
import p569qq.InterfaceC43850k;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
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

/* JADX INFO: compiled from: HomeFragmentV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 R2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J$\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00100\u001a\u0004\u0018\u0001012\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u001a\u00108\u001a\u00020/2\u0006\u00109\u001a\u0002032\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020\u0013H\u0002J\b\u0010<\u001a\u00020/H\u0002J \u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020?2\u0006\u00109\u001a\u0002032\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020/H\u0002J\b\u0010C\u001a\u00020/H\u0002J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0016J\u0010\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020\u000bH\u0016J\b\u0010H\u001a\u00020/H\u0016J\b\u0010I\u001a\u00020/H\u0016J\b\u0010J\u001a\u00020/H\u0016J\b\u0010K\u001a\u00020/H\u0016J\b\u0010L\u001a\u00020/H\u0002J\b\u0010M\u001a\u00020/H\u0002J\b\u0010N\u001a\u00020/H\u0002J\b\u0010O\u001a\u00020/H\u0002J\b\u0010P\u001a\u00020\u000bH\u0016J\f\u0010Q\u001a\u00020/*\u00020AH\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006S"}, m90084d2 = {"Lcom/kubi/home/v2/HomeFragmentV2;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/home/databinding/KucoinFragmentHomeV2Binding;", "getBinding$HomeLib_googleRelease", "()Lcom/kubi/home/databinding/KucoinFragmentHomeV2Binding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "mPageIsShowIng", "hasComputeOffset", "mUpgradeCount", "", "mUpgradeHaveShowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "cardsViewModel", "Lcom/kubi/home/v2/card/CardsViewModelV2;", "getCardsViewModel", "()Lcom/kubi/home/v2/card/CardsViewModelV2;", "cardsViewModel$delegate", "Lkotlin/Lazy;", "homeVM", "Lcom/kubi/home/main/HomeVM;", "getHomeVM", "()Lcom/kubi/home/main/HomeVM;", "homeVM$delegate", "navigationCardFragment", "Lcom/kubi/home/navigation/NavigationCard;", "getNavigationCardFragment", "()Lcom/kubi/home/navigation/NavigationCard;", "navigationCardFragment$delegate", "homePullRefresh", "Lcom/kubi/home/main/refresh/HomePullRefresh;", "pageId", "", "getPageId", "()Ljava/lang/String;", "setPageId", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateNavLayout", "statusBarHeight", "initView", "configItemOffsets", "outRect", "Landroid/graphics/Rect;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "observe", "bindFlowEvent", "notifyFakeFeedTabDataChanged", "onLoad", "onHiddenChanged", ViewProps.HIDDEN, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onResume", "onAgainShow", "checkAndShowGuideDialog", "checkAndShowLiteGuideDialog", "checkAndShowPasskeyDialog", "checkUpgrade", "onBackPressed", "safeInvalidateItemDecorations", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n147#2,16:516\n76#3,7:532\n76#3,7:539\n153#3,7:546\n153#3,7:553\n81#3,2:560\n76#3,7:562\n153#3,7:569\n153#3,7:576\n153#3,7:583\n153#3,7:590\n153#3,7:597\n76#3,7:604\n76#3,7:611\n153#3,7:618\n76#3,7:625\n76#3,7:632\n153#3,7:639\n153#3,7:646\n153#3,7:653\n153#3,7:660\n1#4:667\n220#5,5:668\n220#5,5:673\n1869#6,2:678\n1869#6,2:680\n1869#6,2:682\n*S KotlinDebug\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2\n*L\n84#1:516,16\n304#1:532,7\n313#1:539,7\n321#1:546,7\n324#1:553,7\n330#1:560,2\n336#1:562,7\n347#1:569,7\n348#1:576,7\n352#1:583,7\n356#1:590,7\n360#1:597,7\n364#1:604,7\n367#1:611,7\n370#1:618,7\n373#1:625,7\n376#1:632,7\n379#1:639,7\n382#1:646,7\n385#1:653,7\n388#1:660,7\n91#1:668,5\n92#1:673,5\n250#1:678,2\n276#1:680,2\n280#1:682,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_home")
public final class HomeFragmentV2 extends BaseFragment {

    /* JADX INFO: renamed from: h0 */
    public static boolean f26338h0;

    /* JADX INFO: renamed from: m0 */
    public static boolean f26343m0;

    /* JADX INFO: renamed from: n0 */
    public static boolean f26344n0;

    /* JADX INFO: renamed from: V */
    public boolean f26346V;

    /* JADX INFO: renamed from: W */
    public boolean f26347W;

    /* JADX INFO: renamed from: X */
    public boolean f26348X;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public HomePullRefresh f26354d0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f26337g0 = {Reflection.property1(new PropertyReference1Impl(HomeFragmentV2.class, "binding", "getBinding$HomeLib_googleRelease()Lcom/kubi/home/databinding/KucoinFragmentHomeV2Binding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f26336f0 = new Companion(null);

    /* JADX INFO: renamed from: i0 */
    public static final int f26339i0 = C27040e.m66658b(16);

    /* JADX INFO: renamed from: j0 */
    public static final int f26340j0 = C27040e.m66658b(12);

    /* JADX INFO: renamed from: k0 */
    public static final int f26341k0 = C27040e.m66658b(32);

    /* JADX INFO: renamed from: l0 */
    public static boolean f26342l0 = true;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f26345U = C45681e.m100799e(this, new Function1<HomeFragmentV2, C37520g0>() { // from class: com.kubi.home.v2.HomeFragmentV2$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37520g0 invoke(@NotNull HomeFragmentV2 fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37520g0.m84500a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37520g0, Unit>() { // from class: com.kubi.home.v2.HomeFragmentV2$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37520g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37520g0 c37520g0) {
            invoke(c37520g0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public int f26349Y = 2;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f26350Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f26351a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.p
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragmentV2.m30449M3(this.f26613b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f26352b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragmentV2.m30458b4(this.f26365b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f26353c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.home.v2.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeFragmentV2.m30460d4(this.f26468b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public String f26355e0 = HomeCardViewHolderProxy.PAGE_ID;

    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/v2/HomeFragmentV2$Companion;", "", "<init>", "()V", "homepageLoadFinish", "", "getHomepageLoadFinish", "()Z", "setHomepageLoadFinish", "(Z)V", "lineSpacing", "", "getLineSpacing", "()I", "middleSpacing", "unLoginFeedTopSpacing", "hasShowGuideDialog", "hasShowLiteGuideDialog", "hasShowPasskeyDialog", "newInstance", "Lcom/kubi/home/v2/HomeFragmentV2;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HomeFragmentV2 newInstance() {
            return new HomeFragmentV2();
        }

        public final boolean getHomepageLoadFinish() {
            return HomeFragmentV2.f26338h0;
        }

        public final int getLineSpacing() {
            return HomeFragmentV2.f26339i0;
        }

        public final void setHomepageLoadFinish(boolean z11) {
            HomeFragmentV2.f26338h0 = z11;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$a */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHomeFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2$bindFlowEvent$6$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,515:1\n808#2,11:516\n2756#2:527\n1#3:528\n*S KotlinDebug\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2$bindFlowEvent$6$1\n*L\n341#1:516,11\n341#1:527\n341#1:528\n*E\n"})
    public static final class C14914a implements Function0<Unit> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f26357c;

        public C14914a(boolean z11) {
            this.f26357c = z11;
        }

        /* JADX INFO: renamed from: a */
        public final void m30495a() {
            HomeFragmentV2.this.setUserVisibleHint(!this.f26357c);
            List<Fragment> fragments = HomeFragmentV2.this.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BaseCardFragmentV2) {
                    arrayList.add(obj);
                }
            }
            boolean z11 = this.f26357c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BaseCardFragmentV2) it.next()).setUserVisibleHint(!z11);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m30495a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$b */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14915b implements Function0<Unit> {
        public C14915b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m30496a() {
            HomePullRefresh homePullRefresh = HomeFragmentV2.this.f26354d0;
            if (homePullRefresh != null) {
                homePullRefresh.m29431G();
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m30496a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$c */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/home/v2/HomeFragmentV2$initView$2", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14916c extends RecyclerView.ItemDecoration {
        public C14916c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            super.getItemOffsets(outRect, view, parent, state);
            HomeFragmentV2.this.m30490W3(outRect, view, parent);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$d */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/home/v2/HomeFragmentV2$initView$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nHomeFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2$initView$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,515:1\n1869#2,2:516\n1869#2,2:518\n*S KotlinDebug\n*F\n+ 1 HomeFragmentV2.kt\ncom/kubi/home/v2/HomeFragmentV2$initView$3\n*L\n166#1:516,2\n172#1:518,2\n*E\n"})
    public static final class C14917d extends RecyclerView.OnScrollListener {
        public C14917d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 0) {
                List<Fragment> fragments = HomeFragmentV2.this.getChildFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
                for (ActivityResultCaller activityResultCaller : fragments) {
                    ICardV2 iCardV2 = activityResultCaller instanceof ICardV2 ? (ICardV2) activityResultCaller : null;
                    if (iCardV2 != null) {
                        iCardV2.mo31093P();
                    }
                }
                return;
            }
            if (newState != 1) {
                return;
            }
            List<Fragment> fragments2 = HomeFragmentV2.this.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
            for (ActivityResultCaller activityResultCaller2 : fragments2) {
                ICardV2 iCardV3 = activityResultCaller2 instanceof ICardV2 ? (ICardV2) activityResultCaller2 : null;
                if (iCardV3 != null) {
                    iCardV3.mo31094Q();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$e */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14918e implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f26361b;

        public C14918e(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26361b = function;
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
            return this.f26361b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26361b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.v2.HomeFragmentV2$onLoad$1 */
    /* JADX INFO: compiled from: HomeFragmentV2.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.v2.HomeFragmentV2$onLoad$1", m90122f = "HomeFragmentV2.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C149191 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C149191(Continuation<? super C149191> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeFragmentV2.this.new C149191(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C149191) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                HomeFragmentV2.this.m30456Z3().m29380B();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m30451P3() {
        f26342l0 = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m30453S3() {
        f26343m0 = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final NavigationCard m30460d4(HomeFragmentV2 homeFragmentV2) {
        Object objM103844constructorimpl;
        FragmentContainerView fragmentContainerView;
        try {
            Result.Companion companion = Result.INSTANCE;
            C37520g0 c37520g0M30491X3 = homeFragmentV2.m30491X3();
            objM103844constructorimpl = Result.m103844constructorimpl((c37520g0M30491X3 == null || (fragmentContainerView = c37520g0M30491X3.f83302e) == null) ? null : (NavigationCard) fragmentContainerView.getFragment());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (NavigationCard) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    /* JADX INFO: renamed from: M3 */
    public static final CardsViewModelV2 m30449M3(HomeFragmentV2 homeFragmentV2) {
        return (CardsViewModelV2) new ViewModelProvider(homeFragmentV2).get(CardsViewModelV2.class);
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m30454U3() {
        if (f26344n0) {
            return Unit.INSTANCE;
        }
        IUserService.Companion companion = IUserService.a;
        if (companion.get().c()) {
            companion.get().Y();
            f26344n0 = true;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    private final void m30455V3() {
        if (this.f26349Y <= 0 || this.f26350Z.get()) {
            return;
        }
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFragmentV2$checkUpgrade$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public final HomeVM m30456Z3() {
        return (HomeVM) this.f26352b0.getValue();
    }

    /* JADX INFO: renamed from: a4 */
    private final NavigationCard m30457a4() {
        return (NavigationCard) this.f26353c0.getValue();
    }

    /* JADX INFO: renamed from: b4 */
    public static final HomeVM m30458b4(HomeFragmentV2 homeFragmentV2) {
        return (HomeVM) new ViewModelProvider(homeFragmentV2).get(HomeVM.class);
    }

    private final void bindFlowEvent() {
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:shimmer_show".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:shimmer_show", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:indexHomeCard".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:indexHomeCard", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:updateHomeCards".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$3("com.kubi.home.event.HomeEvent:updateHomeCards", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.user.event.UserEvent:onConfigChangeV2".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$4("com.kubi.user.event.UserEvent:onConfigChangeV2", null, this));
        if (c12573b.m23696a()) {
            "refresh_red_dot".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$1("refresh_red_dot", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:switchDrawer".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$5("com.kubi.home.event.HomeEvent:switchDrawer", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$6("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:removeHomeTradingRobotCard".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$7("com.kubi.home.event.HomeEvent:removeHomeTradingRobotCard", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.v2.card.CardsViewModelV2_EVENT_FINISH_REFRESH_LOAD".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$8("com.kubi.home.v2.card.CardsViewModelV2_EVENT_FINISH_REFRESH_LOAD", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.v2.card.CardsViewModelV2_EVENT_ADD_WIDGET".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$9("com.kubi.home.v2.card.CardsViewModelV2_EVENT_ADD_WIDGET", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.v2.card.CardsViewModelV2_EVENT_WIDGET_VISIBLE_CHANGE".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$10("com.kubi.home.v2.card.CardsViewModelV2_EVENT_WIDGET_VISIBLE_CHANGE", null, this));
        if (c12573b.m23696a()) {
            "gesture_status".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$11("gesture_status", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_created".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$12("com.kubi.home.feed.QuoteEvent:home_feed_created", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$13("com.kubi.home.feed.QuoteEvent:home_tab_jump_page_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$14("com.kubi.home.feed.QuoteEvent:home_feed_flutter_tab_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_card_tab_scrollX_change".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$15("com.kubi.home.feed.QuoteEvent:home_feed_card_tab_scrollX_change", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_jump_to_tab_position_notify".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$16("com.kubi.home.feed.QuoteEvent:home_feed_jump_to_tab_position_notify", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:fake_tab_re_click".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$17("com.kubi.home.feed.QuoteEvent:fake_tab_re_click", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:home_feed_scroll_to_top".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$18("com.kubi.home.event.HomeEvent:home_feed_scroll_to_top", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.feed.QuoteEvent:home_feed_tab_changed".length();
        }
        C12572a.m23692a(this, false, new HomeFragmentV2$bindFlowEvent$$inlined$bindFlowEvent$default$19("com.kubi.home.feed.QuoteEvent:home_feed_tab_changed", null, this));
    }

    /* JADX INFO: renamed from: c4 */
    public static final WindowInsetsCompat m30459c4(HomeFragmentV2 homeFragmentV2, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        homeFragmentV2.m30475o4(insets.getInsets(WindowInsetsCompat.Type.statusBars()).top);
        return insets;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m30462g4(C37520g0 c37520g0, HomeFragmentV2 homeFragmentV2, Boolean bool) {
        c37520g0.f83306i.setEnableRefresh(!bool.booleanValue());
        c37520g0.f83302e.setAlpha(bool.booleanValue() ? 0.2f : 1.0f);
        if (bool.booleanValue()) {
            List<Fragment> fragments = homeFragmentV2.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            for (ActivityResultCaller activityResultCaller : fragments) {
                ICardV2 iCardV2 = activityResultCaller instanceof ICardV2 ? (ICardV2) activityResultCaller : null;
                if (iCardV2 != null) {
                    iCardV2.mo30082r0();
                }
            }
        } else {
            List<Fragment> fragments2 = homeFragmentV2.getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments2, "getFragments(...)");
            for (ActivityResultCaller activityResultCaller2 : fragments2) {
                ICardV2 iCardV3 = activityResultCaller2 instanceof ICardV2 ? (ICardV2) activityResultCaller2 : null;
                if (iCardV3 != null) {
                    iCardV3.mo30080k0();
                }
            }
        }
        HomeRecyclerView homeRecyclerView = c37520g0.f83300c;
        Intrinsics.checkNotNull(bool);
        homeRecyclerView.m31058S(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m30466j4(HomeFragmentV2 homeFragmentV2, C37520g0 c37520g0, List list) {
        C43101f.f95302a.m94709b("home_page_start_add_widget");
        NavigationCard navigationCardM30457a4 = homeFragmentV2.m30457a4();
        if (navigationCardM30457a4 != null) {
            navigationCardM30457a4.m29661Q3(NavigationState.ShowContent);
        }
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BaseCardDataV2 baseCardDataV2 = (BaseCardDataV2) it.next();
            c37520g0.f83300c.getRecycledViewPool().setMaxRecycledViews(baseCardDataV2.getF27926j(), 0);
            C43745a.a.m96372c(homeFragmentV2.m30492Y3().m30749Z(), baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        }
        c37520g0.f83300c.setItemViewCacheSize(list.size());
        c37520g0.f83300c.setCardsData(list);
        homeFragmentV2.m30492Y3().m30747X().mo32194p(list);
        if (homeFragmentV2.m30492Y3().m30756g0().getValue() != null) {
            homeFragmentV2.m30493e4();
        }
        CardListRspV2 cardListRspV2M30792i = HomeCardsRepositoryV2.f26494a.m30792i();
        C43103h.f95308a.m94721e(list, (cardListRspV2M30792i != null ? cardListRspV2M30792i.getUserCustomVersion() : 0) > 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m30468k4(C37520g0 c37520g0, HomeFragmentV2 homeFragmentV2, BaseCardDataV2 baseCardDataV2) {
        c37520g0.f83300c.getRecycledViewPool().setMaxRecycledViews(baseCardDataV2.getF27926j(), 0);
        C43745a.a.m96372c(homeFragmentV2.m30492Y3().m30749Z(), baseCardDataV2.getF27926j(), baseCardDataV2.getStyle().getMapping().m32263a(), null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m30473n4(RecyclerView recyclerView) {
        try {
            Result.Companion companion = Result.INSTANCE;
            recyclerView.invalidateItemDecorations();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final void m30487N3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30450O3(this.f26612b);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m30488Q3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30452R3(this.f26559b);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final void m30489T3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30454U3();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: X3 */
    public final C37520g0 m30491X3() {
        return (C37520g0) this.f26345U.getValue(this, f26337g0[0]);
    }

    /* JADX INFO: renamed from: Y3 */
    public final CardsViewModelV2 m30492Y3() {
        return (CardsViewModelV2) this.f26351a0.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF52635e0() {
        return this.f26346V;
    }

    @Override // com.kubi.sdk.BaseFragment, p569qq.InterfaceC43845f
    @Nullable
    /* JADX INFO: renamed from: getPageId, reason: from getter */
    public String getF25724e0() {
        return this.f26355e0;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C43101f.f95302a.m94709b("home_fragment_on_create_view");
        View viewInflate = inflater.inflate(R$layout.kucoin_fragment_home_v2, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_fragment_on_view_created");
        C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 == null) {
            return;
        }
        FragmentContainerView homeNavigation = c37520g0M30491X3.f83302e;
        Intrinsics.checkNotNullExpressionValue(homeNavigation, "homeNavigation");
        KuCoinRefreshLayout refreshLayout = c37520g0M30491X3.f83306i;
        Intrinsics.checkNotNullExpressionValue(refreshLayout, "refreshLayout");
        this.f26354d0 = new HomePullRefresh(this, homeNavigation, refreshLayout);
        initView();
        m30461f4();
        bindFlowEvent();
        HomePullRefresh homePullRefresh = this.f26354d0;
        if (homePullRefresh != null) {
            homePullRefresh.m29429B();
        }
        if (c43101f.m94711e()) {
            CardsViewModelV2.m30724m0(m30492Y3(), false, 1, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f26346V = z11;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setPageId(@Nullable String str) {
        this.f26355e0 = str;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m30450O3(HomeFragmentV2 homeFragmentV2) {
        C37520g0 c37520g0M30491X3 = homeFragmentV2.m30491X3();
        if (c37520g0M30491X3 == null) {
            return Unit.INSTANCE;
        }
        if (f26342l0) {
            return Unit.INSTANCE;
        }
        WidgetGuideCenter widgetGuideCenter = WidgetGuideCenter.f26561a;
        HomeRecyclerView homeCardContainer = c37520g0M30491X3.f83300c;
        Intrinsics.checkNotNullExpressionValue(homeCardContainer, "homeCardContainer");
        widgetGuideCenter.m30920y(homeFragmentV2, homeCardContainer, new Function0() { // from class: com.kubi.home.v2.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30451P3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m30452R3(HomeFragmentV2 homeFragmentV2) {
        C37520g0 c37520g0M30491X3 = homeFragmentV2.m30491X3();
        if (c37520g0M30491X3 == null) {
            return Unit.INSTANCE;
        }
        if (f26343m0) {
            return Unit.INSTANCE;
        }
        LiteGuideCenter liteGuideCenter = LiteGuideCenter.f26575a;
        FragmentContainerView homeNavigation = c37520g0M30491X3.f83302e;
        Intrinsics.checkNotNullExpressionValue(homeNavigation, "homeNavigation");
        liteGuideCenter.m30939l(homeFragmentV2, homeNavigation, new Function0() { // from class: com.kubi.home.v2.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30453S3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    private final void m30461f4() {
        final C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 == null) {
            return;
        }
        m30492Y3().m30751b0().observe(getViewLifecycleOwner(), new C14918e(new Function1() { // from class: com.kubi.home.v2.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragmentV2.m30466j4(this.f26363b, c37520g0M30491X3, (List) obj);
            }
        }));
        m30492Y3().m30750a0().observe(getViewLifecycleOwner(), new C14918e(new Function1() { // from class: com.kubi.home.v2.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragmentV2.m30468k4(c37520g0M30491X3, this, (BaseCardDataV2) obj);
            }
        }));
        m30492Y3().m30752c0().observe(getViewLifecycleOwner(), new C14918e(new Function1() { // from class: com.kubi.home.v2.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragmentV2.m30462g4(c37520g0M30491X3, this, (Boolean) obj);
            }
        }));
        m30492Y3().m30756g0().observe(getViewLifecycleOwner(), new C14918e(new Function1() { // from class: com.kubi.home.v2.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeFragmentV2.m30463h4(this.f26607b, (List) obj);
            }
        }));
        WidgetsViewLoadState widgetsViewLoadState = WidgetsViewLoadState.f26367a;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        WidgetsViewLoadState.m30516e(widgetsViewLoadState, viewLifecycleOwner, CollectionsKt.listOf((Object[]) new HomeWidgetCode[]{HomeWidgetCode.UserStatus, HomeWidgetCode.Menu}), false, new Function0() { // from class: com.kubi.home.v2.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeFragmentV2.m30464i4(this.f26608b);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m30463h4(HomeFragmentV2 homeFragmentV2, List list) {
        homeFragmentV2.m30493e4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m30464i4(HomeFragmentV2 homeFragmentV2) {
        homeFragmentV2.m30487N3();
        WidgetsViewLoadState.f26367a.m30520g(CollectionsKt.listOf((Object[]) new HomeWidgetCode[]{HomeWidgetCode.UserStatus, HomeWidgetCode.Menu}));
        return Unit.INSTANCE;
    }

    private final void initView() {
        C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 == null) {
            return;
        }
        m30475o4(EdgeToEdgeCompat.f48106a.m58272j());
        ViewCompat.setOnApplyWindowInsetsListener(c37520g0M30491X3.f83302e, new OnApplyWindowInsetsListener() { // from class: com.kubi.home.v2.e
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return HomeFragmentV2.m30459c4(this.f26560b, view, windowInsetsCompat);
            }
        });
        HomeRecyclerView homeCardContainer = c37520g0M30491X3.f83300c;
        Intrinsics.checkNotNullExpressionValue(homeCardContainer, "homeCardContainer");
        homeCardContainer.setHasFixedSize(true);
        homeCardContainer.addItemDecoration(new C14916c());
        homeCardContainer.addOnScrollListener(new C14917d());
        CardsViewModelV2 cardsViewModelV2M30492Y3 = m30492Y3();
        HomeRecyclerView homeCardContainer2 = c37520g0M30491X3.f83300c;
        Intrinsics.checkNotNullExpressionValue(homeCardContainer2, "homeCardContainer");
        cardsViewModelV2M30492Y3.m30739C0(homeCardContainer2);
        c37520g0M30491X3.f83300c.m31064u(c37520g0M30491X3.f83304g);
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m30471m4(HomeFragmentV2 homeFragmentV2, RecyclerView recyclerView) {
        homeFragmentV2.m30494l4(recyclerView);
    }

    /* JADX INFO: renamed from: o4 */
    private final void m30475o4(int i11) {
        FrameLayout frameLayout;
        C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 != null && (frameLayout = c37520g0M30491X3.f83304g) != null) {
            frameLayout.setPadding(0, i11, 0, 0);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m30490W3(Rect rect, View view, RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager;
        View childAt;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            ViewGroup viewGroup = null;
            if (layoutManager instanceof GridLayoutManager) {
                gridLayoutManager = (GridLayoutManager) layoutManager;
            } else {
                gridLayoutManager = null;
            }
            if (gridLayoutManager == null) {
                return;
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            int spanIndex = spanSizeLookup.getSpanIndex(childAdapterPosition, 2);
            int spanSize = spanSizeLookup.getSpanSize(childAdapterPosition);
            int i11 = f26339i0;
            rect.left = i11;
            rect.right = i11;
            if (view instanceof ViewGroup) {
                viewGroup = (ViewGroup) view;
            }
            if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null || childAt.getVisibility() != 8) {
                rect.top = i11;
            }
            if (view.findViewById(R$id.quote_home_feed_card) != null) {
                rect.left = 0;
                rect.right = 0;
                if (!C36722g.m82292f()) {
                    rect.top = f26341k0;
                }
            }
            if (spanSize != 2) {
                if (spanIndex == 0) {
                    if (C5303w0.m6511a()) {
                        rect.left = f26340j0 / 2;
                        rect.right = i11;
                    } else {
                        rect.left = i11;
                        rect.right = f26340j0 / 2;
                    }
                } else if (C5303w0.m6511a()) {
                    rect.left = i11;
                    rect.right = f26340j0 / 2;
                } else {
                    rect.left = f26340j0 / 2;
                    rect.right = i11;
                }
            } else if (view.findViewById(R$id.home_menu_widget_root_view) != null) {
                rect.left = 0;
                rect.right = 0;
            }
            this.f26348X = true;
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m30493e4() {
        HomeFeedWrapperTabLayout homeFeedWrapperTabLayout;
        C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 != null && (homeFeedWrapperTabLayout = c37520g0M30491X3.f83299b) != null) {
            homeFeedWrapperTabLayout.m31161b(getChildFragmentManager());
        }
    }

    /* JADX INFO: renamed from: l4 */
    public final void m30494l4(final RecyclerView recyclerView) {
        Object objM103844constructorimpl;
        if (recyclerView.isAttachedToWindow() && this.f26348X) {
            if (!recyclerView.isComputingLayout() && recyclerView.getScrollState() == 0) {
                RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: com.kubi.home.v2.m
                        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
                        public final void onAnimationsFinished() {
                            HomeFragmentV2.m30473n4(recyclerView);
                        }
                    });
                    return;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    recyclerView.invalidateItemDecorations();
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Result.m103843boximpl(objM103844constructorimpl);
                return;
            }
            recyclerView.post(new Runnable() { // from class: com.kubi.home.v2.l
                @Override // java.lang.Runnable
                public final void run() {
                    HomeFragmentV2.m30471m4(this.f26609b, recyclerView);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        super.onAgainShow();
        m30487N3();
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        return m30492Y3().m30762o0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C36716a.m82240c(getFragmentManager());
        C43101f.f95302a.m94709b("home_fragment_on_create");
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            m30456Z3().m29383H();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        HomeFeedActionLayout homeFeedActionLayout;
        super.onHide();
        m30456Z3().onHide();
        C37520g0 c37520g0M30491X3 = m30491X3();
        if (c37520g0M30491X3 != null && (homeFeedActionLayout = c37520g0M30491X3.f83301d) != null) {
            homeFeedActionLayout.m31137n();
        }
        this.f26347W = false;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
        m30456Z3().m29382G();
        if (!C43101f.f95302a.m94711e()) {
            CardsViewModelV2.m30724m0(m30492Y3(), false, 1, null);
        }
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        LifecycleKt.getCoroutineScope(lifecycle).launchWhenResumed(new C149191(null));
        HomePullRefresh homePullRefresh = this.f26354d0;
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
        m30456Z3().onShow();
        this.f26347W = true;
        m30455V3();
        m30488Q3();
        m30489T3();
        m30492Y3().m30746T(getActivity());
        DayNightThemeManager.f28592a.m33185j();
    }
}
