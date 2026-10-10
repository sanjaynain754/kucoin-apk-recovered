package p297h1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.C5080h;

/* JADX INFO: renamed from: h1.f */
/* JADX INFO: compiled from: LottieCompositionCache.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C38076f {

    /* JADX INFO: renamed from: b */
    public static final C38076f f85717b = new C38076f();

    /* JADX INFO: renamed from: a */
    public final LruCache<String, C5080h> f85718a = new LruCache<>(20);

    /* JADX INFO: renamed from: b */
    public static C38076f m85974b() {
        return f85717b;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public C5080h m85975a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f85718a.get(str);
    }

    /* JADX INFO: renamed from: c */
    public void m85976c(@Nullable String str, C5080h c5080h) {
        if (str == null) {
            return;
        }
        this.f85718a.put(str, c5080h);
    }

    @VisibleForTesting
    public C38076f() {
    }
}
