package com.kubi.resources.guideview;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: renamed from: com.kubi.resources.guideview.a */
/* JADX INFO: compiled from: Common.java */
/* JADX INFO: loaded from: classes11.dex */
public class C22893a {
    /* JADX INFO: renamed from: b */
    public static Rect m54302b(View view, int i11, int i12) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        int i13 = iArr[0];
        rect.set(i13, iArr[1], view.getMeasuredWidth() + i13, iArr[1] + view.getMeasuredHeight());
        rect.offset(-i11, -i12);
        return rect;
    }

    /* JADX INFO: renamed from: a */
    public static View m54301a(LayoutInflater layoutInflater, InterfaceC22894b interfaceC22894b) {
        View viewMo18893e = interfaceC22894b.mo18893e(layoutInflater);
        MaskView.C22892a c22892a = new MaskView.C22892a(-2, -2);
        c22892a.f43627c = interfaceC22894b.mo18889a();
        c22892a.f43628d = interfaceC22894b.mo18890b();
        c22892a.f43625a = interfaceC22894b.mo18891c();
        c22892a.f43626b = interfaceC22894b.mo18892d();
        viewMo18893e.setLayoutParams(c22892a);
        return viewMo18893e;
    }
}
