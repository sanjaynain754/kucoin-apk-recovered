package com.kubi.assets.overview.coin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.overview.detail.AssetCoinDetailFragment;
import com.kubi.assets.overview.detail.CoinDetailTracker;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p208dr.InterfaceC36952a;
import p569qq.C43846g;
import p637ta.C44859s1;
import p830zf.InterfaceC46795e0;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;
import y70.C46396e;

/* JADX INFO: compiled from: AssetCoinFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001@B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001f\u001a\u0004\u0018\u00010 J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0014J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0014J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020\u001eH\u0002J\b\u0010)\u001a\u00020$H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+H\u0002J!\u0010,\u001a\u0004\u0018\u00010\"*\b\u0012\u0004\u0012\u00020-0+2\u0006\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020$H\u0002J\b\u00101\u001a\u00020$H\u0016J\b\u00102\u001a\u00020$H\u0014J\u0010\u00103\u001a\u00020$2\u0006\u00104\u001a\u000205H\u0014J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020\u0010H\u0016J\b\u0010?\u001a\u00020$H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u00106\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000208078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006A"}, m90084d2 = {"Lcom/kubi/assets/overview/coin/AssetCoinFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/overview/coin/AssetCoinContract$UIState;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/overview/coin/AssetCoinAdapter;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "tipView", "Landroid/widget/TextView;", "isScrolling", "isUpdating", "pendingUpdates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindFlowEvent", "updateItem", "updatedData", "updateData", "processPendingUpdates", "", "findPositionBySymbolCode", "Lcom/kubi/assets/entity/AssetCoinEntity;", "symbolCode", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/Integer;", "handleItemClick", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "onRefresh", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nAssetCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinFragment.kt\ncom/kubi/assets/overview/coin/AssetCoinFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 10 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,279:1\n147#2,16:280\n135#3,2:296\n81#4,2:298\n216#5,2:300\n44#6,2:302\n360#7,7:304\n1#8:311\n17#9,2:312\n93#10,4:314\n*S KotlinDebug\n*F\n+ 1 AssetCoinFragment.kt\ncom/kubi/assets/overview/coin/AssetCoinFragment\n*L\n56#1:280,16\n109#1:296,2\n114#1:298,2\n161#1:300,2\n172#1:302,2\n181#1:304,7\n188#1:312,2\n257#1:314,4\n*E\n"})
public final class AssetCoinFragment extends SimpleStateFragment<UIState> implements AssetV2OverviewAdapter.InterfaceC10586a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: W */
    public boolean f18255W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f18256X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public TextView f18257Y;

    /* JADX INFO: renamed from: Z */
    public boolean f18258Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f18259a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f18252d0 = {Reflection.property1(new PropertyReference1Impl(AssetCoinFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetListBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f18251c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18253U = C45681e.m100799e(this, new Function1<AssetCoinFragment, C44859s1>() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44859s1 invoke(@NotNull AssetCoinFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44859s1.m99242a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44859s1, Unit>() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44859s1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44859s1 c44859s1) {
            invoke(c44859s1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final AssetCoinAdapter f18254V = new AssetCoinAdapter();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final ConcurrentHashMap<String, WsMarketSnapshotEntity> f18260b0 = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/overview/coin/AssetCoinFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/overview/coin/AssetCoinFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetCoinFragment newInstance() {
            return new AssetCoinFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$a */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/assets/overview/coin/AssetCoinFragment$initView$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10621a extends RecyclerView.OnScrollListener {
        public C10621a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            AssetCoinFragment.this.f18258Z = newState != 0;
            if (AssetCoinFragment.this.f18258Z || !AssetCoinFragment.this.isShowing() || AssetCoinFragment.this.f18260b0.isEmpty()) {
                return;
            }
            AssetCoinFragment.this.m18448G3();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Landroid/text/SpannableString;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$bindState$10", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1062310 extends SuspendLambda implements Function2<SpannableString, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpannableString spannableString, Continuation<? super Unit> continuation) {
            return ((C1062310) create(spannableString, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1062310(Continuation<? super C1062310> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1062310 c1062310 = AssetCoinFragment.this.new C1062310(continuation);
            c1062310.L$0 = obj;
            return c1062310;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            SpannableString spannableString = (SpannableString) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (spannableString != null && (textView = AssetCoinFragment.this.f18257Y) != null) {
                textView.setText(spannableString);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AssetCoinEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$bindState$2", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106242 extends SuspendLambda implements Function2<ArrayList<AssetCoinEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C106242(Continuation<? super C106242> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106242 c106242 = AssetCoinFragment.this.new C106242(continuation);
            c106242.L$0 = obj;
            return c106242;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AssetCoinEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C106242) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                AssetCoinFragment.this.sendIntent(new AssetCoinContract$UiIntent.ToggleSmallAssetsVisibility(C46396e.m102347d("asset", C10642g.f18281a.m18519a(), false)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AssetCoinEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$bindState$4", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106264 extends SuspendLambda implements Function2<ArrayList<AssetCoinEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C106264(Continuation<? super C106264> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106264 c106264 = AssetCoinFragment.this.new C106264(continuation);
            c106264.L$0 = obj;
            return c106264;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AssetCoinEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C106264) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            FrameLayout frameLayout;
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (arrayList != null) {
                AssetCoinFragment assetCoinFragment = AssetCoinFragment.this;
                C44859s1 c44859s1M18445B3 = assetCoinFragment.m18445B3();
                if (c44859s1M18445B3 != null && (frameLayout = c44859s1M18445B3.f100770d) != null) {
                    ViewExtKt.m66577h(frameLayout);
                }
                C44859s1 c44859s1M18445B4 = assetCoinFragment.m18445B3();
                if (c44859s1M18445B4 != null && (recyclerView = c44859s1M18445B4.f100772f) != null) {
                    ViewExtKt.m66594y(recyclerView);
                }
                WrapperLoadingView wrapperLoadingView = assetCoinFragment.f18256X;
                if (wrapperLoadingView != null) {
                    wrapperLoadingView.showContent();
                }
                assetCoinFragment.f18254V.replaceData(arrayList);
                OverviewAnalyticsReporter.f18247a.m18424w(arrayList.size());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$bindState$6", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinFragment.kt\ncom/kubi/assets/overview/coin/AssetCoinFragment$bindState$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
    public static final class C106286 extends SuspendLambda implements Function2<WsMarketSnapshotEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(WsMarketSnapshotEntity wsMarketSnapshotEntity, Continuation<? super Unit> continuation) {
            return ((C106286) create(wsMarketSnapshotEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C106286(Continuation<? super C106286> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106286 c106286 = AssetCoinFragment.this.new C106286(continuation);
            c106286.L$0 = obj;
            return c106286;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WsMarketSnapshotEntity wsMarketSnapshotEntity = (WsMarketSnapshotEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (wsMarketSnapshotEntity != null) {
                AssetCoinFragment.this.m18467I3(wsMarketSnapshotEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.coin.AssetCoinFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetCoinFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinFragment$bindState$8", m90122f = "AssetCoinFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106308 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C106308(Continuation<? super C106308> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106308 c106308 = AssetCoinFragment.this.new C106308(continuation);
            c106308.Z$0 = ((Boolean) obj).booleanValue();
            return c106308;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C106308) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinFragment.this.f18254V.m18443v(z11);
            AssetCoinFragment.this.f18254V.notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public final C44859s1 m18445B3() {
        return (C44859s1) this.f18253U.getValue(this, f18252d0[0]);
    }

    /* JADX INFO: renamed from: D3 */
    private final void m18446D3() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46795e0.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null ? ((InterfaceC46795e0) objM56186h).m103125a() : true) {
            this.f18254V.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.overview.coin.h
                @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
                    AssetCoinFragment.m18447E3(this.f18282a, baseQuickAdapter, view, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m18447E3(AssetCoinFragment assetCoinFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) throws JSONException {
        if (i11 >= 0) {
            boolean z11 = true;
            if (i11 > baseQuickAdapter.getData().size() - 1) {
                return;
            }
            List data = baseQuickAdapter.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            Object orNull = CollectionsKt.getOrNull(data, i11);
            AssetCoinEntity assetCoinEntity = orNull instanceof AssetCoinEntity ? (AssetCoinEntity) orNull : null;
            if (assetCoinEntity != null ? Intrinsics.areEqual(Boolean.TRUE, assetCoinEntity.getDelisted()) : false) {
                return;
            }
            String tokenAddress = assetCoinEntity != null ? assetCoinEntity.getTokenAddress() : null;
            if (tokenAddress != null && tokenAddress.length() != 0) {
                z11 = false;
            }
            if (z11) {
                Context context = assetCoinFragment.getContext();
                if (context != null) {
                    BaseActivity.Companion companion = BaseActivity.INSTANCE;
                    Bundle bundle = new Bundle();
                    bundle.putString("coin", C27041f.m66668h(assetCoinEntity != null ? assetCoinEntity.getCode() : null));
                    Unit unit = Unit.INSTANCE;
                    companion.launch(context, AssetCoinDetailFragment.class, bundle);
                }
            } else {
                KCFlutterRouteManager kCFlutterRouteManager = KCFlutterRouteManager.f46704a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("market/alphaKline?tokenBridgeId=");
                sb2.append(assetCoinEntity != null ? assetCoinEntity.getCode() : null);
                sb2.append("&subTab=holding");
                KCFlutterRouteManager.m56839j(kCFlutterRouteManager, sb2.toString(), false, null, 6, null);
            }
            CoinDetailTracker.f18371a.m18636d(C27041f.m66668h(assetCoinEntity != null ? assetCoinEntity.getCurrency() : null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public final void m18448G3() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.assets.overview.coin.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinFragment.m18449H3(this.f18283b);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m18449H3(AssetCoinFragment assetCoinFragment) {
        if (assetCoinFragment.f18259a0) {
            return Unit.INSTANCE;
        }
        if (assetCoinFragment.f18254V.getData().isEmpty()) {
            assetCoinFragment.f18260b0.clear();
            return Unit.INSTANCE;
        }
        MviExKt.m42519o(assetCoinFragment, new AssetCoinFragment$updateData$1$1(assetCoinFragment, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public final List<Integer> m18466F3() {
        Object objM103844constructorimpl;
        ArrayList arrayList = new ArrayList();
        try {
            Result.Companion companion = Result.INSTANCE;
            for (Map.Entry<String, WsMarketSnapshotEntity> entry : this.f18260b0.entrySet()) {
                String key = entry.getKey();
                WsMarketSnapshotEntity value = entry.getValue();
                List<AssetCoinEntity> data = this.f18254V.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                Integer numM18464A3 = m18464A3(data, key);
                if (numM18464A3 != null) {
                    int iIntValue = numM18464A3.intValue();
                    AssetCoinEntity assetCoinEntity = this.f18254V.getData().get(iIntValue);
                    assetCoinEntity.setLastTradedPrice(Double.valueOf(value.getLastTradedPrice()));
                    assetCoinEntity.setChangeRate(Double.valueOf(value.getChangeRate()));
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
            this.f18260b0.clear();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "processPendingUpdates", false, null, 8, null), null, 2, null);
        }
        return arrayList;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "event_hide_small_asset".length();
        }
        C12572a.m23692a(this, true, new AssetCoinFragment$bindFlowEvent$$inlined$bindFlowEvent$1("event_hide_small_asset", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            WrapperLoadingView wrapperLoadingView = this.f18256X;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            C44859s1 c44859s1M18445B3 = m18445B3();
            if (c44859s1M18445B3 == null || (recyclerView = c44859s1M18445B3.f100772f) == null) {
                return;
            }
            ViewExtKt.m66594y(recyclerView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18255W() {
        return this.f18255W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetCoinViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18255W = z11;
    }

    /* JADX INFO: renamed from: A3 */
    public final Integer m18464A3(List<AssetCoinEntity> list, String str) {
        Iterator<AssetCoinEntity> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (it.hasNext()) {
                AssetCoinEntity next = it.next();
                if (Intrinsics.areEqual(next.getCode() + '-' + next.getQuote(), str)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i11);
        if (numValueOf.intValue() != -1) {
            return numValueOf;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public final RecyclerView m18465C3() {
        C44859s1 c44859s1M18445B3;
        if (!isShowing() || (c44859s1M18445B3 = m18445B3()) == null) {
            return null;
        }
        return c44859s1M18445B3.f100772f;
    }

    /* JADX INFO: renamed from: I3 */
    public final void m18467I3(WsMarketSnapshotEntity wsMarketSnapshotEntity) {
        if (!isShowing()) {
            return;
        }
        if (!this.f18258Z && !this.f18259a0) {
            this.f18254V.m18444w(wsMarketSnapshotEntity);
        } else {
            this.f18260b0.put(wsMarketSnapshotEntity.getSymbolCode(), wsMarketSnapshotEntity);
        }
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (!isShowing()) {
            return;
        }
        this.f18254V.m18443v(z11);
        this.f18254V.notifyDataSetChanged();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment.bindState.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setData((ArrayList) obj2);
            }
        }, new C106242(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowList();
            }
        }, new C106264(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSpotWSEntity();
            }
        }, new C106286(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C106308(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.coin.AssetCoinFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowTip();
            }
        }, new C1062310(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        View view;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        super.initView();
        C44859s1 c44859s1M18445B3 = m18445B3();
        if (c44859s1M18445B3 != null) {
            view = c44859s1M18445B3.f100771e;
        } else {
            view = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(view);
        this.f18256X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        View viewInflate = View.inflate(getContext(), R$layout.view_empty, null);
        this.f18257Y = (TextView) viewInflate.findViewById(R$id.empty_tips);
        this.f18254V.setEmptyView(viewInflate);
        C44859s1 c44859s1M18445B4 = m18445B3();
        if (c44859s1M18445B4 != null && (recyclerView3 = c44859s1M18445B4.f100772f) != null) {
            recyclerView3.setAdapter(this.f18254V);
        }
        m18446D3();
        C44859s1 c44859s1M18445B5 = m18445B3();
        if (c44859s1M18445B5 != null && (recyclerView2 = c44859s1M18445B5.f100772f) != null) {
            recyclerView2.addOnScrollListener(new C10621a());
        }
        C44859s1 c44859s1M18445B6 = m18445B3();
        if (c44859s1M18445B6 != null && (recyclerView = c44859s1M18445B6.f100772f) != null) {
            recyclerView.setItemAnimator(null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        this.f18260b0.clear();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        if (isShowing()) {
            onShow();
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(AssetCoinContract$UiIntent.GetCoinList.INSTANCE);
        sendIntent(new AssetCoinContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
    }
}
