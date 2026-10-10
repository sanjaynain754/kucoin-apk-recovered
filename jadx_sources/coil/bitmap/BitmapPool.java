package coil.bitmap;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p612s0.C44261b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: BitmapPool.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m90084d2 = {"Lcoil/bitmap/BitmapPool;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V", "", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface BitmapPool {

    /* JADX INFO: compiled from: BitmapPool.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lcoil/bitmap/BitmapPool$Companion;", "", "()V", "invoke", "Lcoil/bitmap/BitmapPool;", "maxSize", "", "create", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f5745a = new Companion();

        @JvmStatic
        @JvmName(name = "create")
        @NotNull
        public final BitmapPool create(int maxSize) {
            if (maxSize == 0) {
                return new C44261b();
            }
            return new RealBitmapPool(maxSize, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo5459a(int level);

    /* JADX INFO: renamed from: b */
    void mo5460b(@NotNull Bitmap bitmap);
}
