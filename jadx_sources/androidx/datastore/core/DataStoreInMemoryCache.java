package androidx.datastore.core;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DataStoreInMemoryCache.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Landroidx/datastore/core/State;", "newState", "tryUpdate", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "Lkotlinx/coroutines/flow/n;", "cachedValue", "Lkotlinx/coroutines/flow/n;", "getCachedValue$annotations", "getCurrentState", "()Landroidx/datastore/core/State;", "currentState", "Lkotlinx/coroutines/flow/e;", "getFlow", "()Lkotlinx/coroutines/flow/e;", "flow", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreInMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,79:1\n198#2,5:80\n*S KotlinDebug\n*F\n+ 1 DataStoreInMemoryCache.kt\nandroidx/datastore/core/DataStoreInMemoryCache\n*L\n45#1:80,5\n*E\n"})
public final class DataStoreInMemoryCache<T> {

    @NotNull
    private final InterfaceC41669n<State<T>> cachedValue;

    @NotNull
    public final State<T> getCurrentState() {
        return this.cachedValue.getValue();
    }

    @NotNull
    public final InterfaceC41634e<State<T>> getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    @NotNull
    public final State<T> tryUpdate(@NotNull State<T> newState) {
        State<T> value;
        State<T> state;
        Intrinsics.checkNotNullParameter(newState, "newState");
        InterfaceC41669n<State<T>> interfaceC41669n = this.cachedValue;
        do {
            value = interfaceC41669n.getValue();
            state = value;
            if (state instanceof ReadException ? true : Intrinsics.areEqual(state, UnInitialized.INSTANCE)) {
                state = newState;
            } else if (state instanceof Data) {
                if (newState.getVersion() > state.getVersion()) {
                    state = newState;
                }
            } else if (!(state instanceof Final)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!interfaceC41669n.compareAndSet(value, state));
        return state;
    }

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        Intrinsics.checkNotNull(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = C41679x.m91009a(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }
}
