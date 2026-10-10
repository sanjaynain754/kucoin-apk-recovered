package com.horcrux.svg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewProps;

/* JADX INFO: renamed from: com.horcrux.svg.c */
/* JADX INFO: compiled from: FontData.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9235c {

    /* JADX INFO: renamed from: p */
    public static final C9235c f13164p = new C9235c();

    /* JADX INFO: renamed from: a */
    public final double f13165a;

    /* JADX INFO: renamed from: b */
    public final String f13166b;

    /* JADX INFO: renamed from: c */
    public final TextProperties$FontStyle f13167c;

    /* JADX INFO: renamed from: d */
    public final ReadableMap f13168d;

    /* JADX INFO: renamed from: e */
    public TextProperties$FontWeight f13169e;

    /* JADX INFO: renamed from: f */
    public int f13170f;

    /* JADX INFO: renamed from: g */
    public final String f13171g;

    /* JADX INFO: renamed from: h */
    public final String f13172h;

    /* JADX INFO: renamed from: i */
    public final TextProperties$FontVariantLigatures f13173i;

    /* JADX INFO: renamed from: j */
    public final TextProperties$TextAnchor f13174j;

    /* JADX INFO: renamed from: k */
    public final TextProperties$TextDecoration f13175k;

    /* JADX INFO: renamed from: l */
    public final double f13176l;

    /* JADX INFO: renamed from: m */
    public final double f13177m;

    /* JADX INFO: renamed from: n */
    public final double f13178n;

    /* JADX INFO: renamed from: o */
    public final boolean f13179o;

    /* JADX INFO: renamed from: com.horcrux.svg.c$a */
    /* JADX INFO: compiled from: FontData.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final TextProperties$FontWeight[] f13180a;

        /* JADX INFO: renamed from: b */
        public static final int[] f13181b;

        static {
            TextProperties$FontWeight textProperties$FontWeight = TextProperties$FontWeight.w100;
            TextProperties$FontWeight textProperties$FontWeight2 = TextProperties$FontWeight.w200;
            TextProperties$FontWeight textProperties$FontWeight3 = TextProperties$FontWeight.w300;
            TextProperties$FontWeight textProperties$FontWeight4 = TextProperties$FontWeight.Normal;
            TextProperties$FontWeight textProperties$FontWeight5 = TextProperties$FontWeight.w500;
            TextProperties$FontWeight textProperties$FontWeight6 = TextProperties$FontWeight.w600;
            TextProperties$FontWeight textProperties$FontWeight7 = TextProperties$FontWeight.Bold;
            TextProperties$FontWeight textProperties$FontWeight8 = TextProperties$FontWeight.w800;
            TextProperties$FontWeight textProperties$FontWeight9 = TextProperties$FontWeight.w900;
            f13180a = new TextProperties$FontWeight[]{textProperties$FontWeight, textProperties$FontWeight, textProperties$FontWeight2, textProperties$FontWeight3, textProperties$FontWeight4, textProperties$FontWeight5, textProperties$FontWeight6, textProperties$FontWeight7, textProperties$FontWeight8, textProperties$FontWeight9, textProperties$FontWeight9};
            f13181b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        /* JADX INFO: renamed from: a */
        public static int m14212a(int i11) {
            if (i11 < 350) {
                return 400;
            }
            if (i11 < 550) {
                return 700;
            }
            if (i11 < 900) {
                return 900;
            }
            return i11;
        }

        /* JADX INFO: renamed from: b */
        public static int m14213b(TextProperties$FontWeight textProperties$FontWeight, C9235c c9235c) {
            if (textProperties$FontWeight == TextProperties$FontWeight.Bolder) {
                return m14212a(c9235c.f13170f);
            }
            return textProperties$FontWeight == TextProperties$FontWeight.Lighter ? m14214c(c9235c.f13170f) : f13181b[textProperties$FontWeight.ordinal()];
        }

        /* JADX INFO: renamed from: c */
        public static int m14214c(int i11) {
            if (i11 < 100) {
                return i11;
            }
            if (i11 < 550) {
                return 100;
            }
            return i11 < 750 ? 400 : 700;
        }

        /* JADX INFO: renamed from: d */
        public static TextProperties$FontWeight m14215d(int i11) {
            return f13180a[Math.round(i11 / 100.0f)];
        }
    }

    public C9235c() {
        this.f13168d = null;
        this.f13166b = "";
        this.f13167c = TextProperties$FontStyle.normal;
        this.f13169e = TextProperties$FontWeight.Normal;
        this.f13170f = 400;
        this.f13171g = "";
        this.f13172h = "";
        this.f13173i = TextProperties$FontVariantLigatures.normal;
        this.f13174j = TextProperties$TextAnchor.start;
        this.f13175k = TextProperties$TextDecoration.None;
        this.f13179o = false;
        this.f13176l = 0.0d;
        this.f13165a = 12.0d;
        this.f13177m = 0.0d;
        this.f13178n = 0.0d;
    }

    /* JADX INFO: renamed from: b */
    public final void m14210b(C9235c c9235c) {
        this.f13170f = c9235c.f13170f;
        this.f13169e = c9235c.f13169e;
    }

    /* JADX INFO: renamed from: a */
    public final void m14209a(C9235c c9235c, double d11) {
        long jRound = Math.round(d11);
        if (jRound >= 1 && jRound <= 1000) {
            int i11 = (int) jRound;
            this.f13170f = i11;
            this.f13169e = a.m14215d(i11);
            return;
        }
        m14210b(c9235c);
    }

    /* JADX INFO: renamed from: c */
    public final double m14211c(ReadableMap readableMap, String str, double d11, double d12, double d13) {
        if (readableMap.getType(str) == ReadableType.Number) {
            return readableMap.getDouble(str);
        }
        return C9241i.m14267b(readableMap.getString(str), d13, d11, d12);
    }

    public C9235c(ReadableMap readableMap, C9235c c9235c, double d11) {
        String string;
        String string2;
        TextProperties$FontVariantLigatures textProperties$FontVariantLigaturesValueOf;
        TextProperties$TextAnchor textProperties$TextAnchorValueOf;
        TextProperties$TextDecoration textProperties$TextDecoration;
        double dM14211c;
        double dM14211c2;
        double d12 = c9235c.f13165a;
        if (readableMap.hasKey("fontSize")) {
            this.f13165a = m14211c(readableMap, "fontSize", 1.0d, d12, d12);
        } else {
            this.f13165a = d12;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                m14209a(c9235c, readableMap.getDouble("fontWeight"));
            } else {
                String string3 = readableMap.getString("fontWeight");
                if (TextProperties$FontWeight.hasEnum(string3)) {
                    int iM14213b = a.m14213b(TextProperties$FontWeight.get(string3), c9235c);
                    this.f13170f = iM14213b;
                    this.f13169e = a.m14215d(iM14213b);
                } else if (string3 != null) {
                    m14209a(c9235c, Double.parseDouble(string3));
                } else {
                    m14210b(c9235c);
                }
            }
        } else {
            m14210b(c9235c);
        }
        this.f13168d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : c9235c.f13168d;
        this.f13166b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : c9235c.f13166b;
        this.f13167c = readableMap.hasKey("fontStyle") ? TextProperties$FontStyle.valueOf(readableMap.getString("fontStyle")) : c9235c.f13167c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = c9235c.f13171g;
        }
        this.f13171g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = c9235c.f13172h;
        }
        this.f13172h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            textProperties$FontVariantLigaturesValueOf = TextProperties$FontVariantLigatures.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            textProperties$FontVariantLigaturesValueOf = c9235c.f13173i;
        }
        this.f13173i = textProperties$FontVariantLigaturesValueOf;
        if (readableMap.hasKey("textAnchor")) {
            textProperties$TextAnchorValueOf = TextProperties$TextAnchor.valueOf(readableMap.getString("textAnchor"));
        } else {
            textProperties$TextAnchorValueOf = c9235c.f13174j;
        }
        this.f13174j = textProperties$TextAnchorValueOf;
        if (readableMap.hasKey(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
            textProperties$TextDecoration = TextProperties$TextDecoration.getEnum(readableMap.getString(TtmlNode.ATTR_TTS_TEXT_DECORATION));
        } else {
            textProperties$TextDecoration = c9235c.f13175k;
        }
        this.f13175k = textProperties$TextDecoration;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f13179o = zHasKey || c9235c.f13179o;
        this.f13176l = zHasKey ? m14211c(readableMap, "kerning", d11, this.f13165a, 0.0d) : c9235c.f13176l;
        if (readableMap.hasKey("wordSpacing")) {
            dM14211c = m14211c(readableMap, "wordSpacing", d11, this.f13165a, 0.0d);
        } else {
            dM14211c = c9235c.f13177m;
        }
        this.f13177m = dM14211c;
        if (readableMap.hasKey(ViewProps.LETTER_SPACING)) {
            dM14211c2 = m14211c(readableMap, ViewProps.LETTER_SPACING, d11, this.f13165a, 0.0d);
        } else {
            dM14211c2 = c9235c.f13178n;
        }
        this.f13178n = dM14211c2;
    }
}
