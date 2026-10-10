package com.kubi.kucoin.startup;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NetworkEncryptionStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/startup/KNetworkEncryptionConfig;", "", "encryptEnable", "", "allowDiskCache", "allowMaxTtl", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getEncryptEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowDiskCache", "getAllowMaxTtl", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KNetworkEncryptionConfig {

    @Nullable
    private final Boolean allowDiskCache;

    @Nullable
    private final Integer allowMaxTtl;

    @Nullable
    private final Boolean encryptEnable;

    public KNetworkEncryptionConfig() {
        this(null, null, null, 7, null);
    }

    public KNetworkEncryptionConfig(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num) {
        this.encryptEnable = bool;
        this.allowDiskCache = bool2;
        this.allowMaxTtl = num;
    }

    @Nullable
    public final Boolean getAllowDiskCache() {
        return this.allowDiskCache;
    }

    @Nullable
    public final Integer getAllowMaxTtl() {
        return this.allowMaxTtl;
    }

    @Nullable
    public final Boolean getEncryptEnable() {
        return this.encryptEnable;
    }

    public /* synthetic */ KNetworkEncryptionConfig(Boolean bool, Boolean bool2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : num);
    }
}
