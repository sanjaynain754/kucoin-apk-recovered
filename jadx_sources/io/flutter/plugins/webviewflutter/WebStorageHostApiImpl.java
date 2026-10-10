package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebStorageHostApiImpl implements GeneratedAndroidWebView.WebStorageHostApi {
    private final InstanceManager instanceManager;
    private final WebStorageCreator webStorageCreator;

    public static class WebStorageCreator {
        @NonNull
        public WebStorage createWebStorage() {
            return WebStorage.getInstance();
        }
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi
    public void create(@NonNull Long l11) {
        this.instanceManager.addDartCreatedInstance(this.webStorageCreator.createWebStorage(), l11.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi
    public void deleteAllData(@NonNull Long l11) {
        WebStorage webStorage = (WebStorage) this.instanceManager.getInstance(l11.longValue());
        Objects.requireNonNull(webStorage);
        webStorage.deleteAllData();
    }

    public WebStorageHostApiImpl(@NonNull InstanceManager instanceManager, @NonNull WebStorageCreator webStorageCreator) {
        this.instanceManager = instanceManager;
        this.webStorageCreator = webStorageCreator;
    }
}
