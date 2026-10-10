package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.databind.AbstractC6391f;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import p254f7.AbstractC37386c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.d */
/* JADX INFO: compiled from: TreeTraversingParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6450d extends AbstractC37386c {

    /* JADX INFO: renamed from: q */
    public AbstractC6304g f10586q;

    /* JADX INFO: renamed from: r */
    public AbstractC6449c f10587r;

    /* JADX INFO: renamed from: s */
    public boolean f10588s;

    public C6450d(AbstractC6391f abstractC6391f) {
        this(abstractC6391f, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    public int mo10872Z() throws IOException {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: j0 */
    public boolean mo10888j0() {
        return false;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.d$a */
    /* JADX INFO: compiled from: TreeTraversingParser.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10589a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f10589a = iArr;
            try {
                iArr[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10589a[JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10589a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10589a[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10589a[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10589a[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10589a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10589a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10589a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C6450d(AbstractC6391f abstractC6391f, AbstractC6304g abstractC6304g) {
        super(0);
        this.f10586q = abstractC6304g;
        this.f10587r = new AbstractC6449c.c(abstractC6391f, null);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C0 */
    public JsonParser mo10856C0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.START_OBJECT) {
            this.f10587r = this.f10587r.m11730l();
            this.f82981e = JsonToken.END_OBJECT;
            return this;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f10587r = this.f10587r.m11730l();
            this.f82981e = JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: J */
    public Object mo10858J() {
        AbstractC6391f abstractC6391fM11735e1;
        if (this.f10588s || (abstractC6391fM11735e1 = m11735e1()) == null) {
            return null;
        }
        if (abstractC6391fM11735e1.isPojo()) {
            return ((POJONode) abstractC6391fM11735e1).getPojo();
        }
        if (abstractC6391fM11735e1.isBinary()) {
            return ((BinaryNode) abstractC6391fM11735e1).binaryValue();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: T */
    public AbstractC6302f mo10866T() {
        return this.f10587r;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return JsonParser.f10026d;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public String mo10869W() {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return null;
        }
        switch (a.f10589a[jsonToken.ordinal()]) {
            case 5:
                return this.f10587r.mo10933b();
            case 6:
                return m11735e1().textValue();
            case 7:
            case 8:
                return String.valueOf(m11735e1().numberValue());
            case 9:
                AbstractC6391f abstractC6391fM11735e1 = m11735e1();
                if (abstractC6391fM11735e1 != null && abstractC6391fM11735e1.isBinary()) {
                    return abstractC6391fM11735e1.asText();
                }
                break;
        }
        return this.f82981e.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        return JsonLocation.f10025NA;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f10588s) {
            return;
        }
        this.f10588s = true;
        this.f10587r = null;
        this.f82981e = null;
    }

    /* JADX INFO: renamed from: e1 */
    public AbstractC6391f m11735e1() {
        AbstractC6449c abstractC6449c;
        if (this.f10588s || (abstractC6449c = this.f10587r) == null) {
            return null;
        }
        return abstractC6449c.mo11729k();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: q0 */
    public boolean mo10902q0() {
        if (this.f10588s) {
            return false;
        }
        AbstractC6391f abstractC6391fM11735e1 = m11735e1();
        if (abstractC6391fM11735e1 instanceof NumericNode) {
            return ((NumericNode) abstractC6391fM11735e1).isNaN();
        }
        return false;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public JsonToken mo10905t0() throws IOException {
        JsonToken jsonTokenMo11731m = this.f10587r.mo11731m();
        this.f82981e = jsonTokenMo11731m;
        if (jsonTokenMo11731m == null) {
            this.f10588s = true;
            return null;
        }
        int i11 = a.f10589a[jsonTokenMo11731m.ordinal()];
        if (i11 == 1) {
            this.f10587r = this.f10587r.mo11733o();
        } else if (i11 == 2) {
            this.f10587r = this.f10587r.mo11732n();
        } else if (i11 == 3 || i11 == 4) {
            this.f10587r = this.f10587r.m11730l();
        }
        return this.f82981e;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return this.f10586q;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        return JsonLocation.f10025NA;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: w */
    public String mo10910w() {
        AbstractC6449c abstractC6449cM11730l = this.f10587r;
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            abstractC6449cM11730l = abstractC6449cM11730l.m11730l();
        }
        if (abstractC6449cM11730l == null) {
            return null;
        }
        return abstractC6449cM11730l.mo10933b();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: C */
    public BigDecimal mo10855C() throws IOException {
        return m11736f1().decimalValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: E */
    public double mo10857E() throws IOException {
        return m11736f1().doubleValue();
    }

    @Override // p254f7.AbstractC37386c
    /* JADX INFO: renamed from: G0 */
    public void mo11734G0() {
        m84102T0();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: L */
    public float mo10859L() throws IOException {
        return (float) m11736f1().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: M */
    public int mo10860M() throws IOException {
        NumericNode numericNode = (NumericNode) m11736f1();
        if (!numericNode.canConvertToInt()) {
            m84106X0();
        }
        return numericNode.intValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: O */
    public long mo10861O() throws IOException {
        NumericNode numericNode = (NumericNode) m11736f1();
        if (!numericNode.canConvertToLong()) {
            m84109a1();
        }
        return numericNode.longValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: P */
    public JsonParser.NumberType mo10862P() throws IOException {
        AbstractC6391f abstractC6391fM11736f1 = m11736f1();
        if (abstractC6391fM11736f1 == null) {
            return null;
        }
        return abstractC6391fM11736f1.numberType();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Q */
    public Number mo10863Q() throws IOException {
        return m11736f1().numberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public char[] mo10870X() throws IOException {
        return mo10869W().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public int mo10871Y() throws IOException {
        return mo10869W().length();
    }

    /* JADX INFO: renamed from: f1 */
    public AbstractC6391f m11736f1() throws JacksonException {
        JsonToken jsonTokenAsToken;
        AbstractC6391f abstractC6391fM11735e1 = m11735e1();
        if (abstractC6391fM11735e1 != null && abstractC6391fM11735e1.isNumber()) {
            return abstractC6391fM11735e1;
        }
        if (abstractC6391fM11735e1 == null) {
            jsonTokenAsToken = null;
        } else {
            jsonTokenAsToken = abstractC6391fM11735e1.asToken();
        }
        throw m10873a("Current token (" + jsonTokenAsToken + ") not numeric, cannot use numeric value accessors");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: n */
    public BigInteger mo10895n() throws IOException {
        return m11736f1().bigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        AbstractC6391f abstractC6391fM11735e1 = m11735e1();
        if (abstractC6391fM11735e1 != null) {
            if (abstractC6391fM11735e1 instanceof TextNode) {
                return ((TextNode) abstractC6391fM11735e1).getBinaryValue(base64Variant);
            }
            return abstractC6391fM11735e1.binaryValue();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] bArrMo10899p = mo10899p(base64Variant);
        if (bArrMo10899p == null) {
            return 0;
        }
        outputStream.write(bArrMo10899p, 0, bArrMo10899p.length);
        return bArrMo10899p.length;
    }
}
