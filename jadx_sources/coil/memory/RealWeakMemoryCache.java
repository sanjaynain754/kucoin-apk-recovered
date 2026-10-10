package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import coil.memory.RealWeakMemoryCache;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33590cg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.InterfaceC4450g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p744x0.InterfaceC45975j;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WeakMemoryCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002)\u0014B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0017R\\\u0010\"\u001a>\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c0\u0019j\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c`\u001d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R(\u0010(\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010#\u0012\u0004\b'\u0010\u0017\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\u0015¨\u0006*"}, m90084d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lx0/j;", "Lb1/g;", "logger", "<init>", "(Lb1/g;)V", "Lcoil/memory/MemoryCache$Key;", "key", "Landroid/graphics/Bitmap;", "bitmap", "", "isSampled", "", "size", "", "c", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;ZI)V", "b", "(Landroid/graphics/Bitmap;)Z", FirebaseAnalytics.Param.LEVEL, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "e", "()V", "g", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$a;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Ljava/util/HashMap;", "getCache$coil_base_release$annotations", C33590cg.f69440j, "I", "getOperationsSinceCleanUp$coil_base_release", "()I", "setOperationsSinceCleanUp$coil_base_release", "getOperationsSinceCleanUp$coil_base_release$annotations", "operationsSinceCleanUp", "Companion", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class RealWeakMemoryCache implements InterfaceC45975j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<MemoryCache$Key, ArrayList<C5046a>> cache = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int operationsSinceCleanUp;

    /* JADX INFO: renamed from: coil.memory.RealWeakMemoryCache$a */
    /* JADX INFO: compiled from: WeakMemoryCache.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016"}, m90084d2 = {"Lcoil/memory/RealWeakMemoryCache$a;", "", "", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "bitmap", "", "isSampled", "size", "<init>", "(ILjava/lang/ref/WeakReference;ZI)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "b", "()I", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "c", "Z", "()Z", "d", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    @VisibleForTesting
    public static final class C5046a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int identityHashCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<Bitmap> bitmap;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean isSampled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int size;

        public C5046a(int i11, @NotNull WeakReference<Bitmap> bitmap, boolean z11, int i12) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.identityHashCode = i11;
            this.bitmap = bitmap;
            this.isSampled = z11;
            this.size = i12;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WeakReference<Bitmap> m5497a() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getSize() {
            return this.size;
        }
    }

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: a */
    public synchronized void mo5491a(int level) {
        if (level >= 10 && level != 20) {
            m5494e();
        }
    }

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo5492b(@NotNull Bitmap bitmap) {
        boolean z11;
        try {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            int iIdentityHashCode = System.identityHashCode(bitmap);
            Collection<ArrayList<C5046a>> collectionValues = m5496h().values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "cache.values");
            Iterator<T> it = collectionValues.iterator();
            loop0: while (true) {
                z11 = false;
                int i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayList = (ArrayList) it.next();
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i12 = i11 + 1;
                        if (((C5046a) arrayList.get(i11)).getIdentityHashCode() == iIdentityHashCode) {
                            arrayList.remove(i11);
                            z11 = true;
                            break loop0;
                        }
                        if (i12 > size) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            }
            m5495g();
        } catch (Throwable th2) {
            throw th2;
        }
        return z11;
    }

    @Override // p744x0.InterfaceC45975j
    /* JADX INFO: renamed from: c */
    public synchronized void mo5493c(@NotNull MemoryCache$Key key, @NotNull Bitmap bitmap, boolean isSampled, int size) {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            HashMap<MemoryCache$Key, ArrayList<C5046a>> map = this.cache;
            ArrayList<C5046a> arrayList = map.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(key, arrayList);
            }
            ArrayList<C5046a> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C5046a c5046a = new C5046a(iIdentityHashCode, new WeakReference(bitmap), isSampled, size);
            int size2 = arrayList2.size() - 1;
            if (size2 < 0) {
                arrayList2.add(c5046a);
                break;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                C5046a c5046a2 = arrayList2.get(i11);
                Intrinsics.checkNotNullExpressionValue(c5046a2, "values[index]");
                C5046a c5046a3 = c5046a2;
                if (size >= c5046a3.getSize()) {
                    if (c5046a3.getIdentityHashCode() != iIdentityHashCode || c5046a3.m5497a().get() != bitmap) {
                        arrayList2.add(i11, c5046a);
                        break;
                    } else {
                        arrayList2.set(i11, c5046a);
                        break;
                    }
                }
                if (i12 > size2) {
                    arrayList2.add(c5046a);
                    break;
                }
                i11 = i12;
            }
            m5495g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final void m5494e() {
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<C5046a>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<C5046a> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "iterator.next()");
            ArrayList<C5046a> arrayList = next;
            if (arrayList.size() <= 1) {
                C5046a c5046a = (C5046a) CollectionsKt.firstOrNull((List) arrayList);
                if ((c5046a == null ? null : c5046a.m5497a().get()) == null) {
                    it.remove();
                }
            } else {
                arrayList.removeIf(new Predicate() { // from class: x0.i
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return RealWeakMemoryCache.m5490f((RealWeakMemoryCache.C5046a) obj);
                    }
                });
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m5490f(C5046a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.m5497a().get() == null;
    }

    /* JADX INFO: renamed from: g */
    public final void m5495g() {
        int i11 = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i11 + 1;
        if (i11 >= 10) {
            m5494e();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final HashMap<MemoryCache$Key, ArrayList<C5046a>> m5496h() {
        return this.cache;
    }

    public RealWeakMemoryCache(@Nullable InterfaceC4450g interfaceC4450g) {
    }
}
