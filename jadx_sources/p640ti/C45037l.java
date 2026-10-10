package p640ti;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import fm.C37567b;
import fm.C37569d;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ti.l */
/* JADX INFO: compiled from: ProPositionWrapper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/trade/position/data/ProPositionWrapper;", "Lcom/kubi/futures/trade/position/data/BasePositionWrapper;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "orders", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "currentSymbol", "", "<init>", "(Lcom/kubi/kumex/data/trade/model/PositionEntity;Ljava/util/List;Ljava/lang/String;)V", "roi", "Lcom/kubi/utils/StyledText;", "getRoi", "()Lcom/kubi/utils/StyledText;", "pnl", "getPnl", "releasedPnlLabel", "getReleasedPnlLabel", "()Ljava/lang/String;", "releasedPnlValue", "getReleasedPnlValue", "marginLabel", "getMarginLabel", ViewProps.MARGIN, "getMargin", "marginLegal", "getMarginLegal", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45037l extends C45030e {

    /* JADX INFO: renamed from: A */
    @NotNull
    public final String f101439A;

    /* JADX INFO: renamed from: B */
    @NotNull
    public final String f101440B;

    /* JADX INFO: renamed from: y */
    @NotNull
    public final String f101441y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final String f101442z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45037l(@NotNull PositionEntity position, @NotNull List<OrderEntity> orders, @NotNull String currentSymbol) {
        super(position, orders, currentSymbol);
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(orders, "orders");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.realised_pnl, new Object[0]));
        sb2.append('(');
        sb2.append(C27041f.m66677q(position.getSettleCurrency()));
        sb2.append(')');
        this.f101441y = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c27017c.m66516f(R$string.margin, new Object[0]));
        sb3.append(" (");
        String strM66677q = C27041f.m66677q(position.getSettleCurrency());
        sb3.append(strM66677q == null ? C37567b.m84620j(getF101407d()) : strM66677q);
        sb3.append(')');
        this.f101442z = sb3.toString();
        this.f101439A = C37569d.m84666g(position, getF101407d());
        this.f101440B = C37569d.m84667h(position, getF101407d());
    }

    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getF101439A() {
        return this.f101439A;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getF101442z() {
        return this.f101442z;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getF101440B() {
        return this.f101440B;
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getF101441y() {
        return this.f101441y;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final C27096v0 m99595M() {
        String strM92640e;
        C27096v0 c27096v0 = new C27096v0();
        BigDecimal realisedPnl = getF101404a().getRealisedPnl();
        if (realisedPnl != null) {
            int iM84623m = C37567b.m84623m(getF101407d());
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            strM92640e = C42180b.m92640e(realisedPnl, null, iM84623m, true, true, true, 0, ENGLISH, 33, null);
        } else {
            strM92640e = null;
        }
        C27096v0 c27096v0M66905e = c27096v0.m66905e(C42828b.m93902c(C27041f.m66669i(strM92640e, getF101408e())), C22890g.m54280e(C27017c.f54310a.m66513b(), C27039d.m66656p(getF101404a().getRealisedPnl()), R$color.c_text));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
        return c27096v0M66905e;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final C27096v0 m99593K() {
        String strM92640e;
        BigDecimal bigDecimalM84658J = C37569d.m84658J(getF101404a());
        C27096v0 c27096v0 = new C27096v0();
        if (bigDecimalM84658J != null) {
            strM92640e = C42180b.m92640e(bigDecimalM84658J, null, C37567b.m84623m(getF101407d()), true, true, true, 0, null, 97, null);
        } else {
            strM92640e = null;
        }
        C27096v0 c27096v0M66905e = c27096v0.m66905e(C42828b.m93902c(C27041f.m66669i(strM92640e, getF101408e())), C22890g.m54280e(C27017c.f54310a.m66513b(), C27039d.m66656p(bigDecimalM84658J), R$color.c_text));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
        return c27096v0M66905e;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final C27096v0 m99596N() {
        C27096v0 c27096v0M66905e = new C27096v0().m66905e(C37569d.m84677r(getF101404a()), C22890g.m54280e(C27017c.f54310a.m66513b(), C27039d.m66656p(C37569d.m84659K(getF101404a())), R$color.c_text));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66905e, "appendForeground(...)");
        return c27096v0M66905e;
    }
}
