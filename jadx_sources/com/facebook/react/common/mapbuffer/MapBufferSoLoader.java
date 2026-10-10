package com.facebook.react.common.mapbuffer;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: MapBufferSoLoader.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/facebook/react/common/mapbuffer/MapBufferSoLoader;", "", "<init>", "()V", "didInit", "", "staticInit", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class MapBufferSoLoader {

    @NotNull
    public static final MapBufferSoLoader INSTANCE = new MapBufferSoLoader();
    private static volatile boolean didInit;

    @JvmStatic
    public static final void staticInit() {
        if (didInit) {
            return;
        }
        didInit = true;
        Systrace.m10662c(0L, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.loadLibrary("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        Systrace.m10667i(0L);
    }

    private MapBufferSoLoader() {
    }
}
