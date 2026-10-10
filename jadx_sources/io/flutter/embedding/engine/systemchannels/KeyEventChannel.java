package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33577c3;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";

    @NonNull
    public final BasicMessageChannel<Object> channel;

    /* JADX INFO: loaded from: classes60.dex */
    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z11);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class FlutterKeyEvent {

        @Nullable
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent, @Nullable Character ch2) {
            this.event = keyEvent;
            this.complexCharacter = ch2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m87518a(EventResponseHandler eventResponseHandler, Object obj) {
        boolean z11 = false;
        if (obj != null) {
            try {
                z11 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e11) {
                Log.m87477e(TAG, "Unable to unpack JSON message: " + e11);
            }
        }
        eventResponseHandler.onFrameworkResponse(z11);
    }

    private static BasicMessageChannel.Reply<Object> createReplyHandler(@NonNull final EventResponseHandler eventResponseHandler) {
        return new BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.e
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(Object obj) {
                KeyEventChannel.m87518a(eventResponseHandler, obj);
            }
        };
    }

    private Map<String, Object> encodeKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z11) {
        HashMap map = new HashMap();
        map.put("type", z11 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(flutterKeyEvent.event.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        map.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        map.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch2 = flutterKeyEvent.complexCharacter;
        if (ch2 != null) {
            map.put(FirebaseAnalytics.Param.CHARACTER, ch2.toString());
        }
        map.put("source", Integer.valueOf(flutterKeyEvent.event.getSource()));
        map.put(C33577c3.f69334H, Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return map;
    }

    public void sendFlutterKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z11, @NonNull EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z11), createReplyHandler(eventResponseHandler));
    }

    public KeyEventChannel(@NonNull BinaryMessenger binaryMessenger) {
        this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }
}
