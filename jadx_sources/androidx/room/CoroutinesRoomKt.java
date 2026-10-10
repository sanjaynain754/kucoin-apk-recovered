package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41718o1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Landroidx/room/RoomDatabase;", "Lkotlinx/coroutines/j0;", "getQueryDispatcher", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/j0;", "getTransactionDispatcher", "transactionDispatcher", "room-ktx_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class CoroutinesRoomKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final AbstractC41697j0 getQueryDispatcher(@NotNull RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Intrinsics.checkNotNullExpressionValue(backingFieldMap, "backingFieldMap");
        Object objM91178b = backingFieldMap.get("QueryDispatcher");
        if (objM91178b == null) {
            Executor queryExecutor = roomDatabase.getQueryExecutor();
            Intrinsics.checkNotNullExpressionValue(queryExecutor, "queryExecutor");
            objM91178b = C41718o1.m91178b(queryExecutor);
            backingFieldMap.put("QueryDispatcher", objM91178b);
        }
        if (objM91178b != null) {
            return (AbstractC41697j0) objM91178b;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    @NotNull
    public static final AbstractC41697j0 getTransactionDispatcher(@NotNull RoomDatabase roomDatabase) {
        Intrinsics.checkNotNullParameter(roomDatabase, "<this>");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        Intrinsics.checkNotNullExpressionValue(backingFieldMap, "backingFieldMap");
        Object objM91178b = backingFieldMap.get("TransactionDispatcher");
        if (objM91178b == null) {
            Executor transactionExecutor = roomDatabase.getTransactionExecutor();
            Intrinsics.checkNotNullExpressionValue(transactionExecutor, "transactionExecutor");
            objM91178b = C41718o1.m91178b(transactionExecutor);
            backingFieldMap.put("TransactionDispatcher", objM91178b);
        }
        if (objM91178b != null) {
            return (AbstractC41697j0) objM91178b;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
