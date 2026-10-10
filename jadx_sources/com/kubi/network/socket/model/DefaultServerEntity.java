package com.kubi.network.socket.model;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m90084d2 = {"Lcom/kubi/network/socket/model/DefaultServerEntity;", "", "endpoint", "", "encrypt", "", "protocol", "pingInterval", "", "pingTimeout", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEncrypt", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEndpoint", "()Ljava/lang/String;", "getPingInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPingTimeout", "getProtocol", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/network/socket/model/DefaultServerEntity;", "equals", "other", "hashCode", "toString", "network-core-socket_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class DefaultServerEntity {

    @Nullable
    private final Boolean encrypt;

    @Nullable
    private final String endpoint;

    @Nullable
    private final Integer pingInterval;

    @Nullable
    private final Integer pingTimeout;

    @Nullable
    private final String protocol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultServerEntity)) {
            return false;
        }
        DefaultServerEntity defaultServerEntity = (DefaultServerEntity) other;
        return Intrinsics.areEqual(this.endpoint, defaultServerEntity.endpoint) && Intrinsics.areEqual(this.encrypt, defaultServerEntity.encrypt) && Intrinsics.areEqual(this.protocol, defaultServerEntity.protocol) && Intrinsics.areEqual(this.pingInterval, defaultServerEntity.pingInterval) && Intrinsics.areEqual(this.pingTimeout, defaultServerEntity.pingTimeout);
    }

    public static /* synthetic */ DefaultServerEntity copy$default(DefaultServerEntity defaultServerEntity, String str, Boolean bool, String str2, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = defaultServerEntity.endpoint;
        }
        if ((i11 & 2) != 0) {
            bool = defaultServerEntity.encrypt;
        }
        if ((i11 & 4) != 0) {
            str2 = defaultServerEntity.protocol;
        }
        if ((i11 & 8) != 0) {
            num = defaultServerEntity.pingInterval;
        }
        if ((i11 & 16) != 0) {
            num2 = defaultServerEntity.pingTimeout;
        }
        Integer num3 = num2;
        String str3 = str2;
        return defaultServerEntity.copy(str, bool, str3, num, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEncrypt() {
        return this.encrypt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getPingInterval() {
        return this.pingInterval;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPingTimeout() {
        return this.pingTimeout;
    }

    @NotNull
    public final DefaultServerEntity copy(@Nullable String endpoint, @Nullable Boolean encrypt, @Nullable String protocol, @Nullable Integer pingInterval, @Nullable Integer pingTimeout) {
        return new DefaultServerEntity(endpoint, encrypt, protocol, pingInterval, pingTimeout);
    }

    @Nullable
    public final Boolean getEncrypt() {
        return this.encrypt;
    }

    @Nullable
    public final String getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    public final Integer getPingInterval() {
        return this.pingInterval;
    }

    @Nullable
    public final Integer getPingTimeout() {
        return this.pingTimeout;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        String str = this.endpoint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.encrypt;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.protocol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.pingInterval;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pingTimeout;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DefaultServerEntity(endpoint=" + this.endpoint + ", encrypt=" + this.encrypt + ", protocol=" + this.protocol + ", pingInterval=" + this.pingInterval + ", pingTimeout=" + this.pingTimeout + ')';
    }

    public DefaultServerEntity(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.endpoint = str;
        this.encrypt = bool;
        this.protocol = str2;
        this.pingInterval = num;
        this.pingTimeout = num2;
    }
}
