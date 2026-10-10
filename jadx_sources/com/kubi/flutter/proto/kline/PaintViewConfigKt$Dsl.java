package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaintViewConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/PaintViewConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/PaintViewConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/PaintViewConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/PaintViewConfig;", "value", "Lcom/kubi/flutter/proto/kline/PaintFromType;", "fromType", "getFromType", "()Lcom/kubi/flutter/proto/kline/PaintFromType;", "setFromType", "(Lcom/kubi/flutter/proto/kline/PaintFromType;)V", "clearFromType", "", "Lcom/kubi/flutter/proto/kline/ToolBarClick;", "tooBarClick", "getTooBarClick", "()Lcom/kubi/flutter/proto/kline/ToolBarClick;", "setTooBarClick", "(Lcom/kubi/flutter/proto/kline/ToolBarClick;)V", "clearTooBarClick", "hasTooBarClick", "", "Lcom/kubi/flutter/proto/kline/AlertClickType;", "dropShapeType", "getDropShapeType", "()Lcom/kubi/flutter/proto/kline/AlertClickType;", "setDropShapeType", "(Lcom/kubi/flutter/proto/kline/AlertClickType;)V", "clearDropShapeType", "", "coinPairCode", "getCoinPairCode", "()Ljava/lang/String;", "setCoinPairCode", "(Ljava/lang/String;)V", "clearCoinPairCode", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaintViewConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22166b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PaintViewConfig.C12699b f22167a;

    /* JADX INFO: compiled from: PaintViewConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/PaintViewConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/PaintViewConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/PaintViewConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ PaintViewConfigKt$Dsl _create(PaintViewConfig.C12699b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new PaintViewConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ PaintViewConfigKt$Dsl(PaintViewConfig.C12699b c12699b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12699b);
    }

    public PaintViewConfigKt$Dsl(PaintViewConfig.C12699b c12699b) {
        this.f22167a = c12699b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PaintViewConfig m24002a() {
        PaintViewConfig paintViewConfigBuild = this.f22167a.build();
        Intrinsics.checkNotNullExpressionValue(paintViewConfigBuild, "build(...)");
        return paintViewConfigBuild;
    }

    @JvmName(name = "setCoinPairCode")
    /* JADX INFO: renamed from: b */
    public final void m24003b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22167a.m23998a(value);
    }

    @JvmName(name = "setDropShapeType")
    /* JADX INFO: renamed from: c */
    public final void m24004c(@NotNull AlertClickType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22167a.m23999b(value);
    }

    @JvmName(name = "setFromType")
    /* JADX INFO: renamed from: d */
    public final void m24005d(@NotNull PaintFromType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22167a.m24000c(value);
    }

    @JvmName(name = "setTooBarClick")
    /* JADX INFO: renamed from: e */
    public final void m24006e(@NotNull ToolBarClick value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22167a.m24001d(value);
    }
}
