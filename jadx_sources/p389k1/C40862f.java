package p389k1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.C5112t0;
import com.airbnb.lottie.InterfaceC5091m0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import com.airbnb.lottie.model.layer.Layer;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.jumio.commons.log.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p218e1.C37024d;
import p248f1.AbstractC37305a;
import p248f1.C37319o;
import p248f1.C37321q;
import p297h1.C38072b;
import p297h1.C38073c;
import p328i1.C38393a;
import p328i1.C38394b;
import p328i1.C38403k;
import p355j1.C40208k;
import p484o1.C42930l;
import p522p1.C43350c;

/* JADX INFO: renamed from: k1.f */
/* JADX INFO: compiled from: TextLayer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40862f extends AbstractC5095a {

    /* JADX INFO: renamed from: D */
    public final StringBuilder f90841D;

    /* JADX INFO: renamed from: E */
    public final RectF f90842E;

    /* JADX INFO: renamed from: F */
    public final Matrix f90843F;

    /* JADX INFO: renamed from: G */
    public final Paint f90844G;

    /* JADX INFO: renamed from: H */
    public final Paint f90845H;

    /* JADX INFO: renamed from: I */
    public final Map<C38073c, List<C37024d>> f90846I;

    /* JADX INFO: renamed from: J */
    public final LongSparseArray<String> f90847J;

    /* JADX INFO: renamed from: K */
    public final List<d> f90848K;

    /* JADX INFO: renamed from: L */
    public final C37319o f90849L;

    /* JADX INFO: renamed from: M */
    public final LottieDrawable f90850M;

    /* JADX INFO: renamed from: N */
    public final C5080h f90851N;

    /* JADX INFO: renamed from: O */
    @Nullable
    public AbstractC37305a<Integer, Integer> f90852O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public AbstractC37305a<Integer, Integer> f90853P;

    /* JADX INFO: renamed from: Q */
    @Nullable
    public AbstractC37305a<Integer, Integer> f90854Q;

    /* JADX INFO: renamed from: R */
    @Nullable
    public AbstractC37305a<Integer, Integer> f90855R;

    /* JADX INFO: renamed from: S */
    @Nullable
    public AbstractC37305a<Float, Float> f90856S;

    /* JADX INFO: renamed from: T */
    @Nullable
    public AbstractC37305a<Float, Float> f90857T;

    /* JADX INFO: renamed from: U */
    @Nullable
    public AbstractC37305a<Float, Float> f90858U;

    /* JADX INFO: renamed from: V */
    @Nullable
    public AbstractC37305a<Float, Float> f90859V;

    /* JADX INFO: renamed from: W */
    @Nullable
    public AbstractC37305a<Float, Float> f90860W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public AbstractC37305a<Typeface, Typeface> f90861X;

    /* JADX INFO: renamed from: k1.f$a */
    /* JADX INFO: compiled from: TextLayer.java */
    public class a extends Paint {
        public a(int i11) {
            super(i11);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: k1.f$b */
    /* JADX INFO: compiled from: TextLayer.java */
    public class b extends Paint {
        public b(int i11) {
            super(i11);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: k1.f$d */
    /* JADX INFO: compiled from: TextLayer.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f90865a;

        /* JADX INFO: renamed from: b */
        public float f90866b;

        public d() {
            this.f90865a = "";
            this.f90866b = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public void m89435c(String str, float f11) {
            this.f90865a = str;
            this.f90866b = f11;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m89421T(String str, DocumentData documentData, Canvas canvas, float f11) {
        int length = 0;
        while (length < str.length()) {
            String strM89416O = m89416O(str, length);
            length += strM89416O.length();
            m89420S(strM89416O, documentData, canvas);
            canvas.translate(this.f90844G.measureText(strM89416O) + f11, 0.0f);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m89423V(String str, DocumentData documentData, C38072b c38072b, Canvas canvas, float f11, float f12, float f13) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            C38073c c38073c = this.f90851N.m5652c().get(C38073c.m85962c(str.charAt(i11), c38072b.m85957a(), c38072b.m85959c()));
            if (c38073c != null) {
                m89419R(c38073c, f12, documentData, canvas);
                canvas.translate((((float) c38073c.m85964b()) * f12 * C42930l.m94202e()) + f13, 0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: k1.f$c */
    /* JADX INFO: compiled from: TextLayer.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f90864a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f90864a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90864a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90864a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m89417P(DocumentData documentData, int i11) {
        AbstractC37305a<Integer, Integer> abstractC37305a = this.f90853P;
        if (abstractC37305a != null) {
            this.f90844G.setColor(abstractC37305a.mo83831h().intValue());
        } else {
            AbstractC37305a<Integer, Integer> abstractC37305a2 = this.f90852O;
            if (abstractC37305a2 != null) {
                this.f90844G.setColor(abstractC37305a2.mo83831h().intValue());
            } else {
                this.f90844G.setColor(documentData.f6040h);
            }
        }
        AbstractC37305a<Integer, Integer> abstractC37305a3 = this.f90855R;
        if (abstractC37305a3 != null) {
            this.f90845H.setColor(abstractC37305a3.mo83831h().intValue());
        } else {
            AbstractC37305a<Integer, Integer> abstractC37305a4 = this.f90854Q;
            if (abstractC37305a4 != null) {
                this.f90845H.setColor(abstractC37305a4.mo83831h().intValue());
            } else {
                this.f90845H.setColor(documentData.f6041i);
            }
        }
        int iIntValue = ((((this.f6158x.m83887h() == null ? 100 : this.f6158x.m83887h().mo83831h().intValue()) * 255) / 100) * i11) / 255;
        this.f90844G.setAlpha(iIntValue);
        this.f90845H.setAlpha(iIntValue);
        AbstractC37305a<Float, Float> abstractC37305a5 = this.f90857T;
        if (abstractC37305a5 != null) {
            this.f90845H.setStrokeWidth(abstractC37305a5.mo83831h().floatValue());
            return;
        }
        AbstractC37305a<Float, Float> abstractC37305a6 = this.f90856S;
        if (abstractC37305a6 != null) {
            this.f90845H.setStrokeWidth(abstractC37305a6.mo83831h().floatValue());
        } else {
            this.f90845H.setStrokeWidth(documentData.f6042j * C42930l.m94202e());
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m89420S(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.f6043k) {
            m89418Q(str, this.f90844G, canvas);
            m89418Q(str, this.f90845H, canvas);
        } else {
            m89418Q(str, this.f90845H, canvas);
            m89418Q(str, this.f90844G, canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX INFO: renamed from: X */
    public final void m89425X(DocumentData documentData, Matrix matrix, C38072b c38072b, Canvas canvas) {
        float fFloatValue;
        float f11;
        int i11;
        int i12;
        PointF pointF;
        float f12;
        List<d> listM89432e0;
        int i13;
        d dVar;
        float f13;
        float f14;
        C40862f c40862f = this;
        DocumentData documentData2 = documentData;
        AbstractC37305a<Float, Float> abstractC37305a = c40862f.f90860W;
        float fFloatValue2 = (abstractC37305a != null ? abstractC37305a.mo83831h().floatValue() : documentData2.f6035c) / 100.0f;
        float fM94204g = C42930l.m94204g(matrix);
        List<String> listM89428a0 = c40862f.m89428a0(documentData2.f6033a);
        int size = listM89428a0.size();
        float f15 = documentData2.f6037e / 10.0f;
        AbstractC37305a<Float, Float> abstractC37305a2 = c40862f.f90859V;
        if (abstractC37305a2 == null) {
            AbstractC37305a<Float, Float> abstractC37305a3 = c40862f.f90858U;
            if (abstractC37305a3 != null) {
                fFloatValue = abstractC37305a3.mo83831h().floatValue();
            }
            f11 = f15;
            i11 = -1;
            i12 = 0;
            while (i12 < size) {
                String str = listM89428a0.get(i12);
                pointF = documentData2.f6045m;
                if (pointF == null) {
                    f12 = 0.0f;
                } else {
                    f12 = pointF.x;
                }
                listM89432e0 = c40862f.m89432e0(str, f12, c38072b, fFloatValue2, f11, true);
                i13 = 0;
                while (i13 < listM89432e0.size()) {
                    dVar = listM89432e0.get(i13);
                    i11++;
                    canvas.save();
                    if (c40862f.m89431d0(canvas, documentData2, i11, dVar.f90866b)) {
                        float f16 = fFloatValue2;
                        DocumentData documentData3 = documentData2;
                        f13 = f11;
                        f14 = fM94204g;
                        c40862f.m89423V(dVar.f90865a, documentData3, c38072b, canvas, f14, f16, f13);
                        fFloatValue2 = f16;
                    } else {
                        f13 = f11;
                        f14 = fM94204g;
                    }
                    canvas.restore();
                    i13++;
                    c40862f = this;
                    fM94204g = f14;
                    f11 = f13;
                    documentData2 = documentData;
                }
                i12++;
                c40862f = this;
                f11 = f11;
                documentData2 = documentData;
            }
        }
        fFloatValue = abstractC37305a2.mo83831h().floatValue();
        f15 += fFloatValue;
        f11 = f15;
        i11 = -1;
        i12 = 0;
        while (i12 < size) {
            String str2 = listM89428a0.get(i12);
            pointF = documentData2.f6045m;
            if (pointF == null) {
                f12 = 0.0f;
            } else {
                f12 = pointF.x;
            }
            listM89432e0 = c40862f.m89432e0(str2, f12, c38072b, fFloatValue2, f11, true);
            i13 = 0;
            while (i13 < listM89432e0.size()) {
                dVar = listM89432e0.get(i13);
                i11++;
                canvas.save();
                if (c40862f.m89431d0(canvas, documentData2, i11, dVar.f90866b)) {
                    float f17 = fFloatValue2;
                    DocumentData documentData4 = documentData2;
                    f13 = f11;
                    f14 = fM94204g;
                    c40862f.m89423V(dVar.f90865a, documentData4, c38072b, canvas, f14, f17, f13);
                    fFloatValue2 = f17;
                } else {
                    f13 = f11;
                    f14 = fM94204g;
                }
                canvas.restore();
                i13++;
                c40862f = this;
                fM94204g = f14;
                f11 = f13;
                documentData2 = documentData;
            }
            i12++;
            c40862f = this;
            f11 = f11;
            documentData2 = documentData;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final d m89426Y(int i11) {
        for (int size = this.f90848K.size(); size < i11; size++) {
            this.f90848K.add(new d(null));
        }
        return this.f90848K.get(i11 - 1);
    }

    /* JADX INFO: renamed from: Z */
    public final List<C37024d> m89427Z(C38073c c38073c) {
        if (this.f90846I.containsKey(c38073c)) {
            return this.f90846I.get(c38073c);
        }
        List<C40208k> listM85963a = c38073c.m85963a();
        int size = listM85963a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C37024d(this.f90850M, this, listM85963a.get(i11), this.f90851N));
        }
        this.f90846I.put(c38073c, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    public final List<String> m89428a0(String str) {
        return Arrays.asList(str.replaceAll(LogUtils.NEW_LINE, "\r").replaceAll("\u0003", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
    }

    @Nullable
    /* JADX INFO: renamed from: b0 */
    public final Typeface m89429b0(C38072b c38072b) {
        Typeface typefaceMo83831h;
        AbstractC37305a<Typeface, Typeface> abstractC37305a = this.f90861X;
        if (abstractC37305a != null && (typefaceMo83831h = abstractC37305a.mo83831h()) != null) {
            return typefaceMo83831h;
        }
        Typeface typefaceM5604d0 = this.f90850M.m5604d0(c38072b);
        return typefaceM5604d0 != null ? typefaceM5604d0 : c38072b.m85960d();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m89431d0(Canvas canvas, DocumentData documentData, int i11, float f11) {
        PointF pointF = documentData.f6044l;
        PointF pointF2 = documentData.f6045m;
        float fM94202e = C42930l.m94202e();
        float f12 = (i11 * documentData.f6038f * fM94202e) + (pointF == null ? 0.0f : (documentData.f6038f * fM94202e) + pointF.y);
        if (this.f90850M.m5567J() && pointF2 != null && pointF != null && f12 >= pointF.y + pointF2.y + documentData.f6035c) {
            return false;
        }
        float f13 = pointF == null ? 0.0f : pointF.x;
        float f14 = pointF2 != null ? pointF2.x : 0.0f;
        int i12 = c.f90864a[documentData.f6036d.ordinal()];
        if (i12 == 1) {
            canvas.translate(f13, f12);
        } else if (i12 == 2) {
            canvas.translate((f13 + f14) - f11, f12);
        } else if (i12 == 3) {
            canvas.translate((f13 + (f14 / 2.0f)) - (f11 / 2.0f), f12);
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final List<d> m89432e0(String str, float f11, C38072b c38072b, float f12, float f13, boolean z11) {
        float fMeasureText;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (z11) {
                C38073c c38073c = this.f90851N.m5652c().get(C38073c.m85962c(cCharAt, c38072b.m85957a(), c38072b.m85959c()));
                if (c38073c != null) {
                    fMeasureText = ((float) c38073c.m85964b()) * f12 * C42930l.m94202e();
                }
            } else {
                fMeasureText = this.f90844G.measureText(str.substring(i14, i14 + 1));
            }
            float f17 = fMeasureText + f13;
            if (cCharAt == ' ') {
                z12 = true;
                f16 = f17;
            } else if (z12) {
                z12 = false;
                i13 = i14;
                f15 = f17;
            } else {
                f15 += f17;
            }
            f14 += f17;
            if (f11 > 0.0f && f14 >= f11 && cCharAt != ' ') {
                i11++;
                d dVarM89426Y = m89426Y(i11);
                if (i13 == i12) {
                    String strSubstring = str.substring(i12, i14);
                    String strTrim = strSubstring.trim();
                    dVarM89426Y.m89435c(strTrim, (f14 - f17) - ((strTrim.length() - strSubstring.length()) * f16));
                    i12 = i14;
                    i13 = i12;
                    f14 = f17;
                    f15 = f14;
                } else {
                    String strSubstring2 = str.substring(i12, i13 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarM89426Y.m89435c(strTrim2, ((f14 - f15) - ((strSubstring2.length() - strTrim2.length()) * f16)) - f16);
                    f14 = f15;
                    i12 = i13;
                }
            }
        }
        if (f14 > 0.0f) {
            i11++;
            m89426Y(i11).m89435c(str.substring(i12), f14);
        }
        return this.f90848K.subList(0, i11);
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a
    /* JADX INFO: renamed from: t */
    public void mo5802t(Canvas canvas, Matrix matrix, int i11) {
        DocumentData documentDataMo83831h = this.f90849L.mo83831h();
        C38072b c38072b = this.f90851N.m5656g().get(documentDataMo83831h.f6034b);
        if (c38072b == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m89417P(documentDataMo83831h, i11);
        if (this.f90850M.m5600Z0()) {
            m89425X(documentDataMo83831h, matrix, c38072b, canvas);
        } else {
            m89424W(documentDataMo83831h, c38072b, canvas);
        }
        canvas.restore();
    }

    public C40862f(LottieDrawable lottieDrawable, Layer layer) {
        C38394b c38394b;
        C38394b c38394b2;
        C38393a c38393a;
        C38393a c38393a2;
        super(lottieDrawable, layer);
        this.f90841D = new StringBuilder(2);
        this.f90842E = new RectF();
        this.f90843F = new Matrix();
        this.f90844G = new a(1);
        this.f90845H = new b(1);
        this.f90846I = new HashMap();
        this.f90847J = new LongSparseArray<>();
        this.f90848K = new ArrayList();
        this.f90850M = lottieDrawable;
        this.f90851N = layer.m5743c();
        C37319o c37319oMo86574a = layer.m5760t().mo86574a();
        this.f90849L = c37319oMo86574a;
        c37319oMo86574a.m83824a(this);
        m5791i(c37319oMo86574a);
        C38403k c38403kM5761u = layer.m5761u();
        if (c38403kM5761u != null && (c38393a2 = c38403kM5761u.f86173a) != null) {
            AbstractC37305a<Integer, Integer> abstractC37305aMo86574a = c38393a2.mo86574a();
            this.f90852O = abstractC37305aMo86574a;
            abstractC37305aMo86574a.m83824a(this);
            m5791i(this.f90852O);
        }
        if (c38403kM5761u != null && (c38393a = c38403kM5761u.f86174b) != null) {
            AbstractC37305a<Integer, Integer> abstractC37305aMo86574a2 = c38393a.mo86574a();
            this.f90854Q = abstractC37305aMo86574a2;
            abstractC37305aMo86574a2.m83824a(this);
            m5791i(this.f90854Q);
        }
        if (c38403kM5761u != null && (c38394b2 = c38403kM5761u.f86175c) != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a3 = c38394b2.mo86574a();
            this.f90856S = abstractC37305aMo86574a3;
            abstractC37305aMo86574a3.m83824a(this);
            m5791i(this.f90856S);
        }
        if (c38403kM5761u != null && (c38394b = c38403kM5761u.f86176d) != null) {
            AbstractC37305a<Float, Float> abstractC37305aMo86574a4 = c38394b.mo86574a();
            this.f90858U = abstractC37305aMo86574a4;
            abstractC37305aMo86574a4.m83824a(this);
            m5791i(this.f90858U);
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m89416O(String str, int i11) {
        int iCodePointAt = str.codePointAt(i11);
        int iCharCount = Character.charCount(iCodePointAt) + i11;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!m89430c0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j11 = iCodePointAt;
        if (this.f90847J.containsKey(j11)) {
            return this.f90847J.get(j11);
        }
        this.f90841D.setLength(0);
        while (i11 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i11);
            this.f90841D.appendCodePoint(iCodePointAt3);
            i11 += Character.charCount(iCodePointAt3);
        }
        String string = this.f90841D.toString();
        this.f90847J.put(j11, string);
        return string;
    }

    /* JADX INFO: renamed from: Q */
    public final void m89418Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m89419R(C38073c c38073c, float f11, DocumentData documentData, Canvas canvas) {
        List<C37024d> listM89427Z = m89427Z(c38073c);
        for (int i11 = 0; i11 < listM89427Z.size(); i11++) {
            Path path = listM89427Z.get(i11).getPath();
            path.computeBounds(this.f90842E, false);
            this.f90843F.reset();
            this.f90843F.preTranslate(0.0f, (-documentData.f6039g) * C42930l.m94202e());
            this.f90843F.preScale(f11, f11);
            path.transform(this.f90843F);
            if (documentData.f6043k) {
                m89422U(path, this.f90844G, canvas);
                m89422U(path, this.f90845H, canvas);
            } else {
                m89422U(path, this.f90845H, canvas);
                m89422U(path, this.f90844G, canvas);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m89422U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca A[SYNTHETIC] */
    /* JADX INFO: renamed from: W */
    public final void m89424W(DocumentData documentData, C38072b c38072b, Canvas canvas) {
        float fFloatValue;
        float fFloatValue2;
        float fM94202e;
        List<String> listM89428a0;
        int size;
        int i11;
        int i12;
        PointF pointF;
        float f11;
        List<d> listM89432e0;
        int i13;
        d dVar;
        Typeface typefaceM89429b0 = m89429b0(c38072b);
        if (typefaceM89429b0 != null) {
            String strM5905c = documentData.f6033a;
            C5112t0 c5112t0M5603c0 = this.f90850M.m5603c0();
            if (c5112t0M5603c0 != null) {
                strM5905c = c5112t0M5603c0.m5905c(getName(), strM5905c);
            }
            this.f90844G.setTypeface(typefaceM89429b0);
            AbstractC37305a<Float, Float> abstractC37305a = this.f90860W;
            if (abstractC37305a != null) {
                fFloatValue = abstractC37305a.mo83831h().floatValue();
            } else {
                fFloatValue = documentData.f6035c;
            }
            this.f90844G.setTextSize(C42930l.m94202e() * fFloatValue);
            this.f90845H.setTypeface(this.f90844G.getTypeface());
            this.f90845H.setTextSize(this.f90844G.getTextSize());
            float f12 = documentData.f6037e / 10.0f;
            AbstractC37305a<Float, Float> abstractC37305a2 = this.f90859V;
            if (abstractC37305a2 != null) {
                fFloatValue2 = abstractC37305a2.mo83831h().floatValue();
            } else {
                AbstractC37305a<Float, Float> abstractC37305a3 = this.f90858U;
                if (abstractC37305a3 != null) {
                    fFloatValue2 = abstractC37305a3.mo83831h().floatValue();
                }
                fM94202e = ((f12 * C42930l.m94202e()) * fFloatValue) / 100.0f;
                listM89428a0 = m89428a0(strM5905c);
                size = listM89428a0.size();
                i11 = 0;
                i12 = -1;
                while (i11 < size) {
                    String str = listM89428a0.get(i11);
                    pointF = documentData.f6045m;
                    if (pointF == null) {
                        f11 = 0.0f;
                    } else {
                        f11 = pointF.x;
                    }
                    C38072b c38072b2 = c38072b;
                    listM89432e0 = m89432e0(str, f11, c38072b2, 0.0f, fM94202e, false);
                    for (i13 = 0; i13 < listM89432e0.size(); i13++) {
                        dVar = listM89432e0.get(i13);
                        i12++;
                        canvas.save();
                        if (m89431d0(canvas, documentData, i12, dVar.f90866b)) {
                            m89421T(dVar.f90865a, documentData, canvas, fM94202e);
                        }
                        canvas.restore();
                    }
                    i11++;
                    c38072b = c38072b2;
                }
            }
            f12 += fFloatValue2;
            fM94202e = ((f12 * C42930l.m94202e()) * fFloatValue) / 100.0f;
            listM89428a0 = m89428a0(strM5905c);
            size = listM89428a0.size();
            i11 = 0;
            i12 = -1;
            while (i11 < size) {
                String str2 = listM89428a0.get(i11);
                pointF = documentData.f6045m;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                C38072b c38072b3 = c38072b;
                listM89432e0 = m89432e0(str2, f11, c38072b3, 0.0f, fM94202e, false);
                while (i13 < listM89432e0.size()) {
                    dVar = listM89432e0.get(i13);
                    i12++;
                    canvas.save();
                    if (m89431d0(canvas, documentData, i12, dVar.f90866b)) {
                        m89421T(dVar.f90865a, documentData, canvas, fM94202e);
                    }
                    canvas.restore();
                }
                i11++;
                c38072b = c38072b3;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p297h1.InterfaceC38075e
    /* JADX INFO: renamed from: a */
    public <T> void mo5785a(T t11, @Nullable C43350c<T> c43350c) {
        super.mo5785a(t11, c43350c);
        if (t11 == InterfaceC5091m0.f6007a) {
            AbstractC37305a<Integer, Integer> abstractC37305a = this.f90853P;
            if (abstractC37305a != null) {
                m5777G(abstractC37305a);
            }
            if (c43350c == null) {
                this.f90853P = null;
                return;
            }
            C37321q c37321q = new C37321q(c43350c);
            this.f90853P = c37321q;
            c37321q.m83824a(this);
            m5791i(this.f90853P);
            return;
        }
        if (t11 == InterfaceC5091m0.f6008b) {
            AbstractC37305a<Integer, Integer> abstractC37305a2 = this.f90855R;
            if (abstractC37305a2 != null) {
                m5777G(abstractC37305a2);
            }
            if (c43350c == null) {
                this.f90855R = null;
                return;
            }
            C37321q c37321q2 = new C37321q(c43350c);
            this.f90855R = c37321q2;
            c37321q2.m83824a(this);
            m5791i(this.f90855R);
            return;
        }
        if (t11 == InterfaceC5091m0.f6025s) {
            AbstractC37305a<Float, Float> abstractC37305a3 = this.f90857T;
            if (abstractC37305a3 != null) {
                m5777G(abstractC37305a3);
            }
            if (c43350c == null) {
                this.f90857T = null;
                return;
            }
            C37321q c37321q3 = new C37321q(c43350c);
            this.f90857T = c37321q3;
            c37321q3.m83824a(this);
            m5791i(this.f90857T);
            return;
        }
        if (t11 == InterfaceC5091m0.f6026t) {
            AbstractC37305a<Float, Float> abstractC37305a4 = this.f90859V;
            if (abstractC37305a4 != null) {
                m5777G(abstractC37305a4);
            }
            if (c43350c == null) {
                this.f90859V = null;
                return;
            }
            C37321q c37321q4 = new C37321q(c43350c);
            this.f90859V = c37321q4;
            c37321q4.m83824a(this);
            m5791i(this.f90859V);
            return;
        }
        if (t11 == InterfaceC5091m0.f5996F) {
            AbstractC37305a<Float, Float> abstractC37305a5 = this.f90860W;
            if (abstractC37305a5 != null) {
                m5777G(abstractC37305a5);
            }
            if (c43350c == null) {
                this.f90860W = null;
                return;
            }
            C37321q c37321q5 = new C37321q(c43350c);
            this.f90860W = c37321q5;
            c37321q5.m83824a(this);
            m5791i(this.f90860W);
            return;
        }
        if (t11 == InterfaceC5091m0.f6003M) {
            AbstractC37305a<Typeface, Typeface> abstractC37305a6 = this.f90861X;
            if (abstractC37305a6 != null) {
                m5777G(abstractC37305a6);
            }
            if (c43350c == null) {
                this.f90861X = null;
                return;
            }
            C37321q c37321q6 = new C37321q(c43350c);
            this.f90861X = c37321q6;
            c37321q6.m83824a(this);
            m5791i(this.f90861X);
            return;
        }
        if (t11 == InterfaceC5091m0.f6005O) {
            this.f90849L.m83878r(c43350c);
        }
    }

    @Override // com.airbnb.lottie.model.layer.AbstractC5095a, p218e1.InterfaceC37025e
    /* JADX INFO: renamed from: b */
    public void mo5786b(RectF rectF, Matrix matrix, boolean z11) {
        super.mo5786b(rectF, matrix, z11);
        rectF.set(0.0f, 0.0f, this.f90851N.m5651b().width(), this.f90851N.m5651b().height());
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m89430c0(int i11) {
        if (Character.getType(i11) != 16 && Character.getType(i11) != 27 && Character.getType(i11) != 6 && Character.getType(i11) != 28 && Character.getType(i11) != 8 && Character.getType(i11) != 19) {
            return false;
        }
        return true;
    }
}
