package com.kubi.sdk.site.rebirth;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.exception.SiteMessage;
import com.kubi.sdk.site.helper.ActivityHelper;
import com.kubi.user.config.UserInfo;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import o00.C42911a;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AppRebirth.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\r\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0017J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/site/rebirth/AppRebirth;", "", "<init>", "()V", "TAG", "", "KEY_APP_REBIRTH", "KEY_THEME_MODE", "KEY_USER_STATE", "KEY_USER_STATE_CHECK", "KEY_PATH", "KEY_TARGET_SITE", "KEY_MAIN_PROCESS_PID", "startRebirth", "", "bundle", "Landroid/os/Bundle;", "isFromRebirth", "", "isFromRebirth$LSite_googleRelease", "activity", "Landroid/app/Activity;", "recoverUserFastLoginState", "recoverUserFastLoginState$LSite_googleRelease", "getRebirthPath", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppRebirth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRebirth.kt\ncom/kubi/sdk/site/rebirth/AppRebirth\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,134:1\n45#2,3:135\n50#2,3:142\n47#3,4:138\n*S KotlinDebug\n*F\n+ 1 AppRebirth.kt\ncom/kubi/sdk/site/rebirth/AppRebirth\n*L\n64#1:135,3\n119#1:142,3\n112#1:138,4\n*E\n"})
public final class AppRebirth {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppRebirth f47935a = new AppRebirth();

    /* JADX INFO: renamed from: com.kubi.sdk.site.rebirth.AppRebirth$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AppRebirth.kt\ncom/kubi/sdk/site/rebirth/AppRebirth\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,49:1\n112#2:50\n45#3,3:51\n*S KotlinDebug\n*F\n+ 1 AppRebirth.kt\ncom/kubi/sdk/site/rebirth/AppRebirth\n*L\n112#1:51,3\n*E\n"})
    public static final class C24164a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("SiteConfig::AppRebirth", exception);
            C43846g.m96568c(new SiteException(exception, "SiteConfig::AppRebirth", false, null, 8, null), null, 2, null);
        }

        public C24164a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58166a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return RouteExKt.m56282x(intent, "app_rebirth_path", "home");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m58167b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.getIntent().getBooleanExtra("app_rebirth", false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58168c() {
        Activity activityM58095b = ActivityHelper.f47910a.m58095b();
        if (activityM58095b == null) {
            return false;
        }
        return m58167b(activityM58095b);
    }

    /* JADX INFO: renamed from: d */
    public final void m58169d() {
        Activity activityM58095b = ActivityHelper.f47910a.m58095b();
        if (activityM58095b != null && m58167b(activityM58095b)) {
            int intExtra = activityM58095b.getIntent().getIntExtra("app_rebirth_user_state", -1);
            String stringExtra = activityM58095b.getIntent().getStringExtra("app_rebirth_user_check");
            try {
                UserInfo.LoginState loginState = (UserInfo.LoginState) UserInfo.LoginState.getEntries().get(intExtra);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("resetUserFastLoginState loginState:");
                sb2.append(loginState);
                sb2.append(" reset=");
                UserInfo.LoginState loginState2 = UserInfo.LoginState.Login;
                sb2.append(loginState == loginState2);
                C44128b.m97266j("SiteConfig::AppRebirth", sb2.toString());
                if (loginState != loginState2) {
                    return;
                }
                String str = UserInfo.c().token;
                if (str != null && str.length() != 0 && Intrinsics.areEqual(stringExtra, ByteString.INSTANCE.encodeUtf8(str).sha1().toString())) {
                    C41696j.m91104d(C41713n0.m91125a(new CoroutineName("refreshSession").plus(C42911a.m94120b()).plus(new C24164a(CoroutineExceptionHandler.INSTANCE))), null, null, new AppRebirth$recoverUserFastLoginState$1(null), 3, null);
                    return;
                }
                C44128b.m97261e("SiteConfig::AppRebirth", "resetUserFastLoginState fast login token failed");
                C43846g.m96568c(new SiteMessage("resetUserFastLoginState fast login token failed", "SiteConfig::AppRebirth", false, 4, null), null, 2, null);
            } catch (Exception e11) {
                C44128b.m97262f("SiteConfig::AppRebirth", "resetUserFastLoginState", e11);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58170e(@Nullable Bundle bundle) {
        try {
            Application application = BaseApplication.INSTANCE.get();
            Intent intent = new Intent(application, (Class<?>) AppRebirthEmptyActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("app_rebirth_main_process_pid", Process.myPid());
            intent.putExtra("app_rebirth_theme_mode", DayNightThemeManager.f28592a.m33187l());
            UserInfo userInfo = UserInfo.a;
            intent.putExtra("app_rebirth_user_state", userInfo.d().ordinal());
            String strL = userInfo.l();
            if (strL != null && strL.length() != 0) {
                intent.putExtra("app_rebirth_user_check", ByteString.INSTANCE.encodeUtf8(strL).sha1().toString());
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            application.startActivity(intent);
        } catch (Throwable th2) {
            C44128b.m97262f("SiteConfig::AppRebirth", "startRebirth failed", th2);
            C44128b.m97263g("SiteConfig::AppRebirth", th2);
            C43846g.m96568c(new SiteException(th2, "SiteConfig::AppRebirth", false, null, 8, null), null, 2, null);
        }
    }
}
