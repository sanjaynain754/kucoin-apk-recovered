package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.sqlite.p023db.SupportSQLiteCompat;
import java.util.concurrent.Callable;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.C41726q1;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Landroidx/room/CoroutinesRoom;", "", "()V", "Companion", "room-ktx_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000fJL\u0010\u0015\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00140\u0013\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m90084d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "<init>", "()V", "R", "Landroidx/room/RoomDatabase;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/e;", "Lkotlin/jvm/JvmSuppressWildcards;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/e;", "room-ktx_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z11, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.get$context().get(TransactionElement.INSTANCE);
            ContinuationInterceptor transactionDispatcher = transactionElement == null ? null : transactionElement.getTransactionDispatcher();
            if (transactionDispatcher == null) {
                transactionDispatcher = z11 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return C41686h.m91049g(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), continuation);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final <R> InterfaceC41634e<R> createFlow(@NotNull RoomDatabase db2, boolean inTransaction, @NotNull String[] tableNames, @NotNull Callable<R> callable) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            Intrinsics.checkNotNullParameter(callable, "callable");
            return C41636g.m90887K(new CoroutinesRoom$Companion$createFlow$1(inTransaction, db2, tableNames, callable, null));
        }

        @JvmStatic
        @Nullable
        public final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z11, @NotNull final CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
            if (roomDatabase.isOpen() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.get$context().get(TransactionElement.INSTANCE);
            ContinuationInterceptor transactionDispatcher = transactionElement == null ? null : transactionElement.getTransactionDispatcher();
            if (transactionDispatcher == null) {
                transactionDispatcher = z11 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
            c41716o.m91142E();
            final InterfaceC41775x1 interfaceC41775x1M91104d = C41696j.m91104d(C41726q1.f91773b, transactionDispatcher, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, c41716o, null), 2, null);
            c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th2) {
                    SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal);
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1M91104d, null, 1, null);
                }
            });
            Object objM91171w = c41716o.m91171w();
            if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objM91171w;
        }
    }

    @JvmStatic
    @Nullable
    public static final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z11, @NotNull CancellationSignal cancellationSignal, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z11, cancellationSignal, callable, continuation);
    }

    @JvmStatic
    @NotNull
    public static final <R> InterfaceC41634e<R> createFlow(@NotNull RoomDatabase roomDatabase, boolean z11, @NotNull String[] strArr, @NotNull Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z11, strArr, callable);
    }

    @JvmStatic
    @Nullable
    public static final <R> Object execute(@NotNull RoomDatabase roomDatabase, boolean z11, @NotNull Callable<R> callable, @NotNull Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z11, callable, continuation);
    }

    private CoroutinesRoom() {
    }
}
