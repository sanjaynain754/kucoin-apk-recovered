package com.kubi.quotefacade.market.holdings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4654b0;
import bv.C4666f0;
import bv.C4676k;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.mvi.state.LazyBaseStateFragment;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.adapter.HoldingsListAdapter;
import com.kubi.quotefacade.adapter.HoldingsRefreshHeader;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingEntity;
import com.kubi.quotefacade.entity.WsFutureSnapshotEntity;
import com.kubi.quotefacade.event.HoldingsCommonContract$UiIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.favorites.C22098s0;
import com.kubi.quotefacade.helper.HoldingsSortHelper;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37752d;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36970j;
import p212dv.C36971k;
import p212dv.C36972l;
import p212dv.C36973m;
import p429lf.C42179a;
import p569qq.C43852m;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: HoldingsCommonFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 W2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001WB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010,\u001a\u00020\bH&J\b\u0010-\u001a\u00020\bH&J\b\u0010.\u001a\u00020\u001cH\u0014J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0014J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u000200H\u0016J\b\u00107\u001a\u000200H\u0016J\b\u00108\u001a\u000200H\u0016J\u0019\u00109\u001a\u0002002\n\b\u0002\u0010:\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010;J\u001a\u0010<\u001a\u0002002\u0010\b\u0002\u0010=\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010>H\u0002J\b\u0010?\u001a\u000200H\u0002J\b\u0010@\u001a\u000200H\u0002J\b\u0010A\u001a\u000200H\u0002J\b\u0010B\u001a\u000200H\u0002J\u0016\u0010C\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EH\u0007J\u0016\u0010G\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020H0EH\u0007J\b\u0010I\u001a\u000200H\u0002J\u0018\u0010J\u001a\u0002002\u000e\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0EH\u0007J\u0014\u0010M\u001a\u0002002\n\b\u0002\u0010N\u001a\u0004\u0018\u00010OH\u0002J!\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u00020\u001c2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u000200H\u0016J\b\u0010T\u001a\u00020\u001cH\u0002J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020 H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b$\u0010%R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0004\n\u0002\u0010+¨\u0006X"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/HoldingsCommonFragment;", "Lcom/kubi/mvi/state/LazyBaseStateFragment;", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UiIntent;", "Lcom/kubi/quotefacade/event/HoldingsCommonContract$UIState;", "Lcom/kubi/quotefacade/market/holdings/MarketHoldingsViewModel;", "<init>", "()V", "holdingsType", "", "getHoldingsType", "()Ljava/lang/String;", "holdingsType$delegate", "Lkotlin/Lazy;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChildMarketHoldingsBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChildMarketHoldingsBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mSortHelper", "Lcom/kubi/quotefacade/helper/HoldingsSortHelper;", "scrolling", "", "bufferNotify", "originDataList", "Ljava/util/ArrayList;", "Lcom/kubi/quotefacade/entity/HoldingEntity;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/kubi/quotefacade/adapter/HoldingsListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/adapter/HoldingsListAdapter;", "adapter$delegate", "holdingsRefreshHeader", "Lcom/kubi/quotefacade/adapter/HoldingsRefreshHeader;", "updateTimeFromLastRefresh", "", "Ljava/lang/Long;", "getReportType", "getHoldingType", "useDepositEmptyStyle", "doOnLazyInitView", "", "initDepositEmptyView", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "showLoading", "showContent", "showHoldingsEmptyPlaceView", "updateTime", "(Ljava/lang/Long;)V", "showHoldingsErrorPlaceView", "retry", "Lkotlin/Function0;", "showHoldingsNotLoginPlaceView", "initSortView", "updateViewSortMargin", "initRecyclerView", "dealWsAlphaDataAndRefresh", "wsHoldingsList", "", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "dealWsSpotDataAndRefresh", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "handleItemClick", "dealWsFutureDataAndRefresh", "wsFutureList", "Lcom/kubi/quotefacade/entity/WsFutureSnapshotEntity;", "sortData", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "controlPlaceView", "showNoData", "(ZLjava/lang/Long;)V", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "isAlphaTab", "isAlphaItem", "item", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldingsCommonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldingsCommonFragment.kt\ncom/kubi/quotefacade/market/holdings/HoldingsCommonFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n147#2,16:562\n1#3:578\n158#4,2:579\n1869#5,2:581\n1869#5,2:583\n1869#5,2:585\n1869#5,2:587\n1869#5,2:589\n1869#5,2:591\n*S KotlinDebug\n*F\n+ 1 HoldingsCommonFragment.kt\ncom/kubi/quotefacade/market/holdings/HoldingsCommonFragment\n*L\n92#1:562,16\n325#1:579,2\n403#1:581,2\n406#1:583,2\n425#1:585,2\n428#1:587,2\n494#1:589,2\n499#1:591,2\n*E\n"})
public abstract class HoldingsCommonFragment extends LazyBaseStateFragment<HoldingsCommonContract$UiIntent, UIState, MarketHoldingsViewModel> {

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public HoldingsSortHelper f42279b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f42280c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f42281d0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public HoldingsRefreshHeader f42284g0;

