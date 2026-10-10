package com.kubi.sdk.pkg.bundle;

import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.pkg.bundle.p */
/* JADX INFO: compiled from: FetchBundleTracker.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/p;", "", "<init>", "()V", "", "isSuccess", "", "dur", "", "bundleName", "bundleVersion", "", "bundleOrigin", Constants.IPC_BUNDLE_KEY_SEND_ERROR, JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ZJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C23956p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C23956p f47349a = new C23956p();

    /* JADX INFO: renamed from: a */
    public final void m57604a(boolean isSuccess, long dur, @NotNull String bundleName, @Nullable String bundleVersion, int bundleOrigin, @Nullable String error, @Nullable String extra) throws JSONException {
        Intrinsics.checkNotNullParameter(bundleName, "bundleName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "FetchBundle");
        jSONObject.put("dur", dur);
        if (error == null) {
            error = "";
        }
        jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, error);
        jSONObject.put("is_success", isSuccess);
        jSONObject.put("bundle_name", bundleName);
        if (bundleVersion == null) {
            bundleVersion = "";
        }
        jSONObject.put("bundle_version", bundleVersion);
        jSONObject.put("bundle_origin", bundleOrigin);
        jSONObject.put("is_subpackage", false);
        if (extra == null) {
            extra = "";
        }
        jSONObject.put(JAnalysisConstants.ACCOUNT_EXTRA_ATTR, extra);
        C43852m.m96605q("krn_fetch_bundle", jSONObject);
    }
}
