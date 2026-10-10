package com.kubi.kumex.utils;

import com.google.gson.JsonElement;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.utils.u */
/* JADX INFO: compiled from: JsonExt.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0002¢\u0006\u0002\u0010\n\u001a\u0011\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0002¢\u0006\u0002\u0010\r\u001a\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0002¢\u0006\u0002\u0010\u0010\u001a\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"asBigDecimalOrNull", "Ljava/math/BigDecimal;", "Lcom/google/gson/JsonElement;", "asStringOrNull", "", "asLongOrNull", "", "(Lcom/google/gson/JsonElement;)Ljava/lang/Long;", "asIntOrNull", "", "(Lcom/google/gson/JsonElement;)Ljava/lang/Integer;", "asFloatOrNull", "", "(Lcom/google/gson/JsonElement;)Ljava/lang/Float;", "asByteOrNull", "", "(Lcom/google/gson/JsonElement;)Ljava/lang/Byte;", "asBooleanOrNull", "", "(Lcom/google/gson/JsonElement;)Ljava/lang/Boolean;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C17069u {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m36611a(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        try {
            return jsonElement.getAsBigDecimal();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Integer m36612b(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        try {
            return Integer.valueOf(jsonElement.getAsInt());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Long m36613c(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        try {
            return Long.valueOf(jsonElement.getAsLong());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m36614d(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        try {
            return jsonElement.getAsString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
