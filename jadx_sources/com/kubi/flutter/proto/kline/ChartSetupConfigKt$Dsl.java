package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChartSetupConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/ChartSetupConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "value", "Lcom/kubi/flutter/proto/kline/CandleViewConfig;", "candleView", "getCandleView", "()Lcom/kubi/flutter/proto/kline/CandleViewConfig;", "setCandleView", "(Lcom/kubi/flutter/proto/kline/CandleViewConfig;)V", "clearCandleView", "", "hasCandleView", "", "Lcom/kubi/flutter/proto/kline/MainIndexConfig;", "mainIndex", "getMainIndex", "()Lcom/kubi/flutter/proto/kline/MainIndexConfig;", "setMainIndex", "(Lcom/kubi/flutter/proto/kline/MainIndexConfig;)V", "clearMainIndex", "hasMainIndex", "Lcom/kubi/flutter/proto/kline/VolumeConfig;", "volume", "getVolume", "()Lcom/kubi/flutter/proto/kline/VolumeConfig;", "setVolume", "(Lcom/kubi/flutter/proto/kline/VolumeConfig;)V", "clearVolume", "hasVolume", "Lcom/kubi/flutter/proto/kline/SubIndexConfig;", "subIndex", "getSubIndex", "()Lcom/kubi/flutter/proto/kline/SubIndexConfig;", "setSubIndex", "(Lcom/kubi/flutter/proto/kline/SubIndexConfig;)V", "clearSubIndex", "hasSubIndex", "Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "selectPad", "getSelectPad", "()Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "setSelectPad", "(Lcom/kubi/flutter/proto/kline/SelectPadConfig;)V", "clearSelectPad", "hasSelectPad", "Lcom/kubi/flutter/proto/kline/OrderViewConfig;", "orderView", "getOrderView", "()Lcom/kubi/flutter/proto/kline/OrderViewConfig;", "setOrderView", "(Lcom/kubi/flutter/proto/kline/OrderViewConfig;)V", "clearOrderView", "hasOrderView", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChartSetupConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22091b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChartSetupConfig.C12652b f22092a;

    /* JADX INFO: compiled from: ChartSetupConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ChartSetupConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ChartSetupConfigKt$Dsl _create(ChartSetupConfig.C12652b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ChartSetupConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ChartSetupConfigKt$Dsl(ChartSetupConfig.C12652b c12652b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12652b);
    }

    public ChartSetupConfigKt$Dsl(ChartSetupConfig.C12652b c12652b) {
        this.f22092a = c12652b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChartSetupConfig m23934a() {
        ChartSetupConfig chartSetupConfigBuild = this.f22092a.build();
        Intrinsics.checkNotNullExpressionValue(chartSetupConfigBuild, "build(...)");
        return chartSetupConfigBuild;
    }

    @JvmName(name = "setCandleView")
    /* JADX INFO: renamed from: b */
    public final void m23935b(@NotNull CandleViewConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22092a.m23930a(value);
    }

    @JvmName(name = "setOrderView")
    /* JADX INFO: renamed from: c */
    public final void m23936c(@NotNull OrderViewConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22092a.m23931b(value);
    }

    @JvmName(name = "setSelectPad")
    /* JADX INFO: renamed from: d */
    public final void m23937d(@NotNull SelectPadConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22092a.m23932c(value);
    }

    @JvmName(name = "setVolume")
    /* JADX INFO: renamed from: e */
    public final void m23938e(@NotNull VolumeConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22092a.m23933d(value);
    }
}
