package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.C5501a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p464n6.C42757a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AppLinkManager.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m90084d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "g", "(Landroid/app/Activity;)V", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "intent", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/net/Uri;Landroid/content/Intent;)V", "", "d", "(Landroid/net/Uri;)Ljava/lang/String;", "c", "(Landroid/content/Intent;)Ljava/lang/String;", "key", "e", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "i", "(Landroid/app/Application;)V", "Landroid/content/SharedPreferences;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "f", "()Landroid/content/SharedPreferences;", "preferences", "b", "Companion", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AppLinkManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @Nullable
    public static volatile AppLinkManager f7956c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy preferences;

    /* JADX INFO: compiled from: AppLinkManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$Companion;", "", "()V", "APPLINK_DATA_KEY", "", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", "instance", "Lcom/facebook/appevents/internal/AppLinkManager;", "getInstance", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAppLinkManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppLinkManager.kt\ncom/facebook/appevents/internal/AppLinkManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final AppLinkManager getInstance() {
            AppLinkManager appLinkManagerM8233a = AppLinkManager.m8233a();
            if (appLinkManagerM8233a == null) {
                synchronized (this) {
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    if (!C5501a.m7768D()) {
                        return null;
                    }
                    AppLinkManager appLinkManagerM8233a2 = AppLinkManager.m8233a();
                    if (appLinkManagerM8233a2 == null) {
                        appLinkManagerM8233a2 = new AppLinkManager(defaultConstructorMarker);
                        AppLinkManager.m8234b(appLinkManagerM8233a2);
                    }
                    return appLinkManagerM8233a2;
                }
            }
            return appLinkManagerM8233a;
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.internal.AppLinkManager$a */
    /* JADX INFO: compiled from: AppLinkManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m90084d2 = {"com/facebook/appevents/internal/AppLinkManager$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "bundle", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C5538a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
            if (companion != null) {
                companion.m8239g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
            if (companion != null) {
                companion.m8239g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public /* synthetic */ AppLinkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AppLinkManager() {
        this.preferences = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.facebook.appevents.internal.AppLinkManager$preferences$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return C5501a.m7799m().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AppLinkManager m8233a() {
        if (C42757a.m93689d(AppLinkManager.class)) {
            return null;
        }
        try {
            return f7956c;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppLinkManager.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m8234b(AppLinkManager appLinkManager) {
        if (C42757a.m93689d(AppLinkManager.class)) {
            return;
        }
        try {
            f7956c = appLinkManager;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, AppLinkManager.class);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m8235c(@NotNull Intent intent) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m8236d(@NotNull Uri uri) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m8237e(@NotNull String key) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            return m8238f().getString(key, null);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final SharedPreferences m8238f() {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            Object value = this.preferences.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8239g(@NotNull Activity activity) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Uri data = activity.getIntent().getData();
                if (data == null) {
                    return;
                }
                Intent intent = activity.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
                m8240h(data, intent);
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8240h(@NotNull Uri uri, @NotNull Intent intent) {
        if (!C42757a.m93689d(this)) {
            try {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(intent, "intent");
                String strM8236d = m8236d(uri);
                if (strM8236d == null) {
                    strM8236d = m8235c(intent);
                }
                if (strM8236d != null) {
                    m8238f().edit().putString("campaign_ids", strM8236d).apply();
                }
            } catch (Throwable th2) {
                C42757a.m93687b(th2, this);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8241i(@NotNull Application application) {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            application.registerActivityLifecycleCallbacks(new C5538a());
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
