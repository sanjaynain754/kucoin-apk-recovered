package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fg.i */
/* JADX INFO: compiled from: SocketIOCodec.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lfg/i;", "Lfg/m;", "Lcom/kubi/network/api/model/NetworkRequest;", "", "id", "request", "<init>", "(Ljava/lang/String;Lcom/kubi/network/api/model/NetworkRequest;)V", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "d", "Lcom/kubi/network/api/model/NetworkRequest;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/network/api/model/NetworkRequest;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C37460i extends C37464m<NetworkRequest> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final NetworkRequest request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37460i(@NotNull String id2, @NotNull NetworkRequest request) {
        super(id2, request);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(request, "request");
        this.id = id2;
        this.request = request;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public NetworkRequest getRequest() {
        return this.request;
    }
}
