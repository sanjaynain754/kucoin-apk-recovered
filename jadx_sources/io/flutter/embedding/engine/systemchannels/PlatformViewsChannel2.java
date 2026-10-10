package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes60.dex */
public class PlatformViewsChannel2 {
    private static final String TAG = "PlatformViewsChannel2";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* JADX INFO: loaded from: classes23.dex */
    public interface PlatformViewsHandler {
        void clearFocus(int i11);

        void createPlatformView(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i11);

        boolean isSurfaceControlEnabled();

        void onTouch(@NonNull PlatformViewTouch platformViewTouch);

        void setDirection(int i11, int i12);
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalWidth;

        @Nullable
        public final ByteBuffer params;
        public final int viewId;

        @NonNull
        public final String viewType;

        public PlatformViewCreationRequest(int i11, @NonNull String str, double d11, double d12, int i12, @Nullable ByteBuffer byteBuffer) {
            this.viewId = i11;
            this.viewType = str;
            this.logicalWidth = d11;
            this.logicalHeight = d12;
            this.direction = i12;
            this.params = byteBuffer;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;

        @NonNull
        public final Number downTime;
        public final int edgeFlags;

        @NonNull
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;

        @NonNull
        public final Object rawPointerCoords;

        @NonNull
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i11, @NonNull Number number, @NonNull Number number2, int i12, int i13, @NonNull Object obj, @NonNull Object obj2, int i14, int i15, float f11, float f12, int i16, int i17, int i18, int i19, long j11) {
            this.viewId = i11;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i12;
            this.pointerCount = i13;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i14;
            this.buttonState = i15;
            this.xPrecision = f11;
            this.yPrecision = f12;
            this.deviceId = i16;
            this.edgeFlags = i17;
            this.source = i18;
            this.flags = i19;
            this.motionEventId = j11;
        }
    }

    public void invokeViewFocused(int i11) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", Integer.valueOf(i11));
    }

    public void setPlatformViewsHandler(@Nullable PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }

    public PlatformViewsChannel2(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.1
            private void isSurfaceControlEnabled(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                result.success(Boolean.valueOf(PlatformViewsChannel2.this.handler.isSurfaceControlEnabled()));
            }

            private void touch(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                List list = (List) methodCall.arguments();
                try {
                    PlatformViewsChannel2.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    result.success(null);
                } catch (IllegalStateException e11) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel2.detailedExceptionString(e11), null);
                }
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                if (PlatformViewsChannel2.this.handler == null) {
                }
                Log.m87481v(PlatformViewsChannel2.TAG, "Received '" + methodCall.method + "' message.");
                String str = methodCall.method;
                str.getClass();
                switch (str) {
                    case "create":
                        create(methodCall, result);
                        break;
                    case "clearFocus":
                        clearFocus(methodCall, result);
                        break;
                    case "touch":
                        touch(methodCall, result);
                        break;
                    case "setDirection":
                        setDirection(methodCall, result);
                        break;
                    case "isSurfaceControlEnabled":
                        isSurfaceControlEnabled(methodCall, result);
                        break;
                    case "dispose":
                        dispose(methodCall, result);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }

            private void clearFocus(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                try {
                    PlatformViewsChannel2.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success(null);
                } catch (IllegalStateException e11) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel2.detailedExceptionString(e11), null);
                }
            }

            private void create(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                ByteBuffer byteBufferWrap;
                Map map = (Map) methodCall.arguments();
                if (map.containsKey(ReportDataTable.COLUMN_PARAMS)) {
                    byteBufferWrap = ByteBuffer.wrap((byte[]) map.get(ReportDataTable.COLUMN_PARAMS));
                } else {
                    byteBufferWrap = null;
                }
                try {
                    PlatformViewsChannel2.this.handler.createPlatformView(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), byteBufferWrap));
                    result.success(null);
                } catch (IllegalStateException e11) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel2.detailedExceptionString(e11), null);
                }
            }

            private void dispose(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                try {
                    PlatformViewsChannel2.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                    result.success(null);
                } catch (IllegalStateException e11) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel2.detailedExceptionString(e11), null);
                }
            }

            private void setDirection(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel2.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                    result.success(null);
                } catch (IllegalStateException e11) {
                    result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel2.detailedExceptionString(e11), null);
                }
            }
        };
        this.parsingHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views_2", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }
}
