package com.tencent.bugly.common.meta;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.bugly.common.utils.StringUtil;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33791m7;
import com.tencent.bugly.proguard.C33843oh;
import com.tencent.bugly.proguard.C34025xh;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u0007\u0012\b\b\u0002\u0010\"\u001a\u00020\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010%\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\tJ\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\u0014\u001a\u00020\u0007J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010%\u001a\u00020\u0007HÆ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020(HÖ\u0001R\u0016\u0010\u001e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0016\u0010\u001f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0016\u0010 \u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0016\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u0016\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010+R\u0018\u0010$\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010+R\u0016\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\"\u0010,\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010*\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u00102\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, m90084d2 = {"Lcom/tencent/bugly/common/meta/UserMeta;", "", "other", "", "isSameUser", "isSameProduct", "isSameVersion", "", "uniqueID", "", "setUniqueID", "getUserSetUniqueID", "getUniqueID", "getModel", "value", "setModel", "getAppVersionMode", "setAppVersionMode", "cacheAppVersionMode", "equals", "toJSON", "component1", "component2", "component3", "component4", "component5", "Landroid/content/SharedPreferences;", "component6", "component7", "component8", "uin", "buildNumber", "appKey", RemoteConfigConstants.RequestFieldKey.APP_ID, RemoteConfigConstants.RequestFieldKey.APP_VERSION, "sharePreference", "crashSharedPreferences", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "copy", "toString", "", "hashCode", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "appChannel", "getAppChannel", "()Ljava/lang/String;", "setAppChannel", "(Ljava/lang/String;)V", "model", "appVersionMode", "Lcom/tencent/bugly/proguard/oh;", "uniqueIDHelper", "Lcom/tencent/bugly/proguard/oh;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;Ljava/lang/String;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final /* data */ class UserMeta {

    @NotNull
    private String appChannel;

    @JvmField
    @NotNull
    public String appId;

    @JvmField
    @NotNull
    public String appKey;

    @JvmField
    @NotNull
    public String appVersion;

    @NotNull
    private String appVersionMode;

    @JvmField
    @NotNull
    public String buildNumber;

    @JvmField
    @Nullable
    public SharedPreferences crashSharedPreferences;

    @NotNull
    private String model;

    @JvmField
    @NotNull
    public String sdkVersion;

    @JvmField
    @Nullable
    public SharedPreferences sharePreference;

    @JvmField
    @NotNull
    public String uin;

    @NotNull
    private String uniqueID;

    @NotNull
    private final C33843oh uniqueIDHelper;

    public UserMeta() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public UserMeta(@NotNull String uin, @NotNull String buildNumber, @NotNull String appKey, @NotNull String appId, @NotNull String appVersion, @Nullable SharedPreferences sharedPreferences, @Nullable SharedPreferences sharedPreferences2, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(uin, "uin");
        Intrinsics.checkNotNullParameter(buildNumber, "buildNumber");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.uin = uin;
        this.buildNumber = buildNumber;
        this.appKey = appKey;
        this.appId = appId;
        this.appVersion = appVersion;
        this.sharePreference = sharedPreferences;
        this.crashSharedPreferences = sharedPreferences2;
        this.sdkVersion = sdkVersion;
        this.appChannel = "";
        this.model = "unknown";
        this.uniqueID = "";
        this.appVersionMode = "";
        this.uniqueIDHelper = new C33843oh();
    }

    public static /* synthetic */ UserMeta copy$default(UserMeta userMeta, String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userMeta.uin;
        }
        if ((i11 & 2) != 0) {
            str2 = userMeta.buildNumber;
        }
        if ((i11 & 4) != 0) {
            str3 = userMeta.appKey;
        }
        if ((i11 & 8) != 0) {
            str4 = userMeta.appId;
        }
        if ((i11 & 16) != 0) {
            str5 = userMeta.appVersion;
        }
        if ((i11 & 32) != 0) {
            sharedPreferences = userMeta.sharePreference;
        }
        if ((i11 & 64) != 0) {
            sharedPreferences2 = userMeta.crashSharedPreferences;
        }
        if ((i11 & 128) != 0) {
            str6 = userMeta.sdkVersion;
        }
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        String str7 = str6;
        String str8 = str5;
        SharedPreferences sharedPreferences4 = sharedPreferences;
        return userMeta.copy(str, str2, str3, str4, str8, sharedPreferences4, sharedPreferences3, str7);
    }

    private final boolean isSameProduct(UserMeta other) {
        return Intrinsics.areEqual(this.appId, other.appId) && Intrinsics.areEqual(this.appKey, other.appKey);
    }

    private final boolean isSameUser(UserMeta other) {
        return Intrinsics.areEqual(this.uin, other.uin) && Intrinsics.areEqual(getUniqueID(), other.getUniqueID()) && Intrinsics.areEqual(this.model, other.model);
    }

    private final boolean isSameVersion(UserMeta other) {
        return Intrinsics.areEqual(this.appVersion, other.appVersion) && Intrinsics.areEqual(this.sdkVersion, other.sdkVersion) && Intrinsics.areEqual(getAppVersionMode(), other.getAppVersionMode()) && Intrinsics.areEqual(this.buildNumber, other.buildNumber);
    }

    public final void cacheAppVersionMode() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        if (this.appVersionMode.length() > 0) {
            SharedPreferences sharedPreferencesM74052d = C33791m7.m74052d();
            if (sharedPreferencesM74052d != null && (editorEdit = sharedPreferencesM74052d.edit()) != null && (editorPutString = editorEdit.putString("app_version_mode", this.appVersionMode)) != null) {
                editorPutString.apply();
            }
            Logger.INSTANCE.mo77130d(C33791m7.f70939e, "cache app_version_mode: " + this.appVersionMode);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUin() {
        return this.uin;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBuildNumber() {
        return this.buildNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SharedPreferences getSharePreference() {
        return this.sharePreference;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SharedPreferences getCrashSharedPreferences() {
        return this.crashSharedPreferences;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof UserMeta) {
            if (!Intrinsics.areEqual(other, Boolean.valueOf(this == other))) {
                UserMeta userMeta = (UserMeta) other;
                if (!isSameProduct(userMeta) || !isSameVersion(userMeta) || !isSameUser(userMeta)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final String getAppChannel() {
        return this.appChannel;
    }

    @NotNull
    public final String getAppVersionMode() {
        if (this.appVersionMode.length() > 0) {
            return this.appVersionMode;
        }
        SharedPreferences sharedPreferencesM74052d = C33791m7.m74052d();
        String str = "Unknown";
        if (sharedPreferencesM74052d != null) {
            String string = sharedPreferencesM74052d.getString("app_version_mode", "Unknown");
            if (string != null && string.length() > 0) {
                this.appVersionMode = string;
                str = string;
            }
            Logger.INSTANCE.mo77130d(C33791m7.f70939e, C34025xh.m75464a(new StringBuilder("get app_version_mode: "), this.appVersionMode, " from cache"));
        }
        return str;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getUniqueID() {
        String realUniqueID = this.uniqueIDHelper.m74457a(this.uniqueID, this.sharePreference, this.crashSharedPreferences);
        this.uniqueIDHelper.m74459b(realUniqueID, this.sharePreference, this.crashSharedPreferences);
        Intrinsics.checkNotNullExpressionValue(realUniqueID, "realUniqueID");
        return realUniqueID;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserSetUniqueID, reason: from getter */
    public final String getUniqueID() {
        return this.uniqueID;
    }

    public int hashCode() {
        int iHashCode = (this.appVersion.hashCode() + ((this.appId.hashCode() + ((this.appKey.hashCode() + ((this.buildNumber.hashCode() + (this.uin.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        SharedPreferences sharedPreferences = this.sharePreference;
        int iHashCode2 = (iHashCode + (sharedPreferences == null ? 0 : sharedPreferences.hashCode())) * 31;
        SharedPreferences sharedPreferences2 = this.crashSharedPreferences;
        return this.sdkVersion.hashCode() + ((iHashCode2 + (sharedPreferences2 != null ? sharedPreferences2.hashCode() : 0)) * 31);
    }

    public final void setAppChannel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appChannel = str;
    }

    public final void setModel(@Nullable String value) {
        if (value == null || value.length() == 0) {
            return;
        }
        this.model = value;
    }

    @NotNull
    public final String toJSON() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uin", this.uin);
            jSONObject.put("rdmuuid", this.buildNumber);
            jSONObject.put("app_key", this.appKey);
            jSONObject.put(ReportDataTable.COLUMN_PRODUCT_ID, this.appId);
            jSONObject.put("version", this.appVersion);
            jSONObject.put("deviceid", getUniqueID());
            jSONObject.put("sdk_ver", this.sdkVersion);
            jSONObject.put(C33556b3.f69078o2, C33714ie.m73408k().mo73419g());
            jSONObject.put("manu", C33714ie.f70270o.mo73413b());
            jSONObject.put("device", StringUtil.encode(getModel()));
            jSONObject.put("api_ver", "1");
            jSONObject.put("plugin_ver", "1");
            jSONObject.put("abfactor", "0");
            jSONObject.put("app_version_mode", getAppVersionMode());
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    @NotNull
    public String toString() {
        return "UserMeta(uin=" + this.uin + ", buildNumber=" + this.buildNumber + ", appKey=" + this.appKey + ", appId=" + this.appId + ", appVersion=" + this.appVersion + ", sharePreference=" + this.sharePreference + ", crashSharedPreferences=" + this.crashSharedPreferences + ", sdkVersion=" + this.sdkVersion + ')';
    }

    @NotNull
    public final UserMeta copy(@NotNull String uin, @NotNull String buildNumber, @NotNull String appKey, @NotNull String appId, @NotNull String appVersion, @Nullable SharedPreferences sharePreference, @Nullable SharedPreferences crashSharedPreferences, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(uin, "uin");
        Intrinsics.checkNotNullParameter(buildNumber, "buildNumber");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new UserMeta(uin, buildNumber, appKey, appId, appVersion, sharePreference, crashSharedPreferences, sdkVersion);
    }

    public final void setAppVersionMode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.appVersionMode = value;
    }

    public final void setUniqueID(@NotNull String uniqueID) {
        Intrinsics.checkNotNullParameter(uniqueID, "uniqueID");
        this.uniqueID = uniqueID;
    }

    public /* synthetic */ UserMeta(String str, String str2, String str3, String str4, String str5, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? null : sharedPreferences, (i11 & 64) != 0 ? null : sharedPreferences2, (i11 & 128) != 0 ? "4.4.7.8" : str6);
    }
}
