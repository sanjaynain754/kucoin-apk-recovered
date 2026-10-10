package com.jumio.core.util;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.jumio.core.util.JsonUtilKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u0086\u0002\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00060\b\u001a2\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0006*\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00060\b\u001a$\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\b\u001a$\u0010\f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000e0\b\u001a\f\u0010\u000f\u001a\u00020\u000e*\u0004\u0018\u00010\u0003\u001a\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u001a\u0010\u0017\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011\u001a<\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u001a/\u0010 \u001a\u0002H\u0002\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!*\u00020\u00112\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u0002H\u0002¢\u0006\u0002\u0010#\u001a\u0014\u0010$\u001a\u0004\u0018\u00010\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013\u001a+\u0010%\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00020'¢\u0006\u0002\u0010(¨\u0006)"}, m90084d2 = {"iterator", "", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/json/JSONArray;", "map", "", "R", "convertFunction", "Lkotlin/Function1;", "mapNotNull", "forEach", "", "filterNot", "predicate", "", "isNullOrEmpty", "putIfNotNull", "Lorg/json/JSONObject;", "name", "", "value", "", "putIfNotNullOrBlank", "putIfNotEmpty", "optDate", "Ljava/util/Date;", "pattern", "locale", "Ljava/util/Locale;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Ljava/util/TimeZone;", "default", "optEnum", "", "key", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;", "stringOrNull", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtil.kt\ncom/jumio/core/util/JsonUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class JsonUtilKt {
    @NotNull
    public static final <T> JSONArray filterNot(@NotNull JSONArray jSONArray, @NotNull Function1<? super T, Boolean> predicate) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            if (obj == null) {
                obj = null;
            }
            if (obj != null && !predicate.invoke(obj).booleanValue()) {
                jSONArray2.put(obj);
            }
        }
        return jSONArray2;
    }

    public static final <T> void forEach(@NotNull JSONArray jSONArray, @NotNull Function1<? super T, Unit> convertFunction) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(convertFunction, "convertFunction");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                convertFunction.invoke(obj);
            }
        }
    }

    public static final <T> T getOrPut(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull Function0<? extends T> defaultValue) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (!jSONObject.has(name)) {
            jSONObject.put(name, defaultValue.invoke());
        }
        return (T) jSONObject.get(name);
    }

    public static final boolean isNullOrEmpty(@Nullable JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    @NotNull
    public static final <T> Iterator<T> iterator(@NotNull final JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new Function1() { // from class: x9.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JsonUtilKt.m14600a(jSONArray, ((Integer) obj).intValue());
            }
        }).iterator();
    }

    @NotNull
    public static final <T, R> List<R> map(@NotNull JSONArray jSONArray, @NotNull Function1<? super T, ? extends R> convertFunction) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(convertFunction, "convertFunction");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(convertFunction.invoke(obj));
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> mapNotNull(@NotNull JSONArray jSONArray, @NotNull Function1<? super T, ? extends R> convertFunction) throws JSONException {
        R rInvoke;
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(convertFunction, "convertFunction");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            if (obj == null) {
                obj = null;
            }
            if (obj != null && (rInvoke = convertFunction.invoke(obj)) != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final Date optDate(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull String pattern, @NotNull Locale locale, @NotNull TimeZone timeZone, @Nullable Date date) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
            simpleDateFormat.setTimeZone(timeZone);
            return simpleDateFormat.parse(jSONObject.optString(name));
        } catch (Exception unused) {
            return date;
        }
    }

    public static /* synthetic */ Date optDate$default(JSONObject jSONObject, String str, String str2, Locale ENGLISH, TimeZone timeZone, Date date, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        }
        Locale locale = ENGLISH;
        if ((i11 & 8) != 0) {
            timeZone = TimeZone.getTimeZone("GMT");
            Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        }
        TimeZone timeZone2 = timeZone;
        if ((i11 & 16) != 0) {
            date = null;
        }
        return optDate(jSONObject, str, str2, locale, timeZone2, date);
    }

    @NotNull
    public static final <T extends Enum<T>> T optEnum(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull T t11) {
        Enum[] enumArr;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(t11, "default");
        String strOptString = jSONObject.optString(key, "");
        Intrinsics.checkNotNull(strOptString);
        T t12 = null;
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (strOptString != null && (enumArr = (Enum[]) t11.getClass().getEnumConstants()) != null) {
            for (Enum r11 : enumArr) {
                if (StringsKt.equals(r11.name(), strOptString, true)) {
                    t12 = (T) r11;
                    break;
                }
            }
            if (t12 != null) {
                return t12;
            }
        }
        return t11;
    }

    @NotNull
    public static final JSONObject putIfNotEmpty(@NotNull JSONObject jSONObject, @NotNull String name, @NotNull JSONObject value) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (name.length() > 0 && value.length() > 0) {
            jSONObject.put(name, value);
        }
        return jSONObject;
    }

    public static final void putIfNotNull(@NotNull JSONObject jSONObject, @NotNull String name, @Nullable Object obj) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        if (obj != null) {
            jSONObject.put(name, obj);
        }
    }

    public static final void putIfNotNullOrBlank(@NotNull JSONObject jSONObject, @Nullable String str, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (str == null || !(!StringsKt.isBlank(str)) || str2 == null || !(!StringsKt.isBlank(str2))) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @Nullable
    public static final String stringOrNull(@NotNull JSONObject jSONObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        String strOptString = jSONObject.optString(name);
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m14600a(JSONArray jSONArray, int i11) {
        return jSONArray.get(i11);
    }
}
