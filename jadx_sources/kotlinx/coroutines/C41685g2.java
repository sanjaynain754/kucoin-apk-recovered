package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: renamed from: kotlinx.coroutines.g2 */
/* JADX INFO: compiled from: NonCancellable.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0097@¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0017\u001a\u00020\u00162'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052'\u0010\u0015\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fj\u0002`\u0014H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0004\u001a\u0004\b'\u0010\u0007R\u001a\u0010)\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0004\u001a\u0004\b)\u0010\u0007R\u001a\u0010+\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b+\u0010\u0007R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00020-8VX\u0097\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010/¨\u00062"}, m90084d2 = {"Lkotlinx/coroutines/g2;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/x1;", "<init>", "()V", "", "start", "()Z", "", ExifInterface.LONGITUDE_EAST, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/b1;", "j", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", "onCancelling", "invokeImmediately", "w", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/b1;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/concurrent/CancellationException;)V", "Lkotlinx/coroutines/v;", "child", "Lkotlinx/coroutines/t;", "u", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/t;", "", "toString", "()Ljava/lang/String;", "isActive", "isActive$annotations", "isCompleted", "isCompleted$annotations", "isCancelled", "isCancelled$annotations", "Lkotlin/sequences/Sequence;", "v", "()Lkotlin/sequences/Sequence;", "getChildren$annotations", "children", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41685g2 extends AbstractCoroutineContextElement implements InterfaceC41775x1 {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41685g2 f91735b = new C41685g2();

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    public boolean start() {
        return false;
    }

    public C41685g2() {
        super(InterfaceC41775x1.INSTANCE);
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @Nullable
    /* JADX INFO: renamed from: E */
    public Object mo90385E(@NotNull Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    /* JADX INFO: renamed from: j */
    public InterfaceC41550b1 mo90426j(@NotNull Function1<? super Throwable, Unit> handler) {
        return C41689h2.f91736b;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    /* JADX INFO: renamed from: u */
    public InterfaceC41757t mo90436u(@NotNull InterfaceC41765v child) {
        return C41689h2.f91736b;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    /* JADX INFO: renamed from: w */
    public InterfaceC41550b1 mo90440w(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
        return C41689h2.f91736b;
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    @NotNull
    /* JADX INFO: renamed from: x */
    public CancellationException mo90442x() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @NotNull
    /* JADX INFO: renamed from: v */
    public Sequence<InterfaceC41775x1> mo90438v() {
        return SequencesKt.emptySequence();
    }

    @Override // kotlinx.coroutines.InterfaceC41775x1
    @Deprecated(level = DeprecationLevel.WARNING, message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited")
    /* JADX INFO: renamed from: a */
    public void mo90415a(@Nullable CancellationException cause) {
    }
}
