package com.kubi.sdk.site.helper;

import android.app.Activity;
import android.net.Uri;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.migration.SiteMigrationWebActivity;
import com.kubi.sdk.site.rebirth.ProcessRebirthActivity;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.utils.C27012a;
import gy.InterfaceC38056a;
import java.util.Iterator;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.site.helper.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ActivityHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\n\u0010\u000f\u001a\u00020\u0010*\u00020\u000bJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/sdk/site/helper/ActivityHelper;", "", "<init>", "()V", "NA_PAGE_REGISTER_CLASS_NAME", "", "isInSplashPage", "", "isLockOrSplashActivity", "isRegisterPage", "getLockActivity", "Landroid/app/Activity;", "getStartupActivity", "isInSiteMigrationPage", "isInSiteProcessRebirthPage", "setSystemUI", "", "isRegisterPageUrl", "url", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nActivityHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityHelper.kt\ncom/kubi/sdk/site/helper/ActivityHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,112:1\n295#2,2:113\n295#2,2:115\n29#3:117\n*S KotlinDebug\n*F\n+ 1 ActivityHelper.kt\ncom/kubi/sdk/site/helper/ActivityHelper\n*L\n56#1:113,2\n67#1:115,2\n105#1:117\n*E\n"})
public final class ActivityHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ActivityHelper f47910a = new ActivityHelper();

    /* JADX INFO: renamed from: h */
    public final boolean m58101h(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uri = Uri.parse(str);
            return Intrinsics.areEqual(uri.getQueryParameter(Constants.BIZ), "startup") && Intrinsics.areEqual(uri.getQueryParameter("entry"), "main") && Intrinsics.areEqual(uri.getQueryParameter(Constants.COMPONENT), "kc_startup_rn");
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            return ((Boolean) objM103844constructorimpl).booleanValue();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58100g() {
        InterfaceC38056a interfaceC38056a = (InterfaceC38056a) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC38056a.class));
        if (m58101h(interfaceC38056a != null ? interfaceC38056a.getCurrentRnPageUrl() : null)) {
            return true;
        }
        Activity activityM66494h = C27012a.m66486i().m66494h();
        return Intrinsics.areEqual(activityM66494h != null ? activityM66494h.getClass().getName() : null, "com.kubi.user.signupv2.SignupActivity");
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Activity m58094a() {
        Object next;
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
        Iterator<T> it = stackM66493g.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((Activity) next).getLocalClassName(), "com.kubi.safe.lib.ui.gesture.GestureLockActivity")) {
                return (Activity) next;
            }
        }
        next = null;
        return (Activity) next;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Activity m58095b() {
        Object next;
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
        Iterator<T> it = stackM66493g.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((Activity) next) instanceof IStartupActivity) {
                return (Activity) next;
            }
        }
        next = null;
        return (Activity) next;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58096c() {
        return C27012a.m66486i().m66494h() instanceof SiteMigrationWebActivity;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m58097d() {
        return C27012a.m66486i().m66494h() instanceof ProcessRebirthActivity;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m58098e() {
        Activity activityM58095b = m58095b();
        if (activityM58095b == null || activityM58095b.isFinishing() || activityM58095b.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m58099f() {
        boolean z11;
        boolean z12;
        if (m58094a() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m58095b() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z11 && !z12) {
            return false;
        }
        return true;
    }
}
