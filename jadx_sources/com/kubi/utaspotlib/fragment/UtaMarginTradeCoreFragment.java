package com.kubi.utaspotlib.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import be.InterfaceC4578a;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.core.biz.banner.SpotBannerFragmentBase;
import com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI;
import com.kubi.core.biz.bottomtab.TradeBottomContainerFragment;
import com.kubi.core.biz.compliance.ComplianceInfoFragmentBase;
import com.kubi.core.biz.kline.KLineNtfFragmentBase;
import com.kubi.core.biz.margininfo.MarginInfoFragmentBase;
import com.kubi.core.biz.notice.ImportNoticeFragmentBase;
import com.kubi.core.biz.offline.SymbolOfflineBannerView;
import com.kubi.core.biz.offline.SymbolOfflineData;
import com.kubi.core.biz.submit.TradeCoreSubmitFragment;
import com.kubi.core.biz.submit.UtaMarginTradeCoreViewModel;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.biz.symbolbarold.SymbolBarFragmentBase;
import com.kubi.data.entity.MarginOfflineInfo;
import com.kubi.data.entity.MarginSymbolInfo;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.KuCoinRefreshLayout;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utaspotlib.R$id;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27032f;
import com.tencent.qcloud.tuicore.TUIConstants;
import id.C38519a;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
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
import q70.C43654a;
import r70.C43943f;
import w00.C45681e;
import y70.StorageId;

