package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.AbstractC5095a;
import java.util.List;
import p218e1.C37040t;
import p218e1.InterfaceC37023c;
import p328i1.C38393a;
import p328i1.C38394b;
import p328i1.C38396d;
import p355j1.InterfaceC40200c;

/* JADX INFO: loaded from: classes.dex */
public class ShapeStroke implements InterfaceC40200c {

    /* JADX INFO: renamed from: a */
    public final String f6071a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final C38394b f6072b;

    /* JADX INFO: renamed from: c */
    public final List<C38394b> f6073c;

    /* JADX INFO: renamed from: d */
    public final C38393a f6074d;

    /* JADX INFO: renamed from: e */
    public final C38396d f6075e;

    /* JADX INFO: renamed from: f */
    public final C38394b f6076f;

    /* JADX INFO: renamed from: g */
    public final LineCapType f6077g;

    /* JADX INFO: renamed from: h */
    public final LineJoinType f6078h;

    /* JADX INFO: renamed from: i */
    public final float f6079i;

    /* JADX INFO: renamed from: j */
    public final boolean f6080j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i11 = C5093a.f6083a[ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i11 = C5093a.f6084b[ordinal()];
            if (i11 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i11 == 2) {
                return Paint.Join.MITER;
            }
            if (i11 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.ShapeStroke$a */
    public static /* synthetic */ class C5093a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6083a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6084b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f6084b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6084b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6084b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f6083a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6083a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6083a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // p355j1.InterfaceC40200c
    /* JADX INFO: renamed from: a */
    public InterfaceC37023c mo5692a(LottieDrawable lottieDrawable, C5080h c5080h, AbstractC5095a abstractC5095a) {
        return new C37040t(lottieDrawable, abstractC5095a, this);
    }

    /* JADX INFO: renamed from: b */
    public LineCapType m5709b() {
        return this.f6077g;
    }

    /* JADX INFO: renamed from: c */
    public C38393a m5710c() {
        return this.f6074d;
    }

    /* JADX INFO: renamed from: d */
    public C38394b m5711d() {
        return this.f6072b;
    }

    /* JADX INFO: renamed from: e */
    public LineJoinType m5712e() {
        return this.f6078h;
    }

    /* JADX INFO: renamed from: f */
    public List<C38394b> m5713f() {
        return this.f6073c;
    }

    /* JADX INFO: renamed from: g */
    public float m5714g() {
        return this.f6079i;
    }

    /* JADX INFO: renamed from: h */
    public String m5715h() {
        return this.f6071a;
    }

    /* JADX INFO: renamed from: i */
    public C38396d m5716i() {
        return this.f6075e;
    }

    /* JADX INFO: renamed from: j */
    public C38394b m5717j() {
        return this.f6076f;
    }

    /* JADX INFO: renamed from: k */
    public boolean m5718k() {
        return this.f6080j;
    }

    public ShapeStroke(String str, @Nullable C38394b c38394b, List<C38394b> list, C38393a c38393a, C38396d c38396d, C38394b c38394b2, LineCapType lineCapType, LineJoinType lineJoinType, float f11, boolean z11) {
        this.f6071a = str;
        this.f6072b = c38394b;
        this.f6073c = list;
        this.f6074d = c38393a;
        this.f6075e = c38396d;
        this.f6076f = c38394b2;
        this.f6077g = lineCapType;
        this.f6078h = lineJoinType;
        this.f6079i = f11;
        this.f6080j = z11;
    }
}
