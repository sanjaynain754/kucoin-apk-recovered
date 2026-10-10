package p744x0;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.memory.MemoryCache$Key;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: x0.j */
/* JADX INFO: compiled from: WeakMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lx0/j;", "", "Lcoil/memory/MemoryCache$Key;", "key", "Landroid/graphics/Bitmap;", "bitmap", "", "isSampled", "", "size", "", "c", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;ZI)V", "b", "(Landroid/graphics/Bitmap;)Z", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public interface InterfaceC45975j {
    /* JADX INFO: renamed from: a */
    void mo5491a(int level);

    /* JADX INFO: renamed from: b */
    boolean mo5492b(@NotNull Bitmap bitmap);

    /* JADX INFO: renamed from: c */
    void mo5493c(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean isSampled, int size);
}
