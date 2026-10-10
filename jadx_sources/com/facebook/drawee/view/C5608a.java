package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.drawee.view.a */
/* JADX INFO: compiled from: AspectRatioMeasure.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5608a {

    /* JADX INFO: renamed from: com.facebook.drawee.view.a$a */
    /* JADX INFO: compiled from: AspectRatioMeasure.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f8385a;

        /* JADX INFO: renamed from: b */
        public int f8386b;
    }

    /* JADX INFO: renamed from: b */
    public static void m8743b(a aVar, float f11, ViewGroup.LayoutParams layoutParams, int i11, int i12) {
        if (f11 <= 0.0f || layoutParams == null) {
            return;
        }
        if (m8742a(layoutParams.height)) {
            aVar.f8386b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f8385a) - i11) / f11) + i12), aVar.f8386b), 1073741824);
        } else if (m8742a(layoutParams.width)) {
            aVar.f8385a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(aVar.f8386b) - i12) * f11) + i11), aVar.f8385a), 1073741824);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8742a(int i11) {
        return i11 == 0 || i11 == -2;
    }
}
