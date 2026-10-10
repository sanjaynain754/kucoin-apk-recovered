package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.content.Mask;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.List;
import java.util.Locale;
import p328i1.C38394b;
import p328i1.C38402j;
import p328i1.C38403k;
import p328i1.C38404l;
import p355j1.C40198a;
import p355j1.InterfaceC40200c;
import p444m1.C42365j;
import p522p1.C43348a;

/* JADX INFO: loaded from: classes.dex */
public class Layer {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC40200c> f6105a;

    /* JADX INFO: renamed from: b */
    public final C5080h f6106b;

    /* JADX INFO: renamed from: c */
    public final String f6107c;

    /* JADX INFO: renamed from: d */
    public final long f6108d;

    /* JADX INFO: renamed from: e */
    public final LayerType f6109e;

    /* JADX INFO: renamed from: f */
    public final long f6110f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final String f6111g;

    /* JADX INFO: renamed from: h */
    public final List<Mask> f6112h;

    /* JADX INFO: renamed from: i */
    public final C38404l f6113i;

    /* JADX INFO: renamed from: j */
    public final int f6114j;

    /* JADX INFO: renamed from: k */
    public final int f6115k;

    /* JADX INFO: renamed from: l */
    public final int f6116l;

    /* JADX INFO: renamed from: m */
    public final float f6117m;

    /* JADX INFO: renamed from: n */
    public final float f6118n;

    /* JADX INFO: renamed from: o */
    public final float f6119o;

    /* JADX INFO: renamed from: p */
    public final float f6120p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public final C38402j f6121q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public final C38403k f6122r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public final C38394b f6123s;

    /* JADX INFO: renamed from: t */
    public final List<C43348a<Float>> f6124t;

    /* JADX INFO: renamed from: u */
    public final MatteType f6125u;

    /* JADX INFO: renamed from: v */
    public final boolean f6126v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public final C40198a f6127w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public final C42365j f6128x;

    /* JADX INFO: renamed from: y */
    public final LBlendMode f6129y;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<InterfaceC40200c> list, C5080h c5080h, String str, long j11, LayerType layerType, long j12, @Nullable String str2, List<Mask> list2, C38404l c38404l, int i11, int i12, int i13, float f11, float f12, float f13, float f14, @Nullable C38402j c38402j, @Nullable C38403k c38403k, List<C43348a<Float>> list3, MatteType matteType, @Nullable C38394b c38394b, boolean z11, @Nullable C40198a c40198a, @Nullable C42365j c42365j, LBlendMode lBlendMode) {
        this.f6105a = list;
        this.f6106b = c5080h;
        this.f6107c = str;
        this.f6108d = j11;
        this.f6109e = layerType;
        this.f6110f = j12;
        this.f6111g = str2;
        this.f6112h = list2;
        this.f6113i = c38404l;
        this.f6114j = i11;
        this.f6115k = i12;
        this.f6116l = i13;
        this.f6117m = f11;
        this.f6118n = f12;
        this.f6119o = f13;
        this.f6120p = f14;
        this.f6121q = c38402j;
        this.f6122r = c38403k;
        this.f6124t = list3;
        this.f6125u = matteType;
        this.f6123s = c38394b;
        this.f6126v = z11;
        this.f6127w = c40198a;
        this.f6128x = c42365j;
        this.f6129y = lBlendMode;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public LBlendMode m5741a() {
        return this.f6129y;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public C40198a m5742b() {
        return this.f6127w;
    }

    /* JADX INFO: renamed from: c */
    public C5080h m5743c() {
        return this.f6106b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public C42365j m5744d() {
        return this.f6128x;
    }

    /* JADX INFO: renamed from: e */
    public long m5745e() {
        return this.f6108d;
    }

    /* JADX INFO: renamed from: f */
    public List<C43348a<Float>> m5746f() {
        return this.f6124t;
    }

    /* JADX INFO: renamed from: g */
    public LayerType m5747g() {
        return this.f6109e;
    }

    /* JADX INFO: renamed from: h */
    public List<Mask> m5748h() {
        return this.f6112h;
    }

    /* JADX INFO: renamed from: i */
    public MatteType m5749i() {
        return this.f6125u;
    }

    /* JADX INFO: renamed from: j */
    public String m5750j() {
        return this.f6107c;
    }

    /* JADX INFO: renamed from: k */
    public long m5751k() {
        return this.f6110f;
    }

    /* JADX INFO: renamed from: l */
    public float m5752l() {
        return this.f6120p;
    }

    /* JADX INFO: renamed from: m */
    public float m5753m() {
        return this.f6119o;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public String m5754n() {
        return this.f6111g;
    }

    /* JADX INFO: renamed from: o */
    public List<InterfaceC40200c> m5755o() {
        return this.f6105a;
    }

    /* JADX INFO: renamed from: p */
    public int m5756p() {
        return this.f6116l;
    }

    /* JADX INFO: renamed from: q */
    public int m5757q() {
        return this.f6115k;
    }

    /* JADX INFO: renamed from: r */
    public int m5758r() {
        return this.f6114j;
    }

    /* JADX INFO: renamed from: s */
    public float m5759s() {
        return this.f6118n / this.f6106b.m5654e();
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public C38402j m5760t() {
        return this.f6121q;
    }

    public String toString() {
        return m5766z("");
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public C38403k m5761u() {
        return this.f6122r;
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public C38394b m5762v() {
        return this.f6123s;
    }

    /* JADX INFO: renamed from: w */
    public float m5763w() {
        return this.f6117m;
    }

    /* JADX INFO: renamed from: x */
    public C38404l m5764x() {
        return this.f6113i;
    }

    /* JADX INFO: renamed from: y */
    public boolean m5765y() {
        return this.f6126v;
    }

    /* JADX INFO: renamed from: z */
    public String m5766z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m5750j());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Layer layerM5669t = this.f6106b.m5669t(m5751k());
        if (layerM5669t != null) {
            sb2.append("\t\tParents: ");
            sb2.append(layerM5669t.m5750j());
            Layer layerM5669t2 = this.f6106b.m5669t(layerM5669t.m5751k());
            while (layerM5669t2 != null) {
                sb2.append("->");
                sb2.append(layerM5669t2.m5750j());
                layerM5669t2 = this.f6106b.m5669t(layerM5669t2.m5751k());
            }
            sb2.append(str);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (!m5748h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(m5748h().size());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        if (m5758r() != 0 && m5757q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m5758r()), Integer.valueOf(m5757q()), Integer.valueOf(m5756p())));
        }
        if (!this.f6105a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (InterfaceC40200c interfaceC40200c : this.f6105a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(interfaceC40200c);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            }
        }
        return sb2.toString();
    }
}