/* JADX INFO: compiled from: UtaMarginTradeCoreFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0014J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\bH\u0014J\u001a\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010-\u001a\u00020*H\u0014J\n\u0010.\u001a\u0004\u0018\u00010/H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u00010!H\u0016J\n\u00105\u001a\u0004\u0018\u000106H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\n\u00109\u001a\u0004\u0018\u00010!H\u0016J\n\u0010:\u001a\u0004\u0018\u00010!H\u0016J\n\u0010;\u001a\u0004\u0018\u00010!H\u0016J\u0012\u0010<\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020AH\u0002J\u001a\u0010B\u001a\u00020\u001f2\b\u0010+\u001a\u0004\u0018\u00010\b2\u0006\u0010C\u001a\u00020DH\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006E"}, m90084d2 = {"Lcom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment;", "Lcom/kubi/core/biz/BaseTradeCoreFragment;", "Lcom/kubi/core/biz/bottomtab/IOrderAndFunTitleHeaderUI;", "Lcom/kubi/margin/api/IKlineParentFragment;", "<init>", "()V", "getLastSymbolStorageKey", "Lcom/kubi/utils/storage/StorageId;", "", "binding", "Lcom/kubi/utaspotlib/databinding/FragmentUtaMarginTradeBinding;", "getBinding", "()Lcom/kubi/utaspotlib/databinding/FragmentUtaMarginTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "viewModel", "Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "getViewModel", "()Lcom/kubi/core/biz/submit/UtaMarginTradeCoreViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bizRepoProvider", "Lcom/kubi/utaspotlib/repo/UtaMarginCoreDataRepoProvider;", "getBizRepoProvider", "()Lcom/kubi/utaspotlib/repo/UtaMarginCoreDataRepoProvider;", "getTracePageBizName", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "onRefresh", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "getSymbolOfflineBannerView", "Lcom/kubi/core/biz/offline/SymbolOfflineBannerView;", "getSymbolOfflineData", "Lcom/kubi/core/biz/offline/SymbolOfflineData;", "symbol", "buildOfflineTipContent", "offlineData", "getAppBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getRefreshLayout", "Lcom/kubi/resources/widget/KuCoinRefreshLayout;", "getActionTab", "Lcom/kubi/resources/widget/flyco/SlidingTabLayout;", "getHistoryRecordEntrance", "getKlineContainer", "Landroid/widget/FrameLayout;", "getKlineStatusView", "Landroid/widget/TextView;", "getKlineBottomLineView", "getKlineLayout", "getKlineClickView", "initAddBizFragment", "startCollectShareBizData", "Lkotlinx/coroutines/Job;", "changeBizUIVisible", "event", "Lcom/kubi/core/biz/sharevm/BizSupportChangeEvent;", "onCallAuctionStateChange", "inCallAuction", "", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaMarginTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,221:1\n147#2,16:222\n106#3,15:238\n*S KotlinDebug\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment\n*L\n66#1:222,16\n72#1:238,15\n*E\n"})
@InterfaceC43850k(pageId = "primary_page_margin")
public final class UtaMarginTradeCoreFragment extends BaseTradeCoreFragment implements IOrderAndFunTitleHeaderUI, InterfaceC46302c {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f54175a0 = {Reflection.property1(new PropertyReference1Impl(UtaMarginTradeCoreFragment.class, "binding", "getBinding()Lcom/kubi/utaspotlib/databinding/FragmentUtaMarginTradeBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f54176W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public SymbolInfoEntity f54177X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f54178Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final C43943f f54179Z;

    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1 */
    /* JADX INFO: compiled from: UtaMarginTradeCoreFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1", m90122f = "UtaMarginTradeCoreFragment.kt", m90123i = {}, m90124l = {95}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nUtaMarginTradeCoreFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment$onShow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,221:1\n49#2:222\n51#2:226\n46#3:223\n51#3:225\n105#4:224\n*S KotlinDebug\n*F\n+ 1 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment$onShow$1\n*L\n93#1:222\n93#1:226\n93#1:223\n93#1:225\n93#1:224\n*E\n"})
    public static final class C269231 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: UtaMarginTradeCoreFragment.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/data/entity/SymbolInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$3", m90122f = "UtaMarginTradeCoreFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<SymbolInfoEntity, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ UtaMarginTradeCoreFragment this$0;

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(SymbolInfoEntity symbolInfoEntity, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(symbolInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UtaMarginTradeCoreFragment utaMarginTradeCoreFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = utaMarginTradeCoreFragment;
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
                this.this$0.f54177X = symbolInfoEntity;
                UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModelM66186S3 = this.this$0.m66186S3();
                String code = symbolInfoEntity.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
                utaMarginTradeCoreViewModelM66186S3.m22508t(code);
                this.this$0.m21237K3(symbolInfoEntity.getSymbol());
                return Unit.INSTANCE;
            }
        }

        public C269231(Continuation<? super C269231> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UtaMarginTradeCoreFragment.this.new C269231(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C269231) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final String m66193f(SymbolBizUiState symbolBizUiState) {
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
                final InterfaceC41634e interfaceC41634eM90941x = C41636g.m90941x(UtaMarginTradeCoreFragment.this.m21244w3().m22742v(), new Function1() { // from class: com.kubi.utaspotlib.fragment.a
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UtaMarginTradeCoreFragment.C269231.m66193f((SymbolBizUiState) obj2);
                    }
                });
                InterfaceC41634e interfaceC41634eM90881E = C41636g.m90881E(new InterfaceC41634e<SymbolInfoEntity>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UtaMarginTradeCoreFragment.kt\ncom/kubi/utaspotlib/fragment/UtaMarginTradeCoreFragment$onShow$1\n*L\n1#1,49:1\n50#2:50\n93#3:51\n*E\n"})
                    public static final class C269242<T> implements InterfaceC41635f {

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ InterfaceC41635f f54181b;

                        /* JADX INFO: renamed from: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$onShow$1$invokeSuspend$$inlined$map$1$2", m90122f = "UtaMarginTradeCoreFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
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
                                return C269242.this.emit(null, this);
                            }
                        }

                        public C269242(InterfaceC41635f interfaceC41635f) {
                            this.f54181b = interfaceC41635f;
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
                                InterfaceC41635f interfaceC41635f = this.f54181b;
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
                        Object objCollect = interfaceC41634eM90941x.collect(new C269242(interfaceC41635f), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(UtaMarginTradeCoreFragment.this, null);
                this.label = 1;
                if (C41636g.m90925l(interfaceC41634eM90881E, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public final UtaMarginTradeCoreViewModel m66186S3() {
        return (UtaMarginTradeCoreViewModel) this.f54178Y.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public final C43654a m66188Q3() {
        return (C43654a) this.f54176W.getValue(this, f54175a0[0]);
    }

    @Override // p827zc.InterfaceC46752b
    @NotNull
    /* JADX INFO: renamed from: R3, reason: from getter and merged with bridge method [inline-methods] */
    public C43943f getF54186Y() {
        return this.f54179Z;
    }

    /* JADX INFO: renamed from: T3 */
    public final void m66190T3(Bundle bundle) {
        if (bundle == null) {
            int i11 = R$id.symbolBarContainer;
            SymbolBarFragmentBase.Companion companion = SymbolBarFragmentBase.f20882c0;
            TradeAccountType.Margin margin = TradeAccountType.Margin.INSTANCE;
            C27032f.m66611b(this, i11, companion.newInstance(margin), null, 4, null);
            C27032f.m66611b(this, R$id.marginInfoContainer, MarginInfoFragmentBase.f20436d0.newInstance(), null, 4, null);
            C27032f.m66619j(this, R$id.complianceInfoContainer, ComplianceInfoFragmentBase.f20357a0.newInstance(), null, 4, null);
            C27032f.m66619j(this, R$id.spotBannerContainer, SpotBannerFragmentBase.f20144a0.newInstance(), null, 4, null);
            C27032f.m66611b(this, R$id.klineNtfContainer, KLineNtfFragmentBase.f20400c0.newInstance(margin), null, 4, null);
            C27032f.m66611b(this, R$id.tradeSubmitFragmentContainer, TradeCoreSubmitFragment.f20627m0.newInstance(), null, 4, null);
            C27032f.m66619j(this, R$id.importNoticeContainer, ImportNoticeFragmentBase.f20534b0.newInstance(), null, 4, null);
            C27032f.m66611b(this, R$id.orderAndFundsContainer, TradeBottomContainerFragment.f20181c0.newInstance("MARGIN"), null, 4, null);
        }
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    public int getLayout() {
        return R$layout.fragment_uta_margin_trade;
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"KCLongMethodCheck"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m66190T3(savedInstanceState);
        m66191U3();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public String mo21239r3(@NotNull String symbol, @NotNull SymbolOfflineData offlineData) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(offlineData, "offlineData");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        int i11 = R$string.kc_trade_offline_margin_tip;
        Long offlineTime = offlineData.getOfflineTime();
        return context.getString(i11, symbol, C27041f.m66668h(offlineTime != null ? C42179a.m92633f(offlineTime.longValue(), null, false, true, null, 11, null) : null));
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @NotNull
    /* JADX INFO: renamed from: u3 */
    public StorageId<String> mo21242u3() {
        return C38519a.f86479a.m87131f();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: y3 */
    public SymbolOfflineData mo21246y3(@NotNull String symbol) {
        MarginOfflineInfo offlineInfo;
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        MarginSymbolInfo marginSymbolInfoMo37925Y = IMarginService.f32724a.get().mo37925Y(symbol);
        if (marginSymbolInfoMo37925Y == null || (offlineInfo = marginSymbolInfoMo37925Y.getOfflineInfo()) == null) {
            return null;
        }
        return new SymbolOfflineData(null, symbol, 0L, null, null, offlineInfo.getTime(), offlineInfo.getTime(), offlineInfo.getLink(), 24, null);
    }

    public UtaMarginTradeCoreFragment() {
        setPageId("B5UnifyTrading");
        this.f54176W = C45681e.m100799e(this, new Function1<UtaMarginTradeCoreFragment, C43654a>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C43654a invoke(@NotNull UtaMarginTradeCoreFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C43654a.m96068a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C43654a, Unit>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C43654a it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C43654a c43654a) {
                invoke(c43654a);
                return Unit.INSTANCE;
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewModels$default$2
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
        this.f54178Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UtaMarginTradeCoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.utaspotlib.fragment.UtaMarginTradeCoreFragment$special$$inlined$viewModels$default$5
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
        this.f54179Z = new C43943f(getArguments());
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

    /* JADX INFO: renamed from: P3 */
    public final void m66187P3(C45792a c45792a) {
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
        Log.d(getTAG(), "unSupport change visible, changeBizUIVisible: " + c45792a.getF103212a());
    }

    /* JADX INFO: renamed from: U3 */
    public final InterfaceC41775x1 m66191U3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new UtaMarginTradeCoreFragment$startCollectShareBizData$1(this, null));
    }

    @Override // com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI
    @Nullable
    /* JADX INFO: renamed from: Y2 */
    public SlidingTabLayout mo21358Y2() {
        C43654a c43654aM66188Q3 = m66188Q3();
        if (c43654aM66188Q3 != null) {
            return c43654aM66188Q3.f96328b;
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
        IUnifyAccountService.f53155a.get().mo64996l();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        super.onRefresh();
        SymbolInfoEntity symbolInfoEntity = this.f54177X;
        if (symbolInfoEntity != null) {
            UtaMarginTradeCoreViewModel utaMarginTradeCoreViewModelM66186S3 = m66186S3();
            String code = symbolInfoEntity.getCode();
            Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
            utaMarginTradeCoreViewModelM66186S3.m22508t(code);
            IUnifyAccountService.f53155a.get().mo64981E();
        }
        IUnifyAccountService.f53155a.get().mo64986J();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C269231(null));
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        companion.get().mo64981E();
        companion.get().mo64986J();
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public AppBarLayout mo21240s3() {
        C43654a c43654aM66188Q3 = m66188Q3();
        if (c43654aM66188Q3 != null) {
            return c43654aM66188Q3.f96330d;
        }
        return null;
    }

    @Override // com.kubi.core.biz.bottomtab.IOrderAndFunTitleHeaderUI
    @Nullable
    /* JADX INFO: renamed from: t1 */
    public View mo21359t1() {
        C43654a c43654aM66188Q3 = m66188Q3();
        if (c43654aM66188Q3 != null) {
            return c43654aM66188Q3.f96329c;
        }
        return null;
    }

    @Override // com.kubi.core.biz.BaseTradeCoreFragment
    @Nullable
    /* JADX INFO: renamed from: v3 */
    public KuCoinRefreshLayout mo21243v3() {
        C43654a c43654aM66188Q3 = m66188Q3();
        if (c43654aM66188Q3 != null) {
            return c43654aM66188Q3.f96337k;
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
        C43654a c43654aM66188Q3 = m66188Q3();
        if (c43654aM66188Q3 != null) {
            return c43654aM66188Q3.f96340n;
        }
        return null;
    }

    @Override // com.kubi.core.biz.symbol.ICallAuctionStateChangeListener
    /* JADX INFO: renamed from: i */
    public void mo22747i(@Nullable String str, boolean z11) {
    }
}
