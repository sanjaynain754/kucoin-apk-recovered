package shark.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.FloatCompanionObject;
import p852kotlin.text.Charsets;
import shark.AbstractC44490l;
import shark.PrimitiveType;
import shark.ValueHolder;

/* JADX INFO: compiled from: FieldValuesReader.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%¨\u0006*"}, m90084d2 = {"Lshark/internal/FieldValuesReader;", "", "Lshark/l$b$c$b;", "record", "", "identifierByteSize", "<init>", "(Lshark/l$b$c$b;I)V", "Lshark/l$b$c$a$a;", "field", "Lshark/ValueHolder;", "j", "(Lshark/l$b$c$a$a;)Lshark/ValueHolder;", "", "f", "()J", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "", "b", "()B", "g", "()I", "", "i", "()S", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "e", "()F", "", "d", "()D", "", "c", "()C", "I", ViewProps.POSITION, "Lshark/l$b$c$b;", CmcdData.Factory.STREAM_TYPE_LIVE, "Companion", "shark-graph"}, m90085k = 1, m90086mv = {1, 4, 1})
public final class FieldValuesReader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final AbstractC44490l.b.c.C47022b record;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int identifierByteSize;

    /* JADX INFO: renamed from: d */
    public static final int f98303d = PrimitiveType.BOOLEAN.getHprofType();

    /* JADX INFO: renamed from: e */
    public static final int f98304e = PrimitiveType.CHAR.getHprofType();

    /* JADX INFO: renamed from: f */
    public static final int f98305f = PrimitiveType.FLOAT.getHprofType();

    /* JADX INFO: renamed from: g */
    public static final int f98306g = PrimitiveType.DOUBLE.getHprofType();

    /* JADX INFO: renamed from: h */
    public static final int f98307h = PrimitiveType.BYTE.getHprofType();

    /* JADX INFO: renamed from: i */
    public static final int f98308i = PrimitiveType.SHORT.getHprofType();

    /* JADX INFO: renamed from: j */
    public static final int f98309j = PrimitiveType.INT.getHprofType();

    /* JADX INFO: renamed from: k */
    public static final int f98310k = PrimitiveType.LONG.getHprofType();

    /* JADX INFO: renamed from: a */
    public final boolean m98208a() {
        byte[] fieldValues = this.record.getFieldValues();
        int i11 = this.position;
        byte b11 = fieldValues[i11];
        this.position = i11 + 1;
        return b11 != ((byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public final byte m98209b() {
        byte[] fieldValues = this.record.getFieldValues();
        int i11 = this.position;
        byte b11 = fieldValues[i11];
        this.position = i11 + 1;
        return b11;
    }

    /* JADX INFO: renamed from: c */
    public final char m98210c() {
        String str = new String(this.record.getFieldValues(), this.position, 2, Charsets.UTF_16BE);
        this.position += 2;
        return str.charAt(0);
    }

    /* JADX INFO: renamed from: d */
    public final double m98211d() {
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(m98215h());
    }

    /* JADX INFO: renamed from: e */
    public final float m98212e() {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(m98214g());
    }

    /* JADX INFO: renamed from: f */
    public final long m98213f() {
        int iM98209b;
        int i11 = this.identifierByteSize;
        if (i11 == 1) {
            iM98209b = m98209b();
        } else if (i11 == 2) {
            iM98209b = m98216i();
        } else {
            if (i11 != 4) {
                if (i11 == 8) {
                    return m98215h();
                }
                throw new IllegalArgumentException("ID Length must be 1, 2, 4, or 8");
            }
            iM98209b = m98214g();
        }
        return iM98209b;
    }

    /* JADX INFO: renamed from: g */
    public final int m98214g() {
        int iM98327a = C44470c.m98327a(this.record.getFieldValues(), this.position);
        this.position += 4;
        return iM98327a;
    }

    /* JADX INFO: renamed from: h */
    public final long m98215h() {
        long jM98328b = C44470c.m98328b(this.record.getFieldValues(), this.position);
        this.position += 8;
        return jM98328b;
    }

    /* JADX INFO: renamed from: i */
    public final short m98216i() {
        short sM98329c = C44470c.m98329c(this.record.getFieldValues(), this.position);
        this.position += 2;
        return sM98329c;
    }

    public FieldValuesReader(@NotNull AbstractC44490l.b.c.C47022b c47022b, int i11) {
        this.record = c47022b;
        this.identifierByteSize = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ValueHolder m98217j(@NotNull AbstractC44490l.b.c.a.FieldRecord field) {
        int type = field.getType();
        if (type == 2) {
            return new ValueHolder.ReferenceHolder(m98213f());
        }
        if (type == f98303d) {
            return new ValueHolder.BooleanHolder(m98208a());
        }
        if (type == f98304e) {
            return new ValueHolder.CharHolder(m98210c());
        }
        if (type == f98305f) {
            return new ValueHolder.FloatHolder(m98212e());
        }
        if (type == f98306g) {
            return new ValueHolder.DoubleHolder(m98211d());
        }
        if (type == f98307h) {
            return new ValueHolder.ByteHolder(m98209b());
        }
        if (type == f98308i) {
            return new ValueHolder.ShortHolder(m98216i());
        }
        if (type == f98309j) {
            return new ValueHolder.IntHolder(m98214g());
        }
        if (type == f98310k) {
            return new ValueHolder.LongHolder(m98215h());
        }
        throw new IllegalStateException("Unknown type " + field.getType());
    }
}
