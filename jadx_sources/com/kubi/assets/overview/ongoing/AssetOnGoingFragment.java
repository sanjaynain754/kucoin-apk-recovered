package com.kubi.assets.overview.ongoing;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.FundsInfo;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.overview.OverviewAnalyticsReporter;
import com.kubi.assets.overview.ongoing.mapper.ProductItem;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.host.HostManager;
import com.kubi.margin.api.IMarginService;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24271s1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27014a1;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p208dr.InterfaceC36952a;
import p569qq.C43846g;
import p569qq.C43852m;
import p637ta.C44887w1;
import p852kotlin.Metadata;
import p852kotlin.Result;
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
import p852kotlin.jvm.internal.MutablePropertyReference1Impl;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetOnGoingFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J.\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0012\u0010(\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020%H\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u001cH\u0016J\b\u00101\u001a\u00020\u001cH\u0014J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0014J%\u00105\u001a\u00020\u001c2\n\b\u0002\u0010*\u001a\u0004\u0018\u0001062\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u00107J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u0010H\u0016J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u0010H\u0016J\b\u0010A\u001a\u00020\u001cH\u0016J\u000e\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020:098TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006F"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "mAdapter", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;", "binding", "Lcom/kubi/assets/databinding/AssetOngoingListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetOngoingListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "currentHeaderItem", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;", "getLayout", "", "initView", "", "configureRecycledViewPool", "initHeaderSelectionUI", "updateFloatingTitle", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "floatingTitleTextView", "Landroid/widget/TextView;", "floatingTitleLayout", "Landroid/view/View;", "ivArrow", "Landroid/widget/ImageView;", "handleExpandedUI", "handleHeaderView", "productItem", "handleItemClick", ViewProps.POSITION, TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleLoadMoreItem", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "jumpRobotUrl", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;", "(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;Ljava/lang/Integer;)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "onRefresh", "autoClickItemAtPosition", JAnalysisConstants.Account.KEY_ACCOUNT, "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nAssetOnGoingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AssetEx.kt\ncom/kubi/assets/AssetExKt\n+ 5 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,439:1\n147#2,16:440\n1869#3,2:456\n51#4,3:458\n44#5,2:461\n135#6,2:463\n93#7,4:465\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment\n*L\n59#1:440,16\n104#1:456,2\n262#1:458,3\n283#1:461,2\n320#1:463,2\n363#1:465,4\n*E\n"})
public final class AssetOnGoingFragment extends SimpleStateFragment<UIState> implements AssetV2OverviewAdapter.InterfaceC10586a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @Nullable
    public AssetOnGoingAdapter f18405U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f18406V = C45681e.m100799e(this, new Function1<AssetOnGoingFragment, C44887w1>() { // from class: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44887w1 invoke(@NotNull AssetOnGoingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44887w1.m99298a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44887w1, Unit>() { // from class: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44887w1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44887w1 c44887w1) {
            invoke(c44887w1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    public boolean f18407W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f18408X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public ProductItem.HeaderItem f18409Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f18404a0 = {Reflection.property1(new PropertyReference1Impl(AssetOnGoingFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetOngoingListBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f18403Z = new Companion(null);

    /* JADX INFO: compiled from: AssetOnGoingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;", "", "<init>", "()V", "EVENT_FINANCE_QUERY_CURRENCY", "", "EVENT_PWM_FINANCE_QUERY_CURRENCY", "newInstance", "Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetOnGoingFragment newInstance() {
            return new AssetOnGoingFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$a */
    /* JADX INFO: compiled from: AssetOnGoingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/assets/overview/ongoing/AssetOnGoingFragment$initHeaderSelectionUI$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10744a extends RecyclerView.OnScrollListener {
        public C10744a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int dx2, int dy2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx2, dy2);
            AssetOnGoingFragment assetOnGoingFragment = AssetOnGoingFragment.this;
            C44887w1 c44887w1M18695v3 = assetOnGoingFragment.m18695v3();
            BaseTextView baseTextView = c44887w1M18695v3 != null ? c44887w1M18695v3.f101045h : null;
            C44887w1 c44887w1M18695v4 = AssetOnGoingFragment.this.m18695v3();
            RelativeLayout relativeLayout = c44887w1M18695v4 != null ? c44887w1M18695v4.f101039b : null;
            C44887w1 c44887w1M18695v5 = AssetOnGoingFragment.this.m18695v3();
            assetOnGoingFragment.m18692F3(recyclerView, baseTextView, relativeLayout, c44887w1M18695v5 != null ? c44887w1M18695v5.f101040c : null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetOnGoingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$2", m90122f = "AssetOnGoingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C107462 extends SuspendLambda implements Function2<List<ProductItem>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C107462(Continuation<? super C107462> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C107462 c107462 = AssetOnGoingFragment.this.new C107462(continuation);
            c107462.L$0 = obj;
            return c107462;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<ProductItem> list, Continuation<? super Unit> continuation) {
            return ((C107462) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            OnGoingRecommendView onGoingRecommendView;
            RelativeLayout relativeLayout;
            RecyclerView recyclerView2;
            RelativeLayout relativeLayout2;
            RecyclerView recyclerView3;
            OnGoingRecommendView onGoingRecommendView2;
            RecyclerView recyclerView4;
            List<ProductItem> list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z11 = false;
            if (list != null) {
                final AssetOnGoingFragment assetOnGoingFragment = AssetOnGoingFragment.this;
                C44887w1 c44887w1M18695v3 = assetOnGoingFragment.m18695v3();
                if (c44887w1M18695v3 != null && (recyclerView3 = c44887w1M18695v3.f101044g) != null && !ViewExtKt.m66581l(recyclerView3)) {
                    WrapperLoadingView wrapperLoadingView = assetOnGoingFragment.f18408X;
                    if (wrapperLoadingView != null) {
                        wrapperLoadingView.showContent();
                    }
                    C44887w1 c44887w1M18695v4 = assetOnGoingFragment.m18695v3();
                    if (c44887w1M18695v4 != null && (recyclerView4 = c44887w1M18695v4.f101044g) != null) {
                        ViewExtKt.m66594y(recyclerView4);
                    }
                    C44887w1 c44887w1M18695v5 = assetOnGoingFragment.m18695v3();
                    if (c44887w1M18695v5 != null && (onGoingRecommendView2 = c44887w1M18695v5.f101043f) != null) {
                        ViewExtKt.m66577h(onGoingRecommendView2);
                    }
                }
                AssetOnGoingAdapter assetOnGoingAdapter = assetOnGoingFragment.f18405U;
                if (assetOnGoingAdapter != null) {
                    assetOnGoingAdapter.m18679S(list);
                }
                C44887w1 c44887w1M18695v6 = assetOnGoingFragment.m18695v3();
                if ((c44887w1M18695v6 == null || (relativeLayout2 = c44887w1M18695v6.f101039b) == null) ? false : Intrinsics.areEqual(relativeLayout2.getTag(), Boxing.boxBoolean(true))) {
                    C44887w1 c44887w1M18695v7 = assetOnGoingFragment.m18695v3();
                    if (c44887w1M18695v7 != null && (recyclerView2 = c44887w1M18695v7.f101044g) != null) {
                        Boxing.boxBoolean(recyclerView2.postDelayed(new Runnable() { // from class: com.kubi.assets.overview.ongoing.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                AssetOnGoingFragment.C107462.m18701f(assetOnGoingFragment);
                            }
                        }, 50L));
                    }
                    C44887w1 c44887w1M18695v8 = assetOnGoingFragment.m18695v3();
                    if (c44887w1M18695v8 != null && (relativeLayout = c44887w1M18695v8.f101039b) != null) {
                        relativeLayout.setTag(Boxing.boxBoolean(false));
                    }
                }
            }
            if (list != null && !list.isEmpty()) {
                z11 = true;
            }
            if (!z11 && !Intrinsics.areEqual(AssetOnGoingFragment.m18688r3(AssetOnGoingFragment.this).getHavaPositionData(), Boxing.boxBoolean(true))) {
                OverviewAnalyticsReporter.f18247a.m18419q("empty");
                C44887w1 c44887w1M18695v9 = AssetOnGoingFragment.this.m18695v3();
                if (c44887w1M18695v9 != null && (onGoingRecommendView = c44887w1M18695v9.f101043f) != null) {
                    ViewExtKt.m66594y(onGoingRecommendView);
                }
                C44887w1 c44887w1M18695v10 = AssetOnGoingFragment.this.m18695v3();
                if (c44887w1M18695v10 != null && (recyclerView = c44887w1M18695v10.f101044g) != null) {
                    ViewExtKt.m66577h(recyclerView);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: f */
        public static final void m18701f(AssetOnGoingFragment assetOnGoingFragment) {
            RecyclerView recyclerView;
            C44887w1 c44887w1M18695v3 = assetOnGoingFragment.m18695v3();
            if (c44887w1M18695v3 != null && (recyclerView = c44887w1M18695v3.f101044g) != null) {
                recyclerView.scrollToPosition(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetOnGoingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$4", m90122f = "AssetOnGoingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C107484 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C107484(Continuation<? super C107484> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C107484 c107484 = AssetOnGoingFragment.this.new C107484(continuation);
            c107484.Z$0 = ((Boolean) obj).booleanValue();
            return c107484;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C107484) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetOnGoingAdapter assetOnGoingAdapter = AssetOnGoingFragment.this.f18405U;
            if (assetOnGoingAdapter != null) {
                assetOnGoingAdapter.m18678R(z11);
            }
            AssetOnGoingAdapter assetOnGoingAdapter2 = AssetOnGoingFragment.this.f18405U;
            if (assetOnGoingAdapter2 != null) {
                assetOnGoingAdapter2.notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetOnGoingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.ongoing.AssetOnGoingFragment$bindState$6", m90122f = "AssetOnGoingFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C107506 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C107506) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C107506(Continuation<? super C107506> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C107506 c107506 = AssetOnGoingFragment.this.new C107506(continuation);
            c107506.L$0 = obj;
            return c107506;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<ProductItem> data;
            RecyclerView recyclerView;
            OnGoingRecommendView onGoingRecommendView;
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(bool, Boxing.boxBoolean(true)) && ((data = AssetOnGoingFragment.m18688r3(AssetOnGoingFragment.this).getData()) == null || data.isEmpty())) {
                OverviewAnalyticsReporter.f18247a.m18419q("empty");
                C44887w1 c44887w1M18695v3 = AssetOnGoingFragment.this.m18695v3();
                if (c44887w1M18695v3 != null && (onGoingRecommendView = c44887w1M18695v3.f101043f) != null) {
                    ViewExtKt.m66594y(onGoingRecommendView);
                }
                C44887w1 c44887w1M18695v4 = AssetOnGoingFragment.this.m18695v3();
                if (c44887w1M18695v4 != null && (recyclerView = c44887w1M18695v4.f101044g) != null) {
                    ViewExtKt.m66577h(recyclerView);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m18692F3(RecyclerView recyclerView, TextView textView, View view, ImageView imageView) {
        List<ProductItem> items;
        List<ProductItem> items2;
        try {
            Result.Companion companion = Result.INSTANCE;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Unit unit = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                AssetOnGoingAdapter assetOnGoingAdapter = adapter instanceof AssetOnGoingAdapter ? (AssetOnGoingAdapter) adapter : null;
                ProductItem productItem = (assetOnGoingAdapter == null || (items2 = assetOnGoingAdapter.getItems()) == null) ? null : items2.get(iFindFirstVisibleItemPosition);
                if (productItem instanceof ProductItem.HeaderItem) {
                    this.f18409Y = (ProductItem.HeaderItem) productItem;
                } else {
                    while (-1 < iFindFirstVisibleItemPosition) {
                        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                        AssetOnGoingAdapter assetOnGoingAdapter2 = adapter2 instanceof AssetOnGoingAdapter ? (AssetOnGoingAdapter) adapter2 : null;
                        ProductItem productItem2 = (assetOnGoingAdapter2 == null || (items = assetOnGoingAdapter2.getItems()) == null) ? null : items.get(iFindFirstVisibleItemPosition);
                        if (productItem2 instanceof ProductItem.HeaderItem) {
                            this.f18409Y = (ProductItem.HeaderItem) productItem2;
                            break;
                        }
                        iFindFirstVisibleItemPosition--;
                    }
                }
                ProductItem.HeaderItem headerItem = this.f18409Y;
                if (C27041f.m66668h(headerItem != null ? headerItem.getF18436b() : null).length() > 0) {
                    if (view != null) {
                        ViewExtKt.m66594y(view);
                    }
                    if (textView != null) {
                        ProductItem.HeaderItem headerItem2 = this.f18409Y;
                        textView.setText(C27041f.m66668h(headerItem2 != null ? headerItem2.getF18436b() : null));
                    }
                    m18696w3(imageView);
                    unit = Unit.INSTANCE;
                } else if (view != null) {
                    ViewExtKt.m66577h(view);
                    unit = Unit.INSTANCE;
                }
                Result.m103844constructorimpl(unit);
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m18680B3(AssetOnGoingFragment assetOnGoingFragment) {
        RelativeLayout relativeLayout;
        ProductItem.HeaderItem headerItem = assetOnGoingFragment.f18409Y;
        if (headerItem != null) {
            assetOnGoingFragment.m18697x3(headerItem);
            headerItem.m18830h(!headerItem.getIsExpanded());
            C44887w1 c44887w1M18695v3 = assetOnGoingFragment.m18695v3();
            assetOnGoingFragment.m18696w3(c44887w1M18695v3 != null ? c44887w1M18695v3.f101040c : null);
            C44887w1 c44887w1M18695v4 = assetOnGoingFragment.m18695v3();
            if (c44887w1M18695v4 != null && (relativeLayout = c44887w1M18695v4.f101039b) != null) {
                relativeLayout.setTag(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m18681C3(AssetOnGoingFragment assetOnGoingFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        assetOnGoingFragment.m18698y3(i11, view);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ void m18682E3(AssetOnGoingFragment assetOnGoingFragment, ProductItem.RobotItem robotItem, Integer num, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            robotItem = null;
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        assetOnGoingFragment.m18691D3(robotItem, num);
    }

    /* JADX INFO: renamed from: D3 */
    public final void m18691D3(ProductItem.RobotItem robotItem, Integer num) throws JSONException {
        String str = HostManager.a.j() + "/running?redirect=false&loading=2&lang=" + MultiLanguageManager.f46811g.getLocale();
        if (num == null || robotItem == null) {
            Router.f46192a.m56184f(str).m4048k();
            return;
        }
        C24271s1.m58531c(Router.f46192a.m56184f(str), C43852m.m96601m("B1overview", "ongoingArea", "botCard" + (num.intValue() + 1))).m4048k();
        OverviewAnalyticsReporter.f18247a.m18406d(num.intValue(), robotItem.getTag(), StringsKt.contains$default((CharSequence) robotItem.getTotalProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        RecyclerView recyclerView;
        OnGoingRecommendView onGoingRecommendView;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        if (singleEvent instanceof C10774m) {
            WrapperLoadingView wrapperLoadingView = this.f18408X;
            if (wrapperLoadingView == null || wrapperLoadingView.getStatus() != 1) {
                OverviewAnalyticsReporter.f18247a.m18419q(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                WrapperLoadingView wrapperLoadingView2 = this.f18408X;
                if (wrapperLoadingView2 != null) {
                    wrapperLoadingView2.showContent();
                }
                C44887w1 c44887w1M18695v3 = m18695v3();
                if (c44887w1M18695v3 != null && (onGoingRecommendView = c44887w1M18695v3.f101043f) != null) {
                    ViewExtKt.m66594y(onGoingRecommendView);
                }
                C44887w1 c44887w1M18695v4 = m18695v3();
                if (c44887w1M18695v4 == null || (recyclerView = c44887w1M18695v4.f101044g) == null) {
                    return;
                }
                ViewExtKt.m66577h(recyclerView);
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_ongoing_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18114V() {
        return this.f18407W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetOnGoingViewModel.class);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18407W = z11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX INFO: renamed from: t3 */
    public final void m18693t3(@NotNull String account) {
        int i11;
        Intrinsics.checkNotNullParameter(account, "account");
        switch (account) {
            case "copyTrading":
                i11 = 8;
                break;
            case "future":
                i11 = 1;
                break;
            case "margin":
                i11 = 2;
                break;
            case "finance":
                i11 = 5;
                break;
            case "robot":
                i11 = 4;
                break;
            case "leadTrading":
                i11 = 9;
                break;
            default:
                i11 = 0;
                break;
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new AssetOnGoingFragment$autoClickItemAtPosition$1(this, i11, null));
    }

    /* JADX INFO: renamed from: u3 */
    public final void m18694u3() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView.RecycledViewPool recycledViewPool;
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(5);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            C44887w1 c44887w1M18695v3 = m18695v3();
            if (c44887w1M18695v3 != null && (recyclerView2 = c44887w1M18695v3.f101044g) != null && (recycledViewPool = recyclerView2.getRecycledViewPool()) != null) {
                recycledViewPool.setMaxRecycledViews(iIntValue, 0);
            }
        }
        C44887w1 c44887w1M18695v4 = m18695v3();
        if (c44887w1M18695v4 == null || (recyclerView = c44887w1M18695v4.f101044g) == null) {
            return;
        }
        recyclerView.setItemViewCacheSize(20);
    }

    /* JADX INFO: renamed from: v3 */
    public final C44887w1 m18695v3() {
        return (C44887w1) this.f18406V.getValue(this, f18404a0[0]);
    }

    /* JADX INFO: renamed from: w3 */
    public final void m18696w3(ImageView imageView) {
        View view;
        View view2;
        ProductItem.HeaderItem headerItem = this.f18409Y;
        Boolean boolValueOf = headerItem != null ? Boolean.valueOf(headerItem.getIsExpanded()) : null;
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            if (imageView != null) {
                imageView.setImageResource(R$drawable.ic2_arrow_up_16);
            }
            if (imageView != null) {
                ViewExtKt.m66594y(imageView);
            }
            C44887w1 c44887w1M18695v3 = m18695v3();
            if (c44887w1M18695v3 == null || (view2 = c44887w1M18695v3.f101046i) == null) {
                return;
            }
            ViewExtKt.m66577h(view2);
            return;
        }
        if (!Intrinsics.areEqual(boolValueOf, Boolean.FALSE)) {
            if (imageView != null) {
                ViewExtKt.m66577h(imageView);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(R$drawable.ic2_arrow_down_16);
        }
        if (imageView != null) {
            ViewExtKt.m66594y(imageView);
        }
        C44887w1 c44887w1M18695v4 = m18695v3();
        if (c44887w1M18695v4 == null || (view = c44887w1M18695v4.f101046i) == null) {
            return;
        }
        ViewExtKt.m66594y(view);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m18697x3(ProductItem.HeaderItem headerItem) {
        sendIntent(new AssetOnGoingContract$UiIntent.TitleClickEvent(headerItem.getSubType(), headerItem.getIsExpanded()));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m18698y3(int i11, View view) {
        Object objM103844constructorimpl;
        Object objValueOf;
        List<ProductItem> items;
        List<ProductItem> items2;
        if (C27014a1.m66501a(view) || i11 < 0) {
            return;
        }
        AssetOnGoingAdapter assetOnGoingAdapter = this.f18405U;
        if (i11 >= C27039d.m66650j((assetOnGoingAdapter == null || (items2 = assetOnGoingAdapter.getItems()) == null) ? null : Integer.valueOf(items2.size()))) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetOnGoingAdapter assetOnGoingAdapter2 = this.f18405U;
            ProductItem productItem = (assetOnGoingAdapter2 == null || (items = assetOnGoingAdapter2.getItems()) == null) ? null : (ProductItem) CollectionsKt.getOrNull(items, i11);
            if (productItem instanceof ProductItem.ContractItem) {
                Router.f46192a.m56184f("kumex/trade?symbol=" + ((ProductItem.ContractItem) productItem).getSymbol()).m4048k();
                OverviewAnalyticsReporter.f18247a.m18410h(i11, ((ProductItem.ContractItem) productItem).getSymbol(), ((ProductItem.ContractItem) productItem).getMarginMode(), StringsKt.contains$default((CharSequence) ((ProductItem.ContractItem) productItem).getUnPnl(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
                objValueOf = Unit.INSTANCE;
            } else if (productItem instanceof ProductItem.CrossItem) {
                InterfaceC37754f.a.m85136h(C37304a.f82764a, null, null, C43852m.m96601m("B1overview", "ongoingArea", "crossMarginCard"), null, null, 27, null);
                OverviewAnalyticsReporter overviewAnalyticsReporter = OverviewAnalyticsReporter.f18247a;
                List<FundsInfo> listM18804e = ((ProductItem.CrossItem) productItem).m18804e();
                overviewAnalyticsReporter.m18407e(C27039d.m66650j(listM18804e != null ? Integer.valueOf(listM18804e.size()) : null), StringsKt.contains$default((CharSequence) ((ProductItem.CrossItem) productItem).getProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
                objValueOf = Unit.INSTANCE;
            } else {
                String str = "";
                if (productItem instanceof ProductItem.IsolatedItem) {
                    C37890n c37890n = C37890n.f85269a;
                    String tag = ((ProductItem.IsolatedItem) productItem).getTag();
                    if (tag == null) {
                        tag = "";
                    }
                    SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(tag);
                    C37304a c37304a = C37304a.f82764a;
                    String symbol = symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getSymbol() : null;
                    InterfaceC37754f.a.m85134f(c37304a, symbol == null ? "" : symbol, null, C43852m.m96601m("B1overview", "ongoingArea", "isolatedMarginCard" + (i11 + 1)), null, null, 26, null);
                    OverviewAnalyticsReporter.f18247a.m18411i(i11, ((ProductItem.IsolatedItem) productItem).getTag(), StringsKt.contains$default((CharSequence) ((ProductItem.IsolatedItem) productItem).getProfit(), (CharSequence) C33820nf.f71144W, false, 2, (Object) null));
                    objValueOf = Unit.INSTANCE;
                } else if (productItem instanceof ProductItem.RobotItem) {
                    m18691D3((ProductItem.RobotItem) productItem, Integer.valueOf(i11));
                    objValueOf = Unit.INSTANCE;
                } else if (productItem instanceof ProductItem.CopyTradingItem) {
                    objValueOf = Boolean.valueOf(InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myCopy", null, null, null, null, 122, null));
                } else if (productItem instanceof ProductItem.LeadTradingItem) {
                    objValueOf = Boolean.valueOf(InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myLeading", null, null, null, null, 122, null));
                } else if (productItem instanceof ProductItem.FinancialItem) {
                    String jumpUrl = ((ProductItem.FinancialItem) productItem).getJumpUrl();
                    if (!TextUtils.isEmpty(jumpUrl)) {
                        Router.f46192a.m56184f(jumpUrl).m4048k();
                        OverviewAnalyticsReporter.f18247a.m18409g(i11, ((ProductItem.FinancialItem) productItem).getCurrency());
                        C37890n c37890n2 = C37890n.f85269a;
                        String currency = ((ProductItem.FinancialItem) productItem).getCurrency();
                        if (currency != null) {
                            str = currency;
                        }
                        CoinInfoEntity coinInfoEntityM85613u = c37890n2.m85613u(str);
                        if (Intrinsics.areEqual(((ProductItem.FinancialItem) productItem).getCategory(), "PWM_FUND")) {
                            C12572a.m23694c("finance_pwm_query_currency", ((ProductItem.FinancialItem) productItem).getCategoryText(), 1000L);
                        } else {
                            C12572a.m23694c("finance_query_currency", coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCode() : null, 1000L);
                        }
                    }
                    objValueOf = Unit.INSTANCE;
                } else if (productItem instanceof ProductItem.HeaderItem) {
                    m18697x3((ProductItem.HeaderItem) productItem);
                    objValueOf = Unit.INSTANCE;
                } else {
                    if (productItem instanceof ProductItem.LoadMoreItem) {
                        m18699z3((ProductItem.LoadMoreItem) productItem);
                    }
                    objValueOf = Unit.INSTANCE;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(objValueOf);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "handleItemClick-AssetOnGoingFragment", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r3 */
    public static final /* synthetic */ UIState m18688r3(AssetOnGoingFragment assetOnGoingFragment) {
        return (UIState) assetOnGoingFragment.getState();
    }

    /* JADX INFO: renamed from: A3 */
    public final void m18690A3() {
        RelativeLayout relativeLayout;
        RecyclerView recyclerView;
        C44887w1 c44887w1M18695v3 = m18695v3();
        if (c44887w1M18695v3 != null && (recyclerView = c44887w1M18695v3.f101044g) != null) {
            recyclerView.addOnScrollListener(new C10744a());
        }
        C44887w1 c44887w1M18695v4 = m18695v3();
        if (c44887w1M18695v4 != null && (relativeLayout = c44887w1M18695v4.f101039b) != null) {
            C27046k.m66711z(relativeLayout, 0L, new Function0() { // from class: com.kubi.assets.overview.ongoing.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetOnGoingFragment.m18680B3(this.f18534b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (isShowing()) {
            AssetOnGoingAdapter assetOnGoingAdapter = this.f18405U;
            if (assetOnGoingAdapter != null) {
                assetOnGoingAdapter.m18678R(z11);
            }
            AssetOnGoingAdapter assetOnGoingAdapter2 = this.f18405U;
            if (assetOnGoingAdapter2 != null) {
                assetOnGoingAdapter2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new MutablePropertyReference1Impl() { // from class: com.kubi.assets.overview.ongoing.AssetOnGoingFragment.bindState.1
            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference1Impl, p852kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((UIState) obj).setData((List) obj2);
            }
        }, new C107462(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.ongoing.AssetOnGoingFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C107484(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.ongoing.AssetOnGoingFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getHavaPositionData();
            }
        }, new C107506(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        View view;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        super.initView();
        C44887w1 c44887w1M18695v3 = m18695v3();
        if (c44887w1M18695v3 != null) {
            view = c44887w1M18695v3.f101042e;
        } else {
            view = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(view);
        this.f18408X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44887w1 c44887w1M18695v4 = m18695v3();
        if (c44887w1M18695v4 != null && (recyclerView3 = c44887w1M18695v4.f101044g) != null) {
            C22912t.m54409g(recyclerView3, false);
        }
        C44887w1 c44887w1M18695v5 = m18695v3();
        if (c44887w1M18695v5 != null && (recyclerView2 = c44887w1M18695v5.f101044g) != null) {
            recyclerView2.setItemAnimator(null);
        }
        m18694u3();
        AssetOnGoingAdapter assetOnGoingAdapter = new AssetOnGoingAdapter(this, new ProductDiffCallBack(), new ArrayList());
        this.f18405U = assetOnGoingAdapter;
        assetOnGoingAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.overview.ongoing.n
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onClick(BaseQuickAdapter baseQuickAdapter, View view2, int i11) {
                AssetOnGoingFragment.m18681C3(this.f18533a, baseQuickAdapter, view2, i11);
            }
        });
        C44887w1 c44887w1M18695v6 = m18695v3();
        if (c44887w1M18695v6 != null && (recyclerView = c44887w1M18695v6.f101044g) != null) {
            recyclerView.setAdapter(this.f18405U);
        }
        m18690A3();
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
        sendIntent(AssetOnGoingContract$UiIntent.GetOnGoingData.INSTANCE);
        sendIntent(new AssetOnGoingContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
    }

    /* JADX INFO: renamed from: z3 */
    public final void m18699z3(ProductItem.LoadMoreItem loadMoreItem) throws JSONException {
        int subType = loadMoreItem.getSubType();
        if (subType != 1) {
            if (subType != 2) {
                if (subType != 4) {
                    if (subType != 5) {
                        if (subType != 8) {
                            if (subType != 9) {
                                return;
                            }
                            InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myLeading", null, null, null, null, 122, null);
                            return;
                        }
                        InterfaceC37754f.a.m85138j(C37304a.f82764a, "copyTrading", null, "copyTradingJump.myCopy", null, null, null, null, 122, null);
                        return;
                    }
                    Router.f46192a.m56184f("account/asset?from=finance").m4048k();
                    return;
                }
                m18682E3(this, null, null, 3, null);
                return;
            }
            IMarginService.m37900d0(AssetsDepend.f18689a.m19183d(), "", true, false, null, 12, null);
            return;
        }
        Router.f46192a.m56184f("kumex/trade").m4048k();
    }
}
