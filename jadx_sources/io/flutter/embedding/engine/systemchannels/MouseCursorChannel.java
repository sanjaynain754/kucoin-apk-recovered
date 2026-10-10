package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;
import com.tencent.bugly.proguard.C33612dh;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public class MouseCursorChannel {
    private static final String TAG = "MouseCursorChannel";

    @NonNull
    public final MethodChannel channel;

    @Nullable
    private MouseCursorMethodHandler mouseCursorMethodHandler;

    @NonNull
    private final MethodChannel.MethodCallHandler parsingMethodCallHandler;

    public interface MouseCursorMethodHandler {
        void activateSystemCursor(@NonNull String str);
    }

    public void setMethodHandler(@Nullable MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.mouseCursorMethodHandler = mouseCursorMethodHandler;
    }

    @VisibleForTesting
    public void synthesizeMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
        this.parsingMethodCallHandler.onMethodCall(methodCall, result);
    }

    public MouseCursorChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                if (MouseCursorChannel.this.mouseCursorMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Log.m87481v(MouseCursorChannel.TAG, "Received '" + str + "' message.");
                try {
                    if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                        try {
                            MouseCursorChannel.this.mouseCursorMethodHandler.activateSystemCursor((String) ((HashMap) methodCall.arguments).get(C33612dh.f69618m));
                            result.success(Boolean.TRUE);
                        } catch (Exception e11) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Error when setting cursors: " + e11.getMessage(), null);
                        }
                    }
                } catch (Exception e12) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Unhandled error: " + e12.getMessage(), null);
                }
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/mousecursor", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }
}
