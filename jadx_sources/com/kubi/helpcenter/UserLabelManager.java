package com.kubi.helpcenter;

import android.text.TextUtils;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27063n;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41726q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015aj.C0374a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: UserLabelManager.kt */
/* JADX INFO: loaded from: classes14.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tJ\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000b\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/helpcenter/UserLabelManager;", "", "<init>", "()V", "userLabel", "", "fetchUserLabel", "", "callBack", "Lkotlin/Function0;", "getUserLabel", "clearUserLabel", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserLabelManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserLabelManager f25240a = new UserLabelManager();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static String f25241b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m28893e(UserLabelManager userLabelManager, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function0 = null;
        }
        userLabelManager.m28895d(function0);
    }

    /* JADX INFO: renamed from: c */
    public final void m28894c() {
        f25241b = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m28895d(@Nullable Function0<Unit> function0) {
        if (C0374a.f1118a.m1469a() && f25241b == null) {
            C41696j.m91104d(C41726q1.f91773b, null, null, new UserLabelManager$fetchUserLabel$1(function0, null), 3, null);
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m28896f() {
        if (C0374a.f1118a.m1469a() && TextUtils.isEmpty(f25241b)) {
            String strM66769g = C27063n.m66769g("userLabel" + UserInfo.c().id, null, 1, null);
            f25241b = TextUtils.isEmpty(strM66769g) ? null : strM66769g;
        }
        return f25241b;
    }
}
