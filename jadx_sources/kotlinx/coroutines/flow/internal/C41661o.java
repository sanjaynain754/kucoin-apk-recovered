package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.InterfaceC41775x1;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.o */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "", "b", "(Lkotlinx/coroutines/flow/internal/SafeCollector;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/x1;", "collectJob", "d", "(Lkotlinx/coroutines/x1;Lkotlinx/coroutines/x1;)Lkotlinx/coroutines/x1;", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41661o {
    @JvmName(name = "checkContext")
    /* JADX INFO: renamed from: b */
    public static final void m90986b(@NotNull final SafeCollector<?> safeCollector, @NotNull CoroutineContext coroutineContext) {
        if (((Number) coroutineContext.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.n
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C41661o.m90987c(safeCollector, ((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue() == safeCollector.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final InterfaceC41775x1 m90988d(@Nullable InterfaceC41775x1 interfaceC41775x1, @Nullable InterfaceC41775x1 interfaceC41775x2) {
        while (interfaceC41775x1 != null) {
            if (interfaceC41775x1 == interfaceC41775x2 || !(interfaceC41775x1 instanceof C43080w)) {
                return interfaceC41775x1;
            }
            interfaceC41775x1 = ((C43080w) interfaceC41775x1).m90425i0();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final int m90987c(SafeCollector safeCollector, int i11, CoroutineContext.Element element) {
        CoroutineContext.Key<?> key = element.getKey();
        CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
        if (key != InterfaceC41775x1.INSTANCE) {
            if (element != element2) {
                return Integer.MIN_VALUE;
            }
            return i11 + 1;
        }
        InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) element2;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        InterfaceC41775x1 interfaceC41775x1M90988d = m90988d((InterfaceC41775x1) element, interfaceC41775x1);
        if (interfaceC41775x1M90988d == interfaceC41775x1) {
            if (interfaceC41775x1 == null) {
                return i11;
            }
            return i11 + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC41775x1M90988d + ", expected child of " + interfaceC41775x1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
