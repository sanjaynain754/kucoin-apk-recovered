package p742wz;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.p117ui.ModeTransitionActivity;
import com.kubi.sdk.mode.widget.HomeMaskView;
import com.kubi.sdk.mode.widget.SwitchLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import sz.C44602a;

/* JADX INFO: renamed from: wz.a */
/* JADX INFO: compiled from: ModeSwitchHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0006\u0010\u0012\u001a\u00020\u000eJ,\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u0015J\u001a\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00152\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010(\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006*"}, m90084d2 = {"Lcom/kubi/sdk/mode/utils/ModeSwitchHelper;", "", "<init>", "()V", "maskViewRef", "", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/mode/widget/HomeMaskView;", "isLiteAvailable", "", "()Z", "setLiteAvailable", "(Z)V", "addMaskRef", "", "maskView", "maskViewCount", "", "hideMaskView", "toExchangeFadeOut", "flutterActivity", "Landroid/app/Activity;", "mainCls", "Ljava/lang/Class;", "fromAppMode", "Lcom/kubi/sdk/mode/AppMode;", "isAnimation", "toExchangeFadeIn", "mainActivity", "toWalletFadeOut", "Landroidx/fragment/app/FragmentActivity;", "intent", "Landroid/content/Intent;", "toLiteFadeOut", "toWalletFadeIn", "walletActivity", "launchTransition", "activity", "switch", "Landroid/view/View;", "goToHome", "", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModeSwitchHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeSwitchHelper.kt\ncom/kubi/sdk/mode/utils/ModeSwitchHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1869#2,2:176\n*S KotlinDebug\n*F\n+ 1 ModeSwitchHelper.kt\ncom/kubi/sdk/mode/utils/ModeSwitchHelper\n*L\n53#1:176,2\n*E\n"})
public final class C45960a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45960a f103398a = new C45960a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static List<WeakReference<HomeMaskView>> f103399b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static boolean f103400c;

    /* JADX INFO: renamed from: a */
    public final void m101386a(HomeMaskView homeMaskView) {
        if (homeMaskView == null) {
            return;
        }
        f103399b.add(new WeakReference<>(homeMaskView));
    }

    /* JADX INFO: renamed from: b */
    public final void m101387b(Activity activity, Class<?> cls, String str, boolean z11) {
        Intent intent = new Intent(activity, cls);
        intent.putExtra("wallet_animation", z11);
        intent.putExtra("from", str);
        C44128b.m97266j("LiteTag", "goToHome intent=" + intent);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m101388c() {
        List list = CollectionsKt.toList(f103399b);
        f103399b.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            HomeMaskView homeMaskView = (HomeMaskView) ((WeakReference) it.next()).get();
            if (homeMaskView != null) {
                homeMaskView.m57278a();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m101389d() {
        return f103400c;
    }

    /* JADX INFO: renamed from: e */
    public final void m101390e(Activity activity, View view) {
        C44128b.m97266j("LiteTag", "进入 WalletTransitionActivity 显示动画");
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        String strM56280w = RouteExKt.m56280w(intent, "from");
        Intent intent2 = new Intent(activity, (Class<?>) ModeTransitionActivity.class);
        intent2.putExtra("from", strM56280w);
        activity.startActivity(intent2);
        activity.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m101391f(boolean z11) {
        f103400c = z11;
    }

    /* JADX INFO: renamed from: g */
    public final void m101392g(@NotNull Activity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "mainActivity");
        C44128b.m97266j("LiteTag", "【xxx --> 交易所】KuCoinMainActivity onResume: step 2");
        m101390e(mainActivity, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m101393h(@NotNull Activity flutterActivity, @NotNull Class<?> mainCls, @NotNull AppMode fromAppMode, boolean z11) {
        Intrinsics.checkNotNullParameter(flutterActivity, "flutterActivity");
        Intrinsics.checkNotNullParameter(mainCls, "mainCls");
        Intrinsics.checkNotNullParameter(fromAppMode, "fromAppMode");
        C44128b.m97266j("LiteTag", "【xxx --> 交易所】step 1 flutterActivity=" + flutterActivity + ", " + fromAppMode.getModeType());
        if (z11) {
            HomeMaskView.Companion companion = HomeMaskView.f47143d;
            AppMode appMode = AppMode.Pro;
            HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(companion, flutterActivity, appMode, false, 4, null);
            if (maskView$default == null) {
                return;
            }
            SwitchLayout sharedView = maskView$default.getSharedView();
            if (sharedView != null) {
                sharedView.m57318z(new SwitchConfig(fromAppMode, appMode, false, false, false, 0L, 0L, 0L, 0L, null, false, 2044, null));
            }
        }
        m101387b(flutterActivity, mainCls, fromAppMode.getModeType(), z11);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m101394i(@NotNull FragmentActivity mainActivity, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(mainActivity, "mainActivity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C44128b.m97266j("LiteTag", "【xxx --> Lite】");
        HomeMaskView.Companion companion = HomeMaskView.f47143d;
        AppMode appMode = AppMode.Lite;
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(companion, mainActivity, appMode, false, 4, null);
        if (maskView$default == null) {
            return false;
        }
        SwitchLayout sharedView = maskView$default.getSharedView();
        if (sharedView != null) {
            sharedView.m57318z(new SwitchConfig(C44602a.m98704a(intent), appMode, false, false, false, 0L, 0L, 0L, 0L, null, false, 2044, null));
        }
        m101386a(maskView$default);
        intent.putExtra("wallet_animation", true);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        mainActivity.startActivity(intent);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m101395j(@NotNull FragmentActivity mainActivity, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(mainActivity, "mainActivity");
        Intrinsics.checkNotNullParameter(intent, "intent");
        C44128b.m97266j("LiteTag", "【xxx-->钱包】");
        HomeMaskView.Companion companion = HomeMaskView.f47143d;
        AppMode appMode = AppMode.Web3;
        HomeMaskView maskView$default = HomeMaskView.Companion.setMaskView$default(companion, mainActivity, appMode, false, 4, null);
        if (maskView$default == null) {
            return false;
        }
        SwitchLayout sharedView = maskView$default.getSharedView();
        if (sharedView != null) {
            sharedView.m57318z(new SwitchConfig(C44602a.m98704a(intent), appMode, false, false, false, 0L, 0L, 0L, 0L, null, false, 2044, null));
        }
        m101386a(maskView$default);
        intent.putExtra("wallet_animation", true);
        intent.addFlags(32768);
        intent.addFlags(268435456);
        mainActivity.startActivity(intent);
        return true;
    }
}
