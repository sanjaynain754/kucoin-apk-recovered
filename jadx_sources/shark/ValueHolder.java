package shark;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ValueHolder.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m90084d2 = {"Lshark/ValueHolder;", "", "<init>", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "Companion", "d", "e", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "Lshark/ValueHolder$h;", "Lshark/ValueHolder$a;", "Lshark/ValueHolder$c;", "Lshark/ValueHolder$e;", "Lshark/ValueHolder$d;", "Lshark/ValueHolder$b;", "Lshark/ValueHolder$i;", "Lshark/ValueHolder$f;", "Lshark/ValueHolder$g;", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
public abstract class ValueHolder {

    /* JADX INFO: renamed from: shark.ValueHolder$a, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lshark/ValueHolder$a;", "Lshark/ValueHolder;", "", "value", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "getValue", "()Z", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class BooleanHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean value;

        public BooleanHolder(boolean z11) {
            super(null);
            this.value = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof BooleanHolder) && this.value == ((BooleanHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            boolean z11 = this.value;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        @NotNull
        public String toString() {
            return "BooleanHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$b, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$b;", "Lshark/ValueHolder;", "", "value", "<init>", "(B)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "B", "getValue", "()B", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class ByteHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final byte value;

        public ByteHolder(byte b11) {
            super(null);
            this.value = b11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof ByteHolder) && this.value == ((ByteHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "ByteHolder(value=" + ((int) this.value) + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$c, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$c;", "Lshark/ValueHolder;", "", "value", "<init>", "(C)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "C", "getValue", "()C", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class CharHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final char value;

        public CharHolder(char c11) {
            super(null);
            this.value = c11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof CharHolder) && this.value == ((CharHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "CharHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$d, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$d;", "Lshark/ValueHolder;", "", "value", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "getValue", "()D", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class DoubleHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final double value;

        public DoubleHolder(double d11) {
            super(null);
            this.value = d11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof DoubleHolder) && Double.compare(this.value, ((DoubleHolder) other).value) == 0;
            }
            return true;
        }

        public int hashCode() {
            long jDoubleToLongBits = Double.doubleToLongBits(this.value);
            return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        }

        @NotNull
        public String toString() {
            return "DoubleHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$e, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$e;", "Lshark/ValueHolder;", "", "value", "<init>", "(F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getValue", "()F", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class FloatHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float value;

        public FloatHolder(float f11) {
            super(null);
            this.value = f11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof FloatHolder) && Float.compare(this.value, ((FloatHolder) other).value) == 0;
            }
            return true;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.value);
        }

        @NotNull
        public String toString() {
            return "FloatHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$f, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lshark/ValueHolder$f;", "Lshark/ValueHolder;", "", "value", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class IntHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int value;

        public IntHolder(int i11) {
            super(null);
            this.value = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof IntHolder) && this.value == ((IntHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "IntHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$g, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$g;", "Lshark/ValueHolder;", "", "value", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()J", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class LongHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long value;

        public LongHolder(long j11) {
            super(null);
            this.value = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof LongHolder) && this.value == ((LongHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            long j11 = this.value;
            return (int) (j11 ^ (j11 >>> 32));
        }

        @NotNull
        public String toString() {
            return "LongHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$h, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, m90084d2 = {"Lshark/ValueHolder$h;", "Lshark/ValueHolder;", "", "value", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()J", "()Z", "isNull", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class ReferenceHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long value;

        public ReferenceHolder(long j11) {
            super(null);
            this.value = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m98159b() {
            return this.value == 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof ReferenceHolder) && this.value == ((ReferenceHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            long j11 = this.value;
            return (int) (j11 ^ (j11 >>> 32));
        }

        @NotNull
        public String toString() {
            return "ReferenceHolder(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: shark.ValueHolder$i, reason: from toString */
    /* JADX INFO: compiled from: ValueHolder.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lshark/ValueHolder$i;", "Lshark/ValueHolder;", "", "value", "<init>", "(S)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", ExifInterface.LATITUDE_SOUTH, "getValue", "()S", "shark-hprof"}, m90085k = 1, m90086mv = {1, 4, 1})
    public static final /* data */ class ShortHolder extends ValueHolder {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final short value;

        public ShortHolder(short s11) {
            super(null);
            this.value = s11;
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof ShortHolder) && this.value == ((ShortHolder) other).value;
            }
            return true;
        }

        public int hashCode() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return "ShortHolder(value=" + ((int) this.value) + ")";
        }
    }

    public ValueHolder() {
    }

    public /* synthetic */ ValueHolder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
