package kotlinx.coroutines.flow;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n55#2,3:109\n*E\n"})
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41634e f91566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function3 f91567c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m90122f = "Errors.kt", m90123i = {0, 0}, m90124l = {109, 110}, m90125m = "collect", m90126n = {"this", "$this$catch_u24lambda_u240"}, m90127s = {"L$0", "L$1"})
    public static final class C416011 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C416011(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(InterfaceC41634e interfaceC41634e, Function3 function3) {
        this.f91566b = interfaceC41634e;
        this.f91567c = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r6 == r1) goto L24;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        C416011 c416011;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        if (continuation instanceof C416011) {
            c416011 = (C416011) continuation;
            int i11 = c416011.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416011.label = i11 - Integer.MIN_VALUE;
            } else {
                c416011 = new C416011(continuation);
            }
        } else {
            c416011 = new C416011(continuation);
        }
        Object objM90919i = c416011.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416011.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41635f = (InterfaceC41635f) c416011.L$1;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) c416011.L$0;
                ResultKt.throwOnFailure(objM90919i);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90919i);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM90919i);
        InterfaceC41634e interfaceC41634e = this.f91566b;
        c416011.L$0 = this;
        c416011.L$1 = interfaceC41635f;
        c416011.label = 1;
        objM90919i = C41636g.m90919i(interfaceC41634e, interfaceC41635f, c416011);
        if (objM90919i != coroutine_suspended) {
            flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
        }
        return coroutine_suspended;
        Throwable th2 = (Throwable) objM90919i;
        if (th2 != null) {
            Function3 function3 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.f91567c;
            c416011.L$0 = null;
            c416011.L$1 = null;
            c416011.label = 2;
            InlineMarker.mark(6);
            Object objInvoke = function3.invoke(interfaceC41635f, th2, c416011);
            InlineMarker.mark(7);
        }
        return Unit.INSTANCE;
    }
}
