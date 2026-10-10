package p771xr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.socket.core.InterfaceC19355a;
import com.kubi.network.socket.core.InterfaceC19356b;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p700vr.C45623a;
import p807yr.C46559b;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xr.b */
/* JADX INFO: compiled from: SubscribeInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m90084d2 = {"Lxr/b;", "Lcom/kubi/network/socket/core/b;", "Lvr/a;", "client", "<init>", "(Lvr/a;)V", "Lcom/kubi/network/socket/core/a;", "chain", "Lcom/kubi/network/api/model/NetworkResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/socket/core/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "b", "(Lcom/kubi/network/api/model/NetworkRequest;)Lcom/kubi/network/api/model/NetworkResponse;", "Lvr/a;", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C46328b implements InterfaceC19356b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C45623a client;

    public C46328b(@NotNull C45623a client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* JADX INFO: renamed from: b */
    public final NetworkResponse<?> m102146b(NetworkRequest request) {
        if (!(request instanceof SubscribeRequest)) {
            return null;
        }
        SubscribeRequest subscribeRequest = (SubscribeRequest) request;
        if (Intrinsics.areEqual(subscribeRequest.getType(), "subscribe") || Intrinsics.areEqual(subscribeRequest.getType(), "unsubscribe")) {
            C46559b c46559bM100732d = this.client.getSubscribeQueue();
            if (!C27025c.m66567e(c46559bM100732d != null ? Boolean.valueOf(c46559bM100732d.m102712a(subscribeRequest)) : null, true)) {
                return NetworkResponse.INSTANCE.success("repeat request");
            }
        }
        return null;
    }

    @Override // com.kubi.network.socket.core.InterfaceC19356b
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42947a(@NotNull InterfaceC19355a interfaceC19355a, @NotNull Continuation<? super NetworkResponse<?>> continuation) {
        NetworkResponse<?> networkResponseM102146b = m102146b(interfaceC19355a.getRequest());
        if (networkResponseM102146b == null) {
            return interfaceC19355a.mo42946a(interfaceC19355a.getRequest(), continuation);
        }
        return networkResponseM102146b;
    }
}
