package shark;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.UShort;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.FloatCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: HprofRecordReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\u0018\u0000 }2\u00020\u0001:\u0002\u009e\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105J\r\u00107\u001a\u000206¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\r\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\r\u0010C\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\r\u0010F\u001a\u00020E¢\u0006\u0004\bF\u0010GJ\r\u0010I\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020H¢\u0006\u0004\bK\u0010JJ\r\u0010L\u001a\u00020H¢\u0006\u0004\bL\u0010JJ\r\u0010M\u001a\u00020H¢\u0006\u0004\bM\u0010JJ\r\u0010N\u001a\u00020H¢\u0006\u0004\bN\u0010JJ\r\u0010O\u001a\u00020H¢\u0006\u0004\bO\u0010JJ\r\u0010P\u001a\u00020H¢\u0006\u0004\bP\u0010JJ\r\u0010Q\u001a\u00020H¢\u0006\u0004\bQ\u0010JJ\r\u0010R\u001a\u00020H¢\u0006\u0004\bR\u0010JJ\u0015\u0010T\u001a\u00020H2\u0006\u0010S\u001a\u00020\b¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u00020H2\u0006\u0010S\u001a\u00020V¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020V¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\b¢\u0006\u0004\b[\u0010\\J\u0015\u0010^\u001a\u00020]2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\r\u0010a\u001a\u00020`¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\b¢\u0006\u0004\bc\u0010\\J\u0015\u0010f\u001a\u00020e2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bf\u0010gJ\u0015\u0010i\u001a\u00020h2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bi\u0010jJ\u0015\u0010l\u001a\u00020k2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bl\u0010mJ\u001d\u0010q\u001a\u00020p2\u0006\u0010S\u001a\u00020\b2\u0006\u0010o\u001a\u00020n¢\u0006\u0004\bq\u0010rJ\u0015\u0010t\u001a\u00020s2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\u0015\u0010w\u001a\u00020v2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bw\u0010xJ\u0015\u0010z\u001a\u00020y2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\bz\u0010{J\u0015\u0010}\u001a\u00020|2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\b}\u0010~J\u0015\u0010\u007f\u001a\u00020e2\u0006\u0010d\u001a\u00020\b¢\u0006\u0004\b\u007f\u0010gJ\u000f\u0010\u0080\u0001\u001a\u00020V¢\u0006\u0005\b\u0080\u0001\u0010ZJ\u0011\u0010\u0082\u0001\u001a\u00030\u0081\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0019\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010S\u001a\u00020\b¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0011\u0010\u008e\u0001\u001a\u00030\u008d\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u000f\u0010\u0093\u0001\u001a\u00020V¢\u0006\u0005\b\u0093\u0001\u0010ZJ\u0018\u0010\u0094\u0001\u001a\u00020p2\u0006\u0010S\u001a\u00020V¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\b¢\u0006\u0005\b\u0096\u0001\u0010\\R(\u0010\u0099\u0001\u001a\u00020V2\u0007\u0010\u0097\u0001\u001a\u00020V8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010\u001f\u001a\u0005\b\u0098\u0001\u0010ZR\u0016\u0010\u009a\u0001\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010qR\u0016\u0010\u009c\u0001\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u009b\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, m90084d2 = {"Lshark/HprofRecordReader;", "", "Lshark/HprofHeader;", "header", "Lokio/BufferedSource;", "source", "<init>", "(Lshark/HprofHeader;Lokio/BufferedSource;)V", "", "type", ExifInterface.GPS_DIRECTION_TRUE, "(I)I", "Lshark/d$n;", "L", "()Lshark/d$n;", "Lshark/d$e;", "v", "()Lshark/d$e;", "Lshark/d$f;", "w", "()Lshark/d$f;", "Lshark/d$d;", "u", "()Lshark/d$d;", "Lshark/d$i;", "B", "()Lshark/d$i;", "Lshark/d$k;", "H", "()Lshark/d$k;", "Lshark/d$l;", "J", "()Lshark/d$l;", "Lshark/d$h;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lshark/d$h;", "Lshark/d$m;", "K", "()Lshark/d$m;", "Lshark/d$c;", "t", "()Lshark/d$c;", "Lshark/d$b;", CmcdData.Factory.STREAM_TYPE_LIVE, "()Lshark/d$b;", "Lshark/d$a;", "i", "()Lshark/d$a;", "Lshark/d$j;", ExifInterface.LONGITUDE_EAST, "()Lshark/d$j;", "Lshark/d$p;", ExifInterface.LATITUDE_SOUTH, "()Lshark/d$p;", "Lshark/d$g;", "x", "()Lshark/d$g;", "Lshark/d$o;", "M", "()Lshark/d$o;", "Lshark/l$b$c$b;", "q", "()Lshark/l$b$c$b;", "Lshark/l$b$c$a;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lshark/l$b$c$a;", "Lshark/l$b$c$d;", "D", "()Lshark/l$b$c$d;", "Lshark/l$b$c$c;", "C", "()Lshark/l$b$c$c;", "", "Y", "()V", ExifInterface.LONGITUDE_WEST, "a0", "X", "c0", "Z", "d0", "e0", "b0", "byteCount", "U", "(I)V", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(J)V", "O", "()J", "N", "()I", "Lshark/ValueHolder;", "R", "(I)Lshark/ValueHolder;", "", "F", "()S", "r", "arrayLength", "", "p", "(I)[J", "", "c", "(I)[Z", "", "g", "(I)[C", "Ljava/nio/charset/Charset;", "charset", "", "I", "(ILjava/nio/charset/Charset;)Ljava/lang/String;", "", "n", "(I)[F", "", "k", "(I)[D", "", "G", "(I)[S", "", CmcdData.Factory.STREAMING_FORMAT_SS, "(I)[I", "z", "y", "", "d", "()B", "", "b", "()Z", "", "e", "(I)[B", "", "f", "()C", "", "m", "()F", "", "j", "()D", "o", "Q", "(J)Ljava/lang/String;", "P", "<set-?>", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "bytesRead", "identifierByteSize", "[I", "typeSizes", "Lokio/BufferedSource;", "Companion", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class HprofRecordReader {

    /* JADX INFO: renamed from: e */
    public static final int f98179e;

    /* JADX INFO: renamed from: f */
    public static final int f98180f;

    /* JADX INFO: renamed from: g */
    public static final int f98181g;

    /* JADX INFO: renamed from: h */
    public static final int f98182h;

    /* JADX INFO: renamed from: i */
    public static final int f98183i;

    /* JADX INFO: renamed from: j */
    public static final int f98184j;

    /* JADX INFO: renamed from: k */
    public static final int f98185k;

    /* JADX INFO: renamed from: l */
    public static final int f98186l;

    /* JADX INFO: renamed from: m */
    public static final int f98187m;

    /* JADX INFO: renamed from: n */
    public static final int f98188n;

    /* JADX INFO: renamed from: o */
    public static final int f98189o;

    /* JADX INFO: renamed from: p */
    public static final int f98190p;

    /* JADX INFO: renamed from: q */
    public static final int f98191q;

    /* JADX INFO: renamed from: r */
    public static final int f98192r;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long bytesRead;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int identifierByteSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int[] typeSizes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final BufferedSource source;

    @NotNull
    /* JADX INFO: renamed from: R */
    public final ValueHolder m98105R(int type) {
        if (type == 2) {
            return new ValueHolder.ReferenceHolder(m98133o());
        }
        if (type == f98185k) {
            return new ValueHolder.BooleanHolder(m98116b());
        }
        if (type == f98186l) {
            return new ValueHolder.CharHolder(m98124f());
        }
        if (type == f98187m) {
            return new ValueHolder.FloatHolder(m98131m());
        }
        if (type == f98188n) {
            return new ValueHolder.DoubleHolder(m98128j());
        }
        if (type == f98189o) {
            return new ValueHolder.ByteHolder(m98120d());
        }
        if (type == f98190p) {
            return new ValueHolder.ShortHolder(m98093F());
        }
        if (type == f98191q) {
            return new ValueHolder.IntHolder(m98136r());
        }
        if (type == f98192r) {
            return new ValueHolder.LongHolder(m98143y());
        }
        throw new IllegalStateException("Unknown type " + type);
    }

    static {
        PrimitiveType primitiveType = PrimitiveType.BOOLEAN;
        f98179e = primitiveType.getByteSize();
        PrimitiveType primitiveType2 = PrimitiveType.CHAR;
        f98180f = primitiveType2.getByteSize();
        PrimitiveType primitiveType3 = PrimitiveType.BYTE;
        f98181g = primitiveType3.getByteSize();
        PrimitiveType primitiveType4 = PrimitiveType.SHORT;
        f98182h = primitiveType4.getByteSize();
        PrimitiveType primitiveType5 = PrimitiveType.INT;
        f98183i = primitiveType5.getByteSize();
        PrimitiveType primitiveType6 = PrimitiveType.LONG;
        f98184j = primitiveType6.getByteSize();
        f98185k = primitiveType.getHprofType();
        f98186l = primitiveType2.getHprofType();
        f98187m = PrimitiveType.FLOAT.getHprofType();
        f98188n = PrimitiveType.DOUBLE.getHprofType();
        f98189o = primitiveType3.getHprofType();
        f98190p = primitiveType4.getHprofType();
        f98191q = primitiveType5.getHprofType();
        f98192r = primitiveType6.getHprofType();
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final AbstractC44451d.h m98088A() {
        return new AbstractC44451d.h(m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final AbstractC44451d.i m98089B() {
        return new AbstractC44451d.i(m98133o(), m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final AbstractC44451d.j m98092E() {
        return new AbstractC44451d.j(m98133o());
    }

    /* JADX INFO: renamed from: F */
    public final short m98093F() {
        this.bytesRead += (long) f98182h;
        return this.source.readShort();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final short[] m98094G(int arrayLength) {
        short[] sArr = new short[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            sArr[i11] = m98093F();
        }
        return sArr;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final AbstractC44451d.k m98095H() {
        return new AbstractC44451d.k(m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final String m98096I(int byteCount, @NotNull Charset charset) throws IOException {
        long j11 = byteCount;
        this.bytesRead += j11;
        String string = this.source.readString(j11, charset);
        Intrinsics.checkExpressionValueIsNotNull(string, "source.readString(byteCount.toLong(), charset)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final AbstractC44451d.l m98097J() {
        return new AbstractC44451d.l(m98133o(), m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final AbstractC44451d.m m98098K() {
        return new AbstractC44451d.m(m98133o(), m98136r(), m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final AbstractC44451d.n m98099L() {
        return new AbstractC44451d.n(m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final AbstractC44451d.o m98100M() {
        return new AbstractC44451d.o(m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: Q */
    public final String m98104Q(long byteCount) throws IOException {
        this.bytesRead += byteCount;
        String utf8 = this.source.readUtf8(byteCount);
        Intrinsics.checkExpressionValueIsNotNull(utf8, "source.readUtf8(byteCount)");
        return utf8;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final AbstractC44451d.p m98106S() {
        return new AbstractC44451d.p(m98133o());
    }

    /* JADX INFO: renamed from: T */
    public final int m98107T(int type) {
        return this.typeSizes[type];
    }

    /* JADX INFO: renamed from: U */
    public final void m98108U(int byteCount) throws IOException {
        long j11 = byteCount;
        this.bytesRead += j11;
        this.source.skip(j11);
    }

    /* JADX INFO: renamed from: V */
    public final void m98109V(long byteCount) throws IOException {
        this.bytesRead += byteCount;
        this.source.skip(byteCount);
    }

    /* JADX INFO: renamed from: Y */
    public final void m98112Y() throws IOException {
        m98108U((f98183i * 2) + (this.identifierByteSize * 7));
        m98110W();
    }

    /* JADX INFO: renamed from: Z */
    public final void m98113Z() throws IOException {
        int i11 = this.identifierByteSize;
        int i12 = f98183i;
        m98108U(i11 + i12 + i11 + i11 + i11 + i11 + i11 + i11 + i12);
        int iM98103P = m98103P();
        for (int i13 = 0; i13 < iM98103P; i13++) {
            m98108U(f98182h);
            m98108U(this.typeSizes[m98101N()]);
        }
        int iM98103P2 = m98103P();
        for (int i14 = 0; i14 < iM98103P2; i14++) {
            m98108U(this.identifierByteSize);
            m98108U(this.typeSizes[m98101N()]);
        }
        m98108U(m98103P() * (this.identifierByteSize + f98181g));
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBytesRead() {
        return this.bytesRead;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m98116b() {
        this.bytesRead += (long) f98179e;
        return this.source.readByte() != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m98117b0() throws IOException {
        int i11 = this.identifierByteSize;
        m98108U(i11 + i11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final boolean[] m98118c(int arrayLength) {
        boolean[] zArr = new boolean[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            zArr[i11] = m98120d() != 0;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m98119c0() throws IOException {
        int i11 = this.identifierByteSize;
        m98108U(f98183i + i11 + i11);
        m98108U(m98136r());
    }

    /* JADX INFO: renamed from: d */
    public final byte m98120d() {
        this.bytesRead += (long) f98181g;
        return this.source.readByte();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m98121d0() throws IOException {
        m98108U(this.identifierByteSize + f98183i);
        int iM98136r = m98136r();
        int i11 = this.identifierByteSize;
        m98108U(i11 + (iM98136r * i11));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final byte[] m98122e(int byteCount) throws IOException {
        long j11 = byteCount;
        this.bytesRead += j11;
        byte[] byteArray = this.source.readByteArray(j11);
        Intrinsics.checkExpressionValueIsNotNull(byteArray, "source.readByteArray(byteCount.toLong())");
        return byteArray;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m98123e0() throws IOException {
        m98108U(this.identifierByteSize + f98183i);
        m98108U(m98136r() * this.typeSizes[m98101N()]);
    }

    /* JADX INFO: renamed from: f */
    public final char m98124f() {
        return m98096I(f98180f, Charsets.UTF_16BE).charAt(0);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final char[] m98125g(int arrayLength) {
        char[] cArr = new char[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            cArr[i11] = m98124f();
        }
        return cArr;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final AbstractC44490l.b.c.a m98126h() throws IOException {
        HprofRecordReader hprofRecordReader = this;
        long jM98133o = hprofRecordReader.m98133o();
        int iM98136r = hprofRecordReader.m98136r();
        long jM98133o2 = hprofRecordReader.m98133o();
        long jM98133o3 = hprofRecordReader.m98133o();
        long jM98133o4 = hprofRecordReader.m98133o();
        long jM98133o5 = hprofRecordReader.m98133o();
        hprofRecordReader.m98133o();
        hprofRecordReader.m98133o();
        int iM98136r2 = hprofRecordReader.m98136r();
        int iM98103P = hprofRecordReader.m98103P();
        for (int i11 = 0; i11 < iM98103P; i11++) {
            hprofRecordReader.m98108U(f98182h);
            hprofRecordReader.m98108U(hprofRecordReader.typeSizes[hprofRecordReader.m98101N()]);
        }
        int iM98103P2 = hprofRecordReader.m98103P();
        ArrayList arrayList = new ArrayList(iM98103P2);
        int i12 = 0;
        while (i12 < iM98103P2) {
            int i13 = iM98103P2;
            long jM98133o6 = hprofRecordReader.m98133o();
            int iM98101N = hprofRecordReader.m98101N();
            arrayList.add(new AbstractC44490l.b.c.a.StaticFieldRecord(jM98133o6, iM98101N, hprofRecordReader.m98105R(iM98101N)));
            i12++;
            hprofRecordReader = this;
            jM98133o = jM98133o;
            iM98103P2 = i13;
            iM98136r = iM98136r;
        }
        long j11 = jM98133o;
        int i14 = iM98136r;
        int iM98103P3 = m98103P();
        ArrayList arrayList2 = new ArrayList(iM98103P3);
        int i15 = 0;
        while (i15 < iM98103P3) {
            arrayList2.add(new AbstractC44490l.b.c.a.FieldRecord(m98133o(), m98101N()));
            i15++;
            iM98103P3 = iM98103P3;
        }
        return new AbstractC44490l.b.c.a(j11, i14, jM98133o2, jM98133o3, jM98133o4, jM98133o5, iM98136r2, arrayList, arrayList2);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final AbstractC44451d.a m98127i() {
        return new AbstractC44451d.a(m98133o());
    }

    /* JADX INFO: renamed from: j */
    public final double m98128j() {
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(m98143y());
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final double[] m98129k(int arrayLength) {
        double[] dArr = new double[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            dArr[i11] = m98128j();
        }
        return dArr;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final AbstractC44451d.b m98130l() {
        return new AbstractC44451d.b(m98133o());
    }

    /* JADX INFO: renamed from: m */
    public final float m98131m() {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final float[] m98132n(int arrayLength) {
        float[] fArr = new float[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            fArr[i11] = m98131m();
        }
        return fArr;
    }

    /* JADX INFO: renamed from: o */
    public final long m98133o() {
        int iM98120d;
        int i11 = this.identifierByteSize;
        if (i11 == 1) {
            iM98120d = m98120d();
        } else if (i11 == 2) {
            iM98120d = m98093F();
        } else {
            if (i11 != 4) {
                if (i11 == 8) {
                    return m98143y();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            iM98120d = m98136r();
        }
        return iM98120d;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final long[] m98134p(int arrayLength) {
        long[] jArr = new long[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            jArr[i11] = m98133o();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: r */
    public final int m98136r() {
        this.bytesRead += (long) f98183i;
        return this.source.readInt();
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final int[] m98137s(int arrayLength) {
        int[] iArr = new int[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            iArr[i11] = m98136r();
        }
        return iArr;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final AbstractC44451d.c m98138t() {
        return new AbstractC44451d.c(m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final AbstractC44451d.d m98139u() {
        return new AbstractC44451d.d(m98133o(), m98136r(), m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final AbstractC44451d.e m98140v() {
        return new AbstractC44451d.e(m98133o(), m98133o());
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final AbstractC44451d.f m98141w() {
        return new AbstractC44451d.f(m98133o(), m98136r(), m98136r());
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final AbstractC44451d.g m98142x() {
        return new AbstractC44451d.g(m98133o(), m98136r(), m98136r());
    }

    /* JADX INFO: renamed from: y */
    public final long m98143y() {
        this.bytesRead += (long) f98184j;
        return this.source.readLong();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final long[] m98144z(int arrayLength) {
        long[] jArr = new long[arrayLength];
        for (int i11 = 0; i11 < arrayLength; i11++) {
            jArr[i11] = m98143y();
        }
        return jArr;
    }

    public HprofRecordReader(@NotNull HprofHeader hprofHeader, @NotNull BufferedSource bufferedSource) {
        int iIntValue;
        this.source = bufferedSource;
        int identifierByteSize = hprofHeader.getIdentifierByteSize();
        this.identifierByteSize = identifierByteSize;
        Map mapPlus = MapsKt.plus(PrimitiveType.INSTANCE.getByteSizeByHprofType(), TuplesKt.m90091to(2, Integer.valueOf(identifierByteSize)));
        Object objMax = CollectionsKt.max((Iterable) mapPlus.keySet());
        if (objMax == null) {
            Intrinsics.throwNpe();
        }
        int iIntValue2 = ((Number) objMax).intValue() + 1;
        int[] iArr = new int[iIntValue2];
        for (int i11 = 0; i11 < iIntValue2; i11++) {
            Integer num = (Integer) mapPlus.get(Integer.valueOf(i11));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            iArr[i11] = iIntValue;
        }
        this.typeSizes = iArr;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final AbstractC44490l.b.c.C47023c m98090C() {
        return new AbstractC44490l.b.c.C47023c(m98133o(), m98136r(), m98133o(), m98134p(m98136r()));
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final AbstractC44490l.b.c.d m98091D() {
        long jM98133o = m98133o();
        int iM98136r = m98136r();
        int iM98136r2 = m98136r();
        int iM98101N = m98101N();
        if (iM98101N == f98185k) {
            return new AbstractC44490l.b.c.d.a(jM98133o, iM98136r, m98118c(iM98136r2));
        }
        if (iM98101N == f98186l) {
            return new AbstractC44490l.b.c.d.C47025c(jM98133o, iM98136r, m98125g(iM98136r2));
        }
        if (iM98101N == f98187m) {
            return new AbstractC44490l.b.c.d.e(jM98133o, iM98136r, m98132n(iM98136r2));
        }
        if (iM98101N == f98188n) {
            return new AbstractC44490l.b.c.d.C47026d(jM98133o, iM98136r, m98129k(iM98136r2));
        }
        if (iM98101N == f98189o) {
            return new AbstractC44490l.b.c.d.C47024b(jM98133o, iM98136r, m98122e(iM98136r2));
        }
        if (iM98101N == f98190p) {
            return new AbstractC44490l.b.c.d.h(jM98133o, iM98136r, m98094G(iM98136r2));
        }
        if (iM98101N == f98191q) {
            return new AbstractC44490l.b.c.d.f(jM98133o, iM98136r, m98137s(iM98136r2));
        }
        if (iM98101N == f98192r) {
            return new AbstractC44490l.b.c.d.g(jM98133o, iM98136r, m98144z(iM98136r2));
        }
        throw new IllegalStateException("Unexpected type " + iM98101N);
    }

    /* JADX INFO: renamed from: N */
    public final int m98101N() {
        return m98120d() & 255;
    }

    /* JADX INFO: renamed from: O */
    public final long m98102O() {
        return ((long) m98136r()) & KeyboardMap.kValueMask;
    }

    /* JADX INFO: renamed from: P */
    public final int m98103P() {
        return m98093F() & UShort.MAX_VALUE;
    }

    /* JADX INFO: renamed from: W */
    public final void m98110W() throws IOException {
        int iM98103P = m98103P();
        for (int i11 = 0; i11 < iM98103P; i11++) {
            m98108U(PrimitiveType.SHORT.getByteSize());
            m98108U(m98107T(m98101N()));
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m98111X() throws IOException {
        m98108U((this.identifierByteSize + 1) * m98103P());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m98115a0() throws IOException {
        int iIntValue;
        int iM98103P = m98103P();
        for (int i11 = 0; i11 < iM98103P; i11++) {
            m98108U(this.identifierByteSize);
            int iM98101N = m98101N();
            if (iM98101N == 2) {
                iIntValue = this.identifierByteSize;
            } else {
                iIntValue = ((Number) MapsKt.getValue(PrimitiveType.INSTANCE.getByteSizeByHprofType(), Integer.valueOf(iM98101N))).intValue();
            }
            m98108U(iIntValue);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final AbstractC44490l.b.c.C47022b m98135q() {
        return new AbstractC44490l.b.c.C47022b(m98133o(), m98136r(), m98133o(), m98122e(m98136r()));
    }
}
