package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataSourceConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/DataSourceConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/DataSourceConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/DataSourceConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/DataSourceConfig;", "value", "", "period", "getPeriod", "()I", "setPeriod", "(I)V", "clearPeriod", "", "precision", "getPrecision", "setPrecision", "clearPrecision", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DataSourceConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22100b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final DataSourceConfig.C12658b f22101a;

    /* JADX INFO: compiled from: DataSourceConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/DataSourceConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/DataSourceConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/DataSourceConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ DataSourceConfigKt$Dsl _create(DataSourceConfig.C12658b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new DataSourceConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ DataSourceConfigKt$Dsl(DataSourceConfig.C12658b c12658b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12658b);
    }

    public DataSourceConfigKt$Dsl(DataSourceConfig.C12658b c12658b) {
        this.f22101a = c12658b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DataSourceConfig m23948a() {
        DataSourceConfig dataSourceConfigBuild = this.f22101a.build();
        Intrinsics.checkNotNullExpressionValue(dataSourceConfigBuild, "build(...)");
        return dataSourceConfigBuild;
    }

    @JvmName(name = "setPeriod")
    /* JADX INFO: renamed from: b */
    public final void m23949b(int i11) {
        this.f22101a.m23946a(i11);
    }

    @JvmName(name = "setPrecision")
    /* JADX INFO: renamed from: c */
    public final void m23950c(int i11) {
        this.f22101a.m23947b(i11);
    }
}
