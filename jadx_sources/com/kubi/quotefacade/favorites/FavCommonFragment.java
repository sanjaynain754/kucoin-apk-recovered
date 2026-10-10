package com.kubi.quotefacade.favorites;

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
import com.kubi.quotefacade.adapter.FavItemListAdapter;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.constant.QuoteMainTab;
import com.kubi.quotefacade.entity.AlphaFavEntity;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.event.FavCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.favorites.recommend.RecommendCommonFragment;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.quotefacade.helper.CoinListSortHelper;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.FavTradeCacheConvert;
import com.kubi.quotefacade.helper.PriceAlertVisibilityHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27032f;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
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
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36965e;
import p212dv.C36966f;
import p212dv.C36967g;
import p212dv.C36968h;
import p212dv.C36969i;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import qe0.C43724b;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: FavCommonFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\bH\u0014J\b\u0010?\u001a\u00020\bH&J\b\u0010@\u001a\u000201H&J\b\u0010A\u001a\u00020'H&J\u001f\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020=2\b\u0010,\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u000201H&J\b\u0010G\u001a\u000201H&J\b\u0010I\u001a\u00020CH\u0016J\b\u0010J\u001a\u00020CH\u0002J\b\u0010K\u001a\u00020CH\u0002J\u0010\u0010L\u001a\u00020C2\u0006\u0010M\u001a\u00020NH\u0014J\b\u0010O\u001a\u00020CH\u0014J\b\u0010P\u001a\u00020\u0012H\u0002J\b\u0010Q\u001a\u00020CH\u0002J\b\u0010R\u001a\u00020CH\u0003J\b\u0010S\u001a\u00020CH\u0002J\b\u0010T\u001a\u00020CH\u0016J\b\u0010U\u001a\u00020CH\u0016J\b\u0010V\u001a\u00020CH\u0016J\b\u0010W\u001a\u00020CH\u0016J\n\u0010X\u001a\u0004\u0018\u00010:H\u0002J,\u0010Y\u001a\u00020C2\u0006\u0010Z\u001a\u00020[2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020[0\\2\u0006\u0010]\u001a\u00020\bH\u0002J\u0016\u0010^\u001a\u00020C2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020a0`H\u0007J\u0018\u0010b\u001a\u00020C2\u000e\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0`H\u0007J\u0016\u0010e\u001a\u00020C2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0`H\u0007J\b\u0010h\u001a\u00020CH\u0007J\u001a\u0010i\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010=2\u0006\u0010]\u001a\u00020\bH\u0007J\u001c\u0010j\u001a\u00020C2\b\u0010k\u001a\u0004\u0018\u00010=2\b\b\u0002\u0010l\u001a\u00020\bH\u0002J\b\u0010m\u001a\u00020CH\u0002J\b\u0010n\u001a\u00020CH\u0007J\u0014\u0010o\u001a\u00020C2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010qH\u0002J\u001c\u0010r\u001a\b\u0012\u0004\u0012\u00020=0`2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020=0`H\u0007J\b\u0010t\u001a\u00020CH\u0002J\b\u0010u\u001a\u00020CH\u0002J\b\u0010v\u001a\u00020CH\u0002J\b\u0010w\u001a\u00020CH\u0016J\u0010\u0010x\u001a\u00020C2\u0006\u0010y\u001a\u00020zH\u0016J\u001a\u0010{\u001a\u00020C2\u0006\u0010|\u001a\u00020\b2\b\b\u0002\u0010}\u001a\u00020\u0012H\u0002J\b\u0010~\u001a\u00020\u0012H\u0002J\n\u0010\u007f\u001a\u0004\u0018\u000101H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001d\u0010,\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\u0004\u0018\u0001018DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b2\u00103R\u000e\u00105\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0012\u0012\u0004\u0012\u00020=0<j\b\u0012\u0004\u0012\u00020=`>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0080\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/favorites/FavCommonFragment;", "Lcom/kubi/mvi/state/LazyBaseStateFragment;", "Lcom/kubi/quotefacade/event/FavCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/FavCommonContract$UIState;", "Lcom/kubi/quotefacade/favorites/FavCommonViewModel;", "<init>", "()V", "favType", "", "getFavType", "()I", "favType$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "value", "", "needLoadingView", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "getLayout", "binding", "Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mSortHelper", "Lcom/kubi/quotefacade/helper/CoinListSortHelper;", "adapter", "Lcom/kubi/quotefacade/adapter/FavItemListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/adapter/FavItemListAdapter;", "adapter$delegate", "recommendFragment", "Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "getRecommendFragment", "()Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;", "setRecommendFragment", "(Lcom/kubi/quotefacade/favorites/recommend/RecommendCommonFragment;)V", "fromType", "getFromType", "()Ljava/lang/Integer;", "fromType$delegate", "positionType", "", "getPositionType", "()Ljava/lang/String;", "positionType$delegate", "recommendOnShow", "isRecommendMode", "scrolling", "bufferNotify", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "originDataList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "Lkotlin/collections/ArrayList;", "getSymbolType", "getSubType", "getRecommendPage", "onTradeItemClick", "", "item", "(Lcom/kubi/data/entity/TradeItemBean;Ljava/lang/Integer;)V", "getCurrentPageId", "getCurrentBlockId", "firstRequest", "doOnLazyInitView", "initSortView", "updateViewSortMargin", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindState", "hasFavoriteData", "showFavoriteDataAfterError", "initRecyclerView", "initViewFromHomeRankCard", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showEmpty", "showLoading", "showContent", "popFavoriteActionWindow", "initPopView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", ViewProps.POSITION, "dealWsSpotDataAndRefresh", "wsSpotList", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "dealWsFutureDataAndRefresh", "wsFutureList", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "dealWsAlphaDataAndRefresh", "wsAlphaList", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "handleItemClick", "handleAddOrCancelFavorite", "dealCollectAction", "tradeItemBean", "itemPosition", "showRecommendPage", "showFavorite", "sortData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "filterDataList", "list", "removeRecommendFragment", "hideSortHeaders", "showSortHeadersForFavorite", "onDestroyView", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "notifyFavContentHigth", "height", "needShowViewMore", "isAlphaFavTab", "getPinTopDataSource", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFavCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavCommonFragment.kt\ncom/kubi/quotefacade/favorites/FavCommonFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,836:1\n147#2,16:837\n81#3,2:853\n158#3,2:856\n1#4:855\n1#4:908\n1#4:921\n1869#5,2:858\n1869#5,2:860\n1869#5,2:862\n1869#5,2:864\n1869#5,2:866\n1869#5,2:868\n1617#5,9:898\n1869#5:907\n1870#5:909\n1626#5:910\n1617#5,9:911\n1869#5:920\n1870#5:922\n1626#5:923\n46#6,14:870\n46#6,14:884\n46#6,14:924\n*S KotlinDebug\n*F\n+ 1 FavCommonFragment.kt\ncom/kubi/quotefacade/favorites/FavCommonFragment\n*L\n121#1:837,16\n190#1:853,2\n232#1:856,2\n679#1:908\n681#1:921\n525#1:858,2\n531#1:860,2\n556#1:862,2\n563#1:864,2\n586#1:866,2\n589#1:868,2\n679#1:898,9\n679#1:907\n679#1:909\n679#1:910\n681#1:911,9\n681#1:920\n681#1:922\n681#1:923\n652#1:870,14\n733#1:884,14\n695#1:924,14\n*E\n"})
public abstract class FavCommonFragment extends LazyBaseStateFragment<FavCommonContract$UiIntent, UIState, FavCommonViewModel> {

