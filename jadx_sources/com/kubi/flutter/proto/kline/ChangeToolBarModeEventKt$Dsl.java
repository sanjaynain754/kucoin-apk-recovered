package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChangeToolBarModeEventKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEventKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;", "value", "Lcom/kubi/flutter/proto/kline/ToolBarType;", "type", "getType", "()Lcom/kubi/flutter/proto/kline/ToolBarType;", "setType", "(Lcom/kubi/flutter/proto/kline/ToolBarType;)V", "clearType", "", "", "isHidden", "getIsHidden", "()Z", "setIsHidden", "(Z)V", "clearIsHidden", "isLock", "getIsLock", "setIsLock", "clearIsLock", "isShowPaint", "getIsShowPaint", "setIsShowPaint", "clearIsShowPaint", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$SelectItemType;", "selectType", "getSelectType", "()Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$SelectItemType;", "setSelectType", "(Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$SelectItemType;)V", "clearSelectType", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChangeToolBarModeEventKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22088b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ChangeToolBarModeEvent.C12650b f22089a;

    /* JADX INFO: compiled from: ChangeToolBarModeEventKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEventKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ChangeToolBarModeEventKt$Dsl _create(ChangeToolBarModeEvent.C12650b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ChangeToolBarModeEventKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ChangeToolBarModeEventKt$Dsl(ChangeToolBarModeEvent.C12650b c12650b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12650b);
    }

    public ChangeToolBarModeEventKt$Dsl(ChangeToolBarModeEvent.C12650b c12650b) {
        this.f22089a = c12650b;
    }
}
