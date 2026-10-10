package p789y8;

import android.os.Looper;
import androidx.annotation.RestrictTo;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;

/* JADX INFO: renamed from: y8.b */
/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C46400b {
    /* JADX INFO: renamed from: b */
    public static void m102387b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102386a(Observer<?> observer) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            observer.onSubscribe(Disposables.empty());
            observer.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return false;
        }
        return true;
    }
}
