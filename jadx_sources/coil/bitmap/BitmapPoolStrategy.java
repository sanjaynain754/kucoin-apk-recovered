package coil.bitmap;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BitmapPoolStrategy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m90084d2 = {"Lcoil/bitmap/BitmapPoolStrategy;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V", "removeLast", "()Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface BitmapPoolStrategy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f5747a;

    /* JADX INFO: compiled from: BitmapPoolStrategy.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0005"}, m90084d2 = {"Lcoil/bitmap/BitmapPoolStrategy$Companion;", "", "()V", "invoke", "Lcoil/bitmap/BitmapPoolStrategy;", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5747a = new Companion();

        @NotNull
        public final BitmapPoolStrategy invoke() {
            return new SizeStrategy();
        }
    }

    /* JADX INFO: renamed from: b */
    void mo5461b(@NotNull Bitmap bitmap);

    @Nullable
    Bitmap removeLast();
}
