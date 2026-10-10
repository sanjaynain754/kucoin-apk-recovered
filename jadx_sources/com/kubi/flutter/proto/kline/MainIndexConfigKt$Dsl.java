package com.kubi.flutter.proto.kline;

import com.google.protobuf.kotlin.ProtoDslMarker;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainIndexConfigKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u0003123B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J%\u0010\u000e\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0011J&\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0087\n¢\u0006\u0002\b\u0013J+\u0010\u0014\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0007¢\u0006\u0002\b\u0017J,\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0087\n¢\u0006\u0002\b\u0018J.\u0010\u0019\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001cJ\u001d\u0010\u001d\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0002\b\u001eJ%\u0010\u000e\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0002\b\"J&\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0087\n¢\u0006\u0002\b#J+\u0010\u0014\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0007¢\u0006\u0002\b$J,\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0087\n¢\u0006\u0002\b%J.\u0010\u0019\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b&J\u001d\u0010\u001d\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\tH\u0007¢\u0006\u0002\b'J\u0006\u0010.\u001a\u00020\u000fJ\u0006\u0010/\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\rR$\u0010)\u001a\u00020(2\u0006\u0010\u0010\u001a\u00020(8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00064"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/MainIndexConfigKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/MainIndexConfig$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/MainIndexConfig$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/MainIndexConfig;", "ma", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/kubi/flutter/proto/kline/IndexItemConfig;", "Lcom/kubi/flutter/proto/kline/MainIndexConfigKt$Dsl$MaProxy;", "getMa", "()Lcom/google/protobuf/kotlin/DslList;", "add", "", "value", "addMa", "plusAssign", "plusAssignMa", "addAll", "values", "", "addAllMa", "plusAssignAllMa", "set", "index", "", "setMa", "clear", "clearMa", "ema", "Lcom/kubi/flutter/proto/kline/MainIndexConfigKt$Dsl$EmaProxy;", "getEma", "addEma", "plusAssignEma", "addAllEma", "plusAssignAllEma", "setEma", "clearEma", "Lcom/kubi/flutter/proto/kline/BollConfig;", "boll", "getBoll", "()Lcom/kubi/flutter/proto/kline/BollConfig;", "setBoll", "(Lcom/kubi/flutter/proto/kline/BollConfig;)V", "clearBoll", "hasBoll", "", "Companion", "MaProxy", "EmaProxy", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MainIndexConfigKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22128b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final MainIndexConfig.C12674b f22129a;

    /* JADX INFO: compiled from: MainIndexConfigKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/MainIndexConfigKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/MainIndexConfigKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/MainIndexConfig$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ MainIndexConfigKt$Dsl _create(MainIndexConfig.C12674b builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new MainIndexConfigKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ MainIndexConfigKt$Dsl(MainIndexConfig.C12674b c12674b, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12674b);
    }

    public MainIndexConfigKt$Dsl(MainIndexConfig.C12674b c12674b) {
        this.f22129a = c12674b;
    }
}
