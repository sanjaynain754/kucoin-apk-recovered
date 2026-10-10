package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes23.dex */
class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    public static <T> ListenableFuture<T> immediateFailedFuture(@NonNull Throwable th2) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th2);
        return resolvableFutureCreate;
    }
}
