package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.ContinuationInterceptor;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m90084d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlinx/coroutines/x1;", "transactionThreadControlJob", "Lkotlin/coroutines/ContinuationInterceptor;", "transactionDispatcher", "<init>", "(Lkotlinx/coroutines/x1;Lkotlin/coroutines/ContinuationInterceptor;)V", "", "acquire", "()V", "release", "Lkotlinx/coroutines/x1;", "Lkotlin/coroutines/ContinuationInterceptor;", "getTransactionDispatcher$room_ktx_release", "()Lkotlin/coroutines/ContinuationInterceptor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "key", "Key", "room-ktx_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TransactionElement implements CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AtomicInteger referenceCount;

    @NotNull
    private final ContinuationInterceptor transactionDispatcher;

    @NotNull
    private final InterfaceC41775x1 transactionThreadControlJob;

    /* JADX INFO: renamed from: androidx.room.TransactionElement$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/TransactionElement;", "()V", "room-ktx_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion implements CoroutineContext.Key<TransactionElement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<TransactionElement> getKey() {
        return INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: getTransactionDispatcher$room_ktx_release, reason: from getter */
    public final ContinuationInterceptor getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    public final void release() {
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
        if (iDecrementAndGet == 0) {
            InterfaceC41775x1.a.m91377a(this.transactionThreadControlJob, null, 1, null);
        }
    }

    public TransactionElement(@NotNull InterfaceC41775x1 transactionThreadControlJob, @NotNull ContinuationInterceptor transactionDispatcher) {
        Intrinsics.checkNotNullParameter(transactionThreadControlJob, "transactionThreadControlJob");
        Intrinsics.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.transactionThreadControlJob = transactionThreadControlJob;
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
