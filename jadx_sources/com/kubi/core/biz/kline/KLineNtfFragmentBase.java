package com.kubi.core.biz.kline;

import android.os.Bundle;
import be.InterfaceC4578a;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p722wd.C45794c;
import p756xc.NTFInfo;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import v30.C45373b0;
import w00.C45681e;

/* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00011B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010$\u001a\u00020%H\u0014J\b\u0010&\u001a\u00020'H\u0014J\b\u0010(\u001a\u00020'H\u0016J\b\u0010)\u001a\u00020'H\u0014J\b\u0010*\u001a\u00020'H\u0014J\b\u0010+\u001a\u00020'H\u0016J\r\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\u0003H\u0000¢\u0006\u0002\b0R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020!X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00062"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiIntent;", "Lcom/kubi/core/biz/kline/KLineNtfContract$UiState;", "Lcom/kubi/core/biz/kline/KLineNtfVM;", "<init>", "()V", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "tradeAccountType$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/tradecorebiz/databinding/KbcoinCoreKlineNtfLayoutBinding;", "getBinding$TradeCoreBizLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KbcoinCoreKlineNtfLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mKlineFragment", "Lcom/kubi/sdk/BaseFragment;", "getMKlineFragment$TradeCoreBizLib_googleRelease", "()Lcom/kubi/sdk/BaseFragment;", "setMKlineFragment$TradeCoreBizLib_googleRelease", "(Lcom/kubi/sdk/BaseFragment;)V", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "getLayout", "", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindState", "bindFlowEvent", "onRefresh", "getSymbolBizUiState", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;", "getSymbolBizUiState$TradeCoreBizLib_googleRelease", "getUiState", "getUiState$TradeCoreBizLib_googleRelease", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineNtfFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineNtfFragmentBase.kt\ncom/kubi/core/biz/kline/KLineNtfFragmentBase\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,171:1\n147#2,16:172\n158#3,2:188\n*S KotlinDebug\n*F\n+ 1 KLineNtfFragmentBase.kt\ncom/kubi/core/biz/kline/KLineNtfFragmentBase\n*L\n41#1:172,16\n156#1:188,2\n*E\n"})
public final class KLineNtfFragmentBase extends AbsTradeBaseBizFragment<KLineNtfContract$UiIntent, UiState, KLineNtfVM> {

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public BaseFragment f20404a0;

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f20401d0 = {Reflection.property1(new PropertyReference1Impl(KLineNtfFragmentBase.class, "binding", "getBinding$TradeCoreBizLib_googleRelease()Lcom/kubi/tradecorebiz/databinding/KbcoinCoreKlineNtfLayoutBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f20400c0 = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20402Y = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.kline.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KLineNtfFragmentBase.m21749X3(this.f20406b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f20403Z = C45681e.m100799e(this, new Function1<KLineNtfFragmentBase, C45373b0>() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45373b0 invoke(@NotNull KLineNtfFragmentBase fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45373b0.m100276a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45373b0, Unit>() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45373b0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45373b0 c45373b0) {
            invoke(c45373b0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC4578a f20405b0 = InterfaceC4578a.e.f4050a;

    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/core/biz/kline/KLineNtfFragmentBase$Companion;", "", "<init>", "()V", "TRADE_ACCOUNT", "", "newInstance", "Lcom/kubi/core/biz/kline/KLineNtfFragmentBase;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKLineNtfFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineNtfFragmentBase.kt\ncom/kubi/core/biz/kline/KLineNtfFragmentBase$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ KLineNtfFragmentBase newInstance$default(Companion companion, TradeAccountType tradeAccountType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tradeAccountType = TradeAccountType.Unified.INSTANCE;
            }
            return companion.newInstance(tradeAccountType);
        }

        @NotNull
        public final KLineNtfFragmentBase newInstance(@Nullable TradeAccountType tradeAccountType) {
            KLineNtfFragmentBase kLineNtfFragmentBase = new KLineNtfFragmentBase();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tradeAccountType", tradeAccountType);
            kLineNtfFragmentBase.setArguments(bundle);
            return kLineNtfFragmentBase;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$10 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/kline/KLinePosition;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$10", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1188210 extends SuspendLambda implements Function2<KLinePosition, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(KLinePosition kLinePosition, Continuation<? super Unit> continuation) {
            return ((C1188210) create(kLinePosition, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C1188210(Continuation<? super C1188210> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KLineNtfFragmentBase.this.new C1188210(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C11898b.m21770i(KLineNtfFragmentBase.this);
                C11919w.m21815m(KLineNtfFragmentBase.this, null, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$12 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "isShow", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$12", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1188412 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1188412(Continuation<? super C1188412> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1188412 c1188412 = KLineNtfFragmentBase.this.new C1188412(continuation);
            c1188412.Z$0 = ((Boolean) obj).booleanValue();
            return c1188412;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1188412) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z11) {
                C11898b.m21764c(KLineNtfFragmentBase.this);
            } else {
                C11898b.m21762a(KLineNtfFragmentBase.this);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$14 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "isShow", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$14", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1188614 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C1188614(Continuation<? super C1188614> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C1188614 c1188614 = KLineNtfFragmentBase.this.new C1188614(continuation);
            c1188614.Z$0 = ((Boolean) obj).booleanValue();
            return c1188614;
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C1188614) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (z11) {
                C11898b.m21765d(KLineNtfFragmentBase.this);
            } else {
                C11898b.m21763b(KLineNtfFragmentBase.this);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$16 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/arch/api/data/NTFInfo;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$16", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C1188816 extends SuspendLambda implements Function2<NTFInfo, Continuation<? super Unit>, Object> {
        int label;

        public C1188816(Continuation<? super C1188816> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KLineNtfFragmentBase.this.new C1188816(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(NTFInfo nTFInfo, Continuation<? super Unit> continuation) {
            return ((C1188816) create(nTFInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C11898b.m21770i(KLineNtfFragmentBase.this);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$2 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$2", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118892 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C118892) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C118892(Continuation<? super C118892> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118892 c118892 = KLineNtfFragmentBase.this.new C118892(continuation);
            c118892.L$0 = obj;
            return c118892;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KLineNtfFragmentBase kLineNtfFragmentBase;
            KLineNtfVM kLineNtfVMM21011A3;
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String symbol = symbolBizUiState.getSymbol();
            if (symbol != null && (kLineNtfVMM21011A3 = (kLineNtfFragmentBase = KLineNtfFragmentBase.this).m21011A3()) != null) {
                kLineNtfVMM21011A3.m21798F(new KLineNtfContract$UiIntent.SymbolChange(symbol, kLineNtfFragmentBase.m21754T3()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$4 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$4", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118904 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super Unit> continuation) {
            return ((C118904) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C118904(Continuation<? super C118904> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118904 c118904 = KLineNtfFragmentBase.this.new C118904(continuation);
            c118904.L$0 = obj;
            return c118904;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KLineNtfVM kLineNtfVMM21011A3;
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String symbol = symbolBizUiState.getSymbol();
            if (symbol != null && (kLineNtfVMM21011A3 = KLineNtfFragmentBase.this.m21011A3()) != null) {
                kLineNtfVMM21011A3.m21798F(new KLineNtfContract$UiIntent.ChangeInCallAuctionTrade(symbol, symbolBizUiState.isInCallAuctionTrade()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$6 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$6", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118926 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public C118926(Continuation<? super C118926> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KLineNtfFragmentBase.this.new C118926(continuation);
        }

        public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
            return ((C118926) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C11898b.m21770i(KLineNtfFragmentBase.this);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$8 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$bindState$8", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118948 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        int label;

        public C118948(Continuation<? super C118948> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return KLineNtfFragmentBase.this.new C118948(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C118948) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C11898b.m21770i(KLineNtfFragmentBase.this);
                C11919w.m21815m(KLineNtfFragmentBase.this, null, 1, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.kline.KLineNtfFragmentBase$initView$2 */
    /* JADX INFO: compiled from: KLineNtfFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "event", "Lcom/kubi/core/biz/sharevm/KLineVisibleChangeEvent;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.kline.KLineNtfFragmentBase$initView$2", m90122f = "KLineNtfFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C118962 extends SuspendLambda implements Function2<C45794c, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C118962(Continuation<? super C118962> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C118962 c118962 = KLineNtfFragmentBase.this.new C118962(continuation);
            c118962.L$0 = obj;
            return c118962;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(C45794c c45794c, Continuation<? super Unit> continuation) {
            return ((C118962) create(c45794c, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C45794c c45794c = (C45794c) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (c45794c.getF103215a()) {
                KLineNtfVM kLineNtfVMM21011A3 = KLineNtfFragmentBase.this.m21011A3();
                if (kLineNtfVMM21011A3 != null) {
                    kLineNtfVMM21011A3.m21798F(KLineNtfContract$UiIntent.KLineShow.INSTANCE);
                }
            } else {
                KLineNtfVM kLineNtfVMM21011A4 = KLineNtfFragmentBase.this.m21011A3();
                if (kLineNtfVMM21011A4 != null) {
                    kLineNtfVMM21011A4.m21798F(KLineNtfContract$UiIntent.KLineHide.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static final String m21746N3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getSymbol();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Boolean m21747O3(SymbolBizUiState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SymbolInfoEntity symbolInfo = it.getSymbolInfo();
        if (symbolInfo != null) {
            return symbolInfo.getEnableAuctionTrade();
        }
        return null;
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public KLineNtfVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new KLineNtfVM(manager);
    }

    @Nullable
    /* JADX INFO: renamed from: Q3 */
    public final C45373b0 m21751Q3() {
        return (C45373b0) this.f20403Z.getValue(this, f20401d0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: R3, reason: from getter */
    public final BaseFragment getF20404a0() {
        return this.f20404a0;
    }

    /* JADX INFO: renamed from: T3 */
    public final TradeAccountType m21754T3() {
        return (TradeAccountType) this.f20402Y.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m21756W3(@Nullable BaseFragment baseFragment) {
        this.f20404a0 = baseFragment;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindFlowEvent() {
        if (C12573b.f21598a.m23696a()) {
            "handle_click_event".length();
        }
        C12572a.m23692a(this, true, new KLineNtfFragmentBase$bindFlowEvent$$inlined$bindFlowEvent$1("handle_click_event", null, this));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kbcoin_core_kline_ntf_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<KLineNtfVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(KLineNtfVM.class);
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20405b0() {
        return this.f20405b0;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m21748V3(KLineNtfFragmentBase kLineNtfFragmentBase) {
        KLineNtfVM kLineNtfVMM21011A3 = kLineNtfFragmentBase.m21011A3();
        if (kLineNtfVMM21011A3 != null) {
            kLineNtfVMM21011A3.m21798F(new KLineNtfContract$UiIntent.ClickNftToggleBtn(kLineNtfFragmentBase.m21013D3().m22740t().isInCallAuctionTrade()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final TradeAccountType m21749X3(KLineNtfFragmentBase kLineNtfFragmentBase) {
        Bundle arguments = kLineNtfFragmentBase.getArguments();
        if (arguments != null) {
            return (TradeAccountType) RouteExKt.m56274t(arguments, "tradeAccountType");
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: S3 */
    public final SymbolBizUiState m21753S3() {
        return m21013D3().m22740t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: U3 */
    public final UiState m21755U3() {
        return (UiState) getState();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90881E(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.kline.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KLineNtfFragmentBase.m21746N3((SymbolBizUiState) obj);
            }
        })), new C118892(null));
        m21016u3(C41636g.m90941x(m21013D3().m22742v(), new Function1() { // from class: com.kubi.core.biz.kline.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KLineNtfFragmentBase.m21747O3((SymbolBizUiState) obj);
            }
        }), new C118904(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getIsInCallAuctionTrade());
            }
        }, new C118926(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getSymbol();
            }
        }, new C118948(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getKLinePosition();
            }
        }, new C1188210(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getIsShowKLineContent());
            }
        }, new C1188412(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UiState) obj).getIsShowNftContent());
            }
        }, new C1188614(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.kline.KLineNtfFragmentBase.bindState.15
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UiState) obj).getNftInfo();
            }
        }, new C1188816(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        BaseTextView baseTextView;
        super.initView();
        C45373b0 c45373b0M21751Q3 = m21751Q3();
        if (c45373b0M21751Q3 != null && (baseTextView = c45373b0M21751Q3.f102028f) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.core.biz.kline.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineNtfFragmentBase.m21748V3(this.f20407b);
                }
            }, 1, null);
        }
        m21016u3(C41636g.m90881E(m21020z3().m21738q()), new C118962(null));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        C11898b.m21770i(this);
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        KLineNtfVM kLineNtfVMM21011A3 = m21011A3();
        if (kLineNtfVMM21011A3 != null) {
            kLineNtfVMM21011A3.m21798F(KLineNtfContract$UiIntent.RefreshPosition.INSTANCE);
        }
        C11898b.m21770i(this);
        C11919w.m21815m(this, null, 1, null);
    }
}
