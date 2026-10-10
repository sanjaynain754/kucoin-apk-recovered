package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.utils.extensions.core.C27029c;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p245ez.C37278a;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.a */
/* JADX INFO: compiled from: BizConfigContainer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;", "config", "<init>", "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;)V", "", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/util/Map;", "c", "()Ljava/lang/String;", "", "b", "()J", "d", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23857a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public BizConfig config;

    /* JADX INFO: renamed from: com.kubi.sdk.lib.kucoin.biz.control.internal.loader.a$a */
    /* JADX INFO: compiled from: BizConfigContainer.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a$a;", "", "<init>", "()V", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;", "bizResponseEntity", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizResponseEntity;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;", "bizConfig", "b", "(Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/BizConfig;)Lcom/kubi/sdk/lib/kucoin/biz/control/internal/loader/a;", "biz-control-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C23857a m57099a(@NotNull BizResponseEntity bizResponseEntity) {
            Intrinsics.checkNotNullParameter(bizResponseEntity, "bizResponseEntity");
            Map<String, Object> mapM83450a = C37278a.m83450a(bizResponseEntity.getConfig());
            String source = bizResponseEntity.getSource();
            if (source == null) {
                source = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mapM83450a);
            return new C23857a(new BizConfig(linkedHashMap, source, jCurrentTimeMillis), null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C23857a m57100b(@NotNull BizConfig bizConfig) {
            Intrinsics.checkNotNullParameter(bizConfig, "bizConfig");
            return new C23857a(bizConfig, null);
        }
    }

    public /* synthetic */ C23857a(BizConfig bizConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizConfig);
    }

    public C23857a(BizConfig bizConfig) {
        this.config = bizConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Map<String, Object> m57095a() {
        Map<String, Object> config;
        BizConfig bizConfig = this.config;
        return (bizConfig == null || (config = bizConfig.getConfig()) == null) ? MapsKt.emptyMap() : config;
    }

    /* JADX INFO: renamed from: b */
    public final long m57096b() {
        BizConfig bizConfig = this.config;
        if (bizConfig != null) {
            return bizConfig.getFetchTime();
        }
        return 0L;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m57097c() {
        String source;
        BizConfig bizConfig = this.config;
        return (bizConfig == null || (source = bizConfig.getSource()) == null) ? "" : source;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m57098d() {
        BizConfig bizConfig = this.config;
        String strM66606i = bizConfig != null ? C27029c.m66606i(bizConfig) : null;
        return strM66606i == null ? "" : strM66606i;
    }
}
