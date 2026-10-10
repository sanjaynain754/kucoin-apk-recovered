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
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/LanguageItem;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "type", "", "name", "bundle", "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getName", "getBundle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/LanguageItem;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/LanguageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
public final /* data */ class LanguageItem implements WritableMapSerializable {

    @Nullable
    private final String bundle;

    @Nullable
    private final Boolean isDefault;

    @Nullable
    private final String name;

    @Nullable
    private final String type;

    public LanguageItem() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanguageItem)) {
            return false;
        }
        LanguageItem languageItem = (LanguageItem) other;
        return Intrinsics.areEqual(this.type, languageItem.type) && Intrinsics.areEqual(this.name, languageItem.name) && Intrinsics.areEqual(this.bundle, languageItem.bundle) && Intrinsics.areEqual(this.isDefault, languageItem.isDefault);
    }

    public LanguageItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        this.type = str;
        this.name = str2;
        this.bundle = str3;
        this.isDefault = bool;
    }

    public static /* synthetic */ LanguageItem copy$default(LanguageItem languageItem, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = languageItem.type;
        }
        if ((i11 & 2) != 0) {
            str2 = languageItem.name;
        }
        if ((i11 & 4) != 0) {
            str3 = languageItem.bundle;
        }
        if ((i11 & 8) != 0) {
            bool = languageItem.isDefault;
        }
        return languageItem.copy(str, str2, str3, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    @NotNull
    public final LanguageItem copy(@Nullable String type, @Nullable String name, @Nullable String bundle, @Nullable Boolean isDefault) {
        return new LanguageItem(type, name, bundle, isDefault);
    }

    @Nullable
    public final String getBundle() {
        return this.bundle;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bundle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefault;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDefault() {
        return this.isDefault;
    }

    @NotNull
    public String toString() {
        return "LanguageItem(type=" + this.type + ", name=" + this.name + ", bundle=" + this.bundle + ", isDefault=" + this.isDefault + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.type;
        if (str != null) {
            writableMapCreateMap.putString("type", str.toString());
        }
        String str2 = this.name;
        if (str2 != null) {
            writableMapCreateMap.putString("name", str2.toString());
        }
        String str3 = this.bundle;
        if (str3 != null) {
            writableMapCreateMap.putString("bundle", str3.toString());
        }
        Boolean bool = this.isDefault;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isDefault", bool.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ LanguageItem(String str, String str2, String str3, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool);
    }
}
