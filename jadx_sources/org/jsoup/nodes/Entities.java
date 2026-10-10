package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import nh0.C42841b;
import oh0.C43093c;
import org.jsoup.parser.C43295a;
import p852kotlin.text.Typography;
import ph0.C43479a;

/* JADX INFO: loaded from: classes61.dex */
public class Entities {

    /* JADX INFO: renamed from: a */
    public static final char[] f95369a = {',', ';'};

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, String> f95370b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static final Document.OutputSettings f95371c = new Document.OutputSettings();

    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        public static CoreCharset byName(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            return str.startsWith("UTF-") ? utf : fallback;
        }
    }

    public enum EscapeMode {
        xhtml(C43479a.f95997a, 4),
        base(C43479a.f95998b, 106),
        extended(C43479a.f95999c, 2125);

        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;

        public int codepointForName(String str) {
            int iBinarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (iBinarySearch >= 0) {
                return this.codeVals[iBinarySearch];
            }
            return -1;
        }

        public String nameForCodepoint(int i11) {
            int iBinarySearch = Arrays.binarySearch(this.codeKeys, i11);
            if (iBinarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (iBinarySearch < strArr.length - 1) {
                int i12 = iBinarySearch + 1;
                if (this.codeKeys[i12] == i11) {
                    return strArr[i12];
                }
            }
            return strArr[iBinarySearch];
        }

        EscapeMode(String str, int i11) {
            Entities.m94915h(this, str, i11);
        }
    }

    /* JADX INFO: renamed from: org.jsoup.nodes.Entities$a */
    public static /* synthetic */ class C43182a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95374a;

        static {
            int[] iArr = new int[CoreCharset.values().length];
            f95374a = iArr;
            try {
                iArr[CoreCharset.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95374a[CoreCharset.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m94910c(CoreCharset coreCharset, char c11, CharsetEncoder charsetEncoder) {
        int i11 = C43182a.f95374a[coreCharset.ordinal()];
        if (i11 == 1) {
            return c11 < 128;
        }
        if (i11 != 2) {
            return charsetEncoder.canEncode(c11);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static int m94911d(String str, int[] iArr) {
        String str2 = f95370b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iCodepointForName = EscapeMode.extended.codepointForName(str);
        if (iCodepointForName == -1) {
            return 0;
        }
        iArr[0] = iCodepointForName;
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m94913f(String str) {
        return EscapeMode.base.codepointForName(str) != -1;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m94914g(String str) {
        return EscapeMode.extended.codepointForName(str) != -1;
    }

    /* JADX INFO: renamed from: h */
    public static void m94915h(EscapeMode escapeMode, String str, int i11) {
        int i12;
        escapeMode.nameKeys = new String[i11];
        escapeMode.codeVals = new int[i11];
        escapeMode.codeKeys = new int[i11];
        escapeMode.nameVals = new String[i11];
        C43295a c43295a = new C43295a(str);
        int i13 = 0;
        while (!c43295a.m95101t()) {
            String strM95094m = c43295a.m95094m('=');
            c43295a.m95083a();
            int i14 = Integer.parseInt(c43295a.m95096o(f95369a), 36);
            char cM95100s = c43295a.m95100s();
            c43295a.m95083a();
            if (cM95100s == ',') {
                i12 = Integer.parseInt(c43295a.m95094m(';'), 36);
                c43295a.m95083a();
            } else {
                i12 = -1;
            }
            int i15 = Integer.parseInt(c43295a.m95094m(Typography.amp), 36);
            c43295a.m95083a();
            escapeMode.nameKeys[i13] = strM95094m;
            escapeMode.codeVals[i13] = i14;
            escapeMode.codeKeys[i15] = i14;
            escapeMode.nameVals[i15] = strM95094m;
            if (i12 != -1) {
                f95370b.put(strM95094m, new String(new int[]{i14, i12}, 0, 2));
            }
            i13++;
        }
        C42841b.m93952d(i13 == i11, "Unexpected count of entities loaded");
    }

    /* JADX INFO: renamed from: b */
    public static void m94909b(Appendable appendable, EscapeMode escapeMode, int i11) throws IOException {
        String strNameForCodepoint = escapeMode.nameForCodepoint(i11);
        if (!"".equals(strNameForCodepoint)) {
            appendable.append(Typography.amp).append(strNameForCodepoint).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i11)).append(';');
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX INFO: renamed from: e */
    public static void m94912e(Appendable appendable, String str, Document.OutputSettings outputSettings, boolean z11, boolean z12, boolean z13) throws IOException {
        String str2;
        char c11;
        EscapeMode escapeModeM94824f = outputSettings.m94824f();
        CharsetEncoder charsetEncoderM94823e = outputSettings.m94823e();
        CoreCharset coreCharset = outputSettings.f95353e;
        int length = str.length();
        int iCharCount = 0;
        boolean z14 = false;
        boolean z15 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (z12) {
                if (C43093c.m94690i(iCodePointAt)) {
                    if ((!z13 || z14) && !z15) {
                        appendable.append(' ');
                        z15 = true;
                    }
                } else {
                    z15 = false;
                    z14 = true;
                    if (iCodePointAt < 65536) {
                        c11 = (char) iCodePointAt;
                        if (c11 != '\"') {
                            if (c11 != '&') {
                                if (c11 != '<') {
                                    if (c11 != '>') {
                                        if (c11 != 160) {
                                            if (m94910c(coreCharset, c11, charsetEncoderM94823e)) {
                                                appendable.append(c11);
                                            } else {
                                                m94909b(appendable, escapeModeM94824f, iCodePointAt);
                                            }
                                        } else if (escapeModeM94824f != EscapeMode.xhtml) {
                                            appendable.append("&nbsp;");
                                        } else {
                                            appendable.append("&#xa0;");
                                        }
                                    } else if (!z11) {
                                        appendable.append("&gt;");
                                    } else {
                                        appendable.append(c11);
                                    }
                                } else if (!z11) {
                                    appendable.append("&lt;");
                                } else {
                                    appendable.append("&lt;");
                                }
                            } else {
                                appendable.append("&amp;");
                            }
                        } else if (z11) {
                            appendable.append("&quot;");
                        } else {
                            appendable.append(c11);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderM94823e.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m94909b(appendable, escapeModeM94824f, iCodePointAt);
                        }
                    }
                }
            } else if (iCodePointAt < 65536) {
                c11 = (char) iCodePointAt;
                if (c11 != '\"') {
                    if (c11 != '&') {
                        if (c11 != '<') {
                            if (c11 != '>') {
                                if (c11 != 160) {
                                    if (m94910c(coreCharset, c11, charsetEncoderM94823e)) {
                                        appendable.append(c11);
                                    } else {
                                        m94909b(appendable, escapeModeM94824f, iCodePointAt);
                                    }
                                } else if (escapeModeM94824f != EscapeMode.xhtml) {
                                    appendable.append("&nbsp;");
                                } else {
                                    appendable.append("&#xa0;");
                                }
                            } else if (!z11) {
                                appendable.append("&gt;");
                            } else {
                                appendable.append(c11);
                            }
                        } else if (!z11 && escapeModeM94824f != EscapeMode.xhtml) {
                            appendable.append(c11);
                        } else {
                            appendable.append("&lt;");
                        }
                    } else {
                        appendable.append("&amp;");
                    }
                } else if (z11) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c11);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM94823e.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m94909b(appendable, escapeModeM94824f, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }
}
