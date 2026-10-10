package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BizControlApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;", "", "source", "", "config", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getConfig", "()Ljava/util/Map;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class BizResponseEntity {

    @Nullable
    private final Map<String, Object> config;

    @Nullable
    private final String source;

    /* JADX WARN: Multi-variable type inference failed */
    public BizResponseEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BizResponseEntity)) {
            return false;
        }
        BizResponseEntity bizResponseEntity = (BizResponseEntity) other;
        return Intrinsics.areEqual(this.source, bizResponseEntity.source) && Intrinsics.areEqual(this.config, bizResponseEntity.config);
    }

    public BizResponseEntity(@Nullable String str, @Nullable Map<String, ? extends Object> map) {
        this.source = str;
        this.config = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BizResponseEntity copy$default(BizResponseEntity bizResponseEntity, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bizResponseEntity.source;
        }
        if ((i11 & 2) != 0) {
            map = bizResponseEntity.config;
        }
        return bizResponseEntity.copy(str, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final Map<String, Object> component2() {
        return this.config;
    }

    @NotNull
    public final BizResponseEntity copy(@Nullable String source, @Nullable Map<String, ? extends Object> config) {
        return new BizResponseEntity(source, config);
    }

    @Nullable
    public final Map<String, Object> getConfig() {
        return this.config;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, Object> map = this.config;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BizResponseEntity(source=" + this.source + ", config=" + this.config + ')';
    }

    public /* synthetic */ BizResponseEntity(String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? MapsKt.emptyMap() : map);
    }
}
