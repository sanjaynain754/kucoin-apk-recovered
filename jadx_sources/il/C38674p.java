package il;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.kubi.app.router.R$drawable;
import com.kubi.app.router.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.utils.C27012a;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: il.p */
/* JADX INFO: compiled from: RouteAppModeInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteAppModeInterceptor;", "", "<init>", "()V", "TAG", "", "isDialogShowing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "intercept", "", "jumpUri", "supportList", "", "showSwitchDialog", "", "switchMode", "Lcom/kubi/sdk/mode/AppMode;", "modeSwitchUseAtc", "captureToCache", "act", "Landroidx/fragment/app/FragmentActivity;", "realSwitchDialog", "hostAct", "finishAct", "isHomeUri", "getHomeUrl", "mode", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteAppModeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteAppModeInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteAppModeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 6 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,239:1\n1563#2:240\n1634#2,3:241\n1761#2,3:250\n1#3:244\n49#4:245\n70#4:248\n15#5,2:246\n29#6:249\n*S KotlinDebug\n*F\n+ 1 RouteAppModeInterceptor.kt\ncom/kubi/kucoin/interceptor/RouteAppModeInterceptor\n*L\n41#1:240\n41#1:241,3\n161#1:250,3\n96#1:245\n96#1:248\n96#1:246,2\n183#1:249\n*E\n"})
public final class C38674p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38674p f86692a = new C38674p();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicBoolean f86693b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: il.p$b */
    /* JADX INFO: compiled from: RouteAppModeInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kucoin/interceptor/RouteAppModeInterceptor$realSwitchDialog$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onDestroy", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements DefaultLifecycleObserver {
        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            C38674p.f86693b.set(false);
            owner.getLifecycle().removeObserver(this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m87417h(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getScheme() != null && Intrinsics.areEqual(uri.getScheme(), "kucoin") && ArraysKt.contains(new String[]{"home", "lite/home", "wallet/splash"}, RouteExKt.m56216G(uri));
        } catch (Exception e11) {
            C44128b.m97266j("RouteAppModeInterceptor", "isHomeUri: invalid jumpUri=" + str + ", error=" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: il.p$a */
    /* JADX INFO: compiled from: RouteAppModeInterceptor.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppMode.values().length];
            try {
                iArr[AppMode.Lite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppMode.Web3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m87412k(DialogInterface dialogInterface) {
        f86693b.set(false);
    }

    /* JADX INFO: renamed from: l */
    public static final void m87413l(AppMode appMode, boolean z11, FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i11) {
        C44128b.m97266j("RouteAppModeInterceptor", "realSwitchDialog: user close switch to " + appMode);
        if (z11) {
            Router.f46192a.m56184f("home").m4048k();
            fragmentActivity.finish();
        }
        f86693b.set(false);
    }

    /* JADX INFO: renamed from: m */
    public static final void m87414m(AppMode appMode, boolean z11, FragmentActivity fragmentActivity, String str, DialogInterface dialogInterface, int i11) {
        C44128b.m97266j("RouteAppModeInterceptor", "realSwitchDialog: user confirmed switch to " + appMode);
        AppMode.INSTANCE.updateCurrentMode(appMode);
        Router router = Router.f46192a;
        C38674p c38674p = f86692a;
        C4400a c4400aM56184f = router.m56184f(c38674p.m87415f(appMode));
        if (!c38674p.m87417h(str)) {
            c4400aM56184f.m4038a("jumpUrl", str);
        }
        c4400aM56184f.m4040c(268468224).m4048k();
        if (z11) {
            fragmentActivity.finish();
        }
        f86693b.set(false);
    }

    /* JADX INFO: renamed from: f */
    public final String m87415f(AppMode appMode) {
        int i11 = a.$EnumSwitchMapping$0[appMode.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "home" : "wallet/splash";
        }
        return "lite/home";
    }

    /* JADX INFO: renamed from: g */
    public final boolean m87416g(@NotNull String jumpUri, @NotNull List<String> supportList) {
        Intrinsics.checkNotNullParameter(jumpUri, "jumpUri");
        Intrinsics.checkNotNullParameter(supportList, "supportList");
        AppMode currentBizMode$default = AppMode.Companion.getCurrentBizMode$default(AppMode.INSTANCE, null, 1, null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportList, 10));
        Iterator<T> it = supportList.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = currentBizMode$default.getModeType().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (!arrayList.contains(lowerCase2)) {
            String str = (String) CollectionsKt.firstOrNull((List) supportList);
            if (str != null && str.length() != 0) {
                AppMode.Companion companion = AppMode.INSTANCE;
                AppMode appModeFromStringDefault$default = AppMode.Companion.fromStringDefault$default(companion, str, null, 2, null);
                companion.updateCurrentMode(appModeFromStringDefault$default);
                C4400a c4400aM56184f = Router.f46192a.m56184f(m87415f(appModeFromStringDefault$default));
                if (!f86692a.m87417h(jumpUri)) {
                    c4400aM56184f.m4038a("jumpUrl", jumpUri);
                }
                c4400aM56184f.m4040c(268468224).m4048k();
                return true;
            }
            C44128b.m97266j("RouteAppModeInterceptor", "intercept: no valid target mode found in supportList=" + supportList);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m87418i(@NotNull final FragmentActivity hostAct, @NotNull final AppMode switchMode, @NotNull final String jumpUri, final boolean z11) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(hostAct, "hostAct");
        Intrinsics.checkNotNullParameter(switchMode, "switchMode");
        Intrinsics.checkNotNullParameter(jumpUri, "jumpUri");
        C44128b.m97266j("RouteAppModeInterceptor", "realSwitchDialog: show switch dialog, hostAct=" + hostAct + ", switchMode=" + switchMode + ", jumpUri=" + jumpUri + ", finishAct=" + z11);
        if (f86693b.compareAndSet(false, true)) {
            hostAct.getLifecycle().addObserver(new b());
            AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
            int[] iArr = a.$EnumSwitchMapping$0;
            int i13 = iArr[switchMode.ordinal()];
            if (i13 != 1) {
                i11 = i13 != 2 ? R$string.switch_pro_dialog_message : R$string.switch_web3_dialog_message;
            } else {
                i11 = R$string.switch_lite_dialog_message;
            }
            AlertDialogFragmentHelper alertDialogFragmentHelperM54153J4 = alertDialogFragmentHelperNewInstanceAlert.m54153J4(i11);
            alertDialogFragmentHelperM54153J4.m54191p3();
            AlertDialogFragmentHelper alertDialogFragmentHelperM54147D4 = alertDialogFragmentHelperM54153J4.m54161R4(0).m54147D4(R$drawable.ic2_close_withcircle_24, new DialogInterface.OnClickListener() { // from class: il.l
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    C38674p.m87413l(switchMode, z11, hostAct, dialogInterface, i14);
                }
            });
            int i14 = iArr[switchMode.ordinal()];
            if (i14 != 1) {
                i12 = i14 != 2 ? R$string.switch_pro_dialog_positive : R$string.switch_web3_dialog_positive;
            } else {
                i12 = R$string.switch_lite_dialog_positive;
            }
            AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = alertDialogFragmentHelperM54147D4.m54162S4(i12, new DialogInterface.OnClickListener() { // from class: il.m
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    C38674p.m87414m(switchMode, z11, hostAct, jumpUri, dialogInterface, i15);
                }
            }).m54159P4(R$string.switch_mode_dialog_negative, new DialogInterface.OnClickListener() { // from class: il.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i15) {
                    C38674p.m87411j(switchMode, z11, hostAct, dialogInterface, i15);
                }
            });
            alertDialogFragmentHelperM54159P4.m54192r3(new DialogInterface.OnDismissListener() { // from class: il.o
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C38674p.m87412k(dialogInterface);
                }
            });
            alertDialogFragmentHelperM54159P4.m54172c5(hostAct.getSupportFragmentManager());
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m87411j(AppMode appMode, boolean z11, FragmentActivity fragmentActivity, DialogInterface dialogInterface, int i11) {
        boolean z12;
        Stack<Activity> stackM66493g = C27012a.m66486i().m66493g();
        Intrinsics.checkNotNullExpressionValue(stackM66493g, "getActivityStack(...)");
        if (stackM66493g != null && stackM66493g.isEmpty()) {
            z12 = false;
            break;
        }
        Iterator<T> it = stackM66493g.iterator();
        while (true) {
            if (!it.hasNext()) {
                z12 = false;
                break;
            }
            Activity activity = (Activity) it.next();
            if (!(activity instanceof IStartupActivity) && !Intrinsics.areEqual(activity, fragmentActivity)) {
                z12 = true;
                break;
            }
        }
        C44128b.m97266j("RouteAppModeInterceptor", "realSwitchDialog: user cancelled switch to " + appMode + ", hasAnyBizActivity=" + z12 + ", finishAct=" + z11);
        if (z11 && !z12) {
            Router.f46192a.m56184f(f86692a.m87415f(AppMode.INSTANCE.getCurrentBizMode(AppMode.Pro))).m4048k();
        }
        if (z11) {
            fragmentActivity.finish();
        }
        f86693b.set(false);
    }
}
