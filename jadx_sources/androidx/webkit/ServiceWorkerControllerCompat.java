package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ServiceWorkerControllerImpl;

/* JADX INFO: loaded from: classes34.dex */
public abstract class ServiceWorkerControllerCompat {
    @NonNull
    public abstract ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat);

    public static class LAZY_HOLDER {
        static final ServiceWorkerControllerCompat INSTANCE = new ServiceWorkerControllerImpl();

        private LAZY_HOLDER() {
        }
    }

    @NonNull
    public static ServiceWorkerControllerCompat getInstance() {
        return LAZY_HOLDER.INSTANCE;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ServiceWorkerControllerCompat() {
    }
}
