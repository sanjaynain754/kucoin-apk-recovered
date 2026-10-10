package com.kubi.utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.exception.DowngradeCode;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v70.C45463a;

/* JADX INFO: compiled from: DowngradeEx.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0007*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u000f*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001d\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001c\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a5\u0010\u001e\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0016\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0019\"\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a/\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010 2\b\u0010!\u001a\u0004\u0018\u00010\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0002¢\u0006\u0004\b$\u0010%\u001a5\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010 *\u00020&*\u00028\u00002\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(H\u0002¢\u0006\u0004\b*\u0010+\"$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\f0'j\b\u0012\u0004\u0012\u00020\f`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\"$\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u000f0'j\b\u0012\u0004\u0012\u00020\u000f`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-¨\u00061"}, m90084d2 = {"", "", "n", "(Ljava/lang/String;)Ljava/lang/Integer;", "default", CmcdData.Factory.STREAM_TYPE_LIVE, "(Ljava/lang/String;I)I", "", "q", "(Ljava/lang/String;)Ljava/lang/Long;", "o", "(Ljava/lang/String;J)J", "", "j", "(Ljava/lang/String;F)F", "", "i", "(Ljava/lang/String;)Ljava/lang/Double;", "g", "(Ljava/lang/String;D)D", "Ljava/math/BigDecimal;", "f", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "d", "(Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", "", "", "args", "v", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "t", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "any", "Lkotlin/Function0;", "map", CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "standard", "r", "(Ljava/lang/Number;Ljava/util/ArrayList;)Ljava/lang/Number;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/ArrayList;", "FLOAT_NAN_INFINITY", "b", "DOUBLE_NAN_INFINITY", "Utils_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDowngradeEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DowngradeEx.kt\ncom/kubi/utils/extensions/DowngradeExKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,255:1\n11365#2:256\n11700#2,3:257\n37#3,2:260\n*S KotlinDebug\n*F\n+ 1 DowngradeEx.kt\ncom/kubi/utils/extensions/DowngradeExKt\n*L\n133#1:256\n133#1:257,3\n133#1:260,2\n*E\n"})
public final class DowngradeExKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ArrayList<Float> f54317a = CollectionsKt.arrayListOf(Float.valueOf(Float.NaN), Float.valueOf(Float.NEGATIVE_INFINITY), Float.valueOf(Float.POSITIVE_INFINITY));

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ArrayList<Double> f54318b = CollectionsKt.arrayListOf(Double.valueOf(Double.NaN), Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY));

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final BigDecimal m66534d(@Nullable final String str, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "default");
        BigDecimal bigDecimal2 = (BigDecimal) m66549s(str, new Function0<BigDecimal>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asBigDecimalOrDefault$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final BigDecimal invoke() {
                String str2 = str;
                if (str2 != null) {
                    return new BigDecimal(str2);
                }
                return null;
            }
        });
        return bigDecimal2 == null ? bigDecimal : bigDecimal2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BigDecimal m66535e(String str, BigDecimal ZERO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        return m66534d(str, ZERO);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final BigDecimal m66536f(@Nullable final String str) {
        return (BigDecimal) m66549s(str, new Function0<BigDecimal>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asBigDecimalOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final BigDecimal invoke() {
                String str2 = str;
                if (str2 != null) {
                    return new BigDecimal(str2);
                }
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final double m66537g(@Nullable final String str, double d11) {
        Double d12 = (Double) m66549s(str, new Function0<Double>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asDoubleOrDefault$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Double invoke() {
                String str2 = str;
                if (str2 != null) {
                    return (Double) DowngradeExKt.m66548r(Double.valueOf(Double.parseDouble(str2)), DowngradeExKt.f54318b);
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return d12 != null ? d12.doubleValue() : d11;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ double m66538h(String str, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = 0.0d;
        }
        return m66537g(str, d11);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Double m66539i(@Nullable final String str) {
        return (Double) m66549s(str, new Function0<Double>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asDoubleOrNull$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Double invoke() {
                String str2 = str;
                if (str2 != null) {
                    return (Double) DowngradeExKt.m66548r(Double.valueOf(Double.parseDouble(str2)), DowngradeExKt.f54318b);
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final float m66540j(@Nullable final String str, float f11) {
        Float f12 = (Float) m66549s(str, new Function0<Float>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asFloatOrDefault$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Float invoke() {
                String str2 = str;
                if (str2 != null) {
                    return (Float) DowngradeExKt.m66548r(Float.valueOf(Float.parseFloat(str2)), DowngradeExKt.f54317a);
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return f12 != null ? f12.floatValue() : f11;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ float m66541k(String str, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 0.0f;
        }
        return m66540j(str, f11);
    }

    /* JADX INFO: renamed from: l */
    public static final int m66542l(@Nullable final String str, int i11) {
        Integer num = (Integer) m66549s(str, new Function0<Integer>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asIntOrDefault$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Integer invoke() {
                String str2 = str;
                if (str2 != null) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return num != null ? num.intValue() : i11;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ int m66543m(String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return m66542l(str, i11);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Integer m66544n(@Nullable final String str) {
        return (Integer) m66549s(str, new Function0<Integer>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asIntOrNull$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Integer invoke() {
                String str2 = str;
                if (str2 != null) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static final long m66545o(@Nullable final String str, long j11) {
        Long l11 = (Long) m66549s(str, new Function0<Long>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asLongOrDefault$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Long invoke() {
                String str2 = str;
                if (str2 != null) {
                    return Long.valueOf(Long.parseLong(str2));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        return l11 != null ? l11.longValue() : j11;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ long m66546p(String str, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return m66545o(str, j11);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final Long m66547q(@Nullable final String str) {
        return (Long) m66549s(str, new Function0<Long>() { // from class: com.kubi.utils.extensions.DowngradeExKt$asLongOrNull$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Long invoke() {
                String str2 = str;
                if (str2 != null) {
                    return Long.valueOf(Long.parseLong(str2));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public static final String m66550t(@Nullable final String str, @NotNull final Object[] args, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(str2, "default");
        String str3 = (String) m66549s(str, new Function0<String>() { // from class: com.kubi.utils.extensions.DowngradeExKt$formatOrDefault$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                String str4 = str;
                if (str4 == null) {
                    return null;
                }
                Object[] objArr = args;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str5 = String.format(str4, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str5, "format(this, *args)");
                return str5;
            }
        });
        return str3 == null ? str2 : str3;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ String m66551u(String str, Object[] objArr, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str == null ? "" : str;
        }
        return m66550t(str, objArr, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public static final String m66552v(@Nullable final String str, @NotNull final Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return (String) m66549s(str, new Function0<String>() { // from class: com.kubi.utils.extensions.DowngradeExKt$formatOrNull$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                String str2 = str;
                if (str2 == null) {
                    return null;
                }
                Object[] objArr = args;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                String str3 = String.format(str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
                return str3;
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public static final <T extends Number> T m66548r(T t11, ArrayList<T> arrayList) {
        if (!arrayList.contains(t11)) {
            return t11;
        }
        throw new NumberFormatException("not valid number: " + t11);
    }

    /* JADX INFO: renamed from: s */
    public static final <T> T m66549s(Object obj, Function0<? extends T> function0) {
        try {
            return function0.invoke();
        } catch (Exception e11) {
            C43840a.m96551e("downgrade:" + obj, null, 2, null);
            C45463a.m100410c(e11, DowngradeCode.ERROR);
            return null;
        }
    }
}
