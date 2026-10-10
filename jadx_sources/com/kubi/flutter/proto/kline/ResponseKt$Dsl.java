package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResponseKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/Response$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/Response$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/Response;", "value", "", "code", "getCode", "()I", "setCode", "(I)V", "clearCode", "", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "clearMessage", "hasMessage", "", "bodyCase", "Lcom/kubi/flutter/proto/kline/Response$BodyCase;", "getBodyCase", "()Lcom/kubi/flutter/proto/kline/Response$BodyCase;", "clearBody", "Companion", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ResponseKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22177b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Response.C12705b f22178a;

    /* JADX INFO: compiled from: ResponseKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/ResponseKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/Response$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ ResponseKt$Dsl _create(Response.C12705b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new ResponseKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ ResponseKt$Dsl(Response.C12705b c12705b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12705b);
    }

    public ResponseKt$Dsl(Response.C12705b c12705b) {
        this.f22178a = c12705b;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Response m24018a() {
        Response responseBuild = this.f22178a.build();
        Intrinsics.checkNotNullExpressionValue(responseBuild, "build(...)");
        return responseBuild;
    }

    @JvmName(name = "setCode")
    /* JADX INFO: renamed from: b */
    public final void m24019b(int i11) {
        this.f22178a.m24016a(i11);
    }

    @JvmName(name = "setMessage")
    /* JADX INFO: renamed from: c */
    public final void m24020c(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f22178a.m24017b(value);
    }
}
