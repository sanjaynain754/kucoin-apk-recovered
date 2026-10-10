package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.firebase.messaging.Constants;
import io.flutter.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes23.dex */
public class MethodChannel {
    private static final String TAG = "MethodChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;
    private final BinaryMessenger.TaskQueue taskQueue;

    public final class IncomingMethodCallHandler implements BinaryMessenger.BinaryMessageHandler {
        private final MethodCallHandler handler;

        public IncomingMethodCallHandler(MethodCallHandler methodCallHandler) {
            this.handler = methodCallHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        @UiThread
        public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMethodCall(MethodChannel.this.codec.decodeMethodCall(byteBuffer), new Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(String str, String str2, Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        binaryReply.reply(null);
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(Object obj) {
                        binaryReply.reply(MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                    }
                });
            } catch (RuntimeException e11) {
                Log.m87478e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call", e11);
                binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11.getMessage(), null, Log.getStackTraceString(e11)));
            }
        }
    }

    public final class IncomingResultHandler implements BinaryMessenger.BinaryReply {
        private final Result callback;

        public IncomingResultHandler(Result result) {
            this.callback = result;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        @UiThread
        public void reply(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.callback.notImplemented();
                } else {
                    try {
                        this.callback.success(MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                    } catch (FlutterException e11) {
                        this.callback.error(e11.code, e11.getMessage(), e11.details);
                    }
                }
            } catch (RuntimeException e12) {
                Log.m87478e(MethodChannel.TAG + MethodChannel.this.name, "Failed to handle method call result", e12);
            }
        }
    }

    public interface MethodCallHandler {
        @UiThread
        void onMethodCall(@NonNull MethodCall methodCall, @NonNull Result result);
    }

    public interface Result {
        void error(@NonNull String str, @Nullable String str2, @Nullable Object obj);

        void notImplemented();

        void success(@Nullable Object obj);
    }

    public MethodChannel(@NonNull BinaryMessenger binaryMessenger, @NonNull String str) {
        this(binaryMessenger, str, StandardMethodCodec.INSTANCE);
    }

    @UiThread
    public void invokeMethod(@NonNull String str, @Nullable Object obj) {
        invokeMethod(str, obj, null);
    }

    public MethodChannel(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @NonNull MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    @UiThread
    public void invokeMethod(@NonNull String str, @Nullable Object obj, @Nullable Result result) {
        this.messenger.send(this.name, this.codec.encodeMethodCall(new MethodCall(str, obj)), result == null ? null : new IncomingResultHandler(result));
    }

    public void resizeChannelBuffer(int i11) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i11);
    }

    @UiThread
    public void setMethodCallHandler(@Nullable MethodCallHandler methodCallHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new IncomingMethodCallHandler(methodCallHandler) : null);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z11) {
        BasicMessageChannel.setWarnsOnChannelOverflow(this.messenger, this.name, z11);
    }

    public MethodChannel(@NonNull BinaryMessenger binaryMessenger, @NonNull String str, @NonNull MethodCodec methodCodec, @Nullable BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }
}
