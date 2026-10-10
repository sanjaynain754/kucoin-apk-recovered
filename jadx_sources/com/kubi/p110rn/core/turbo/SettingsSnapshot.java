package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSystemSettingsTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010'\u001a\u00020(H\u0016J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J°\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u000e\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006>"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/SettingsSnapshot;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "languageName", "", "currencyDetail", "cacheSizeText", "appThemeMode", "appThemeDetail", "upDownColor", "volumeUnitIndex", "", "volumeUnitNames", "", "volumeUnitDetail", "isLoggedIn", "", "supportSwitchAccount", "testFlightEnabled", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getLanguageName", "()Ljava/lang/String;", "getCurrencyDetail", "getCacheSizeText", "getAppThemeMode", "getAppThemeDetail", "getUpDownColor", "getVolumeUnitIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVolumeUnitNames", "()Ljava/util/List;", "getVolumeUnitDetail", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSupportSwitchAccount", "getTestFlightEnabled", "getAppVersion", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/SettingsSnapshot;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSystemSettingsTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/SettingsSnapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1#2:324\n1863#3,2:325\n*S KotlinDebug\n*F\n+ 1 NativeSystemSettingsTurboModule.kt\ncom/kubi/rn/core/turbo/SettingsSnapshot\n*L\n92#1:325,2\n*E\n"})
public final /* data */ class SettingsSnapshot implements WritableMapSerializable {

    @Nullable
    private final String appThemeDetail;

    @Nullable
    private final String appThemeMode;

    @Nullable
    private final String appVersion;

    @Nullable
    private final String cacheSizeText;

    @Nullable
    private final String currencyDetail;

    @Nullable
    private final Boolean isLoggedIn;

    @Nullable
    private final String languageName;

    @Nullable
    private final Boolean supportSwitchAccount;

    @Nullable
    private final Boolean testFlightEnabled;

    @Nullable
    private final String upDownColor;

    @Nullable
    private final String volumeUnitDetail;

    @Nullable
    private final Double volumeUnitIndex;

    @Nullable
    private final List<String> volumeUnitNames;

    public SettingsSnapshot() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingsSnapshot copy$default(SettingsSnapshot settingsSnapshot, String str, String str2, String str3, String str4, String str5, String str6, Double d11, List list, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = settingsSnapshot.languageName;
        }
        return settingsSnapshot.copy(str, (i11 & 2) != 0 ? settingsSnapshot.currencyDetail : str2, (i11 & 4) != 0 ? settingsSnapshot.cacheSizeText : str3, (i11 & 8) != 0 ? settingsSnapshot.appThemeMode : str4, (i11 & 16) != 0 ? settingsSnapshot.appThemeDetail : str5, (i11 & 32) != 0 ? settingsSnapshot.upDownColor : str6, (i11 & 64) != 0 ? settingsSnapshot.volumeUnitIndex : d11, (i11 & 128) != 0 ? settingsSnapshot.volumeUnitNames : list, (i11 & 256) != 0 ? settingsSnapshot.volumeUnitDetail : str7, (i11 & 512) != 0 ? settingsSnapshot.isLoggedIn : bool, (i11 & 1024) != 0 ? settingsSnapshot.supportSwitchAccount : bool2, (i11 & 2048) != 0 ? settingsSnapshot.testFlightEnabled : bool3, (i11 & 4096) != 0 ? settingsSnapshot.appVersion : str8);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsSnapshot)) {
            return false;
        }
        SettingsSnapshot settingsSnapshot = (SettingsSnapshot) other;
        return Intrinsics.areEqual(this.languageName, settingsSnapshot.languageName) && Intrinsics.areEqual(this.currencyDetail, settingsSnapshot.currencyDetail) && Intrinsics.areEqual(this.cacheSizeText, settingsSnapshot.cacheSizeText) && Intrinsics.areEqual(this.appThemeMode, settingsSnapshot.appThemeMode) && Intrinsics.areEqual(this.appThemeDetail, settingsSnapshot.appThemeDetail) && Intrinsics.areEqual(this.upDownColor, settingsSnapshot.upDownColor) && Intrinsics.areEqual((Object) this.volumeUnitIndex, (Object) settingsSnapshot.volumeUnitIndex) && Intrinsics.areEqual(this.volumeUnitNames, settingsSnapshot.volumeUnitNames) && Intrinsics.areEqual(this.volumeUnitDetail, settingsSnapshot.volumeUnitDetail) && Intrinsics.areEqual(this.isLoggedIn, settingsSnapshot.isLoggedIn) && Intrinsics.areEqual(this.supportSwitchAccount, settingsSnapshot.supportSwitchAccount) && Intrinsics.areEqual(this.testFlightEnabled, settingsSnapshot.testFlightEnabled) && Intrinsics.areEqual(this.appVersion, settingsSnapshot.appVersion);
    }

    public SettingsSnapshot(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Double d11, @Nullable List<String> list, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str8) {
        this.languageName = str;
        this.currencyDetail = str2;
        this.cacheSizeText = str3;
        this.appThemeMode = str4;
        this.appThemeDetail = str5;
        this.upDownColor = str6;
        this.volumeUnitIndex = d11;
        this.volumeUnitNames = list;
        this.volumeUnitDetail = str7;
        this.isLoggedIn = bool;
        this.supportSwitchAccount = bool2;
        this.testFlightEnabled = bool3;
        this.appVersion = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLanguageName() {
        return this.languageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getSupportSwitchAccount() {
        return this.supportSwitchAccount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getTestFlightEnabled() {
        return this.testFlightEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyDetail() {
        return this.currencyDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCacheSizeText() {
        return this.cacheSizeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppThemeMode() {
        return this.appThemeMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppThemeDetail() {
        return this.appThemeDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpDownColor() {
        return this.upDownColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getVolumeUnitIndex() {
        return this.volumeUnitIndex;
    }

    @Nullable
    public final List<String> component8() {
        return this.volumeUnitNames;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVolumeUnitDetail() {
        return this.volumeUnitDetail;
    }

    @NotNull
    public final SettingsSnapshot copy(@Nullable String languageName, @Nullable String currencyDetail, @Nullable String cacheSizeText, @Nullable String appThemeMode, @Nullable String appThemeDetail, @Nullable String upDownColor, @Nullable Double volumeUnitIndex, @Nullable List<String> volumeUnitNames, @Nullable String volumeUnitDetail, @Nullable Boolean isLoggedIn, @Nullable Boolean supportSwitchAccount, @Nullable Boolean testFlightEnabled, @Nullable String appVersion) {
        return new SettingsSnapshot(languageName, currencyDetail, cacheSizeText, appThemeMode, appThemeDetail, upDownColor, volumeUnitIndex, volumeUnitNames, volumeUnitDetail, isLoggedIn, supportSwitchAccount, testFlightEnabled, appVersion);
    }

    @Nullable
    public final String getAppThemeDetail() {
        return this.appThemeDetail;
    }

    @Nullable
    public final String getAppThemeMode() {
        return this.appThemeMode;
    }

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final String getCacheSizeText() {
        return this.cacheSizeText;
    }

    @Nullable
    public final String getCurrencyDetail() {
        return this.currencyDetail;
    }

    @Nullable
    public final String getLanguageName() {
        return this.languageName;
    }

    @Nullable
    public final Boolean getSupportSwitchAccount() {
        return this.supportSwitchAccount;
    }

    @Nullable
    public final Boolean getTestFlightEnabled() {
        return this.testFlightEnabled;
    }

    @Nullable
    public final String getUpDownColor() {
        return this.upDownColor;
    }

    @Nullable
    public final String getVolumeUnitDetail() {
        return this.volumeUnitDetail;
    }

    @Nullable
    public final Double getVolumeUnitIndex() {
        return this.volumeUnitIndex;
    }

    @Nullable
    public final List<String> getVolumeUnitNames() {
        return this.volumeUnitNames;
    }

    public int hashCode() {
        String str = this.languageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyDetail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cacheSizeText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appThemeMode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appThemeDetail;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.upDownColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d11 = this.volumeUnitIndex;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<String> list = this.volumeUnitNames;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.volumeUnitDetail;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.isLoggedIn;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supportSwitchAccount;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.testFlightEnabled;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.appVersion;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    @NotNull
    public String toString() {
        return "SettingsSnapshot(languageName=" + this.languageName + ", currencyDetail=" + this.currencyDetail + ", cacheSizeText=" + this.cacheSizeText + ", appThemeMode=" + this.appThemeMode + ", appThemeDetail=" + this.appThemeDetail + ", upDownColor=" + this.upDownColor + ", volumeUnitIndex=" + this.volumeUnitIndex + ", volumeUnitNames=" + this.volumeUnitNames + ", volumeUnitDetail=" + this.volumeUnitDetail + ", isLoggedIn=" + this.isLoggedIn + ", supportSwitchAccount=" + this.supportSwitchAccount + ", testFlightEnabled=" + this.testFlightEnabled + ", appVersion=" + this.appVersion + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.languageName;
        if (str != null) {
            writableMapCreateMap.putString("languageName", str.toString());
        }
        String str2 = this.currencyDetail;
        if (str2 != null) {
            writableMapCreateMap.putString("currencyDetail", str2.toString());
        }
        String str3 = this.cacheSizeText;
        if (str3 != null) {
            writableMapCreateMap.putString("cacheSizeText", str3.toString());
        }
        String str4 = this.appThemeMode;
        if (str4 != null) {
            writableMapCreateMap.putString("appThemeMode", str4.toString());
        }
        String str5 = this.appThemeDetail;
        if (str5 != null) {
            writableMapCreateMap.putString("appThemeDetail", str5.toString());
        }
        String str6 = this.upDownColor;
        if (str6 != null) {
            writableMapCreateMap.putString("upDownColor", str6.toString());
        }
        Double d11 = this.volumeUnitIndex;
        if (d11 != null) {
            writableMapCreateMap.putDouble("volumeUnitIndex", d11.doubleValue());
        }
        List<String> list = this.volumeUnitNames;
        if (list != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushString((String) it.next());
            }
            writableMapCreateMap.putArray("volumeUnitNames", writableArrayCreateArray);
        }
        String str7 = this.volumeUnitDetail;
        if (str7 != null) {
            writableMapCreateMap.putString("volumeUnitDetail", str7.toString());
        }
        Boolean bool = this.isLoggedIn;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isLoggedIn", bool.booleanValue());
        }
        Boolean bool2 = this.supportSwitchAccount;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("supportSwitchAccount", bool2.booleanValue());
        }
        Boolean bool3 = this.testFlightEnabled;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("testFlightEnabled", bool3.booleanValue());
        }
        String str8 = this.appVersion;
        if (str8 != null) {
            writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.APP_VERSION, str8.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ SettingsSnapshot(String str, String str2, String str3, String str4, String str5, String str6, Double d11, List list, String str7, Boolean bool, Boolean bool2, Boolean bool3, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : d11, (i11 & 128) != 0 ? null : list, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : bool2, (i11 & 2048) != 0 ? null : bool3, (i11 & 4096) != 0 ? null : str8);
    }
}
