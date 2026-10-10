package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes23.dex */
public final class DeferrableSurfaces {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1955a(final ListenableFuture listenableFuture, Executor executor, final boolean z11, Collection collection, final CallbackToFutureAdapter.Completer completer) {
        completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.x
            @Override // java.lang.Runnable
            public final void run() {
                listenableFuture.cancel(true);
            }
        }, executor);
        Futures.addCallback(listenableFuture, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                if (th2 instanceof TimeoutException) {
                    completer.setException(th2);
                } else {
                    completer.set(Collections.EMPTY_LIST);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(List<Surface> list) {
                Preconditions.checkNotNull(list);
                ArrayList arrayList = new ArrayList(list);
                if (z11) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(final Collection<DeferrableSurface> collection, final boolean z11, long j11, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final ListenableFuture listenableFutureMakeTimeoutFuture = Futures.makeTimeoutFuture(j11, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.y
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.m1955a(listenableFutureMakeTimeoutFuture, executor, z11, collection, completer);
            }
        });
    }

    private DeferrableSurfaces() {
    }

    public static void decrementAll(List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (!list.isEmpty()) {
            int i11 = 0;
            do {
                try {
                    list.get(i11).incrementUseCount();
                    i11++;
                } catch (DeferrableSurface.SurfaceClosedException e11) {
                    for (int i12 = i11 - 1; i12 >= 0; i12--) {
                        list.get(i12).decrementUseCount();
                    }
                    throw e11;
                }
            } while (i11 < list.size());
        }
    }

    public static boolean tryIncrementAll(List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
