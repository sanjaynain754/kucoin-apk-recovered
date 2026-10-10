package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChartViewConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010!\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u001a8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChartViewConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/ChartViewConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/ChartViewConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/ChartViewConfig;", "value", "Lcom/kubi/flutter/proto/kline/SwitchType;", "isLineView", "getIsLineView", "()Lcom/kubi/flutter/proto/kline/SwitchType;", "setIsLineView", "(Lcom/kubi/flutter/proto/kline/SwitchType;)V", "clearIsLineView", "", "Lcom/kubi/flutter/proto/kline/MainIndexTypes;", "mainView", "getMainView", "()Lcom/kubi/flutter/proto/kline/MainIndexTypes;", "setMainView", "(Lcom/kubi/flutter/proto/kline/MainIndexTypes;)V", "clearMainView", "hasMainView", "", "Lcom/kubi/flutter/proto/kline/SubIndexTypes;", "subView", "getSubView", "()Lcom/kubi/flutter/proto/kline/SubIndexTypes;", "setSubView", "(Lcom/kubi/flutter/proto/kline/SubIndexTypes;)V", "clearSubView", "hasSubView", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChartViewConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22094b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChartViewConfig.C12654b f22095a;

    /* JADX INFO: compiled from: ChartViewConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChartViewConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ChartViewConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/ChartViewConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ChartViewConfigKt$Dsl _create(ChartViewConfig.C12654b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ChartViewConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ChartViewConfigKt$Dsl(ChartViewConfig.C12654b c12654b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12654b);
    }

    public ChartViewConfigKt$Dsl(ChartViewConfig.C12654b c12654b) {
        this.f22095a = c12654b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChartViewConfig m23942a() {
        ChartViewConfig chartViewConfigBuild = this.f22095a.build();
        Intrinsics.checkNotNullExpressionValue(chartViewConfigBuild, "build(...)");
        return chartViewConfigBuild;
    }

    @JvmName(name = "setIsLineView")
    /* JADX INFO: renamed from: b */
    public final void m23943b(@NotNull SwitchType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22095a.m23939a(value);
    }

    @JvmName(name = "setMainView")
    /* JADX INFO: renamed from: c */
    public final void m23944c(@NotNull MainIndexTypes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22095a.m23940b(value);
    }

    @JvmName(name = "setSubView")
    /* JADX INFO: renamed from: d */
    public final void m23945d(@NotNull SubIndexTypes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22095a.m23941c(value);
    }
}
