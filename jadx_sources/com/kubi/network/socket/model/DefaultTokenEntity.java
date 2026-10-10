package com.kubi.network.socket.model;

import android.net.Uri;
import androidx.annotation.Keep;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J8\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0012\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/network/socket/model/DefaultTokenEntity;", "", "timestamp", "", InterfaceC33826o0.f71244p, "", "instanceServers", "", "Lcom/kubi/network/socket/model/DefaultServerEntity;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/kubi/network/socket/model/DefaultTokenEntity;", "equals", "", "other", "getPingInterval", "", "getPingTimeout", "getServerInfo", "getWsUrl", "path", "hashCode", "toString", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class DefaultTokenEntity {

    @Nullable
    private final List<DefaultServerEntity> instanceServers;

    @Nullable
    private Long timestamp;

    @Nullable
    private final String token;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultTokenEntity)) {
            return false;
        }
        DefaultTokenEntity defaultTokenEntity = (DefaultTokenEntity) other;
        return Intrinsics.areEqual(this.timestamp, defaultTokenEntity.timestamp) && Intrinsics.areEqual(this.token, defaultTokenEntity.token) && Intrinsics.areEqual(this.instanceServers, defaultTokenEntity.instanceServers);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getToken() {
        return this.token;
    }

    private final List<DefaultServerEntity> component3() {
        return this.instanceServers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultTokenEntity copy$default(DefaultTokenEntity defaultTokenEntity, Long l11, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = defaultTokenEntity.timestamp;
        }
        if ((i11 & 2) != 0) {
            str = defaultTokenEntity.token;
        }
        if ((i11 & 4) != 0) {
            list = defaultTokenEntity.instanceServers;
        }
        return defaultTokenEntity.copy(l11, str, list);
    }

    private final DefaultServerEntity getServerInfo() {
        List<DefaultServerEntity> list = this.instanceServers;
        return (list == null || list.isEmpty()) ? new DefaultServerEntity("wss://ws-app-spot.xcoinsystem.com/", Boolean.TRUE, "websocket", 18000, 10000) : this.instanceServers.get(0);
    }

    public static /* synthetic */ String getWsUrl$default(DefaultTokenEntity defaultTokenEntity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return defaultTokenEntity.getWsUrl(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DefaultTokenEntity copy(@Nullable Long timestamp, @Nullable String token, @Nullable List<DefaultServerEntity> instanceServers) {
        return new DefaultTokenEntity(timestamp, token, instanceServers);
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getWsUrl(@Nullable String path) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C27041f.m66668h(getServerInfo().getEndpoint()));
        if (path != null) {
            stringBuffer.append(path);
        }
        stringBuffer.append("?token=" + Uri.encode(C27041f.m66668h(this.token)) + "&connectId=" + UUID.randomUUID());
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer().apply {\n …tring())\n    }.toString()");
        return string;
    }

    public int hashCode() {
        Long l11 = this.timestamp;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.token;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DefaultServerEntity> list = this.instanceServers;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setTimestamp(@Nullable Long l11) {
        this.timestamp = l11;
    }

    @NotNull
    public String toString() {
        return "DefaultTokenEntity(timestamp=" + this.timestamp + ", token=" + this.token + ", instanceServers=" + this.instanceServers + ')';
    }

    public DefaultTokenEntity(@Nullable Long l11, @Nullable String str, @Nullable List<DefaultServerEntity> list) {
        this.timestamp = l11;
        this.token = str;
        this.instanceServers = list;
    }

    public final int getPingInterval() {
        return C27039d.m66651k(getServerInfo().getPingInterval(), 50000);
    }

    public final int getPingTimeout() {
        return C27039d.m66651k(getServerInfo().getPingTimeout(), 10000);
    }
}
