package com.kubi.payment.p2p.order;

import android.content.Intent;
import android.os.Bundle;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2POrderDetailActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/P2POrderDetailActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "orderId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "replaceFragment", "onNewIntent", "newIntent", "Landroid/content/Intent;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2POrderDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f39767j = 0;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f39768i = "";

    /* JADX INFO: renamed from: T */
    public final void m48832T() {
        String strM56280w;
        Boolean boolM56246f;
        Intent intent = getIntent();
        String strM56280w2 = null;
        if (intent != null) {
            strM56280w = RouteExKt.m56280w(intent, "id");
        } else {
            strM56280w = null;
        }
        this.f39768i = C27041f.m66668h(strM56280w);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            boolM56246f = RouteExKt.m56246f(intent2, "isCreateOrder");
        } else {
            boolM56246f = null;
        }
        boolean zM66566d = C27025c.m66566d(boolM56246f);
        Intent intent3 = getIntent();
        if (intent3 != null) {
            strM56280w2 = RouteExKt.m56280w(intent3, "spm");
        }
        getSupportFragmentManager().beginTransaction().replace(R$id.fl_container, OrderDetailFragment.f39721a0.newInstance(this.f39768i, Boolean.valueOf(zM66566d), strM56280w2)).commitNowAllowingStateLoss();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_fragment_container);
        m48832T();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent newIntent) {
        String strM56280w;
        super.onNewIntent(newIntent);
        if (newIntent != null) {
            strM56280w = RouteExKt.m56280w(newIntent, "id");
        } else {
            strM56280w = null;
        }
        String strM66668h = C27041f.m66668h(strM56280w);
        if (strM66668h.length() > 0 && Intrinsics.areEqual(strM66668h, this.f39768i)) {
            return;
        }
        if (newIntent != null) {
            setIntent(newIntent);
        }
        m48832T();
    }
}
