package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fg.l */
/* JADX INFO: compiled from: SocketKCCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lfg/l;", "Lfg/m;", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "", "id", "", "filter", "request", "<init>", "(Ljava/lang/String;ZLcom/kubi/network/api/subscribe/model/SubscribeRequest;)V", "c", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "e", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "()Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C37463l extends C37464m<SubscribeRequest> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean filter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final SubscribeRequest request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37463l(@NotNull String id2, boolean z11, @NotNull SubscribeRequest request) {
        super(id2, request);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(request, "request");
        this.id = id2;
        this.filter = z11;
        this.request = request;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFilter() {
        return this.filter;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public SubscribeRequest getRequest() {
        return this.request;
    }
}
