package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaintGuideEventKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/PaintGuideEventKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/PaintGuideEvent$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/PaintGuideEvent$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/PaintGuideEvent;", "value", "Lcom/kubi/flutter/proto/kline/AlertType;", "type", "getType", "()Lcom/kubi/flutter/proto/kline/AlertType;", "setType", "(Lcom/kubi/flutter/proto/kline/AlertType;)V", "clearType", "", "", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "clearTitle", "content", "getContent", "setContent", "clearContent", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaintGuideEventKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22163b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PaintGuideEvent.C12697b f22164a;

    /* JADX INFO: compiled from: PaintGuideEventKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/PaintGuideEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/PaintGuideEventKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/PaintGuideEvent$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ PaintGuideEventKt$Dsl _create(PaintGuideEvent.C12697b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new PaintGuideEventKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ PaintGuideEventKt$Dsl(PaintGuideEvent.C12697b c12697b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12697b);
    }

    public PaintGuideEventKt$Dsl(PaintGuideEvent.C12697b c12697b) {
        this.f22164a = c12697b;
    }
}
