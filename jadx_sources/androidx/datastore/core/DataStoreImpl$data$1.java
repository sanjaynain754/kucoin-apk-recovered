package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1", m90122f = "DataStoreImpl.kt", m90123i = {0, 1, 1}, m90124l = {72, 74, 100}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow", "startState"}, m90127s = {"L$0", "L$0", "L$1"})
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,538:1\n53#2:539\n55#2:543\n50#3:540\n55#3:542\n107#4:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n108#1:539\n108#1:543\n108#1:540\n108#1:542\n108#1:541\n*E\n"})
public final class DataStoreImpl$data$1<T> extends SuspendLambda implements Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Landroidx/datastore/core/State;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$1", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {102}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23091 extends SuspendLambda implements Function2<InterfaceC41635f<? super State<T>>, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23091(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23091> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23091(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41635f<? super State<T>> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
            return ((C23091) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
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
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Landroidx/datastore/core/State;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23102 extends SuspendLambda implements Function2<State<T>, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C23102(Continuation<? super C23102> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State<T> state, @Nullable Continuation<? super Boolean> continuation) {
            return ((C23102) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23102 c23102 = new C23102(continuation);
            c23102.L$0 = obj;
            return c23102;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(!(((State) this.L$0) instanceof Final));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Landroidx/datastore/core/State;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23113 extends SuspendLambda implements Function2<State<T>, Continuation<? super Boolean>, Object> {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull State<T> state, @Nullable Continuation<? super Boolean> continuation) {
            return ((C23113) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23113(State<T> state, Continuation<? super C23113> continuation) {
            super(2, continuation);
            this.$startState = state;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23113 c23113 = new C23113(this.$startState, continuation);
            c23113.L$0 = obj;
            return c23113;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z11;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                State state = (State) this.L$0;
                if ((state instanceof Data) && state.getVersion() <= this.$startState.getVersion()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boxing.boxBoolean(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$5 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$5", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {116}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23125 extends SuspendLambda implements Function3<InterfaceC41635f<? super T>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23125(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23125> continuation) {
            super(3, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @Nullable Throwable th2, @Nullable Continuation<? super Unit> continuation) {
            return new C23125(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
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
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, Continuation<? super DataStoreImpl$data$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, continuation);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
        return ((DataStoreImpl$data$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (kotlinx.coroutines.flow.C41636g.m90878B(r1, r9, r8) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.flow.f] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ?? r11;
        State state;
        ?? r12;
        State state2;
        ?? r13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    state2 = (State) this.L$1;
                    InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r12 = interfaceC41635f;
                    state = state2;
                    r13 = r12;
                    r13 = r11;
                    final InterfaceC41634e interfaceC41634eM90943z = C41636g.m90943z(C41636g.m90920i0(C41636g.m90897U(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new C23091(this.this$0, null)), new C23102(null)), new C23113(state, null));
                    InterfaceC41634e interfaceC41634eM90895S = C41636g.m90895S(new InterfaceC41634e<T>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n1#1,222:1\n54#2:223\n109#3,5:224\n*E\n"})
                        public static final class C23132<T> implements InterfaceC41635f {
                            final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                            /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Emitters.kt */
                            @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                            @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C23132.this.emit(null, this);
                                }
                            }

                            public C23132(InterfaceC41635f interfaceC41635f) {
                                this.$this_unsafeFlow = interfaceC41635f;
                            }

                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlinx.coroutines.flow.InterfaceC41635f
                            @Nullable
                            public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i11 = anonymousClass1.label;
                                    if ((i11 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i12 = anonymousClass1.label;
                                if (i12 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                    State state = (State) obj;
                                    if (state instanceof ReadException) {
                                        throw ((ReadException) state).getReadException();
                                    }
                                    if (!(state instanceof Data)) {
                                        if (state instanceof Final ? true : state instanceof UnInitialized) {
                                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Object value = ((Data) state).getValue();
                                    anonymousClass1.label = 1;
                                    if (interfaceC41635f.emit(value, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i12 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.InterfaceC41634e
                        @Nullable
                        public Object collect(@NotNull InterfaceC41635f interfaceC41635f2, @NotNull Continuation continuation) {
                            Object objCollect = interfaceC41634eM90943z.collect(new C23132(interfaceC41635f2), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }, new C23125(this.this$0, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
            } else {
                InterfaceC41635f interfaceC41635f2 = (InterfaceC41635f) this.L$0;
                ResultKt.throwOnFailure(obj);
                r11 = interfaceC41635f2;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f interfaceC41635f3 = (InterfaceC41635f) this.L$0;
        DataStoreImpl<T> dataStoreImpl = this.this$0;
        this.L$0 = interfaceC41635f3;
        this.label = 1;
        Object state3 = dataStoreImpl.readState(false, this);
        if (state3 != coroutine_suspended) {
            r11 = interfaceC41635f3;
            obj = state3;
        }
        return coroutine_suspended;
        state = (State) obj;
        if (state instanceof Data) {
            Object value = ((Data) state).getValue();
            this.L$0 = r11;
            this.L$1 = state;
            this.label = 2;
            if (r11.emit(value, this) != coroutine_suspended) {
                r12 = r11;
                state2 = state;
                state = state2;
                r13 = r12;
                r13 = r11;
                final InterfaceC41634e interfaceC41634eM90943z2 = C41636g.m90943z(C41636g.m90920i0(C41636g.m90897U(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new C23091(this.this$0, null)), new C23102(null)), new C23113(state, null));
                InterfaceC41634e interfaceC41634eM90895S2 = C41636g.m90895S(new InterfaceC41634e<T>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n1#1,222:1\n54#2:223\n109#3,5:224\n*E\n"})
                    public static final class C23132<T> implements InterfaceC41635f {
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C23132.this.emit(null, this);
                            }
                        }

                        public C23132(InterfaceC41635f interfaceC41635f) {
                            this.$this_unsafeFlow = interfaceC41635f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).getReadException();
                                }
                                if (!(state instanceof Data)) {
                                    if (state instanceof Final ? true : state instanceof UnInitialized) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                Object value = ((Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(value, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f interfaceC41635f4, @NotNull Continuation continuation) {
                        Object objCollect = interfaceC41634eM90943z2.collect(new C23132(interfaceC41635f4), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C23125(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            }
        } else if (!(state instanceof UnInitialized)) {
            if (!(state instanceof ReadException)) {
                if (state instanceof Final) {
                    r13 = r11;
                    return Unit.INSTANCE;
                }
                r13 = r11;
                final InterfaceC41634e interfaceC41634eM90943z3 = C41636g.m90943z(C41636g.m90920i0(C41636g.m90897U(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new C23091(this.this$0, null)), new C23102(null)), new C23113(state, null));
                InterfaceC41634e interfaceC41634eM90895S3 = C41636g.m90895S(new InterfaceC41634e<T>() { // from class: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2 */
                    /* JADX INFO: compiled from: Emitters.kt */
                    @Metadata(m90083d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n1#1,222:1\n54#2:223\n109#3,5:224\n*E\n"})
                    public static final class C23132<T> implements InterfaceC41635f {
                        final /* synthetic */ InterfaceC41635f $this_unsafeFlow;

                        /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
                        @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {223}, m90125m = "emit", m90126n = {}, m90127s = {})
                        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C23132.this.emit(null, this);
                            }
                        }

                        public C23132(InterfaceC41635f interfaceC41635f) {
                            this.$this_unsafeFlow = interfaceC41635f;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlinx.coroutines.flow.InterfaceC41635f
                        @Nullable
                        public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i12 = anonymousClass1.label;
                            if (i12 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC41635f interfaceC41635f = this.$this_unsafeFlow;
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).getReadException();
                                }
                                if (!(state instanceof Data)) {
                                    if (state instanceof Final ? true : state instanceof UnInitialized) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                Object value = ((Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (interfaceC41635f.emit(value, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i12 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC41634e
                    @Nullable
                    public Object collect(@NotNull InterfaceC41635f interfaceC41635f4, @NotNull Continuation continuation) {
                        Object objCollect = interfaceC41634eM90943z3.collect(new C23132(interfaceC41635f4), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new C23125(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
            } else {
                throw ((ReadException) state).getReadException();
            }
        } else {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        return coroutine_suspended;
    }
}
