package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import d00.InterfaceC36563b0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import s80.C44365c;

/* JADX INFO: compiled from: NativeStorageTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J&\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u000eH\u0002J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u0007H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\"\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0007H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u001c\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J$\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u001c\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u0007H\u0002J$\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\u001e\u0010+\u001a\u00020**\u00020,2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0017H\u0002J\u0016\u0010-\u001a\u00020**\u00020.2\b\u0010\r\u001a\u0004\u0018\u00010\u0017H\u0002J\u001c\u0010/\u001a\u00020**\u00020,2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u000200H\u0002J\u0014\u00101\u001a\u00020**\u00020.2\u0006\u0010\r\u001a\u000200H\u0002J\u0014\u00102\u001a\u00020,*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0016H\u0002J\u0010\u00103\u001a\u00020.*\u0006\u0012\u0002\b\u000304H\u0002¨\u00066"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeStorageTurboModule;", "Lcom/kubi/rn/core/turbo/NativeStorageTurboModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "storageBridge", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiStorageModule;", "setItem", "Lcom/facebook/react/bridge/WritableMap;", "key", "value", "Lcom/facebook/react/bridge/ReadableMap;", Constants.BIZ, "getItem", "removeItem", "containsKey", "getAllKeys", "clear", "toNativeMap", "", "", "invalidReadableValueReason", "path", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "invalidJsonValueReason", "validateKey", FirebaseAnalytics.Param.METHOD, "validateBiz", "buildResult", "data", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/sdk/protocol/ProtocolException;", "bridgeNotFound", "errorResult", "message", "setItemFailedResult", "logCall", "", "putWritableValue", "Lcom/facebook/react/bridge/WritableNativeMap;", "pushWritableValue", "Lcom/facebook/react/bridge/WritableNativeArray;", "putJsonNumber", "", "pushJsonNumber", "toWritableNativeMap", "toWritableNativeArray", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeStorageTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeStorageTurboModule.kt\ncom/kubi/rn/core/turbo/NativeStorageTurboModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,412:1\n504#2,7:413\n463#2:420\n413#2:421\n1252#3,4:422\n1869#3,2:427\n1878#3,3:429\n1869#3,2:437\n1#4:426\n13537#5,3:432\n216#6,2:435\n*S KotlinDebug\n*F\n+ 1 NativeStorageTurboModule.kt\ncom/kubi/rn/core/turbo/NativeStorageTurboModule\n*L\n223#1:413,7\n224#1:420\n224#1:421\n224#1:422,4\n273#1:427,2\n279#1:429,3\n406#1:437,2\n285#1:432,3\n398#1:435,2\n*E\n"})
public final class NativeStorageTurboModule extends NativeStorageTurboModuleSpec {
    private static final int MAX_BIZ_LENGTH = 100;
    private static final int MAX_KEY_LENGTH = 100;
    private static final int MAX_VALUE_BYTES = 10485760;

    @NotNull
    public static final String NAME = "Storage";

    @NotNull
    private static final String SOURCE_RN = "rn";

    private final String invalidJsonValueReason(Object value, String path) {
        if (value == null) {
            return null;
        }
        if (value instanceof Double) {
            Number number = (Number) value;
            if (!Double.isNaN(number.doubleValue()) && !Double.isInfinite(number.doubleValue())) {
                return null;
            }
            return path + " 不是有效 JSON number";
        }
        if (value instanceof Float) {
            Number number2 = (Number) value;
            if (!Float.isNaN(number2.floatValue()) && !Float.isInfinite(number2.floatValue())) {
                return null;
            }
            return path + " 不是有效 JSON number";
        }
        if (value instanceof Map) {
            for (Map.Entry entry : ((Map) value).entrySet()) {
                Object key = entry.getKey();
                String strInvalidJsonValueReason = invalidJsonValueReason(entry.getValue(), path + '.' + key);
                if (strInvalidJsonValueReason != null) {
                    return strInvalidJsonValueReason;
                }
            }
            return null;
        }
        int i11 = 0;
        if (value instanceof List) {
            for (Object obj : (Iterable) value) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String strInvalidJsonValueReason2 = invalidJsonValueReason(obj, path + '[' + i11 + ']');
                if (strInvalidJsonValueReason2 != null) {
                    return strInvalidJsonValueReason2;
                }
                i11 = i12;
            }
            return null;
        }
        if (value instanceof Object[]) {
            Object[] objArr = (Object[]) value;
            int length = objArr.length;
            int i13 = 0;
            while (i11 < length) {
                int i14 = i13 + 1;
                String strInvalidJsonValueReason3 = invalidJsonValueReason(objArr[i11], path + '[' + i13 + ']');
                if (strInvalidJsonValueReason3 != null) {
                    return strInvalidJsonValueReason3;
                }
                i11++;
                i13 = i14;
            }
        }
        return null;
    }

    private final String invalidReadableValueReason(ReadableMap value, String path) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = value.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            String strInvalidReadableValueReason = invalidReadableValueReason(value, strNextKey, path + '.' + strNextKey);
            if (strInvalidReadableValueReason != null) {
                return strInvalidReadableValueReason;
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: NativeStorageTurboModule.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeStorageTurboModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    private final WritableMap bridgeNotFound(String method) {
        C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=" + method + ", message=storage bridge service not found");
        return errorResult$default(this, "storage bridge service not found", null, 2, null);
    }

    private final WritableMap buildResult(String method, Object data, ProtocolException error) {
        String simpleName;
        String str = "";
        if (error == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Turbo success method=");
            sb2.append(method);
            sb2.append(", resultType=");
            simpleName = data != null ? data.getClass().getSimpleName() : null;
            sb2.append(simpleName != null ? simpleName : "");
            C44128b.m97266j("KCJsBridgeStorage", sb2.toString());
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putInt("code", 0);
            writableNativeMap.putBoolean("success", true);
            writableNativeMap.putString("msg", "success");
            putWritableValue(writableNativeMap, "data", data);
            return writableNativeMap;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Turbo failed method=");
        sb3.append(method);
        sb3.append(", code=");
        sb3.append(error.getCode());
        sb3.append(", data=");
        sb3.append(error.getData());
        sb3.append(", message=");
        Throwable throwable = error.getThrowable();
        String message = throwable != null ? throwable.getMessage() : null;
        if (message == null) {
            message = "";
        }
        sb3.append(message);
        C44128b.m97266j("KCJsBridgeStorage", sb3.toString());
        String code = error.getCode();
        if (code == null) {
            Throwable throwable2 = error.getThrowable();
            simpleName = throwable2 != null ? throwable2.getMessage() : null;
            if (simpleName != null) {
                str = simpleName;
            }
        } else {
            str = code;
        }
        return errorResult(str, error.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit clear$lambda$20(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        objectRef.element = protocolException;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit containsKey$lambda$16(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        objectRef.element = protocolException;
        return Unit.INSTANCE;
    }

    private final WritableMap errorResult(String message, Object data) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("code", -1);
        writableNativeMap.putBoolean("success", false);
        writableNativeMap.putString("msg", message);
        putWritableValue(writableNativeMap, "data", data);
        return writableNativeMap;
    }

    public static /* synthetic */ WritableMap errorResult$default(NativeStorageTurboModule nativeStorageTurboModule, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return nativeStorageTurboModule.errorResult(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getAllKeys$lambda$18(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, List list, ProtocolException protocolException) {
        T tEmptyList = list;
        if (list == null) {
            tEmptyList = CollectionsKt.emptyList();
        }
        objectRef.element = tEmptyList;
        objectRef2.element = protocolException;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getItem$lambda$10(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Object obj, ProtocolException protocolException) {
        objectRef.element = obj instanceof Map ? (Map) obj : 0;
        objectRef2.element = protocolException;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String invalidJsonValueReason$default(NativeStorageTurboModule nativeStorageTurboModule, Object obj, String str, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = "value";
        }
        return nativeStorageTurboModule.invalidJsonValueReason(obj, str);
    }

    public static /* synthetic */ String invalidReadableValueReason$default(NativeStorageTurboModule nativeStorageTurboModule, ReadableMap readableMap, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "value";
        }
        return nativeStorageTurboModule.invalidReadableValueReason(readableMap, str);
    }

    private final void logCall(String method, String key, String biz) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Turbo call method=");
        sb2.append(method);
        sb2.append(", biz=");
        if (biz == null) {
            biz = "";
        }
        sb2.append(biz);
        sb2.append(", key=");
        if (key == null) {
            key = "";
        }
        sb2.append(key);
        C44128b.m97266j("KCJsBridgeStorage", sb2.toString());
    }

    private final void pushWritableValue(WritableNativeArray writableNativeArray, Object obj) {
        if (obj == null) {
            writableNativeArray.pushNull();
            return;
        }
        if (obj instanceof Boolean) {
            writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableNativeArray.pushString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableNativeArray.pushInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableNativeArray.pushDouble(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            pushJsonNumber(writableNativeArray, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            pushJsonNumber(writableNativeArray, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Map) {
            writableNativeArray.pushMap(toWritableNativeMap((Map) obj));
            return;
        }
        if (obj instanceof List) {
            writableNativeArray.pushArray(toWritableNativeArray((List) obj));
        } else if (obj instanceof Object[]) {
            writableNativeArray.pushArray(toWritableNativeArray(ArraysKt.toList((Object[]) obj)));
        } else {
            writableNativeArray.pushString(obj.toString());
        }
    }

    private final void putWritableValue(WritableNativeMap writableNativeMap, String str, Object obj) {
        if (obj == null) {
            writableNativeMap.putNull(str);
            return;
        }
        if (obj instanceof Boolean) {
            writableNativeMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            writableNativeMap.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            writableNativeMap.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            writableNativeMap.putDouble(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            putJsonNumber(writableNativeMap, str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            putJsonNumber(writableNativeMap, str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Map) {
            writableNativeMap.putMap(str, toWritableNativeMap((Map) obj));
            return;
        }
        if (obj instanceof List) {
            writableNativeMap.putArray(str, toWritableNativeArray((List) obj));
        } else if (obj instanceof Object[]) {
            writableNativeMap.putArray(str, toWritableNativeArray(ArraysKt.toList((Object[]) obj)));
        } else {
            writableNativeMap.putString(str, obj.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit removeItem$lambda$13(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        objectRef.element = protocolException;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit setItem$lambda$6$lambda$5(Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Boolean bool, ProtocolException protocolException) {
        booleanRef.element = Intrinsics.areEqual(bool, Boolean.TRUE);
        objectRef.element = protocolException;
        return Unit.INSTANCE;
    }

    private final WritableMap setItemFailedResult(String message) {
        return errorResult(message, Boolean.FALSE);
    }

    private final InterfaceC36563b0 storageBridge() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((InterfaceC36563b0) Router.f46192a.m56192n(InterfaceC36563b0.class));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (InterfaceC36563b0) objM103844constructorimpl;
    }

    private final WritableNativeArray toWritableNativeArray(List<?> list) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            pushWritableValue(writableNativeArray, it.next());
        }
        return writableNativeArray;
    }

    private final WritableNativeMap toWritableNativeMap(Map<?, ?> map) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            putWritableValue(writableNativeMap, String.valueOf(key), entry.getValue());
        }
        return writableNativeMap;
    }

    private final String validateBiz(String method, String biz) {
        if (biz == null || biz.length() <= 100) {
            return null;
        }
        return method + ": biz参数不能超过100个字符";
    }

    private final String validateKey(String method, String key) {
        if (key == null || StringsKt.isBlank(key)) {
            return method + ": key参数不能为空";
        }
        if (key.length() <= 100) {
            return null;
        }
        return method + ": key参数不能超过100个字符";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap clear(@Nullable String biz) {
        logCall("clear", null, biz);
        String strValidateBiz = validateBiz("clear", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=clear, message=" + strValidateBiz);
            return errorResult$default(this, strValidateBiz, null, 2, null);
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("clear");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36563b0StorageBridge.mo31836f(reactApplicationContext, null, "rn", biz, new Function2() { // from class: com.kubi.rn.core.turbo.e4
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeStorageTurboModule.clear$lambda$20(booleanRef, objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return buildResult("clear", Boolean.valueOf(booleanRef.element), (ProtocolException) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap containsKey(@Nullable String key, @Nullable String biz) {
        logCall("containsKey", key, biz);
        String strValidateKey = validateKey("containsKey", key);
        if (strValidateKey != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=containsKey, message=" + strValidateKey);
            return errorResult$default(this, strValidateKey, null, 2, null);
        }
        String strValidateBiz = validateBiz("containsKey", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=containsKey, message=" + strValidateBiz);
            return errorResult$default(this, strValidateBiz, null, 2, null);
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("containsKey");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (key == null) {
            key = "";
        }
        interfaceC36563b0StorageBridge.mo31833c(reactApplicationContext, null, "rn", key, biz, new Function2() { // from class: com.kubi.rn.core.turbo.d4
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeStorageTurboModule.containsKey$lambda$16(booleanRef, objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return buildResult("containsKey", Boolean.valueOf(booleanRef.element), (ProtocolException) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.List] */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap getAllKeys(@Nullable String biz) {
        logCall("getAllKeys", null, biz);
        String strValidateBiz = validateBiz("getAllKeys", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=getAllKeys, message=" + strValidateBiz);
            return errorResult$default(this, strValidateBiz, null, 2, null);
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("getAllKeys");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = CollectionsKt.emptyList();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        interfaceC36563b0StorageBridge.mo31831a(reactApplicationContext, null, "rn", biz, new Function2() { // from class: com.kubi.rn.core.turbo.b4
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeStorageTurboModule.getAllKeys$lambda$18(objectRef, objectRef2, (List) obj, (ProtocolException) obj2);
            }
        });
        return buildResult("getAllKeys", objectRef.element, (ProtocolException) objectRef2.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap getItem(@Nullable String key, @Nullable String biz) {
        logCall("getItem", key, biz);
        String strValidateKey = validateKey("getItem", key);
        if (strValidateKey != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=getItem, message=" + strValidateKey);
            return errorResult$default(this, strValidateKey, null, 2, null);
        }
        String strValidateBiz = validateBiz("getItem", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=getItem, message=" + strValidateBiz);
            return errorResult$default(this, strValidateBiz, null, 2, null);
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("getItem");
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (key == null) {
            key = "";
        }
        interfaceC36563b0StorageBridge.mo31834d(reactApplicationContext, null, "rn", key, biz, new Function2() { // from class: com.kubi.rn.core.turbo.a4
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeStorageTurboModule.getItem$lambda$10(objectRef, objectRef2, obj, (ProtocolException) obj2);
            }
        });
        return buildResult("getItem", C44365c.f98029a.m97862b("Storage", "getItem", objectRef.element), (ProtocolException) objectRef2.element);
    }

    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "Storage";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap removeItem(@Nullable String key, @Nullable String biz) {
        logCall("removeItem", key, biz);
        String strValidateKey = validateKey("removeItem", key);
        if (strValidateKey != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=removeItem, message=" + strValidateKey);
            return errorResult$default(this, strValidateKey, null, 2, null);
        }
        String strValidateBiz = validateBiz("removeItem", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=removeItem, message=" + strValidateBiz);
            return errorResult$default(this, strValidateBiz, null, 2, null);
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("removeItem");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (key == null) {
            key = "";
        }
        interfaceC36563b0StorageBridge.mo31835e(reactApplicationContext, null, "rn", key, biz, new Function2() { // from class: com.kubi.rn.core.turbo.c4
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NativeStorageTurboModule.removeItem$lambda$13(booleanRef, objectRef, (Boolean) obj, (ProtocolException) obj2);
            }
        });
        return buildResult("removeItem", Boolean.valueOf(booleanRef.element), (ProtocolException) objectRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.p110rn.core.turbo.NativeStorageTurboModuleSpec
    @NotNull
    public WritableMap setItem(@Nullable String key, @Nullable ReadableMap value, @Nullable String biz) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        logCall("setItem", key, biz);
        String strValidateKey = validateKey("setItem", key);
        if (strValidateKey != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + strValidateKey);
            return setItemFailedResult(strValidateKey);
        }
        String strValidateBiz = validateBiz("setItem", biz);
        if (strValidateBiz != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + strValidateBiz);
            return setItemFailedResult(strValidateBiz);
        }
        if (value == null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=value参数不能为空");
            return setItemFailedResult("value参数不能为空");
        }
        InterfaceC36563b0 interfaceC36563b0StorageBridge = storageBridge();
        if (interfaceC36563b0StorageBridge == null) {
            return bridgeNotFound("setItem");
        }
        String strInvalidReadableValueReason$default = invalidReadableValueReason$default(this, value, null, 2, null);
        if (strInvalidReadableValueReason$default != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + strInvalidReadableValueReason$default);
            return setItemFailedResult(strInvalidReadableValueReason$default);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(toNativeMap(value));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            String message = thM103847exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "value参数类型异常";
            }
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + message);
            return setItemFailedResult(message);
        }
        Map map = (Map) objM103844constructorimpl;
        String strInvalidJsonValueReason$default = invalidJsonValueReason$default(this, map, null, 2, null);
        if (strInvalidJsonValueReason$default != null) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + strInvalidJsonValueReason$default);
            return setItemFailedResult(strInvalidJsonValueReason$default);
        }
        byte[] bytes = C27099x.m66919i(map, false, 2, null).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 10485760) {
            C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=value参数不能超过2KB");
            return setItemFailedResult("value参数不能超过2KB");
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            if (key == null) {
                key = "";
            }
            interfaceC36563b0StorageBridge.mo31832b(reactApplicationContext, null, "rn", key, map, biz, new Function2() { // from class: com.kubi.rn.core.turbo.f4
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NativeStorageTurboModule.setItem$lambda$6$lambda$5(booleanRef, objectRef, (Boolean) obj, (ProtocolException) obj2);
                }
            });
            objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
        if (thM103847exceptionOrNullimpl2 == null) {
            return buildResult("setItem", Boolean.valueOf(booleanRef.element), (ProtocolException) objectRef.element);
        }
        String message2 = thM103847exceptionOrNullimpl2.getMessage();
        if (message2 == null) {
            message2 = "setItem执行异常";
        }
        C44128b.m97266j("KCJsBridgeStorage", "Turbo failed method=setItem, message=" + message2);
        return setItemFailedResult(message2);
    }

    private final void pushJsonNumber(WritableNativeArray writableNativeArray, double d11) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            writableNativeArray.pushDouble(d11);
        } else {
            writableNativeArray.pushNull();
        }
    }

    private final void putJsonNumber(WritableNativeMap writableNativeMap, String str, double d11) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            writableNativeMap.putDouble(str, d11);
        } else {
            writableNativeMap.putNull(str);
        }
    }

    private final Map<String, Object> toNativeMap(ReadableMap readableMap) {
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.checkNotNull(value);
            linkedHashMap2.put(key, value);
        }
        return linkedHashMap2;
    }

    private final String invalidReadableValueReason(ReadableArray value, String path) {
        int size = value.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strInvalidReadableValueReason = invalidReadableValueReason(value, i11, path + '[' + i11 + ']');
            if (strInvalidReadableValueReason != null) {
                return strInvalidReadableValueReason;
            }
        }
        return null;
    }

    private final String invalidReadableValueReason(ReadableMap value, String key, String path) {
        ReadableArray array;
        int i11 = WhenMappings.$EnumSwitchMapping$0[value.getType(key).ordinal()];
        if (i11 == 1) {
            double d11 = value.getDouble(key);
            if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
                return null;
            }
            return path + " 不是有效 JSON number";
        }
        if (i11 != 2) {
            if (i11 == 3 && (array = value.getArray(key)) != null) {
                return invalidReadableValueReason(array, path);
            }
            return null;
        }
        ReadableMap map = value.getMap(key);
        if (map != null) {
            return invalidReadableValueReason(map, path);
        }
        return null;
    }

    private final String invalidReadableValueReason(ReadableArray value, int index, String path) {
        ReadableArray array;
        int i11 = WhenMappings.$EnumSwitchMapping$0[value.getType(index).ordinal()];
        if (i11 == 1) {
            double d11 = value.getDouble(index);
            if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
                return null;
            }
            return path + " 不是有效 JSON number";
        }
        if (i11 != 2) {
            if (i11 == 3 && (array = value.getArray(index)) != null) {
                return invalidReadableValueReason(array, path);
            }
            return null;
        }
        ReadableMap map = value.getMap(index);
        if (map != null) {
            return invalidReadableValueReason(map, path);
        }
        return null;
    }
}
