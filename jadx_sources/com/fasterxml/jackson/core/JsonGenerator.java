package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.core.util.C6332k;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes45.dex */
public abstract class JsonGenerator implements Closeable, Flushable {

    /* JADX INFO: renamed from: c */
    public static final C6327f<StreamWriteCapability> f10019c;

    /* JADX INFO: renamed from: d */
    public static final C6327f<StreamWriteCapability> f10020d;

    /* JADX INFO: renamed from: e */
    public static final C6327f<StreamWriteCapability> f10021e;

    /* JADX INFO: renamed from: b */
    public InterfaceC6305h f10022b;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i11) {
            return (i11 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }

        Feature(boolean z11) {
            this._defaultState = z11;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public abstract void mo10785B0(InterfaceC6306i interfaceC6306i) throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract JsonGenerator mo10786C(int i11);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo10787C0(String str) throws IOException;

    /* JADX INFO: renamed from: D0 */
    public abstract void mo10788D0(char[] cArr, int i11, int i12) throws IOException;

    /* JADX INFO: renamed from: P */
    public abstract int mo10798P(Base64Variant base64Variant, InputStream inputStream, int i11) throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract void mo10800R(Base64Variant base64Variant, byte[] bArr, int i11, int i12) throws IOException;

    /* JADX INFO: renamed from: U */
    public abstract void mo10803U(boolean z11) throws IOException;

    /* JADX INFO: renamed from: W */
    public abstract void mo10805W() throws IOException;

    /* JADX INFO: renamed from: X */
    public abstract void mo10806X() throws IOException;

    /* JADX INFO: renamed from: Z */
    public abstract void mo10808Z(InterfaceC6306i interfaceC6306i) throws IOException;

    /* JADX INFO: renamed from: a0 */
    public abstract void mo10810a0(String str) throws IOException;

    /* JADX INFO: renamed from: b0 */
    public abstract void mo10812b0() throws IOException;

    /* JADX INFO: renamed from: c0 */
    public abstract void mo10813c0(double d11) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    /* JADX INFO: renamed from: d0 */
    public abstract void mo10814d0(float f11) throws IOException;

    /* JADX INFO: renamed from: e0 */
    public abstract void mo10815e0(int i11) throws IOException;

    /* JADX INFO: renamed from: f0 */
    public abstract void mo10816f0(long j11) throws IOException;

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    /* JADX INFO: renamed from: g0 */
    public abstract void mo10818g0(String str) throws IOException;

    /* JADX INFO: renamed from: h0 */
    public abstract void mo10820h0(BigDecimal bigDecimal) throws IOException;

    /* JADX INFO: renamed from: i */
    public boolean m10821i() {
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo10822i0(BigInteger bigInteger) throws IOException;

    /* JADX INFO: renamed from: j */
    public boolean mo10823j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo10825k() {
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo10826k0(Object obj) throws IOException;

    /* JADX INFO: renamed from: l */
    public boolean mo10827l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public abstract JsonGenerator mo10829m(Feature feature);

    /* JADX INFO: renamed from: n */
    public abstract int mo10831n();

    /* JADX INFO: renamed from: o */
    public abstract AbstractC6302f mo10833o();

    /* JADX INFO: renamed from: o0 */
    public abstract void mo10834o0(char c11) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract boolean mo10837q(Feature feature);

    /* JADX INFO: renamed from: q0 */
    public abstract void mo10838q0(String str) throws IOException;

    /* JADX INFO: renamed from: r0 */
    public abstract void mo10839r0(char[] cArr, int i11, int i12) throws IOException;

    /* JADX INFO: renamed from: t0 */
    public abstract void mo10841t0(String str) throws IOException;

    /* JADX INFO: renamed from: u0 */
    public abstract void mo10843u0() throws IOException;

    /* JADX INFO: renamed from: y0 */
    public abstract void mo10850y0() throws IOException;

    @Deprecated
    /* JADX INFO: renamed from: z */
    public abstract JsonGenerator mo10851z(int i11);

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.JsonGenerator$a */
    public static /* synthetic */ class C6296a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10024a;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f10024a = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10024a[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10024a[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10024a[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10024a[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public JsonGenerator m10789E(InterfaceC6305h interfaceC6305h) {
        this.f10022b = interfaceC6305h;
        return this;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo10791F0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    /* JADX INFO: renamed from: G0 */
    public WritableTypeId m10792G0(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.f10142c;
        JsonToken jsonToken = writableTypeId.f10145f;
        if (mo10827l()) {
            writableTypeId.f10146g = false;
            mo10791F0(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.f10146g = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.f10144e;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.f10144e = inclusion;
            }
            int i11 = C6296a.f10024a[inclusion.ordinal()];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3) {
                    mo10852z0(writableTypeId.f10140a);
                    m10790E0(writableTypeId.f10143d, strValueOf);
                    return writableTypeId;
                }
                if (i11 != 4) {
                    mo10843u0();
                    mo10787C0(strValueOf);
                } else {
                    mo10850y0();
                    mo10810a0(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            mo10852z0(writableTypeId.f10140a);
            return writableTypeId;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            mo10843u0();
        }
        return writableTypeId;
    }

    /* JADX INFO: renamed from: H0 */
    public WritableTypeId m10793H0(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.f10145f;
        if (jsonToken == JsonToken.START_OBJECT) {
            mo10806X();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            mo10805W();
        }
        if (writableTypeId.f10146g) {
            int i11 = C6296a.f10024a[writableTypeId.f10144e.ordinal()];
            if (i11 == 1) {
                Object obj = writableTypeId.f10142c;
                m10790E0(writableTypeId.f10143d, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i11 != 2 && i11 != 3) {
                if (i11 != 5) {
                    mo10806X();
                    return writableTypeId;
                }
                mo10805W();
                return writableTypeId;
            }
        }
        return writableTypeId;
    }

    /* JADX INFO: renamed from: J */
    public JsonGenerator mo10794J(InterfaceC6306i interfaceC6306i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: L */
    public void m10795L(double[] dArr, int i11, int i12) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        m10817g(dArr.length, i11, i12);
        mo10849x0(dArr, i12);
        int i13 = i12 + i11;
        while (i11 < i13) {
            mo10813c0(dArr[i11]);
            i11++;
        }
        mo10805W();
    }

    /* JADX INFO: renamed from: M */
    public void m10796M(int[] iArr, int i11, int i12) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        m10817g(iArr.length, i11, i12);
        mo10849x0(iArr, i12);
        int i13 = i12 + i11;
        while (i11 < i13) {
            mo10815e0(iArr[i11]);
            i11++;
        }
        mo10805W();
    }

    /* JADX INFO: renamed from: O */
    public void m10797O(long[] jArr, int i11, int i12) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        m10817g(jArr.length, i11, i12);
        mo10849x0(jArr, i12);
        int i13 = i12 + i11;
        while (i11 < i13) {
            mo10816f0(jArr[i11]);
            i11++;
        }
        mo10805W();
    }

    /* JADX INFO: renamed from: V */
    public void mo10804V(Object obj) throws IOException {
        if (obj == null) {
            mo10812b0();
        } else {
            if (obj instanceof byte[]) {
                m10801S((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10809a(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    /* JADX INFO: renamed from: g */
    public final void m10817g(int i11, int i12, int i13) {
        if (i12 < 0 || i12 + i13 > i11) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i11)));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10819h(Object obj) throws IOException {
        if (obj == null) {
            mo10812b0();
            return;
        }
        if (obj instanceof String) {
            mo10787C0((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                mo10815e0(number.intValue());
                return;
            }
            if (number instanceof Long) {
                mo10816f0(number.longValue());
                return;
            }
            if (number instanceof Double) {
                mo10813c0(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                mo10814d0(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                mo10824j0(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                mo10824j0(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                mo10822i0((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                mo10820h0((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                mo10815e0(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                mo10816f0(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            m10801S((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            mo10803U(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            mo10803U(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    /* JADX INFO: renamed from: l0 */
    public void mo10828l0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    /* JADX INFO: renamed from: m0 */
    public void m10830m0(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC6305h m10835p() {
        return this.f10022b;
    }

    static {
        C6327f<StreamWriteCapability> c6327fM11080a = C6327f.m11080a(StreamWriteCapability.values());
        f10019c = c6327fM11080a;
        f10020d = c6327fM11080a.m11082c(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        f10021e = c6327fM11080a.m11082c(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    /* JADX INFO: renamed from: A0 */
    public void mo10784A0(Object obj, int i11) throws IOException {
        mo10850y0();
        mo10848x(obj);
    }

    /* JADX INFO: renamed from: E0 */
    public void m10790E0(String str, String str2) throws IOException {
        mo10810a0(str);
        mo10787C0(str2);
    }

    /* JADX INFO: renamed from: Q */
    public int m10799Q(InputStream inputStream, int i11) throws IOException {
        return mo10798P(C6297a.m10918a(), inputStream, i11);
    }

    /* JADX INFO: renamed from: S */
    public void m10801S(byte[] bArr) throws IOException {
        mo10800R(C6297a.m10918a(), bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: T */
    public void m10802T(byte[] bArr, int i11, int i12) throws IOException {
        mo10800R(C6297a.m10918a(), bArr, i11, i12);
    }

    /* JADX INFO: renamed from: Y */
    public void m10807Y(long j11) throws IOException {
        mo10810a0(Long.toString(j11));
    }

    /* JADX INFO: renamed from: b */
    public final void m10811b() {
        C6332k.m11125c();
    }

    /* JADX INFO: renamed from: j0 */
    public void mo10824j0(short s11) throws IOException {
        mo10815e0(s11);
    }

    /* JADX INFO: renamed from: p0 */
    public void mo10836p0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo10838q0(interfaceC6306i.getValue());
    }

    /* JADX INFO: renamed from: s0 */
    public void mo10840s0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo10841t0(interfaceC6306i.getValue());
    }

    /* JADX INFO: renamed from: v */
    public JsonGenerator mo10844v(int i11, int i12) {
        return mo10851z((i11 & i12) | (mo10831n() & (~i12)));
    }

    @Deprecated
    /* JADX INFO: renamed from: v0 */
    public void m10845v0(int i11) throws IOException {
        mo10843u0();
    }

    /* JADX INFO: renamed from: w0 */
    public void mo10847w0(Object obj) throws IOException {
        mo10843u0();
        mo10848x(obj);
    }

    /* JADX INFO: renamed from: x */
    public void mo10848x(Object obj) {
        AbstractC6302f abstractC6302fMo10833o = mo10833o();
        if (abstractC6302fMo10833o != null) {
            abstractC6302fMo10833o.mo10940i(obj);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void mo10849x0(Object obj, int i11) throws IOException {
        m10845v0(i11);
        mo10848x(obj);
    }

    /* JADX INFO: renamed from: z0 */
    public void mo10852z0(Object obj) throws IOException {
        mo10850y0();
        mo10848x(obj);
    }

    /* JADX INFO: renamed from: n0 */
    public void m10832n0(String str) throws IOException {
    }

    /* JADX INFO: renamed from: w */
    public JsonGenerator mo10846w(CharacterEscapes characterEscapes) {
        return this;
    }

    /* JADX INFO: renamed from: u */
    public JsonGenerator m10842u(int i11, int i12) {
        return this;
    }
}
