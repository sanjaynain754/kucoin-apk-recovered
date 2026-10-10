package p584r4;

import android.R;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p712w3.C45708h;

/* JADX INFO: renamed from: r4.b */
/* JADX INFO: compiled from: GenericDraweeHierarchyBuilder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43922b {

    /* JADX INFO: renamed from: t */
    public static final InterfaceC5597q f97094t = InterfaceC5597q.f8358h;

    /* JADX INFO: renamed from: u */
    public static final InterfaceC5597q f97095u = InterfaceC5597q.f8359i;

    /* JADX INFO: renamed from: a */
    public Resources f97096a;

    /* JADX INFO: renamed from: b */
    public int f97097b;

    /* JADX INFO: renamed from: c */
    public float f97098c;

    /* JADX INFO: renamed from: d */
    public Drawable f97099d;

    /* JADX INFO: renamed from: e */
    public InterfaceC5597q f97100e;

    /* JADX INFO: renamed from: f */
    public Drawable f97101f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5597q f97102g;

    /* JADX INFO: renamed from: h */
    public Drawable f97103h;

    /* JADX INFO: renamed from: i */
    public InterfaceC5597q f97104i;

    /* JADX INFO: renamed from: j */
    public Drawable f97105j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5597q f97106k;

    /* JADX INFO: renamed from: l */
    public InterfaceC5597q f97107l;

    /* JADX INFO: renamed from: m */
    public Matrix f97108m;

    /* JADX INFO: renamed from: n */
    public PointF f97109n;

    /* JADX INFO: renamed from: o */
    public ColorFilter f97110o;

    /* JADX INFO: renamed from: p */
    public Drawable f97111p;

    /* JADX INFO: renamed from: q */
    public List<Drawable> f97112q;

    /* JADX INFO: renamed from: r */
    public Drawable f97113r;

    /* JADX INFO: renamed from: s */
    public RoundingParams f97114s;

    /* JADX INFO: renamed from: u */
    public static C43922b m96784u(Resources resources) {
        return new C43922b(resources);
    }

    /* JADX INFO: renamed from: A */
    public C43922b m96785A(InterfaceC5597q interfaceC5597q) {
        this.f97104i = interfaceC5597q;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C43922b m96786B(Drawable drawable) {
        if (drawable == null) {
            this.f97112q = null;
            return this;
        }
        this.f97112q = Arrays.asList(drawable);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public C43922b m96787C(Drawable drawable) {
        this.f97099d = drawable;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public C43922b m96788D(InterfaceC5597q interfaceC5597q) {
        this.f97100e = interfaceC5597q;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public C43922b m96789E(Drawable drawable) {
        if (drawable == null) {
            this.f97113r = null;
            return this;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        this.f97113r = stateListDrawable;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public C43922b m96790F(Drawable drawable) {
        this.f97105j = drawable;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public C43922b m96791G(InterfaceC5597q interfaceC5597q) {
        this.f97106k = interfaceC5597q;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public C43922b m96792H(Drawable drawable) {
        this.f97101f = drawable;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public C43922b m96793I(InterfaceC5597q interfaceC5597q) {
        this.f97102g = interfaceC5597q;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public C43922b m96794J(RoundingParams roundingParams) {
        this.f97114s = roundingParams;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final void m96795K() {
        List<Drawable> list = this.f97112q;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                C45708h.m100896g(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public ColorFilter m96797b() {
        return this.f97110o;
    }

    /* JADX INFO: renamed from: c */
    public PointF m96798c() {
        return this.f97109n;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC5597q m96799d() {
        return this.f97107l;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m96800e() {
        return this.f97111p;
    }

    /* JADX INFO: renamed from: f */
    public float m96801f() {
        return this.f97098c;
    }

    /* JADX INFO: renamed from: g */
    public int m96802g() {
        return this.f97097b;
    }

    /* JADX INFO: renamed from: h */
    public Drawable m96803h() {
        return this.f97103h;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC5597q m96804i() {
        return this.f97104i;
    }

    /* JADX INFO: renamed from: j */
    public List<Drawable> m96805j() {
        return this.f97112q;
    }

    /* JADX INFO: renamed from: k */
    public Drawable m96806k() {
        return this.f97099d;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC5597q m96807l() {
        return this.f97100e;
    }

    /* JADX INFO: renamed from: m */
    public Drawable m96808m() {
        return this.f97113r;
    }

    /* JADX INFO: renamed from: n */
    public Drawable m96809n() {
        return this.f97105j;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC5597q m96810o() {
        return this.f97106k;
    }

    /* JADX INFO: renamed from: p */
    public Resources m96811p() {
        return this.f97096a;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m96812q() {
        return this.f97101f;
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC5597q m96813r() {
        return this.f97102g;
    }

    /* JADX INFO: renamed from: s */
    public RoundingParams m96814s() {
        return this.f97114s;
    }

    /* JADX INFO: renamed from: t */
    public final void m96815t() {
        this.f97097b = 300;
        this.f97098c = 0.0f;
        this.f97099d = null;
        InterfaceC5597q interfaceC5597q = f97094t;
        this.f97100e = interfaceC5597q;
        this.f97101f = null;
        this.f97102g = interfaceC5597q;
        this.f97103h = null;
        this.f97104i = interfaceC5597q;
        this.f97105j = null;
        this.f97106k = interfaceC5597q;
        this.f97107l = f97095u;
        this.f97108m = null;
        this.f97109n = null;
        this.f97110o = null;
        this.f97111p = null;
        this.f97112q = null;
        this.f97113r = null;
        this.f97114s = null;
    }

    /* JADX INFO: renamed from: v */
    public C43922b m96816v(InterfaceC5597q interfaceC5597q) {
        this.f97107l = interfaceC5597q;
        this.f97108m = null;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C43922b m96817w(Drawable drawable) {
        this.f97111p = drawable;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C43922b m96818x(float f11) {
        this.f97098c = f11;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public C43922b m96819y(int i11) {
        this.f97097b = i11;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public C43922b m96820z(Drawable drawable) {
        this.f97103h = drawable;
        return this;
    }

    public C43922b(Resources resources) {
        this.f97096a = resources;
        m96815t();
    }

    /* JADX INFO: renamed from: a */
    public C43921a m96796a() {
        m96795K();
        return new C43921a(this);
    }
}
