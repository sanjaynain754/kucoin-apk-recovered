package og0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41731r2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: og0.n0 */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Log0/n0;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Lkotlinx/coroutines/r2;", "element", "value", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/r2;Ljava/lang/Object;)V", "b", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/r2;", "elements", "d", "I", "i", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C43071n0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object[] values;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC41731r2<Object>[] elements;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int i;

    /* JADX INFO: renamed from: a */
    public final void m94623a(@NotNull InterfaceC41731r2<?> element, @Nullable Object value) {
        Object[] objArr = this.values;
        int i11 = this.i;
        objArr[i11] = value;
        InterfaceC41731r2<Object>[] interfaceC41731r2Arr = this.elements;
        this.i = i11 + 1;
        Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC41731r2Arr[i11] = element;
    }

    /* JADX INFO: renamed from: b */
    public final void m94624b(@NotNull CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            InterfaceC41731r2<Object> interfaceC41731r2 = this.elements[length];
            Intrinsics.checkNotNull(interfaceC41731r2);
            interfaceC41731r2.mo91200l(context, this.values[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    public C43071n0(@NotNull CoroutineContext coroutineContext, int i11) {
        this.context = coroutineContext;
        this.values = new Object[i11];
        this.elements = new InterfaceC41731r2[i11];
    }
}
