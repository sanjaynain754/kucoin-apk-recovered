package p048c2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;
import p680v1.InterfaceC45359j;
import p710w1.C45687e;
import p710w1.InterfaceC45686d;

/* JADX INFO: renamed from: c2.r */
/* JADX INFO: compiled from: DrawableToBitmapConverter.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C4801r {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC45686d f4814a = new a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Bitmap m4892b(InterfaceC45686d interfaceC45686d, Drawable drawable, int i11, int i12) {
        if (i11 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i12 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i11 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i12 = drawable.getIntrinsicHeight();
        }
        Lock lockM4863i = C4783b0.m4863i();
        lockM4863i.lock();
        Bitmap bitmapMo100813d = interfaceC45686d.mo100813d(i11, i12, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapMo100813d);
            drawable.setBounds(0, 0, i11, i12);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapMo100813d;
        } finally {
            lockM4863i.unlock();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static InterfaceC45359j<Bitmap> m4891a(InterfaceC45686d interfaceC45686d, Drawable drawable, int i11, int i12) {
        Bitmap bitmapM4892b;
        Drawable current = drawable.getCurrent();
        boolean z11 = false;
        if (current instanceof BitmapDrawable) {
            bitmapM4892b = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmapM4892b = m4892b(interfaceC45686d, current, i11, i12);
            z11 = true;
        } else {
            bitmapM4892b = null;
        }
        if (!z11) {
            interfaceC45686d = f4814a;
        }
        return C4788e.m4879c(bitmapM4892b, interfaceC45686d);
    }

    /* JADX INFO: renamed from: c2.r$a */
    /* JADX INFO: compiled from: DrawableToBitmapConverter.java */
    public class a extends C45687e {
        @Override // p710w1.C45687e, p710w1.InterfaceC45686d
        /* JADX INFO: renamed from: b */
        public void mo4893b(Bitmap bitmap) {
        }
    }
}
