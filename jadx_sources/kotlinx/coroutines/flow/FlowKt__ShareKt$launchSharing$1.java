package kotlinx.coroutines.flow;

import com.tencent.bugly.proguard.InterfaceC33568bf;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m90122f = "Share.kt", m90123i = {}, m90124l = {210, InterfaceC33568bf.f69245q, 215, 221}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ InterfaceC41668m<T> $shared;
    final /* synthetic */ SharingStarted $started;
    final /* synthetic */ InterfaceC41634e<T> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    /* JADX INFO: compiled from: Share.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m90122f = "Share.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416121 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        int label;

        public C416121(Continuation<? super C416121> continuation) {
            super(2, continuation);
        }

        public final Object invoke(int i11, Continuation<? super Boolean> continuation) {
            return ((C416121) create(Integer.valueOf(i11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C416121 c416121 = new C416121(continuation);
            c416121.I$0 = ((Number) obj).intValue();
            return c416121;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.I$0 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    /* JADX INFO: compiled from: Share.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m90122f = "Share.kt", m90123i = {}, m90124l = {223}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C416132 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ InterfaceC41668m<T> $shared;
        final /* synthetic */ InterfaceC41634e<T> $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* JADX INFO: compiled from: Share.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C416132(InterfaceC41634e<? extends T> interfaceC41634e, InterfaceC41668m<T> interfaceC41668m, T t11, Continuation<? super C416132> continuation) {
            super(2, continuation);
            this.$upstream = interfaceC41634e;
            this.$shared = interfaceC41668m;
            this.$initialValue = t11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C416132 c416132 = new C416132(this.$upstream, this.$shared, this.$initialValue, continuation);
            c416132.L$0 = obj;
            return c416132;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SharingCommand sharingCommand, Continuation<? super Unit> continuation) {
            return ((C416132) create(sharingCommand, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
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
                int i12 = a.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            T t11 = this.$initialValue;
                            if (t11 == C41674s.f91714a) {
                                this.$shared.mo90853b();
                            } else {
                                Boxing.boxBoolean(this.$shared.mo90855d(t11));
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    InterfaceC41634e<T> interfaceC41634e = this.$upstream;
                    InterfaceC41635f interfaceC41635f = this.$shared;
                    this.label = 1;
                    if (interfaceC41634e.collect(interfaceC41635f, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, InterfaceC41634e<? extends T> interfaceC41634e, InterfaceC41668m<T> interfaceC41668m, T t11, Continuation<? super FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.$started = sharingStarted;
        this.$upstream = interfaceC41634e;
        this.$shared = interfaceC41668m;
        this.$initialValue = t11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (kotlinx.coroutines.flow.C41636g.m90925l(r8, r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e<T> interfaceC41634e = this.$upstream;
                    InterfaceC41635f interfaceC41635f = this.$shared;
                    this.label = 3;
                }
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SharingStarted sharingStarted = this.$started;
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        if (sharingStarted == companion.getEagerly()) {
            InterfaceC41634e<T> interfaceC41634e2 = this.$upstream;
            InterfaceC41635f interfaceC41635f2 = this.$shared;
            this.label = 1;
        } else {
            if (this.$started == companion.getLazily()) {
                InterfaceC41678w<Integer> interfaceC41678wM90999e = this.$shared.m90999e();
                C416121 c416121 = new C416121(null);
                this.label = 2;
                if (C41636g.m90883G(interfaceC41678wM90999e, c416121, this) != coroutine_suspended) {
                    InterfaceC41634e<T> interfaceC41634e3 = this.$upstream;
                    InterfaceC41635f interfaceC41635f3 = this.$shared;
                    this.label = 3;
                }
            } else {
                InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(this.$started.mo90862a(this.$shared.m90999e()));
                C416132 c416132 = new C416132(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
            }
            return coroutine_suspended;
        }
    }
}
