package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SourceApplicationInfo.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo;", "", "", "callingApplicationPackage", "", "isOpenedByAppLink", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Ljava/lang/String;", "getCallingApplicationPackage", "b", "Z", "()Z", "c", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class SourceApplicationInfo {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String callingApplicationPackage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isOpenedByAppLink;

    /* JADX INFO: compiled from: SourceApplicationInfo.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/appevents/internal/SourceApplicationInfo$Companion;", "", "()V", "CALL_APPLICATION_PACKAGE_KEY", "", "OPENED_BY_APP_LINK_KEY", "SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT", "clearSavedSourceApplicationInfoFromDisk", "", "getStoredSourceApplicatioInfo", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void clearSavedSourceApplicationInfoFromDisk() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        @JvmStatic
        @Nullable
        public final SourceApplicationInfo getStoredSourceApplicatioInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return null;
            }
            return new SourceApplicationInfo(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), defaultConstructorMarker);
        }
    }

    public /* synthetic */ SourceApplicationInfo(String str, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11);
    }

    public SourceApplicationInfo(String str, boolean z11) {
        this.callingApplicationPackage = str;
        this.isOpenedByAppLink = z11;
    }

    @NotNull
    public String toString() {
        String str = this.isOpenedByAppLink ? "Applink" : "Unclassified";
        if (this.callingApplicationPackage == null) {
            return str;
        }
        return str + '(' + this.callingApplicationPackage + ')';
    }

    /* JADX INFO: renamed from: a */
    public final void m8255a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C5501a.m7799m()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.callingApplicationPackage);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.isOpenedByAppLink);
        editorEdit.apply();
    }
}
