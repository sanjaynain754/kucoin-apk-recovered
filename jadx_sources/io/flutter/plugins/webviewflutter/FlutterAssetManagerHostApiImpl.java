package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class FlutterAssetManagerHostApiImpl implements GeneratedAndroidWebView.FlutterAssetManagerHostApi {
    final FlutterAssetManager flutterAssetManager;

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    @NonNull
    public String getAssetFilePathByName(@NonNull String str) {
        return this.flutterAssetManager.getAssetFilePathByName(str);
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi
    @NonNull
    public List<String> list(@NonNull String str) {
        try {
            String[] list = this.flutterAssetManager.list(str);
            return list == null ? new ArrayList() : Arrays.asList(list);
        } catch (IOException e11) {
            throw new RuntimeException(e11.getMessage());
        }
    }

    public FlutterAssetManagerHostApiImpl(@NonNull FlutterAssetManager flutterAssetManager) {
        this.flutterAssetManager = flutterAssetManager;
    }
}
