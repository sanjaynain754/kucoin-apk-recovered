package p345ik;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ik.d */
/* JADX INFO: compiled from: RecorderUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\fj\b\u0012\u0004\u0012\u00020\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lik/d;", "", "<init>", "()V", "", "host", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Z", "", "b", "(Ljava/lang/String;)V", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "runningSet", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38656d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> runningSet = new HashSet<>();

    /* JADX INFO: renamed from: a */
    public final boolean m87391a(@NotNull String host) {
        boolean z11;
        Intrinsics.checkNotNullParameter(host, "host");
        synchronized (this.runningSet) {
            if (this.runningSet.contains(host)) {
                z11 = false;
            } else {
                this.runningSet.add(host);
                z11 = true;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public final void m87392b(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        synchronized (this.runningSet) {
            this.runningSet.remove(host);
        }
    }
}
