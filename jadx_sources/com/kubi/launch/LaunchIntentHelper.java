package com.kubi.launch;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kubi.kucoin.feature.SplashActivity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.C27012a;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.launch.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LaunchIntentHelper.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0005J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000e2\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0005J\u001a\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000eJ\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ \u0010 \u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002J \u0010\"\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/launch/LaunchIntentHelper;", "", "<init>", "()V", "CATEGORY_LAUNCH", "", "KEY_FRAGMENT", "KEY_ACTIVITY", "makePendingIntentWithFragment", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "title", "fragmentClass", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "makePendingIntentWithActivity", "activityClass", "Landroid/app/Activity;", "makePendingIntent", "putTargetActivity", "", "Landroid/content/Intent;", "getPendingIntent", "intent", "buildIntent", "extras", "Landroid/os/Bundle;", InterfaceC33617e1.f69659h, "Lcom/kubi/launch/LauncherContext;", "launch$LAppFacade_googleRelease", "launchFragment", "fragment", "launchActivity", "activityCls", "hasFragment", "", "fragmentCls", "hasActivity", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LaunchIntentHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LaunchIntentHelper f31789a = new LaunchIntentHelper();

    /* JADX INFO: renamed from: b */
    public final PendingIntent m37446b(Context context, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 33554432);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: renamed from: f */
    public final void m37450f(LauncherContext launcherContext, String str, Intent intent) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(launcherContext.getF31802a(), str));
        intent2.setAction(intent.getAction());
        intent2.putExtras(intent);
        if (launcherContext.getF31804c()) {
            intent2.addFlags(268468224);
            launcherContext.getF31807f().m37504e(3);
        } else if (m37447c(str)) {
            intent2.addFlags(67108864);
            launcherContext.getF31807f().m37504e(6);
        } else {
            launcherContext.getF31807f().m37504e(5);
        }
        launcherContext.getF31802a().startActivity(intent2);
    }

    /* JADX INFO: renamed from: g */
    public final void m37451g(LauncherContext launcherContext, String str, String str2) {
        Intent intentM56572k0 = BaseFragmentActivity.m56572k0(launcherContext.getF31802a(), str, str2, launcherContext.m37486e().getExtras());
        if (launcherContext.getF31804c()) {
            intentM56572k0.addFlags(268468224);
            launcherContext.getF31807f().m37504e(3);
        } else {
            if (m37448d(str2)) {
                launcherContext.getF31807f().m37504e(1);
                return;
            }
            launcherContext.getF31807f().m37504e(5);
        }
        launcherContext.getF31802a().startActivity(intentM56572k0);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final PendingIntent m37454j(@NotNull Context context, @NotNull String title, @NotNull Class<? extends Fragment> fragmentClass, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        Intrinsics.checkNotNullParameter(action, "action");
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("fragment", fragmentClass.getName());
        return m37446b(context, m37445a(context, bundle, action));
    }

    /* JADX INFO: renamed from: a */
    public final Intent m37445a(Context context, Bundle bundle, String str) {
        Intent intent = new Intent(context, (Class<?>) SplashActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setAction(str);
        intent.addCategory("com.kubi.launch.category.PENDING");
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public final void m37449e(@NotNull LauncherContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String strM56282x = RouteExKt.m56282x(context.m37486e(), "title", "");
        String strM56280w = RouteExKt.m56280w(context.m37486e(), "fragment");
        String strM56280w2 = RouteExKt.m56280w(context.m37486e(), "activityCls");
        if (strM56280w != null && strM56280w.length() != 0) {
            m37451g(context, strM56282x, strM56280w);
        } else if (strM56280w2 != null && strM56280w2.length() != 0) {
            m37450f(context, strM56280w2, context.m37486e());
        } else {
            context.getF31807f().m37504e(2);
            InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final PendingIntent m37452h(@NotNull Context context, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        return m37446b(context, m37445a(context, null, action));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final PendingIntent m37453i(@NotNull Context context, @NotNull Class<? extends Activity> activityClass, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        Intrinsics.checkNotNullParameter(action, "action");
        Bundle bundle = new Bundle();
        bundle.putString("activityCls", activityClass.getName());
        return m37446b(context, m37445a(context, bundle, action));
    }

    /* JADX INFO: renamed from: k */
    public final void m37455k(@NotNull Intent intent, @NotNull Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        intent.putExtra("activityCls", activityClass.getName());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37447c(String str) {
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        int size = stackM66493g.size() - 2;
        if (size > 0) {
            return Intrinsics.areEqual(stackM66493g.get(size).getClass().getName(), str);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37448d(String str) {
        BaseFragmentActivity baseFragmentActivity;
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        int size = stackM66493g.size() - 2;
        if (size <= 0) {
            return false;
        }
        Activity activity = stackM66493g.get(size);
        if (activity instanceof BaseFragmentActivity) {
            baseFragmentActivity = (BaseFragmentActivity) activity;
        } else {
            baseFragmentActivity = null;
        }
        if (baseFragmentActivity == null) {
            return false;
        }
        Intent intent = baseFragmentActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return Intrinsics.areEqual(RouteExKt.m56280w(intent, "fragment"), str);
    }
}
