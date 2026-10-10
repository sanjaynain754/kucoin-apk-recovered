package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.Fragment;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.R$id;
import com.kubi.sdk.util.IDisableEdgeToEdge;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: NewFloatingWindowSettingActivity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingActivity;", "Lcom/kubi/sdk/BaseActivity;", "Lcom/kubi/sdk/util/IDisableEdgeToEdge;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NewFloatingWindowSettingActivity extends BaseActivity implements IDisableEdgeToEdge {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: NewFloatingWindowSettingActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/NewFloatingWindowSettingActivity$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch() {
            BaseApplication.Companion companion = BaseApplication.INSTANCE;
            Application application = companion.get();
            Intent intent = new Intent(companion.get(), (Class<?>) NewFloatingWindowSettingActivity.class);
            intent.putExtra("fragment", NewFloatingWindowSettingFragment.class.getName());
            intent.putExtra(BaseActivity.STATUS_BAR, CredentialEntry.TRUE_STRING);
            intent.setFlags(872415232);
            application.startActivity(intent);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("fragment");
        if (stringExtra != null) {
            getSupportFragmentManager().beginTransaction().add(R$id.content, Fragment.instantiate(this, stringExtra, getIntent().getExtras())).addToBackStack(null).commitAllowingStateLoss();
        }
    }
}
