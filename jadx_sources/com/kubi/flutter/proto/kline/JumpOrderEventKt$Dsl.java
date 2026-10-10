package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JumpOrderEventKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/JumpOrderEventKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/JumpOrderEvent$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/JumpOrderEvent$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/JumpOrderEvent;", "value", "Lcom/kubi/flutter/proto/kline/OrderItem;", "item", "getItem", "()Lcom/kubi/flutter/proto/kline/OrderItem;", "setItem", "(Lcom/kubi/flutter/proto/kline/OrderItem;)V", "clearItem", "", "hasItem", "", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumpOrderEventKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22110b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final JumpOrderEvent.C12664b f22111a;

    /* JADX INFO: compiled from: JumpOrderEventKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/JumpOrderEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/JumpOrderEventKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/JumpOrderEvent$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ JumpOrderEventKt$Dsl _create(JumpOrderEvent.C12664b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new JumpOrderEventKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ JumpOrderEventKt$Dsl(JumpOrderEvent.C12664b c12664b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12664b);
    }

    public JumpOrderEventKt$Dsl(JumpOrderEvent.C12664b c12664b) {
        this.f22111a = c12664b;
    }
}
