package kotlinx.coroutines;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.sequences.SequenceScope;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/x1;", "", "<anonymous>", "(Lkotlin/sequences/SequenceScope;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.JobSupport$children$1", m90122f = "JobSupport.kt", m90123i = {1, 1, 1}, m90124l = {1003, 1005}, m90125m = "invokeSuspend", m90126n = {"$this$sequence", "this_$iv", "cur$iv"}, m90127s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
public final class JobSupport$children$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super InterfaceC41775x1>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JobSupport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(JobSupport jobSupport, Continuation<? super JobSupport$children$1> continuation) {
        super(2, continuation);
        this.this$0 = jobSupport;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this.this$0, continuation);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super InterfaceC41775x1> sequenceScope, Continuation<? super Unit> continuation) {
        return ((JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r3 = r5.L$1
            og0.n r3 = (og0.C43070n) r3
            java.lang.Object r4 = r5.L$0
            kotlin.sequences.SequenceScope r4 = (p852kotlin.sequences.SequenceScope) r4
            p852kotlin.ResultKt.throwOnFailure(r6)
            goto L81
        L1e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L26:
            p852kotlin.ResultKt.throwOnFailure(r6)
            goto L86
        L2a:
            p852kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            kotlin.sequences.SequenceScope r6 = (p852kotlin.sequences.SequenceScope) r6
            kotlinx.coroutines.JobSupport r1 = r5.this$0
            java.lang.Object r1 = r1.m90428k0()
            boolean r4 = r1 instanceof kotlinx.coroutines.C41761u
            if (r4 == 0) goto L48
            kotlinx.coroutines.u r1 = (kotlinx.coroutines.C41761u) r1
            kotlinx.coroutines.v r1 = r1.childJob
            r5.label = r3
            java.lang.Object r6 = r6.yield(r1, r5)
            if (r6 != r0) goto L86
            goto L80
        L48:
            boolean r3 = r1 instanceof kotlinx.coroutines.InterfaceC41741s1
            if (r3 == 0) goto L86
            kotlinx.coroutines.s1 r1 = (kotlinx.coroutines.InterfaceC41741s1) r1
            kotlinx.coroutines.f2 r1 = r1.getList()
            if (r1 == 0) goto L86
            java.lang.Object r3 = r1.m91079j()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            p852kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L63:
            boolean r6 = p852kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r6 != 0) goto L86
            boolean r6 = r1 instanceof kotlinx.coroutines.C41761u
            if (r6 == 0) goto L81
            r6 = r1
            kotlinx.coroutines.u r6 = (kotlinx.coroutines.C41761u) r6
            kotlinx.coroutines.v r6 = r6.childJob
            r5.L$0 = r4
            r5.L$1 = r3
            r5.L$2 = r1
            r5.label = r2
            java.lang.Object r6 = r4.yield(r6, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.m91080k()
            goto L63
        L86:
            kotlin.Unit r6 = p852kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport$children$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
