package p852kotlin;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.flutter.embedding.android.KeyboardMap;
import okhttp3.internal.p505ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import p852kotlin.internal.InlineOnly;
import p852kotlin.internal.IntrinsicConstEvaluation;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.ranges.ULongRange;
import p852kotlin.ranges.URangesKt;

/* JADX INFO: compiled from: ULong.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.5")
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001{B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b \u0010\u0018J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b!\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u001eJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b%\u0010\u0018J\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b&\u0010\u001aJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b'\u0010\u001cJ\u0018\u0010$\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u001eJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b*\u0010\u0018J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b+\u0010\u001aJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b,\u0010\u001cJ\u0018\u0010)\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u001eJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b/\u0010\u0018J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b0\u0010\u001aJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\n¢\u0006\u0004\b1\u0010\u001cJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b2\u0010\u001eJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b4\u0010\u0018J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b5\u0010\u001aJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b6\u0010\u001cJ\u0018\u00103\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b7\u0010\u001eJ\u0018\u00108\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b9\u0010:J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b;\u0010<J\u0018\u00108\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b=\u0010\u0013J\u0018\u00108\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b>\u0010\u001eJ\u0010\u0010?\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010\u0005J\u0010\u0010A\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010\u0005J\u0018\u0010C\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010FJ\u0018\u0010G\u001a\u00020D2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bH\u0010FJ\u0018\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bK\u0010\u001cJ\u0018\u0010L\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\tH\u0087\f¢\u0006\u0004\bM\u0010\u001cJ\u0018\u0010N\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bO\u0010\u001eJ\u0018\u0010P\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bQ\u0010\u001eJ\u0018\u0010R\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bS\u0010\u001eJ\u0010\u0010T\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bU\u0010\u0005J\u0010\u0010V\u001a\u00020WH\u0087\b¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020[H\u0087\b¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\tH\u0087\b¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010\u0005J\u0010\u0010c\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\bd\u0010YJ\u0010\u0010e\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\bf\u0010]J\u0010\u0010g\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\bh\u0010`J\u0010\u0010i\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bj\u0010\u0005J\u0010\u0010k\u001a\u00020lH\u0087\b¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020pH\u0087\b¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020tH\u0016¢\u0006\u0004\bu\u0010vJ\u0013\u0010w\u001a\u00020x2\b\u0010\n\u001a\u0004\u0018\u00010yHÖ\u0003J\t\u0010z\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006|"}, m90084d2 = {"Lkotlin/ULong;", "", "data", "", "constructor-impl", "(J)J", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(JB)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "plus", "plus-7apg3OU", "(JB)J", "plus-xj2QHRw", "(JS)J", "plus-WZ4Q5Ns", "(JI)J", "plus-VKZWuLQ", "(JJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(JB)B", "mod-xj2QHRw", "(JS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-s-VKNKU", "dec", "dec-s-VKNKU", "rangeTo", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeUntil", "rangeUntil-VKZWuLQ", "shl", "bitCount", "shl-s-VKNKU", "shr", "shr-s-VKNKU", "and", "and-VKZWuLQ", "or", "or-VKZWuLQ", "xor", "xor-VKZWuLQ", "inv", "inv-s-VKNKU", "toByte", "", "toByte-impl", "(J)B", "toShort", "", "toShort-impl", "(J)S", "toInt", "toInt-impl", "(J)I", "toLong", "toLong-impl", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(J)F", "toDouble", "", "toDouble-impl", "(J)D", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmInline
public final class ULong implements Comparable<ULong> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* JADX INFO: compiled from: ULong.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lkotlin/ULong$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/ULong;", "J", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m104011andVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 & j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m104013compareTo7apg3OU(long j11, byte b11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, m104018constructorimpl(((long) b11) & 255) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m104014compareToVKZWuLQ(long j11) {
        return UnsignedKt.ulongCompare(getData(), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m104016compareToWZ4Q5Ns(long j11, int i11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m104017compareToxj2QHRw(long j11, short s11) {
        return Long.compare(j11 ^ Long.MIN_VALUE, m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m104020div7apg3OU(long j11, byte b11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m104022divWZ4Q5Ns(long j11, int i11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m104023divxj2QHRw(long j11, short s11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m104026floorDiv7apg3OU(long j11, byte b11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m104028floorDivWZ4Q5Ns(long j11, int i11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m104029floorDivxj2QHRw(long j11, short s11) {
        return C41154d.m90129a(j11, m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m104032invsVKNKU(long j11) {
        return m104018constructorimpl(~j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m104033minus7apg3OU(long j11, byte b11) {
        return m104018constructorimpl(j11 - m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m104034minusVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 - j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m104035minusWZ4Q5Ns(long j11, int i11) {
        return m104018constructorimpl(j11 - m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m104036minusxj2QHRw(long j11, short s11) {
        return m104018constructorimpl(j11 - m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m104037mod7apg3OU(long j11, byte b11) {
        return UByte.m103862constructorimpl((byte) C41091c.m90094a(j11, m104018constructorimpl(((long) b11) & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m104039modWZ4Q5Ns(long j11, int i11) {
        return UInt.m103939constructorimpl((int) C41091c.m90094a(j11, m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m104040modxj2QHRw(long j11, short s11) {
        return UShort.m104125constructorimpl((short) C41091c.m90094a(j11, m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m104041orVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 | j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m104042plus7apg3OU(long j11, byte b11) {
        return m104018constructorimpl(j11 + m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m104043plusVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 + j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m104044plusWZ4Q5Ns(long j11, int i11) {
        return m104018constructorimpl(j11 + m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m104045plusxj2QHRw(long j11, short s11) {
        return m104018constructorimpl(j11 + m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m104048rem7apg3OU(long j11, byte b11) {
        return C41091c.m90094a(j11, m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m104050remWZ4Q5Ns(long j11, int i11) {
        return C41091c.m90094a(j11, m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m104051remxj2QHRw(long j11, short s11) {
        return C41091c.m90094a(j11, m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m104052shlsVKNKU(long j11, int i11) {
        return m104018constructorimpl(j11 << i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m104053shrsVKNKU(long j11, int i11) {
        return m104018constructorimpl(j11 >>> i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m104054times7apg3OU(long j11, byte b11) {
        return m104018constructorimpl(j11 * m104018constructorimpl(((long) b11) & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m104055timesVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 * j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m104056timesWZ4Q5Ns(long j11, int i11) {
        return m104018constructorimpl(j11 * m104018constructorimpl(((long) i11) & KeyboardMap.kValueMask));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m104057timesxj2QHRw(long j11, short s11) {
        return m104018constructorimpl(j11 * m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m104058toByteimpl(long j11) {
        return (byte) j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m104061toIntimpl(long j11) {
        return (int) j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m104063toShortimpl(long j11) {
        return (short) j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m104065toUBytew2LRezQ(long j11) {
        return UByte.m103862constructorimpl((byte) j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m104066toUIntpVg5ArA(long j11) {
        return UInt.m103939constructorimpl((int) j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m104068toUShortMh2AYeg(long j11) {
        return UShort.m104125constructorimpl((short) j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m104069xorVKZWuLQ(long j11, long j12) {
        return m104018constructorimpl(j11 ^ j12);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m104012boximpl(long j11) {
        return new ULong(j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m104015compareToVKZWuLQ(long j11, long j12) {
        return UnsignedKt.ulongCompare(j11, j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m104019decsVKNKU(long j11) {
        return m104018constructorimpl(j11 - 1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m104024equalsimpl(long j11, Object obj) {
        return (obj instanceof ULong) && j11 == ((ULong) obj).getData();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m104025equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m104031incsVKNKU(long j11) {
        return m104018constructorimpl(j11 + 1);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m104046rangeToVKZWuLQ(long j11, long j12) {
        return new ULongRange(j11, j12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m104064toStringimpl(long j11) {
        return UnsignedKt.ulongToString(j11, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    public boolean equals(Object other) {
        return m104024equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m104030hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m104064toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j11) {
        this.data = j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m104021divVKZWuLQ(long j11, long j12) {
        return UnsignedKt.m104197ulongDivideeb3DHEI(j11, j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m104027floorDivVKZWuLQ(long j11, long j12) {
        return C41154d.m90129a(j11, j12);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m104030hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m104038modVKZWuLQ(long j11, long j12) {
        return C41091c.m90094a(j11, j12);
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m104047rangeUntilVKZWuLQ(long j11, long j12) {
        return URangesKt.m105113untileb3DHEI(j11, j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m104049remVKZWuLQ(long j11, long j12) {
        return UnsignedKt.m104198ulongRemaindereb3DHEI(j11, j12);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m104059toDoubleimpl(long j11) {
        return UnsignedKt.ulongToDouble(j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m104060toFloatimpl(long j11) {
        return (float) UnsignedKt.ulongToDouble(j11);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m104018constructorimpl(long j11) {
        return j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m104062toLongimpl(long j11) {
        return j11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m104067toULongsVKNKU(long j11) {
        return j11;
    }
}
