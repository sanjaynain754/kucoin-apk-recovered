package s80;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.p110rn.Constants;
import com.kubi.utils.C27099x;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: s80.c */
/* JADX INFO: compiled from: StorageJsApiCompat.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005J$\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001J6\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001cJ\"\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001J\u001a\u0010\u001f\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001cJ\u0010\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0001H\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/widget/web/jsbridge/StorageJsApiCompat;", "", "<init>", "()V", "LOG_TAG", "", "MODULE", "SET_ITEM", "GET_ITEM", "REMOVE_ITEM", "CONTAINS_KEY", "VALUE", "KEY", "BIZ", "VALUE_ENCODED", "VALUE_TYPE", "VALUE_DATA", "MAX_KEY_LENGTH", "", "MAX_BIZ_LENGTH", "MAX_VALUE_BYTES", "isStorage", "", "module", "validateParam", FirebaseAnalytics.Param.METHOD, "arguments", "encodeParam", "", "decodeResult", DbParams.KEY_CHANNEL_RESULT, "formatArgTypes", "valueType", "value", "valueSizeInBytes", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44365c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44365c f98029a = new C44365c();

    /* JADX INFO: renamed from: e */
    public static final CharSequence m97861e(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        return ((String) entry.getKey()) + '=' + entry.getValue().getClass().getSimpleName();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m97864d(@NotNull Map<String, ? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return CollectionsKt.joinToString$default(arguments.entrySet(), null, "[", "]", 0, null, new Function1() { // from class: s80.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C44365c.m97861e((Map.Entry) obj);
            }
        }, 25, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m97865f(@Nullable String str) {
        return Intrinsics.areEqual(str, "Storage");
    }

    /* JADX INFO: renamed from: h */
    public final int m97867h(Object obj) {
        byte[] bytes = (obj instanceof String ? (String) obj : C27099x.m66919i(obj, false, 2, null)).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes.length;
    }

    /* JADX INFO: renamed from: i */
    public final String m97868i(Object obj) {
        if (obj instanceof String) {
            return TypedValues.Custom.S_STRING;
        }
        if (obj instanceof Number) {
            return "number";
        }
        if (obj instanceof Boolean) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (obj instanceof Map) {
            return "map";
        }
        if ((obj instanceof List) || (obj instanceof Object[])) {
            return "array";
        }
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m97862b(@NotNull String module, @NotNull String method, @Nullable Object obj) {
        Map map;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        if (m97865f(module) && Intrinsics.areEqual(method, "getItem")) {
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null && Intrinsics.areEqual(map.get("__kc_storage_value_encoded"), Boolean.TRUE) && map.containsKey("__kc_storage_value_data")) {
                return map.get("__kc_storage_value_data");
            }
        }
        return obj;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m97863c(@NotNull String module, @NotNull String method, @NotNull Map<String, ? extends Object> arguments) {
        Object obj;
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!m97865f(module) || !Intrinsics.areEqual(method, "setItem") || !arguments.containsKey("value") || (obj = arguments.get("value")) == null) {
            return arguments;
        }
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to("__kc_storage_value_encoded", Boolean.TRUE), TuplesKt.m90091to("__kc_storage_value_type", m97868i(obj)), TuplesKt.m90091to("__kc_storage_value_data", obj));
        Map<String, Object> mutableMap = MapsKt.toMutableMap(arguments);
        mutableMap.put("value", mapMapOf);
        return mutableMap;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m97866g(@Nullable String str, @NotNull String method, @Nullable Object obj) {
        Map mapEmptyMap;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(method, "method");
        if (!m97865f(str)) {
            return null;
        }
        if (obj instanceof Map) {
            mapEmptyMap = (Map) obj;
        } else {
            mapEmptyMap = null;
        }
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        if (SetsKt.setOf((Object[]) new String[]{"setItem", "getItem", "removeItem", "containsKey"}).contains(method)) {
            Object obj2 = mapEmptyMap.get("key");
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            } else {
                str3 = null;
            }
            if (str3 != null && !StringsKt.isBlank(str3)) {
                if (str3.length() > 100) {
                    return method + ": key参数不能超过100个字符";
                }
            } else {
                return method + ": key参数不能为空";
            }
        }
        Object obj3 = mapEmptyMap.get(Constants.BIZ);
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() > 100) {
            return method + ": biz参数不能超过100个字符";
        }
        if (Intrinsics.areEqual(method, "setItem") && !mapEmptyMap.containsKey("value")) {
            return "setItem: value参数不能为空";
        }
        if (Intrinsics.areEqual(method, "setItem") && mapEmptyMap.get("value") == null) {
            return "setItem: value参数不能为空";
        }
        Object obj4 = mapEmptyMap.get("value");
        if (!Intrinsics.areEqual(method, "setItem") || obj4 == null || m97867h(obj4) <= 2048) {
            return null;
        }
        return "setItem: value参数不能超过2KB";
    }
}
