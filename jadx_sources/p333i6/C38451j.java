package p333i6;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: i6.j */
/* JADX INFO: compiled from: LockOnGetVariable.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Li6/j;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/concurrent/Callable;", "callable", "<init>", "(Ljava/util/concurrent/Callable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Object;", "storedValue", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "initLatch", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38451j<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public T storedValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public CountDownLatch initLatch;

    public C38451j(@NotNull final Callable<T> callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.initLatch = new CountDownLatch(1);
        C5501a.m7806t().execute(new FutureTask(new Callable() { // from class: i6.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C38451j.m86716b(this.f86287b, callable);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static final Void m86716b(C38451j this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.storedValue = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.initLatch;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
