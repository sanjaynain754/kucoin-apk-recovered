package jumio.core;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.jumio.core.C9301R;
import com.jumio.core.overlay.BaseLivenessOverlayKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.i0 */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC40673i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final AppCompatImageView f90288a;

    /* JADX INFO: renamed from: b */
    public final int f90289b;

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawableAccess$layerDrawable = BaseLivenessOverlayKt.access$layerDrawable(this.f90288a, C9301R.id.liveness_overlay_main);
        if (drawableAccess$layerDrawable != null) {
            BaseLivenessOverlayKt.setColor(drawableAccess$layerDrawable, this.f90289b);
        }
    }

    public RunnableC40673i0(AppCompatImageView view, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f90288a = view;
        this.f90289b = i11;
    }
}
