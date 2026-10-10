package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33556b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/DeviceInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", C33556b3.f69066l2, "", "isSimulator", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getBundleId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/DeviceInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCommonTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCommonTurboModule.kt\ncom/kubi/rn/core/turbo/DeviceInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public final /* data */ class DeviceInfo implements WritableMapSerializable {

    @Nullable
    private final String bundleId;

    @Nullable
    private final Boolean isSimulator;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.bundleId, deviceInfo.bundleId) && Intrinsics.areEqual(this.isSimulator, deviceInfo.isSimulator);
    }

    public DeviceInfo(@Nullable String str, @Nullable Boolean bool) {
        this.bundleId = str;
        this.isSimulator = bool;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = deviceInfo.bundleId;
        }
        if ((i11 & 2) != 0) {
            bool = deviceInfo.isSimulator;
        }
        return deviceInfo.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBundleId() {
        return this.bundleId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSimulator() {
        return this.isSimulator;
    }

    @NotNull
    public final DeviceInfo copy(@Nullable String bundleId, @Nullable Boolean isSimulator) {
        return new DeviceInfo(bundleId, isSimulator);
    }

    @Nullable
    public final String getBundleId() {
        return this.bundleId;
    }

    public int hashCode() {
        String str = this.bundleId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isSimulator;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isSimulator() {
        return this.isSimulator;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(bundleId=" + this.bundleId + ", isSimulator=" + this.isSimulator + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.bundleId;
        if (str != null) {
            writableMapCreateMap.putString(C33556b3.f69066l2, str.toString());
        }
        Boolean bool = this.isSimulator;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isSimulator", bool.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ DeviceInfo(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
    }
}
