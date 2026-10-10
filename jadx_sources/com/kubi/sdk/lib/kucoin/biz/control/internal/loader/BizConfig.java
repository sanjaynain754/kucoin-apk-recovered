package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BizConfigContainer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;", "", "config", "", "", "source", "fetchTime", "", "(Ljava/util/Map;Ljava/lang/String;J)V", "getConfig", "()Ljava/util/Map;", "setConfig", "(Ljava/util/Map;)V", "getFetchTime", "()J", "setFetchTime", "(J)V", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BizConfig {

    @NotNull
    private Map<String, ? extends Object> config;
    private long fetchTime;

    @NotNull
    private String source;

    public BizConfig(@NotNull Map<String, ? extends Object> config, @NotNull String source, long j11) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        this.config = config;
        this.source = source;
        this.fetchTime = j11;
    }

    @NotNull
    public final Map<String, Object> getConfig() {
        return this.config;
    }

    public final long getFetchTime() {
        return this.fetchTime;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public final void setConfig(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.config = map;
    }

    public final void setFetchTime(long j11) {
        this.fetchTime = j11;
    }

    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source = str;
    }
}
