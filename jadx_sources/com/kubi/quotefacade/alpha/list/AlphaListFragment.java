package com.kubi.quotefacade.alpha.list;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bv.C4656c;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.WsAlphaSnapshotEntity;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.alpha.AlphaCurrent;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.helper.AlphaCountdownHelper;
import com.kubi.quotefacade.helper.AlphaLongPressHelper;
import com.kubi.quotefacade.helper.DebounceHelper;
import com.kubi.quotefacade.helper.FavAlphaCacheManager;
import com.kubi.quotefacade.helper.QuoteExKt;
import com.kubi.quotefacade.rank.list.RankListCountDownView;
import com.kubi.quotefacade.service.BQuoteFacadeDepend;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.C23057g1;
import com.kubi.resources.widget.SwipeRefreshRecyclerView;
import com.kubi.sdk.util.CountDownFinishCallback;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27100x0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import cv.C36544a;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p241ev.C37266a;
import p402kf.C41016c;
import p569qq.C43840a;
import p778xy.C46338a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: AlphaListFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002*\u00019\b\u0007\u0018\u0000 i2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001iB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00103\u001a\u00020(H\u0014J\u001a\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020>H\u0016J\b\u0010D\u001a\u00020>H\u0016J\b\u0010E\u001a\u00020>H\u0016J\b\u0010F\u001a\u00020>H\u0016J\b\u0010G\u001a\u00020>H\u0016J\b\u0010H\u001a\u00020>H\u0016J\u0006\u0010I\u001a\u00020>J\u0006\u0010J\u001a\u00020>J\u0010\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020!H\u0002J\b\u0010M\u001a\u00020!H\u0002J\b\u0010N\u001a\u00020>H\u0002J\b\u0010O\u001a\u00020>H\u0002J\u0010\u0010P\u001a\u00020>2\u0006\u0010Q\u001a\u00020RH\u0014J\u0016\u0010S\u001a\u00020>2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002J\u001e\u0010W\u001a\u00020>2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0U2\u0006\u0010X\u001a\u00020!H\u0002J\u0016\u0010Y\u001a\u00020>2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0UH\u0002J\b\u0010\\\u001a\u00020>H\u0002J\u0010\u0010]\u001a\u00020>2\u0006\u0010^\u001a\u00020!H\u0002J\u001a\u0010_\u001a\u00020>2\b\u0010`\u001a\u0004\u0018\u00010V2\u0006\u0010a\u001a\u00020(H\u0002J\b\u0010b\u001a\u00020>H\u0002J\u0012\u0010c\u001a\u00020>2\b\b\u0002\u0010d\u001a\u00020!H\u0002J\b\u0010e\u001a\u00020>H\u0002J\u0010\u0010f\u001a\u00020>2\u0006\u0010g\u001a\u00020hH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u0002000/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001c\u00104\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u0001060605X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010;¨\u0006j"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/quotefacade/alpha/list/AlphaListContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/quotefacade/databinding/FragmentAlphaListBinding;", "getBinding", "()Lcom/kubi/quotefacade/databinding/FragmentAlphaListBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "alphaType", "", "getAlphaType", "()Ljava/lang/String;", "alphaType$delegate", "Lkotlin/Lazy;", "alphaMenu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "getAlphaMenu", "()Lcom/kubi/quotefacade/constant/AlphaMenu;", "alphaMenu$delegate", "currentParams", "Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "getCurrentParams", "()Lcom/kubi/quotefacade/alpha/AlphaCurrent$AlphaCurrentParams;", "currentParams$delegate", "adapter", "Lcom/kubi/quotefacade/alpha/list/AlphaListAdapter;", "getAdapter", "()Lcom/kubi/quotefacade/alpha/list/AlphaListAdapter;", "adapter$delegate", "isScrolling", "", "bufferNotify", "longPressHelper", "Lcom/kubi/quotefacade/helper/AlphaLongPressHelper;", "debounceHelper", "Lcom/kubi/quotefacade/helper/DebounceHelper;", "firstVisiblePosition", "", "lastVisiblePosition", "skeletonAttachListener", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "skeletonFallbackRunnable", "Ljava/lang/Runnable;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/quotefacade/alpha/list/AlphaListVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "debounceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "countDownFinishCallback", "com/kubi/quotefacade/alpha/list/AlphaListFragment$countDownFinishCallback$2$1", "getCountDownFinishCallback", "()Lcom/kubi/quotefacade/alpha/list/AlphaListFragment$countDownFinishCallback$2$1;", "countDownFinishCallback$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onDestroyView", "showLoading", "showContent", "showEmpty", "adapterRefresh", "onParamsChanged", "triggerFetchDataList", "resetRefresh", "isParamsReady", "subscribeWsDataList", "triggerFetchWsDataList", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "refreshList", "dataList", "", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "loadMoreList", "hasMore", "loadWSList", "wsList", "Lcom/kubi/data/entity/WsAlphaSnapshotEntity;", "initRecycleViewAdapter", "notifyPageShowOrHide", TIMPushProvider.f75062n, "handleFavor", "item", ViewProps.POSITION, "showSkeletonLoading", "hideSkeletonLoading", "waitListPreDraw", "hideSkeletonNow", "clearPendingSkeletonHide", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nAlphaListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaListFragment.kt\ncom/kubi/quotefacade/alpha/list/AlphaListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 4 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,476:1\n147#2,16:477\n93#3,4:493\n93#3,4:497\n93#3,4:501\n93#3,4:505\n45#4,7:509\n1563#5:516\n1634#5,3:517\n1869#5,2:520\n1869#5,2:522\n*S KotlinDebug\n*F\n+ 1 AlphaListFragment.kt\ncom/kubi/quotefacade/alpha/list/AlphaListFragment\n*L\n90#1:477,16\n225#1:493,4\n228#1:497,4\n231#1:501,4\n236#1:505,4\n127#1:509,7\n209#1:516\n209#1:517,3\n273#1:520,2\n283#1:522,2\n*E\n"})
public final class AlphaListFragment extends SimpleStateFragment<AlphaListContract$UIState> {

    /* JADX INFO: renamed from: Z */
    public boolean f41301Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f41302a0;

    /* JADX INFO: renamed from: d0 */
    public int f41305d0;

    /* JADX INFO: renamed from: f0 */
    @Nullable
    public RecyclerView.OnChildAttachStateChangeListener f41307f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public Runnable f41308g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final BehaviorSubject<Object> f41309h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f41310i0;

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ KProperty<Object>[] f41295k0 = {Reflection.property1(new PropertyReference1Impl(AlphaListFragment.class, "binding", "getBinding()Lcom/kubi/quotefacade/databinding/FragmentAlphaListBinding;", 0))};

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f41294j0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f41296U = C45681e.m100799e(this, new Function1<AlphaListFragment, C4656c>() { // from class: com.kubi.quotefacade.alpha.list.AlphaListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4656c invoke(@NotNull AlphaListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4656c.m4624a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4656c, Unit>() { // from class: com.kubi.quotefacade.alpha.list.AlphaListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4656c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4656c c4656c) {
            invoke(c4656c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f41297V = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.list.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaListFragment.m50603j4(this.f41352b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f41298W = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.list.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaListFragment.m50602i4(this.f41354b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f41299X = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.list.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaListFragment.m50606m4(this.f41357b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f41300Y = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.list.p0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AlphaListFragment.m50600h4(this.f41360b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final AlphaLongPressHelper f41303b0 = new AlphaLongPressHelper();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final DebounceHelper f41304c0 = new DebounceHelper(LifecycleOwnerKt.getLifecycleScope(this));

    /* JADX INFO: renamed from: e0 */
    public int f41306e0 = 50;

    /* JADX INFO: compiled from: AlphaListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaListFragment$Companion;", "", "<init>", "()V", "instance", "Lcom/kubi/quotefacade/alpha/list/AlphaListFragment;", "alphaType", "", "menu", "Lcom/kubi/quotefacade/constant/AlphaMenu;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final AlphaListFragment instance(@NotNull String alphaType, @NotNull AlphaMenu menu) {
            Intrinsics.checkNotNullParameter(alphaType, "alphaType");
            Intrinsics.checkNotNullParameter(menu, "menu");
            AlphaListFragment alphaListFragment = new AlphaListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("type", alphaType);
            bundle.putString("page", menu.getType());
            alphaListFragment.setArguments(bundle);
            return alphaListFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.AlphaListFragment$a */
    /* JADX INFO: compiled from: AlphaListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/quotefacade/alpha/list/AlphaListFragment$countDownFinishCallback$2$1", "Lcom/kubi/sdk/util/CountDownFinishCallback;", "finish", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21684a implements CountDownFinishCallback {
        public C21684a() {
        }

        @Override // com.kubi.sdk.util.CountDownFinishCallback
        public void finish() {
            AlphaListFragment.this.f41309h0.onNext(new Object());
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.AlphaListFragment$b */
    /* JADX INFO: compiled from: AlphaListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/quotefacade/alpha/list/AlphaListFragment$hideSkeletonLoading$1$listener$1", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "onChildViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onChildViewDetachedFromWindow", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21685b implements RecyclerView.OnChildAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RecyclerView f41313b;

        public C21685b(RecyclerView recyclerView) {
            this.f41313b = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            AlphaListFragment alphaListFragment = AlphaListFragment.this;
            RecyclerView recyclerView = this.f41313b;
            Intrinsics.checkNotNull(recyclerView);
            alphaListFragment.m50636k4(recyclerView);
            if (AlphaListFragment.this.getView() == null) {
                return;
            }
            AlphaListFragment.this.m50643z4();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.AlphaListFragment$c */
    /* JADX INFO: compiled from: AlphaListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/quotefacade/alpha/list/AlphaListFragment$initRecycleViewAdapter$1$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21686c extends RecyclerView.OnScrollListener {
        public C21686c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            C44128b.m97266j(AlphaListFragment.this.getTAG(), "onScrollStateChanged=" + newState);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            AlphaListFragment alphaListFragment = AlphaListFragment.this;
            alphaListFragment.f41305d0 = linearLayoutManager.findFirstVisibleItemPosition();
            alphaListFragment.f41306e0 = linearLayoutManager.findLastVisibleItemPosition();
            C44128b.m97266j(alphaListFragment.getTAG(), "onScrollStateChanged lastVisiblePosition 1=" + alphaListFragment.f41306e0 + "==》" + alphaListFragment.m50637n4().getData().size() + "=>" + alphaListFragment.m50637n4().getItemCount());
            AlphaListFragment.this.f41301Z = newState != 0;
            if (newState == 0) {
                C46338a.m102151a(recyclerView.getContext()).m6638z();
                AlphaListFragment.this.m50632b5();
            } else if (newState == 1 || newState == 2) {
                C46338a.m102151a(recyclerView.getContext()).m6637y();
            }
            if (!AlphaListFragment.this.f41301Z && AlphaListFragment.this.f41302a0) {
                C44128b.m97266j(AlphaListFragment.this.getTAG(), "onScrollStateChanged not scrolling and notifyDataSetChanged");
                AlphaListFragment.this.m50637n4().notifyDataSetChanged();
                AlphaListFragment.this.f41302a0 = false;
            }
            if (AlphaListFragment.this.f41303b0.m51758i()) {
                AlphaLongPressHelper.m51753k(AlphaListFragment.this.f41303b0, false, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: J4 */
    public static final void m50563J4(AlphaListFragment alphaListFragment, Object obj) {
        alphaListFragment.m50633e5(true);
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m50577S4(AlphaListFragment alphaListFragment) {
        alphaListFragment.m50633e5(true);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        m50620w4(this, false, 1, null);
        this.f41303b0.m51759j(true);
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: B4 */
    private final void m50547B4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50549C4(this.f41371b);
            }
        });
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m50551D4(AlphaListFragment alphaListFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alphaListFragment.m50633e5(true);
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m50553E4(AlphaListFragment alphaListFragment) {
        alphaListFragment.sendIntent(new AlphaListContract$UiIntent.LoadMoreDataList(alphaListFragment.m50610p4(), alphaListFragment.m50638o4(), alphaListFragment.m50614s4()));
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m50570O4(List list, AlphaListFragment alphaListFragment) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WsAlphaSnapshotEntity wsAlphaSnapshotEntity = (WsAlphaSnapshotEntity) it.next();
            map.put(wsAlphaSnapshotEntity.getTokenBridgeId(), wsAlphaSnapshotEntity);
        }
        int iMin = Math.min(alphaListFragment.f41305d0 + 50, alphaListFragment.m50637n4().getData().size());
        C44128b.m97266j(alphaListFragment.getTAG(), alphaListFragment.f41305d0 + "------> " + iMin);
        if (alphaListFragment.f41305d0 >= iMin) {
            C43840a.m96550d(alphaListFragment.f41305d0 + " >= " + iMin + ",when updateListRepeatUI", alphaListFragment.getTAG());
            return Unit.INSTANCE;
        }
        for (AlphaItemEntity alphaItemEntity : alphaListFragment.m50637n4().getData().subList(alphaListFragment.f41305d0, iMin)) {
            WsAlphaSnapshotEntity wsAlphaSnapshotEntity2 = (WsAlphaSnapshotEntity) map.get(alphaItemEntity.getTokenBridgeId());
            if (wsAlphaSnapshotEntity2 != null) {
                alphaItemEntity.setPrice(wsAlphaSnapshotEntity2.getPrice());
                alphaItemEntity.setPriceRate(wsAlphaSnapshotEntity2.getPriceRate());
                alphaItemEntity.setTradingVolume(wsAlphaSnapshotEntity2.getTradingVolume());
            }
        }
        if (alphaListFragment.f41301Z) {
            alphaListFragment.f41302a0 = true;
            C44128b.m97266j(alphaListFragment.getTAG(), "updateListRepeatUI,but is isScrolling!!!");
            return Unit.INSTANCE;
        }
        C44128b.m97266j(alphaListFragment.getTAG(), "updateListRepeatUI => " + alphaListFragment.f41305d0 + ' ' + ((AlphaItemEntity) alphaListFragment.m50637n4().getData().get(alphaListFragment.f41305d0)).getTokenBridgeId() + "  --> " + iMin + ' ' + ((AlphaItemEntity) alphaListFragment.m50637n4().getData().get(iMin - 1)).getTokenBridgeId());
        alphaListFragment.m50637n4().notifyItemRangeChanged(alphaListFragment.f41305d0, iMin);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q4 */
    public static final Unit m50574Q4(C4656c c4656c, boolean z11) {
        RecyclerView.LayoutManager layoutManager = c4656c.f4245c.getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return Unit.INSTANCE;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            while (true) {
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                RankListCountDownView rankListCountDownView = viewFindViewByPosition != null ? (RankListCountDownView) viewFindViewByPosition.findViewById(R$id.layoutCountdown) : null;
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

    /* JADX INFO: renamed from: c5 */
    public static final Unit m50594c5(final AlphaListFragment alphaListFragment) {
        alphaListFragment.f41304c0.m51788a(2000L, new Function0() { // from class: com.kubi.quotefacade.alpha.list.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50596d5(this.f41380b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final AlphaListAdapter m50600h4(AlphaListFragment alphaListFragment) {
        return new AlphaListAdapter(alphaListFragment.m50614s4(), alphaListFragment.m50638o4());
    }

    /* JADX INFO: renamed from: i4 */
    public static final AlphaMenu m50602i4(AlphaListFragment alphaListFragment) {
        AlphaMenu.Companion companion = AlphaMenu.INSTANCE;
        Bundle arguments = alphaListFragment.getArguments();
        AlphaMenu alphaMenuFindByType = companion.findByType(arguments != null ? arguments.getString("page") : null);
        return alphaMenuFindByType == null ? AlphaMenu.ALL : alphaMenuFindByType;
    }

    /* JADX INFO: renamed from: l4 */
    public static final C21684a m50604l4(AlphaListFragment alphaListFragment) {
        return alphaListFragment.new C21684a();
    }

    /* JADX INFO: renamed from: m4 */
    public static final AlphaCurrent.a m50606m4(AlphaListFragment alphaListFragment) {
        return AlphaCurrent.f41143a.m50343a(alphaListFragment.m50610p4());
    }

    /* JADX INFO: renamed from: p4 */
    private final String m50610p4() {
        return (String) this.f41297V.getValue();
    }

    /* JADX INFO: renamed from: s4 */
    private final AlphaCurrent.a m50614s4() {
        return (AlphaCurrent.a) this.f41299X.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m50620w4(AlphaListFragment alphaListFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        alphaListFragment.m50642v4(z11);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m50627L4(final List<AlphaItemEntity> list, final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50567M4(this.f41361b, list, z11);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public final void m50628N4(final List<WsAlphaSnapshotEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50570O4(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: X4 */
    public final void m50630X4(final List<AlphaItemEntity> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50588Y4(this.f41377b, list);
            }
        });
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m50631Z4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50591a5(this.f41351b);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public final void m50632b5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50594c5(this.f41370b);
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
        if (activity == null || !activity.isFinishing()) {
            if (singleEvent instanceof C21701h) {
                C21701h c21701h = (C21701h) singleEvent;
                if (getView() == null) {
                    return;
                } else {
                    m50630X4(c21701h.m50664a());
                }
            }
            if (singleEvent instanceof C21703i) {
                C21703i c21703i = (C21703i) singleEvent;
                if (getView() == null) {
                    return;
                } else {
                    m50627L4(c21703i.m50665a(), c21703i.getF41342b());
                }
            }
            if (singleEvent instanceof C21705j) {
                C21705j c21705j = (C21705j) singleEvent;
                if (getView() == null) {
                    return;
                }
                List<WsAlphaSnapshotEntity> listM50667a = c21705j.m50667a();
                if (listM50667a != null && !listM50667a.isEmpty()) {
                    m50628N4(c21705j.m50667a());
                }
            }
            if (singleEvent instanceof C21699g) {
                C21699g c21699g = (C21699g) singleEvent;
                if (getView() == null) {
                    return;
                }
                ToastCompat.m66441G(this.mContext.getString(!C36544a.m81808a(c21699g.getF41334a()) ? R$string.cancel_favor_ok : R$string.add_favorites_ok), new Object[0]);
                m50637n4().notifyItemChanged(c21699g.getF41335b());
            }
        }
    }

    /* JADX INFO: renamed from: e5 */
    public final void m50633e5(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50598f5(this.f41367b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final void m50634f4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50599g4(this.f41325b);
            }
        });
    }

    /* JADX INFO: renamed from: g5 */
    public final void m50635g5() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50601h5(this.f41329b);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_alpha_list;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AlphaListVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AlphaListVM.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50636k4(RecyclerView recyclerView) {
        RecyclerView.OnChildAttachStateChangeListener onChildAttachStateChangeListener = this.f41307f0;
        if (onChildAttachStateChangeListener != null) {
            recyclerView.removeOnChildAttachStateChangeListener(onChildAttachStateChangeListener);
        }
        this.f41307f0 = null;
        Runnable runnable = this.f41308g0;
        if (runnable != null) {
            recyclerView.removeCallbacks(runnable);
        }
        this.f41308g0 = null;
    }

    /* JADX INFO: renamed from: n4 */
    public final AlphaListAdapter m50637n4() {
        return (AlphaListAdapter) this.f41300Y.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public final AlphaMenu m50638o4() {
        return (AlphaMenu) this.f41298W.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m50547B4();
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.quotefacade.alpha.list.g0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaListFragment.m50579T4(this.f41336b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.quotefacade.alpha.list.j0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlphaListFragment.m50581U4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.quotefacade.alpha.list.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlphaListFragment.m50583V4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.quotefacade.alpha.list.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlphaListFragment.m50585W4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: q4 */
    public final C4656c m50639q4() {
        return (C4656c) this.f41296U.getValue(this, f41295k0[0]);
    }

    /* JADX INFO: renamed from: r4 */
    public final C21684a m50640r4() {
        return (C21684a) this.f41310i0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m50641t4(AlphaItemEntity alphaItemEntity, final int i11) {
        if (BQuoteFacadeDepend.f42592a.m53025e().c()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AlphaListFragment$handleFavor$1(alphaItemEntity, this, i11, null), 3, null);
        } else if (alphaItemEntity != null) {
            FavAlphaCacheManager.f41929a.m51817j(alphaItemEntity, new Function1() { // from class: com.kubi.quotefacade.alpha.list.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlphaListFragment.m50617u4(this.f41343b, i11, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m50642v4(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50622x4(this.f41358b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: z4 */
    public final void m50643z4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50545A4(this.f41379b);
            }
        });
    }

    public AlphaListFragment() {
        BehaviorSubject<Object> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.f41309h0 = behaviorSubjectCreate;
        this.f41310i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.alpha.list.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50604l4(this.f41349b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m50545A4(AlphaListFragment alphaListFragment) {
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        c4656cM50639q4.f4244b.m53323f();
        RankShimmer rsLoading = c4656cM50639q4.f4244b;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66700o(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m50549C4(final AlphaListFragment alphaListFragment) {
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4656cM50639q4.f4245c;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        final RecyclerView recyclerView = swipeRecyclerLayout.getRecyclerView();
        swipeRecyclerLayout.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.quotefacade.alpha.list.y
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                AlphaListFragment.m50551D4(this.f41381b, interfaceC38162f);
            }
        });
        Intrinsics.checkNotNull(recyclerView);
        C22912t.m54409g(recyclerView, false);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(alphaListFragment.new C21686c());
        if (alphaListFragment.m50637n4().m50538l()) {
            alphaListFragment.m50637n4().bindToRecyclerView(recyclerView);
        }
        alphaListFragment.m50637n4().setLoadMoreView(new C23057g1());
        alphaListFragment.m50637n4().setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() { // from class: com.kubi.quotefacade.alpha.list.z
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener
            public final void onLoadMoreRequested() {
                AlphaListFragment.m50553E4(this.f41382a);
            }
        }, recyclerView);
        alphaListFragment.m50637n4().setPreLoadNumber(2);
        alphaListFragment.m50637n4().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: com.kubi.quotefacade.alpha.list.a0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                AlphaListFragment.m50555F4(this.f41321a, baseQuickAdapter, view, i11);
            }
        });
        alphaListFragment.m50637n4().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: com.kubi.quotefacade.alpha.list.b0
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                return AlphaListFragment.m50557G4(this.f41322a, recyclerView, baseQuickAdapter, view, i11);
            }
        });
        alphaListFragment.m50637n4().m50542r(alphaListFragment.m50640r4());
        Disposable disposableSubscribe = alphaListFragment.f41309h0.debounce(100L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.kubi.quotefacade.alpha.list.c0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AlphaListFragment.m50563J4(this.f41324b, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, alphaListFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    public static final void m50555F4(AlphaListFragment alphaListFragment, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        String str;
        AlphaItemEntity alphaItemEntity = (AlphaItemEntity) alphaListFragment.m50637n4().getItem(i11);
        if (alphaItemEntity != null) {
            String token = alphaItemEntity.getToken();
            String kcChain = alphaItemEntity.getKcChain();
            String tokenBridgeId = alphaItemEntity.getTokenBridgeId();
            if (Intrinsics.areEqual(alphaListFragment.m50610p4(), "alpha_premium")) {
                str = "highlights";
            } else {
                str = "chain_area";
            }
            QuoteExKt.m51867r(token, kcChain, tokenBridgeId, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G4 */
    public static final boolean m50557G4(final AlphaListFragment alphaListFragment, RecyclerView recyclerView, BaseQuickAdapter baseQuickAdapter, View view, final int i11) {
        final AlphaItemEntity alphaItemEntity = (AlphaItemEntity) alphaListFragment.m50637n4().getItem(i11);
        if (alphaItemEntity == null) {
            return true;
        }
        AlphaLongPressHelper alphaLongPressHelper = alphaListFragment.f41303b0;
        String strM50610p4 = alphaListFragment.m50610p4();
        Intrinsics.checkNotNull(view);
        alphaLongPressHelper.m51761n(strM50610p4, recyclerView, alphaItemEntity, i11, view, new Function0() { // from class: com.kubi.quotefacade.alpha.list.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50559H4(this.f41333b);
            }
        }, new Function0() { // from class: com.kubi.quotefacade.alpha.list.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50561I4(this.f41338b, alphaItemEntity, i11);
            }
        });
        alphaListFragment.m50637n4().m50543s(i11);
        return true;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m50559H4(AlphaListFragment alphaListFragment) {
        alphaListFragment.m50637n4().m50543s(-1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m50561I4(AlphaListFragment alphaListFragment, AlphaItemEntity alphaItemEntity, int i11) {
        alphaListFragment.m50641t4(alphaItemEntity, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m50567M4(AlphaListFragment alphaListFragment, List list, boolean z11) {
        if (alphaListFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        alphaListFragment.m50637n4().addData((Collection) list);
        alphaListFragment.m50637n4().setEnableLoadMore(z11);
        c4656cM50639q4.f4245c.setRefreshing(false);
        alphaListFragment.m50637n4().loadMoreComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    private final void m50572P4(final boolean z11) {
        final C4656c c4656cM50639q4 = m50639q4();
        if (c4656cM50639q4 == null) {
            return;
        }
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.alpha.list.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaListFragment.m50574Q4(c4656cM50639q4, z11);
            }
        });
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m50579T4(AlphaListFragment alphaListFragment, Boolean bool) {
        alphaListFragment.m50637n4().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m50581U4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m50583V4(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C37266a.m83411b(th2, "CurrencyChangedObs");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final void m50585W4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m50588Y4(AlphaListFragment alphaListFragment, List list) {
        if (alphaListFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        alphaListFragment.m50637n4().replaceData(list);
        alphaListFragment.m50637n4().setEnableLoadMore(true);
        c4656cM50639q4.f4245c.setRefreshing(false);
        alphaListFragment.m50637n4().loadMoreComplete();
        if (alphaListFragment.m50637n4().getData().size() < 50) {
            alphaListFragment.m50637n4().loadMoreEnd(true);
        }
        if (list.isEmpty()) {
            alphaListFragment.showEmpty();
        } else {
            alphaListFragment.showContent();
        }
        alphaListFragment.m50632b5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m50591a5(AlphaListFragment alphaListFragment) {
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        RecyclerView recyclerView = c4656cM50639q4.f4245c.getRecyclerView();
        Intrinsics.checkNotNullExpressionValue(recyclerView, "getRecyclerView(...)");
        alphaListFragment.m50636k4(recyclerView);
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4656cM50639q4.f4245c;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        C27046k.m66685H(swipeRecyclerLayout);
        c4656cM50639q4.f4245c.setEnabled(false);
        c4656cM50639q4.f4244b.m53322e();
        RankShimmer rsLoading = c4656cM50639q4.f4244b;
        Intrinsics.checkNotNullExpressionValue(rsLoading, "rsLoading");
        C27046k.m66685H(rsLoading);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final Unit m50596d5(AlphaListFragment alphaListFragment) {
        alphaListFragment.m50635g5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m50598f5(AlphaListFragment alphaListFragment, boolean z11) {
        if (!alphaListFragment.m50626K4()) {
            return Unit.INSTANCE;
        }
        alphaListFragment.sendIntent(new AlphaListContract$UiIntent.FetchDataList(z11, alphaListFragment.m50610p4(), alphaListFragment.m50638o4(), alphaListFragment.m50614s4()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m50599g4(AlphaListFragment alphaListFragment) {
        Collection data = alphaListFragment.m50637n4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (!data.isEmpty()) {
            alphaListFragment.m50637n4().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final Unit m50601h5(AlphaListFragment alphaListFragment) {
        List<T> data = alphaListFragment.m50637n4().getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        int iMin = Math.min(alphaListFragment.f41306e0 + 1, data.size());
        List listSubList = data.subList(alphaListFragment.f41305d0, iMin);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((AlphaItemEntity) it.next()).getTokenBridgeId()));
        }
        C44128b.m97266j(alphaListFragment.getTAG(), "subList[" + alphaListFragment.f41305d0 + " - " + iMin + "], tokenBridgeId=" + arrayList);
        if (arrayList.isEmpty()) {
            C44128b.m97266j(alphaListFragment.getTAG(), "triggerFetchWsDataList no data no need Repeat!");
            return Unit.INSTANCE;
        }
        alphaListFragment.sendIntent(new AlphaListContract$UiIntent.FetchWsDataList(arrayList));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final String m50603j4(AlphaListFragment alphaListFragment) {
        String string;
        Bundle arguments = alphaListFragment.getArguments();
        if (arguments != null && (string = arguments.getString("type")) != null) {
            return string;
        }
        return "alpha_premium";
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m50617u4(AlphaListFragment alphaListFragment, int i11, boolean z11) {
        alphaListFragment.m50637n4().notifyItemChanged(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m50622x4(final AlphaListFragment alphaListFragment, boolean z11) {
        C4656c c4656cM50639q4 = alphaListFragment.m50639q4();
        if (c4656cM50639q4 == null) {
            return Unit.INSTANCE;
        }
        SwipeRefreshRecyclerView swipeRecyclerLayout = c4656cM50639q4.f4245c;
        Intrinsics.checkNotNullExpressionValue(swipeRecyclerLayout, "swipeRecyclerLayout");
        C27046k.m66685H(swipeRecyclerLayout);
        c4656cM50639q4.f4245c.setEnabled(true);
        final RecyclerView recyclerView = c4656cM50639q4.f4245c.getRecyclerView();
        if (z11 && alphaListFragment.m50637n4().getItemCount() > 0) {
            if (recyclerView.getChildCount() > 0) {
                Intrinsics.checkNotNull(recyclerView);
                alphaListFragment.m50636k4(recyclerView);
                alphaListFragment.m50643z4();
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(recyclerView);
            alphaListFragment.m50636k4(recyclerView);
            C21685b c21685b = alphaListFragment.new C21685b(recyclerView);
            alphaListFragment.f41307f0 = c21685b;
            recyclerView.addOnChildAttachStateChangeListener(c21685b);
            Runnable runnable = new Runnable() { // from class: com.kubi.quotefacade.alpha.list.u
                @Override // java.lang.Runnable
                public final void run() {
                    AlphaListFragment.m50624y4(this.f41372b, recyclerView);
                }
            };
            alphaListFragment.f41308g0 = runnable;
            recyclerView.postDelayed(runnable, 1500L);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(recyclerView);
        alphaListFragment.m50636k4(recyclerView);
        alphaListFragment.m50643z4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m50624y4(AlphaListFragment alphaListFragment, RecyclerView recyclerView) {
        Intrinsics.checkNotNull(recyclerView);
        alphaListFragment.m50636k4(recyclerView);
        if (alphaListFragment.getView() == null) {
            return;
        }
        alphaListFragment.m50643z4();
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m50626K4() {
        return !StringsKt.isBlank(m50614s4().getF41147b());
    }

    /* JADX INFO: renamed from: R4 */
    public final void m50629R4() {
        if (m50637n4().getData().isEmpty() && !m50626K4()) {
            return;
        }
        m50633e5(true);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m50620w4(this, false, 1, null);
        AlphaCountdownHelper.f41948a.m51884b();
        AlphaLongPressHelper.m51753k(this.f41303b0, false, 1, null);
        m50572P4(false);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        SwipeRefreshRecyclerView swipeRefreshRecyclerView;
        super.onShow();
        if (m50637n4().getData().isEmpty()) {
            showLoading();
            if (m50626K4()) {
                m50633e5(true);
            }
        } else {
            C4656c c4656cM50639q4 = m50639q4();
            if (c4656cM50639q4 != null && (swipeRefreshRecyclerView = c4656cM50639q4.f4245c) != null) {
                C22912t.m54417o(swipeRefreshRecyclerView, new Runnable() { // from class: com.kubi.quotefacade.alpha.list.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlphaListFragment.m50577S4(this.f41353b);
                    }
                }, 400L);
            }
        }
        if (m50638o4() == AlphaMenu.NEW && Intrinsics.areEqual(m50610p4(), "alpha_premium")) {
            C12572a.m23695d("com.kubi.home.feed.QuoteEvent:alpha_hide_new_count", null, 0L, 6, null);
        }
        m50572P4(true);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        m50642v4(true);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        super.showEmpty();
        m50642v4(false);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        m50631Z4();
    }
}
