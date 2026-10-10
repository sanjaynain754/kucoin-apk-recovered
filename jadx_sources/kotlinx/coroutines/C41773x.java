package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.selects.InterfaceC41751f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.x */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"Lkotlinx/coroutines/x;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/x1;", "parent", "<init>", "(Lkotlinx/coroutines/x1;)V", "b", "()Ljava/lang/Object;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "n", "(Ljava/lang/Object;)Z", "", "exception", "m", "(Ljava/lang/Throwable;)Z", "g0", "()Z", "onCancelComplete", "Lkotlinx/coroutines/selects/f;", "C", "()Lkotlinx/coroutines/selects/f;", "onAwait", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41773x<T> extends JobSupport implements InterfaceC41769w<T> {
    public C41773x(@Nullable InterfaceC41775x1 interfaceC41775x1) {
        super(true);
        m90431p0(interfaceC41775x1);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: g0 */
    public boolean mo90422g0() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC41769w
    /* JADX INFO: renamed from: m */
    public boolean mo91369m(@NotNull Throwable exception) {
        return m90439v0(new C41549b0(exception, false, 2, null));
    }

    @Override // kotlinx.coroutines.InterfaceC41729r0
    @NotNull
    /* JADX INFO: renamed from: C */
    public InterfaceC41751f<T> mo91196C() {
        InterfaceC41751f<T> interfaceC41751f = (InterfaceC41751f<T>) m90421f0();
        Intrinsics.checkNotNull(interfaceC41751f, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
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
    public Object mo91198h(@NotNull Continuation<? super T> continuation) throws Throwable {
        Object objM90397O = m90397O(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objM90397O;
    }

    @Override // kotlinx.coroutines.InterfaceC41769w
    /* JADX INFO: renamed from: n */
    public boolean mo91370n(T value) {
        return m90439v0(value);
    }
}
