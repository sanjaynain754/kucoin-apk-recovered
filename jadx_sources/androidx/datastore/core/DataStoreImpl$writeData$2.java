package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
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
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/WriteScope;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$writeData$2", m90122f = "DataStoreImpl.kt", m90123i = {0}, m90124l = {352, 353}, m90125m = "invokeSuspend", m90126n = {"$this$writeScope"}, m90127s = {"L$0"})
public final class DataStoreImpl$writeData$2<T> extends SuspendLambda implements Function2<WriteScope<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ T $newData;
    final /* synthetic */ Ref.IntRef $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull WriteScope<T> writeScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DataStoreImpl$writeData$2) create(writeScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(Ref.IntRef intRef, DataStoreImpl<T> dataStoreImpl, T t11, boolean z11, Continuation<? super DataStoreImpl$writeData$2> continuation) {
        super(2, continuation);
        this.$newVersion = intRef;
        this.this$0 = dataStoreImpl;
        this.$newData = t11;
        this.$updateCache = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, continuation);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        if (r3.writeData(r7, r6) == r0) goto L16;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.IntRef intRef;
        WriteScope writeScope;
        int iHashCode;
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
                intRef = (Ref.IntRef) this.L$1;
                writeScope = (WriteScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (this.$updateCache) {
                DataStoreInMemoryCache dataStoreInMemoryCache = ((DataStoreImpl) this.this$0).inMemoryCache;
                T t11 = this.$newData;
                if (t11 != null) {
                    iHashCode = t11.hashCode();
                } else {
                    iHashCode = 0;
                }
                dataStoreInMemoryCache.tryUpdate(new Data(t11, iHashCode, this.$newVersion.element));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        WriteScope writeScope2 = (WriteScope) this.L$0;
        intRef = this.$newVersion;
        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
        this.L$0 = writeScope2;
        this.L$1 = intRef;
        this.label = 1;
        Object objIncrementAndGetVersion = coordinator.incrementAndGetVersion(this);
        if (objIncrementAndGetVersion != coroutine_suspended) {
            writeScope = writeScope2;
            obj = objIncrementAndGetVersion;
        }
        return coroutine_suspended;
        intRef.element = ((Number) obj).intValue();
        T t12 = this.$newData;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
