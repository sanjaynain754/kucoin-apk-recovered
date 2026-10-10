package com.sumsub.sns.internal.core.presentation.util;

import android.graphics.Bitmap;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.sumsub.sns.core.widget.SNSRotationZoomableImageView;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.util.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28971e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41709m0 f58890a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f58891b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final AbstractC41697j0 f58892c = C41782z0.m91392b();

    /* JADX INFO: renamed from: d */
    public final C28970d f58893d = new C28970d(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 4);

    /* JADX INFO: renamed from: a */
    public final void m69712a(SNSRotationZoomableImageView sNSRotationZoomableImageView, File file, int i11, int i12) {
        if (sNSRotationZoomableImageView == null) {
            return;
        }
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) this.f58891b.get(sNSRotationZoomableImageView);
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        Bitmap bitmap = (Bitmap) this.f58893d.get(Integer.valueOf(i12));
        if (bitmap != null && !bitmap.isRecycled()) {
            sNSRotationZoomableImageView.setImageBitmap(bitmap);
        } else {
            this.f58891b.put(sNSRotationZoomableImageView, C41696j.m91104d(this.f58890a, this.f58892c, null, new C28969c(file, i11, i12, this, sNSRotationZoomableImageView, null), 2, null));
        }
    }

    public C28971e(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.f58890a = lifecycleCoroutineScope;
    }
}