    /* JADX INFO: renamed from: h0 */
    @Nullable
    public Long f42285h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f42276j0 = {Reflection.property1(new PropertyReference1Impl(HoldingsCommonFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChildMarketHoldingsBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f42275i0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f42277Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.holdings.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HoldingsCommonFragment.m52497p4(this.f42326b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f42278a0 = C45681e.m100799e(this, new Function1<HoldingsCommonFragment, C4676k>() { // from class: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4676k invoke(@NotNull HoldingsCommonFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            View viewM42558q3 = this.this$0.m42558q3();
            Intrinsics.checkNotNullExpressionValue(viewM42558q3, "access$getLazyFragContentView(...)");
            return C4676k.m4664a(viewM42558q3);
        }

        {
            super(1);
        }
    }, new Function1<C4676k, Unit>() { // from class: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4676k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4676k c4676k) {
            invoke(c4676k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final ArrayList<HoldingEntity> f42282e0 = new ArrayList<>();

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f42283f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.market.holdings.x
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HoldingsCommonFragment.m52491a4(this.f42327b);
        }
    });

    /* JADX INFO: compiled from: HoldingsCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/market/holdings/HoldingsCommonFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "REPORT_PAGE_TYPE", "BLOCK_ID", "REPORT_SYMBOL", "HOLDINGS_REPORT_TYPE_FUNDING", "HOLDINGS_REPORT_TYPE_TRADING", "HOLDINGS_REPORT_TYPE_MARGIN", "HOLDINGS_REPORT_TYPE_FUTURE", "HOLDINGS_REPORT_TYPE_ALPHA", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$a */
    /* JADX INFO: compiled from: HoldingsCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/market/holdings/HoldingsCommonFragment$initRecyclerView$1$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22323a extends RecyclerView.OnScrollListener {
        public C22323a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        @SuppressLint({"NotifyDataSetChanged"})
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            HoldingsCommonFragment.this.f42280c0 = newState != 0;
            if (HoldingsCommonFragment.this.f42280c0 || !HoldingsCommonFragment.this.f42281d0) {
                return;
            }
            HoldingsCommonFragment.this.m52523h4().notifyDataSetChanged();
            HoldingsCommonFragment.this.f42281d0 = false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$2 */
    /* JADX INFO: compiled from: HoldingsCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$2", m90122f = "HoldingsCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223252 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223252(Continuation<? super C223252> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223252 c223252 = HoldingsCommonFragment.this.new C223252(continuation);
            c223252.L$0 = obj;
            return c223252;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223252) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                HoldingsCommonFragment.this.f42282e0.clear();
                HoldingsCommonFragment.m52464G4(HoldingsCommonFragment.this, null, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$4 */
    /* JADX INFO: compiled from: HoldingsCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$4", m90122f = "HoldingsCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223274 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223274(Continuation<? super C223274> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m52528f(HoldingsCommonFragment holdingsCommonFragment) {
            holdingsCommonFragment.sendIntent(new HoldingsCommonContract$UiIntent.FetchHoldingsData(holdingsCommonFragment.m52525k4()));
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223274 c223274 = HoldingsCommonFragment.this.new C223274(continuation);
            c223274.L$0 = obj;
            return c223274;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223274) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                HoldingsCommonFragment.this.f42282e0.clear();
                final HoldingsCommonFragment holdingsCommonFragment = HoldingsCommonFragment.this;
                holdingsCommonFragment.m52517H4(new Function0() { // from class: com.kubi.quotefacade.market.holdings.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HoldingsCommonFragment.C223274.m52528f(holdingsCommonFragment);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$6 */
    /* JADX INFO: compiled from: HoldingsCommonFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingsCommonFragment$bindState$6", m90122f = "HoldingsCommonFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C223296 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C223296(Continuation<? super C223296> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C223296 c223296 = HoldingsCommonFragment.this.new C223296(continuation);
            c223296.L$0 = obj;
            return c223296;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C223296) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
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
                HoldingsCommonFragment.this.f42282e0.clear();
                HoldingsCommonFragment.this.m52518K4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean mo52434Q4() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: j4 */
    public abstract String mo52435j4();

    @NotNull
    /* JADX INFO: renamed from: l4 */
    public abstract String mo52436l4();

    /* JADX INFO: renamed from: A4 */
    public static final Unit m52455A4(HoldingsCommonFragment holdingsCommonFragment) {
        HoldingsSortHelper holdingsSortHelper = holdingsCommonFragment.f42279b0;
        if (holdingsSortHelper != null) {
            holdingsSortHelper.m52103p();
        }
        m52478O4(holdingsCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m52457B4(HoldingsCommonFragment holdingsCommonFragment) {
        HoldingsSortHelper holdingsSortHelper = holdingsCommonFragment.f42279b0;
        if (holdingsSortHelper != null) {
            holdingsSortHelper.m52109v();
        }
        m52478O4(holdingsCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m52459C4(HoldingsCommonFragment holdingsCommonFragment) {
        HoldingsSortHelper holdingsSortHelper = holdingsCommonFragment.f42279b0;
        if (holdingsSortHelper != null) {
            holdingsSortHelper.m52105r();
        }
        m52478O4(holdingsCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static /* synthetic */ void m52464G4(HoldingsCommonFragment holdingsCommonFragment, Long l11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showHoldingsEmptyPlaceView");
        }
        if ((i11 & 1) != 0) {
            l11 = holdingsCommonFragment.f42285h0;
        }
        holdingsCommonFragment.m52516F4(l11);
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m52472L4() {
        IUserService.O(IUserService.a.get(), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.market.holdings.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsCommonFragment.m52474M4();
            }
        }), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m52474M4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m52478O4(HoldingsCommonFragment holdingsCommonFragment, Action action, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sortData");
        }
        if ((i11 & 1) != 0) {
            action = null;
        }
        holdingsCommonFragment.m52476N4(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public final void m52480P4() {
        View viewFindViewById = findViewById(R$id.view_sort);
        ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (C22098s0.m51728a(getArguments())) {
                marginLayoutParams.topMargin = C27040e.m66658b(0);
            } else if (C22098s0.m51729b(getArguments())) {
                marginLayoutParams.topMargin = C27040e.m66658b(4);
            } else {
                marginLayoutParams.topMargin = C27040e.m66658b(8);
            }
        }
    }

    /* JADX INFO: renamed from: a4 */
    public static final HoldingsListAdapter m52491a4(HoldingsCommonFragment holdingsCommonFragment) {
        return new HoldingsListAdapter(holdingsCommonFragment.m52525k4());
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m52492c4(HoldingsCommonFragment holdingsCommonFragment, boolean z11, Long l11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: controlPlaceView");
        }
        if ((i11 & 2) != 0) {
            l11 = null;
        }
        holdingsCommonFragment.m52519b4(z11, l11);
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m52496o4(HoldingsCommonFragment holdingsCommonFragment, TradeItemBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intent intent = new Intent();
        intent.putExtras(new C27051h().m66721e("data", it).m66717a());
        FragmentActivity activity = holdingsCommonFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = holdingsCommonFragment.getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m52498r4() {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "HOMEPAGE", null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m52501t4(final HoldingsCommonFragment holdingsCommonFragment, final SwipeRefreshRecyclerView swipeRefreshRecyclerView, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        holdingsCommonFragment.sendIntent(new HoldingsCommonContract$UiIntent.FetchHoldingsData(holdingsCommonFragment.m52525k4()));
        holdingsCommonFragment.runOnUiThread(new Function0() { // from class: com.kubi.quotefacade.market.holdings.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsCommonFragment.m52503u4(this.f42311b);
            }
        });
        BaseFragment.runOnUiThread$default(holdingsCommonFragment, new Function0() { // from class: com.kubi.quotefacade.market.holdings.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsCommonFragment.m52505v4(this.f42312b, swipeRefreshRecyclerView);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m52507w4(final HoldingsCommonFragment holdingsCommonFragment, final InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        holdingsCommonFragment.sendIntent(new HoldingsCommonContract$UiIntent.FetchHoldingsData(holdingsCommonFragment.m52525k4()));
        BaseFragment.runOnUiThread$default(holdingsCommonFragment, new Function0() { // from class: com.kubi.quotefacade.market.holdings.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsCommonFragment.m52509x4(this.f42308b, it);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m52513z4(HoldingsCommonFragment holdingsCommonFragment) {
        HoldingsSortHelper holdingsSortHelper = holdingsCommonFragment.f42279b0;
        if (holdingsSortHelper != null) {
            holdingsSortHelper.m52107t();
        }
        m52478O4(holdingsCommonFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b4 */
    public final void m52519b4(boolean z11, @Nullable Long l11) {
        if (z11) {
            m52516F4(l11);
        } else {
            showContent();
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d4 */
    public final void m52520d4(@NotNull List<WsAlphaSnapshotEntity> wsHoldingsList) {
        Intrinsics.checkNotNullParameter(wsHoldingsList, "wsHoldingsList");
        HashMap map = new HashMap();
        for (WsAlphaSnapshotEntity wsAlphaSnapshotEntity : wsHoldingsList) {
            map.put(wsAlphaSnapshotEntity.getTokenBridgeId(), wsAlphaSnapshotEntity);
        }
        for (HoldingEntity holdingEntity : this.f42282e0) {
            WsAlphaSnapshotEntity wsAlphaSnapshotEntity2 = (WsAlphaSnapshotEntity) map.get(holdingEntity.getTokenBridgeId());
            if (wsAlphaSnapshotEntity2 != null) {
                holdingEntity.setCurrentPrice(wsAlphaSnapshotEntity2.getPrice());
                holdingEntity.setChangeRate(wsAlphaSnapshotEntity2.getPriceRate());
                holdingEntity.setValue(wsAlphaSnapshotEntity2.getTradingVolume());
            }
        }
        if (this.f42280c0) {
            this.f42281d0 = true;
        } else {
            m52478O4(this, null, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        C36971k c36971k;
        List<WsAlphaSnapshotEntity> listM82789a;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C36970j) {
            C36970j c36970j = (C36970j) singleEvent;
            HoldingData f82086a = c36970j.getF82086a();
            this.f42285h0 = f82086a != null ? f82086a.getLastUpdateTime() : null;
            HoldingData f82086a2 = c36970j.getF82086a();
            List<HoldingEntity> list = f82086a2 != null ? f82086a2.getList() : null;
            if (list == null || list.isEmpty()) {
                this.f42282e0.clear();
                m52516F4(this.f42285h0);
                return;
            } else {
                this.f42282e0.clear();
                this.f42282e0.addAll(list);
                m52476N4(new Action() { // from class: com.kubi.quotefacade.market.holdings.v
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        HoldingsCommonFragment.m52493g4(this.f42325b);
                    }
                });
                return;
            }
        }
        if (singleEvent instanceof C36973m) {
            C36973m c36973m = (C36973m) singleEvent;
            List<WsMarketSnapshotEntity> listM82791a = c36973m.m82791a();
            if (listM82791a == null || listM82791a.isEmpty()) {
                return;
            }
            m52522f4(c36973m.m82791a());
            return;
        }
        if (!(singleEvent instanceof C36972l)) {
            if (!(singleEvent instanceof C36971k) || (listM82789a = (c36971k = (C36971k) singleEvent).m82789a()) == null || listM82789a.isEmpty()) {
                return;
            }
            m52520d4(c36971k.m82789a());
            return;
        }
        C36972l c36972l = (C36972l) singleEvent;
        List<WsFutureSnapshotEntity> listM82790a = c36972l.m82790a();
        if (listM82790a == null || listM82790a.isEmpty() || !C24129b.m58030b(SiteVisibleConfigKey.Futures)) {
            return;
        }
        m52521e4(c36972l.m82790a());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e4 */
    public final void m52521e4(@NotNull List<WsFutureSnapshotEntity> wsFutureList) {
        Intrinsics.checkNotNullParameter(wsFutureList, "wsFutureList");
        HashMap map = new HashMap();
        for (WsFutureSnapshotEntity wsFutureSnapshotEntity : wsFutureList) {
            if (wsFutureSnapshotEntity != null) {
                map.put(wsFutureSnapshotEntity.getSymbol(), wsFutureSnapshotEntity);
            }
        }
        for (HoldingEntity holdingEntity : this.f42282e0) {
            WsFutureSnapshotEntity wsFutureSnapshotEntity2 = (WsFutureSnapshotEntity) map.get(holdingEntity.getSymbol());
            if (wsFutureSnapshotEntity2 != null) {
                boolean zIsInverse = IKuMexService.f28731a.get().mo33295y(wsFutureSnapshotEntity2.getSymbol()).isInverse();
                holdingEntity.setSymbol(wsFutureSnapshotEntity2.getSymbol());
                holdingEntity.setCurrentPrice(new BigDecimal(C27039d.m66646f(Double.valueOf(wsFutureSnapshotEntity2.getLastPrice()))));
                holdingEntity.setChangeRate(new BigDecimal(wsFutureSnapshotEntity2.getPriceChgPct()));
                holdingEntity.setValue(new BigDecimal(C27039d.m66646f(Double.valueOf(zIsInverse ? wsFutureSnapshotEntity2.getVolume() : wsFutureSnapshotEntity2.getTurnover()))));
            }
        }
        if (this.f42280c0) {
            this.f42281d0 = true;
        } else {
            m52478O4(this, null, 1, null);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f4 */
    public final void m52522f4(@NotNull List<WsMarketSnapshotEntity> wsHoldingsList) {
        Intrinsics.checkNotNullParameter(wsHoldingsList, "wsHoldingsList");
        HashMap map = new HashMap();
        for (WsMarketSnapshotEntity wsMarketSnapshotEntity : wsHoldingsList) {
            map.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
        }
        for (HoldingEntity holdingEntity : this.f42282e0) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity2 = (WsMarketSnapshotEntity) map.get(holdingEntity.getSymbol());
            if (wsMarketSnapshotEntity2 != null) {
                holdingEntity.setSymbol(wsMarketSnapshotEntity2.getSymbolCode());
                holdingEntity.setCurrentPrice(new BigDecimal(C27039d.m66646f(Double.valueOf(wsMarketSnapshotEntity2.getLastTradedPrice()))));
                holdingEntity.setChangeRate(new BigDecimal(wsMarketSnapshotEntity2.getChangeRate()));
                holdingEntity.setValue(new BigDecimal(C27039d.m66646f(Double.valueOf(wsMarketSnapshotEntity2.getVolValue()))));
            }
        }
        if (this.f42280c0) {
            this.f42281d0 = true;
        } else {
            m52478O4(this, null, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_child_market_holdings;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends MarketHoldingsViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(MarketHoldingsViewModel.class);
    }

    /* JADX INFO: renamed from: h4 */
    public final HoldingsListAdapter m52523h4() {
        return (HoldingsListAdapter) this.f42283f0.getValue();
    }

    /* JADX INFO: renamed from: i4 */
    public final C4676k m52524i4() {
        return (C4676k) this.f42278a0.getValue(this, f42276j0[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final String m52525k4() {
        return (String) this.f42277Z.getValue();
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m52467I4(Function0 function0, View view) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m52469J4(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX INFO: renamed from: N4 */
    private final void m52476N4(Action action) {
        if (!isDetached() && getParentFragment() != null && getView() != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HoldingsCommonFragment$sortData$1(this, action, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m52493g4(HoldingsCommonFragment holdingsCommonFragment) {
        holdingsCommonFragment.showContent();
        m52492c4(holdingsCommonFragment, false, null, 2, null);
    }

    /* JADX INFO: renamed from: m4 */
    private final void m52494m4() {
        m52523h4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.market.holdings.l
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                HoldingsCommonFragment.m52495n4(this.f42314a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m52495n4(final HoldingsCommonFragment holdingsCommonFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        String symbol;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= holdingsCommonFragment.m52523h4().getData().size() - 1) {
            HoldingEntity holdingEntity = (HoldingEntity) holdingsCommonFragment.m52523h4().getData().get(i11);
            if (holdingEntity != null) {
                symbol = holdingEntity.getSymbol();
            } else {
                symbol = null;
            }
            String str = symbol;
            if (str != null && str.length() != 0) {
                if (holdingsCommonFragment.m52514D4(holdingEntity)) {
                    QuoteExKt.m51868s(holdingEntity.getToken(), holdingEntity.getChain(), holdingEntity.getTokenBridgeId(), null, 8, null);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", holdingEntity.getSymbol());
                    Unit unit = Unit.INSTANCE;
                    C27023a.m66554a("B5MarketFavoritesHoldings", "alpha", "1", jSONObject);
                    return;
                }
                if (Intrinsics.areEqual(holdingsCommonFragment.m52525k4(), "FUTURES")) {
                    InterfaceC37752d.a.m85122a(C37304a.f82764a, str, null, null, null, 14, null);
                    return;
                } else {
                    ISpotService.m59982A(BQuoteFacadeDepend.f42592a.m53024d(), str, null, null, new Function1() { // from class: com.kubi.quotefacade.market.holdings.o
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HoldingsCommonFragment.m52496o4(this.f42317b, (TradeItemBean) obj);
                        }
                    }, 6, null);
                    return;
                }
            }
            ToastCompat.m66437C(R$string.payment_verify_failure);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", holdingsCommonFragment.mo52436l4());
            jSONObject2.put("symbol", holdingEntity.getSymbol());
            Unit unit2 = Unit.INSTANCE;
            C43852m.m96589a("B5Position", "coin", "1", jSONObject2);
            return;
        }
        C44128b.m97266j(holdingsCommonFragment.getTAG(), "position: " + i11 + "，size: " + holdingsCommonFragment.m52523h4().getData().size());
    }

    /* JADX INFO: renamed from: p4 */
    public static final String m52497p4(HoldingsCommonFragment holdingsCommonFragment) {
        return holdingsCommonFragment.mo52435j4();
    }

    /* JADX INFO: renamed from: s4 */
    private final void m52499s4() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        final SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView.ItemAnimator itemAnimator;
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 != null && (swipeRefreshRecyclerView = c4676kM52524i4.f4392f) != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            HoldingsRefreshHeader holdingsRefreshHeader = new HoldingsRefreshHeader(mContext, null, 2, null);
            this.f42284g0 = holdingsRefreshHeader;
            swipeRefreshRecyclerView.setRefreshHeader(holdingsRefreshHeader);
            RecyclerView recyclerView = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            }
            if (m52523h4().m50214q()) {
                m52523h4().bindToRecyclerView(swipeRefreshRecyclerView.getRecyclerView());
            }
            RecyclerView recyclerView2 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView2 != null && (itemAnimator = recyclerView2.getItemAnimator()) != null) {
                itemAnimator.setChangeDuration(0L);
            }
            RecyclerView recyclerView3 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView3 != null) {
                recyclerView3.setHasFixedSize(true);
            }
            swipeRefreshRecyclerView.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.market.holdings.t
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    HoldingsCommonFragment.m52501t4(this.f42322b, swipeRefreshRecyclerView, interfaceC38162f);
                }
            });
            RecyclerView recyclerView4 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView4 != null) {
                recyclerView4.addOnScrollListener(new C22323a());
            }
            m52494m4();
        }
        C4676k c4676kM52524i5 = m52524i4();
        if (c4676kM52524i5 != null && (kuCoinRefreshLayout = c4676kM52524i5.f4393g) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.market.holdings.u
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    HoldingsCommonFragment.m52507w4(this.f42324b, interfaceC38162f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m52503u4(HoldingsCommonFragment holdingsCommonFragment) {
        Long l11;
        BaseTextView f41056c;
        if (holdingsCommonFragment.getView() != null && (l11 = holdingsCommonFragment.f42285h0) != null) {
            long jLongValue = l11.longValue();
            HoldingsRefreshHeader holdingsRefreshHeader = holdingsCommonFragment.f42284g0;
            if (holdingsRefreshHeader != null && (f41056c = holdingsRefreshHeader.getF41056c()) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = holdingsCommonFragment.getString(R$string.quote_pull_to_refresh_time_desc);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{C42179a.m92633f(jLongValue, null, false, true, null, 11, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                f41056c.setText(str);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m52505v4(HoldingsCommonFragment holdingsCommonFragment, SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
        if (holdingsCommonFragment.getView() != null) {
            swipeRefreshRecyclerView.finishRefresh();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m52509x4(HoldingsCommonFragment holdingsCommonFragment, InterfaceC38162f interfaceC38162f) {
        if (holdingsCommonFragment.getView() != null) {
            interfaceC38162f.finishRefresh();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    private final void m52511y4() {
        C4666f0 c4666f0;
        FrameLayout frameLayout;
        C4666f0 c4666f1;
        LinearLayout linearLayout;
        C4666f0 c4666f2;
        LinearLayout linearLayout2;
        C4666f0 c4666f3;
        LinearLayout linearLayout3;
        C4666f0 c4666f4;
        FrameLayout frameLayout2;
        C4666f0 c4666f5;
        LinearLayout linearLayout4;
        C4666f0 c4666f6;
        BaseTextView baseTextView;
        C4666f0 c4666f7;
        BaseTextView baseTextView2;
        if (m52515E4()) {
            C4676k c4676kM52524i4 = m52524i4();
            if (c4676kM52524i4 != null && (c4666f7 = c4676kM52524i4.f4396j) != null && (baseTextView2 = c4666f7.f4330k) != null) {
                baseTextView2.setText(getString(R$string.name));
            }
            C4676k c4676kM52524i5 = m52524i4();
            if (c4676kM52524i5 != null && (c4666f6 = c4676kM52524i5.f4396j) != null && (baseTextView = c4666f6.f4331l) != null) {
                C27046k.m66685H(baseTextView);
            }
            C4676k c4676kM52524i6 = m52524i4();
            if (c4676kM52524i6 != null && (c4666f5 = c4676kM52524i6.f4396j) != null && (linearLayout4 = c4666f5.f4327h) != null) {
                C27046k.m66685H(linearLayout4);
            }
        }
        C4676k c4676kM52524i7 = m52524i4();
        if (c4676kM52524i7 != null && (c4666f4 = c4676kM52524i7.f4396j) != null && (frameLayout2 = c4666f4.f4329j) != null) {
            this.f42279b0 = new HoldingsSortHelper(frameLayout2);
        }
        C4676k c4676kM52524i8 = m52524i4();
        if (c4676kM52524i8 != null && (c4666f3 = c4676kM52524i8.f4396j) != null && (linearLayout3 = c4666f3.f4328i) != null) {
            C27046k.m66711z(linearLayout3, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldingsCommonFragment.m52513z4(this.f42304b);
                }
            }, 1, null);
        }
        C4676k c4676kM52524i9 = m52524i4();
        if (c4676kM52524i9 != null && (c4666f2 = c4676kM52524i9.f4396j) != null && (linearLayout2 = c4666f2.f4327h) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldingsCommonFragment.m52455A4(this.f42318b);
                }
            }, 1, null);
        }
        C4676k c4676kM52524i10 = m52524i4();
        if (c4676kM52524i10 != null && (c4666f1 = c4676kM52524i10.f4396j) != null && (linearLayout = c4666f1.f4322c) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldingsCommonFragment.m52457B4(this.f42319b);
                }
            }, 1, null);
        }
        C4676k c4676kM52524i11 = m52524i4();
        if (c4676kM52524i11 != null && (c4666f0 = c4676kM52524i11.f4396j) != null && (frameLayout = c4666f0.f4321b) != null) {
            C27046k.m66711z(frameLayout, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldingsCommonFragment.m52459C4(this.f42321b);
                }
            }, 1, null);
        }
        m52480P4();
        if (C12573b.f21598a.m23696a()) {
            "quote_fav_float_guild_change".length();
        }
        C12572a.m23692a(this, false, new HoldingsCommonFragment$initSortView$$inlined$bindFlowEvent$1("quote_fav_float_guild_change", null, this));
    }

    /* JADX INFO: renamed from: D4 */
    public final boolean m52514D4(HoldingEntity holdingEntity) {
        String strM52525k4 = m52525k4();
        if (Intrinsics.areEqual(strM52525k4, "ALPHA")) {
            return true;
        }
        if (Intrinsics.areEqual(strM52525k4, "ALL")) {
            return holdingEntity.isAlphaItem();
        }
        return false;
    }

    /* JADX INFO: renamed from: E4 */
    public final boolean m52515E4() {
        return Intrinsics.areEqual(m52525k4(), "ALPHA");
    }

    /* JADX INFO: renamed from: F4 */
    public final void m52516F4(Long l11) {
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 == null) {
            return;
        }
        c4676kM52524i4.f4391e.m53323f();
        c4676kM52524i4.f4391e.setVisibility(8);
        c4676kM52524i4.f4388b.setVisibility(8);
        if (mo52434Q4()) {
            c4676kM52524i4.f4393g.setVisibility(8);
            c4676kM52524i4.f4397k.getRoot().setVisibility(0);
        } else {
            c4676kM52524i4.f4397k.getRoot().setVisibility(8);
            c4676kM52524i4.f4393g.setVisibility(0);
            if (l11 != null) {
                long jLongValue = l11.longValue();
                BaseTextView baseTextView = c4676kM52524i4.f4395i;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getString(R$string.quote_pull_to_refresh_time_desc);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{C42179a.m92633f(jLongValue, null, false, true, null, 11, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView.setText(str);
            }
        }
        super.showContent();
    }

    /* JADX INFO: renamed from: H4 */
    public final void m52517H4(final Function0<Unit> function0) {
        View.OnClickListener onClickListener;
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 == null) {
            return;
        }
        c4676kM52524i4.f4391e.m53323f();
        c4676kM52524i4.f4391e.setVisibility(8);
        c4676kM52524i4.f4388b.setVisibility(8);
        c4676kM52524i4.f4393g.setVisibility(8);
        c4676kM52524i4.f4397k.getRoot().setVisibility(8);
        super.showContent();
        if (function0 != null) {
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.market.holdings.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HoldingsCommonFragment.m52467I4(function0, (View) obj);
                }
            };
            onClickListener = new View.OnClickListener() { // from class: com.kubi.quotefacade.market.holdings.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HoldingsCommonFragment.m52469J4(function1, view);
                }
            };
        } else {
            onClickListener = null;
        }
        BaseFragment.showFailView$default(this, 0, 0, onClickListener, 3, (Object) null);
    }

    /* JADX INFO: renamed from: K4 */
    public final void m52518K4() {
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 == null) {
            return;
        }
        c4676kM52524i4.f4391e.m53323f();
        c4676kM52524i4.f4391e.setVisibility(8);
        c4676kM52524i4.f4388b.setVisibility(8);
        c4676kM52524i4.f4393g.setVisibility(8);
        C4654b0 c4654b0 = c4676kM52524i4.f4397k;
        c4654b0.getRoot().setVisibility(0);
        c4654b0.f4232d.setText(getString(R$string.quote_holding_not_login));
        KcPrimaryButton kcPrimaryButton = c4654b0.f4231c;
        kcPrimaryButton.setText(getString(R$string.quote_holding_login_check));
        Intrinsics.checkNotNull(kcPrimaryButton);
        C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HoldingsCommonFragment.m52472L4();
            }
        }, 1, null);
        super.showContent();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C223252(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C223274(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.market.holdings.HoldingsCommonFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getNotLogin();
            }
        }, new C223296(null));
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment
    /* JADX INFO: renamed from: o3 */
    public void mo42556o3() {
        m52511y4();
        m52499s4();
        m52526q4();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        RankShimmer rankShimmer;
        RankShimmer rankShimmer2;
        super.onHide();
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 != null && (rankShimmer2 = c4676kM52524i4.f4391e) != null) {
            rankShimmer2.m53323f();
        }
        C4676k c4676kM52524i5 = m52524i4();
        if (c4676kM52524i5 != null && (rankShimmer = c4676kM52524i5.f4391e) != null) {
            rankShimmer.setVisibility(8);
        }
    }

    @Override // com.kubi.mvi.state.LazyBaseStateFragment, com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        super.onShow();
        if (this.f42282e0.isEmpty()) {
            showLoading();
        }
        sendIntent(new HoldingsCommonContract$UiIntent.FetchHoldingsData(m52525k4()));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", mo52436l4());
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B5Position", "Tab", "2", jSONObject);
    }

    /* JADX INFO: renamed from: q4 */
    public final void m52526q4() {
        C4676k c4676kM52524i4;
        C4654b0 c4654b0;
        if (mo52434Q4() && (c4676kM52524i4 = m52524i4()) != null && (c4654b0 = c4676kM52524i4.f4397k) != null) {
            c4654b0.f4232d.setText(getString(R$string.quote_holding_no_content));
            KcPrimaryButton kcPrimaryButton = c4654b0.f4231c;
            kcPrimaryButton.setText(getString(R$string.quote_holding_go_to_charge));
            Intrinsics.checkNotNull(kcPrimaryButton);
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.quotefacade.market.holdings.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldingsCommonFragment.m52498r4();
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 == null) {
            return;
        }
        c4676kM52524i4.f4391e.m53323f();
        c4676kM52524i4.f4391e.setVisibility(8);
        c4676kM52524i4.f4393g.setVisibility(8);
        c4676kM52524i4.f4397k.getRoot().setVisibility(8);
        c4676kM52524i4.f4396j.getRoot().setVisibility(0);
        c4676kM52524i4.f4390d.setVisibility(0);
        c4676kM52524i4.f4392f.setVisibility(0);
        c4676kM52524i4.f4388b.setVisibility(0);
        super.showContent();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        super.showContent();
        C4676k c4676kM52524i4 = m52524i4();
        if (c4676kM52524i4 == null) {
            return;
        }
        c4676kM52524i4.f4393g.setVisibility(8);
        c4676kM52524i4.f4397k.getRoot().setVisibility(8);
        c4676kM52524i4.f4388b.setVisibility(0);
        c4676kM52524i4.f4396j.getRoot().setVisibility(8);
        c4676kM52524i4.f4390d.setVisibility(8);
        c4676kM52524i4.f4392f.setVisibility(8);
        c4676kM52524i4.f4391e.m53322e();
        c4676kM52524i4.f4391e.setVisibility(0);
    }
}
