package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.C5586g;
import com.facebook.drawee.drawable.C5591k;
import com.facebook.drawee.drawable.C5592l;
import com.facebook.drawee.drawable.C5594n;
import com.facebook.drawee.drawable.C5595o;
import com.facebook.drawee.drawable.InterfaceC5578c;
import com.facebook.drawee.drawable.InterfaceC5590j;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import p192d6.C36621b;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: com.facebook.drawee.generic.a */
/* JADX INFO: compiled from: WrappingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5607a {

    /* JADX INFO: renamed from: a */
    public static final Drawable f8382a = new ColorDrawable(0);

    /* JADX INFO: renamed from: f */
    public static Drawable m8731f(Drawable drawable, InterfaceC5597q interfaceC5597q) {
        return m8732g(drawable, interfaceC5597q, null);
    }

    /* JADX INFO: renamed from: h */
    public static void m8733h(InterfaceC5590j interfaceC5590j) {
        interfaceC5590j.mo8643a(false);
        interfaceC5590j.mo8645c(0.0f);
        interfaceC5590j.setBorder(0, 0.0f);
        interfaceC5590j.mo8644b(0.0f);
        interfaceC5590j.mo8648f(false);
        interfaceC5590j.mo8647e(false);
        interfaceC5590j.mo8646d(C5591k.m8687n());
    }

    /* JADX INFO: renamed from: a */
    public static Drawable m8726a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C5591k c5591k = new C5591k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), roundingParams.m8713i());
            m8727b(c5591k, roundingParams);
            return c5591k;
        }
        if (drawable instanceof NinePatchDrawable) {
            C5594n c5594n = new C5594n((NinePatchDrawable) drawable);
            m8727b(c5594n, roundingParams);
            return c5594n;
        }
        if (!(drawable instanceof ColorDrawable)) {
            C45999a.m101490K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        C5592l c5592lM8691g = C5592l.m8691g((ColorDrawable) drawable);
        m8727b(c5592lM8691g, roundingParams);
        return c5592lM8691g;
    }

    /* JADX INFO: renamed from: k */
    public static C5595o m8736k(InterfaceC5578c interfaceC5578c, InterfaceC5597q interfaceC5597q) {
        Drawable drawableM8731f = m8731f(interfaceC5578c.setDrawable(f8382a), interfaceC5597q);
        interfaceC5578c.setDrawable(drawableM8731f);
        C45708h.m100897h(drawableM8731f, "Parent has no child drawable!");
        return (C5595o) drawableM8731f;
    }

    /* JADX INFO: renamed from: b */
    public static void m8727b(InterfaceC5590j interfaceC5590j, RoundingParams roundingParams) {
        interfaceC5590j.mo8643a(roundingParams.m8714j());
        interfaceC5590j.mo8649h(roundingParams.m8708d());
        interfaceC5590j.setBorder(roundingParams.m8706b(), roundingParams.m8707c());
        interfaceC5590j.mo8644b(roundingParams.m8711g());
        interfaceC5590j.mo8648f(roundingParams.m8716l());
        interfaceC5590j.mo8647e(roundingParams.m8712h());
        interfaceC5590j.mo8646d(roundingParams.m8713i());
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC5578c m8728c(InterfaceC5578c interfaceC5578c) {
        while (true) {
            Object drawable = interfaceC5578c.getDrawable();
            if (drawable == interfaceC5578c || !(drawable instanceof InterfaceC5578c)) {
                break;
            }
            interfaceC5578c = (InterfaceC5578c) drawable;
        }
        return interfaceC5578c;
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m8729d(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8715k() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (drawable instanceof C5586g) {
                    InterfaceC5578c interfaceC5578cM8728c = m8728c((C5586g) drawable);
                    interfaceC5578cM8728c.setDrawable(m8726a(interfaceC5578cM8728c.setDrawable(f8382a), roundingParams, resources));
                    return drawable;
                }
                return m8726a(drawable, roundingParams, resources);
            }
            return drawable;
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m8730e(Drawable drawable, RoundingParams roundingParams) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (drawable != null && roundingParams != null && roundingParams.m8715k() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                m8727b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.m8651j(roundingParams.m8710f());
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Drawable m8732g(Drawable drawable, InterfaceC5597q interfaceC5597q, PointF pointF) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable != null && interfaceC5597q != null) {
            C5595o c5595o = new C5595o(drawable, interfaceC5597q);
            if (pointF != null) {
                c5595o.m8703m(pointF);
            }
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            return c5595o;
        }
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        return drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static void m8734i(InterfaceC5578c interfaceC5578c, RoundingParams roundingParams, Resources resources) {
        InterfaceC5578c interfaceC5578cM8728c = m8728c(interfaceC5578c);
        Drawable drawable = interfaceC5578cM8728c.getDrawable();
        if (roundingParams != null && roundingParams.m8715k() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (drawable instanceof InterfaceC5590j) {
                m8727b((InterfaceC5590j) drawable, roundingParams);
                return;
            } else {
                if (drawable != 0) {
                    interfaceC5578cM8728c.setDrawable(f8382a);
                    interfaceC5578cM8728c.setDrawable(m8726a(drawable, roundingParams, resources));
                    return;
                }
                return;
            }
        }
        if (drawable instanceof InterfaceC5590j) {
            m8733h((InterfaceC5590j) drawable);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8735j(InterfaceC5578c interfaceC5578c, RoundingParams roundingParams) {
        Drawable drawable = interfaceC5578c.getDrawable();
        if (roundingParams != null && roundingParams.m8715k() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (drawable instanceof RoundedCornersDrawable) {
                RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) drawable;
                m8727b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.m8651j(roundingParams.m8710f());
                return;
            }
            interfaceC5578c.setDrawable(m8730e(interfaceC5578c.setDrawable(f8382a), roundingParams));
            return;
        }
        if (drawable instanceof RoundedCornersDrawable) {
            Drawable drawable2 = f8382a;
            interfaceC5578c.setDrawable(((RoundedCornersDrawable) drawable).setCurrent(drawable2));
            drawable2.setCallback(null);
        }
    }
}
