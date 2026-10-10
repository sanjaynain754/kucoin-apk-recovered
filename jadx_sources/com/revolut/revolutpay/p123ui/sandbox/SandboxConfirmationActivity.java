package com.revolut.revolutpay.p123ui.sandbox;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.revolut.revolutpay.R$id;
import com.revolut.revolutpay.R$layout;
import com.revolut.revolutpay.R$string;
import com.revolut.revolutpay.p123ui.navigator.internal.C27557c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import pa0.C43428b;

/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m90084d2 = {"Lcom/revolut/revolutpay/ui/sandbox/SandboxConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/revolut/revolutpay/ui/sandbox/a$b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "", "text", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)V", "returnUrl", "b", "Lcom/revolut/revolutpay/ui/sandbox/a;", "i", "Lkotlin/Lazy;", "I", "()Lcom/revolut/revolutpay/ui/sandbox/a;", "presenter", "Lpa0/b;", "j", "Lpa0/b;", "navigator", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1})
public final class SandboxConfirmationActivity extends AppCompatActivity implements C27586a.b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter = LazyKt.lazy(new C27585a());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C43428b navigator = new C43428b(this);

    /* JADX INFO: renamed from: com.revolut.revolutpay.ui.sandbox.SandboxConfirmationActivity$a */
    public static final class C27585a extends Lambda implements Function0<C27586a> {
        public C27585a() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27586a invoke() {
            return new C27586a(SandboxConfirmationActivity.this);
        }
    }

    /* JADX INFO: renamed from: I */
    public final C27586a m68476I() {
        return (C27586a) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: J */
    public static final void m68474J(SandboxConfirmationActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: renamed from: K */
    public static final void m68475K(SandboxConfirmationActivity this$0, String str, String str2, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C27586a c27586aM68476I = this$0.m68476I();
        if (str == null) {
            str = "";
        }
        c27586aM68476I.m68487g(str, str2);
    }

    @Override // com.revolut.revolutpay.p123ui.sandbox.C27586a.b
    @UiThread
    /* JADX INFO: renamed from: a */
    public void mo68477a(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Toast.makeText(this, text, 0).show();
    }

    @Override // com.revolut.revolutpay.p123ui.sandbox.C27586a.b
    /* JADX INFO: renamed from: b */
    public void mo68478b(@Nullable String returnUrl) {
        finish();
        if (returnUrl != null && returnUrl.length() != 0) {
            C43428b c43428b = this.navigator;
            Uri uri = Uri.parse(returnUrl);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(returnUrl)");
            c43428b.m95616f(new C27557c(uri));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        final String queryParameter;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.internal_revolut_pay_sandbox_confirmation_activity);
        setTitle("Sandbox Payment Confirmation flow");
        Uri data = getIntent().getData();
        final String queryParameter2 = null;
        if (data != null) {
            queryParameter = data.getQueryParameter("orderToken");
        } else {
            queryParameter = null;
        }
        Uri data2 = getIntent().getData();
        if (data2 != null) {
            queryParameter2 = data2.getQueryParameter("returnUrl");
        }
        ((TextView) findViewById(R$id.internalRevolutPay_confirmTextView)).setText(getString(R$string.revolut_pay_confirmation_text, queryParameter));
        ((Button) findViewById(R$id.internalRevolutPay_confirmPaymentButton)).setOnClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.sandbox.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SandboxConfirmationActivity.m68475K(this.f56361b, queryParameter, queryParameter2, view);
            }
        });
        ((Button) findViewById(R$id.internalRevolutPay_cancelPaymentButton)).setOnClickListener(new View.OnClickListener() { // from class: com.revolut.revolutpay.ui.sandbox.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SandboxConfirmationActivity.m68474J(this.f56364b, view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m68476I().m68486f();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m68476I().m68488i();
    }
}