    /* JADX INFO: renamed from: n0 */
    public static final /* synthetic */ KProperty<Object>[] f41660n0 = {Reflection.property1(new PropertyReference1Impl(FavCommonFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentFavoritePageContainerBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public CoinListSortHelper f41663b0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public RecommendCommonFragment f41665d0;

    /* JADX INFO: renamed from: g0 */
    public boolean f41668g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f41669h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f41670i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f41671j0;

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public C43724b f41672k0;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f41661Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FavCommonFragment.m51231t4(this.f41697b));
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f41662a0 = C45681e.m100799e(this, new Function1<FavCommonFragment, C4690r>() { // from class: com.kubi.quotefacade.favorites.FavCommonFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4690r invoke(@NotNull FavCommonFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4690r.m4692a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4690r, Unit>() { // from class: com.kubi.quotefacade.favorites.FavCommonFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4690r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4690r c4690r) {
            invoke(c4690r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f41664c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavCommonFragment.m51224m4(this.f41837b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f41666e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavCommonFragment.m51235v4(this.f41896b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f41667f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.favorites.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FavCommonFragment.m51225m5(this.f41898b);
        }
    });

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final ArrayList<TradeItemBean> f41673l0 = new ArrayList<>();

    /* JADX INFO: renamed from: m0 */
    public boolean f41674m0 = true;

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonFragment$a */
    /* JADX INFO: compiled from: FavCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/favorites/FavCommonFragment$initRecyclerView$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21920a extends RecyclerView.OnScrollListener {
        public C21920a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C43724b c43724bM51260k5;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            FavCommonFragment.this.f41670i0 = newState != 0;
            if (!FavCommonFragment.this.f41670i0 && FavCommonFragment.this.f41671j0) {
                FavCommonFragment.this.m51272w4().notifyDataSetChanged();
                FavCommonFragment.this.f41671j0 = false;
            }
            C43724b c43724bM51260k6 = FavCommonFragment.this.m51260k5();
            if (c43724bM51260k6 == null || !c43724bM51260k6.m96299I() || (c43724bM51260k5 = FavCommonFragment.this.m51260k5()) == null) {
                return;
            }
            c43724bM51260k5.m96331y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonFragment$bindState$2 */
    /* JADX INFO: compiled from: FavCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonFragment$bindState$2", m90122f = "FavCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219222 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219222(Continuation<? super C219222> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219222 c219222 = FavCommonFragment.this.new C219222(continuation);
            c219222.L$0 = obj;
            return c219222;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219222) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FavCommonFragment.this.f41673l0.clear();
                FavCommonFragment.this.showEmpty();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonFragment$bindState$4 */
    /* JADX INFO: compiled from: FavCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonFragment$bindState$4", m90122f = "FavCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219244 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219244(Continuation<? super C219244> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219244 c219244 = FavCommonFragment.this.new C219244(continuation);
            c219244.L$0 = obj;
            return c219244;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219244) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                FavCommonFragment.this.f41669h0 = false;
                if (FavCommonFragment.this.m51251M4()) {
                    FavCommonFragment.this.m51268r5();
                } else {
                    FavCommonFragment.this.showContent();
                    final FavCommonFragment favCommonFragment = FavCommonFragment.this;
                    BaseFragment.showFailView$default(favCommonFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.favorites.b0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FavCommonFragment.C219244.m51279f(favCommonFragment, view);
                        }
                    }, 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m51279f(FavCommonFragment favCommonFragment, View view) {
            favCommonFragment.showContent();
            favCommonFragment.showLoading();
            favCommonFragment.sendIntent(new FavCommonContract$UiIntent.FetchFavData(Integer.valueOf(favCommonFragment.m51241A4())));
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.favorites.FavCommonFragment$bindState$6 */
    /* JADX INFO: compiled from: FavCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.FavCommonFragment$bindState$6", m90122f = "FavCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C219266 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C219266(Continuation<? super C219266> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C219266 c219266 = FavCommonFragment.this.new C219266(continuation);
            c219266.L$0 = obj;
            return c219266;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C219266) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                ToastCompat.m66441G(((OldBaseFragment) FavCommonFragment.this).mContext.getString(R$string.add_top_ok), new Object[0]);
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F4 */
    public abstract RecommendCommonFragment mo51246F4();

    @NotNull
    /* JADX INFO: renamed from: G4 */
    public abstract String mo51247G4();

    /* JADX INFO: renamed from: H4 */
    public abstract int mo51248H4();

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView */
    public boolean getF18817Y() {
        return true;
    }

    /* JADX INFO: renamed from: j5 */
    public abstract void mo51259j5(@NotNull TradeItemBean tradeItemBean, @Nullable Integer num);

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: q5 */
    public final void m51266q5() {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        RecyclerView recyclerView2;
        this.f41669h0 = false;
        showContent();
        m51262n5();
        m51271v5();
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 == null || (recyclerView2 = c4690rM51274x4.f4513d) == null || !C27046k.m66704s(recyclerView2)) {
            C4690r c4690rM51274x5 = m51274x4();
            if (c4690rM51274x5 != null && (frameLayout = c4690rM51274x5.f4511b) != null) {
                C27046k.m66703r(frameLayout);
            }
            C4690r c4690rM51274x6 = m51274x4();
            if (c4690rM51274x6 != null && (recyclerView = c4690rM51274x6.f4513d) != null) {
                C27046k.m66685H(recyclerView);
            }
            if ("B5markets_fav_add".length() != 0 && "data_load_finish".length() != 0) {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42381b("type", m51241A4());
                C45290a.f101823a.m100101b("B5markets_fav_add", "data_load_finish", "", eventParametersBuilderAcquire.m42380a());
                return;
            }
            C44128b.m97270n("Monitor", "eventName(B5markets_fav_add) or pointName(data_load_finish) is null");
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        this.f41669h0 = true;
        showContent();
        m51270u5();
    }

    @NotNull
    /* JADX INFO: renamed from: y4 */
    public abstract String mo51275y4();

    @NotNull
    /* JADX INFO: renamed from: z4 */
    public abstract String mo51277z4();

    /* JADX INFO: renamed from: J4 */
    public static final Unit m51178J4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m51188Q4(final FavCommonFragment favCommonFragment, final TradeItemBean tradeItemBean) {
        IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.favorites.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51190R4(tradeItemBean, favCommonFragment);
            }
        }), 1, (Object) null);
        C43724b c43724bM51260k5 = favCommonFragment.m51260k5();
        if (c43724bM51260k5 != null) {
            c43724bM51260k5.m96331y();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final Unit m51190R4(TradeItemBean tradeItemBean, FavCommonFragment favCommonFragment) {
        if (tradeItemBean != null) {
            IQuoteFacadeService.f41383a.get().mo50692S(tradeItemBean, favCommonFragment.m51241A4() == 2 ? "Futures" : IQuoteFacadeService.Companion.TRADE_TYPE_SPOT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m51194T4(FavCommonFragment favCommonFragment, TradeItemBean tradeItemBean, String str) {
        favCommonFragment.sendIntent(new FavCommonContract$UiIntent.PinItemToTop(Integer.valueOf(favCommonFragment.m51241A4()), tradeItemBean != null ? tradeItemBean.getSymbol() : null, str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m51208b5(FavCommonFragment favCommonFragment) {
        CoinListSortHelper coinListSortHelper = favCommonFragment.f41663b0;
        if (coinListSortHelper != null) {
            CoinListSortHelper.m51975N(coinListSortHelper, false, 1, null);
        }
        m51238x5(favCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final Unit m51210c5(FavCommonFragment favCommonFragment) {
        CoinListSortHelper coinListSortHelper = favCommonFragment.f41663b0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52023K();
        }
        m51238x5(favCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m51212d5(FavCommonFragment favCommonFragment) {
        CoinListSortHelper coinListSortHelper = favCommonFragment.f41663b0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52031l0();
        }
        m51238x5(favCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m51214e5(FavCommonFragment favCommonFragment) {
        CoinListSortHelper coinListSortHelper = favCommonFragment.f41663b0;
        if (coinListSortHelper != null) {
            coinListSortHelper.m52033n0();
        }
        m51238x5(favCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m51217g5(FavCommonFragment favCommonFragment) {
        InterfaceC37754f.a.m85138j(C37304a.f82764a, QuoteMainTab.FAV.getType(), favCommonFragment.mo51247G4(), null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final FavItemListAdapter m51224m4(FavCommonFragment favCommonFragment) {
        return new FavItemListAdapter(true, C22218w1.m52123c(favCommonFragment.getArguments()), Integer.valueOf(favCommonFragment.m51241A4()));
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m51226o4(TradeItemBean tradeItemBean, FavCommonFragment favCommonFragment, int i11) {
        ArrayList arrayList;
        AlphaItemEntity itemEntity;
        if (tradeItemBean != null) {
            if (favCommonFragment.m51257h5()) {
                AlphaFavEntity alphaFavEntity = tradeItemBean instanceof AlphaFavEntity ? (AlphaFavEntity) tradeItemBean : null;
                FavAlphaCacheManager.m51806l(FavAlphaCacheManager.f41929a, alphaFavEntity != null ? alphaFavEntity.getItemEntity() : null, null, 2, null);
            } else {
                FavTradeCacheConvert.f42000a.m51955a(Integer.valueOf(favCommonFragment.m51241A4()), tradeItemBean);
            }
            ToastCompat.m66441G(favCommonFragment.mContext.getString(R$string.cancel_favor_ok), new Object[0]);
            favCommonFragment.f41673l0.remove(tradeItemBean);
            if (favCommonFragment.m51257h5()) {
                ArrayList<TradeItemBean> arrayList2 = favCommonFragment.f41673l0;
                arrayList = new ArrayList();
                for (TradeItemBean tradeItemBean2 : arrayList2) {
                    AlphaFavEntity alphaFavEntity2 = tradeItemBean instanceof AlphaFavEntity ? (AlphaFavEntity) tradeItemBean : null;
                    String tokenBridgeId = (alphaFavEntity2 == null || (itemEntity = alphaFavEntity2.getItemEntity()) == null) ? null : itemEntity.getTokenBridgeId();
                    if (tokenBridgeId != null) {
                        arrayList.add(tokenBridgeId);
                    }
                }
            } else {
                ArrayList<TradeItemBean> arrayList3 = favCommonFragment.f41673l0;
                arrayList = new ArrayList();
                Iterator<T> it = arrayList3.iterator();
                while (it.hasNext()) {
                    String symbol = ((TradeItemBean) it.next()).getSymbol();
                    if (symbol != null) {
                        arrayList.add(symbol);
                    }
                }
            }
            favCommonFragment.sendIntent(new FavCommonContract$UiIntent.UpdateSubscribe(arrayList, Integer.valueOf(favCommonFragment.m51241A4())));
            List<TradeItemBean> data = favCommonFragment.m51272w4().getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            if (!data.isEmpty()) {
                favCommonFragment.m51272w4().remove(i11);
            }
            if (C22218w1.m52123c(favCommonFragment.getArguments())) {
                m51238x5(favCommonFragment, null, 1, null);
            }
            if (favCommonFragment.m51272w4().getData().isEmpty()) {
                favCommonFragment.showEmpty();
            }
            if ("B5markets_fav_delete".length() == 0 || "data_load_finish".length() == 0) {
                C44128b.m97270n("Monitor", "eventName(B5markets_fav_delete) or pointName(data_load_finish) is null");
            } else {
                EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
                eventParametersBuilderAcquire.m42381b("type", favCommonFragment.m51241A4());
                C45290a.f101823a.m100101b("B5markets_fav_delete", "data_load_finish", "", eventParametersBuilderAcquire.m42380a());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m51238x5(FavCommonFragment favCommonFragment, Action action, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sortData");
        }
        if ((i11 & 1) != 0) {
            action = null;
        }
        favCommonFragment.m51273w5(action);
    }

    /* JADX INFO: renamed from: A4 */
    public final int m51241A4() {
        return ((Number) this.f41661Z.getValue()).intValue();
    }

    /* JADX INFO: renamed from: B4 */
    public final Integer m51242B4() {
        return (Integer) this.f41666e0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: D4 */
    public final String m51244D4() {
        return (String) this.f41667f0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: E4, reason: from getter */
    public final RecommendCommonFragment getF41665d0() {
        return this.f41665d0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: I4 */
    public final void m51249I4(@Nullable TradeItemBean tradeItemBean, int i11) {
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            sendIntent(new FavCommonContract$UiIntent.CollectOrCancelCoin(Integer.valueOf(m51241A4()), tradeItemBean, i11));
        } else if (TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) || !com.kubi.user.config.a.b()) {
            m51261n4(tradeItemBean, i11);
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.favorites.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavCommonFragment.m51178J4();
                }
            }), 1, (Object) null);
        }
        if ("B5markets_fav_delete".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(B5markets_fav_delete) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42381b("type", m51241A4());
            C45290a.f101823a.m100101b("B5markets_fav_delete", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        C43724b c43724bM51260k5 = m51260k5();
        if (c43724bM51260k5 != null) {
            c43724bM51260k5.m96331y();
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final boolean m51251M4() {
        if (!this.f41673l0.isEmpty()) {
            return true;
        }
        List<TradeItemBean> data = m51272w4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return !data.isEmpty();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        C36967g c36967g;
        List<WsAlphaSnapshotEntity> listM82785a;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C36966f) {
            List<TradeItemBean> listM82784a = ((C36966f) singleEvent).m82784a();
            if (listM82784a != null) {
                this.f41673l0.clear();
                this.f41673l0.addAll(listM82784a);
                m51273w5(new Action() { // from class: com.kubi.quotefacade.favorites.v
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        FavCommonFragment.m51228s4(this.f41900b);
                    }
                });
                return;
            }
            return;
        }
        if (singleEvent instanceof C36965e) {
            Pair<TradeItemBean, Integer> pairM82783a = ((C36965e) singleEvent).m82783a();
            if (pairM82783a == null) {
                return;
            }
            m51261n4(pairM82783a.getFirst(), pairM82783a.getSecond().intValue());
            return;
        }
        if (singleEvent instanceof C36969i) {
            C36969i c36969i = (C36969i) singleEvent;
            List<WsMarketSnapshotEntity> listM82787a = c36969i.m82787a();
            if (listM82787a == null || listM82787a.isEmpty()) {
                return;
            }
            m51267r4(c36969i.m82787a());
            return;
        }
        if (!(singleEvent instanceof C36968h)) {
            if (!(singleEvent instanceof C36967g) || (listM82785a = (c36967g = (C36967g) singleEvent).m82785a()) == null || listM82785a.isEmpty()) {
                return;
            }
            m51264p4(c36967g.m82785a());
            return;
        }
        C36968h c36968h = (C36968h) singleEvent;
        List<WsFutureSnapshotEntity> listM82786a = c36968h.m82786a();
        if (listM82786a == null || listM82786a.isEmpty()) {
            return;
        }
        m51265q4(c36968h.m82786a());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_favorite_page_container;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends FavCommonViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FavCommonViewModel.class);
    }

    /* JADX INFO: renamed from: i5 */
    public final void m51258i5(int i11, boolean z11) {
        C4690r c4690rM51274x4;
        RecyclerView recyclerView;
        if (BQuoteFacadeDepend.f42592a.m53022b().mo28952h() || (c4690rM51274x4 = m51274x4()) == null || (recyclerView = c4690rM51274x4.f4513d) == null) {
            return;
        }
        C22218w1.m52125e(recyclerView, getParentFragment(), Integer.valueOf(i11), Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: n4 */
    public final void m51261n4(final TradeItemBean tradeItemBean, final int i11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51226o4(tradeItemBean, this, i11);
            }
        });
    }

    /* JADX INFO: renamed from: n5 */
    public final void m51262n5() {
        RecommendCommonFragment recommendCommonFragment = this.f41665d0;
        if (recommendCommonFragment != null && recommendCommonFragment.isAdded()) {
            C27032f.m66620k(this, recommendCommonFragment);
        }
        this.f41665d0 = null;
        this.f41668g0 = false;
    }

    /* JADX INFO: renamed from: o5 */
    public final void m51263o5(@Nullable RecommendCommonFragment recommendCommonFragment) {
        this.f41665d0 = recommendCommonFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        m51262n5();
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        super.onShow();
        if (this.f41674m0 && !this.f41669h0) {
            showLoading();
            this.f41674m0 = false;
        }
        sendIntent(new FavCommonContract$UiIntent.FetchFavData(Integer.valueOf(m51241A4())));
        int iM51241A4 = m51241A4();
        if (iM51241A4 == 6) {
            C27023a.m66555b("B5MarketFavoritesAlpha", "hot", "1", null, 8, null);
            return;
        }
        if (iM51241A4 == 7) {
            C27023a.m66555b("B5MarketFavoritesAlpha", "chain", "1", null, 8, null);
            return;
        }
        String strMo51277z4 = mo51277z4();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", C22218w1.m52123c(getArguments()) ? "home" : "markets");
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e(strMo51277z4, "Tab", "1", jSONObject);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p4 */
    public final void m51264p4(@NotNull List<WsAlphaSnapshotEntity> wsAlphaList) {
        AlphaItemEntity itemEntity;
        WsAlphaSnapshotEntity wsAlphaSnapshotEntity;
        Intrinsics.checkNotNullParameter(wsAlphaList, "wsAlphaList");
        HashMap map = new HashMap();
        for (WsAlphaSnapshotEntity wsAlphaSnapshotEntity2 : wsAlphaList) {
            map.put(wsAlphaSnapshotEntity2.getTokenBridgeId(), wsAlphaSnapshotEntity2);
        }
        Iterator<T> it = this.f41673l0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TradeItemBean tradeItemBean = (TradeItemBean) it.next();
            AlphaFavEntity alphaFavEntity = tradeItemBean instanceof AlphaFavEntity ? (AlphaFavEntity) tradeItemBean : null;
            if (alphaFavEntity != null && (itemEntity = alphaFavEntity.getItemEntity()) != null && (wsAlphaSnapshotEntity = (WsAlphaSnapshotEntity) map.get(itemEntity.getTokenBridgeId())) != null) {
                itemEntity.setPrice(wsAlphaSnapshotEntity.getPrice());
                itemEntity.setPriceRate(wsAlphaSnapshotEntity.getPriceRate());
                itemEntity.setTradingVolume(wsAlphaSnapshotEntity.getTradingVolume());
            }
        }
        if (this.f41670i0) {
            this.f41671j0 = true;
        } else {
            m51238x5(this, null, 1, null);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: q4 */
    public final void m51265q4(@NotNull List<WsFutureSnapshotEntity> wsFutureList) {
        String symbol;
        Intrinsics.checkNotNullParameter(wsFutureList, "wsFutureList");
        HashMap map = new HashMap();
        for (WsFutureSnapshotEntity wsFutureSnapshotEntity : wsFutureList) {
            if (wsFutureSnapshotEntity != null && (symbol = wsFutureSnapshotEntity.getSymbol()) != null && symbol.length() != 0) {
                map.put(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f41673l0) {
            WsFutureSnapshotEntity wsFutureSnapshotEntity2 = (WsFutureSnapshotEntity) map.get(tradeItemBean.getSymbol());
            if (wsFutureSnapshotEntity2 != null) {
                tradeItemBean.setSymbol(wsFutureSnapshotEntity2.getSymbol());
                tradeItemBean.setLastDealPrice(C27039d.m66646f(Double.valueOf(wsFutureSnapshotEntity2.getLastPrice())));
                tradeItemBean.setChangeRate(Double.valueOf(wsFutureSnapshotEntity2.getPriceChgPct()));
                tradeItemBean.setValue(QuoteExKt.m51865p(tradeItemBean, wsFutureSnapshotEntity2));
            }
        }
        if (this.f41670i0) {
            this.f41671j0 = true;
        } else {
            m51238x5(this, null, 1, null);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: r4 */
    public final void m51267r4(@NotNull List<WsMarketSnapshotEntity> wsSpotList) {
        Intrinsics.checkNotNullParameter(wsSpotList, "wsSpotList");
        HashMap map = new HashMap();
        for (WsMarketSnapshotEntity wsMarketSnapshotEntity : wsSpotList) {
            if (wsMarketSnapshotEntity != null && wsMarketSnapshotEntity.getSymbolCode() != null) {
                map.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
            }
        }
        for (TradeItemBean tradeItemBean : this.f41673l0) {
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
        if (this.f41670i0) {
            this.f41671j0 = true;
        } else {
            m51238x5(this, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final void m51268r5() {
        if (this.f41673l0.isEmpty()) {
            m51266q5();
        } else {
            m51273w5(new Action() { // from class: com.kubi.quotefacade.favorites.i
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FavCommonFragment.m51229s5(this.f41832b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51227p5(this.f41698b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.favorites.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51232t5(this.f41783b);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: u4 */
    public final List<TradeItemBean> m51269u4(@NotNull List<? extends TradeItemBean> list) {
        LinearLayoutCompat linearLayoutCompat;
        Intrinsics.checkNotNullParameter(list, "list");
        if (!C22218w1.m52123c(getArguments())) {
            return list;
        }
        List<TradeItemBean> listTake = CollectionsKt.take(list, 5);
        boolean z11 = list.size() > listTake.size();
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 != null && (linearLayoutCompat = c4690rM51274x4.f4512c) != null) {
            linearLayoutCompat.setVisibility(z11 ? 0 : 8);
        }
        if (!listTake.isEmpty() && !BQuoteFacadeDepend.f42592a.m53022b().mo28952h()) {
            m51258i5(C27034h.m66635f(this, R$dimen.trade_cell_height) * listTake.size(), z11);
        }
        return listTake;
    }

    /* JADX INFO: renamed from: w4 */
    public final FavItemListAdapter m51272w4() {
        return (FavItemListAdapter) this.f41664c0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    public final C4690r m51274x4() {
        return (C4690r) this.f41662a0.getValue(this, f41660n0[0]);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m51276y5() {
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

    /* JADX INFO: renamed from: L4 */
    public static final void m51181L4(FavCommonFragment favCommonFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        String str;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= favCommonFragment.m51272w4().getData().size() - 1) {
            TradeItemBean tradeItemBean = favCommonFragment.m51272w4().getData().get(i11);
            Intrinsics.checkNotNull(tradeItemBean);
            favCommonFragment.mo51259j5(tradeItemBean, favCommonFragment.m51242B4());
            String strMo51277z4 = favCommonFragment.mo51277z4();
            String strMo51275y4 = favCommonFragment.mo51275y4();
            String strValueOf = String.valueOf(i11 + 1);
            JSONObject jSONObject = new JSONObject();
            if (C22218w1.m52123c(favCommonFragment.getArguments())) {
                str = "home";
            } else {
                str = "markets";
            }
            jSONObject.put("type", str);
            jSONObject.put("symbol", tradeItemBean.getSymbol());
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a(strMo51277z4, strMo51275y4, strValueOf, jSONObject);
            return;
        }
        C44128b.m97266j("行情", "position: " + i11 + "，size: " + favCommonFragment.m51272w4().getData().size());
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m51186P4(FavCommonFragment favCommonFragment, TradeItemBean tradeItemBean, int i11) {
        favCommonFragment.m51249I4(tradeItemBean, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m51192S4(final FavCommonFragment favCommonFragment, final TradeItemBean tradeItemBean) {
        final String strM51243C4 = favCommonFragment.m51243C4();
        String symbol = null;
        if (favCommonFragment.m51257h5()) {
            Integer numValueOf = Integer.valueOf(favCommonFragment.m51241A4());
            if (tradeItemBean != null) {
                symbol = tradeItemBean.getSymbol();
            }
            favCommonFragment.sendIntent(new FavCommonContract$UiIntent.PinItemToTop(numValueOf, symbol, strM51243C4));
        } else {
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.quotefacade.favorites.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavCommonFragment.m51194T4(this.f41850b, tradeItemBean, strM51243C4);
                }
            }, 1, (Object) null);
        }
        C43724b c43724bM51260k5 = favCommonFragment.m51260k5();
        if (c43724bM51260k5 != null) {
            c43724bM51260k5.m96331y();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final boolean m51197V4(FavCommonFragment favCommonFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (favCommonFragment.getView() == null || !favCommonFragment.isShowing() || C22218w1.m52123c(favCommonFragment.getArguments())) {
            return false;
        }
        C43724b c43724bM51260k5 = favCommonFragment.m51260k5();
        if (c43724bM51260k5 != null) {
            favCommonFragment.m51253O4(new BaseViewHolder(c43724bM51260k5.m96292A()), favCommonFragment.m51272w4(), i11);
            c43724bM51260k5.m96320e0(view, 1, 0, 0, 0);
        }
        favCommonFragment.m51272w4().m50200s(i11);
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m51199W4(FavCommonFragment favCommonFragment, Boolean bool) {
        favCommonFragment.m51272w4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m51201X4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m51203Y4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m51205Z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m51223l5(FavCommonFragment favCommonFragment) {
        favCommonFragment.m51272w4().m50200s(-1);
    }

    /* JADX INFO: renamed from: m5 */
    public static final String m51225m5(FavCommonFragment favCommonFragment) {
        Bundle arguments = favCommonFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("positionType");
        }
        return null;
    }

    /* JADX INFO: renamed from: p5 */
    public static final Unit m51227p5(FavCommonFragment favCommonFragment) {
        C4690r c4690rM51274x4 = favCommonFragment.m51274x4();
        if (c4690rM51274x4 == null) {
            return Unit.INSTANCE;
        }
        RankShimmer rsLoading = c4690rM51274x4.f4514e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66577h(rsLoading);
        c4690rM51274x4.f4514e.m53323f();
        super.showContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m51228s4(FavCommonFragment favCommonFragment) {
        favCommonFragment.m51266q5();
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m51229s5(FavCommonFragment favCommonFragment) {
        favCommonFragment.m51266q5();
    }

    /* JADX INFO: renamed from: t4 */
    public static final int m51231t4(FavCommonFragment favCommonFragment) {
        return favCommonFragment.mo51248H4();
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m51232t5(FavCommonFragment favCommonFragment) {
        int iM66658b;
        C4690r c4690rM51274x4 = favCommonFragment.m51274x4();
        if (c4690rM51274x4 == null) {
            return Unit.INSTANCE;
        }
        favCommonFragment.m51262n5();
        FrameLayout flContainer = c4690rM51274x4.f4511b;
        Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
        C27046k.m66703r(flContainer);
        RecyclerView recyclerView = c4690rM51274x4.f4513d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66703r(recyclerView);
        LinearLayoutCompat layoutViewMoreHome = c4690rM51274x4.f4512c;
        Intrinsics.checkNotNullExpressionValue(layoutViewMoreHome, "layoutViewMoreHome");
        ViewExtKt.m66577h(layoutViewMoreHome);
        favCommonFragment.m51252N4();
        RankShimmer rankShimmer = c4690rM51274x4.f4514e;
        ViewGroup.LayoutParams layoutParams = rankShimmer.getLayoutParams();
        if (C22218w1.m52123c(favCommonFragment.getArguments())) {
            iM66658b = C27040e.m66658b(320);
        } else {
            iM66658b = -1;
        }
        layoutParams.height = iM66658b;
        rankShimmer.setLayoutParams(layoutParams);
        c4690rM51274x4.f4514e.m53322e();
        RankShimmer rsLoading = c4690rM51274x4.f4514e;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        ViewExtKt.m66594y(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Integer m51235v4(FavCommonFragment favCommonFragment) {
        Bundle arguments = favCommonFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("from"));
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public final String m51243C4() {
        int iM51241A4 = m51241A4();
        if (iM51241A4 != 1) {
            if (iM51241A4 != 2) {
                if (iM51241A4 != 3) {
                    return null;
                }
                return IQuoteFacadeService.Companion.TRADE_TYPE_SPOT;
            }
            return "Futures";
        }
        return IQuoteFacadeService.Companion.TRADE_TYPE_SPOT;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: K4 */
    public final void m51250K4() {
        m51272w4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.favorites.m
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                FavCommonFragment.m51181L4(this.f41838a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final void m51252N4() {
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout;
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 != null && (c4650a = c4690rM51274x4.f4516g) != null && (frameLayout = c4650a.f4190j) != null) {
            ViewExtKt.m66577h(frameLayout);
        }
        C4690r c4690rM51274x5 = m51274x4();
        if (c4690rM51274x5 != null && (c4677k0 = c4690rM51274x5.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: O4 */
    public final void m51253O4(BaseViewHolder baseViewHolder, BaseQuickAdapter<TradeItemBean, BaseViewHolder> baseQuickAdapter, final int i11) {
        boolean z11;
        Boolean boolValueOf;
        int i12;
        SymbolInfoEntity symbolInfoEntity;
        final TradeItemBean item = baseQuickAdapter.getItem(i11);
        View view = baseViewHolder.getView(R$id.llFavor);
        View view2 = baseViewHolder.getView(R$id.llReminder);
        View view3 = baseViewHolder.getView(R$id.llPin);
        boolean z12 = false;
        if (m51241A4() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean boolValueOf2 = null;
        if (item != null && (symbolInfoEntity = item.getSymbolInfoEntity()) != null) {
            boolValueOf = Boolean.valueOf(symbolInfoEntity.isPreviewEnableShow());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            z12 = true;
        }
        if (!m51257h5() && PriceAlertVisibilityHelper.f42102a.m52114a(z11, z12)) {
            Intrinsics.checkNotNull(view2);
            C27046k.m66685H(view2);
        } else {
            Intrinsics.checkNotNull(view2);
            C27046k.m66700o(view2);
        }
        if (!m51257h5() && BQuoteFacadeDepend.f42592a.m53025e().c()) {
            Intrinsics.checkNotNull(view3);
            C27046k.m66685H(view3);
        } else {
            Intrinsics.checkNotNull(view3);
            C27046k.m66700o(view3);
        }
        if (C27046k.m66704s(view2)) {
            ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivReminder);
            if (item != null) {
                boolValueOf2 = Boolean.valueOf(item.isAlarm());
            }
            if (C27025c.m66566d(boolValueOf2)) {
                i12 = R$mipmap.icon_trade_menu_alerted;
            } else {
                i12 = R$drawable.icon_trade_menu_alert_white;
            }
            imageView.setImageResource(i12);
        }
        Intrinsics.checkNotNull(view);
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.quotefacade.favorites.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51186P4(this.f41839b, item, i11);
            }
        });
        C27046k.m66710y(view2, 1000L, new Function0() { // from class: com.kubi.quotefacade.favorites.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51188Q4(this.f41845b, item);
            }
        });
        C27046k.m66710y(view3, 1000L, new Function0() { // from class: com.kubi.quotefacade.favorites.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FavCommonFragment.m51192S4(this.f41847b, item);
            }
        });
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: U4 */
    public final void m51254U4() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView.ItemAnimator itemAnimator;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 != null && (recyclerView5 = c4690rM51274x4.f4513d) != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(this.mContext));
        }
        if (m51272w4().m50195n()) {
            FavItemListAdapter favItemListAdapterM51272w4 = m51272w4();
            C4690r c4690rM51274x5 = m51274x4();
            if (c4690rM51274x5 != null) {
                recyclerView4 = c4690rM51274x5.f4513d;
            } else {
                recyclerView4 = null;
            }
            favItemListAdapterM51272w4.bindToRecyclerView(recyclerView4);
        }
        C4690r c4690rM51274x6 = m51274x4();
        if (c4690rM51274x6 != null && (recyclerView3 = c4690rM51274x6.f4513d) != null && (itemAnimator = recyclerView3.getItemAnimator()) != null) {
            itemAnimator.setChangeDuration(0L);
        }
        C4690r c4690rM51274x7 = m51274x4();
        if (c4690rM51274x7 != null && (recyclerView2 = c4690rM51274x7.f4513d) != null) {
            recyclerView2.setHasFixedSize(true);
        }
        m51250K4();
        m51272w4().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.favorites.c
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return FavCommonFragment.m51197V4(this.f41785a, baseQuickAdapter, view, i11);
            }
        });
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.favorites.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavCommonFragment.m51199W4(this.f41787b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.favorites.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavCommonFragment.m51201X4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.favorites.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FavCommonFragment.m51203Y4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.favorites.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FavCommonFragment.m51205Z4(function2, obj);
            }
        }));
        C4690r c4690rM51274x8 = m51274x4();
        if (c4690rM51274x8 != null && (recyclerView = c4690rM51274x8.f4513d) != null) {
            recyclerView.addOnScrollListener(new C21920a());
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final void m51255a5() {
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
        C4690r c4690rM51274x4;
        C4650a c4650a6;
        BaseTextView baseTextView;
        C4677k0 c4677k1;
        ConstraintLayout constraintLayout2;
        C4650a c4650a7;
        FrameLayout frameLayout3;
        C4650a c4650a8;
        FrameLayout frameLayout4;
        C4690r c4690rM51274x5 = m51274x4();
        if (c4690rM51274x5 != null && (c4650a8 = c4690rM51274x5.f4516g) != null && (frameLayout4 = c4650a8.f4190j) != null) {
            this.f41663b0 = new CoinListSortHelper(frameLayout4);
        }
        if (C22218w1.m52123c(getArguments())) {
            C4690r c4690rM51274x6 = m51274x4();
            if (c4690rM51274x6 != null && (c4650a7 = c4690rM51274x6.f4516g) != null && (frameLayout3 = c4650a7.f4190j) != null) {
                ViewExtKt.m66577h(frameLayout3);
            }
            C4690r c4690rM51274x7 = m51274x4();
            if (c4690rM51274x7 != null && (c4677k1 = c4690rM51274x7.f4517h) != null && (constraintLayout2 = c4677k1.f4402e) != null) {
                C27046k.m66685H(constraintLayout2);
            }
        } else {
            if (m51257h5() && (c4690rM51274x4 = m51274x4()) != null && (c4650a6 = c4690rM51274x4.f4516g) != null && (baseTextView = c4650a6.f4191k) != null) {
                baseTextView.setText(getString(R$string.name));
            }
            C4690r c4690rM51274x8 = m51274x4();
            if (c4690rM51274x8 != null && (c4650a5 = c4690rM51274x8.f4516g) != null && (frameLayout2 = c4650a5.f4190j) != null) {
                ViewExtKt.m66594y(frameLayout2);
            }
            C4690r c4690rM51274x9 = m51274x4();
            if (c4690rM51274x9 != null && (c4677k0 = c4690rM51274x9.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
                ViewExtKt.m66577h(constraintLayout);
            }
            C4690r c4690rM51274x10 = m51274x4();
            if (c4690rM51274x10 != null && (c4650a4 = c4690rM51274x10.f4516g) != null && (linearLayout3 = c4650a4.f4188h) != null) {
                C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.w
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavCommonFragment.m51210c5(this.f41901b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51274x11 = m51274x4();
            if (c4690rM51274x11 != null && (c4650a3 = c4690rM51274x11.f4516g) != null && (linearLayout2 = c4650a3.f4189i) != null) {
                C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavCommonFragment.m51212d5(this.f41904b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51274x12 = m51274x4();
            if (c4690rM51274x12 != null && (c4650a2 = c4690rM51274x12.f4516g) != null && (linearLayout = c4650a2.f4183c) != null) {
                C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavCommonFragment.m51214e5(this.f41906b);
                    }
                }, 1, null);
            }
            C4690r c4690rM51274x13 = m51274x4();
            if (c4690rM51274x13 != null && (c4650a = c4690rM51274x13.f4516g) != null && (frameLayout = c4650a.f4182b) != null) {
                C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.z
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FavCommonFragment.m51208b5(this.f41908b);
                    }
                }, 1, null);
            }
            m51276y5();
        }
        if (C12573b.f21598a.m23696a()) {
            "quote_fav_float_guild_change".length();
        }
        C12572a.m23692a(this, false, new FavCommonFragment$initSortView$$inlined$bindFlowEvent$1("quote_fav_float_guild_change", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.FavCommonFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C219222(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.FavCommonFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C219244(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.favorites.FavCommonFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPinItemTopSuccess();
            }
        }, new C219266(null));
    }

    /* JADX INFO: renamed from: f5 */
    public final void m51256f5() {
        LinearLayoutCompat linearLayoutCompat;
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 != null && (linearLayoutCompat = c4690rM51274x4.f4512c) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.quotefacade.favorites.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FavCommonFragment.m51217g5(this.f41830b);
                }
            }, 1, null);
        }
        int iM66658b = C27040e.m66658b(12);
        View viewFindViewById = findViewById(R$id.margin_view);
        if (viewFindViewById != null) {
            ViewExtKt.m66585p(viewFindViewById, iM66658b, 0, iM66658b, 0, 10, null);
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final boolean m51257h5() {
        if (m51241A4() != 6 && m51241A4() != 7) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: k5 */
    public final C43724b m51260k5() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (this.f41672k0 == null) {
            this.f41672k0 = new BubbleEasyPopup(context).m96307Q(R$layout.popwindow_layout_favriote_action).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.favorites.k
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    FavCommonFragment.m51223l5(this.f41836b);
                }
            }).m96316Z(true).m96322p();
        }
        return this.f41672k0;
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m51255a5();
        m51254U4();
        m51256f5();
        if (C12573b.f21598a.m23696a()) {
            "refresh_favor_page".length();
        }
        C12572a.m23692a(this, false, new FavCommonFragment$doOnLazyInitView$$inlined$bindFlowEvent$1("refresh_favor_page", null, this));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        m51262n5();
    }

    /* JADX INFO: renamed from: u5 */
    public final void m51270u5() {
        FrameLayout frameLayout;
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout2;
        LinearLayoutCompat linearLayoutCompat;
        RecyclerView recyclerView;
        C4690r c4690rM51274x4 = m51274x4();
        if (c4690rM51274x4 != null && (recyclerView = c4690rM51274x4.f4513d) != null) {
            C27046k.m66703r(recyclerView);
        }
        C4690r c4690rM51274x5 = m51274x4();
        if (c4690rM51274x5 != null && (linearLayoutCompat = c4690rM51274x5.f4512c) != null) {
            ViewExtKt.m66577h(linearLayoutCompat);
        }
        RecommendCommonFragment recommendCommonFragmentMo51246F4 = mo51246F4();
        C4690r c4690rM51274x6 = m51274x4();
        if (c4690rM51274x6 != null && (c4650a = c4690rM51274x6.f4516g) != null && (frameLayout2 = c4650a.f4190j) != null) {
            ViewExtKt.m66577h(frameLayout2);
        }
        C4690r c4690rM51274x7 = m51274x4();
        if (c4690rM51274x7 != null && (c4677k0 = c4690rM51274x7.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            ViewExtKt.m66577h(constraintLayout);
        }
        if (!recommendCommonFragmentMo51246F4.isAdded() && !this.f41668g0) {
            this.f41668g0 = true;
            C27032f.m66611b(this, R$id.fl_container, recommendCommonFragmentMo51246F4, null, 4, null);
        }
        C4690r c4690rM51274x8 = m51274x4();
        if (c4690rM51274x8 != null && (frameLayout = c4690rM51274x8.f4511b) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final void m51271v5() {
        C4677k0 c4677k0;
        ConstraintLayout constraintLayout;
        C4650a c4650a;
        FrameLayout frameLayout;
        C4677k0 c4677k1;
        ConstraintLayout constraintLayout2;
        C4650a c4650a2;
        FrameLayout frameLayout2;
        if (C22218w1.m52123c(getArguments())) {
            C4690r c4690rM51274x4 = m51274x4();
            if (c4690rM51274x4 != null && (c4650a2 = c4690rM51274x4.f4516g) != null && (frameLayout2 = c4650a2.f4190j) != null) {
                ViewExtKt.m66577h(frameLayout2);
            }
            C4690r c4690rM51274x5 = m51274x4();
            if (c4690rM51274x5 != null && (c4677k1 = c4690rM51274x5.f4517h) != null && (constraintLayout2 = c4677k1.f4402e) != null) {
                C27046k.m66685H(constraintLayout2);
                return;
            }
            return;
        }
        C4690r c4690rM51274x6 = m51274x4();
        if (c4690rM51274x6 != null && (c4650a = c4690rM51274x6.f4516g) != null && (frameLayout = c4650a.f4190j) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
        C4690r c4690rM51274x7 = m51274x4();
        if (c4690rM51274x7 != null && (c4677k0 = c4690rM51274x7.f4517h) != null && (constraintLayout = c4677k0.f4402e) != null) {
            C27046k.m66700o(constraintLayout);
        }
    }

    /* JADX INFO: renamed from: w5 */
    public final void m51273w5(Action action) {
        if (!isDetached() && getView() != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FavCommonFragment$sortData$1(this, action, null), 3, null);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
    }
}
