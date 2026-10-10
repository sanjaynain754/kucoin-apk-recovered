package p445m2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: m2.e */
/* JADX INFO: compiled from: DrawableImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public class C42394e extends AbstractC42395f<Drawable> {
    @Override // p445m2.AbstractC42395f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo93063o(@Nullable Drawable drawable) {
        ((ImageView) this.f94006c).setImageDrawable(drawable);
    }

    public C42394e(ImageView imageView) {
        super(imageView);
    }
}
