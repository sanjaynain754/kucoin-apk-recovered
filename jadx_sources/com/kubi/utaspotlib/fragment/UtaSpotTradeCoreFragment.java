package com.kubi.utaspotlib.fragment;

import af.C0296a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import be.InterfaceC4578a;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.assets.entity.HoldEarnCardHelper;
import com.kubi.assets.entity.HoldEarnConstKt;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.core.biz.banner.SpotBannerFragmentBase;
import com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI;
import com.kubi.core.biz.bottomtab.TradeBottomContainerFragment;
import com.kubi.core.biz.callauction.CallAuctionFragment;
import com.kubi.core.biz.callauction.CallAuctionSwitch;
import com.kubi.core.biz.compliance.ComplianceInfoFragmentBase;
import com.kubi.core.biz.kline.KLineNtfFragmentBase;
import com.kubi.core.biz.notice.ImportNoticeFragmentBase;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.offline.SymbolOfflineData;
import com.kubi.core.biz.offline.SymbolsOfflineManager;
import com.kubi.core.biz.submit.TradeCoreSubmitFragment;
import com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.HoldingEarnEntryCardView;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.InterfaceC43850k;
import p722wd.C45792a;
import p768xo.InterfaceC46302c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import q70.C43655b;
import r70.C43942e;
import ro.C44128b;
import w00.C45681e;
import y70.StorageId;

/* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0017J\b\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0012\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\u0017H\u0014J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\n\u0010/\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u00105\u001a\u0004\u0018\u00010\u001fH\u0016J\n\u00106\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u00107\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\u001dH\u0002J\b\u0010>\u001a\u00020\u001dH\u0002J\u001a\u0010?\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010@\u001a\u00020AH\u0016J\u001a\u0010B\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020\u001dH\u0016J\b\u0010E\u001a\u00020\u001dH\u0016R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lcom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment;", "Lcom/kubi/core/biz/BaseTradeCoreFragment;", "Lcom/kubi/core/biz/bottomtab/IOrderAndFunTitleHeaderUI;", "Lcom/kubi/margin/api/IKlineParentFragment;", "<init>", "()V", "binding", "Lcom/kubi/utaspotlib/databinding/FragmentUtaSpotTradeBinding;", "getBinding", "()Lcom/kubi/utaspotlib/databinding/FragmentUtaSpotTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "getViewModel", "()Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bizRepoProvider", "Lcom/kubi/utaspotlib/repo/UtaCoreDataRepoProvider;", "getBizRepoProvider", "()Lcom/kubi/utaspotlib/repo/UtaCoreDataRepoProvider;", "getTracePageBizName", "", "getLayout", "", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onPullRefreshExtra", "getSymbolOfflineBannerView", "Lcom/kubi/core/biz/offline/SymbolOfflineBannerView;", "getSymbolOfflineData", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "symbol", "getAppBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getRefreshLayout", "Lcom/kubi/resources/widget/KuCoinRefreshLayout;", "getActionTab", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "getHistoryRecordEntrance", "getKlineContainer", "Landroid/widget/FrameLayout;", "getKlineStatusView", "Landroid/widget/TextView;", "getKlineBottomLineView", "getKlineLayout", "getKlineClickView", "initAddBizFragment", "startCollectShareBizData", "Lkotlinx/coroutines/Job;", "changeBizUIVisible", "event", "Lcom/kubi/core/biz/sharevm/BizSupportChangeEvent;", "initHoldEarnCard", "refreshHoldEarnCardVisibility", "onCallAuctionStateChange", "inCallAuction", "", "consumeCallAuctionBiz", "isVisible", "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaSpotTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n147#2,16:303\n106#3,15:319\n158#4,2:334\n1#5:336\n*S KotlinDebug\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment\n*L\n73#1:303,16\n77#1:319,15\n221#1:334,2\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_spot")
public final class UtaSpotTradeCoreFragment extends BaseTradeCoreFragment implements IOrderAndFunTitleHeaderUI, InterfaceC46302c {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f54183a0 = {Reflection.property1(new PropertyReference1Impl(UtaSpotTradeCoreFragment.class, "binding", "getBinding()Lcom/kubi/utaspotlib/databinding/FragmentUtaSpotTradeBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f54184W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f54185X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final C43942e f54186Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public SymbolInfoEntity f54187Z;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1 */
    /* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1", m90122f = "UtaSpotTradeCoreFragment.kt", m90123i = {}, m90124l = {104}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nUtaSpotTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment$onShow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,302:1\n49#2:303\n51#2:307\n46#3:304\n51#3:306\n105#4:305\n*S KotlinDebug\n*F\n+ 1 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment$onShow$1\n*L\n102#1:303\n102#1:307\n102#1:304\n102#1:306\n102#1:305\n*E\n"})
    public static final class C269291 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: UtaSpotTradeCoreFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$3", m90122f = "UtaSpotTradeCoreFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UtaSpotTradeCoreFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UtaSpotTradeCoreFragment utaSpotTradeCoreFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = utaSpotTradeCoreFragment;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) this.L$0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.f54187Z = symbolInfoEntity;
                UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModelM66200U3 = this.this$0.m66200U3();
                String code = symbolInfoEntity.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                utaMarginTradeCoreViewModelM66200U3.m22508t(code);
                this.this$0.m21237K3(symbolInfoEntity.getSymbol());
                return Unit.INSTANCE;
            }
        }

        public C269291(Continuation<? super C269291> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UtaSpotTradeCoreFragment.this.new C269291(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C269291) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final String m66209f(SymbolBizUiState symbolBizUiState) {
            return symbolBizUiState.getSymbol();
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
                final InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(UtaSpotTradeCoreFragment.this.m21244w3().m22742v(), new Function1() { // from class: com.kubi.utaspotlib.fragment.b
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UtaSpotTradeCoreFragment.C269291.m66209f((SymbolBizUiState) obj2);
                    }
                });
                InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(new InterfaceC41634e<SymbolInfoEntity>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UtaSpotTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaSpotTradeCoreFragment$onShow$1\n*L\n1#1,49:1\n50#2:50\n102#3:51\n*E\n"})
                    public static final class C269302<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f54189b;

                        /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2", m90122f = "UtaSpotTradeCoreFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C269302.this.emit(null, this);
                            }
                        }

                        public C269302(InterfaceC41635f interfaceC41635f) {
                            this.f54189b = interfaceC41635f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.f54189b;
                                SymbolInfoEntity symbolInfo = ((SymbolBizUiState) obj).getSymbolInfo();
                                anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(symbolInfo, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    public Object collect(InterfaceC41635f<? super SymbolInfoEntity> interfaceC41635f, Continuation continuation) {
                        Object objCollect = interfaceC41634eM90941x.collect(new C269302(interfaceC41635f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(UtaSpotTradeCoreFragment.this, null);
                this.label = 1;
                if (C41636g.m90925l(interfaceC41634eM90881E, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public final UtaMarginTradeCoreViewModel m66200U3() {
        return (UtaMarginTradeCoreViewModel) this.f54185X.getValue();
    }

    /* JADX INFO: renamed from: V3 */
    private final void m66201V3(Bundle bundle) {
        if (bundle == null) {
            C27032f.m66611b(this, R$id.symbolBarContainer, SymbolBarFragmentBase.f20882c0.newInstance(TradeAccountType.Unified.INSTANCE), null, 4, null);
            C27032f.m66619j(this, R$id.complianceInfoContainer, ComplianceInfoFragmentBase.f20357a0.newInstance(), null, 4, null);
            C27032f.m66619j(this, R$id.spotBannerContainer, SpotBannerFragmentBase.f20144a0.newInstance(), null, 4, null);
            C27032f.m66611b(this, R$id.klineNtfContainer, KLineNtfFragmentBase.Companion.newInstance$default(KLineNtfFragmentBase.f20400c0, null, 1, null), null, 4, null);
            C27032f.m66611b(this, R$id.tradeSubmitFragmentContainer, TradeCoreSubmitFragment.f20627m0.newInstance(), null, 4, null);
            C27032f.m66619j(this, R$id.importNoticeContainer, ImportNoticeFragmentBase.f20534b0.newInstance(), null, 4, null);
            C27032f.m66611b(this, R$id.orderAndFundsContainer, TradeBottomContainerFragment.Companion.newInstance$default(TradeBottomContainerFragment.f20181c0, null, 1, null), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: W3 */
    private final void m66202W3() {
        if (C12573b.f21598a.m23696a()) {
            HoldEarnConstKt.HOLD_EARN_OPEN_SUCC.length();
        }
        C12572a.m23692a(this, true, new C26928xce57b997(HoldEarnConstKt.HOLD_EARN_OPEN_SUCC, null, this));
    }

    /* JADX INFO: renamed from: X3 */
    private final void m66203X3() {
        StorageId<Long> storageIdUtaStorageId = HoldEarnCardHelper.INSTANCE.utaStorageId(UserInfo.a.i());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new UtaSpotTradeCoreFragment$refreshHoldEarnCardVisibility$1(this, storageIdUtaStorageId, null), 3, null);
    }

    /* JADX INFO: renamed from: S3 */
    public final C43655b m66206S3() {
        return (C43655b) this.f54184W.getValue(this, f54183a0[0]);
    }

    @Override // p827zc.InterfaceC46752b
    @NotNull
    /* JADX INFO: renamed from: T3, reason: from getter and merged with bridge method [inline-methods] */
    public C43942e mo66036p1() {
        return this.f54186Y;
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    public int getLayout() {
        return R$layout.fragment_uta_spot_trade;
    }

    @Override // com.kubi.core.biz.symbol.ICallAuctionStateChangeListener
    /* JADX INFO: renamed from: i */
    public void mo22747i(@Nullable String str, boolean z11) {
        m66199Q3(new C45792a(InterfaceC4578a.b.f4047a, str, z11));
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m66201V3(savedInstanceState);
        m66204Y3();
        m66202W3();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: y3 */
    public SymbolOfflineData mo21246y3(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return SymbolsOfflineManager.f20563a.m22081c(symbol);
    }

    public UtaSpotTradeCoreFragment() {
        setPageId("B5UnifyTrading");
        this.f54184W = C45681e.m100799e(this, new Function1<UtaSpotTradeCoreFragment, C43655b>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43655b invoke(@NotNull UtaSpotTradeCoreFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C43655b.m96070a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C43655b, Unit>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C43655b it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43655b c43655b) {
                invoke(c43655b);
                return Unit.INSTANCE;
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewModels$default$2
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
        this.f54185X = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UtaMarginTradeCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.utaspotlib.fragment.UtaSpotTradeCoreFragment$special$$inlined$viewModels$default$5
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
        this.f54186Y = new C43942e(getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public final void m66199Q3(C45792a c45792a) {
        InterfaceC4578a f103212a = c45792a.getF103212a();
        if (f103212a instanceof InterfaceC4578a.c) {
            Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.complianceInfoContainer);
            if (fragmentFindFragmentById != null) {
                if (c45792a.getF103214c()) {
                    C27032f.m66627r(this, fragmentFindFragmentById);
                    return;
                } else {
                    C27032f.m66615f(this, fragmentFindFragmentById);
                    return;
                }
            }
            return;
        }
        if (f103212a instanceof InterfaceC4578a.h) {
            Fragment fragmentFindFragmentById2 = getChildFragmentManager().findFragmentById(R$id.spotBannerContainer);
            if (fragmentFindFragmentById2 != null) {
                if (c45792a.getF103214c()) {
                    C27032f.m66627r(this, fragmentFindFragmentById2);
                    return;
                } else {
                    C27032f.m66615f(this, fragmentFindFragmentById2);
                    return;
                }
            }
            return;
        }
        if (f103212a instanceof InterfaceC4578a.d) {
            Fragment fragmentFindFragmentById3 = getChildFragmentManager().findFragmentById(R$id.importNoticeContainer);
            if (fragmentFindFragmentById3 != null) {
                if (c45792a.getF103214c()) {
                    C27032f.m66627r(this, fragmentFindFragmentById3);
                    return;
                } else {
                    C27032f.m66615f(this, fragmentFindFragmentById3);
                    return;
                }
            }
            return;
        }
        if (f103212a instanceof InterfaceC4578a.b) {
            m66205R3(c45792a.getF103213b(), c45792a.getF103214c());
            return;
        }
        Log.d(getTAG(), "unSupport change visible, changeBizUIVisible: " + c45792a.getF103212a());
    }

    /* JADX INFO: renamed from: Y3 */
    private final InterfaceC41775x1 m66204Y3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new UtaSpotTradeCoreFragment$startCollectShareBizData$1(this, null));
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    /* JADX INFO: renamed from: D3 */
    public void mo21234D3() {
        m66203X3();
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: M2 */
    public View mo63550M2() {
        InterfaceC46302c interfaceC46302c;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC46302c) {
            interfaceC46302c = (InterfaceC46302c) parentFragment;
        } else {
            interfaceC46302c = null;
        }
        if (interfaceC46302c == null) {
            return null;
        }
        return interfaceC46302c.mo63550M2();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m66205R3(String str, boolean z11) {
        FrameLayout frameLayout;
        if (isAdded()) {
            CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
            if (!Intrinsics.areEqual(callAuctionSwitch.m21640f(), str)) {
                C44128b.m97258b("集合竞价：删除上一个交易对的集合竞价容器");
                Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R$id.callAuctionContainer);
                if (fragmentFindFragmentById != null) {
                    C27032f.m66620k(this, fragmentFindFragmentById);
                }
            }
            if (str != null) {
                callAuctionSwitch.m21638d(str);
            }
            if (z11) {
                C44128b.m97258b("集合竞价：添加新一个交易对的集合竞价容器");
                if (str != null) {
                    int i11 = R$id.callAuctionContainer;
                    CallAuctionFragment callAuctionFragmentNewInstance = CallAuctionFragment.f20282Z.newInstance();
                    callAuctionFragmentNewInstance.m21539R3(str);
                    Unit unit = Unit.INSTANCE;
                    C27032f.m66625p(this, i11, callAuctionFragmentNewInstance, null, 4, null);
                }
            }
            C43655b c43655bM66206S3 = m66206S3();
            if (c43655bM66206S3 != null && (frameLayout = c43655bM66206S3.f96346e) != null) {
                C0296a.m1042d(frameLayout, z11);
            }
        }
    }

    @Override // com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI
    @Nullable
    /* JADX INFO: renamed from: Y2 */
    public SlidingTabLayout mo21358Y2() {
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null) {
            return c43655bM66206S3.f96343b;
        }
        return null;
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: l1 */
    public FrameLayout mo63561l1() {
        InterfaceC46302c interfaceC46302c;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC46302c) {
            interfaceC46302c = (InterfaceC46302c) parentFragment;
        } else {
            interfaceC46302c = null;
        }
        if (interfaceC46302c == null) {
            return null;
        }
        return interfaceC46302c.mo63561l1();
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: n1 */
    public View mo63564n1() {
        InterfaceC46302c interfaceC46302c;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC46302c) {
            interfaceC46302c = (InterfaceC46302c) parentFragment;
        } else {
            interfaceC46302c = null;
        }
        if (interfaceC46302c == null) {
            return null;
        }
        return interfaceC46302c.mo63564n1();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        IUnifyAccountService.f53155a.get().mo65000p();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        super.onRefresh();
        SymbolInfoEntity symbolInfoEntity = this.f54187Z;
        if (symbolInfoEntity != null) {
            UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModelM66200U3 = m66200U3();
            String code = symbolInfoEntity.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            utaMarginTradeCoreViewModelM66200U3.m22508t(code);
        }
        IUnifyAccountService.f53155a.get().mo65002r();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        HoldingEarnEntryCardView holdingEarnEntryCardView;
        super.onShow();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C269291(null));
        IUnifyAccountService.f53155a.get().mo65002r();
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null && (holdingEarnEntryCardView = c43655bM66206S3.f96348g) != null) {
            holdingEarnEntryCardView.m54529g();
        }
        m66203X3();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public AppBarLayout mo21240s3() {
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null) {
            return c43655bM66206S3.f96345d;
        }
        return null;
    }

    @Override // com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI
    @Nullable
    /* JADX INFO: renamed from: t1 */
    public View mo21359t1() {
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null) {
            return c43655bM66206S3.f96344c;
        }
        return null;
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: v3 */
    public KuCoinRefreshLayout mo21243v3() {
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null) {
            return c43655bM66206S3.f96352k;
        }
        return null;
    }

    @Override // p768xo.InterfaceC46302c
    @Nullable
    /* JADX INFO: renamed from: x1 */
    public View mo63579x1() {
        InterfaceC46302c interfaceC46302c;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC46302c) {
            interfaceC46302c = (InterfaceC46302c) parentFragment;
        } else {
            interfaceC46302c = null;
        }
        if (interfaceC46302c == null) {
            return null;
        }
        return interfaceC46302c.mo63579x1();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: x3 */
    public SymbolOfflineBannerView mo21245x3() {
        C43655b c43655bM66206S3 = m66206S3();
        if (c43655bM66206S3 != null) {
            return c43655bM66206S3.f96355n;
        }
        return null;
    }
}
