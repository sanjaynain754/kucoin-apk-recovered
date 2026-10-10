package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kotlinx.coroutines.b0 */
/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u000b\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/b0;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "c", "()Z", "", "toString", "()Ljava/lang/String;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/Throwable;", "Lkotlinx/atomicfu/AtomicBoolean;", "_handled", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public class C41549b0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91459b = AtomicIntegerFieldUpdater.newUpdater(C41549b0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Throwable cause;

    public C41549b0(@NotNull Throwable th2, boolean z11) {
        this.cause = th2;
        this._handled$volatile = z11 ? 1 : 0;
    }

    @NotNull
    public String toString() {
        return C41717o0.m91174a(this) + '[' + this.cause + ']';
    }

    /* JADX INFO: renamed from: a */
    public final boolean m90486a() {
        if (f91459b.get(this) == 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90487c() {
        return f91459b.compareAndSet(this, 0, 1);
    }

    public /* synthetic */ C41549b0(Throwable th2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i11 & 2) != 0 ? false : z11);
    }
}
