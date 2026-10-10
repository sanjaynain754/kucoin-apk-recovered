package tr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.socket.model.DefaultTokenEntity;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.network.socket.utils.RemoteTokenUtils;
import mr.C42597a;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tr.b */
/* JADX INFO: compiled from: DefaultTokenProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, m90084d2 = {"Ltr/b;", "Ltr/c;", "Lokhttp3/OkHttpClient;", "client", "Ltr/a;", "config", "<init>", "(Lokhttp3/OkHttpClient;Ltr/a;)V", "", "fromCache", "Lcom/kubi/network/socket/model/TokenEntity;", "getToken", "(Z)Lcom/kubi/network/socket/model/TokenEntity;", "c", "()Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lokhttp3/OkHttpClient;", "b", "Ltr/a;", "Lcom/kubi/network/socket/utils/RemoteTokenUtils;", "Lcom/kubi/network/socket/utils/RemoteTokenUtils;", "tokenUtils", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C45067b implements InterfaceC45068c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C45066a config;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final RemoteTokenUtils tokenUtils;

    public C45067b(@NotNull OkHttpClient client, @NotNull C45066a config) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(config, "config");
        this.client = client;
        this.config = config;
        this.tokenUtils = new RemoteTokenUtils(client);
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: c */
    public boolean mo43099c() {
        return false;
    }

    @Override // tr.InterfaceC45068c
    @NotNull
    public TokenEntity getToken(boolean fromCache) {
        DefaultTokenEntity defaultTokenEntityM43044c = this.tokenUtils.m43044c(this.config.getUrl(), this.config.m99658a(), this.config.m99659b());
        return new TokenEntity(defaultTokenEntityM43044c.getWsUrl("/socket.io") + this.tokenUtils.m43045d(this.config.m99661d()), defaultTokenEntityM43044c.getPingInterval(), defaultTokenEntityM43044c.getPingTimeout());
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: a */
    public void mo43097a() {
        InterfaceC45068c.a.m99664c(this);
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: b */
    public void mo43098b() {
        InterfaceC45068c.a.m99663b(this);
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: d */
    public void mo43100d() {
        InterfaceC45068c.a.m99665d(this);
    }

    public /* synthetic */ C45067b(OkHttpClient okHttpClient, C45066a c45066a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C42597a.m93389e() : okHttpClient, c45066a);
    }
}
