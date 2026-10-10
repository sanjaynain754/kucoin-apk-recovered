package com.blankj.utilcode.util;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.blankj.utilcode.util.p */
/* JADX INFO: compiled from: GsonUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5288p {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Gson> f6581a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static Gson m6339a() {
        return new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m6340b(@NonNull Gson gson, String str, @NonNull Class<T> cls) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (cls != null) {
            return (T) gson.fromJson(str, (Class) cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m6341c(@NonNull Gson gson, String str, @NonNull Type type) {
        if (gson == null) {
            throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (type != null) {
            return (T) gson.fromJson(str, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#2 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m6342d(String str, @NonNull Class<T> cls) {
        if (cls != null) {
            return (T) m6340b(m6344f(), str, cls);
        }
        throw new NullPointerException("Argument 'type' of type Class<T> (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m6343e(String str, @NonNull Type type) {
        if (type != null) {
            return (T) m6341c(m6344f(), str, type);
        }
        throw new NullPointerException("Argument 'type' of type Type (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: f */
    public static Gson m6344f() {
        Map<String, Gson> map = f6581a;
        Gson gson = map.get("delegateGson");
        if (gson != null) {
            return gson;
        }
        Gson gson2 = map.get("defaultGson");
        if (gson2 != null) {
            return gson2;
        }
        Gson gsonM6339a = m6339a();
        map.put("defaultGson", gsonM6339a);
        return gsonM6339a;
    }

    /* JADX INFO: renamed from: g */
    public static Gson m6345g() {
        Map<String, Gson> map = f6581a;
        Gson gson = map.get("logUtilsGson");
        if (gson != null) {
            return gson;
        }
        Gson gsonCreate = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        map.put("logUtilsGson", gsonCreate);
        return gsonCreate;
    }

    /* JADX INFO: renamed from: h */
    public static Type m6346h(@NonNull Type type) {
        if (type != null) {
            return TypeToken.getParameterized(List.class, type).getType();
        }
        throw new NullPointerException("Argument 'type' of type Type (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: i */
    public static String m6347i(@NonNull Gson gson, Object obj) {
        if (gson != null) {
            return gson.toJson(obj);
        }
        throw new NullPointerException("Argument 'gson' of type Gson (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: j */
    public static String m6348j(Object obj) {
        return m6347i(m6344f(), obj);
    }
}
