package com.kubi.chat.proto;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProtocolFrameKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m90084d2 = {"com/kubi/chat/proto/ProtocolFrameKt$Dsl", "", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;", "_builder", "<init>", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;)V", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame;", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;", "Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;", "value", "getHeader", "()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;", "b", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;)V", "header", "Lcom/kubi/chat/proto/ImProtocol$Message;", "getMessage", "()Lcom/kubi/chat/proto/ImProtocol$Message;", "d", "(Lcom/kubi/chat/proto/ImProtocol$Message;)V", "message", "Lcom/kubi/chat/proto/ImProtocol$Instrument;", "getInstrument", "()Lcom/kubi/chat/proto/ImProtocol$Instrument;", "c", "(Lcom/kubi/chat/proto/ImProtocol$Instrument;)V", "instrument", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ProtocolFrameKt$Dsl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImProtocol$ProtocolFrame.C11390a _builder;

    /* JADX INFO: compiled from: ProtocolFrameKt.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;", "builder", "Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;", "_create", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolFrame$a;)Lcom/kubi/chat/proto/ProtocolFrameKt$Dsl;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ProtocolFrameKt$Dsl _create(ImProtocol$ProtocolFrame.C11390a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ProtocolFrameKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ProtocolFrameKt$Dsl(ImProtocol$ProtocolFrame.C11390a c11390a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11390a);
    }

    public ProtocolFrameKt$Dsl(ImProtocol$ProtocolFrame.C11390a c11390a) {
        this._builder = c11390a;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImProtocol$ProtocolFrame m20371a() {
        ImProtocol$ProtocolFrame imProtocol$ProtocolFrameBuild = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(imProtocol$ProtocolFrameBuild, "_builder.build()");
        return imProtocol$ProtocolFrameBuild;
    }

    @JvmName(name = "setHeader")
    /* JADX INFO: renamed from: b */
    public final void m20372b(@NotNull ImProtocol$ProtocolHeader value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20351a(value);
    }

    @JvmName(name = "setInstrument")
    /* JADX INFO: renamed from: c */
    public final void m20373c(@NotNull ImProtocol$Instrument value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20352b(value);
    }

    @JvmName(name = "setMessage")
    /* JADX INFO: renamed from: d */
    public final void m20374d(@NotNull ImProtocol$Message value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20353c(value);
    }
}
