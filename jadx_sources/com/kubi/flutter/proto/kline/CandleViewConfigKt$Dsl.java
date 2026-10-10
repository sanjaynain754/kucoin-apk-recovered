package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CandleViewConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/CandleViewConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/CandleViewConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/CandleViewConfig;", "value", "Lcom/kubi/flutter/proto/kline/SwitchType;", "hollowCandle", "getHollowCandle", "()Lcom/kubi/flutter/proto/kline/SwitchType;", "setHollowCandle", "(Lcom/kubi/flutter/proto/kline/SwitchType;)V", "clearHollowCandle", "", "", "bullishColor", "getBullishColor", "()I", "setBullishColor", "(I)V", "clearBullishColor", "fallColor", "getFallColor", "setFallColor", "clearFallColor", "", "waterMarkString", "getWaterMarkString", "()Ljava/lang/String;", "setWaterMarkString", "(Ljava/lang/String;)V", "clearWaterMarkString", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CandleViewConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22082b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CandleViewConfig.C12646b f22083a;

    /* JADX INFO: compiled from: CandleViewConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/CandleViewConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/CandleViewConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ CandleViewConfigKt$Dsl _create(CandleViewConfig.C12646b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new CandleViewConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ CandleViewConfigKt$Dsl(CandleViewConfig.C12646b c12646b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12646b);
    }

    public CandleViewConfigKt$Dsl(CandleViewConfig.C12646b c12646b) {
        this.f22083a = c12646b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CandleViewConfig m23923a() {
        CandleViewConfig candleViewConfigBuild = this.f22083a.build();
        Intrinsics.checkNotNullExpressionValue(candleViewConfigBuild, "build(...)");
        return candleViewConfigBuild;
    }

    @JvmName(name = "setBullishColor")
    /* JADX INFO: renamed from: b */
    public final void m23924b(int i11) {
        this.f22083a.m23919a(i11);
    }

    @JvmName(name = "setFallColor")
    /* JADX INFO: renamed from: c */
    public final void m23925c(int i11) {
        this.f22083a.m23920b(i11);
    }

    @JvmName(name = "setHollowCandle")
    /* JADX INFO: renamed from: d */
    public final void m23926d(@NotNull SwitchType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22083a.m23921c(value);
    }

    @JvmName(name = "setWaterMarkString")
    /* JADX INFO: renamed from: e */
    public final void m23927e(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22083a.m23922d(value);
    }
}
