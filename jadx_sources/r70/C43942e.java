package r70;

import android.os.Bundle;
import com.kubi.core.base.TradeAccountType;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.utaspotlib.biz.order.UtaSubmitOrderConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import s70.C44359a;
import t70.C44700a;
import u70.C45131c;

/* JADX INFO: renamed from: r70.e */
/* JADX INFO: compiled from: UtaCoreDataRepoProvider.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, m90084d2 = {"Lcom/kubi/utaspotlib/repo/UtaCoreDataRepoProvider;", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "arguments", "Landroid/os/Bundle;", "<init>", "(Landroid/os/Bundle;)V", "tradeType", "", "getTradeType", "()Ljava/lang/String;", "tradeType$delegate", "Lkotlin/Lazy;", "tradeAccountType", "Lcom/kubi/core/base/TradeAccountType;", "getTradeAccountType", "()Lcom/kubi/core/base/TradeAccountType;", "tradeAccountType$delegate", "orderRepo", "Lcom/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo;", "getOrderRepo", "()Lcom/kubi/utaspotlib/repo/order/UtaTradeOrderDataRepo;", "orderRepo$delegate", "balanceRepo", "Lcom/kubi/utaspotlib/repo/balance/UtaTradeBalanceDataRepo;", "getBalanceRepo", "()Lcom/kubi/utaspotlib/repo/balance/UtaTradeBalanceDataRepo;", "settingsRepo", "Lcom/kubi/utaspotlib/repo/UnifiedSettingsRepo;", "getSettingsRepo", "()Lcom/kubi/utaspotlib/repo/UnifiedSettingsRepo;", "orderConfig", "Lcom/kubi/utaspotlib/biz/order/UtaSubmitOrderConfig;", "getOrderConfig", "()Lcom/kubi/utaspotlib/biz/order/UtaSubmitOrderConfig;", "routerPageOperator", "Lcom/kubi/utaspotlib/repo/assets/UtaBizRouterOperator;", "getRouterPageOperator", "()Lcom/kubi/utaspotlib/repo/assets/UtaBizRouterOperator;", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C43942e extends AbstractC46753c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Bundle f97151a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f97152b = LazyKt.lazy(new Function0() { // from class: r70.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43942e.m96891q(this.f97148b);
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f97153c = LazyKt.lazy(new Function0() { // from class: r70.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43942e.m96890p(this.f97149b);
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f97154d = LazyKt.lazy(new Function0() { // from class: r70.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C43942e.m96889o(this.f97150b);
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final C44700a f97155e = new C44700a();

    /* JADX INFO: renamed from: f */
    @NotNull
    public final C43938a f97156f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final UtaSubmitOrderConfig f97157g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final C44359a f97158h;

    /* JADX INFO: renamed from: o */
    public static final C45131c m96889o(C43942e c43942e) {
        return new C45131c(c43942e.mo96896e());
    }

    /* JADX INFO: renamed from: q */
    public static final String m96891q(C43942e c43942e) {
        Bundle bundle = c43942e.f97151a;
        if (bundle != null) {
            return bundle.getString("tradeType");
        }
        return null;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: e */
    public TradeAccountType mo96896e() {
        return (TradeAccountType) this.f97153c.getValue();
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public UtaSubmitOrderConfig mo96892a() {
        return this.f97157g;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C45131c mo96893b() {
        return (C45131c) this.f97154d.getValue();
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter and merged with bridge method [inline-methods] */
    public C44359a mo96894c() {
        return this.f97158h;
    }

    @Override // p827zc.AbstractC46753c
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter and merged with bridge method [inline-methods] */
    public C43938a mo96895d() {
        return this.f97156f;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public final String m96901n() {
        return (String) this.f97152b.getValue();
    }

    public C43942e(@Nullable Bundle bundle) {
        InterfaceC38170b interfaceC38170b;
        this.f97151a = bundle;
        C43938a c43938a = new C43938a();
        c43938a.mo85486d(bundle);
        if (ISpotCommonService.f49644a.get().mo59968l()) {
            interfaceC38170b = InterfaceC38170b.b.f85867a;
        } else {
            interfaceC38170b = InterfaceC38170b.a.f85866a;
        }
        c43938a.mo85485c(interfaceC38170b);
        this.f97156f = c43938a;
        this.f97157g = UtaSubmitOrderConfig.f54174a;
        this.f97158h = C44359a.f98026a;
    }

    /* JADX INFO: renamed from: p */
    public static final TradeAccountType m96890p(C43942e c43942e) {
        if (Intrinsics.areEqual(c43942e.m96901n(), "MARGIN_TRADE")) {
            return TradeAccountType.Margin.INSTANCE;
        }
        return TradeAccountType.Unified.INSTANCE;
    }
}
