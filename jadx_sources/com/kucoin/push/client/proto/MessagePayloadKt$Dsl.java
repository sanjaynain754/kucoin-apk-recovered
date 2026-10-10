package com.kucoin.push.client.proto;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MessagePayloadKt.kt */
/* JADX INFO: loaded from: classes59.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m90084d2 = {"com/kucoin/push/client/proto/MessagePayloadKt$Dsl", "", "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;", "_builder", "<init>", "(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;", "b", "Companion", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MessagePayloadKt$Dsl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MessagePayloadProto$MessagePayload.C27282a _builder;

    /* JADX INFO: compiled from: MessagePayloadKt.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;", "builder", "Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;", "_create", "(Lcom/kucoin/push/client/proto/MessagePayloadProto$MessagePayload$a;)Lcom/kucoin/push/client/proto/MessagePayloadKt$Dsl;", "network-core-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ MessagePayloadKt$Dsl _create(MessagePayloadProto$MessagePayload.C27282a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new MessagePayloadKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ MessagePayloadKt$Dsl(MessagePayloadProto$MessagePayload.C27282a c27282a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27282a);
    }

    public MessagePayloadKt$Dsl(MessagePayloadProto$MessagePayload.C27282a c27282a) {
        this._builder = c27282a;
    }
}
