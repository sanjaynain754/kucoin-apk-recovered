package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SafeCollector;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n73#2:109\n74#2,7:111\n375#3:110\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:110\n*E\n"})
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements InterfaceC41634e<T> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function2 f91564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC41634e f91565c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m90122f = "Emitters.kt", m90123i = {0, 0, 0}, m90124l = {112, 116}, m90125m = "collect", m90126n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, m90127s = {"L$0", "L$1", "L$2"})
    public static final class C416001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C416001(Continuation continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(Function2 function2, InterfaceC41634e interfaceC41634e) {
        this.f91564b = function2;
        this.f91565c = interfaceC41634e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r7.collect(r2, r0) == r1) goto L27;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41634e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) throws Throwable {
        C416001 c416001;
        Throwable th2;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        InterfaceC41635f<? super T> interfaceC41635f2;
        if (continuation instanceof C416001) {
            c416001 = (C416001) continuation;
            int i11 = c416001.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c416001.label = i11 - Integer.MIN_VALUE;
            } else {
                c416001 = new C416001(continuation);
            }
        } else {
            c416001 = new C416001(continuation);
        }
        Object obj = c416001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c416001.label;
        if (i12 != 0) {
            if (i12 == 1) {
                safeCollector = (SafeCollector) c416001.L$2;
                interfaceC41635f2 = (InterfaceC41635f) c416001.L$1;
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) c416001.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    safeCollector.releaseIntercepted();
                    InterfaceC41634e interfaceC41634e = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f91565c;
                    c416001.L$0 = null;
                    c416001.L$1 = null;
                    c416001.L$2 = null;
                    c416001.label = 2;
                } catch (Throwable th3) {
                    th2 = th3;
                    safeCollector.releaseIntercepted();
                    throw th2;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SafeCollector safeCollector2 = new SafeCollector(interfaceC41635f, c416001.getContext());
        try {
            Function2 function2 = this.f91564b;
            c416001.L$0 = this;
            c416001.L$1 = interfaceC41635f;
            c416001.L$2 = safeCollector2;
            c416001.label = 1;
            InlineMarker.mark(6);
            Object objInvoke = function2.invoke(safeCollector2, c416001);
            InlineMarker.mark(7);
            if (objInvoke != coroutine_suspended) {
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                interfaceC41635f2 = interfaceC41635f;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                InterfaceC41634e interfaceC41634e2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f91565c;
                c416001.L$0 = null;
                c416001.L$1 = null;
                c416001.L$2 = null;
                c416001.label = 2;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            th2 = th4;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th2;
        }
    }
}
