package com.kubi.p110rn.p111ui;

import android.R;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import com.kubi.p110rn.C23207R;
import com.kubi.p110rn.core.ReactConstKt;
import com.kubi.p110rn.core.ReactInitParam;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.applet.IAppletService;
import com.kubi.sdk.applet.KCMiniAppBaseProtocol;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.kubi.utils.extensions.core.C27032f;
import dh0.C36686b;
import me.jessyan.autosize.internal.CancelAdapt;
import org.aspectj.lang.InterfaceC43175a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p813yy.C46611a;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactContainerActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\f\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0002J\u000e\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/rn/ui/ReactContainerActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "isAppPresent", "", "()Ljava/lang/String;", "setAppPresent", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "isTransparentContainer", "", "getContainerBackgroundColor", "", "onKeyUp", "keyCode", "event", "Landroid/view/KeyEvent;", "url", "finish", "isPresent", "updateImmersiveStatusBar", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class ReactContainerActivity extends BaseActivity implements IDisableEdgeToEdge, KCMiniAppBaseProtocol, CancelAdapt {
    private static /* synthetic */ InterfaceC43175a.a ajc$tjp_0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f46119i = 0;

    @Nullable
    private String isAppPresent;

    public boolean isTransparentContainer() {
        return false;
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("ReactContainerActivity.kt", ReactContainerActivity.class);
        ajc$tjp_0 = c36686b.m82128h("method-execution", c36686b.m82127g("4", "onCreate", "com.kubi.rn.ui.ReactContainerActivity", "android.os.Bundle", "savedInstanceState", "", "void"), 35);
    }

    private final boolean isPresent(String str) {
        return Intrinsics.areEqual(str, "presentModal") || Intrinsics.areEqual(str, "presentWithNavigation");
    }

    public int getContainerBackgroundColor() {
        return ContextCompat.getColor(this, C23207R.color.c_overlay);
    }

    @Nullable
    /* JADX INFO: renamed from: isAppPresent, reason: from getter */
    public final String getIsAppPresent() {
        return this.isAppPresent;
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        C46611a.m102764b().m102770h(C36686b.m82123c(ajc$tjp_0, this, this, savedInstanceState));
        C23985b.f47489a.m57875b();
        super.onCreate(null);
        getTitleBar().m58934f();
        setContentView(C23207R.layout.activity_rn_container);
        int i11 = C23207R.id.fl_container;
        View viewFindViewById = findViewById(i11);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(getContainerBackgroundColor());
        }
        ReactInitParam reactInitParamFromBundle = ReactInitParam.INSTANCE.fromBundle(getIntent().getExtras());
        String appPresent = reactInitParamFromBundle != null ? reactInitParamFromBundle.getAppPresent() : null;
        this.isAppPresent = appPresent;
        if (appPresent != null && isPresent(appPresent)) {
            overridePendingTransition(C23207R.anim.anim_bottom_in_200, R.anim.fade_out);
        }
        C27032f.m66613d(this, i11, ReactRootFragment.INSTANCE.newInstance(getIntent().getExtras()), null, 4, null);
    }

    public final void setAppPresent(@Nullable String str) {
        this.isAppPresent = str;
    }

    public final void updateImmersiveStatusBar(boolean enable) {
        try {
            View viewFindViewById = findViewById(C23207R.id.fl_container);
            if (viewFindViewById == null) {
                return;
            }
            WindowCompat.setDecorFitsSystemWindows(getWindow(), !enable);
            viewFindViewById.setFitsSystemWindows(!enable);
            if (enable) {
                if (Build.VERSION.SDK_INT < 30) {
                    getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1280);
                }
                getWindow().setStatusBarColor(0);
            } else {
                if (Build.VERSION.SDK_INT < 30) {
                    getWindow().getDecorView().setSystemUiVisibility((getWindow().getDecorView().getSystemUiVisibility() | 256) & (-1025));
                }
                getWindow().setStatusBarColor(ContextCompat.getColor(this, C23207R.color.c_overlay));
            }
            ViewCompat.requestApplyInsets(viewFindViewById);
        } catch (Exception unused) {
        }
    }

    @Override // com.kubi.sdk.applet.KCBaseProtocol
    @NotNull
    public String url() {
        return IAppletService.m56507b(IAppletService.f46452a.get(), IAppletService.AppletType.RN, null, getIntent().getExtras(), 2, null);
    }

    static {
        ajc$preClinit();
    }

    @Override // com.kubi.sdk.applet.KCMiniAppBaseProtocol
    public /* bridge */ /* synthetic */ void exit(@NotNull Context context, @Nullable Object obj, boolean z11, @NotNull Function2 function2) {
        super.exit(context, obj, z11, function2);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        String str = this.isAppPresent;
        if (str != null && isPresent(str)) {
            overridePendingTransition(R.anim.fade_in, C23207R.anim.anim_bottom_out_200);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @Nullable KeyEvent event) {
        ReactRootFragment reactRootFragment;
        if (ReactConstKt.getDeveloperSupport() && (keyCode == 24 || keyCode == 25)) {
            Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C23207R.id.fl_container);
            if (fragmentFindFragmentById instanceof ReactRootFragment) {
                reactRootFragment = (ReactRootFragment) fragmentFindFragmentById;
            } else {
                reactRootFragment = null;
            }
            if (reactRootFragment != null) {
                reactRootFragment.showDevOptionsDialog$BReactNativeLib_googleRelease();
            }
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override // com.kubi.sdk.applet.KCMiniAppBaseProtocol
    public /* bridge */ /* synthetic */ boolean supportAddHome() {
        return super.supportAddHome();
    }
}
