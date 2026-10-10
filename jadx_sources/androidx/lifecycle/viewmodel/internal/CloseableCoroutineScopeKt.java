package androidx.lifecycle.viewmodel.internal;

import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NotImplementedError;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CloseableCoroutineScope.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "createViewModelScope", "()Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Lkotlinx/coroutines/m0;", "asCloseable", "(Lkotlinx/coroutines/m0;)Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "", "VIEW_MODEL_SCOPE_KEY", "Ljava/lang/String;", "lifecycle-viewmodel_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CloseableCoroutineScopeKt {

    @NotNull
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final CloseableCoroutineScope asCloseable(@NotNull InterfaceC41709m0 interfaceC41709m0) {
        Intrinsics.checkNotNullParameter(interfaceC41709m0, "<this>");
        return new CloseableCoroutineScope(interfaceC41709m0);
    }

    @NotNull
    public static final CloseableCoroutineScope createViewModelScope() {
        CoroutineContext immediate;
        try {
            immediate = C41782z0.m91393c().getImmediate();
        } catch (IllegalStateException unused) {
            immediate = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            immediate = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(immediate.plus(C41727q2.m91192b(null, 1, null)));
    }
}
