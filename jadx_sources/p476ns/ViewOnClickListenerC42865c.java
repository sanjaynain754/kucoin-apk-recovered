package p476ns;

import android.view.View;

/* JADX INFO: renamed from: ns.c */
/* JADX INFO: compiled from: ViewClickWrapper.java */
/* JADX INFO: loaded from: classes30.dex */
public final class ViewOnClickListenerC42865c implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final RunnableC42867e f94926b;

    /* JADX INFO: renamed from: c */
    public final RunnableC42867e.a f94927c;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RunnableC42867e.a aVar = this.f94927c;
        if (aVar == null) {
            return;
        }
        aVar.mo43213a(this.f94926b, view);
    }

    public ViewOnClickListenerC42865c(RunnableC42867e runnableC42867e, RunnableC42867e.a aVar) {
        this.f94926b = runnableC42867e;
        this.f94927c = aVar;
    }
}
