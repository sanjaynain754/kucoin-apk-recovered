package com.kubi.payment.fasttrade.sell.confirm.bankcard;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.mvi.common.MviExKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.widget.web.ui.KWebBaseActivity;
import cu.InterfaceC36535f;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SellBankCardConfirmInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "Lcom/kubi/payment/interceptor/route/IFastTradeRNRouter;", "<init>", "()V", "rnSwitchOpen", "", "getRnSwitchOpen", "()Z", "rnSwitchOpen$delegate", "Lkotlin/Lazy;", "intercept", "chain", "Lcom/kubi/router/interceptor/IChain;", "handleJump", "", "postcard", "Lcom/kubi/router/model/Postcard;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellBankCardConfirmInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellBankCardConfirmInterceptor.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,89:1\n35#2,4:90\n39#2:96\n44#3,2:94\n*S KotlinDebug\n*F\n+ 1 SellBankCardConfirmInterceptor.kt\ncom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor\n*L\n32#1:90,4\n32#1:96\n32#1:94,2\n*E\n"})
public final class SellBankCardConfirmInterceptor implements InterfaceC46936b, InterfaceC36535f {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f38861b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f38862a = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SellBankCardConfirmInterceptor.m47039h());
        }
    });

    /* JADX INFO: compiled from: SellBankCardConfirmInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/bankcard/SellBankCardConfirmInterceptor$Companion;", "", "<init>", "()V", "KEY_CARD_ID", "", "KEY_EXTRA_PARAMS", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmInterceptor$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20616a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: e */
    private final boolean m47036e() {
        return ((Boolean) this.f38862a.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    private final void m47037f(C4400a c4400a) {
        MviExKt.m42518n(new SellBankCardConfirmInterceptor$handleJump$1(c4400a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Unit m47038g(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof KWebBaseActivity) {
            it.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final boolean m47039h() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20616a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_fast_rn_new", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, false);
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (!m47036e()) {
            m47037f(postcard);
            return true;
        }
        m81799a(postcard, "FastTradeSellConfirmPage");
        C42899b.m94073c(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.bankcard.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellBankCardConfirmInterceptor.m47038g((FragmentActivity) obj);
            }
        });
        return true;
    }
}
