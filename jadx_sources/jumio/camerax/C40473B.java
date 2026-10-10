package jumio.camerax;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.camera.view.PreviewView;
import java.lang.ref.WeakReference;
import jumio.camerax.C40473B;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C40473B implements InterfaceC40491q {

    /* JADX INFO: renamed from: a */
    public WeakReference f89851a;

    /* JADX INFO: renamed from: b */
    public WeakReference f89852b;

    /* JADX INFO: renamed from: c */
    public Bitmap f89853c;

    /* JADX INFO: renamed from: a */
    public final void m89123a(Context context, Function1 addView) {
        PreviewView previewView;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addView, "addView");
        WeakReference weakReference = this.f89851a;
        if (weakReference == null || (previewView = (PreviewView) weakReference.get()) == null) {
            previewView = new PreviewView(context);
            previewView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
            previewView.setImportantForAccessibility(2);
            this.f89851a = new WeakReference(previewView);
        }
        WeakReference weakReference2 = this.f89852b;
        if (weakReference2 == null || (imageView = (ImageView) weakReference2.get()) == null) {
            imageView = new ImageView(context);
            imageView.setVisibility(8);
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f89852b = new WeakReference(imageView);
        }
        addView.invoke(previewView);
        addView.invoke(imageView);
    }

    /* JADX INFO: renamed from: b */
    public final void m89124b() {
        ImageView imageView;
        WeakReference weakReference = this.f89852b;
        if (weakReference == null || (imageView = (ImageView) weakReference.get()) == null) {
            return;
        }
        imageView.postDelayed(new Runnable() { // from class: kg0.b
            @Override // java.lang.Runnable
            public final void run() {
                C40473B.m89121a(this.f91258b);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: a */
    public final void m89122a() {
        ImageView imageView;
        PreviewView previewView;
        Bitmap bitmap = this.f89853c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        WeakReference weakReference = this.f89851a;
        this.f89853c = (weakReference == null || (previewView = (PreviewView) weakReference.get()) == null) ? null : previewView.getBitmap();
        WeakReference weakReference2 = this.f89852b;
        if (weakReference2 == null || (imageView = (ImageView) weakReference2.get()) == null) {
            return;
        }
        Context context = imageView.getContext();
        imageView.setBackground(new BitmapDrawable(context != null ? context.getResources() : null, this.f89853c));
        imageView.setVisibility(0);
        imageView.invalidate();
    }

    /* JADX INFO: renamed from: a */
    public static final void m89121a(C40473B c40473b) {
        ImageView imageView;
        WeakReference weakReference = c40473b.f89852b;
        if (weakReference != null && (imageView = (ImageView) weakReference.get()) != null) {
            imageView.setVisibility(8);
            imageView.setBackground(null);
        }
        Bitmap bitmap = c40473b.f89853c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        c40473b.f89853c = null;
    }
}
