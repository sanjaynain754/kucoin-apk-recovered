package p852kotlin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BigIntegers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\f\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0010H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0013H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0001H\u0087\b\u001a!\u0010\u0014\u001a\u00020\u0015*\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b¨\u0006\u0019"}, m90084d2 = {"plus", "Ljava/math/BigInteger;", "other", "minus", "times", TtmlNode.TAG_DIV, "rem", "unaryMinus", "inc", "dec", "inv", "and", "or", "xor", "shl", "n", "", "shr", "toBigInteger", "", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/NumbersKt")
class NumbersKt__BigIntegersKt extends NumbersKt__BigDecimalsKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(int i11) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i11);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger and(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerAnd = bigInteger.and(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger dec(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @InlineOnly
    private static final BigInteger div(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inc(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger inv(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    @InlineOnly
    private static final BigInteger minus(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    /* JADX INFO: renamed from: or */
    private static final BigInteger m90090or(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerOr = bigInteger.or(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    @InlineOnly
    private static final BigInteger plus(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerAdd = bigInteger.add(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final BigInteger rem(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shl(BigInteger bigInteger, int i11) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i11);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger shr(BigInteger bigInteger, int i11) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i11);
        Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    @InlineOnly
    private static final BigInteger times(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigDecimal toBigDecimal(BigInteger bigInteger, int i11, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i11, mathContext);
    }

    public static /* synthetic */ BigDecimal toBigDecimal$default(BigInteger bigInteger, int i11, MathContext mathContext, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i11, mathContext);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger toBigInteger(long j11) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j11);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @InlineOnly
    private static final BigInteger unaryMinus(BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        Intrinsics.checkNotNullExpressionValue(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final BigInteger xor(BigInteger bigInteger, BigInteger other) {
        Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        BigInteger bigIntegerXor = bigInteger.xor(other);
        Intrinsics.checkNotNullExpressionValue(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }
}
