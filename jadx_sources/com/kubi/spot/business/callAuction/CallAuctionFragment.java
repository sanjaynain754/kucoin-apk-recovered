package com.kubi.spot.business.callAuction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.callAuction.bean.CallAuctionConfigBean;
import com.kubi.spot.business.callAuction.callAuctionProcessDialog.CallAuctionProcessContainerDialog;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$Phase;
import com.kubi.spot.business.callAuction.mvi.CallAuctionContract$UiIntent;
import com.kubi.spot.business.callAuction.mvi.CallAuctionViewModel;
import com.kubi.spot.business.callAuction.mvi.UIState;
import com.kubi.spot.entity.TradeItemBeanEquals;
import com.kubi.spot.exeption.SpotMessage;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import f30.C37332c;
import f30.C37347r;
import gf.C37890n;
import i20.CallAuctionInfo;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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
import ro.C44128b;
import t20.C44676y;
import w00.C45681e;

/* JADX INFO: compiled from: CallAuctionFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001<B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0015J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\u0012\u0010(\u001a\u00020\u001f2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u001a\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\bH\u0002J\b\u0010/\u001a\u00020\bH\u0002J\b\u00100\u001a\u00020\bH\u0002J\u0006\u00101\u001a\u00020,J\u0006\u00102\u001a\u00020,J\b\u00103\u001a\u00020\u001fH\u0014J\b\u00104\u001a\u00020\u001fH\u0016J\b\u00105\u001a\u00020\u001fH\u0016J\u000e\u0010;\u001a\u00020\u001f2\u0006\u00106\u001a\u00020,R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001a\u00106\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/CallAuctionFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$UIState;", "Lcom/kubi/spot/databinding/FragmentCallAuctionBinding;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "failedCount", "", "getFailedCount", "()I", "setFailedCount", "(I)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/spot/databinding/FragmentCallAuctionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "onRefresh", "", "bindState", "callAuctionConfigUpdate", "callAuctionConfig", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;", "showPhase3View", "showPhase2View", "showPhase1View", "showOpeningView", "callAuctionInfoUpdate", "callAuctionInfo", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;", "getExpectPrice", "", "srcPrice", "precision", "getQuotePrecision", "getBasePrecision", "getQuoteCurrencyName", "getBaseCurrencyName", "initView", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "symbol", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "checkSymbol", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,376:1\n147#2,16:377\n153#3,7:393\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment\n*L\n59#1:377,16\n365#1:393,7\n*E\n"})
public final class CallAuctionFragment extends SimpleVBStateContentFragment<UIState, C44676y> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    public int f49803V;

    /* JADX INFO: renamed from: W */
    public boolean f49804W = true;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f49805X = C45681e.m100799e(this, new Function1<CallAuctionFragment, C44676y>() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44676y invoke(@NotNull CallAuctionFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44676y.m98828a(this.this$0.m42580n3());
        }

        {
            super(1);
        }
    }, new Function1<C44676y, Unit>() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44676y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44676y c44676y) {
            invoke(c44676y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f49806Y = "BTC-USDT";

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f49802a0 = {Reflection.property1(new PropertyReference1Impl(CallAuctionFragment.class, "binding", "getBinding()Lcom/kubi/spot/databinding/FragmentCallAuctionBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f49801Z = new Companion(null);

    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/spot/business/callAuction/CallAuctionFragment$Companion;", "", "<init>", "()V", "CALL_AUCTION_PRICE_LIMIT", "", "REQUEST_CALL_AUCTION_PRICE_LIMIT", "MAX_REQUEST_COUNT", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$10 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/spot/business/callAuction/mvi/CallAuctionContract$Phase;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$10", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$10\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,376:1\n8#2,2:377\n8#2,2:379\n8#2,2:381\n8#2,2:383\n8#2,2:385\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$10\n*L\n117#1:377,2\n120#1:379,2\n125#1:381,2\n130#1:383,2\n135#1:385,2\n*E\n"})
    public static final class C2469510 extends SuspendLambda implements Function2<CallAuctionContract$Phase, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionContract$Phase callAuctionContract$Phase, Continuation<? super Unit> continuation) {
            return ((C2469510) create(callAuctionContract$Phase, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$10$a */
        /* JADX INFO: compiled from: CallAuctionFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CallAuctionContract$Phase.values().length];
                try {
                    iArr[CallAuctionContract$Phase.OPENING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CallAuctionContract$Phase.Phase1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CallAuctionContract$Phase.Phase2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C2469510(Continuation<? super C2469510> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C2469510 c2469510 = CallAuctionFragment.this.new C2469510(continuation);
            c2469510.L$0 = obj;
            return c2469510;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionContract$Phase callAuctionContract$Phase = (CallAuctionContract$Phase) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("trade|Spot|CallAuctionFragment", "phase.bindState");
            int i11 = a.$EnumSwitchMapping$0[callAuctionContract$Phase.ordinal()];
            if (i11 == 1) {
                C44128b.m97266j("trade|Spot|CallAuctionFragment", "phase.OPENING");
                CallAuctionFragment.this.m60375Y3();
            } else if (i11 == 2) {
                C44128b.m97266j("trade|Spot|CallAuctionFragment", "phase.Phase1");
                CallAuctionFragment.this.m60376Z3();
            } else if (i11 != 3) {
                C44128b.m97266j("trade|Spot|CallAuctionFragment", "phase.Phase3");
                CallAuctionFragment.this.m60378b4();
            } else {
                C44128b.m97266j("trade|Spot|CallAuctionFragment", "phase.Phase2");
                CallAuctionFragment.this.m60377a4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$2 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "callAuctionInfo", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$2", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$2\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,376:1\n8#2,2:377\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$2\n*L\n75#1:377,2\n*E\n"})
    public static final class C246962 extends SuspendLambda implements Function2<CallAuctionInfo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionInfo callAuctionInfo, Continuation<? super Unit> continuation) {
            return ((C246962) create(callAuctionInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C246962(Continuation<? super C246962> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246962 c246962 = CallAuctionFragment.this.new C246962(continuation);
            c246962.L$0 = obj;
            return c246962;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionInfo callAuctionInfo = (CallAuctionInfo) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("trade|Spot|CallAuctionFragment", "callAuctionInfo.bindState");
            CallAuctionFragment.this.m60391G3(callAuctionInfo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$4 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "callAuctionConfig", "Lcom/kubi/spot/business/callAuction/bean/CallAuctionConfigBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$4", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$4\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,376:1\n8#2,2:377\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$4\n*L\n80#1:377,2\n*E\n"})
    public static final class C246984 extends SuspendLambda implements Function2<CallAuctionConfigBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionConfigBean callAuctionConfigBean, Continuation<? super Unit> continuation) {
            return ((C246984) create(callAuctionConfigBean, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C246984(Continuation<? super C246984> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C246984 c246984 = CallAuctionFragment.this.new C246984(continuation);
            c246984.L$0 = obj;
            return c246984;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionConfigBean callAuctionConfigBean = (CallAuctionConfigBean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("trade|Spot|CallAuctionFragment", "callAuctionGetConfig.bindState");
            CallAuctionFragment.this.m60390F3(callAuctionConfigBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$6 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "countdown", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$6", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$6\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n*L\n1#1,376:1\n8#2,2:377\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$6\n*L\n85#1:377,2\n*E\n"})
    public static final class C247006 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C247006(Continuation<? super C247006> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247006 c247006 = CallAuctionFragment.this.new C247006(continuation);
            c247006.L$0 = obj;
            return c247006;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C247006) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BaseTextView baseTextView;
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("trade|Spot|CallAuctionFragment", "countdown.bindState");
            C44676y c44676yM60394K3 = CallAuctionFragment.this.m60394K3();
            if (c44676yM60394K3 != null && (baseTextView = c44676yM60394K3.f99463t) != null) {
                baseTextView.setText(C27041f.m66669i(str, "--"));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$8 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "bean", "Lcom/kubi/spot/entity/TradeItemBeanEquals;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.callAuction.CallAuctionFragment$bindState$8", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$8\n+ 2 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 3 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,376:1\n8#2,2:377\n52#3,2:379\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/spot/business/callAuction/CallAuctionFragment$bindState$8\n*L\n90#1:377,2\n106#1:379,2\n*E\n"})
    public static final class C247028 extends SuspendLambda implements Function2<TradeItemBeanEquals, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TradeItemBeanEquals tradeItemBeanEquals, Continuation<? super Unit> continuation) {
            return ((C247028) create(tradeItemBeanEquals, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C247028(Continuation<? super C247028> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C247028 c247028 = CallAuctionFragment.this.new C247028(continuation);
            c247028.L$0 = obj;
            return c247028;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeItemBeanEquals tradeItemBeanEquals = (TradeItemBeanEquals) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("trade|Spot|CallAuctionFragment", "response.bindState");
            if (tradeItemBeanEquals != null) {
                CallAuctionFragment callAuctionFragment = CallAuctionFragment.this;
                SymbolInfoEntity symbolInfoEntity = tradeItemBeanEquals.getSymbolInfoEntity();
                if (C27025c.m66566d(symbolInfoEntity != null ? symbolInfoEntity.getEnableAuctionTrade() : null)) {
                    if (callAuctionFragment.getF49803V() < 4) {
                        callAuctionFragment.sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
                    } else {
                        C43846g.m96568c(new SpotMessage("enableAuctionTrade false. failedCount > MAX_REQUEST_COUNT", "CallAuctionFragment", false, 4, null), null, 2, null);
                    }
                    int f49803v = callAuctionFragment.getF49803V();
                    callAuctionFragment.m60398X3(f49803v + 1);
                    Boxing.boxInt(f49803v);
                } else {
                    TradeItemBeanEquals bean = CallAuctionFragment.m60389z3(callAuctionFragment).getBean();
                    if (bean != null) {
                        Fragment parentFragment = callAuctionFragment.getParentFragment();
                        BaseTradeFragment baseTradeFragment = parentFragment instanceof BaseTradeFragment ? (BaseTradeFragment) parentFragment : null;
                        if (baseTradeFragment != null) {
                            CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
                            String symbol = bean.getSymbol();
                            Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                            callAuctionViewController.m60534a(baseTradeFragment, symbol, true, baseTradeFragment.m60200m5());
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: L3 */
    private final String m60366L3(String str, int i11) {
        if (str == null || str.length() == 0) {
            return "";
        }
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        return C27041f.m66668h(bigDecimalM66536f != null ? C41014a.m89946t(bigDecimalM66536f, null, i11, true, false, false, false, false, null, 0, 505, null) : null);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m60368Q3(C44676y c44676y) {
        Group groupDetails = c44676y.f99449f;
        Intrinsics.checkNotNullExpressionValue(groupDetails, "groupDetails");
        if (ViewExtKt.m66581l(groupDetails)) {
            c44676y.f99451h.setImageResource(R$drawable.ic2_arrow_down_12);
            Group groupDetails2 = c44676y.f99449f;
            Intrinsics.checkNotNullExpressionValue(groupDetails2, "groupDetails");
            ViewExtKt.m66577h(groupDetails2);
        } else {
            c44676y.f99451h.setImageResource(R$drawable.ic2_arrow_up_12);
            Group groupDetails3 = c44676y.f99449f;
            Intrinsics.checkNotNullExpressionValue(groupDetails3, "groupDetails");
            ViewExtKt.m66594y(groupDetails3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m60369R3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_issue_price);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_issue_price_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C37332c.m83915c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m60370S3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_price);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_price_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C37332c.m83915c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m60371T3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_volume);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_volume_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C37332c.m83915c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m60372U3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_buy_range);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_buy_range_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C37332c.m83915c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m60373V3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_sell_range);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_sell_range_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C37332c.m83915c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m60374W3(CallAuctionFragment callAuctionFragment) {
        CallAuctionProcessContainerDialog callAuctionProcessContainerDialog = new CallAuctionProcessContainerDialog();
        Bundle bundle = new Bundle();
        bundle.putString("symbol", callAuctionFragment.f49806Y);
        callAuctionProcessContainerDialog.setArguments(bundle);
        FragmentManager childFragmentManager = callAuctionFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        callAuctionProcessContainerDialog.show(childFragmentManager, CallAuctionFragment.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final void m60375Y3() {
        Boolean enableAuctionTrade;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C12572a.m23695d("call_auction_price_limit", new Pair(bigDecimal, bigDecimal), 0L, 4, null);
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.f49806Y);
        if ((symbolInfoEntityM85601B == null || (enableAuctionTrade = symbolInfoEntityM85601B.getEnableAuctionTrade()) == null) ? false : enableAuctionTrade.booleanValue()) {
            sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
            return;
        }
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null) {
            Fragment parentFragment = getParentFragment();
            BaseTradeFragment baseTradeFragment = parentFragment instanceof BaseTradeFragment ? (BaseTradeFragment) parentFragment : null;
            if (baseTradeFragment != null) {
                CallAuctionViewController callAuctionViewController = CallAuctionViewController.f49857a;
                String symbol = bean.getSymbol();
                Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
                callAuctionViewController.m60534a(baseTradeFragment, symbol, true, baseTradeFragment.m60200m5());
            }
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final void m60390F3(CallAuctionConfigBean callAuctionConfigBean) {
        String openingTime;
        C12572a.m23695d("call_auction_price_limit", new Pair(C41014a.m89922G(callAuctionConfigBean != null ? callAuctionConfigBean.getPriceFloor() : null, null, 1, null), C41014a.m89922G(callAuctionConfigBean != null ? callAuctionConfigBean.getPriceCeiling() : null, null, 1, null)), 0L, 4, null);
        C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            BaseTextView baseTextView = c44676yM60394K3.f99439B;
            if (callAuctionConfigBean == null || (openingTime = callAuctionConfigBean.getOpeningTime()) == null) {
                openingTime = "--";
            }
            baseTextView.setText(openingTime);
            c44676yM60394K3.f99443F.setText(" (" + C37347r.m83947g() + ')');
            C24749h.m60531d(this, c44676yM60394K3, C27041f.m66668h(callAuctionConfigBean != null ? callAuctionConfigBean.getIssuePrice() : null));
        }
    }

    /* JADX INFO: renamed from: H3 */
    public final void m60392H3(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f49806Y = symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: K3 */
    public C44676y m60394K3() {
        return (C44676y) this.f49805X.getValue(this, f49802a0[0]);
    }

    /* JADX INFO: renamed from: M3, reason: from getter */
    public final int getF49803V() {
        return this.f49803V;
    }

    @NotNull
    /* JADX INFO: renamed from: P3, reason: from getter */
    public final String getF49806Y() {
        return this.f49806Y;
    }

    /* JADX INFO: renamed from: X3 */
    public final void m60398X3(int i11) {
        this.f49803V = i11;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF49804W() {
        return this.f49804W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(CallAuctionViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        final C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            AppCompatImageView ivShowSpotCallAuctionProgress = c44676yM60394K3.f99452i;
            Intrinsics.checkNotNullExpressionValue(ivShowSpotCallAuctionProgress, "ivShowSpotCallAuctionProgress");
            C27046k.m66711z(ivShowSpotCallAuctionProgress, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60374W3(this.f49820b);
                }
            }, 1, null);
            View expandState = c44676yM60394K3.f99447d;
            Intrinsics.checkNotNullExpressionValue(expandState, "expandState");
            ShapeImageView ivIconState = c44676yM60394K3.f99451h;
            Intrinsics.checkNotNullExpressionValue(ivIconState, "ivIconState");
            C27046k.m66681D(new View[]{expandState, ivIconState}, new Function0() { // from class: com.kubi.spot.business.callAuction.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60368Q3(c44676yM60394K3);
                }
            });
            DashTextView tvIssuePrice = c44676yM60394K3.f99468y;
            Intrinsics.checkNotNullExpressionValue(tvIssuePrice, "tvIssuePrice");
            C27046k.m66711z(tvIssuePrice, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60369R3(this.f49830b);
                }
            }, 1, null);
            DashTextView tvEstimatedOpeningPrice = c44676yM60394K3.f99464u;
            Intrinsics.checkNotNullExpressionValue(tvEstimatedOpeningPrice, "tvEstimatedOpeningPrice");
            C27046k.m66711z(tvEstimatedOpeningPrice, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60370S3(this.f49850b);
                }
            }, 1, null);
            DashTextView tvEstimatedOpeningVolume = c44676yM60394K3.f99466w;
            Intrinsics.checkNotNullExpressionValue(tvEstimatedOpeningVolume, "tvEstimatedOpeningVolume");
            C27046k.m66711z(tvEstimatedOpeningVolume, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60371T3(this.f49852b);
                }
            }, 1, null);
            DashTextView tvBuyPriceRange = c44676yM60394K3.f99460q;
            Intrinsics.checkNotNullExpressionValue(tvBuyPriceRange, "tvBuyPriceRange");
            C27046k.m66711z(tvBuyPriceRange, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60372U3(this.f49853b);
                }
            }, 1, null);
            DashTextView tvSellPriceRange = c44676yM60394K3.f99440C;
            Intrinsics.checkNotNullExpressionValue(tvSellPriceRange, "tvSellPriceRange");
            C27046k.m66711z(tvSellPriceRange, 0L, new Function0() { // from class: com.kubi.spot.business.callAuction.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m60373V3(this.f49855b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.fragment_call_auction;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(this.f49806Y, true));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f49804W = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J3 */
    private final int m60365J3() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && (symbolInfoEntity = bean.getSymbolInfoEntity()) != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getBaseIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    private final int m60367O3() {
        Integer numValueOf;
        SymbolInfoEntity symbolInfoEntity;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && (symbolInfoEntity = bean.getSymbolInfoEntity()) != null) {
            numValueOf = Integer.valueOf(symbolInfoEntity.getQuoteIncrementPrecision());
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public final void m60376Z3() {
        C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            c44676yM60394K3.f99462s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase1));
            BaseTextView cancelTheOrder = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, R$drawable.ic2_success_16, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(R$color.primary));
            AlertTipsTextView tvThirdTip = c44676yM60394K3.f99442E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66577h(tvThirdTip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public final void m60377a4() {
        C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            c44676yM60394K3.f99462s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase2));
            c44676yM60394K3.f99446c.setText(getString(R$string.kc_call_auction_not_cancel_order));
            BaseTextView cancelTheOrder = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, R$drawable.ic2_fail_16, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(R$color.brandRed));
            AlertTipsTextView tvThirdTip = c44676yM60394K3.f99442E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66577h(tvThirdTip);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public final void m60378b4() {
        C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            c44676yM60394K3.f99462s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase3));
            c44676yM60394K3.f99454k.setText(getString(R$string.kc_call_auction_not_create_order));
            c44676yM60394K3.f99446c.setText(getString(R$string.kc_call_auction_not_cancel_order));
            BaseTextView placeTheOrder = c44676yM60394K3.f99454k;
            Intrinsics.checkNotNullExpressionValue(placeTheOrder, "placeTheOrder");
            int i11 = R$drawable.ic2_fail_16;
            C27046k.m66693h(placeTheOrder, i11, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView placeTheOrder2 = c44676yM60394K3.f99454k;
            Intrinsics.checkNotNullExpressionValue(placeTheOrder2, "placeTheOrder");
            int i12 = R$color.brandRed;
            C27046k.m66702q(placeTheOrder2, getColorRes(i12));
            BaseTextView cancelTheOrder = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, i11, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c44676yM60394K3.f99446c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(i12));
            AlertTipsTextView tvThirdTip = c44676yM60394K3.f99442E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66594y(tvThirdTip);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public static final /* synthetic */ UIState m60389z3(CallAuctionFragment callAuctionFragment) {
        return (UIState) callAuctionFragment.getState();
    }

    /* JADX INFO: renamed from: G3 */
    public final void m60391G3(CallAuctionInfo callAuctionInfo) {
        String estimatedOpeningPrice;
        String estimatedOpeningVolume;
        String buyPriceRangeLowerLimit;
        String buyPriceRangeUpperLimit;
        String sellPriceRangeLowerLimit;
        C44676y c44676yM60394K3 = m60394K3();
        if (c44676yM60394K3 != null) {
            String sellPriceRangeUpperLimit = null;
            if (callAuctionInfo != null) {
                estimatedOpeningPrice = callAuctionInfo.getEstimatedOpeningPrice();
            } else {
                estimatedOpeningPrice = null;
            }
            C24749h.m60529b(this, c44676yM60394K3, m60366L3(estimatedOpeningPrice, m60367O3()));
            if (callAuctionInfo != null) {
                estimatedOpeningVolume = callAuctionInfo.getEstimatedOpeningVolume();
            } else {
                estimatedOpeningVolume = null;
            }
            C24749h.m60530c(this, c44676yM60394K3, m60366L3(estimatedOpeningVolume, m60365J3()));
            if (callAuctionInfo != null) {
                buyPriceRangeLowerLimit = callAuctionInfo.getBuyPriceRangeLowerLimit();
            } else {
                buyPriceRangeLowerLimit = null;
            }
            String strM60366L3 = m60366L3(buyPriceRangeLowerLimit, m60367O3());
            if (callAuctionInfo != null) {
                buyPriceRangeUpperLimit = callAuctionInfo.getBuyPriceRangeUpperLimit();
            } else {
                buyPriceRangeUpperLimit = null;
            }
            C24749h.m60528a(this, c44676yM60394K3, strM60366L3, m60366L3(buyPriceRangeUpperLimit, m60367O3()));
            if (callAuctionInfo != null) {
                sellPriceRangeLowerLimit = callAuctionInfo.getSellPriceRangeLowerLimit();
            } else {
                sellPriceRangeLowerLimit = null;
            }
            String strM60366L4 = m60366L3(sellPriceRangeLowerLimit, m60367O3());
            if (callAuctionInfo != null) {
                sellPriceRangeUpperLimit = callAuctionInfo.getSellPriceRangeUpperLimit();
            }
            C24749h.m60532e(this, c44676yM60394K3, strM60366L4, m60366L3(sellPriceRangeUpperLimit, m60367O3()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final String m60393I3() {
        String baseCurrencyName;
        SymbolInfoEntity symbolInfoEntity;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && (symbolInfoEntity = bean.getSymbolInfoEntity()) != null) {
            baseCurrencyName = symbolInfoEntity.getBaseCurrencyName();
        } else {
            baseCurrencyName = null;
        }
        return C27041f.m66668h(baseCurrencyName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: N3 */
    public final String m60396N3() {
        String quoteCurrencyName;
        SymbolInfoEntity symbolInfoEntity;
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean != null && (symbolInfoEntity = bean.getSymbolInfoEntity()) != null) {
            quoteCurrencyName = symbolInfoEntity.getQuoteCurrencyName();
        } else {
            quoteCurrencyName = null;
        }
        return C27041f.m66668h(quoteCurrencyName);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"SetTextI18n"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCallAuctionInfo();
            }
        }, new C246962(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCallAuctionGetConfig();
            }
        }, new C246984(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCountdown();
            }
        }, new C247006(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getResponse();
            }
        }, new C247028(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.spot.business.callAuction.CallAuctionFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPhase();
            }
        }, new C2469510(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        sendIntent(CallAuctionContract$UiIntent.OnFragmentHide.INSTANCE);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(this.f49806Y, true));
        if (C12573b.f21598a.m23696a()) {
            "request_call_auction_price_limit".length();
        }
        C12572a.m23692a(this, false, new CallAuctionFragment$onShow$$inlined$bindFlowEvent$default$1("request_call_auction_price_limit", null, this));
    }
}
