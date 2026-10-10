package gr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import p569qq.C43847h;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: gr.c */
/* JADX INFO: compiled from: PbKunlunReporter.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lgr/c;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/atomic/AtomicLong;", "b", "Ljava/util/concurrent/atomic/AtomicLong;", "lastReportTime", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38001c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38001c f85602a = new C38001c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicLong lastReportTime = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final void m85875a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = lastReportTime;
        long j11 = atomicLong.get();
        if (jCurrentTimeMillis - j11 >= 10000 && atomicLong.compareAndSet(j11, jCurrentTimeMillis)) {
            C43847h.m96575d(KunlunTechEventEnum.CATE_PROTOBUF_PARSE_ERROR, -1);
        }
    }
}
