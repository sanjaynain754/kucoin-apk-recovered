package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiKrnSocketModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003J)\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiKrnSocketConfig;", "", "topic", "", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "", "(Ljava/lang/String;Ljava/util/Map;)V", "getExtra", "()Ljava/util/Map;", "getTopic", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiKrnSocketConfig {

    @NotNull
    private final Map<String, Object> extra;

    @NotNull
    private final String topic;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiKrnSocketConfig)) {
            return false;
        }
        KCJSApiKrnSocketConfig kCJSApiKrnSocketConfig = (KCJSApiKrnSocketConfig) other;
        return Intrinsics.areEqual(this.topic, kCJSApiKrnSocketConfig.topic) && Intrinsics.areEqual(this.extra, kCJSApiKrnSocketConfig.extra);
    }

    public KCJSApiKrnSocketConfig(@NotNull String topic, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.topic = topic;
        this.extra = extra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCJSApiKrnSocketConfig copy$default(KCJSApiKrnSocketConfig kCJSApiKrnSocketConfig, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiKrnSocketConfig.topic;
        }
        if ((i11 & 2) != 0) {
            map = kCJSApiKrnSocketConfig.extra;
        }
        return kCJSApiKrnSocketConfig.copy(str, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.extra;
    }

    @NotNull
    public final KCJSApiKrnSocketConfig copy(@NotNull String topic, @NotNull Map<String, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(extra, "extra");
        return new KCJSApiKrnSocketConfig(topic, extra);
    }

    @NotNull
    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (this.topic.hashCode() * 31) + this.extra.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiKrnSocketConfig(topic=" + this.topic + ", extra=" + this.extra + ')';
    }
}
