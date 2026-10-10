package p612s0;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.BitmapPool;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: compiled from: EmptyBitmapPool.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Ls0/b;", "Lcoil/bitmap/BitmapPool;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V", "", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C44261b implements BitmapPool {
    @Override // coil.bitmap.BitmapPool
    /* JADX INFO: renamed from: b */
    public void mo5460b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        bitmap.recycle();
    }

    @Override // coil.bitmap.BitmapPool
    /* JADX INFO: renamed from: a */
    public void mo5459a(int level) {
    }
}
