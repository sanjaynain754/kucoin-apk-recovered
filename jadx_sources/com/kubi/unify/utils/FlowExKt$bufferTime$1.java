package com.kubi.unify.utils;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.channels.InterfaceC41574m;
import kotlinx.coroutines.channels.InterfaceC41577p;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: FlowEx.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/ProducerScope;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.utils.FlowExKt$bufferTime$1", m90122f = "FlowEx.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, m90124l = {54, 66, 66}, m90125m = "invokeSuspend", m90126n = {"$this$channelFlow", "bufferChannel", "windowJob", "firstRun", "$this$channelFlow", "bufferChannel", "windowJob", "firstRun", "remaining", "$this$channelFlow", "bufferChannel", "windowJob", "firstRun", "remaining"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$5"})
public final class FlowExKt$bufferTime$1<T> extends SuspendLambda implements Function2<InterfaceC41574m<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e<T> $this_bufferTime;
    final /* synthetic */ long $timeMillis;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX INFO: renamed from: com.kubi.unify.utils.FlowExKt$bufferTime$1$a */
    /* JADX INFO: compiled from: FlowEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26704a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41565d<T> f53494b;

        public C26704a(InterfaceC41565d<T> interfaceC41565d) {
            this.f53494b = interfaceC41565d;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            Object objSend = this.f53494b.send(t11, continuation);
            return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExKt$bufferTime$1(InterfaceC41634e<? extends T> interfaceC41634e, long j11, Continuation<? super FlowExKt$bufferTime$1> continuation) {
        super(2, continuation);
        this.$this_bufferTime = interfaceC41634e;
        this.$timeMillis = j11;
    }

    /* JADX INFO: renamed from: a */
    public static final <T> void m65461a(Ref.ObjectRef<InterfaceC41775x1> objectRef, InterfaceC41574m<? super List<? extends T>> interfaceC41574m, AtomicBoolean atomicBoolean, long j11, InterfaceC41565d<T> interfaceC41565d) {
        objectRef.element = (T) C41696j.m91104d(interfaceC41574m, null, null, new FlowExKt$bufferTime$1$launchTimer$1(atomicBoolean, j11, interfaceC41565d, interfaceC41574m, null), 3, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExKt$bufferTime$1 flowExKt$bufferTime$1 = new FlowExKt$bufferTime$1(this.$this_bufferTime, this.$timeMillis, continuation);
        flowExKt$bufferTime$1.L$0 = obj;
        return flowExKt$bufferTime$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41574m<? super List<? extends T>> interfaceC41574m, Continuation<? super Unit> continuation) {
        return ((FlowExKt$bufferTime$1) create(interfaceC41574m, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb A[LOOP:0: B:25:0x00b1->B:27:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:45:0x0110 A[LOOP:1: B:43:0x0106->B:45:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf A[EDGE_INSN: B:59:0x00bf->B:28:0x00bf BREAK  A[LOOP:0: B:25:0x00b1->B:27:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0114 A[EDGE_INSN: B:60:0x0114->B:46:0x0114 BREAK  A[LOOP:1: B:43:0x0106->B:45:0x0110], SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (r2.send(r13, r12) == r7) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0142, code lost:
    
        if (r2.send(r4, r12) == r7) goto L52;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicBoolean atomicBoolean;
        Ref.ObjectRef objectRef;
        InterfaceC41565d interfaceC41565d;
        Ref.ObjectRef objectRef2;
        AtomicBoolean atomicBoolean2;
        InterfaceC41565d interfaceC41565d2;
        InterfaceC41775x1 interfaceC41775x1;
        ArrayList arrayList;
        Object objM90673f;
        InterfaceC41775x1 interfaceC41775x2;
        ArrayList arrayList2;
        Object objM90673f2;
        InterfaceC41574m interfaceC41574m = (InterfaceC41574m) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41565d interfaceC41565dM90691b = C41568g.m90691b(Integer.MAX_VALUE, null, null, 6, null);
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            atomicBoolean = new AtomicBoolean(true);
            try {
                m65461a(objectRef3, interfaceC41574m, atomicBoolean, this.$timeMillis, interfaceC41565dM90691b);
                InterfaceC41634e<T> interfaceC41634e = this.$this_bufferTime;
                C26704a c26704a = new C26704a(interfaceC41565dM90691b);
                this.L$0 = interfaceC41574m;
                this.L$1 = interfaceC41565dM90691b;
                this.L$2 = objectRef3;
                this.L$3 = SpillingKt.nullOutSpilledVariable(atomicBoolean);
                this.label = 1;
                if (interfaceC41634e.collect(c26704a, this) != coroutine_suspended) {
                    objectRef2 = objectRef3;
                    atomicBoolean2 = atomicBoolean;
                    interfaceC41565d2 = interfaceC41565dM90691b;
                    interfaceC41775x2 = (InterfaceC41775x1) objectRef2.element;
                    if (interfaceC41775x2 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
                    }
                    arrayList2 = new ArrayList();
                    while (true) {
                        objM90673f2 = ChannelResult.m90673f(interfaceC41565d2.mo90609o());
                        if (objM90673f2 != null) {
                            break;
                            break;
                        }
                        arrayList2.add(objM90673f2);
                    }
                    if (!arrayList2.isEmpty()) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
                        this.L$1 = interfaceC41565d2;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(objectRef2);
                        this.L$3 = SpillingKt.nullOutSpilledVariable(atomicBoolean2);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(arrayList2);
                        this.label = 2;
                    }
                    InterfaceC41577p.a.m90714a(interfaceC41565d2, null, 1, null);
                    return Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef3;
                interfaceC41565d = interfaceC41565dM90691b;
                interfaceC41775x1 = (InterfaceC41775x1) objectRef.element;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                arrayList = new ArrayList();
                while (true) {
                    objM90673f = ChannelResult.m90673f(interfaceC41565d.mo90609o());
                    if (objM90673f != null) {
                        break;
                        break;
                    }
                    arrayList.add(objM90673f);
                }
                if (!arrayList.isEmpty()) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
                    this.L$1 = interfaceC41565d;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(objectRef);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(atomicBoolean);
                    this.L$4 = th;
                    this.L$5 = SpillingKt.nullOutSpilledVariable(arrayList);
                    this.label = 3;
                }
                InterfaceC41577p.a.m90714a(interfaceC41565d, null, 1, null);
                throw th;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            atomicBoolean2 = (AtomicBoolean) this.L$3;
            objectRef2 = (Ref.ObjectRef) this.L$2;
            InterfaceC41565d interfaceC41565d3 = (InterfaceC41565d) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
                interfaceC41565d2 = interfaceC41565d3;
                interfaceC41775x2 = (InterfaceC41775x1) objectRef2.element;
                if (interfaceC41775x2 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
                }
                arrayList2 = new ArrayList();
                while (true) {
                    objM90673f2 = ChannelResult.m90673f(interfaceC41565d2.mo90609o());
                    if (objM90673f2 != null) {
                        break;
                    }
                    arrayList2.add(objM90673f2);
                }
                if (!arrayList2.isEmpty() && C41713n0.m91132h(interfaceC41574m)) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
                    this.L$1 = interfaceC41565d2;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(objectRef2);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(atomicBoolean2);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(arrayList2);
                    this.label = 2;
                }
            } catch (Throwable th3) {
                th = th3;
                objectRef = objectRef2;
                atomicBoolean = atomicBoolean2;
                interfaceC41565d = interfaceC41565d3;
                interfaceC41775x1 = (InterfaceC41775x1) objectRef.element;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                arrayList = new ArrayList();
                while (true) {
                    objM90673f = ChannelResult.m90673f(interfaceC41565d.mo90609o());
                    if (objM90673f != null) {
                        break;
                    }
                    arrayList.add(objM90673f);
                }
                if (!arrayList.isEmpty() && C41713n0.m91132h(interfaceC41574m)) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41574m);
                    this.L$1 = interfaceC41565d;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(objectRef);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(atomicBoolean);
                    this.L$4 = th;
                    this.L$5 = SpillingKt.nullOutSpilledVariable(arrayList);
                    this.label = 3;
                }
                InterfaceC41577p.a.m90714a(interfaceC41565d, null, 1, null);
                throw th;
            }
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$4;
                interfaceC41565d = (InterfaceC41565d) this.L$1;
                ResultKt.throwOnFailure(obj);
                InterfaceC41577p.a.m90714a(interfaceC41565d, null, 1, null);
                throw th;
            }
            interfaceC41565d2 = (InterfaceC41565d) this.L$1;
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC41577p.a.m90714a(interfaceC41565d2, null, 1, null);
        return Unit.INSTANCE;
    }
}
