package com.sumsub.sns.internal.features.presentation.preview.photo;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class RunnableC31795i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC31826m f64604a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f64605b;

    public RunnableC31795i(ViewPager2 viewPager2, AbstractC31826m abstractC31826m, ArrayList arrayList) {
        this.f64604a = abstractC31826m;
        this.f64605b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC31826m abstractC31826m = this.f64604a;
        int size = this.f64605b.size();
        KProperty[] kPropertyArr = AbstractC31826m.f64666t;
        abstractC31826m.m70901a(size);
    }
}
