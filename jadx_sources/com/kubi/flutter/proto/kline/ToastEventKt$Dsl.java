package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ToastEventKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ToastEventKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/ToastEvent$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/ToastEvent$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/ToastEvent;", "value", "", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "clearContent", "", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ToastEventKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22205b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ToastEvent.C12725b f22206a;

    /* JADX INFO: compiled from: ToastEventKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ToastEventKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ToastEventKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/ToastEvent$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ToastEventKt$Dsl _create(ToastEvent.C12725b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ToastEventKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ToastEventKt$Dsl(ToastEvent.C12725b c12725b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12725b);
    }

    public ToastEventKt$Dsl(ToastEvent.C12725b c12725b) {
        this.f22206a = c12725b;
    }
}
