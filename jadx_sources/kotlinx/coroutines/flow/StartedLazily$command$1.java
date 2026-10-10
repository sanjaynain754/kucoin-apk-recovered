package kotlinx.coroutines.flow;

import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/SharingCommand;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.StartedLazily$command$1", m90122f = "SharingStarted.kt", m90123i = {}, m90124l = {151}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class StartedLazily$command$1 extends SuspendLambda implements Function2<InterfaceC41635f<? super SharingCommand>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41678w<Integer> $subscriptionCount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1 */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C416271<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f91645b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41635f<SharingCommand> f91646c;

        /* JADX WARN: Multi-variable type inference failed */
        public C416271(Ref.BooleanRef booleanRef, InterfaceC41635f<? super SharingCommand> interfaceC41635f) {
            this.f91645b = booleanRef;
            this.f91646c = interfaceC41635f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public final Object m90863a(int i11, Continuation<? super Unit> continuation) {
            StartedLazily$command$1$1$emit$1 startedLazily$command$1$1$emit$1;
            if (continuation instanceof StartedLazily$command$1$1$emit$1) {
                startedLazily$command$1$1$emit$1 = (StartedLazily$command$1$1$emit$1) continuation;
                int i12 = startedLazily$command$1$1$emit$1.label;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    startedLazily$command$1$1$emit$1.label = i12 - Integer.MIN_VALUE;
                } else {
                    startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
                }
            } else {
                startedLazily$command$1$1$emit$1 = new StartedLazily$command$1$1$emit$1(this, continuation);
            }
            Object obj = startedLazily$command$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i13 = startedLazily$command$1$1$emit$1.label;
            if (i13 == 0) {
                ResultKt.throwOnFailure(obj);
                if (i11 > 0) {
                    Ref.BooleanRef booleanRef = this.f91645b;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        InterfaceC41635f<SharingCommand> interfaceC41635f = this.f91646c;
                        SharingCommand sharingCommand = SharingCommand.START;
                        startedLazily$command$1$1$emit$1.label = 1;
                        if (interfaceC41635f.emit(sharingCommand, startedLazily$command$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return m90863a(((Number) obj).intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1(InterfaceC41678w<Integer> interfaceC41678w, Continuation<? super StartedLazily$command$1> continuation) {
        super(2, continuation);
        this.$subscriptionCount = interfaceC41678w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StartedLazily$command$1 startedLazily$command$1 = new StartedLazily$command$1(this.$subscriptionCount, continuation);
        startedLazily$command$1.L$0 = obj;
        return startedLazily$command$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41635f<? super SharingCommand> interfaceC41635f, Continuation<? super Unit> continuation) {
        return ((StartedLazily$command$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            InterfaceC41678w<Integer> interfaceC41678w = this.$subscriptionCount;
            C416271 c416271 = new C416271(booleanRef, interfaceC41635f);
            this.label = 1;
            if (interfaceC41678w.collect(c416271, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
