package com.kubi.assets.futures.coins;

import android.content.Context;
import android.content.DialogInterface;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.C11351z0;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetFuturesEntity;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.EquityEntity;
import com.kubi.assets.entity.FuturesTrialAssets;
import com.kubi.assets.entity.SpotAccountOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.site.migration.SiteMigrationService;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.C27092t0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import f00.C37304a;
import g00.InterfaceC37752d;
import hb0.InterfaceC38162f;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.SectionEntity;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import jb0.InterfaceC40373g;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p294gz.C38057a;
import p402kf.C41016c;
import p569qq.C43852m;
import p637ta.C44740c3;
import p637ta.C44833o3;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 I2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001IB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u00103\u001a\u000204H\u0014J\b\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u000206H\u0016J\b\u00108\u001a\u000206H\u0016J\u0010\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020%H\u0014J\u0012\u0010;\u001a\u0002062\b\u0010<\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010=\u001a\u000206H\u0014J\b\u0010>\u001a\u000206H\u0014J\u0010\u0010?\u001a\u0002062\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u0002062\u0006\u0010@\u001a\u00020CH\u0002J\u0010\u0010D\u001a\u0002062\u0006\u0010E\u001a\u00020FH\u0014J\b\u0010G\u001a\u000206H\u0016J\b\u0010H\u001a\u000206H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u000e\u001a\u0004\b,\u0010-R\u001c\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0004008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006J"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsFragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIIntent;", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$UIState;", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsContract$AssetFuturesCoinsViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "<init>", "()V", "headerView", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsHeaderView;", "getHeaderView", "()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsHeaderView;", "headerView$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsAdapter;", "getAdapter", "()Lcom/kubi/assets/futures/coins/AssetFuturesCoinsAdapter;", "adapter$delegate", "footEmptyView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getFootEmptyView", "()Landroid/view/View;", "footEmptyView$delegate", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "mViewBinding", "Lcom/kubi/assets/databinding/FragmentAssetFuturesCoinsBinding;", "getMViewBinding", "()Lcom/kubi/assets/databinding/FragmentAssetFuturesCoinsBinding;", "mViewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "openView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getOpenView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "openView$delegate", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "initView", "", "onRefresh", "lazyLoad", "onViewHideOrShowToggle", TIMPushProvider.f75062n, "onAssetsGet", "myAssetEntity", "bindState", "bindFlowEvent", "showEquityAlertDialog", "equityData", "Lcom/kubi/assets/futures/coins/EquityData;", "showTrialAlertDialog", "Lcom/kubi/assets/entity/FuturesTrialAssets;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "sendFetchSpotPnlOverviewIntent", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFuturesCoinsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFuturesCoinsFragment.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,374:1\n147#2,16:375\n135#3,2:391\n81#4,2:393\n81#4,2:395\n158#4,2:397\n*S KotlinDebug\n*F\n+ 1 AssetFuturesCoinsFragment.kt\ncom/kubi/assets/futures/coins/AssetFuturesCoinsFragment\n*L\n83#1:375,16\n214#1:391,2\n282#1:393,2\n286#1:395,2\n289#1:397,2\n*E\n"})
public final class AssetFuturesCoinsFragment extends BaseStateFragment<AssetFuturesCoinsContract$UIIntent, UIState, AssetFuturesCoinsContract$AssetFuturesCoinsViewModel> implements SwipeRefreshLayout.OnRefreshListener, AssetV2Fragment.InterfaceC9449a {

