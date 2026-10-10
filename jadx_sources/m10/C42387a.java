package m10;

import android.R;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.HashMap;

/* JADX INFO: renamed from: m10.a */
/* JADX INFO: compiled from: ExtendStateListDrawable.java */
/* JADX INFO: loaded from: classes43.dex */
public class C42387a extends StateListDrawable {

    /* JADX INFO: renamed from: c */
    public static final int[] f93922c = new int[0];

    /* JADX INFO: renamed from: d */
    public static final int[] f93923d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f93924e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f93925f = {-16842910};

    /* JADX INFO: renamed from: g */
    public static final int[] f93926g = {R.attr.state_focused};

    /* JADX INFO: renamed from: h */
    public static final int[] f93927h = {R.attr.state_selected};

    /* JADX INFO: renamed from: b */
    public final HashMap<int[], Drawable> f93928b = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public Drawable m93007a() {
        return this.f93928b.get(f93924e);
    }

    /* JADX INFO: renamed from: b */
    public Drawable m93008b() {
        return this.f93928b.get(f93922c);
    }

    /* JADX INFO: renamed from: c */
    public Drawable m93009c() {
        return this.f93928b.get(f93925f);
    }

    /* JADX INFO: renamed from: d */
    public Drawable m93010d() {
        return this.f93928b.get(f93926g);
    }

    /* JADX INFO: renamed from: e */
    public Drawable m93011e() {
        return this.f93928b.get(f93923d);
    }

    /* JADX INFO: renamed from: f */
    public Drawable m93012f() {
        return this.f93928b.get(f93927h);
    }

    /* JADX INFO: renamed from: g */
    public void m93013g(Drawable drawable) {
        addState(f93924e, drawable);
    }

    /* JADX INFO: renamed from: h */
    public void m93014h(Drawable drawable) {
        addState(f93922c, drawable);
    }

    /* JADX INFO: renamed from: i */
    public void m93015i(Drawable drawable) {
        addState(f93925f, drawable);
    }

    /* JADX INFO: renamed from: j */
    public void m93016j(Drawable drawable) {
        addState(f93926g, drawable);
    }

    /* JADX INFO: renamed from: k */
    public void m93017k(Drawable drawable) {
        addState(f93923d, drawable);
    }

    /* JADX INFO: renamed from: l */
    public void m93018l(Drawable drawable) {
        addState(f93927h, drawable);
    }

    @Override // android.graphics.drawable.StateListDrawable
    public void addState(int[] iArr, Drawable drawable) {
        super.addState(iArr, drawable);
        if (drawable == null) {
            return;
        }
        this.f93928b.put(iArr, drawable);
    }
}
