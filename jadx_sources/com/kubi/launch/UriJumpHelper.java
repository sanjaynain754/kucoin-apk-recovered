package com.kubi.launch;

import android.content.Intent;
import android.net.Uri;
import com.kubi.launch.exception.SplashMessage;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.push.KPushService;
import com.kubi.sdk.push.PushInfo;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.launch.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UriJumpHelper.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/launch/UriJumpHelper;", "", "<init>", "()V", "parseSchemeData", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "parsePushData", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUriJumpHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriJumpHelper.kt\ncom/kubi/launch/UriJumpHelper\n+ 2 LauncherIssue.kt\ncom/kubi/launch/exception/LauncherIssueKt\n*L\n1#1,44:1\n55#2,2:45\n*S KotlinDebug\n*F\n+ 1 UriJumpHelper.kt\ncom/kubi/launch/UriJumpHelper\n*L\n31#1:45,2\n*E\n"})
public final class UriJumpHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UriJumpHelper f31783a = new UriJumpHelper();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final String m37439a(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PushInfo pushInfoM57909g = KPushService.m57909g(activity.getIntent());
        if (pushInfoM57909g != null) {
            return pushInfoM57909g.getUrl();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m37440b(@NotNull BaseActivity activity) {
        Uri data;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        if (string == null || string.length() == 0) {
            return "home";
        }
        C4400a c4400aM56184f = Router.f46192a.m56184f(string);
        if (!Intrinsics.areEqual(RouteExKt.m56216G(c4400aM56184f.getUri()), SignTermItem.LINK) || !c4400aM56184f.getBundle().containsKey("data")) {
            return string;
        }
        C43846g.m96568c(new SplashMessage("SplashActivity parseSchemeData contains unsafe url,url is " + string, "", false, 4, null), null, 2, null);
        return "home";
    }
}
