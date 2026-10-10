package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import com.tencent.bugly.proguard.C33954u6;
import java.io.Closeable;
import java.util.Arrays;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModel.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Landroidx/lifecycle/ViewModel;", "", "<init>", "()V", "Lkotlinx/coroutines/m0;", "viewModelScope", "(Lkotlinx/coroutines/m0;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/m0;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", "key", "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", ExifInterface.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", C33954u6.f72233d, "Landroidx/lifecycle/viewmodel/internal/ViewModelImpl;", "lifecycle-viewmodel_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public abstract class ViewModel {

    @Nullable
    private final ViewModelImpl impl;

    public ViewModel() {
        this.impl = new ViewModelImpl();
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(key, closeable);
        }
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.clear();
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            return (T) viewModelImpl.getCloseable(key);
        }
        return null;
    }

    public ViewModel(@NotNull InterfaceC41709m0 viewModelScope) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        this.impl = new ViewModelImpl(viewModelScope);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.impl;
        if (viewModelImpl != null) {
            viewModelImpl.addCloseable(closeable);
        }
    }

    public ViewModel(@NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public ViewModel(@NotNull InterfaceC41709m0 viewModelScope, @NotNull AutoCloseable... closeables) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new ViewModelImpl(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by `AutoCloseable` overload.")
    public /* synthetic */ ViewModel(Closeable... closeables) {
        Intrinsics.checkNotNullParameter(closeables, "closeables");
        this.impl = new ViewModelImpl((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public void onCleared() {
    }
}
