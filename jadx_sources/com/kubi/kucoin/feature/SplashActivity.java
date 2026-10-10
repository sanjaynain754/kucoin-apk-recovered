package com.kubi.kucoin.feature;

import android.content.Intent;
import android.os.Bundle;
import com.kubi.app.facade.R$anim;
import com.kubi.app.facade.R$layout;
import com.kubi.kucoin.feature.SplashActivity;
import com.kubi.launch.LauncherContext;
import com.kubi.launch.LauncherManager;
import com.kubi.launch.LauncherReport;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.startup.IStartupActivity;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.util.StartupMinorTraceUtils;
import com.kubi.sdk.util.StartupTrace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SplashActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/feature/SplashActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/startup/IStartupActivity;", "<init>", "()V", "launcherManager", "Lcom/kubi/launch/LauncherManager;", "isFromLauncher", "", "()Z", "isFromLauncher$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onNewIntent", "intent", "Landroid/content/Intent;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SplashActivity extends BaseActivity implements IStartupActivity {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final LauncherManager f27776i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f27777j;

    /* JADX INFO: renamed from: U */
    public final boolean m32063U() {
        return ((Boolean) this.f27777j.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        StartupMinorTraceUtils.f48182a.m58419b("splash_start_oncreate");
        super.onCreate(savedInstanceState);
        StartupTrace.f48194a.m58450j("duration4");
        EdgeToEdgeCompat.f48106a.m58273k(this);
        C44128b.m97259c("SplashActivity", "SplashActivity onCreate");
        setContentView(R$layout.kucoin_activity_splash);
        overridePendingTransition(0, R$anim.anim_fade_out_300);
        if (!isTaskRoot() && m32063U()) {
            finish();
        } else {
            LauncherReport.f31812a.m37496a();
            this.f27776i.m37435q(new LauncherContext(this));
        }
    }

    public SplashActivity() {
        setPageId("BTsplashPage");
        this.f27776i = new LauncherManager();
        this.f27777j = LazyKt.lazy(new Function0() { // from class: bl.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(SplashActivity.m32062V(this.f4157b));
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m32062V(SplashActivity splashActivity) {
        if (splashActivity.getIntent().hasCategory("android.intent.category.LAUNCHER") && Intrinsics.areEqual("android.intent.action.MAIN", splashActivity.getIntent().getAction())) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        StartupTrace.f48194a.m58450j("duration6");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        StartupTrace.f48194a.m58450j("duration5");
    }
}
