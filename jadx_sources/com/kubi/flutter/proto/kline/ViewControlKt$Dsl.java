package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewControlKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ViewControlKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/ViewControl$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/ViewControl$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/ViewControl;", "value", "Lcom/kubi/flutter/proto/kline/DataSourceConfig;", "sourceConfig", "getSourceConfig", "()Lcom/kubi/flutter/proto/kline/DataSourceConfig;", "setSourceConfig", "(Lcom/kubi/flutter/proto/kline/DataSourceConfig;)V", "clearSourceConfig", "", "hasSourceConfig", "", "Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "setupConfig", "getSetupConfig", "()Lcom/kubi/flutter/proto/kline/ChartSetupConfig;", "setSetupConfig", "(Lcom/kubi/flutter/proto/kline/ChartSetupConfig;)V", "clearSetupConfig", "hasSetupConfig", "Lcom/kubi/flutter/proto/kline/ChartViewConfig;", "viewConfig", "getViewConfig", "()Lcom/kubi/flutter/proto/kline/ChartViewConfig;", "setViewConfig", "(Lcom/kubi/flutter/proto/kline/ChartViewConfig;)V", "clearViewConfig", "hasViewConfig", "Lcom/kubi/flutter/proto/kline/PaintViewConfig;", "paintConfig", "getPaintConfig", "()Lcom/kubi/flutter/proto/kline/PaintViewConfig;", "setPaintConfig", "(Lcom/kubi/flutter/proto/kline/PaintViewConfig;)V", "clearPaintConfig", "hasPaintConfig", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ViewControlKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22217b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ViewControl.C12733b f22218a;

    /* JADX INFO: compiled from: ViewControlKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ViewControlKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ViewControlKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/ViewControl$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ViewControlKt$Dsl _create(ViewControl.C12733b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ViewControlKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ViewControlKt$Dsl(ViewControl.C12733b c12733b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12733b);
    }

    public ViewControlKt$Dsl(ViewControl.C12733b c12733b) {
        this.f22218a = c12733b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewControl m24056a() {
        ViewControl viewControlBuild = this.f22218a.build();
        Intrinsics.checkNotNullExpressionValue(viewControlBuild, "build(...)");
        return viewControlBuild;
    }

    @JvmName(name = "setPaintConfig")
    /* JADX INFO: renamed from: b */
    public final void m24057b(@NotNull PaintViewConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22218a.m24052a(value);
    }

    @JvmName(name = "setSetupConfig")
    /* JADX INFO: renamed from: c */
    public final void m24058c(@NotNull ChartSetupConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22218a.m24053b(value);
    }

    @JvmName(name = "setSourceConfig")
    /* JADX INFO: renamed from: d */
    public final void m24059d(@NotNull DataSourceConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22218a.m24054c(value);
    }

    @JvmName(name = "setViewConfig")
    /* JADX INFO: renamed from: e */
    public final void m24060e(@NotNull ChartViewConfig value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22218a.m24055d(value);
    }
}
