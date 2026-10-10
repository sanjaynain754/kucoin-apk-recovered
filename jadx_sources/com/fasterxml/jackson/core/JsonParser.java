package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes45.dex */
public abstract class JsonParser implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final C6327f<StreamReadCapability> f10026d = C6327f.m11080a(StreamReadCapability.values());

    /* JADX INFO: renamed from: b */
    public int f10027b;

    /* JADX INFO: renamed from: c */
    public transient RequestPayload f10028c;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);

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

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public JsonParser() {
    }

    /* JADX INFO: renamed from: C */
    public abstract BigDecimal mo10855C() throws IOException;

    /* JADX INFO: renamed from: C0 */
    public abstract JsonParser mo10856C0() throws IOException;

    /* JADX INFO: renamed from: E */
    public abstract double mo10857E() throws IOException;

    /* JADX INFO: renamed from: J */
    public Object mo10858J() throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: L */
    public abstract float mo10859L() throws IOException;

    /* JADX INFO: renamed from: M */
    public abstract int mo10860M() throws IOException;

    /* JADX INFO: renamed from: O */
    public abstract long mo10861O() throws IOException;

    /* JADX INFO: renamed from: P */
    public abstract NumberType mo10862P() throws IOException;

    /* JADX INFO: renamed from: Q */
    public abstract Number mo10863Q() throws IOException;

    /* JADX INFO: renamed from: S */
    public Object mo10865S() throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: T */
    public abstract AbstractC6302f mo10866T();

    /* JADX INFO: renamed from: W */
    public abstract String mo10869W() throws IOException;

    /* JADX INFO: renamed from: X */
    public abstract char[] mo10870X() throws IOException;

    /* JADX INFO: renamed from: Y */
    public abstract int mo10871Y() throws IOException;

    /* JADX INFO: renamed from: Z */
    public abstract int mo10872Z() throws IOException;

    /* JADX INFO: renamed from: a0 */
    public abstract JsonLocation mo10874a0();

    /* JADX INFO: renamed from: b0 */
    public Object mo10876b0() throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: c0 */
    public int mo10877c0() throws IOException {
        return mo10878d0(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    /* JADX INFO: renamed from: g */
    public boolean mo10881g() {
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public String mo10882g0() throws IOException {
        return mo10884h0(null);
    }

    /* JADX INFO: renamed from: h */
    public boolean mo10883h() {
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public abstract String mo10884h0(String str) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo10885i();

    /* JADX INFO: renamed from: i0 */
    public abstract boolean mo10886i0();

    /* JADX INFO: renamed from: j0 */
    public abstract boolean mo10888j0();

    /* JADX INFO: renamed from: k0 */
    public abstract boolean mo10890k0(JsonToken jsonToken);

    /* JADX INFO: renamed from: l0 */
    public abstract boolean mo10892l0(int i11);

    /* JADX INFO: renamed from: n */
    public abstract BigInteger mo10895n() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract byte[] mo10899p(Base64Variant base64Variant) throws IOException;

    /* JADX INFO: renamed from: q0 */
    public boolean mo10902q0() throws IOException {
        return false;
    }

    /* JADX INFO: renamed from: t0 */
    public abstract JsonToken mo10905t0() throws IOException;

    /* JADX INFO: renamed from: u */
    public abstract AbstractC6304g mo10906u();

    /* JADX INFO: renamed from: u0 */
    public abstract JsonToken mo10907u0() throws IOException;

    /* JADX INFO: renamed from: v */
    public abstract JsonLocation mo10908v();

    /* JADX INFO: renamed from: w */
    public abstract String mo10910w() throws IOException;

    /* JADX INFO: renamed from: x */
    public abstract JsonToken mo10912x();

    /* JADX INFO: renamed from: y0 */
    public boolean mo10914y0() {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public abstract int mo10915z();

    public JsonParser(int i11) {
        this.f10027b = i11;
    }

    @Deprecated
    /* JADX INFO: renamed from: A0 */
    public JsonParser mo10853A0(int i11) {
        this.f10027b = i11;
        return this;
    }

    /* JADX INFO: renamed from: B0 */
    public void mo10854B0(InterfaceC6299c interfaceC6299c) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + interfaceC6299c.m10920a() + "'");
    }

    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return f10026d;
    }

    /* JADX INFO: renamed from: a */
    public JsonParseException m10873a(String str) {
        return new JsonParseException(this, str).withRequestPayload(this.f10028c);
    }

    /* JADX INFO: renamed from: b */
    public void m10875b() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }

    /* JADX INFO: renamed from: e0 */
    public long mo10879e0() throws IOException {
        return mo10880f0(0L);
    }

    /* JADX INFO: renamed from: m */
    public JsonParser mo10893m(Feature feature) {
        this.f10027b = feature.getMask() | this.f10027b;
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m10894m0(Feature feature) {
        return feature.enabledIn(this.f10027b);
    }

    /* JADX INFO: renamed from: w0 */
    public JsonParser mo10911w0(int i11, int i12) {
        return mo10853A0((i11 & i12) | (this.f10027b & (~i12)));
    }

    /* JADX INFO: renamed from: R */
    public Number mo10864R() throws IOException {
        return mo10863Q();
    }

    /* JADX INFO: renamed from: V */
    public short mo10868V() throws IOException {
        int iMo10860M = mo10860M();
        if (iMo10860M >= -32768 && iMo10860M <= 32767) {
            return (short) iMo10860M;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", mo10869W()), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
    }

    /* JADX INFO: renamed from: j */
    public String mo10887j() throws IOException {
        return mo10910w();
    }

    /* JADX INFO: renamed from: k */
    public JsonToken mo10889k() {
        return mo10912x();
    }

    /* JADX INFO: renamed from: l */
    public int mo10891l() {
        return mo10915z();
    }

    /* JADX INFO: renamed from: n0 */
    public boolean mo10896n0() {
        if (mo10889k() == JsonToken.VALUE_NUMBER_INT) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public byte[] m10897o() throws IOException {
        return mo10899p(C6297a.m10918a());
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo10898o0() {
        if (mo10889k() == JsonToken.START_ARRAY) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean mo10900p0() {
        if (mo10889k() == JsonToken.START_OBJECT) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public byte mo10901q() throws IOException {
        int iMo10860M = mo10860M();
        if (iMo10860M >= -128 && iMo10860M <= 255) {
            return (byte) iMo10860M;
        }
        throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", mo10869W()), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
    }

    /* JADX INFO: renamed from: r0 */
    public String mo10903r0() throws IOException {
        if (mo10905t0() == JsonToken.FIELD_NAME) {
            return mo10910w();
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public String mo10904s0() throws IOException {
        if (mo10905t0() == JsonToken.VALUE_STRING) {
            return mo10869W();
        }
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        m10875b();
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo10916z0(Object obj) {
        AbstractC6302f abstractC6302fMo10866T = mo10866T();
        if (abstractC6302fMo10866T != null) {
            abstractC6302fMo10866T.mo10940i(obj);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public int mo10878d0(int i11) throws IOException {
        return i11;
    }

    /* JADX INFO: renamed from: f0 */
    public long mo10880f0(long j11) throws IOException {
        return j11;
    }

    /* JADX INFO: renamed from: v0 */
    public JsonParser mo10909v0(int i11, int i12) {
        return this;
    }
}
