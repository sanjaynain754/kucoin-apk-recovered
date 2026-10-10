package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "BlobModule";

    @ReactMethod
    @InterfaceC44695a
    public abstract void addNetworkingHandler();

    @ReactMethod
    @InterfaceC44695a
    public abstract void addWebSocketHandler(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void createFromParts(ReadableArray readableArray, String str);

    public abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    @InterfaceC44695a
    public abstract void release(String str);

    @ReactMethod
    @InterfaceC44695a
    public abstract void removeWebSocketHandler(double d11);

    @ReactMethod
    @InterfaceC44695a
    public abstract void sendOverSocket(ReadableMap readableMap, double d11);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NativeBlobModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @InterfaceC44695a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet(Arrays.asList("BLOB_URI_HOST", "BLOB_URI_SCHEME"));
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (hashSet3.isEmpty()) {
                hashSet.removeAll(typedExportedConstants.keySet());
                if (!hashSet.isEmpty()) {
                    throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
                }
            } else {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
        }
        return typedExportedConstants;
    }
}
