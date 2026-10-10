package com.facebook.react.bridge;

import android.os.SystemClock;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC44695a
public class ReactMarker {
    private static Queue<ReactMarkerRecord> sNativeReactMarkerQueue = new ConcurrentLinkedQueue();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11, long j11);

        default void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11, long j11, int i12) {
            logFabricMarker(reactMarkerConstants, str, i11, j11);
        }
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11);
    }

    public static class ReactMarkerRecord {
        private final String mMarkerName;
        private final long mMarkerTime;

        public String getMarkerName() {
            return this.mMarkerName;
        }

        public long getMarkerTime() {
            return this.mMarkerTime;
        }

        public ReactMarkerRecord(String str, long j11) {
            this.mMarkerName = str;
            this.mMarkerTime = j11;
        }
    }

    @InterfaceC44695a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11, long j11, int i12) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i11, j11, i12);
        }
    }

    @InterfaceC44695a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @InterfaceC44695a
    private static native void nativeLogMarker(String str, long j11);

    @InterfaceC44695a
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    @InterfaceC44695a
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    @InterfaceC44695a
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @InterfaceC44695a
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @InterfaceC44695a
    public static void logMarker(String str, int i11) {
        logMarker(str, (String) null, i11);
    }

    @InterfaceC44695a
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @InterfaceC44695a
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @InterfaceC44695a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11, long j11) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i11, j11, 0);
        }
    }

    @InterfaceC44695a
    public static void logMarker(String str, @Nullable String str2) {
        logMarker(str, str2, 0);
    }

    @InterfaceC44695a
    private static void notifyNativeMarker(ReactMarkerConstants reactMarkerConstants, @Nullable Long l11) {
        if (reactMarkerConstants.hasMatchingNameMarker()) {
            if (l11 == null) {
                l11 = Long.valueOf(SystemClock.uptimeMillis());
            }
            if (ReactBridge.isInitialized()) {
                nativeLogMarker(reactMarkerConstants.name(), l11.longValue());
                while (true) {
                    ReactMarkerRecord reactMarkerRecordPoll = sNativeReactMarkerQueue.poll();
                    if (reactMarkerRecordPoll != null) {
                        nativeLogMarker(reactMarkerRecordPoll.getMarkerName(), reactMarkerRecordPoll.getMarkerTime());
                    } else {
                        return;
                    }
                }
            } else {
                sNativeReactMarkerQueue.add(new ReactMarkerRecord(reactMarkerConstants.name(), l11.longValue()));
            }
        }
    }

    @InterfaceC44695a
    public static void logMarker(String str, @Nullable String str2, int i11) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i11);
    }

    @InterfaceC44695a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11) {
        logFabricMarker(reactMarkerConstants, str, i11, SystemClock.uptimeMillis(), 0);
    }

    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i11) {
        logMarker(reactMarkerConstants, (String) null, i11);
    }

    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, long j11) {
        logMarker(reactMarkerConstants, null, 0, Long.valueOf(j11));
    }

    @AnyThread
    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11) {
        logMarker(reactMarkerConstants, str, i11, null);
    }

    @AnyThread
    @InterfaceC44695a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, @Nullable String str, int i11, @Nullable Long l11) {
        logFabricMarker(reactMarkerConstants, str, i11);
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(reactMarkerConstants, str, i11);
        }
        notifyNativeMarker(reactMarkerConstants, l11);
    }
}
