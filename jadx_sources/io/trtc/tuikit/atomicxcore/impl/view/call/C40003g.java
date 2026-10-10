package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.widget.ImageView;
import io.trtc.tuikit.atomicxcore.api.device.NetworkQuality;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C40003g implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40040x f88971a;

    public C40003g(C40040x c40040x) {
        this.f88971a = c40040x;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        NetworkQuality networkQuality = (NetworkQuality) ((Map) obj).get(this.f88971a.f89079l.getId());
        if (networkQuality != null) {
            C40040x c40040x = this.f88971a;
            String str = (String) c40040x.f89083p.get(networkQuality);
            ImageView imageView = null;
            if (str == null || str.length() == 0) {
                ImageView imageView2 = c40040x.f89076i;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageNetworkBad");
                } else {
                    imageView = imageView2;
                }
                imageView.setVisibility(8);
            } else {
                C39983B c39983b = c40040x.f89071d;
                ImageView imageView3 = c40040x.f89076i;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageNetworkBad");
                    imageView3 = null;
                }
                c39983b.m88383a(imageView3, str);
                ImageView imageView4 = c40040x.f89076i;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imageNetworkBad");
                } else {
                    imageView = imageView4;
                }
                imageView.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }
}
