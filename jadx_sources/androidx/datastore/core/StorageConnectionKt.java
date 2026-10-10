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
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: StorageConnection.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a&\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"readData", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/StorageConnection;", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "", "value", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class StorageConnectionKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    /* JADX INFO: compiled from: StorageConnection.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m90084d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/ReadScope;", "it", ""}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.StorageConnectionKt$readData$2", m90122f = "StorageConnection.kt", m90123i = {}, m90124l = {74}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23492<T> extends SuspendLambda implements Function3<ReadScope<T>, Boolean, Continuation<? super T>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C23492(Continuation<? super C23492> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object invoke(@NotNull ReadScope<T> readScope, boolean z11, @Nullable Continuation<? super T> continuation) {
            C23492 c23492 = new C23492(continuation);
            c23492.L$0 = readScope;
            return c23492.invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return invoke((ReadScope) obj, bool.booleanValue(), (Continuation) obj2);
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
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            if (data == coroutine_suspended) {
                return coroutine_suspended;
            }
            return data;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    /* JADX INFO: compiled from: StorageConnection.kt */
    /* JADX INFO: loaded from: classes34.dex */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/WriteScope;"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m90122f = "StorageConnection.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23502<T> extends SuspendLambda implements Function2<WriteScope<T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WriteScope<T> writeScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C23502) create(writeScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23502(T t11, Continuation<? super C23502> continuation) {
            super(2, continuation);
            this.$value = t11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23502 c23502 = new C23502(this.$value, continuation);
            c23502.L$0 = obj;
            return c23502;
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
                WriteScope writeScope = (WriteScope) this.L$0;
                T t11 = this.$value;
                this.label = 1;
                if (writeScope.writeData(t11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Object readData(@NotNull StorageConnection<T> storageConnection, @NotNull Continuation<? super T> continuation) {
        return storageConnection.readScope(new C23492(null), continuation);
    }

    @Nullable
    public static final <T> Object writeData(@NotNull StorageConnection<T> storageConnection, T t11, @NotNull Continuation<? super Unit> continuation) {
        Object objWriteScope = storageConnection.writeScope(new C23502(t11, null), continuation);
        return objWriteScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteScope : Unit.INSTANCE;
    }
}
