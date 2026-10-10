package com.kubi.assets.finance;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCaller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.AutoEarnOpenDialog;
import com.kubi.assets.autoearn.views.AutoEarnEntryView;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.FinanceConfig;
import com.kubi.assets.finance.product.FinanceProductFragment;
import com.kubi.assets.overview.AssetV2OverviewAdapter;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27103z;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p637ta.C44844q0;
import p830zf.InterfaceC46798g;
import p852kotlin.Metadata;
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
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: FinanceFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u00017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010#\u001a\u00020!H\u0014J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u0016H\u0014J\b\u0010)\u001a\u00020!H\u0016J\b\u0010*\u001a\u00020!H\u0002J\b\u0010+\u001a\u00020!H\u0014J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0014J\u0012\u0010/\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u00101\u001a\u00020!H\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\"\u00102\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000204038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/finance/FinanceContract$UIState;", "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetFragmentFinanceBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetFragmentFinanceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "fragmentList", "Ljava/util/ArrayList;", "Lcom/kubi/sdk/BaseFragment;", "Lkotlin/collections/ArrayList;", "overviewEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "needRefreshAutoEarnState", "getLayout", "", "showVipEntrance", "getShowVipEntrance", "initView", "", "onResume", "bindFlowEvent", "onArguments", "bundle", "Landroid/os/Bundle;", "onViewHideOrShowToggle", TIMPushProvider.f75062n, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "loadData", "bindState", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "onAssetsGet", "myAssetEntity", "onRefresh", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nFinanceFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceFragment.kt\ncom/kubi/assets/finance/FinanceFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 6 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n147#2,16:272\n17#3,2:288\n153#4,7:290\n81#4,2:297\n81#4,2:299\n153#4,7:301\n135#5,2:308\n93#6,4:310\n93#6,4:314\n93#6,4:318\n93#6,4:322\n1869#7,2:326\n808#7,11:328\n1869#7,2:339\n*S KotlinDebug\n*F\n+ 1 FinanceFragment.kt\ncom/kubi/assets/finance/FinanceFragment\n*L\n58#1:272,16\n76#1:288,2\n145#1:290,7\n148#1:297,2\n156#1:299,2\n166#1:301,7\n205#1:308,2\n233#1:310,4\n236#1:314,4\n238#1:318,4\n240#1:322,4\n107#1:326,2\n115#1:328,11\n116#1:339,2\n*E\n"})
public final class FinanceFragment extends SimpleStateFragment<UIState> implements AssetV2Fragment.InterfaceC9449a, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f17384U = C45681e.m100799e(this, new Function1<FinanceFragment, C44844q0>() { // from class: com.kubi.assets.finance.FinanceFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44844q0 invoke(@NotNull FinanceFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44844q0.m99214a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44844q0, Unit>() { // from class: com.kubi.assets.finance.FinanceFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44844q0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44844q0 c44844q0) {
            invoke(c44844q0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    public ArrayList<BaseFragment> f17385V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public AssetV2OverviewEntity f17386W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public WrapperLoadingView f17387X;

    /* JADX INFO: renamed from: Y */
    public boolean f17388Y;

    /* JADX INFO: renamed from: Z */
    public boolean f17389Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f17390a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f17383c0 = {Reflection.property1(new PropertyReference1Impl(FinanceFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetFragmentFinanceBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f17382b0 = new Companion(null);

    /* JADX INFO: compiled from: FinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/finance/FinanceFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final FinanceFragment newInstance() {
            return new FinanceFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceFragment$bindState$2 */
    /* JADX INFO: compiled from: FinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/FinanceConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceFragment$bindState$2", m90122f = "FinanceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99552 extends SuspendLambda implements Function2<FinanceConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(FinanceConfig financeConfig, Continuation<? super Unit> continuation) {
            return ((C99552) create(financeConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C99552(Continuation<? super C99552> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99552 c99552 = FinanceFragment.this.new C99552(continuation);
            c99552.L$0 = obj;
            return c99552;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinanceHeaderView financeHeaderView;
            FinanceConfig financeConfig = (FinanceConfig) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44844q0 c44844q0M16679u3 = FinanceFragment.this.m16679u3();
            if (c44844q0M16679u3 != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null) {
                financeHeaderView.setConfig(financeConfig);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceFragment$bindState$4 */
    /* JADX INFO: compiled from: FinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceFragment$bindState$4", m90122f = "FinanceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99574 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C99574(Continuation<? super C99574> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99574 c99574 = FinanceFragment.this.new C99574(continuation);
            c99574.Z$0 = ((Boolean) obj).booleanValue();
            return c99574;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C99574) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinanceHeaderView financeHeaderView;
            AccountInfoHeaderView accountInfoHeader;
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44844q0 c44844q0M16679u3 = FinanceFragment.this.m16679u3();
            if (c44844q0M16679u3 != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null && (accountInfoHeader = financeHeaderView.getAccountInfoHeader()) != null) {
                IAssetAccountView.m20180c(accountInfoHeader, null, Boxing.boxBoolean(z11), 1, null);
            }
            C44844q0 c44844q0M16679u4 = FinanceFragment.this.m16679u3();
            ShowHideTextView.m54778d(c44844q0M16679u4 != null ? c44844q0M16679u4.f100657d : null, z11);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceFragment$bindState$6 */
    /* JADX INFO: compiled from: FinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceFragment$bindState$6", m90122f = "FinanceFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C99596 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C99596(Continuation<? super C99596> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C99596 c99596 = FinanceFragment.this.new C99596(continuation);
            c99596.L$0 = obj;
            return c99596;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C99596) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FinanceHeaderView financeHeaderView;
            AutoEarnEntryView autoEarnEntry;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44844q0 c44844q0M16679u3 = FinanceFragment.this.m16679u3();
            if (c44844q0M16679u3 != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null && (autoEarnEntry = financeHeaderView.getAutoEarnEntry()) != null) {
                autoEarnEntry.setStyle(str);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: A3 */
    private final void m16665A3() {
        C12572a.m23695d("event_refresh_overview", null, 0L, 6, null);
        sendIntent(FinanceContract$UiIntent.GetCoinList.INSTANCE);
        sendIntent(FinanceContract$UiIntent.GetFinanceConfig.INSTANCE);
    }

    /* JADX INFO: renamed from: w3 */
    public static final void m16675w3(DialogInterface dialogInterface) {
        C12572a.m23695d("AUTO_EARN_STATE_REFRESH", null, 0L, 6, null);
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m16676x3(FinanceFragment financeFragment) {
        financeFragment.f17389Z = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceFragment$a */
    /* JADX INFO: compiled from: FinanceFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/finance/FinanceFragment$initView$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9953a extends ViewPager.SimpleOnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m16678z3(FinanceFragment financeFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        financeFragment.sendIntent(new FinanceContract$UiIntent.HideOrShowNumber(bool.booleanValue()));
        ArrayList<BaseFragment> arrayList = financeFragment.f17385V;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof AssetV2OverviewAdapter.InterfaceC10586a) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AssetV2OverviewAdapter.InterfaceC10586a) it.next()).mo16633T2(bool.booleanValue());
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        KuCoinRefreshLayout kuCoinRefreshLayout;
        C44844q0 c44844q0M16679u3;
        FinanceHeaderView financeHeaderView;
        KuCoinRefreshLayout kuCoinRefreshLayout2;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof SingleEvent.C19247c) {
            C44844q0 c44844q0M16679u4 = m16679u3();
            if (c44844q0M16679u4 != null && (kuCoinRefreshLayout2 = c44844q0M16679u4.f100658e) != null) {
                kuCoinRefreshLayout2.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView = this.f17387X;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
        }
        if ((singleEvent instanceof C10004o) && (c44844q0M16679u3 = m16679u3()) != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null) {
            financeHeaderView.setConfig(FinanceConfig.INSTANCE.newInstance());
        }
        if (singleEvent instanceof C10006p) {
            ToastCompat.m66441G(((C10006p) singleEvent).getF17458a(), new Object[0]);
        }
        if (singleEvent instanceof C10027q) {
            C44844q0 c44844q0M16679u5 = m16679u3();
            if (c44844q0M16679u5 != null && (kuCoinRefreshLayout = c44844q0M16679u5.f100658e) != null) {
                kuCoinRefreshLayout.setRefreshing(false);
            }
            WrapperLoadingView wrapperLoadingView2 = this.f17387X;
            if (wrapperLoadingView2 != null) {
                wrapperLoadingView2.showContent();
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_fragment_finance;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF17467W() {
        return this.f17388Y;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FinanceViewModel.class);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        SwipeRefreshLayout.OnRefreshListener onRefreshListener;
        CustomViewPager customViewPager;
        ArrayList<BaseFragment> arrayList = this.f17385V;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        C44844q0 c44844q0M16679u3 = m16679u3();
        BaseFragment baseFragment = (BaseFragment) CollectionsKt.getOrNull(arrayList, C27039d.m66650j((c44844q0M16679u3 == null || (customViewPager = c44844q0M16679u3.f100660g) == null) ? null : Integer.valueOf(customViewPager.getCurrentItem())));
        if (baseFragment instanceof FinanceCommonFragment) {
            onRefreshListener = baseFragment != null ? (FinanceCommonFragment) baseFragment : null;
            if (onRefreshListener != null) {
                onRefreshListener.onRefresh();
                return;
            }
            return;
        }
        if (baseFragment instanceof FinanceVipFragment) {
            onRefreshListener = baseFragment != null ? (FinanceVipFragment) baseFragment : null;
            if (onRefreshListener != null) {
                onRefreshListener.onRefresh();
            }
        }
    }

    @Override // com.kubi.assets.AssetV2Fragment.InterfaceC9449a
    /* JADX INFO: renamed from: r2 */
    public void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity) {
        C44844q0 c44844q0M16679u3;
        FinanceHeaderView financeHeaderView;
        this.f17386W = assetV2OverviewEntity;
        if (getContext() == null || !isShowing() || assetV2OverviewEntity == null || (c44844q0M16679u3 = m16679u3()) == null || (financeHeaderView = c44844q0M16679u3.f100657d) == null) {
            return;
        }
        financeHeaderView.m16688e(assetV2OverviewEntity);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f17388Y = z11;
    }

    /* JADX INFO: renamed from: u3 */
    public final C44844q0 m16679u3() {
        return (C44844q0) this.f17384U.getValue(this, f17383c0[0]);
    }

    public FinanceFragment() {
        boolean zMo16861a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46798g.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            zMo16861a = ((InterfaceC46798g) objM56186h).mo16861a();
        } else {
            zMo16861a = false;
        }
        this.f17390a0 = zMo16861a;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m16674v3(FinanceFragment financeFragment) {
        Boolean boolValueOf;
        FinanceHeaderView financeHeaderView;
        AutoEarnEntryView autoEarnEntry;
        C44844q0 c44844q0M16679u3 = financeFragment.m16679u3();
        if (c44844q0M16679u3 != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null && (autoEarnEntry = financeHeaderView.getAutoEarnEntry()) != null) {
            boolValueOf = Boolean.valueOf(autoEarnEntry.getSwitchState());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            BaseDialogFragment baseDialogFragmentM54192r3 = AutoEarnOpenDialog.Companion.create$default(AutoEarnOpenDialog.f16556x0, null, null, 3, null).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.assets.finance.v
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    FinanceFragment.m16675w3(dialogInterface);
                }
            });
            FragmentManager childFragmentManager = financeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM54192r3.show(childFragmentManager, "AutoEarnOpenDialog");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m16677y3(FinanceFragment financeFragment) {
        financeFragment.m16665A3();
        ArrayList<BaseFragment> arrayList = financeFragment.f17385V;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList = null;
        }
        for (ActivityResultCaller activityResultCaller : arrayList) {
            if (activityResultCaller instanceof SwipeRefreshLayout.OnRefreshListener) {
                ((SwipeRefreshLayout.OnRefreshListener) activityResultCaller).onRefresh();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "EVENT_REFRESH_COIN".length();
        }
        C12572a.m23692a(this, false, new FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1("EVENT_REFRESH_COIN", null, this));
        if (c12573b.m23696a()) {
            "finance_query_currency".length();
        }
        C12572a.m23692a(this, true, new FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$1("finance_query_currency", null, this));
        if (c12573b.m23696a()) {
            "finance_pwm_query_currency".length();
        }
        C12572a.m23692a(this, true, new FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$2("finance_pwm_query_currency", null, this));
        if (c12573b.m23696a()) {
            "AUTO_EARN_STATE_REFRESH".length();
        }
        C12572a.m23692a(this, false, new FinanceFragment$bindFlowEvent$$inlined$bindFlowEvent$default$2("AUTO_EARN_STATE_REFRESH", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getConfig();
            }
        }, new C99552(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getUiHideNumberFlag());
            }
        }, new C99574(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.finance.FinanceFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getAutoEarnState();
            }
        }, new C99596(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        CoordinatorLayout coordinatorLayout;
        FinanceHeaderView financeHeaderView;
        AutoEarnEntryView autoEarnEntry;
        FinanceHeaderView financeHeaderView2;
        AutoEarnEntryView autoEarnEntry2;
        FinanceHeaderView financeHeaderView3;
        AccountInfoHeaderView accountInfoHeader;
        KuCoinRefreshLayout kuCoinRefreshLayout;
        CustomViewPager customViewPager;
        SlidingTabLayout slidingTabLayout;
        CustomViewPager customViewPager2;
        CustomViewPager customViewPager3;
        SlidingTabLayout slidingTabLayout2;
        FinanceHeaderView financeHeaderView4;
        super.initView();
        C44844q0 c44844q0M16679u3 = m16679u3();
        if (c44844q0M16679u3 != null) {
            coordinatorLayout = c44844q0M16679u3.f100656c;
        } else {
            coordinatorLayout = null;
        }
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(coordinatorLayout);
        this.f17387X = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            wrapperLoadingViewInjectView.showLoading();
        }
        C44844q0 c44844q0M16679u4 = m16679u3();
        if (c44844q0M16679u4 != null && (financeHeaderView4 = c44844q0M16679u4.f100657d) != null) {
            financeHeaderView4.setFragment(this);
        }
        ArrayList<BaseFragment> arrayList = new ArrayList<>();
        arrayList.add(FinanceCommonFragment.f17376W.newInstance());
        if (this.f17390a0) {
            arrayList.add(FinanceVipFragment.f17400Y.newInstance());
        }
        this.f17385V = arrayList;
        ArrayList arrayList2 = new ArrayList();
        C27017c c27017c = C27017c.f54310a;
        arrayList2.add(c27017c.m66516f(R$string.kc_finance_common_earn, new Object[0]));
        if (this.f17390a0) {
            arrayList2.add(c27017c.m66516f(R$string.kc_finance_vip_earn, new Object[0]));
        }
        C44844q0 c44844q0M16679u5 = m16679u3();
        if (c44844q0M16679u5 != null && (slidingTabLayout2 = c44844q0M16679u5.f100659f) != null) {
            slidingTabLayout2.setNeedBold(true);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        ArrayList<BaseFragment> arrayList3 = this.f17385V;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
            arrayList3 = null;
        }
        C27103z c27103z = new C27103z(childFragmentManager, arrayList3, arrayList2);
        C44844q0 c44844q0M16679u6 = m16679u3();
        if (c44844q0M16679u6 != null && (customViewPager3 = c44844q0M16679u6.f100660g) != null) {
            customViewPager3.setAdapter(c27103z);
        }
        C44844q0 c44844q0M16679u7 = m16679u3();
        if (c44844q0M16679u7 != null && (slidingTabLayout = c44844q0M16679u7.f100659f) != null) {
            C44844q0 c44844q0M16679u8 = m16679u3();
            if (c44844q0M16679u8 != null) {
                customViewPager2 = c44844q0M16679u8.f100660g;
            } else {
                customViewPager2 = null;
            }
            slidingTabLayout.setViewPager(customViewPager2);
        }
        C44844q0 c44844q0M16679u9 = m16679u3();
        if (c44844q0M16679u9 != null && (customViewPager = c44844q0M16679u9.f100660g) != null) {
            customViewPager.addOnPageChangeListener(new C9953a());
        }
        C44844q0 c44844q0M16679u10 = m16679u3();
        if (c44844q0M16679u10 != null && (kuCoinRefreshLayout = c44844q0M16679u10.f100658e) != null) {
            kuCoinRefreshLayout.m54650b(new Function0() { // from class: com.kubi.assets.finance.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceFragment.m16677y3(this.f17499b);
                }
            });
        }
        C44844q0 c44844q0M16679u11 = m16679u3();
        if (c44844q0M16679u11 != null && (financeHeaderView3 = c44844q0M16679u11.f100657d) != null && (accountInfoHeader = financeHeaderView3.getAccountInfoHeader()) != null) {
            IAssetAccountView.m20180c(accountInfoHeader, new Consumer() { // from class: com.kubi.assets.finance.s
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    FinanceFragment.m16678z3(this.f17500b, (Boolean) obj);
                }
            }, null, 2, null);
        }
        C44844q0 c44844q0M16679u12 = m16679u3();
        if (c44844q0M16679u12 != null && (financeHeaderView2 = c44844q0M16679u12.f100657d) != null && (autoEarnEntry2 = financeHeaderView2.getAutoEarnEntry()) != null) {
            autoEarnEntry2.setOnTouchCallback(new Function0() { // from class: com.kubi.assets.finance.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceFragment.m16674v3(this.f17501b);
                }
            });
        }
        C44844q0 c44844q0M16679u13 = m16679u3();
        if (c44844q0M16679u13 != null && (financeHeaderView = c44844q0M16679u13.f100657d) != null && (autoEarnEntry = financeHeaderView.getAutoEarnEntry()) != null) {
            autoEarnEntry.setManageClick(new Function0() { // from class: com.kubi.assets.finance.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinanceFragment.m16676x3(this.f17502b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        String strM56285z;
        String strM56285z2;
        String strM56285z3;
        Intent intent;
        Intent intent2;
        Intent intent3;
        AppBarLayout appBarLayout;
        CustomViewPager customViewPager;
        super.onArguments(bundle);
        if (bundle == null || (strM56285z = RouteExKt.m56285z(bundle, "from", "")) == null) {
            strM56285z = "";
        }
        if (strM56285z.length() > 0 && Intrinsics.areEqual(strM56285z, "finance")) {
            if (bundle == null || (strM56285z2 = RouteExKt.m56285z(bundle, "tab", "")) == null) {
                strM56285z2 = "";
            }
            if (bundle == null || (strM56285z3 = RouteExKt.m56285z(bundle, "type", "")) == null) {
                strM56285z3 = "";
            }
            if (Intrinsics.areEqual(strM56285z2, "product")) {
                C44844q0 c44844q0M16679u3 = m16679u3();
                if (c44844q0M16679u3 != null && (customViewPager = c44844q0M16679u3.f100660g) != null) {
                    customViewPager.setCurrentItem(1);
                }
                C44844q0 c44844q0M16679u4 = m16679u3();
                if (c44844q0M16679u4 != null && (appBarLayout = c44844q0M16679u4.f100655b) != null) {
                    appBarLayout.setExpanded(false, true);
                }
                FragmentActivity activity = getActivity();
                if (activity != null && (intent3 = activity.getIntent()) != null) {
                    intent3.putExtra("tab", "");
                }
                if (strM56285z3.length() > 0) {
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                        intent2.putExtra("type", "");
                    }
                    ArrayList<BaseFragment> arrayList = this.f17385V;
                    FinanceProductFragment financeProductFragment = null;
                    if (arrayList == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("fragmentList");
                        arrayList = null;
                    }
                    Object orNull = CollectionsKt.getOrNull(arrayList, 1);
                    if (orNull instanceof FinanceProductFragment) {
                        financeProductFragment = (FinanceProductFragment) orNull;
                    }
                    if (financeProductFragment != null) {
                        financeProductFragment.m16819p3(strM56285z3);
                    }
                }
            }
            FragmentActivity activity3 = getActivity();
            if (activity3 != null && (intent = activity3.getIntent()) != null) {
                intent.putExtra("from", "");
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f17389Z) {
            C12572a.m23695d("AUTO_EARN_STATE_REFRESH", null, 0L, 6, null);
            this.f17389Z = false;
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m16665A3();
        sendIntent(new FinanceContract$UiIntent.HideOrShowNumber(C46392a.m102322d(C42153h.f93593a.m92500D(), false)));
        sendIntent(FinanceContract$UiIntent.GetAutoEarnState.INSTANCE);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onViewHideOrShowToggle(boolean show) {
        AssetV2OverviewEntity assetV2OverviewEntity;
        C44844q0 c44844q0M16679u3;
        FinanceHeaderView financeHeaderView;
        super.onViewHideOrShowToggle(show);
        if (show && getContext() != null && (assetV2OverviewEntity = this.f17386W) != null && (c44844q0M16679u3 = m16679u3()) != null && (financeHeaderView = c44844q0M16679u3.f100657d) != null) {
            financeHeaderView.m16688e(assetV2OverviewEntity);
        }
    }
}
