package com.kubi.quotefacade.market;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4678l;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.adapter.MarketItemListAdapter;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.event.MarketListContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.exception.QuoteMessage;
import com.kubi.quotefacade.helper.CoinListSortHelper;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.market.sort.SymbolsSortType;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import lv.C42318d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36978r;
import p212dv.C36979s;
import p212dv.C36980t;
import p212dv.C36981u;
import p241ev.C37266a;
import p402kf.C41016c;
import p569qq.C43846g;
import p569qq.C43852m;
import p671uq.C45290a;
import p809yu.C46588u;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
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
import p852kotlin.text.StringsKt;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarketListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010+\u001a\u00020'H&¢\u0006\u0002\u00109J\u001a\u0010:\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u00182\u0006\u0010;\u001a\u00020\fH&J\b\u0010<\u001a\u00020\fH&J\u001a\u0010=\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u00182\u0006\u0010;\u001a\u00020\fH&J\b\u0010>\u001a\u00020\fH\u0014J\u001a\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u000207H\u0016J\b\u0010J\u001a\u000207H\u0016J\b\u0010K\u001a\u000207H\u0016J\b\u0010L\u001a\u000207H\u0016J\b\u0010M\u001a\u000207H\u0016J\b\u0010N\u001a\u000207H\u0002J\u0010\u0010O\u001a\u0002072\u0006\u0010P\u001a\u00020QH\u0014J\b\u0010R\u001a\u000207H\u0014J\b\u0010S\u001a\u000207H\u0002J\b\u0010T\u001a\u000207H\u0002J\b\u0010U\u001a\u000207H\u0002J\b\u0010V\u001a\u000207H\u0002J\b\u0010W\u001a\u00020!H\u0002J\u0016\u0010X\u001a\u0002072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0007J\u0018\u0010\\\u001a\u0002072\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0ZH\u0007J\b\u0010_\u001a\u000207H\u0002J\n\u0010`\u001a\u0004\u0018\u00010$H\u0004J,\u0010a\u001a\u0002072\u0006\u0010b\u001a\u00020c2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020c0d2\u0006\u0010;\u001a\u00020\fH\u0002J\u0012\u0010e\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u00010\u0018H\u0002J\u0014\u0010f\u001a\u0002072\n\b\u0002\u0010g\u001a\u0004\u0018\u00010hH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0010\u001a\u0004\b(\u0010)R\u001d\u0010+\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0010\u001a\u0004\b,\u0010)R\u001d\u0010.\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0010\u001a\u0004\b/\u0010\u001cR+\u00101\u001a\u0012\u0012\f\u0012\n 2*\u0004\u0018\u00010'0'\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0010\u001a\u0004\b3\u00104R\"\u0010?\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020A0@8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006i"}, m90084d2 = {"Lcom/kubi/quotefacade/market/MarketListFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/event/MarketListContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentCommonListBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentCommonListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "marketType", "", "getMarketType", "()I", "marketType$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;", "adapter$delegate", "dataList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "fromType", "getFromType", "()Ljava/lang/Integer;", "fromType$delegate", "mSortHelper", "Lcom/kubi/quotefacade/helper/CoinListSortHelper;", "scrolling", "", "bufferNotify", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "firstRequest", "l1p", "", "getL1p", "()Ljava/lang/String;", "l1p$delegate", "l2p", "getL2p", "l2p$delegate", "pageSize", "getPageSize", "pageSize$delegate", "symbol", "kotlin.jvm.PlatformType", "getSymbol", "()Ljava/util/ArrayList;", "symbol$delegate", "onMarketListItemClick", "", "item", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "handleAddOrCancelFavorite", ViewProps.POSITION, "getSymbolType", "handleFavorite", "getLayout", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onLoad", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "showLoading", "showContent", "fetchData", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "showSkeletonLoading", "hideSkeletonLoading", "initViews", "initSort", "curIsRightCustomSortType", "dealWsSpotDataAndRefresh", "wsSpotList", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "dealWsFutureDataAndRefresh", "wsFutureList", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "handleItemClick", "pop", "initPopView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "getFavorVisible", "sortData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketListFragment.kt\ncom/kubi/quotefacade/market/MarketListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 4 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,658:1\n147#2,16:659\n46#3,14:675\n46#3,14:716\n93#4,4:689\n93#4,4:693\n93#4,4:697\n93#4,4:701\n1#5:705\n1869#6,2:706\n1869#6,2:708\n1869#6,2:710\n1869#6,2:712\n54#7,2:714\n45#7,7:730\n310#8:737\n326#8,4:738\n311#8:742\n310#8:743\n326#8,4:744\n311#8:748\n310#8:749\n326#8,4:750\n311#8:754\n*S KotlinDebug\n*F\n+ 1 MarketListFragment.kt\ncom/kubi/quotefacade/market/MarketListFragment\n*L\n82#1:659,16\n156#1:675,14\n242#1:716,14\n233#1:689,4\n252#1:693,4\n256#1:697,4\n262#1:701,4\n480#1:706,2\n486#1:708,2\n511#1:710,2\n518#1:712,2\n221#1:714,2\n333#1:730,7\n377#1:737\n377#1:738,4\n377#1:742\n386#1:743\n386#1:744,4\n386#1:748\n396#1:749\n396#1:750,4\n396#1:754\n*E\n"})
public abstract class MarketListFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: i0 */
    public static final /* synthetic */ KProperty<Object>[] f42177i0 = {Reflection.property1(new PropertyReference1Impl(MarketListFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentCommonListBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public CoinListSortHelper f42183Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f42184a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f42185b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public C43724b f42186c0;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f42178U = C45681e.m100799e(this, new Function1<MarketListFragment, C4678l>() { // from class: com.kubi.quotefacade.market.MarketListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4678l invoke(@NotNull MarketListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4678l.m4668a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4678l, Unit>() { // from class: com.kubi.quotefacade.market.MarketListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4678l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4678l c4678l) {
            invoke(c4678l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f42179V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(MarketListFragment.m52286X4(this.f42210b));
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f42180W = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52295d4(this.f42334b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final ArrayList<TradeItemBean> f42181X = new ArrayList<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f42182Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52303k4(this.f42379b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    public boolean f42187d0 = true;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f42188e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52282V4(this.f42380b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f42189f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52284W4(this.f42381b);
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f42190g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52289Z4(this.f42382b);
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f42191h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketListFragment.m52299g5(this.f42211b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$a */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/market/MarketListFragment$initViews$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22274a extends RecyclerView.OnScrollListener {
        public C22274a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C43724b c43724bM52322a5;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            MarketListFragment.this.f42184a0 = newState != 0;
            if (!MarketListFragment.this.f42184a0 && MarketListFragment.this.f42185b0) {
                MarketListFragment.this.m52326l4().notifyDataSetChanged();
                MarketListFragment.this.f42185b0 = false;
            }
            C43724b c43724bM52322a6 = MarketListFragment.this.m52322a5();
            if (c43724bM52322a6 == null || !c43724bM52322a6.m96299I() || (c43724bM52322a5 = MarketListFragment.this.m52322a5()) == null) {
                return;
            }
            c43724bM52322a5.m96331y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$bindState$2 */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "", "Lcom/kubi/data/entity/TradeItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$bindState$2", m90122f = "MarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222762 extends SuspendLambda implements Function2<List<? extends TradeItemBean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C222762(Continuation<? super C222762> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C222762 c222762 = MarketListFragment.this.new C222762(continuation);
            c222762.L$0 = obj;
            return c222762;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends TradeItemBean> list, Continuation<? super Unit> continuation) {
            return ((C222762) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j(MarketListFragment.this.getTAG(), "marketQuoteList.bindState==> " + list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$bindState$4 */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$bindState$4", m90122f = "MarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222784 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C222784(Continuation<? super C222784> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C222784 c222784 = MarketListFragment.this.new C222784(continuation);
            c222784.L$0 = obj;
            return c222784;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C222784) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j(MarketListFragment.this.getTAG(), "empty");
            MarketListFragment.this.m52337z4();
            BaseFragment.showEmptyView$default(MarketListFragment.this, 0, 0, (View.OnClickListener) null, 7, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListFragment$bindState$6 */
    /* JADX INFO: compiled from: MarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListFragment$bindState$6", m90122f = "MarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C222806 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C222806(Continuation<? super C222806> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C222806 c222806 = MarketListFragment.this.new C222806(continuation);
            c222806.L$0 = obj;
            return c222806;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C222806) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 == null) {
                return Unit.INSTANCE;
            }
            C44128b.m97266j(MarketListFragment.this.getTAG(), Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            MarketListFragment.this.m52337z4();
            final MarketListFragment marketListFragment = MarketListFragment.this;
            BaseFragment.showFailView$default(marketListFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.market.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarketListFragment.C222806.m52339f(marketListFragment, view);
                }
            }, 3, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m52339f(MarketListFragment marketListFragment, View view) {
            String strM52329p4;
            String strM52330q4;
            int iIntValue;
            ArrayList arrayListM52333t4 = marketListFragment.m52333t4();
            if (arrayListM52333t4 != null && (strM52329p4 = marketListFragment.m52329p4()) != null && (strM52330q4 = marketListFragment.m52330q4()) != null) {
                int iM52331r4 = marketListFragment.m52331r4();
                Integer numM52332s4 = marketListFragment.m52332s4();
                if (numM52332s4 != null) {
                    iIntValue = numM52332s4.intValue();
                } else {
                    iIntValue = 1000;
                }
                marketListFragment.sendIntent(new MarketListContract$UIIntent.FetchListData(iM52331r4, strM52329p4, strM52330q4, iIntValue, arrayListM52333t4));
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public abstract void mo52321Y4(@NotNull TradeItemBean tradeItemBean, @Nullable Integer num, @NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: u4 */
    public abstract int mo52334u4();

    /* JADX INFO: renamed from: v4 */
    public abstract void mo52335v4(@Nullable TradeItemBean tradeItemBean, int i11);

    /* JADX INFO: renamed from: w4 */
    public abstract void mo52336w4(@Nullable TradeItemBean tradeItemBean, int i11);

    /* JADX INFO: renamed from: D4 */
    public static final Unit m52246D4(TradeItemBean tradeItemBean, MarketListFragment marketListFragment) {
        if (tradeItemBean != null) {
            IQuoteFacadeService.f41383a.get().mo50692S(tradeItemBean, marketListFragment.m52331r4() == 1 ? "Futures" : IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m52252G4(MarketListFragment marketListFragment) {
        CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52031l0();
        }
        m52298f5(marketListFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m52254H4(MarketListFragment marketListFragment) {
        CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52023K();
        }
        m52298f5(marketListFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m52256I4(MarketListFragment marketListFragment) {
        CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52033n0();
        }
        m52298f5(marketListFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m52258J4(MarketListFragment marketListFragment) {
        CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52036v();
        }
        m52298f5(marketListFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m52260K4(C4678l c4678l) {
        FrameLayout flChangeRate = c4678l.f4414b.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        ViewGroup.LayoutParams layoutParams = flChangeRate.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(C27040e.m66658b(33));
        }
        flChangeRate.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m52262L4(C4678l c4678l) {
        FrameLayout flChangeRate = c4678l.f4414b.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        ViewGroup.LayoutParams layoutParams = flChangeRate.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(C27040e.m66658b(16));
        }
        flChangeRate.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m52264M4(C4678l c4678l) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z11 = c4678l.f4414b.getRoot().getLayoutDirection() == 1;
        AppCompatImageView toggleSortTypeIv = c4678l.f4414b.f4455l;
        Intrinsics.checkNotNullExpressionValue(toggleSortTypeIv, "toggleSortTypeIv");
        ViewGroup.LayoutParams layoutParams = toggleSortTypeIv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (z11) {
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(C27040e.m66658b(0));
                marginLayoutParams.setMarginStart(C27040e.m66658b(16));
            }
        } else {
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(C27040e.m66658b(16));
                marginLayoutParams.setMarginStart(C27040e.m66658b(0));
            }
        }
        toggleSortTypeIv.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m52268O4(MarketListFragment marketListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int id2 = it.getId();
        if (id2 == R$id.changeRateSortTv) {
            MarketItemListAdapter marketItemListAdapterM52326l4 = marketListFragment.m52326l4();
            SymbolsSortType symbolsSortType = SymbolsSortType.CHANGE_RATE;
            marketItemListAdapterM52326l4.m50226r(symbolsSortType);
            if (marketListFragment.m52323e4()) {
                CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
                if (coinListSortHelper != null) {
                    coinListSortHelper.m52025M(true);
                }
                m52298f5(marketListFragment, null, 1, null);
            } else {
                CoinListSortHelper coinListSortHelper2 = marketListFragment.f42183Z;
                if (coinListSortHelper2 != null) {
                    coinListSortHelper2.m52035r0(symbolsSortType);
                }
            }
        } else if (id2 == R$id.marketCapSortTv) {
            MarketItemListAdapter marketItemListAdapterM52326l5 = marketListFragment.m52326l4();
            SymbolsSortType symbolsSortType2 = SymbolsSortType.MARKET_CAP;
            marketItemListAdapterM52326l5.m50226r(symbolsSortType2);
            if (marketListFragment.m52323e4()) {
                CoinListSortHelper coinListSortHelper3 = marketListFragment.f42183Z;
                if (coinListSortHelper3 != null) {
                    coinListSortHelper3.m52029a0(true);
                }
                m52298f5(marketListFragment, null, 1, null);
            } else {
                CoinListSortHelper coinListSortHelper4 = marketListFragment.f42183Z;
                if (coinListSortHelper4 != null) {
                    coinListSortHelper4.m52035r0(symbolsSortType2);
                }
            }
        } else if (id2 == R$id.fundingRateSortTv) {
            MarketItemListAdapter marketItemListAdapterM52326l6 = marketListFragment.m52326l4();
            SymbolsSortType symbolsSortType3 = SymbolsSortType.FUNDING_RATE;
            marketItemListAdapterM52326l6.m50226r(symbolsSortType3);
            if (marketListFragment.m52323e4()) {
                CoinListSortHelper coinListSortHelper5 = marketListFragment.f42183Z;
                if (coinListSortHelper5 != null) {
                    coinListSortHelper5.m52027P(true);
                }
                m52298f5(marketListFragment, null, 1, null);
            } else {
                CoinListSortHelper coinListSortHelper6 = marketListFragment.f42183Z;
                if (coinListSortHelper6 != null) {
                    coinListSortHelper6.m52035r0(symbolsSortType3);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    private final void m52294c5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.market.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52296d5(this.f42213b);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public static final MarketItemListAdapter m52295d4(MarketListFragment marketListFragment) {
        return new MarketItemListAdapter(true, Integer.valueOf(marketListFragment.m52331r4()));
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m52298f5(MarketListFragment marketListFragment, Action action, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sortData");
        }
        if ((i11 & 1) != 0) {
            action = null;
        }
        marketListFragment.m52297e5(action);
    }

    /* JADX INFO: renamed from: i4 */
    private final void m52301i4() {
        if (this.f42187d0) {
            showLoading();
            this.f42187d0 = false;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.market.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52302j4(this.f42331b);
            }
        });
    }

    /* JADX INFO: renamed from: o4 */
    private final Integer m52307o4() {
        return (Integer) this.f42182Y.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        List<WsFutureSnapshotEntity> listM82798a;
        List<WsMarketSnapshotEntity> listM82799a;
        List<TradeItemBean> listM82797a;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44128b.m97266j(getTAG(), "dispatchSingleEvent = " + singleEvent);
        if ((singleEvent instanceof C36979s) && (listM82797a = ((C36979s) singleEvent).m82797a()) != null) {
            C44128b.m97266j(getTAG(), "showContentView");
            this.f42181X.clear();
            this.f42181X.addAll(listM82797a);
            m52297e5(new Action() { // from class: com.kubi.quotefacade.market.c0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MarketListFragment.m52300h4(this.f42215b);
                }
            });
        }
        if (singleEvent instanceof C36978r) {
            C36978r c36978r = (C36978r) singleEvent;
            mo52336w4(c36978r.m82796a().getFirst(), c36978r.m82796a().getSecond().intValue());
        }
        if ((singleEvent instanceof C36981u) && (listM82799a = ((C36981u) singleEvent).m82799a()) != null) {
            m52325g4(listM82799a);
        }
        if (!(singleEvent instanceof C36980t) || (listM82798a = ((C36980t) singleEvent).m82798a()) == null) {
            return;
        }
        m52324f4(listM82798a);
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m52323e4() {
        CoinListSortHelper coinListSortHelper = this.f42183Z;
        if ((coinListSortHelper != null ? coinListSortHelper.getF42020n() : null) == SymbolsSortType.CHANGE_RATE) {
            return true;
        }
        CoinListSortHelper coinListSortHelper2 = this.f42183Z;
        if ((coinListSortHelper2 != null ? coinListSortHelper2.getF42020n() : null) == SymbolsSortType.FUNDING_RATE) {
            return true;
        }
        CoinListSortHelper coinListSortHelper3 = this.f42183Z;
        return (coinListSortHelper3 != null ? coinListSortHelper3.getF42020n() : null) == SymbolsSortType.MARKET_CAP;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f4 */
    public final void m52324f4(@NotNull List<WsFutureSnapshotEntity> wsFutureList) {
        String symbol;
        Intrinsics.checkNotNullParameter(wsFutureList, "wsFutureList");
        HashMap map = new HashMap();
        for (WsFutureSnapshotEntity wsFutureSnapshotEntity : wsFutureList) {
            if (wsFutureSnapshotEntity != null && (symbol = wsFutureSnapshotEntity.getSymbol()) != null && symbol.length() != 0) {
                map.put(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f42181X) {
            WsFutureSnapshotEntity wsFutureSnapshotEntity2 = (WsFutureSnapshotEntity) map.get(tradeItemBean.getSymbol());
            if (wsFutureSnapshotEntity2 != null) {
                tradeItemBean.setSymbol(wsFutureSnapshotEntity2.getSymbol());
                tradeItemBean.setLastDealPrice(C27039d.m66646f(Double.valueOf(wsFutureSnapshotEntity2.getLastPrice())));
                tradeItemBean.setChangeRate(Double.valueOf(wsFutureSnapshotEntity2.getPriceChgPct()));
                tradeItemBean.setValue(QuoteExKt.m51865p(tradeItemBean, wsFutureSnapshotEntity2));
                if (wsFutureSnapshotEntity2.getFundingRate() != null) {
                    tradeItemBean.fundingRate = wsFutureSnapshotEntity2.getFundingRate();
                }
            }
        }
        if (this.f42184a0) {
            this.f42185b0 = true;
        } else {
            m52298f5(this, null, 1, null);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: g4 */
    public final void m52325g4(@NotNull List<WsMarketSnapshotEntity> wsSpotList) {
        Intrinsics.checkNotNullParameter(wsSpotList, "wsSpotList");
        HashMap map = new HashMap();
        for (WsMarketSnapshotEntity wsMarketSnapshotEntity : wsSpotList) {
            if (wsMarketSnapshotEntity != null && wsMarketSnapshotEntity.getSymbolCode() != null) {
                map.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f42181X) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity2 = (WsMarketSnapshotEntity) map.get(tradeItemBean.getSymbol());
            if (wsMarketSnapshotEntity2 != null) {
                tradeItemBean.setSymbol(wsMarketSnapshotEntity2.getSymbolCode());
                tradeItemBean.setLastDealPrice(C27039d.m66646f(Double.valueOf(wsMarketSnapshotEntity2.getLastTradedPrice())));
                tradeItemBean.setEnableAuctionTrade(wsMarketSnapshotEntity2.isEnableAuctionTrade());
                tradeItemBean.getSymbolInfoEntity().setEnableAuctionTrade(Boolean.valueOf(wsMarketSnapshotEntity2.isEnableAuctionTrade()));
                tradeItemBean.setChangeRate(Double.valueOf(wsMarketSnapshotEntity2.getChangeRate()));
                tradeItemBean.setValue(C27039d.m66646f(Double.valueOf(wsMarketSnapshotEntity2.getVolValue())));
            }
        }
        if (this.f42184a0) {
            this.f42185b0 = true;
        } else {
            m52298f5(this, null, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_common_list;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MarketListViewModel.class);
    }

    @NotNull
    /* JADX INFO: renamed from: l4 */
    public final MarketItemListAdapter m52326l4() {
        return (MarketItemListAdapter) this.f42180W.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: m4 */
    public final C4678l m52327m4() {
        return (C4678l) this.f42178U.getValue(this, f42177i0[0]);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m52270P4();
        m52250F4();
    }

    /* JADX INFO: renamed from: p4 */
    public final String m52329p4() {
        return (String) this.f42188e0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    public final String m52330q4() {
        return (String) this.f42189f0.getValue();
    }

    /* JADX INFO: renamed from: r4 */
    public final int m52331r4() {
        return ((Number) this.f42179V.getValue()).intValue();
    }

    /* JADX INFO: renamed from: s4 */
    public final Integer m52332s4() {
        return (Integer) this.f42190g0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public final ArrayList<String> m52333t4() {
        return (ArrayList) this.f42191h0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public final void m52337z4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.market.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52240A4(this.f42217b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m52240A4(MarketListFragment marketListFragment) {
        C4678l c4678lM52327m4 = marketListFragment.m52327m4();
        if (c4678lM52327m4 == null) {
            return Unit.INSTANCE;
        }
        c4678lM52327m4.f4416d.m53323f();
        RankShimmer rsLoading = c4678lM52327m4.f4416d;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66700o(rsLoading);
        RecyclerView recyclerView = c4678lM52327m4.f4415c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66685H(recyclerView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    private final void m52242B4(BaseViewHolder baseViewHolder, BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter, final int i11) {
        Boolean boolValueOf;
        int i12;
        boolean z11;
        Boolean boolValueOf2;
        int i13;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        final TradeItemBean item = baseQuickAdapter.getItem(i11);
        int i14 = 0;
        BaseViewHolder gone = baseViewHolder.setGone(R$id.llPin, false);
        int i15 = R$id.llReminder;
        Boolean boolValueOf3 = null;
        if (item != null && (symbolInfoEntity2 = item.getSymbolInfoEntity()) != null) {
            boolValueOf = Boolean.valueOf(symbolInfoEntity2.isPreviewEnableShow());
        } else {
            boolValueOf = null;
        }
        boolean z12 = true;
        gone.setGone(i15, !C27025c.m66566d(boolValueOf));
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivFavor);
        if (m52328n4(item)) {
            i12 = R$mipmap.ic_favor;
        } else {
            i12 = R$drawable.ic_unfav_white;
        }
        imageView.setImageResource(i12);
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(i15);
        if (m52331r4() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (item != null && (symbolInfoEntity = item.getSymbolInfoEntity()) != null) {
            boolValueOf2 = Boolean.valueOf(symbolInfoEntity.isPreviewEnableShow());
        } else {
            boolValueOf2 = null;
        }
        if (!C27025c.m66566d(boolValueOf2)) {
            z12 = false;
        }
        if (!PriceAlertVisibilityHelper.f42102a.m52114a(z11, z12)) {
            i14 = 8;
        }
        linearLayout.setVisibility(i14);
        if (linearLayout.getVisibility() == 0) {
            ImageView imageView2 = (ImageView) baseViewHolder.getView(R$id.ivReminder);
            if (item != null) {
                boolValueOf3 = Boolean.valueOf(item.isAlarm());
            }
            if (C27025c.m66566d(boolValueOf3)) {
                i13 = R$mipmap.icon_trade_menu_alerted;
            } else {
                i13 = R$drawable.icon_trade_menu_alert_white;
            }
            imageView2.setImageResource(i13);
            baseViewHolder.setOnClickListener(i15, new View.OnClickListener() { // from class: com.kubi.quotefacade.market.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarketListFragment.m52244C4(this.f42372b, item, view);
                }
            });
        }
        baseViewHolder.setOnClickListener(R$id.llFavor, new View.OnClickListener() { // from class: com.kubi.quotefacade.market.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MarketListFragment.m52248E4(this.f42374b, item, i11, view);
            }
        });
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m52244C4(final MarketListFragment marketListFragment, final TradeItemBean tradeItemBean, View view) {
        String str;
        String symbol;
        if (marketListFragment.m52331r4() == 1) {
            str = "B6FuturesMarkets";
        } else {
            str = "B5SpotsMarkets";
        }
        if (tradeItemBean == null || (symbol = tradeItemBean.getSymbol()) == null) {
            symbol = "";
        }
        C43852m.m96590b(str, "pop", "priceAlarm", TuplesKt.m90091to("symbol", symbol), TuplesKt.m90091to("is_login", Integer.valueOf(IUserService.a.get().c() ? 1 : 0)), TuplesKt.m90091to("norm_version", "1"));
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.market.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52246D4(tradeItemBean, marketListFragment);
            }
        }), 1, (Object) null);
        C43724b c43724bM52322a5 = marketListFragment.m52322a5();
        if (c43724bM52322a5 != null) {
            c43724bM52322a5.m96331y();
        }
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m52248E4(MarketListFragment marketListFragment, TradeItemBean tradeItemBean, int i11, View view) {
        marketListFragment.mo52335v4(tradeItemBean, i11);
    }

    /* JADX INFO: renamed from: F4 */
    private final void m52250F4() {
        final C4678l c4678lM52327m4 = m52327m4();
        if (c4678lM52327m4 == null) {
            return;
        }
        FrameLayout frameLayout = c4678lM52327m4.f4414b.f4454k;
        Intrinsics.checkNotNull(frameLayout);
        this.f42183Z = new CoinListSortHelper(frameLayout);
        LinearLayout llName = c4678lM52327m4.f4414b.f4453j;
        Intrinsics.checkNotNullExpressionValue(llName, "llName");
        C27046k.m66711z(llName, 0L, new Function0() { // from class: com.kubi.quotefacade.market.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52252G4(this.f42212b);
            }
        }, 1, null);
        LinearLayout llAmount = c4678lM52327m4.f4414b.f4452i;
        Intrinsics.checkNotNullExpressionValue(llAmount, "llAmount");
        C27046k.m66711z(llAmount, 0L, new Function0() { // from class: com.kubi.quotefacade.market.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52254H4(this.f42214b);
            }
        }, 1, null);
        LinearLayout flPrice = c4678lM52327m4.f4414b.f4446c;
        Intrinsics.checkNotNullExpressionValue(flPrice, "flPrice");
        C27046k.m66711z(flPrice, 0L, new Function0() { // from class: com.kubi.quotefacade.market.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52256I4(this.f42216b);
            }
        }, 1, null);
        FrameLayout flChangeRate = c4678lM52327m4.f4414b.f4445b;
        Intrinsics.checkNotNullExpressionValue(flChangeRate, "flChangeRate");
        C27046k.m66711z(flChangeRate, 0L, new Function0() { // from class: com.kubi.quotefacade.market.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52258J4(this.f42218b);
            }
        }, 1, null);
        if (m52331r4() == 1) {
            AppCompatImageView toggleSortTypeIv = c4678lM52327m4.f4414b.f4455l;
            Intrinsics.checkNotNullExpressionValue(toggleSortTypeIv, "toggleSortTypeIv");
            C27046k.m66685H(toggleSortTypeIv);
            runOnUiThread(new Function0() { // from class: com.kubi.quotefacade.market.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketListFragment.m52260K4(c4678lM52327m4);
                }
            });
        } else {
            AppCompatImageView toggleSortTypeIv2 = c4678lM52327m4.f4414b.f4455l;
            Intrinsics.checkNotNullExpressionValue(toggleSortTypeIv2, "toggleSortTypeIv");
            C27046k.m66700o(toggleSortTypeIv2);
            runOnUiThread(new Function0() { // from class: com.kubi.quotefacade.market.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketListFragment.m52262L4(c4678lM52327m4);
                }
            });
        }
        runOnUiThread(new Function0() { // from class: com.kubi.quotefacade.market.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52264M4(c4678lM52327m4);
            }
        });
        AppCompatImageView toggleSortTypeIv3 = c4678lM52327m4.f4414b.f4455l;
        Intrinsics.checkNotNullExpressionValue(toggleSortTypeIv3, "toggleSortTypeIv");
        C27046k.m66711z(toggleSortTypeIv3, 0L, new Function0() { // from class: com.kubi.quotefacade.market.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketListFragment.m52266N4(this.f42329b, c4678lM52327m4);
            }
        }, 1, null);
        c4678lM52327m4.f4414b.f4452i.performClick();
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m52266N4(final MarketListFragment marketListFragment, C4678l c4678l) {
        int iM66658b;
        SymbolsSortType f42021o;
        Context context = marketListFragment.getContext();
        if (context != null) {
            if (c4678l.f4414b.getRoot().getLayoutDirection() == 1) {
                iM66658b = C27040e.m66658b(-16);
            } else {
                iM66658b = 0;
            }
            CoinListSortHelper coinListSortHelper = marketListFragment.f42183Z;
            if (coinListSortHelper == null || (f42021o = coinListSortHelper.getF42021o()) == null) {
                f42021o = SymbolsSortType.CHANGE_RATE;
            }
            new C42318d(context, f42021o, true ^ Intrinsics.areEqual(marketListFragment.m52329p4(), "COIN_BASE"), new Function1() { // from class: com.kubi.quotefacade.market.s
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketListFragment.m52268O4(this.f42345b, (View) obj);
                }
            }).m96311U(ContextCompat.getColor(context, R$color.c_transparent)).m96319d0(c4678l.f4414b.f4445b, iM66658b, 0, 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    private final void m52270P4() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        C4678l c4678lM52327m4 = m52327m4();
        if (c4678lM52327m4 != null && (recyclerView5 = c4678lM52327m4.f4415c) != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        if (m52326l4().m50223j()) {
            MarketItemListAdapter marketItemListAdapterM52326l4 = m52326l4();
            C4678l c4678lM52327m5 = m52327m4();
            if (c4678lM52327m5 != null) {
                recyclerView4 = c4678lM52327m5.f4415c;
            } else {
                recyclerView4 = null;
            }
            marketItemListAdapterM52326l4.bindToRecyclerView(recyclerView4);
        }
        C4678l c4678lM52327m6 = m52327m4();
        if (c4678lM52327m6 != null && (recyclerView3 = c4678lM52327m6.f4415c) != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C4678l c4678lM52327m7 = m52327m4();
        if (c4678lM52327m7 != null && (recyclerView2 = c4678lM52327m7.f4415c) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        m52317x4();
        m52326l4().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.market.k
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return MarketListFragment.m52272Q4(this.f42332a, baseQuickAdapter, view, i11);
            }
        });
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.market.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketListFragment.m52274R4(this.f42336b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.market.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketListFragment.m52276S4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.market.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketListFragment.m52278T4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.market.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketListFragment.m52280U4(function2, obj);
            }
        }));
        C4678l c4678lM52327m8 = m52327m4();
        if (c4678lM52327m8 != null && (recyclerView = c4678lM52327m8.f4415c) != null) {
            recyclerView.addOnScrollListener(new C22274a());
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public static final boolean m52272Q4(MarketListFragment marketListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (marketListFragment.getView() != null && marketListFragment.isShowing()) {
            C43724b c43724bM52322a5 = marketListFragment.m52322a5();
            if (c43724bM52322a5 != null) {
                marketListFragment.m52242B4(new BaseViewHolder(c43724bM52322a5.m96292A()), marketListFragment.m52326l4(), i11);
                c43724bM52322a5.m96320e0(view, 1, 0, 0, 0);
            }
            marketListFragment.m52326l4().m50224n(i11);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m52274R4(MarketListFragment marketListFragment, Boolean bool) {
        marketListFragment.m52326l4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m52276S4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m52278T4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "CurrencyChangedObs");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m52280U4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final String m52282V4(MarketListFragment marketListFragment) {
        Bundle arguments = marketListFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: W4 */
    public static final String m52284W4(MarketListFragment marketListFragment) {
        Bundle arguments = marketListFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: X4 */
    public static final int m52286X4(MarketListFragment marketListFragment) {
        return marketListFragment.mo52334u4();
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Integer m52289Z4(MarketListFragment marketListFragment) {
        Bundle arguments = marketListFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("data_2"));
        }
        return null;
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m52292b5(MarketListFragment marketListFragment) {
        marketListFragment.m52326l4().m50224n(-1);
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m52296d5(MarketListFragment marketListFragment) {
        C4678l c4678lM52327m4 = marketListFragment.m52327m4();
        if (c4678lM52327m4 == null) {
            return Unit.INSTANCE;
        }
        RecyclerView recyclerView = c4678lM52327m4.f4415c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66700o(recyclerView);
        c4678lM52327m4.f4416d.m53322e();
        RankShimmer rsLoading = c4678lM52327m4.f4416d;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66685H(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    private final void m52297e5(Action action) {
        C44128b.m97266j(getTAG(), "sortData = " + action);
        if (!isDetached() && getParentFragment() != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketListFragment$sortData$1(this, action, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static final ArrayList m52299g5(MarketListFragment marketListFragment) {
        Bundle arguments = marketListFragment.getArguments();
        if (arguments != null) {
            return arguments.getStringArrayList("data_3");
        }
        return null;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m52300h4(MarketListFragment marketListFragment) {
        marketListFragment.m52337z4();
        marketListFragment.showContentView();
        if (Intrinsics.areEqual("ALL", marketListFragment.m52330q4())) {
            if ("B5markets_market_render".length() == 0 || "page_load_end".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(B5markets_market_render) or pointName(page_load_end) is null");
                return;
            }
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42381b("type", marketListFragment.m52331r4());
            C45290a.f101823a.m100101b("B5markets_market_render", "page_load_end", "", eventParametersBuilderAcquire.m42380a());
        }
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m52302j4(MarketListFragment marketListFragment) {
        String strM52329p4;
        String strM52330q4;
        String strM52329p5;
        String strM52330q5;
        Integer numM52332s4;
        C44128b.m97266j(marketListFragment.getTAG(), "fetchData l1p=" + marketListFragment.m52329p4() + " l2p=" + marketListFragment.m52330q4() + " pageSize=" + marketListFragment.m52332s4() + " symbol=" + marketListFragment.m52333t4());
        ArrayList<String> arrayListM52333t4 = marketListFragment.m52333t4();
        if (arrayListM52333t4 != null && (strM52329p5 = marketListFragment.m52329p4()) != null && (strM52330q5 = marketListFragment.m52330q4()) != null && (numM52332s4 = marketListFragment.m52332s4()) != null) {
            marketListFragment.sendIntent(new MarketListContract$UIIntent.FetchListData(marketListFragment.m52331r4(), strM52329p5, strM52330q5, numM52332s4.intValue(), arrayListM52333t4));
        }
        ArrayList<String> arrayListM52333t5 = marketListFragment.m52333t4();
        if (arrayListM52333t5 == null || arrayListM52333t5.isEmpty() || (strM52329p4 = marketListFragment.m52329p4()) == null || StringsKt.isBlank(strM52329p4) || (strM52330q4 = marketListFragment.m52330q4()) == null || StringsKt.isBlank(strM52330q4) || marketListFragment.m52332s4() == null) {
            C43846g.m96568c(new QuoteMessage("fetchData l1p=" + marketListFragment.m52329p4() + " l2p=" + marketListFragment.m52330q4() + " pageSize=" + marketListFragment.m52332s4() + " symbol=" + marketListFragment.m52333t4(), "MarketListFragment", false, 4, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Integer m52303k4(MarketListFragment marketListFragment) {
        Bundle arguments = marketListFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("from"));
        }
        return null;
    }

    /* JADX INFO: renamed from: x4 */
    private final void m52317x4() {
        m52326l4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.market.r
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                MarketListFragment.m52319y4(this.f42344a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m52319y4(MarketListFragment marketListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String symbol;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= marketListFragment.m52326l4().getData().size() - 1) {
            TradeItemBean tradeItemBean = marketListFragment.m52326l4().getData().get(i11);
            String tag = marketListFragment.getTAG();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("symbolInfoEntity=");
            SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
            if (symbolInfoEntity != null) {
                symbol = symbolInfoEntity.getSymbol();
            } else {
                symbol = null;
            }
            sb2.append(symbol);
            sb2.append(", code=");
            sb2.append(tradeItemBean.getSymbol());
            sb2.append(", from: ");
            sb2.append(marketListFragment.m52307o4());
            C44128b.m97266j(tag, sb2.toString());
            Intrinsics.checkNotNull(tradeItemBean);
            Integer numM52307o4 = marketListFragment.m52307o4();
            String strM52329p4 = marketListFragment.m52329p4();
            String str = "";
            if (strM52329p4 == null) {
                strM52329p4 = "";
            }
            String strM52330q4 = marketListFragment.m52330q4();
            if (strM52330q4 != null) {
                str = strM52330q4;
            }
            marketListFragment.mo52321Y4(tradeItemBean, numM52307o4, strM52329p4, str);
            return;
        }
        C44128b.m97266j(marketListFragment.getTAG(), "position: " + i11 + "，size: " + marketListFragment.m52326l4().getData().size());
    }

    @Nullable
    /* JADX INFO: renamed from: a5 */
    public final C43724b m52322a5() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (this.f42186c0 == null) {
            this.f42186c0 = new BubbleEasyPopup(context).m96307Q(R$layout.popwindow_layout_favriote_action).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.market.q
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    MarketListFragment.m52292b5(this.f42343b);
                }
            }).m96316Z(true).m96322p();
        }
        return this.f42186c0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        C44128b.m97266j(getTAG(), "bindState start " + Thread.currentThread() + ' ' + Thread.currentThread().getName());
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.MarketListFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getMarketQuoteList();
            }
        }, new C222762(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.MarketListFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C222784(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.MarketListFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C222806(null));
    }

    /* JADX INFO: renamed from: n4 */
    public final boolean m52328n4(TradeItemBean tradeItemBean) {
        Boolean boolValueOf = null;
        if (m52331r4() == 1) {
            if (tradeItemBean != null) {
                boolValueOf = Boolean.valueOf(C46588u.m102744c(tradeItemBean));
            }
            return C27025c.m66566d(boolValueOf);
        }
        if (tradeItemBean != null) {
            boolValueOf = Boolean.valueOf(C46588u.m102743b(tradeItemBean));
        }
        return C27025c.m66566d(boolValueOf);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        C43724b c43724bM52322a5;
        super.onHide();
        m52337z4();
        C43724b c43724bM52322a6 = m52322a5();
        if (c43724bM52322a6 != null && c43724bM52322a6.m96299I() && (c43724bM52322a5 = m52322a5()) != null) {
            c43724bM52322a5.m96331y();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        super.onLoad();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        super.onShow();
        m52301i4();
        if (Intrinsics.areEqual("ALL", m52330q4()) || Intrinsics.areEqual(m52329p4(), "ETF")) {
            if ("B5markets_market_render".length() == 0 || "page_load_start".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(B5markets_market_render) or pointName(page_load_start) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42381b("type", m52331r4());
                C45290a.f101823a.m100101b("B5markets_market_render", "page_load_start", "", eventParametersBuilderAcquire.m42380a());
            }
        }
        int iM52331r4 = m52331r4();
        if (iM52331r4 != 0) {
            if (iM52331r4 != 1) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("postType", m52329p4());
            jSONObject.put("name", m52330q4());
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("B6FuturesMarkets", "Tab", "2", jSONObject);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("postType", m52329p4());
        jSONObject2.put("name", m52330q4());
        Unit unit2 = Unit.INSTANCE;
        C43852m.m96593e("B5SpotsMarkets", "Tab", "2", jSONObject2);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        m52337z4();
        super.showContent();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        m52294c5();
    }
}
