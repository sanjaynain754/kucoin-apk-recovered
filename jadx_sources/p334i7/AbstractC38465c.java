package p334i7;

import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.p062io.CharacterEscapes;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import p254f7.AbstractC37384a;

/* JADX INFO: renamed from: i7.c */
/* JADX INFO: compiled from: JsonGeneratorImpl.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC38465c extends AbstractC37384a {

    /* JADX INFO: renamed from: r */
    public static final int[] f86313r = C6308b.m10965e();

    /* JADX INFO: renamed from: s */
    public static final C6327f<StreamWriteCapability> f86314s = JsonGenerator.f10020d;

    /* JADX INFO: renamed from: l */
    public final C6310d f86315l;

    /* JADX INFO: renamed from: m */
    public int[] f86316m;

    /* JADX INFO: renamed from: n */
    public int f86317n;

    /* JADX INFO: renamed from: o */
    public CharacterEscapes f86318o;

    /* JADX INFO: renamed from: p */
    public InterfaceC6306i f86319p;

    /* JADX INFO: renamed from: q */
    public boolean f86320q;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: C */
    public JsonGenerator mo10786C(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f86317n = i11;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: J */
    public JsonGenerator mo10794J(InterfaceC6306i interfaceC6306i) {
        this.f86319p = interfaceC6306i;
        return this;
    }

    /* JADX INFO: renamed from: M0 */
    public void m86794M0(String str) throws IOException {
        m10809a(String.format("Can not %s, expecting field name (context: %s)", str, this.f82941i.m10941j()));
    }

    /* JADX INFO: renamed from: N0 */
    public void m86795N0(String str, int i11) throws IOException {
        if (i11 == 0) {
            if (this.f82941i.m10937f()) {
                this.f10022b.beforeArrayValues(this);
                return;
            } else {
                if (this.f82941i.m10938g()) {
                    this.f10022b.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i11 == 1) {
            this.f10022b.writeArrayValueSeparator(this);
            return;
        }
        if (i11 == 2) {
            this.f10022b.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i11 == 3) {
            this.f10022b.writeRootValueSeparator(this);
        } else if (i11 != 5) {
            m10811b();
        } else {
            m86794M0(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: w */
    public JsonGenerator mo10846w(CharacterEscapes characterEscapes) {
        this.f86318o = characterEscapes;
        if (characterEscapes == null) {
            this.f86316m = f86313r;
            return this;
        }
        this.f86316m = characterEscapes.getEscapeCodesForAscii();
        return this;
    }

    public AbstractC38465c(C6310d c6310d, int i11, AbstractC6304g abstractC6304g) {
        super(i11, abstractC6304g);
        this.f86316m = f86313r;
        this.f86319p = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.f86315l = c6310d;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i11)) {
            this.f86317n = 127;
        }
        this.f86320q = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i11);
    }

    @Override // p254f7.AbstractC37384a
    /* JADX INFO: renamed from: J0 */
    public void mo84051J0(int i11, int i12) {
        super.mo84051J0(i11, i12);
        this.f86320q = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i11);
    }

    @Override // p254f7.AbstractC37384a, com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: m */
    public JsonGenerator mo10829m(JsonGenerator.Feature feature) {
        super.mo10829m(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.f86320q = true;
        }
        return this;
    }
}
