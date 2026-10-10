package com.kubi.event.api;

import com.kubi.event.common.EventExKt;
import java.util.concurrent.CancellationException;
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
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: compiled from: FlowEventBus.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lpf/b;", "it", "", "<anonymous>", "(Lpf/b;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@DebugMetadata(m90121c = "com.kubi.event.api.FlowEventBus$bindFlowEvent$2", m90122f = "FlowEventBus.kt", m90123i = {0, 0, 0}, m90124l = {80, 80}, m90125m = "invokeSuspend", m90126n = {"bizType$iv", "methodName$iv", "reportName$iv"}, m90127s = {"L$0", "L$1", "L$2"})
public final class FlowEventBus$bindFlowEvent$2 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<InterfaceC43461b, Continuation<? super Unit>, Object> $action;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowEventBus$bindFlowEvent$2(Function2<? super InterfaceC43461b, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super FlowEventBus$bindFlowEvent$2> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowEventBus$bindFlowEvent$2 flowEventBus$bindFlowEvent$2 = new FlowEventBus$bindFlowEvent$2(this.$action, continuation);
        flowEventBus$bindFlowEvent$2.L$0 = obj;
        return flowEventBus$bindFlowEvent$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowEventBus$bindFlowEvent$2) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r4.invoke(r9, r8) == r0) goto L34;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        String str;
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
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
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
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            Function2<InterfaceC43461b, Continuation<? super Unit>, Object> function2 = this.$action;
            if (!C12573b.f21598a.m23696a()) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    this.L$0 = "FlowEventBus";
                    this.L$1 = "NONE";
                    this.L$2 = "crash_issue";
                    this.label = 1;
                    if (function2.invoke(interfaceC43461b, this) != coroutine_suspended) {
                        str = "FlowEventBus";
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
                } catch (Throwable th3) {
                    th = th3;
                    str = "FlowEventBus";
                    str2 = "NONE";
                    str3 = "crash_issue";
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                Result.Companion companion4 = Result.INSTANCE;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
