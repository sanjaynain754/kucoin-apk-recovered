package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.text.ReactFontManager;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class TSpanView extends TextView {

    /* JADX INFO: renamed from: r */
    public Path f13116r;

    /* JADX INFO: renamed from: s */
    public String f13117s;

    /* JADX INFO: renamed from: t */
    public TextPathView f13118t;

    /* JADX INFO: renamed from: u */
    public final ArrayList<String> f13119u;

    /* JADX INFO: renamed from: v */
    public final ArrayList<Matrix> f13120v;

    /* JADX INFO: renamed from: w */
    public final AssetManager f13121w;

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView
    public void clearCache() {
        this.f13116r = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f13116r = null;
        super.invalidate();
    }

    /* JADX INFO: renamed from: com.horcrux.svg.TSpanView$a */
    public static /* synthetic */ class C9228a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13122a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13123b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f13124c;

        static {
            int[] iArr = new int[TextProperties$AlignmentBaseline.values().length];
            f13124c = iArr;
            try {
                iArr[TextProperties$AlignmentBaseline.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13124c[TextProperties$AlignmentBaseline.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[TextProperties$TextLengthAdjust.values().length];
            f13123b = iArr2;
            try {
                iArr2[TextProperties$TextLengthAdjust.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f13123b[TextProperties$TextLengthAdjust.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[TextProperties$TextAnchor.values().length];
            f13122a = iArr3;
            try {
                iArr3[TextProperties$TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f13122a[TextProperties$TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f13122a[TextProperties$TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public static String m14155Q(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i11 = 0; i11 < runCount; i11++) {
            bArr[i11] = (byte) bidi.getRunLevel(i11);
            numArr[i11] = Integer.valueOf(i11);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < runCount; i12++) {
            int iIntValue = numArr[i12].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: H */
    public final void m14156H(Paint paint, C9235c c9235c) {
        int i11 = Build.VERSION.SDK_INT;
        double d11 = c9235c.f13178n;
        paint.setLetterSpacing((float) (d11 / (c9235c.f13165a * ((double) this.mScale))));
        if (d11 == 0.0d && c9235c.f13173i == TextProperties$FontVariantLigatures.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c9235c.f13171g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c9235c.f13171g);
        }
        if (i11 >= 26) {
            paint.setFontVariationSettings("'wght' " + c9235c.f13170f + c9235c.f13172h);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m14157I(Paint paint, C9235c c9235c) {
        int i11 = 0;
        boolean z11 = c9235c.f13169e == TextProperties$FontWeight.Bold || c9235c.f13170f >= 550;
        boolean z12 = c9235c.f13167c == TextProperties$FontStyle.italic;
        if (z11 && z12) {
            i11 = 3;
        } else if (z11) {
            i11 = 1;
        } else if (z12) {
            i11 = 2;
        }
        int i12 = c9235c.f13170f;
        String str = c9235c.f13166b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                C9250s.m14286a();
                Typeface.Builder builderM14285a = C9249q.m14285a(this.f13121w, str2);
                builderM14285a.setFontVariationSettings("'wght' " + i12 + c9235c.f13172h);
                builderM14285a.setWeight(i12);
                builderM14285a.setItalic(z12);
                typeface = builderM14285a.build();
                if (typeface == null) {
                    C9250s.m14286a();
                    Typeface.Builder builderM14285a2 = C9249q.m14285a(this.f13121w, str3);
                    builderM14285a2.setFontVariationSettings("'wght' " + i12 + c9235c.f13172h);
                    builderM14285a2.setWeight(i12);
                    builderM14285a2.setItalic(z12);
                    typeface = builderM14285a2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f13121w, str2), i11);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f13121w, str3), i11);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i11, this.f13121w);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i12, z12);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c9235c.f13165a * ((double) this.mScale)));
        paint.setLetterSpacing(0.0f);
    }

    /* JADX INFO: renamed from: K */
    public final double m14159K(SVGLength sVGLength, double d11, double d12) {
        return C9241i.m14266a(sVGLength, d11, 0.0d, this.mScale, d12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x029a A[PHI: r3
      0x029a: PHI (r3v10 double) = 
      (r3v9 double)
      (r3v9 double)
      (r3v9 double)
      (r3v9 double)
      (r3v9 double)
      (r3v34 double)
      (r3v35 double)
      (r3v9 double)
      (r3v9 double)
      (r3v9 double)
      (r3v40 double)
      (r3v41 double)
     binds: [B:76:0x023b, B:78:0x0241, B:80:0x024d, B:82:0x0251, B:98:0x0286, B:123:0x0306, B:112:0x02d9, B:101:0x029e, B:103:0x02a4, B:105:0x02aa, B:110:0x02c6, B:99:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x02d9 A[PHI: r36
      0x02d9: PHI (r36v4 double) = (r36v3 double), (r36v3 double), (r36v5 double) binds: [B:120:0x02f8, B:122:0x0304, B:111:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x032e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0338  */
    /* JADX WARN: Code duplicated, block: B:129:0x033f  */
    /* JADX WARN: Code duplicated, block: B:132:0x034b  */
    /* JADX WARN: Code duplicated, block: B:138:0x037b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0388  */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:144:0x038e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0391  */
    /* JADX WARN: Code duplicated, block: B:148:0x0399  */
    /* JADX WARN: Code duplicated, block: B:149:0x039e  */
    /* JADX WARN: Code duplicated, block: B:152:0x03be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0403  */
    /* JADX WARN: Code duplicated, block: B:167:0x040e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0412  */
    /* JADX WARN: Code duplicated, block: B:170:0x041f  */
    /* JADX WARN: Code duplicated, block: B:173:0x042e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0439  */
    /* JADX WARN: Code duplicated, block: B:178:0x0485  */
    /* JADX WARN: Code duplicated, block: B:181:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:182:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:185:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:187:0x0510  */
    /* JADX WARN: Code duplicated, block: B:188:0x051b  */
    /* JADX WARN: Code duplicated, block: B:195:0x036e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Code duplicated, block: B:42:0x013e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:49:0x0162  */
    /* JADX WARN: Code duplicated, block: B:52:0x017e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0196  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0200 A[PHI: r3
      0x0200: PHI (r3v56 double) = (r3v7 double), (r3v48 double), (r3v51 double), (r3v53 double), (r3v54 double), (r3v55 double), (r3v57 double) binds: [B:63:0x01fb, B:72:0x0217, B:70:0x0211, B:68:0x0209, B:67:0x0206, B:66:0x0203, B:64:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0203  */
    /* JADX WARN: Code duplicated, block: B:67:0x0206  */
    /* JADX WARN: Code duplicated, block: B:68:0x0209  */
    /* JADX WARN: Code duplicated, block: B:69:0x020c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0214  */
    /* JADX WARN: Code duplicated, block: B:72:0x0217  */
    /* JADX WARN: Code duplicated, block: B:73:0x021c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0233  */
    /* JADX WARN: Code duplicated, block: B:75:0x0237  */
    /* JADX WARN: Code duplicated, block: B:77:0x023d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0260  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0089, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x00a2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00be, please report this as an issue */
    /* JADX INFO: renamed from: L */
    public final Path m14160L(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        double length;
        boolean zIsClosed;
        PathMeasure pathMeasure2;
        boolean z11;
        int i11;
        float[] fArr;
        TextProperties$TextAnchor textProperties$TextAnchor;
        double d11;
        double dMo14165t;
        double dM14162N;
        double dM14219c;
        TSpanView tSpanView;
        float[] fArr2;
        boolean z12;
        PathMeasure pathMeasure3;
        double d12;
        double d13;
        double d14;
        C9236d c9236d;
        int i12;
        double d15;
        boolean z13;
        double d16;
        SVGLength sVGLength;
        double d17;
        double d18;
        boolean z14;
        boolean z15;
        double d19;
        Path path;
        int i13;
        double d21;
        double d22;
        double d23;
        double dM14267b;
        double d24;
        String strM14194r;
        TextProperties$AlignmentBaseline textProperties$AlignmentBaselineM14193q;
        int i14;
        double d25;
        Matrix matrix;
        Matrix matrix2;
        Matrix matrix3;
        float[] fArr3;
        float[] fArr4;
        int i15;
        char c11;
        String strValueOf;
        boolean z16;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        double dMeasureText;
        int i21;
        double d26;
        double d27;
        double d28;
        double dM14227l;
        double dM14228m;
        double dM14224i;
        double dM14225j;
        String str2;
        double dM14226k;
        Canvas canvas2;
        C9237e c9237e;
        Path path2;
        Paint paint2;
        double d29;
        double d31;
        String str3;
        float f12;
        Path pathM14236b;
        RectF rectF;
        double d32;
        double d33;
        double d34;
        int i22;
        int i23;
        int i24;
        double d35;
        double dM14266a;
        boolean z17;
        int i25;
        double dM14159K;
        double d36;
        double d37;
        double d38;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length2 = str.length();
        Path path3 = new Path();
        this.f13119u.clear();
        this.f13120v.clear();
        if (length2 != 0) {
            boolean z18 = this.f13118t != null;
            if (z18) {
                pathMeasure = new PathMeasure(this.f13118t.m14170K(canvas3, paint3), false);
                length = pathMeasure.getLength();
                zIsClosed = length != 0.0d ? pathMeasure.isClosed() : false;
            } else {
                pathMeasure = null;
                length = 0.0d;
            }
            C9236d c9236dM14051j = m14051j();
            C9235c c9235cM14218b = c9236dM14051j.m14218b();
            m14157I(paint3, c9235cM14218b);
            C9237e c9237e2 = new C9237e(paint3);
            double d39 = 0.0d;
            boolean[] zArr = new boolean[length2];
            char[] charArray = str.toCharArray();
            double d41 = c9235cM14218b.f13176l;
            C9237e c9237e3 = c9237e2;
            double d42 = c9235cM14218b.f13177m;
            double d43 = c9235cM14218b.f13178n;
            boolean z19 = c9235cM14218b.f13179o;
            if (d43 == 0.0d) {
                pathMeasure2 = pathMeasure;
                z11 = c9235cM14218b.f13173i == TextProperties$FontVariantLigatures.normal;
                i11 = Build.VERSION.SDK_INT;
                if (z11) {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c9235cM14218b.f13171g);
                } else {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c9235cM14218b.f13171g);
                }
                if (i11 >= 26) {
                    paint3.setFontVariationSettings("'wght' " + c9235cM14218b.f13170f + c9235cM14218b.f13172h);
                }
                ReadableMap readableMap = c9235cM14218b.f13168d;
                fArr = new float[length2];
                paint3.getTextWidths(str, fArr);
                textProperties$TextAnchor = c9235cM14218b.f13174j;
                d11 = d41;
                dMo14165t = m14196u().mo14165t(paint3);
                dM14162N = m14162N(textProperties$TextAnchor, dMo14165t);
                dM14219c = c9236dM14051j.m14219c();
                if (z18) {
                    if (this.f13118t.m14167H() == TextProperties$TextPathMidLine.sharp) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (this.f13118t.m14168I() == TextProperties$TextPathSide.right) {
                        i25 = -1;
                    } else {
                        i25 = 1;
                    }
                    fArr2 = fArr;
                    z12 = z19;
                    pathMeasure3 = pathMeasure2;
                    c9236d = c9236dM14051j;
                    double d44 = length;
                    d14 = dMo14165t;
                    dM14159K = m14159K(this.f13118t.m14169J(), d44, dM14219c);
                    tSpanView = this;
                    d12 = d44;
                    d36 = dM14162N + dM14159K;
                    d13 = dM14219c;
                    if (zIsClosed) {
                        d37 = d12 / 2.0d;
                        if (textProperties$TextAnchor == TextProperties$TextAnchor.middle) {
                            d38 = -d37;
                        } else {
                            d38 = 0.0d;
                        }
                        double d45 = dM14159K + d38;
                        d15 = d36;
                        z13 = z17;
                        d39 = d45;
                        d16 = d45 + d12;
                        i12 = i25;
                    } else {
                        d15 = d36;
                        z13 = z17;
                        i12 = i25;
                    }
                    sVGLength = tSpanView.f13146h;
                    d17 = 1.0d;
                    if (sVGLength != null) {
                        dM14266a = C9241i.m14266a(sVGLength, canvas3.getWidth(), 0.0d, tSpanView.mScale, d13);
                        if (dM14266a >= 0.0d) {
                            throw new IllegalArgumentException("Negative textLength value");
                        }
                        if (C9228a.f13123b[tSpanView.f13148j.ordinal()] != 2) {
                            d43 += (dM14266a - d14) / ((double) (length2 - 1));
                        } else {
                            d17 = dM14266a / d14;
                        }
                    }
                    d18 = i12;
                    z14 = z13;
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    z15 = z18;
                    d19 = fontMetrics.descent;
                    path = path3;
                    float f13 = fontMetrics.leading;
                    i13 = i12;
                    d21 = d17 * d18;
                    d22 = ((double) f13) + d19;
                    d23 = (-fontMetrics.ascent) + f13;
                    dM14267b = -fontMetrics.top;
                    d24 = dM14267b + d22;
                    strM14194r = tSpanView.m14194r();
                    textProperties$AlignmentBaselineM14193q = tSpanView.m14193q();
                    if (textProperties$AlignmentBaselineM14193q != null) {
                        switch (C9228a.f13124c[textProperties$AlignmentBaselineM14193q.ordinal()]) {
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                                i14 = 0;
                                dM14267b = -d19;
                                break;
                            case 5:
                                i14 = 0;
                                dM14267b = 0.0d;
                                break;
                            case 7:
                                Rect rect = new Rect();
                                paint3.getTextBounds("x", 0, 1, rect);
                                dM14267b = ((double) rect.height()) / 2.0d;
                                i14 = 0;
                                break;
                            case 8:
                                dM14267b = (d23 - d19) / 2.0d;
                                i14 = 0;
                                break;
                            case 9:
                                d35 = 0.5d;
                                dM14267b = d35 * d23;
                                i14 = 0;
                                break;
                            case 10:
                                d35 = 0.8d;
                                dM14267b = d35 * d23;
                                i14 = 0;
                                break;
                            case 11:
                            case 12:
                            case 13:
                                dM14267b = d23;
                                i14 = 0;
                                break;
                            case 14:
                                dM14267b = d22;
                                i14 = 0;
                                break;
                            case 15:
                                dM14267b = d24 / 2.0d;
                                i14 = 0;
                                break;
                            case 16:
                                i14 = 0;
                                break;
                            default:
                                dM14267b = 0.0d;
                                i14 = 0;
                                break;
                        }
                    } else {
                        i14 = 0;
                        dM14267b = 0.0d;
                    }
                    if (strM14194r == null && !strM14194r.isEmpty() && (i23 = C9228a.f13124c[textProperties$AlignmentBaselineM14193q.ordinal()]) != 14 && i23 != 16) {
                        switch (strM14194r.hashCode()) {
                            case -1720785339:
                                if (!strM14194r.equals("baseline")) {
                                    i24 = -1;
                                } else {
                                    i24 = i14;
                                }
                                break;
                            case 114240:
                                if (!strM14194r.equals(AuthenticationTokenClaims.JSON_KEY_SUB)) {
                                    i24 = -1;
                                } else {
                                    i24 = 1;
                                }
                                break;
                            case 109801339:
                                if (!strM14194r.equals("super")) {
                                    i24 = -1;
                                } else {
                                    i24 = 2;
                                }
                                break;
                            default:
                                i24 = -1;
                                break;
                        }
                        switch (i24) {
                            case 0:
                                d25 = dM14267b;
                                break;
                            case 1:
                                d25 = dM14267b;
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i26 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map = readableMap.getMap("tables");
                                    if (map.hasKey("os2")) {
                                        ReadableMap map2 = map.getMap("os2");
                                        if (map2.hasKey("ySubscriptYOffset")) {
                                            dM14267b = d25 + (((((double) tSpanView.mScale) * d13) * map2.getDouble("ySubscriptYOffset")) / ((double) i26));
                                        } else {
                                            dM14267b = d25;
                                        }
                                    } else {
                                        dM14267b = d25;
                                    }
                                    d25 = dM14267b;
                                }
                                break;
                            case 2:
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i27 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map3 = readableMap.getMap("tables");
                                    if (map3.hasKey("os2")) {
                                        ReadableMap map4 = map3.getMap("os2");
                                        if (map4.hasKey("ySuperscriptYOffset")) {
                                            dM14267b -= ((((double) tSpanView.mScale) * d13) * map4.getDouble("ySuperscriptYOffset")) / ((double) i27);
                                        }
                                    }
                                    d25 = dM14267b;
                                    dM14267b = d25;
                                }
                                d25 = dM14267b;
                                break;
                            default:
                                float f14 = tSpanView.mScale;
                                dM14267b -= C9241i.m14267b(strM14194r, ((double) f14) * d13, f14, d13);
                                d25 = dM14267b;
                                break;
                        }
                    } else {
                        d25 = dM14267b;
                    }
                    matrix = new Matrix();
                    matrix2 = new Matrix();
                    matrix3 = new Matrix();
                    fArr3 = new float[9];
                    fArr4 = new float[9];
                    i15 = i14;
                    while (i15 < length2) {
                        c11 = charArray[i15];
                        strValueOf = String.valueOf(c11);
                        z16 = zArr[i15];
                        if (z16) {
                            strValueOf = "";
                            i17 = i14;
                            f11 = 0.0f;
                        } else {
                            i16 = i15;
                            i17 = i14;
                            f11 = 0.0f;
                            while (true) {
                                i18 = i16 + 1;
                                if (i18 >= length2 && fArr2[i18] <= 0.0f) {
                                    strValueOf = strValueOf + charArray[i18];
                                    zArr[i18] = true;
                                    i16 = i18;
                                    i17 = 1;
                                }
                            }
                        }
                        i19 = i15;
                        dMeasureText = ((double) paint3.measureText(strValueOf)) * d17;
                        if (!z12) {
                            d11 = (((double) fArr2[i19]) * d17) - dMeasureText;
                        }
                        if (c11 == ' ') {
                            i21 = 1;
                        } else {
                            i21 = i14;
                        }
                        if (i21 != 0) {
                            d26 = d42;
                        } else {
                            d26 = 0.0d;
                        }
                        d27 = dMeasureText + d26 + d43;
                        if (z16) {
                            d28 = 0.0d;
                        } else {
                            d28 = d11 + d27;
                        }
                        dM14227l = c9236d.m14227l(d28);
                        dM14228m = c9236d.m14228m();
                        dM14224i = c9236d.m14224i();
                        dM14225j = c9236d.m14225j();
                        str2 = strValueOf;
                        dM14226k = c9236d.m14226k();
                        if (z16) {
                            canvas2 = canvas3;
                            c9236d = c9236d;
                            length2 = length2;
                            matrix3 = matrix3;
                            c9237e = c9237e3;
                            this = this;
                            d12 = d12;
                            path2 = path;
                            paint2 = paint;
                        } else {
                            if (i21 != 0) {
                                canvas2 = canvas3;
                            } else {
                                d29 = dMeasureText * d18;
                                d31 = (d15 + ((dM14227l + dM14224i) * d18)) - (d27 * d18);
                                if (z15) {
                                    d32 = d31 + d29;
                                    d33 = d29 / 2.0d;
                                    d34 = d31 + d33;
                                    if (d34 <= d16 && d34 >= d39) {
                                        if (z14) {
                                            pathMeasure3.getMatrix((float) d34, matrix2, 3);
                                            length2 = length2;
                                        } else {
                                            if (d31 < 0.0d) {
                                                float f15 = f11;
                                                pathMeasure3.getMatrix(f15, matrix, 3);
                                                matrix.preTranslate((float) d31, f15);
                                                i22 = 1;
                                            } else {
                                                i22 = 1;
                                                pathMeasure3.getMatrix((float) d31, matrix, 1);
                                            }
                                            pathMeasure3.getMatrix((float) d34, matrix2, i22);
                                            if (d32 > d12) {
                                                pathMeasure3.getMatrix((float) d12, matrix3, 3);
                                                matrix3.preTranslate((float) (d32 - d12), 0.0f);
                                            } else {
                                                pathMeasure3.getMatrix((float) d32, matrix3, i22);
                                            }
                                            matrix.getValues(fArr3);
                                            matrix3.getValues(fArr4);
                                            matrix2.preRotate((float) (Math.atan2(((double) fArr4[5]) - ((double) fArr3[5]), ((double) fArr4[2]) - ((double) fArr3[2])) * 57.29577951308232d * d18));
                                        }
                                        matrix2.preTranslate((float) (-d33), (float) (dM14225j + d25));
                                        d21 = d21;
                                        i13 = i13;
                                        matrix2.preScale((float) d21, i13);
                                        matrix2.postTranslate(0.0f, (float) dM14228m);
                                    } else {
                                        canvas2 = canvas;
                                    }
                                } else {
                                    length2 = length2;
                                    i13 = i13;
                                    d21 = d21;
                                    matrix2.setTranslate((float) d31, (float) (dM14228m + dM14225j + d25));
                                }
                                matrix2.preRotate((float) dM14226k);
                                if (i17 != 0) {
                                    Path path4 = new Path();
                                    f12 = 0.0f;
                                    str3 = str2;
                                    paint2 = paint;
                                    paint2.getTextPath(str3, 0, str2.length(), 0.0f, 0.0f, path4);
                                    pathM14236b = path4;
                                    c9237e = c9237e3;
                                } else {
                                    c9237e = c9237e3;
                                    str3 = str2;
                                    paint2 = paint;
                                    f12 = 0.0f;
                                    pathM14236b = c9237e.m14236b(c11, str3);
                                }
                                rectF = new RectF();
                                pathM14236b.computeBounds(rectF, true);
                                if (rectF.width() == f12) {
                                    canvas.save();
                                    canvas2 = canvas;
                                    canvas2.concat(matrix2);
                                    this.f13119u.add(str3);
                                    this.f13120v.add(new Matrix(matrix2));
                                    canvas2.drawText(str3, f12, f12, paint2);
                                    canvas2.restore();
                                    path2 = path;
                                } else {
                                    canvas2 = canvas;
                                    pathM14236b.transform(matrix2);
                                    path2 = path;
                                    path2.addPath(pathM14236b);
                                }
                            }
                            c9236d = c9236d;
                            length2 = length2;
                            matrix3 = matrix3;
                            c9237e = c9237e3;
                            this = this;
                            d12 = d12;
                            path2 = path;
                            paint2 = paint;
                            paint3 = paint2;
                            path = path2;
                            c9237e3 = c9237e;
                            canvas3 = canvas2;
                            i15 = i19 + 1;
                            tSpanView = this;
                            d12 = d12;
                            matrix3 = matrix3;
                            c9236d = c9236d;
                            length2 = length2;
                        }
                        paint3 = paint2;
                        path = path2;
                        c9237e3 = c9237e;
                        canvas3 = canvas2;
                        i15 = i19 + 1;
                        tSpanView = this;
                        d12 = d12;
                        matrix3 = matrix3;
                        c9236d = c9236d;
                        length2 = length2;
                    }
                    return path;
                }
                tSpanView = this;
                fArr2 = fArr;
                z12 = z19;
                pathMeasure3 = pathMeasure2;
                d12 = length;
                d13 = dM14219c;
                d14 = dMo14165t;
                c9236d = c9236dM14051j;
                i12 = 1;
                d15 = dM14162N;
                z13 = false;
                d16 = d12;
                sVGLength = tSpanView.f13146h;
                d17 = 1.0d;
                if (sVGLength != null) {
                    dM14266a = C9241i.m14266a(sVGLength, canvas3.getWidth(), 0.0d, tSpanView.mScale, d13);
                    if (dM14266a >= 0.0d) {
                        throw new IllegalArgumentException("Negative textLength value");
                    }
                    if (C9228a.f13123b[tSpanView.f13148j.ordinal()] != 2) {
                        d43 += (dM14266a - d14) / ((double) (length2 - 1));
                    } else {
                        d17 = dM14266a / d14;
                    }
                }
                d18 = i12;
                z14 = z13;
                Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                z15 = z18;
                d19 = fontMetrics2.descent;
                path = path3;
                float f16 = fontMetrics2.leading;
                i13 = i12;
                d21 = d17 * d18;
                d22 = ((double) f16) + d19;
                d23 = (-fontMetrics2.ascent) + f16;
                dM14267b = -fontMetrics2.top;
                d24 = dM14267b + d22;
                strM14194r = tSpanView.m14194r();
                textProperties$AlignmentBaselineM14193q = tSpanView.m14193q();
                if (textProperties$AlignmentBaselineM14193q != null) {
                    switch (C9228a.f13124c[textProperties$AlignmentBaselineM14193q.ordinal()]) {
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            i14 = 0;
                            dM14267b = -d19;
                            break;
                        case 5:
                            i14 = 0;
                            dM14267b = 0.0d;
                            break;
                        case 7:
                            Rect rect2 = new Rect();
                            paint3.getTextBounds("x", 0, 1, rect2);
                            dM14267b = ((double) rect2.height()) / 2.0d;
                            i14 = 0;
                            break;
                        case 8:
                            dM14267b = (d23 - d19) / 2.0d;
                            i14 = 0;
                            break;
                        case 9:
                            d35 = 0.5d;
                            dM14267b = d35 * d23;
                            i14 = 0;
                            break;
                        case 10:
                            d35 = 0.8d;
                            dM14267b = d35 * d23;
                            i14 = 0;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            dM14267b = d23;
                            i14 = 0;
                            break;
                        case 14:
                            dM14267b = d22;
                            i14 = 0;
                            break;
                        case 15:
                            dM14267b = d24 / 2.0d;
                            i14 = 0;
                            break;
                        case 16:
                            i14 = 0;
                            break;
                        default:
                            dM14267b = 0.0d;
                            i14 = 0;
                            break;
                    }
                } else {
                    i14 = 0;
                    dM14267b = 0.0d;
                }
                if (strM14194r == null) {
                    d25 = dM14267b;
                } else {
                    d25 = dM14267b;
                }
                matrix = new Matrix();
                matrix2 = new Matrix();
                matrix3 = new Matrix();
                fArr3 = new float[9];
                fArr4 = new float[9];
                i15 = i14;
                while (i15 < length2) {
                    c11 = charArray[i15];
                    strValueOf = String.valueOf(c11);
                    z16 = zArr[i15];
                    if (z16) {
                        strValueOf = "";
                        i17 = i14;
                        f11 = 0.0f;
                    } else {
                        i16 = i15;
                        i17 = i14;
                        f11 = 0.0f;
                        while (true) {
                            i18 = i16 + 1;
                            if (i18 >= length2) {
                            }
                            strValueOf = strValueOf + charArray[i18];
                            zArr[i18] = true;
                            i16 = i18;
                            i17 = 1;
                        }
                    }
                    i19 = i15;
                    dMeasureText = ((double) paint3.measureText(strValueOf)) * d17;
                    if (!z12) {
                        d11 = (((double) fArr2[i19]) * d17) - dMeasureText;
                    }
                    if (c11 == ' ') {
                        i21 = 1;
                    } else {
                        i21 = i14;
                    }
                    if (i21 != 0) {
                        d26 = d42;
                    } else {
                        d26 = 0.0d;
                    }
                    d27 = dMeasureText + d26 + d43;
                    if (z16) {
                        d28 = 0.0d;
                    } else {
                        d28 = d11 + d27;
                    }
                    dM14227l = c9236d.m14227l(d28);
                    dM14228m = c9236d.m14228m();
                    dM14224i = c9236d.m14224i();
                    dM14225j = c9236d.m14225j();
                    str2 = strValueOf;
                    dM14226k = c9236d.m14226k();
                    if (z16) {
                        if (i21 != 0) {
                            canvas2 = canvas3;
                        } else {
                            d29 = dMeasureText * d18;
                            d31 = (d15 + ((dM14227l + dM14224i) * d18)) - (d27 * d18);
                            if (z15) {
                                d32 = d31 + d29;
                                d33 = d29 / 2.0d;
                                d34 = d31 + d33;
                                if (d34 <= d16) {
                                    if (z14) {
                                        pathMeasure3.getMatrix((float) d34, matrix2, 3);
                                        length2 = length2;
                                    } else {
                                        if (d31 < 0.0d) {
                                            float f17 = f11;
                                            pathMeasure3.getMatrix(f17, matrix, 3);
                                            matrix.preTranslate((float) d31, f17);
                                            i22 = 1;
                                        } else {
                                            i22 = 1;
                                            pathMeasure3.getMatrix((float) d31, matrix, 1);
                                        }
                                        pathMeasure3.getMatrix((float) d34, matrix2, i22);
                                        if (d32 > d12) {
                                            pathMeasure3.getMatrix((float) d12, matrix3, 3);
                                            matrix3.preTranslate((float) (d32 - d12), 0.0f);
                                        } else {
                                            pathMeasure3.getMatrix((float) d32, matrix3, i22);
                                        }
                                        matrix.getValues(fArr3);
                                        matrix3.getValues(fArr4);
                                        matrix2.preRotate((float) (Math.atan2(((double) fArr4[5]) - ((double) fArr3[5]), ((double) fArr4[2]) - ((double) fArr3[2])) * 57.29577951308232d * d18));
                                    }
                                    matrix2.preTranslate((float) (-d33), (float) (dM14225j + d25));
                                    d21 = d21;
                                    i13 = i13;
                                    matrix2.preScale((float) d21, i13);
                                    matrix2.postTranslate(0.0f, (float) dM14228m);
                                }
                                canvas2 = canvas;
                            } else {
                                length2 = length2;
                                i13 = i13;
                                d21 = d21;
                                matrix2.setTranslate((float) d31, (float) (dM14228m + dM14225j + d25));
                            }
                            matrix2.preRotate((float) dM14226k);
                            if (i17 != 0) {
                                Path path5 = new Path();
                                f12 = 0.0f;
                                str3 = str2;
                                paint2 = paint;
                                paint2.getTextPath(str3, 0, str2.length(), 0.0f, 0.0f, path5);
                                pathM14236b = path5;
                                c9237e = c9237e3;
                            } else {
                                c9237e = c9237e3;
                                str3 = str2;
                                paint2 = paint;
                                f12 = 0.0f;
                                pathM14236b = c9237e.m14236b(c11, str3);
                            }
                            rectF = new RectF();
                            pathM14236b.computeBounds(rectF, true);
                            if (rectF.width() == f12) {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.concat(matrix2);
                                this.f13119u.add(str3);
                                this.f13120v.add(new Matrix(matrix2));
                                canvas2.drawText(str3, f12, f12, paint2);
                                canvas2.restore();
                                path2 = path;
                            } else {
                                canvas2 = canvas;
                                pathM14236b.transform(matrix2);
                                path2 = path;
                                path2.addPath(pathM14236b);
                            }
                        }
                        c9236d = c9236d;
                        length2 = length2;
                        matrix3 = matrix3;
                        c9237e = c9237e3;
                        this = this;
                        d12 = d12;
                        path2 = path;
                        paint2 = paint;
                        paint3 = paint2;
                        path = path2;
                        c9237e3 = c9237e;
                        canvas3 = canvas2;
                        i15 = i19 + 1;
                        tSpanView = this;
                        d12 = d12;
                        matrix3 = matrix3;
                        c9236d = c9236d;
                        length2 = length2;
                    } else {
                        canvas2 = canvas3;
                        c9236d = c9236d;
                        length2 = length2;
                        matrix3 = matrix3;
                        c9237e = c9237e3;
                        this = this;
                        d12 = d12;
                        path2 = path;
                        paint2 = paint;
                    }
                    paint3 = paint2;
                    path = path2;
                    c9237e3 = c9237e;
                    canvas3 = canvas2;
                    i15 = i19 + 1;
                    tSpanView = this;
                    d12 = d12;
                    matrix3 = matrix3;
                    c9236d = c9236d;
                    length2 = length2;
                }
                return path;
            }
            pathMeasure2 = pathMeasure;
            i11 = Build.VERSION.SDK_INT;
            if (z11) {
                paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c9235cM14218b.f13171g);
            } else {
                paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c9235cM14218b.f13171g);
            }
            if (i11 >= 26) {
                paint3.setFontVariationSettings("'wght' " + c9235cM14218b.f13170f + c9235cM14218b.f13172h);
            }
            ReadableMap readableMap2 = c9235cM14218b.f13168d;
            fArr = new float[length2];
            paint3.getTextWidths(str, fArr);
            textProperties$TextAnchor = c9235cM14218b.f13174j;
            d11 = d41;
            dMo14165t = m14196u().mo14165t(paint3);
            dM14162N = m14162N(textProperties$TextAnchor, dMo14165t);
            dM14219c = c9236dM14051j.m14219c();
            if (z18) {
                if (this.f13118t.m14167H() == TextProperties$TextPathMidLine.sharp) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (this.f13118t.m14168I() == TextProperties$TextPathSide.right) {
                    i25 = -1;
                } else {
                    i25 = 1;
                }
                fArr2 = fArr;
                z12 = z19;
                pathMeasure3 = pathMeasure2;
                c9236d = c9236dM14051j;
                double d46 = length;
                d14 = dMo14165t;
                dM14159K = m14159K(this.f13118t.m14169J(), d46, dM14219c);
                tSpanView = this;
                d12 = d46;
                d36 = dM14162N + dM14159K;
                d13 = dM14219c;
                if (zIsClosed) {
                    d37 = d12 / 2.0d;
                    if (textProperties$TextAnchor == TextProperties$TextAnchor.middle) {
                        d38 = -d37;
                    } else {
                        d38 = 0.0d;
                    }
                    double d47 = dM14159K + d38;
                    d15 = d36;
                    z13 = z17;
                    d39 = d47;
                    d16 = d47 + d12;
                    i12 = i25;
                } else {
                    d15 = d36;
                    z13 = z17;
                    i12 = i25;
                }
                sVGLength = tSpanView.f13146h;
                d17 = 1.0d;
                if (sVGLength != null) {
                    dM14266a = C9241i.m14266a(sVGLength, canvas3.getWidth(), 0.0d, tSpanView.mScale, d13);
                    if (dM14266a >= 0.0d) {
                        throw new IllegalArgumentException("Negative textLength value");
                    }
                    if (C9228a.f13123b[tSpanView.f13148j.ordinal()] != 2) {
                        d43 += (dM14266a - d14) / ((double) (length2 - 1));
                    } else {
                        d17 = dM14266a / d14;
                    }
                }
                d18 = i12;
                z14 = z13;
                Paint.FontMetrics fontMetrics3 = paint3.getFontMetrics();
                z15 = z18;
                d19 = fontMetrics3.descent;
                path = path3;
                float f18 = fontMetrics3.leading;
                i13 = i12;
                d21 = d17 * d18;
                d22 = ((double) f18) + d19;
                d23 = (-fontMetrics3.ascent) + f18;
                dM14267b = -fontMetrics3.top;
                d24 = dM14267b + d22;
                strM14194r = tSpanView.m14194r();
                textProperties$AlignmentBaselineM14193q = tSpanView.m14193q();
                if (textProperties$AlignmentBaselineM14193q != null) {
                    switch (C9228a.f13124c[textProperties$AlignmentBaselineM14193q.ordinal()]) {
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            i14 = 0;
                            dM14267b = -d19;
                            break;
                        case 5:
                            i14 = 0;
                            dM14267b = 0.0d;
                            break;
                        case 7:
                            Rect rect3 = new Rect();
                            paint3.getTextBounds("x", 0, 1, rect3);
                            dM14267b = ((double) rect3.height()) / 2.0d;
                            i14 = 0;
                            break;
                        case 8:
                            dM14267b = (d23 - d19) / 2.0d;
                            i14 = 0;
                            break;
                        case 9:
                            d35 = 0.5d;
                            dM14267b = d35 * d23;
                            i14 = 0;
                            break;
                        case 10:
                            d35 = 0.8d;
                            dM14267b = d35 * d23;
                            i14 = 0;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            dM14267b = d23;
                            i14 = 0;
                            break;
                        case 14:
                            dM14267b = d22;
                            i14 = 0;
                            break;
                        case 15:
                            dM14267b = d24 / 2.0d;
                            i14 = 0;
                            break;
                        case 16:
                            i14 = 0;
                            break;
                        default:
                            dM14267b = 0.0d;
                            i14 = 0;
                            break;
                    }
                } else {
                    i14 = 0;
                    dM14267b = 0.0d;
                }
                if (strM14194r == null) {
                    d25 = dM14267b;
                } else {
                    d25 = dM14267b;
                }
                matrix = new Matrix();
                matrix2 = new Matrix();
                matrix3 = new Matrix();
                fArr3 = new float[9];
                fArr4 = new float[9];
                i15 = i14;
                while (i15 < length2) {
                    c11 = charArray[i15];
                    strValueOf = String.valueOf(c11);
                    z16 = zArr[i15];
                    if (z16) {
                        strValueOf = "";
                        i17 = i14;
                        f11 = 0.0f;
                    } else {
                        i16 = i15;
                        i17 = i14;
                        f11 = 0.0f;
                        while (true) {
                            i18 = i16 + 1;
                            if (i18 >= length2) {
                            }
                            strValueOf = strValueOf + charArray[i18];
                            zArr[i18] = true;
                            i16 = i18;
                            i17 = 1;
                        }
                    }
                    i19 = i15;
                    dMeasureText = ((double) paint3.measureText(strValueOf)) * d17;
                    if (!z12) {
                        d11 = (((double) fArr2[i19]) * d17) - dMeasureText;
                    }
                    if (c11 == ' ') {
                        i21 = 1;
                    } else {
                        i21 = i14;
                    }
                    if (i21 != 0) {
                        d26 = d42;
                    } else {
                        d26 = 0.0d;
                    }
                    d27 = dMeasureText + d26 + d43;
                    if (z16) {
                        d28 = 0.0d;
                    } else {
                        d28 = d11 + d27;
                    }
                    dM14227l = c9236d.m14227l(d28);
                    dM14228m = c9236d.m14228m();
                    dM14224i = c9236d.m14224i();
                    dM14225j = c9236d.m14225j();
                    str2 = strValueOf;
                    dM14226k = c9236d.m14226k();
                    if (z16) {
                        if (i21 != 0) {
                            canvas2 = canvas3;
                        } else {
                            d29 = dMeasureText * d18;
                            d31 = (d15 + ((dM14227l + dM14224i) * d18)) - (d27 * d18);
                            if (z15) {
                                d32 = d31 + d29;
                                d33 = d29 / 2.0d;
                                d34 = d31 + d33;
                                if (d34 <= d16) {
                                    if (z14) {
                                        pathMeasure3.getMatrix((float) d34, matrix2, 3);
                                        length2 = length2;
                                    } else {
                                        if (d31 < 0.0d) {
                                            float f19 = f11;
                                            pathMeasure3.getMatrix(f19, matrix, 3);
                                            matrix.preTranslate((float) d31, f19);
                                            i22 = 1;
                                        } else {
                                            i22 = 1;
                                            pathMeasure3.getMatrix((float) d31, matrix, 1);
                                        }
                                        pathMeasure3.getMatrix((float) d34, matrix2, i22);
                                        if (d32 > d12) {
                                            pathMeasure3.getMatrix((float) d12, matrix3, 3);
                                            matrix3.preTranslate((float) (d32 - d12), 0.0f);
                                        } else {
                                            pathMeasure3.getMatrix((float) d32, matrix3, i22);
                                        }
                                        matrix.getValues(fArr3);
                                        matrix3.getValues(fArr4);
                                        matrix2.preRotate((float) (Math.atan2(((double) fArr4[5]) - ((double) fArr3[5]), ((double) fArr4[2]) - ((double) fArr3[2])) * 57.29577951308232d * d18));
                                    }
                                    matrix2.preTranslate((float) (-d33), (float) (dM14225j + d25));
                                    d21 = d21;
                                    i13 = i13;
                                    matrix2.preScale((float) d21, i13);
                                    matrix2.postTranslate(0.0f, (float) dM14228m);
                                }
                                canvas2 = canvas;
                            } else {
                                length2 = length2;
                                i13 = i13;
                                d21 = d21;
                                matrix2.setTranslate((float) d31, (float) (dM14228m + dM14225j + d25));
                            }
                            matrix2.preRotate((float) dM14226k);
                            if (i17 != 0) {
                                Path path6 = new Path();
                                f12 = 0.0f;
                                str3 = str2;
                                paint2 = paint;
                                paint2.getTextPath(str3, 0, str2.length(), 0.0f, 0.0f, path6);
                                pathM14236b = path6;
                                c9237e = c9237e3;
                            } else {
                                c9237e = c9237e3;
                                str3 = str2;
                                paint2 = paint;
                                f12 = 0.0f;
                                pathM14236b = c9237e.m14236b(c11, str3);
                            }
                            rectF = new RectF();
                            pathM14236b.computeBounds(rectF, true);
                            if (rectF.width() == f12) {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.concat(matrix2);
                                this.f13119u.add(str3);
                                this.f13120v.add(new Matrix(matrix2));
                                canvas2.drawText(str3, f12, f12, paint2);
                                canvas2.restore();
                                path2 = path;
                            } else {
                                canvas2 = canvas;
                                pathM14236b.transform(matrix2);
                                path2 = path;
                                path2.addPath(pathM14236b);
                            }
                        }
                        c9236d = c9236d;
                        length2 = length2;
                        matrix3 = matrix3;
                        c9237e = c9237e3;
                        this = this;
                        d12 = d12;
                        path2 = path;
                        paint2 = paint;
                        paint3 = paint2;
                        path = path2;
                        c9237e3 = c9237e;
                        canvas3 = canvas2;
                        i15 = i19 + 1;
                        tSpanView = this;
                        d12 = d12;
                        matrix3 = matrix3;
                        c9236d = c9236d;
                        length2 = length2;
                    } else {
                        canvas2 = canvas3;
                        c9236d = c9236d;
                        length2 = length2;
                        matrix3 = matrix3;
                        c9237e = c9237e3;
                        this = this;
                        d12 = d12;
                        path2 = path;
                        paint2 = paint;
                    }
                    paint3 = paint2;
                    path = path2;
                    c9237e3 = c9237e;
                    canvas3 = canvas2;
                    i15 = i19 + 1;
                    tSpanView = this;
                    d12 = d12;
                    matrix3 = matrix3;
                    c9236d = c9236d;
                    length2 = length2;
                }
                return path;
            }
            tSpanView = this;
            fArr2 = fArr;
            z12 = z19;
            pathMeasure3 = pathMeasure2;
            d12 = length;
            d13 = dM14219c;
            d14 = dMo14165t;
            c9236d = c9236dM14051j;
            i12 = 1;
            d15 = dM14162N;
            z13 = false;
            d16 = d12;
            sVGLength = tSpanView.f13146h;
            d17 = 1.0d;
            if (sVGLength != null) {
                dM14266a = C9241i.m14266a(sVGLength, canvas3.getWidth(), 0.0d, tSpanView.mScale, d13);
                if (dM14266a >= 0.0d) {
                    throw new IllegalArgumentException("Negative textLength value");
                }
                if (C9228a.f13123b[tSpanView.f13148j.ordinal()] != 2) {
                    d43 += (dM14266a - d14) / ((double) (length2 - 1));
                } else {
                    d17 = dM14266a / d14;
                }
            }
            d18 = i12;
            z14 = z13;
            Paint.FontMetrics fontMetrics4 = paint3.getFontMetrics();
            z15 = z18;
            d19 = fontMetrics4.descent;
            path = path3;
            float f110 = fontMetrics4.leading;
            i13 = i12;
            d21 = d17 * d18;
            d22 = ((double) f110) + d19;
            d23 = (-fontMetrics4.ascent) + f110;
            dM14267b = -fontMetrics4.top;
            d24 = dM14267b + d22;
            strM14194r = tSpanView.m14194r();
            textProperties$AlignmentBaselineM14193q = tSpanView.m14193q();
            if (textProperties$AlignmentBaselineM14193q != null) {
                switch (C9228a.f13124c[textProperties$AlignmentBaselineM14193q.ordinal()]) {
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        i14 = 0;
                        dM14267b = -d19;
                        break;
                    case 5:
                        i14 = 0;
                        dM14267b = 0.0d;
                        break;
                    case 7:
                        Rect rect4 = new Rect();
                        paint3.getTextBounds("x", 0, 1, rect4);
                        dM14267b = ((double) rect4.height()) / 2.0d;
                        i14 = 0;
                        break;
                    case 8:
                        dM14267b = (d23 - d19) / 2.0d;
                        i14 = 0;
                        break;
                    case 9:
                        d35 = 0.5d;
                        dM14267b = d35 * d23;
                        i14 = 0;
                        break;
                    case 10:
                        d35 = 0.8d;
                        dM14267b = d35 * d23;
                        i14 = 0;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        dM14267b = d23;
                        i14 = 0;
                        break;
                    case 14:
                        dM14267b = d22;
                        i14 = 0;
                        break;
                    case 15:
                        dM14267b = d24 / 2.0d;
                        i14 = 0;
                        break;
                    case 16:
                        i14 = 0;
                        break;
                    default:
                        dM14267b = 0.0d;
                        i14 = 0;
                        break;
                }
            } else {
                i14 = 0;
                dM14267b = 0.0d;
            }
            if (strM14194r == null) {
                d25 = dM14267b;
            } else {
                d25 = dM14267b;
            }
            matrix = new Matrix();
            matrix2 = new Matrix();
            matrix3 = new Matrix();
            fArr3 = new float[9];
            fArr4 = new float[9];
            i15 = i14;
            while (i15 < length2) {
                c11 = charArray[i15];
                strValueOf = String.valueOf(c11);
                z16 = zArr[i15];
                if (z16) {
                    strValueOf = "";
                    i17 = i14;
                    f11 = 0.0f;
                } else {
                    i16 = i15;
                    i17 = i14;
                    f11 = 0.0f;
                    while (true) {
                        i18 = i16 + 1;
                        if (i18 >= length2) {
                        }
                        strValueOf = strValueOf + charArray[i18];
                        zArr[i18] = true;
                        i16 = i18;
                        i17 = 1;
                    }
                }
                i19 = i15;
                dMeasureText = ((double) paint3.measureText(strValueOf)) * d17;
                if (!z12) {
                    d11 = (((double) fArr2[i19]) * d17) - dMeasureText;
                }
                if (c11 == ' ') {
                    i21 = 1;
                } else {
                    i21 = i14;
                }
                if (i21 != 0) {
                    d26 = d42;
                } else {
                    d26 = 0.0d;
                }
                d27 = dMeasureText + d26 + d43;
                if (z16) {
                    d28 = 0.0d;
                } else {
                    d28 = d11 + d27;
                }
                dM14227l = c9236d.m14227l(d28);
                dM14228m = c9236d.m14228m();
                dM14224i = c9236d.m14224i();
                dM14225j = c9236d.m14225j();
                str2 = strValueOf;
                dM14226k = c9236d.m14226k();
                if (z16) {
                    if (i21 != 0) {
                        canvas2 = canvas3;
                    } else {
                        d29 = dMeasureText * d18;
                        d31 = (d15 + ((dM14227l + dM14224i) * d18)) - (d27 * d18);
                        if (z15) {
                            d32 = d31 + d29;
                            d33 = d29 / 2.0d;
                            d34 = d31 + d33;
                            if (d34 <= d16) {
                                if (z14) {
                                    pathMeasure3.getMatrix((float) d34, matrix2, 3);
                                    length2 = length2;
                                } else {
                                    if (d31 < 0.0d) {
                                        float f111 = f11;
                                        pathMeasure3.getMatrix(f111, matrix, 3);
                                        matrix.preTranslate((float) d31, f111);
                                        i22 = 1;
                                    } else {
                                        i22 = 1;
                                        pathMeasure3.getMatrix((float) d31, matrix, 1);
                                    }
                                    pathMeasure3.getMatrix((float) d34, matrix2, i22);
                                    if (d32 > d12) {
                                        pathMeasure3.getMatrix((float) d12, matrix3, 3);
                                        matrix3.preTranslate((float) (d32 - d12), 0.0f);
                                    } else {
                                        pathMeasure3.getMatrix((float) d32, matrix3, i22);
                                    }
                                    matrix.getValues(fArr3);
                                    matrix3.getValues(fArr4);
                                    matrix2.preRotate((float) (Math.atan2(((double) fArr4[5]) - ((double) fArr3[5]), ((double) fArr4[2]) - ((double) fArr3[2])) * 57.29577951308232d * d18));
                                }
                                matrix2.preTranslate((float) (-d33), (float) (dM14225j + d25));
                                d21 = d21;
                                i13 = i13;
                                matrix2.preScale((float) d21, i13);
                                matrix2.postTranslate(0.0f, (float) dM14228m);
                            }
                            canvas2 = canvas;
                        } else {
                            length2 = length2;
                            i13 = i13;
                            d21 = d21;
                            matrix2.setTranslate((float) d31, (float) (dM14228m + dM14225j + d25));
                        }
                        matrix2.preRotate((float) dM14226k);
                        if (i17 != 0) {
                            Path path7 = new Path();
                            f12 = 0.0f;
                            str3 = str2;
                            paint2 = paint;
                            paint2.getTextPath(str3, 0, str2.length(), 0.0f, 0.0f, path7);
                            pathM14236b = path7;
                            c9237e = c9237e3;
                        } else {
                            c9237e = c9237e3;
                            str3 = str2;
                            paint2 = paint;
                            f12 = 0.0f;
                            pathM14236b = c9237e.m14236b(c11, str3);
                        }
                        rectF = new RectF();
                        pathM14236b.computeBounds(rectF, true);
                        if (rectF.width() == f12) {
                            canvas.save();
                            canvas2 = canvas;
                            canvas2.concat(matrix2);
                            this.f13119u.add(str3);
                            this.f13120v.add(new Matrix(matrix2));
                            canvas2.drawText(str3, f12, f12, paint2);
                            canvas2.restore();
                            path2 = path;
                        } else {
                            canvas2 = canvas;
                            pathM14236b.transform(matrix2);
                            path2 = path;
                            path2.addPath(pathM14236b);
                        }
                    }
                    c9236d = c9236d;
                    length2 = length2;
                    matrix3 = matrix3;
                    c9237e = c9237e3;
                    this = this;
                    d12 = d12;
                    path2 = path;
                    paint2 = paint;
                    paint3 = paint2;
                    path = path2;
                    c9237e3 = c9237e;
                    canvas3 = canvas2;
                    i15 = i19 + 1;
                    tSpanView = this;
                    d12 = d12;
                    matrix3 = matrix3;
                    c9236d = c9236d;
                    length2 = length2;
                } else {
                    canvas2 = canvas3;
                    c9236d = c9236d;
                    length2 = length2;
                    matrix3 = matrix3;
                    c9237e = c9237e3;
                    this = this;
                    d12 = d12;
                    path2 = path;
                    paint2 = paint;
                }
                paint3 = paint2;
                path = path2;
                c9237e3 = c9237e;
                canvas3 = canvas2;
                i15 = i19 + 1;
                tSpanView = this;
                d12 = d12;
                matrix3 = matrix3;
                c9236d = c9236d;
                length2 = length2;
            }
            return path;
        }
        return path3;
    }

    /* JADX INFO: renamed from: N */
    public final double m14162N(TextProperties$TextAnchor textProperties$TextAnchor, double d11) {
        int i11 = C9228a.f13122a[textProperties$TextAnchor.ordinal()];
        if (i11 == 2) {
            return (-d11) / 2.0d;
        }
        if (i11 != 3) {
            return 0.0d;
        }
        return -d11;
    }

    /* JADX INFO: renamed from: O */
    public void m14163O(String str) {
        this.f13117s = str;
        invalidate();
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f13117s == null) {
            clip(canvas, paint);
            mo14042f(canvas, paint, f11);
            return;
        }
        SVGLength sVGLength = this.f13145g;
        if (sVGLength != null && sVGLength.f13063a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f11)) {
                m14158J(canvas, paint);
            }
            if (setupStrokePaint(paint, f11 * this.strokeOpacity)) {
                m14158J(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f13119u.size();
        if (size > 0) {
            m14157I(paint, m14051j().m14218b());
            for (int i11 = 0; i11 < size; i11++) {
                String str = this.f13119u.get(i11);
                Matrix matrix = this.f13120v.get(i11);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        }
        m14048g(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.TextView, com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f13116r;
        if (path != null) {
            return path;
        }
        if (this.f13117s == null) {
            Path pathM14195s = m14195s(canvas, paint);
            this.f13116r = pathM14195s;
            return pathM14195s;
        }
        m14164P();
        mo14053l();
        this.f13116r = m14160L(m14155Q(this.f13117s), paint, canvas);
        mo14052k();
        return this.f13116r;
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f13117s == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.TextView
    /* JADX INFO: renamed from: t */
    public double mo14165t(Paint paint) {
        if (!Double.isNaN(this.f13155q)) {
            return this.f13155q;
        }
        String str = this.f13117s;
        double dMo14165t = 0.0d;
        if (str == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof TextView) {
                    dMo14165t += ((TextView) childAt).mo14165t(paint);
                }
            }
            this.f13155q = dMo14165t;
            return dMo14165t;
        }
        if (str.length() == 0) {
            this.f13155q = 0.0d;
            return 0.0d;
        }
        C9235c c9235cM14218b = m14051j().m14218b();
        m14157I(paint, c9235cM14218b);
        m14156H(paint, c9235cM14218b);
        double dMeasureText = paint.measureText(str);
        this.f13155q = dMeasureText;
        return dMeasureText;
    }

    public TSpanView(ReactContext reactContext) {
        super(reactContext);
        this.f13119u = new ArrayList<>();
        this.f13120v = new ArrayList<>();
        this.f13121w = this.mContext.getResources().getAssets();
    }

    /* JADX INFO: renamed from: J */
    public final void m14158J(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        C9236d c9236dM14051j = m14051j();
        mo14053l();
        C9235c c9235cM14218b = c9236dM14051j.m14218b();
        TextPaint textPaint = new TextPaint(paint);
        m14157I(textPaint, c9235cM14218b);
        m14156H(textPaint, c9235cM14218b);
        double dM14219c = c9236dM14051j.m14219c();
        int i11 = C9228a.f13122a[c9235cM14218b.f13174j.ordinal()];
        if (i11 != 2) {
            if (i11 != 3) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        StaticLayout staticLayoutM14161M = m14161M(textPaint, alignment, true, new SpannableString(this.f13117s), (int) C9241i.m14266a(this.f13145g, canvas.getWidth(), 0.0d, this.mScale, dM14219c));
        int lineAscent = staticLayoutM14161M.getLineAscent(0);
        float fM14227l = (float) c9236dM14051j.m14227l(0.0d);
        float fM14228m = (float) (c9236dM14051j.m14228m() + ((double) lineAscent));
        mo14052k();
        canvas.save();
        canvas.translate(fM14227l, fM14228m);
        staticLayoutM14161M.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: M */
    public final StaticLayout m14161M(TextPaint textPaint, Layout.Alignment alignment, boolean z11, SpannableString spannableString, int i11) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z11).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    /* JADX INFO: renamed from: P */
    public final void m14164P() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == TextPathView.class) {
                this.f13118t = (TextPathView) parent;
                return;
            } else {
                if (!(parent instanceof TextView)) {
                    return;
                }
            }
        }
    }
}
