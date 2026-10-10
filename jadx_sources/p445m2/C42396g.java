package p445m2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: m2.g */
/* JADX INFO: compiled from: ImageViewTargetFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C42396g {
    @NonNull
    /* JADX INFO: renamed from: a */
    public <Z> AbstractC42400k<ImageView, Z> m93085a(@NonNull ImageView imageView, @NonNull Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C42391b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C42394e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
