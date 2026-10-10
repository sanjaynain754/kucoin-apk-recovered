package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {134, 135}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DataStoreImpl$incrementCollector$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl<T> dataStoreImpl, Continuation<? super DataStoreImpl$incrementCollector$2$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new DataStoreImpl$incrementCollector$2$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((DataStoreImpl$incrementCollector$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
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
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DataStoreImpl.InitDataStore initDataStore = ((DataStoreImpl) this.this$0).readAndInit;
        this.label = 1;
        if (initDataStore.awaitComplete(this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41634e interfaceC41634eM90935r = C41636g.m90935r(this.this$0.getCoordinator().getUpdateNotifications());
        final DataStoreImpl<T> dataStoreImpl = this.this$0;
        InterfaceC41635f interfaceC41635f = new InterfaceC41635f() { // from class: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.1
            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((Unit) obj2, (Continuation<? super Unit>) continuation);
            }

            @Nullable
            public final Object emit(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
                if (((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState() instanceof Final) {
                    return Unit.INSTANCE;
                }
                Object dataAndUpdateCache = dataStoreImpl.readDataAndUpdateCache(true, continuation);
                return dataAndUpdateCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? dataAndUpdateCache : Unit.INSTANCE;
            }
        };
        this.label = 2;
    }
}
