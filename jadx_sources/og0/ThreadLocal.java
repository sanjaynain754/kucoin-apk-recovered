package og0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41731r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: og0.i0, reason: from toString */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m90084d2 = {"Log0/i0;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/r2;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "J", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Element;", ExifInterface.LONGITUDE_EAST, "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/ThreadLocal;", "d", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ThreadLocal<T> implements InterfaceC41731r2<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final T value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final java.lang.ThreadLocal<T> threadLocal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext.Key<?> key;

    @Override // kotlinx.coroutines.InterfaceC41731r2
    /* JADX INFO: renamed from: J */
    public T mo91199J(@NotNull CoroutineContext context) {
        T t11 = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t11;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.key;
    }

    @Override // kotlinx.coroutines.InterfaceC41731r2
    /* JADX INFO: renamed from: l */
    public void mo91200l(@NotNull CoroutineContext context, T oldState) {
        this.threadLocal.set(oldState);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    public ThreadLocal(T t11, @NotNull java.lang.ThreadLocal<T> threadLocal) {
        this.value = t11;
        this.threadLocal = threadLocal;
        this.key = new ThreadLocalKey(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    public <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC41731r2.a.m91201a(this, r11, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        if (Intrinsics.areEqual(getKey(), key)) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        if (Intrinsics.areEqual(getKey(), key)) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return this;
    }

    @Override // p852kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC41731r2.a.m91202b(this, coroutineContext);
    }
}
