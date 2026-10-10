package lb;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: lb.e */
/* JADX INFO: compiled from: KeyboardChangeListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC42150e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public View f93588b;

    /* JADX INFO: renamed from: c */
    public int f93589c;

    /* JADX INFO: renamed from: d */
    public int f93590d;

    /* JADX INFO: renamed from: e */
    public a f93591e;

    /* JADX INFO: renamed from: lb.e$a */
    /* JADX INFO: compiled from: KeyboardChangeListener.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19065a(boolean z11, int i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m92491a() {
        this.f93588b.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* JADX INFO: renamed from: b */
    public void m92492b() {
        View view = this.f93588b;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m92494d(a aVar) {
        this.f93591e = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i11;
        boolean z11;
        int height = this.f93588b.getHeight();
        if (height == 0) {
            return;
        }
        int i12 = this.f93590d;
        if (i12 == 0) {
            this.f93590d = height;
            this.f93589c = height;
            return;
        }
        if (i12 != height) {
            this.f93590d = height;
            int i13 = this.f93589c;
            if (i13 == height) {
                z11 = false;
                i11 = 0;
            } else {
                i11 = i13 - height;
                z11 = true;
            }
            a aVar = this.f93591e;
            if (aVar != null) {
                aVar.mo19065a(z11, i11);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC42150e(Activity activity) {
        if (activity != null) {
            View viewM92493c = m92493c(activity);
            this.f93588b = viewM92493c;
            if (viewM92493c != null) {
                m92491a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final View m92493c(Activity activity) {
        return activity.findViewById(R.id.content);
    }
}
