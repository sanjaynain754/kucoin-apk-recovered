package com.kubi.assets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.KeyboardUtils;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.bot.BotAssetContainerFragment;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.BotAssetEntity;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.sort.AccountTabSortSettingFragment;
import com.kubi.assets.view.tab.AssetTabSortHelper;
import com.kubi.assets.view.tab.TabManager;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.BaseStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.redpackage.api.IRedPackageService;
import com.kubi.resources.widget.CustomViewPager;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p316hl.C38226a;
import p402kf.C41014a;
import p569qq.C43846g;
import p569qq.C43852m;
import p637ta.C44854r3;
import p852kotlin.Metadata;
import p852kotlin.Result;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AssetV2Fragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u000201B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020\u001aH\u0014J\b\u0010#\u001a\u00020\u001aH\u0002J\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u001aJ\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(J\b\u0010)\u001a\u00020\u0010H\u0016J\b\u0010*\u001a\u00020\u001aH\u0002J\b\u0010+\u001a\u00020\u001aH\u0016R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040-8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00062"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Fragment;", "Lcom/kubi/mvi/state/BaseStateFragment;", "Lcom/kubi/assets/AssetV2Contract$UiIntent;", "Lcom/kubi/assets/AssetV2Contract$UIState;", "Lcom/kubi/assets/AssetV2ViewModel;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/FragmentAssetv2Binding;", "getBinding", "()Lcom/kubi/assets/databinding/FragmentAssetv2Binding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "markToken", "Lcom/kubi/kucoin/helper/BackButtonHelper$MarkToken;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "tabManager", "Lcom/kubi/assets/view/tab/TabManager;", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initAdapter", "onArguments", "bundle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "updateBotHeaderView", "getUIState", "refresh", "changeTab", "key", "", "onBackPressed", "updateBackButtonVisibility", "onDestroyView", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "Companion", "IAssetsGet", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCFragmentCheck"})
@SourceDebugExtension({"SMAP\nAssetV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,230:1\n147#2,16:231\n153#3,7:247\n81#3,2:254\n81#3,2:256\n81#3,2:258\n44#4,2:260\n*S KotlinDebug\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment\n*L\n44#1:231,16\n65#1:247,7\n73#1:254,2\n76#1:256,2\n79#1:258,2\n217#1:260,2\n*E\n"})
public final class AssetV2Fragment extends BaseStateFragment<AssetV2Contract$UiIntent, UIState, AssetV2ViewModel> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f16337U = C45681e.m100799e(this, new Function1<AssetV2Fragment, C44854r3>() { // from class: com.kubi.assets.AssetV2Fragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44854r3 invoke(@NotNull AssetV2Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44854r3.m99232a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44854r3, Unit>() { // from class: com.kubi.assets.AssetV2Fragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44854r3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44854r3 c44854r3) {
            invoke(c44854r3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final C38226a.a f16338V = new C38226a.a();

    /* JADX INFO: renamed from: W */
    public boolean f16339W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public TabManager f16340X;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f16336Z = {Reflection.property1(new PropertyReference1Impl(AssetV2Fragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/FragmentAssetv2Binding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f16335Y = new Companion(null);

    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Fragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/AssetV2Fragment;", "SHOW_HIDE_SORT_BUTTON", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetV2Fragment newInstance() {
            return new AssetV2Fragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2Fragment$a */
    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;", "", "onAssetsGet", "", "myAssetEntity", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC9449a {
        /* JADX INFO: renamed from: r2 */
        void mo15196r2(@Nullable AssetV2OverviewEntity assetV2OverviewEntity);
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2Fragment$b */
    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/assets/AssetV2Fragment$initAdapter$1", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAssetV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment$initAdapter$1\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,230:1\n44#2,2:231\n*S KotlinDebug\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment$initAdapter$1\n*L\n112#1:231,2\n*E\n"})
    public static final class C9450b extends ViewPager.SimpleOnPageChangeListener {
        public C9450b() {
        }

        /* JADX INFO: renamed from: b */
        public static final void m15198b(AssetV2Fragment assetV2Fragment) {
            Object objM103844constructorimpl;
            FragmentActivity activity = assetV2Fragment.getActivity();
            if (activity != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    KeyboardUtils.m6033e(activity);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "hideSoftInput", false, null, 8, null), null, 2, null);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            Window window;
            View decorView;
            super.onPageSelected(position);
            FragmentActivity activity = AssetV2Fragment.this.getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                final AssetV2Fragment assetV2Fragment = AssetV2Fragment.this;
                decorView.post(new Runnable() { // from class: com.kubi.assets.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AssetV2Fragment.C9450b.m15198b(assetV2Fragment);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2Fragment$bindState$2 */
    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.AssetV2Fragment$bindState$2", m90122f = "AssetV2Fragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nAssetV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment$bindState$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n808#2,11:231\n774#2:242\n865#2,2:243\n1869#2,2:245\n*S KotlinDebug\n*F\n+ 1 AssetV2Fragment.kt\ncom/kubi/assets/AssetV2Fragment$bindState$2\n*L\n138#1:231,11\n139#1:242\n139#1:243,2\n140#1:245,2\n*E\n"})
    public static final class C94522 extends SuspendLambda implements Function2<AssetV2OverviewEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super Unit> continuation) {
            return ((C94522) create(assetV2OverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C94522(Continuation<? super C94522> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94522 c94522 = AssetV2Fragment.this.new C94522(continuation);
            c94522.L$0 = obj;
            return c94522;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<Fragment> listM20087f;
            AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TabManager tabManager = AssetV2Fragment.this.f16340X;
            if (tabManager != null && (listM20087f = tabManager.m20087f()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listM20087f) {
                    if (obj2 instanceof InterfaceC9449a) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    Object obj4 = (InterfaceC9449a) obj3;
                    boolean z11 = obj4 instanceof BaseFragment;
                    BaseFragment baseFragment = z11 ? (BaseFragment) obj4 : null;
                    if (baseFragment != null && baseFragment.isAdded()) {
                        BaseFragment baseFragment2 = z11 ? (BaseFragment) obj4 : null;
                        if ((baseFragment2 != null ? baseFragment2.getView() : null) != null) {
                            arrayList2.add(obj3);
                        }
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((InterfaceC9449a) it.next()).mo15196r2(assetV2OverviewEntity);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2Fragment$bindState$4 */
    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "data", "Lcom/kubi/assets/entity/BotAssetEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.AssetV2Fragment$bindState$4", m90122f = "AssetV2Fragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C94544 extends SuspendLambda implements Function2<BotAssetEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(BotAssetEntity botAssetEntity, Continuation<? super Unit> continuation) {
            return ((C94544) create(botAssetEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C94544(Continuation<? super C94544> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C94544 c94544 = AssetV2Fragment.this.new C94544(continuation);
            c94544.L$0 = obj;
            return c94544;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BotAssetContainerFragment botAssetContainerFragmentM20086e;
            BotAssetEntity botAssetEntity = (BotAssetEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String baseCurrencyName = botAssetEntity.getBaseCurrencyName();
            if (baseCurrencyName != null && baseCurrencyName.length() != 0) {
                TabManager tabManager = AssetV2Fragment.this.f16340X;
                BaseFragment baseFragmentM15833m3 = (tabManager == null || (botAssetContainerFragmentM20086e = tabManager.m20086e()) == null) ? null : botAssetContainerFragmentM20086e.m15833m3();
                if (baseFragmentM15833m3 != null) {
                    ITradingBotService iTradingBotServiceM19188i = AssetsDepend.f18689a.m19188i();
                    String baseCurrencyName2 = botAssetEntity.getBaseCurrencyName();
                    if (baseCurrencyName2 == null) {
                        baseCurrencyName2 = "";
                    }
                    iTradingBotServiceM19188i.mo64269m(baseFragmentM15833m3, baseCurrencyName2, C27041f.m66669i(botAssetEntity.getAssetsValue(), "--"), C27041f.m66669i(botAssetEntity.getAssetsValueLegal(), "--"));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.AssetV2Fragment$c */
    /* JADX INFO: compiled from: AssetV2Fragment.kt */
    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9455c implements Function0<Unit> {
        public C9455c() {
        }

        /* JADX INFO: renamed from: a */
        public final void m15199a() {
            AssetV2Fragment.this.m15195z3();
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m15199a();
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C44854r3 c44854r3M15191t3;
        CustomViewPager customViewPager;
        try {
            if (getViewLifecycleOwner().getLifecycle().getState() != Lifecycle.State.DESTROYED && (c44854r3M15191t3 = m15191t3()) != null && (customViewPager = c44854r3M15191t3.f100734h) != null) {
                customViewPager.removeCallbacks(null);
                customViewPager.setAdapter(null);
            }
        } catch (IllegalStateException e11) {
            C43846g.m96568c(new AssetsException(e11, "onDestroyView_clearViewPager", false, null, 8, null), null, 2, null);
        }
        this.f16340X = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m15187w3() {
        C38226a.f85925a.m86301c();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m15188x3(AssetV2Fragment assetV2Fragment) {
        AccountTabSortSettingFragment.Companion companion = AccountTabSortSettingFragment.f18757Z;
        Context contextRequireContext = assetV2Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.launchPageOnCase(contextRequireContext);
        C43852m.m96590b("B1overview", "functionSort", "1", TuplesKt.m90091to("after_page_id", "B1functionSortSetPage"), TuplesKt.m90091to("norm_version", "1"));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_assetv2;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF16339W() {
        return this.f16339W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<AssetV2ViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetV2ViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        SlidingTabLayout slidingTabLayout;
        ConstraintLayout constraintLayout;
        IRedPackageService.f43051a.get().mo53743a();
        C44854r3 c44854r3M15191t3 = m15191t3();
        if (c44854r3M15191t3 != null && (constraintLayout = c44854r3M15191t3.f100730d) != null) {
            constraintLayout.setPadding(0, EdgeToEdgeCompat.f48106a.m58272j(), 0, 0);
        }
        C44854r3 c44854r3M15191t4 = m15191t3();
        if (c44854r3M15191t4 != null && (slidingTabLayout = c44854r3M15191t4.f100732f) != null) {
            slidingTabLayout.setNeedBold(true);
        }
        m15193v3();
        C44854r3 c44854r3M15191t5 = m15191t3();
        if (c44854r3M15191t5 != null && (imageView = c44854r3M15191t5.f100729c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2Fragment.m15187w3();
                }
            }, 1, null);
        }
        C44854r3 c44854r3M15191t6 = m15191t3();
        if (c44854r3M15191t6 == null || (appCompatImageView = c44854r3M15191t6.f100728b) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.assets.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2Fragment.m15188x3(this.f18107b);
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        if (C38226a.f85925a.m86301c()) {
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: renamed from: s3 */
    public final void m15190s3(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        TabManager tabManager = this.f16340X;
        if (tabManager != null) {
            tabManager.m20093m(key);
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f16339W = z11;
    }

    /* JADX INFO: renamed from: t3 */
    public final C44854r3 m15191t3() {
        return (C44854r3) this.f16337U.getValue(this, f16336Z[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m15193v3() {
        CustomViewPager customViewPager;
        C44854r3 c44854r3M15191t3 = m15191t3();
        CustomViewPager customViewPager2 = c44854r3M15191t3 != null ? c44854r3M15191t3.f100734h : null;
        C44854r3 c44854r3M15191t4 = m15191t3();
        SlidingTabLayout slidingTabLayout = c44854r3M15191t4 != null ? c44854r3M15191t4.f100732f : null;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.f16340X = new TabManager(customViewPager2, slidingTabLayout, childFragmentManager);
        C44854r3 c44854r3M15191t5 = m15191t3();
        if (c44854r3M15191t5 == null || (customViewPager = c44854r3M15191t5.f100734h) == null) {
            return;
        }
        customViewPager.addOnPageChangeListener(new C9450b());
    }

    /* JADX INFO: renamed from: y3 */
    public final void m15194y3() {
        View view;
        ImageView imageView;
        boolean zM86299a = C38226a.f85925a.m86299a(this.f16338V);
        C44854r3 c44854r3M15191t3 = m15191t3();
        if (c44854r3M15191t3 != null && (imageView = c44854r3M15191t3.f100729c) != null) {
            AssetExKt.m15138z(imageView, zM86299a);
        }
        C44854r3 c44854r3M15191t4 = m15191t3();
        if (c44854r3M15191t4 == null || (view = c44854r3M15191t4.f100733g) == null) {
            return;
        }
        AssetExKt.m15138z(view, zM86299a);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m15195z3() {
        BotAssetContainerFragment botAssetContainerFragmentM20086e;
        TabManager tabManager = this.f16340X;
        BaseFragment baseFragmentM15833m3 = (tabManager == null || (botAssetContainerFragmentM20086e = tabManager.m20086e()) == null) ? null : botAssetContainerFragmentM20086e.m15833m3();
        if (baseFragmentM15833m3 == null || !baseFragmentM15833m3.isShowing()) {
            return;
        }
        sendIntent(new AssetV2Contract$UiIntent.UpdateAssetInfo(C41014a.m89921F(AssetsDepend.f18689a.m19188i().mo64267e(baseFragmentM15833m3), "0")));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m15189B0() {
        CustomViewPager customViewPager;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Fragment fragment;
        List<Fragment> listM20087f;
        Integer numValueOf4;
        CustomViewPager customViewPager2;
        List<Fragment> listM20087f2;
        CustomViewPager customViewPager3;
        CustomViewPager customViewPager4;
        C44854r3 c44854r3M15191t3 = m15191t3();
        SwipeRefreshLayout.OnRefreshListener onRefreshListener = null;
        if (c44854r3M15191t3 != null) {
            customViewPager = c44854r3M15191t3.f100734h;
        } else {
            customViewPager = null;
        }
        if (customViewPager != null) {
            C44854r3 c44854r3M15191t4 = m15191t3();
            if (c44854r3M15191t4 != null && (customViewPager4 = c44854r3M15191t4.f100734h) != null) {
                numValueOf = Integer.valueOf(customViewPager4.getCurrentItem());
            } else {
                numValueOf = null;
            }
            if (C27039d.m66650j(numValueOf) >= 0) {
                C44854r3 c44854r3M15191t5 = m15191t3();
                if (c44854r3M15191t5 != null && (customViewPager3 = c44854r3M15191t5.f100734h) != null) {
                    numValueOf2 = Integer.valueOf(customViewPager3.getCurrentItem());
                } else {
                    numValueOf2 = null;
                }
                int iM66650j = C27039d.m66650j(numValueOf2);
                TabManager tabManager = this.f16340X;
                if (tabManager != null && (listM20087f2 = tabManager.m20087f()) != null) {
                    numValueOf3 = Integer.valueOf(listM20087f2.size());
                } else {
                    numValueOf3 = null;
                }
                if (iM66650j < C27039d.m66650j(numValueOf3)) {
                    TabManager tabManager2 = this.f16340X;
                    if (tabManager2 != null && (listM20087f = tabManager2.m20087f()) != null) {
                        C44854r3 c44854r3M15191t6 = m15191t3();
                        if (c44854r3M15191t6 != null && (customViewPager2 = c44854r3M15191t6.f100734h) != null) {
                            numValueOf4 = Integer.valueOf(customViewPager2.getCurrentItem());
                        } else {
                            numValueOf4 = null;
                        }
                        fragment = listM20087f.get(C27039d.m66650j(numValueOf4));
                    } else {
                        fragment = null;
                    }
                    if (fragment instanceof SwipeRefreshLayout.OnRefreshListener) {
                        onRefreshListener = (SwipeRefreshLayout.OnRefreshListener) fragment;
                    }
                    if (onRefreshListener != null) {
                        onRefreshListener.onRefresh();
                    }
                }
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.AssetV2Fragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getOverviewData();
            }
        }, new C94522(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.AssetV2Fragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getBotAssetEntity();
            }
        }, new C94544(null));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onArguments(@Nullable Bundle bundle) {
        String strM56285z;
        Intent intent;
        super.onArguments(bundle);
        if (bundle == null || (strM56285z = RouteExKt.m56285z(bundle, "from", "")) == null) {
            strM56285z = "";
        }
        if (strM56285z.length() > 0) {
            m15190s3(strM56285z);
            FragmentActivity activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                intent.putExtra("from", "");
            }
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "event_refresh_overview".length();
        }
        C12572a.m23692a(this, false, new AssetV2Fragment$onCreate$$inlined$bindFlowEvent$default$1("event_refresh_overview", null, this));
        if (c12573b.m23696a()) {
            "event_asset_tab".length();
        }
        C12572a.m23692a(this, true, new AssetV2Fragment$onCreate$$inlined$bindFlowEvent$1("event_asset_tab", null, this));
        if (c12573b.m23696a()) {
            "ACCOUNT_SORT_CHANGE_EVENT".length();
        }
        C12572a.m23692a(this, true, new AssetV2Fragment$onCreate$$inlined$bindFlowEvent$2("ACCOUNT_SORT_CHANGE_EVENT", null));
        if (c12573b.m23696a()) {
            "SHOW_HIDE_SORT_BUTTON".length();
        }
        C12572a.m23692a(this, true, new AssetV2Fragment$onCreate$$inlined$bindFlowEvent$3("SHOW_HIDE_SORT_BUTTON", null, this));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m15194y3();
        AssetTabSortHelper.f19161a.m20073p();
    }

    @NotNull
    /* JADX INFO: renamed from: u3 */
    public final UIState m15192u3() {
        return getState();
    }
}
