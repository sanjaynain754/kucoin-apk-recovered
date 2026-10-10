package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

/* JADX INFO: loaded from: classes23.dex */
class FlutterViewFactory extends PlatformViewFactory {
    private final InstanceManager instanceManager;

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    @NonNull
    public PlatformView create(Context context, int i11, @Nullable Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        final Object instanceManager = this.instanceManager.getInstance(num.intValue());
        if (instanceManager instanceof PlatformView) {
            return (PlatformView) instanceManager;
        }
        if (instanceManager instanceof View) {
            return new PlatformView() { // from class: io.flutter.plugins.webviewflutter.FlutterViewFactory.1
                @Override // io.flutter.plugin.platform.PlatformView
                public View getView() {
                    return (View) instanceManager;
                }

                @Override // io.flutter.plugin.platform.PlatformView
                public void dispose() {
                }
            };
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + instanceManager);
    }

    public FlutterViewFactory(InstanceManager instanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.instanceManager = instanceManager;
    }
}
