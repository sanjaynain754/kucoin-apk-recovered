package p852kotlin.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0007\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0087\n\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\r*\u00020\u0002¨\u0006\u0010"}, m90084d2 = {"digitToInt", "", "", "radix", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "digitToChar", "titlecase", "", "plus", "other", "equals", "", "ignoreCase", "isSurrogate", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/text/CharsKt")
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i11) {
        if (i11 >= 0 && i11 < 10) {
            return (char) (i11 + 48);
        }
        throw new IllegalArgumentException("Int " + i11 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static int digitToInt(char c11) {
        int iDigitOf = CharsKt__CharJVMKt.digitOf(c11, 10);
        if (iDigitOf >= 0) {
            return iDigitOf;
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char c11) {
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c11, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static boolean equals(char c11, char c12, boolean z11) {
        if (c11 == c12) {
            return true;
        }
        if (!z11) {
            return false;
        }
        char upperCase = Character.toUpperCase(c11);
        char upperCase2 = Character.toUpperCase(c12);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int i11, int i12) {
        if (2 > i12 || i12 >= 37) {
            throw new IllegalArgumentException("Invalid radix: " + i12 + ". Valid radix values are in range 2..36");
        }
        if (i11 >= 0 && i11 < i12) {
            return (char) (i11 < 10 ? i11 + 48 : ((char) (i11 + 65)) - '\n');
        }
        throw new IllegalArgumentException("Digit " + i11 + " does not represent a valid digit in radix " + i12);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char c11, int i11) {
        CharsKt__CharJVMKt.checkRadix(i11);
        Integer numValueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c11, i11));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static /* synthetic */ boolean equals$default(char c11, char c12, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return equals(c11, c12, z11);
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char c11, int i11) {
        Integer numDigitToIntOrNull = digitToIntOrNull(c11, i11);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c11 + " is not a digit in the given radix=" + i11);
    }

    public static final boolean isSurrogate(char c11) {
        if (55296 > c11 || c11 >= 57344) {
            return false;
        }
        return true;
    }

    @InlineOnly
    private static final String plus(char c11, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c11 + other;
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static String titlecase(char c11) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c11);
    }
}
