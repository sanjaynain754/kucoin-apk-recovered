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
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/SoundSettingStateItem;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "settingKey", "", "enabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getSettingKey", "()Ljava/lang/String;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/SoundSettingStateItem;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/SoundSettingStateItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final /* data */ class SoundSettingStateItem implements WritableMapSerializable {

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final String settingKey;

    /* JADX WARN: Multi-variable type inference failed */
    public SoundSettingStateItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoundSettingStateItem)) {
            return false;
        }
        SoundSettingStateItem soundSettingStateItem = (SoundSettingStateItem) other;
        return Intrinsics.areEqual(this.settingKey, soundSettingStateItem.settingKey) && Intrinsics.areEqual(this.enabled, soundSettingStateItem.enabled);
    }

    public SoundSettingStateItem(@Nullable String str, @Nullable Boolean bool) {
        this.settingKey = str;
        this.enabled = bool;
    }

    public static /* synthetic */ SoundSettingStateItem copy$default(SoundSettingStateItem soundSettingStateItem, String str, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = soundSettingStateItem.settingKey;
        }
        if ((i11 & 2) != 0) {
            bool = soundSettingStateItem.enabled;
        }
        return soundSettingStateItem.copy(str, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSettingKey() {
        return this.settingKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final SoundSettingStateItem copy(@Nullable String settingKey, @Nullable Boolean enabled) {
        return new SoundSettingStateItem(settingKey, enabled);
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getSettingKey() {
        return this.settingKey;
    }

    public int hashCode() {
        String str = this.settingKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enabled;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SoundSettingStateItem(settingKey=" + this.settingKey + ", enabled=" + this.enabled + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.settingKey;
        if (str != null) {
            writableMapCreateMap.putString("settingKey", str.toString());
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            writableMapCreateMap.putBoolean("enabled", bool.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ SoundSettingStateItem(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool);
    }
}
