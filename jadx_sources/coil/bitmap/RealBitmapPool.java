package coil.bitmap;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Set;
import kotlin.C4444a;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealBitmapPool.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u001cj\b\u0012\u0004\u0012\u00020\r`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006("}, m90084d2 = {"Lcoil/bitmap/RealBitmapPool;", "Lcoil/bitmap/BitmapPool;", "", "maxSize", "", "Landroid/graphics/Bitmap$Config;", "allowedConfigs", "Lcoil/bitmap/BitmapPoolStrategy;", "strategy", "Lb1/g;", "logger", "<init>", "(ILjava/util/Set;Lcoil/bitmap/BitmapPoolStrategy;Lb1/g;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "b", "(Landroid/graphics/Bitmap;)V", "c", "()V", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "size", "d", "I", "Ljava/util/Set;", "Lcoil/bitmap/BitmapPoolStrategy;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "bitmaps", "e", "currentSize", "f", "puts", "g", "evictions", CmcdData.Factory.STREAMING_FORMAT_HLS, "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealBitmapPool implements BitmapPool {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Set<Bitmap.Config> f5749i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<Bitmap.Config> allowedConfigs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final BitmapPoolStrategy strategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final HashSet<Bitmap> bitmaps;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int currentSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int puts;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int evictions;

    /* JADX WARN: Multi-variable type inference failed */
    public RealBitmapPool(int i11, @NotNull Set<? extends Bitmap.Config> allowedConfigs, @NotNull BitmapPoolStrategy strategy, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(allowedConfigs, "allowedConfigs");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.maxSize = i11;
        this.allowedConfigs = allowedConfigs;
        this.strategy = strategy;
        this.bitmaps = new HashSet<>();
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("maxSize must be >= 0.");
        }
    }

    @Override // coil.bitmap.BitmapPool
    /* JADX INFO: renamed from: a */
    public synchronized void mo5459a(int level) {
        try {
            if (level >= 40) {
                m5462c();
            } else if (10 <= level && level < 20) {
                m5463d(this.currentSize / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.bitmap.BitmapPool
    /* JADX INFO: renamed from: b */
    public synchronized void mo5460b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            return;
        }
        int iM4231a = C4444a.m4231a(bitmap);
        if (bitmap.isMutable() && iM4231a <= this.maxSize && this.allowedConfigs.contains(bitmap.getConfig())) {
            if (this.bitmaps.contains(bitmap)) {
                return;
            }
            this.strategy.mo5461b(bitmap);
            this.bitmaps.add(bitmap);
            this.currentSize += iM4231a;
            this.puts++;
            m5463d(this.maxSize);
            return;
        }
        bitmap.recycle();
    }

    /* JADX INFO: renamed from: c */
    public final void m5462c() {
        m5463d(-1);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5463d(int size) {
        while (this.currentSize > size) {
            Bitmap bitmapRemoveLast = this.strategy.removeLast();
            if (bitmapRemoveLast == null) {
                this.currentSize = 0;
                return;
            }
            this.bitmaps.remove(bitmapRemoveLast);
            this.currentSize -= C4444a.m4231a(bitmapRemoveLast);
            this.evictions++;
            bitmapRemoveLast.recycle();
        }
    }

    static {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        setCreateSetBuilder.add(Bitmap.Config.ALPHA_8);
        setCreateSetBuilder.add(Bitmap.Config.RGB_565);
        setCreateSetBuilder.add(Bitmap.Config.ARGB_4444);
        setCreateSetBuilder.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            setCreateSetBuilder.add(Bitmap.Config.RGBA_F16);
        }
        f5749i = SetsKt.build(setCreateSetBuilder);
    }

    public /* synthetic */ RealBitmapPool(int i11, Set set, BitmapPoolStrategy bitmapPoolStrategy, InterfaceC4450g interfaceC4450g, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? f5749i : set, (i12 & 4) != 0 ? BitmapPoolStrategy.INSTANCE.invoke() : bitmapPoolStrategy, (i12 & 8) != 0 ? null : interfaceC4450g);
    }
}
