package com.kubi.payment.channel.paymentmethod.withdraw;

import android.content.Context;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.fiat.withdraw.advcash.FiatAdvcashWithdrawInputFragment;
import com.kubi.otc.fiat.withdraw.birapi.BirApiWithdrawInputFragment;
import com.kubi.otc.fiat.withdraw.capitual.FiatCapitualWithdrawInputFragment;
import com.kubi.payment.channel.Channel;
import com.kubi.payment.channel.ChannelHelper;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.withdraw.ee.EasyEuroWithdrawInputFragment;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.withdraw.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WithdrawHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/withdraw/WithdrawHelper;", "", "<init>", "()V", ChannelKycRequest.SCENE_WITHDRAW, "", "context", "Landroid/content/Context;", "fiatCurrency", "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "launchAdvcashWithdraw", "launchCapitualWithdraw", "launchBirApiWithdraw", "launchEasyEuroWithdraw", "needRemind", "", "paymentMethodCode", "channelId", "launchFlutterRemindPage", "launchWithdrawFlow", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawHelper.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,165:1\n44#2,2:166\n44#2,2:168\n44#2,2:170\n*S KotlinDebug\n*F\n+ 1 WithdrawHelper.kt\ncom/kubi/payment/channel/paymentmethod/withdraw/WithdrawHelper\n*L\n57#1:166,2\n91#1:168,2\n98#1:170,2\n*E\n"})
public final class WithdrawHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WithdrawHelper f38368a = new WithdrawHelper();

    /* JADX INFO: renamed from: a */
    public final void m45986a(Context context, String str, PaymentMethod paymentMethod) {
        FiatAdvcashWithdrawInputFragment.f37478i0.launch(context, str, paymentMethod);
    }

    /* JADX INFO: renamed from: b */
    public final void m45987b(Context context, String str, PaymentMethod paymentMethod) {
        BirApiWithdrawInputFragment.f37498i0.launch(context, str, paymentMethod);
    }

    /* JADX INFO: renamed from: c */
    public final void m45988c(Context context, String str, PaymentMethod paymentMethod) {
        FiatCapitualWithdrawInputFragment.f37516i0.launch(context, str, paymentMethod);
    }

    /* JADX INFO: renamed from: d */
    public final void m45989d(String str, PaymentMethod paymentMethod) {
        EasyEuroWithdrawInputFragment.Companion companion = EasyEuroWithdrawInputFragment.f38395i0;
        companion.setFiatCurrency(C27041f.m66668h(str));
        companion.setTempPaymentMethod(paymentMethod);
        if (m45992g(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId()))) {
            m45990e(str, paymentMethod);
        } else {
            InterfaceC37758j.a.m85154c(C37304a.f82764a, null, null, null, 7, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m45990e(String str, PaymentMethod paymentMethod) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/withdraw/reminder", false, 2, null)).m4038a("paymentMethodCode", C27041f.m66668h(paymentMethod.getPaymentMethodCode())).m4038a("channelId", C27041f.m66668h(paymentMethod.getChannelId())).m4038a("fiatCurrency", C27041f.m66668h(str)).m4038a("limitMin", C27041f.m66668h(paymentMethod.getMinAmount())).m4038a("limitMax", C27041f.m66668h(paymentMethod.getMaxAmount())).m4048k();
    }

    /* JADX INFO: renamed from: f */
    public final void m45991f(String str, PaymentMethod paymentMethod) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/withdraw/init", false, 2, null)).m4038a("paymentMethodCode", C27041f.m66668h(paymentMethod.getPaymentMethodCode())).m4038a("channelId", C27041f.m66668h(paymentMethod.getChannelId())).m4038a("fiatCurrency", C27041f.m66668h(str)).m4048k();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m45992g(String str, String str2) {
        return C46392a.m102322d(PaymentStorageId.f40364a.m49823a(str, str2), true);
    }

    /* JADX INFO: renamed from: h */
    public final void m45993h(@NotNull Context context, @Nullable String str, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Channel channelM45662a = ChannelHelper.f38219a.m45662a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId()));
        if (channelM45662a instanceof Channel.Advcash) {
            m45986a(context, str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Capitual) {
            m45988c(context, str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.EasyEuro) {
            m45989d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Nuvei) {
            C43846g.m96568c(new OtcException(new Exception("payment withdraw unsupported nuvei channel:" + channelM45662a), "WithdrawHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (channelM45662a instanceof Channel.Bcb) {
            m45991f(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Transfero) {
            m45991f(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.BirApi) {
            m45987b(context, str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Scb) {
            m45991f(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Build) {
            m45991f(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Ivy) {
            C43846g.m96568c(new OtcException(new Exception("payment withdrawal unsupported for ivy channel:" + channelM45662a), "WithdrawHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (!(channelM45662a instanceof Channel.UnSupportedChannel)) {
            throw new NoWhenBranchMatchedException();
        }
        C43846g.m96568c(new OtcException(new Exception("payment withdraw unsupported channel:" + channelM45662a), "WithdrawHelper", false, null, 8, null), null, 2, null);
    }
}
