package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002abBp\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000e\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010\u0016JK\u0010(\u001a\u00028\u000021\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010*\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b,\u0010\u001cJI\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010-2\u0006\u0010*\u001a\u00020\u00182\u001c\u0010/\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0.H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b0\u00101JC\u00102\u001a\u00028\u000021\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b2\u00103J \u00109\u001a\u0002062\u0006\u00104\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010N\u001a\f0MR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010WR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R!\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000Q8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b\\\u0010]*\u0004\b^\u0010_¨\u0006c"}, m90084d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/m0;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/m0;)V", "incrementCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementCollector", "", "requireLock", "Landroidx/datastore/core/State;", "readState", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "readDataFromFileOrDefault", "t", "transform", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "Landroidx/datastore/core/Data;", "readDataOrHandleCorruption", "R", "Lkotlin/Function1;", "block", "doWithWriteFileLock", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "updateCache", "", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/e;", "data", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "Lrg0/a;", "collectorMutex", "Lrg0/a;", "collectorCounter", "I", "Lkotlinx/coroutines/x1;", "collectorJob", "Lkotlinx/coroutines/x1;", "Landroidx/datastore/core/DataStoreInMemoryCache;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lkotlin/Lazy;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "Companion", "InitDataStore", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
public final class DataStoreImpl<T> implements androidx.datastore.core.DataStore<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";

    @org.jetbrains.annotations.NotNull
    public static final androidx.datastore.core.DataStoreImpl.Companion Companion = null;
    private int collectorCounter;

    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.InterfaceC41775x1 collectorJob;

    @org.jetbrains.annotations.NotNull
    private final rg0.InterfaceC44082a collectorMutex;

    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy coordinator$delegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.CorruptionHandler<T> corruptionHandler;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.InterfaceC41634e<T> data;

    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStoreInMemoryCache<T> inMemoryCache;

    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.DataStoreImpl<T>.InitDataStore readAndInit;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.InterfaceC41709m0 scope;

    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.Storage<T> storage;

    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> storageConnectionDelegate;

    @org.jetbrains.annotations.NotNull
    private final androidx.datastore.core.SimpleActor<androidx.datastore.core.Message.Update<T>> writeActor;

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m90084d2 = {"Landroidx/datastore/core/DataStoreImpl$Companion;", "", "()V", "BUG_MESSAGE", "", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001BD\u0012=\u0010\u0002\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00040\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fRG\u0010\r\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "initTasks", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class InitDataStore extends androidx.datastore.core.RunOnce {

        @org.jetbrains.annotations.Nullable
        private java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> initTasks;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public InitDataStore(@org.jetbrains.annotations.NotNull androidx.datastore.core.DataStoreImpl r2, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r3) {
                r1 = this;
                java.lang.String r0 = "initTasksList"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                java.util.List r2 = kotlin.collections.CollectionsKt.toList(r3)
                r1.initTasks = r2
                return
        }

        public static final /* synthetic */ java.util.List access$getInitTasks$p(androidx.datastore.core.DataStoreImpl.InitDataStore r0) {
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r0 = r0.initTasks
                return r0
        }

        public static final /* synthetic */ void access$setInitTasks$p(androidx.datastore.core.DataStoreImpl.InitDataStore r0, java.util.List r1) {
                r0.initTasks = r1
                return
        }

        @Override // androidx.datastore.core.RunOnce
        @org.jetbrains.annotations.Nullable
        public java.lang.Object doRun(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                kotlin.ResultKt.throwOnFailure(r7)
                goto L7d
            L40:
                kotlin.ResultKt.throwOnFailure(r7)
                java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                goto L7b
            L6a:
                r0 = r6
            L6b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7f
            L6e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
            L7b:
                return r1
            L7c:
                r0 = r6
            L7d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7f:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0}, m90124l = {544}, m90125m = "decrementCollector", m90126n = {"this", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1"})
    public static final class C23141 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23141(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23141> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$decrementCollector(r2, r1)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "R", "T"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {416}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23153<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> $block;
        int label;

        public C23153(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23153> r2) {
                r0 = this;
                r0.$block = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r2 = this;
                androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 r0 = new androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$block
                r0.<init>(r1, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super R> r2) {
                r1 = this;
                kotlin.coroutines.Continuation r2 = r1.create(r2)
                androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 r2 = (androidx.datastore.core.DataStoreImpl.C23153) r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                r3 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                kotlin.ResultKt.throwOnFailure(r4)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r3.$block
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                return r4
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {1, 1}, m90124l = {237, 243, 246}, m90125m = "handleUpdate", m90126n = {"update", "$this$handleUpdate_u24lambda_u242"}, m90127s = {"L$0", "L$1"})
    public static final class C23161 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23161(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23161> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$handleUpdate(r2, r0, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0}, m90124l = {544}, m90125m = "incrementCollector", m90126n = {"this", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1"})
    public static final class C23171 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23171(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23171> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$incrementCollector(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 1, 1}, m90124l = {264, 266}, m90125m = "readAndInitOrPropagateAndThrowFailure", m90126n = {"this", "this", "preReadVersion"}, m90127s = {"L$0", "L$0", "I$0"})
    public static final class C23191 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23191(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23191> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r2, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 0, 1, 2}, m90124l = {287, 296, 304}, m90125m = "readDataAndUpdateCache", m90126n = {"this", "currentState", "requireLock", "this", "this"}, m90127s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    public static final class C23201 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23201(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23201> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r2, r0, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {298, 300}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23213 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23213(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23213> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 1
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r3) {
                r2 = this;
                androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 r0 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3
                androidx.datastore.core.DataStoreImpl<T> r1 = r2.this$0
                r0.<init>(r1, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> r2) {
                r1 = this;
                kotlin.coroutines.Continuation r2 = r1.create(r2)
                androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 r2 = (androidx.datastore.core.DataStoreImpl.C23213) r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r4.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r5)
                goto L48
            L16:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1e:
                kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L22
                goto L32
            L22:
                r5 = move-exception
                goto L35
            L24:
                kotlin.ResultKt.throwOnFailure(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L22
                r4.label = r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r5, r3, r4)     // Catch: java.lang.Throwable -> L22
                if (r5 != r0) goto L32
                goto L45
            L32:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5     // Catch: java.lang.Throwable -> L22
                goto L54
            L35:
                androidx.datastore.core.DataStoreImpl<T> r1 = r4.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r4.L$0 = r5
                r4.label = r2
                java.lang.Object r1 = r1.getVersion(r4)
                if (r1 != r0) goto L46
            L45:
                return r0
            L46:
                r0 = r5
                r5 = r1
            L48:
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                androidx.datastore.core.ReadException r1 = new androidx.datastore.core.ReadException
                r1.<init>(r0, r5)
                r5 = r1
            L54:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                kotlin.Pair r5 = kotlin.TuplesKt.m90091to(r5, r0)
                return r5
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", "", "locked"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m90122f = "DataStoreImpl.kt", m90123i = {0, 1}, m90124l = {306, 309}, m90125m = "invokeSuspend", m90126n = {"locked", "locked"}, m90127s = {"Z$0", "Z$0"})
    public static final class C23224 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
        final /* synthetic */ int $cachedVersion;
        java.lang.Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23224(androidx.datastore.core.DataStoreImpl<T> r1, int r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23224> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$cachedVersion = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 r0 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4
                androidx.datastore.core.DataStoreImpl<T> r1 = r3.this$0
                int r2 = r3.$cachedVersion
                r0.<init>(r1, r2, r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r0.Z$0 = r4
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(boolean r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> r2) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 r1 = (androidx.datastore.core.DataStoreImpl.C23224) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                boolean r0 = r5.Z$0
                java.lang.Object r1 = r5.L$0
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.ResultKt.throwOnFailure(r6)
                goto L55
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                boolean r1 = r5.Z$0
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L26
                goto L3a
            L26:
                r6 = move-exception
                goto L3d
            L28:
                kotlin.ResultKt.throwOnFailure(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: java.lang.Throwable -> L26
                r5.Z$0 = r1     // Catch: java.lang.Throwable -> L26
                r5.label = r3     // Catch: java.lang.Throwable -> L26
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r6, r1, r5)     // Catch: java.lang.Throwable -> L26
                if (r6 != r0) goto L3a
                goto L51
            L3a:
                androidx.datastore.core.State r6 = (androidx.datastore.core.State) r6     // Catch: java.lang.Throwable -> L26
                goto L69
            L3d:
                if (r1 == 0) goto L5c
                androidx.datastore.core.DataStoreImpl<T> r3 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r3 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r3)
                r5.L$0 = r6
                r5.Z$0 = r1
                r5.label = r2
                java.lang.Object r2 = r3.getVersion(r5)
                if (r2 != r0) goto L52
            L51:
                return r0
            L52:
                r0 = r1
                r1 = r6
                r6 = r2
            L55:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L62
            L5c:
                int r0 = r5.$cachedVersion
                r4 = r1
                r1 = r6
                r6 = r0
                r0 = r4
            L62:
                androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
                r2.<init>(r1, r6)
                r1 = r0
                r6 = r2
            L69:
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                kotlin.Pair r6 = kotlin.TuplesKt.m90091to(r6, r0)
                return r6
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, m90124l = {365, 366, 368, 369, 380, 384}, m90125m = "readDataOrHandleCorruption", m90126n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    public static final class C23231 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23231(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23231> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                androidx.datastore.core.DataStoreImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r2, r0, r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m90122f = "DataStoreImpl.kt", m90123i = {0, 1}, m90124l = {370, 371}, m90125m = "invokeSuspend", m90126n = {"locked", "data"}, m90127s = {"Z$0", "L$0"})
    public static final class C23242 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>>, java.lang.Object> {
        final /* synthetic */ int $preLockVersion;
        java.lang.Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23242(androidx.datastore.core.DataStoreImpl<T> r1, int r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23242> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$preLockVersion = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 r0 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2
                androidx.datastore.core.DataStoreImpl<T> r1 = r3.this$0
                int r2 = r3.$preLockVersion
                r0.<init>(r1, r2, r5)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r0.Z$0 = r4
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean r1, java.lang.Object r2) {
                r0 = this;
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(boolean r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> r2) {
                r0 = this;
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 r1 = (androidx.datastore.core.DataStoreImpl.C23242) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.L$0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.Z$0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L34
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                boolean r1 = r5.Z$0
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0
                r5.Z$0 = r1
                r5.label = r3
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)
                if (r6 != r0) goto L34
                goto L46
            L34:
                if (r1 == 0) goto L50
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                androidx.datastore.core.InterProcessCoordinator r1 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r1)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.getVersion(r5)
                if (r1 != r0) goto L47
            L46:
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.$preLockVersion
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                androidx.datastore.core.Data r1 = new androidx.datastore.core.Data
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", "T"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {387, 388, 390}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23253 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $newData;
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $version;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23253(kotlin.jvm.internal.Ref.ObjectRef<T> r1, androidx.datastore.core.DataStoreImpl<T> r2, kotlin.jvm.internal.Ref.IntRef r3, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23253> r4) {
                r0 = this;
                r0.$newData = r1
                r0.this$0 = r2
                r0.$version = r3
                r1 = 1
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r4 = this;
                androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 r0 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3
                kotlin.jvm.internal.Ref$ObjectRef<T> r1 = r4.$newData
                androidx.datastore.core.DataStoreImpl<T> r2 = r4.this$0
                kotlin.jvm.internal.Ref$IntRef r3 = r4.$version
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> r1) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r0.invoke2(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r1 = this;
                kotlin.coroutines.Continuation r2 = r1.create(r2)
                androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 r2 = (androidx.datastore.core.DataStoreImpl.C23253) r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L29
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r5.L$0
                kotlin.jvm.internal.Ref$IntRef r0 = (kotlin.jvm.internal.Ref.IntRef) r0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L76
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                java.lang.Object r1 = r5.L$0
                kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: androidx.datastore.core.CorruptionException -> L61
                goto L58
            L29:
                java.lang.Object r1 = r5.L$0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: androidx.datastore.core.CorruptionException -> L61
                goto L43
            L31:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.internal.Ref$ObjectRef<T> r1 = r5.$newData     // Catch: androidx.datastore.core.CorruptionException -> L61
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L61
                r5.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L61
                r5.label = r4     // Catch: androidx.datastore.core.CorruptionException -> L61
                java.lang.Object r6 = androidx.datastore.core.DataStoreImpl.access$readDataFromFileOrDefault(r6, r5)     // Catch: androidx.datastore.core.CorruptionException -> L61
                if (r6 != r0) goto L43
                goto L73
            L43:
                r1.element = r6     // Catch: androidx.datastore.core.CorruptionException -> L61
                kotlin.jvm.internal.Ref$IntRef r1 = r5.$version     // Catch: androidx.datastore.core.CorruptionException -> L61
                androidx.datastore.core.DataStoreImpl<T> r6 = r5.this$0     // Catch: androidx.datastore.core.CorruptionException -> L61
                androidx.datastore.core.InterProcessCoordinator r6 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r6)     // Catch: androidx.datastore.core.CorruptionException -> L61
                r5.L$0 = r1     // Catch: androidx.datastore.core.CorruptionException -> L61
                r5.label = r3     // Catch: androidx.datastore.core.CorruptionException -> L61
                java.lang.Object r6 = r6.getVersion(r5)     // Catch: androidx.datastore.core.CorruptionException -> L61
                if (r6 != r0) goto L58
                goto L73
            L58:
                java.lang.Number r6 = (java.lang.Number) r6     // Catch: androidx.datastore.core.CorruptionException -> L61
                int r6 = r6.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L61
                r1.element = r6     // Catch: androidx.datastore.core.CorruptionException -> L61
                goto L7e
            L61:
                kotlin.jvm.internal.Ref$IntRef r6 = r5.$version
                androidx.datastore.core.DataStoreImpl<T> r1 = r5.this$0
                kotlin.jvm.internal.Ref$ObjectRef<T> r3 = r5.$newData
                T r3 = r3.element
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r3, r4, r5)
                if (r1 != r0) goto L74
            L73:
                return r0
            L74:
                r0 = r6
                r6 = r1
            L76:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r0.element = r6
            L7e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "Landroidx/datastore/core/State;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/datastore/core/State;"}, m90085k = 3, m90086mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readState$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {218, 226}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23262 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>>, java.lang.Object> {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23262(androidx.datastore.core.DataStoreImpl<T> r1, boolean r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23262> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$requireLock = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                androidx.datastore.core.DataStoreImpl$readState$2 r3 = new androidx.datastore.core.DataStoreImpl$readState$2
                androidx.datastore.core.DataStoreImpl<T> r0 = r2.this$0
                boolean r1 = r2.$requireLock
                r3.<init>(r0, r1, r4)
                return r3
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.DataStoreImpl$readState$2 r1 = (androidx.datastore.core.DataStoreImpl.C23262) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L54
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L1e
                goto L47
            L1e:
                r5 = move-exception
                goto L57
            L20:
                kotlin.ResultKt.throwOnFailure(r5)
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                boolean r5 = r5 instanceof androidx.datastore.core.Final
                if (r5 == 0) goto L3c
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                androidx.datastore.core.DataStoreInMemoryCache r5 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r5)
                androidx.datastore.core.State r5 = r5.getCurrentState()
                return r5
            L3c:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0     // Catch: java.lang.Throwable -> L1e
                r4.label = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readAndInitOrPropagateAndThrowFailure(r5, r4)     // Catch: java.lang.Throwable -> L1e
                if (r5 != r0) goto L47
                goto L53
            L47:
                androidx.datastore.core.DataStoreImpl<T> r5 = r4.this$0
                boolean r1 = r4.$requireLock
                r4.label = r2
                java.lang.Object r5 = androidx.datastore.core.DataStoreImpl.access$readDataAndUpdateCache(r5, r1, r4)
                if (r5 != r0) goto L54
            L53:
                return r0
            L54:
                androidx.datastore.core.State r5 = (androidx.datastore.core.State) r5
                return r5
            L57:
                androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
                r1 = -1
                r0.<init>(r5, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "T"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m90122f = "DataStoreImpl.kt", m90123i = {1, 2}, m90124l = {330, 331, 337}, m90125m = "invokeSuspend", m90126n = {"curData", "newData"}, m90127s = {"L$0", "L$0"})
    public static final class C23272 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext $callerContext;
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23272(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23272> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.$callerContext = r2
                r0.$transform = r3
                r1 = 1
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r4 = this;
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2 r0 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2
                androidx.datastore.core.DataStoreImpl<T> r1 = r4.this$0
                kotlin.coroutines.CoroutineContext r2 = r4.$callerContext
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r3 = r4.$transform
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r1 = r0.invoke(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super T> r2) {
                r1 = this;
                kotlin.coroutines.Continuation r2 = r1.create(r2)
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2 r2 = (androidx.datastore.core.DataStoreImpl.C23272) r2
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                java.lang.Object r2 = r2.invokeSuspend(r0)
                return r2
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.L$0
                kotlin.ResultKt.throwOnFailure(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.ResultKt.throwOnFailure(r9)
                goto L51
            L27:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L39
            L2b:
                kotlin.ResultKt.throwOnFailure(r9)
                androidx.datastore.core.DataStoreImpl<T> r9 = r8.this$0
                r8.label = r4
                java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r9, r4, r8)
                if (r9 != r0) goto L39
                goto L6a
            L39:
                r1 = r9
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                kotlin.coroutines.CoroutineContext r9 = r8.$callerContext
                androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r5 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r6 = r8.$transform
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.L$0 = r1
                r8.label = r3
                java.lang.Object r9 = kotlinx.coroutines.C41686h.m91049g(r9, r5, r8)
                if (r9 != r0) goto L51
                goto L6a
            L51:
                r1.checkHashCode()
                java.lang.Object r1 = r1.getValue()
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
                if (r1 != 0) goto L6b
                androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
                r8.L$0 = r9
                r8.label = r2
                java.lang.Object r1 = r1.writeData$datastore_core_release(r9, r4, r8)
                if (r1 != r0) goto L6b
            L6a:
                return r0
            L6b:
                return r9
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$updateData$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {169}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23282 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

        public C23282(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl.C23282> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$transform = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                androidx.datastore.core.DataStoreImpl$updateData$2 r0 = new androidx.datastore.core.DataStoreImpl$updateData$2
                androidx.datastore.core.DataStoreImpl<T> r1 = r3.this$0
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                return r0
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super T> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                androidx.datastore.core.DataStoreImpl$updateData$2 r1 = (androidx.datastore.core.DataStoreImpl.C23282) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r7)
                return r7
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.ResultKt.throwOnFailure(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.m0 r7 = (kotlinx.coroutines.InterfaceC41709m0) r7
                r1 = 0
                kotlinx.coroutines.w r1 = kotlinx.coroutines.C41777y.m91388c(r1, r2, r1)
                androidx.datastore.core.DataStoreImpl<T> r3 = r6.this$0
                androidx.datastore.core.DataStoreInMemoryCache r3 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r3)
                androidx.datastore.core.State r3 = r3.getCurrentState()
                androidx.datastore.core.Message$Update r4 = new androidx.datastore.core.Message$Update
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r5 = r6.$transform
                kotlin.coroutines.CoroutineContext r7 = r7.getCoroutineContext()
                r4.<init>(r5, r1, r3, r7)
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.SimpleActor r7 = androidx.datastore.core.DataStoreImpl.access$getWriteActor$p(r7)
                r7.offer(r4)
                r6.label = r2
                java.lang.Object r7 = r1.mo91198h(r6)
                if (r7 != r0) goto L4a
                return r0
            L4a:
                return r7
        }
    }

    static {
            androidx.datastore.core.DataStoreImpl$Companion r0 = new androidx.datastore.core.DataStoreImpl$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.datastore.core.DataStoreImpl.Companion = r0
            return
    }

    public DataStoreImpl(@org.jetbrains.annotations.NotNull androidx.datastore.core.Storage<T> r3, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.datastore.core.InitializerApi<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> r4, @org.jetbrains.annotations.NotNull androidx.datastore.core.CorruptionHandler<T> r5, @org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r6) {
            r2 = this;
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "initTasksList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "corruptionHandler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r2.<init>()
            r2.storage = r3
            r2.corruptionHandler = r5
            r2.scope = r6
            androidx.datastore.core.DataStoreImpl$data$1 r3 = new androidx.datastore.core.DataStoreImpl$data$1
            r5 = 0
            r3.<init>(r2, r5)
            kotlinx.coroutines.flow.e r3 = kotlinx.coroutines.flow.C41636g.m90887K(r3)
            r2.data = r3
            r3 = 0
            r0 = 1
            rg0.a r3 = rg0.C44087f.m97144b(r3, r0, r5)
            r2.collectorMutex = r3
            androidx.datastore.core.DataStoreInMemoryCache r3 = new androidx.datastore.core.DataStoreInMemoryCache
            r3.<init>()
            r2.inMemoryCache = r3
            androidx.datastore.core.DataStoreImpl$InitDataStore r3 = new androidx.datastore.core.DataStoreImpl$InitDataStore
            r3.<init>(r2, r4)
            r2.readAndInit = r3
            androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1 r3 = new androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            r3.<init>(r2)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy(r3)
            r2.storageConnectionDelegate = r3
            androidx.datastore.core.DataStoreImpl$coordinator$2 r3 = new androidx.datastore.core.DataStoreImpl$coordinator$2
            r3.<init>(r2)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy(r3)
            r2.coordinator$delegate = r3
            androidx.datastore.core.SimpleActor r3 = new androidx.datastore.core.SimpleActor
            androidx.datastore.core.DataStoreImpl$writeActor$1 r4 = new androidx.datastore.core.DataStoreImpl$writeActor$1
            r4.<init>(r2)
            androidx.datastore.core.DataStoreImpl$writeActor$2 r0 = androidx.datastore.core.DataStoreImpl$writeActor$2.INSTANCE
            androidx.datastore.core.DataStoreImpl$writeActor$3 r1 = new androidx.datastore.core.DataStoreImpl$writeActor$3
            r1.<init>(r2, r5)
            r3.<init>(r6, r4, r0, r1)
            r2.writeActor = r3
            return
    }

    public /* synthetic */ DataStoreImpl(androidx.datastore.core.Storage r1, java.util.List r2, androidx.datastore.core.CorruptionHandler r3, kotlinx.coroutines.InterfaceC41709m0 r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r6 = r5 & 4
            if (r6 == 0) goto L11
            androidx.datastore.core.handlers.NoOpCorruptionHandler r3 = new androidx.datastore.core.handlers.NoOpCorruptionHandler
            r3.<init>()
        L11:
            r5 = r5 & 8
            if (r5 == 0) goto L27
            kotlinx.coroutines.j0 r4 = androidx.datastore.core.Actual_jvmKt.ioDispatcher()
            r5 = 1
            r6 = 0
            kotlinx.coroutines.z r5 = kotlinx.coroutines.C41727q2.m91192b(r6, r5, r6)
            kotlin.coroutines.CoroutineContext r4 = r4.plus(r5)
            kotlinx.coroutines.m0 r4 = kotlinx.coroutines.C41713n0.m91125a(r4)
        L27:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static final /* synthetic */ java.lang.Object access$decrementCollector(androidx.datastore.core.DataStoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.decrementCollector(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$doWithWriteFileLock(androidx.datastore.core.DataStoreImpl r0, boolean r1, kotlin.jvm.functions.Function1 r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.doWithWriteFileLock(r1, r2, r3)
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.InterProcessCoordinator access$getCoordinator(androidx.datastore.core.DataStoreImpl r0) {
            androidx.datastore.core.InterProcessCoordinator r0 = r0.getCoordinator()
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.DataStoreInMemoryCache access$getInMemoryCache$p(androidx.datastore.core.DataStoreImpl r0) {
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.DataStoreImpl.InitDataStore access$getReadAndInit$p(androidx.datastore.core.DataStoreImpl r0) {
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r0 = r0.readAndInit
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.Storage access$getStorage$p(androidx.datastore.core.DataStoreImpl r0) {
            androidx.datastore.core.Storage<T> r0 = r0.storage
            return r0
    }

    public static final /* synthetic */ kotlin.Lazy access$getStorageConnectionDelegate$p(androidx.datastore.core.DataStoreImpl r0) {
            kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> r0 = r0.storageConnectionDelegate
            return r0
    }

    public static final /* synthetic */ androidx.datastore.core.SimpleActor access$getWriteActor$p(androidx.datastore.core.DataStoreImpl r0) {
            androidx.datastore.core.SimpleActor<androidx.datastore.core.Message$Update<T>> r0 = r0.writeActor
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$handleUpdate(androidx.datastore.core.DataStoreImpl r0, androidx.datastore.core.Message.Update r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.handleUpdate(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$incrementCollector(androidx.datastore.core.DataStoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.incrementCollector(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readAndInitOrPropagateAndThrowFailure(androidx.datastore.core.DataStoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readAndInitOrPropagateAndThrowFailure(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readDataAndUpdateCache(androidx.datastore.core.DataStoreImpl r0, boolean r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.readDataAndUpdateCache(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readDataFromFileOrDefault(androidx.datastore.core.DataStoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.readDataFromFileOrDefault(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readDataOrHandleCorruption(androidx.datastore.core.DataStoreImpl r0, boolean r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.readDataOrHandleCorruption(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$readState(androidx.datastore.core.DataStoreImpl r0, boolean r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.readState(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$transformAndWrite(androidx.datastore.core.DataStoreImpl r0, kotlin.jvm.functions.Function2 r1, kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.transformAndWrite(r1, r2, r3)
            return r0
    }

    private final java.lang.Object decrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C23141
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C23141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$decrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$decrementCollector$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            rg0.a r1 = (rg0.InterfaceC44082a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r6)
            rg0.a r6 = r5.collectorMutex
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r0 = r6.mo91344d(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.collectorCounter     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.collectorCounter = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            kotlinx.coroutines.x1 r6 = r0.collectorJob     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            kotlinx.coroutines.InterfaceC41775x1.a.m91377a(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.collectorJob = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
            r1.mo91345e(r4)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L6a:
            r1.mo91345e(r4)
            throw r6
    }

    private final <R> java.lang.Object doWithWriteFileLock(boolean r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super R> r5) {
            r2 = this;
            if (r3 == 0) goto L7
            java.lang.Object r3 = r4.invoke(r5)
            return r3
        L7:
            androidx.datastore.core.InterProcessCoordinator r3 = r2.getCoordinator()
            androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 r0 = new androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3
            r1 = 0
            r0.<init>(r4, r1)
            java.lang.Object r3 = r3.lock(r0, r5)
            return r3
    }

    private final androidx.datastore.core.InterProcessCoordinator getCoordinator() {
            r1 = this;
            kotlin.Lazy r0 = r1.coordinator$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.datastore.core.InterProcessCoordinator r0 = (androidx.datastore.core.InterProcessCoordinator) r0
            return r0
    }

    private static java.lang.Object getStorageConnection$datastore_core_release$delegate(androidx.datastore.core.DataStoreImpl<java.lang.Object> r0) {
            kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> r0 = r0.storageConnectionDelegate
            return r0
    }

    private final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.DataStoreImpl.C23161
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = (androidx.datastore.core.DataStoreImpl.C23161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$handleUpdate$1 r0 = new androidx.datastore.core.DataStoreImpl$handleUpdate$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L56
            if (r2 == r5) goto L51
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.w r9 = (kotlinx.coroutines.InterfaceC41769w) r9
        L2f:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            goto Lbc
        L34:
            r10 = move-exception
            goto Lde
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.w r9 = (kotlinx.coroutines.InterfaceC41769w) r9
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            java.lang.Object r4 = r0.L$0
            androidx.datastore.core.Message$Update r4 = (androidx.datastore.core.Message.Update) r4
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L34
            r10 = r9
            r9 = r4
            goto La4
        L51:
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.w r9 = (kotlinx.coroutines.InterfaceC41769w) r9
            goto L2f
        L56:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.w r10 = r9.getAck()
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L80
            androidx.datastore.core.DataStoreInMemoryCache<T> r2 = r8.inMemoryCache     // Catch: java.lang.Throwable -> L80
            androidx.datastore.core.State r2 = r2.getCurrentState()     // Catch: java.lang.Throwable -> L80
            boolean r6 = r2 instanceof androidx.datastore.core.Data     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L85
            kotlin.jvm.functions.Function2 r2 = r9.getTransform()     // Catch: java.lang.Throwable -> L80
            kotlin.coroutines.CoroutineContext r9 = r9.getCallerContext()     // Catch: java.lang.Throwable -> L80
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L80
            r0.label = r5     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r8.transformAndWrite(r2, r9, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L7c
            goto Lbb
        L7c:
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lbc
        L80:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lde
        L85:
            boolean r6 = r2 instanceof androidx.datastore.core.ReadException     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L8a
            goto L8c
        L8a:
            boolean r5 = r2 instanceof androidx.datastore.core.UnInitialized     // Catch: java.lang.Throwable -> L80
        L8c:
            if (r5 == 0) goto Lcd
            androidx.datastore.core.State r5 = r9.getLastState()     // Catch: java.lang.Throwable -> L80
            if (r2 != r5) goto Lc1
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r10     // Catch: java.lang.Throwable -> L80
            r0.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r8.readAndInitOrPropagateAndThrowFailure(r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto La3
            goto Lbb
        La3:
            r2 = r8
        La4:
            kotlin.jvm.functions.Function2 r4 = r9.getTransform()     // Catch: java.lang.Throwable -> L80
            kotlin.coroutines.CoroutineContext r9 = r9.getCallerContext()     // Catch: java.lang.Throwable -> L80
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L80
            r5 = 0
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L80
            r0.label = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r2.transformAndWrite(r4, r9, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L7c
        Lbb:
            return r1
        Lbc:
            java.lang.Object r10 = kotlin.Result.m103844constructorimpl(r10)     // Catch: java.lang.Throwable -> L34
            goto Le8
        Lc1:
            java.lang.String r9 = "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r9)     // Catch: java.lang.Throwable -> L80
            androidx.datastore.core.ReadException r2 = (androidx.datastore.core.ReadException) r2     // Catch: java.lang.Throwable -> L80
            java.lang.Throwable r9 = r2.getReadException()     // Catch: java.lang.Throwable -> L80
            throw r9     // Catch: java.lang.Throwable -> L80
        Lcd:
            boolean r9 = r2 instanceof androidx.datastore.core.Final     // Catch: java.lang.Throwable -> L80
            if (r9 == 0) goto Ld8
            androidx.datastore.core.Final r2 = (androidx.datastore.core.Final) r2     // Catch: java.lang.Throwable -> L80
            java.lang.Throwable r9 = r2.getFinalException()     // Catch: java.lang.Throwable -> L80
            throw r9     // Catch: java.lang.Throwable -> L80
        Ld8:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L80
            r9.<init>()     // Catch: java.lang.Throwable -> L80
            throw r9     // Catch: java.lang.Throwable -> L80
        Lde:
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m103844constructorimpl(r10)
        Le8:
            kotlinx.coroutines.C41777y.m91389d(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    private final java.lang.Object incrementCollector(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
            r11 = this;
            boolean r0 = r12 instanceof androidx.datastore.core.DataStoreImpl.C23171
            if (r0 == 0) goto L13
            r0 = r12
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = (androidx.datastore.core.DataStoreImpl.C23171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$incrementCollector$1 r0 = new androidx.datastore.core.DataStoreImpl$incrementCollector$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            rg0.a r1 = (rg0.InterfaceC44082a) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.throwOnFailure(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.ResultKt.throwOnFailure(r12)
            rg0.a r12 = r11.collectorMutex
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r12.mo91344d(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.collectorCounter     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.collectorCounter = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L6a
            kotlinx.coroutines.m0 r5 = r0.scope     // Catch: java.lang.Throwable -> L67
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1 r8 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1     // Catch: java.lang.Throwable -> L67
            r8.<init>(r0, r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            kotlinx.coroutines.x1 r12 = kotlinx.coroutines.C41686h.m91046d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.collectorJob = r12     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r12 = r0
            goto L72
        L6a:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            r1.mo91345e(r4)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L72:
            r1.mo91345e(r4)
            throw r12
    }

    private final java.lang.Object readAndInitOrPropagateAndThrowFailure(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl.C23191
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl.C23191) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L57
        L44:
            kotlin.ResultKt.throwOnFailure(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            goto L6b
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
    }

    private final java.lang.Object readDataAndUpdateCache(boolean r10, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> r11) {
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.DataStoreImpl.C23201
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r0 = (androidx.datastore.core.DataStoreImpl.C23201) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 r0 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L58
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.DataStoreImpl r10 = (androidx.datastore.core.DataStoreImpl) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto Lc3
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.L$0
            androidx.datastore.core.DataStoreImpl r10 = (androidx.datastore.core.DataStoreImpl) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto Laa
        L45:
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$1
            androidx.datastore.core.State r2 = (androidx.datastore.core.State) r2
            java.lang.Object r5 = r0.L$0
            androidx.datastore.core.DataStoreImpl r5 = (androidx.datastore.core.DataStoreImpl) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r11
            r11 = r10
            r10 = r5
            r5 = r2
            r2 = r8
            goto L7c
        L58:
            kotlin.ResultKt.throwOnFailure(r11)
            androidx.datastore.core.DataStoreInMemoryCache<T> r11 = r9.inMemoryCache
            androidx.datastore.core.State r2 = r11.getCurrentState()
            boolean r11 = r2 instanceof androidx.datastore.core.UnInitialized
            if (r11 != 0) goto Ldd
            androidx.datastore.core.InterProcessCoordinator r11 = r9.getCoordinator()
            r0.L$0 = r9
            r0.L$1 = r2
            r0.Z$0 = r10
            r0.label = r5
            java.lang.Object r11 = r11.getVersion(r0)
            if (r11 != r1) goto L78
            goto Lc2
        L78:
            r5 = r2
            r2 = r11
            r11 = r10
            r10 = r9
        L7c:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            boolean r6 = r5 instanceof androidx.datastore.core.Data
            if (r6 == 0) goto L8b
            int r7 = r5.getVersion()
            goto L8c
        L8b:
            r7 = -1
        L8c:
            if (r6 == 0) goto L91
            if (r2 != r7) goto L91
            return r5
        L91:
            r2 = 0
            if (r11 == 0) goto Lad
            androidx.datastore.core.InterProcessCoordinator r11 = r10.getCoordinator()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 r3 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3
            r3.<init>(r10, r2)
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r11 = r11.lock(r3, r0)
            if (r11 != r1) goto Laa
            goto Lc2
        Laa:
            kotlin.Pair r11 = (kotlin.Pair) r11
            goto Lc5
        Lad:
            androidx.datastore.core.InterProcessCoordinator r11 = r10.getCoordinator()
            androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 r4 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4
            r4.<init>(r10, r7, r2)
            r0.L$0 = r10
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r11 = r11.tryLock(r4, r0)
            if (r11 != r1) goto Lc3
        Lc2:
            return r1
        Lc3:
            kotlin.Pair r11 = (kotlin.Pair) r11
        Lc5:
            java.lang.Object r0 = r11.component1()
            androidx.datastore.core.State r0 = (androidx.datastore.core.State) r0
            java.lang.Object r11 = r11.component2()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Ldc
            androidx.datastore.core.DataStoreInMemoryCache<T> r10 = r10.inMemoryCache
            r10.tryUpdate(r0)
        Ldc:
            return r0
        Ldd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r10.<init>(r11)
            throw r10
    }

    private final java.lang.Object readDataFromFileOrDefault(kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            androidx.datastore.core.StorageConnection r0 = r1.getStorageConnection$datastore_core_release()
            java.lang.Object r2 = androidx.datastore.core.StorageConnectionKt.readData(r0, r2)
            return r2
    }

    private final java.lang.Object readDataOrHandleCorruption(boolean r10, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> r11) {
            r9 = this;
            boolean r0 = r11 instanceof androidx.datastore.core.DataStoreImpl.C23231
            if (r0 == 0) goto L13
            r0 = r11
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = (androidx.datastore.core.DataStoreImpl.C23231) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 r0 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r2) {
                case 0: goto L94;
                case 1: goto L89;
                case 2: goto L76;
                case 3: goto L6b;
                case 4: goto L5c;
                case 5: goto L42;
                case 6: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2e:
            java.lang.Object r10 = r0.L$2
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            java.lang.Object r1 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L3f
            goto L14f
        L3f:
            r10 = move-exception
            goto L161
        L42:
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$3
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref.ObjectRef) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
            java.lang.Object r6 = r0.L$1
            androidx.datastore.core.CorruptionException r6 = (androidx.datastore.core.CorruptionException) r6
            java.lang.Object r7 = r0.L$0
            androidx.datastore.core.DataStoreImpl r7 = (androidx.datastore.core.DataStoreImpl) r7
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r3
            r3 = r2
            r2 = r8
            goto L12f
        L5c:
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: androidx.datastore.core.CorruptionException -> L67
            goto L10e
        L67:
            r11 = move-exception
            r7 = r2
            goto L111
        L6b:
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: androidx.datastore.core.CorruptionException -> L67
            goto Lf1
        L76:
            int r10 = r0.I$0
            boolean r2 = r0.Z$0
            java.lang.Object r3 = r0.L$1
            java.lang.Object r6 = r0.L$0
            androidx.datastore.core.DataStoreImpl r6 = (androidx.datastore.core.DataStoreImpl) r6
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: androidx.datastore.core.CorruptionException -> L84
            goto Lcf
        L84:
            r11 = move-exception
            r10 = r2
        L86:
            r7 = r6
            goto L111
        L89:
            boolean r10 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: androidx.datastore.core.CorruptionException -> L67
            r6 = r2
            goto La8
        L94:
            kotlin.ResultKt.throwOnFailure(r11)
            if (r10 == 0) goto Lde
            r0.L$0 = r9     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            r0.Z$0 = r10     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            r0.label = r3     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            java.lang.Object r11 = r9.readDataFromFileOrDefault(r0)     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            if (r11 != r1) goto La7
            goto L14c
        La7:
            r6 = r9
        La8:
            if (r11 == 0) goto Lb1
            int r2 = r11.hashCode()     // Catch: androidx.datastore.core.CorruptionException -> Laf
            goto Lb2
        Laf:
            r11 = move-exception
            goto L86
        Lb1:
            r2 = r5
        Lb2:
            androidx.datastore.core.InterProcessCoordinator r3 = r6.getCoordinator()     // Catch: androidx.datastore.core.CorruptionException -> Laf
            r0.L$0 = r6     // Catch: androidx.datastore.core.CorruptionException -> Laf
            r0.L$1 = r11     // Catch: androidx.datastore.core.CorruptionException -> Laf
            r0.Z$0 = r10     // Catch: androidx.datastore.core.CorruptionException -> Laf
            r0.I$0 = r2     // Catch: androidx.datastore.core.CorruptionException -> Laf
            r7 = 2
            r0.label = r7     // Catch: androidx.datastore.core.CorruptionException -> Laf
            java.lang.Object r3 = r3.getVersion(r0)     // Catch: androidx.datastore.core.CorruptionException -> Laf
            if (r3 != r1) goto Lc9
            goto L14c
        Lc9:
            r8 = r2
            r2 = r10
            r10 = r8
            r8 = r3
            r3 = r11
            r11 = r8
        Lcf:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: androidx.datastore.core.CorruptionException -> L84
            int r11 = r11.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L84
            androidx.datastore.core.Data r7 = new androidx.datastore.core.Data     // Catch: androidx.datastore.core.CorruptionException -> L84
            r7.<init>(r3, r10, r11)     // Catch: androidx.datastore.core.CorruptionException -> L84
            return r7
        Ldb:
            r11 = move-exception
            r7 = r9
            goto L111
        Lde:
            androidx.datastore.core.InterProcessCoordinator r11 = r9.getCoordinator()     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            r0.L$0 = r9     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            r0.Z$0 = r10     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            r2 = 3
            r0.label = r2     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            java.lang.Object r11 = r11.getVersion(r0)     // Catch: androidx.datastore.core.CorruptionException -> Ldb
            if (r11 != r1) goto Lf0
            goto L14c
        Lf0:
            r2 = r9
        Lf1:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: androidx.datastore.core.CorruptionException -> L67
            int r11 = r11.intValue()     // Catch: androidx.datastore.core.CorruptionException -> L67
            androidx.datastore.core.InterProcessCoordinator r3 = r2.getCoordinator()     // Catch: androidx.datastore.core.CorruptionException -> L67
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 r6 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2     // Catch: androidx.datastore.core.CorruptionException -> L67
            r6.<init>(r2, r11, r4)     // Catch: androidx.datastore.core.CorruptionException -> L67
            r0.L$0 = r2     // Catch: androidx.datastore.core.CorruptionException -> L67
            r0.Z$0 = r10     // Catch: androidx.datastore.core.CorruptionException -> L67
            r11 = 4
            r0.label = r11     // Catch: androidx.datastore.core.CorruptionException -> L67
            java.lang.Object r11 = r3.tryLock(r6, r0)     // Catch: androidx.datastore.core.CorruptionException -> L67
            if (r11 != r1) goto L10e
            goto L14c
        L10e:
            androidx.datastore.core.Data r11 = (androidx.datastore.core.Data) r11     // Catch: androidx.datastore.core.CorruptionException -> L67
            return r11
        L111:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            androidx.datastore.core.CorruptionHandler<T> r3 = r7.corruptionHandler
            r0.L$0 = r7
            r0.L$1 = r11
            r0.L$2 = r2
            r0.L$3 = r2
            r0.Z$0 = r10
            r6 = 5
            r0.label = r6
            java.lang.Object r3 = r3.handleCorruption(r11, r0)
            if (r3 != r1) goto L12c
            goto L14c
        L12c:
            r6 = r11
            r11 = r3
            r3 = r2
        L12f:
            r3.element = r11
            kotlin.jvm.internal.Ref$IntRef r11 = new kotlin.jvm.internal.Ref$IntRef
            r11.<init>()
            androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 r3 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3     // Catch: java.lang.Throwable -> L15f
            r3.<init>(r2, r7, r11, r4)     // Catch: java.lang.Throwable -> L15f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L15f
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L15f
            r0.L$2 = r11     // Catch: java.lang.Throwable -> L15f
            r0.L$3 = r4     // Catch: java.lang.Throwable -> L15f
            r4 = 6
            r0.label = r4     // Catch: java.lang.Throwable -> L15f
            java.lang.Object r10 = r7.doWithWriteFileLock(r10, r3, r0)     // Catch: java.lang.Throwable -> L15f
            if (r10 != r1) goto L14d
        L14c:
            return r1
        L14d:
            r10 = r11
            r1 = r2
        L14f:
            androidx.datastore.core.Data r11 = new androidx.datastore.core.Data
            T r0 = r1.element
            if (r0 == 0) goto L159
            int r5 = r0.hashCode()
        L159:
            int r10 = r10.element
            r11.<init>(r0, r5, r10)
            return r11
        L15f:
            r10 = move-exception
            r0 = r6
        L161:
            kotlin.ExceptionsKt.addSuppressed(r0, r10)
            throw r0
    }

    private final java.lang.Object readState(boolean r4, kotlin.coroutines.Continuation<? super androidx.datastore.core.State<T>> r5) {
            r3 = this;
            kotlinx.coroutines.m0 r0 = r3.scope
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            androidx.datastore.core.DataStoreImpl$readState$2 r1 = new androidx.datastore.core.DataStoreImpl$readState$2
            r2 = 0
            r1.<init>(r3, r4, r2)
            java.lang.Object r4 = kotlinx.coroutines.C41686h.m91049g(r0, r1, r5)
            return r4
    }

    private final java.lang.Object transformAndWrite(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, kotlin.coroutines.CoroutineContext r5, kotlin.coroutines.Continuation<? super T> r6) {
            r3 = this;
            androidx.datastore.core.InterProcessCoordinator r0 = r3.getCoordinator()
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2 r1 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2
            r2 = 0
            r1.<init>(r3, r5, r4, r2)
            java.lang.Object r4 = r0.lock(r1, r6)
            return r4
    }

    @Override // androidx.datastore.core.DataStore
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.InterfaceC41634e<T> getData() {
            r1 = this;
            kotlinx.coroutines.flow.e<T> r0 = r1.data
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.datastore.core.StorageConnection<T> getStorageConnection$datastore_core_release() {
            r1 = this;
            kotlin.Lazy<androidx.datastore.core.StorageConnection<T>> r0 = r1.storageConnectionDelegate
            java.lang.Object r0 = r0.getValue()
            androidx.datastore.core.StorageConnection r0 = (androidx.datastore.core.StorageConnection) r0
            return r0
    }

    @Override // androidx.datastore.core.DataStore
    @org.jetbrains.annotations.Nullable
    public java.lang.Object updateData(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r5) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()
            androidx.datastore.core.UpdatingDataContextElement$Companion$Key r1 = androidx.datastore.core.UpdatingDataContextElement.Companion.Key.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            androidx.datastore.core.UpdatingDataContextElement r0 = (androidx.datastore.core.UpdatingDataContextElement) r0
            if (r0 == 0) goto L11
            r0.checkNotUpdating(r3)
        L11:
            androidx.datastore.core.UpdatingDataContextElement r1 = new androidx.datastore.core.UpdatingDataContextElement
            r1.<init>(r0, r3)
            androidx.datastore.core.DataStoreImpl$updateData$2 r0 = new androidx.datastore.core.DataStoreImpl$updateData$2
            r2 = 0
            r0.<init>(r3, r4, r2)
            java.lang.Object r4 = kotlinx.coroutines.C41686h.m91049g(r1, r0, r5)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object writeData$datastore_core_release(T r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r13) {
            r10 = this;
            boolean r0 = r13 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.L$0
            kotlin.jvm.internal.Ref$IntRef r11 = (kotlin.jvm.internal.Ref.IntRef) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.ResultKt.throwOnFailure(r13)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            androidx.datastore.core.StorageConnection r13 = r10.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r4 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r11 = r13.writeScope(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.element
            java.lang.Integer r11 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            return r11
    }
}
