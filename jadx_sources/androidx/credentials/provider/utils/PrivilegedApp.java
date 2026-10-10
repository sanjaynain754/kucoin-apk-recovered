package androidx.credentials.provider.utils;

import android.os.Build;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PrivilegedApp.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Landroidx/credentials/provider/utils/PrivilegedApp;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "fingerprints", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "getPackageName", "()Ljava/lang/String;", "getFingerprints", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class PrivilegedApp {

    @NotNull
    private static final String ANDROID_TYPE_KEY = "android";

    @NotNull
    private static final String APPS_KEY = "apps";

    @NotNull
    private static final String APP_INFO_KEY = "info";

    @NotNull
    private static final String BUILD_KEY = "build";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String FINGERPRINT_KEY = "cert_fingerprint_sha256";

    @NotNull
    private static final String PACKAGE_NAME_KEY = "package_name";

    @NotNull
    private static final String SIGNATURES_KEY = "signatures";

    @NotNull
    private static final String TYPE_KEY = "type";

    @NotNull
    private static final String USER_BUILD_TYPE = "userdebug";

    @NotNull
    private static final String USER_DEBUG_KEY = "userdebug";

    @NotNull
    private final Set<String> fingerprints;

    @NotNull
    private final String packageName;

    /* JADX INFO: compiled from: PrivilegedApp.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Landroidx/credentials/provider/utils/PrivilegedApp$Companion;", "", "<init>", "()V", "PACKAGE_NAME_KEY", "", "SIGNATURES_KEY", "FINGERPRINT_KEY", "BUILD_KEY", "USER_DEBUG_KEY", "TYPE_KEY", "APP_INFO_KEY", "ANDROID_TYPE_KEY", "USER_BUILD_TYPE", "APPS_KEY", "extractPrivilegedApps", "", "Landroidx/credentials/provider/utils/PrivilegedApp;", "jsonObject", "Lorg/json/JSONObject;", "extractPrivilegedApps$credentials", "createFromJSONObject", "appInfoJsonObject", "filterUserDebug", "", "credentials"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final PrivilegedApp createFromJSONObject(@NotNull JSONObject appInfoJsonObject, boolean filterUserDebug) throws JSONException {
            Intrinsics.checkNotNullParameter(appInfoJsonObject, "appInfoJsonObject");
            JSONArray jSONArray = appInfoJsonObject.getJSONArray(PrivilegedApp.SIGNATURES_KEY);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (!filterUserDebug || !Intrinsics.areEqual("userdebug", jSONArray.getJSONObject(i11).optString(PrivilegedApp.BUILD_KEY)) || Intrinsics.areEqual("userdebug", Build.TYPE)) {
                    String string = jSONArray.getJSONObject(i11).getString(PrivilegedApp.FINGERPRINT_KEY);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    linkedHashSet.add(string);
                }
            }
            String string2 = appInfoJsonObject.getString(PrivilegedApp.PACKAGE_NAME_KEY);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return new PrivilegedApp(string2, linkedHashSet);
        }

        @JvmStatic
        @NotNull
        public final List<PrivilegedApp> extractPrivilegedApps$credentials(@NotNull JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray(PrivilegedApp.APPS_KEY);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                if (Intrinsics.areEqual(jSONObject.getString("type"), PrivilegedApp.ANDROID_TYPE_KEY)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(PrivilegedApp.APP_INFO_KEY);
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
                    arrayList.add(createFromJSONObject(jSONObject2, true));
                }
            }
            return arrayList;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivilegedApp)) {
            return false;
        }
        PrivilegedApp privilegedApp = (PrivilegedApp) other;
        return Intrinsics.areEqual(this.packageName, privilegedApp.packageName) && Intrinsics.areEqual(this.fingerprints, privilegedApp.fingerprints);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivilegedApp copy$default(PrivilegedApp privilegedApp, String str, Set set, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = privilegedApp.packageName;
        }
        if ((i11 & 2) != 0) {
            set = privilegedApp.fingerprints;
        }
        return privilegedApp.copy(str, set);
    }

    @JvmStatic
    @NotNull
    public static final PrivilegedApp createFromJSONObject(@NotNull JSONObject jSONObject, boolean z11) {
        return INSTANCE.createFromJSONObject(jSONObject, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final Set<String> component2() {
        return this.fingerprints;
    }

    @NotNull
    public final Set<String> getFingerprints() {
        return this.fingerprints;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.fingerprints.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrivilegedApp(packageName=" + this.packageName + ", fingerprints=" + this.fingerprints + ')';
    }

    public PrivilegedApp(@NotNull String packageName, @NotNull Set<String> fingerprints) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        this.packageName = packageName;
        this.fingerprints = fingerprints;
    }

    @NotNull
    public final PrivilegedApp copy(@NotNull String packageName, @NotNull Set<String> fingerprints) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        return new PrivilegedApp(packageName, fingerprints);
    }
}
