package com.kubi.payment.channel.paymentmethod.recharge;

import android.content.Context;
import androidx.media3.exoplayer.RendererCapabilities;
import com.kubi.otc.entity.FiatAdvcashRechargeMode;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashInputFragment;
import com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualDetailFragment;
import com.kubi.otc.fiat.recharge.capitual.FiatRechargeCapitualRemindFragment;
import com.kubi.payment.channel.Channel;
import com.kubi.payment.channel.ChannelHelper;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.payment.channel.paymentmethod.recharge.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RechargeHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper;", "", "<init>", "()V", "recharge", "", "context", "Landroid/content/Context;", "fiatCurrency", "", "paymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "launchAdvcashRecharge", "launchCapitualRecharge", "launchRechargeFlow", "launchFlutterRecharge", "route", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRechargeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeHelper.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,151:1\n44#2,2:152\n*S KotlinDebug\n*F\n+ 1 RechargeHelper.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargeHelper\n*L\n88#1:152,2\n*E\n"})
public final class RechargeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final RechargeHelper f38317a = new RechargeHelper();

    /* JADX INFO: renamed from: a */
    public final void m45907a(Context context, String str, PaymentMethod paymentMethod) {
        FiatRechargeAdvCashInputFragment.f37313Z.launch(context, new FiatAdvcashRechargeMode(paymentMethod.getChannelId(), str, paymentMethod.getTitle(), paymentMethod.getIconUrl(), paymentMethod.getMinAmount(), paymentMethod.getMaxAmount(), paymentMethod.getFeeMessage(), null, null, RendererCapabilities.DECODER_SUPPORT_MASK, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m45908b(Context context, String str, PaymentMethod paymentMethod) {
        if (C46392a.m102322d(PaymentStorageId.f40364a.m49824b(), true)) {
            FiatRechargeCapitualRemindFragment.f37352Y.launch(context, str, paymentMethod);
        } else {
            FiatRechargeCapitualDetailFragment.f37341c0.launch(context, str, paymentMethod);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m45909c(String str, String str2, PaymentMethod paymentMethod) {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, str, false, 2, null)).m4038a("paymentMethodCode", C27041f.m66668h(paymentMethod.getPaymentMethodCode())).m4038a("channelId", C27041f.m66668h(paymentMethod.getChannelId())).m4038a("fiatCurrency", C27041f.m66668h(str2)).m4038a("spm", C43852m.m96602n("B7FiatDepositMethod", "PaymentMethod", null, 4, null)).m4048k();
    }

    /* JADX INFO: renamed from: d */
    public final void m45910d(String str, PaymentMethod paymentMethod) {
        m45909c("payment/recharge/init", str, paymentMethod);
    }

    /* JADX INFO: renamed from: e */
    public final void m45911e(@NotNull Context context, @Nullable String str, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Channel channelM45662a = ChannelHelper.f38219a.m45662a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId()));
        if (channelM45662a instanceof Channel.Advcash) {
            m45907a(context, str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Capitual) {
            m45908b(context, str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.EasyEuro) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Nuvei) {
            m45909c("payment/channel/recharge/nuvei/input", str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Bcb) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Transfero) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.BirApi) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Scb) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Build) {
            m45910d(str, paymentMethod);
            return;
        }
        if (channelM45662a instanceof Channel.Ivy) {
            m45910d(str, paymentMethod);
        } else {
            if (!(channelM45662a instanceof Channel.UnSupportedChannel)) {
                throw new NoWhenBranchMatchedException();
            }
            C43846g.m96568c(new OtcException(new Exception("payment recharge unsupported channel:" + channelM45662a), "RechargeHelper", false, null, 8, null), null, 2, null);
        }
    }
}
