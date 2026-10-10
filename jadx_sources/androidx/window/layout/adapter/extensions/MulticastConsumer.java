package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MulticastConsumer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00010\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "multicastConsumerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "registeredListeners", "", "accept", "", "value", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "isEmpty", "", "removeListener", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMulticastConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MulticastConsumer.kt\nandroidx/window/layout/adapter/extensions/MulticastConsumer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1855#2,2:65\n1#3:67\n*S KotlinDebug\n*F\n+ 1 MulticastConsumer.kt\nandroidx/window/layout/adapter/extensions/MulticastConsumer\n*L\n43#1:65,2\n*E\n"})
public final class MulticastConsumer implements Consumer<WindowLayoutInfo>, androidx.window.extensions.core.util.function.Consumer<WindowLayoutInfo> {

    @NotNull
    private final Context context;

    @GuardedBy("lock")
    @Nullable
    private androidx.window.layout.WindowLayoutInfo lastKnownValue;

    @NotNull
    private final ReentrantLock multicastConsumerLock;

    @GuardedBy("lock")
    @NotNull
    private final Set<Consumer<androidx.window.layout.WindowLayoutInfo>> registeredListeners;

    public MulticastConsumer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.multicastConsumerLock = new ReentrantLock();
        this.registeredListeners = new LinkedHashSet();
    }

    @Override // androidx.core.util.Consumer
    public void accept(@NotNull WindowLayoutInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.context, value);
            Iterator<T> it = this.registeredListeners.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(this.lastKnownValue);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addListener(@NotNull Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            androidx.window.layout.WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
            if (windowLayoutInfo != null) {
                listener.accept(windowLayoutInfo);
            }
            this.registeredListeners.add(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.registeredListeners.isEmpty();
    }

    public final void removeListener(@NotNull Consumer<androidx.window.layout.WindowLayoutInfo> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        ReentrantLock reentrantLock = this.multicastConsumerLock;
        reentrantLock.lock();
        try {
            this.registeredListeners.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
