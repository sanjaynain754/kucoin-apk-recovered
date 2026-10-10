package com.kubi.flutter.proto.kline;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CandleItemKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010 \u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010$\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u0006)"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/CandleItem$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/CandleItem$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/CandleItem;", "value", "", "time", "getTime", "()J", "setTime", "(J)V", "clearTime", "", "", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "getOpen", "()D", "setOpen", "(D)V", "clearOpen", "close", "getClose", "setClose", "clearClose", "high", "getHigh", "setHigh", "clearHigh", "low", "getLow", "setLow", "clearLow", "volume", "getVolume", "setVolume", "clearVolume", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CandleItemKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22073b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CandleItem.C12640b f22074a;

    /* JADX INFO: compiled from: CandleItemKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/CandleItemKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/CandleItem$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ CandleItemKt$Dsl _create(CandleItem.C12640b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new CandleItemKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ CandleItemKt$Dsl(CandleItem.C12640b c12640b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12640b);
    }

    public CandleItemKt$Dsl(CandleItem.C12640b c12640b) {
        this.f22074a = c12640b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CandleItem m23903a() {
        CandleItem candleItemBuild = this.f22074a.build();
        Intrinsics.checkNotNullExpressionValue(candleItemBuild, "build(...)");
        return candleItemBuild;
    }

    @JvmName(name = "setClose")
    /* JADX INFO: renamed from: b */
    public final void m23904b(double d11) {
        this.f22074a.m23897a(d11);
    }

    @JvmName(name = "setHigh")
    /* JADX INFO: renamed from: c */
    public final void m23905c(double d11) {
        this.f22074a.m23898b(d11);
    }

    @JvmName(name = "setLow")
    /* JADX INFO: renamed from: d */
    public final void m23906d(double d11) {
        this.f22074a.m23899c(d11);
    }

    @JvmName(name = "setOpen")
    /* JADX INFO: renamed from: e */
    public final void m23907e(double d11) {
        this.f22074a.m23900d(d11);
    }

    @JvmName(name = "setTime")
    /* JADX INFO: renamed from: f */
    public final void m23908f(long j11) {
        this.f22074a.m23901e(j11);
    }

    @JvmName(name = "setVolume")
    /* JADX INFO: renamed from: g */
    public final void m23909g(double d11) {
        this.f22074a.m23902f(d11);
    }
}
