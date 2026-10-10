package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.selects.InterfaceC41751f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.s0 */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lkotlinx/coroutines/s0;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "b", "()Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/f;", "C", "()Lkotlinx/coroutines/selects/f;", "onAwait", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C41740s0<T> extends AbstractC41539a<T> implements InterfaceC41729r0<T> {
    public C41740s0(@NotNull CoroutineContext coroutineContext, boolean z11) {
        super(coroutineContext, true, z11);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ <T> Object m91217Y0(C41740s0<T> c41740s0, Continuation<? super T> continuation) throws Throwable {
        Object objM90397O = c41740s0.m90397O(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objM90397O;
    }

    @Override // kotlinx.coroutines.InterfaceC41729r0
    @NotNull
    /* JADX INFO: renamed from: C */
    public InterfaceC41751f<T> mo91196C() {
        InterfaceC41751f<T> interfaceC41751f = (InterfaceC41751f<T>) m90421f0();
        Intrinsics.checkNotNull(interfaceC41751f, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return interfaceC41751f;
    }

    @Override // kotlinx.coroutines.InterfaceC41729r0
    /* JADX INFO: renamed from: b */
    public T mo91197b() {
        return (T) m90417b0();
    }

    @Override // kotlinx.coroutines.InterfaceC41729r0
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo91198h(@NotNull Continuation<? super T> continuation) {
        return m91217Y0(this, continuation);
    }
}
