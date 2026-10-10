package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BinaryMessenger;

/* JADX INFO: loaded from: classes23.dex */
public class DownloadListenerFlutterApiImpl extends GeneratedAndroidWebView.DownloadListenerFlutterApi {
    private final InstanceManager instanceManager;

    private long getIdentifierForListener(DownloadListener downloadListener) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(downloadListener);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public DownloadListenerFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }

    public void onDownloadStart(@NonNull DownloadListener downloadListener, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, long j11, @NonNull GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply<Void> reply) {
        onDownloadStart(Long.valueOf(getIdentifierForListener(downloadListener)), str, str2, str3, str4, Long.valueOf(j11), reply);
    }
}
