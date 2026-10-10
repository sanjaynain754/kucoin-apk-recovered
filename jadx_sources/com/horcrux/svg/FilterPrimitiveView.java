package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FilterPrimitiveView extends DefinitionView {

    /* JADX INFO: renamed from: b */
    public String f12953b;

    /* JADX INFO: renamed from: c */
    public final FilterRegion f12954c;

    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static Bitmap m14023h(HashMap<String, Bitmap> map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    /* JADX INFO: renamed from: g */
    public String m14024g() {
        return this.f12953b;
    }

    /* JADX INFO: renamed from: i */
    public void m14025i(Dynamic dynamic) {
        this.f12954c.setHeight(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m14026j(String str) {
        this.f12953b = str;
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m14027k(Dynamic dynamic) {
        this.f12954c.setWidth(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m14028l(Dynamic dynamic) {
        this.f12954c.setX(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m14029m(Dynamic dynamic) {
        this.f12954c.setY(dynamic);
        invalidate();
    }

    public FilterPrimitiveView(ReactContext reactContext) {
        super(reactContext);
        this.f12954c = new FilterRegion();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
    }
}
