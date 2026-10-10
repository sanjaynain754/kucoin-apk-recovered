package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/AppThemeInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "mode", "", "<init>", "(Ljava/lang/String;)V", "getMode", "()Ljava/lang/String;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/AppThemeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final /* data */ class AppThemeInfo implements WritableMapSerializable {

    @Nullable
    private final String mode;

    /* JADX WARN: Multi-variable type inference failed */
    public AppThemeInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppThemeInfo) && Intrinsics.areEqual(this.mode, ((AppThemeInfo) other).mode);
    }

    public AppThemeInfo(@Nullable String str) {
        this.mode = str;
    }

    public static /* synthetic */ AppThemeInfo copy$default(AppThemeInfo appThemeInfo, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appThemeInfo.mode;
        }
        return appThemeInfo.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @NotNull
    public final AppThemeInfo copy(@Nullable String mode) {
        return new AppThemeInfo(mode);
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    public int hashCode() {
        String str = this.mode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppThemeInfo(mode=" + this.mode + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.mode;
        if (str != null) {
            writableMapCreateMap.putString("mode", str.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ AppThemeInfo(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str);
    }
}
