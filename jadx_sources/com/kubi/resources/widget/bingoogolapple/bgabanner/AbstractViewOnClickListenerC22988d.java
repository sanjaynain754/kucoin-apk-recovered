package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.view.View;

/* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.d */
/* JADX INFO: compiled from: BGAOnNoDoubleClickListener.java */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractViewOnClickListenerC22988d implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public int f44255b = 1000;

    /* JADX INFO: renamed from: c */
    public long f44256c = 0;

    /* JADX INFO: renamed from: a */
    public abstract void mo54948a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f44256c > this.f44255b) {
            this.f44256c = jCurrentTimeMillis;
            mo54948a(view);
        }
    }
}
