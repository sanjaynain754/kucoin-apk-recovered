package com.kubi.chat.proto;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.tencent.bugly.proguard.C33577c3;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProtocolHeaderKt.kt */
/* JADX INFO: loaded from: classes6.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 )2\u00020\u0001:\u00018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u000e\u001a\u00020\r*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\"\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010(\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R#\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t8G¢\u0006\u0006\u001a\u0004\b)\u0010*R$\u00101\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00104\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020,8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00107\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001b¨\u00069"}, m90084d2 = {"com/kubi/chat/proto/ProtocolHeaderKt$Dsl", "", "Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;", "_builder", "<init>", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;)V", "Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader;", "Lcom/google/protobuf/kotlin/DslMap;", "", "", "map", "", "c", "(Lcom/google/protobuf/kotlin/DslMap;Ljava/util/Map;)V", "Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;", "", "value", "getVersion", "()I", "k", "(I)V", "version", "getUniqueId", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "uniqueId", "getUid", "i", "uid", "getSid", "f", CmcdConfiguration.KEY_SESSION_ID, "Lcom/kubi/chat/proto/ImProtocol$ProtocolType;", "getType", "()Lcom/kubi/chat/proto/ImProtocol$ProtocolType;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lcom/kubi/chat/proto/ImProtocol$ProtocolType;)V", "type", "b", "()Lcom/google/protobuf/kotlin/DslMap;", "metadata", "", "getSeqId", "()J", "e", "(J)V", "seqId", "getTimestamp", "g", "timestamp", "getDeviceId", "d", C33577c3.f69334H, "Companion", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ProtocolHeaderKt$Dsl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ImProtocol$ProtocolHeader.C11391a _builder;

    /* JADX INFO: compiled from: ProtocolHeaderKt.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl$Companion;", "", "<init>", "()V", "Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;", "builder", "Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;", "_create", "(Lcom/kubi/chat/proto/ImProtocol$ProtocolHeader$a;)Lcom/kubi/chat/proto/ProtocolHeaderKt$Dsl;", "ImSDK_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ProtocolHeaderKt$Dsl _create(ImProtocol$ProtocolHeader.C11391a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ProtocolHeaderKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ProtocolHeaderKt$Dsl(ImProtocol$ProtocolHeader.C11391a c11391a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11391a);
    }

    public ProtocolHeaderKt$Dsl(ImProtocol$ProtocolHeader.C11391a c11391a) {
        this._builder = c11391a;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImProtocol$ProtocolHeader m20375a() {
        ImProtocol$ProtocolHeader imProtocol$ProtocolHeaderBuild = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(imProtocol$ProtocolHeaderBuild, "_builder.build()");
        return imProtocol$ProtocolHeaderBuild;
    }

    @JvmName(name = "getMetadataMap")
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DslMap m20376b() {
        Map<String, String> metadataMap = this._builder.getMetadataMap();
        Intrinsics.checkNotNullExpressionValue(metadataMap, "_builder.getMetadataMap()");
        return new DslMap(metadataMap);
    }

    @JvmName(name = "putAllMetadata")
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m20377c(DslMap dslMap, Map map) {
        Intrinsics.checkNotNullParameter(dslMap, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        this._builder.m20354a(map);
    }

    @JvmName(name = "setDeviceId")
    /* JADX INFO: renamed from: d */
    public final void m20378d(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20355b(value);
    }

    @JvmName(name = "setSeqId")
    /* JADX INFO: renamed from: e */
    public final void m20379e(long j11) {
        this._builder.m20356c(j11);
    }

    @JvmName(name = "setSid")
    /* JADX INFO: renamed from: f */
    public final void m20380f(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20357d(value);
    }

    @JvmName(name = "setTimestamp")
    /* JADX INFO: renamed from: g */
    public final void m20381g(long j11) {
        this._builder.m20358e(j11);
    }

    @JvmName(name = "setType")
    /* JADX INFO: renamed from: h */
    public final void m20382h(@NotNull ImProtocol$ProtocolType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20359f(value);
    }

    @JvmName(name = "setUid")
    /* JADX INFO: renamed from: i */
    public final void m20383i(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20360g(value);
    }

    @JvmName(name = "setUniqueId")
    /* JADX INFO: renamed from: j */
    public final void m20384j(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._builder.m20361h(value);
    }

    @JvmName(name = "setVersion")
    /* JADX INFO: renamed from: k */
    public final void m20385k(int i11) {
        this._builder.m20362i(i11);
    }
}
