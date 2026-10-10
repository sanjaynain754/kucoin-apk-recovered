package jumio.core;

import com.jumio.core.model.InvokeOnUiThread;
import com.jumio.core.model.Subscriber;
import com.jumio.core.scope.ScopeProviderInterface;
import com.jumio.core.util.ReflectionUtil;
import java.lang.reflect.Method;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.a3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40634a3 {

    /* JADX INFO: renamed from: a */
    public final ScopeProviderInterface f90215a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f90216b;

    public AbstractC40634a3(ScopeProviderInterface scopeProvider) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f90215a = scopeProvider;
        this.f90216b = new CopyOnWriteArrayList();
    }

    public final void publishError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (Subscriber subscriber : this.f90216b) {
            try {
                Method method = ReflectionUtil.INSTANCE.getMethod(subscriber, "onError", error.getClass());
                InvokeOnUiThread invokeOnUiThread = method != null ? (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class) : null;
                if (invokeOnUiThread == null || !invokeOnUiThread.value()) {
                    subscriber.onError(error);
                } else {
                    this.f90215a.postOnMain(new C40623Y2(subscriber, error, null));
                }
            } catch (NoSuchMethodException unused) {
                subscriber.onError(error);
            }
        }
    }

    public final void publishResult(@Nullable Object obj) {
        Class<?> cls;
        for (Subscriber subscriber : this.f90216b) {
            if (obj != null) {
                try {
                    cls = obj.getClass();
                } catch (NoSuchMethodException unused) {
                    subscriber.onResult(obj);
                }
            } else {
                cls = null;
            }
            Method method = ReflectionUtil.INSTANCE.getMethod(subscriber, "onResult", cls);
            InvokeOnUiThread invokeOnUiThread = method != null ? (InvokeOnUiThread) method.getAnnotation(InvokeOnUiThread.class) : null;
            if (invokeOnUiThread == null || !invokeOnUiThread.value()) {
                subscriber.onResult(obj);
            } else {
                this.f90215a.postOnMain(new C40628Z2(subscriber, obj, null));
            }
        }
    }

    public final void removeAllSubscriber() {
        this.f90216b.clear();
    }

    public final boolean add(@NotNull Subscriber<Object> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (!this.f90216b.contains(subscriber) && this.f90216b.add(subscriber)) {
            return true;
        }
        return false;
    }

    public final boolean remove(@NotNull Subscriber<Object> subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return this.f90216b.remove(subscriber);
    }
}
