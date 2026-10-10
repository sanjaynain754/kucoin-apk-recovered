package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.squareup.picasso.l */
/* JADX INFO: compiled from: ImageViewAction.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27828l extends AbstractC27817a<ImageView> {
    public C27828l(Picasso picasso, ImageView imageView, C27834r c27834r, int i11, int i12, int i13, Drawable drawable, String str, Object obj, InterfaceC27821e interfaceC27821e, boolean z11) {
        super(picasso, imageView, c27834r, i11, i12, i13, drawable, str, obj, z11);
    }

    @Override // com.squareup.picasso.AbstractC27817a
    /* JADX INFO: renamed from: b */
    public void mo68807b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f56708c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.f56706a;
        C27832p.m68885c(imageView, picasso.f56678e, bitmap, loadedFrom, this.f56709d, picasso.f56686m);
    }

    @Override // com.squareup.picasso.AbstractC27817a
    /* JADX INFO: renamed from: c */
    public void mo68808c(Exception exc) {
        ImageView imageView = (ImageView) this.f56708c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i11 = this.f56712g;
        if (i11 != 0) {
            imageView.setImageResource(i11);
            return;
        }
        Drawable drawable2 = this.f56713h;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
        }
    }

    @Override // com.squareup.picasso.AbstractC27817a
    /* JADX INFO: renamed from: a */
    public void mo68806a() {
        super.mo68806a();
    }
}
