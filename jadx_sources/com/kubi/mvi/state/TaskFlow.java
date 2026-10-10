package com.kubi.mvi.state;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.common.C19242d;
import com.kubi.mvi.common.MviExKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p734wq.C45916a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TaskFlow.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJB\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m90084d2 = {"Lcom/kubi/mvi/state/TaskFlow;", "", "<init>", "()V", "", JPushConstants.Operation.KEY_SEQUENCE, "mainThread", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Lkotlinx/coroutines/channels/ChannelResult;", "e", "(ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "g", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "Lcom/kubi/mvi/state/t;", "it", "c", "(Lcom/kubi/mvi/state/t;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/m0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/coroutines/m0;", "scope", "Lkotlinx/coroutines/channels/d;", "b", "Lkotlinx/coroutines/channels/d;", "taskChannel", "Lkotlinx/coroutines/flow/e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lkotlinx/coroutines/flow/e;", "taskFlow", "Companion", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTaskFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskFlow.kt\ncom/kubi/mvi/state/TaskFlow\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n50#2,17:100\n1#3:117\n*S KotlinDebug\n*F\n+ 1 TaskFlow.kt\ncom/kubi/mvi/state/TaskFlow\n*L\n68#1:100,17\n*E\n"})
public final class TaskFlow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41709m0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41565d<C19298t> taskChannel;

    /* JADX INFO: renamed from: com.kubi.mvi.state.TaskFlow$1 */
    /* JADX INFO: compiled from: TaskFlow.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lcom/kubi/mvi/state/t;", "it", "", "<anonymous>", "(Lcom/kubi/mvi/state/t;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
    @DebugMetadata(m90121c = "com.kubi.mvi.state.TaskFlow$1", m90122f = "TaskFlow.kt", m90123i = {}, m90124l = {58}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C192781 extends SuspendLambda implements Function2<C19298t, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.kubi.mvi.state.TaskFlow$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: TaskFlow.kt */
        /* JADX INFO: loaded from: classes29.dex */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
        @DebugMetadata(m90121c = "com.kubi.mvi.state.TaskFlow$1$1", m90122f = "TaskFlow.kt", m90123i = {}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ C19298t $it;
            int label;
            final /* synthetic */ TaskFlow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TaskFlow taskFlow, C19298t c19298t, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = taskFlow;
                this.$it = c19298t;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$it, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
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
                    TaskFlow taskFlow = this.this$0;
                    C19298t c19298t = this.$it;
                    this.label = 1;
                    if (taskFlow.m42654c(c19298t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull C19298t c19298t, @Nullable Continuation<? super Unit> continuation) {
            return ((C192781) create(c19298t, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C192781(Continuation<? super C192781> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C192781 c192781 = TaskFlow.this.new C192781(continuation);
            c192781.L$0 = obj;
            return c192781;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                C19298t c19298t = (C19298t) this.L$0;
                if (!c19298t.getSequence()) {
                    C41696j.m91104d(TaskFlow.this.scope, null, null, new AnonymousClass1(TaskFlow.this, c19298t, null), 3, null);
                } else {
                    TaskFlow taskFlow = TaskFlow.this;
                    this.label = 1;
                    if (taskFlow.m42654c(c19298t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m42653f(TaskFlow taskFlow, boolean z11, boolean z12, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return taskFlow.m42656e(z11, z12, function1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r9.invoke(r0) == r1) goto L31;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42654c(C19298t c19298t, Continuation<? super Unit> continuation) throws Throwable {
        TaskFlow$call$1 taskFlow$call$1;
        String str;
        String str2;
        Throwable th2;
        int i11;
        Object objM103844constructorimpl;
        if (continuation instanceof TaskFlow$call$1) {
            taskFlow$call$1 = (TaskFlow$call$1) continuation;
            int i12 = taskFlow$call$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                taskFlow$call$1.label = i12 - Integer.MIN_VALUE;
            } else {
                taskFlow$call$1 = new TaskFlow$call$1(this, continuation);
            }
        } else {
            taskFlow$call$1 = new TaskFlow$call$1(this, continuation);
        }
        Object obj = taskFlow$call$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = taskFlow$call$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(obj);
            int i14 = !C19241c.f35620a.m42528a() ? 1 : 0;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (c19298t.getMainThread()) {
                    AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
                    TaskFlow$call$2$1 taskFlow$call$2$1 = new TaskFlow$call$2$1(c19298t, null);
                    taskFlow$call$1.L$0 = "task_flow";
                    taskFlow$call$1.L$1 = "crash_issue";
                    taskFlow$call$1.I$0 = i14;
                    taskFlow$call$1.label = 1;
                    if (C41686h.m91049g(abstractC41697j0M94121c, taskFlow$call$2$1, taskFlow$call$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = "task_flow";
                    i11 = i14;
                    str2 = "crash_issue";
                } else {
                    Function1<Continuation<? super Unit>, Object> function1M42674a = c19298t.m42674a();
                    taskFlow$call$1.L$0 = "task_flow";
                    taskFlow$call$1.L$1 = "crash_issue";
                    taskFlow$call$1.I$0 = i14;
                    taskFlow$call$1.label = 2;
                }
            } catch (Throwable th3) {
                str = "task_flow";
                str2 = "crash_issue";
                th2 = th3;
                i11 = i14;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = taskFlow$call$1.I$0;
            str2 = (String) taskFlow$call$1.L$1;
            str = (String) taskFlow$call$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th4) {
                th2 = th4;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
        }
        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (i11 == 0 || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                throw thM103847exceptionOrNullimpl;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("->【");
            sb2.append(str);
            sb2.append(" 发生错误:needCatch->");
            sb2.append(i11 != 0);
            sb2.append((char) 12305);
            C44128b.m97262f(str2, sb2.toString(), thM103847exceptionOrNullimpl);
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 != null) {
            C45916a.m101366a(thM103847exceptionOrNullimpl2, "TaskFlow");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m42655d() {
        C41713n0.m91129e(this.scope, null, 1, null);
    }

    @Deprecated(message = "use emitTaskAsync", replaceWith = @ReplaceWith(expression = "emitTaskAsync", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: e */
    public final Object m42656e(boolean sequence, boolean mainThread, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object objMo90594e = this.taskChannel.mo90594e(new C19298t(sequence, mainThread, block));
        C19242d.f35622a.m42531b("mvi-task", "emitTask result:" + ChannelResult.m90677j(objMo90594e));
        return objMo90594e;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m42657g(boolean z11, boolean z12, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.taskChannel.send(new C19298t(z11, z12, function1), continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC41634e<C19298t> m42658h() {
        return C41636g.m90936s(this.taskChannel);
    }

    public TaskFlow() {
        InterfaceC41709m0 interfaceC41709m0M42508d = MviExKt.m42508d("TaskFlow", null, 2, null);
        this.scope = interfaceC41709m0M42508d;
        this.taskChannel = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);
        C41636g.m90891O(C41636g.m90896T(m42658h(), new C192781(null)), interfaceC41709m0M42508d);
    }
}
