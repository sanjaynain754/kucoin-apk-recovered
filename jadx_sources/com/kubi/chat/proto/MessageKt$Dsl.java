package com.kubi.chat.proto;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessageKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001e"}, m90084d2 = {"com/kubi/chat/proto/MessageKt$Dsl", "", "Lcom/kubi/chat/proto/ImProtocol$Message$a;", "_builder", "<init>", "(Lcom/kubi/chat/proto/ImProtocol$Message$a;)V", "Lcom/kubi/chat/proto/ImProtocol$Message;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/proto/ImProtocol$Message;", "Lcom/kubi/chat/proto/ImProtocol$Message$a;", "", "value", "getFrom", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "from", "getTo", "d", TypedValues.TransitionType.S_TO, "Lcom/kubi/chat/proto/ImProtocol$MessageType;", "getType", "()Lcom/kubi/chat/proto/ImProtocol$MessageType;", "e", "(Lcom/kubi/chat/proto/ImProtocol$MessageType;)V", "type", "getContent", "b", "content", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class MessageKt$Dsl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImProtocol$Message.C11386a _builder;

    /* JADX INFO: compiled from: MessageKt.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/proto/MessageKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/kubi/chat/proto/ImProtocol$Message$a;", "builder", "Lcom/kubi/chat/proto/MessageKt$Dsl;", "_create", "(Lcom/kubi/chat/proto/ImProtocol$Message$a;)Lcom/kubi/chat/proto/MessageKt$Dsl;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ MessageKt$Dsl _create(ImProtocol$Message.C11386a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new MessageKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ MessageKt$Dsl(ImProtocol$Message.C11386a c11386a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11386a);
    }

    public MessageKt$Dsl(ImProtocol$Message.C11386a c11386a) {
        this._builder = c11386a;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImProtocol$Message m20366a() {
        ImProtocol$Message imProtocol$MessageBuild = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(imProtocol$MessageBuild, "_builder.build()");
        return imProtocol$MessageBuild;
    }

    @JvmName(name = "setContent")
    /* JADX INFO: renamed from: b */
    public final void m20367b(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20346a(value);
    }

    @JvmName(name = "setFrom")
    /* JADX INFO: renamed from: c */
    public final void m20368c(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20347b(value);
    }

    @JvmName(name = "setTo")
    /* JADX INFO: renamed from: d */
    public final void m20369d(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20348c(value);
    }

    @JvmName(name = "setType")
    /* JADX INFO: renamed from: e */
    public final void m20370e(@NotNull ImProtocol$MessageType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20349d(value);
    }
}
