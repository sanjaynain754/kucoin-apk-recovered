package androidx.camera.view;

import androidx.annotation.MainThread;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
class PendingValue<T> {
    private Pair<CallbackToFutureAdapter.Completer<Void>, T> mCompleterAndValue;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m2235a(PendingValue pendingValue, Object obj, CallbackToFutureAdapter.Completer completer) {
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = pendingValue.mCompleterAndValue;
        if (pair != null) {
            CallbackToFutureAdapter.Completer<Void> completer2 = pair.first;
            Objects.requireNonNull(completer2);
            completer2.setCancelled();
        }
        pendingValue.mCompleterAndValue = new Pair<>(completer, obj);
        return "PendingValue " + obj;
    }

    @MainThread
    public void propagateIfHasValue(Function<T, ListenableFuture<Void>> function) {
        Threads.checkMainThread();
        Pair<CallbackToFutureAdapter.Completer<Void>, T> pair = this.mCompleterAndValue;
        if (pair != null) {
            ListenableFuture<Void> listenableFutureApply = function.apply(pair.second);
            CallbackToFutureAdapter.Completer<Void> completer = this.mCompleterAndValue.first;
            Objects.requireNonNull(completer);
            Futures.propagate(listenableFutureApply, completer);
            this.mCompleterAndValue = null;
        }
    }

    @MainThread
    public ListenableFuture<Void> setValue(final T t11) {
        Threads.checkMainThread();
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.m
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return PendingValue.m2235a(this.f2158a, t11, completer);
            }
        });
    }
}
