package com.kubi.utils.extensions;

import androidx.camera.core.processing.util.GLUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.node.C6447a;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.extensions.d */
/* JADX INFO: compiled from: NumberEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\t*\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u00142\b\b\u0002\u0010\f\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00000\u0000*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001a!\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\"\u0010\u001b\u001a\u0013\u0010$\u001a\u00020\u0001*\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b&\u0010\u0003¨\u0006'"}, m90084d2 = {"Ljava/math/BigDecimal;", "", "c", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "", "f", "(Ljava/lang/Double;)D", "g", "(Ljava/math/BigDecimal;)D", "", "j", "(Ljava/lang/Integer;)I", "default", "k", "(Ljava/lang/Integer;I)I", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/Long;)J", "m", "(Ljava/lang/Long;J)J", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/Float;F)F", "o", "(D)Ljava/lang/String;", "kotlin.jvm.PlatformType", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "n", "start", "end", "", "e", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Z", "p", "", "d", "(Ljava/lang/Number;)Ljava/lang/String;", "b", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27039d {
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m66641a(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.multiply(new BigDecimal(100));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m66642b(@Nullable BigDecimal bigDecimal) {
        String plainString;
        BigDecimal bigDecimalM11724a;
        StringBuilder sb2 = new StringBuilder();
        if (bigDecimal != null) {
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(new BigDecimal(C33556b3.f68995S));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "this.multiply(other)");
            if (bigDecimalMultiply == null || (bigDecimalM11724a = C6447a.m11724a(bigDecimalMultiply)) == null) {
                plainString = null;
            } else {
                plainString = bigDecimalM11724a.toPlainString();
            }
        } else {
            plainString = null;
        }
        sb2.append(C27041f.m66669i(plainString, C33820nf.f71144W));
        sb2.append('%');
        return sb2.toString();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m66643c(@Nullable BigDecimal bigDecimal) {
        String plainString = bigDecimal != null ? bigDecimal.toPlainString() : null;
        return plainString == null ? "0.000" : plainString;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m66644d(@Nullable Number number) {
        return m66646f(number != null ? Double.valueOf(number.doubleValue()) : null) > 0.0d ? "+" : "";
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m66645e(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal start, @NotNull BigDecimal end) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return bigDecimal.compareTo(start) >= 0 && bigDecimal.compareTo(end) <= 0;
    }

    /* JADX INFO: renamed from: f */
    public static final double m66646f(@Nullable Double d11) {
        if (d11 != null) {
            return d11.doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: g */
    public static final double m66647g(@Nullable BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            return bigDecimal.doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: h */
    public static final float m66648h(@Nullable Float f11, float f12) {
        return f11 != null ? f11.floatValue() : f12;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ float m66649i(Float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f12 = 0.0f;
        }
        return m66648h(f11, f12);
    }

    /* JADX INFO: renamed from: j */
    public static final int m66650j(@Nullable Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public static final int m66651k(@Nullable Integer num, int i11) {
        return num != null ? num.intValue() : i11;
    }

    /* JADX INFO: renamed from: l */
    public static final long m66652l(@Nullable Long l11) {
        if (l11 != null) {
            return l11.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public static final long m66653m(@Nullable Long l11, long j11) {
        return l11 != null ? l11.longValue() : j11;
    }

    /* JADX INFO: renamed from: n */
    public static final BigDecimal m66654n(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return bigDecimal.divide(new BigDecimal(100));
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m66655o(double d11) {
        String plainString = C6447a.m11724a(new BigDecimal(String.valueOf(d11))).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toBigDecimal().stripTrai…ngZeros().toPlainString()");
        return plainString;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final BigDecimal m66656p(@Nullable BigDecimal bigDecimal) {
        return bigDecimal == null ? new BigDecimal(GLUtils.VERSION_UNKNOWN) : bigDecimal;
    }
}
