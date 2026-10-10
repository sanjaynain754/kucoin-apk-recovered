package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.sdk.BaseActivity;
import java.util.Locale;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.Q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28415Q0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f57927a;

    /* JADX INFO: renamed from: a */
    public final void m69298a(SNSSession sNSSession) {
        SharedPreferences.Editor editorEdit = this.f57927a.edit();
        editorEdit.putString("sessionId", sNSSession.getSessionId());
        editorEdit.putString("url", sNSSession.getUrl());
        editorEdit.putString("locale", sNSSession.getLocale().toLanguageTag());
        editorEdit.putBoolean("isDebug", sNSSession.isDebug());
        editorEdit.putString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, sNSSession.getPackageName());
        editorEdit.putString("versionName", sNSSession.getVersionName());
        editorEdit.putInt("versionCode", sNSSession.getVersionCode());
        editorEdit.putInt(BaseActivity.THEME, sNSSession.getTheme());
        editorEdit.apply();
    }

    public C28415Q0(Context context) {
        this.f57927a = context.getSharedPreferences("sns_session_prefs", 0);
    }

    /* JADX INFO: renamed from: a */
    public final SNSSession m69297a() {
        String string;
        String string2;
        String string3;
        int i11;
        int i12;
        String string4 = this.f57927a.getString("sessionId", null);
        if (string4 == null || (string = this.f57927a.getString("url", null)) == null || (string2 = this.f57927a.getString("locale", null)) == null) {
            return null;
        }
        boolean z11 = this.f57927a.getBoolean("isDebug", false);
        String string5 = this.f57927a.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, null);
        if (string5 == null || (string3 = this.f57927a.getString("versionName", null)) == null || (i11 = this.f57927a.getInt("versionCode", -1)) == -1 || (i12 = this.f57927a.getInt(BaseActivity.THEME, -1)) == -1) {
            return null;
        }
        return new SNSSession(string4, string, Locale.forLanguageTag(string2), z11, string5, string3, i11, i12);
    }
}
