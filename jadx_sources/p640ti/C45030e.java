package p640ti;

import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.PositionTrialEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ti.e */
/* JADX INFO: compiled from: BasePositionWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010D\u001a\u0004\u0018\u00010ER\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0010R\u0011\u0010#\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0010R\u0011\u0010'\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0010R\u0011\u0010)\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0010R\u0011\u0010+\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0010R\u0011\u0010-\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0010R\u0011\u0010/\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0010R\u0011\u00101\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0010R\u001b\u00103\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b4\u0010\u0010R\u001b\u00107\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b8\u0010\u0010R\u001b\u0010:\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b;\u0010\u0010R\u001d\u0010=\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b>\u0010\u0010R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\b@\u0010BR\u0011\u0010C\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bC\u0010BR\u0011\u0010F\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bF\u0010B¨\u0006G"}, m90084d2 = {"Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", "Lcom/kubi/futures/trade/position/data/IPositionEntityWrapper;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "orders", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "currentSymbol", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/lang/String;)V", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getOrders", "()Ljava/util/List;", "getCurrentSymbol", "()Ljava/lang/String;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "getContract", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "stub", "getStub", "pnlLabel", "getPnlLabel", "side", "", "getSide", "()Ljava/lang/CharSequence;", "sideColor", "", "getSideColor", "()I", "marginMode", "getMarginMode", "leverage", "getLeverage", "qtyLabel", "getQtyLabel", "qty", "getQty", "pnlLegal", "getPnlLegal", "openPrice", "getOpenPrice", "markPrice", "getMarkPrice", "liquidationPrice", "getLiquidationPrice", "riskRatio", "getRiskRatio", "trialAmount", "getTrialAmount", "trialAmount$delegate", "Lkotlin/Lazy;", "minTotalAmount", "getMinTotalAmount", "minTotalAmount$delegate", "minCloseRealisedPnl", "getMinCloseRealisedPnl", "minCloseRealisedPnl$delegate", "maxValue", "getMaxValue", "maxValue$delegate", "isSettle", "", "()Z", "isMaintainOrCancelOnly", "getRiskRatioDrawable", "Landroid/graphics/drawable/Drawable;", "isReverseEnable", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C45030e implements InterfaceC45033h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final PositionEntity f101404a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<OrderEntity> f101405b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f101406c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ContractEntity f101407d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final String f101408e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final String f101409f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final CharSequence f101410g;

    /* JADX INFO: renamed from: h */
    public final int f101411h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final String f101412i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final String f101413j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final String f101414k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f101415l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final String f101416m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final String f101417n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final String f101418o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final String f101419p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final String f101420q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f101421r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Lazy f101422s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Lazy f101423t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Lazy f101424u;

    /* JADX INFO: renamed from: v */
    public final boolean f101425v;

    /* JADX INFO: renamed from: w */
    public final boolean f101426w;

    /* JADX INFO: renamed from: x */
    public final boolean f101427x;

    /* JADX WARN: Code duplicated, block: B:27:0x015e  */
    public C45030e(@NotNull PositionEntity position, @NotNull List<OrderEntity> orders, @NotNull String currentSymbol) {
        String strM89950x;
        boolean z11;
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        this.f101404a = position;
        this.f101405b = orders;
        this.f101406c = currentSymbol;
        ContractEntity contractEntityM84661b = C37569d.m84661b(position);
        this.f101407d = contractEntityM84661b;
        C27017c c27017c = C27017c.f54310a;
        boolean z12 = false;
        String strM66516f = c27017c.m66516f(R$string.stub, new Object[0]);
        this.f101408e = strM66516f;
        this.f101409f = c27017c.m66516f(R$string.unrealised_pnl, new Object[0]) + '(' + C27041f.m66677q(position.getSettleCurrency()) + ')';
        this.f101410g = C37569d.m84679t(position);
        this.f101411h = C22890g.m54281f(c27017c.m66513b(), C37569d.m84685z(position));
        this.f101412i = C37569d.m84668i(position);
        this.f101413j = C37569d.m84663d(position);
        this.f101414k = c27017c.m66516f(R$string.qty, new Object[0]) + '(' + FuturesDisplayNameUtils.f22525a.m24439d(contractEntityM84661b) + ')';
        this.f101415l = C37569d.m84673n(position, contractEntityM84661b, null, 2, null);
        BigDecimal bigDecimalM84658J = C37569d.m84658J(position);
        if (bigDecimalM84658J == null || (bigDecimalAbs = bigDecimalM84658J.abs()) == null) {
            strM89950x = null;
        } else {
            double dDoubleValue = bigDecimalAbs.doubleValue();
            String strM66677q = C27041f.m66677q(position.getSettleCurrency());
            strM89950x = C41014a.m89950x(C41014a.m89939m(dDoubleValue, strM66677q == null ? C37567b.m84620j(contractEntityM84661b) : strM66677q), null, null, 0, false, false, true, true, 31, null);
        }
        this.f101416m = C27041f.m66669i(strM89950x, strM66516f);
        this.f101417n = C37569d.m84670k(position, contractEntityM84661b);
        this.f101418o = C37569d.m84669j(position, contractEntityM84661b);
        this.f101419p = C37569d.m84664e(position, contractEntityM84661b);
        this.f101420q = C37569d.m84676q(position);
        this.f101421r = LazyKt.lazy(new Function0() { // from class: ti.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45030e.m99548G(this.f101400b);
            }
        });
        this.f101422s = LazyKt.lazy(new Function0() { // from class: ti.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45030e.m99547F(this.f101401b);
            }
        });
        this.f101423t = LazyKt.lazy(new Function0() { // from class: ti.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45030e.m99546E(this.f101402b);
            }
        });
        this.f101424u = LazyKt.lazy(new Function0() { // from class: ti.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45030e.m99545D(this.f101403b);
            }
        });
        this.f101425v = C27025c.m66566d(contractEntityM84661b != null ? Boolean.valueOf(C37567b.m84627q(contractEntityM84661b)) : null);
        if (Intrinsics.areEqual(contractEntityM84661b != null ? contractEntityM84661b.getStatus() : null, "Paused")) {
            z11 = true;
        } else {
            if (Intrinsics.areEqual(contractEntityM84661b != null ? contractEntityM84661b.getStatus() : null, "CancelOnly")) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f101426w = z11;
        if (RepositoryServiceLocator.f19236a.m20288g().mo25020o() && !C27092t0.m66897b(position.getPrizeType())) {
            z12 = true;
        }
        this.f101427x = z12;
    }

    /* JADX INFO: renamed from: D */
    public static final String m99545D(C45030e c45030e) {
        BigDecimal maxValue;
        String strM66677q = C27041f.m66677q(c45030e.f101404a.getSettleCurrency());
        if (strM66677q == null) {
            strM66677q = C37567b.m84620j(c45030e.f101407d);
        }
        PositionTrialEntity trialCoupon = c45030e.f101404a.getTrialCoupon();
        String strM92640e = null;
        strM92640e = null;
        if (trialCoupon != null && (maxValue = trialCoupon.getMaxValue()) != null) {
            ContractEntity contractEntity = c45030e.f101407d;
            strM92640e = C42180b.m92640e(maxValue, null, C27039d.m66651k(contractEntity != null ? Integer.valueOf(C37567b.m84623m(contractEntity)) : null, 2), true, false, false, 0, null, 121, null);
        }
        return C42828b.m93915p(C42828b.m93906g(C42828b.m93902c(strM92640e), C27041f.m66668h(strM66677q), true, false, 4, null));
    }

    /* JADX INFO: renamed from: E */
    public static final String m99546E(C45030e c45030e) {
        BigDecimal minCloseRealisedPnl;
        PositionTrialEntity trialCoupon = c45030e.f101404a.getTrialCoupon();
        String string = null;
        if (trialCoupon != null && (minCloseRealisedPnl = trialCoupon.getMinCloseRealisedPnl()) != null) {
            ContractEntity contractEntity = c45030e.f101407d;
            String strM92640e = C42180b.m92640e(minCloseRealisedPnl, null, C27039d.m66651k(contractEntity != null ? Integer.valueOf(C37567b.m84623m(contractEntity)) : null, 2), true, false, false, 0, null, 121, null);
            if (strM92640e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strM92640e);
                sb2.append(' ');
                String strM66677q = C27041f.m66677q(c45030e.f101404a.getSettleCurrency());
                if (strM66677q == null) {
                    strM66677q = C37567b.m84620j(c45030e.f101407d);
                }
                sb2.append(strM66677q);
                string = sb2.toString();
            }
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: F */
    public static final String m99547F(C45030e c45030e) {
        BigDecimal minTotalAmount;
        PositionTrialEntity trialCoupon = c45030e.f101404a.getTrialCoupon();
        String string = null;
        if (trialCoupon != null && (minTotalAmount = trialCoupon.getMinTotalAmount()) != null) {
            ContractEntity contractEntity = c45030e.f101407d;
            String strM92640e = C42180b.m92640e(minTotalAmount, null, C27039d.m66651k(contractEntity != null ? Integer.valueOf(C37567b.m84623m(contractEntity)) : null, 2), true, false, false, 0, null, 121, null);
            if (strM92640e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strM92640e);
                sb2.append(' ');
                String strM66677q = C27041f.m66677q(c45030e.f101404a.getSettleCurrency());
                if (strM66677q == null) {
                    strM66677q = C37567b.m84620j(c45030e.f101407d);
                }
                sb2.append(strM66677q);
                string = sb2.toString();
            }
        }
        return C27041f.m66668h(string);
    }

    /* JADX INFO: renamed from: G */
    public static final String m99548G(C45030e c45030e) {
        BigDecimal faceValue;
        PositionTrialEntity trialCoupon = c45030e.f101404a.getTrialCoupon();
        String string = null;
        if (trialCoupon != null && (faceValue = trialCoupon.getFaceValue()) != null) {
            ContractEntity contractEntity = c45030e.f101407d;
            String strM92640e = C42180b.m92640e(faceValue, null, C27039d.m66651k(contractEntity != null ? Integer.valueOf(C37567b.m84623m(contractEntity)) : null, 2), true, false, false, 0, null, 121, null);
            if (strM92640e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strM92640e);
                sb2.append(' ');
                String strM66677q = C27041f.m66677q(c45030e.f101404a.getSettleCurrency());
                if (strM66677q == null) {
                    strM66677q = C37567b.m84620j(c45030e.f101407d);
                }
                sb2.append(strM66677q);
                string = sb2.toString();
            }
        }
        return C27041f.m66669i(string, c45030e.f101408e);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getF101426w() {
        return this.f101426w;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getF101427x() {
        return this.f101427x;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getF101425v() {
        return this.f101425v;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ContractEntity getF101407d() {
        return this.f101407d;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF101406c() {
        return this.f101406c;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getF101413j() {
        return this.f101413j;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getF101419p() {
        return this.f101419p;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getF101412i() {
        return this.f101412i;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getF101418o() {
        return this.f101418o;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final String m99562k() {
        return (String) this.f101424u.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final String m99563l() {
        return (String) this.f101423t.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m99564m() {
        return (String) this.f101422s.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getF101417n() {
        return this.f101417n;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<OrderEntity> m99566o() {
        return this.f101405b;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getF101409f() {
        return this.f101409f;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getF101416m() {
        return this.f101416m;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final PositionEntity getF101404a() {
        return this.f101404a;
    }

    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getF101415l() {
        return this.f101415l;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getF101414k() {
        return this.f101414k;
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getF101420q() {
        return this.f101420q;
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public final Drawable m99573v() {
        if (this.f101404a.getAdjustCrossMMR() == null || !C37569d.m84649A(this.f101404a)) {
            return null;
        }
        return C27017c.f54310a.m66514c(R$drawable.ic2_warning_12, Integer.valueOf(R$color.complementary));
    }

    @NotNull
    /* JADX INFO: renamed from: w, reason: from getter */
    public final CharSequence getF101410g() {
        return this.f101410g;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getF101411h() {
        return this.f101411h;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getF101408e() {
        return this.f101408e;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final String m99577z() {
        return (String) this.f101421r.getValue();
    }
}
