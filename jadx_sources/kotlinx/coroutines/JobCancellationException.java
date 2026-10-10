package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "message", "", "cause", "Lkotlinx/coroutines/x1;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/x1;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "createCopy", "()Lkotlinx/coroutines/JobCancellationException;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lkotlinx/coroutines/x1;", "_job", "getJob$kotlinx_coroutines_core", "()Lkotlinx/coroutines/x1;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final transient InterfaceC41775x1 _job;

    @Nullable
    public JobCancellationException createCopy() {
        return null;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) other;
        return Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) && Intrinsics.areEqual(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) && Intrinsics.areEqual(jobCancellationException.getCause(), getCause());
    }

    @NotNull
    public final InterfaceC41775x1 getJob$kotlinx_coroutines_core() {
        InterfaceC41775x1 interfaceC41775x1 = this._job;
        return interfaceC41775x1 == null ? C41685g2.f91735b : interfaceC41775x1;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }

    public JobCancellationException(@NotNull String str, @Nullable Throwable th2, @NotNull InterfaceC41775x1 interfaceC41775x1) {
        super(str);
        this._job = interfaceC41775x1;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public int hashCode() {
        int iHashCode;
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode2 = message.hashCode() * 31;
        InterfaceC41775x1 job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int iHashCode3 = 0;
        if (job$kotlinx_coroutines_core != null) {
            iHashCode = job$kotlinx_coroutines_core.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = (iHashCode2 + iHashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            iHashCode3 = cause.hashCode();
        }
        return i11 + iHashCode3;
    }
}
