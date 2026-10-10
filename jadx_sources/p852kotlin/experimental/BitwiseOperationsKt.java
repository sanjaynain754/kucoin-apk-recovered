package p852kotlin.experimental;

import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: bitwiseOperations.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0003\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\u0015\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0087\f\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0006H\u0087\b¨\u0006\u0007"}, m90084d2 = {"and", "", "other", "or", "xor", "inv", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte b11, byte b12) {
        return (byte) (b11 & b12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte b11) {
        return (byte) (~b11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* JADX INFO: renamed from: or */
    private static final byte m90130or(byte b11, byte b12) {
        return (byte) (b11 | b12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte b11, byte b12) {
        return (byte) (b11 ^ b12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short s11, short s12) {
        return (short) (s11 & s12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short s11) {
        return (short) (~s11);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* JADX INFO: renamed from: or */
    private static final short m90131or(short s11, short s12) {
        return (short) (s11 | s12);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short s11, short s12) {
        return (short) (s11 ^ s12);
    }
}
