package com.kubi.payment.fasttradev2.buy.confirm.revolut;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: BuyRevolutConfirmActivity.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "caller", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initFragment", "onNewIntent", "intent", "Landroid/content/Intent;", "needHandleActivityNotFoundException", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyRevolutConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyRevolutConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,97:1\n44#2,2:98\n48#2,2:100\n44#2,2:102\n*S KotlinDebug\n*F\n+ 1 BuyRevolutConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity\n*L\n44#1:98,2\n50#1:100,2\n75#1:102,2\n*E\n"})
public final class BuyRevolutConfirmActivity extends BaseActivity {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Companion f39196k = new Companion(null);

    /* JADX INFO: renamed from: i */
    @Nullable
    public BuyCommonConfirmExtraParams f39197i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f39198j = "";

    /* JADX INFO: compiled from: BuyRevolutConfirmActivity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/revolut/BuyRevolutConfirmActivity$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void launch$default(Companion companion, Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            companion.launch(context, buyCommonConfirmExtraParams, str);
        }

        public final void launch(@NotNull Context context, @NotNull BuyCommonConfirmExtraParams extraParams, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            Intent intent = new Intent(context, (Class<?>) BuyRevolutConfirmActivity.class);
            intent.putExtra("data", extraParams);
            intent.putExtra("spm", preSpmId);
            intent.putExtra("data_1", C45590s.f102687a.m100661L());
            context.startActivity(intent);
        }
    }

    @Override // com.kubi.sdk.BaseActivity
    public boolean needHandleActivityNotFoundException() {
        return true;
    }

    /* JADX INFO: renamed from: U */
    private final void m47712U() {
        String stringExtra;
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i11 = R$id.fragment_container;
        BuyRevolutConfirmFragment buyRevolutConfirmFragment = new BuyRevolutConfirmFragment();
        C27051h c27051hM66721e = new C27051h().m66721e("data", this.f39197i);
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("spm");
        } else {
            stringExtra = null;
        }
        buyRevolutConfirmFragment.setArguments(c27051hM66721e.m66724h("spm", stringExtra).m66717a());
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(i11, buyRevolutConfirmFragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: V */
    public static final void m47713V(BuyRevolutConfirmActivity buyRevolutConfirmActivity, View view) {
        buyRevolutConfirmActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.payment_activity_fast_buy_confirm_revolut);
        TitleBar titleBar = (TitleBar) findViewById(R$id.title_bar);
        if (titleBar != null) {
            titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.revolut.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyRevolutConfirmActivity.m47713V(this.f39206b, view);
                }
            });
        }
        try {
            Intent intent = getIntent();
            if (intent != null) {
                this.f39197i = (BuyCommonConfirmExtraParams) RouteExKt.m56272s(intent, "data");
                this.f39198j = C27041f.m66668h(intent.getStringExtra("data_1"));
            }
            if (this.f39197i != null && Intrinsics.areEqual(this.f39198j, C45590s.f102687a.m100661L())) {
                m47712U();
                return;
            }
            C43846g.m96568c(new OtcMessage("params is invalid extraParams:" + this.f39197i + ",caller:" + this.f39198j, "BuyRevolutConfirmActivity", false, 4, null), null, 2, null);
            finish();
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "RevolutConfirmActivity", false, null, 8, null), null, 2, null);
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        try {
            super.onNewIntent(intent);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "BuyRevolutConfirmActivity", false, null, 8, null), null, 2, null);
        }
        C44128b.m97266j("revolut", "BuyRevolutConfirmActivity onNewIntent");
    }
}
