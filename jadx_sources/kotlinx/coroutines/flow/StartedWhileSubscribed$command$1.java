package kotlinx.coroutines.flow;

import kotlinx.coroutines.DelayKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "count", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;I)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m90122f = "SharingStarted.kt", m90123i = {1, 2, 3}, m90124l = {174, 176, 178, 179, 181}, m90125m = "invokeSuspend", m90126n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, m90127s = {"L$0", "L$0", "L$0"})
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements Function3<InterfaceC41635f<? super SharingCommand>, Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StartedWhileSubscribed this$0;

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41635f<? super SharingCommand> interfaceC41635f, Integer num, Continuation<? super Unit> continuation) {
        return invoke(interfaceC41635f, num.intValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation<? super StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.this$0 = startedWhileSubscribed;
    }

    public final Object invoke(InterfaceC41635f<? super SharingCommand> interfaceC41635f, int i11, Continuation<? super Unit> continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.this$0, continuation);
        startedWhileSubscribed$command$1.L$0 = interfaceC41635f;
        startedWhileSubscribed$command$1.I$0 = i11;
        return startedWhileSubscribed$command$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[PHI: r1
      0x007d: PHI (r1v4 kotlinx.coroutines.flow.f) = (r1v3 kotlinx.coroutines.flow.f), (r1v9 kotlinx.coroutines.flow.f) binds: [B:27:0x007a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008e A[PHI: r1
      0x008e: PHI (r1v5 kotlinx.coroutines.flow.f) = (r1v3 kotlinx.coroutines.flow.f), (r1v4 kotlinx.coroutines.flow.f), (r1v11 kotlinx.coroutines.flow.f) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L34;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        SharingCommand sharingCommand;
        long j11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC41635f = (InterfaceC41635f) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                    } else {
                        interfaceC41635f = (InterfaceC41635f) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        j11 = this.this$0.replayExpiration;
                        this.L$0 = interfaceC41635f;
                        this.label = 4;
                        if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                } else {
                    interfaceC41635f = (InterfaceC41635f) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (this.this$0.replayExpiration > 0) {
                        sharingCommand = SharingCommand.STOP;
                        this.L$0 = interfaceC41635f;
                        this.label = 3;
                        if (interfaceC41635f.emit(sharingCommand, this) != coroutine_suspended) {
                            j11 = this.this$0.replayExpiration;
                            this.L$0 = interfaceC41635f;
                            this.label = 4;
                            if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                SharingCommand sharingCommand2 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                this.L$0 = null;
                this.label = 5;
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.L$0;
        if (this.I$0 <= 0) {
            long j12 = this.this$0.stopTimeout;
            this.L$0 = interfaceC41635f;
            this.label = 2;
            if (DelayKt.m90350b(j12, this) != coroutine_suspended) {
                if (this.this$0.replayExpiration > 0) {
                    sharingCommand = SharingCommand.STOP;
                    this.L$0 = interfaceC41635f;
                    this.label = 3;
                    if (interfaceC41635f.emit(sharingCommand, this) != coroutine_suspended) {
                        j11 = this.this$0.replayExpiration;
                        this.L$0 = interfaceC41635f;
                        this.label = 4;
                        if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
                            SharingCommand sharingCommand3 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                            this.L$0 = null;
                            this.label = 5;
                        }
                    }
                } else {
                    SharingCommand sharingCommand4 = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                    this.L$0 = null;
                    this.label = 5;
                }
            }
        } else {
            SharingCommand sharingCommand5 = SharingCommand.START;
            this.label = 1;
        }
        return coroutine_suspended;
    }
}
