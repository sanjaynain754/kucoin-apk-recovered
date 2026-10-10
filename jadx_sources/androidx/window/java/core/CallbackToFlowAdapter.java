package androidx.window.java.core;

import androidx.core.util.Consumer;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41718o1;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CallbackToFlowAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Landroidx/window/java/core/CallbackToFlowAdapter;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "consumer", "Lkotlinx/coroutines/flow/e;", "flow", "", "connect", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;Lkotlinx/coroutines/flow/e;)V", "disconnect", "(Landroidx/core/util/Consumer;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Lkotlinx/coroutines/x1;", "consumerToJobMap", "Ljava/util/Map;", "window-java_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class CallbackToFlowAdapter {

    @NotNull
    private final ReentrantLock lock = new ReentrantLock();

    @NotNull
    private final Map<Consumer<?>, InterfaceC41775x1> consumerToJobMap = new LinkedHashMap();

    public final <T> void connect(@NotNull Executor executor, @NotNull Consumer<T> consumer, @NotNull InterfaceC41634e<? extends T> flow) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(flow, "flow");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToJobMap.get(consumer) == null) {
                this.consumerToJobMap.put(consumer, C41696j.m91104d(C41713n0.m91125a(C41718o1.m91178b(executor)), null, null, new CallbackToFlowAdapter$connect$1$1(flow, consumer, null), 3, null));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void disconnect(@NotNull Consumer<?> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            InterfaceC41775x1 interfaceC41775x1 = this.consumerToJobMap.get(consumer);
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            this.consumerToJobMap.remove(consumer);
        } finally {
            reentrantLock.unlock();
        }
    }
}
