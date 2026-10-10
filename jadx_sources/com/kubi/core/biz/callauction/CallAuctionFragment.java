package com.kubi.core.biz.callauction;

import af.C0298c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.biz.callauction.bean.CallAuctionConfigBean;
import com.kubi.core.biz.callauction.mvi.CallAuctionContract$Phase;
import com.kubi.core.biz.callauction.mvi.CallAuctionContract$UiIntent;
import com.kubi.core.biz.callauction.mvi.CallAuctionViewModel;
import com.kubi.core.biz.callauction.mvi.UIState;
import com.kubi.core.spot.entity.TradeItemBeanEquals;
import com.kubi.core.spot.exeption.SpotMessage;
import com.kubi.core.utils.C12465d;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.mvi.state.SimpleVBStateContentFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37890n;
import java.math.BigDecimal;
import ke.CallAuctionInfo;
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
import v30.C45385h0;
import ve.C45518a;
import w00.C45681e;

/* JADX INFO: compiled from: CallAuctionFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001=B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0015J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010'\u001a\u00020\u001fH\u0002J\u000e\u0010.\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)J\b\u0010/\u001a\u00020\u001fH\u0002J\u0012\u00100\u001a\u00020\u001f2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u001a\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u00010)2\u0006\u00105\u001a\u00020\bH\u0002J\b\u00106\u001a\u00020\bH\u0002J\b\u00107\u001a\u00020\bH\u0002J\u0006\u00108\u001a\u00020)J\u0006\u00109\u001a\u00020)J\b\u0010:\u001a\u00020\u001fH\u0014J\b\u0010;\u001a\u00020\u001fH\u0016J\b\u0010<\u001a\u00020\u001fH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006>"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/CallAuctionFragment;", "Lcom/kubi/mvi/state/SimpleVBStateContentFragment;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$UIState;", "Lcom/kubi/tradecorebiz/databinding/TradeCoreFragmentCallAuctionBinding;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "failedCount", "", "getFailedCount", "()I", "setFailedCount", "(I)V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/core/biz/callauction/mvi/CallAuctionViewModel;", "getVmClass", "()Lkotlin/reflect/KClass;", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "binding", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/TradeCoreFragmentCallAuctionBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getBindingRootViewLayout", "onRefresh", "", "bindState", "callAuctionConfigUpdate", "callAuctionConfig", "Lcom/kubi/core/biz/callauction/bean/CallAuctionConfigBean;", "showPhase3View", "showPhase2View", "showPhase1View", "showOpeningView", "symbol", "", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "initSymbol", "handleCallAuction", "callAuctionInfoUpdate", "callAuctionInfo", "Lcom/kubi/core/spot/business/callAuction/bean/CallAuctionInfo;", "getExpectPrice", "srcPrice", "precision", "getQuotePrecision", "getBasePrecision", "getQuoteCurrencyName", "getBaseCurrencyName", "initView", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/core/biz/callauction/CallAuctionFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,380:1\n147#2,16:381\n153#3,7:397\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/core/biz/callauction/CallAuctionFragment\n*L\n59#1:381,16\n375#1:397,7\n*E\n"})
public final class CallAuctionFragment extends SimpleVBStateContentFragment<UIState, C45385h0> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: V */
    public int f20284V;

    /* JADX INFO: renamed from: W */
    public boolean f20285W = true;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f20286X = C45681e.m100799e(this, new Function1<CallAuctionFragment, C45385h0>() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45385h0 invoke(@NotNull CallAuctionFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45385h0.m100304a(this.this$0.m42580n3());
        }

        {
            super(1);
        }
    }, new Function1<C45385h0, Unit>() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45385h0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45385h0 c45385h0) {
            invoke(c45385h0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f20287Y = "BTC-USDT";

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f20283a0 = {Reflection.property1(new PropertyReference1Impl(CallAuctionFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/TradeCoreFragmentCallAuctionBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f20282Z = new Companion(null);

    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/biz/callauction/CallAuctionFragment$Companion;", "", "<init>", "()V", "CALL_AUCTION_PRICE_LIMIT", "", "REQUEST_CALL_AUCTION_PRICE_LIMIT", "MAX_REQUEST_COUNT", "", "newInstance", "Lcom/kubi/core/biz/callauction/CallAuctionFragment;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CallAuctionFragment newInstance() {
            return new CallAuctionFragment();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$10 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/kubi/core/biz/callauction/mvi/CallAuctionContract$Phase;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.CallAuctionFragment$bindState$10", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1178510 extends SuspendLambda implements Function2<CallAuctionContract$Phase, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionContract$Phase callAuctionContract$Phase, Continuation<? super Unit> continuation) {
            return ((C1178510) create(callAuctionContract$Phase, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$10$a */
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

        public C1178510(Continuation<? super C1178510> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1178510 c1178510 = CallAuctionFragment.this.new C1178510(continuation);
            c1178510.L$0 = obj;
            return c1178510;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionContract$Phase callAuctionContract$Phase = (CallAuctionContract$Phase) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45518a.m100507a("phase.bindState", "CallAuctionFragment");
            int i11 = a.$EnumSwitchMapping$0[callAuctionContract$Phase.ordinal()];
            if (i11 == 1) {
                C45518a.m100507a("phase.OPENING", "CallAuctionFragment");
                CallAuctionFragment.this.m21541a4();
            } else if (i11 == 2) {
                C45518a.m100507a("phase.Phase1", "CallAuctionFragment");
                CallAuctionFragment.this.m21542b4();
            } else if (i11 != 3) {
                C45518a.m100507a("phase.Phase3", "CallAuctionFragment");
                CallAuctionFragment.this.m21544d4();
            } else {
                C45518a.m100507a("phase.Phase2", "CallAuctionFragment");
                CallAuctionFragment.this.m21543c4();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$2 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "callAuctionInfo", "Lcom/kubi/core/spot/business/callAuction/bean/CallAuctionInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.CallAuctionFragment$bindState$2", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117862 extends SuspendLambda implements Function2<CallAuctionInfo, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C117862(Continuation<? super C117862> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117862 c117862 = CallAuctionFragment.this.new C117862(continuation);
            c117862.L$0 = obj;
            return c117862;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionInfo callAuctionInfo, Continuation<? super Unit> continuation) {
            return ((C117862) create(callAuctionInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionInfo callAuctionInfo = (CallAuctionInfo) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45518a.m100507a("callAuctionInfo.bindState", "CallAuctionFragment");
            CallAuctionFragment.this.m21529H3(callAuctionInfo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$4 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "callAuctionConfig", "Lcom/kubi/core/biz/callauction/bean/CallAuctionConfigBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.CallAuctionFragment$bindState$4", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117884 extends SuspendLambda implements Function2<CallAuctionConfigBean, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(CallAuctionConfigBean callAuctionConfigBean, Continuation<? super Unit> continuation) {
            return ((C117884) create(callAuctionConfigBean, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C117884(Continuation<? super C117884> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117884 c117884 = CallAuctionFragment.this.new C117884(continuation);
            c117884.L$0 = obj;
            return c117884;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CallAuctionConfigBean callAuctionConfigBean = (CallAuctionConfigBean) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45518a.m100507a("callAuctionGetConfig.bindState", "CallAuctionFragment");
            CallAuctionFragment.this.m21528G3(callAuctionConfigBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$6 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "countdown", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.CallAuctionFragment$bindState$6", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C117906 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C117906(Continuation<? super C117906> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117906 c117906 = CallAuctionFragment.this.new C117906(continuation);
            c117906.L$0 = obj;
            return c117906;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C117906) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C45518a.m100507a("countdown.bindState", "CallAuctionFragment");
            C45385h0 c45385h0M21532K3 = CallAuctionFragment.this.m21532K3();
            if (c45385h0M21532K3 != null && (baseTextView = c45385h0M21532K3.f102127t) != null) {
                baseTextView.setText(C27041f.m66669i(str, "--"));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.callauction.CallAuctionFragment$bindState$8 */
    /* JADX INFO: compiled from: CallAuctionFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "bean", "Lcom/kubi/core/spot/entity/TradeItemBeanEquals;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.callauction.CallAuctionFragment$bindState$8", m90122f = "CallAuctionFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nCallAuctionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/core/biz/callauction/CallAuctionFragment$bindState$8\n+ 2 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,380:1\n55#2,2:381\n*S KotlinDebug\n*F\n+ 1 CallAuctionFragment.kt\ncom/kubi/core/biz/callauction/CallAuctionFragment$bindState$8\n*L\n102#1:381,2\n*E\n"})
    public static final class C117928 extends SuspendLambda implements Function2<TradeItemBeanEquals, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(TradeItemBeanEquals tradeItemBeanEquals, Continuation<? super Unit> continuation) {
            return ((C117928) create(tradeItemBeanEquals, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C117928(Continuation<? super C117928> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C117928 c117928 = CallAuctionFragment.this.new C117928(continuation);
            c117928.L$0 = obj;
            return c117928;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TradeItemBeanEquals tradeItemBeanEquals = (TradeItemBeanEquals) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45518a.m100507a("response.bindState", "CallAuctionFragment");
            if (tradeItemBeanEquals != null) {
                CallAuctionFragment callAuctionFragment = CallAuctionFragment.this;
                SymbolInfoEntity symbolInfoEntity = tradeItemBeanEquals.getSymbolInfoEntity();
                if (C27025c.m66566d(symbolInfoEntity != null ? symbolInfoEntity.getEnableAuctionTrade() : null)) {
                    if (callAuctionFragment.getF20284V() < 4) {
                        callAuctionFragment.sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
                    } else {
                        C43846g.m96568c(new SpotMessage("enableAuctionTrade false. failedCount > MAX_REQUEST_COUNT", "CallAuctionFragment", false, 4, null), null, 2, null);
                    }
                    int f20284v = callAuctionFragment.getF20284V();
                    callAuctionFragment.m21540Z3(f20284v + 1);
                    Boxing.boxInt(f20284v);
                } else {
                    TradeItemBeanEquals bean = CallAuctionFragment.m21527z3(callAuctionFragment).getBean();
                    if (bean != null && Intrinsics.areEqual(callAuctionFragment.getF20287Y(), bean.getSymbol())) {
                        callAuctionFragment.m21538Q3();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m21510S3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_issue_price);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_issue_price_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C0298c.m1045c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m21511T3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_price);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_price_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C0298c.m1045c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m21512U3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_volume);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_estimated_opening_volume_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C0298c.m1045c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m21513V3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_buy_range);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_buy_range_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C0298c.m1045c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m21514W3(CallAuctionFragment callAuctionFragment) {
        String string = callAuctionFragment.getString(R$string.kc_call_auction_sell_range);
        String string2 = callAuctionFragment.getString(R$string.kc_call_auction_sell_range_desc);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C0298c.m1045c(callAuctionFragment, string, string2, null, null, null, null, null, 124, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final Unit m21515X3(CallAuctionFragment callAuctionFragment) {
        DialogFragmentHelper dialogFragmentHelperMo59981z = ISpotCommonService.f49644a.get().mo59981z();
        Bundle bundle = new Bundle();
        bundle.putString("symbol", callAuctionFragment.f20287Y);
        dialogFragmentHelperMo59981z.setArguments(bundle);
        FragmentManager childFragmentManager = callAuctionFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperMo59981z.show(childFragmentManager, CallAuctionFragment.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m21516Y3(C45385h0 c45385h0) {
        Group groupDetails = c45385h0.f102113f;
        Intrinsics.checkNotNullExpressionValue(groupDetails, "groupDetails");
        if (ViewExtKt.m66581l(groupDetails)) {
            c45385h0.f102115h.setImageResource(R$drawable.ic2_arrow_down_12);
            Group groupDetails2 = c45385h0.f102113f;
            Intrinsics.checkNotNullExpressionValue(groupDetails2, "groupDetails");
            ViewExtKt.m66577h(groupDetails2);
        } else {
            c45385h0.f102115h.setImageResource(R$drawable.ic2_arrow_up_12);
            Group groupDetails3 = c45385h0.f102113f;
            Intrinsics.checkNotNullExpressionValue(groupDetails3, "groupDetails");
            ViewExtKt.m66594y(groupDetails3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public final void m21528G3(CallAuctionConfigBean callAuctionConfigBean) {
        String openingTime;
        C12572a.m23695d("call_auction_price_limit", new Pair(C41014a.m89922G(callAuctionConfigBean != null ? callAuctionConfigBean.getPriceFloor() : null, null, 1, null), C41014a.m89922G(callAuctionConfigBean != null ? callAuctionConfigBean.getPriceCeiling() : null, null, 1, null)), 0L, 4, null);
        C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            BaseTextView baseTextView = c45385h0M21532K3.f102103B;
            if (callAuctionConfigBean == null || (openingTime = callAuctionConfigBean.getOpeningTime()) == null) {
                openingTime = "--";
            }
            baseTextView.setText(openingTime);
            c45385h0M21532K3.f102107F.setText(" (" + C12465d.m23410f() + ')');
            C11814h.m21631d(this, c45385h0M21532K3, C27041f.m66668h(callAuctionConfigBean != null ? callAuctionConfigBean.getIssuePrice() : null));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K3 */
    public C45385h0 m21532K3() {
        return (C45385h0) this.f20286X.getValue(this, f20283a0[0]);
    }

    /* JADX INFO: renamed from: L3 */
    public final String m21533L3(String str, int i11) {
        if (str == null || str.length() == 0) {
            return "";
        }
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        return C27041f.m66668h(bigDecimalM66536f != null ? C41014a.m89946t(bigDecimalM66536f, null, i11, true, false, false, false, false, null, 0, 505, null) : null);
    }

    /* JADX INFO: renamed from: M3, reason: from getter */
    public final int getF20284V() {
        return this.f20284V;
    }

    @NotNull
    /* JADX INFO: renamed from: P3, reason: from getter */
    public final String getF20287Y() {
        return this.f20287Y;
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m21538Q3() {
        CallAuctionSwitch callAuctionSwitch = CallAuctionSwitch.f20317a;
        if (CallAuctionSwitch.m21636i(callAuctionSwitch, false, 1, null)) {
            C45518a.m100507a("集合竞价状态-交易面板", "handleCallAuction");
            callAuctionSwitch.m21641g().onNext(Boolean.TRUE);
        } else {
            C45518a.m100507a("连续竞价状态-交易面板", "handleCallAuction");
            callAuctionSwitch.m21641g().onNext(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m21539R3(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f20287Y = symbol;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m21540Z3(int i11) {
        this.f20284V = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final void m21541a4() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C12572a.m23695d("call_auction_price_limit", new Pair(bigDecimal, bigDecimal), 0L, 4, null);
        CallAuctionSwitch.f20317a.m21638d(this.f20287Y);
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(this.f20287Y);
        if (symbolInfoEntityM85601B != null ? Intrinsics.areEqual(symbolInfoEntityM85601B.getEnableAuctionTrade(), Boolean.TRUE) : false) {
            sendIntent(CallAuctionContract$UiIntent.GetCallAuction.INSTANCE);
            return;
        }
        TradeItemBeanEquals bean = ((UIState) getState()).getBean();
        if (bean == null || !Intrinsics.areEqual(this.f20287Y, bean.getSymbol())) {
            return;
        }
        m21538Q3();
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF20285W() {
        return this.f20285W;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<CallAuctionViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(CallAuctionViewModel.class);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        super.initView();
        final C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            AppCompatImageView ivShowSpotCallAuctionProgress = c45385h0M21532K3.f102116i;
            Intrinsics.checkNotNullExpressionValue(ivShowSpotCallAuctionProgress, "ivShowSpotCallAuctionProgress");
            C27046k.m66711z(ivShowSpotCallAuctionProgress, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21515X3(this.f20303b);
                }
            }, 1, null);
            View expandState = c45385h0M21532K3.f102111d;
            Intrinsics.checkNotNullExpressionValue(expandState, "expandState");
            ShapeImageView ivIconState = c45385h0M21532K3.f102115h;
            Intrinsics.checkNotNullExpressionValue(ivIconState, "ivIconState");
            C27046k.m66681D(new View[]{expandState, ivIconState}, new Function0() { // from class: com.kubi.core.biz.callauction.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21516Y3(c45385h0M21532K3);
                }
            });
            DashTextView tvIssuePrice = c45385h0M21532K3.f102132y;
            Intrinsics.checkNotNullExpressionValue(tvIssuePrice, "tvIssuePrice");
            C27046k.m66711z(tvIssuePrice, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21510S3(this.f20308b);
                }
            }, 1, null);
            DashTextView tvEstimatedOpeningPrice = c45385h0M21532K3.f102128u;
            Intrinsics.checkNotNullExpressionValue(tvEstimatedOpeningPrice, "tvEstimatedOpeningPrice");
            C27046k.m66711z(tvEstimatedOpeningPrice, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21511T3(this.f20309b);
                }
            }, 1, null);
            DashTextView tvEstimatedOpeningVolume = c45385h0M21532K3.f102130w;
            Intrinsics.checkNotNullExpressionValue(tvEstimatedOpeningVolume, "tvEstimatedOpeningVolume");
            C27046k.m66711z(tvEstimatedOpeningVolume, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21512U3(this.f20311b);
                }
            }, 1, null);
            DashTextView tvBuyPriceRange = c45385h0M21532K3.f102124q;
            Intrinsics.checkNotNullExpressionValue(tvBuyPriceRange, "tvBuyPriceRange");
            C27046k.m66711z(tvBuyPriceRange, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21513V3(this.f20313b);
                }
            }, 1, null);
            DashTextView tvSellPriceRange = c45385h0M21532K3.f102104C;
            Intrinsics.checkNotNullExpressionValue(tvSellPriceRange, "tvSellPriceRange");
            C27046k.m66711z(tvSellPriceRange, 0L, new Function0() { // from class: com.kubi.core.biz.callauction.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CallAuctionFragment.m21514W3(this.f20314b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.mvi.state.SimpleVBStateContentFragment
    /* JADX INFO: renamed from: m3 */
    public int mo21545m3() {
        return R$layout.trade_core_fragment_call_auction;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(this.f20287Y, true));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f20285W = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public static final /* synthetic */ UIState m21527z3(CallAuctionFragment callAuctionFragment) {
        return (UIState) callAuctionFragment.getState();
    }

    /* JADX INFO: renamed from: H3 */
    public final void m21529H3(CallAuctionInfo callAuctionInfo) {
        String estimatedOpeningPrice;
        String estimatedOpeningVolume;
        String buyPriceRangeLowerLimit;
        String buyPriceRangeUpperLimit;
        String sellPriceRangeLowerLimit;
        C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            String sellPriceRangeUpperLimit = null;
            if (callAuctionInfo != null) {
                estimatedOpeningPrice = callAuctionInfo.getEstimatedOpeningPrice();
            } else {
                estimatedOpeningPrice = null;
            }
            C11814h.m21629b(this, c45385h0M21532K3, m21533L3(estimatedOpeningPrice, m21536O3()));
            if (callAuctionInfo != null) {
                estimatedOpeningVolume = callAuctionInfo.getEstimatedOpeningVolume();
            } else {
                estimatedOpeningVolume = null;
            }
            C11814h.m21630c(this, c45385h0M21532K3, m21533L3(estimatedOpeningVolume, m21531J3()));
            if (callAuctionInfo != null) {
                buyPriceRangeLowerLimit = callAuctionInfo.getBuyPriceRangeLowerLimit();
            } else {
                buyPriceRangeLowerLimit = null;
            }
            String strM21533L3 = m21533L3(buyPriceRangeLowerLimit, m21536O3());
            if (callAuctionInfo != null) {
                buyPriceRangeUpperLimit = callAuctionInfo.getBuyPriceRangeUpperLimit();
            } else {
                buyPriceRangeUpperLimit = null;
            }
            C11814h.m21628a(this, c45385h0M21532K3, strM21533L3, m21533L3(buyPriceRangeUpperLimit, m21536O3()));
            if (callAuctionInfo != null) {
                sellPriceRangeLowerLimit = callAuctionInfo.getSellPriceRangeLowerLimit();
            } else {
                sellPriceRangeLowerLimit = null;
            }
            String strM21533L4 = m21533L3(sellPriceRangeLowerLimit, m21536O3());
            if (callAuctionInfo != null) {
                sellPriceRangeUpperLimit = callAuctionInfo.getSellPriceRangeUpperLimit();
            }
            C11814h.m21632e(this, c45385h0M21532K3, strM21533L4, m21533L3(sellPriceRangeUpperLimit, m21536O3()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: I3 */
    public final String m21530I3() {
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
    /* JADX INFO: renamed from: J3 */
    public final int m21531J3() {
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
    @NotNull
    /* JADX INFO: renamed from: N3 */
    public final String m21535N3() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O3 */
    public final int m21536O3() {
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

    /* JADX INFO: renamed from: b4 */
    public final void m21542b4() {
        C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            c45385h0M21532K3.f102126s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase1));
            BaseTextView cancelTheOrder = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, R$drawable.ic2_success_16, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(R$color.primary));
            AlertTipsTextView tvThirdTip = c45385h0M21532K3.f102106E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66577h(tvThirdTip);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @SuppressLint({"SetTextI18n"})
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCallAuctionInfo();
            }
        }, new C117862(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment.bindState.3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCallAuctionGetConfig();
            }
        }, new C117884(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCountdown();
            }
        }, new C117906(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getResponse();
            }
        }, new C117928(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.callauction.CallAuctionFragment.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPhase();
            }
        }, new C1178510(null));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m21543c4() {
        C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            c45385h0M21532K3.f102126s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase2));
            c45385h0M21532K3.f102110c.setText(getString(R$string.kc_call_auction_not_cancel_order));
            BaseTextView cancelTheOrder = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, R$drawable.ic2_fail_16, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(R$color.brandRed));
            AlertTipsTextView tvThirdTip = c45385h0M21532K3.f102106E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66577h(tvThirdTip);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m21544d4() {
        C45385h0 c45385h0M21532K3 = m21532K3();
        if (c45385h0M21532K3 != null) {
            c45385h0M21532K3.f102126s.setText(getString(R$string.kc_call_auction) + " - " + getString(R$string.kc_call_auction_phase3));
            c45385h0M21532K3.f102118k.setText(getString(R$string.kc_call_auction_not_create_order));
            c45385h0M21532K3.f102110c.setText(getString(R$string.kc_call_auction_not_cancel_order));
            BaseTextView placeTheOrder = c45385h0M21532K3.f102118k;
            Intrinsics.checkNotNullExpressionValue(placeTheOrder, "placeTheOrder");
            int i11 = R$drawable.ic2_fail_16;
            C27046k.m66693h(placeTheOrder, i11, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView placeTheOrder2 = c45385h0M21532K3.f102118k;
            Intrinsics.checkNotNullExpressionValue(placeTheOrder2, "placeTheOrder");
            int i12 = R$color.brandRed;
            C27046k.m66702q(placeTheOrder2, getColorRes(i12));
            BaseTextView cancelTheOrder = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder, "cancelTheOrder");
            C27046k.m66693h(cancelTheOrder, i11, C5275i0.m6236a(4.0f), GravityCompat.START);
            BaseTextView cancelTheOrder2 = c45385h0M21532K3.f102110c;
            Intrinsics.checkNotNullExpressionValue(cancelTheOrder2, "cancelTheOrder");
            C27046k.m66702q(cancelTheOrder2, getColorRes(i12));
            AlertTipsTextView tvThirdTip = c45385h0M21532K3.f102106E;
            Intrinsics.checkNotNullExpressionValue(tvThirdTip, "tvThirdTip");
            ViewExtKt.m66594y(tvThirdTip);
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        sendIntent(CallAuctionContract$UiIntent.OnFragmentHide.INSTANCE);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        sendIntent(new CallAuctionContract$UiIntent.RequestCurrentStage(this.f20287Y, true));
        if (C12573b.f21598a.m23696a()) {
            "request_call_auction_price_limit".length();
        }
        C12572a.m23692a(this, false, new CallAuctionFragment$onShow$$inlined$bindFlowEvent$default$1("request_call_auction_price_limit", null, this));
    }
}
