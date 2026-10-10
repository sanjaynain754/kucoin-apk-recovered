package p487o4;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o4.e */
/* JADX INFO: compiled from: ForwardingControllerListener.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42958e<INFO> implements InterfaceC42956c<INFO> {

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC42956c<? super INFO>> f95089b = new ArrayList(2);

    /* JADX INFO: renamed from: a */
    public synchronized void m94336a(InterfaceC42956c<? super INFO> interfaceC42956c) {
        this.f95089b.add(interfaceC42956c);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m94337b() {
        this.f95089b.clear();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m94338c(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    @Override // p487o4.InterfaceC42956c
    public synchronized void onFailure(String str, Throwable th2) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onFailure(str, th2);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onFailure", e11);
            }
        }
    }

    @Override // p487o4.InterfaceC42956c
    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onFinalImageSet", e11);
            }
        }
    }

    @Override // p487o4.InterfaceC42956c
    public synchronized void onRelease(String str) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onRelease(str);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onRelease", e11);
            }
        }
    }

    @Override // p487o4.InterfaceC42956c
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onSubmit(str, obj);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onSubmit", e11);
            }
        }
    }

    @Override // p487o4.InterfaceC42956c
    public void onIntermediateImageFailed(String str, Throwable th2) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onIntermediateImageFailed(str, th2);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onIntermediateImageFailed", e11);
            }
        }
    }

    @Override // p487o4.InterfaceC42956c
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f95089b.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                InterfaceC42956c<? super INFO> interfaceC42956c = this.f95089b.get(i11);
                if (interfaceC42956c != null) {
                    interfaceC42956c.onIntermediateImageSet(str, info);
                }
            } catch (Exception e11) {
                m94338c("InternalListener exception in onIntermediateImageSet", e11);
            }
        }
    }
}
