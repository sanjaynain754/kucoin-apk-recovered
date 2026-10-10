package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
abstract class FlutterAssetManager {
    final AssetManager assetManager;

    public static class PluginBindingFlutterAssetManager extends FlutterAssetManager {
        final FlutterPlugin.FlutterAssets flutterAssets;

        @Override // io.flutter.plugins.webviewflutter.FlutterAssetManager
        public String getAssetFilePathByName(String str) {
            return this.flutterAssets.getAssetFilePathByName(str);
        }

        public PluginBindingFlutterAssetManager(AssetManager assetManager, FlutterPlugin.FlutterAssets flutterAssets) {
            super(assetManager);
            this.flutterAssets = flutterAssets;
        }
    }

    public abstract String getAssetFilePathByName(String str);

    public String[] list(@NonNull String str) throws IOException {
        return this.assetManager.list(str);
    }

    public FlutterAssetManager(AssetManager assetManager) {
        this.assetManager = assetManager;
    }
}
