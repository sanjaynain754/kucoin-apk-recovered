package p487o4;

import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: o4.c */
/* JADX INFO: compiled from: ControllerListener.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC42956c<INFO> {
    void onFailure(String str, Throwable th2);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th2);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
