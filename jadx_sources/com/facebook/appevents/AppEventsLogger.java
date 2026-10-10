package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.AccessToken;
import com.kubi.kyc.KycKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppEventsLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0015\u0016B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0017"}, m90084d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "Landroid/content/Context;", "context", "", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", "b", "(Ljava/lang/String;Landroid/os/Bundle;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "loggerImpl", "Companion", "FlushBehavior", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AppEventsLogger {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final String f7648c = AppEventsLogger.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AppEventsLoggerImpl loggerImpl;

    /* JADX INFO: compiled from: AppEventsLogger.kt */
    @Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007J\b\u0010\u0014\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\b\u0010\u0018\u001a\u00020\u0004H\u0007J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\b\u0010\u001f\u001a\u00020\nH\u0007J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0017H\u0007J\u0012\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0007Jl\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00042\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, m90084d2 = {"Lcom/facebook/appevents/AppEventsLogger$Companion;", "", "()V", "ACTION_APP_EVENTS_FLUSHED", "", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "TAG", "kotlin.jvm.PlatformType", "activateApp", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "applicationId", "augmentWebView", "webView", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "clearUserData", "clearUserID", "getAnonymousAppDeviceGUID", "getFlushBehavior", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getUserData", "getUserID", "initializeLib", "newLogger", "Lcom/facebook/appevents/AppEventsLogger;", "accessToken", "Lcom/facebook/AccessToken;", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", "referrer", "setPushNotificationsRegistrationId", "registrationId", "setUserData", "email", KycKey.firstName, KycKey.lastName, HintConstants.AUTOFILL_HINT_PHONE, "dateOfBirth", HintConstants.AUTOFILL_HINT_GENDER, "city", "state", "zip", "country", "setUserID", "userID", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void activateApp(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            AppEventsLoggerImpl.INSTANCE.activateApp(application, null);
        }

        @JvmStatic
        public final void clearUserID() {
            C5504a.m7905g(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        public Companion() {
        }

        @JvmStatic
        public final void activateApp(@NotNull Application application, @Nullable String applicationId) {
            Intrinsics.checkNotNullParameter(application, "application");
            AppEventsLoggerImpl.INSTANCE.activateApp(application, applicationId);
        }

        @JvmStatic
        @NotNull
        public final String getAnonymousAppDeviceGUID(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppEventsLoggerImpl.INSTANCE.getAnonymousAppDeviceGUID(context);
        }

        @JvmStatic
        @Nullable
        public final FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.INSTANCE.getFlushBehavior();
        }

        @JvmStatic
        public final void initializeLib(@NotNull Context context, @Nullable String applicationId) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppEventsLoggerImpl.INSTANCE.initializeLib(context, applicationId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, null, accessToken, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public final void onContextStop() {
            AppEventsLoggerImpl.INSTANCE.onContextStop();
        }

        @JvmStatic
        public final void setFlushBehavior(@NotNull FlushBehavior flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            AppEventsLoggerImpl.INSTANCE.setFlushBehavior(flushBehavior);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void setInstallReferrer(@Nullable String referrer) {
            AppEventsLoggerImpl.INSTANCE.setInstallReferrer(referrer);
        }

        @JvmStatic
        public final void setPushNotificationsRegistrationId(@Nullable String registrationId) {
            AppEventsLoggerImpl.INSTANCE.setPushNotificationsRegistrationId(registrationId);
        }

        @JvmStatic
        public final void augmentWebView(@NotNull WebView webView, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            AppEventsLoggerImpl.INSTANCE.augmentWebView(webView, context);
        }

        @JvmStatic
        public final void clearUserData() {
            C5524d.m8091d();
        }

        @JvmStatic
        @NotNull
        public final String getUserData() {
            return C5524d.m8094h();
        }

        @JvmStatic
        @Nullable
        public final String getUserID() {
            return C5504a.m7902c();
        }

        @JvmStatic
        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable String applicationId, @Nullable AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, applicationId, accessToken, null);
        }

        @JvmStatic
        public final void setUserData(@Nullable String email, @Nullable String firstName, @Nullable String lastName, @Nullable String phone, @Nullable String dateOfBirth, @Nullable String gender, @Nullable String city, @Nullable String state, @Nullable String zip, @Nullable String country) {
            C5524d.m8098o(email, firstName, lastName, phone, dateOfBirth, gender, city, state, zip, country);
        }

        @JvmStatic
        public final void setUserID(@Nullable String userID) {
            C5504a.m7905g(userID);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final AppEventsLogger newLogger(@NotNull Context context, @Nullable String applicationId) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, applicationId, null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: AppEventsLogger.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    public AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new AppEventsLoggerImpl(context, str, accessToken);
    }

    /* JADX INFO: renamed from: a */
    public final void m7840a() {
        this.loggerImpl.m7856m();
    }

    /* JADX INFO: renamed from: b */
    public final void m7841b(@Nullable String eventName, @Nullable Bundle parameters) {
        this.loggerImpl.m7859p(eventName, parameters);
    }
}
