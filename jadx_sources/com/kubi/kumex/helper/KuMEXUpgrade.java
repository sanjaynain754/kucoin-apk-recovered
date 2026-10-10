package com.kubi.kumex.helper;

import android.text.SpannableString;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5258a;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.SystemConfig;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27100x0;
import f00.C37304a;
import g00.InterfaceC37750b;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kumex.helper.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KuMEXUpgrade.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/helper/KuMEXUpgrade;", "", "<init>", "()V", "checkUpgrade", "", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fetchSystemConfig", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuMEXUpgrade {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KuMEXUpgrade f29306a = new KuMEXUpgrade();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m34085e(KuMEXUpgrade kuMEXUpgrade, FragmentManager fragmentManager, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fragmentManager = null;
        }
        return kuMEXUpgrade.m34089d(fragmentManager);
    }

    /* JADX INFO: renamed from: f */
    public static final void m34086f(AlertDialogFragmentHelper alertDialogFragmentHelper, View view) {
        InterfaceC37750b.a.m85120b(C37304a.f82764a, null, null, null, 7, null);
        alertDialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static final void m34087h() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.kumex.helper.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuMEXUpgrade.m34088i();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m34088i() throws Throwable {
        RepositoryServiceLocator.f19236a.m20288g().mo25010g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m34089d(@Nullable FragmentManager fragmentManager) {
        SystemConfig systemConfigMo25029t = RepositoryServiceLocator.f19236a.m20288g().mo25029t();
        if (fragmentManager != null && !systemConfigMo25029t.getKumexEnable()) {
            final AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(C5258a.m6125h().getString(R$string.notice_prompt));
            String string = C5258a.m6125h().getString(R$string.view_news);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = C5258a.m6125h().getString(R$string.sysytem_upgrade, string);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.kumex.helper.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KuMEXUpgrade.m34086f(alertDialogFragmentHelperM54168Y4, view);
                }
            }), StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) string2, string, 0, false, 6, (Object) null) + string.length(), 18);
            alertDialogFragmentHelperM54168Y4.m54154K4(spannableString).m54162S4(R$string.i_already_know, null).m54172c5(fragmentManager);
        }
        if (!systemConfigMo25029t.getKumexEnable()) {
            m34090g();
        }
        return !systemConfigMo25029t.getKumexEnable();
    }

    /* JADX INFO: renamed from: g */
    public final void m34090g() {
        C42916f.m94127f().scheduleDirect(new Runnable() { // from class: com.kubi.kumex.helper.w
            @Override // java.lang.Runnable
            public final void run() {
                KuMEXUpgrade.m34087h();
            }
        });
    }
}
