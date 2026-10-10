package androidx.room;

import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.C41568g;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.channels.InterfaceC41567f;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"R", "Lkotlinx/coroutines/flow/f;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@DebugMetadata(m90121c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", m90122f = "CoroutinesRoom.kt", m90123i = {}, m90124l = {110}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class CoroutinesRoom$Companion$createFlow$1<R> extends SuspendLambda implements Function2<InterfaceC41635f<R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"R", "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
    @DebugMetadata(m90121c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", m90122f = "CoroutinesRoom.kt", m90123i = {}, m90124l = {136}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C39591 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC41635f<R> $$this$flow;
        final /* synthetic */ Callable<R> $callable;
        final /* synthetic */ RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ String[] $tableNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: CoroutinesRoom.kt */
        @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"R", "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
        @DebugMetadata(m90121c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", m90122f = "CoroutinesRoom.kt", m90123i = {}, m90124l = {127, 129}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            final /* synthetic */ Callable<R> $callable;
            final /* synthetic */ RoomDatabase $db;
            final /* synthetic */ CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ InterfaceC41565d<Unit> $observerChannel;
            final /* synthetic */ InterfaceC41565d<R> $resultChannel;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoomDatabase roomDatabase, CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, InterfaceC41565d<Unit> interfaceC41565d, Callable<R> callable, InterfaceC41565d<R> interfaceC41565d2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = interfaceC41565d;
                this.$callable = callable;
                this.$resultChannel = interfaceC41565d2;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0047  */
            /* JADX WARN: Code duplicated, block: B:21:0x0048  */
            /* JADX WARN: Code duplicated, block: B:24:0x0053 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x003d, B:22:0x004b, B:24:0x0053, B:14:0x0025, B:17:0x0037), top: B:31:0x0008 }] */
            /* JADX WARN: Code duplicated, block: B:27:0x0069  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
            
                if (r4.send(r7, r6) == r0) goto L26;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                InterfaceC41567f<Unit> it;
                InterfaceC41567f<Unit> interfaceC41567f;
                Object objMo90631a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                try {
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                interfaceC41567f = (InterfaceC41567f) this.L$0;
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC41567f = (InterfaceC41567f) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (((Boolean) obj).booleanValue()) {
                                interfaceC41567f.next();
                                R rCall = this.$callable.call();
                                InterfaceC41565d<R> interfaceC41565d = this.$resultChannel;
                                this.L$0 = interfaceC41567f;
                                this.label = 2;
                            } else {
                                this.$db.getInvalidationTracker().removeObserver(this.$observer);
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        this.$db.getInvalidationTracker().addObserver(this.$observer);
                        it = this.$observerChannel.iterator();
                        this.L$0 = it;
                        this.label = 1;
                        objMo90631a = it.mo90631a(this);
                        if (objMo90631a == coroutine_suspended) {
                            interfaceC41567f = it;
                            obj = objMo90631a;
                            if (((Boolean) obj).booleanValue()) {
                                interfaceC41567f.next();
                                R rCall2 = this.$callable.call();
                                InterfaceC41565d<R> interfaceC41565d2 = this.$resultChannel;
                                this.L$0 = interfaceC41567f;
                                this.label = 2;
                            } else {
                                this.$db.getInvalidationTracker().removeObserver(this.$observer);
                                return Unit.INSTANCE;
                            }
                        }
                        return coroutine_suspended;
                    }
                    it = interfaceC41567f;
                    this.L$0 = it;
                    this.label = 1;
                    objMo90631a = it.mo90631a(this);
                    if (objMo90631a == coroutine_suspended) {
                        interfaceC41567f = it;
                        obj = objMo90631a;
                        if (((Boolean) obj).booleanValue()) {
                            interfaceC41567f.next();
                            R rCall3 = this.$callable.call();
                            InterfaceC41565d<R> interfaceC41565d3 = this.$resultChannel;
                            this.L$0 = interfaceC41567f;
                            this.label = 2;
                        } else {
                            this.$db.getInvalidationTracker().removeObserver(this.$observer);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    this.$db.getInvalidationTracker().removeObserver(this.$observer);
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39591(boolean z11, RoomDatabase roomDatabase, InterfaceC41635f<R> interfaceC41635f, String[] strArr, Callable<R> callable, Continuation<? super C39591> continuation) {
            super(2, continuation);
            this.$inTransaction = z11;
            this.$db = roomDatabase;
            this.$$this$flow = interfaceC41635f;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C39591 c39591 = new C39591(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, continuation);
            c39591.L$0 = obj;
            return c39591;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
            return ((C39591) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContinuationInterceptor transactionDispatcher;
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
                final InterfaceC41565d interfaceC41565dM90691b = C41568g.m90691b(-1, null, null, 6, null);
                final String[] strArr = this.$tableNames;
                ?? r11 = new InvalidationTracker.Observer(strArr, interfaceC41565dM90691b) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    final /* synthetic */ InterfaceC41565d<Unit> $observerChannel;
                    final /* synthetic */ String[] $tableNames;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(strArr);
                        this.$tableNames = strArr;
                        this.$observerChannel = interfaceC41565dM90691b;
                    }

                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(@NotNull Set<String> tables) {
                        Intrinsics.checkNotNullParameter(tables, "tables");
                        this.$observerChannel.mo90594e(Unit.INSTANCE);
                    }
                };
                interfaceC41565dM90691b.mo90594e(Unit.INSTANCE);
                TransactionElement transactionElement = (TransactionElement) interfaceC41709m0.getF34870b().get(TransactionElement.INSTANCE);
                if (transactionElement == null) {
                    transactionDispatcher = null;
                } else {
                    transactionDispatcher = transactionElement.getTransactionDispatcher();
                }
                if (transactionDispatcher == null) {
                    if (this.$inTransaction) {
                        transactionDispatcher = CoroutinesRoomKt.getTransactionDispatcher(this.$db);
                    } else {
                        transactionDispatcher = CoroutinesRoomKt.getQueryDispatcher(this.$db);
                    }
                }
                InterfaceC41565d interfaceC41565dM90691b2 = C41568g.m90691b(0, null, null, 7, null);
                C41696j.m91104d(interfaceC41709m0, transactionDispatcher, null, new AnonymousClass1(this.$db, r11, interfaceC41565dM90691b, this.$callable, interfaceC41565dM90691b2, null), 2, null);
                InterfaceC41635f<R> interfaceC41635f = this.$$this$flow;
                this.label = 1;
                if (C41636g.m90877A(interfaceC41635f, interfaceC41565dM90691b2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$createFlow$1(boolean z11, RoomDatabase roomDatabase, String[] strArr, Callable<R> callable, Continuation<? super CoroutinesRoom$Companion$createFlow$1> continuation) {
        super(2, continuation);
        this.$inTransaction = z11;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, continuation);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<R> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
        return ((CoroutinesRoom$Companion$createFlow$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C39591 c39591 = new C39591(this.$inTransaction, this.$db, (InterfaceC41635f) this.L$0, this.$tableNames, this.$callable, null);
            this.label = 1;
            if (C41713n0.m91130f(c39591, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
