package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SubclassOptInRequired;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.sequences.Sequence;

/* JADX INFO: renamed from: kotlinx.coroutines.x1 */
/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 (2\u00020\u0001:\u0001)J\u0013\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH¦@¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u001b\u001a\u00020\u001a2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0014j\u0002`\u0018H'¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\bR\u0014\u0010\"\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\bR\u0014\u0010#\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, m90084d2 = {"Lkotlinx/coroutines/x1;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "", "start", "()Z", "cause", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/v;", "child", "Lkotlinx/coroutines/t;", "u", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/t;", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/b1;", "j", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", "isActive", "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "v", "()Lkotlin/sequences/Sequence;", "children", "N0", "b", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SubclassOptInRequired(markerClass = {InterfaceC41763u1.class})
public interface InterfaceC41775x1 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f91879b;

    /* JADX INFO: renamed from: kotlinx.coroutines.x1$a */
    /* JADX INFO: compiled from: Job.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m91377a(InterfaceC41775x1 interfaceC41775x1, CancellationException cancellationException, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC41775x1.mo90415a(cancellationException);
        }

        /* JADX INFO: renamed from: b */
        public static <R> R m91378b(@NotNull InterfaceC41775x1 interfaceC41775x1, R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.fold(interfaceC41775x1, r11, function2);
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static <E extends CoroutineContext.Element> E m91379c(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull CoroutineContext.Key<E> key) {
            return (E) CoroutineContext.Element.DefaultImpls.get(interfaceC41775x1, key);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public static CoroutineContext m91380d(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull CoroutineContext.Key<?> key) {
            return CoroutineContext.Element.DefaultImpls.minusKey(interfaceC41775x1, key);
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public static CoroutineContext m91381e(@NotNull InterfaceC41775x1 interfaceC41775x1, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.plus(interfaceC41775x1, coroutineContext);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.x1$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Job.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"Lkotlinx/coroutines/x1$b;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/x1;", "<init>", "()V", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion implements CoroutineContext.Key<InterfaceC41775x1> {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ Companion f91879b = new Companion();
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    Object mo90385E(@NotNull Continuation<? super Unit> continuation);

    /* JADX INFO: renamed from: a */
    void mo90415a(@Nullable CancellationException cause);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC41550b1 mo90426j(@NotNull Function1<? super Throwable, Unit> handler);

    boolean start();

    @NotNull
    /* JADX INFO: renamed from: u */
    InterfaceC41757t mo90436u(@NotNull InterfaceC41765v child);

    @NotNull
    /* JADX INFO: renamed from: v */
    Sequence<InterfaceC41775x1> mo90438v();

    @NotNull
    /* JADX INFO: renamed from: w */
    InterfaceC41550b1 mo90440w(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler);

    @NotNull
    /* JADX INFO: renamed from: x */
    CancellationException mo90442x();
}
