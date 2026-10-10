package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BollConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010#\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/BollConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/BollConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/BollConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/BollConfig;", "value", "", "period", "getPeriod", "()I", "setPeriod", "(I)V", "clearPeriod", "", "bandWidth", "getBandWidth", "setBandWidth", "clearBandWidth", "Lcom/kubi/flutter/proto/kline/LineConfig;", "up", "getUp", "()Lcom/kubi/flutter/proto/kline/LineConfig;", "setUp", "(Lcom/kubi/flutter/proto/kline/LineConfig;)V", "clearUp", "hasUp", "", "mb", "getMb", "setMb", "clearMb", "hasMb", "dn", "getDn", "setDn", "clearDn", "hasDn", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BollConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22070b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BollConfig.C12638b f22071a;

    /* JADX INFO: compiled from: BollConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/BollConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/BollConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/BollConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ BollConfigKt$Dsl _create(BollConfig.C12638b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new BollConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ BollConfigKt$Dsl(BollConfig.C12638b c12638b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12638b);
    }

    public BollConfigKt$Dsl(BollConfig.C12638b c12638b) {
        this.f22071a = c12638b;
    }
}
