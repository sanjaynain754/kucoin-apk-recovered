package p852kotlin;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import okhttp3.internal.p505ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import p852kotlin.internal.InlineOnly;
import p852kotlin.internal.IntrinsicConstEvaluation;
import p852kotlin.jvm.JvmInline;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.UIntRange;
import p852kotlin.ranges.URangesKt;

/* JADX INFO: compiled from: UShort.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.5")
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 s2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001sB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0017\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0018\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0019\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001d\u0010\rJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001f\u0010\u0012J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\"\u0010\rJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010!\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b$\u0010\u0012J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b'\u0010\rJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\u000fJ\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b)\u0010\u0012J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b,\u0010\rJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b-\u0010\u000fJ\u0018\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b.\u0010\u0012J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b1\u0010\rJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u0010\u000fJ\u0018\u00100\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b3\u0010\u0012J\u0018\u00100\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00105\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b6\u00107J\u0018\u00105\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00105\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b:\u0010\u0012J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010\u0005J\u0010\u0010>\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b?\u0010\u0005J\u0018\u0010@\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020A2\u0006\u0010\n\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00109J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bI\u00109J\u0018\u0010J\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bK\u00109J\u0010\u0010L\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bM\u0010\u0005J\u0010\u0010N\u001a\u00020OH\u0087\b¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bS\u0010\u0005J\u0010\u0010T\u001a\u00020\tH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010W\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010[\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b\\\u0010QJ\u0010\u0010]\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b^\u0010\u0005J\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b`\u0010VJ\u0010\u0010a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010c\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020lH\u0016¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010\n\u001a\u0004\u0018\u00010qHÖ\u0003J\t\u0010r\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006t"}, m90084d2 = {"Lkotlin/UShort;", "", "data", "", "constructor-impl", "(S)S", "getData$annotations", "()V", "compareTo", "", "other", "Lkotlin/UByte;", "compareTo-7apg3OU", "(SB)I", "compareTo-xj2QHRw", "(SS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(SI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(SJ)I", "plus", "plus-7apg3OU", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(SJ)J", "minus", "minus-7apg3OU", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times", "times-7apg3OU", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", TtmlNode.TAG_DIV, "div-7apg3OU", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem", "rem-7apg3OU", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv", "floorDiv-7apg3OU", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod", "mod-7apg3OU", "(SB)B", "mod-xj2QHRw", "(SS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc", "inc-Mh2AYeg", "dec", "dec-Mh2AYeg", "rangeTo", "Lkotlin/ranges/UIntRange;", "rangeTo-xj2QHRw", "(SS)Lkotlin/ranges/UIntRange;", "rangeUntil", "rangeUntil-xj2QHRw", "and", "and-xj2QHRw", "or", "or-xj2QHRw", "xor", "xor-xj2QHRw", "inv", "inv-Mh2AYeg", "toByte", "", "toByte-impl", "(S)B", "toShort", "toShort-impl", "toInt", "toInt-impl", "(S)I", "toLong", "", "toLong-impl", "(S)J", "toUByte", "toUByte-w2LRezQ", "toUShort", "toUShort-Mh2AYeg", "toUInt", "toUInt-pVg5ArA", "toULong", "toULong-s-VKNKU", "toFloat", "", "toFloat-impl", "(S)F", "toDouble", "", "toDouble-impl", "(S)D", "toString", "", "toString-impl", "(S)Ljava/lang/String;", "equals", "", "", "hashCode", "Companion", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmInline
public final class UShort implements Comparable<UShort> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    /* JADX INFO: compiled from: UShort.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lkotlin/UShort$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/UShort;", ExifInterface.LATITUDE_SOUTH, "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m104118andxj2QHRw(short s11, short s12) {
        return m104125constructorimpl((short) (s11 & s12));
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m104121compareToVKZWuLQ(short s11, long j11) {
        return Long.compare(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m104123compareToxj2QHRw(short s11) {
        return Intrinsics.compare(getData() & MAX_VALUE, s11 & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m104128divVKZWuLQ(short s11, long j11) {
        return C41154d.m90129a(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m104134floorDivVKZWuLQ(short s11, long j11) {
        return C41154d.m90129a(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m104139invMh2AYeg(short s11) {
        return m104125constructorimpl((short) (~s11));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m104141minusVKZWuLQ(short s11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m104145modVKZWuLQ(short s11, long j11) {
        return C41091c.m90094a(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m104148orxj2QHRw(short s11, short s12) {
        return m104125constructorimpl((short) (s11 | s12));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m104150plusVKZWuLQ(short s11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m104156remVKZWuLQ(short s11, long j11) {
        return C41091c.m90094a(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m104160timesVKZWuLQ(short s11, long j11) {
        return ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m104163toByteimpl(short s11) {
        return (byte) s11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m104167toLongimpl(short s11) {
        return ((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m104170toUBytew2LRezQ(short s11) {
        return UByte.m103862constructorimpl((byte) s11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m104172toULongsVKNKU(short s11) {
        return ULong.m104018constructorimpl(((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @InlineOnly
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m104174xorxj2QHRw(short s11, short s12) {
        return m104125constructorimpl((short) (s11 ^ s12));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UShort m104119boximpl(short s11) {
        return new UShort(s11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m104124compareToxj2QHRw(short s11, short s12) {
        return Intrinsics.compare(s11 & MAX_VALUE, s12 & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m104126decMh2AYeg(short s11) {
        return m104125constructorimpl((short) (s11 - 1));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m104131equalsimpl(short s11, Object obj) {
        return (obj instanceof UShort) && s11 == ((UShort) obj).getData();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m104132equalsimpl0(short s11, short s12) {
        return s11 == s12;
    }

    @InlineOnly
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m104138incMh2AYeg(short s11) {
        return m104125constructorimpl((short) (s11 + 1));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final UIntRange m104153rangeToxj2QHRw(short s11, short s12) {
        return new UIntRange(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE), null);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(getData() & MAX_VALUE, uShort.getData() & MAX_VALUE);
    }

    public boolean equals(Object other) {
        return m104131equalsimpl(this.data, other);
    }

    public int hashCode() {
        return m104137hashCodeimpl(this.data);
    }

    @NotNull
    public String toString() {
        return m104169toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getData() {
        return this.data;
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UShort(short s11) {
        this.data = s11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m104120compareTo7apg3OU(short s11, byte b11) {
        return Intrinsics.compare(s11 & MAX_VALUE, b11 & 255);
    }

    @InlineOnly
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m104122compareToWZ4Q5Ns(short s11, int i11) {
        return Integer.compare(UInt.m103939constructorimpl(s11 & MAX_VALUE) ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m104127div7apg3OU(short s11, byte b11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m104129divWZ4Q5Ns(short s11, int i11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m104130divxj2QHRw(short s11, short s12) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m104133floorDiv7apg3OU(short s11, byte b11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m104135floorDivWZ4Q5Ns(short s11, int i11) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m104136floorDivxj2QHRw(short s11, short s12) {
        return C41089a.m90092a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m104137hashCodeimpl(short s11) {
        return Short.hashCode(s11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m104140minus7apg3OU(short s11, byte b11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) - UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m104142minusWZ4Q5Ns(short s11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) - i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m104143minusxj2QHRw(short s11, short s12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) - UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m104144mod7apg3OU(short s11, byte b11) {
        return UByte.m103862constructorimpl((byte) C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(b11 & 255)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m104146modWZ4Q5Ns(short s11, int i11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m104147modxj2QHRw(short s11, short s12) {
        return m104125constructorimpl((short) C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE)));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m104149plus7apg3OU(short s11, byte b11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) + UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m104151plusWZ4Q5Ns(short s11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) + i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m104152plusxj2QHRw(short s11, short s12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) + UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final UIntRange m104154rangeUntilxj2QHRw(short s11, short s12) {
        return URangesKt.m105111untilJ1ME1BU(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m104155rem7apg3OU(short s11, byte b11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m104157remWZ4Q5Ns(short s11, int i11) {
        return C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m104158remxj2QHRw(short s11, short s12) {
        return C41090b.m90093a(UInt.m103939constructorimpl(s11 & MAX_VALUE), UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m104159times7apg3OU(short s11, byte b11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) * UInt.m103939constructorimpl(b11 & 255));
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m104161timesWZ4Q5Ns(short s11, int i11) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) * i11);
    }

    @InlineOnly
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m104162timesxj2QHRw(short s11, short s12) {
        return UInt.m103939constructorimpl(UInt.m103939constructorimpl(s11 & MAX_VALUE) * UInt.m103939constructorimpl(s12 & MAX_VALUE));
    }

    @InlineOnly
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m104164toDoubleimpl(short s11) {
        return UnsignedKt.uintToDouble(s11 & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m104165toFloatimpl(short s11) {
        return (float) UnsignedKt.uintToDouble(s11 & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m104166toIntimpl(short s11) {
        return s11 & MAX_VALUE;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m104169toStringimpl(short s11) {
        return String.valueOf(s11 & MAX_VALUE);
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m104171toUIntpVg5ArA(short s11) {
        return UInt.m103939constructorimpl(s11 & MAX_VALUE);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m104125constructorimpl(short s11) {
        return s11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m104168toShortimpl(short s11) {
        return s11;
    }

    @InlineOnly
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m104173toUShortMh2AYeg(short s11) {
        return s11;
    }
}
