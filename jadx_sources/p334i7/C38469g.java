package p334i7;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.AbstractC6304g;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.p062io.C6308b;
import com.fasterxml.jackson.core.p062io.C6310d;
import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6327f;
import com.fasterxml.jackson.core.util.C6330i;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import p254f7.AbstractC37385b;
import p395k7.C40936b;

/* JADX INFO: renamed from: i7.g */
/* JADX INFO: compiled from: ReaderBasedJsonParser.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38469g extends AbstractC37385b {

    /* JADX INFO: renamed from: c0 */
    public static final int f86335c0 = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();

    /* JADX INFO: renamed from: d0 */
    public static final int f86336d0 = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();

    /* JADX INFO: renamed from: e0 */
    public static final int f86337e0 = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();

    /* JADX INFO: renamed from: f0 */
    public static final int f86338f0 = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();

    /* JADX INFO: renamed from: g0 */
    public static final int f86339g0 = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();

    /* JADX INFO: renamed from: h0 */
    public static final int f86340h0 = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();

    /* JADX INFO: renamed from: i0 */
    public static final int f86341i0 = JsonParser.Feature.ALLOW_COMMENTS.getMask();

    /* JADX INFO: renamed from: j0 */
    public static final int f86342j0 = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();

    /* JADX INFO: renamed from: k0 */
    public static final int[] f86343k0 = C6308b.m10968h();

    /* JADX INFO: renamed from: S */
    public Reader f86344S;

    /* JADX INFO: renamed from: T */
    public char[] f86345T;

    /* JADX INFO: renamed from: U */
    public boolean f86346U;

    /* JADX INFO: renamed from: V */
    public AbstractC6304g f86347V;

    /* JADX INFO: renamed from: W */
    public final C40936b f86348W;

    /* JADX INFO: renamed from: X */
    public final int f86349X;

    /* JADX INFO: renamed from: Y */
    public boolean f86350Y;

    /* JADX INFO: renamed from: Z */
    public long f86351Z;

    /* JADX INFO: renamed from: a0 */
    public int f86352a0;

    /* JADX INFO: renamed from: b0 */
    public int f86353b0;

    public C38469g(C6310d c6310d, int i11, Reader reader, AbstractC6304g abstractC6304g, C40936b c40936b, char[] cArr, int i12, int i13, boolean z11) {
        super(c6310d, i11);
        this.f86344S = reader;
        this.f86347V = abstractC6304g;
        this.f86345T = cArr;
        this.f82963s = i12;
        this.f82964t = i13;
        this.f82967w = i12;
        this.f82965u = -i12;
        this.f86348W = c40936b;
        this.f86349X = c40936b.m89700m();
        this.f86346U = z11;
    }

    @Deprecated
    /* JADX INFO: renamed from: H2 */
    public char m86832H2(String str) throws IOException {
        return m86833I2(str, null);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m86834L1(String str, int i11, int i12) throws IOException {
        if (Character.isJavaIdentifierPart((char) i12)) {
            m86860o2(str.substring(0, i11));
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final JsonToken m86849d2() {
        this.f82948E = false;
        JsonToken jsonToken = this.f82945B;
        this.f82945B = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
        }
        this.f82981e = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: r0 */
    public String mo10903r0() throws IOException {
        JsonToken jsonTokenM86856k2;
        this.f82951H = 0;
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            m86849d2();
            return null;
        }
        if (this.f86350Y) {
            m86870y2();
        }
        int iM86871z2 = m86871z2();
        if (iM86871z2 < 0) {
            close();
            this.f82981e = null;
            return null;
        }
        this.f82950G = null;
        if (iM86871z2 == 93 || iM86871z2 == 125) {
            m86835M1(iM86871z2);
            return null;
        }
        if (this.f82944A.m86801p()) {
            iM86871z2 = m86867v2(iM86871z2);
            if ((this.f10027b & f86335c0) != 0 && (iM86871z2 == 93 || iM86871z2 == 125)) {
                m86835M1(iM86871z2);
                return null;
            }
        }
        if (!this.f82944A.m10938g()) {
            m86827C2();
            m86850e2(iM86871z2);
            return null;
        }
        m86828D2();
        String strM86854i2 = iM86871z2 == 34 ? m86854i2() : m86842T1(iM86871z2);
        this.f82944A.m86805t(strM86854i2);
        this.f82981e = jsonToken2;
        int iM86865t2 = m86865t2();
        m86827C2();
        if (iM86865t2 == 34) {
            this.f86350Y = true;
            this.f82945B = JsonToken.VALUE_STRING;
            return strM86854i2;
        }
        if (iM86865t2 == 45) {
            jsonTokenM86856k2 = m86856k2();
        } else if (iM86865t2 == 46) {
            jsonTokenM86856k2 = m86853h2();
        } else if (iM86865t2 == 91) {
            jsonTokenM86856k2 = JsonToken.START_ARRAY;
        } else if (iM86865t2 == 102) {
            m86822Y1();
            jsonTokenM86856k2 = JsonToken.VALUE_FALSE;
        } else if (iM86865t2 == 110) {
            m86823Z1();
            jsonTokenM86856k2 = JsonToken.VALUE_NULL;
        } else if (iM86865t2 == 116) {
            m86824c2();
            jsonTokenM86856k2 = JsonToken.VALUE_TRUE;
        } else if (iM86865t2 != 123) {
            switch (iM86865t2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenM86856k2 = m86858m2(iM86865t2);
                    break;
                default:
                    jsonTokenM86856k2 = m86844V1(iM86865t2);
                    break;
            }
        } else {
            jsonTokenM86856k2 = JsonToken.START_OBJECT;
        }
        this.f82945B = jsonTokenM86856k2;
        return strM86854i2;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m86870y2() throws IOException {
        this.f86350Y = false;
        int i11 = this.f82963s;
        int i12 = this.f82964t;
        char[] cArr = this.f86345T;
        while (true) {
            if (i11 >= i12) {
                this.f82963s = i11;
                if (!m86845W1()) {
                    m84098P0(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i11 = this.f82963s;
                i12 = this.f82964t;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 <= '\\') {
                if (c11 == '\\') {
                    this.f82963s = i13;
                    mo84070j1();
                    i11 = this.f82963s;
                    i12 = this.f82964t;
                } else if (c11 <= '\"') {
                    if (c11 == '\"') {
                        this.f82963s = i13;
                        return;
                    } else if (c11 < ' ') {
                        this.f82963s = i13;
                        m84082v1(c11, "string value");
                    }
                }
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: Y1 */
    private final void m86822Y1() throws IOException {
        int i11;
        char c11;
        int i12 = this.f82963s;
        if (i12 + 4 < this.f82964t) {
            char[] cArr = this.f86345T;
            if (cArr[i12] == 'a' && cArr[i12 + 1] == 'l' && cArr[i12 + 2] == 's' && cArr[i12 + 3] == 'e' && ((c11 = cArr[(i11 = i12 + 4)]) < '0' || c11 == ']' || c11 == '}')) {
                this.f82963s = i11;
                return;
            }
        }
        m86847a2(CredentialEntry.FALSE_STRING, 1);
    }

    /* JADX INFO: renamed from: Z1 */
    private final void m86823Z1() throws IOException {
        int i11;
        char c11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            char[] cArr = this.f86345T;
            if (cArr[i12] == 'u' && cArr[i12 + 1] == 'l' && cArr[i12 + 2] == 'l' && ((c11 = cArr[(i11 = i12 + 3)]) < '0' || c11 == ']' || c11 == '}')) {
                this.f82963s = i11;
                return;
            }
        }
        m86847a2("null", 1);
    }

    /* JADX INFO: renamed from: c2 */
    private final void m86824c2() throws IOException {
        int i11;
        char c11;
        int i12 = this.f82963s;
        if (i12 + 3 < this.f82964t) {
            char[] cArr = this.f86345T;
            if (cArr[i12] == 'r' && cArr[i12 + 1] == 'u' && cArr[i12 + 2] == 'e' && ((c11 = cArr[(i11 = i12 + 3)]) < '0' || c11 == ']' || c11 == '}')) {
                this.f82963s = i11;
                return;
            }
        }
        m86847a2(CredentialEntry.TRUE_STRING, 1);
    }

    /* JADX INFO: renamed from: A2 */
    public final int m86825A2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                return m84071k1();
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/') {
                    m86868w2();
                } else if (c11 != '#' || !m86826B2()) {
                    return c11;
                }
            } else if (c11 != ' ') {
                if (c11 == '\n') {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (c11 == '\r') {
                    m86864s2();
                } else if (c11 != '\t') {
                    m84103U0(c11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final boolean m86826B2() throws IOException {
        if ((this.f10027b & f86342j0) == 0) {
            return false;
        }
        m86869x2();
        return true;
    }

    /* JADX INFO: renamed from: C2 */
    public final void m86827C2() {
        int i11 = this.f82963s;
        this.f82968x = this.f82965u + ((long) i11);
        this.f82969y = this.f82966v;
        this.f82970z = i11 - this.f82967w;
    }

    /* JADX INFO: renamed from: D2 */
    public final void m86828D2() {
        int i11 = this.f82963s;
        this.f86351Z = i11;
        this.f86352a0 = this.f82966v;
        this.f86353b0 = i11 - this.f82967w;
    }

    /* JADX INFO: renamed from: E2 */
    public final char m86829E2() throws IOException {
        char c11;
        if ((this.f82963s >= this.f82964t && !m86845W1()) || (c11 = this.f86345T[this.f82963s]) < '0' || c11 > '9') {
            return '0';
        }
        if ((this.f10027b & f86336d0) == 0) {
            m84105W0("Leading zeroes not allowed");
        }
        this.f82963s++;
        if (c11 != '0') {
            return c11;
        }
        do {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                return c11;
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            c11 = cArr[i11];
            if (c11 < '0' || c11 > '9') {
                return '0';
            }
            this.f82963s = i11 + 1;
        } while (c11 == '0');
        return c11;
    }

    /* JADX INFO: renamed from: F2 */
    public final char m86830F2() throws IOException {
        char c11;
        int i11 = this.f82963s;
        if (i11 >= this.f82964t || ((c11 = this.f86345T[i11]) >= '0' && c11 <= '9')) {
            return m86829E2();
        }
        return '0';
    }

    /* JADX INFO: renamed from: G2 */
    public final void m86831G2(int i11) throws IOException {
        int i12 = this.f82963s + 1;
        this.f82963s = i12;
        if (i11 != 9) {
            if (i11 == 10) {
                this.f82966v++;
                this.f82967w = i12;
            } else if (i11 == 13) {
                m86864s2();
            } else if (i11 != 32) {
                m84100R0(i11);
            }
        }
    }

    /* JADX INFO: renamed from: I2 */
    public char m86833I2(String str, JsonToken jsonToken) throws IOException {
        if (this.f82963s >= this.f82964t && !m86845W1()) {
            m84098P0(str, jsonToken);
        }
        char[] cArr = this.f86345T;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        return cArr[i11];
    }

    /* JADX INFO: renamed from: M1 */
    public final void m86835M1(int i11) throws JsonParseException {
        if (i11 == 93) {
            m86827C2();
            if (!this.f82944A.m10937f()) {
                m84080t1(i11, '}');
            }
            this.f82944A = this.f82944A.m86798l();
            this.f82981e = JsonToken.END_ARRAY;
        }
        if (i11 == 125) {
            m86827C2();
            if (!this.f82944A.m10938g()) {
                m84080t1(i11, ']');
            }
            this.f82944A = this.f82944A.m86798l();
            this.f82981e = JsonToken.END_OBJECT;
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m86837O1() throws IOException {
        int i11 = this.f82963s;
        int i12 = this.f82964t;
        if (i11 < i12) {
            int[] iArr = f86343k0;
            int length = iArr.length;
            do {
                char[] cArr = this.f86345T;
                char c11 = cArr[i11];
                if (c11 < length && iArr[c11] != 0) {
                    if (c11 != '\"') {
                        break;
                    }
                    C6330i c6330i = this.f82946C;
                    int i13 = this.f82963s;
                    c6330i.m11088A(cArr, i13, i11 - i13);
                    this.f82963s = i11 + 1;
                    return;
                }
                i11++;
            } while (i11 < i12);
        }
        C6330i c6330i2 = this.f82946C;
        char[] cArr2 = this.f86345T;
        int i14 = this.f82963s;
        c6330i2.m11119z(cArr2, i14, i11 - i14);
        this.f82963s = i11;
        m86838P1();
    }

    /* JADX INFO: renamed from: P1 */
    public void m86838P1() throws IOException {
        char[] cArrM11112s = this.f82946C.m11112s();
        int iM11113t = this.f82946C.m11113t();
        int[] iArr = f86343k0;
        int length = iArr.length;
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                m84098P0(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            this.f82963s = i11 + 1;
            char cMo84070j1 = cArr[i11];
            if (cMo84070j1 < length && iArr[cMo84070j1] != 0) {
                if (cMo84070j1 == '\"') {
                    this.f82946C.m11092E(iM11113t);
                    return;
                } else if (cMo84070j1 == '\\') {
                    cMo84070j1 = mo84070j1();
                } else if (cMo84070j1 < ' ') {
                    m84082v1(cMo84070j1, "string value");
                }
            }
            if (iM11113t >= cArrM11112s.length) {
                cArrM11112s = this.f82946C.m11110p();
                iM11113t = 0;
            }
            cArrM11112s[iM11113t] = cMo84070j1;
            iM11113t++;
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final String m86839Q1(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            return (iM10917id == 6 || iM10917id == 7 || iM10917id == 8) ? this.f82946C.m11106l() : jsonToken.asString();
        }
        return this.f82944A.mo10933b();
    }

    /* JADX INFO: renamed from: R1 */
    public JsonToken m86840R1() throws IOException {
        char[] cArrM11107m = this.f82946C.m11107m();
        int iM11113t = this.f82946C.m11113t();
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                m84098P0(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            this.f82963s = i11 + 1;
            char cMo84070j1 = cArr[i11];
            if (cMo84070j1 <= '\\') {
                if (cMo84070j1 == '\\') {
                    cMo84070j1 = mo84070j1();
                } else if (cMo84070j1 <= '\'') {
                    if (cMo84070j1 == '\'') {
                        this.f82946C.m11092E(iM11113t);
                        return JsonToken.VALUE_STRING;
                    }
                    if (cMo84070j1 < ' ') {
                        m84082v1(cMo84070j1, "string value");
                    }
                }
            }
            if (iM11113t >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11110p();
                iM11113t = 0;
            }
            cArrM11107m[iM11113t] = cMo84070j1;
            iM11113t++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: S1 */
    public com.fasterxml.jackson.core.JsonToken m86841S1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: T1 */
    public String m86842T1(int i11) throws IOException {
        boolean zIsJavaIdentifierPart;
        if (i11 == 39 && (this.f10027b & f86339g0) != 0) {
            return m86851f2();
        }
        if ((this.f10027b & f86340h0) == 0) {
            m84101S0(i11, "was expecting double-quote to start field name");
        }
        int[] iArrM10969i = C6308b.m10969i();
        int length = iArrM10969i.length;
        if (i11 < length) {
            zIsJavaIdentifierPart = iArrM10969i[i11] == 0;
        } else {
            zIsJavaIdentifierPart = Character.isJavaIdentifierPart((char) i11);
        }
        if (!zIsJavaIdentifierPart) {
            m84101S0(i11, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i12 = this.f82963s;
        int i13 = this.f86349X;
        int i14 = this.f82964t;
        if (i12 < i14) {
            do {
                char[] cArr = this.f86345T;
                char c11 = cArr[i12];
                if (c11 < length) {
                    if (iArrM10969i[c11] != 0) {
                        int i15 = this.f82963s - 1;
                        this.f82963s = i12;
                        return this.f86348W.m89699l(cArr, i15, i12 - i15, i13);
                    }
                } else if (!Character.isJavaIdentifierPart(c11)) {
                    int i16 = this.f82963s - 1;
                    this.f82963s = i12;
                    return this.f86348W.m89699l(this.f86345T, i16, i12 - i16, i13);
                }
                i13 = (i13 * 33) + c11;
                i12++;
            } while (i12 < i14);
        }
        int i17 = this.f82963s - 1;
        this.f82963s = i12;
        return m86843U1(i17, i13, iArrM10969i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: U */
    public C6327f<StreamReadCapability> mo10867U() {
        return AbstractC37385b.f82943R;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[SYNTHETIC] */
    /* JADX INFO: renamed from: U1 */
    public final String m86843U1(int i11, int i12, int[] iArr) throws IOException {
        int i13;
        this.f82946C.m11088A(this.f86345T, i11, this.f82963s - i11);
        char[] cArrM11112s = this.f82946C.m11112s();
        int iM11113t = this.f82946C.m11113t();
        int length = iArr.length;
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                break;
            }
            char c11 = this.f86345T[this.f82963s];
            if (c11 < length) {
                if (iArr[c11] != 0) {
                    break;
                }
                this.f82963s++;
                i12 = (i12 * 33) + c11;
                i13 = iM11113t + 1;
                cArrM11112s[iM11113t] = c11;
                if (i13 >= cArrM11112s.length) {
                    cArrM11112s = this.f82946C.m11110p();
                    iM11113t = 0;
                } else {
                    iM11113t = i13;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c11)) {
                    break;
                }
                this.f82963s++;
                i12 = (i12 * 33) + c11;
                i13 = iM11113t + 1;
                cArrM11112s[iM11113t] = c11;
                if (i13 >= cArrM11112s.length) {
                    cArrM11112s = this.f82946C.m11110p();
                    iM11113t = 0;
                } else {
                    iM11113t = i13;
                }
            }
        }
        this.f82946C.m11092E(iM11113t);
        C6330i c6330i = this.f82946C;
        return this.f86348W.m89699l(c6330i.m11114u(), c6330i.m11115v(), c6330i.m11093F(), i12);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX INFO: renamed from: V1 */
    public JsonToken m86844V1(int i11) throws IOException {
        if (i11 != 39) {
            if (i11 == 73) {
                m86847a2("Infinity", 1);
                if ((this.f10027b & f86337e0) != 0) {
                    return m84062I1("Infinity", Double.POSITIVE_INFINITY);
                }
                m84093K0("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i11 == 78) {
                m86847a2("NaN", 1);
                if ((this.f10027b & f86337e0) != 0) {
                    return m84062I1("NaN", Double.NaN);
                }
                m84093K0("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i11 != 93) {
                if (i11 == 43) {
                    if (this.f82963s >= this.f82964t && !m86845W1()) {
                        m84099Q0(JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.f86345T;
                    int i12 = this.f82963s;
                    this.f82963s = i12 + 1;
                    return m86841S1(cArr[i12], false);
                }
                if (i11 == 44) {
                    if (!this.f82944A.m10939h() && (this.f10027b & f86338f0) != 0) {
                        this.f82963s--;
                        return JsonToken.VALUE_NULL;
                    }
                }
            } else if (this.f82944A.m10937f()) {
                if (!this.f82944A.m10939h()) {
                    this.f82963s--;
                    return JsonToken.VALUE_NULL;
                }
            }
        } else if ((this.f10027b & f86339g0) != 0) {
            return m86840R1();
        }
        if (Character.isJavaIdentifierStart(i11)) {
            m86861p2("" + ((char) i11), m84083w1());
        }
        m84101S0(i11, "expected a valid value " + m84084x1());
        return null;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: W */
    public final String mo10869W() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return m86839Q1(jsonToken);
        }
        if (this.f86350Y) {
            this.f86350Y = false;
            m86837O1();
        }
        return this.f82946C.m11106l();
    }

    /* JADX INFO: renamed from: W1 */
    public boolean m86845W1() throws IOException {
        Reader reader = this.f86344S;
        if (reader != null) {
            char[] cArr = this.f86345T;
            int i11 = reader.read(cArr, 0, cArr.length);
            if (i11 > 0) {
                int i12 = this.f82964t;
                long j11 = i12;
                this.f82965u += j11;
                this.f82967w -= i12;
                this.f86351Z -= j11;
                this.f82963s = 0;
                this.f82964t = i11;
                return true;
            }
            mo84066f1();
            if (i11 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f82964t);
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: X */
    public final char[] mo10870X() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return null;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id != 5) {
            if (iM10917id != 6) {
                if (iM10917id != 7 && iM10917id != 8) {
                    return this.f82981e.asCharArray();
                }
            } else if (this.f86350Y) {
                this.f86350Y = false;
                m86837O1();
            }
            return this.f82946C.m11114u();
        }
        if (!this.f82948E) {
            String strMo10933b = this.f82944A.mo10933b();
            int length = strMo10933b.length();
            char[] cArr = this.f82947D;
            if (cArr == null) {
                this.f82947D = this.f82961q.m10979f(length);
            } else if (cArr.length < length) {
                this.f82947D = new char[length];
            }
            strMo10933b.getChars(0, length, this.f82947D, 0);
            this.f82948E = true;
        }
        return this.f82947D;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Y */
    public final int mo10871Y() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == null) {
            return 0;
        }
        int iM10917id = jsonToken.m10917id();
        if (iM10917id == 5) {
            return this.f82944A.mo10933b().length();
        }
        if (iM10917id != 6) {
            if (iM10917id != 7 && iM10917id != 8) {
                return this.f82981e.asCharArray().length;
            }
        } else if (this.f86350Y) {
            this.f86350Y = false;
            m86837O1();
        }
        return this.f82946C.m11093F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo10872Z() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != null) {
            int iM10917id = jsonToken.m10917id();
            if (iM10917id != 6) {
                if (iM10917id != 7) {
                }
            } else if (this.f86350Y) {
                this.f86350Y = false;
                m86837O1();
            }
            return this.f82946C.m11115v();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: a0 */
    public JsonLocation mo10874a0() {
        if (this.f82981e != JsonToken.FIELD_NAME) {
            return new JsonLocation(m84067g1(), -1L, this.f82968x - 1, this.f82969y, this.f82970z);
        }
        return new JsonLocation(m84067g1(), -1L, this.f82965u + (this.f86351Z - 1), this.f86352a0, this.f86353b0);
    }

    /* JADX INFO: renamed from: e2 */
    public final JsonToken m86850e2(int i11) throws IOException {
        if (i11 == 34) {
            this.f86350Y = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this.f82981e = jsonToken;
            return jsonToken;
        }
        if (i11 == 91) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this.f82981e = jsonToken2;
            return jsonToken2;
        }
        if (i11 == 102) {
            m86847a2(CredentialEntry.FALSE_STRING, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this.f82981e = jsonToken3;
            return jsonToken3;
        }
        if (i11 == 110) {
            m86847a2("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this.f82981e = jsonToken4;
            return jsonToken4;
        }
        if (i11 == 116) {
            m86847a2(CredentialEntry.TRUE_STRING, 1);
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this.f82981e = jsonToken5;
            return jsonToken5;
        }
        if (i11 == 123) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this.f82981e = jsonToken6;
            return jsonToken6;
        }
        switch (i11) {
            case 44:
                if (!this.f82944A.m10939h() && (this.f10027b & f86338f0) != 0) {
                    this.f82963s--;
                    JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                    this.f82981e = jsonToken7;
                    return jsonToken7;
                }
                break;
            case 45:
                JsonToken jsonTokenM86856k2 = m86856k2();
                this.f82981e = jsonTokenM86856k2;
                return jsonTokenM86856k2;
            case 46:
                JsonToken jsonTokenM86853h2 = m86853h2();
                this.f82981e = jsonTokenM86853h2;
                return jsonTokenM86853h2;
            default:
                switch (i11) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        JsonToken jsonTokenM86858m2 = m86858m2(i11);
                        this.f82981e = jsonTokenM86858m2;
                        return jsonTokenM86858m2;
                }
        }
        JsonToken jsonTokenM86844V1 = m86844V1(i11);
        this.f82981e = jsonTokenM86844V1;
        return jsonTokenM86844V1;
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: f1 */
    public void mo84066f1() throws IOException {
        if (this.f86344S != null) {
            if (this.f82961q.m10987n() || m10894m0(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.f86344S.close();
            }
            this.f86344S = null;
        }
    }

    /* JADX INFO: renamed from: f2 */
    public String m86851f2() throws IOException {
        int i11 = this.f82963s;
        int i12 = this.f86349X;
        int i13 = this.f82964t;
        if (i11 < i13) {
            int[] iArr = f86343k0;
            int length = iArr.length;
            do {
                char[] cArr = this.f86345T;
                char c11 = cArr[i11];
                if (c11 != '\'') {
                    if (c11 < length && iArr[c11] != 0) {
                        break;
                    }
                    i12 = (i12 * 33) + c11;
                    i11++;
                } else {
                    int i14 = this.f82963s;
                    this.f82963s = i11 + 1;
                    return this.f86348W.m89699l(cArr, i14, i11 - i14, i12);
                }
            } while (i11 < i13);
        }
        int i15 = this.f82963s;
        this.f82963s = i11;
        return m86855j2(i15, i12, 39);
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: g0 */
    public final String mo10882g0() throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(null);
        }
        if (this.f86350Y) {
            this.f86350Y = false;
            m86837O1();
        }
        return this.f82946C.m11106l();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: g2 */
    public final com.fasterxml.jackson.core.JsonToken m86852g2(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: h0 */
    public final String mo10884h0(String str) throws IOException {
        JsonToken jsonToken = this.f82981e;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? mo10910w() : super.mo10884h0(str);
        }
        if (this.f86350Y) {
            this.f86350Y = false;
            m86837O1();
        }
        return this.f82946C.m11106l();
    }

    /* JADX INFO: renamed from: h2 */
    public final JsonToken m86853h2() throws IOException {
        if (!m10894m0(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return m86844V1(46);
        }
        int i11 = this.f82963s;
        return m86852g2(46, i11 - 1, i11, false, 0);
    }

    /* JADX INFO: renamed from: i2 */
    public final String m86854i2() throws IOException {
        int i11 = this.f82963s;
        int i12 = this.f86349X;
        int[] iArr = f86343k0;
        while (i11 < this.f82964t) {
            char[] cArr = this.f86345T;
            char c11 = cArr[i11];
            if (c11 < iArr.length && iArr[c11] != 0) {
                if (c11 != '\"') {
                    break;
                }
                int i13 = this.f82963s;
                this.f82963s = i11 + 1;
                return this.f86348W.m89699l(cArr, i13, i11 - i13, i12);
            }
            i12 = (i12 * 33) + c11;
            i11++;
        }
        int i14 = this.f82963s;
        this.f82963s = i11;
        return m86855j2(i14, i12, 34);
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: j1 */
    public char mo84070j1() throws IOException {
        if (this.f82963s >= this.f82964t && !m86845W1()) {
            m84098P0(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this.f86345T;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        char c11 = cArr[i11];
        if (c11 == '\"' || c11 == '/' || c11 == '\\') {
            return c11;
        }
        if (c11 == 'b') {
            return '\b';
        }
        if (c11 == 'f') {
            return '\f';
        }
        if (c11 == 'n') {
            return '\n';
        }
        if (c11 == 'r') {
            return '\r';
        }
        if (c11 == 't') {
            return '\t';
        }
        if (c11 != 'u') {
            return m84074n1(c11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                m84098P0(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this.f86345T;
            int i14 = this.f82963s;
            this.f82963s = i14 + 1;
            char c12 = cArr2[i14];
            int iM10962b = C6308b.m10962b(c12);
            if (iM10962b < 0) {
                m84101S0(c12, "expected a hex-digit for character escape sequence");
            }
            i12 = (i12 << 4) | iM10962b;
        }
        return (char) i12;
    }

    /* JADX INFO: renamed from: j2 */
    public final String m86855j2(int i11, int i12, int i13) throws IOException {
        this.f82946C.m11088A(this.f86345T, i11, this.f82963s - i11);
        char[] cArrM11112s = this.f82946C.m11112s();
        int iM11113t = this.f82946C.m11113t();
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                m84098P0(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this.f86345T;
            int i14 = this.f82963s;
            this.f82963s = i14 + 1;
            char cMo84070j1 = cArr[i14];
            if (cMo84070j1 <= '\\') {
                if (cMo84070j1 == '\\') {
                    cMo84070j1 = mo84070j1();
                } else if (cMo84070j1 <= i13) {
                    if (cMo84070j1 == i13) {
                        this.f82946C.m11092E(iM11113t);
                        C6330i c6330i = this.f82946C;
                        return this.f86348W.m89699l(c6330i.m11114u(), c6330i.m11115v(), c6330i.m11093F(), i12);
                    }
                    if (cMo84070j1 < ' ') {
                        m84082v1(cMo84070j1, "name");
                    }
                }
            }
            i12 = (i12 * 33) + cMo84070j1;
            int i15 = iM11113t + 1;
            cArrM11112s[iM11113t] = cMo84070j1;
            if (i15 >= cArrM11112s.length) {
                cArrM11112s = this.f82946C.m11110p();
                iM11113t = 0;
            } else {
                iM11113t = i15;
            }
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final JsonToken m86856k2() throws IOException {
        int i11 = this.f82963s;
        int i12 = i11 - 1;
        int i13 = this.f82964t;
        if (i11 >= i13) {
            return m86857l2(true, i12);
        }
        int i14 = i11 + 1;
        char c11 = this.f86345T[i11];
        char c12 = '9';
        if (c11 > '9' || c11 < '0') {
            this.f82963s = i14;
            return m86841S1(c11, true);
        }
        if (c11 == '0') {
            return m86857l2(true, i12);
        }
        int i15 = 1;
        while (i14 < i13) {
            char c13 = c12;
            int i16 = i14 + 1;
            char c14 = this.f86345T[i14];
            if (c14 < '0' || c14 > c13) {
                if (c14 == '.' || c14 == 'e' || c14 == 'E') {
                    this.f82963s = i16;
                    return m86852g2(c14, i12, i16, true, i15);
                }
                this.f82963s = i14;
                if (this.f82944A.m10939h()) {
                    m86831G2(c14);
                }
                this.f82946C.m11088A(this.f86345T, i12, i14 - i12);
                return m84064K1(true, i15);
            }
            i15++;
            i14 = i16;
            c12 = c13;
        }
        return m86857l2(true, i12);
    }

    /* JADX INFO: renamed from: l2 */
    public final JsonToken m86857l2(boolean z11, int i11) throws IOException {
        int i12;
        char cM86833I2;
        boolean z12;
        int i13;
        char cM86832H2;
        if (z11) {
            i11++;
        }
        this.f82963s = i11;
        char[] cArrM11107m = this.f82946C.m11107m();
        int i14 = 0;
        if (z11) {
            cArrM11107m[0] = '-';
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = this.f82963s;
        if (i15 < this.f82964t) {
            char[] cArr = this.f86345T;
            this.f82963s = i15 + 1;
            cM86833I2 = cArr[i15];
        } else {
            cM86833I2 = m86833I2("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (cM86833I2 == '0') {
            cM86833I2 = m86830F2();
        }
        int i16 = 0;
        while (true) {
            if (cM86833I2 >= '0' && cM86833I2 <= '9') {
                i16++;
                if (i12 >= cArrM11107m.length) {
                    cArrM11107m = this.f82946C.m11110p();
                    i12 = 0;
                }
                int i17 = i12 + 1;
                cArrM11107m[i12] = cM86833I2;
                if (this.f82963s >= this.f82964t && !m86845W1()) {
                    cM86833I2 = 0;
                    i12 = i17;
                    z12 = true;
                    break;
                }
                char[] cArr2 = this.f86345T;
                int i18 = this.f82963s;
                this.f82963s = i18 + 1;
                cM86833I2 = cArr2[i18];
                i12 = i17;
            } else {
                z12 = false;
                break;
            }
        }
        if (i16 == 0) {
            return m86841S1(cM86833I2, z11);
        }
        if (cM86833I2 == '.') {
            if (i12 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11110p();
                i12 = 0;
            }
            cArrM11107m[i12] = cM86833I2;
            i12++;
            i13 = 0;
            while (true) {
                if (this.f82963s >= this.f82964t && !m86845W1()) {
                    z12 = true;
                    break;
                }
                char[] cArr3 = this.f86345T;
                int i19 = this.f82963s;
                this.f82963s = i19 + 1;
                cM86833I2 = cArr3[i19];
                if (cM86833I2 < '0' || cM86833I2 > '9') {
                    break;
                }
                i13++;
                if (i12 >= cArrM11107m.length) {
                    cArrM11107m = this.f82946C.m11110p();
                    i12 = 0;
                }
                cArrM11107m[i12] = cM86833I2;
                i12++;
            }
            if (i13 == 0) {
                m84112d1(cM86833I2, "Decimal point not followed by a digit");
            }
        } else {
            i13 = 0;
        }
        if (cM86833I2 == 'e' || cM86833I2 == 'E') {
            if (i12 >= cArrM11107m.length) {
                cArrM11107m = this.f82946C.m11110p();
                i12 = 0;
            }
            int i21 = i12 + 1;
            cArrM11107m[i12] = cM86833I2;
            int i22 = this.f82963s;
            if (i22 < this.f82964t) {
                char[] cArr4 = this.f86345T;
                this.f82963s = i22 + 1;
                cM86832H2 = cArr4[i22];
            } else {
                cM86832H2 = m86832H2("expected a digit for number exponent");
            }
            if (cM86832H2 == '-' || cM86832H2 == '+') {
                if (i21 >= cArrM11107m.length) {
                    cArrM11107m = this.f82946C.m11110p();
                    i21 = 0;
                }
                int i23 = i21 + 1;
                cArrM11107m[i21] = cM86832H2;
                int i24 = this.f82963s;
                if (i24 < this.f82964t) {
                    char[] cArr5 = this.f86345T;
                    this.f82963s = i24 + 1;
                    cM86832H2 = cArr5[i24];
                } else {
                    cM86832H2 = m86832H2("expected a digit for number exponent");
                }
                i21 = i23;
            }
            int i25 = 0;
            cM86833I2 = cM86832H2;
            while (true) {
                if (cM86833I2 <= '9' && cM86833I2 >= '0') {
                    i25++;
                    if (i21 >= cArrM11107m.length) {
                        cArrM11107m = this.f82946C.m11110p();
                        i21 = 0;
                    }
                    i12 = i21 + 1;
                    cArrM11107m[i21] = cM86833I2;
                    if (this.f82963s >= this.f82964t && !m86845W1()) {
                        z12 = true;
                        break;
                    }
                    char[] cArr6 = this.f86345T;
                    int i26 = this.f82963s;
                    this.f82963s = i26 + 1;
                    cM86833I2 = cArr6[i26];
                    i21 = i12;
                } else {
                    i12 = i21;
                    break;
                }
            }
            i14 = i25;
            if (i14 == 0) {
                m84112d1(cM86833I2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z12) {
            this.f82963s--;
            if (this.f82944A.m10939h()) {
                m86831G2(cM86833I2);
            }
        }
        this.f82946C.m11092E(i12);
        return m84061H1(z11, i16, i13, i14);
    }

    /* JADX INFO: renamed from: m2 */
    public final JsonToken m86858m2(int i11) throws IOException {
        int i12 = this.f82963s;
        int i13 = i12 - 1;
        int i14 = this.f82964t;
        char c11 = '0';
        if (i11 == 48) {
            return m86857l2(false, i13);
        }
        int i15 = 1;
        while (i12 < i14) {
            char c12 = c11;
            int i16 = i12 + 1;
            char c13 = this.f86345T[i12];
            if (c13 < c12 || c13 > '9') {
                if (c13 == '.' || c13 == 'e' || c13 == 'E') {
                    this.f82963s = i16;
                    return m86852g2(c13, i13, i16, false, i15);
                }
                this.f82963s = i12;
                if (this.f82944A.m10939h()) {
                    m86831G2(c13);
                }
                this.f82946C.m11088A(this.f86345T, i13, i12 - i13);
                return m84064K1(false, i15);
            }
            i15++;
            i12 = i16;
            c11 = c12;
        }
        this.f82963s = i13;
        return m86857l2(false, i13);
    }

    /* JADX INFO: renamed from: n2 */
    public int m86859n2(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length - 3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (this.f82963s >= this.f82964t) {
                m86846X1();
            }
            char[] cArr = this.f86345T;
            int i13 = this.f82963s;
            this.f82963s = i13 + 1;
            char c11 = cArr[i13];
            if (c11 > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c11);
                if (iDecodeBase64Char < 0) {
                    if (c11 == '\"') {
                        break;
                    }
                    iDecodeBase64Char = m84068h1(base64Variant, c11, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i11 > length) {
                    i12 += i11;
                    outputStream.write(bArr, 0, i11);
                    i11 = 0;
                }
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr2 = this.f86345T;
                int i14 = this.f82963s;
                this.f82963s = i14 + 1;
                char c12 = cArr2[i14];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c12);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84068h1(base64Variant, c12, 1);
                }
                int i15 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr3 = this.f86345T;
                int i16 = this.f82963s;
                this.f82963s = i16 + 1;
                char c13 = cArr3[i16];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c13);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c13 == '\"') {
                            int i17 = i11 + 1;
                            bArr[i11] = (byte) (i15 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            i11 = i17;
                            break;
                        }
                        iDecodeBase64Char3 = m84068h1(base64Variant, c13, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f82963s >= this.f82964t) {
                            m86846X1();
                        }
                        char[] cArr4 = this.f86345T;
                        int i18 = this.f82963s;
                        this.f82963s = i18 + 1;
                        char c14 = cArr4[i18];
                        if (!base64Variant.usesPaddingChar(c14) && m84068h1(base64Variant, c14, 3) != -2) {
                            throw m84060G1(base64Variant, c14, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i11] = (byte) (i15 >> 4);
                        i11++;
                    }
                }
                int i19 = (i15 << 6) | iDecodeBase64Char3;
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr5 = this.f86345T;
                int i21 = this.f82963s;
                this.f82963s = i21 + 1;
                char c15 = cArr5[i21];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c15);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c15 == '\"') {
                            int i22 = i11 + 1;
                            bArr[i11] = (byte) (i19 >> 10);
                            i11 += 2;
                            bArr[i22] = (byte) (i19 >> 2);
                            if (!base64Variant.usesPadding()) {
                                break;
                            }
                            this.f82963s--;
                            m84073m1(base64Variant);
                            break;
                        }
                        iDecodeBase64Char4 = m84068h1(base64Variant, c15, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        int i23 = i11 + 1;
                        bArr[i11] = (byte) (i19 >> 10);
                        i11 += 2;
                        bArr[i23] = (byte) (i19 >> 2);
                    }
                }
                int i24 = (i19 << 6) | iDecodeBase64Char4;
                bArr[i11] = (byte) (i24 >> 16);
                int i25 = i11 + 2;
                bArr[i11 + 1] = (byte) (i24 >> 8);
                i11 += 3;
                bArr[i25] = (byte) i24;
            }
        }
        this.f86350Y = false;
        if (i11 <= 0) {
            return i12;
        }
        int i26 = i12 + i11;
        outputStream.write(bArr, 0, i11);
        return i26;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: p */
    public byte[] mo10899p(Base64Variant base64Variant) throws IOException {
        byte[] bArr;
        JsonToken jsonToken = this.f82981e;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.f82950G) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
            m84093K0("Current token (" + this.f82981e + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.f86350Y) {
            try {
                this.f82950G = m86836N1(base64Variant);
                this.f86350Y = false;
            } catch (IllegalArgumentException e11) {
                throw m10873a("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e11.getMessage());
            }
        } else if (this.f82950G == null) {
            C6324c c6324cM84072l1 = m84072l1();
            m84089E0(mo10869W(), c6324cM84072l1, base64Variant);
            this.f82950G = c6324cM84072l1.m11079q();
        }
        return this.f82950G;
    }

    /* JADX INFO: renamed from: p2 */
    public void m86861p2(String str, String str2) throws IOException {
        StringBuilder sb2 = new StringBuilder(str);
        do {
            if (this.f82963s < this.f82964t || m86845W1()) {
                char c11 = this.f86345T[this.f82963s];
                if (Character.isJavaIdentifierPart(c11)) {
                    this.f82963s++;
                    sb2.append(c11);
                }
            }
            m84095M0("Unrecognized token '%s': was expecting %s", sb2, str2);
        } while (sb2.length() < 256);
        sb2.append("...");
        m84095M0("Unrecognized token '%s': was expecting %s", sb2, str2);
    }

    /* JADX INFO: renamed from: q2 */
    public final int m86862q2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                throw m10873a("Unexpected end-of-input within/between " + this.f82944A.m10941j() + " entries");
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/') {
                    m86868w2();
                } else if (c11 != '#' || !m86826B2()) {
                    return c11;
                }
            } else if (c11 < ' ') {
                if (c11 == '\n') {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (c11 == '\r') {
                    m86864s2();
                } else if (c11 != '\t') {
                    m84103U0(c11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r2 */
    public final void m86863r2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                break;
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c11 = cArr[i11];
            if (c11 <= '*') {
                if (c11 == '*') {
                    if (i12 >= this.f82964t && !m86845W1()) {
                        break;
                    }
                    char[] cArr2 = this.f86345T;
                    int i13 = this.f82963s;
                    if (cArr2[i13] == '/') {
                        this.f82963s = i13 + 1;
                        return;
                    }
                } else if (c11 < ' ') {
                    if (c11 == '\n') {
                        this.f82966v++;
                        this.f82967w = i12;
                    } else if (c11 == '\r') {
                        m86864s2();
                    } else if (c11 != '\t') {
                        m84103U0(c11);
                    }
                }
            }
        }
        m84098P0(" in a comment", null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: s0 */
    public final String mo10904s0() throws IOException {
        if (this.f82981e != JsonToken.FIELD_NAME) {
            if (mo10905t0() == JsonToken.VALUE_STRING) {
                return mo10869W();
            }
            return null;
        }
        this.f82948E = false;
        JsonToken jsonToken = this.f82945B;
        this.f82945B = null;
        this.f82981e = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this.f86350Y) {
                this.f86350Y = false;
                m86837O1();
            }
            return this.f82946C.m11106l();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
        }
        return null;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m86864s2() throws IOException {
        if (this.f82963s < this.f82964t || m86845W1()) {
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            if (cArr[i11] == '\n') {
                this.f82963s = i11 + 1;
            }
        }
        this.f82966v++;
        this.f82967w = this.f82963s;
    }

    @Override // p254f7.AbstractC37386c, com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: t0 */
    public final JsonToken mo10905t0() throws IOException {
        JsonToken jsonTokenM86856k2;
        JsonToken jsonToken = this.f82981e;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return m86849d2();
        }
        this.f82951H = 0;
        if (this.f86350Y) {
            m86870y2();
        }
        int iM86871z2 = m86871z2();
        if (iM86871z2 < 0) {
            close();
            this.f82981e = null;
            return null;
        }
        this.f82950G = null;
        if (iM86871z2 == 93 || iM86871z2 == 125) {
            m86835M1(iM86871z2);
            return this.f82981e;
        }
        if (this.f82944A.m86801p()) {
            iM86871z2 = m86867v2(iM86871z2);
            if ((this.f10027b & f86335c0) != 0 && (iM86871z2 == 93 || iM86871z2 == 125)) {
                m86835M1(iM86871z2);
                return this.f82981e;
            }
        }
        boolean zM10938g = this.f82944A.m10938g();
        if (zM10938g) {
            m86828D2();
            this.f82944A.m86805t(iM86871z2 == 34 ? m86854i2() : m86842T1(iM86871z2));
            this.f82981e = jsonToken2;
            iM86871z2 = m86865t2();
        }
        m86827C2();
        if (iM86871z2 == 34) {
            this.f86350Y = true;
            jsonTokenM86856k2 = JsonToken.VALUE_STRING;
        } else if (iM86871z2 == 91) {
            if (!zM10938g) {
                this.f82944A = this.f82944A.m86799m(this.f82969y, this.f82970z);
            }
            jsonTokenM86856k2 = JsonToken.START_ARRAY;
        } else if (iM86871z2 == 102) {
            m86822Y1();
            jsonTokenM86856k2 = JsonToken.VALUE_FALSE;
        } else if (iM86871z2 == 110) {
            m86823Z1();
            jsonTokenM86856k2 = JsonToken.VALUE_NULL;
        } else if (iM86871z2 == 116) {
            m86824c2();
            jsonTokenM86856k2 = JsonToken.VALUE_TRUE;
        } else if (iM86871z2 == 123) {
            if (!zM10938g) {
                this.f82944A = this.f82944A.m86800n(this.f82969y, this.f82970z);
            }
            jsonTokenM86856k2 = JsonToken.START_OBJECT;
        } else if (iM86871z2 == 125) {
            m84101S0(iM86871z2, "expected a value");
            m86824c2();
            jsonTokenM86856k2 = JsonToken.VALUE_TRUE;
        } else if (iM86871z2 == 45) {
            jsonTokenM86856k2 = m86856k2();
        } else if (iM86871z2 != 46) {
            switch (iM86871z2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonTokenM86856k2 = m86858m2(iM86871z2);
                    break;
                default:
                    jsonTokenM86856k2 = m86844V1(iM86871z2);
                    break;
            }
        } else {
            jsonTokenM86856k2 = m86853h2();
        }
        if (zM10938g) {
            this.f82945B = jsonTokenM86856k2;
            return this.f82981e;
        }
        this.f82981e = jsonTokenM86856k2;
        return jsonTokenM86856k2;
    }

    /* JADX INFO: renamed from: t2 */
    public final int m86865t2() throws IOException {
        int i11 = this.f82963s;
        if (i11 + 4 >= this.f82964t) {
            return m86866u2(false);
        }
        char[] cArr = this.f86345T;
        char c11 = cArr[i11];
        if (c11 == ':') {
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c12 = cArr[i12];
            if (c12 > ' ') {
                if (c12 == '/' || c12 == '#') {
                    return m86866u2(true);
                }
                this.f82963s = i11 + 2;
                return c12;
            }
            if (c12 == ' ' || c12 == '\t') {
                int i13 = i11 + 2;
                this.f82963s = i13;
                char c13 = cArr[i13];
                if (c13 > ' ') {
                    if (c13 == '/' || c13 == '#') {
                        return m86866u2(true);
                    }
                    this.f82963s = i11 + 3;
                    return c13;
                }
            }
            return m86866u2(true);
        }
        if (c11 == ' ' || c11 == '\t') {
            int i14 = i11 + 1;
            this.f82963s = i14;
            c11 = cArr[i14];
        }
        if (c11 != ':') {
            return m86866u2(false);
        }
        int i15 = this.f82963s;
        int i16 = i15 + 1;
        this.f82963s = i16;
        char c14 = cArr[i16];
        if (c14 > ' ') {
            if (c14 == '/' || c14 == '#') {
                return m86866u2(true);
            }
            this.f82963s = i15 + 2;
            return c14;
        }
        if (c14 == ' ' || c14 == '\t') {
            int i17 = i15 + 2;
            this.f82963s = i17;
            char c15 = cArr[i17];
            if (c15 > ' ') {
                if (c15 == '/' || c15 == '#') {
                    return m86866u2(true);
                }
                this.f82963s = i15 + 3;
                return c15;
            }
        }
        return m86866u2(true);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: u */
    public AbstractC6304g mo10906u() {
        return this.f86347V;
    }

    /* JADX INFO: renamed from: u2 */
    public final int m86866u2(boolean z11) throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                m84098P0(" within/between " + this.f82944A.m10941j() + " entries", null);
                return -1;
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                if (c11 == '/') {
                    m86868w2();
                } else if (c11 != '#' || !m86826B2()) {
                    if (z11) {
                        return c11;
                    }
                    if (c11 != ':') {
                        m84101S0(c11, "was expecting a colon to separate field name and value");
                    }
                    z11 = true;
                }
            } else if (c11 < ' ') {
                if (c11 == '\n') {
                    this.f82966v++;
                    this.f82967w = i12;
                } else if (c11 == '\r') {
                    m86864s2();
                } else if (c11 != '\t') {
                    m84103U0(c11);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: v */
    public JsonLocation mo10908v() {
        int i11 = (this.f82963s - this.f82967w) + 1;
        return new JsonLocation(m84067g1(), -1L, ((long) this.f82963s) + this.f82965u, this.f82966v, i11);
    }

    /* JADX INFO: renamed from: v2 */
    public final int m86867v2(int i11) throws IOException {
        if (i11 != 44) {
            m84101S0(i11, "was expecting comma to separate " + this.f82944A.m10941j() + " entries");
        }
        while (true) {
            int i12 = this.f82963s;
            if (i12 >= this.f82964t) {
                return m86862q2();
            }
            char[] cArr = this.f86345T;
            int i13 = i12 + 1;
            this.f82963s = i13;
            char c11 = cArr[i12];
            if (c11 > ' ') {
                if (c11 != '/' && c11 != '#') {
                    return c11;
                }
                this.f82963s = i12;
                return m86862q2();
            }
            if (c11 < ' ') {
                if (c11 == '\n') {
                    this.f82966v++;
                    this.f82967w = i13;
                } else if (c11 == '\r') {
                    m86864s2();
                } else if (c11 != '\t') {
                    m84103U0(c11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: w2 */
    public final void m86868w2() throws IOException {
        if ((this.f10027b & f86341i0) == 0) {
            m84101S0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f82963s >= this.f82964t && !m86845W1()) {
            m84098P0(" in a comment", null);
        }
        char[] cArr = this.f86345T;
        int i11 = this.f82963s;
        this.f82963s = i11 + 1;
        char c11 = cArr[i11];
        if (c11 == '/') {
            m86869x2();
        } else if (c11 == '*') {
            m86863r2();
        } else {
            m84101S0(c11, "was expecting either '*' or '/' for a comment");
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: x0 */
    public int mo10913x0(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this.f86350Y || this.f82981e != JsonToken.VALUE_STRING) {
            byte[] bArrMo10899p = mo10899p(base64Variant);
            outputStream.write(bArrMo10899p);
            return bArrMo10899p.length;
        }
        byte[] bArrM10977d = this.f82961q.m10977d();
        try {
            return m86859n2(base64Variant, outputStream, bArrM10977d);
        } finally {
            this.f82961q.m10988o(bArrM10977d);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m86869x2() throws IOException {
        while (true) {
            if (this.f82963s >= this.f82964t && !m86845W1()) {
                return;
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            int i12 = i11 + 1;
            this.f82963s = i12;
            char c11 = cArr[i11];
            if (c11 < ' ') {
                if (c11 == '\n') {
                    this.f82966v++;
                    this.f82967w = i12;
                    return;
                } else if (c11 == '\r') {
                    m86864s2();
                    return;
                } else if (c11 != '\t') {
                    m84103U0(c11);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z2 */
    public final int m86871z2() throws IOException {
        if (this.f82963s >= this.f82964t && !m86845W1()) {
            return m84071k1();
        }
        char[] cArr = this.f86345T;
        int i11 = this.f82963s;
        int i12 = i11 + 1;
        this.f82963s = i12;
        char c11 = cArr[i11];
        if (c11 > ' ') {
            if (c11 != '/' && c11 != '#') {
                return c11;
            }
            this.f82963s = i11;
            return m86825A2();
        }
        if (c11 != ' ') {
            if (c11 == '\n') {
                this.f82966v++;
                this.f82967w = i12;
            } else if (c11 == '\r') {
                m86864s2();
            } else if (c11 != '\t') {
                m84103U0(c11);
            }
        }
        while (true) {
            int i13 = this.f82963s;
            if (i13 >= this.f82964t) {
                return m86825A2();
            }
            char[] cArr2 = this.f86345T;
            int i14 = i13 + 1;
            this.f82963s = i14;
            char c12 = cArr2[i13];
            if (c12 > ' ') {
                if (c12 != '/' && c12 != '#') {
                    return c12;
                }
                this.f82963s = i13;
                return m86825A2();
            }
            if (c12 != ' ') {
                if (c12 == '\n') {
                    this.f82966v++;
                    this.f82967w = i14;
                } else if (c12 == '\r') {
                    m86864s2();
                } else if (c12 != '\t') {
                    m84103U0(c12);
                }
            }
        }
    }

    /* JADX INFO: renamed from: N1 */
    public byte[] m86836N1(Base64Variant base64Variant) throws IOException {
        C6324c c6324cM84072l1 = m84072l1();
        while (true) {
            if (this.f82963s >= this.f82964t) {
                m86846X1();
            }
            char[] cArr = this.f86345T;
            int i11 = this.f82963s;
            this.f82963s = i11 + 1;
            char c11 = cArr[i11];
            if (c11 > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c11);
                if (iDecodeBase64Char < 0) {
                    if (c11 == '\"') {
                        return c6324cM84072l1.m11079q();
                    }
                    iDecodeBase64Char = m84068h1(base64Variant, c11, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr2 = this.f86345T;
                int i12 = this.f82963s;
                this.f82963s = i12 + 1;
                char c12 = cArr2[i12];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c12);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = m84068h1(base64Variant, c12, 1);
                }
                int i13 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr3 = this.f86345T;
                int i14 = this.f82963s;
                this.f82963s = i14 + 1;
                char c13 = cArr3[i14];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c13);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c13 == '\"') {
                            c6324cM84072l1.m11069b(i13 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char3 = m84068h1(base64Variant, c13, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.f82963s >= this.f82964t) {
                            m86846X1();
                        }
                        char[] cArr4 = this.f86345T;
                        int i15 = this.f82963s;
                        this.f82963s = i15 + 1;
                        char c14 = cArr4[i15];
                        if (!base64Variant.usesPaddingChar(c14) && m84068h1(base64Variant, c14, 3) != -2) {
                            throw m84060G1(base64Variant, c14, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        c6324cM84072l1.m11069b(i13 >> 4);
                    }
                }
                int i16 = (i13 << 6) | iDecodeBase64Char3;
                if (this.f82963s >= this.f82964t) {
                    m86846X1();
                }
                char[] cArr5 = this.f86345T;
                int i17 = this.f82963s;
                this.f82963s = i17 + 1;
                char c15 = cArr5[i17];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c15);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c15 == '\"') {
                            c6324cM84072l1.m11071h(i16 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.f82963s--;
                                m84073m1(base64Variant);
                            }
                            return c6324cM84072l1.m11079q();
                        }
                        iDecodeBase64Char4 = m84068h1(base64Variant, c15, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c6324cM84072l1.m11071h(i16 >> 2);
                    }
                }
                c6324cM84072l1.m11070g((i16 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public void m86846X1() throws IOException {
        if (!m86845W1()) {
            m84097O0();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final void m86847a2(String str, int i11) throws IOException {
        int i12;
        int length = str.length();
        if (this.f82963s + length >= this.f82964t) {
            m86848b2(str, i11);
            return;
        }
        do {
            if (this.f86345T[this.f82963s] != str.charAt(i11)) {
                m86860o2(str.substring(0, i11));
            }
            i12 = this.f82963s + 1;
            this.f82963s = i12;
            i11++;
        } while (i11 < length);
        char c11 = this.f86345T[i12];
        if (c11 >= '0' && c11 != ']' && c11 != '}') {
            m86834L1(str, i11, c11);
        }
    }

    /* JADX INFO: renamed from: b2 */
    public final void m86848b2(String str, int i11) throws IOException {
        int i12;
        char c11;
        int length = str.length();
        do {
            if ((this.f82963s >= this.f82964t && !m86845W1()) || this.f86345T[this.f82963s] != str.charAt(i11)) {
                m86860o2(str.substring(0, i11));
            }
            i12 = this.f82963s + 1;
            this.f82963s = i12;
            i11++;
        } while (i11 < length);
        if ((i12 < this.f82964t || m86845W1()) && (c11 = this.f86345T[this.f82963s]) >= '0' && c11 != ']' && c11 != '}') {
            m86834L1(str, i11, c11);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public void m86860o2(String str) throws IOException {
        m86861p2(str, m84083w1());
    }

    @Override // p254f7.AbstractC37385b
    /* JADX INFO: renamed from: s1 */
    public void mo84079s1() throws IOException {
        char[] cArr;
        super.mo84079s1();
        this.f86348W.m89705r();
        if (this.f86346U && (cArr = this.f86345T) != null) {
            this.f86345T = null;
            this.f82961q.m10992s(cArr);
        }
    }

    public C38469g(C6310d c6310d, int i11, Reader reader, AbstractC6304g abstractC6304g, C40936b c40936b) {
        super(c6310d, i11);
        this.f86344S = reader;
        this.f86345T = c6310d.m10981h();
        this.f82963s = 0;
        this.f82964t = 0;
        this.f86347V = abstractC6304g;
        this.f86348W = c40936b;
        this.f86349X = c40936b.m89700m();
        this.f86346U = true;
    }
}
