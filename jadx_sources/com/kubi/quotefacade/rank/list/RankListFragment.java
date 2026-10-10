package com.kubi.quotefacade.rank.list;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4677k0;
import bv.C4706z;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.LazySimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.rank.NewRankRedDotHelper;
import com.kubi.quotefacade.rank.RankFragment;
import com.kubi.quotefacade.rank.config.RankConfig;
import com.kubi.quotefacade.rank.config.RankMarketConfigKt;
import com.kubi.quotefacade.rank.config.RankSubTabItemConfig;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37752d;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p025av.C4392c;
import p208dr.InterfaceC36952a;
import p241ev.C37266a;
import p402kf.C41016c;
import p569qq.C43852m;
import p778xy.C46338a;
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
import p852kotlin.jvm.JvmStatic;
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
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: RankListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0002*\u0001*\b\u0007\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00103\u001a\u00020/H\u0007J\b\u00109\u001a\u00020:H\u0014J\b\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0006H\u0002J\b\u0010?\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020<H\u0016J\b\u0010A\u001a\u00020<H\u0016J\b\u0010B\u001a\u00020<H\u0016J\b\u0010C\u001a\u00020<H\u0002J\b\u0010D\u001a\u00020<H\u0002J\b\u0010E\u001a\u00020<H\u0002J\u0018\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020:2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020<H\u0002J\u0010\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020MH\u0014J \u0010N\u001a\u00020<2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u0017H\u0007J \u0010R\u001a\u00020<2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010P2\u0006\u0010Q\u001a\u00020\u0017H\u0002J\b\u0010S\u001a\u00020\u0017H\u0002J\b\u0010T\u001a\u00020<H\u0002J\"\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020:2\u0006\u0010W\u001a\u00020:2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\n\u0010Z\u001a\u0004\u0018\u00010$H\u0002J$\u0010[\u001a\b\u0012\u0004\u0012\u00020I0P2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020I0P2\u0006\u0010Q\u001a\u00020\u0017H\u0002J\u0016\u0010\\\u001a\u00020<2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020I0PH\u0002J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020I0P2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020I0PH\u0002J\u0010\u0010`\u001a\u00020<2\u0006\u0010a\u001a\u00020\u0017H\u0002J\u0010\u0010b\u001a\u00020<2\u0006\u0010a\u001a\u00020\u0017H\u0002J\u0018\u0010c\u001a\u00020<2\u0006\u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u00020fH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0019\u0010\u000eR\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0010\u001a\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000206058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006h"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListFragment;", "Lcom/kubi/mvi/state/LazySimpleStateFragment;", "Lcom/kubi/quotefacade/rank/list/RankListContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentRankListBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentRankListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "rankType", "", "getRankType", "()Ljava/lang/String;", "rankType$delegate", "Lkotlin/Lazy;", "subConfig", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "getSubConfig", "()Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "subConfig$delegate", "isMoving", "", "positionType", "getPositionType", "positionType$delegate", "isScrolling", "bufferNotify", "value", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "rankLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "debounceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "countDownFinishCallback", "com/kubi/quotefacade/rank/list/RankListFragment$countDownFinishCallback$2$1", "getCountDownFinishCallback", "()Lcom/kubi/quotefacade/rank/list/RankListFragment$countDownFinishCallback$2$1;", "countDownFinishCallback$delegate", "adapter", "Lcom/kubi/quotefacade/rank/list/RankListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/rank/list/RankListAdapter;", "adapter$delegate", "testAdapter", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/rank/list/RankListVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "doOnLazyInitView", "", "updateDiffUi", "vb", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "showLoading", "showContent", "initViews", "showMarketChooseDialog", "initRecycleViewAdapter", "handleItemClick", ViewProps.POSITION, "itemData", "Lcom/kubi/quotefacade/entity/RankEntity;", "triggerFetchDataList", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "testRefreshList", "dataList", "", "subscribe", "refreshList", "hasRankData", "showRankDataAfterError", "showFailView", "tips", TUIConstants.TUIChat.INPUT_MORE_ICON, "click", "Landroid/view/View$OnClickListener;", "getLoadView", "addCountDownDataWhenSubscribe", "dealOnNewRank", "realList", "filterDataList", "list", "notifyPageShowOrHide", TIMPushProvider.f75062n, "showViewMore", "trackRankItemClick", "symbol", "intervals", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nRankListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RankListFragment.kt\ncom/kubi/quotefacade/rank/list/RankListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 5 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 6 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,511:1\n147#2,16:512\n81#3,2:528\n50#4,17:530\n45#5,7:547\n45#5,7:574\n93#6,4:554\n1617#7,9:558\n1869#7:567\n1870#7:569\n1626#7:570\n774#7:571\n865#7,2:572\n1#8:568\n*S KotlinDebug\n*F\n+ 1 RankListFragment.kt\ncom/kubi/quotefacade/rank/list/RankListFragment\n*L\n79#1:512,16\n148#1:528,2\n309#1:530,17\n318#1:547,7\n141#1:574,7\n339#1:554,4\n431#1:558,9\n431#1:567\n431#1:569\n431#1:570\n432#1:571\n432#1:572,2\n431#1:568\n*E\n"})
public final class RankListFragment extends LazySimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: c0 */
    public boolean f42480c0;

    /* JADX INFO: renamed from: e0 */
    public boolean f42482e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f42483f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public WrapperLoadingView f42484g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final BehaviorSubject<Object> f42485h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f42486i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f42487j0;

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ KProperty<Object>[] f42476l0 = {Reflection.property1(new PropertyReference1Impl(RankListFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentRankListBinding;", 0))};

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f42475k0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f42477Z = C45681e.m100799e(this, new Function1<RankListFragment, C4706z>() { // from class: com.kubi.quotefacade.rank.list.RankListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4706z invoke(@NotNull RankListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4706z.m4724a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4706z, Unit>() { // from class: com.kubi.quotefacade.rank.list.RankListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4706z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4706z c4706z) {
            invoke(c4706z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f42478a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.list.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankListFragment.m52824N4(this.f42512b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f42479b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.list.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankListFragment.m52840X4(this.f42515b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f42481d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.list.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RankListFragment.m52822M4(this.f42518b);
        }
    });

    /* JADX INFO: compiled from: RankListFragment.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/list/RankListFragment$Companion;", "", "<init>", "()V", "DEBOUNCE_TIMEOUT", "", "SUB_CONFIG", "", "instance", "Lcom/kubi/quotefacade/rank/list/RankListFragment;", "rankType", "subConfig", "Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final RankListFragment instance(@NotNull String rankType, @NotNull RankSubTabItemConfig subConfig, @Nullable String positionType) {
            Intrinsics.checkNotNullParameter(rankType, "rankType");
            Intrinsics.checkNotNullParameter(subConfig, "subConfig");
            RankListFragment rankListFragment = new RankListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("type", rankType);
            bundle.putParcelable("rank_sub_config", subConfig);
            bundle.putString("positionType", positionType);
            rankListFragment.setArguments(bundle);
            return rankListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.list.RankListFragment$a */
    /* JADX INFO: compiled from: RankListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/rank/list/RankListFragment$countDownFinishCallback$2$1", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "finish", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22468a implements CountDownFinishCallback {
        public C22468a() {
        }

        @Override // com.kubi.sdk.util.CountDownFinishCallback
        public void finish() {
            C44128b.m97266j(RankListFragment.this.getTAG(), "countDown finish");
            RankListFragment.this.f42485h0.onNext(new Object());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.list.RankListFragment$b */
    /* JADX INFO: compiled from: RankListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/rank/list/RankListFragment$initRecycleViewAdapter$1$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22469b extends RecyclerView.OnScrollListener {
        public C22469b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            C44128b.m97266j(RankListFragment.this.getTAG(), "onScrollStateChanged=" + newState);
            RankListFragment.this.f42482e0 = newState != 0;
            if (newState == 0) {
                C46338a.m102151a(recyclerView.getContext()).m6638z();
            } else if (newState == 1 || newState == 2) {
                C46338a.m102151a(recyclerView.getContext()).m6637y();
            }
            if (RankListFragment.this.f42482e0 || !RankListFragment.this.f42483f0) {
                return;
            }
            C44128b.m97266j(RankListFragment.this.getTAG(), "onScrollStateChanged not scrolling and notifyDataSetChanged");
            RankListFragment.this.m52876p4().notifyDataSetChanged();
            RankListFragment.this.f42483f0 = false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.list.RankListFragment$onShow$2 */
    /* JADX INFO: compiled from: RankListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.rank.list.RankListFragment$onShow$2", m90122f = "RankListFragment.kt", m90123i = {}, m90124l = {179}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C224702 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C224702(Continuation<? super C224702> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RankListFragment.this.new C224702(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C224702) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C4677k0 c4677k0;
            BaseTextView baseTextView;
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
                this.label = 1;
                obj = RankMarketConfigKt.m52711c(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a = (BottomSheetDialogHelper.InterfaceC24339a) obj;
            C4706z c4706zM52877q4 = RankListFragment.this.m52877q4();
            if (c4706zM52877q4 != null && (c4677k0 = c4706zM52877q4.f4650h) != null && (baseTextView = c4677k0.f4406i) != null) {
                baseTextView.setText(interfaceC24339a.getLabel());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView */
    public boolean getF26346V() {
        return false;
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m52799A4(InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    /* JADX INFO: renamed from: E4 */
    private final void m52807E4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52809F4(this.f42532b);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public static final RankListAdapter m52850g4(RankListFragment rankListFragment) {
        return new RankListAdapter(rankListFragment.m52880u4(), rankListFragment.m52881v4().getType(), rankListFragment.m52858t4());
    }

    /* JADX INFO: renamed from: i4 */
    public static final C22468a m52851i4(RankListFragment rankListFragment) {
        return rankListFragment.new C22468a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public final String m52858t4() {
        return (String) this.f42481d0.getValue();
    }

    /* JADX INFO: renamed from: O4 */
    public final void m52867O4(final List<RankEntity> list, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52827P4(this.f42536b, list, z11);
            }
        });
    }

    /* JADX INFO: renamed from: V4 */
    public final void m52870V4(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52838W4(this.f42526b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m52871Y4(String str, double d11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", str);
        jSONObject.put("rankTab", m52880u4());
        jSONObject.put("subTab", m52881v4().getType());
        jSONObject.put("intervals", d11);
        jSONObject.put("from", C22218w1.m52124d(getArguments()) ? "homePage" : C33556b3.f68963J);
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c(HomeCardViewHolderProxy.PAGE_ID, "hotRankFlow", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m52872Z4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52844a5(this.f42533b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (isDetached() || getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if ((activity == null || !activity.isFinishing()) && (singleEvent instanceof C22477d)) {
            C22477d c22477d = (C22477d) singleEvent;
            if (getView() == null) {
                return;
            }
            m52867O4(c22477d.m52911a(), c22477d.getF42514b());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_rank_list;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<RankListVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RankListVM.class);
    }

    /* JADX INFO: renamed from: p4 */
    public final RankListAdapter m52876p4() {
        return (RankListAdapter) this.f42487j0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public final C4706z m52877q4() {
        return (C4706z) this.f42477Z.getValue(this, f42476l0[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public final C22468a m52878r4() {
        return (C22468a) this.f42486i0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52831R4(this.f42516b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52833S4(this.f42545b);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public final String m52880u4() {
        return (String) this.f42478a0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final RankSubTabItemConfig m52881v4() {
        return (RankSubTabItemConfig) this.f42479b0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m52884y4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52865z4(this.f42534b);
            }
        });
    }

    public RankListFragment() {
        BehaviorSubject<Object> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f42485h0 = behaviorSubjectCreate;
        this.f42486i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.list.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52851i4(this.f42521b);
            }
        });
        this.f42487j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.rank.list.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52850g4(this.f42524b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B4 */
    public static final void m52801B4(RankListFragment rankListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws Throwable {
        RankEntity rankEntity;
        if (!C27014a1.m66501a(view) && (rankEntity = (RankEntity) rankListFragment.m52876p4().getItem(i11)) != null) {
            rankListFragment.m52882w4(i11, rankEntity);
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final boolean m52803C4(RankListFragment rankListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        rankListFragment.m52876p4().m52792x(i11);
        return true;
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m52805D4(RankListFragment rankListFragment, Object obj) {
        rankListFragment.m52872Z4();
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m52809F4(final RankListFragment rankListFragment) {
        C4706z c4706zM52877q4 = rankListFragment.m52877q4();
        if (c4706zM52877q4 == null) {
            return Unit.INSTANCE;
        }
        if (rankListFragment.m52881v4().isRankSpotSubTab()) {
            Group tvRankGroup = c4706zM52877q4.f4650h.f4409l;
            Intrinsics.checkNotNullExpressionValue(tvRankGroup, "tvRankGroup");
            C27046k.m66700o(tvRankGroup);
            BaseTextView tvName = c4706zM52877q4.f4650h.f4408k;
            Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
            C27046k.m66700o(tvName);
            Group marketGroup = c4706zM52877q4.f4650h.f4404g;
            Intrinsics.checkNotNullExpressionValue(marketGroup, "marketGroup");
            C27046k.m66685H(marketGroup);
            BaseTextView marketType = c4706zM52877q4.f4650h.f4406i;
            Intrinsics.checkNotNullExpressionValue(marketType, "marketType");
            C27046k.m66711z(marketType, 0L, new Function0() { // from class: com.kubi.quotefacade.rank.list.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankListFragment.m52811G4(this.f42542b);
                }
            }, 1, null);
            AppCompatImageView marketLabel = c4706zM52877q4.f4650h.f4405h;
            Intrinsics.checkNotNullExpressionValue(marketLabel, "marketLabel");
            C27046k.m66711z(marketLabel, 0L, new Function0() { // from class: com.kubi.quotefacade.rank.list.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RankListFragment.m52813H4(this.f42543b);
                }
            }, 1, null);
        } else if (C4392c.m4019g(rankListFragment.m52880u4())) {
            Group tvRankGroup2 = c4706zM52877q4.f4650h.f4409l;
            Intrinsics.checkNotNullExpressionValue(tvRankGroup2, "tvRankGroup");
            C27046k.m66685H(tvRankGroup2);
        } else if (C4392c.m4014b(rankListFragment.m52880u4())) {
            c4706zM52877q4.f4650h.f4408k.setText(rankListFragment.getString(R$string.name) + '(' + rankListFragment.getString(R$string.rank_desc_label_marketcap) + ')');
        }
        LinearLayoutCompat layoutViewMore = c4706zM52877q4.f4644b;
        Intrinsics.checkNotNullExpressionValue(layoutViewMore, "layoutViewMore");
        C27046k.m66711z(layoutViewMore, 0L, new Function0() { // from class: com.kubi.quotefacade.rank.list.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52815I4(this.f42544b);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m52811G4(RankListFragment rankListFragment) {
        rankListFragment.m52868T4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m52813H4(RankListFragment rankListFragment) {
        rankListFragment.m52868T4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m52815I4(RankListFragment rankListFragment) {
        Context context = rankListFragment.getContext();
        if (context != null) {
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Bundle bundle = new Bundle();
            bundle.putString("title", rankListFragment.getString(R$string.discover_ranking_list_title));
            bundle.putString("tab", rankListFragment.m52880u4());
            bundle.putString(ViewProps.POSITION, rankListFragment.m52881v4().getType());
            Unit unit = Unit.INSTANCE;
            companion.launch(context, RankFragment.class, bundle);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m52818K4(RankListFragment rankListFragment, C4706z c4706z, boolean z11) {
        LinearLayoutManager linearLayoutManager;
        RankListCountDownView rankListCountDownView;
        if (!C4392c.m4015c(rankListFragment.m52880u4())) {
            return Unit.INSTANCE;
        }
        RecyclerView.LayoutManager layoutManager = c4706z.f4648f.getRecyclerView().getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return Unit.INSTANCE;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            while (true) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition != null) {
                    rankListCountDownView = (RankListCountDownView) viewFindViewByPosition.findViewById(R$id.layoutCountdown);
                } else {
                    rankListCountDownView = null;
                }
                if (rankListCountDownView != null) {
                    rankListCountDownView.m52795a(z11);
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    break;
                }
                iFindFirstVisibleItemPosition++;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m52820L4(RankListFragment rankListFragment) {
        rankListFragment.m52872Z4();
    }

    /* JADX INFO: renamed from: M4 */
    public static final String m52822M4(RankListFragment rankListFragment) {
        String string;
        Bundle arguments = rankListFragment.getArguments();
        if (arguments != null && (string = arguments.getString("positionType")) != null) {
            return string;
        }
        return "DETAIL";
    }

    /* JADX INFO: renamed from: N4 */
    public static final String m52824N4(RankListFragment rankListFragment) {
        String string;
        Bundle arguments = rankListFragment.getArguments();
        if (arguments != null && (string = arguments.getString("type")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m52827P4(final RankListFragment rankListFragment, List list, boolean z11) {
        Integer numValueOf;
        C4677k0 c4677k0;
        ConstraintLayout root;
        FrameLayout frameLayout;
        String tag = rankListFragment.getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("refreshList=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sb2.append(numValueOf);
        sb2.append(",isMoving = ");
        sb2.append(rankListFragment.f42480c0);
        C44128b.m97266j(tag, sb2.toString());
        if (rankListFragment.isShowing() && rankListFragment.getView() != null && !rankListFragment.f42480c0) {
            if (list != null && !list.isEmpty()) {
                C4706z c4706zM52877q4 = rankListFragment.m52877q4();
                if (c4706zM52877q4 != null && (frameLayout = c4706zM52877q4.f4645c) != null) {
                    frameLayout.setVisibility(8);
                }
                WrapperLoadingView wrapperLoadingView = rankListFragment.f42484g0;
                if (wrapperLoadingView != null) {
                    wrapperLoadingView.setVisibility(8);
                }
                List<RankEntity> listM52856o4 = rankListFragment.m52856o4(rankListFragment.m52874h4(list, z11));
                rankListFragment.m52876p4().replaceData(listM52856o4);
                rankListFragment.showContent();
                C4706z c4706zM52877q5 = rankListFragment.m52877q4();
                if (c4706zM52877q5 != null && (c4677k0 = c4706zM52877q5.f4650h) != null && (root = c4677k0.getRoot()) != null) {
                    root.setVisibility(0);
                }
                rankListFragment.m52875j4(listM52856o4);
                return Unit.INSTANCE;
            }
            if (rankListFragment.m52883x4()) {
                rankListFragment.m52869U4();
            } else {
                BaseFragment.showFailView$default(rankListFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.rank.list.n
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RankListFragment.m52829Q4(this.f42535b, view);
                    }
                }, 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m52829Q4(RankListFragment rankListFragment, View view) {
        rankListFragment.showContent();
        rankListFragment.showLoading();
        rankListFragment.m52872Z4();
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m52831R4(RankListFragment rankListFragment) {
        C4706z c4706zM52877q4 = rankListFragment.m52877q4();
        if (c4706zM52877q4 == null) {
            return Unit.INSTANCE;
        }
        RankShimmer rsLoading = c4706zM52877q4.f4647e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66577h(rsLoading);
        c4706zM52877q4.f4647e.m53323f();
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4706zM52877q4.f4648f;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        C27046k.m66685H(swipeRecyclerLayout);
        FrameLayout rankListLoadingView = c4706zM52877q4.f4645c;
        Intrinsics.checkNotNullExpressionValue(rankListLoadingView, "rankListLoadingView");
        C27046k.m66700o(rankListLoadingView);
        WrapperLoadingView wrapperLoadingView = rankListFragment.f42484g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.setVisibility(8);
        }
        super.showContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m52833S4(RankListFragment rankListFragment) {
        C4706z c4706zM52877q4 = rankListFragment.m52877q4();
        if (c4706zM52877q4 == null) {
            return Unit.INSTANCE;
        }
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4706zM52877q4.f4648f;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        C27046k.m66700o(swipeRecyclerLayout);
        rankListFragment.m52870V4(false);
        c4706zM52877q4.f4647e.m53322e();
        RankShimmer rsLoading = c4706zM52877q4.f4647e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66594y(rsLoading);
        FrameLayout rankListLoadingView = c4706zM52877q4.f4645c;
        Intrinsics.checkNotNullExpressionValue(rankListLoadingView, "rankListLoadingView");
        C27046k.m66700o(rankListLoadingView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m52838W4(RankListFragment rankListFragment, boolean z11) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        if (C22218w1.m52124d(rankListFragment.getArguments()) && z11) {
            C4706z c4706zM52877q4 = rankListFragment.m52877q4();
            if (c4706zM52877q4 != null && (linearLayoutCompat2 = c4706zM52877q4.f4644b) != null) {
                C27046k.m66685H(linearLayoutCompat2);
            }
        } else {
            C4706z c4706zM52877q5 = rankListFragment.m52877q4();
            if (c4706zM52877q5 != null && (linearLayoutCompat = c4706zM52877q5.f4644b) != null) {
                C27046k.m66700o(linearLayoutCompat);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final RankSubTabItemConfig m52840X4(RankListFragment rankListFragment) {
        RankSubTabItemConfig rankSubTabItemConfig;
        Bundle arguments = rankListFragment.getArguments();
        if (arguments != null && (rankSubTabItemConfig = (RankSubTabItemConfig) arguments.getParcelable("rank_sub_config")) != null) {
            return rankSubTabItemConfig;
        }
        return RankConfig.f42417a.m52730h();
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m52844a5(RankListFragment rankListFragment) {
        C44128b.m97266j(rankListFragment.getTAG(), "fetchData , isVisible:" + rankListFragment.isVisible());
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(rankListFragment), null, null, new RankListFragment$triggerFetchDataList$1$1(rankListFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m52852k4(RankListFragment rankListFragment, Boolean bool) {
        rankListFragment.m52876p4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m52853l4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m52854m4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "CurrencyChangedObs");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m52855n4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o4 */
    private final List<RankEntity> m52856o4(List<RankEntity> list) {
        boolean z11;
        if (!C22218w1.m52124d(getArguments())) {
            return list;
        }
        List<RankEntity> listTake = CollectionsKt.take(list, 5);
        if (list.size() > listTake.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m52870V4(z11);
        return listTake;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m52865z4(final RankListFragment rankListFragment) {
        C4706z c4706zM52877q4 = rankListFragment.m52877q4();
        if (c4706zM52877q4 == null) {
            return Unit.INSTANCE;
        }
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4706zM52877q4.f4648f;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        RecyclerView recyclerView = swipeRecyclerLayout.getRecyclerView();
        swipeRecyclerLayout.setEnableRefresh(false);
        swipeRecyclerLayout.setEnableLoadMore(false);
        swipeRecyclerLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.rank.list.o
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                RankListFragment.m52799A4(interfaceC38162f);
            }
        });
        Intrinsics.checkNotNull(recyclerView);
        C22912t.m54409g(recyclerView, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(rankListFragment.new C22469b());
        if (rankListFragment.m52876p4().m52787q()) {
            rankListFragment.m52876p4().bindToRecyclerView(recyclerView);
        }
        rankListFragment.m52876p4().setPreLoadNumber(2);
        rankListFragment.m52876p4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.rank.list.q
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws Throwable {
                RankListFragment.m52801B4(this.f42539a, baseQuickAdapter, view, i11);
            }
        });
        rankListFragment.m52876p4().m52783l(rankListFragment.m52878r4());
        rankListFragment.m52876p4().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.rank.list.r
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return RankListFragment.m52803C4(this.f42540a, baseQuickAdapter, view, i11);
            }
        });
        Disposable disposableSubscribe = rankListFragment.f42485h0.debounce(100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.rank.list.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RankListFragment.m52805D4(this.f42541b, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, rankListFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public final void m52866J4(final boolean z11) {
        final C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 == null) {
            return;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.rank.list.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RankListFragment.m52818K4(this.f42529b, c4706zM52877q4, z11);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public final void m52868T4() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RankListFragment$showMarketChooseDialog$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: U4 */
    public final void m52869U4() {
        C4677k0 c4677k0;
        ConstraintLayout root;
        showContent();
        C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 != null && (c4677k0 = c4706zM52877q4.f4650h) != null && (root = c4677k0.getRoot()) != null) {
            root.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m52873b5(C4706z c4706z) {
        if (!C4392c.m4013a(m52858t4())) {
            return;
        }
        int iM66658b = C27040e.m66658b(12);
        View viewFindViewById = findViewById(R$id.margin_view);
        if (viewFindViewById != null) {
            ViewExtKt.m66585p(viewFindViewById, iM66658b, 0, iM66658b, 0, 10, null);
        }
        c4706z.f4647e.setPadding(iM66658b, 0, iM66658b, 0);
        ViewGroup.LayoutParams layoutParams = c4706z.f4647e.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C27040e.m66658b(320);
        }
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4706z.f4648f;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        ViewGroup.LayoutParams layoutParams2 = swipeRecyclerLayout.getLayoutParams();
        layoutParams2.height = C27040e.m66658b(320);
        swipeRecyclerLayout.getRecyclerView().setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: h4 */
    public final List<RankEntity> m52874h4(List<RankEntity> list, boolean z11) {
        if (C4392c.m4015c(m52880u4()) && z11) {
            ArrayList arrayList = new ArrayList();
            for (RankEntity rankEntity : list) {
                String symbolCode = rankEntity.getSymbolCode();
                if (symbolCode == null) {
                    symbolCode = rankEntity.getSymbol();
                }
                if (symbolCode != null) {
                    arrayList.add(symbolCode);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            Collection data = m52876p4().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : data) {
                RankEntity rankEntity2 = (RankEntity) obj;
                if (rankEntity2.isCountDownType()) {
                    String symbolCode2 = rankEntity2.getSymbolCode();
                    if (symbolCode2 == null) {
                        symbolCode2 = rankEntity2.getSymbol();
                    }
                    if (!CollectionsKt.contains(set, symbolCode2)) {
                        arrayList2.add(obj);
                    }
                }
            }
            return CollectionsKt.plus((Collection) arrayList2, (Iterable) list);
        }
        return list;
    }

    /* JADX INFO: renamed from: j4 */
    public final void m52875j4(List<RankEntity> list) {
        if (C4392c.m4015c(m52880u4())) {
            NewRankRedDotHelper.f42388a.m52648q(m52881v4().getType(), list);
            if (isShowing()) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new RankListFragment$dealOnNewRank$1(list, null), 3, null);
            }
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m52884y4();
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.rank.list.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankListFragment.m52852k4(this.f42546b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.rank.list.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RankListFragment.m52853l4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.rank.list.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RankListFragment.m52854m4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.rank.list.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                RankListFragment.m52855n4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m52807E4();
        C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 != null) {
            m52873b5(c4706zM52877q4);
        }
        if (C12573b.f21598a.m23696a()) {
            "WIDGET_MOVE_ACTION".length();
        }
        C12572a.m23692a(this, false, new RankListFragment$doOnLazyInitView$$inlined$bindFlowEvent$1("WIDGET_MOVE_ACTION", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m52866J4(false);
        C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 == null) {
            return;
        }
        RankShimmer rsLoading = c4706zM52877q4.f4647e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66577h(rsLoading);
        c4706zM52877q4.f4647e.m53323f();
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        super.onShow();
        if (m52876p4().getData().isEmpty()) {
            showLoading();
            m52872Z4();
        } else {
            C4706z c4706zM52877q4 = m52877q4();
            if (c4706zM52877q4 != null && (swipeRefreshRecyclerView = c4706zM52877q4.f4648f) != null) {
                C22912t.m54417o(swipeRefreshRecyclerView, new Runnable() { // from class: com.kubi.quotefacade.rank.list.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RankListFragment.m52820L4(this.f42508b);
                    }
                }, 400L);
            }
        }
        m52866J4(true);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C224702(null), 3, null);
    }

    /* JADX INFO: renamed from: s4 */
    public final WrapperLoadingView m52879s4() {
        C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 == null) {
            return null;
        }
        if (this.f42484g0 == null) {
            FrameLayout frameLayout = new FrameLayout(c4706zM52877q4.f4646d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            WrapperLoadingView wrapperLoadingView = new WrapperLoadingView(c4706zM52877q4.f4646d.getContext(), frameLayout);
            this.f42484g0 = wrapperLoadingView;
            c4706zM52877q4.f4646d.addView(wrapperLoadingView, 1);
        }
        return this.f42484g0;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void showFailView(int tips, int icon, @Nullable View.OnClickListener click) {
        C4706z c4706zM52877q4 = m52877q4();
        if (c4706zM52877q4 != null) {
            m52870V4(false);
            RankShimmer rsLoading = c4706zM52877q4.f4647e;
            Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
            ViewExtKt.m66577h(rsLoading);
            c4706zM52877q4.f4647e.m53323f();
            SwipeRefreshRecyclerView swipeRecyclerLayout = c4706zM52877q4.f4648f;
            Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
            C27046k.m66700o(swipeRecyclerLayout);
            FrameLayout rankListLoadingView = c4706zM52877q4.f4645c;
            Intrinsics.checkNotNullExpressionValue(rankListLoadingView, "rankListLoadingView");
            C27046k.m66685H(rankListLoadingView);
            WrapperLoadingView wrapperLoadingViewM52879s4 = m52879s4();
            if (wrapperLoadingViewM52879s4 != null) {
                wrapperLoadingViewM52879s4.showEmpty(tips, icon, click);
            }
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final void m52882w4(int i11, RankEntity rankEntity) throws Throwable {
        Object objM103844constructorimpl;
        double dDoubleValue;
        String tag = getTAG();
        Intrinsics.checkNotNullExpressionValue(tag, "<get-TAG>(...)");
        boolean zM42528a = C19241c.f35620a.m42528a();
        boolean z11 = !zM42528a;
        try {
            Result.Companion companion = Result.INSTANCE;
            String uniqueCode = rankEntity.getUniqueCode(m52881v4().getType());
            if (uniqueCode != null) {
                if (m52881v4().isRankFutureSubTab()) {
                    InterfaceC37752d.a.m85122a(C37304a.f82764a, uniqueCode, null, null, null, 14, null);
                } else {
                    ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), uniqueCode, null, null, null, 14, null);
                }
                BigDecimal changeRate = rankEntity.getChangeRate();
                if (changeRate != null) {
                    dDoubleValue = changeRate.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                m52871Y4(uniqueCode, dDoubleValue);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } else {
                return;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (!zM42528a && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                C44128b.m97262f("crash_issue", "crash_issue->【" + tag + " 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            } else {
                throw thM103847exceptionOrNullimpl;
            }
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            String tag2 = getTAG();
            Intrinsics.checkNotNullExpressionValue(tag2, "<get-TAG>(...)");
            C37266a.m83411b(thM103847exceptionOrNullimpl2, tag2);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final boolean m52883x4() {
        Collection data = m52876p4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return !data.isEmpty();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
    }
}
