package p852kotlin;

import p852kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\n\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\r\u0010\u0005\u001a\u00020\n*\u00020\nH\u0087\b\u001a\r\u0010\u0006\u001a\u00020\n*\u00020\nH\u0087\b\u001a\u0014\u0010\u0007\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0007¨\u0006\u000b"}, m90084d2 = {"countOneBits", "", "", "countLeadingZeroBits", "countTrailingZeroBits", "takeHighestOneBit", "takeLowestOneBit", "rotateLeft", "bitCount", "rotateRight", "", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/NumbersKt")
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(byte b11) {
        return Integer.numberOfLeadingZeros(b11 & 255) - 24;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(byte b11) {
        return Integer.bitCount(b11 & 255);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(byte b11) {
        return Integer.numberOfTrailingZeros(b11 | 256);
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateLeft(byte b11, int i11) {
        int i12 = i11 & 7;
        return (byte) (((b11 & 255) >>> (8 - i12)) | (b11 << i12));
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateRight(byte b11, int i11) {
        int i12 = i11 & 7;
        return (byte) (((b11 & 255) >>> i12) | (b11 << (8 - i12)));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeHighestOneBit(byte b11) {
        return (byte) Integer.highestOneBit(b11 & 255);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeLowestOneBit(byte b11) {
        return (byte) Integer.lowestOneBit(b11);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(short s11) {
        return Integer.numberOfLeadingZeros(s11 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(short s11) {
        return Integer.bitCount(s11 & UShort.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(short s11) {
        return Integer.numberOfTrailingZeros(s11 | 65536);
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateLeft(short s11, int i11) {
        int i12 = i11 & 15;
        return (short) (((s11 & 65535) >>> (16 - i12)) | (s11 << i12));
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateRight(short s11, int i11) {
        int i12 = i11 & 15;
        return (short) (((s11 & 65535) >>> i12) | (s11 << (16 - i12)));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeHighestOneBit(short s11) {
        return (short) Integer.highestOneBit(s11 & UShort.MAX_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeLowestOneBit(short s11) {
        return (short) Integer.lowestOneBit(s11);
    }
}
