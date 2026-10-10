package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.RendererCapabilities;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.ExceptionsKt;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 a*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002abBp\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012?\b\u0002\u0010\u000e\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00060\u0005\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\u0016J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b#\u0010\u0016JK\u0010(\u001a\u00028\u000021\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010'\u001a\u00020&H\u0082@¢\u0006\u0004\b(\u0010)J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010*\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b,\u0010\u001cJI\u00100\u001a\u00028\u0001\"\u0004\b\u0001\u0010-2\u0006\u0010*\u001a\u00020\u00182\u001c\u0010/\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0.H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b0\u00101JC\u00102\u001a\u00028\u000021\u0010%\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H\u0096@¢\u0006\u0004\b2\u00103J \u00109\u001a\u0002062\u0006\u00104\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010:R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010;R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010N\u001a\f0MR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bV\u0010WR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R!\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000Q8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\b\\\u0010]*\u0004\b^\u0010_¨\u0006c"}, m90084d2 = {"Landroidx/datastore/core/DataStoreImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "Lkotlinx/coroutines/m0;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/m0;)V", "incrementCollector", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decrementCollector", "", "requireLock", "Landroidx/datastore/core/State;", "readState", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "readDataFromFileOrDefault", "t", ViewProps.TRANSFORM, "Lkotlin/coroutines/CoroutineContext;", "callerContext", "transformAndWrite", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasWriteFileLock", "Landroidx/datastore/core/Data;", "readDataOrHandleCorruption", "R", "Lkotlin/Function1;", "block", "doWithWriteFileLock", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newData", "updateCache", "", "writeData$datastore_core_release", "(Ljava/lang/Object;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/CorruptionHandler;", "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/e;", "data", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "Lrg0/a;", "collectorMutex", "Lrg0/a;", "collectorCounter", "I", "Lkotlinx/coroutines/x1;", "collectorJob", "Lkotlinx/coroutines/x1;", "Landroidx/datastore/core/DataStoreInMemoryCache;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Lkotlin/Lazy;", "Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lkotlin/Lazy;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "Companion", "InitDataStore", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n120#2,10:549\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl\n*L\n130#1:539,10\n148#1:549,10\n*E\n"})
public final class DataStoreImpl<T> implements DataStore<T> {

    @NotNull
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;

    @Nullable
    private InterfaceC41775x1 collectorJob;

    @NotNull
    private final InterfaceC44082a collectorMutex;

