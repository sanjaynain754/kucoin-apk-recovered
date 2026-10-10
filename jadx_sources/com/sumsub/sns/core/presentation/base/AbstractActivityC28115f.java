package com.sumsub.sns.core.presentation.base;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.common.SNSEdgeToEdgeUtils;
import com.sumsub.sns.core.data.model.DayNightMode;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28413P0;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.features.presentation.main.SNSAppActivity;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractActivityC28115f extends AppCompatActivity {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f57327i = 0;

    /* JADX INFO: renamed from: b */
    public boolean f57329b;

    /* JADX INFO: renamed from: a */
    public final Lazy f57328a = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.core.presentation.base.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractActivityC28115f.m69073a(this.f57339b);
        }
    });

    /* JADX INFO: renamed from: c */
    public final C28103b f57330c = new C28103b((SNSAppActivity) this);

    /* JADX INFO: renamed from: a */
    public static final C28578h m69073a(AbstractActivityC28115f abstractActivityC28115f) {
        Context applicationContext = abstractActivityC28115f.getApplicationContext();
        AbstractC28413P0.m69296a(applicationContext, null);
        SNSSession sNSSessionM69295a = AbstractC28413P0.m69295a();
        Context applicationContext2 = applicationContext.getApplicationContext();
        AbstractC28413P0.m69296a(applicationContext2, sNSSessionM69295a);
        C28578h c28578h = C28578h.f58143T;
        if (c28578h != null) {
            if (!Intrinsics.areEqual(c28578h.f58164b, sNSSessionM69295a.getSessionId())) {
                c28578h = null;
            }
            if (c28578h != null) {
                return c28578h;
            }
        }
        C28578h c28578h2 = new C28578h(applicationContext2, sNSSessionM69295a.getSessionId(), sNSSessionM69295a.getUrl(), null);
        C28578h c28578h3 = C28578h.f58143T;
        if (c28578h3 != null) {
            c28578h3.m69470a();
        }
        C28578h.f58143T = c28578h2;
        return c28578h2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo69075a(InterfaceC28145r interfaceC28145r);

    /* JADX INFO: renamed from: a */
    public abstract void mo69076a(AbstractC29149l0 abstractC29149l0, String str, CharSequence charSequence, String str2);

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Integer num;
        C28955c c28955c;
        if (bundle != null) {
            SNSMobileSDK.INSTANCE.restore$idensic_mobile_sdk_aar_defaultRelease(getApplicationContext());
        }
        m69074a();
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), getClass().getSimpleName() + ".onCreate", null, 4, null);
        }
        DayNightMode forcedDayNightMode = SNSMobileSDK.INSTANCE.getForcedDayNightMode();
        if (forcedDayNightMode != null) {
            int i11 = AbstractC28086a.f57284a[forcedDayNightMode.ordinal()];
            int i12 = 1;
            if (i11 != 1) {
                i12 = 2;
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            getDelegate().setLocalNightMode(i12);
            getDelegate().applyDayNight();
        }
        if (!AbstractC28413P0.f57921a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SNSSession sNSSession = AbstractC28413P0.f57923c;
        if (sNSSession == null) {
            sNSSession = null;
        }
        setTheme(sNSSession.getTheme());
        getTheme().applyStyle(R$style.ThemeOverlay_SNSCore_Defaults, false);
        SNSEdgeToEdgeUtils.INSTANCE.applyEdgeToEdge(this);
        super.onCreate(bundle);
        setContentView(R$layout.sns_activity_app);
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            boolean zM69346a = AbstractC28458h.m69346a(getResources().getConfiguration());
            SNSColorElement sNSColorElement = SNSColorElement.STATUS_BAR_COLOR;
            Map map = c28966p.f58877c;
            if (map == null || (c28955c = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                num = null;
            } else {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                int alphaComponent = ColorUtils.setAlphaComponent(num.intValue(), 255);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(alphaComponent);
                getWindow().getDecorView().setBackgroundColor(alphaComponent);
            }
        }
        TextView textView = (TextView) findViewById(R$id.sns_progress_text);
        SNSAppActivity sNSAppActivity = (SNSAppActivity) this;
        AbstractC28421U.m69304a(((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).getEvents(), this, new C28106c(this));
        AbstractC28421U.m69305b(((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).getViewModelInternalState(), this, new C28109d(this, textView, bundle, null));
        AbstractC28421U.m69305b(C41636g.m90881E(((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).getViewState()), this, new C28112e(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (C28468k0.f57988f) {
            Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), getClass().getSimpleName() + ".onDestroy", null, 4, null);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        try {
            unregisterReceiver(this.f57330c);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this), "Receiver unregistering error", th2);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            ContextCompat.registerReceiver(this, this.f57330c, new IntentFilter("com.sumsub.sns.intent.ACTION_CLOSE"), 4);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68956e(AbstractC33294e.m71624a(this), "Receiver registering error", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m69074a() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, new OnBackInvokedCallback() { // from class: com.sumsub.sns.core.presentation.base.i1
                public final void onBackInvoked() {
                    this.f57348a.onBackPressed();
                }
            });
        }
    }
}
