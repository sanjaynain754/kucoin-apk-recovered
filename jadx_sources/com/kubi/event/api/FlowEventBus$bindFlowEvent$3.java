package com.kubi.event.api;

import com.kubi.event.common.EventExKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.InlineMarker;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: compiled from: FlowEventBus.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@DebugMetadata(m90121c = "com.kubi.event.api.FlowEventBus$bindFlowEvent$3", m90122f = "FlowEventBus.kt", m90123i = {0, 0, 0}, m90124l = {114, 114}, m90125m = "invokeSuspend", m90126n = {"bizType$iv", "methodName$iv", "reportName$iv"}, m90127s = {"L$0", "L$1", "L$2"})
public final class FlowEventBus$bindFlowEvent$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<InterfaceC43461b, Continuation<? super Unit>, Object> $action;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.event.api.FlowEventBus$bindFlowEvent$3$a */
    /* JADX INFO: compiled from: Collect.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"com/kubi/event/api/FlowEventBus$bindFlowEvent$3$a", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C12571a implements InterfaceC41635f<InterfaceC43461b> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function2 f21597b;

        public C12571a(Function2 function2) {
            this.f21597b = function2;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        @Nullable
        public Object emit(InterfaceC43461b interfaceC43461b, @NotNull Continuation<? super Unit> continuation) {
            Function2 function2 = this.f21597b;
            InlineMarker.mark(6);
            Object objInvoke = function2.invoke(interfaceC43461b, continuation);
            InlineMarker.mark(7);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowEventBus$bindFlowEvent$3(Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super FlowEventBus$bindFlowEvent$3> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowEventBus$bindFlowEvent$3(this.$action, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowEventBus$bindFlowEvent$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r8.collect(r3, r7) == r0) goto L34;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
        Throwable th2;
        String str2;
        String str3;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                    Result.m103844constructorimpl(Unit.INSTANCE);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str3 = (String) this.L$2;
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    th2 = th3;
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    if (!(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                        C44128b.m97262f(str3, "【FlowEventBus发生错误!!!】", thM103847exceptionOrNullimpl);
                        EventExKt.m23700c(str, str2, thM103847exceptionOrNullimpl);
                    } else {
                        throw thM103847exceptionOrNullimpl;
                    }
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Function2<InterfaceC43461b, Continuation<? super Unit>, Object> function2 = this.$action;
            if (!C12573b.f21598a.m23696a()) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    InterfaceC41634e interfaceC41634eM23690e = FlowEventBus.f21594a.m23690e();
                    C12571a c12571a = new C12571a(function2);
                    this.L$0 = "flow_event_bus";
                    this.L$1 = "NONE";
                    this.L$2 = "crash_issue";
                    this.label = 1;
                    if (interfaceC41634eM23690e.collect(c12571a, this) != coroutine_suspended) {
                        str = "flow_event_bus";
                        str2 = "NONE";
                        str3 = "crash_issue";
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            if (!(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                                C44128b.m97262f(str3, "【FlowEventBus发生错误!!!】", thM103847exceptionOrNullimpl);
                                EventExKt.m23700c(str, str2, thM103847exceptionOrNullimpl);
                            } else {
                                throw thM103847exceptionOrNullimpl;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    str = "flow_event_bus";
                    th2 = th4;
                    str2 = "NONE";
                    str3 = "crash_issue";
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            } else {
                Result.Companion companion4 = Result.INSTANCE;
                InterfaceC41634e interfaceC41634eM23690e2 = FlowEventBus.f21594a.m23690e();
                C12571a c12571a2 = new C12571a(function2);
                this.label = 2;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
