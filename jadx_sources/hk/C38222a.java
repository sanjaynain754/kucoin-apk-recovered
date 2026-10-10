package hk;

import com.kubi.httpdns.track.RequestTrack;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hk.a */
/* JADX INFO: compiled from: IRequestTrack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lhk/a;", "Lhk/b$a;", "<init>", "()V", "", "host", "Lcom/kubi/httpdns/track/RequestTrack;", "b", "(Ljava/lang/String;)Lcom/kubi/httpdns/track/RequestTrack;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C38222a implements InterfaceC38223b.a {
    @Override // hk.InterfaceC38223b.a
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RequestTrack mo86287a(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return new RequestTrack(host);
    }
}
