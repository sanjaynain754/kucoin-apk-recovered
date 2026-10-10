package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.h1 */
/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/h1;", "Lkotlinx/coroutines/f1;", "<init>", "()V", "", "Y", "", "now", "Lkotlinx/coroutines/g1$c;", "delayedTask", "X", "(JLkotlinx/coroutines/g1$c;)V", "Ljava/lang/Thread;", ExifInterface.LONGITUDE_WEST, "()Ljava/lang/Thread;", InterfaceC33953u5.f72225u, "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41688h1 extends AbstractC41589f1 {
    @NotNull
    /* JADX INFO: renamed from: W */
    public abstract Thread getThread();

    /* JADX INFO: renamed from: X */
    public void mo91063X(long now, @NotNull AbstractC41684g1.c delayedTask) {
        RunnableC41721p0.f91769h.m91032l0(now, delayedTask);
    }

    /* JADX INFO: renamed from: Y */
    public final void m91064Y() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            C41553c.m90497a();
            LockSupport.unpark(thread);
        }
    }
}
