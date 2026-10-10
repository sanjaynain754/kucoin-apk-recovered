package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.v2 */
/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/coroutines/v2;", "U", ExifInterface.GPS_DIRECTION_TRUE, "Log0/w;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(JLkotlin/coroutines/Continuation;)V", "", "run", "()V", "", "x0", "()Ljava/lang/String;", "f", "J", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class RunnableC41768v2<U, T extends U> extends C43080w<T> implements Runnable {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    public final long time;

    @Override // java.lang.Runnable
    public void run() {
        m90401Q(TimeoutKt.m90466a(this.time, DelayKt.m90352d(get$context()), this));
    }

    @Override // kotlinx.coroutines.AbstractC41539a, kotlinx.coroutines.JobSupport
    @NotNull
    /* JADX INFO: renamed from: x0 */
    public String mo90443x0() {
        return super.mo90443x0() + "(timeMillis=" + this.time + ')';
    }

    public RunnableC41768v2(long j11, @NotNull Continuation<? super U> continuation) {
        super(continuation.get$context(), continuation);
        this.time = j11;
    }
}
