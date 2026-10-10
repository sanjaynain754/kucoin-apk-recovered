package lb;

import android.graphics.Bitmap;
import com.tencent.bugly.proguard.C33590cg;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lb.d */
/* JADX INFO: compiled from: ImageCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/utils/ImageCache;", "", "<init>", "()V", C33590cg.f69440j, "", "", "Landroid/graphics/Bitmap;", "save", "", "key", "bitmap", "get", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42149d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42149d f93586a = new C42149d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, Bitmap> f93587b = new LinkedHashMap();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bitmap m92489a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f93587b.remove(key);
    }

    /* JADX INFO: renamed from: b */
    public final void m92490b(@NotNull String key, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        f93587b.put(key, bitmap);
    }
}
