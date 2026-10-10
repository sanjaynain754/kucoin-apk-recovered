package p821z5;

import com.facebook.imagepipeline.producers.InterfaceC5739z0;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: renamed from: z5.d */
/* JADX INFO: compiled from: RequestListener.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC46705d extends InterfaceC5739z0 {
    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z11);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z11);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z11);
}
