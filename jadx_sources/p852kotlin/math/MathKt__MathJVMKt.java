package p852kotlin.math;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.AuthenticationTokenClaims;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0019\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010#\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u00012\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020\u0001*\u00020\u00012\u0006\u0010)\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00101\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u00106\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00012\u0006\u00108\u001a\u00020\u0001H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020\u0001H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020\u0001H\u0007\u001a\u0011\u0010\u0000\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\b\u001a\u00020<2\u0006\u0010\t\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\n\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\r\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010\u0010\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\t\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0013\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010\u0015\u001a\u00020<H\u0007\u001a\u0011\u0010\u0016\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u0017\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u0018\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u0019\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0007\u001a\u0011\u0010\u001d\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0011\u0010\u001f\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0019\u0010 \u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0019\u0010#\u001a\u00020<2\u0006\u0010!\u001a\u00020<2\u0006\u0010\"\u001a\u00020<H\u0087\b\u001a\u0011\u0010$\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010\u0002\u001a\u00020<H\u0087\b\u001a\u0015\u0010%\u001a\u00020<*\u00020<2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0015\u0010(\u001a\u00020<*\u00020<2\u0006\u0010)\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020<H\u0087\b\u001a\u0015\u00101\u001a\u00020<*\u00020<2\u0006\u0010\u001f\u001a\u00020'H\u0087\b\u001a\r\u00105\u001a\u00020<*\u00020<H\u0087\b\u001a\r\u00106\u001a\u00020<*\u00020<H\u0087\b\u001a\u0015\u00107\u001a\u00020<*\u00020<2\u0006\u00108\u001a\u00020<H\u0087\b\u001a\f\u00109\u001a\u00020'*\u00020<H\u0007\u001a\f\u0010:\u001a\u00020;*\u00020<H\u0007\u001a\u0011\u0010\u001e\u001a\u00020'2\u0006\u0010&\u001a\u00020'H\u0087\b\u001a\u0019\u0010 \u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0019\u0010#\u001a\u00020'2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020'H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020;2\u0006\u0010&\u001a\u00020;H\u0087\b\u001a\u0019\u0010 \u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\u001a\u0019\u0010#\u001a\u00020;2\u0006\u0010!\u001a\u00020;2\u0006\u0010\"\u001a\u00020;H\u0087\b\"\u001f\u0010*\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u001f\u0010\u001f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010,\u001a\u0004\b0\u0010.\"\u001f\u00102\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u001f\u0010*\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010=\u001a\u0004\b-\u0010>\"\u001f\u0010\u001f\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010=\u001a\u0004\b0\u0010>\"\u001f\u00102\u001a\u00020<*\u00020<8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010=\u001a\u0004\b4\u0010>\"\u001f\u0010*\u001a\u00020'*\u00020'8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010?\u001a\u0004\b-\u0010@\"\u001e\u0010\u001f\u001a\u00020'*\u00020'8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010?\u001a\u0004\b0\u0010@\"\u001f\u0010*\u001a\u00020;*\u00020;8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010A\u001a\u0004\b-\u0010B\"\u001e\u0010\u001f\u001a\u00020'*\u00020;8FX\u0087\u0004¢\u0006\f\u0012\u0004\b/\u0010A\u001a\u0004\b0\u0010C¨\u0006D"}, m90084d2 = {"sin", "", "x", "cos", "tan", "asin", "acos", "atan", "atan2", "y", "sinh", "cosh", "tanh", "asinh", "acosh", "atanh", "hypot", "sqrt", AuthenticationTokenClaims.JSON_KEY_EXP, "expm1", "log", TtmlNode.RUBY_BASE, "ln", "log10", "log2", "ln1p", "ceil", "floor", "truncate", "round", "abs", "sign", "min", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "max", "cbrt", "pow", "n", "", "IEEErem", "divisor", "absoluteValue", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "getSign$annotations", "getSign", "withSign", "ulp", "getUlp$annotations", "getUlp", "nextUp", "nextDown", "nextTowards", TypedValues.TransitionType.S_TO, "roundToInt", "roundToLong", "", "", "(F)V", "(F)F", "(I)V", "(I)I", "(J)V", "(J)J", "(J)I", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/math/MathKt")
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d11, double d12) {
        return Math.IEEEremainder(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d11) {
        return Math.abs(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d11) {
        return Math.acos(d11);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d11) {
        if (d11 < 1.0d) {
            return Double.NaN;
        }
        if (d11 > Constants.upper_taylor_2_bound) {
            return Math.log(d11) + Constants.LN2;
        }
        double d12 = 1;
        double d13 = d11 - d12;
        if (d13 >= Constants.taylor_n_bound) {
            return Math.log(d11 + Math.sqrt((d11 * d11) - d12));
        }
        double dSqrt = Math.sqrt(d13);
        if (dSqrt >= Constants.taylor_2_bound) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return Math.sqrt(2.0d) * dSqrt;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d11) {
        return Math.asin(d11);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d11) {
        double d12 = Constants.taylor_n_bound;
        if (d11 < d12) {
            if (d11 <= (-d12)) {
                return -asinh(-d11);
            }
            return Math.abs(d11) >= Constants.taylor_2_bound ? d11 - (((d11 * d11) * d11) / ((double) 6)) : d11;
        }
        if (d11 <= Constants.upper_taylor_n_bound) {
            return Math.log(d11 + Math.sqrt((d11 * d11) + ((double) 1)));
        }
        if (d11 > Constants.upper_taylor_2_bound) {
            return Math.log(d11) + Constants.LN2;
        }
        double d13 = d11 * ((double) 2);
        return Math.log(d13 + (((double) 1) / d13));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d11) {
        return Math.atan(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d11, double d12) {
        return Math.atan2(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d11) {
        if (Math.abs(d11) < Constants.taylor_n_bound) {
            return Math.abs(d11) > Constants.taylor_2_bound ? d11 + (((d11 * d11) * d11) / ((double) 3)) : d11;
        }
        double d12 = 1;
        return Math.log((d12 + d11) / (d12 - d11)) / ((double) 2);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final double cbrt(double d11) {
        return Math.cbrt(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d11) {
        return Math.ceil(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d11) {
        return Math.cos(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d11) {
        return Math.cosh(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d11) {
        return Math.exp(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d11) {
        return Math.expm1(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d11) {
        return Math.floor(d11);
    }

    private static final double getAbsoluteValue(double d11) {
        return Math.abs(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d11) {
    }

    private static final double getSign(double d11) {
        return Math.signum(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d11) {
    }

    private static final double getUlp(double d11) {
        return Math.ulp(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d11) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d11, double d12) {
        return Math.hypot(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* JADX INFO: renamed from: ln */
    private static final double m90232ln(double d11) {
        return Math.log(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d11) {
        return Math.log1p(d11);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d11, double d12) {
        if (d12 <= 0.0d || d12 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d11) / Math.log(d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d11) {
        return Math.log10(d11);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d11) {
        return Math.log(d11) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d11, double d12) {
        return Math.max(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d11, double d12) {
        return Math.min(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d11) {
        return Math.nextAfter(d11, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d11, double d12) {
        return Math.nextAfter(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d11) {
        return Math.nextUp(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d11, double d12) {
        return Math.pow(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d11) {
        return Math.rint(d11);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d11 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d11 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d11);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d11) {
        return Math.signum(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d11) {
        return Math.sin(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d11) {
        return Math.sinh(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d11) {
        return Math.sqrt(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d11) {
        return Math.tan(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d11) {
        return Math.tanh(d11);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d11) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            return d11;
        }
        return d11 > 0.0d ? Math.floor(d11) : Math.ceil(d11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d11, double d12) {
        return Math.copySign(d11, d12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f11, float f12) {
        return (float) Math.IEEEremainder(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f11) {
        return Math.abs(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f11) {
        return (float) Math.acos(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f11) {
        return (float) Math.asin(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f11) {
        return (float) Math.atan(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f11, float f12) {
        return (float) Math.atan2(f11, f12);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final float cbrt(float f11) {
        return (float) Math.cbrt(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f11) {
        return (float) Math.ceil(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f11) {
        return (float) Math.cos(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f11) {
        return (float) Math.cosh(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f11) {
        return (float) Math.exp(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f11) {
        return (float) Math.expm1(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f11) {
        return (float) Math.floor(f11);
    }

    private static final float getAbsoluteValue(float f11) {
        return Math.abs(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f11) {
    }

    private static final float getSign(float f11) {
        return Math.signum(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f11) {
    }

    private static final float getUlp(float f11) {
        return Math.ulp(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f11) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f11, float f12) {
        return (float) Math.hypot(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* JADX INFO: renamed from: ln */
    private static final float m90233ln(float f11) {
        return (float) Math.log(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f11) {
        return (float) Math.log1p(f11);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f11, float f12) {
        if (f12 <= 0.0f || f12 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f11) / Math.log(f12));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f11) {
        return (float) Math.log10(f11);
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f11) {
        return (float) (Math.log(f11) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f11, float f12) {
        return Math.max(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f11, float f12) {
        return Math.min(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f11) {
        return Math.nextAfter(f11, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f11, float f12) {
        return Math.nextAfter(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f11) {
        return Math.nextUp(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d11, int i11) {
        return Math.pow(d11, i11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f11) {
        return (float) Math.rint(f11);
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f11) {
        return roundToLong(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f11) {
        return Math.signum(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f11) {
        return (float) Math.sin(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f11) {
        return (float) Math.sinh(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f11) {
        return (float) Math.sqrt(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f11) {
        return (float) Math.tan(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f11) {
        return (float) Math.tanh(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d11, int i11) {
        return Math.copySign(d11, i11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i11) {
        return Math.abs(i11);
    }

    private static final int getAbsoluteValue(int i11) {
        return Math.abs(i11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i11) {
    }

    public static int getSign(int i11) {
        return Integer.signum(i11);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i11) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i11, int i12) {
        return Math.max(i11, i12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i11, int i12) {
        return Math.min(i11, i12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f11, float f12) {
        return (float) Math.pow(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f11, float f12) {
        return Math.copySign(f11, f12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j11) {
        return Math.abs(j11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f11) {
        return (float) atanh(f11);
    }

    private static final long getAbsoluteValue(long j11) {
        return Math.abs(j11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j11) {
    }

    public static int getSign(long j11) {
        return Long.signum(j11);
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j11) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j11, long j12) {
        return Math.max(j11, j12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j11, long j12) {
        return Math.min(j11, j12);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f11, int i11) {
        return (float) Math.pow(f11, i11);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f11) {
        if (Float.isNaN(f11)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f11);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f11) {
        double dCeil;
        if (Float.isNaN(f11) || Float.isInfinite(f11)) {
            return f11;
        }
        if (f11 > 0.0f) {
            dCeil = Math.floor(f11);
        } else {
            dCeil = Math.ceil(f11);
        }
        return (float) dCeil;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f11, int i11) {
        return Math.copySign(f11, i11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f11) {
        return (float) acosh(f11);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f11) {
        return (float) asinh(f11);
    }
}
