package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.C44087f;
import rg0.InterfaceC44082a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", ExifInterface.GPS_DIRECTION_TRUE}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", m90122f = "DataStoreImpl.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, m90124l = {437, 458, BaseQuickAdapter.LOADING_VIEW, 468}, m90125m = "invokeSuspend", m90126n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n1855#2,2:539\n120#3,10:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1\n*L\n458#1:539,2\n461#1:541,10\n*E\n"})
public final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements Function1<Continuation<? super Data<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, Continuation<? super DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Data<T>> continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a9->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws CorruptionException {
        InterfaceC44082a interfaceC44082aM97144b;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef2;
        InterfaceC44082a interfaceC44082a;
        Iterator<T> it;
        InterfaceC44082a interfaceC44082a2;
        Ref.BooleanRef booleanRef3;
        Ref.ObjectRef objectRef3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Ref.ObjectRef objectRef4;
        Function2 function2;
        Object obj2;
        int i11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        int iHashCode = 0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            i11 = this.I$0;
                            obj2 = this.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        interfaceC44082a = (InterfaceC44082a) this.L$2;
                        objectRef4 = (Ref.ObjectRef) this.L$1;
                        booleanRef2 = (Ref.BooleanRef) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        try {
                            booleanRef2.element = true;
                            Unit unit = Unit.INSTANCE;
                            interfaceC44082a.mo91345e(null);
                            obj2 = objectRef4.element;
                            if (obj2 != null) {
                                iHashCode = obj2.hashCode();
                            }
                            InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.I$0 = iHashCode;
                            this.label = 4;
                            obj = coordinator.getVersion(this);
                            if (obj != coroutine_suspended) {
                                i11 = iHashCode;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            interfaceC44082a.mo91345e(null);
                            throw th2;
                        }
                    }
                } else {
                    it = (Iterator) this.L$4;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                    objectRef3 = (Ref.ObjectRef) this.L$2;
                    booleanRef3 = (Ref.BooleanRef) this.L$1;
                    interfaceC44082a2 = (InterfaceC44082a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        function2 = (Function2) it.next();
                        this.L$0 = interfaceC44082a2;
                        this.L$1 = booleanRef3;
                        this.L$2 = objectRef3;
                        this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                        this.L$4 = it;
                        this.label = 2;
                        if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    objectRef2 = objectRef3;
                    booleanRef2 = booleanRef3;
                    interfaceC44082a = interfaceC44082a2;
                    ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                    this.L$0 = booleanRef2;
                    this.L$1 = objectRef2;
                    this.L$2 = interfaceC44082a;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
                        objectRef4 = objectRef2;
                        booleanRef2.element = true;
                        Unit unit2 = Unit.INSTANCE;
                        interfaceC44082a.mo91345e(null);
                        obj2 = objectRef4.element;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        }
                        InterProcessCoordinator coordinator2 = this.this$0.getCoordinator();
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.I$0 = iHashCode;
                        this.label = 4;
                        obj = coordinator2.getVersion(this);
                        if (obj != coroutine_suspended) {
                            i11 = iHashCode;
                        }
                    }
                    return coroutine_suspended;
                }
            } else {
                objectRef = (Ref.ObjectRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                booleanRef = (Ref.BooleanRef) this.L$1;
                interfaceC44082aM97144b = (InterfaceC44082a) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return new Data(obj2, i11, ((Number) obj).intValue());
        }
        ResultKt.throwOnFailure(obj);
        interfaceC44082aM97144b = C44087f.m97144b(false, 1, null);
        booleanRef = new Ref.BooleanRef();
        objectRef = new Ref.ObjectRef();
        DataStoreImpl<T> dataStoreImpl = this.this$0;
        this.L$0 = interfaceC44082aM97144b;
        this.L$1 = booleanRef;
        this.L$2 = objectRef;
        this.L$3 = objectRef;
        this.label = 1;
        obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
        if (obj != coroutine_suspended) {
            objectRef2 = objectRef;
        }
        return coroutine_suspended;
        objectRef.element = (T) ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(interfaceC44082aM97144b, booleanRef, objectRef2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            interfaceC44082a2 = interfaceC44082aM97144b;
            booleanRef3 = booleanRef;
            objectRef3 = objectRef2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.L$0 = interfaceC44082a2;
                this.L$1 = booleanRef3;
                this.L$2 = objectRef3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objectRef2 = objectRef3;
            booleanRef2 = booleanRef3;
            interfaceC44082a = interfaceC44082a2;
        } else {
            booleanRef2 = booleanRef;
            interfaceC44082a = interfaceC44082aM97144b;
        }
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = booleanRef2;
        this.L$1 = objectRef2;
        this.L$2 = interfaceC44082a;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (interfaceC44082a.mo91344d(null, this) != coroutine_suspended) {
            objectRef4 = objectRef2;
            booleanRef2.element = true;
            Unit unit3 = Unit.INSTANCE;
            interfaceC44082a.mo91345e(null);
            obj2 = objectRef4.element;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            }
            InterProcessCoordinator coordinator3 = this.this$0.getCoordinator();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            obj = coordinator3.getVersion(this);
            if (obj != coroutine_suspended) {
                i11 = iHashCode;
                return new Data(obj2, i11, ((Number) obj).intValue());
            }
        }
        return coroutine_suspended;
    }
}
