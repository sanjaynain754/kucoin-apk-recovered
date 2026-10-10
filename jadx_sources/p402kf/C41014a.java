package p402kf;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.appsflyer.AppsFlyerProperties;
import com.blankj.utilcode.util.C5303w0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.utils.C27021e;
import com.kubi.utils.NumberUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: kf.a */
/* JADX INFO: compiled from: BaseRateExt.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000/\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b3*\u0001\u0001\u001a@\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007\u001a;\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a,\u0010\u0010\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007\u001a1\u0010\u0010\u001a\u00020\u0004*\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001af\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\tH\u0007\u001aV\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0007\u001a\\\u0010\u0012\u001a\u00020\u0004*\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0007\u001a\\\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0007\u001aT\u0010\u001a\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007\u001aJ\u0010\u001d\u001a\u00020\u0004*\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000bH\u0007\u001aH\u0010\u001f\u001a\u00020\u0004*\u00020\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u001a\u001e\u0010 \u001a\u00020\u0005*\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010#\u001a\u00020\u000e*\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010#\u001a\u00020\u000e*\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0004\u001a\u0014\u0010$\u001a\u00020\u000e*\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010&\u001a\u00020\t*\u00020\u0005\u001a\n\u0010'\u001a\u00020\t*\u00020\u0005\u001a\u0016\u0010(\u001a\u00020\u0005*\u0004\u0018\u00010\u00052\b\b\u0002\u0010)\u001a\u00020\u0004\u001a\f\u0010*\u001a\u00020\u000b*\u0004\u0018\u00010\u0005\u001a\f\u0010+\u001a\u00020\u000b*\u0004\u0018\u00010\u0005\u001a\u0016\u0010,\u001a\u00020\u000b*\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u001a\u0016\u0010-\u001a\u00020\u000b*\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u001a\u0016\u0010.\u001a\u00020\u0005*\u0004\u0018\u00010\u00052\b\b\u0002\u0010)\u001a\u00020\u000e\u001a\u001c\u0010/\u001a\u00020\u0005*\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u000b\u001a\u0012\u00101\u001a\u00020\u000b*\u00020\u00052\u0006\u0010/\u001a\u00020\u0005\u001a \u0010=\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010>\u001a\u00020\u000b2\b\b\u0002\u0010?\u001a\u00020\u000b\u001a\u0016\u0010@\u001a\u00020\u0004*\u0004\u0018\u00010\u00052\b\b\u0002\u0010?\u001a\u00020\u000b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104\"\u0011\u00105\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u00104\"\u0011\u00107\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00104\"\u0011\u00109\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00104\"\u0011\u0010;\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u00104¨\u0006A"}, m90084d2 = {"localFormat", "com/kubi/data/rate/BaseRateExtKt$localFormat$1", "Lcom/kubi/data/rate/BaseRateExtKt$localFormat$1;", "formatPercentRate", "", "Ljava/math/BigDecimal;", "roundingMode", "Ljava/math/RoundingMode;", "precision", "", "isGroup", "", "showAddSub", "isShowMin", "", "(Ljava/lang/Double;Ljava/math/RoundingMode;IZZ)Ljava/lang/String;", "formatGroupPercentRate", "(Ljava/lang/Double;Ljava/math/RoundingMode;IZ)Ljava/lang/String;", "getFormatter", "isApprox", "isShowLess", "isFollowPrecision", "zeroStr", "minimumFractionDigits", "getDefaultFormatter", "value", "getLegalSymbolPrice", "legal", "isNeedLess", "getLegalCurrencyPrice", "showBySymbol", "formatLegalPrice", "getTargetPrice", FirebaseAnalytics.Param.CURRENCY, "targetCurrency", "getCoinLegalPrice", "getAmountByPrice", AppsFlyerProperties.CURRENCY_CODE, "getPrecision", "getOptimizedScale", "notNull", "default", "isZero", "isNullOrZero", "eq", "notEq", "notNullDouble", "step", "isDown", "isStepped", "K", "getK", "()Ljava/math/BigDecimal;", "M", "getM", "B", "getB", ExifInterface.GPS_DIRECTION_TRUE, "getT", "P", "getP", "formatFromK", "withBlank", "isLegal", "formatFromM", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseRateExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRateExt.kt\ncom/kubi/data/rate/BaseRateExtKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,558:1\n1#2:559\n*E\n"})
public final class C41014a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final a f91237a = new a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BigDecimal f91238b = new BigDecimal(1000);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final BigDecimal f91239c = new BigDecimal(1000000);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final BigDecimal f91240d = new BigDecimal(1000000000);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final BigDecimal f91241e = new BigDecimal(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final BigDecimal f91242f = new BigDecimal(1000000000000000L);

    /* JADX INFO: renamed from: kf.a$a */
    /* JADX INFO: compiled from: BaseRateExt.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0004"}, m90084d2 = {"com/kubi/data/rate/BaseRateExtKt$localFormat$1", "Ljava/lang/ThreadLocal;", "Ljava/text/NumberFormat;", "initialValue", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ThreadLocal<NumberFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NumberFormat initialValue() {
            return NumberFormat.getInstance(Locale.ENGLISH);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final boolean m89919D(@Nullable BigDecimal bigDecimal) {
        return bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m89927a(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        return (bigDecimal2 == null || bigDecimal == null || bigDecimal.compareTo(bigDecimal2) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ String m89946t(BigDecimal bigDecimal, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i13 & 2) != 0) {
            i11 = 2;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            z12 = false;
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        if ((i13 & 32) != 0) {
            z14 = false;
        }
        if ((i13 & 64) != 0) {
            z15 = true;
        }
        if ((i13 & 128) != 0) {
            str = "0.00";
        }
        return m89943q(bigDecimal, roundingMode, i11, z11, z12, z13, z14, z15, str, (i13 & 256) != 0 ? 0 : i12);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public static final BigDecimal m89916A(@NotNull BigDecimal bigDecimal, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Double dM89969g = C41016c.m89969g(str);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        BigDecimal bigDecimal3 = dM89969g != null ? new BigDecimal(String.valueOf(dM89969g.doubleValue())) : bigDecimal2;
        Double dM89969g2 = C41016c.m89969g(C27041f.m66669i(str2, "BTC"));
        BigDecimal bigDecimal4 = dM89969g2 != null ? new BigDecimal(String.valueOf(dM89969g2.doubleValue())) : null;
        if (bigDecimal4 == null || bigDecimal4.compareTo(bigDecimal2) == 0) {
            Intrinsics.checkNotNull(bigDecimal3);
            BigDecimal bigDecimalMultiply = bigDecimal3.multiply(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        }
        Intrinsics.checkNotNull(bigDecimal3);
        BigDecimal bigDecimalMultiply2 = bigDecimal3.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalDivide = bigDecimalMultiply2.divide(bigDecimal4, 12, RoundingMode.DOWN);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m89917B(@Nullable BigDecimal bigDecimal) {
        return bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m89918C(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal step) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        return step.compareTo(bigDecimal2) == 0 || bigDecimal.remainder(step).compareTo(bigDecimal2) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public static final BigDecimal m89921F(@Nullable BigDecimal bigDecimal, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        return bigDecimal == null ? new BigDecimal(str) : bigDecimal;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ BigDecimal m89922G(BigDecimal bigDecimal, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "0";
        }
        return m89921F(bigDecimal, str);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public static final BigDecimal m89923H(@Nullable BigDecimal bigDecimal, double d11) {
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d11);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ BigDecimal m89924I(BigDecimal bigDecimal, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = 0.0d;
        }
        return m89923H(bigDecimal, d11);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public static final BigDecimal m89925J(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal step, boolean z11) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        if (step.compareTo(BigDecimal.ZERO) == 0 || m89918C(bigDecimal, step)) {
            return bigDecimal;
        }
        if (z11) {
            BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal.remainder(step));
            Intrinsics.checkNotNull(bigDecimalSubtract);
            return bigDecimalSubtract;
        }
        BigDecimal bigDecimalAdd = bigDecimal.add(step.subtract(bigDecimal.remainder(step)));
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ BigDecimal m89926K(BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m89925J(bigDecimal, bigDecimal2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m89928b(@Nullable BigDecimal bigDecimal, boolean z11, boolean z12) {
        String strM89966d = C41016c.m89966d();
        String str = "";
        String str2 = z11 ? C33627eb.f69716f : "";
        if (bigDecimal == null) {
            return "--";
        }
        BigDecimal bigDecimal2 = f91238b;
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return z12 ? m89950x(bigDecimal.doubleValue(), null, RoundingMode.HALF_UP, 0, false, false, true, false, 93, null) : C42180b.m92640e(bigDecimal, RoundingMode.HALF_UP, 2, false, false, true, 0, null, 108, null);
        }
        BigDecimal bigDecimal3 = f91239c;
        if (bigDecimal.compareTo(bigDecimal3) < 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z12) {
                str = strM89966d + str2;
            }
            sb2.append(str);
            BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            sb2.append(C42180b.m92640e(bigDecimalDivide, null, 2, false, false, true, 0, null, 109, null));
            sb2.append('K');
            return sb2.toString();
        }
        BigDecimal bigDecimal4 = f91240d;
        if (bigDecimal.compareTo(bigDecimal4) < 0) {
            StringBuilder sb3 = new StringBuilder();
            if (z12) {
                str = strM89966d + str2;
            }
            sb3.append(str);
            BigDecimal bigDecimalDivide2 = bigDecimal.divide(bigDecimal3, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
            sb3.append(C42180b.m92640e(bigDecimalDivide2, null, 2, false, false, true, 0, null, 109, null));
            sb3.append('M');
            return sb3.toString();
        }
        BigDecimal bigDecimal5 = f91241e;
        if (bigDecimal.compareTo(bigDecimal5) < 0) {
            StringBuilder sb4 = new StringBuilder();
            if (z12) {
                str = strM89966d + str2;
            }
            sb4.append(str);
            BigDecimal bigDecimalDivide3 = bigDecimal.divide(bigDecimal4, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
            sb4.append(C42180b.m92640e(bigDecimalDivide3, null, 2, false, false, true, 0, null, 109, null));
            sb4.append('B');
            return sb4.toString();
        }
        BigDecimal bigDecimal6 = f91242f;
        if (bigDecimal.compareTo(bigDecimal6) < 0) {
            StringBuilder sb5 = new StringBuilder();
            if (z12) {
                str = strM89966d + str2;
            }
            sb5.append(str);
            BigDecimal bigDecimalDivide4 = bigDecimal.divide(bigDecimal5, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide4, "divide(...)");
            sb5.append(C42180b.m92640e(bigDecimalDivide4, null, 2, false, false, true, 0, null, 109, null));
            sb5.append('T');
            return sb5.toString();
        }
        StringBuilder sb6 = new StringBuilder();
        if (z12) {
            str = strM89966d + str2;
        }
        sb6.append(str);
        BigDecimal bigDecimalDivide5 = bigDecimal.divide(bigDecimal6, 2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide5, "divide(...)");
        sb6.append(C42180b.m92640e(bigDecimalDivide5, null, 2, false, false, true, 0, null, 109, null));
        sb6.append('P');
        return sb6.toString();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m89929c(BigDecimal bigDecimal, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return m89928b(bigDecimal, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m89930d(@Nullable BigDecimal bigDecimal, boolean z11) {
        String strM89966d = C41016c.m89966d();
        if (bigDecimal == null) {
            return "--";
        }
        BigDecimal bigDecimal2 = f91239c;
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return z11 ? m89950x(bigDecimal.doubleValue(), null, RoundingMode.HALF_UP, 0, false, false, true, false, 93, null) : C42180b.m92640e(bigDecimal, RoundingMode.HALF_UP, 2, false, false, true, 0, null, 108, null);
        }
        BigDecimal bigDecimal3 = f91240d;
        String str = "";
        if (bigDecimal.compareTo(bigDecimal3) < 0) {
            StringBuilder sb2 = new StringBuilder();
            if (z11) {
                str = strM89966d + ' ';
            }
            sb2.append(str);
            BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            sb2.append(C42180b.m92640e(bigDecimalDivide, null, 2, false, false, true, 0, null, 109, null));
            sb2.append('M');
            return sb2.toString();
        }
        BigDecimal bigDecimal4 = f91241e;
        if (bigDecimal.compareTo(bigDecimal4) < 0) {
            StringBuilder sb3 = new StringBuilder();
            if (z11) {
                str = strM89966d + ' ';
            }
            sb3.append(str);
            BigDecimal bigDecimalDivide2 = bigDecimal.divide(bigDecimal3, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
            sb3.append(C42180b.m92640e(bigDecimalDivide2, null, 2, false, false, true, 0, null, 109, null));
            sb3.append('B');
            return sb3.toString();
        }
        BigDecimal bigDecimal5 = f91242f;
        if (bigDecimal.compareTo(bigDecimal5) < 0) {
            StringBuilder sb4 = new StringBuilder();
            if (z11) {
                str = strM89966d + ' ';
            }
            sb4.append(str);
            BigDecimal bigDecimalDivide3 = bigDecimal.divide(bigDecimal4, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide3, "divide(...)");
            sb4.append(C42180b.m92640e(bigDecimalDivide3, null, 2, false, false, true, 0, null, 109, null));
            sb4.append('T');
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        if (z11) {
            str = strM89966d + ' ';
        }
        sb5.append(str);
        BigDecimal bigDecimalDivide4 = bigDecimal.divide(bigDecimal5, 2, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide4, "divide(...)");
        sb5.append(C42180b.m92640e(bigDecimalDivide4, null, 2, false, false, true, 0, null, 109, null));
        sb5.append('P');
        return sb5.toString();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m89931e(BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m89930d(bigDecimal, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m89932f(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13) {
        String str2;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return "--";
        }
        int i12 = m89919D(bigDecimal.abs()) ? 2 : 0;
        BigDecimal bigDecimal3 = new BigDecimal("0.000001");
        boolean z14 = z11 && bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal2) > 0;
        if (z13) {
            String strM89967e = C41016c.m89967e(C27041f.m66668h(str));
            if (z14) {
                str2 = Typography.less + strM89967e + C42180b.m92640e(bigDecimal3, null, 6, false, false, false, 0, null, 125, null);
            } else {
                str2 = strM89967e + C42180b.m92640e(bigDecimal, roundingMode, i11, false, false, false, i12, null, 92, null);
            }
        } else if (z14) {
            str2 = Typography.less + C42180b.m92640e(bigDecimal3, null, 6, false, false, false, 0, null, 125, null) + ' ' + str;
        } else {
            str2 = C42180b.m92640e(bigDecimal, roundingMode, i11, false, false, false, i12, null, 92, null) + ' ' + str;
        }
        if (!z12 || StringsKt.contains$default((CharSequence) str2, (CharSequence) "<", false, 2, (Object) null)) {
            return str2;
        }
        return "≈ " + str2;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m89933g(BigDecimal bigDecimal, String str, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = C41016c.m89965c();
        }
        if ((i12 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 4) != 0) {
            i11 = bigDecimal.compareTo(new BigDecimal("0.01")) >= 0 ? 2 : 6;
        }
        if ((i12 & 8) != 0) {
            z11 = true;
        }
        if ((i12 & 16) != 0) {
            z12 = false;
        }
        return m89932f(bigDecimal, str, roundingMode, i11, z11, z12, (i12 & 32) != 0 ? false : z13);
    }

    @Deprecated(message = "废弃，使用新的金融规范，bigDecimal.formatPercentRegular()")
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m89934h(@Nullable Double d11, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return m89937k(d11 != null ? new BigDecimal(String.valueOf(d11.doubleValue())) : null, roundingMode, i11, z11, z12, false, 16, null);
    }

    @Deprecated(message = "废弃，使用新的金融规范，bigDecimal.formatPercentRegular()")
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m89935i(@Nullable BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        if (bigDecimal == null) {
            return "- -";
        }
        String str = "";
        if (z12 && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            str = "+";
        }
        BigDecimal bigDecimalM66641a = C27039d.m66641a(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM66641a, "double2Percent(...)");
        String strM89946t = m89946t(bigDecimalM66641a, roundingMode, i11, z11, z13, false, false, false, null, 0, 432, null);
        if (!C5303w0.m6511a()) {
            return str + strM89946t + '%';
        }
        if (StringsKt.startsWith$default(strM89946t, C33820nf.f71144W, false, 2, (Object) null)) {
            return '%' + StringsKt.replaceFirst$default(strM89946t, C33820nf.f71144W, "", false, 4, (Object) null) + '-';
        }
        return '%' + strM89946t + str;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m89936j(Double d11, RoundingMode roundingMode, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        return m89934h(d11, roundingMode, i11, z11, z12);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ String m89937k(BigDecimal bigDecimal, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            z12 = true;
        }
        return m89935i(bigDecimal, roundingMode, i11, z11, z12, (i12 & 16) != 0 ? false : z13);
    }

    /* JADX INFO: renamed from: l */
    public static final double m89938l(@NotNull BigDecimal bigDecimal, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Double dM89969g = C41016c.m89969g(str);
        if (dM89969g == null) {
            return 0.0d;
        }
        return C27021e.m66523b(bigDecimal.doubleValue(), dM89969g.doubleValue());
    }

    /* JADX INFO: renamed from: n */
    public static final double m89940n(@NotNull BigDecimal bigDecimal, @Nullable String str) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return m89939m(bigDecimal.doubleValue(), str);
    }

    @Deprecated(message = "废弃，使用新的金融规范，bigDecimal.formatNumber()")
    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m89941o(double d11, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull String zeroStr) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        return m89942p(String.valueOf(d11), roundingMode, i11, z11, z12, z13, z14, z15, zeroStr);
    }

    @Deprecated(message = "废弃，使用新的金融规范，bigDecimal.formatNumber()")
    @NotNull
    /* JADX INFO: renamed from: p */
    public static final String m89942p(@NotNull String str, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull String zeroStr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        return m89946t(new BigDecimal(str), roundingMode, i11, z11, z12, z13, z14, z15, zeroStr, 0, 256, null);
    }

    @Deprecated(message = "废弃，使用新的金融规范，bigDecimal.formatNumber()")
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m89943q(@NotNull BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull String zeroStr, int i12) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        if (bigDecimal.doubleValue() == 0.0d && !z15) {
            return zeroStr;
        }
        a aVar = f91237a;
        NumberFormat numberFormat = aVar.get();
        if (numberFormat == null) {
            numberFormat = NumberFormat.getInstance(Locale.ENGLISH);
            aVar.set(numberFormat);
        }
        numberFormat.setRoundingMode(roundingMode);
        numberFormat.setGroupingUsed(z11);
        numberFormat.setMaximumFractionDigits(i11);
        if (z12) {
            numberFormat.setMinimumFractionDigits(i11);
        } else {
            numberFormat.setMinimumFractionDigits(i12);
        }
        if (z14 && bigDecimal.doubleValue() != 0.0d && Math.abs(bigDecimal.doubleValue()) < Math.pow(10.0d, -numberFormat.getMaximumFractionDigits())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bigDecimal.doubleValue() < 0.0d ? ">-" : "<");
            sb2.append(numberFormat.format(new BigDecimal(C6447a.m11724a(new BigDecimal("0.1").pow(numberFormat.getMaximumFractionDigits())).toPlainString())));
            return sb2.toString();
        }
        String str = numberFormat.format(bigDecimal);
        if (!z13) {
            Intrinsics.checkNotNull(str);
            return str;
        }
        Intrinsics.checkNotNull(str);
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "<", false, 2, (Object) null)) {
            return str;
        }
        return "≈ " + str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ String m89945s(String str, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        if ((i12 & 16) != 0) {
            z13 = false;
        }
        if ((i12 & 32) != 0) {
            z14 = false;
        }
        if ((i12 & 64) != 0) {
            z15 = true;
        }
        if ((i12 & 128) != 0) {
            str2 = "0.00";
        }
        boolean z16 = z15;
        String str3 = str2;
        return m89942p(str, roundingMode, i11, z11, z12, z13, z14, z16, str3);
    }

    @Deprecated(message = "请直接使用 formatLegalPrice 方法")
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final String m89947u(double d11, @Nullable String str, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return m89932f(new BigDecimal(String.valueOf(d11)), str, roundingMode, i11, z11, z12, z13);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m89948v(double d11, String str, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        int i13;
        String strM89965c = (i12 & 1) != 0 ? C41016c.m89965c() : str;
        RoundingMode roundingMode2 = (i12 & 2) != 0 ? RoundingMode.DOWN : roundingMode;
        if ((i12 & 4) != 0) {
            i13 = d11 >= 0.01d ? 2 : 6;
        } else {
            i13 = i11;
        }
        return m89947u(d11, strM89965c, roundingMode2, i13, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
    }

    @Deprecated(message = "直接使用 formatLegalPrice方法，参数showBySymbol=true，千分位和保留末尾0不暴露，默认规范值")
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m89949w(double d11, @Nullable String str, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        return m89932f(new BigDecimal(String.valueOf(d11)), str, roundingMode, i11, z11, z12, true);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m89950x(double d11, String str, RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, int i12, Object obj) {
        int i13;
        String strM89965c = (i12 & 1) != 0 ? C41016c.m89965c() : str;
        RoundingMode roundingMode2 = (i12 & 2) != 0 ? RoundingMode.DOWN : roundingMode;
        if ((i12 & 4) != 0) {
            i13 = d11 >= 0.01d ? 2 : 6;
        } else {
            i13 = i11;
        }
        return m89949w(d11, strM89965c, roundingMode2, i13, (i12 & 8) != 0 ? true : z11, (i12 & 16) != 0 ? false : z12, (i12 & 32) == 0 ? z13 : true, (i12 & 64) != 0 ? false : z14);
    }

    /* JADX INFO: renamed from: y */
    public static final int m89951y(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        BigDecimal bigDecimalM66641a = C27039d.m66641a(bigDecimalAbs);
        if (bigDecimalM66641a.compareTo(new BigDecimal(1000)) >= 0) {
            return 0;
        }
        return (bigDecimalM66641a.compareTo(new BigDecimal(1000)) >= 0 || bigDecimalM66641a.compareTo(new BigDecimal(100)) < 0) ? 2 : 1;
    }

    /* JADX INFO: renamed from: z */
    public static final int m89952z(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        NumberUtils.Companion companion = NumberUtils.INSTANCE;
        String plainString = C6447a.m11724a(bigDecimal).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return companion.getPrecisionByPoint(plainString);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m89920E(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2) {
        return !m89927a(bigDecimal, bigDecimal2);
    }

    /* JADX INFO: renamed from: m */
    public static final double m89939m(double d11, @Nullable String str) {
        try {
            return C41016c.m89969g(C27041f.m66668h(str)).doubleValue() * d11;
        } catch (Exception unused) {
            return -1.0d;
        }
    }
}
