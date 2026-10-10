package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: kotlinx.coroutines.g */
/* JADX INFO: compiled from: EventLoop.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lkotlinx/coroutines/g;", "Lkotlinx/coroutines/g1;", "Ljava/lang/Thread;", InterfaceC33953u5.f72225u, "<init>", "(Ljava/lang/Thread;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/lang/Thread;", ExifInterface.LONGITUDE_WEST, "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41682g extends AbstractC41684g1 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Thread thread;

    @Override // kotlinx.coroutines.AbstractC41688h1
    @NotNull
    /* JADX INFO: renamed from: W, reason: from getter */
    public Thread getThread() {
        return this.thread;
    }

    public C41682g(@NotNull Thread thread) {
        this.thread = thread;
    }
}
