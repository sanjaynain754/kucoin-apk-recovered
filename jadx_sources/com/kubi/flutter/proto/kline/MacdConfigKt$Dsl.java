package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MacdConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020!J\u0006\u0010%\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001e¨\u0006("}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/MacdConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/MacdConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/MacdConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/MacdConfig;", "value", "", "shortPeriod", "getShortPeriod", "()I", "setShortPeriod", "(I)V", "clearShortPeriod", "", "longPeriod", "getLongPeriod", "setLongPeriod", "clearLongPeriod", "maPeriod", "getMaPeriod", "setMaPeriod", "clearMaPeriod", "Lcom/kubi/flutter/proto/kline/LineConfig;", "dif", "getDif", "()Lcom/kubi/flutter/proto/kline/LineConfig;", "setDif", "(Lcom/kubi/flutter/proto/kline/LineConfig;)V", "clearDif", "hasDif", "", "dea", "getDea", "setDea", "clearDea", "hasDea", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MacdConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22125b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MacdConfig.C12672b f22126a;

    /* JADX INFO: compiled from: MacdConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/MacdConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/MacdConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/MacdConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ MacdConfigKt$Dsl _create(MacdConfig.C12672b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new MacdConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ MacdConfigKt$Dsl(MacdConfig.C12672b c12672b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12672b);
    }

    public MacdConfigKt$Dsl(MacdConfig.C12672b c12672b) {
        this.f22126a = c12672b;
    }
}
