package com.kubi.otc.fiat.withdraw.birapi;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawConfrimBundle;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p270ft.C37705x;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BirApiWithdrawInputFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawInputFragment;", "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;", "<init>", "()V", "startAddAccount", "", "startOrderConfirm", "fee", "Lcom/kubi/otc/entity/FiatFee;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBirApiWithdrawInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirApiWithdrawInputFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawInputFragment\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,48:1\n48#2,2:49\n*S KotlinDebug\n*F\n+ 1 BirApiWithdrawInputFragment.kt\ncom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawInputFragment\n*L\n28#1:49,2\n*E\n"})
public final class BirApiWithdrawInputFragment extends AbsFiatWithdrawInputFragment {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f37498i0 = new Companion(null);

    /* JADX INFO: compiled from: BirApiWithdrawInputFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/birapi/BirApiWithdrawInputFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.CURRENCY, "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable String currency, @Nullable PaymentMethod paymentMethod) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbsFiatWithdrawInputFragment.Companion companion = AbsFiatWithdrawInputFragment.f37429g0;
            String name = BirApiWithdrawInputFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            companion.startFragment(context, currency, paymentMethod, name);
        }
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: J4 */
    public void mo44397J4() {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/recharge/init", false, 2, null));
        PaymentMethod f37438b0 = getF37438b0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("paymentMethodCode", C27041f.m66668h(f37438b0 != null ? f37438b0.getPaymentMethodCode() : null));
        PaymentMethod f37438b1 = getF37438b0();
        c4400aM4038a.m4038a("channelId", C27041f.m66668h(f37438b1 != null ? f37438b1.getChannelId() : null)).m4038a("fiatCurrency", C27041f.m66668h(getF37436Z())).m4048k();
        C43846g.m96568c(new OtcMessage("startAddAccount", "BirApiWithdrawInputFragment", false, 4, null), null, 2, null);
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: K4 */
    public void mo44398K4(@Nullable FiatFee fiatFee) {
        FiatEditTextView fiatEditTextView;
        BirApiWithdrawConfirmFragment.Companion companion = BirApiWithdrawConfirmFragment.f37494a0;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        String f37436z = getF37436Z();
        C37705x c37705xM44408d4 = m44408d4();
        companion.launch(mContext, new FiatWithdrawConfrimBundle(f37436z, (c37705xM44408d4 == null || (fiatEditTextView = c37705xM44408d4.f84849s) == null) ? null : fiatEditTextView.getInputText(), fiatFee, getF37438b0(), getF37439c0()));
    }
}
