package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.C41658l;
import kotlinx.coroutines.selects.SelectImplementation;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/f;", "downstream", "", "<anonymous>", "(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m90122f = "Delay.kt", m90123i = {0, 0, 0, 0}, m90124l = {412}, m90125m = "invokeSuspend", m90126n = {"downstream", "values", "lastValue", "ticker"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n54#2,5:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,5\n*E\n"})
public final class FlowKt__DelayKt$sample$2<T> extends SuspendLambda implements Function3<InterfaceC41709m0, InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ InterfaceC41634e<T> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2(long j11, InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.$periodMillis = j11;
        this.$this_sample = interfaceC41634e;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, continuation);
        flowKt__DelayKt$sample$2.L$0 = interfaceC41709m0;
        flowKt__DelayKt$sample$2.L$1 = interfaceC41635f;
        return flowKt__DelayKt$sample$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41576o interfaceC41576o;
        InterfaceC41576o<Unit> interfaceC41576oM90886J;
        Ref.ObjectRef objectRef;
        InterfaceC41635f interfaceC41635f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41576oM90886J = (InterfaceC41576o) this.L$3;
                objectRef = (Ref.ObjectRef) this.L$2;
                interfaceC41576o = (InterfaceC41576o) this.L$1;
                interfaceC41635f = (InterfaceC41635f) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            InterfaceC41635f interfaceC41635f2 = (InterfaceC41635f) this.L$1;
            InterfaceC41576o interfaceC41576oM90684d = ProduceKt.m90684d(interfaceC41709m0, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            interfaceC41576o = interfaceC41576oM90684d;
            interfaceC41576oM90886J = C41636g.m90886J(interfaceC41709m0, this.$periodMillis);
            objectRef = objectRef2;
            interfaceC41635f = interfaceC41635f2;
        }
        while (objectRef.element != C41658l.f91702c) {
            SelectImplementation selectImplementation = new SelectImplementation(get$context());
            selectImplementation.mo91279g(interfaceC41576o.mo90596f(), new FlowKt__DelayKt$sample$2$1$1(objectRef, interfaceC41576oM90886J, null));
            selectImplementation.mo91279g(interfaceC41576oM90886J.mo90546A(), new FlowKt__DelayKt$sample$2$1$2(objectRef, interfaceC41635f, null));
            this.L$0 = interfaceC41635f;
            this.L$1 = interfaceC41576o;
            this.L$2 = objectRef;
            this.L$3 = interfaceC41576oM90886J;
            this.label = 1;
            if (selectImplementation.m91283o(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
