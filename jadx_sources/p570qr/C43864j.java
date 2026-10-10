package p570qr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.socket.core.InterfaceC19355a;
import com.kubi.network.socket.core.InterfaceC19356b;
import fr.InterfaceC37582c;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.SafeContinuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.j */
/* JADX INFO: compiled from: SocketInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m90084d2 = {"Lqr/j;", "Lcom/kubi/network/socket/core/b;", "Lcom/kubi/network/socket/WebSocketClient;", "client", "<init>", "(Lcom/kubi/network/socket/WebSocketClient;)V", "Lcom/kubi/network/socket/core/a;", "chain", "Lcom/kubi/network/api/model/NetworkResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/socket/core/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/network/socket/WebSocketClient;", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C43864j implements InterfaceC19356b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WebSocketClient client;

    /* JADX INFO: renamed from: qr.j$a */
    /* JADX INFO: compiled from: SocketInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"qr/j$a", "Lfr/c;", "", "exception", "", "onFailure", "(Ljava/lang/Throwable;)V", "Lcom/kubi/network/api/model/NetworkResponse;", "response", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/api/model/NetworkResponse;)V", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a implements InterfaceC37582c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Continuation<NetworkResponse<?>> f96947a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Continuation<? super NetworkResponse<?>> continuation) {
            this.f96947a = continuation;
        }

        @Override // fr.InterfaceC37582c
        /* JADX INFO: renamed from: a */
        public void mo23836a(@NotNull NetworkResponse<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f96947a.resumeWith(Result.m103844constructorimpl(response));
        }

        @Override // fr.InterfaceC37582c
        public void onFailure(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Continuation<NetworkResponse<?>> continuation = this.f96947a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exception)));
        }

        @Override // fr.InterfaceC37582c
        @NotNull
        /* JADX INFO: renamed from: b */
        public InterfaceC37582c mo23837b(@NotNull Executor executor) {
            return InterfaceC37582c.a.m84719c(this, executor);
        }
    }

    public C43864j(@NotNull WebSocketClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    @Override // com.kubi.network.socket.core.InterfaceC19356b
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo42947a(@NotNull InterfaceC19355a interfaceC19355a, @NotNull Continuation<? super NetworkResponse<?>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        InterfaceC43861g<NetworkRequest, NetworkMessage<?>> interfaceC43861gM42864k = this.client.m42864k();
        if (interfaceC43861gM42864k != null) {
            interfaceC43861gM42864k.mo42927e(interfaceC19355a.getRequest(), new a(safeContinuation));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