    /* JADX INFO: renamed from: X */
    @Nullable
    public AssetV2OverviewEntity f17563X;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WrapperLoadingView f17565Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f17566a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f17559d0 = {Reflection.property1(new PropertyReference1Impl(AssetFuturesCoinsFragment.class, "mViewBinding", "getMViewBinding()Lcom/kubi/assets/databinding/FragmentAssetFuturesCoinsBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f17558c0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f17560U = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.futures.coins.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFuturesCoinsFragment.m16983U3(this.f17599b);
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17561V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.futures.coins.z
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFuturesCoinsFragment.m16981N3(this.f17600b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17562W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.futures.coins.a0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFuturesCoinsFragment.m16982O3(this.f17573b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f17564Y = C45681e.m100799e(this, new Function1<AssetFuturesCoinsFragment, C44833o3>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44833o3 invoke(@NotNull AssetFuturesCoinsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44833o3.m99192a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44833o3, Unit>() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44833o3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44833o3 c44833o3) {
            invoke(c44833o3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f17567b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.futures.coins.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFuturesCoinsFragment.m16995g4(this.f17577b);
        }
    });

    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/futures/coins/AssetFuturesCoinsFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetFuturesCoinsFragment newInstance() {
            return new AssetFuturesCoinsFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$10 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$10", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1008210 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return ((C1008210) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1008210(Continuation<? super C1008210> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1008210 c1008210 = AssetFuturesCoinsFragment.this.new C1008210(continuation);
            c1008210.L$0 = obj;
            return c1008210;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean bool = (Boolean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetFuturesCoinsFragment.this.m17017R3().setTrialCheckView(bool);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$12 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "overview", "Lcom/kubi/assets/entity/SpotAccountOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$12", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1008412 extends SuspendLambda implements Function2<SpotAccountOverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotAccountOverviewEntity spotAccountOverviewEntity, Continuation<? super Unit> continuation) {
            return ((C1008412) create(spotAccountOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1008412(Continuation<? super C1008412> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1008412 c1008412 = AssetFuturesCoinsFragment.this.new C1008412(continuation);
            c1008412.L$0 = obj;
            return c1008412;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotAccountOverviewEntity spotAccountOverviewEntity = (SpotAccountOverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetFuturesCoinsFragment.this.m17017R3().m17034g(spotAccountOverviewEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$2", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100852 extends SuspendLambda implements Function2<List<SectionEntity<BalanceEntity>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C100852(Continuation<? super C100852> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100852 c100852 = AssetFuturesCoinsFragment.this.new C100852(continuation);
            c100852.L$0 = obj;
            return c100852;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(List<SectionEntity<BalanceEntity>> list, Continuation<? super Unit> continuation) {
            return ((C100852) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetFuturesCoinsFragment.this.m17015P3().replaceData(C27024b.m66560c(list));
            if ((list == null || list.isEmpty()) && AssetsDepend.f18689a.m19189j().d0().isHasOpenContract()) {
                View viewM17016Q3 = AssetFuturesCoinsFragment.this.m17016Q3();
                Intrinsics.checkNotNullExpressionValue(viewM17016Q3, "access$getFootEmptyView(...)");
                ViewExtKt.m66594y(viewM17016Q3);
            } else {
                View viewM17016Q4 = AssetFuturesCoinsFragment.this.m17016Q3();
                Intrinsics.checkNotNullExpressionValue(viewM17016Q4, "access$getFootEmptyView(...)");
                ViewExtKt.m66577h(viewM17016Q4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetFuturesEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$4", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100874 extends SuspendLambda implements Function2<AssetFuturesEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetFuturesEntity assetFuturesEntity, Continuation<? super Unit> continuation) {
            return ((C100874) create(assetFuturesEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C100874(Continuation<? super C100874> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100874 c100874 = AssetFuturesCoinsFragment.this.new C100874(continuation);
            c100874.L$0 = obj;
            return c100874;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetFuturesCoinsFragment assetFuturesCoinsFragment;
            AssetV2OverviewEntity assetV2OverviewEntity;
            EquityEntity futureAsset;
            AssetFuturesEntity assetFuturesEntity = (AssetFuturesEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (assetFuturesEntity != null && (assetV2OverviewEntity = (assetFuturesCoinsFragment = AssetFuturesCoinsFragment.this).f17563X) != null && (futureAsset = assetV2OverviewEntity.getFutureAsset()) != null) {
                futureAsset.setTotalEquity(assetFuturesEntity.getTotalEquity());
                futureAsset.setTrialTotalEquity(assetFuturesEntity.getTrialTotalEquity());
                AssetV2OverviewEntity assetV2OverviewEntity2 = assetFuturesCoinsFragment.f17563X;
                if (assetV2OverviewEntity2 != null) {
                    assetV2OverviewEntity2.setBaseCurrencyName(assetFuturesEntity.getCurrency());
                }
                AssetV2OverviewEntity assetV2OverviewEntity3 = assetFuturesCoinsFragment.f17563X;
                if (assetV2OverviewEntity3 != null) {
                    assetV2OverviewEntity3.setBaseCurrency(assetFuturesEntity.getCurrency());
                }
                AssetV2OverviewEntity assetV2OverviewEntity4 = assetFuturesCoinsFragment.f17563X;
                if (assetV2OverviewEntity4 != null) {
                    assetFuturesCoinsFragment.m17017R3().m17033f(assetV2OverviewEntity4);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$6", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100896 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C100896(Continuation<? super C100896> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100896 c100896 = AssetFuturesCoinsFragment.this.new C100896(continuation);
            c100896.Z$0 = ((Boolean) obj).booleanValue();
            return c100896;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C100896) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ShowHideTextView.m54778d(AssetFuturesCoinsFragment.this.m17017R3(), z11);
            AccountInfoHeaderView accountInfoHeader = AssetFuturesCoinsFragment.this.m17017R3().getAccountInfoHeader();
            if (accountInfoHeader != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            AssetFuturesCoinsFragment.this.m17015P3().m16940u(z11);
            AssetFuturesCoinsFragment.this.m17015P3().notifyDataSetChanged();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$8 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/FuturesTrialAssets;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$bindState$8", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100918 extends SuspendLambda implements Function2<FuturesTrialAssets, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(FuturesTrialAssets futuresTrialAssets, Continuation<? super Unit> continuation) {
            return ((C100918) create(futuresTrialAssets, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C100918(Continuation<? super C100918> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C100918 c100918 = AssetFuturesCoinsFragment.this.new C100918(continuation);
            c100918.L$0 = obj;
            return c100918;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FuturesTrialAssets futuresTrialAssets = (FuturesTrialAssets) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (futuresTrialAssets != null) {
                AssetFuturesCoinsFragment.this.m17022l4(futuresTrialAssets);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$onShow$1 */
    /* JADX INFO: compiled from: AssetFuturesCoinsFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.futures.coins.AssetFuturesCoinsFragment$onShow$1", m90122f = "AssetFuturesCoinsFragment.kt", m90123i = {}, m90124l = {365}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C100931 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C100931(Continuation<? super C100931> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C100931(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C100931) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
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
                SiteMigrationService siteMigrationService = SiteMigrationService.f47924a;
                this.label = 1;
                if (siteMigrationService.m58150j(SearchCategory$Companion.FUTURES, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final AssetFuturesCoinsAdapter m16981N3(AssetFuturesCoinsFragment assetFuturesCoinsFragment) {
        int i11 = R$layout.item_asset_futures_account_coins;
        int i12 = R$layout.item_asset_futures_account_title;
        Context mContext = assetFuturesCoinsFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        return new AssetFuturesCoinsAdapter(i11, i12, null, mContext);
    }

    /* JADX INFO: renamed from: U3 */
    public static final AssetFuturesCoinsHeaderView m16983U3(AssetFuturesCoinsFragment assetFuturesCoinsFragment) {
        return new AssetFuturesCoinsHeaderView(assetFuturesCoinsFragment);
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m16984V3(AssetFuturesCoinsFragment assetFuturesCoinsFragment, Boolean bool) {
        WrapperLoadingView wrapperLoadingView = assetFuturesCoinsFragment.f17565Z;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        assetFuturesCoinsFragment.lazyLoad();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final void m16986X3(AssetFuturesCoinsFragment assetFuturesCoinsFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        assetFuturesCoinsFragment.sendIntent(new AssetFuturesCoinsContract$UIIntent.HideOrShowNumber(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: Y3 */
    public static final void m16987Y3(AssetFuturesCoinsFragment assetFuturesCoinsFragment, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        assetFuturesCoinsFragment.lazyLoad();
    }

    /* JADX INFO: renamed from: d4 */
    public static final Boolean m16992d4(LoginUserEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(AssetsDepend.f18689a.m19189j().d0().isHasOpenContract());
    }

    /* JADX INFO: renamed from: e4 */
    public static final Boolean m16993e4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m16994f4(C44833o3 c44833o3, AssetFuturesCoinsFragment assetFuturesCoinsFragment) {
        c44833o3.f100543d.setRefreshing(true);
        assetFuturesCoinsFragment.lazyLoad();
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m16996h4() {
        InterfaceC37752d.a.m85123b(C37304a.f82764a, "B6FuturesAccount", Boolean.FALSE, null, C43852m.m96602n("B6FuturesAccount", "ContractOpenConfirm", null, 4, null), null, null, 52, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m16997k4(EquityData equityData, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        viewHolder.setText(R$id.tvAmount, equityData.getAmount()).setText(R$id.tvPrice, equityData.getPrice()).setText(R$id.tvContent, equityData.getContent());
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m16999m4(FuturesTrialAssets futuresTrialAssets, int i11, AssetFuturesCoinsFragment assetFuturesCoinsFragment, BaseViewHolder holder, DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        BaseViewHolder text = holder.setText(R$id.amountValue, futuresTrialAssets.getBalance()).setText(R$id.amountCurrency, futuresTrialAssets.getBalanceLegal()).setText(R$id.pnlCurrency, futuresTrialAssets.getRealizedPnlLegal());
        int i12 = R$id.pnlValue;
        text.setText(i12, futuresTrialAssets.getRealizedPnl()).setText(R$id.amountLabel, i11);
        Context context = dialog.getContext();
        holder.setTextColor(i12, context != null ? C22890g.m54278c(context, futuresTrialAssets.getRealizedPnlNum(), R$color.c_text) : assetFuturesCoinsFragment.getColorRes(R$color.c_text));
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m17001n4(DialogInterface dialogInterface, int i11) {
        InterfaceC37752d.a.m85127f(C37304a.f82764a, null, null, null, null, 15, null);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: P3 */
    public final AssetFuturesCoinsAdapter m17015P3() {
        return (AssetFuturesCoinsAdapter) this.f17561V.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final View m17016Q3() {
        return (View) this.f17562W.getValue();
    }

    /* JADX INFO: renamed from: R3 */
    public final AssetFuturesCoinsHeaderView m17017R3() {
        return (AssetFuturesCoinsHeaderView) this.f17560U.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final C44833o3 m17018S3() {
        return (C44833o3) this.f17564Y.getValue(this, f17559d0[0]);
    }

    /* JADX INFO: renamed from: T3 */
    public final ConstraintLayout m17019T3() {
        return (ConstraintLayout) this.f17567b0.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        C44833o3 c44833o3M17018S3 = m17018S3();
        if (c44833o3M17018S3 == null || c44833o3M17018S3.f100543d == null || !(singleEvent instanceof SingleEvent.C19247c)) {
            return;
        }
        C44833o3 c44833o3M17018S4 = m17018S3();
        if (c44833o3M17018S4 != null && (kuCoinRefreshLayout = c44833o3M17018S4.f100543d) != null) {
            kuCoinRefreshLayout.setRefreshing(false);
        }
        WrapperLoadingView wrapperLoadingView = this.f17565Z;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_asset_futures_coins;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17566a0() {
        return this.f17566a0;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AssetFuturesCoinsContract$AssetFuturesCoinsViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetFuturesCoinsContract$AssetFuturesCoinsViewModel.class);
    }

    /* JADX INFO: renamed from: j4 */
    public final void m17021j4(final EquityData equityData) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kumex_assets_contain_trial).m54148E4(R$layout.bassets_dialog_equity_alert, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.assets.futures.coins.x
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                AssetFuturesCoinsFragment.m16997k4(equityData, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.already_know, null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        this.f17563X = assetV2OverviewEntity;
        m17020i4();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17566a0 = z11;
    }

    public AssetFuturesCoinsFragment() {
        setPageId("B6FuturesAccount");
    }

    /* JADX INFO: renamed from: O3 */
    public static final View m16982O3(AssetFuturesCoinsFragment assetFuturesCoinsFragment) {
        return assetFuturesCoinsFragment.getLayoutInflater().inflate(R$layout.view_empty, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m16985W3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m16988Z3(AssetFuturesCoinsFragment assetFuturesCoinsFragment, Boolean bool) {
        assetFuturesCoinsFragment.m17015P3().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m16989a4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m16990b4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m16991c4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static final ConstraintLayout m16995g4(AssetFuturesCoinsFragment assetFuturesCoinsFragment) {
        C44740c3 c44740c3M98991c = C44740c3.m98991c(assetFuturesCoinsFragment.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c44740c3M98991c, "inflate(...)");
        ConstraintLayout root = c44740c3M98991c.getRoot();
        KcPrimaryButton tvOpen = c44740c3M98991c.f99683j;
        Intrinsics.checkNotNullExpressionValue(tvOpen, "tvOpen");
        C27046k.m66711z(tvOpen, 0L, new Function0() { // from class: com.kubi.assets.futures.coins.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFuturesCoinsFragment.m16996h4();
            }
        }, 1, null);
        if (!AssetsDepend.m19180c().mo33284l() && C38057a.f85671a.m85928a("kcApp.B6FuturesTrade.futures.maxLeverage", true)) {
            String strValueOf = String.valueOf(AssetsDepend.m19180c().mo33277e());
            String string = assetFuturesCoinsFragment.getString(R$string.bkumex_open_contract_support_100_times_trade, strValueOf);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, strValueOf, 0, false, 6, (Object) null);
            int length = strValueOf.length();
            if (iIndexOf$default < 0) {
                length = string.length();
                iIndexOf$default = 0;
            }
            BaseTextView baseTextView = c44740c3M98991c.f99677d;
            C27096v0 c27096v0Append = new C27096v0().append(string);
            c27096v0Append.setSpan(new ForegroundColorSpan(root.getResources().getColor(R$color.primary)), iIndexOf$default, length + iIndexOf$default, 18);
            baseTextView.setText(c27096v0Append);
        } else {
            c44740c3M98991c.f99677d.setText(assetFuturesCoinsFragment.getString(R$string.open_contract_get_new_comer_reward));
        }
        ConstraintLayout root2 = c44740c3M98991c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.m66577h(root2);
        return root;
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m17003o4(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "equity_alert_dialog2".length();
        }
        C12572a.m23692a(this, true, new AssetFuturesCoinsFragment$bindFlowEvent$$inlined$bindFlowEvent$1("equity_alert_dialog2", null, this));
        if (c12573b.m23696a()) {
            "equity_alert_dialog".length();
        }
        C12572a.m23692a(this, true, new AssetFuturesCoinsFragment$bindFlowEvent$$inlined$bindFlowEvent$2("equity_alert_dialog", null, this));
        if (c12573b.m23696a()) {
            "trial_equity_key".length();
        }
        C12572a.m23692a(this, true, new AssetFuturesCoinsFragment$bindFlowEvent$$inlined$bindFlowEvent$3("trial_equity_key", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new C100852(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getFutureData();
            }
        }, new C100874(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C100896(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getTrialData();
            }
        }, new C100918(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getHasActiveTrial();
            }
        }, new C1008210(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.futures.coins.AssetFuturesCoinsFragment.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSpotPnlOverview();
            }
        }, new C1008412(null));
    }

    /* JADX INFO: renamed from: i4 */
    public final void m17020i4() {
        if (C11351z0.m20196k()) {
            sendIntent(AssetFuturesCoinsContract$UIIntent.FetchSpotPnlOverview.INSTANCE);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        Observable observableM = AssetsDepend.f18689a.m19189j().m();
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.futures.coins.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetFuturesCoinsFragment.m16992d4((LoginUserEntity) obj);
            }
        };
        Observable observableObserveOn = observableM.map(new Function() { // from class: com.kubi.assets.futures.coins.l
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return AssetFuturesCoinsFragment.m16993e4(function1, obj);
            }
        }).distinctUntilChanged().observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.futures.coins.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetFuturesCoinsFragment.m16984V3(this.f17591b, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.assets.futures.coins.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetFuturesCoinsFragment.m16985W3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        C44833o3 c44833o3M17018S3 = m17018S3();
        if (c44833o3M17018S3 != null) {
            WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(c44833o3M17018S3.f100542c);
            this.f17565Z = wrapperLoadingViewInjectView;
            if (wrapperLoadingViewInjectView != null) {
                wrapperLoadingViewInjectView.showLoading();
            }
            m17015P3().bindToRecyclerView(c44833o3M17018S3.f100542c);
            m17015P3().addFooterView(m17016Q3());
            View viewM17016Q3 = m17016Q3();
            Intrinsics.checkNotNullExpressionValue(viewM17016Q3, "<get-footEmptyView>(...)");
            ViewExtKt.m66577h(viewM17016Q3);
            m17015P3().addHeaderView(m17017R3());
            m17015P3().addFooterView(m17019T3());
            AccountInfoHeaderView accountInfoHeader = m17017R3().getAccountInfoHeader();
            if (accountInfoHeader != null) {
                IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.futures.coins.o
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        AssetFuturesCoinsFragment.m16986X3(this.f17593b, (Boolean) obj);
                    }
                }, null, 2, null);
            }
            c44833o3M17018S3.f100543d.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.assets.futures.coins.p
                @Override // jb0.InterfaceC40373g
                /* JADX INFO: renamed from: a */
                public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                    AssetFuturesCoinsFragment.m16987Y3(this.f17594b, interfaceC38162f);
                }
            });
        }
        Observable<Boolean> observableObserveOn2 = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.assets.futures.coins.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetFuturesCoinsFragment.m16988Z3(this.f17595b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.assets.futures.coins.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetFuturesCoinsFragment.m16989a4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.assets.futures.coins.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetFuturesCoinsFragment.m16990b4((Throwable) obj);
            }
        };
        addSubscription(observableObserveOn2.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.futures.coins.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetFuturesCoinsFragment.m16991c4(function4, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m17022l4(final FuturesTrialAssets futuresTrialAssets) {
        int i11;
        final int i12;
        boolean zM66897b = C27092t0.m66897b(futuresTrialAssets.getPrizeType());
        if (zM66897b) {
            i11 = R$string.kumex_airdrop_card_title;
        } else {
            i11 = R$string.kumex_welfare_trial;
        }
        if (zM66897b) {
            i12 = R$string.airdrop_balance;
        } else {
            i12 = R$string.kumex_welfare_trial_amount;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54161R4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54148E4(R$layout.bassets_dialog_equity_alert2, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.assets.futures.coins.k
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                AssetFuturesCoinsFragment.m16999m4(futuresTrialAssets, i12, this, baseViewHolder, dialogFragmentHelper);
            }
        }).m54167X4(i11).m54162S4(R$string.withdraw, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.futures.coins.v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                AssetFuturesCoinsFragment.m17001n4(dialogInterface, i13);
            }
        }).m54159P4(R$string.cancel, new DialogInterface.OnClickListener() { // from class: com.kubi.assets.futures.coins.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                AssetFuturesCoinsFragment.m17003o4(dialogInterface, i13);
            }
        }).m54161R4(0);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54161R4.show(childFragmentManager, "showEquityAlertDialog");
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        super.lazyLoad();
        if (!AssetsDepend.f18689a.m19189j().d0().isHasOpenContract()) {
            WrapperLoadingView wrapperLoadingView = this.f17565Z;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            C44833o3 c44833o3M17018S3 = m17018S3();
            if (c44833o3M17018S3 != null && (kuCoinRefreshLayout = c44833o3M17018S3.f100543d) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            ViewExtKt.m66594y(m17019T3());
            ViewExtKt.m66577h(m17017R3());
            return;
        }
        ViewExtKt.m66594y(m17017R3());
        ViewExtKt.m66577h(m17019T3());
        sendIntent(AssetFuturesCoinsContract$UIIntent.FetchFuturesList.INSTANCE);
        sendIntent(AssetFuturesCoinsContract$UIIntent.FetchTrialList.INSTANCE);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() throws Exception {
        RecyclerView recyclerView;
        final C44833o3 c44833o3M17018S3 = m17018S3();
        if (c44833o3M17018S3 != null && (recyclerView = c44833o3M17018S3.f100542c) != null) {
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
            AssetsHelper.m19146u(assetsHelper, recyclerView, null, new Action() { // from class: com.kubi.assets.futures.coins.c0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    AssetFuturesCoinsFragment.m16994f4(c44833o3M17018S3, this);
                }
            }, 2, null);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        C41696j.m91104d(LifecycleKt.getCoroutineScope(lifecycle), null, null, new C100931(null), 3, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null) {
            if (this.f17563X != null) {
                sendIntent(new AssetFuturesCoinsContract$UIIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
            }
            m17020i4();
        }
    }
}
