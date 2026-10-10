package com.kubi.p110rn.core.turbo;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KNBTurboUtils.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/KNBTurboUtils;", "", "<init>", "()V", "wrapResult", "Lcom/facebook/react/bridge/WritableMap;", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Ljava/lang/Object;)Lcom/facebook/react/bridge/WritableMap;", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKNBTurboUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KNBTurboUtils.kt\ncom/kubi/rn/core/turbo/KNBTurboUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1863#2,2:47\n*S KotlinDebug\n*F\n+ 1 KNBTurboUtils.kt\ncom/kubi/rn/core/turbo/KNBTurboUtils\n*L\n24#1:47,2\n*E\n"})
public final class KNBTurboUtils {

    @NotNull
    public static final KNBTurboUtils INSTANCE = new KNBTurboUtils();

    private KNBTurboUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> WritableMap wrapResult(@Nullable T data) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("code", 0);
        if (data == 0) {
            writableMapCreateMap.putNull("data");
        } else if (data instanceof Boolean) {
            writableMapCreateMap.putBoolean("data", ((Boolean) data).booleanValue());
        } else if (data instanceof Integer) {
            writableMapCreateMap.putInt("data", ((Number) data).intValue());
        } else if (data instanceof Double) {
            writableMapCreateMap.putDouble("data", ((Number) data).doubleValue());
        } else if (data instanceof String) {
            writableMapCreateMap.putString("data", (String) data);
        } else if (data instanceof List) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (T t11 : (Iterable) data) {
                if (t11 == null) {
                    writableArrayCreateArray.pushNull();
                } else if (t11 instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) t11).booleanValue());
                } else if (t11 instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Number) t11).intValue());
                } else if (t11 instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Number) t11).doubleValue());
                } else if (t11 instanceof String) {
                    writableArrayCreateArray.pushString((String) t11);
                } else if (t11 instanceof WritableMapSerializable) {
                    writableArrayCreateArray.pushMap(((WritableMapSerializable) t11).toWritableMap());
                } else if (t11 instanceof WritableMap) {
                    writableArrayCreateArray.pushMap((ReadableMap) t11);
                } else {
                    writableArrayCreateArray.pushString(t11.toString());
                }
            }
            writableMapCreateMap.putArray("data", writableArrayCreateArray);
        } else if (data instanceof WritableMapSerializable) {
            writableMapCreateMap.putMap("data", ((WritableMapSerializable) data).toWritableMap());
        } else if (data instanceof WritableMap) {
            writableMapCreateMap.putMap("data", (ReadableMap) data);
        } else if (data instanceof ReadableMap) {
            writableMapCreateMap.putMap("data", Arguments.makeNativeMap(((ReadableMap) data).toHashMap()));
        } else {
            writableMapCreateMap.putString("data", data.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
