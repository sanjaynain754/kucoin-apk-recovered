package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricSoLoader;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
@InterfaceC44695a
public class EventEmitterWrapper extends HybridClassBase {
    private native void dispatchEvent(String str, @Nullable NativeMap nativeMap, int i11);

    private native void dispatchEventSynchronously(String str, @Nullable NativeMap nativeMap);

    private native void dispatchUniqueEvent(String str, @Nullable NativeMap nativeMap);

    public synchronized void destroy() {
        if (isValid()) {
            resetNative();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatch(String str, @Nullable WritableMap writableMap, int i11) {
        if (isValid()) {
            dispatchEvent(str, (NativeMap) writableMap, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatchEventSynchronously(String str, @Nullable WritableMap writableMap) {
        if (isValid()) {
            dispatchEventSynchronously(str, (NativeMap) writableMap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void dispatchUnique(String str, @Nullable WritableMap writableMap) {
        if (isValid()) {
            dispatchUniqueEvent(str, (NativeMap) writableMap);
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    @InterfaceC44695a
    private EventEmitterWrapper() {
    }
}
