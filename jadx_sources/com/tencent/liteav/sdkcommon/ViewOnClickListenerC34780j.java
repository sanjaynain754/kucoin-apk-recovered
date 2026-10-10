package com.tencent.liteav.sdkcommon;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

/* JADX INFO: renamed from: com.tencent.liteav.sdkcommon.j */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class ViewOnClickListenerC34780j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private final C34777g f73663a;

    /* JADX INFO: renamed from: b */
    private final Button f73664b;

    /* JADX INFO: renamed from: a */
    public static View.OnClickListener m76180a(C34777g c34777g, Button button) {
        return new ViewOnClickListenerC34780j(c34777g, button);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C34777g c34777g = this.f73663a;
        boolean z11 = c34777g.f73652m;
        if (z11) {
            WindowManager.LayoutParams layoutParams = c34777g.f73641b;
            int i11 = c34777g.f73653n;
            layoutParams.height = i11;
            int i12 = layoutParams.y;
            int i13 = i11 + i12;
            int i14 = c34777g.f73640a.heightPixels;
            if (i13 > i14) {
                layoutParams.height = i14 - i12;
            }
        } else {
            c34777g.f73641b.height = c34777g.f73653n / 2;
        }
        c34777g.f73652m = !z11;
        c34777g.f73645f.updateViewLayout(c34777g.f73646g, c34777g.f73641b);
        ViewGroup.LayoutParams layoutParams2 = c34777g.f73650k.getLayoutParams();
        layoutParams2.height = c34777g.m76176b();
        c34777g.f73650k.setLayoutParams(layoutParams2);
        c34777g.f73643d.post(RunnableC34782l.m76182a(c34777g));
    }

    private ViewOnClickListenerC34780j(C34777g c34777g, Button button) {
        this.f73663a = c34777g;
        this.f73664b = button;
    }
}
