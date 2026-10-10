package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.h */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"kotlinx/coroutines/i", "kotlinx/coroutines/j"}, m90084d2 = {}, m90085k = 4, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41686h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41729r0<T> m91043a(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) {
        return C41696j.m91101a(interfaceC41709m0, coroutineContext, coroutineStart, function2);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC41775x1 m91045c(@NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C41696j.m91103c(interfaceC41709m0, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC41775x1 m91046d(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i11, Object obj) {
        return C41696j.m91104d(interfaceC41709m0, coroutineContext, coroutineStart, function2, i11, obj);
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m91047e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) C41690i.m91066a(coroutineContext, function2);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final <T> Object m91049g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super InterfaceC41709m0, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return C41696j.m91105e(coroutineContext, function2, continuation);
    }
}
