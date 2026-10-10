package androidx.room;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41690i;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41742s2;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.InterfaceC41781z;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m90084d2 = {"R", "Landroidx/room/RoomDatabase;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "withTransaction", "(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "createTransactionContext", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/x1;", "controlJob", "Lkotlin/coroutines/ContinuationInterceptor;", "acquireTransactionThread", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/x1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-ktx_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class RoomDatabaseKt {

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$createTransactionContext$1 */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.room.RoomDatabaseKt", m90122f = "RoomDatabase.kt", m90123i = {0, 0}, m90124l = {99}, m90125m = "createTransactionContext", m90126n = {"$this$createTransactionContext", "controlJob"}, m90127s = {"L$0", "L$1"})
    public static final class C39701 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.createTransactionContext(null, this);
        }

        public C39701(Continuation<? super C39701> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$withTransaction$1 */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.room.RoomDatabaseKt", m90122f = "RoomDatabase.kt", m90123i = {0, 0}, m90124l = {50, 51}, m90125m = "withTransaction", m90126n = {"$this$withTransaction", "block"}, m90127s = {"L$0", "L$1"})
    public static final class C39721<R> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.withTransaction(null, null, this);
        }

        public C39721(Continuation<? super C39721> continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$withTransaction$2 */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {"R", "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 6, 0})
    @DebugMetadata(m90121c = "androidx.room.RoomDatabaseKt$withTransaction$2", m90122f = "RoomDatabase.kt", m90123i = {0}, m90124l = {58}, m90125m = "invokeSuspend", m90126n = {"transactionElement"}, m90127s = {"L$0"})
    public static final class C39732<R> extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ RoomDatabase $this_withTransaction;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C39732(RoomDatabase roomDatabase, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C39732> continuation) {
            super(2, continuation);
            this.$this_withTransaction = roomDatabase;
            this.$block = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39732 c39732 = new C39732(this.$this_withTransaction, this.$block, continuation);
            c39732.L$0 = obj;
            return c39732;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super R> continuation) {
            return ((C39732) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Throwable th2;
            TransactionElement transactionElement;
            TransactionElement coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        transactionElement = (TransactionElement) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            this.$this_withTransaction.endTransaction();
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    CoroutineContext.Element element = ((InterfaceC41709m0) this.L$0).getF34870b().get(TransactionElement.INSTANCE);
                    Intrinsics.checkNotNull(element);
                    TransactionElement transactionElement2 = (TransactionElement) element;
                    transactionElement2.acquire();
                    try {
                        this.$this_withTransaction.beginTransaction();
                        try {
                            Function1<Continuation<? super R>, Object> function1 = this.$block;
                            this.L$0 = transactionElement2;
                            this.label = 1;
                            Object objInvoke = function1.invoke(this);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            transactionElement = transactionElement2;
                            obj = objInvoke;
                        } catch (Throwable th4) {
                            th2 = th4;
                            this.$this_withTransaction.endTransaction();
                            throw th2;
                        }
                    } catch (Throwable th5) {
                        coroutine_suspended = transactionElement2;
                        th = th5;
                        coroutine_suspended.release();
                        throw th;
                    }
                }
                this.$this_withTransaction.setTransactionSuccessful();
                this.$this_withTransaction.endTransaction();
                transactionElement.release();
                return obj;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object acquireTransactionThread(Executor executor, final InterfaceC41775x1 interfaceC41775x1, Continuation<? super ContinuationInterceptor> continuation) {
        final C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
        });
        try {
            executor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2

                /* JADX INFO: renamed from: androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1 */
                /* JADX INFO: compiled from: RoomDatabase.kt */
                @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
                @DebugMetadata(m90121c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", m90122f = "RoomDatabase.kt", m90123i = {}, m90124l = {124}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
                public static final class C39691 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
                    final /* synthetic */ InterfaceC41708m<ContinuationInterceptor> $continuation;
                    final /* synthetic */ InterfaceC41775x1 $controlJob;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C39691(InterfaceC41708m<? super ContinuationInterceptor> interfaceC41708m, InterfaceC41775x1 interfaceC41775x1, Continuation<? super C39691> continuation) {
                        super(2, continuation);
                        this.$continuation = interfaceC41708m;
                        this.$controlJob = interfaceC41775x1;
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        C39691 c39691 = new C39691(this.$continuation, this.$controlJob, continuation);
                        c39691.L$0 = obj;
                        return c39691;
                    }

                    @Override // p852kotlin.jvm.functions.Function2
                    @Nullable
                    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
                        return ((C39691) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
                            InterfaceC41708m<ContinuationInterceptor> interfaceC41708m = this.$continuation;
                            Result.Companion companion = Result.INSTANCE;
                            CoroutineContext.Element element = interfaceC41709m0.getF34870b().get(ContinuationInterceptor.INSTANCE);
                            Intrinsics.checkNotNull(element);
                            interfaceC41708m.resumeWith(Result.m103844constructorimpl(element));
                            InterfaceC41775x1 interfaceC41775x1 = this.$controlJob;
                            this.label = 1;
                            if (interfaceC41775x1.mo90385E(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    C41690i.m91067b(null, new C39691(c41716o, interfaceC41775x1, null), 1, null);
                }
            });
        } catch (RejectedExecutionException e11) {
            c41716o.mo91116c(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e11));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object createTransactionContext(RoomDatabase roomDatabase, Continuation<? super CoroutineContext> continuation) {
        C39701 c39701;
        RoomDatabase roomDatabase2;
        InterfaceC41781z interfaceC41781z;
        if (continuation instanceof C39701) {
            c39701 = (C39701) continuation;
            int i11 = c39701.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39701.label = i11 - Integer.MIN_VALUE;
            } else {
                c39701 = new C39701(continuation);
            }
        } else {
            c39701 = new C39701(continuation);
        }
        Object obj = c39701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39701.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            final InterfaceC41781z interfaceC41781zM90358b = JobKt__JobKt.m90358b(null, 1, null);
            InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) c39701.get$context().get(InterfaceC41775x1.INSTANCE);
            if (interfaceC41775x1 != null) {
                interfaceC41775x1.mo90426j(new Function1<Throwable, Unit>() { // from class: androidx.room.RoomDatabaseKt.createTransactionContext.2
                    @Override // p852kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th2) {
                        InterfaceC41775x1.a.m91377a(interfaceC41781zM90358b, null, 1, null);
                    }
                });
            }
            Executor transactionExecutor = roomDatabase.getTransactionExecutor();
            Intrinsics.checkNotNullExpressionValue(transactionExecutor, "transactionExecutor");
            c39701.L$0 = roomDatabase;
            c39701.L$1 = interfaceC41781zM90358b;
            c39701.label = 1;
            Object objAcquireTransactionThread = acquireTransactionThread(transactionExecutor, interfaceC41781zM90358b, c39701);
            if (objAcquireTransactionThread == coroutine_suspended) {
                return coroutine_suspended;
            }
            roomDatabase2 = roomDatabase;
            interfaceC41781z = interfaceC41781zM90358b;
            obj = objAcquireTransactionThread;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC41781z = (InterfaceC41781z) c39701.L$1;
            roomDatabase2 = (RoomDatabase) c39701.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) obj;
        TransactionElement transactionElement = new TransactionElement(interfaceC41781z, continuationInterceptor);
        ThreadLocal<Integer> suspendingTransactionId = roomDatabase2.getSuspendingTransactionId();
        Intrinsics.checkNotNullExpressionValue(suspendingTransactionId, "suspendingTransactionId");
        return continuationInterceptor.plus(transactionElement).plus(C41742s2.m91218a(suspendingTransactionId, Boxing.boxInt(System.identityHashCode(interfaceC41781z))));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r8 == r1) goto L28;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object withTransaction(@NotNull RoomDatabase roomDatabase, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1, @NotNull Continuation<? super R> continuation) {
        C39721 c39721;
        CoroutineContext transactionDispatcher;
        Object objM91049g;
        if (continuation instanceof C39721) {
            c39721 = (C39721) continuation;
            int i11 = c39721.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c39721.label = i11 - Integer.MIN_VALUE;
            } else {
                c39721 = new C39721(continuation);
            }
        } else {
            c39721 = new C39721(continuation);
        }
        Object objCreateTransactionContext = c39721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c39721.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objCreateTransactionContext);
            TransactionElement transactionElement = (TransactionElement) c39721.get$context().get(TransactionElement.INSTANCE);
            transactionDispatcher = transactionElement == null ? null : transactionElement.getTransactionDispatcher();
            if (transactionDispatcher == null) {
                c39721.L$0 = roomDatabase;
                c39721.L$1 = function1;
                c39721.label = 1;
                objCreateTransactionContext = createTransactionContext(roomDatabase, c39721);
            } else {
                C39732 c39732 = new C39732(roomDatabase, function1, null);
                c39721.L$0 = null;
                c39721.L$1 = null;
                c39721.label = 2;
                objM91049g = C41686h.m91049g(transactionDispatcher, c39732, c39721);
                if (objM91049g != coroutine_suspended) {
                    return objM91049g;
                }
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateTransactionContext);
            return objCreateTransactionContext;
        }
        function1 = (Function1) c39721.L$1;
        roomDatabase = (RoomDatabase) c39721.L$0;
        ResultKt.throwOnFailure(objCreateTransactionContext);
        transactionDispatcher = (CoroutineContext) objCreateTransactionContext;
        C39732 c39733 = new C39732(roomDatabase, function1, null);
        c39721.L$0 = null;
        c39721.L$1 = null;
        c39721.label = 2;
        objM91049g = C41686h.m91049g(transactionDispatcher, c39733, c39721);
        if (objM91049g != coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91049g;
    }
}
