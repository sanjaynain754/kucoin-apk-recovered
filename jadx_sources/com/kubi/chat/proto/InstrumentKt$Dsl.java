package com.kubi.chat.proto;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InstrumentKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"com/kubi/chat/proto/InstrumentKt$Dsl", "", "Lcom/kubi/chat/proto/ImProtocol$Instrument$a;", "_builder", "<init>", "(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)V", "Lcom/kubi/chat/proto/ImProtocol$Instrument;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/proto/ImProtocol$Instrument;", "Lcom/kubi/chat/proto/ImProtocol$Instrument$a;", "Lcom/kubi/chat/proto/ImProtocol$InstrumentType;", "value", "getType", "()Lcom/kubi/chat/proto/ImProtocol$InstrumentType;", "b", "(Lcom/kubi/chat/proto/ImProtocol$InstrumentType;)V", "type", "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class InstrumentKt$Dsl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImProtocol$Instrument.C11383a _builder;

    /* JADX INFO: compiled from: InstrumentKt.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/proto/InstrumentKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/kubi/chat/proto/ImProtocol$Instrument$a;", "builder", "Lcom/kubi/chat/proto/InstrumentKt$Dsl;", "_create", "(Lcom/kubi/chat/proto/ImProtocol$Instrument$a;)Lcom/kubi/chat/proto/InstrumentKt$Dsl;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ InstrumentKt$Dsl _create(ImProtocol$Instrument.C11383a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new InstrumentKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ InstrumentKt$Dsl(ImProtocol$Instrument.C11383a c11383a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11383a);
    }

    public InstrumentKt$Dsl(ImProtocol$Instrument.C11383a c11383a) {
        this._builder = c11383a;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImProtocol$Instrument m20364a() {
        ImProtocol$Instrument imProtocol$InstrumentBuild = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(imProtocol$InstrumentBuild, "_builder.build()");
        return imProtocol$InstrumentBuild;
    }

    @JvmName(name = "setType")
    /* JADX INFO: renamed from: b */
    public final void m20365b(@NotNull ImProtocol$InstrumentType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20344a(value);
    }
}
