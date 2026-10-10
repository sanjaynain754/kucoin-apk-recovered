package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.a */
/* JADX INFO: compiled from: BGABannerScroller.java */
/* JADX INFO: loaded from: classes13.dex */
public class C22985a extends Scroller {

    /* JADX INFO: renamed from: a */
    public int f44250a;

    @Override // android.widget.Scroller
    public void startScroll(int i11, int i12, int i13, int i14) {
        super.startScroll(i11, i12, i13, i14, this.f44250a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i11, int i12, int i13, int i14, int i15) {
        super.startScroll(i11, i12, i13, i14, this.f44250a);
    }

    public C22985a(Context context, int i11) {
        super(context);
        this.f44250a = i11;
    }
}
