package p346ip;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5258a;
import com.kubi.margin.R$font;
import com.kubi.margin.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.startup.IStartupActivity;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ip.c */
/* JADX INFO: compiled from: MarginInterceptor.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/interceptor/MarginInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginInterceptor.kt\ncom/kubi/margin/interceptor/MarginInterceptor\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,52:1\n19#2,2:53\n*S KotlinDebug\n*F\n+ 1 MarginInterceptor.kt\ncom/kubi/margin/interceptor/MarginInterceptor\n*L\n26#1:53,2\n*E\n"})
public final class C40158c implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        final C4400a postcard = chain.getPostcard();
        if (!Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "lever/open")) {
            return chain.mo103413a(postcard);
        }
        C42917g.m94139e().execute(new Runnable() { // from class: ip.a
            @Override // java.lang.Runnable
            public final void run() {
                C40158c.m88508d(postcard, chain);
            }
        });
        if (C5258a.m6125h() instanceof IStartupActivity) {
            return chain.mo103413a(postcard);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static final void m88508d(final C4400a c4400a, final InterfaceC46935a interfaceC46935a) {
        FragmentActivity fragmentActivity;
        int i11;
        int i12;
        int i13;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            boolean z11 = false;
            if (RouteExKt.m56262n(c4400a.getBundle(), "type", 0) == 1) {
                z11 = true;
            }
            AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
            if (z11) {
                i11 = R$string.open_etf_trade_title;
            } else {
                i11 = R$string.open_margin_trade_title;
            }
            AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = alertDialogFragmentHelperNewInstanceAlert.m54167X4(i11);
            if (z11) {
                i12 = R$string.open_etf_trade_content;
            } else {
                i12 = R$string.open_margin_trade_content;
            }
            AlertDialogFragmentHelper alertDialogFragmentHelperM54158O4 = alertDialogFragmentHelperM54167X4.m54153J4(i12).m54158O4(ResourcesCompat.getFont(fragmentActivity.getApplicationContext(), R$font.regular));
            if (z11) {
                i13 = R$string.open_etf_trade_submit;
            } else {
                i13 = R$string.open_margin_trade_submit;
            }
            alertDialogFragmentHelperM54158O4.m54162S4(i13, new DialogInterface.OnClickListener() { // from class: ip.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    C40158c.m88509e(interfaceC46935a, c4400a, dialogInterface, i14);
                }
            }).m54159P4(R$string.maybe_later, null).m54172c5(fragmentActivity.getSupportFragmentManager());
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88509e(InterfaceC46935a interfaceC46935a, C4400a c4400a, DialogInterface dialogInterface, int i11) {
        interfaceC46935a.mo103413a(c4400a);
    }
}
