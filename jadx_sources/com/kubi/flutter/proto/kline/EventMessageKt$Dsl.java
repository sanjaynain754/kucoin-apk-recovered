package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventMessageKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 P2\u00020\u0001:\u0001PB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010!\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0012J\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0012J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0012J\u0006\u0010I\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0012J\u0006\u0010O\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020+8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020C2\u0006\u0010\b\u001a\u00020C8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/EventMessageKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/EventMessage$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/EventMessage$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/EventMessage;", "value", "Lcom/kubi/flutter/proto/kline/StateEventType;", "stateEvent", "getStateEvent", "()Lcom/kubi/flutter/proto/kline/StateEventType;", "setStateEvent", "(Lcom/kubi/flutter/proto/kline/StateEventType;)V", "clearStateEvent", "", "hasStateEvent", "", "Lcom/kubi/flutter/proto/kline/LoadMoreEvent;", "loadMore", "getLoadMore", "()Lcom/kubi/flutter/proto/kline/LoadMoreEvent;", "setLoadMore", "(Lcom/kubi/flutter/proto/kline/LoadMoreEvent;)V", "clearLoadMore", "hasLoadMore", "Lcom/kubi/flutter/proto/kline/JumpOrderEvent;", "jumpEvent", "getJumpEvent", "()Lcom/kubi/flutter/proto/kline/JumpOrderEvent;", "setJumpEvent", "(Lcom/kubi/flutter/proto/kline/JumpOrderEvent;)V", "clearJumpEvent", "hasJumpEvent", "Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;", "confirmAlertEvent", "getConfirmAlertEvent", "()Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;", "setConfirmAlertEvent", "(Lcom/kubi/flutter/proto/kline/ConfirmAlerEvent;)V", "clearConfirmAlertEvent", "hasConfirmAlertEvent", "Lcom/kubi/flutter/proto/kline/ToastEvent;", "toastEvent", "getToastEvent", "()Lcom/kubi/flutter/proto/kline/ToastEvent;", "setToastEvent", "(Lcom/kubi/flutter/proto/kline/ToastEvent;)V", "clearToastEvent", "hasToastEvent", "Lcom/kubi/flutter/proto/kline/PaintGuideEvent;", "paintGuide", "getPaintGuide", "()Lcom/kubi/flutter/proto/kline/PaintGuideEvent;", "setPaintGuide", "(Lcom/kubi/flutter/proto/kline/PaintGuideEvent;)V", "clearPaintGuide", "hasPaintGuide", "Lcom/kubi/flutter/proto/kline/QuitLandscapeEvent;", "quitEvent", "getQuitEvent", "()Lcom/kubi/flutter/proto/kline/QuitLandscapeEvent;", "setQuitEvent", "(Lcom/kubi/flutter/proto/kline/QuitLandscapeEvent;)V", "clearQuitEvent", "hasQuitEvent", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;", "toolBarMode", "getToolBarMode", "()Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;", "setToolBarMode", "(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;)V", "clearToolBarMode", "hasToolBarMode", "eventTypeCase", "Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;", "getEventTypeCase", "()Lcom/kubi/flutter/proto/kline/EventMessage$EventTypeCase;", "clearEventType", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EventMessageKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22104b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final EventMessage.C12660b f22105a;

    /* JADX INFO: compiled from: EventMessageKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/EventMessageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/EventMessageKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/EventMessage$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ EventMessageKt$Dsl _create(EventMessage.C12660b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new EventMessageKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ EventMessageKt$Dsl(EventMessage.C12660b c12660b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12660b);
    }

    public EventMessageKt$Dsl(EventMessage.C12660b c12660b) {
        this.f22105a = c12660b;
    }
}
