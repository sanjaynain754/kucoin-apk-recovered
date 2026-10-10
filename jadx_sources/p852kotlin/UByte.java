package p852kotlin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import p852kotlin.internal.InlineOnly;
import p852kotlin.internal.IntrinsicConstEvaluation;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.UIntRange;
import p852kotlin.ranges.URangesKt;

/* JADX INFO: compiled from: UByte.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.5")
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0017\u0010\fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\"\u0010\fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b'\u0010\fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b,\u0010\fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b1\u0010\fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\rH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00107J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00107J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00107J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bO\u0010\u0005J\u0010\u0010P\u001a\u00020QH\u0087\b¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\\\u0010\u0005J\u0010\u0010]\u001a\u00020\rH\u0087\b¢\u0006\u0004\b^\u0010SJ\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, m90084d2 = {"Lkotlin/UByte;", "", "data", "", "constructor-impl", "(B)B", "getData$annotations", "()V", "compareTo", "", "other", "compareTo-7apg3OU", "(BB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(BJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(BB)B", "mod-xj2QHRw", "(BS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-w2LRezQ", "dec", "dec-w2LRezQ", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-7apg3OU", "and", "and-7apg3OU", "or", "or-7apg3OU", "xor", "xor-7apg3OU", "inv", "inv-w2LRezQ", "toByte", "toByte-impl", "toShort", "", "toShort-impl", "(B)S", "toInt", "toInt-impl", "(B)I", "toLong", "", "toLong-impl", "(B)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(B)F", "toDouble", "", "toDouble-impl", "(B)D", "toString", "", "toString-impl", "(B)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmInline
public final class UByte implements Comparable<UByte> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* JADX INFO: compiled from: UByte.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lkotlin/UByte$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/UByte;", "B", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m103855and7apg3OU(byte b11, byte b12) {
        return m103862constructorimpl((byte) (b11 & b12));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m103857compareTo7apg3OU(byte b11) {
        return Intrinsics.compare(getData() & 255, b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m103859compareToVKZWuLQ(byte b11, long j11) {
        return Long.compare(ULong.m104018constructorimpl(((long) b11) & 255) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m103865divVKZWuLQ(byte b11, long j11) {
        return C41154d.m90129a(ULong.m104018constructorimpl(((long) b11) & 255), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m103871floorDivVKZWuLQ(byte b11, long j11) {
        return C41154d.m90129a(ULong.m104018constructorimpl(((long) b11) & 255), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m103876invw2LRezQ(byte b11) {
        return m103862constructorimpl((byte) (~b11));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m103878minusVKZWuLQ(byte b11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) b11) & 255) - j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m103882modVKZWuLQ(byte b11, long j11) {
        return C41091c.m90094a(ULong.m104018constructorimpl(((long) b11) & 255), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m103885or7apg3OU(byte b11, byte b12) {
        return m103862constructorimpl((byte) (b11 | b12));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m103887plusVKZWuLQ(byte b11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) b11) & 255) + j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m103893remVKZWuLQ(byte b11, long j11) {
        return C41091c.m90094a(ULong.m104018constructorimpl(((long) b11) & 255), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m103897timesVKZWuLQ(byte b11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) b11) & 255) * j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m103904toLongimpl(byte b11) {
        return ((long) b11) & 255;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m103905toShortimpl(byte b11) {
        return (short) (b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m103909toULongsVKNKU(byte b11) {
        return ULong.m104018constructorimpl(((long) b11) & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m103910toUShortMh2AYeg(byte b11) {
        return UShort.m104125constructorimpl((short) (b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m103911xor7apg3OU(byte b11, byte b12) {
        return m103862constructorimpl((byte) (b11 ^ b12));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m103856boximpl(byte b11) {
        return new UByte(b11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m103858compareTo7apg3OU(byte b11, byte b12) {
        return Intrinsics.compare(b11 & 255, b12 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m103860compareToWZ4Q5Ns(byte b11, int i11) {
        return Integer.compare(UInt.m103939constructorimpl(b11 & 255) ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m103861compareToxj2QHRw(byte b11, short s11) {
        return Intrinsics.compare(b11 & 255, s11 & UShort.MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m103863decw2LRezQ(byte b11) {
        return m103862constructorimpl((byte) (b11 - 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m103864div7apg3OU(byte b11, byte b12) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m103866divWZ4Q5Ns(byte b11, int i11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m103867divxj2QHRw(byte b11, short s11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m103868equalsimpl(byte b11, Object obj) {
        return (obj instanceof UByte) && b11 == ((UByte) obj).getData();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m103869equalsimpl0(byte b11, byte b12) {
        return b11 == b12;
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m103870floorDiv7apg3OU(byte b11, byte b12) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m103872floorDivWZ4Q5Ns(byte b11, int i11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m103873floorDivxj2QHRw(byte b11, short s11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m103875incw2LRezQ(byte b11) {
        return m103862constructorimpl((byte) (b11 + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m103877minus7apg3OU(byte b11, byte b12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) - UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m103879minusWZ4Q5Ns(byte b11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) - i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m103880minusxj2QHRw(byte b11, short s11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) - UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m103881mod7apg3OU(byte b11, byte b12) {
        return m103862constructorimpl((byte) C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m103883modWZ4Q5Ns(byte b11, int i11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m103884modxj2QHRw(byte b11, short s11) {
        return UShort.m104125constructorimpl((short) C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m103886plus7apg3OU(byte b11, byte b12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) + UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m103888plusWZ4Q5Ns(byte b11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) + i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m103889plusxj2QHRw(byte b11, short s11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) + UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m103890rangeTo7apg3OU(byte b11, byte b12) {
        return new UIntRange(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255), null);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m103891rangeUntil7apg3OU(byte b11, byte b12) {
        return URangesKt.m105111untilJ1ME1BU(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m103892rem7apg3OU(byte b11, byte b12) {
        return C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m103894remWZ4Q5Ns(byte b11, int i11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m103895remxj2QHRw(byte b11, short s11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(b11 & 255), UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m103896times7apg3OU(byte b11, byte b12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) * UInt.m103939constructorimpl(b12 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m103898timesWZ4Q5Ns(byte b11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) * i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m103899timesxj2QHRw(byte b11, short s11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(b11 & 255) * UInt.m103939constructorimpl(s11 & UShort.MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m103901toDoubleimpl(byte b11) {
        return UnsignedKt.uintToDouble(b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m103902toFloatimpl(byte b11) {
        return (float) UnsignedKt.uintToDouble(b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m103903toIntimpl(byte b11) {
        return b11 & 255;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m103906toStringimpl(byte b11) {
        return String.valueOf(b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m103908toUIntpVg5ArA(byte b11) {
        return UInt.m103939constructorimpl(b11 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & 255, uByte.getData() & 255);
    }

    public boolean equals(Object other) {
        return m103868equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m103874hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m103906toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UByte(byte b11) {
        this.data = b11;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m103874hashCodeimpl(byte b11) {
        return Byte.hashCode(b11);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m103862constructorimpl(byte b11) {
        return b11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m103900toByteimpl(byte b11) {
        return b11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m103907toUBytew2LRezQ(byte b11) {
        return b11;
    }
}
