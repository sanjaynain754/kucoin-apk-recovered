package com.kubi.network.subscribe.token;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.reflect.TypeToken;
import com.kubi.network.socket.model.DefaultTokenEntity;
import com.kubi.network.socket.model.TokenEntity;
import com.kubi.network.socket.utils.RemoteTokenUtils;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.storage.StorageType;
import com.tencent.bugly.proguard.C33733jc;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import mr.C42597a;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p735wr.C45917a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import tr.InterfaceC45068c;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: SubscribeTokenProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010%\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010.R'\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0017008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b*\u00102¨\u00064"}, m90084d2 = {"Lcom/kubi/network/subscribe/token/SubscribeTokenProvider;", "Ltr/c;", "Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;", "config", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;Lokhttp3/OkHttpClient;)V", "", "fromCache", "Lcom/kubi/network/socket/model/TokenEntity;", "getToken", "(Z)Lcom/kubi/network/socket/model/TokenEntity;", "c", "()Z", "", "b", "()V", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "g", "", "userId", "Lcom/kubi/network/socket/model/DefaultTokenEntity;", InterfaceC33826o0.f71244p, "i", "(Ljava/lang/String;Lcom/kubi/network/socket/model/DefaultTokenEntity;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Lcom/kubi/network/socket/model/DefaultTokenEntity;", "j", "(Ljava/lang/String;)V", "Lcom/kubi/network/subscribe/token/SubscribeTokenConfig;", "Lokhttp3/OkHttpClient;", "Lcom/kubi/network/socket/utils/RemoteTokenUtils;", "Lcom/kubi/network/socket/utils/RemoteTokenUtils;", "tokenUtils", "Z", "privateChannel", "e", "Lcom/kubi/network/socket/model/TokenEntity;", "currentToken", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "failCount", "Ly70/g;", "Ly70/g;", "tokenKey", "", "Lkotlin/Lazy;", "()Ljava/util/Map;", "tokenCache", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubscribeTokenProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscribeTokenProvider.kt\ncom/kubi/network/subscribe/token/SubscribeTokenProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public final class SubscribeTokenProvider implements InterfaceC45068c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SubscribeTokenConfig config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final OkHttpClient client;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final RemoteTokenUtils tokenUtils;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean privateChannel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public TokenEntity currentToken;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger failCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final StorageId<String> tokenKey;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy tokenCache;

    public SubscribeTokenProvider(@NotNull SubscribeTokenConfig config, @NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(client, "client");
        this.config = config;
        this.client = client;
        this.tokenUtils = new RemoteTokenUtils(client);
        this.failCount = new AtomicInteger();
        this.tokenKey = new StorageId<>("CATEGORY_SOCKET", "token_" + config.m43091b(), StorageType.LocalSite, false, 8, null);
        this.tokenCache = LazyKt.lazy(new Function0<Map<String, DefaultTokenEntity>>() { // from class: com.kubi.network.subscribe.token.SubscribeTokenProvider$tokenCache$2

            /* JADX INFO: renamed from: com.kubi.network.subscribe.token.SubscribeTokenProvider$tokenCache$2$a */
            /* JADX INFO: compiled from: SubscribeTokenProvider.kt */
            @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/network/subscribe/token/SubscribeTokenProvider$tokenCache$2$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lcom/kubi/network/socket/model/DefaultTokenEntity;", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
            public static final class C19397a extends TypeToken<Map<String, ? extends DefaultTokenEntity>> {
            }

            {
                super(0);
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0071  */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, DefaultTokenEntity> invoke() {
                String message;
                try {
                    String strM102326h = C46392a.m102326h(this.this$0.tokenKey, "{}");
                    return strM102326h.length() > 0 ? (Map) C27099x.m66914d(strM102326h, new C19397a().getType()) : new LinkedHashMap();
                } catch (Throwable th2) {
                    C46392a.m102335r(this.this$0.tokenKey);
                    boolean zStartsWith$default = true;
                    if (!(th2 instanceof UnknownHostException) && !(th2 instanceof SocketException) && !(th2 instanceof SocketTimeoutException) && !(th2 instanceof SSLException) && !(th2 instanceof SSLProtocolException) && !(th2 instanceof SSLPeerUnverifiedException) && !(th2 instanceof ConnectionShutdownException)) {
                        if (th2 instanceof SecurityException) {
                            String message2 = th2.getMessage();
                            if (message2 != null) {
                                zStartsWith$default = StringsKt.startsWith$default(message2, "Package android does not belong to", false, 2, (Object) null);
                            } else {
                                zStartsWith$default = false;
                            }
                        } else if (!(th2 instanceof IOException) || (message = th2.getMessage()) == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
                            zStartsWith$default = false;
                        }
                    }
                    if (zStartsWith$default) {
                        C44128b.m97263g("TokenProvider", th2);
                    } else {
                        C45917a.m101368b(th2, "TokenProvider");
                    }
                    return new LinkedHashMap();
                }
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final DefaultTokenEntity m43103h(String userId) {
        DefaultTokenEntity defaultTokenEntity;
        synchronized (this) {
            defaultTokenEntity = m43101f().get(userId);
        }
        return defaultTokenEntity;
    }

    /* JADX INFO: renamed from: i */
    public final void m43104i(String userId, DefaultTokenEntity token) {
        synchronized (this) {
            m43101f().put(userId, token);
            C46392a.m102333p(this.tokenKey, C27099x.m66919i(m43101f(), false, 2, null));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m43105j(String userId) {
        synchronized (this) {
            m43101f().remove(userId);
            C46392a.m102333p(this.tokenKey, C27099x.m66919i(m43101f(), false, 2, null));
        }
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: a */
    public void mo43097a() {
        if (this.failCount.incrementAndGet() > 6) {
            mo43098b();
        }
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getPrivateChannel() {
        return this.privateChannel;
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, DefaultTokenEntity> m43101f() {
        return (Map) this.tokenCache.getValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m43102g() {
        this.failCount.set(0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0043, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x006d, please report this as an issue */
    @Override // tr.InterfaceC45068c
    @NotNull
    public TokenEntity getToken(boolean fromCache) {
        if (fromCache) {
            TokenEntity tokenEntity = this.currentToken;
            if (tokenEntity != null) {
                return tokenEntity;
            }
            throw new IllegalStateException("current token is null");
        }
        String strInvoke = this.config.m43094e().invoke();
        DefaultTokenEntity defaultTokenEntityM43103h = m43103h(strInvoke);
        if (defaultTokenEntityM43103h == null) {
            if (strInvoke.length() > 0) {
                defaultTokenEntityM43103h = this.tokenUtils.m43044c(this.config.getBaseUrl() + "v1/bullet-private", this.config.m43092c(), this.config.m43093d());
            } else {
                defaultTokenEntityM43103h = this.tokenUtils.m43044c(this.config.getBaseUrl() + "v1/bullet-public", this.config.m43092c(), this.config.m43093d());
            }
            defaultTokenEntityM43103h.setTimestamp(Long.valueOf(System.currentTimeMillis()));
            m43104i(strInvoke, defaultTokenEntityM43103h);
        } else {
            if (System.currentTimeMillis() - C27039d.m66652l(defaultTokenEntityM43103h.getTimestamp()) >= C33733jc.f70371c) {
                mo43098b();
                defaultTokenEntityM43103h = null;
            }
            if (defaultTokenEntityM43103h == null) {
                if (strInvoke.length() > 0) {
                    defaultTokenEntityM43103h = this.tokenUtils.m43044c(this.config.getBaseUrl() + "v1/bullet-private", this.config.m43092c(), this.config.m43093d());
                } else {
                    defaultTokenEntityM43103h = this.tokenUtils.m43044c(this.config.getBaseUrl() + "v1/bullet-public", this.config.m43092c(), this.config.m43093d());
                }
                defaultTokenEntityM43103h.setTimestamp(Long.valueOf(System.currentTimeMillis()));
                m43104i(strInvoke, defaultTokenEntityM43103h);
            }
        }
        TokenEntity tokenEntity2 = new TokenEntity(DefaultTokenEntity.getWsUrl$default(defaultTokenEntityM43103h, null, 1, null) + this.tokenUtils.m43045d(this.config.m43095f()), defaultTokenEntityM43103h.getPingInterval(), defaultTokenEntityM43103h.getPingTimeout());
        this.privateChannel = strInvoke.length() > 0;
        this.currentToken = tokenEntity2;
        return tokenEntity2;
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: b */
    public void mo43098b() {
        m43102g();
        m43105j(this.config.m43094e().invoke());
    }

    @Override // tr.InterfaceC45068c
    /* JADX INFO: renamed from: d */
    public void mo43100d() {
        m43102g();
    }

    public /* synthetic */ SubscribeTokenProvider(SubscribeTokenConfig subscribeTokenConfig, OkHttpClient okHttpClient, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(subscribeTokenConfig, (i11 & 2) != 0 ? C42597a.m93389e() : okHttpClient);
    }
}
