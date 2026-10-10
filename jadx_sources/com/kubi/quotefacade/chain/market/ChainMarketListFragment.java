package com.kubi.quotefacade.chain.market;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4670h;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.adapter.ChainFavItemListAdapter;
import com.kubi.quotefacade.chain.ChainContainerViewModel;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.event.ChainMarketListContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.ChainCoroutineScope;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import com.kubi.quotefacade.helper.ChainParamManager;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p212dv.C36962b;
import p212dv.C36963c;
import p212dv.C36964d;
import p241ev.C37266a;
import p402kf.C41016c;
import p414kv.C41985a;
import p569qq.C43840a;
import p569qq.C43841b;
import p778xy.C46338a;
import p809yu.C46574g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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

/* JADX INFO: compiled from: ChainMarketListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020\u001cH\u0014J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016J\u0012\u0010/\u001a\u00020(2\b\b\u0002\u00100\u001a\u00020\fH\u0002J\u0012\u00101\u001a\u00020(2\b\b\u0002\u00100\u001a\u00020\fH\u0002J\b\u00102\u001a\u00020(H\u0007J\b\u00103\u001a\u00020(H\u0002J\u0010\u00104\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0007J\u0010\u00107\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0014J\b\u00108\u001a\u00020(H\u0014J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020(H\u0002J\n\u0010;\u001a\u0004\u0018\u00010\u000fH\u0002J,\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020>0?2\u0006\u0010A\u001a\u00020\u001cH\u0002J\u0010\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020@H\u0007J\u001a\u0010D\u001a\u00020(2\b\u0010E\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020\u001cH\u0002J\u0010\u0010F\u001a\u00020(2\b\b\u0002\u00100\u001a\u00020\fJ\u0010\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020IH\u0007J\u0010\u0010J\u001a\u00020(2\u0006\u0010H\u001a\u00020IH\u0002J,\u0010K\u001a\u00020(2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020@0Mj\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020@`NH\u0007J,\u0010O\u001a\u00020(2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020@0Mj\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020@`NH\u0002J\b\u0010P\u001a\u00020(H\u0016J\u0010\u0010Q\u001a\u00020\f2\u0006\u0010H\u001a\u00020IH\u0002J\n\u0010R\u001a\u0004\u0018\u00010*H\u0002J\b\u0010W\u001a\u00020(H\u0002J\b\u0010X\u001a\u00020(H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020#0\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010U\u001a\u0004\u0018\u00010VX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Z"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketListFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/event/ChainMarketListContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentChainMarketListBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentChainMarketListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "scrolling", "", "bufferNotify", "popup", "Lcom/zyyoona7/popup/EasyPopup;", "viewModel", "Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "getViewModel", "()Lcom/kubi/quotefacade/chain/ChainContainerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/adapter/ChainFavItemListAdapter;", "adapter$delegate", "mPageSize", "", "firstVisiblePosition", "lastVisiblePosition", "getTabCode", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "refreshData", "isLocalSort", "fetchChainListData", "fetchChainRepeatListDataTest", "fetchChainRepeatListData", "dispatchSingleEventTest", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "dispatchSingleEvent", "bindState", "initRecyclerView", "handleItemClick", "pop", "initPopView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", ViewProps.POSITION, "handleFavoriteTest", "chainItemEntity", "handleFavorite", "item", "forceRefreshUI", "updateListUITest", "chainListEntity", "Lcom/kubi/quotefacade/entity/ChainListEntity;", "updateListUI", "updateListRepeatUITest", "newDataMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "updateListRepeatUI", "showContent", "isLoadMore", "getEndFooterView", "chainScope", "Lcom/kubi/quotefacade/helper/ChainCoroutineScope;", "repeatJob", "Lkotlinx/coroutines/Job;", "startLoopFetchData", "resetRepeatJob", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChainMarketListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChainMarketListFragment.kt\ncom/kubi/quotefacade/chain/market/ChainMarketListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,584:1\n147#2,16:585\n1#3:601\n1869#4,2:602\n1563#4:604\n1634#4,3:605\n45#5,7:608\n45#5,7:615\n*S KotlinDebug\n*F\n+ 1 ChainMarketListFragment.kt\ncom/kubi/quotefacade/chain/market/ChainMarketListFragment\n*L\n78#1:585,16\n519#1:602,2\n196#1:604\n196#1:605,3\n338#1:608,7\n581#1:615,7\n*E\n"})
public final class ChainMarketListFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: V */
    public boolean f41560V;

    /* JADX INFO: renamed from: W */
    public boolean f41561W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public C43724b f41562X;

    /* JADX INFO: renamed from: b0 */
    public int f41566b0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public InterfaceC41775x1 f41569e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f41558g0 = {Reflection.property1(new PropertyReference1Impl(ChainMarketListFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentChainMarketListBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f41557f0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41559U = C45681e.m100799e(this, new Function1<ChainMarketListFragment, C4670h>() { // from class: com.kubi.quotefacade.chain.market.ChainMarketListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4670h invoke(@NotNull ChainMarketListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4670h.m4652a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4670h, Unit>() { // from class: com.kubi.quotefacade.chain.market.ChainMarketListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4670h it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4670h c4670h) {
            invoke(c4670h);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41563Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.chain.market.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChainMarketListFragment.m50895C4(this.f41588b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f41564Z = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.chain.market.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChainMarketListFragment.m50909Q3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    public final int f41565a0 = 15;

    /* JADX INFO: renamed from: c0 */
    public int f41567c0 = 15;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final ChainCoroutineScope f41568d0 = new ChainCoroutineScope(C42911a.m94120b());

    /* JADX INFO: compiled from: ChainMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/chain/market/ChainMarketListFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/quotefacade/chain/market/ChainMarketListFragment;", "tabName", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final ChainMarketListFragment newInstance(@NotNull String tabName) {
            Intrinsics.checkNotNullParameter(tabName, "tabName");
            ChainMarketListFragment chainMarketListFragment = new ChainMarketListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("data", tabName);
            chainMarketListFragment.setArguments(bundle);
            return chainMarketListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketListFragment$a */
    /* JADX INFO: compiled from: ChainMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/chain/market/ChainMarketListFragment$initRecyclerView$1$4", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21789a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SwipeRefreshRecyclerView f41571b;

        public C21789a(SwipeRefreshRecyclerView swipeRefreshRecyclerView) {
            this.f41571b = swipeRefreshRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        @SuppressLint({"NotifyDataSetChanged"})
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            C43724b c43724bM50938s4;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            C44128b.m97266j(ChainMarketListFragment.this.getTAG(), "onScrollStateChanged=" + newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            ChainMarketListFragment chainMarketListFragment = ChainMarketListFragment.this;
            chainMarketListFragment.f41566b0 = linearLayoutManager.findFirstVisibleItemPosition();
            chainMarketListFragment.f41567c0 = linearLayoutManager.findLastVisibleItemPosition();
            ChainMarketListFragment.this.f41560V = newState != 0;
            if (newState == 0) {
                C46338a.m102151a(this.f41571b.getContext()).m6638z();
            } else if (newState == 1 || newState == 2) {
                C46338a.m102151a(this.f41571b.getContext()).m6637y();
            }
            if (!ChainMarketListFragment.this.f41560V && ChainMarketListFragment.this.f41561W) {
                C44128b.m97266j(ChainMarketListFragment.this.getTAG(), "onScrollStateChanged not scrolling and notifyDataSetChanged");
                ChainMarketListFragment.this.m50913X3().notifyDataSetChanged();
                ChainMarketListFragment.this.f41561W = false;
            }
            C43724b c43724bM50938s5 = ChainMarketListFragment.this.m50938s4();
            if (c43724bM50938s5 == null || !c43724bM50938s5.m96299I() || (c43724bM50938s4 = ChainMarketListFragment.this.m50938s4()) == null) {
                return;
            }
            c43724bM50938s4.m96331y();
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketListFragment$bindState$2 */
    /* JADX INFO: compiled from: ChainMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListFragment$bindState$2", m90122f = "ChainMarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217912 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C217912(Continuation<? super C217912> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217912 c217912 = ChainMarketListFragment.this.new C217912(continuation);
            c217912.L$0 = obj;
            return c217912;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C217912) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer currentPage;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView;
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4670h c4670hM50955Y3 = ChainMarketListFragment.this.m50955Y3();
            if (c4670hM50955Y3 != null && (swipeRefreshRecyclerView = c4670hM50955Y3.f4353d) != null) {
                swipeRefreshRecyclerView.setRefreshing(false);
            }
            if (obj2 != null) {
                if (ChainMarketListFragment.this.m50913X3().getData().isEmpty() || ((currentPage = ChainParamManager.f42002a.m51963b().getCurrentPage()) != null && currentPage.intValue() == 1)) {
                    ChainMarketListFragment.this.showEmpty();
                } else {
                    ToastCompat.m66441G(ChainMarketListFragment.this.getString(R$string.common_text_network_error), new Object[0]);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketListFragment$bindState$4 */
    /* JADX INFO: compiled from: ChainMarketListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListFragment$bindState$4", m90122f = "ChainMarketListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C217934 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: f */
        public static final void m50962f(ChainMarketListFragment chainMarketListFragment, View view) {
            ChainMarketListFragment.m50943v4(chainMarketListFragment, false, 1, null);
        }

        public C217934(Continuation<? super C217934> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C217934 c217934 = ChainMarketListFragment.this.new C217934(continuation);
            c217934.L$0 = obj;
            return c217934;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C217934) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer currentPage;
            SwipeRefreshRecyclerView swipeRefreshRecyclerView;
            Object obj2 = this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C4670h c4670hM50955Y3 = ChainMarketListFragment.this.m50955Y3();
            if (c4670hM50955Y3 != null && (swipeRefreshRecyclerView = c4670hM50955Y3.f4353d) != null) {
                swipeRefreshRecyclerView.setRefreshing(false);
            }
            if (obj2 != null) {
                if (ChainMarketListFragment.this.m50913X3().getData().isEmpty() || ((currentPage = ChainParamManager.f42002a.m51963b().getCurrentPage()) != null && currentPage.intValue() == 1)) {
                    final ChainMarketListFragment chainMarketListFragment = ChainMarketListFragment.this;
                    BaseFragment.showFailView$default(chainMarketListFragment, 0, 0, new View.OnClickListener() { // from class: com.kubi.quotefacade.chain.market.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ChainMarketListFragment.C217934.m50962f(chainMarketListFragment, view);
                        }
                    }, 3, (Object) null);
                } else {
                    ToastCompat.m66441G(ChainMarketListFragment.this.getString(R$string.common_text_network_error), new Object[0]);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m50929n4(ChainMarketListFragment chainMarketListFragment) {
        m50910S3(chainMarketListFragment, false, 1, null);
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m50936r4(ChainMarketListFragment chainMarketListFragment) {
        m50943v4(chainMarketListFragment, false, 1, null);
        chainMarketListFragment.m50960y4();
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m50957q4(ChainListEntity chainListEntity) {
        List<ChainItemEntity> items;
        if ((chainListEntity != null || chainListEntity.getCurrentPage() != null || chainListEntity.getTotalPage() != null) && chainListEntity.getCurrentPage() != null && chainListEntity.getTotalPage() != null && (items = chainListEntity.getItems()) != null && !items.isEmpty()) {
            Integer currentPage = chainListEntity.getCurrentPage();
            Intrinsics.checkNotNull(currentPage);
            int iIntValue = currentPage.intValue();
            Integer totalPage = chainListEntity.getTotalPage();
            Intrinsics.checkNotNull(totalPage);
            if (iIntValue < totalPage.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C4 */
    public static final ChainContainerViewModel m50895C4(ChainMarketListFragment chainMarketListFragment) {
        return (ChainContainerViewModel) new ViewModelProvider(chainMarketListFragment).get(ChainContainerViewModel.class);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final ChainFavItemListAdapter m50909Q3() {
        return new ChainFavItemListAdapter(ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType(), "market");
    }

    /* JADX INFO: renamed from: S3 */
    public static /* synthetic */ void m50910S3(ChainMarketListFragment chainMarketListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        chainMarketListFragment.m50952R3(z11);
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m50912W3(ChainMarketListFragment chainMarketListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        chainMarketListFragment.m50954V3(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public final ChainFavItemListAdapter m50913X3() {
        return (ChainFavItemListAdapter) this.f41564Z.getValue();
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m50918e4(ChainMarketListFragment chainMarketListFragment, ChainItemEntity chainItemEntity, int i11, View view) throws JSONException {
        BQuoteFacadeDepend bQuoteFacadeDepend = BQuoteFacadeDepend.f42592a;
        if (bQuoteFacadeDepend.m53025e().c()) {
            chainMarketListFragment.sendIntent(new ChainMarketListContract$UIIntent.CollectOrCancelChain(chainItemEntity, i11));
        } else if (TextUtils.isEmpty(bQuoteFacadeDepend.m53025e().d()) || !com.kubi.user.config.a.b()) {
            chainMarketListFragment.m50956a4(chainItemEntity, i11);
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.quotefacade.chain.market.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChainMarketListFragment.m50919f4();
                }
            }), 1, (Object) null);
        }
        C43724b c43724bM50938s4 = chainMarketListFragment.m50938s4();
        if (c43724bM50938s4 != null) {
            c43724bM50938s4.m96331y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final Unit m50919f4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m50921h4(ChainMarketListFragment chainMarketListFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m50943v4(chainMarketListFragment, false, 1, null);
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m50931o4(final ChainMarketListFragment chainMarketListFragment, final InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        m50943v4(chainMarketListFragment, false, 1, null);
        BaseFragment.runOnUiThread$default(chainMarketListFragment, new Function0() { // from class: com.kubi.quotefacade.chain.market.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketListFragment.m50933p4(this.f41617b, it);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m50943v4(ChainMarketListFragment chainMarketListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        chainMarketListFragment.m50958u4(z11);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m50946x4(ChainMarketListFragment chainMarketListFragment) {
        try {
            chainMarketListFragment.f41568d0.close();
            InterfaceC41775x1 interfaceC41775x1 = chainMarketListFragment.f41569e0;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            chainMarketListFragment.f41569e0 = null;
        } catch (Exception e11) {
            C37266a.m83411b(e11, "ChainMarketListFragment");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A4 */
    public final void m50950A4(HashMap<String, ChainItemEntity> map) {
        if (this.f41560V) {
            this.f41561W = true;
            C44128b.m97266j(getTAG(), "updateListRepeatUI,but is scrolling!!!");
            return;
        }
        int iMin = Math.min(this.f41566b0 + this.f41565a0, m50913X3().getData().size());
        C44128b.m97266j(getTAG(), this.f41566b0 + "----------------> " + iMin);
        if (this.f41566b0 >= iMin) {
            C43840a.m96550d(this.f41566b0 + ">=" + iMin + ",when updateListRepeatUI", getTAG());
            return;
        }
        for (ChainItemEntity chainItemEntity : m50913X3().getData().subList(this.f41566b0, iMin)) {
            ChainItemEntity chainItemEntity2 = map.get(chainItemEntity.getToken());
            if (chainItemEntity2 != null) {
                C44128b.m97266j(getTAG(), "newData=" + chainItemEntity2.getSymbol() + "---> " + chainItemEntity.getSymbol());
                Intrinsics.checkNotNull(chainItemEntity);
                C41985a.m92061b(chainItemEntity, chainItemEntity2);
            }
        }
        C44128b.m97266j(getTAG(), "updateListRepeatUI => " + this.f41566b0 + ' ' + m50913X3().getData().get(this.f41566b0).getSymbol() + "  --> " + iMin + ' ' + m50913X3().getData().get(iMin - 1).getSymbol());
        m50913X3().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T3 */
    public final void m50953T3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketListFragment.m50911U3(this.f41624b);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final C4670h m50955Y3() {
        return (C4670h) this.f41559U.getValue(this, f41558g0[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX INFO: renamed from: a4 */
    public final void m50956a4(ChainItemEntity chainItemEntity, int i11) throws JSONException {
        int i12;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", chainItemEntity != null ? chainItemEntity.getSymbol() : null);
        jSONObject.put("contentType", chainItemEntity != null ? chainItemEntity.getToken() : null);
        if (chainItemEntity != null) {
            i12 = !C46574g.m102732b(chainItemEntity, chainItemEntity) ? 0 : 1;
        }
        jSONObject.put("return", i12);
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B8LineCoins", "Favorites", "1", jSONObject);
        if (chainItemEntity != null) {
            ToastCompat.m66441G(this.mContext.getString(C46574g.m102732b(chainItemEntity, chainItemEntity) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
            ChainFavCacheManager.f41922a.m51773g(chainItemEntity);
        }
        m50913X3().notifyItemChanged(i11);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) throws JSONException {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (isDetached() || getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            if (singleEvent instanceof C36963c) {
                if (getView() == null) {
                    return;
                }
                m50951B4(((C36963c) singleEvent).getF82079a());
                if (Intrinsics.areEqual(TtmlNode.COMBINE_ALL, m50914Z3())) {
                    C43841b.m96557d("B5markets_krazy_degen_render", "page_load_end", null, 4, null);
                    return;
                }
                return;
            }
            if (singleEvent instanceof C36964d) {
                if (getView() == null) {
                    return;
                }
                HashMap<String, ChainItemEntity> mapM82782a = ((C36964d) singleEvent).m82782a();
                if (mapM82782a.isEmpty() || mapM82782a.size() > m50913X3().getData().size()) {
                    C44128b.m97266j(getTAG(), "ChainRepeatListDataEvent error!!!");
                    return;
                } else {
                    m50950A4(mapM82782a);
                    return;
                }
            }
            if (singleEvent instanceof C36962b) {
                C36962b c36962b = (C36962b) singleEvent;
                ChainItemEntity f82077a = c36962b.getF82077a();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("symbol", f82077a.getSymbol());
                jSONObject.put("contentType", f82077a.getToken());
                jSONObject.put("return", C46574g.m102732b(f82077a, f82077a) ? 1 : 0);
                Unit unit = Unit.INSTANCE;
                C27023a.m66554a("B8LineCoins", "Favorites", "1", jSONObject);
                ToastCompat.m66441G(this.mContext.getString(!C46574g.m102732b(f82077a, f82077a) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
                m50913X3().notifyItemChanged(c36962b.getF82078b());
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_chain_market_list;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(ChainMarketListViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50920g4();
    }

    /* JADX INFO: renamed from: u4 */
    public final void m50958u4(boolean z11) {
        ChainParamManager chainParamManager = ChainParamManager.f42002a;
        chainParamManager.m51963b().setMenuCode(m50914Z3());
        chainParamManager.m51963b().setCurrentPage(1);
        m50913X3().m50187n(chainParamManager.m51962a().getChainSortType());
        m50952R3(z11);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m50959w4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketListFragment.m50946x4(this.f41598b);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public final void m50960y4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.chain.market.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChainMarketListFragment.m50949z4(this.f41622b);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m50911U3(ChainMarketListFragment chainMarketListFragment) {
        List<ChainItemEntity> data = chainMarketListFragment.m50913X3().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        int iMin = Math.min(chainMarketListFragment.f41567c0, data.size());
        List<ChainItemEntity> listSubList = data.subList(chainMarketListFragment.f41566b0, iMin);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        for (ChainItemEntity chainItemEntity : listSubList) {
            arrayList.add(chainItemEntity.getToken() + '-' + chainItemEntity.getChain());
        }
        C44128b.m97266j(chainMarketListFragment.getTAG(), "firstVisiblePosition=" + chainMarketListFragment.f41566b0 + " lastVisiblePositionMin=" + iMin + " ==> fetchChainRepeatListData=>" + arrayList);
        if (arrayList.isEmpty()) {
            C44128b.m97266j(chainMarketListFragment.getTAG(), "fetchChainRepeatListData no data no need Repeat!");
            return Unit.INSTANCE;
        }
        chainMarketListFragment.sendIntent(new ChainMarketListContract$UIIntent.FetchChainRepeatListData(arrayList, ChainParamManager.f42002a.m51963b().getOrderByRange()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    private final String m50914Z3() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("data", "");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: b4 */
    private final void m50915b4() {
        m50913X3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.chain.market.w
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                ChainMarketListFragment.m50916c4(this.f41623a, baseQuickAdapter, view, i11);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m50916c4(ChainMarketListFragment chainMarketListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        String kcChain;
        String token;
        if (!C27014a1.m66501a(view) && i11 >= 0 && i11 <= chainMarketListFragment.m50913X3().getData().size() - 1) {
            ChainItemEntity chainItemEntity = chainMarketListFragment.m50913X3().getData().get(i11);
            if (chainItemEntity != null && (kcChain = chainItemEntity.getKcChain()) != null && (token = chainItemEntity.getToken()) != null) {
                String strValueOf = String.valueOf(i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("symbol", chainItemEntity.getSymbol());
                jSONObject.put(InterfaceC33826o0.f71244p, chainItemEntity.getToken());
                jSONObject.put("contentType", chainMarketListFragment.m50914Z3());
                Unit unit = Unit.INSTANCE;
                C27023a.m66554a("B8LineCoins", "Coin", strValueOf, jSONObject);
                QuoteExKt.m51859j(token, kcChain, 0L, 4, null);
                return;
            }
            return;
        }
        C44128b.m97266j(chainMarketListFragment.getTAG(), "position: " + i11 + "，size: " + chainMarketListFragment.m50913X3().getData().size());
    }

    /* JADX INFO: renamed from: d4 */
    private final void m50917d4(BaseViewHolder baseViewHolder, BaseQuickAdapter<ChainItemEntity, BaseViewHolder> baseQuickAdapter, final int i11) {
        int i12;
        final ChainItemEntity item = baseQuickAdapter.getItem(i11);
        baseViewHolder.setGone(R$id.llPin, false).setGone(R$id.llReminder, false);
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivFavor);
        if (item != null && C46574g.m102732b(item, item)) {
            i12 = R$mipmap.ic_favor;
        } else {
            i12 = R$drawable.ic_unfav_white;
        }
        imageView.setImageResource(i12);
        baseViewHolder.setOnClickListener(R$id.llFavor, new View.OnClickListener() { // from class: com.kubi.quotefacade.chain.market.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                ChainMarketListFragment.m50918e4(this.f41619b, item, i11, view);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    private final void m50920g4() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        RecyclerView.ItemAnimator itemAnimator;
        C4670h c4670hM50955Y3 = m50955Y3();
        if (c4670hM50955Y3 != null && (swipeRefreshRecyclerView = c4670hM50955Y3.f4353d) != null) {
            RecyclerView recyclerView = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
            }
            if (m50913X3().m50185l()) {
                m50913X3().bindToRecyclerView(swipeRefreshRecyclerView.getRecyclerView());
            }
            RecyclerView recyclerView2 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView2 != null && (itemAnimator = recyclerView2.getItemAnimator()) != null) {
                itemAnimator.setChangeDuration(0L);
            }
            RecyclerView recyclerView3 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView3 != null) {
                recyclerView3.setHasFixedSize(true);
            }
            m50913X3().setLoadMoreView(new C23057g1());
            m50913X3().setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.quotefacade.chain.market.p
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
                public final void onLoadMoreRequested() {
                    ChainMarketListFragment.m50929n4(this.f41597a);
                }
            }, swipeRefreshRecyclerView.getRecyclerView());
            swipeRefreshRecyclerView.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.chain.market.z
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    ChainMarketListFragment.m50921h4(this.f41625b, interfaceC38162f);
                }
            });
            m50913X3().setPreLoadNumber(2);
            m50913X3().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.chain.market.a0
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
                public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                    return ChainMarketListFragment.m50922i4(this.f41578a, baseQuickAdapter, view, i11);
                }
            });
            RecyclerView recyclerView4 = swipeRefreshRecyclerView.getRecyclerView();
            if (recyclerView4 != null) {
                recyclerView4.addOnScrollListener(new C21789a(swipeRefreshRecyclerView));
            }
            m50915b4();
            Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.chain.market.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChainMarketListFragment.m50923j4(this.f41581b, (Boolean) obj);
                }
            };
            Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.chain.market.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChainMarketListFragment.m50924k4(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.chain.market.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChainMarketListFragment.m50925l4((Throwable) obj);
                }
            };
            addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.chain.market.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ChainMarketListFragment.m50927m4(function2, obj);
                }
            }));
        }
        C4670h c4670hM50955Y4 = m50955Y3();
        if (c4670hM50955Y4 != null && (kuCoinRefreshLayout = c4670hM50955Y4.f4354e) != null) {
            kuCoinRefreshLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.chain.market.f0
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    ChainMarketListFragment.m50931o4(this.f41585b, interfaceC38162f);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i4 */
    public static final boolean m50922i4(ChainMarketListFragment chainMarketListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (chainMarketListFragment.getView() != null && chainMarketListFragment.isShowing()) {
            C43724b c43724bM50938s4 = chainMarketListFragment.m50938s4();
            if (c43724bM50938s4 != null) {
                chainMarketListFragment.m50917d4(new BaseViewHolder(c43724bM50938s4.m96292A()), chainMarketListFragment.m50913X3(), i11);
                c43724bM50938s4.m96320e0(view, 1, 0, 0, 0);
            }
            chainMarketListFragment.m50913X3().m50186m(i11);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m50923j4(ChainMarketListFragment chainMarketListFragment, Boolean bool) {
        chainMarketListFragment.m50913X3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m50924k4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m50925l4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "CurrencyChangedObs");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m50927m4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m50933p4(ChainMarketListFragment chainMarketListFragment, InterfaceC38162f interfaceC38162f) {
        if (chainMarketListFragment.getView() != null) {
            interfaceC38162f.finishRefresh();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public final C43724b m50938s4() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (this.f41562X == null) {
            this.f41562X = new BubbleEasyPopup(context).m96307Q(R$layout.popwindow_layout_favriote_action).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.chain.market.g0
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ChainMarketListFragment.m50940t4(this.f41586b);
                }
            }).m96316Z(true).m96322p();
        }
        return this.f41562X;
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m50940t4(ChainMarketListFragment chainMarketListFragment) {
        chainMarketListFragment.m50913X3().m50186m(-1);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m50949z4(ChainMarketListFragment chainMarketListFragment) {
        C44128b.m97266j(chainMarketListFragment.getTAG(), "startLoopLoadData " + chainMarketListFragment);
        chainMarketListFragment.m50959w4();
        C41696j.m91104d(chainMarketListFragment.f41568d0, null, null, new ChainMarketListFragment$startLoopFetchData$1$1(chainMarketListFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public final void m50951B4(ChainListEntity chainListEntity) {
        Integer numValueOf;
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        if (!isShowing()) {
            return;
        }
        m50913X3().setEnableLoadMore(m50957q4(chainListEntity));
        Integer currentPage = chainListEntity.getCurrentPage();
        boolean z11 = true;
        if (currentPage != null && currentPage.intValue() == 1) {
            List<ChainItemEntity> items = chainListEntity.getItems();
            if (items != null) {
                m50913X3().replaceData(items);
            }
            C4670h c4670hM50955Y3 = m50955Y3();
            if (c4670hM50955Y3 != null && (swipeRefreshRecyclerView = c4670hM50955Y3.f4353d) != null) {
                swipeRefreshRecyclerView.setRefreshing(false);
            }
        } else {
            List<ChainItemEntity> items2 = chainListEntity.getItems();
            if (items2 != null) {
                m50913X3().addData((Collection) items2);
            }
        }
        ChainParamManager chainParamManager = ChainParamManager.f42002a;
        ChainListParam chainListParamM51963b = chainParamManager.m51963b();
        Integer currentPage2 = chainListEntity.getCurrentPage();
        if (currentPage2 != null) {
            numValueOf = Integer.valueOf(currentPage2.intValue() + 1);
        } else {
            numValueOf = null;
        }
        chainListParamM51963b.setCurrentPage(numValueOf);
        C44128b.m97266j(getTAG(), "currentPage==>" + chainParamManager.m51963b().getCurrentPage() + ", size=" + m50913X3().getData().size());
        if (m50913X3().getData().size() < this.f41565a0) {
            ChainFavItemListAdapter chainFavItemListAdapterM50913X3 = m50913X3();
            Integer currentPage3 = chainListEntity.getCurrentPage();
            if (currentPage3 == null || currentPage3.intValue() != 1) {
                z11 = false;
            }
            chainFavItemListAdapterM50913X3.loadMoreEnd(z11);
            if (m50913X3().getData().isEmpty()) {
                C44128b.m97266j(getTAG(), "showEmpty");
                showEmpty();
                this.f41567c0 = 0;
                return;
            } else {
                showContent();
                C44128b.m97266j(getTAG(), "showContent one");
                this.f41567c0 = m50913X3().getData().size();
                return;
            }
        }
        m50913X3().loadMoreComplete();
        showContent();
        C44128b.m97266j(getTAG(), "showContent more");
    }

    /* JADX INFO: renamed from: R3 */
    public final void m50952R3(boolean z11) {
        String tag = getTAG();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fetchChainListData=>");
        ChainParamManager chainParamManager = ChainParamManager.f42002a;
        sb2.append(chainParamManager.m51963b());
        C44128b.m97266j(tag, sb2.toString());
        sendIntent(new ChainMarketListContract$UIIntent.FetchChainListData(ChainListParam.copy$default(chainParamManager.m51963b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null), z11));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m50954V3(boolean z11) {
        C44128b.m97266j(getTAG(), "forceTimeRefresh isShowing = " + isShowing());
        if (isShowing()) {
            m50958u4(z11);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.chain.market.ChainMarketListFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getEmpty();
            }
        }, new C217912(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.quotefacade.chain.market.ChainMarketListFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getError();
            }
        }, new C217934(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        C43724b c43724bM50938s4;
        super.onHide();
        ChainParamManager.f42002a.m51963b().setCurrentPage(1);
        m50959w4();
        C43724b c43724bM50938s5 = m50938s4();
        if (c43724bM50938s5 != null && c43724bM50938s5.m96299I() && (c43724bM50938s4 = m50938s4()) != null) {
            c43724bM50938s4.m96331y();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws JSONException {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        super.onShow();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", m50914Z3());
        Unit unit = Unit.INSTANCE;
        C27023a.m66556c("B8LineCoins", "Chain", "1", jSONObject);
        if (m50913X3().getData().isEmpty()) {
            this.f41567c0 = 15;
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            m50943v4(this, false, 1, null);
            m50960y4();
        } else {
            C4670h c4670hM50955Y3 = m50955Y3();
            if (c4670hM50955Y3 != null && (swipeRefreshRecyclerView = c4670hM50955Y3.f4353d) != null) {
                swipeRefreshRecyclerView.postDelayed(new Runnable() { // from class: com.kubi.quotefacade.chain.market.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChainMarketListFragment.m50936r4(this.f41599b);
                    }
                }, 400L);
            }
        }
        if (Intrinsics.areEqual(TtmlNode.COMBINE_ALL, m50914Z3())) {
            C43841b.m96557d("B5markets_krazy_degen_render", "page_load_start", null, 4, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        m50913X3().removeAllFooterView();
    }
}
