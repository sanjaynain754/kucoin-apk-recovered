package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\b\u0010\f¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/TestFlightConfig;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "version", "", "content", "testUrl", "isTestFlightInstalled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVersion", "()Ljava/lang/String;", "getContent", "getTestUrl", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/TestFlightConfig;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/TestFlightConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final /* data */ class TestFlightConfig implements WritableMapSerializable {

    @Nullable
    private final String content;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final Boolean isTestFlightInstalled;

    @Nullable
    private final String testUrl;

    @Nullable
    private final String version;

    public TestFlightConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestFlightConfig)) {
            return false;
        }
        TestFlightConfig testFlightConfig = (TestFlightConfig) other;
        return Intrinsics.areEqual(this.enable, testFlightConfig.enable) && Intrinsics.areEqual(this.version, testFlightConfig.version) && Intrinsics.areEqual(this.content, testFlightConfig.content) && Intrinsics.areEqual(this.testUrl, testFlightConfig.testUrl) && Intrinsics.areEqual(this.isTestFlightInstalled, testFlightConfig.isTestFlightInstalled);
    }

    public TestFlightConfig(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool2) {
        this.enable = bool;
        this.version = str;
        this.content = str2;
        this.testUrl = str3;
        this.isTestFlightInstalled = bool2;
    }

    public static /* synthetic */ TestFlightConfig copy$default(TestFlightConfig testFlightConfig, Boolean bool, String str, String str2, String str3, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = testFlightConfig.enable;
        }
        if ((i11 & 2) != 0) {
            str = testFlightConfig.version;
        }
        if ((i11 & 4) != 0) {
            str2 = testFlightConfig.content;
        }
        if ((i11 & 8) != 0) {
            str3 = testFlightConfig.testUrl;
        }
        if ((i11 & 16) != 0) {
            bool2 = testFlightConfig.isTestFlightInstalled;
        }
        Boolean bool3 = bool2;
        String str4 = str2;
        return testFlightConfig.copy(bool, str, str4, str3, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTestUrl() {
        return this.testUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsTestFlightInstalled() {
        return this.isTestFlightInstalled;
    }

    @NotNull
    public final TestFlightConfig copy(@Nullable Boolean enable, @Nullable String version, @Nullable String content, @Nullable String testUrl, @Nullable Boolean isTestFlightInstalled) {
        return new TestFlightConfig(enable, version, content, testUrl, isTestFlightInstalled);
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getTestUrl() {
        return this.testUrl;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        Boolean bool = this.enable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.testUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.isTestFlightInstalled;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTestFlightInstalled() {
        return this.isTestFlightInstalled;
    }

    @NotNull
    public String toString() {
        return "TestFlightConfig(enable=" + this.enable + ", version=" + this.version + ", content=" + this.content + ", testUrl=" + this.testUrl + ", isTestFlightInstalled=" + this.isTestFlightInstalled + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Boolean bool = this.enable;
        if (bool != null) {
            writableMapCreateMap.putBoolean(BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, bool.booleanValue());
        }
        String str = this.version;
        if (str != null) {
            writableMapCreateMap.putString("version", str.toString());
        }
        String str2 = this.content;
        if (str2 != null) {
            writableMapCreateMap.putString("content", str2.toString());
        }
        String str3 = this.testUrl;
        if (str3 != null) {
            writableMapCreateMap.putString("testUrl", str3.toString());
        }
        Boolean bool2 = this.isTestFlightInstalled;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("isTestFlightInstalled", bool2.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ TestFlightConfig(Boolean bool, String str, String str2, String str3, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bool2);
    }
}
