package er;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.tencent.qcloud.tuicore.TUIConstants;
import fr.C37580a;
import fr.InterfaceC37581b;
import fr.InterfaceC37582c;
import fr.InterfaceC37583d;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: er.a */
/* JADX INFO: compiled from: IWebSocketClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0004¨\u0006\u001d"}, m90084d2 = {"Ler/a;", "", "", "connect", "()V", "disconnect", "g", "", "c", "()Ljava/lang/String;", "Lfr/d;", "status", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lfr/d;)V", "b", "Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/model/NetworkMessage;", "d", "()Lkotlinx/coroutines/flow/e;", "Lcom/kubi/network/api/model/NetworkRequest;", "request", "Lfr/b;", "f", "(Lcom/kubi/network/api/model/NetworkRequest;)Lfr/b;", "Lfr/c;", TUIConstants.TUIChat.CALL_BACK, "e", "(Lcom/kubi/network/api/model/NetworkRequest;Lfr/c;)Lfr/b;", "cancelAll", "network-api_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37236a {

    /* JADX INFO: renamed from: er.a$a */
    /* JADX INFO: compiled from: IWebSocketClient.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceC37581b m83277a(InterfaceC37236a interfaceC37236a, NetworkRequest networkRequest, InterfaceC37582c interfaceC37582c, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i11 & 2) != 0) {
                interfaceC37582c = new C37580a();
            }
            return interfaceC37236a.mo42860e(networkRequest, interfaceC37582c);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo42856a(@NotNull InterfaceC37583d status);

    /* JADX INFO: renamed from: b */
    void mo42857b(@NotNull InterfaceC37583d status);

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo42858c();

    void cancelAll();

    void connect();

    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<NetworkMessage<?>> mo42859d();

    void disconnect();

    @NotNull
    /* JADX INFO: renamed from: e */
    InterfaceC37581b mo42860e(@NotNull NetworkRequest request, @NotNull InterfaceC37582c callback);

    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC37581b mo42861f(@NotNull NetworkRequest request);

    /* JADX INFO: renamed from: g */
    void mo42862g();
}
