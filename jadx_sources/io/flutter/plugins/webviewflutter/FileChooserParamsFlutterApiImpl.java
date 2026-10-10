package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes60.dex */
@RequiresApi(api = 21)
public class FileChooserParamsFlutterApiImpl extends GeneratedAndroidWebView.FileChooserParamsFlutterApi {
    private final InstanceManager instanceManager;

    private static GeneratedAndroidWebView.FileChooserMode toFileChooserEnumData(int i11) {
        if (i11 == 0) {
            return GeneratedAndroidWebView.FileChooserMode.OPEN;
        }
        if (i11 == 1) {
            return GeneratedAndroidWebView.FileChooserMode.OPEN_MULTIPLE;
        }
        if (i11 == 3) {
            return GeneratedAndroidWebView.FileChooserMode.SAVE;
        }
        throw new IllegalArgumentException(String.format("Unsupported FileChooserMode: %d", Integer.valueOf(i11)));
    }

    public void create(@NonNull WebChromeClient.FileChooserParams fileChooserParams, @NonNull GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply<Void> reply) {
        if (this.instanceManager.containsInstance(fileChooserParams)) {
            return;
        }
        create(Long.valueOf(this.instanceManager.addHostCreatedInstance(fileChooserParams)), Boolean.valueOf(fileChooserParams.isCaptureEnabled()), Arrays.asList(fileChooserParams.getAcceptTypes()), toFileChooserEnumData(fileChooserParams.getMode()), fileChooserParams.getFilenameHint(), reply);
    }

    public FileChooserParamsFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        super(binaryMessenger);
        this.instanceManager = instanceManager;
    }
}
