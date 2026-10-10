package p254f7;

import com.fasterxml.jackson.core.AbstractC6302f;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Utf8;
import p334i7.C38464b;
import p334i7.C38467e;

/* JADX INFO: renamed from: f7.a */
/* JADX INFO: compiled from: GeneratorBase.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC37384a extends JsonGenerator {

    /* JADX INFO: renamed from: k */
    public static final int f82937k = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();

    /* JADX INFO: renamed from: f */
    public AbstractC6304g f82938f;

    /* JADX INFO: renamed from: g */
    public int f82939g;

    /* JADX INFO: renamed from: h */
    public boolean f82940h;

    /* JADX INFO: renamed from: i */
    public C38467e f82941i;

    /* JADX INFO: renamed from: j */
    public boolean f82942j;

    /* JADX INFO: renamed from: L0 */
    public abstract void mo84053L0(String str) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f82942j = true;
    }

    /* JADX INFO: renamed from: I0 */
    public String m84050I0(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f82939g)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            m10809a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    /* JADX INFO: renamed from: J0 */
    public void mo84051J0(int i11, int i12) {
        if ((f82937k & i12) == 0) {
            return;
        }
        this.f82940h = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i11);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i12)) {
            if (feature.enabledIn(i11)) {
                mo10786C(127);
            } else {
                mo10786C(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i12)) {
            if (!feature2.enabledIn(i11)) {
                this.f82941i = this.f82941i.m86819v(null);
            } else if (this.f82941i.m86815r() == null) {
                this.f82941i = this.f82941i.m86819v(C38464b.m86788e(this));
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: k0 */
    public void mo10826k0(Object obj) throws IOException {
        if (obj == null) {
            mo10812b0();
            return;
        }
        AbstractC6304g abstractC6304g = this.f82938f;
        if (abstractC6304g != null) {
            abstractC6304g.writeValue(this, obj);
        } else {
            m10819h(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: n */
    public int mo10831n() {
        return this.f82939g;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: o */
    public AbstractC6302f mo10833o() {
        return this.f82941i;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: q */
    public final boolean mo10837q(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.f82939g) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: v */
    public JsonGenerator mo10844v(int i11, int i12) {
        int i13 = this.f82939g;
        int i14 = (i11 & i12) | ((~i12) & i13);
        int i15 = i13 ^ i14;
        if (i15 != 0) {
            this.f82939g = i14;
            mo84051J0(i14, i15);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: x */
    public void mo10848x(Object obj) {
        C38467e c38467e = this.f82941i;
        if (c38467e != null) {
            c38467e.mo10940i(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    /* JADX INFO: renamed from: z */
    public JsonGenerator mo10851z(int i11) {
        int i12 = this.f82939g ^ i11;
        this.f82939g = i11;
        if (i12 != 0) {
            mo84051J0(i11, i12);
        }
        return this;
    }

    public AbstractC37384a(int i11, AbstractC6304g abstractC6304g) {
        C38464b c38464bM86788e;
        this.f82939g = i11;
        this.f82938f = abstractC6304g;
        if (JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i11)) {
            c38464bM86788e = C38464b.m86788e(this);
        } else {
            c38464bM86788e = null;
        }
        this.f82941i = C38467e.m86809q(c38464bM86788e);
        this.f82940h = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i11);
    }

    /* JADX INFO: renamed from: K0 */
    public final int m84052K0(int i11, int i12) throws IOException {
        if (i12 < 56320 || i12 > 57343) {
            m10809a(String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        return ((i11 - 55296) << 10) + 65536 + (i12 - Utf8.LOG_SURROGATE_HEADER);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: m */
    public JsonGenerator mo10829m(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.f82939g &= ~mask;
        if ((mask & f82937k) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.f82940h = false;
                return this;
            }
            if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                mo10786C(0);
                return this;
            }
            if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.f82941i = this.f82941i.m86819v(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: s0 */
    public void mo10840s0(InterfaceC6306i interfaceC6306i) throws IOException {
        mo84053L0("write raw value");
        mo10836p0(interfaceC6306i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: t0 */
    public void mo10841t0(String str) throws IOException {
        mo84053L0("write raw value");
        mo10838q0(str);
    }
}
