package com.kubi.payment.fasttradev2.buy.confirm.ivy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
import com.kubi.utils.extensions.core.C27032f;
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

/* JADX INFO: compiled from: BuyIvyConfirmActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "fragment", "Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmFragment;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "caller", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "needHandleActivityNotFoundException", "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyIvyConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyIvyConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmActivity\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,93:1\n44#2,2:94\n48#2,2:96\n44#2,2:98\n*S KotlinDebug\n*F\n+ 1 BuyIvyConfirmActivity.kt\ncom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmActivity\n*L\n44#1:94,2\n50#1:96,2\n73#1:98,2\n*E\n"})
public final class BuyIvyConfirmActivity extends BaseActivity {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f39142l = new Companion(null);

    /* JADX INFO: renamed from: i */
    public BuyIvyConfirmFragment f39143i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public BuyCommonConfirmExtraParams f39144j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public String f39145k = "";

    /* JADX INFO: compiled from: BuyIvyConfirmActivity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/ivy/BuyIvyConfirmActivity$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "preSpmId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
            Intent intent = new Intent(context, (Class<?>) BuyIvyConfirmActivity.class);
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        try {
            super.onNewIntent(intent);
            BuyIvyConfirmFragment buyIvyConfirmFragment = this.f39143i;
            if (buyIvyConfirmFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment");
                buyIvyConfirmFragment = null;
            }
            BuyIvyConfirmFragment.m47658H4(buyIvyConfirmFragment, null, 1, null);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "IvyConfirmActivity", false, null, 8, null), null, 2, null);
        }
        C44128b.m97266j("ivy", "IvyConfirmActivity onNewIntent");
    }

    /* JADX INFO: renamed from: U */
    public static final void m47651U(BuyIvyConfirmActivity buyIvyConfirmActivity, View view) {
        buyIvyConfirmActivity.finish();
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams;
        String stringExtra;
        super.onCreate(savedInstanceState);
        setContentView(R$layout.payment_activity_fast_buy_confirm_ivy);
        TitleBar titleBar = (TitleBar) findViewById(R$id.title_bar);
        if (titleBar != null) {
            titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.ivy.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyIvyConfirmActivity.m47651U(this.f39153b, view);
                }
            });
        }
        String stringExtra2 = null;
        try {
            Intent intent = getIntent();
            if (intent != null) {
                buyCommonConfirmExtraParams = (BuyCommonConfirmExtraParams) RouteExKt.m56272s(intent, "data");
            } else {
                buyCommonConfirmExtraParams = null;
            }
            this.f39144j = buyCommonConfirmExtraParams;
            Intent intent2 = getIntent();
            if (intent2 != null) {
                stringExtra = intent2.getStringExtra("data_1");
            } else {
                stringExtra = null;
            }
            String strM66668h = C27041f.m66668h(stringExtra);
            this.f39145k = strM66668h;
            if (this.f39144j != null && Intrinsics.areEqual(strM66668h, C45590s.f102687a.m100661L())) {
                BuyIvyConfirmFragment buyIvyConfirmFragment = new BuyIvyConfirmFragment();
                this.f39143i = buyIvyConfirmFragment;
                int i11 = R$id.fragment_container;
                C27051h c27051hM66721e = new C27051h().m66721e("data", this.f39144j);
                Intent intent3 = getIntent();
                if (intent3 != null) {
                    stringExtra2 = intent3.getStringExtra("spm");
                }
                buyIvyConfirmFragment.setArguments(c27051hM66721e.m66724h("spm", stringExtra2).m66717a());
                Unit unit = Unit.INSTANCE;
                C27032f.m66626q(this, i11, buyIvyConfirmFragment, null, 4, null);
                return;
            }
            C43846g.m96568c(new OtcMessage("params is invalid extraParams:" + this.f39144j + ",caller:" + this.f39145k, "BuyIvyConfirmActivity", false, 4, null), null, 2, null);
            finish();
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(e11, "BuyIvyConfirmActivity", false, null, 8, null), null, 2, null);
            finish();
        }
    }
}
