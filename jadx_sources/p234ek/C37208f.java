package p234ek;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.httpdns.interpret.IpInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ek.f */
/* JADX INFO: compiled from: InterpretResponse.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lek/f;", "", "", "host", "", "Lcom/kubi/httpdns/interpret/IpInfo;", "ips", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37208f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<IpInfo> ips;

    public C37208f(@NotNull String host, @NotNull List<IpInfo> ips) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        this.host = host;
        this.ips = ips;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<IpInfo> m83247a() {
        return this.ips;
    }
}
