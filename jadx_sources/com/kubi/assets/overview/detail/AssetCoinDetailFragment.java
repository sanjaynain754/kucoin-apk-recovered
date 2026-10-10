package com.kubi.assets.overview.detail;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.autoearn.AutoEarnViewModel;
import com.kubi.assets.autoearn.views.AutoEarnCoinEntryView;
import com.kubi.assets.entity.AssetCoinDetailEntity;
import com.kubi.assets.entity.CurrencyBusinessDistributionTypeEnum;
import com.kubi.assets.entity.CurrencyDistributionItemResponse;
import com.kubi.assets.entity.CurrencyOverallCostInfoResponse;
import com.kubi.assets.entity.ShowOnGoingEntity;
import com.kubi.assets.entity.ShowOnGoingFutureEntity;
import com.kubi.assets.service.AssetsService;
import com.kubi.assets.service.C10921d;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.spot.api.ISpotService;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import gf.C37890n;
import gf.InterfaceC37888l;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nf.C42827a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p637ta.C44808l;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
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
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: AssetCoinDetailFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010+\u001a\u00020,H\u0014J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0016J\b\u00104\u001a\u00020.H\u0014J\u0012\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u000107H\u0002J\u0012\u0010;\u001a\u00020.2\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0012\u0010>\u001a\u00020.2\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\u0006\u0010A\u001a\u00020.J\u0006\u0010B\u001a\u00020.J\b\u0010C\u001a\u00020.H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b$\u0010\u000eR\"\u0010&\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020(0'8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006E"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/assets/overview/detail/AssetCoinDetailContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetCoinDetailLayoutBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetCoinDetailLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "loadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "Lkotlin/Lazy;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "getCoinInfoEntity", "()Lcom/kubi/data/entity/CoinInfoEntity;", "coinInfoEntity$delegate", "autoEarnViewModel", "Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "getAutoEarnViewModel", "()Lcom/kubi/assets/autoearn/AutoEarnViewModel;", "autoEarnViewModel$delegate", "costEditEnable", "getCostEditEnable", "costEditEnable$delegate", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "handleCoinDetailData", "assetCoinDetail", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "getCoinAmount", "Ljava/math/BigDecimal;", "assetCoinDetailEntity", "handleOngoingData", "showOnGoingEntity", "Lcom/kubi/assets/entity/ShowOnGoingEntity;", "handleFutureData", "showOnGoingFutureEntity", "Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;", "initAutoEarnEntry", "reloadAutoEarnState", "openEditAvgCost", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetCoinDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinDetailFragment.kt\ncom/kubi/assets/overview/detail/AssetCoinDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n147#2,16:288\n106#3,15:304\n1869#4,2:319\n1#5:321\n*S KotlinDebug\n*F\n+ 1 AssetCoinDetailFragment.kt\ncom/kubi/assets/overview/detail/AssetCoinDetailFragment\n*L\n64#1:288,16\n80#1:304,15\n182#1:319,2\n*E\n"})
public final class AssetCoinDetailFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f18307U;

    /* JADX INFO: renamed from: V */
    public boolean f18308V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public WrapperLoadingView f18309W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f18310X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f18311Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f18312Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f18313a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f18306c0 = {Reflection.property1(new PropertyReference1Impl(AssetCoinDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetCoinDetailLayoutBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f18305b0 = new Companion(null);

    /* JADX INFO: compiled from: AssetCoinDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/AssetCoinDetailFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "newInstance", "Lcom/kubi/assets/overview/detail/AssetCoinDetailFragment;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AssetCoinDetailFragment newInstance() {
            return new AssetCoinDetailFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$2 */
    /* JADX INFO: compiled from: AssetCoinDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$2", m90122f = "AssetCoinDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106632 extends SuspendLambda implements Function2<AssetCoinDetailEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(AssetCoinDetailEntity assetCoinDetailEntity, Continuation<? super Unit> continuation) {
            return ((C106632) create(assetCoinDetailEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C106632(Continuation<? super C106632> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106632 c106632 = AssetCoinDetailFragment.this.new C106632(continuation);
            c106632.L$0 = obj;
            return c106632;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AssetCoinDetailEntity assetCoinDetailEntity = (AssetCoinDetailEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailFragment.this.m18578S3(assetCoinDetailEntity);
            AssetCoinDetailFragment assetCoinDetailFragment = AssetCoinDetailFragment.this;
            assetCoinDetailFragment.m18580U3(AssetCoinDetailFragment.m18535F3(assetCoinDetailFragment).getShowOnGoingEntity());
            AssetCoinDetailFragment assetCoinDetailFragment2 = AssetCoinDetailFragment.this;
            assetCoinDetailFragment2.m18579T3(AssetCoinDetailFragment.m18535F3(assetCoinDetailFragment2).getShowOnGoingFutureEntity());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$4 */
    /* JADX INFO: compiled from: AssetCoinDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/ShowOnGoingEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$4", m90122f = "AssetCoinDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106654 extends SuspendLambda implements Function2<ShowOnGoingEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ShowOnGoingEntity showOnGoingEntity, Continuation<? super Unit> continuation) {
            return ((C106654) create(showOnGoingEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C106654(Continuation<? super C106654> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106654 c106654 = AssetCoinDetailFragment.this.new C106654(continuation);
            c106654.L$0 = obj;
            return c106654;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ShowOnGoingEntity showOnGoingEntity = (ShowOnGoingEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailFragment.this.m18580U3(showOnGoingEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$6 */
    /* JADX INFO: compiled from: AssetCoinDetailFragment.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/ShowOnGoingFutureEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.overview.detail.AssetCoinDetailFragment$bindState$6", m90122f = "AssetCoinDetailFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C106676 extends SuspendLambda implements Function2<ShowOnGoingFutureEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ShowOnGoingFutureEntity showOnGoingFutureEntity, Continuation<? super Unit> continuation) {
            return ((C106676) create(showOnGoingFutureEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C106676(Continuation<? super C106676> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C106676 c106676 = AssetCoinDetailFragment.this.new C106676(continuation);
            c106676.L$0 = obj;
            return c106676;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ShowOnGoingFutureEntity showOnGoingFutureEntity = (ShowOnGoingFutureEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AssetCoinDetailFragment.this.m18579T3(showOnGoingFutureEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m18544X3(AssetCoinDetailFragment assetCoinDetailFragment, boolean z11, String str) {
        BaseFragment.hideLoadingDialog$default(assetCoinDetailFragment, false, 1, null);
        if (z11) {
            assetCoinDetailFragment.m18583j4();
        } else {
            ToastCompat.m66441G(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m18545Y3(AssetCoinDetailFragment assetCoinDetailFragment, boolean z11, String str) {
        BaseFragment.hideLoadingDialog$default(assetCoinDetailFragment, false, 1, null);
        if (z11) {
            assetCoinDetailFragment.m18583j4();
        } else {
            ToastCompat.m66441G(str, new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m18548b4(AssetCoinDetailFragment assetCoinDetailFragment, String str) {
        C12572a.m23695d("event_ongoing_tab", str, 0L, 4, null);
        assetCoinDetailFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final boolean m18540K3(AssetCoinDetailFragment assetCoinDetailFragment) {
        return AssetApiRemoteConfig.f17838a.m17475d() && !C42827a.f94887a.m93899a(assetCoinDetailFragment.m18576P3().getCode());
    }

    /* JADX INFO: renamed from: R3 */
    private final String m18542R3() {
        return (String) this.f18310X.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m18543W3(C44808l c44808l, final AssetCoinDetailFragment assetCoinDetailFragment) {
        if (c44808l.f100319b.getIsOpen()) {
            assetCoinDetailFragment.showLoadingDialog();
            AutoEarnViewModel autoEarnViewModelM18573M3 = assetCoinDetailFragment.m18573M3();
            CoinInfoEntity coinInfoEntityM18576P3 = assetCoinDetailFragment.m18576P3();
            autoEarnViewModelM18573M3.m15425f(C27041f.m66668h(coinInfoEntityM18576P3 != null ? coinInfoEntityM18576P3.getCurrency() : null), new Function2() { // from class: com.kubi.assets.overview.detail.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetCoinDetailFragment.m18544X3(this.f18352b, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        } else {
            assetCoinDetailFragment.showLoadingDialog();
            AutoEarnViewModel autoEarnViewModelM18573M4 = assetCoinDetailFragment.m18573M3();
            CoinInfoEntity coinInfoEntityM18576P4 = assetCoinDetailFragment.m18576P3();
            autoEarnViewModelM18573M4.m15429p(C27041f.m66668h(coinInfoEntityM18576P4 != null ? coinInfoEntityM18576P4.getCurrency() : null), new Function2() { // from class: com.kubi.assets.overview.detail.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetCoinDetailFragment.m18545Y3(this.f18355b, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m18546Z3(AssetCoinDetailFragment assetCoinDetailFragment) {
        assetCoinDetailFragment.sendIntent(new AssetCoinDetailContract$UiIntent.GetFutureData(C27041f.m66668h(assetCoinDetailFragment.m18542R3())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m18550d4(String str) throws JSONException {
        ISpotService.m59982A(ISpotService.f49646a.get(), str, null, null, null, 14, null);
        CoinDetailTracker.f18371a.m18635c(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m18551e4(final AssetCoinDetailFragment assetCoinDetailFragment) {
        AssetsService assetsService = new AssetsService();
        FragmentManager childFragmentManager = assetCoinDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        assetsService.mo15340e(childFragmentManager, assetCoinDetailFragment.m18577Q3(), IUnifyAccountService.f53155a.get().mo64983G(), new Function0() { // from class: com.kubi.assets.overview.detail.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinDetailFragment.m18552f4(this.f18349b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m18554i4(AssetCoinDetailFragment assetCoinDetailFragment) {
        assetCoinDetailFragment.sendIntent(new AssetCoinDetailContract$UiIntent.GetCoinDetail(C27041f.m66668h(assetCoinDetailFragment.m18542R3())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public final AutoEarnViewModel m18573M3() {
        return (AutoEarnViewModel) this.f18312Z.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public final C44808l m18574N3() {
        return (C44808l) this.f18307U.getValue(this, f18306c0[0]);
    }

    /* JADX INFO: renamed from: O3 */
    public final BigDecimal m18575O3(AssetCoinDetailEntity assetCoinDetailEntity) {
        List<CurrencyDistributionItemResponse> distributionItems;
        BigDecimal element = BigDecimal.ZERO;
        if (assetCoinDetailEntity != null && (distributionItems = assetCoinDetailEntity.getDistributionItems()) != null) {
            Iterator<T> it = distributionItems.iterator();
            while (it.hasNext()) {
                BigDecimal totalAmount = ((CurrencyDistributionItemResponse) it.next()).getTotalAmount();
                if (totalAmount != null) {
                    element = element.add(totalAmount);
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(element, "element");
        return element;
    }

    @NotNull
    /* JADX INFO: renamed from: P3 */
    public final CoinInfoEntity m18576P3() {
        return (CoinInfoEntity) this.f18311Y.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final boolean m18577Q3() {
        return ((Boolean) this.f18313a0.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m18578S3(AssetCoinDetailEntity assetCoinDetailEntity) {
        CoinDetailAllocationView coinDetailAllocationView;
        CoinDetailHeadView coinDetailHeadView;
        CoinDetailPerformanceView coinDetailPerformanceView;
        FrameLayout frameLayout;
        if (assetCoinDetailEntity != null) {
            WrapperLoadingView wrapperLoadingView = this.f18309W;
            if (wrapperLoadingView != null) {
                wrapperLoadingView.showContent();
            }
            C44808l c44808lM18574N3 = m18574N3();
            if (c44808lM18574N3 != null && (frameLayout = c44808lM18574N3.f100326i) != null) {
                ViewExtKt.m66577h(frameLayout);
            }
        }
        C44808l c44808lM18574N4 = m18574N3();
        if (c44808lM18574N4 != null && (coinDetailPerformanceView = c44808lM18574N4.f100324g) != null) {
            coinDetailPerformanceView.m18631e(assetCoinDetailEntity, m18542R3(), m18577Q3());
        }
        BigDecimal bigDecimalM18575O3 = m18575O3(((UIState) getState()).getAssetCoinDetail());
        C44808l c44808lM18574N5 = m18574N3();
        if (c44808lM18574N5 != null && (coinDetailHeadView = c44808lM18574N5.f100323f) != null) {
            coinDetailHeadView.m18623a(C27041f.m66668h(m18542R3()), bigDecimalM18575O3);
        }
        C44808l c44808lM18574N6 = m18574N3();
        if (c44808lM18574N6 == null || (coinDetailAllocationView = c44808lM18574N6.f100320c) == null) {
            return;
        }
        AssetCoinDetailEntity assetCoinDetail = ((UIState) getState()).getAssetCoinDetail();
        coinDetailAllocationView.setAllocationData(assetCoinDetail != null ? assetCoinDetail.getDistributionItems() : null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.asset_coin_detail_layout;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF37691d0() {
        return this.f18308V;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(AssetCoinDetailViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m18582h4() {
        CurrencyOverallCostInfoResponse overallCostInfo;
        BigDecimal costUsdt;
        AssetsService assetsService = new AssetsService();
        String strM66668h = C27041f.m66668h(m18542R3());
        AssetCoinDetailEntity assetCoinDetail = ((UIState) getState()).getAssetCoinDetail();
        assetsService.mo15352r(this, strM66668h, (assetCoinDetail == null || (overallCostInfo = assetCoinDetail.getOverallCostInfo()) == null || (costUsdt = overallCostInfo.getCostUsdt()) == null) ? null : costUsdt.toPlainString(), new Function0() { // from class: com.kubi.assets.overview.detail.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinDetailFragment.m18554i4(this.f18346b);
            }
        }, "B1overviewCoin", "spotFundsEditAvgCost");
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f18308V = z11;
    }

    public AssetCoinDetailFragment() {
        setPageId("B1overviewCoin");
        this.f18307U = C45681e.m100799e(this, new Function1<AssetCoinDetailFragment, C44808l>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44808l invoke(@NotNull AssetCoinDetailFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C44808l.m99136a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C44808l, Unit>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C44808l it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C44808l c44808l) {
                invoke(c44808l);
                return Unit.INSTANCE;
            }
        });
        this.f18310X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.detail.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinDetailFragment.m18541L3(this.f18374b);
            }
        });
        this.f18311Y = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.detail.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinDetailFragment.m18539J3(this.f18375b);
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f18312Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AutoEarnViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f18313a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.overview.detail.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AssetCoinDetailFragment.m18540K3(this.f18376b));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F3 */
    public static final /* synthetic */ UIState m18535F3(AssetCoinDetailFragment assetCoinDetailFragment) {
        return (UIState) assetCoinDetailFragment.getState();
    }

    /* JADX INFO: renamed from: J3 */
    public static final CoinInfoEntity m18539J3(AssetCoinDetailFragment assetCoinDetailFragment) {
        String strM56284y;
        String str;
        Bundle arguments = assetCoinDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "coin");
        } else {
            strM56284y = null;
        }
        String strM66668h = C27041f.m66668h(strM56284y);
        C37890n c37890n = C37890n.f85269a;
        if (strM66668h == null) {
            str = "";
        } else {
            str = strM66668h;
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        if (coinInfoEntityM85613u == null) {
            CoinInfoEntity coinInfoEntity = new CoinInfoEntity();
            coinInfoEntity.setCode(strM66668h);
            coinInfoEntity.setCurrency(strM66668h);
            return coinInfoEntity;
        }
        return coinInfoEntityM85613u;
    }

    /* JADX INFO: renamed from: L3 */
    public static final String m18541L3(AssetCoinDetailFragment assetCoinDetailFragment) {
        String strM56284y;
        Bundle arguments = assetCoinDetailFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "coin");
        } else {
            strM56284y = null;
        }
        return C27041f.m66668h(strM56284y);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m18547a4(String str) {
        if (Intrinsics.areEqual(str, "subaccount")) {
            return Unit.INSTANCE;
        }
        InterfaceC37754f.a.m85130b(C37304a.f82764a, str, null, null, null, 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m18549c4(AssetCoinDetailFragment assetCoinDetailFragment) {
        assetCoinDetailFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m18552f4(AssetCoinDetailFragment assetCoinDetailFragment) {
        assetCoinDetailFragment.m18582h4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m18553g4(AssetCoinDetailFragment assetCoinDetailFragment) {
        assetCoinDetailFragment.m18582h4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m18555k4(AssetCoinDetailFragment assetCoinDetailFragment, boolean z11) {
        BaseTextView baseTextView;
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        AutoEarnCoinEntryView autoEarnCoinEntryView2;
        C44808l c44808lM18574N3 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N3 != null && (autoEarnCoinEntryView2 = c44808lM18574N3.f100319b) != null) {
            ViewExtKt.m66594y(autoEarnCoinEntryView2);
        }
        C44808l c44808lM18574N4 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N4 != null && (autoEarnCoinEntryView = c44808lM18574N4.f100319b) != null) {
            autoEarnCoinEntryView.setIsOpen(z11);
        }
        C44808l c44808lM18574N5 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N5 != null && (baseTextView = c44808lM18574N5.f100332o) != null) {
            ViewExtKt.m66594y(baseTextView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m18556l4(AssetCoinDetailFragment assetCoinDetailFragment, String str) {
        BaseTextView baseTextView;
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        AutoEarnCoinEntryView autoEarnCoinEntryView2;
        C44808l c44808lM18574N3 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N3 != null && (autoEarnCoinEntryView2 = c44808lM18574N3.f100319b) != null) {
            ViewExtKt.m66594y(autoEarnCoinEntryView2);
        }
        C44808l c44808lM18574N4 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N4 != null && (autoEarnCoinEntryView = c44808lM18574N4.f100319b) != null) {
            autoEarnCoinEntryView.setIsOpen(false);
        }
        C44808l c44808lM18574N5 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N5 != null && (baseTextView = c44808lM18574N5.f100332o) != null) {
            ViewExtKt.m66594y(baseTextView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m18558m4(AssetCoinDetailFragment assetCoinDetailFragment, String str) {
        BaseTextView baseTextView;
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        C44808l c44808lM18574N3 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N3 != null && (autoEarnCoinEntryView = c44808lM18574N3.f100319b) != null) {
            ViewExtKt.m66577h(autoEarnCoinEntryView);
        }
        C44808l c44808lM18574N4 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N4 != null && (baseTextView = c44808lM18574N4.f100332o) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m18560n4(AssetCoinDetailFragment assetCoinDetailFragment, String str) {
        BaseTextView baseTextView;
        AutoEarnCoinEntryView autoEarnCoinEntryView;
        C44808l c44808lM18574N3 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N3 != null && (autoEarnCoinEntryView = c44808lM18574N3.f100319b) != null) {
            ViewExtKt.m66577h(autoEarnCoinEntryView);
        }
        C44808l c44808lM18574N4 = assetCoinDetailFragment.m18574N3();
        if (c44808lM18574N4 != null && (baseTextView = c44808lM18574N4.f100332o) != null) {
            ViewExtKt.m66577h(baseTextView);
        }
        ToastCompat.m66441G(str, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m18579T3(ShowOnGoingFutureEntity showOnGoingFutureEntity) {
        CurrencyDistributionItemResponse currencyDistributionItemResponse;
        CoinDetailAllocationView coinDetailAllocationView;
        Integer futureSize;
        Boolean boolIsShowOngoingFuture;
        List<CurrencyDistributionItemResponse> distributionItems;
        Object next;
        AssetCoinDetailEntity assetCoinDetail = ((UIState) getState()).getAssetCoinDetail();
        List<CurrencyDistributionItemResponse> distributionItems2 = null;
        if (assetCoinDetail != null && (distributionItems = assetCoinDetail.getDistributionItems()) != null) {
            Iterator<T> it = distributionItems.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (((CurrencyDistributionItemResponse) next).getBusinessType() != CurrencyBusinessDistributionTypeEnum.FUTURES);
            currencyDistributionItemResponse = (CurrencyDistributionItemResponse) next;
        } else {
            currencyDistributionItemResponse = null;
        }
        if (currencyDistributionItemResponse != null) {
            if (showOnGoingFutureEntity != null) {
                boolIsShowOngoingFuture = showOnGoingFutureEntity.isShowOngoingFuture();
            } else {
                boolIsShowOngoingFuture = null;
            }
            currencyDistributionItemResponse.setShowOnGoing(Boolean.valueOf(C27025c.m66566d(boolIsShowOngoingFuture)));
        }
        if (currencyDistributionItemResponse != null) {
            if (showOnGoingFutureEntity != null) {
                futureSize = showOnGoingFutureEntity.getFutureSize();
            } else {
                futureSize = null;
            }
            currencyDistributionItemResponse.setOnGoingCount(Integer.valueOf(C27039d.m66650j(futureSize)));
        }
        C44808l c44808lM18574N3 = m18574N3();
        if (c44808lM18574N3 != null && (coinDetailAllocationView = c44808lM18574N3.f100320c) != null) {
            AssetCoinDetailEntity assetCoinDetail2 = ((UIState) getState()).getAssetCoinDetail();
            if (assetCoinDetail2 != null) {
                distributionItems2 = assetCoinDetail2.getDistributionItems();
            }
            coinDetailAllocationView.setAllocationData(distributionItems2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final void m18580U3(ShowOnGoingEntity showOnGoingEntity) {
        CurrencyDistributionItemResponse currencyDistributionItemResponse;
        CoinDetailAllocationView coinDetailAllocationView;
        Integer earnSize;
        Boolean boolIsShowOngoingEarn;
        List<CurrencyDistributionItemResponse> distributionItems;
        Object next;
        List<CurrencyDistributionItemResponse> distributionItems2;
        Object next2;
        Boolean boolIsShowOngoingBot;
        List<CurrencyDistributionItemResponse> distributionItems3;
        Object next3;
        Boolean boolIsShowOngoingMargin;
        AssetCoinDetailEntity assetCoinDetail = ((UIState) getState()).getAssetCoinDetail();
        List<CurrencyDistributionItemResponse> distributionItems4 = null;
        if (assetCoinDetail != null && (distributionItems3 = assetCoinDetail.getDistributionItems()) != null) {
            Iterator<T> it = distributionItems3.iterator();
            do {
                if (it.hasNext()) {
                    next3 = it.next();
                } else {
                    next3 = null;
                    break;
                }
            } while (((CurrencyDistributionItemResponse) next3).getBusinessType() != CurrencyBusinessDistributionTypeEnum.MARGIN);
            CurrencyDistributionItemResponse currencyDistributionItemResponse2 = (CurrencyDistributionItemResponse) next3;
            if (currencyDistributionItemResponse2 != null) {
                if (showOnGoingEntity != null) {
                    boolIsShowOngoingMargin = showOnGoingEntity.isShowOngoingMargin();
                } else {
                    boolIsShowOngoingMargin = null;
                }
                currencyDistributionItemResponse2.setShowOnGoing(Boolean.valueOf(C27025c.m66566d(boolIsShowOngoingMargin)));
            }
        }
        AssetCoinDetailEntity assetCoinDetail2 = ((UIState) getState()).getAssetCoinDetail();
        if (assetCoinDetail2 != null && (distributionItems2 = assetCoinDetail2.getDistributionItems()) != null) {
            Iterator<T> it2 = distributionItems2.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = it2.next();
                } else {
                    next2 = null;
                    break;
                }
            } while (((CurrencyDistributionItemResponse) next2).getBusinessType() != CurrencyBusinessDistributionTypeEnum.ROBOT_ACCOUNT);
            CurrencyDistributionItemResponse currencyDistributionItemResponse3 = (CurrencyDistributionItemResponse) next2;
            if (currencyDistributionItemResponse3 != null) {
                if (showOnGoingEntity != null) {
                    boolIsShowOngoingBot = showOnGoingEntity.isShowOngoingBot();
                } else {
                    boolIsShowOngoingBot = null;
                }
                currencyDistributionItemResponse3.setShowOnGoing(Boolean.valueOf(C27025c.m66566d(boolIsShowOngoingBot)));
            }
        }
        AssetCoinDetailEntity assetCoinDetail3 = ((UIState) getState()).getAssetCoinDetail();
        if (assetCoinDetail3 != null && (distributionItems = assetCoinDetail3.getDistributionItems()) != null) {
            Iterator<T> it3 = distributionItems.iterator();
            do {
                if (it3.hasNext()) {
                    next = it3.next();
                } else {
                    next = null;
                    break;
                }
            } while (((CurrencyDistributionItemResponse) next).getBusinessType() != CurrencyBusinessDistributionTypeEnum.EARN);
            currencyDistributionItemResponse = (CurrencyDistributionItemResponse) next;
        } else {
            currencyDistributionItemResponse = null;
        }
        if (currencyDistributionItemResponse != null) {
            if (showOnGoingEntity != null) {
                boolIsShowOngoingEarn = showOnGoingEntity.isShowOngoingEarn();
            } else {
                boolIsShowOngoingEarn = null;
            }
            currencyDistributionItemResponse.setShowOnGoing(Boolean.valueOf(C27025c.m66566d(boolIsShowOngoingEarn)));
        }
        if (currencyDistributionItemResponse != null) {
            if (showOnGoingEntity != null) {
                earnSize = showOnGoingEntity.getEarnSize();
            } else {
                earnSize = null;
            }
            currencyDistributionItemResponse.setOnGoingCount(Integer.valueOf(C27039d.m66650j(earnSize)));
        }
        C44808l c44808lM18574N3 = m18574N3();
        if (c44808lM18574N3 != null && (coinDetailAllocationView = c44808lM18574N3.f100320c) != null) {
            AssetCoinDetailEntity assetCoinDetail4 = ((UIState) getState()).getAssetCoinDetail();
            if (assetCoinDetail4 != null) {
                distributionItems4 = assetCoinDetail4.getDistributionItems();
            }
            coinDetailAllocationView.setAllocationData(distributionItems4);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m18581V3() {
        String currency;
        final C44808l c44808lM18574N3 = m18574N3();
        if (c44808lM18574N3 != null) {
            BaseTextView baseTextView = c44808lM18574N3.f100332o;
            String string = getResources().getString(R$string.kc_auto_earn_with_coin);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{C10921d.m19190a(m18542R3())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            baseTextView.setText(str);
            AutoEarnCoinEntryView autoEarnCoinEntryView = c44808lM18574N3.f100319b;
            CoinInfoEntity coinInfoEntityM18576P3 = m18576P3();
            if (coinInfoEntityM18576P3 != null) {
                currency = coinInfoEntityM18576P3.getCurrency();
            } else {
                currency = null;
            }
            autoEarnCoinEntryView.setDesc(C27041f.m66668h(currency));
            c44808lM18574N3.f100319b.setOnTouchCallback(new Function0() { // from class: com.kubi.assets.overview.detail.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCoinDetailFragment.m18543W3(c44808lM18574N3, this);
                }
            });
        }
        m18583j4();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getAssetCoinDetail();
            }
        }, new C106632(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowOnGoingEntity();
            }
        }, new C106654(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.assets.overview.detail.AssetCoinDetailFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getShowOnGoingFutureEntity();
            }
        }, new C106676(null));
    }

    /* JADX INFO: renamed from: j4 */
    public final void m18583j4() {
        String code;
        AutoEarnViewModel autoEarnViewModelM18573M3 = m18573M3();
        CoinInfoEntity coinInfoEntityM18576P3 = m18576P3();
        if (coinInfoEntityM18576P3 != null) {
            code = coinInfoEntityM18576P3.getCode();
        } else {
            code = null;
        }
        autoEarnViewModelM18573M3.m15426g(C27041f.m66668h(code), new Function1() { // from class: com.kubi.assets.overview.detail.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCoinDetailFragment.m18555k4(this.f18358b, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.kubi.assets.overview.detail.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCoinDetailFragment.m18556l4(this.f18361b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.assets.overview.detail.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCoinDetailFragment.m18558m4(this.f18363b, (String) obj);
            }
        }, new Function1() { // from class: com.kubi.assets.overview.detail.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetCoinDetailFragment.m18560n4(this.f18366b, (String) obj);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(new AssetCoinDetailContract$UiIntent.GetCoinDetail(C27041f.m66668h(m18542R3())));
        sendIntent(new AssetCoinDetailContract$UiIntent.GetOnGoingData(C27041f.m66668h(m18542R3())));
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: com.kubi.assets.overview.detail.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetCoinDetailFragment.m18546Z3(this.f18377b);
            }
        });
        m18581V3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        View view2;
        String iconUrl;
        CoinAvatarView coinAvatarView;
        ImageView imageView;
        CoinDetailAllocationView coinDetailAllocationView;
        CoinDetailAllocationView coinDetailAllocationView2;
        CoinDetailPerformanceView coinDetailPerformanceView;
        CoinDetailPerformanceView coinDetailPerformanceView2;
        CoinDetailButtonView coinDetailButtonView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        CoinDetailAllocationView coinDetailAllocationView3;
        BaseTextView baseTextView;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44808l c44808lM18574N3 = m18574N3();
        if (c44808lM18574N3 != null) {
            view2 = c44808lM18574N3.f100330m;
        } else {
            view2 = null;
        }
        this.f18309W = WrapperLoadingView.injectView(view2);
        ViewExtKt.m66577h(getTitleBar());
        C44808l c44808lM18574N4 = m18574N3();
        if (c44808lM18574N4 != null && (frameLayout = c44808lM18574N4.f100326i) != null) {
            ViewExtKt.m66594y(frameLayout);
        }
        WrapperLoadingView wrapperLoadingView = this.f18309W;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        C44808l c44808lM18574N5 = m18574N3();
        if (c44808lM18574N5 != null && (baseTextView = c44808lM18574N5.f100333p) != null) {
            baseTextView.setText(C10921d.m19190a(m18542R3()));
        }
        CoinDetailTracker.f18371a.m18641j(C27041f.m66668h(m18542R3()));
        C44808l c44808lM18574N6 = m18574N3();
        if (c44808lM18574N6 != null && (coinDetailAllocationView3 = c44808lM18574N6.f100320c) != null) {
            coinDetailAllocationView3.setCurrency(m18542R3());
        }
        C37890n c37890n = C37890n.f85269a;
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h(m18542R3()));
        if (coinInfoEntityM85613u != null) {
            iconUrl = coinInfoEntityM85613u.getIconUrl();
        } else {
            iconUrl = null;
        }
        C44808l c44808lM18574N7 = m18574N3();
        if (c44808lM18574N7 != null) {
            coinAvatarView = c44808lM18574N7.f100328k;
        } else {
            coinAvatarView = null;
        }
        C24277v.m58542g(coinAvatarView, iconUrl);
        C44808l c44808lM18574N8 = m18574N3();
        if (c44808lM18574N8 != null && (imageView4 = c44808lM18574N8.f100327j) != null) {
            C27046k.m66711z(imageView4, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCoinDetailFragment.m18549c4(this.f18341b);
                }
            }, 1, null);
        }
        final String strM85586i = InterfaceC37888l.m85586i(c37890n, C27041f.m66668h(m18542R3()), null, 2, null);
        if (c37890n.m85603D(strM85586i) != null) {
            C44808l c44808lM18574N9 = m18574N3();
            if (c44808lM18574N9 != null && (imageView3 = c44808lM18574N9.f100329l) != null) {
                ViewExtKt.m66594y(imageView3);
            }
            C44808l c44808lM18574N10 = m18574N3();
            if (c44808lM18574N10 != null && (imageView2 = c44808lM18574N10.f100329l) != null) {
                C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetCoinDetailFragment.m18550d4(strM85586i);
                    }
                }, 1, null);
            }
        } else {
            C44808l c44808lM18574N11 = m18574N3();
            if (c44808lM18574N11 != null && (imageView = c44808lM18574N11.f100329l) != null) {
                C27046k.m66703r(imageView);
            }
        }
        C44808l c44808lM18574N12 = m18574N3();
        if (c44808lM18574N12 != null && (coinDetailButtonView = c44808lM18574N12.f100321d) != null) {
            coinDetailButtonView.m18622g(C27041f.m66668h(m18542R3()));
        }
        C44808l c44808lM18574N13 = m18574N3();
        if (c44808lM18574N13 != null && (coinDetailPerformanceView2 = c44808lM18574N13.f100324g) != null) {
            coinDetailPerformanceView2.setOnCostPriceTitleClick(new Function0() { // from class: com.kubi.assets.overview.detail.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCoinDetailFragment.m18551e4(this.f18370b);
                }
            });
        }
        C44808l c44808lM18574N14 = m18574N3();
        if (c44808lM18574N14 != null && (coinDetailPerformanceView = c44808lM18574N14.f100324g) != null) {
            coinDetailPerformanceView.setOnEditCostClick(new Function0() { // from class: com.kubi.assets.overview.detail.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetCoinDetailFragment.m18553g4(this.f18372b);
                }
            });
        }
        C44808l c44808lM18574N15 = m18574N3();
        if (c44808lM18574N15 != null && (coinDetailAllocationView2 = c44808lM18574N15.f100320c) != null) {
            coinDetailAllocationView2.setOnItemClickListener(new Function1() { // from class: com.kubi.assets.overview.detail.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetCoinDetailFragment.m18547a4((String) obj);
                }
            });
        }
        C44808l c44808lM18574N16 = m18574N3();
        if (c44808lM18574N16 != null && (coinDetailAllocationView = c44808lM18574N16.f100320c) != null) {
            coinDetailAllocationView.setOnGoingClickListener(new Function1() { // from class: com.kubi.assets.overview.detail.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AssetCoinDetailFragment.m18548b4(this.f18373b, (String) obj);
                }
            });
        }
    }
}
