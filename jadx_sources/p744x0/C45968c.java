package p744x0;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.memory.MemoryCache$Key;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x0.c */
/* JADX INFO: compiled from: WeakMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lx0/c;", "Lx0/j;", "<init>", "()V", "Lcoil/memory/MemoryCache$Key;", "key", "Landroid/graphics/Bitmap;", "bitmap", "", "isSampled", "", "size", "", "c", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;ZI)V", "b", "(Landroid/graphics/Bitmap;)Z", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C45968c implements InterfaceC45975j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45968c f103406a = new C45968c();

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: b */
    public boolean mo5492b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return false;
    }

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: c */
    public void mo5493c(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean isSampled, int size) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: a */
    public void mo5491a(int level) {
    }
}
