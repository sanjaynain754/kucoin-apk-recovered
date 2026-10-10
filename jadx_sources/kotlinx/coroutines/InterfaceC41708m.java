package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: kotlinx.coroutines.m */
/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J|\u0010\u0010\u001a\u0004\u0018\u00010\u0005\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ8\u0010\u001e\u001a\u00020\u000e2'\u0010\u001d\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u001bj\u0002`\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u000e*\u00020 2\u0006\u0010\u0004\u001a\u00028\u0000H'¢\u0006\u0004\b!\u0010\"Jp\u0010#\u001a\u00020\u000e\"\b\b\u0001\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012M\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007H&¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&¨\u0006("}, m90084d2 = {"Lkotlinx/coroutines/m;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "R", "value", "", "idempotent", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "G", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "exception", "y", "(Ljava/lang/Throwable;)Ljava/lang/Object;", InterfaceC33826o0.f71244p, CmcdData.Factory.STREAMING_FORMAT_SS, "(Ljava/lang/Object;)V", "", "c", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "t", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/j0;", "B", "(Lkotlinx/coroutines/j0;Ljava/lang/Object;)V", "r", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "isActive", "()Z", "isCompleted", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41763u1.class})
public interface InterfaceC41708m<T> extends Continuation<T> {

    /* JADX INFO: renamed from: kotlinx.coroutines.m$a */
    /* JADX INFO: compiled from: CancellableContinuation.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m91121a(InterfaceC41708m interfaceC41708m, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return interfaceC41708m.mo91116c(th2);
        }
    }

    /* JADX INFO: renamed from: B */
    void mo91114B(@NotNull AbstractC41697j0 abstractC41697j0, T t11);

    @Nullable
    /* JADX INFO: renamed from: G */
    <R extends T> Object mo91115G(R value, @Nullable Object idempotent, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    /* JADX INFO: renamed from: c */
    boolean mo91116c(@Nullable Throwable cause);

    boolean isActive();

    boolean isCompleted();

    /* JADX INFO: renamed from: r */
    <R extends T> void mo91117r(R value, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation);

    /* JADX INFO: renamed from: s */
    void mo91118s(@NotNull Object token);

    /* JADX INFO: renamed from: t */
    void mo91119t(@NotNull Function1<? super Throwable, Unit> handler);

    @Nullable
    /* JADX INFO: renamed from: y */
    Object mo91120y(@NotNull Throwable exception);
}
