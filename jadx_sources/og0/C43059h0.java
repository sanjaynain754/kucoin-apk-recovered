package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41731r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: og0.h0 */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, m90084d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "f", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Log0/a0;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Log0/a0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "Lkotlin/jvm/functions/Function2;", "countAll", "Lkotlinx/coroutines/r2;", "c", "findOne", "Log0/n0;", "d", "updateState", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43059h0 {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final C43045a0 f95245a = new C43045a0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> f95246b = new Function2() { // from class: og0.e0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C43059h0.m94585d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function2<InterfaceC41731r2<?>, CoroutineContext.Element, InterfaceC41731r2<?>> f95247c = new Function2() { // from class: og0.f0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C43059h0.m94586e((InterfaceC41731r2) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function2<C43071n0, CoroutineContext.Element, C43071n0> f95248d = new Function2() { // from class: og0.g0
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C43059h0.m94589h((C43071n0) obj, (CoroutineContext.Element) obj2);
        }
    };

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Object m94588g(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f95246b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m94585d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof InterfaceC41731r2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC41731r2<?> m94586e(InterfaceC41731r2<?> interfaceC41731r2, CoroutineContext.Element element) {
        if (interfaceC41731r2 != null) {
            return interfaceC41731r2;
        }
        if (element instanceof InterfaceC41731r2) {
            return (InterfaceC41731r2) element;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m94587f(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f95245a) {
            return;
        }
        if (obj instanceof C43071n0) {
            ((C43071n0) obj).m94624b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f95247c);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC41731r2) objFold).mo91200l(coroutineContext, obj);
    }

    /* JADX INFO: renamed from: h */
    public static final C43071n0 m94589h(C43071n0 c43071n0, CoroutineContext.Element element) {
        if (element instanceof InterfaceC41731r2) {
            InterfaceC41731r2<?> interfaceC41731r2 = (InterfaceC41731r2) element;
            c43071n0.m94623a(interfaceC41731r2, interfaceC41731r2.mo91199J(c43071n0.context));
        }
        return c43071n0;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final Object m94590i(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m94588g(coroutineContext);
        }
        if (obj == 0) {
            return f95245a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new C43071n0(coroutineContext, ((Number) obj).intValue()), f95248d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC41731r2) obj).mo91199J(coroutineContext);
    }
}
