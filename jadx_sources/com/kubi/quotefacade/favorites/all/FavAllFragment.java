package com.kubi.quotefacade.favorites.all;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4650a;
import bv.C4677k0;
import bv.C4690r;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.mvi.state.LazyBaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$dimen;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.favorites.C22098s0;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import com.kubi.quotefacade.favorites.spot.RecommendSpotFragment;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.helper.CoinListSortHelper;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import cv.C36547d;
import f00.C37304a;
import g00.InterfaceC37752d;
import g00.InterfaceC37754f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p402kf.C41016c;
import p569qq.C43852m;
import p671uq.C45290a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: FavAllFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 j2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001jB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u00101\u001a\u00020\u000eH\u0014J\b\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\u0010\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0014J\b\u00109\u001a\u000203H\u0014J\b\u0010:\u001a\u00020\u001dH\u0002J\b\u0010;\u001a\u000203H\u0002J\b\u0010<\u001a\u000203H\u0003J\b\u0010=\u001a\u000203H\u0002J\b\u0010>\u001a\u000203H\u0016J\b\u0010?\u001a\u000203H\u0016J\b\u0010@\u001a\u000203H\u0016J\b\u0010A\u001a\u000203H\u0016J\n\u0010B\u001a\u0004\u0018\u00010\"H\u0002J,\u0010C\u001a\u0002032\u0006\u0010D\u001a\u00020E2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020E0F2\u0006\u0010G\u001a\u00020\u000eH\u0002J\u0016\u0010H\u001a\u0002032\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0007J\u0018\u0010L\u001a\u0002032\u000e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0JH\u0007J\u0016\u0010O\u001a\u0002032\u000e\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0JJ\b\u0010R\u001a\u000203H\u0007J\u001a\u0010S\u001a\u0002032\b\u0010T\u001a\u0004\u0018\u00010%2\u0006\u0010G\u001a\u00020\u000eH\u0007J\u001c\u0010U\u001a\u0002032\b\u0010V\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010W\u001a\u00020\u000eH\u0002J\b\u0010X\u001a\u000203H\u0002J\b\u0010Y\u001a\u00020\u001bH\u0002J\b\u0010Z\u001a\u000203H\u0007J\u0014\u0010[\u001a\u0002032\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\u001c\u0010^\u001a\b\u0012\u0004\u0012\u00020%0J2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020%0JH\u0007J\b\u0010`\u001a\u000203H\u0002J\b\u0010a\u001a\u000203H\u0002J\b\u0010b\u001a\u000203H\u0002J\b\u0010c\u001a\u000203H\u0016J\u0010\u0010d\u001a\u0002032\u0006\u0010e\u001a\u00020fH\u0016J\u001a\u0010g\u001a\u0002032\u0006\u0010h\u001a\u00020\u000e2\b\b\u0002\u0010i\u001a\u00020\u001dH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b*\u0010+R\u001c\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040.8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006k"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllFragment;", "Lcom/kubi/mvi/state/LazyBaseStateFragment;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UiIntent;", "Lcom/kubi/quotefacade/favorites/all/FavAllContract$UIState;", "Lcom/kubi/quotefacade/favorites/all/FavAllViewModel;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fromType", "", "getFromType", "()Ljava/lang/Integer;", "fromType$delegate", "Lkotlin/Lazy;", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "mSortHelper", "Lcom/kubi/quotefacade/helper/CoinListSortHelper;", "recommendFragment", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "recommendOnShow", "", "isRecommendMode", "scrolling", "bufferNotify", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "originDataList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "firstRequest", "adapter", "Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;", "adapter$delegate", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "doOnLazyInitView", "", "initSortView", "updateViewSortMargin", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "hasFavoriteData", "showFavoriteDataAfterError", "initRecyclerView", "initViewFromHomeRankCard", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showEmpty", "showLoading", "showContent", "popFavoriteActionWindow", "initPopView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", ViewProps.POSITION, "dealWsSpotDataAndRefresh", "wsSpotList", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "dealWsFutureDataAndRefresh", "wsFutureList", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "dealWsAlphaDataAndRefresh", "wsAlphaList", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "handleItemClick", "handleAddOrCancelFavorite", "item", "dealCollectAction", "itemBean", "itemPosition", "showRecommendPage", "getRecommendPage", "showFavorite", "sortData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "filterDataList", "list", "removeRecommendFragment", "hideSortHeaders", "showSortHeadersForFavorite", "onDestroyView", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "notifyFavContentHigth", "height", "needShowViewMore", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavAllFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavAllFragment.kt\ncom/kubi/quotefacade/favorites/all/FavAllFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,842:1\n147#2,16:843\n81#3,2:859\n158#3,2:862\n1#4:861\n1#4:903\n1#4:919\n1869#5,2:864\n1869#5,2:866\n1869#5,2:868\n1869#5,2:870\n1869#5,2:872\n1869#5,2:874\n774#5:890\n865#5,2:891\n1617#5,9:893\n1869#5:902\n1870#5:904\n1626#5:905\n774#5:906\n865#5,2:907\n1617#5,9:909\n1869#5:918\n1870#5:920\n1626#5:921\n46#6,14:876\n46#6,14:922\n46#6,14:936\n*S KotlinDebug\n*F\n+ 1 FavAllFragment.kt\ncom/kubi/quotefacade/favorites/all/FavAllFragment\n*L\n111#1:843,16\n172#1:859,2\n210#1:862,2\n678#1:903\n684#1:919\n503#1:864,2\n509#1:866,2\n534#1:868,2\n541#1:870,2\n560#1:872,2\n567#1:874,2\n677#1:890\n677#1:891,2\n678#1:893,9\n678#1:902\n678#1:904\n678#1:905\n683#1:906\n683#1:907,2\n684#1:909,9\n684#1:918\n684#1:920\n684#1:921\n649#1:876,14\n698#1:922,14\n747#1:936,14\n*E\n"})
public final class FavAllFragment extends LazyBaseStateFragment<FavAllContract$UiIntent, UIState, FavAllViewModel> {

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public CoinListSortHelper f41710c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public RecommendCommonFragment f41711d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f41712e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f41713f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f41714g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f41715h0;

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public C43724b f41716i0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f41719l0;

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ KProperty<Object>[] f41706n0 = {Reflection.property1(new PropertyReference1Impl(FavAllFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", 0))};

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public static final Companion f41705m0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f41707Z = C45681e.m100799e(this, new Function1<FavAllFragment, C4690r>() { // from class: com.kubi.quotefacade.favorites.all.FavAllFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4690r invoke(@NotNull FavAllFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4690r.m4692a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4690r, Unit>() { // from class: com.kubi.quotefacade.favorites.all.FavAllFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4690r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4690r c4690r) {
            invoke(c4690r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f41708a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.all.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavAllFragment.m51473s4(this.f41737b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f41709b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.all.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavAllFragment.m51447Y4(this.f41739b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final ArrayList<TradeItemBean> f41717j0 = new ArrayList<>();

    /* JADX INFO: renamed from: k0 */
    public boolean f41718k0 = true;

    /* JADX INFO: compiled from: FavAllFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/all/FavAllFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "BLOCK_ID", "newInstance", "Lcom/kubi/quotefacade/favorites/all/FavAllFragment;", "fromType", "", "positionType", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FavAllFragment newInstance(int fromType, @Nullable String positionType) {
            FavAllFragment favAllFragment = new FavAllFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("from", fromType);
            bundle.putString("positionType", positionType);
            favAllFragment.setArguments(bundle);
            return favAllFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllFragment$a */
    /* JADX INFO: compiled from: FavAllFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/favorites/all/FavAllFragment$initRecyclerView$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21939a extends RecyclerView.OnScrollListener {
        public C21939a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C43724b c43724b;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            FavAllFragment.this.f41714g0 = newState != 0;
            if (!FavAllFragment.this.f41714g0 && FavAllFragment.this.f41715h0) {
                FavAllFragment.this.m51490t4().notifyDataSetChanged();
                FavAllFragment.this.f41715h0 = false;
            }
            C43724b c43724b2 = FavAllFragment.this.f41716i0;
            if (c43724b2 == null || !c43724b2.m96299I() || (c43724b = FavAllFragment.this.f41716i0) == null) {
                return;
            }
            c43724b.m96331y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$2 */
    /* JADX INFO: compiled from: FavAllFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$2", m90122f = "FavAllFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219412 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219412(Continuation<? super C219412> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219412 c219412 = FavAllFragment.this.new C219412(continuation);
            c219412.L$0 = obj;
            return c219412;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219412) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                FavAllFragment.this.f41717j0.clear();
                FavAllFragment.this.showEmpty();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$4 */
    /* JADX INFO: compiled from: FavAllFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$4", m90122f = "FavAllFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219434 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219434(Continuation<? super C219434> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219434 c219434 = FavAllFragment.this.new C219434(continuation);
            c219434.L$0 = obj;
            return c219434;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219434) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                FavAllFragment.this.f41713f0 = false;
                if (FavAllFragment.this.m51401B4()) {
                    FavAllFragment.this.m51454c5();
                } else {
                    FavAllFragment.this.showContent();
                    final FavAllFragment favAllFragment = FavAllFragment.this;
                    BaseFragment.showFailView$default(favAllFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.all.g0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FavAllFragment.C219434.m51494f(favAllFragment, view);
                        }
                    }, 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m51494f(FavAllFragment favAllFragment, View view) {
            favAllFragment.showContent();
            favAllFragment.showLoading();
            favAllFragment.sendIntent(new FavAllContract$UiIntent.FetchFavData());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$6 */
    /* JADX INFO: compiled from: FavAllFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.all.FavAllFragment$bindState$6", m90122f = "FavAllFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219456 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219456(Continuation<? super C219456> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219456 c219456 = FavAllFragment.this.new C219456(continuation);
            c219456.L$0 = obj;
            return c219456;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219456) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (obj2 != null) {
                ToastCompat.m66441G(((OldBaseFragment) FavAllFragment.this).mContext.getString(R$string.add_top_ok), new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: b5 */
    public final void m51485b5() {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        RecyclerView recyclerView2;
        this.f41713f0 = false;
        showContent();
        m51449Z4();
        m51462g5();
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 == null || (recyclerView2 = c4690rM51476u4.f4513d) == null || !C27046k.m66704s(recyclerView2)) {
            C4690r c4690rM51476u5 = m51476u4();
            if (c4690rM51476u5 != null && (frameLayout = c4690rM51476u5.f4511b) != null) {
                C27046k.m66703r(frameLayout);
            }
            C4690r c4690rM51476u6 = m51476u4();
            if (c4690rM51476u6 != null && (recyclerView = c4690rM51476u6.f4513d) != null) {
                C27046k.m66685H(recyclerView);
            }
            if ("B5markets_fav_add".length() != 0 && "data_load_finish".length() != 0) {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42382c("type", TtmlNode.COMBINE_ALL);
                C45290a.f101823a.m100101b("B5markets_fav_add", "data_load_finish", "", eventParametersBuilderAcquire.m42380a());
                return;
            }
            C44128b.m97270n("Monitor", "eventName(B5markets_fav_add) or pointName(data_load_finish) is null");
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        this.f41713f0 = true;
        showContent();
        m51460f5();
        C44128b.m97266j(getTAG(), "showEmpty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public final boolean m51401B4() {
        if (!this.f41717j0.isEmpty()) {
            return true;
        }
        List<TradeItemBean> data = m51490t4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return !data.isEmpty();
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m51407E4(FavAllFragment favAllFragment, final TradeItemBean tradeItemBean, View view) {
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.favorites.all.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavAllFragment.m51409F4(tradeItemBean);
            }
        }), 1, (Object) null);
        C43724b c43724b = favAllFragment.f41716i0;
        if (c43724b != null) {
            c43724b.m96331y();
        }
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m51409F4(TradeItemBean tradeItemBean) {
        if (tradeItemBean != null) {
            AllTradeItemBean allTradeItemBean = tradeItemBean instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean : null;
            if (allTradeItemBean != null) {
                IQuoteFacadeService.f41383a.get().mo50692S(C36547d.m81813a(allTradeItemBean), allTradeItemBean.getCollectType() == 2 ? "Futures" : IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m51413H4(FavAllFragment favAllFragment, TradeItemBean tradeItemBean, View view) {
        if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
            AllTradeItemBean allTradeItemBean = tradeItemBean instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean : null;
            favAllFragment.sendIntent(new FavAllContract$UiIntent.PinItemToTop(allTradeItemBean != null ? Integer.valueOf(allTradeItemBean.getCollectType()) : null, tradeItemBean != null ? tradeItemBean.getSymbol() : null, "All"));
        }
        C43724b c43724b = favAllFragment.f41716i0;
        if (c43724b != null) {
            c43724b.m96331y();
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m51429P4(FavAllFragment favAllFragment) {
        CoinListSortHelper coinListSortHelper = favAllFragment.f41710c0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52023K();
        }
        m51466i5(favAllFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m51431Q4(FavAllFragment favAllFragment) {
        CoinListSortHelper coinListSortHelper = favAllFragment.f41710c0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52031l0();
        }
        m51466i5(favAllFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m51433R4(FavAllFragment favAllFragment) {
        CoinListSortHelper coinListSortHelper = favAllFragment.f41710c0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52033n0();
        }
        m51466i5(favAllFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m51435S4(FavAllFragment favAllFragment) {
        CoinListSortHelper coinListSortHelper = favAllFragment.f41710c0;
        if (coinListSortHelper != null) {
            CoinListSortHelper.m51975N(coinListSortHelper, false, 1, null);
        }
        m51466i5(favAllFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m51439U4() {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.FAV.getType(), TtmlNode.COMBINE_ALL, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    private final void m51441V4(int i11, boolean z11) {
        C4690r c4690rM51476u4;
        RecyclerView recyclerView;
        if (BQuoteFacadeDepend.f42592a.m53022b().mo28952h() || (c4690rM51476u4 = m51476u4()) == null || (recyclerView = c4690rM51476u4.f4513d) == null) {
            return;
        }
        C22218w1.m52125e(recyclerView, getParentFragment(), Integer.valueOf(i11), Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: Z4 */
    private final void m51449Z4() {
        RecommendCommonFragment recommendCommonFragment = this.f41711d0;
        if (recommendCommonFragment == null || !recommendCommonFragment.isAdded()) {
            return;
        }
        RecommendCommonFragment recommendCommonFragment2 = this.f41711d0;
        if (recommendCommonFragment2 != null) {
            C27032f.m66620k(this, recommendCommonFragment2);
        }
        this.f41711d0 = null;
        this.f41712e0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public final void m51454c5() {
        if (this.f41717j0.isEmpty()) {
            m51485b5();
        } else {
            m51464h5(new Action() { // from class: com.kubi.quotefacade.favorites.all.t
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FavAllFragment.m51456d5(this.f41765b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i5 */
    public static /* synthetic */ void m51466i5(FavAllFragment favAllFragment, Action action, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            action = null;
        }
        favAllFragment.m51464h5(action);
    }

    /* JADX INFO: renamed from: j4 */
    public static final FavAllAdapter m51467j4(FavAllFragment favAllFragment) {
        return new FavAllAdapter(true, C22218w1.m52123c(favAllFragment.getArguments()), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public final void m51468j5() {
        View viewFindViewById = findViewById(R$id.view_sort);
        ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (C22098s0.m51729b(getArguments())) {
                marginLayoutParams.topMargin = C27040e.m66658b(4);
            } else {
                marginLayoutParams.topMargin = C27040e.m66658b(8);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private final void m51469k4(TradeItemBean tradeItemBean, int i11) {
        final AllTradeItemBean allTradeItemBean = tradeItemBean instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean : null;
        if (allTradeItemBean == null) {
            return;
        }
        final int collectType = allTradeItemBean.getCollectType();
        C44128b.m97266j(getTAG(), "dealCollectAction: favType=" + collectType);
        FavTradeCacheConvert.f42000a.m51955a(Integer.valueOf(collectType), allTradeItemBean);
        ToastCompat.m66441G(this.mContext.getString(R$string.cancel_favor_ok), new Object[0]);
        ArrayList<TradeItemBean> arrayList = this.f41717j0;
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.favorites.all.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FavAllFragment.m51470l4(collectType, allTradeItemBean, (TradeItemBean) obj));
            }
        };
        arrayList.removeIf(new Predicate() { // from class: com.kubi.quotefacade.favorites.all.v
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FavAllFragment.m51471m4(function1, obj);
            }
        });
        if (collectType == 5) {
            ArrayList<TradeItemBean> arrayList2 = this.f41717j0;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                TradeItemBean tradeItemBean2 = (TradeItemBean) obj;
                AllTradeItemBean allTradeItemBean2 = tradeItemBean2 instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean2 : null;
                if (allTradeItemBean2 != null && allTradeItemBean2.getCollectType() == 5) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String market = ((TradeItemBean) it.next()).getSymbolInfoEntity().getMarket();
                if (market != null) {
                    arrayList4.add(market);
                }
            }
            sendIntent(new FavAllContract$UiIntent.UpdateSubscribeAlpha(arrayList4, Integer.valueOf(collectType)));
        } else {
            ArrayList<TradeItemBean> arrayList5 = this.f41717j0;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                TradeItemBean tradeItemBean3 = (TradeItemBean) obj2;
                AllTradeItemBean allTradeItemBean3 = tradeItemBean3 instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean3 : null;
                if (!(allTradeItemBean3 != null && allTradeItemBean3.getCollectType() == 5)) {
                    arrayList6.add(obj2);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                String symbol = ((TradeItemBean) it2.next()).getSymbol();
                if (symbol != null) {
                    arrayList7.add(symbol);
                }
            }
            sendIntent(new FavAllContract$UiIntent.UpdateSubscribe(arrayList7, Integer.valueOf(collectType)));
        }
        List<TradeItemBean> data = m51490t4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (!data.isEmpty() && i11 < m51490t4().getData().size()) {
            m51490t4().remove(i11);
        }
        if (C22218w1.m52123c(getArguments())) {
            m51466i5(this, null, 1, null);
        }
        if (m51490t4().getData().isEmpty()) {
            showEmpty();
        }
        if ("B5markets_fav_delete".length() != 0 && "data_load_finish".length() != 0) {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42381b("type", collectType);
            C45290a.f101823a.m100101b("B5markets_fav_delete", "data_load_finish", "", eventParametersBuilderAcquire.m42380a());
            return;
        }
        C44128b.m97270n("Monitor", "eventName(B5markets_fav_delete) or pointName(data_load_finish) is null");
    }

    /* JADX INFO: renamed from: l4 */
    public static final boolean m51470l4(int i11, AllTradeItemBean allTradeItemBean, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return i11 == 5 ? Intrinsics.areEqual(it.getSymbolInfoEntity().getMarket(), allTradeItemBean.getSymbolInfoEntity().getMarket()) : Intrinsics.areEqual(it.getSymbol(), allTradeItemBean.getSymbol());
    }

    /* JADX INFO: renamed from: u4 */
    private final C4690r m51476u4() {
        return (C4690r) this.f41707Z.getValue(this, f41706n0[0]);
    }

    /* JADX INFO: renamed from: v4 */
    private final String m51478v4() {
        return (String) this.f41709b0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    private final RecommendCommonFragment m51480w4() {
        if (this.f41711d0 == null) {
            this.f41711d0 = RecommendSpotFragment.f41895a0.newInstance(m51478v4());
        }
        RecommendCommonFragment recommendSpotFragment = this.f41711d0;
        if (recommendSpotFragment == null) {
            recommendSpotFragment = new RecommendSpotFragment();
        }
        recommendSpotFragment.setArguments(getArguments());
        return recommendSpotFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public static final Unit m51483y4() {
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        C21958d c21958d;
        List<WsAlphaSnapshotEntity> listM51534a;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C21956c) {
            List<TradeItemBean> listM51533a = ((C21956c) singleEvent).m51533a();
            if (listM51533a != null) {
                this.f41717j0.clear();
                this.f41717j0.addAll(listM51533a);
                m51464h5(new Action() { // from class: com.kubi.quotefacade.favorites.all.m
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        FavAllFragment.m51472q4(this.f41752b);
                    }
                });
                return;
            }
            return;
        }
        if (singleEvent instanceof C21954b) {
            Pair<TradeItemBean, Integer> pairM51532a = ((C21954b) singleEvent).m51532a();
            if (pairM51532a == null) {
                return;
            }
            m51469k4(pairM51532a.getFirst(), pairM51532a.getSecond().intValue());
            return;
        }
        if (singleEvent instanceof C21962f) {
            C21962f c21962f = (C21962f) singleEvent;
            List<WsMarketSnapshotEntity> listM51536a = c21962f.m51536a();
            if (listM51536a == null || listM51536a.isEmpty()) {
                return;
            }
            m51488p4(c21962f.m51536a());
            return;
        }
        if (!(singleEvent instanceof C21960e)) {
            if (!(singleEvent instanceof C21958d) || (listM51534a = (c21958d = (C21958d) singleEvent).m51534a()) == null || listM51534a.isEmpty()) {
                return;
            }
            m51486n4(c21958d.m51534a());
            return;
        }
        C21960e c21960e = (C21960e) singleEvent;
        List<WsFutureSnapshotEntity> listM51535a = c21960e.m51535a();
        if (listM51535a == null || listM51535a.isEmpty()) {
            return;
        }
        m51487o4(c21960e.m51535a());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_favorite_page_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends FavAllViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FavAllViewModel.class);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m51486n4(@NotNull List<WsAlphaSnapshotEntity> wsAlphaList) {
        Intrinsics.checkNotNullParameter(wsAlphaList, "wsAlphaList");
        HashMap map = new HashMap();
        for (WsAlphaSnapshotEntity wsAlphaSnapshotEntity : wsAlphaList) {
            if (wsAlphaSnapshotEntity != null && wsAlphaSnapshotEntity.getTokenBridgeId().length() > 0) {
                map.put(wsAlphaSnapshotEntity.getTokenBridgeId(), wsAlphaSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f41717j0) {
            WsAlphaSnapshotEntity wsAlphaSnapshotEntity2 = (WsAlphaSnapshotEntity) map.get(tradeItemBean.getSymbolInfoEntity().getMarket());
            if (wsAlphaSnapshotEntity2 != null) {
                tradeItemBean.setLastDealPrice(C27039d.m66647g(wsAlphaSnapshotEntity2.getPrice()));
                tradeItemBean.setChangeRate(Double.valueOf(C27039d.m66647g(wsAlphaSnapshotEntity2.getPriceRate())));
                tradeItemBean.setValue(C27039d.m66647g(wsAlphaSnapshotEntity2.getTradingVolume()));
            }
        }
        if (this.f41714g0) {
            this.f41715h0 = true;
        } else {
            m51466i5(this, null, 1, null);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o4 */
    public final void m51487o4(@NotNull List<WsFutureSnapshotEntity> wsFutureList) {
        String symbol;
        Intrinsics.checkNotNullParameter(wsFutureList, "wsFutureList");
        HashMap map = new HashMap();
        for (WsFutureSnapshotEntity wsFutureSnapshotEntity : wsFutureList) {
            if (wsFutureSnapshotEntity != null && (symbol = wsFutureSnapshotEntity.getSymbol()) != null && symbol.length() != 0) {
                map.put(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f41717j0) {
            WsFutureSnapshotEntity wsFutureSnapshotEntity2 = (WsFutureSnapshotEntity) map.get(tradeItemBean.getSymbol());
            if (wsFutureSnapshotEntity2 != null) {
                tradeItemBean.setSymbol(wsFutureSnapshotEntity2.getSymbol());
                tradeItemBean.setLastDealPrice(C27039d.m66646f(Double.valueOf(wsFutureSnapshotEntity2.getLastPrice())));
                tradeItemBean.setChangeRate(Double.valueOf(wsFutureSnapshotEntity2.getPriceChgPct()));
                tradeItemBean.setValue(QuoteExKt.m51865p(tradeItemBean, wsFutureSnapshotEntity2));
            }
        }
        if (this.f41714g0) {
            this.f41715h0 = true;
        } else {
            m51466i5(this, null, 1, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        m51449Z4();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p4 */
    public final void m51488p4(@NotNull List<WsMarketSnapshotEntity> wsSpotList) {
        Intrinsics.checkNotNullParameter(wsSpotList, "wsSpotList");
        HashMap map = new HashMap();
        for (WsMarketSnapshotEntity wsMarketSnapshotEntity : wsSpotList) {
            if (wsMarketSnapshotEntity != null && wsMarketSnapshotEntity.getSymbolCode() != null) {
                map.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f41717j0) {
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
        if (this.f41714g0) {
            this.f41715h0 = true;
        } else {
            m51466i5(this, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final List<TradeItemBean> m51489r4(@NotNull List<? extends TradeItemBean> list) {
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(list, "list");
        if (!C22218w1.m52123c(getArguments())) {
            return list;
        }
        List<TradeItemBean> listTake = CollectionsKt.take(list, 5);
        boolean z11 = list.size() > listTake.size();
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (linearLayoutCompat = c4690rM51476u4.f4512c) != null) {
            linearLayoutCompat.setVisibility(z11 ? 0 : 8);
        }
        if (!listTake.isEmpty() && !BQuoteFacadeDepend.f42592a.m53022b().mo28952h()) {
            m51441V4(C27034h.m66635f(this, R$dimen.trade_cell_height) * listTake.size(), z11);
        }
        return listTake;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.all.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavAllFragment.m51451a5(this.f41732b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.all.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavAllFragment.m51458e5(this.f41735b);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final FavAllAdapter m51490t4() {
        return (FavAllAdapter) this.f41719l0.getValue();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: x4 */
    public final void m51491x4(@Nullable TradeItemBean tradeItemBean, int i11) {
        AllTradeItemBean allTradeItemBean = tradeItemBean instanceof AllTradeItemBean ? (AllTradeItemBean) tradeItemBean : null;
        int collectType = allTradeItemBean != null ? allTradeItemBean.getCollectType() : 0;
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            sendIntent(new FavAllContract$UiIntent.CollectOrCancelCoin(Integer.valueOf(collectType), tradeItemBean, i11));
        } else if (TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) || !com.kubi.user.config.a.b()) {
            m51469k4(tradeItemBean, i11);
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.favorites.all.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavAllFragment.m51483y4();
                }
            }), 1, (Object) null);
        }
        if ("B5markets_fav_delete".length() != 0 && "click_start_btn".length() != 0) {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42381b("type", collectType);
            C45290a.f101823a.m100101b("B5markets_fav_delete", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
            return;
        }
        C44128b.m97270n("Monitor", "eventName(B5markets_fav_delete) or pointName(click_start_btn) is null");
    }

    public FavAllFragment() {
        setPageId("B5FavoritesAll");
        this.f41719l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.all.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavAllFragment.m51467j4(this.f41741b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m51399A4(FavAllFragment favAllFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        AllTradeItemBean allTradeItemBean;
        Integer numValueOf;
        String symbol;
        AllTradeItemBean allTradeItemBean2;
        String str;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= favAllFragment.m51490t4().getData().size() - 1) {
            TradeItemBean tradeItemBean = favAllFragment.m51490t4().getData().get(i11);
            String tag = favAllFragment.getTAG();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleItemClick:");
            Integer numValueOf2 = null;
            if (tradeItemBean instanceof AllTradeItemBean) {
                allTradeItemBean = (AllTradeItemBean) tradeItemBean;
            } else {
                allTradeItemBean = null;
            }
            if (allTradeItemBean != null) {
                numValueOf = Integer.valueOf(allTradeItemBean.getCollectType());
            } else {
                numValueOf = null;
            }
            sb2.append(numValueOf);
            sb2.append(" | ");
            sb2.append(tradeItemBean.getSymbol());
            sb2.append(" | ");
            SymbolInfoEntity symbolInfoEntity = tradeItemBean.getSymbolInfoEntity();
            if (symbolInfoEntity != null) {
                symbol = symbolInfoEntity.getSymbol();
            } else {
                symbol = null;
            }
            sb2.append(symbol);
            C44128b.m97266j(tag, sb2.toString());
            if (tradeItemBean instanceof AllTradeItemBean) {
                allTradeItemBean2 = (AllTradeItemBean) tradeItemBean;
            } else {
                allTradeItemBean2 = null;
            }
            if (allTradeItemBean2 != null) {
                numValueOf2 = Integer.valueOf(allTradeItemBean2.getCollectType());
            }
            if (numValueOf2 != null && numValueOf2.intValue() == 2) {
                C37304a c37304a = C37304a.f82764a;
                String symbol2 = ((AllTradeItemBean) tradeItemBean).getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol2, "getSymbol(...)");
                InterfaceC37752d.a.m85122a(c37304a, symbol2, null, null, null, 14, null);
            } else if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), ((AllTradeItemBean) tradeItemBean).getSymbol(), null, null, null, 14, null);
            } else if (numValueOf2 != null && numValueOf2.intValue() == 3) {
                ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), ((AllTradeItemBean) tradeItemBean).getSymbol(), null, null, null, 14, null);
            } else if (numValueOf2 != null && numValueOf2.intValue() == 5) {
                AllTradeItemBean allTradeItemBean3 = (AllTradeItemBean) tradeItemBean;
                QuoteExKt.m51867r(allTradeItemBean3.getSymbolInfoEntity().getFeeCode(), allTradeItemBean3.getSymbolInfoEntity().getQuoteCurrencyName(), allTradeItemBean3.getSymbolInfoEntity().getMarket(), allTradeItemBean3.getSymbolInfoEntity().getBaseCurrency());
            }
            String strValueOf = String.valueOf(i11 + 1);
            JSONObject jSONObject = new JSONObject();
            if (C22218w1.m52123c(favAllFragment.getArguments())) {
                str = "home";
            } else {
                str = "markets";
            }
            jSONObject.put("type", str);
            jSONObject.put("symbol", tradeItemBean.getSymbol());
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B5FavoritesAll", "Spots", strValueOf, jSONObject);
            return;
        }
        C44128b.m97266j("行情", "position: " + i11 + "，size: " + favAllFragment.m51490t4().getData().size());
    }

    /* JADX INFO: renamed from: C4 */
    private final void m51403C4() {
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout;
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (c4650a = c4690rM51476u4.f4516g) != null && (frameLayout = c4650a.f4190j) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        C4690r c4690rM51476u5 = m51476u4();
        if (c4690rM51476u5 != null && (c4677k0 = c4690rM51476u5.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX INFO: renamed from: D4 */
    private final void m51405D4(BaseViewHolder baseViewHolder, BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter, final int i11) {
        boolean z11;
        Boolean boolValueOf;
        AllTradeItemBean allTradeItemBean;
        AllTradeItemBean allTradeItemBean2;
        boolean z12;
        Boolean boolValueOf2;
        int i12;
        SymbolInfoEntity symbolInfoEntity;
        SymbolInfoEntity symbolInfoEntity2;
        AllTradeItemBean allTradeItemBean3;
        final TradeItemBean item = baseQuickAdapter.getItem(i11);
        int i13 = R$id.llPin;
        int i14 = 0;
        boolean z13 = true;
        Boolean boolValueOf3 = null;
        if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
            if (item instanceof AllTradeItemBean) {
                allTradeItemBean3 = (AllTradeItemBean) item;
            } else {
                allTradeItemBean3 = null;
            }
            if (allTradeItemBean3 == null || allTradeItemBean3.getCollectType() != 5) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        BaseViewHolder gone = baseViewHolder.setGone(i13, z11);
        int i15 = R$id.llReminder;
        if (item != null && (symbolInfoEntity2 = item.getSymbolInfoEntity()) != null) {
            boolValueOf = Boolean.valueOf(symbolInfoEntity2.isPreviewEnableShow());
        } else {
            boolValueOf = null;
        }
        gone.setGone(i15, !C27025c.m66566d(boolValueOf));
        ((ImageView) baseViewHolder.getView(R$id.ivFavor)).setImageResource(R$mipmap.ic_favor);
        ((ImageView) baseViewHolder.getView(R$id.ivPin)).setImageResource(R$drawable.icon_unstick_white);
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(i15);
        boolean z14 = item instanceof AllTradeItemBean;
        if (z14) {
            allTradeItemBean = (AllTradeItemBean) item;
        } else {
            allTradeItemBean = null;
        }
        if (allTradeItemBean != null && allTradeItemBean.getCollectType() == 5) {
            linearLayout.setVisibility(8);
        } else {
            if (z14) {
                allTradeItemBean2 = (AllTradeItemBean) item;
            } else {
                allTradeItemBean2 = null;
            }
            if (allTradeItemBean2 != null && allTradeItemBean2.getCollectType() == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (item != null && (symbolInfoEntity = item.getSymbolInfoEntity()) != null) {
                boolValueOf2 = Boolean.valueOf(symbolInfoEntity.isPreviewEnableShow());
            } else {
                boolValueOf2 = null;
            }
            if (!C27025c.m66566d(boolValueOf2)) {
                z13 = false;
            }
            if (!PriceAlertVisibilityHelper.f42102a.m52114a(z12, z13)) {
                i14 = 8;
            }
            linearLayout.setVisibility(i14);
            if (linearLayout.getVisibility() == 0) {
                ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivReminder);
                if (item != null) {
                    boolValueOf3 = Boolean.valueOf(item.isAlarm());
                }
                if (C27025c.m66566d(boolValueOf3)) {
                    i12 = R$mipmap.icon_trade_menu_alerted;
                } else {
                    i12 = R$drawable.icon_trade_menu_alert_white;
                }
                imageView.setImageResource(i12);
                baseViewHolder.setOnClickListener(i15, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.all.p
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FavAllFragment.m51407E4(this.f41757b, item, view);
                    }
                });
            }
        }
        baseViewHolder.setOnClickListener(R$id.llFavor, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.all.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavAllFragment.m51411G4(this.f41759b, item, i11, view);
            }
        }).setOnClickListener(i13, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.all.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavAllFragment.m51413H4(this.f41763b, item, view);
            }
        });
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m51411G4(FavAllFragment favAllFragment, TradeItemBean tradeItemBean, int i11, View view) {
        favAllFragment.m51491x4(tradeItemBean, i11);
        C43724b c43724b = favAllFragment.f41716i0;
        if (c43724b != null) {
            c43724b.m96331y();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: I4 */
    private final void m51415I4() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (recyclerView5 = c4690rM51476u4.f4513d) != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        if (m51490t4().m51389j()) {
            FavAllAdapter favAllAdapterM51490t4 = m51490t4();
            C4690r c4690rM51476u5 = m51476u4();
            if (c4690rM51476u5 != null) {
                recyclerView4 = c4690rM51476u5.f4513d;
            } else {
                recyclerView4 = null;
            }
            favAllAdapterM51490t4.bindToRecyclerView(recyclerView4);
        }
        C4690r c4690rM51476u6 = m51476u4();
        if (c4690rM51476u6 != null && (recyclerView3 = c4690rM51476u6.f4513d) != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C4690r c4690rM51476u7 = m51476u4();
        if (c4690rM51476u7 != null && (recyclerView2 = c4690rM51476u7.f4513d) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        m51492z4();
        m51490t4().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.favorites.all.h
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return FavAllFragment.m51417J4(this.f41744a, baseQuickAdapter, view, i11);
            }
        });
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.favorites.all.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAllFragment.m51419K4(this.f41746b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.favorites.all.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavAllFragment.m51421L4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.favorites.all.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavAllFragment.m51423M4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.favorites.all.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavAllFragment.m51425N4(function2, obj);
            }
        }));
        C4690r c4690rM51476u8 = m51476u4();
        if (c4690rM51476u8 != null && (recyclerView = c4690rM51476u8.f4513d) != null) {
            recyclerView.addOnScrollListener(new C21939a());
        }
    }

    /* JADX INFO: renamed from: J4 */
    public static final boolean m51417J4(FavAllFragment favAllFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (favAllFragment.getView() == null || !favAllFragment.isShowing() || C22218w1.m52123c(favAllFragment.getArguments())) {
            return false;
        }
        C43724b c43724bM51443W4 = favAllFragment.m51443W4();
        if (c43724bM51443W4 != null) {
            favAllFragment.m51405D4(new BaseViewHolder(c43724bM51443W4.m96292A()), favAllFragment.m51490t4(), i11);
            c43724bM51443W4.m96320e0(view, 1, 0, 0, 0);
        }
        favAllFragment.m51490t4().m51395q(i11);
        return true;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m51419K4(FavAllFragment favAllFragment, Boolean bool) {
        favAllFragment.m51490t4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final void m51421L4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m51423M4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final void m51425N4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    private final void m51427O4() {
        C4650a c4650a;
        FrameLayout frameLayout;
        C4650a c4650a2;
        LinearLayout linearLayout;
        C4650a c4650a3;
        LinearLayout linearLayout2;
        C4650a c4650a4;
        LinearLayout linearLayout3;
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a5;
        FrameLayout frameLayout2;
        C4677k0 c4677k1;
        ConstraintLayout constraintLayout2;
        C4650a c4650a6;
        FrameLayout frameLayout3;
        C4650a c4650a7;
        FrameLayout frameLayout4;
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (c4650a7 = c4690rM51476u4.f4516g) != null && (frameLayout4 = c4650a7.f4190j) != null) {
            this.f41710c0 = new CoinListSortHelper(frameLayout4);
        }
        if (C22218w1.m52123c(getArguments())) {
            C4690r c4690rM51476u5 = m51476u4();
            if (c4690rM51476u5 != null && (c4650a6 = c4690rM51476u5.f4516g) != null && (frameLayout3 = c4650a6.f4190j) != null) {
                ViewExtKt.m66577h(frameLayout3);
            }
            C4690r c4690rM51476u6 = m51476u4();
            if (c4690rM51476u6 != null && (c4677k1 = c4690rM51476u6.f4517h) != null && (constraintLayout2 = c4677k1.f4402e) != null) {
                C27046k.m66685H(constraintLayout2);
            }
        } else {
            C4690r c4690rM51476u7 = m51476u4();
            if (c4690rM51476u7 != null && (c4650a5 = c4690rM51476u7.f4516g) != null && (frameLayout2 = c4650a5.f4190j) != null) {
                ViewExtKt.m66594y(frameLayout2);
            }
            C4690r c4690rM51476u8 = m51476u4();
            if (c4690rM51476u8 != null && (c4677k0 = c4690rM51476u8.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
                ViewExtKt.m66577h(constraintLayout);
            }
            C4690r c4690rM51476u9 = m51476u4();
            if (c4690rM51476u9 != null && (c4650a4 = c4690rM51476u9.f4516g) != null && (linearLayout3 = c4650a4.f4188h) != null) {
                C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.all.g
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavAllFragment.m51429P4(this.f41742b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51476u10 = m51476u4();
            if (c4690rM51476u10 != null && (c4650a3 = c4690rM51476u10.f4516g) != null && (linearLayout2 = c4650a3.f4189i) != null) {
                C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.all.r
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavAllFragment.m51431Q4(this.f41762b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51476u11 = m51476u4();
            if (c4690rM51476u11 != null && (c4650a2 = c4690rM51476u11.f4516g) != null && (linearLayout = c4650a2.f4183c) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.all.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavAllFragment.m51433R4(this.f41770b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51476u12 = m51476u4();
            if (c4690rM51476u12 != null && (c4650a = c4690rM51476u12.f4516g) != null && (frameLayout = c4650a.f4182b) != null) {
                C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.all.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavAllFragment.m51435S4(this.f41771b);
                    }
                }, 1, null);
            }
            m51468j5();
        }
        if (C12573b.f21598a.m23696a()) {
            "quote_fav_float_guild_change".length();
        }
        C12572a.m23692a(this, false, new FavAllFragment$initSortView$$inlined$bindFlowEvent$1("quote_fav_float_guild_change", null, this));
    }

    /* JADX INFO: renamed from: T4 */
    private final void m51437T4() {
        LinearLayoutCompat linearLayoutCompat;
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (linearLayoutCompat = c4690rM51476u4.f4512c) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.all.b0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavAllFragment.m51439U4();
                }
            }, 1, null);
        }
        int iM66658b = C27040e.m66658b(12);
        View viewFindViewById = findViewById(R$id.margin_view);
        if (viewFindViewById != null) {
            ViewExtKt.m66585p(viewFindViewById, iM66658b, 0, iM66658b, 0, 10, null);
        }
    }

    /* JADX INFO: renamed from: W4 */
    private final C43724b m51443W4() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C43724b c43724bM96322p = new BubbleEasyPopup(context).m96307Q(R$layout.popwindow_layout_favriote_action).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.favorites.all.o
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                FavAllFragment.m51445X4(this.f41756b);
            }
        }).m96316Z(true).m96322p();
        this.f41716i0 = c43724bM96322p;
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m51445X4(FavAllFragment favAllFragment) {
        favAllFragment.m51490t4().m51395q(-1);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final String m51447Y4(FavAllFragment favAllFragment) {
        Bundle arguments = favAllFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m51451a5(FavAllFragment favAllFragment) {
        C4690r c4690rM51476u4 = favAllFragment.m51476u4();
        if (c4690rM51476u4 == null) {
            return Unit.INSTANCE;
        }
        RankShimmer rsLoading = c4690rM51476u4.f4514e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66577h(rsLoading);
        c4690rM51476u4.f4514e.m53323f();
        super.showContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final void m51456d5(FavAllFragment favAllFragment) {
        favAllFragment.m51485b5();
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m51458e5(FavAllFragment favAllFragment) {
        int iM66658b;
        C4690r c4690rM51476u4 = favAllFragment.m51476u4();
        if (c4690rM51476u4 == null) {
            return Unit.INSTANCE;
        }
        favAllFragment.m51449Z4();
        FrameLayout flContainer = c4690rM51476u4.f4511b;
        Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
        C27046k.m66703r(flContainer);
        RecyclerView recyclerView = c4690rM51476u4.f4513d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66703r(recyclerView);
        LinearLayoutCompat layoutViewMoreHome = c4690rM51476u4.f4512c;
        Intrinsics.checkNotNullExpressionValue(layoutViewMoreHome, "layoutViewMoreHome");
        ViewExtKt.m66577h(layoutViewMoreHome);
        favAllFragment.m51403C4();
        RankShimmer rankShimmer = c4690rM51476u4.f4514e;
        ViewGroup.LayoutParams layoutParams = rankShimmer.getLayoutParams();
        if (C22218w1.m52123c(favAllFragment.getArguments())) {
            iM66658b = C27040e.m66658b(320);
        } else {
            iM66658b = -1;
        }
        layoutParams.height = iM66658b;
        rankShimmer.setLayoutParams(layoutParams);
        c4690rM51476u4.f4514e.m53322e();
        RankShimmer rsLoading = c4690rM51476u4.f4514e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66594y(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    private final void m51460f5() {
        FrameLayout frameLayout;
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout2;
        LinearLayoutCompat linearLayoutCompat;
        RecyclerView recyclerView;
        C4690r c4690rM51476u4 = m51476u4();
        if (c4690rM51476u4 != null && (recyclerView = c4690rM51476u4.f4513d) != null) {
            C27046k.m66703r(recyclerView);
        }
        C4690r c4690rM51476u5 = m51476u4();
        if (c4690rM51476u5 != null && (linearLayoutCompat = c4690rM51476u5.f4512c) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        RecommendCommonFragment recommendCommonFragmentM51480w4 = m51480w4();
        C4690r c4690rM51476u6 = m51476u4();
        if (c4690rM51476u6 != null && (c4650a = c4690rM51476u6.f4516g) != null && (frameLayout2 = c4650a.f4190j) != null) {
            ViewExtKt.m66577h(frameLayout2);
        }
        C4690r c4690rM51476u7 = m51476u4();
        if (c4690rM51476u7 != null && (c4677k0 = c4690rM51476u7.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
        if (!recommendCommonFragmentM51480w4.isAdded() && !this.f41712e0) {
            this.f41712e0 = true;
            C27032f.m66611b(this, R$id.fl_container, recommendCommonFragmentM51480w4, null, 4, null);
            C4690r c4690rM51476u8 = m51476u4();
            if (c4690rM51476u8 != null && (frameLayout = c4690rM51476u8.f4511b) != null) {
                ViewExtKt.m66594y(frameLayout);
            }
        }
    }

    /* JADX INFO: renamed from: g5 */
    private final void m51462g5() {
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout;
        C4677k0 c4677k1;
        ConstraintLayout constraintLayout2;
        C4650a c4650a2;
        FrameLayout frameLayout2;
        if (C22218w1.m52123c(getArguments())) {
            C4690r c4690rM51476u4 = m51476u4();
            if (c4690rM51476u4 != null && (c4650a2 = c4690rM51476u4.f4516g) != null && (frameLayout2 = c4650a2.f4190j) != null) {
                ViewExtKt.m66577h(frameLayout2);
            }
            C4690r c4690rM51476u5 = m51476u4();
            if (c4690rM51476u5 != null && (c4677k1 = c4690rM51476u5.f4517h) != null && (constraintLayout2 = c4677k1.f4402e) != null) {
                C27046k.m66685H(constraintLayout2);
                return;
            }
            return;
        }
        C4690r c4690rM51476u6 = m51476u4();
        if (c4690rM51476u6 != null && (c4650a = c4690rM51476u6.f4516g) != null && (frameLayout = c4650a.f4190j) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
        C4690r c4690rM51476u7 = m51476u4();
        if (c4690rM51476u7 != null && (c4677k0 = c4690rM51476u7.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            C27046k.m66700o(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: h5 */
    private final void m51464h5(Action action) {
        if (!isDetached() && getParentFragment() != null && isShowing()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FavAllFragment$sortData$1(this, action, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final boolean m51471m4(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m51472q4(FavAllFragment favAllFragment) {
        favAllFragment.m51485b5();
    }

    /* JADX INFO: renamed from: s4 */
    public static final Integer m51473s4(FavAllFragment favAllFragment) {
        Bundle arguments = favAllFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("from"));
        }
        return null;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.all.FavAllFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C219412(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.all.FavAllFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C219434(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.all.FavAllFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPinItemTopSuccess();
            }
        }, new C219456(null));
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m51427O4();
        m51415I4();
        m51437T4();
        if (C12573b.f21598a.m23696a()) {
            "refresh_favor_page".length();
        }
        C12572a.m23692a(this, false, new FavAllFragment$doOnLazyInitView$$inlined$bindFlowEvent$1("refresh_favor_page", null, this));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m51449Z4();
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        String str;
        super.onShow();
        if (this.f41718k0 && !this.f41713f0) {
            showLoading();
            this.f41718k0 = false;
        }
        sendIntent(new FavAllContract$UiIntent.FetchFavData());
        JSONObject jSONObject = new JSONObject();
        if (C22218w1.m52123c(getArguments())) {
            str = "home";
        } else {
            str = "markets";
        }
        jSONObject.put("type", str);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B5FavoritesAll", "Tab", "1", jSONObject);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: z4 */
    public final void m51492z4() {
        m51490t4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.favorites.all.n
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                FavAllFragment.m51399A4(this.f41754a, baseQuickAdapter, view, i11);
            }
        });
    }
}
