package com.kubi.broker;

import com.kubi.copytrading.ICopyTradingService;
import com.kubi.router.core.Router;
import com.kubi.unify.api.IUnifyAccountService;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import p495oc.CopyTradingUiState;
import p559qg.InterfaceC43729a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;
import vg.C45527a;

/* JADX INFO: compiled from: FuturesFacedFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/broker/BrokerConfig;", "", "<init>", "()V", "_broker", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/broker/IBrokerConfig;", "broker", "getBroker", "()Lcom/kubi/broker/IBrokerConfig;", "brokerFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getBrokerFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "findCurrentBizType", "isUnified", "", "isMasterAccount", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesFacedFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesFacedFragment.kt\ncom/kubi/broker/BrokerConfig\n+ 2 MultiBizUtils.kt\ncom/kubi/broker/MultiBizUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n11#2,6:227\n17#2,5:235\n295#3,2:233\n*S KotlinDebug\n*F\n+ 1 FuturesFacedFragment.kt\ncom/kubi/broker/BrokerConfig\n*L\n64#1:227,6\n64#1:235,5\n64#1:233,2\n*E\n"})
public final class BrokerConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BrokerConfig f19211a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41669n<IBrokerConfig> f19212b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41678w<IBrokerConfig> f19213c;

    /* JADX INFO: renamed from: com.kubi.broker.BrokerConfig$1 */
    /* JADX INFO: compiled from: FuturesFacedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/broker/IBrokerConfig;", "isUnified", "", "isCopytd", "Lcom/kubi/copytrading/data/CopyTradingUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.broker.BrokerConfig$1", m90122f = "FuturesFacedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C113541 extends SuspendLambda implements Function3<Boolean, CopyTradingUiState, Continuation<? super IBrokerConfig>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        public C113541(Continuation<? super C113541> continuation) {
            super(3, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, CopyTradingUiState copyTradingUiState, Continuation<? super IBrokerConfig> continuation) {
            return invoke(bool.booleanValue(), copyTradingUiState, continuation);
        }

        public final Object invoke(boolean z11, CopyTradingUiState copyTradingUiState, Continuation<? super IBrokerConfig> continuation) {
            C113541 c113541 = new C113541(continuation);
            c113541.Z$0 = z11;
            c113541.L$0 = copyTradingUiState;
            return c113541.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11 = this.Z$0;
            CopyTradingUiState copyTradingUiState = (CopyTradingUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IBrokerConfig iBrokerConfigM20200c = BrokerConfig.f19211a.m20200c(z11, copyTradingUiState.getIsMasterAccount());
            iBrokerConfigM20200c.mo20228K(copyTradingUiState.getIsNeedShowLeaderTips());
            return iBrokerConfigM20200c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.broker.BrokerConfig$2 */
    /* JADX INFO: compiled from: FuturesFacedFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "brokerConfig", "Lcom/kubi/broker/IBrokerConfig;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.broker.BrokerConfig$2", m90122f = "FuturesFacedFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C113552 extends SuspendLambda implements Function2<IBrokerConfig, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C113552(Continuation<? super C113552> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(IBrokerConfig iBrokerConfig, Continuation<? super Unit> continuation) {
            return ((C113552) create(iBrokerConfig, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C113552 c113552 = new C113552(continuation);
            c113552.L$0 = obj;
            return c113552;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IBrokerConfig iBrokerConfig = (IBrokerConfig) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BrokerConfig.f19212b.setValue(iBrokerConfig);
            return Unit.INSTANCE;
        }
    }

    static {
        BrokerConfig brokerConfig = new BrokerConfig();
        f19211a = brokerConfig;
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        boolean zMo64979C = companion.get().mo64979C();
        ICopyTradingService.Companion companion2 = ICopyTradingService.f19723a;
        InterfaceC41669n<IBrokerConfig> interfaceC41669nM91009a = C41679x.m91009a(brokerConfig.m20200c(zMo64979C, !companion2.get().mo20635p()));
        f19212b = interfaceC41669nM91009a;
        f19213c = interfaceC41669nM91009a;
        C41636g.m90891O(C41636g.m90896T(C41636g.m90927m(companion.get().mo65009y(), companion2.get().mo20632m(), new C113541(null)), new C113552(null)), C41713n0.m91126b());
    }

    /* JADX INFO: renamed from: c */
    public final IBrokerConfig m20200c(boolean z11, boolean z12) {
        Object obj;
        Object next;
        MultiBizType multiBizType = z12 ? z11 ? MultiBizType.UNIFIED : MultiBizType.CLASSIC : MultiBizType.COPY_TRADING;
        MultiBizType multiBizType2 = MultiBizType.CLASSIC;
        List listM56190l = Router.f46192a.m56190l(IBrokerConfig.class);
        Iterator it = listM56190l.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((InterfaceC43729a) next).mo4515x() != multiBizType);
        InterfaceC43729a interfaceC43729a = (InterfaceC43729a) next;
        if (interfaceC43729a == null && multiBizType2 != MultiBizType.UN_KNOW) {
            for (Object obj2 : listM56190l) {
                if (((InterfaceC43729a) obj2).mo4515x() == multiBizType2) {
                    obj = obj2;
                    break;
                }
            }
            interfaceC43729a = (InterfaceC43729a) obj;
        }
        IBrokerConfig iBrokerConfig = (IBrokerConfig) interfaceC43729a;
        return iBrokerConfig == null ? new C45527a() : iBrokerConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final IBrokerConfig m20201d() {
        return f19212b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41678w<IBrokerConfig> m20202e() {
        return f19213c;
    }
}
