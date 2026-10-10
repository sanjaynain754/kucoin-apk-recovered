package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m90122f = "Merge.kt", m90123i = {}, m90124l = {23}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41635f<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 */
    /* JADX INFO: compiled from: Merge.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C416401<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.ObjectRef<InterfaceC41775x1> f91666b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41709m0 f91667c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f91668d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC41635f<R> f91669e;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
        @DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m90122f = "Merge.kt", m90123i = {}, m90124l = {30}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC41635f<R> $collector;
            final /* synthetic */ T $value;
            int label;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC41635f<? super R> interfaceC41635f, T t11, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = interfaceC41635f;
                this.$value = t11;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
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
                    Function3 function3 = this.this$0.transform;
                    Object obj2 = this.$collector;
                    T t11 = this.$value;
                    this.label = 1;
                    if (function3.invoke(obj2, t11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C416401(Ref.ObjectRef<InterfaceC41775x1> objectRef, InterfaceC41709m0 interfaceC41709m0, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC41635f<? super R> interfaceC41635f) {
            this.f91666b = objectRef;
            this.f91667c = interfaceC41709m0;
            this.f91668d = channelFlowTransformLatest;
            this.f91669e = interfaceC41635f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            C416401<T> c416401;
            if (continuation instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                int i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC41775x1 interfaceC41775x1 = this.f91666b.element;
                if (interfaceC41775x1 != null) {
                    interfaceC41775x1.mo90415a(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t11;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = interfaceC41775x1;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                    if (interfaceC41775x1.mo90385E(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                c416401 = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t11 = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                c416401 = (C416401) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            c416401.f91666b.element = (T) C41696j.m91104d(c416401.f91667c, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(c416401.f91668d, c416401.f91669e, t11, null), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = interfaceC41635f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, continuation);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r7v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            p852kotlin.ResultKt.throwOnFailure(r8)
            goto L37
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            p852kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.m0 r8 = (kotlinx.coroutines.InterfaceC41709m0) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
            kotlinx.coroutines.flow.e<S> r4 = r3.flow
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            kotlinx.coroutines.flow.f<R> r6 = r7.$collector
            r5.<init>(r1, r8, r3, r6)
            r7.label = r2
            java.lang.Object r8 = r4.collect(r5, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            kotlin.Unit r8 = p852kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
