package com.kubi.assets.overview.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.OverviewAccountInfo;
import com.kubi.assets.entity.OverviewItemEntity;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.overview.AssetOverviewViewModel;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.overview.AssetV2OverviewContract$UiIntent;
import com.kubi.assets.overview.UIState;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.sort.AccountTabSortSettingFragment;
import com.kubi.assets.sort.C10997l;
import com.kubi.assets.withdraw.view.WithdrawNoticeView;
import com.kubi.data.entity.AssetSingleEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p402kf.C41014a;
import p402kf.C41016c;
import p569qq.C43852m;
import p637ta.C44859s1;
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
import y70.C46392a;

/* JADX INFO: compiled from: AssetAccountFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001@B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u0004\u0018\u00010%J\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0015J\u0010\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001dH\u0014J\b\u0010-\u001a\u00020)H\u0015J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020)H\u0002J\u0012\u00101\u001a\u00020)2\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u00103\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u001dH\u0016J\b\u0010=\u001a\u00020)H\u0002J\u0012\u0010>\u001a\u00020)2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010?\u001a\u00020)H\u0014R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00104\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000206058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006A"}, m90084d2 = {"Lcom/kubi/assets/overview/account/AssetAccountFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetListBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/overview/AssetV2OverviewAdapter;", "getAdapter", "()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "getOverviewEntity", "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "setOverviewEntity", "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V", "lastExecutionTime", "", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "getRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getLayout", "", "lazyLoad", "", "initView", "onViewHideOrShowToggle", TIMPushProvider.f75062n, "bindState", "updateEmptyViewVisibility", "isEmpty", "setupCancelHideButton", "onAssetsGet", "myAssetEntity", "onRefresh", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "onHideZeroListener", TIMPushProvider.f75063o, "onEyesChangedListener", ViewProps.VISIBLE, "initSortSettingGuide", "jumpAccountTabSortFragment", "bindFlowEvent", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nAssetAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,360:1\n147#2,16:361\n135#3,2:377\n135#3,2:379\n126#3,2:381\n126#3,2:390\n81#4,2:383\n251#5,5:385\n*S KotlinDebug\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment\n*L\n65#1:361,16\n184#1:377,2\n309#1:379,2\n331#1:381,2\n319#1:390,2\n337#1:383,2\n146#1:385,5\n*E\n"})
public final class AssetAccountFragment extends SimpleStateFragment<UIState> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener, AssetV2OverviewAdapter.InterfaceC10586a {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18226U = C45681e.m100799e(this, new Function1<AssetAccountFragment, C44859s1>() { // from class: com.kubi.assets.overview.account.AssetAccountFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44859s1 invoke(@NotNull AssetAccountFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44859s1.m99242a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44859s1, Unit>() { // from class: com.kubi.assets.overview.account.AssetAccountFragment$special$$inlined$viewBindingFragment$1
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
    public final Lazy f18227V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.account.g
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetAccountFragment.m18368D3(this.f18237b);
        }
    });

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetV2OverviewEntity f18228W;

    /* JADX INFO: renamed from: X */
    public long f18229X;

    /* JADX INFO: renamed from: Y */
    public boolean f18230Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WrapperLoadingView f18231Z;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f18225b0 = {Reflection.property1(new PropertyReference1Impl(AssetAccountFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetListBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f18224a0 = new Companion(null);

    /* JADX INFO: compiled from: AssetAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "EVENT_HIDE_SMALL_ASSET_ACCOUNT", "newInstance", "Lcom/kubi/assets/overview/account/AssetAccountFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetAccountFragment newInstance() {
            return new AssetAccountFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.account.AssetAccountFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/OverviewItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.account.AssetAccountFragment$bindState$2", m90122f = "AssetAccountFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment$bindState$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n774#2:361\n865#2,2:362\n*S KotlinDebug\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment$bindState$2\n*L\n200#1:361\n200#1:362,2\n*E\n"})
    public static final class C105952 extends SuspendLambda implements Function2<List<? extends OverviewItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends OverviewItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<OverviewItemEntity>) list, continuation);
        }

        public C105952(Continuation<? super C105952> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105952 c105952 = AssetAccountFragment.this.new C105952(continuation);
            c105952.L$0 = obj;
            return c105952;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<OverviewItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C105952) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            FrameLayout frameLayout;
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (list == null) {
                return Unit.INSTANCE;
            }
            C44859s1 c44859s1M18369F3 = AssetAccountFragment.this.m18369F3();
            if (c44859s1M18369F3 != null && (frameLayout = c44859s1M18369F3.f100770d) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
            WrapperLoadingView wrapperLoadingView = AssetAccountFragment.this.f18231Z;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            List listM66558a = C27024b.m66558a(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM66558a) {
                if (((OverviewItemEntity) obj2).getType() == 1) {
                    arrayList.add(obj2);
                }
            }
            AssetAccountFragment.this.m18399U3(arrayList.isEmpty());
            if (list.isEmpty()) {
                C44859s1 c44859s1M18369F4 = AssetAccountFragment.this.m18369F3();
                if (c44859s1M18369F4 != null && (recyclerView2 = c44859s1M18369F4.f100772f) != null) {
                    ViewExtKt.m66577h(recyclerView2);
                }
            } else {
                C44859s1 c44859s1M18369F5 = AssetAccountFragment.this.m18369F3();
                if (c44859s1M18369F5 != null && (recyclerView = c44859s1M18369F5.f100772f) != null) {
                    ViewExtKt.m66594y(recyclerView);
                }
            }
            AssetAccountFragment.this.m18393E3().replaceData(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.account.AssetAccountFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetAccountFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.account.AssetAccountFragment$bindState$4", m90122f = "AssetAccountFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C105974 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C105974(Continuation<? super C105974> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105974 c105974 = AssetAccountFragment.this.new C105974(continuation);
            c105974.Z$0 = ((Boolean) obj).booleanValue();
            return c105974;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C105974) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetAccountFragment.this.m18393E3().m18310l(z11);
            AssetAccountFragment.this.m18393E3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m18378T3(AssetAccountFragment assetAccountFragment) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        C10615q.m18401b(false);
        C12572a.m23695d("EVENT_HIDE_SMALL_ASSET_ACCOUNT", Boolean.FALSE, 0L, 4, null);
        C44859s1 c44859s1M18369F3 = assetAccountFragment.m18369F3();
        if (c44859s1M18369F3 != null && (linearLayout = c44859s1M18369F3.f100769c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C44859s1 c44859s1M18369F4 = assetAccountFragment.m18369F3();
        if (c44859s1M18369F4 != null && (recyclerView = c44859s1M18369F4.f100772f) != null) {
            ViewExtKt.m66594y(recyclerView);
        }
        C43852m.m96591c("B1overview", "emptyList", "unhide", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final AssetV2OverviewAdapter m18368D3(AssetAccountFragment assetAccountFragment) {
        return new AssetV2OverviewAdapter(new ArrayList(), assetAccountFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public final C44859s1 m18369F3() {
        return (C44859s1) this.f18226U.getValue(this, f18225b0[0]);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m18371K3(AssetAccountFragment assetAccountFragment) {
        WithdrawNoticeView withdrawNoticeView;
        C46392a.m102328k(C42153h.f93593a.m92514d(), true);
        C44859s1 c44859s1M18369F3 = assetAccountFragment.m18369F3();
        if (c44859s1M18369F3 != null && (withdrawNoticeView = c44859s1M18369F3.f100773g) != null) {
            AssetExKt.m15138z(withdrawNoticeView, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public final AssetV2OverviewAdapter m18393E3() {
        return (AssetV2OverviewAdapter) this.f18227V.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: G3, reason: from getter */
    public final AssetV2OverviewEntity getF18228W() {
        return this.f18228W;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m18397Q3(C44859s1 c44859s1) {
        WithdrawNoticeView withdrawNoticeView;
        C43852m.m96591c("B1overview", "accountList", "accountManage", null, 8, null);
        Context context = getContext();
        if (context != null) {
            AccountTabSortSettingFragment.f18757Z.launchPageOnCase(context);
        }
        C46392a.m102328k(C42153h.f93593a.m92514d(), true);
        if (c44859s1 == null || (withdrawNoticeView = c44859s1.f100773g) == null) {
            return;
        }
        AssetExKt.m15138z(withdrawNoticeView, false);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public void bindState() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.account.AssetAccountFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getList();
            }
        }, new C105952(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.account.AssetAccountFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C105974(null));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_list;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF18230Y() {
        return this.f18230Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetOverviewViewModel.class);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        if (assetV2OverviewEntity != null) {
            this.f18228W = assetV2OverviewEntity;
            if (getContext() == null || !isShowing()) {
                return;
            }
            AssetSingleEntity total = assetV2OverviewEntity.getTotal();
            if (C41014a.m89922G(total != null ? total.getTotalBalance() : null, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                sendIntent(new AssetV2OverviewContract$UiIntent.GetRecentTransitionData(assetV2OverviewEntity));
            } else {
                AssetSingleEntity total2 = assetV2OverviewEntity.getTotal();
                if (!(total2 != null ? Intrinsics.areEqual(total2.getExecute(), Boolean.TRUE) : false)) {
                    sendIntent(new AssetV2OverviewContract$UiIntent.GetRecentTransitionData(assetV2OverviewEntity));
                }
            }
            sendIntent(AssetV2OverviewContract$UiIntent.GetRollbackData.INSTANCE);
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AssetAccountFragment$onAssetsGet$1$1(this, assetV2OverviewEntity, null));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18230Y = z11;
    }

    public AssetAccountFragment() {
        setPageId("B1overview");
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m18370J3(AssetAccountFragment assetAccountFragment) {
        assetAccountFragment.m18397Q3(assetAccountFragment.m18369F3());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m18372L3(AssetAccountFragment assetAccountFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String str;
        String str2;
        if (baseQuickAdapter.getItem(i11) instanceof OverviewItemEntity) {
            Object item = baseQuickAdapter.getItem(i11);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.kubi.assets.entity.OverviewItemEntity");
            OverviewItemEntity overviewItemEntity = (OverviewItemEntity) item;
            if (overviewItemEntity.getAccountInfo() != null) {
                OverviewAccountInfo accountInfo = overviewItemEntity.getAccountInfo();
                if (accountInfo != null && accountInfo.getMain() != null) {
                    str2 = "main";
                } else {
                    str2 = "overview";
                }
                OverviewAccountInfo accountInfo2 = overviewItemEntity.getAccountInfo();
                if (accountInfo2 != null && accountInfo2.getTrade() != null) {
                    str2 = "trade";
                }
                OverviewAccountInfo accountInfo3 = overviewItemEntity.getAccountInfo();
                if (accountInfo3 != null && accountInfo3.getMargin() != null) {
                    str2 = ViewProps.MARGIN;
                }
                OverviewAccountInfo accountInfo4 = overviewItemEntity.getAccountInfo();
                if (accountInfo4 != null && accountInfo4.getKumex() != null) {
                    str2 = SearchCategory$Companion.FUTURES;
                }
                OverviewAccountInfo accountInfo5 = overviewItemEntity.getAccountInfo();
                if (accountInfo5 != null && accountInfo5.getAlpha() != null) {
                    str2 = "alpha";
                }
                OverviewAccountInfo accountInfo6 = overviewItemEntity.getAccountInfo();
                if (accountInfo6 != null && accountInfo6.getRobot() != null) {
                    str2 = "bots";
                }
                OverviewAccountInfo accountInfo7 = overviewItemEntity.getAccountInfo();
                if (accountInfo7 != null && accountInfo7.getEarn() != null) {
                    str2 = "finance";
                }
                OverviewAccountInfo accountInfo8 = overviewItemEntity.getAccountInfo();
                if (accountInfo8 != null && accountInfo8.getOption() != null) {
                    str2 = TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT;
                }
                OverviewAccountInfo accountInfo9 = overviewItemEntity.getAccountInfo();
                if (accountInfo9 != null && accountInfo9.getCopyTrading() != null) {
                    str2 = "copyTrading";
                }
                OverviewAccountInfo accountInfo10 = overviewItemEntity.getAccountInfo();
                if (accountInfo10 != null && accountInfo10.getUnified() != null) {
                    str2 = "unified";
                }
                OverviewAccountInfo accountInfo11 = overviewItemEntity.getAccountInfo();
                if (accountInfo11 != null && accountInfo11.getMining() != null) {
                    str2 = "mining";
                }
                Fragment parentFragment = assetAccountFragment.getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof AssetV2Fragment)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                if (!(parentFragment instanceof AssetV2Fragment)) {
                    parentFragment = null;
                }
                AssetV2Fragment assetV2Fragment = (AssetV2Fragment) parentFragment;
                if (assetV2Fragment != null) {
                    assetV2Fragment.m15190s3(str2);
                }
                C43852m.m96590b("B1overview", JAnalysisConstants.Account.KEY_ACCOUNT, str2, TuplesKt.m90091to("after_page_id", "B1depositCoinList"), TuplesKt.m90091to("norm_version", "1"));
                return;
            }
            if (overviewItemEntity.getHistoryInfo() != null) {
                C43852m.m96589a("B1overview", "recentTran", "1", new JSONObject().put("withdraw_deposit_type", overviewItemEntity.getHistoryInfo().getType()));
                C37304a c37304a = C37304a.f82764a;
                String strM66668h = C27041f.m66668h(overviewItemEntity.getHistoryInfo().id);
                if (overviewItemEntity.getHistoryInfo().isWithdraw()) {
                    str = "1";
                } else {
                    str = "0";
                }
                InterfaceC37749a.a.m85113h(c37304a, strM66668h, str, C43852m.m96601m("B1overview", "recentTran", "1"), null, null, 24, null);
            }
        }
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m18373M3(AssetAccountFragment assetAccountFragment, Boolean bool) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        C44859s1 c44859s1M18369F3 = assetAccountFragment.m18369F3();
        if (c44859s1M18369F3 != null && (recyclerView = c44859s1M18369F3.f100772f) != null && assetAccountFragment.isVisible() && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final void m18374N3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final Unit m18375O3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final void m18376P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R3 */
    public static final void m18377R3(AssetAccountFragment assetAccountFragment) {
        assetAccountFragment.lazyLoad();
    }

    @Nullable
    /* JADX INFO: renamed from: H3 */
    public final RecyclerView m18395H3() {
        C44859s1 c44859s1M18369F3;
        if (!isShowing() || (c44859s1M18369F3 = m18369F3()) == null) {
            return null;
        }
        return c44859s1M18369F3.f100772f;
    }

    /* JADX INFO: renamed from: I3 */
    public final void m18396I3() {
        boolean z11;
        WithdrawNoticeView withdrawNoticeView;
        WithdrawNoticeView withdrawNoticeView2;
        WithdrawNoticeView withdrawNoticeView3;
        if (C10997l.m19368a() && !C46392a.m102322d(C42153h.f93593a.m92514d(), false)) {
            z11 = true;
        } else {
            z11 = false;
        }
        C44859s1 c44859s1M18369F3 = m18369F3();
        if (c44859s1M18369F3 != null && (withdrawNoticeView3 = c44859s1M18369F3.f100773g) != null) {
            AssetExKt.m15138z(withdrawNoticeView3, z11);
        }
        if (z11) {
            C43852m.m96595g("B1overview", "accountList", "newGuide", null, 8, null);
            C44859s1 c44859s1M18369F4 = m18369F3();
            if (c44859s1M18369F4 != null && (withdrawNoticeView2 = c44859s1M18369F4.f100773g) != null) {
                withdrawNoticeView2.g(C27017c.f54310a.m66516f(R$string.kc_asset_sort_lead_tip, new Object[0]), new Function0() { // from class: com.kubi.assets.overview.account.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetAccountFragment.m18370J3(this.f18244b);
                    }
                });
            }
            C44859s1 c44859s1M18369F5 = m18369F3();
            if (c44859s1M18369F5 != null && (withdrawNoticeView = c44859s1M18369F5.f100773g) != null) {
                withdrawNoticeView.setOnCloseClickListener(new Function0() { // from class: com.kubi.assets.overview.account.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetAccountFragment.m18371K3(this.f18245b);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m18398S3() {
        KcPrimaryButton kcPrimaryButton;
        C44859s1 c44859s1M18369F3 = m18369F3();
        if (c44859s1M18369F3 != null && (kcPrimaryButton = c44859s1M18369F3.f100768b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.overview.account.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetAccountFragment.m18378T3(this.f18239b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.assets.overview.AssetV2OverviewAdapter.InterfaceC10586a
    /* JADX INFO: renamed from: T2 */
    public void mo16633T2(boolean z11) {
        if (!isShowing()) {
            return;
        }
        m18393E3().m18310l(z11);
        m18393E3().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m18399U3(boolean z11) {
        RecyclerView recyclerView;
        LinearLayout linearLayout;
        BigDecimal quotaLimit;
        BaseTextView baseTextView;
        LinearLayout linearLayout2;
        RecyclerView recyclerView2;
        boolean zM18400a = C10615q.m18400a();
        if (z11 && zM18400a) {
            C44859s1 c44859s1M18369F3 = m18369F3();
            if (c44859s1M18369F3 != null && (recyclerView2 = c44859s1M18369F3.f100772f) != null) {
                ViewExtKt.m66577h(recyclerView2);
            }
            C44859s1 c44859s1M18369F4 = m18369F3();
            if (c44859s1M18369F4 != null && (linearLayout2 = c44859s1M18369F4.f100769c) != null) {
                ViewExtKt.m66594y(linearLayout2);
            }
            SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
            if (smallEntityM19164h == null || (quotaLimit = smallEntityM19164h.getQuotaLimit()) == null) {
                quotaLimit = BigDecimal.ONE;
            }
            C44859s1 c44859s1M18369F5 = m18369F3();
            if (c44859s1M18369F5 != null && (baseTextView = c44859s1M18369F5.f100774h) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string = getResources().getString(R$string.kc_asset_sort_hide_small_desc);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{quotaLimit}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView.setText(str);
            }
            C43852m.m96595g("B1overview", "emptyList", "1", null, 8, null);
            m18398S3();
            return;
        }
        C44859s1 c44859s1M18369F6 = m18369F3();
        if (c44859s1M18369F6 != null && (linearLayout = c44859s1M18369F6.f100769c) != null) {
            ViewExtKt.m66577h(linearLayout);
        }
        C44859s1 c44859s1M18369F7 = m18369F3();
        if (c44859s1M18369F7 != null && (recyclerView = c44859s1M18369F7.f100772f) != null) {
            ViewExtKt.m66594y(recyclerView);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "EVENT_HIDE_SMALL_ASSET_ACCOUNT".length();
        }
        C12572a.m23692a(this, true, new AssetAccountFragment$bindFlowEvent$$inlined$bindFlowEvent$1("EVENT_HIDE_SMALL_ASSET_ACCOUNT", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"NotifyDataSetChanged", "KCLongMethodCheck", "KCCyclomaticComplexityCheck"})
    public void initView() {
        View view;
        RecyclerView recyclerView;
        C44859s1 c44859s1M18369F3 = m18369F3();
        RecyclerView recyclerView2 = null;
        if (c44859s1M18369F3 != null) {
            view = c44859s1M18369F3.f100771e;
        } else {
            view = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(view);
        this.f18231Z = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        AssetV2OverviewAdapter assetV2OverviewAdapterM18393E3 = m18393E3();
        int i11 = R$layout.view_empty;
        C44859s1 c44859s1M18369F4 = m18369F3();
        if (c44859s1M18369F4 != null) {
            recyclerView2 = c44859s1M18369F4.f100772f;
        }
        assetV2OverviewAdapterM18393E3.setEmptyView(i11, recyclerView2);
        C44859s1 c44859s1M18369F5 = m18369F3();
        if (c44859s1M18369F5 != null && (recyclerView = c44859s1M18369F5.f100772f) != null) {
            recyclerView.setAdapter(m18393E3());
        }
        m18396I3();
        m18393E3().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.assets.overview.account.j
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i12) {
                AssetAccountFragment.m18372L3(this.f18240a, baseQuickAdapter, view2, i12);
            }
        });
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.overview.account.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetAccountFragment.m18373M3(this.f18241b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.overview.account.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetAccountFragment.m18374N3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.overview.account.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetAccountFragment.m18375O3((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.overview.account.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetAccountFragment.m18376P3(function2, obj);
            }
        }));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        C44859s1 c44859s1M18369F3 = m18369F3();
        if (c44859s1M18369F3 != null && (recyclerView = c44859s1M18369F3.f100772f) != null) {
            AssetsHelper.m19146u(AssetsHelper.f18684a, recyclerView, null, new Action() { // from class: com.kubi.assets.overview.account.h
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetAccountFragment.m18377R3(this.f18238b);
                }
            }, 2, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        AssetV2OverviewEntity assetV2OverviewEntity;
        BigDecimal totalBalance;
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null && (assetV2OverviewEntity = this.f18228W) != null) {
            sendIntent(new AssetV2OverviewContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
            AssetSingleEntity total = assetV2OverviewEntity.getTotal();
            if (total != null) {
                totalBalance = total.getTotalBalance();
            } else {
                totalBalance = null;
            }
            if (C41014a.m89922G(totalBalance, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
                sendIntent(new AssetV2OverviewContract$UiIntent.GetRecentTransitionData(assetV2OverviewEntity));
            }
            sendIntent(AssetV2OverviewContract$UiIntent.GetRollbackData.INSTANCE);
        }
    }
}
