package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.StateWrapper;
import p633t6.InterfaceC44695a;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
@InterfaceC44695a
public class StateWrapperImpl extends HybridClassBase implements StateWrapper {
    private static final String TAG = "StateWrapperImpl";

    private native ReadableNativeMap getStateDataImpl();

    private native ReadableMapBuffer getStateMapBufferDataImpl();

    private native void initHybrid();

    public native void updateStateImpl(@NonNull NativeMap nativeMap);

    static {
        FabricSoLoader.staticInit();
    }

    private StateWrapperImpl() {
        initHybrid();
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    public void destroyState() {
        if (isValid()) {
            resetNative();
        }
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    @Nullable
    public ReadableNativeMap getStateData() {
        if (!isValid()) {
            C45999a.m101507m(TAG, "Race between StateWrapperImpl destruction and getState");
            return null;
        }
        return getStateDataImpl();
    }

    @Override // com.facebook.react.uimanager.StateWrapper
    @Nullable
    public ReadableMapBuffer getStateDataMapBuffer() {
        if (!isValid()) {
            C45999a.m101507m(TAG, "Race between StateWrapperImpl destruction and getState");
            return null;
        }
        return getStateMapBufferDataImpl();
    }

    public String toString() {
        if (!isValid()) {
            return "<destroyed>";
        }
        ReadableMapBuffer stateMapBufferDataImpl = getStateMapBufferDataImpl();
        if (stateMapBufferDataImpl != null) {
            return stateMapBufferDataImpl.toString();
        }
        ReadableNativeMap stateDataImpl = getStateDataImpl();
        if (stateDataImpl == null) {
            return "<unexpected null>";
        }
        return stateDataImpl.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.StateWrapper
    public void updateState(@NonNull WritableMap writableMap) {
        if (!isValid()) {
            C45999a.m101507m(TAG, "Race between StateWrapperImpl destruction and updateState");
        } else {
            updateStateImpl((NativeMap) writableMap);
        }
    }
}
