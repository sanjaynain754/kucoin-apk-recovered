package com.kubi.utils;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.text.Regex;

/* JADX INFO: compiled from: NumberUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/utils/NumberUtils;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class NumberUtils {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: NumberUtils.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0004J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/utils/NumberUtils$Companion;", "", "()V", "formatPercent", "", "value", "", "precision", "", "isShowMin", "", "(Ljava/lang/Double;IZ)Ljava/lang/String;", "getFormatValue", "Ljava/math/BigDecimal;", "isBTC", "getPrecisionByNumber", "getPrecisionByPoint", "isAllNumber", "str", SessionDescription.ATTR_RANGE, "target", "min", "max", "", "rangeE", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nNumberUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberUtils.kt\ncom/kubi/utils/NumberUtils$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,133:1\n1174#2,2:134\n731#3,9:136\n37#4,2:145\n*S KotlinDebug\n*F\n+ 1 NumberUtils.kt\ncom/kubi/utils/NumberUtils$Companion\n*L\n25#1:134,2\n98#1:136,9\n98#1:145,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmOverloads
        @NotNull
        public final String formatPercent(@Nullable Double d11, int i11) {
            return formatPercent$default(this, d11, i11, false, 4, null);
        }

        @NotNull
        public final String getFormatValue(@NotNull BigDecimal value, boolean isBTC) {
            Intrinsics.checkNotNullParameter(value, "value");
            return getFormatValue(value.doubleValue(), isBTC);
        }

        public final boolean range(long target, long min, long max) {
            return Math.max(min, target) == Math.min(max, target);
        }

        public Companion() {
        }

        public static /* synthetic */ String formatPercent$default(Companion companion, Double d11, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z11 = true;
            }
            return companion.formatPercent(d11, i11, z11);
        }

        @JvmOverloads
        @NotNull
        public final String formatPercent(@Nullable Double value, int precision, boolean isShowMin) {
            String plainString;
            BigDecimal scale;
            StringBuilder sb2 = new StringBuilder();
            BigDecimal bigDecimalM66641a = C27039d.m66641a(new BigDecimal(String.valueOf(value != null ? value.doubleValue() : 0.0d)));
            if (bigDecimalM66641a == null || (scale = bigDecimalM66641a.setScale(precision, RoundingMode.DOWN)) == null) {
                plainString = null;
            } else {
                if (!isShowMin) {
                    scale = C6447a.m11724a(scale);
                }
                plainString = scale.toPlainString();
            }
            sb2.append(plainString);
            sb2.append('%');
            return sb2.toString();
        }

        @NotNull
        public final String getFormatValue(double value, boolean isBTC) {
            String plainString;
            double dAbs = Math.abs(value);
            if (dAbs >= 0.0d && dAbs < 1.0d) {
                if (isBTC) {
                    if (dAbs == 0.0d) {
                        plainString = "0.00000000";
                    } else {
                        plainString = dAbs < 1.0E-8d ? "<0.00000001" : new BigDecimal(String.valueOf(value)).setScale(8, RoundingMode.HALF_UP).toPlainString();
                    }
                } else if (dAbs == 0.0d) {
                    plainString = "0.00";
                } else {
                    plainString = dAbs < 0.01d ? "<0.01" : new BigDecimal(String.valueOf(value)).setScale(2, RoundingMode.HALF_UP).toPlainString();
                }
                Intrinsics.checkNotNullExpressionValue(plainString, "{\n                if (is…          }\n            }");
                return plainString;
            }
            if (dAbs >= 1.0d && dAbs < 10.0d) {
                String plainString2 = isBTC ? new BigDecimal(String.valueOf(value)).setScale(8, RoundingMode.HALF_UP).toPlainString() : new BigDecimal(String.valueOf(value)).setScale(0, RoundingMode.HALF_UP).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString2, "{\n                if (is…          }\n            }");
                return plainString2;
            }
            if (dAbs < 1000.0d) {
                String plainString3 = new BigDecimal(String.valueOf(value)).setScale(0, RoundingMode.HALF_UP).toPlainString();
                Intrinsics.checkNotNullExpressionValue(plainString3, "{\n                value.…ainString()\n            }");
                return plainString3;
            }
            if (dAbs < 1000000.0d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MathKt.roundToInt(value / ((double) 1000)));
                sb2.append('K');
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(MathKt.roundToInt(value / ((double) 1000000)));
            sb3.append('M');
            return sb3.toString();
        }

        @JvmStatic
        public final int getPrecisionByNumber(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String plainString = C6447a.m11724a(DowngradeExKt.m66535e(value, null, 1, null)).toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "value.asBigDecimalOrDefa…ngZeros().toPlainString()");
            return getPrecisionByPoint(plainString);
        }

        @JvmStatic
        public final int getPrecisionByPoint(@NotNull String value) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Double.parseDouble(value);
                List<String> listSplit = new Regex("\\.").split(value, 0);
                if (listSplit.isEmpty()) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        }
                    }
                    listEmptyList = CollectionsKt.emptyList();
                }
                return ((String[]) listEmptyList.toArray(new String[0]))[1].length();
            } catch (Exception unused) {
                return 0;
            }
        }

        public final boolean isAllNumber(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            boolean z11 = true;
            for (int i11 = 0; i11 < str.length(); i11++) {
                z11 = z11 && Character.isDigit(str.charAt(i11));
            }
            return z11;
        }

        public final boolean range(double target, double min, double max) {
            return Math.max(min, target) == Math.min(max, target);
        }

        public final boolean rangeE(double target, double min, double max) {
            return target > min && target <= max;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m66402a(@NotNull String str) {
        return INSTANCE.getPrecisionByNumber(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m66403b(@NotNull String str) {
        return INSTANCE.getPrecisionByPoint(str);
    }
}
