package com.kubi.payment.channel.paymentmethod.recharge.ivy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.extensions.core.C27032f;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: IvyConfirmActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "fragment", "Lcom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIvyConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IvyConfirmActivity.kt\ncom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,46:1\n1#2:47\n44#3,2:48\n*S KotlinDebug\n*F\n+ 1 IvyConfirmActivity.kt\ncom/kubi/payment/channel/paymentmethod/recharge/ivy/IvyConfirmActivity\n*L\n42#1:48,2\n*E\n"})
public final class IvyConfirmActivity extends BaseActivity {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f38325j = 0;

    /* JADX INFO: renamed from: i */
    public IvyConfirmFragment f38326i;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        try {
            super.onNewIntent(intent);
            IvyConfirmFragment ivyConfirmFragment = this.f38326i;
            if (ivyConfirmFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment");
                ivyConfirmFragment = null;
            }
            IvyConfirmFragment.m45922M3(ivyConfirmFragment, null, 1, null);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "IvyConfirmActivity", false, null, 8, null), null, 2, null);
        }
        C44128b.m97266j("ivy", "IvyConfirmActivity onNewIntent");
    }

    /* JADX INFO: renamed from: U */
    public static final void m45913U(IvyConfirmActivity ivyConfirmActivity, View view) {
        ivyConfirmActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.payment_activity_recharge_confirm_ivy);
        TitleBar titleBar = (TitleBar) findViewById(R$id.title_bar);
        titleBar.setTitle(getString(R$string.payment_confirm_order));
        titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.payment.channel.paymentmethod.recharge.ivy.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IvyConfirmActivity.m45913U(this.f38339b, view);
            }
        });
        IvyConfirmFragment ivyConfirmFragment = new IvyConfirmFragment();
        this.f38326i = ivyConfirmFragment;
        int i11 = R$id.fragment_container;
        ivyConfirmFragment.setArguments(getIntent().getExtras());
        Unit unit = Unit.INSTANCE;
        C27032f.m66626q(this, i11, ivyConfirmFragment, null, 4, null);
    }
}
