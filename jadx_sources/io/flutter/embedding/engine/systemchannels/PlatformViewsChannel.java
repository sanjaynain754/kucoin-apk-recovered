package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* JADX INFO: renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1 */
    public class C387791 implements MethodChannel.MethodCallHandler {
        public C387791() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m87519a(MethodChannel.Result result, PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Failed to resize the platform view", null);
                return;
            }
            HashMap map = new HashMap();
            map.put("width", Double.valueOf(platformViewBufferSize.width));
            map.put("height", Double.valueOf(platformViewBufferSize.height));
            result.success(map);
        }

        private void create(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            boolean z11 = false;
            boolean z12 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer byteBufferWrap = map.containsKey(ReportDataTable.COLUMN_PARAMS) ? ByteBuffer.wrap((byte[]) map.get(ReportDataTable.COLUMN_PARAMS)) : null;
            try {
                if (z12) {
                    PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, byteBufferWrap));
                    result.success(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z11 = true;
                }
                long jCreateForTextureLayer = PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey(ViewProps.TOP) ? ((Double) map.get(ViewProps.TOP)).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z11 ? PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBufferWrap));
                if (jCreateForTextureLayer != -2) {
                    result.success(Long.valueOf(jCreateForTextureLayer));
                } else {
                    if (!z11) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    result.success(null);
                }
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void touch(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            List list = (List) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            if (PlatformViewsChannel.this.handler == null) {
            }
            Log.m87481v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
            String str = methodCall.method;
            str.getClass();
            switch (str) {
                case "create":
                    create(methodCall, result);
                    break;
                case "offset":
                    offset(methodCall, result);
                    break;
                case "resize":
                    resize(methodCall, result);
                    break;
                case "clearFocus":
                    clearFocus(methodCall, result);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    synchronizeToNativeViewHierarchy(methodCall, result);
                    break;
                case "touch":
                    touch(methodCall, result);
                    break;
                case "setDirection":
                    setDirection(methodCall, result);
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
                PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void dispose(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void offset(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get(ViewProps.TOP)).doubleValue(), ((Double) map.get("left")).doubleValue());
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void resize(@NonNull MethodCall methodCall, @NonNull final MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.f
                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
                    public final void run(PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
                        PlatformViewsChannel.C387791.m87519a(result, platformViewBufferSize);
                    }
                });
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void setDirection(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            Map map = (Map) methodCall.arguments();
            try {
                PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }

        private void synchronizeToNativeViewHierarchy(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
            try {
                PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                result.success(null);
            } catch (IllegalStateException e11) {
                result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, PlatformViewsChannel.detailedExceptionString(e11), null);
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public interface PlatformViewBufferResized {
        void run(@Nullable PlatformViewBufferSize platformViewBufferSize);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class PlatformViewCreationRequest {
        public final int direction;
        public final RequestedDisplayMode displayMode;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;

        @Nullable
        public final ByteBuffer params;
        public final int viewId;

        @NonNull
        public final String viewType;

        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i11, @NonNull String str, double d11, double d12, double d13, double d14, int i12, @Nullable ByteBuffer byteBuffer) {
            this(i11, str, d11, d12, d13, d14, i12, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }

        public PlatformViewCreationRequest(int i11, @NonNull String str, double d11, double d12, double d13, double d14, int i12, RequestedDisplayMode requestedDisplayMode, @Nullable ByteBuffer byteBuffer) {
            this.viewId = i11;
            this.viewType = str;
            this.logicalTop = d11;
            this.logicalLeft = d12;
            this.logicalWidth = d13;
            this.logicalHeight = d14;
            this.direction = i12;
            this.displayMode = requestedDisplayMode;
            this.params = byteBuffer;
        }
    }

    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i11);

        void createForPlatformViewLayer(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i11);

        void offset(int i11, double d11, double d12);

        void onTouch(@NonNull PlatformViewTouch platformViewTouch);

        void resize(@NonNull PlatformViewResizeRequest platformViewResizeRequest, @NonNull PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i11, int i12);

        void synchronizeToNativeViewHierarchy(boolean z11);
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i11, double d11, double d12) {
            this.viewId = i11;
            this.newLogicalWidth = d11;
            this.newLogicalHeight = d12;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
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

    public PlatformViewsChannel(@NonNull DartExecutor dartExecutor) {
        C387791 c387791 = new C387791();
        this.parsingHandler = c387791;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(c387791);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }
}
