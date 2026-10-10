package p852kotlin;

import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: UNumbers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0087\b¢\u0006\u0004\b\b\u0010\u0004\u001a\u0014\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\n\u0010\u0004\u001a\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0087\b¢\u0006\u0004\b\f\u0010\u0004\u001a\u001c\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\t\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u000b\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001c\u0010\r\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u0011\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\"\u0010 \u001a\u0014\u0010\t\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010\u000b\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u001c\u0010\r\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010\u0011\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b-\u0010+\u001a\u0014\u0010\t\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u0010\u000b\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b0\u0010/\u001a\u001c\u0010\r\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u0010\u0011\u001a\u00020)*\u00020)2\u0006\u0010\u000e\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b3\u00102¨\u00064"}, m90084d2 = {"countOneBits", "", "Lkotlin/UInt;", "countOneBits-WZ4Q5Ns", "(I)I", "countLeadingZeroBits", "countLeadingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "takeHighestOneBit", "takeHighestOneBit-WZ4Q5Ns", "takeLowestOneBit", "takeLowestOneBit-WZ4Q5Ns", "rotateLeft", "bitCount", "rotateLeft-V7xB4Y4", "(II)I", "rotateRight", "rotateRight-V7xB4Y4", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "UNumbersKt")
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m104090countLeadingZeroBits7apg3OU(byte b11) {
        return Integer.numberOfLeadingZeros(b11 & 255) - 24;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m104094countOneBits7apg3OU(byte b11) {
        return Integer.bitCount(UInt.m103939constructorimpl(b11 & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m104098countTrailingZeroBits7apg3OU(byte b11) {
        return Integer.numberOfTrailingZeros(b11 | 256);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m104101countTrailingZeroBitsxj2QHRw(short s11) {
        return Integer.numberOfTrailingZeros(s11 | 65536);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m104110takeHighestOneBit7apg3OU(byte b11) {
        return UByte.m103862constructorimpl((byte) Integer.highestOneBit(b11 & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m104114takeLowestOneBit7apg3OU(byte b11) {
        return UByte.m103862constructorimpl((byte) Integer.lowestOneBit(b11 & 255));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m104091countLeadingZeroBitsVKZWuLQ(long j11) {
        return Long.numberOfLeadingZeros(j11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m104092countLeadingZeroBitsWZ4Q5Ns(int i11) {
        return Integer.numberOfLeadingZeros(i11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m104093countLeadingZeroBitsxj2QHRw(short s11) {
        return Integer.numberOfLeadingZeros(s11 & UShort.MAX_VALUE) - 16;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m104095countOneBitsVKZWuLQ(long j11) {
        return Long.bitCount(j11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m104096countOneBitsWZ4Q5Ns(int i11) {
        return Integer.bitCount(i11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m104097countOneBitsxj2QHRw(short s11) {
        return Integer.bitCount(UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m104099countTrailingZeroBitsVKZWuLQ(long j11) {
        return Long.numberOfTrailingZeros(j11);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m104100countTrailingZeroBitsWZ4Q5Ns(int i11) {
        return Integer.numberOfTrailingZeros(i11);
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m104102rotateLeftJSWoG40(long j11, int i11) {
        return ULong.m104018constructorimpl(Long.rotateLeft(j11, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m104103rotateLeftLxnNnR4(byte b11, int i11) {
        return UByte.m103862constructorimpl(NumbersKt__NumbersKt.rotateLeft(b11, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m104104rotateLeftV7xB4Y4(int i11, int i12) {
        return UInt.m103939constructorimpl(Integer.rotateLeft(i11, i12));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m104105rotateLeftolVBNx4(short s11, int i11) {
        return UShort.m104125constructorimpl(NumbersKt__NumbersKt.rotateLeft(s11, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m104106rotateRightJSWoG40(long j11, int i11) {
        return ULong.m104018constructorimpl(Long.rotateRight(j11, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m104107rotateRightLxnNnR4(byte b11, int i11) {
        return UByte.m103862constructorimpl(NumbersKt__NumbersKt.rotateRight(b11, i11));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m104108rotateRightV7xB4Y4(int i11, int i12) {
        return UInt.m103939constructorimpl(Integer.rotateRight(i11, i12));
    }

    @SinceKotlin(version = "1.6")
    @InlineOnly
    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m104109rotateRightolVBNx4(short s11, int i11) {
        return UShort.m104125constructorimpl(NumbersKt__NumbersKt.rotateRight(s11, i11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m104111takeHighestOneBitVKZWuLQ(long j11) {
        return ULong.m104018constructorimpl(Long.highestOneBit(j11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m104112takeHighestOneBitWZ4Q5Ns(int i11) {
        return UInt.m103939constructorimpl(Integer.highestOneBit(i11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m104113takeHighestOneBitxj2QHRw(short s11) {
        return UShort.m104125constructorimpl((short) Integer.highestOneBit(s11 & UShort.MAX_VALUE));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m104115takeLowestOneBitVKZWuLQ(long j11) {
        return ULong.m104018constructorimpl(Long.lowestOneBit(j11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m104116takeLowestOneBitWZ4Q5Ns(int i11) {
        return UInt.m103939constructorimpl(Integer.lowestOneBit(i11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m104117takeLowestOneBitxj2QHRw(short s11) {
        return UShort.m104125constructorimpl((short) Integer.lowestOneBit(s11 & UShort.MAX_VALUE));
    }
}
