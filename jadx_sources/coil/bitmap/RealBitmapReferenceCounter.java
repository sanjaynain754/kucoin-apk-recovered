package coil.bitmap;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SparseArrayCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.bitmap.RealBitmapReferenceCounter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612s0.InterfaceC44260a;
import p744x0.InterfaceC45975j;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BitmapReferenceCounter.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002)\rB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010!\u0012\u0004\b&\u0010\u0011\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, m90084d2 = {"Lcoil/bitmap/RealBitmapReferenceCounter;", "Ls0/a;", "Lx0/j;", "weakMemoryCache", "Lcoil/bitmap/BitmapPool;", "bitmapPool", "Lb1/g;", "logger", "<init>", "(Lx0/j;Lcoil/bitmap/BitmapPool;Lb1/g;)V", "Landroid/graphics/Bitmap;", "bitmap", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Bitmap;)Z", "", "c", "()V", "d", "", "key", "Lcoil/bitmap/RealBitmapReferenceCounter$a;", "f", "(ILandroid/graphics/Bitmap;)Lcoil/bitmap/RealBitmapReferenceCounter$a;", "Lx0/j;", "b", "Lcoil/bitmap/BitmapPool;", "Landroidx/collection/SparseArrayCompat;", "Landroidx/collection/SparseArrayCompat;", "getValues$coil_base_release", "()Landroidx/collection/SparseArrayCompat;", "getValues$coil_base_release$annotations", "values", "I", "getOperationsSinceCleanUp$coil_base_release", "()I", "setOperationsSinceCleanUp$coil_base_release", "(I)V", "getOperationsSinceCleanUp$coil_base_release$annotations", "operationsSinceCleanUp", "e", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealBitmapReferenceCounter implements InterfaceC44260a {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Handler f5758f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45975j weakMemoryCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BitmapPool bitmapPool;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SparseArrayCompat<C5041a> values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int operationsSinceCleanUp;

    /* JADX INFO: renamed from: coil.bitmap.RealBitmapReferenceCounter$a */
    /* JADX INFO: compiled from: BitmapReferenceCounter.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Lcoil/bitmap/RealBitmapReferenceCounter$a;", "", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "bitmap", "", "b", "I", "()I", "d", "(I)V", "count", "", "c", "Z", "()Z", "setValid", "(Z)V", "isValid", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    @VisibleForTesting
    public static final class C5041a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<Bitmap> bitmap;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int count;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean isValid;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WeakReference<Bitmap> m5470a() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        /* JADX INFO: renamed from: d */
        public final void m5473d(int i11) {
            this.count = i11;
        }
    }

    @Override // p612s0.InterfaceC44260a
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo5466a(@NotNull final Bitmap bitmap) {
        try {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C5041a c5041aM5469f = m5469f(iIdentityHashCode, bitmap);
            boolean z11 = false;
            if (c5041aM5469f == null) {
                return false;
            }
            c5041aM5469f.m5473d(c5041aM5469f.getCount() - 1);
            if (c5041aM5469f.getCount() <= 0 && c5041aM5469f.getIsValid()) {
                z11 = true;
            }
            if (z11) {
                this.values.remove(iIdentityHashCode);
                this.weakMemoryCache.mo5492b(bitmap);
                f5758f.post(new Runnable() { // from class: s0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        RealBitmapReferenceCounter.m5465e(this.f97810b, bitmap);
                    }
                });
            }
            m5468d();
            return z11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final void m5467c() {
        ArrayList arrayList = new ArrayList();
        int size = this.values.size();
        int i11 = 0;
        if (size > 0) {
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (this.values.valueAt(i12).m5470a().get() == null) {
                    arrayList.add(Integer.valueOf(i12));
                }
                if (i13 >= size) {
                    break;
                } else {
                    i12 = i13;
                }
            }
        }
        SparseArrayCompat<C5041a> sparseArrayCompat = this.values;
        int size2 = arrayList.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i14 = i11 + 1;
            sparseArrayCompat.removeAt(((Number) arrayList.get(i11)).intValue());
            if (i14 > size2) {
                return;
            } else {
                i11 = i14;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5468d() {
        int i11 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i11 + 1;
        if (i11 >= 50) {
            m5467c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final C5041a m5469f(int key, Bitmap bitmap) {
        C5041a c5041a = this.values.get(key);
        if (c5041a != null && c5041a.m5470a().get() == bitmap) {
            return c5041a;
        }
        return null;
    }

    public RealBitmapReferenceCounter(@NotNull InterfaceC45975j weakMemoryCache, @NotNull BitmapPool bitmapPool, @Nullable InterfaceC4450g interfaceC4450g) {
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        this.weakMemoryCache = weakMemoryCache;
        this.bitmapPool = bitmapPool;
        this.values = new SparseArrayCompat<>();
    }

    /* JADX INFO: renamed from: e */
    public static final void m5465e(RealBitmapReferenceCounter this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        this$0.bitmapPool.mo5460b(bitmap);
    }
}
