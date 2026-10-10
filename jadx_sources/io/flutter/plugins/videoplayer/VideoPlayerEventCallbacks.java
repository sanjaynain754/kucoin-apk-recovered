package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.uimanager.ViewProps;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes60.dex */
final class VideoPlayerEventCallbacks implements VideoPlayerCallbacks {
    private final EventChannel.EventSink eventSink;

    public static VideoPlayerEventCallbacks bindTo(EventChannel eventChannel) {
        final QueuingEventSink queuingEventSink = new QueuingEventSink();
        eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayerEventCallbacks.1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                queuingEventSink.setDelegate(null);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                queuingEventSink.setDelegate(eventSink);
            }
        });
        return withSink(queuingEventSink);
    }

    @VisibleForTesting
    public static VideoPlayerEventCallbacks withSink(EventChannel.EventSink eventSink) {
        return new VideoPlayerEventCallbacks(eventSink);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingEnd() {
        HashMap map = new HashMap();
        map.put("event", "bufferingEnd");
        this.eventSink.success(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingStart() {
        HashMap map = new HashMap();
        map.put("event", "bufferingStart");
        this.eventSink.success(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingUpdate(long j11) {
        HashMap map = new HashMap();
        map.put("event", "bufferingUpdate");
        map.put(ViewProps.POSITION, Long.valueOf(j11));
        this.eventSink.success(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onCompleted() {
        HashMap map = new HashMap();
        map.put("event", "completed");
        this.eventSink.success(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onInitialized(int i11, int i12, long j11, int i13) {
        HashMap map = new HashMap();
        map.put("event", "initialized");
        map.put("width", Integer.valueOf(i11));
        map.put("height", Integer.valueOf(i12));
        map.put(TypedValues.TransitionType.S_DURATION, Long.valueOf(j11));
        if (i13 != 0) {
            map.put("rotationCorrection", Integer.valueOf(i13));
        }
        this.eventSink.success(map);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onIsPlayingStateUpdate(boolean z11) {
        HashMap map = new HashMap();
        map.put("event", "isPlayingStateUpdate");
        map.put("isPlaying", Boolean.valueOf(z11));
        this.eventSink.success(map);
    }

    private VideoPlayerEventCallbacks(EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
    }
}
