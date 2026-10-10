package fr.greweb.reactnativeviewshot;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes60.dex */
public abstract class NativeRNViewShotSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNViewShot";

    @ReactMethod
    @InterfaceC44695a
    public abstract void captureRef(Double d11, ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void captureScreen(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC44695a
    public abstract void releaseCapture(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeRNViewShotSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
