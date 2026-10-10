package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33590cg;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.InterfaceC44260a;
import p744x0.InterfaceC45975j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrongMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\b\b*\u0001\u0016\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0002\u001c\u0010B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m90084d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "Lx0/j;", "weakMemoryCache", "Ls0/a;", "referenceCounter", "", "maxSize", "Lb1/g;", "logger", "<init>", "(Lx0/j;Ls0/a;ILb1/g;)V", "", "d", "()V", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "b", "Lx0/j;", "c", "Ls0/a;", "coil/memory/RealStrongMemoryCache$b", "Lcoil/memory/RealStrongMemoryCache$b;", C33590cg.f69440j, "e", "()I", "size", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealStrongMemoryCache implements StrongMemoryCache {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45975j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44260a referenceCounter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C5045b cache;

    /* JADX INFO: renamed from: coil.memory.RealStrongMemoryCache$a */
    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f¨\u0006\u0011"}, m90084d2 = {"Lcoil/memory/RealStrongMemoryCache$a;", "", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "", "b", "Z", "c", "()Z", "isSampled", "", "I", "()I", "size", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5044a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isSampled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int size;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsSampled() {
            return this.isSampled;
        }
    }

    /* JADX INFO: renamed from: coil.memory.RealStrongMemoryCache$b */
    /* JADX INFO: compiled from: StrongMemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J1\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"coil/memory/RealStrongMemoryCache$b", "Landroidx/collection/LruCache;", "Lcoil/memory/MemoryCache$Key;", "Lcoil/memory/RealStrongMemoryCache$a;", "", "evicted", "key", "oldValue", "newValue", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZLcoil/memory/MemoryCache$Key;Lcoil/memory/RealStrongMemoryCache$a;Lcoil/memory/RealStrongMemoryCache$a;)V", "value", "", "b", "(Lcoil/memory/MemoryCache$Key;Lcoil/memory/RealStrongMemoryCache$a;)I", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class C5045b extends LruCache<MemoryCache$Key, C5044a> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5045b(int i11) {
            super(i11);
            this.f5802b = i11;
        }

        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean evicted, @NotNull MemoryCache$Key key, @NotNull C5044a oldValue, @Nullable C5044a newValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            if (RealStrongMemoryCache.this.referenceCounter.mo5466a(oldValue.getBitmap())) {
                return;
            }
            RealStrongMemoryCache.this.weakMemoryCache.mo5493c(key, oldValue.getBitmap(), oldValue.getIsSampled(), oldValue.getSize());
        }

        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int sizeOf(@NotNull MemoryCache$Key key, @NotNull C5044a value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getSize();
        }
    }

    @Override // coil.memory.StrongMemoryCache
    /* JADX INFO: renamed from: a */
    public synchronized void mo5481a(int level) {
        try {
            if (level >= 40) {
                m5482d();
            } else if (10 <= level && level < 20) {
                this.cache.trimToSize(m5483e() / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m5482d() {
        this.cache.trimToSize(-1);
    }

    /* JADX INFO: renamed from: e */
    public int m5483e() {
        return this.cache.size();
    }

    public RealStrongMemoryCache(@NotNull InterfaceC45975j weakMemoryCache, @NotNull InterfaceC44260a referenceCounter, int i11, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        this.weakMemoryCache = weakMemoryCache;
        this.referenceCounter = referenceCounter;
        this.cache = new C5045b(i11);
    }
}
