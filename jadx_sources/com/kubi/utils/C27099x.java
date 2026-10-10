package com.kubi.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kubi.utils.exception.GsonCode;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import v70.C45463a;

/* JADX INFO: renamed from: com.kubi.utils.x */
/* JADX INFO: compiled from: GsonUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m90084d2 = {"Lcom/kubi/utils/x;", "", "<init>", "()V", "", "serializeNulls", "Lcom/google/gson/Gson;", "f", "(Z)Lcom/google/gson/Gson;", "object", "includeNulls", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Object;Z)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, JPushConstants.Analysis.KEY_JSON, "Ljava/lang/Class;", "type", "c", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "d", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "b", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/google/gson/Gson;", "GSON", "GSON_NO_NULLS", "e", "()Lcom/google/gson/Gson;", "getGson$annotations", "gson", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27099x {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27099x f54458a = new C27099x();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Gson GSON = m66911a(true);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Gson GSON_NO_NULLS = m66911a(false);

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Gson m66915e() {
        return m66916f(true);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m66917g(@Nullable Object obj) {
        return m66919i(obj, false, 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final Gson m66911a(boolean serializeNulls) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        if (serializeNulls) {
            gsonBuilder.serializeNulls();
        }
        gsonBuilder.setLenient();
        gsonBuilder.registerTypeAdapter(BigDecimal.class, new BigDecimalAdapter());
        gsonBuilder.registerTypeAdapter(Byte.TYPE, new ByteAdapter());
        gsonBuilder.registerTypeAdapter(Short.TYPE, new ShortAdapter());
        gsonBuilder.registerTypeAdapter(Integer.TYPE, new IntAdapter());
        gsonBuilder.registerTypeAdapter(Long.TYPE, new LongAdapter());
        gsonBuilder.registerTypeAdapter(Float.TYPE, new FloatAdapter());
        gsonBuilder.registerTypeAdapter(Double.TYPE, new DoubleAdapter());
        gsonBuilder.registerTypeAdapter(Byte.class, new ByteAdapter());
        gsonBuilder.registerTypeAdapter(Short.class, new ShortAdapter());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntAdapter());
        gsonBuilder.registerTypeAdapter(Long.class, new LongAdapter());
        gsonBuilder.registerTypeAdapter(Float.class, new FloatAdapter());
        gsonBuilder.registerTypeAdapter(Double.class, new DoubleAdapter());
        Gson gsonCreate = gsonBuilder.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "builder.create()");
        return gsonCreate;
    }

    @Deprecated(message = "use it in coroutines", replaceWith = @ReplaceWith(expression = "GsonUtils.fromJsonOrNull<T>(json)", imports = {}))
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> T m66912b(@NotNull String json, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return (T) m66914d(json, type);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Deprecated(message = "use it in coroutines", replaceWith = @ReplaceWith(expression = "GsonUtils.fromJsonOrNull<T>(json)", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final <T> T m66913c(@Nullable String json, @Nullable Class<T> type) {
        try {
            return (T) GSON.fromJson(json, (Class) type);
        } catch (Throwable th2) {
            C45463a.m100411d(th2, GsonCode.FROM_FAIL);
            throw th2;
        }
    }

    @Deprecated(message = "use it in coroutines", replaceWith = @ReplaceWith(expression = "GsonUtils.fromJsonOrNull<T>(json)", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final <T> T m66914d(@Nullable String json, @Nullable Type type) {
        try {
            return (T) GSON.fromJson(json, type);
        } catch (Throwable th2) {
            C45463a.m100411d(th2, GsonCode.FROM_FAIL);
            throw th2;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Gson m66916f(boolean serializeNulls) {
        return serializeNulls ? GSON_NO_NULLS : GSON;
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m66918h(@Nullable Object object, boolean includeNulls) {
        String json;
        String str;
        try {
            if (includeNulls) {
                json = GSON.toJson(object);
                str = "GSON.toJson(`object`)";
            } else {
                json = GSON_NO_NULLS.toJson(object);
                str = "GSON_NO_NULLS.toJson(`object`)";
            }
            Intrinsics.checkNotNullExpressionValue(json, str);
            return json;
        } catch (Throwable th2) {
            C45463a.m100411d(th2, GsonCode.PARSE_FAIL);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m66919i(Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m66918h(obj, z11);
    }
}
