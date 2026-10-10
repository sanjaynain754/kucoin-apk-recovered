package p392k4;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C5589i;
import p192d6.C36621b;
import p714w5.InterfaceC45739a;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: compiled from: DefaultDrawableFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40886a implements InterfaceC45739a {

    /* JADX INFO: renamed from: a */
    public final Resources f90915a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC45739a f90916b;

    @Override // p714w5.InterfaceC45739a
    public boolean supportsImageType(InterfaceC46071e interfaceC46071e) {
        return true;
    }

    public C40886a(Resources resources, InterfaceC45739a interfaceC45739a) {
        this.f90915a = resources;
        this.f90916b = interfaceC45739a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m89512a(InterfaceC46072f interfaceC46072f) {
        if (interfaceC46072f.mo101547t() != 1 && interfaceC46072f.mo101547t() != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m89513b(InterfaceC46072f interfaceC46072f) {
        if (interfaceC46072f.mo101543F() != 0 && interfaceC46072f.mo101543F() != -1) {
            return true;
        }
        return false;
    }

    @Override // p714w5.InterfaceC45739a
    public Drawable createDrawable(InterfaceC46071e interfaceC46071e) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("DefaultDrawableFactory#createDrawable");
            }
            if (interfaceC46071e instanceof InterfaceC46072f) {
                InterfaceC46072f interfaceC46072f = (InterfaceC46072f) interfaceC46071e;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f90915a, interfaceC46072f.mo101544K());
                if (!m89513b(interfaceC46072f) && !m89512a(interfaceC46072f)) {
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                    return bitmapDrawable;
                }
                C5589i c5589i = new C5589i(bitmapDrawable, interfaceC46072f.mo101543F(), interfaceC46072f.mo101547t());
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                return c5589i;
            }
            InterfaceC45739a interfaceC45739a = this.f90916b;
            if (interfaceC45739a != null && interfaceC45739a.supportsImageType(interfaceC46071e)) {
                Drawable drawableCreateDrawable = this.f90916b.createDrawable(interfaceC46071e);
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                return drawableCreateDrawable;
            }
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            return null;
        } catch (Throwable th2) {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            throw th2;
        }
    }
}