    /* JADX INFO: renamed from: coordinator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coordinator;

    @NotNull
    private final CorruptionHandler<T> corruptionHandler;

    @NotNull
    private final InterfaceC41634e<T> data;

    @NotNull
    private final DataStoreInMemoryCache<T> inMemoryCache;

    @NotNull
    private final DataStoreImpl<T>.InitDataStore readAndInit;

    @NotNull
    private final InterfaceC41709m0 scope;

    @NotNull
    private final Storage<T> storage;

    @NotNull
    private final Lazy<StorageConnection<T>> storageConnectionDelegate;

    @NotNull
    private final SimpleActor<Message.Update<T>> writeActor;

    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001BD\u0012=\u0010\u0002\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00040\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u000e\u001a\u00020\nH\u0094@¢\u0006\u0002\u0010\u000fRG\u0010\r\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "initTasks", "doRun", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public final class InitDataStore extends RunOnce {

        @Nullable
        private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(@NotNull DataStoreImpl dataStoreImpl, List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = CollectionsKt.toList(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.datastore.core.RunOnce
        @Nullable
        public Object doRun(@NotNull Continuation<? super Unit> continuation) throws CorruptionException {
            DataStoreImpl$InitDataStore$doRun$1 dataStoreImpl$InitDataStore$doRun$1;
            InitDataStore initDataStore;
            Data data;
            if (continuation instanceof DataStoreImpl$InitDataStore$doRun$1) {
                dataStoreImpl$InitDataStore$doRun$1 = (DataStoreImpl$InitDataStore$doRun$1) continuation;
                int i11 = dataStoreImpl$InitDataStore$doRun$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dataStoreImpl$InitDataStore$doRun$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
                }
            } else {
                dataStoreImpl$InitDataStore$doRun$1 = new DataStoreImpl$InitDataStore$doRun$1(this, continuation);
            }
            Object dataOrHandleCorruption = dataStoreImpl$InitDataStore$doRun$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = dataStoreImpl$InitDataStore$doRun$1.label;
            if (i12 == 0) {
                ResultKt.throwOnFailure(dataOrHandleCorruption);
                List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = this.initTasks;
                if (list != null) {
                    Intrinsics.checkNotNull(list);
                    if (list.isEmpty()) {
                        DataStoreImpl<T> dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 1;
                        dataOrHandleCorruption = dataStoreImpl.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                        if (dataOrHandleCorruption != coroutine_suspended) {
                            initDataStore = this;
                            data = (Data) dataOrHandleCorruption;
                        }
                    } else {
                        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                        DataStoreImpl$InitDataStore$doRun$initData$1 dataStoreImpl$InitDataStore$doRun$initData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this, null);
                        dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                        dataStoreImpl$InitDataStore$doRun$1.label = 2;
                        dataOrHandleCorruption = coordinator.lock(dataStoreImpl$InitDataStore$doRun$initData$1, dataStoreImpl$InitDataStore$doRun$1);
                        if (dataOrHandleCorruption != coroutine_suspended) {
                            initDataStore = this;
                            data = (Data) dataOrHandleCorruption;
                        }
                    }
                } else {
                    DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                    dataStoreImpl$InitDataStore$doRun$1.L$0 = this;
                    dataStoreImpl$InitDataStore$doRun$1.label = 1;
                    dataOrHandleCorruption = dataStoreImpl2.readDataOrHandleCorruption(false, dataStoreImpl$InitDataStore$doRun$1);
                    if (dataOrHandleCorruption != coroutine_suspended) {
                        initDataStore = this;
                        data = (Data) dataOrHandleCorruption;
                    }
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                ResultKt.throwOnFailure(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initDataStore = (InitDataStore) dataStoreImpl$InitDataStore$doRun$1.L$0;
                ResultKt.throwOnFailure(dataOrHandleCorruption);
                data = (Data) dataOrHandleCorruption;
            }
            ((DataStoreImpl) initDataStore.this$0).inMemoryCache.tryUpdate(data);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$decrementCollector$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0}, m90124l = {544}, m90125m = "decrementCollector", m90126n = {"this", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1"})
    public static final class C23141 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23141(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23141> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "R", ExifInterface.GPS_DIRECTION_TRUE}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {416}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23153<R> extends SuspendLambda implements Function1<Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23153(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super C23153> continuation) {
            super(1, continuation);
            this.$block = function1;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C23153(this.$block, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super R> continuation) {
            return ((C23153) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super R>, Object> function1 = this.$block;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$handleUpdate$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {1, 1}, m90124l = {237, 243, 246}, m90125m = "handleUpdate", m90126n = {"update", "$this$handleUpdate_u24lambda_u242"}, m90127s = {"L$0", "L$1"})
    public static final class C23161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23161(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23161> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$incrementCollector$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0}, m90124l = {544}, m90125m = "incrementCollector", m90126n = {"this", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1"})
    public static final class C23171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23171(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23171> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 1, 1}, m90124l = {264, 266}, m90125m = "readAndInitOrPropagateAndThrowFailure", m90126n = {"this", "this", "preReadVersion"}, m90127s = {"L$0", "L$0", "I$0"})
    public static final class C23191 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23191(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23191> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 0, 1, 2}, m90124l = {287, 296, 304}, m90125m = "readDataAndUpdateCache", m90126n = {"this", "currentState", "requireLock", "this", "this"}, m90127s = {"L$0", "L$1", "Z$0", "L$0", "L$0"})
    public static final class C23201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23201(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23201> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", ExifInterface.GPS_DIRECTION_TRUE, ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {298, 300}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23213 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23213(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23213> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C23213(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Pair<? extends State<T>, Boolean>> continuation) {
            return ((C23213) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            State readException;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            th2 = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            readException = new ReadException(th2, ((Number) obj).intValue());
                            return TuplesKt.m90091to(readException, Boxing.boxBoolean(true));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                readException = (State) obj;
            } catch (Throwable th3) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th3;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != coroutine_suspended) {
                    th2 = th3;
                    obj = version;
                }
                return coroutine_suspended;
            }
            return TuplesKt.m90091to(readException, Boxing.boxBoolean(true));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", ExifInterface.GPS_DIRECTION_TRUE, "", "locked"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", m90122f = "DataStoreImpl.kt", m90123i = {0, 1}, m90124l = {306, 309}, m90125m = "invokeSuspend", m90126n = {"locked", "locked"}, m90127s = {"Z$0", "Z$0"})
    public static final class C23224 extends SuspendLambda implements Function2<Boolean, Continuation<? super Pair<? extends State<T>, ? extends Boolean>>, Object> {
        final /* synthetic */ int $cachedVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (Continuation) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23224(DataStoreImpl<T> dataStoreImpl, int i11, Continuation<? super C23224> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23224 c23224 = new C23224(this.this$0, this.$cachedVersion, continuation);
            c23224.Z$0 = ((Boolean) obj).booleanValue();
            return c23224;
        }

