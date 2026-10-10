package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.TracingControllerImpl;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public abstract class TracingController {
    public abstract boolean isTracing();

    public abstract void start(@NonNull TracingConfig tracingConfig);

    public abstract boolean stop(@Nullable OutputStream outputStream, @NonNull Executor executor);

    public static class LAZY_HOLDER {
        static final TracingController INSTANCE = new TracingControllerImpl();

        private LAZY_HOLDER() {
        }
    }

    @NonNull
    public static TracingController getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingController() {
    }
}
