package androidx.datastore.core;

import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44082a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001JA\u0010\u0002\u001a\u00028\u000021\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004H\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "updateData", ViewProps.TRANSFORM, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1\n*L\n441#1:539,10\n*E\n"})
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref.ObjectRef<T> $currentData;
    final /* synthetic */ Ref.BooleanRef $initializationComplete;
    final /* synthetic */ InterfaceC44082a $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(InterfaceC44082a interfaceC44082a, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = interfaceC44082a;
        this.$initializationComplete = booleanRef;
        this.$currentData = objectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InitializerApi
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        InterfaceC44082a interfaceC44082a;
        DataStoreImpl dataStoreImpl;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        InterfaceC44082a interfaceC44082a2;
        InterfaceC44082a interfaceC44082a3;
        DataStoreImpl dataStoreImpl2;
        T t11;
        Ref.ObjectRef<T> objectRef2;
        if (continuation instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            int i11 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        }
        Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                interfaceC44082a = this.$updateLock;
                Ref.BooleanRef booleanRef2 = this.$initializationComplete;
                Ref.ObjectRef<T> objectRef3 = this.$currentData;
                dataStoreImpl = this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = interfaceC44082a;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = booleanRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = objectRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (interfaceC44082a.mo91344d(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t11 = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    interfaceC44082a2 = (InterfaceC44082a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectRef2.element = t11;
                        objectRef = objectRef2;
                        T t12 = objectRef.element;
                        interfaceC44082a2.mo91345e(null);
                        return t12;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC44082a2.mo91345e(null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                interfaceC44082a3 = (InterfaceC44082a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    dataStoreImpl2 = dataStoreImpl3;
                    if (!Intrinsics.areEqual(obj, objectRef.element)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC44082a3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                            t11 = (T) obj;
                            objectRef2 = objectRef;
                            interfaceC44082a2 = interfaceC44082a3;
                            objectRef2.element = t11;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    }
                    interfaceC44082a2 = interfaceC44082a3;
                    T t13 = objectRef.element;
                    interfaceC44082a2.mo91345e(null);
                    return t13;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC44082a2 = interfaceC44082a3;
                    interfaceC44082a2.mo91345e(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
            objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            InterfaceC44082a interfaceC44082a4 = (InterfaceC44082a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            Function2<? super T, ? super Continuation<? super T>, ? extends Object> function3 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            ResultKt.throwOnFailure(obj);
            dataStoreImpl = dataStoreImpl4;
            function2 = function3;
            interfaceC44082a = interfaceC44082a4;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            T t14 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC44082a;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = function2.invoke(t14, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != coroutine_suspended) {
                interfaceC44082a3 = interfaceC44082a;
                obj = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!Intrinsics.areEqual(obj, objectRef.element)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = interfaceC44082a3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                        t11 = (T) obj;
                        objectRef2 = objectRef;
                        interfaceC44082a2 = interfaceC44082a3;
                        objectRef2.element = t11;
                        objectRef = objectRef2;
                    }
                } else {
                    interfaceC44082a2 = interfaceC44082a3;
                }
                T t15 = objectRef.element;
                interfaceC44082a2.mo91345e(null);
                return t15;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            th = th4;
            interfaceC44082a2 = interfaceC44082a;
            interfaceC44082a2.mo91345e(null);
            throw th;
        }
    }
}
