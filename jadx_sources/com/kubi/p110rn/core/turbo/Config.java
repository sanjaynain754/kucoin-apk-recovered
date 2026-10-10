package com.kubi.p110rn.core.turbo;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeKrnSocketTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/Config;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "topic", "", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getTopic", "()Ljava/lang/String;", "getExtra", "()Ljava/lang/Object;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeKrnSocketTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeKrnSocketTurboModule.kt\ncom/kubi/rn/core/turbo/Config\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final /* data */ class Config implements WritableMapSerializable {

    @Nullable
    private final Object extra;

    @Nullable
    private final String topic;

    /* JADX WARN: Multi-variable type inference failed */
    public Config() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.topic, config.topic) && Intrinsics.areEqual(this.extra, config.extra);
    }

    public Config(@Nullable String str, @Nullable Object obj) {
        this.topic = str;
        this.extra = obj;
    }

    public static /* synthetic */ Config copy$default(Config config, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = config.topic;
        }
        if ((i11 & 2) != 0) {
            obj = config.extra;
        }
        return config.copy(str, obj);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getExtra() {
        return this.extra;
    }

    @NotNull
    public final Config copy(@Nullable String topic, @Nullable Object extra) {
        return new Config(topic, extra);
    }

    @Nullable
    public final Object getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        String str = this.topic;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.extra;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Config(topic=" + this.topic + ", extra=" + this.extra + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.topic;
        if (str != null) {
            writableMapCreateMap.putString("topic", str.toString());
        }
        Object obj = this.extra;
        if (obj != null) {
            writableMapCreateMap.putString(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, obj.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ Config(String str, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : obj);
    }
}