        @Nullable
        public final Object invoke(boolean z11, @Nullable Continuation<? super Pair<? extends State<T>, Boolean>> continuation) {
            return ((C23224) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th2;
            int iIntValue;
            ?? r11;
            ?? r12;
            State state;
            ?? r13;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r14 = this.label;
            try {
                if (r14 != 0) {
                    if (r14 != 1) {
                        if (r14 == 2) {
                            boolean z11 = this.Z$0;
                            th2 = (Throwable) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            r12 = z11;
                            iIntValue = ((Number) obj).intValue();
                            r11 = r12;
                            ReadException readException = new ReadException(th2, iIntValue);
                            r13 = r11;
                            state = readException;
                            return TuplesKt.m90091to(state, Boxing.boxBoolean(r13));
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z12 = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    r14 = z12;
                } else {
                    ResultKt.throwOnFailure(obj);
                    boolean z13 = this.Z$0;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.Z$0 = z13;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(z13, this);
                    r14 = z13;
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                state = (State) obj;
                r13 = r14;
            } catch (Throwable th3) {
                if (r14 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th3;
                    this.Z$0 = r14;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != coroutine_suspended) {
                        r12 = r14;
                        th2 = th3;
                        obj = version;
                    }
                    return coroutine_suspended;
                }
                ?? r15 = r14;
                th2 = th3;
                iIntValue = this.$cachedVersion;
                r11 = r15 == true ? 1 : 0;
            }
            return TuplesKt.m90091to(state, Boxing.boxBoolean(r13));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$1 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5}, m90124l = {365, 366, 368, 369, 380, RendererCapabilities.DECODER_SUPPORT_MASK}, m90125m = "readDataOrHandleCorruption", m90126n = {"this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "hasWriteFileLock", "this", "ex", "newData", "hasWriteFileLock", "ex", "newData", "version"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2"})
    public static final class C23231 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23231(DataStoreImpl<T> dataStoreImpl, Continuation<? super C23231> continuation) {
            super(continuation);
            this.this$0 = dataStoreImpl;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", ExifInterface.GPS_DIRECTION_TRUE, "locked", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", m90122f = "DataStoreImpl.kt", m90123i = {0, 1}, m90124l = {370, 371}, m90125m = "invokeSuspend", m90126n = {"locked", "data"}, m90127s = {"Z$0", "L$0"})
    public static final class C23242 extends SuspendLambda implements Function2<Boolean, Continuation<? super Data<T>>, Object> {
        final /* synthetic */ int $preLockVersion;
        Object L$0;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Object obj) {
            return invoke(bool.booleanValue(), (Continuation) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23242(DataStoreImpl<T> dataStoreImpl, int i11, Continuation<? super C23242> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23242 c23242 = new C23242(this.this$0, this.$preLockVersion, continuation);
            c23242.Z$0 = ((Boolean) obj).booleanValue();
            return c23242;
        }

        @Nullable
        public final Object invoke(boolean z11, @Nullable Continuation<? super Data<T>> continuation) {
            return ((C23242) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z11;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        obj2 = this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    z11 = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                iIntValue = ((Number) obj).intValue();
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new Data(obj2, iHashCode, iIntValue);
            }
            ResultKt.throwOnFailure(obj);
            z11 = this.Z$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.Z$0 = z11;
            this.label = 1;
            obj = dataStoreImpl.readDataFromFileOrDefault(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            if (z11) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = obj;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != coroutine_suspended) {
                    obj2 = obj;
                    obj = version;
                    iIntValue = ((Number) obj).intValue();
                }
                return coroutine_suspended;
            }
            obj2 = obj;
            iIntValue = this.$preLockVersion;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {387, 388, 390}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23253 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<T> $newData;
        final /* synthetic */ Ref.IntRef $version;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23253(Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl, Ref.IntRef intRef, Continuation<? super C23253> continuation) {
            super(1, continuation);
            this.$newData = objectRef;
            this.this$0 = dataStoreImpl;
            this.$version = intRef;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C23253(this.$newData, this.this$0, this.$version, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
            return ((C23253) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.IntRef intRef;
            Ref.ObjectRef<T> objectRef;
            Ref.IntRef intRef2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                intRef = (Ref.IntRef) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                intRef.element = ((Number) obj).intValue();
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        intRef2 = (Ref.IntRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        objectRef = (Ref.ObjectRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    intRef2.element = ((Number) obj).intValue();
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objectRef = this.$newData;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.L$0 = objectRef;
                this.label = 1;
                obj = (T) dataStoreImpl.readDataFromFileOrDefault(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
                objectRef.element = (T) obj;
                intRef2 = this.$version;
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = intRef2;
                this.label = 2;
                obj = (T) coordinator.getVersion(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                intRef2.element = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                Ref.IntRef intRef3 = this.$version;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                T t11 = this.$newData.element;
                this.L$0 = intRef3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl2.writeData$datastore_core_release(t11, true, this);
                if (objWriteData$datastore_core_release != coroutine_suspended) {
                    intRef = intRef3;
                    obj = (T) objWriteData$datastore_core_release;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$readState$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "Landroidx/datastore/core/State;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Landroidx/datastore/core/State;"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$readState$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {218, 226}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23262 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super State<T>>, Object> {
        final /* synthetic */ boolean $requireLock;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23262(DataStoreImpl<T> dataStoreImpl, boolean z11, Continuation<? super C23262> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23262(this.this$0, this.$requireLock, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super State<T>> continuation) {
            return ((C23262) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                    return (State) obj;
                }
                ResultKt.throwOnFailure(obj);
                if (((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState() instanceof Final) {
                    return ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState();
                }
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.readAndInitOrPropagateAndThrowFailure(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                boolean z11 = this.$requireLock;
                this.label = 2;
                obj = dataStoreImpl2.readDataAndUpdateCache(z11, this);
            } catch (Throwable th2) {
                return new ReadException(th2, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$transformAndWrite$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, m90084d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", m90122f = "DataStoreImpl.kt", m90123i = {1, 2}, m90124l = {330, 331, 337}, m90125m = "invokeSuspend", m90126n = {"curData", "newData"}, m90127s = {"L$0", "L$0"})
    public static final class C23272 extends SuspendLambda implements Function1<Continuation<? super T>, Object> {
        final /* synthetic */ CoroutineContext $callerContext;
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> $transform;
        Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23272(DataStoreImpl<T> dataStoreImpl, CoroutineContext coroutineContext, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C23272> continuation) {
            super(1, continuation);
            this.this$0 = dataStoreImpl;
            this.$callerContext = coroutineContext;
            this.$transform = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C23272(this.this$0, this.$callerContext, this.$transform, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super T> continuation) {
            return ((C23272) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to androidx.datastore.core.DataStoreImpl$transformAndWrite$2 for r8v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.L$0
                p852kotlin.ResultKt.throwOnFailure(r9)
                return r0
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.L$0
                androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
                p852kotlin.ResultKt.throwOnFailure(r9)
                goto L51
            L27:
                p852kotlin.ResultKt.throwOnFailure(r9)
                goto L39
            L2b:
                p852kotlin.ResultKt.throwOnFailure(r9)
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
                boolean r1 = p852kotlin.jvm.internal.Intrinsics.areEqual(r1, r9)
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
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C23272.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.DataStoreImpl$updateData$2 */
    /* JADX INFO: compiled from: DataStoreImpl.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$updateData$2", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {169}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23282 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super T>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23282(DataStoreImpl<T> dataStoreImpl, Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super C23282> continuation) {
            super(2, continuation);
            this.this$0 = dataStoreImpl;
            this.$transform = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23282 c23282 = new C23282(this.this$0, this.$transform, continuation);
            c23282.L$0 = obj;
            return c23282;
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super T> continuation) {
            return ((C23282) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
            InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, interfaceC41769wM91388c, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), interfaceC41709m0.getF53495b()));
            this.label = 1;
            Object objMo91198h = interfaceC41769wM91388c.mo91198h(this);
            if (objMo91198h == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMo91198h;
        }
    }

    public DataStoreImpl(@NotNull Storage<T> storage, @NotNull List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = C41636g.m90887K(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = C44087f.m97144b(false, 1, null);
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = LazyKt.lazy(new Function0<StorageConnection<T>>(this) { // from class: androidx.datastore.core.DataStoreImpl$storageConnectionDelegate$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final StorageConnection<T> invoke() {
                return ((DataStoreImpl) this.this$0).storage.createConnection();
            }
        });
        this.coordinator = LazyKt.lazy(new Function0<InterProcessCoordinator>(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            final /* synthetic */ DataStoreImpl<T> this$0;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final InterProcessCoordinator invoke() {
                return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }
        });
        this.writeActor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.DataStoreImpl$writeActor$1
            final /* synthetic */ DataStoreImpl<T> this$0;

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                if (th2 != null) {
                    ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th2));
                }
                if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
                    this.this$0.getStorageConnection$datastore_core_release().close();
                }
            }
        }, new Function2<Message.Update<T>, Throwable, Unit>() { // from class: androidx.datastore.core.DataStoreImpl$writeActor$2
            @Override // p852kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
                invoke((Message.Update) obj, th2);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Message.Update<T> msg, @Nullable Throwable th2) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                InterfaceC41769w<T> ack = msg.getAck();
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ack.mo91369m(th2);
            }
        }, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object decrementCollector(Continuation<? super Unit> continuation) {
        C23141 c23141;
        DataStoreImpl<T> dataStoreImpl;
        InterfaceC44082a interfaceC44082a;
        if (continuation instanceof C23141) {
            c23141 = (C23141) continuation;
            int i11 = c23141.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23141.label = i11 - Integer.MIN_VALUE;
            } else {
                c23141 = new C23141(this, continuation);
            }
        } else {
            c23141 = new C23141(this, continuation);
        }
        Object obj = c23141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23141.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = this.collectorMutex;
            c23141.L$0 = this;
            c23141.L$1 = interfaceC44082a2;
            c23141.label = 1;
            if (interfaceC44082a2.mo91344d(null, c23141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            interfaceC44082a = interfaceC44082a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC44082a = (InterfaceC44082a) c23141.L$1;
            dataStoreImpl = (DataStoreImpl) c23141.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int i13 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i13;
            if (i13 == 0) {
                InterfaceC41775x1 interfaceC41775x1 = dataStoreImpl.collectorJob;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                dataStoreImpl.collectorJob = null;
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z11, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return z11 ? function1.invoke(continuation) : getCoordinator().lock(new C23153(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.Message$Update, androidx.datastore.core.Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.datastore.core.Message$Update] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.w] */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) {
        C23161 c23161;
        Object objM103844constructorimpl;
        ?? r11;
        InterfaceC41769w ack;
        ?? r12;
        Object objTransformAndWrite;
        ?? r13;
        InterfaceC41769w interfaceC41769w;
        if (continuation instanceof C23161) {
            c23161 = (C23161) continuation;
            int i11 = c23161.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23161.label = i11 - Integer.MIN_VALUE;
            } else {
                c23161 = new C23161(this, continuation);
            }
        } else {
            c23161 = new C23161(this, continuation);
        }
        Object obj = c23161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23161.label;
        boolean z11 = true;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    interfaceC41769w = (InterfaceC41769w) c23161.L$0;
                } else if (i12 == 2) {
                    InterfaceC41769w interfaceC41769w2 = (InterfaceC41769w) c23161.L$2;
                    DataStoreImpl dataStoreImpl = (DataStoreImpl) c23161.L$1;
                    Message.Update update2 = (Message.Update) c23161.L$0;
                    ResultKt.throwOnFailure(obj);
                    ack = interfaceC41769w2;
                    r12 = dataStoreImpl;
                    r13 = (Message.Update<T>) update2;
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC41769w = (Message.Update<T>) ((InterfaceC41769w) c23161.L$0);
                }
                ResultKt.throwOnFailure(obj);
                update = interfaceC41769w;
                objM103844constructorimpl = Result.m103844constructorimpl(obj);
                r11 = update;
                C41777y.m91389d(r11, objM103844constructorimpl);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ack = update.getAck();
            try {
                Result.Companion companion = Result.INSTANCE;
                State<T> currentState = this.inMemoryCache.getCurrentState();
                if (currentState instanceof Data) {
                    Function2 transform = update.getTransform();
                    CoroutineContext callerContext = update.getCallerContext();
                    c23161.L$0 = ack;
                    c23161.label = 1;
                    objTransformAndWrite = transformAndWrite(transform, callerContext, c23161);
                    if (objTransformAndWrite == coroutine_suspended) {
                    }
                    InterfaceC41769w interfaceC41769w3 = ack;
                    obj = objTransformAndWrite;
                    update = interfaceC41769w3;
                    objM103844constructorimpl = Result.m103844constructorimpl(obj);
                    r11 = update;
                    C41777y.m91389d(r11, objM103844constructorimpl);
                    return Unit.INSTANCE;
                }
                if (!(currentState instanceof ReadException)) {
                    z11 = currentState instanceof UnInitialized;
                }
                if (!z11) {
                    if (currentState instanceof Final) {
                        throw ((Final) currentState).getFinalException();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (currentState != update.getLastState()) {
                    Intrinsics.checkNotNull(currentState, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((ReadException) currentState).getReadException();
                }
                c23161.L$0 = update;
                c23161.L$1 = this;
                c23161.L$2 = ack;
                c23161.label = 2;
                if (readAndInitOrPropagateAndThrowFailure(c23161) != coroutine_suspended) {
                    r12 = this;
                    r13 = update;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                update = ack;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                r11 = update;
            }
            Function2 transform2 = r13.getTransform();
            CoroutineContext callerContext2 = r13.getCallerContext();
            c23161.L$0 = ack;
            c23161.L$1 = null;
            c23161.L$2 = null;
            c23161.label = 3;
            objTransformAndWrite = r12.transformAndWrite(transform2, callerContext2, c23161);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object incrementCollector(Continuation<? super Unit> continuation) {
        C23171 c23171;
        DataStoreImpl<T> dataStoreImpl;
        InterfaceC44082a interfaceC44082a;
        if (continuation instanceof C23171) {
            c23171 = (C23171) continuation;
            int i11 = c23171.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23171.label = i11 - Integer.MIN_VALUE;
            } else {
                c23171 = new C23171(this, continuation);
            }
        } else {
            c23171 = new C23171(this, continuation);
        }
        Object obj = c23171.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23171.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC44082a interfaceC44082a2 = this.collectorMutex;
            c23171.L$0 = this;
            c23171.L$1 = interfaceC44082a2;
            c23171.label = 1;
            if (interfaceC44082a2.mo91344d(null, c23171) == coroutine_suspended) {
                return coroutine_suspended;
            }
            dataStoreImpl = this;
            interfaceC44082a = interfaceC44082a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC44082a = (InterfaceC44082a) c23171.L$1;
            dataStoreImpl = (DataStoreImpl) c23171.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            int i13 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i13;
            if (i13 == 1) {
                dataStoreImpl.collectorJob = C41696j.m91104d(dataStoreImpl.scope, null, null, new DataStoreImpl$incrementCollector$2$1(dataStoreImpl, null), 3, null);
            }
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            interfaceC44082a.mo91345e(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.runIfNeeded(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) throws Throwable {
        C23191 c23191;
        DataStoreImpl<T> dataStoreImpl;
        int iIntValue;
        int i11;
        Throwable th2;
        DataStoreImpl<T> dataStoreImpl2;
        if (continuation instanceof C23191) {
            c23191 = (C23191) continuation;
            int i12 = c23191.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c23191.label = i12 - Integer.MIN_VALUE;
            } else {
                c23191 = new C23191(this, continuation);
            }
        } else {
            c23191 = new C23191(this, continuation);
        }
        Object version = c23191.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c23191.label;
        try {
            if (i13 == 0) {
                ResultKt.throwOnFailure(version);
                InterProcessCoordinator coordinator = getCoordinator();
                c23191.L$0 = this;
                c23191.label = 1;
                version = coordinator.getVersion(c23191);
                if (version != coroutine_suspended) {
                    dataStoreImpl = this;
                }
                return coroutine_suspended;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = c23191.I$0;
                dataStoreImpl2 = (DataStoreImpl) c23191.L$0;
                try {
                    ResultKt.throwOnFailure(version);
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    th2 = th3;
                    dataStoreImpl2.inMemoryCache.tryUpdate(new ReadException(th2, i11));
                    throw th2;
                }
            }
            dataStoreImpl = (DataStoreImpl) c23191.L$0;
            ResultKt.throwOnFailure(version);
            DataStoreImpl<T>.InitDataStore initDataStore = dataStoreImpl.readAndInit;
            c23191.L$0 = dataStoreImpl;
            c23191.I$0 = iIntValue;
            c23191.label = 2;
        } catch (Throwable th4) {
            i11 = iIntValue;
            th2 = th4;
            dataStoreImpl2 = dataStoreImpl;
            dataStoreImpl2.inMemoryCache.tryUpdate(new ReadException(th2, i11));
            throw th2;
        }
        iIntValue = ((Number) version).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataAndUpdateCache(boolean z11, Continuation<? super State<T>> continuation) {
        C23201 c23201;
        State<T> state;
        Object obj;
        boolean z12;
        DataStoreImpl<T> dataStoreImpl;
        Pair pair;
        State<T> state2;
        if (continuation instanceof C23201) {
            c23201 = (C23201) continuation;
            int i11 = c23201.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23201.label = i11 - Integer.MIN_VALUE;
            } else {
                c23201 = new C23201(this, continuation);
            }
        } else {
            c23201 = new C23201(this, continuation);
        }
        Object objTryLock = c23201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23201.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objTryLock);
            State<T> currentState = this.inMemoryCache.getCurrentState();
            if (currentState instanceof UnInitialized) {
                throw new IllegalStateException(BUG_MESSAGE);
            }
            InterProcessCoordinator coordinator = getCoordinator();
            c23201.L$0 = this;
            c23201.L$1 = currentState;
            c23201.Z$0 = z11;
            c23201.label = 1;
            Object version = coordinator.getVersion(c23201);
            if (version != coroutine_suspended) {
                state = currentState;
                obj = version;
                z12 = z11;
                dataStoreImpl = this;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                dataStoreImpl = (DataStoreImpl) c23201.L$0;
                ResultKt.throwOnFailure(objTryLock);
                pair = (Pair) objTryLock;
                state2 = (State) pair.component1();
                if (((Boolean) pair.component2()).booleanValue()) {
                    dataStoreImpl.inMemoryCache.tryUpdate(state2);
                }
                return state2;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataStoreImpl = (DataStoreImpl) c23201.L$0;
            ResultKt.throwOnFailure(objTryLock);
            pair = (Pair) objTryLock;
            state2 = (State) pair.component1();
            if (((Boolean) pair.component2()).booleanValue()) {
                dataStoreImpl.inMemoryCache.tryUpdate(state2);
            }
            return state2;
        }
        boolean z13 = c23201.Z$0;
        State<T> state3 = (State) c23201.L$1;
        DataStoreImpl<T> dataStoreImpl2 = (DataStoreImpl) c23201.L$0;
        ResultKt.throwOnFailure(objTryLock);
        z12 = z13;
        dataStoreImpl = dataStoreImpl2;
        state = state3;
        obj = objTryLock;
        int iIntValue = ((Number) obj).intValue();
        boolean z14 = state instanceof Data;
        int version2 = z14 ? state.getVersion() : -1;
        if (z14 && iIntValue == version2) {
            return state;
        }
        if (z12) {
            InterProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
            C23213 c23213 = new C23213(dataStoreImpl, null);
            c23201.L$0 = dataStoreImpl;
            c23201.L$1 = null;
            c23201.label = 2;
            objTryLock = coordinator2.lock(c23213, c23201);
        } else {
            InterProcessCoordinator coordinator3 = dataStoreImpl.getCoordinator();
            C23224 c23224 = new C23224(dataStoreImpl, version2, null);
            c23201.L$0 = dataStoreImpl;
            c23201.L$1 = null;
            c23201.label = 3;
            objTryLock = coordinator3.tryLock(c23224, c23201);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.DataStoreImpl, androidx.datastore.core.DataStoreImpl<T>, java.lang.Object] */
    public final Object readDataOrHandleCorruption(boolean z11, Continuation<? super Data<T>> continuation) throws CorruptionException {
        C23231 c23231;
        ?? r11;
        Ref.ObjectRef objectRef;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        Ref.ObjectRef objectRef2;
        ?? r12;
        Ref.IntRef intRef;
        CorruptionException corruptionException2;
        C23253 c23253;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef3;
        ?? r13;
        ?? r14;
        int iHashCode;
        Object version;
        boolean z12;
        int i11;
        Object obj;
        ?? r15;
        ?? r16;
        if (continuation instanceof C23231) {
            c23231 = (C23231) continuation;
            int i12 = c23231.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c23231.label = i12 - Integer.MIN_VALUE;
            } else {
                c23231 = new C23231(this, continuation);
            }
        } else {
            c23231 = new C23231(this, continuation);
        }
        Object obj2 = (T) c23231.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r17 = c23231.label;
        try {
            switch (r17) {
                case 0:
                    ResultKt.throwOnFailure(obj2);
                    try {
                        if (z11) {
                            c23231.L$0 = this;
                            c23231.Z$0 = z11;
                            c23231.label = 1;
                            obj2 = (T) readDataFromFileOrDefault(c23231);
                            if (obj2 != coroutine_suspended) {
                                r14 = this;
                                if (obj2 != null) {
                                    try {
                                        iHashCode = obj2.hashCode();
                                    } catch (CorruptionException e11) {
                                        e = e11;
                                        r15 = r14;
                                        r11 = r15;
                                        objectRef = new Ref.ObjectRef();
                                        CorruptionHandler<T> corruptionHandler = r11.corruptionHandler;
                                        c23231.L$0 = r11;
                                        c23231.L$1 = e;
                                        c23231.L$2 = objectRef;
                                        c23231.L$3 = objectRef;
                                        c23231.Z$0 = z11;
                                        c23231.label = 5;
                                        objHandleCorruption = corruptionHandler.handleCorruption(e, c23231);
                                        if (objHandleCorruption != coroutine_suspended) {
                                            corruptionException = e;
                                            obj2 = (T) objHandleCorruption;
                                            objectRef2 = objectRef;
                                            r12 = r11;
                                            objectRef2.element = (T) obj2;
                                            intRef = new Ref.IntRef();
                                            try {
                                                c23253 = new C23253(objectRef, r12, intRef, null);
                                                c23231.L$0 = corruptionException;
                                                c23231.L$1 = objectRef;
                                                c23231.L$2 = intRef;
                                                c23231.L$3 = null;
                                                c23231.label = 6;
                                                if (r12.doWithWriteFileLock(z11, c23253, c23231) != coroutine_suspended) {
                                                    intRef2 = intRef;
                                                    objectRef3 = objectRef;
                                                    T t11 = objectRef3.element;
                                                    return new Data(t11, t11 != null ? t11.hashCode() : 0, intRef2.element);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                corruptionException2 = corruptionException;
                                                ExceptionsKt.addSuppressed(corruptionException2, th);
                                                throw corruptionException2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                InterProcessCoordinator coordinator = r14.getCoordinator();
                                c23231.L$0 = r14;
                                c23231.L$1 = obj2;
                                c23231.Z$0 = z11;
                                c23231.I$0 = iHashCode;
                                c23231.label = 2;
                                version = coordinator.getVersion(c23231);
                                if (version != coroutine_suspended) {
                                    int i13 = iHashCode;
                                    z12 = z11;
                                    i11 = i13;
                                    obj = obj2;
                                    obj2 = (T) version;
                                    r16 = r14;
                                    return new Data(obj, i11, ((Number) obj2).intValue());
                                }
                            }
                        } else {
                            InterProcessCoordinator coordinator2 = getCoordinator();
                            c23231.L$0 = this;
                            c23231.Z$0 = z11;
                            c23231.label = 3;
                            obj2 = (T) coordinator2.getVersion(c23231);
                            if (obj2 != coroutine_suspended) {
                                r13 = this;
                                int iIntValue = ((Number) obj2).intValue();
                                InterProcessCoordinator coordinator3 = r13.getCoordinator();
                                C23242 c23242 = new C23242(r13, iIntValue, null);
                                c23231.L$0 = r13;
                                c23231.Z$0 = z11;
                                c23231.label = 4;
                                obj2 = (T) coordinator3.tryLock(c23242, c23231);
                                if (obj2 == coroutine_suspended) {
                                }
                                return (Data) obj2;
                            }
                        }
                    } catch (CorruptionException e12) {
                        e = e12;
                        r11 = this;
                        objectRef = new Ref.ObjectRef();
                        CorruptionHandler<T> corruptionHandler2 = r11.corruptionHandler;
                        c23231.L$0 = r11;
                        c23231.L$1 = e;
                        c23231.L$2 = objectRef;
                        c23231.L$3 = objectRef;
                        c23231.Z$0 = z11;
                        c23231.label = 5;
                        objHandleCorruption = corruptionHandler2.handleCorruption(e, c23231);
                        if (objHandleCorruption != coroutine_suspended) {
                            corruptionException = e;
                            obj2 = (T) objHandleCorruption;
                            objectRef2 = objectRef;
                            r12 = r11;
                            objectRef2.element = (T) obj2;
                            intRef = new Ref.IntRef();
                            c23253 = new C23253(objectRef, r12, intRef, null);
                            c23231.L$0 = corruptionException;
                            c23231.L$1 = objectRef;
                            c23231.L$2 = intRef;
                            c23231.L$3 = null;
                            c23231.label = 6;
                            if (r12.doWithWriteFileLock(z11, c23253, c23231) != coroutine_suspended) {
                                intRef2 = intRef;
                                objectRef3 = objectRef;
                                T t12 = objectRef3.element;
                                return new Data(t12, t12 != null ? t12.hashCode() : 0, intRef2.element);
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    z11 = c23231.Z$0;
                    DataStoreImpl dataStoreImpl = (DataStoreImpl) c23231.L$0;
                    ResultKt.throwOnFailure(obj2);
                    r14 = dataStoreImpl;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator4 = r14.getCoordinator();
                    c23231.L$0 = r14;
                    c23231.L$1 = obj2;
                    c23231.Z$0 = z11;
                    c23231.I$0 = iHashCode;
                    c23231.label = 2;
                    version = coordinator4.getVersion(c23231);
                    if (version != coroutine_suspended) {
                        int i14 = iHashCode;
                        z12 = z11;
                        i11 = i14;
                        obj = obj2;
                        obj2 = (T) version;
                        r16 = r14;
                        return new Data(obj, i11, ((Number) obj2).intValue());
                    }
                    return coroutine_suspended;
                case 2:
                    i11 = c23231.I$0;
                    z12 = c23231.Z$0;
                    obj = c23231.L$1;
                    r16 = (DataStoreImpl) c23231.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        r16 = r16;
                        return new Data(obj, i11, ((Number) obj2).intValue());
                    } catch (CorruptionException e13) {
                        e = e13;
                        z11 = z12;
                        r15 = r16;
                        r11 = r15;
                        objectRef = new Ref.ObjectRef();
                        CorruptionHandler<T> corruptionHandler3 = r11.corruptionHandler;
                        c23231.L$0 = r11;
                        c23231.L$1 = e;
                        c23231.L$2 = objectRef;
                        c23231.L$3 = objectRef;
                        c23231.Z$0 = z11;
                        c23231.label = 5;
                        objHandleCorruption = corruptionHandler3.handleCorruption(e, c23231);
                        if (objHandleCorruption != coroutine_suspended) {
                            corruptionException = e;
                            obj2 = (T) objHandleCorruption;
                            objectRef2 = objectRef;
                            r12 = r11;
                            objectRef2.element = (T) obj2;
                            intRef = new Ref.IntRef();
                            c23253 = new C23253(objectRef, r12, intRef, null);
                            c23231.L$0 = corruptionException;
                            c23231.L$1 = objectRef;
                            c23231.L$2 = intRef;
                            c23231.L$3 = null;
                            c23231.label = 6;
                            if (r12.doWithWriteFileLock(z11, c23253, c23231) != coroutine_suspended) {
                                intRef2 = intRef;
                                objectRef3 = objectRef;
                                T t13 = objectRef3.element;
                                return new Data(t13, t13 != null ? t13.hashCode() : 0, intRef2.element);
                            }
                        }
                        return coroutine_suspended;
                    }
                case 3:
                    z11 = c23231.Z$0;
                    DataStoreImpl dataStoreImpl2 = (DataStoreImpl) c23231.L$0;
                    ResultKt.throwOnFailure(obj2);
                    r13 = dataStoreImpl2;
                    int iIntValue2 = ((Number) obj2).intValue();
                    InterProcessCoordinator coordinator5 = r13.getCoordinator();
                    C23242 c23243 = new C23242(r13, iIntValue2, null);
                    c23231.L$0 = r13;
                    c23231.Z$0 = z11;
                    c23231.label = 4;
                    obj2 = (T) coordinator5.tryLock(c23243, c23231);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (Data) obj2;
                case 4:
                    boolean z13 = c23231.Z$0;
                    ResultKt.throwOnFailure(obj2);
                    return (Data) obj2;
                case 5:
                    z11 = c23231.Z$0;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) c23231.L$3;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) c23231.L$2;
                    corruptionException = (CorruptionException) c23231.L$1;
                    DataStoreImpl dataStoreImpl3 = (DataStoreImpl) c23231.L$0;
                    ResultKt.throwOnFailure(obj2);
                    objectRef2 = objectRef4;
                    objectRef = objectRef5;
                    r12 = dataStoreImpl3;
                    objectRef2.element = (T) obj2;
                    intRef = new Ref.IntRef();
                    c23253 = new C23253(objectRef, r12, intRef, null);
                    c23231.L$0 = corruptionException;
                    c23231.L$1 = objectRef;
                    c23231.L$2 = intRef;
                    c23231.L$3 = null;
                    c23231.label = 6;
                    if (r12.doWithWriteFileLock(z11, c23253, c23231) != coroutine_suspended) {
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        T t14 = objectRef3.element;
                        return new Data(t14, t14 != null ? t14.hashCode() : 0, intRef2.element);
                    }
                    return coroutine_suspended;
                case 6:
                    intRef2 = (Ref.IntRef) c23231.L$2;
                    objectRef3 = (Ref.ObjectRef) c23231.L$1;
                    corruptionException2 = (CorruptionException) c23231.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        T t15 = objectRef3.element;
                        return new Data(t15, t15 != null ? t15.hashCode() : 0, intRef2.element);
                    } catch (Throwable th3) {
                        th = th3;
                        ExceptionsKt.addSuppressed(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e14) {
            e = e14;
            r11 = r17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z11, Continuation<? super State<T>> continuation) {
        return C41686h.m91049g(this.scope.getF53495b(), new C23262(this, z11, null), continuation);
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public InterfaceC41634e<T> getData() {
        return this.data;
    }

    @NotNull
    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return this.storageConnectionDelegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object writeData$datastore_core_release(T t11, boolean z11, @NotNull Continuation<? super Integer> continuation) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        Ref.IntRef intRef;
        if (continuation instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuation;
            int i11 = dataStoreImpl$writeData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuation);
        }
        Object obj = dataStoreImpl$writeData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dataStoreImpl$writeData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            StorageConnection<T> storageConnection$datastore_core_release = getStorageConnection$datastore_core_release();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(intRef2, this, t11, z11, null);
            dataStoreImpl$writeData$1.L$0 = intRef2;
            dataStoreImpl$writeData$1.label = 1;
            if (storageConnection$datastore_core_release.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intRef = (Ref.IntRef) dataStoreImpl$writeData$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(intRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(Continuation<? super T> continuation) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        return getCoordinator().lock(new C23272(this, coroutineContext, function2, null), continuation);
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuation.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return C41686h.m91049g(new UpdatingDataContextElement(updatingDataContextElement, this), new C23282(this, function2, null), continuation);
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, InterfaceC41709m0 interfaceC41709m0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i11 & 8) != 0 ? C41713n0.m91125a(Actual_jvmKt.ioDispatcher().plus(C41727q2.m91192b(null, 1, null))) : interfaceC41709m0);
    }
}
