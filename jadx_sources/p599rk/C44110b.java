package p599rk;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.kmm.trade.KMMRoundingMode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: rk.b */
/* JADX INFO: compiled from: Platform.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m90084d2 = {"Lrk/b;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "decimal", "(Ljava/math/BigDecimal;)V", "other", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lrk/b;)Lrk/b;", "g", "e", "", "scale", "Lcom/kubi/kmm/trade/KMMRoundingMode;", "roundingMode", "c", "(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;", "toString", "()Ljava/lang/String;", "b", "(Lrk/b;)I", "newScale", "f", "(ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()D", "Ljava/math/RoundingMode;", "i", "(Lcom/kubi/kmm/trade/KMMRoundingMode;)Ljava/math/RoundingMode;", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "shared_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPlatform.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.android.kt\ncom/kubi/kmm/trade/KMMBigDecimal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,100:1\n1#2:101\n30#3,4:102\n*S KotlinDebug\n*F\n+ 1 Platform.android.kt\ncom/kubi/kmm/trade/KMMBigDecimal\n*L\n80#1:102,4\n*E\n"})
public final class C44110b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BigDecimal decimal;

    public C44110b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (StringsKt.isBlank(value)) {
            throw new IllegalArgumentException("Value cannot be blank");
        }
        this.decimal = new BigDecimal(value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(C44110b.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.kmm.trade.KMMBigDecimal");
        return this.decimal.compareTo(((C44110b) other).decimal) == 0;
    }

    /* JADX INFO: renamed from: rk.b$a */
    /* JADX INFO: compiled from: Platform.android.kt */
    /* JADX INFO: loaded from: classes17.dex */
    @Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KMMRoundingMode.values().length];
            try {
                iArr[KMMRoundingMode.HALF_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KMMRoundingMode.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KMMRoundingMode.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C44110b m97181a(@NotNull C44110b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalAdd = this.decimal.add(other.decimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return new C44110b(bigDecimalAdd);
    }

    /* JADX INFO: renamed from: b */
    public final int m97182b(@NotNull C44110b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.decimal.compareTo(other.decimal);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C44110b m97183c(@NotNull C44110b other, int scale, @NotNull KMMRoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal bigDecimalDivide = this.decimal.divide(other.decimal, scale, m97189i(roundingMode));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return new C44110b(bigDecimalDivide);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BigDecimal getDecimal() {
        return this.decimal;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C44110b m97185e(@NotNull C44110b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalMultiply = this.decimal.multiply(other.decimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new C44110b(bigDecimalMultiply);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final C44110b m97186f(int newScale, @NotNull KMMRoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        BigDecimal scale = this.decimal.setScale(newScale, m97189i(roundingMode));
        Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
        return new C44110b(scale);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C44110b m97187g(@NotNull C44110b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        BigDecimal bigDecimalSubtract = this.decimal.subtract(other.decimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new C44110b(bigDecimalSubtract);
    }

    /* JADX INFO: renamed from: h */
    public final double m97188h() {
        return this.decimal.doubleValue();
    }

    public int hashCode() {
        return C6447a.m11724a(this.decimal).hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final RoundingMode m97189i(KMMRoundingMode kMMRoundingMode) {
        int i11 = a.$EnumSwitchMapping$0[kMMRoundingMode.ordinal()];
        if (i11 == 1) {
            return RoundingMode.HALF_UP;
        }
        if (i11 == 2) {
            return RoundingMode.UP;
        }
        if (i11 == 3) {
            return RoundingMode.DOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public String toString() {
        String plainString = C6447a.m11724a(this.decimal).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    public C44110b(@NotNull BigDecimal decimal) {
        Intrinsics.checkNotNullParameter(decimal, "decimal");
        this.decimal = decimal;
    }
}
