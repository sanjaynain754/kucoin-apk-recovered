package androidx.lifecycle.viewmodel.internal;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ViewModelImpl.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0014\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0014\u0010\u0010J%\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0016*\u00060\bj\u0002`\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\bj\u0002`\t0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\f\u0012\b\u0012\u00060\bj\u0002`\t0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m90084d2 = {"Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "", "<init>", "()V", "Lkotlinx/coroutines/m0;", "viewModelScope", "(Lkotlinx/coroutines/m0;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/m0;[Ljava/lang/AutoCloseable;)V", "closeable", "", "closeWithRuntimeException", "(Ljava/lang/AutoCloseable;)V", "clear", "", "key", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", ExifInterface.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "lock", "Landroidx/lifecycle/viewmodel/internal/SynchronizedObject;", "", "keyToCloseables", "Ljava/util/Map;", "", "Ljava/util/Set;", "", "isCleared", "Z", "lifecycle-viewmodel_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,132:1\n38#2:133\n38#2:135\n38#2:137\n38#2:139\n23#3:134\n23#3:136\n23#3:138\n23#3:140\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n80#1:133\n103#1:135\n117#1:137\n122#1:139\n80#1:134\n103#1:136\n117#1:138\n122#1:140\n*E\n"})
public final class ViewModelImpl {

    @NotNull
    private final Set<AutoCloseable> closeables;
    private volatile boolean isCleared;

    @NotNull
    private final Map<String, AutoCloseable> keyToCloseables;

    @NotNull
    private final SynchronizedObject lock;

    public ViewModelImpl() {
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        closeWithRuntimeException(autoCloseable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    @MainThread
    public final void clear() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        T t11;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            t11 = (T) this.keyToCloseables.get(key);
        }
        return t11;
    }

    public ViewModelImpl(@NotNull InterfaceC41709m0 viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
    }

    public final void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (this.isCleared) {
            closeWithRuntimeException(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            Unit unit = Unit.INSTANCE;
        }
    }

    public ViewModelImpl(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        CollectionsKt.addAll(linkedHashSet, closeables);
    }

    public ViewModelImpl(@NotNull InterfaceC41709m0 viewModelScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.lock = new SynchronizedObject();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        addCloseable(CloseableCoroutineScopeKt.VIEW_MODEL_SCOPE_KEY, CloseableCoroutineScopeKt.asCloseable(viewModelScope));
        CollectionsKt.addAll(linkedHashSet, closeables);
    }
}
