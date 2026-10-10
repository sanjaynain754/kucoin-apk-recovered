package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.google.firebase.messaging.Constants;
import com.horcrux.svg.events.SvgLoadEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageLoadEvent.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\u0016Ba\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewId", "eventType", "errorMessage", "", "sourceUri", "width", "height", "loaded", "total", "<init>", "(IIILjava/lang/String;Ljava/lang/String;IIII)V", "getEventName", "getCoalescingKey", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "createEventDataSource", "ImageEventType", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageLoadEvent extends Event<ImageLoadEvent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ON_ERROR = 1;
    public static final int ON_LOAD = 2;
    public static final int ON_LOAD_END = 3;
    public static final int ON_LOAD_START = 4;
    public static final int ON_PROGRESS = 5;

    @Nullable
    private final String errorMessage;
    private final int eventType;
    private final int height;
    private final int loaded;

    @Nullable
    private final String sourceUri;
    private final int total;
    private final int width;

    /* JADX INFO: compiled from: ImageLoadEvent.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J*\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J*\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J2\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J2\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0007J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent$Companion;", "", "<init>", "()V", "ON_ERROR", "", "ON_LOAD", "ON_LOAD_END", "ON_LOAD_START", "ON_PROGRESS", "createLoadStartEvent", "Lcom/facebook/react/views/image/ImageLoadEvent;", "viewId", "createProgressEvent", "imageUri", "", "loaded", "total", "createLoadEvent", "width", "height", "createErrorEvent", "throwable", "", "createLoadEndEvent", "surfaceId", "eventNameForType", "eventType", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use the createErrorEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createErrorEvent(surfaceId, viewId, throwable)", imports = {}))
        @JvmStatic
        @NotNull
        public final ImageLoadEvent createErrorEvent(int viewId, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return createErrorEvent(-1, viewId, throwable);
        }

        @Deprecated(message = "Use the createLoadEndEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadEndEvent(surfaceId, viewId)", imports = {}))
        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadEndEvent(int viewId) {
            return createLoadEndEvent(-1, viewId);
        }

        @Deprecated(message = "Use the createLoadEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadEvent(surfaceId, viewId, imageUri, width, height)", imports = {}))
        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadEvent(int viewId, @Nullable String imageUri, int width, int height) {
            return createLoadEvent(-1, viewId, imageUri, width, height);
        }

        @Deprecated(message = "Use the createLoadStartEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadStartEvent(surfaceId, viewId)", imports = {}))
        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadStartEvent(int viewId) {
            return createLoadStartEvent(-1, viewId);
        }

        @Deprecated(message = "Use the createProgressEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createProgressEvent(surfaceId, viewId, imageUri, loaded, total)", imports = {}))
        @JvmStatic
        @NotNull
        public final ImageLoadEvent createProgressEvent(int viewId, @Nullable String imageUri, int loaded, int total) {
            return createProgressEvent(-1, viewId, imageUri, loaded, total);
        }

        @JvmStatic
        @NotNull
        public final String eventNameForType(int eventType) {
            if (eventType == 1) {
                return "topError";
            }
            if (eventType == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (eventType == 3) {
                return "topLoadEnd";
            }
            if (eventType == 4) {
                return "topLoadStart";
            }
            if (eventType == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + eventType).toString());
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final ImageLoadEvent createErrorEvent(int surfaceId, int viewId, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ImageLoadEvent(surfaceId, viewId, 1, throwable.getMessage(), null, 0, 0, 0, 0, null);
        }

        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadEndEvent(int surfaceId, int viewId) {
            return new ImageLoadEvent(surfaceId, viewId, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadEvent(int surfaceId, int viewId, @Nullable String imageUri, int width, int height) {
            return new ImageLoadEvent(surfaceId, viewId, 2, null, imageUri, width, height, 0, 0, null);
        }

        @JvmStatic
        @NotNull
        public final ImageLoadEvent createLoadStartEvent(int surfaceId, int viewId) {
            return new ImageLoadEvent(surfaceId, viewId, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        @JvmStatic
        @NotNull
        public final ImageLoadEvent createProgressEvent(int surfaceId, int viewId, @Nullable String imageUri, int loaded, int total) {
            return new ImageLoadEvent(surfaceId, viewId, 5, null, imageUri, 0, 0, loaded, total, null);
        }
    }

    /* JADX INFO: compiled from: ImageLoadEvent.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lcom/facebook/react/views/image/ImageLoadEvent$ImageEventType;", "", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface ImageEventType {
    }

    public /* synthetic */ ImageLoadEvent(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, str, str2, i14, i15, i16, i17);
    }

    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createErrorEvent(int i11, int i12, @NotNull Throwable th2) {
        return INSTANCE.createErrorEvent(i11, i12, th2);
    }

    @Deprecated(message = "Use the createLoadEndEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadEndEvent(surfaceId, viewId)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadEndEvent(int i11) {
        return INSTANCE.createLoadEndEvent(i11);
    }

    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadEvent(int i11, int i12, @Nullable String str, int i13, int i14) {
        return INSTANCE.createLoadEvent(i11, i12, str, i13, i14);
    }

    @Deprecated(message = "Use the createLoadStartEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadStartEvent(surfaceId, viewId)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadStartEvent(int i11) {
        return INSTANCE.createLoadStartEvent(i11);
    }

    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createProgressEvent(int i11, int i12, @Nullable String str, int i13, int i14) {
        return INSTANCE.createProgressEvent(i11, i12, str, i13, i14);
    }

    public /* synthetic */ ImageLoadEvent(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, i13, (i18 & 8) != 0 ? null : str, (i18 & 16) != 0 ? null : str2, (i18 & 32) != 0 ? 0 : i14, (i18 & 64) != 0 ? 0 : i15, (i18 & 128) != 0 ? 0 : i16, (i18 & 256) != 0 ? 0 : i17);
    }

    @Deprecated(message = "Use the createErrorEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createErrorEvent(surfaceId, viewId, throwable)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createErrorEvent(int i11, @NotNull Throwable th2) {
        return INSTANCE.createErrorEvent(i11, th2);
    }

    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadEndEvent(int i11, int i12) {
        return INSTANCE.createLoadEndEvent(i11, i12);
    }

    @Deprecated(message = "Use the createLoadEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createLoadEvent(surfaceId, viewId, imageUri, width, height)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadEvent(int i11, @Nullable String str, int i12, int i13) {
        return INSTANCE.createLoadEvent(i11, str, i12, i13);
    }

    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createLoadStartEvent(int i11, int i12) {
        return INSTANCE.createLoadStartEvent(i11, i12);
    }

    @Deprecated(message = "Use the createProgressEvent version that explicitly takes surfaceId as an argument", replaceWith = @ReplaceWith(expression = "createProgressEvent(surfaceId, viewId, imageUri, loaded, total)", imports = {}))
    @JvmStatic
    @NotNull
    public static final ImageLoadEvent createProgressEvent(int i11, @Nullable String str, int i12, int i13) {
        return INSTANCE.createProgressEvent(i11, str, i12, i13);
    }

    @JvmStatic
    @NotNull
    public static final String eventNameForType(int i11) {
        return INSTANCE.eventNameForType(i11);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) this.eventType;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        return INSTANCE.eventNameForType(this.eventType);
    }

    private ImageLoadEvent(int i11, int i12, int i13, String str, String str2, int i14, int i15, int i16, int i17) {
        super(i11, i12);
        this.eventType = i13;
        this.errorMessage = str;
        this.sourceUri = str2;
        this.width = i14;
        this.height = i15;
        this.loaded = i16;
        this.total = i17;
    }

    private final WritableMap createEventDataSource() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.sourceUri);
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Nullable
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i11 = this.eventType;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 5) {
                    return writableMapCreateMap;
                }
                writableMapCreateMap.putInt("loaded", this.loaded);
                writableMapCreateMap.putInt("total", this.total);
                writableMapCreateMap.putDouble("progress", ((double) this.loaded) / ((double) this.total));
                return writableMapCreateMap;
            }
            writableMapCreateMap.putMap("source", createEventDataSource());
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString(Constants.IPC_BUNDLE_KEY_SEND_ERROR, this.errorMessage);
        return writableMapCreateMap;
    }
}
