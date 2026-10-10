package p279g1;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C5066a;
import java.util.HashMap;
import java.util.Map;
import p297h1.C38072b;
import p297h1.C38078h;
import p484o1.C42924f;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37768a {

    /* JADX INFO: renamed from: d */
    public final AssetManager f85074d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C5066a f85075e;

    /* JADX INFO: renamed from: a */
    public final C38078h<String> f85071a = new C38078h<>();

    /* JADX INFO: renamed from: b */
    public final Map<C38078h<String>, Typeface> f85072b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Typeface> f85073c = new HashMap();

    /* JADX INFO: renamed from: f */
    public String f85076f = ".ttf";

    /* JADX INFO: renamed from: b */
    public Typeface m85196b(C38072b c38072b) {
        this.f85071a.m85979b(c38072b.m85957a(), c38072b.m85959c());
        Typeface typeface = this.f85072b.get(this.f85071a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceM85199e = m85199e(m85195a(c38072b), c38072b.m85959c());
        this.f85072b.put(this.f85071a, typefaceM85199e);
        return typefaceM85199e;
    }

    /* JADX INFO: renamed from: c */
    public void m85197c(String str) {
        this.f85076f = str;
    }

    /* JADX INFO: renamed from: d */
    public void m85198d(@Nullable C5066a c5066a) {
        this.f85075e = c5066a;
    }

    /* JADX INFO: renamed from: e */
    public final Typeface m85199e(Typeface typeface, String str) {
        int i11;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i11 = 3;
        } else if (zContains) {
            i11 = 2;
        } else {
            i11 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }

    public C37768a(Drawable.Callback callback, @Nullable C5066a c5066a) {
        this.f85075e = c5066a;
        if (!(callback instanceof View)) {
            C42924f.m94158c("LottieDrawable must be inside of a view for images to work.");
            this.f85074d = null;
        } else {
            this.f85074d = ((View) callback).getContext().getAssets();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Typeface m85195a(C38072b c38072b) {
        Typeface typefaceCreateFromAsset;
        String strM85957a = c38072b.m85957a();
        Typeface typeface = this.f85073c.get(strM85957a);
        if (typeface != null) {
            return typeface;
        }
        String strM85959c = c38072b.m85959c();
        String strM85958b = c38072b.m85958b();
        C5066a c5066a = this.f85075e;
        if (c5066a != null) {
            typefaceCreateFromAsset = c5066a.fetchFont(strM85957a, strM85959c, strM85958b);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f85075e.fetchFont(strM85957a);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        C5066a c5066a2 = this.f85075e;
        if (c5066a2 != null && typefaceCreateFromAsset == null) {
            String fontPath = c5066a2.getFontPath(strM85957a, strM85959c, strM85958b);
            if (fontPath == null) {
                fontPath = this.f85075e.getFontPath(strM85957a);
            }
            if (fontPath != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.f85074d, fontPath);
            }
        }
        if (c38072b.m85960d() != null) {
            return c38072b.m85960d();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.f85074d, "fonts/" + strM85957a + this.f85076f);
        }
        this.f85073c.put(strM85957a, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }
}
