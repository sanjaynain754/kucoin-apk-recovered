package l10;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.CompoundButton;
import androidx.core.widget.CompoundButtonCompat;
import o10.InterfaceC42931a;

/* JADX INFO: renamed from: l10.a */
/* JADX INFO: compiled from: ButtonDrawableBuilder.java */
/* JADX INFO: loaded from: classes43.dex */
public final class C42024a {

    /* JADX INFO: renamed from: a */
    public final CompoundButton f92215a;

    /* JADX INFO: renamed from: b */
    public Drawable f92216b;

    /* JADX INFO: renamed from: c */
    public Drawable f92217c;

    /* JADX INFO: renamed from: d */
    public Drawable f92218d;

    /* JADX INFO: renamed from: e */
    public Drawable f92219e;

    /* JADX INFO: renamed from: f */
    public Drawable f92220f;

    /* JADX INFO: renamed from: g */
    public Drawable f92221g;

    /* JADX INFO: renamed from: a */
    public void m92137a() {
        Drawable drawable = this.f92216b;
        if (drawable == null) {
            return;
        }
        if (this.f92217c == null && this.f92218d == null && this.f92219e == null && this.f92220f == null && this.f92221g == null) {
            this.f92215a.setButtonDrawable(drawable);
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable2 = this.f92217c;
        if (drawable2 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable2);
        }
        Drawable drawable3 = this.f92218d;
        if (drawable3 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_checked}, drawable3);
        }
        Drawable drawable4 = this.f92219e;
        if (drawable4 != null) {
            stateListDrawable.addState(new int[]{-16842910}, drawable4);
        }
        Drawable drawable5 = this.f92220f;
        if (drawable5 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_focused}, drawable5);
        }
        Drawable drawable6 = this.f92221g;
        if (drawable6 != null) {
            stateListDrawable.addState(new int[]{R.attr.state_selected}, drawable6);
        }
        stateListDrawable.addState(new int[0], this.f92216b);
        this.f92215a.setButtonDrawable(stateListDrawable);
    }

    /* JADX INFO: renamed from: b */
    public C42024a m92138b(Drawable drawable) {
        Drawable drawable2 = this.f92217c;
        Drawable drawable3 = this.f92216b;
        if (drawable2 == drawable3) {
            this.f92217c = drawable;
        }
        if (this.f92218d == drawable3) {
            this.f92218d = drawable;
        }
        if (this.f92219e == drawable3) {
            this.f92219e = drawable;
        }
        if (this.f92220f == drawable3) {
            this.f92220f = drawable;
        }
        if (this.f92221g == drawable3) {
            this.f92221g = drawable;
        }
        this.f92216b = drawable;
        return this;
    }

    public C42024a(CompoundButton compoundButton, TypedArray typedArray, InterfaceC42931a interfaceC42931a) {
        this.f92215a = compoundButton;
        if (typedArray.hasValue(interfaceC42931a.mo94220l())) {
            this.f92216b = typedArray.getDrawable(interfaceC42931a.mo94220l());
        } else {
            this.f92216b = CompoundButtonCompat.getButtonDrawable(compoundButton);
        }
        if (typedArray.hasValue(interfaceC42931a.mo94217P())) {
            this.f92217c = typedArray.getDrawable(interfaceC42931a.mo94217P());
        }
        if (typedArray.hasValue(interfaceC42931a.mo94221r())) {
            this.f92218d = typedArray.getDrawable(interfaceC42931a.mo94221r());
        }
        if (typedArray.hasValue(interfaceC42931a.mo94218R())) {
            this.f92219e = typedArray.getDrawable(interfaceC42931a.mo94218R());
        }
        if (typedArray.hasValue(interfaceC42931a.mo94219j0())) {
            this.f92220f = typedArray.getDrawable(interfaceC42931a.mo94219j0());
        }
        if (typedArray.hasValue(interfaceC42931a.mo94216A())) {
            this.f92221g = typedArray.getDrawable(interfaceC42931a.mo94216A());
        }
    }
}
