package p70;

import af.C0296a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import com.kubi.utaspotlib.R$layout;
import com.kubi.utaspotlib.R$string;
import com.kubi.utils.C27017c;
import j30.C40266c;
import j30.SegmentOrder;
import java.math.BigDecimal;
import java.util.List;
import ne.SegmentTradeInputData;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import q70.C43663j;

/* JADX INFO: renamed from: p70.e */
/* JADX INFO: compiled from: SegmentOrderDetailLayout.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"createSegmentOrderDetailView", "Landroid/view/View;", "context", "Landroid/content/Context;", "data", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "TEXT_SIZE_MAX_SP", "", "TEXT_SIZE_MIN_SP", "UtaSpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentOrderDetailLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentOrderDetailLayout.kt\ncom/kubi/utaspotlib/biz/order/infodetail/SegmentOrderDetailLayoutKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class C43410e {

    /* JADX INFO: renamed from: p70.e$a */
    /* JADX INFO: compiled from: SegmentOrderDetailLayout.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentDistributionType.values().length];
            try {
                iArr[SegmentDistributionType.Uniform.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentDistributionType.Increasing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentDistributionType.Decreasing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c0  */
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final View m95598a(@NotNull Context context, @NotNull SegmentTradeInputData data) {
        int i11;
        int i12;
        int i13;
        Object objM103844constructorimpl;
        List<SegmentOrder> listEmptyList;
        BigDecimal bigDecimalM88644f;
        int i14;
        String strM92640e;
        boolean zM22964s0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        C43663j c43663jM96087a = C43663j.m96087a(View.inflate(context, R$layout.uta_order_segment_layout, null));
        Intrinsics.checkNotNullExpressionValue(c43663jM96087a, "bind(...)");
        BigDecimal priceMin = data.getPriceMin();
        SymbolInfoEntity symbolInfoEntityM93878p = data.m93878p();
        String strM92640e2 = C42180b.m92640e(priceMin, null, symbolInfoEntityM93878p != null ? symbolInfoEntityM93878p.getPriceIncrementPrecision() : 12, false, false, false, 0, null, 125, null);
        BigDecimal priceMax = data.getPriceMax();
        SymbolInfoEntity symbolInfoEntityM93878p2 = data.m93878p();
        c43663jM96087a.f96444s.setText(C42180b.m92640e(priceMax, null, symbolInfoEntityM93878p2 != null ? symbolInfoEntityM93878p2.getPriceIncrementPrecision() : 12, false, false, false, 0, null, 125, null));
        c43663jM96087a.f96446u.setText(strM92640e2);
        c43663jM96087a.f96443r.setText(data.getQuoteCurrencyName());
        c43663jM96087a.f96445t.setText(data.getQuoteCurrencyName());
        c43663jM96087a.f96442q.setText(String.valueOf(data.getOrderCount()));
        BaseTextView baseTextView = c43663jM96087a.f96439n;
        int i15 = a.$EnumSwitchMapping$0[data.getDistributionType().ordinal()];
        if (i15 == 1) {
            i11 = R$string.kumex_segment_average;
        } else if (i15 == 2) {
            i11 = R$string.kumex_segment_incremental;
        } else {
            if (i15 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = R$string.kumex_segment_decreasing;
        }
        baseTextView.setText(context.getString(i11));
        SymbolInfoEntity symbolInfoEntityM93878p3 = data.m93878p();
        int priceIncrementPrecision = symbolInfoEntityM93878p3 != null ? symbolInfoEntityM93878p3.getPriceIncrementPrecision() : 0;
        SymbolInfoEntity symbolInfoEntityM93878p4 = data.m93878p();
        int baseIncrementPrecision = symbolInfoEntityM93878p4 != null ? symbolInfoEntityM93878p4.getBaseIncrementPrecision() : 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            i12 = priceIncrementPrecision;
            try {
                i13 = baseIncrementPrecision;
                try {
                    objM103844constructorimpl = Result.m103844constructorimpl(C40266c.f89505a.m88647c(data.getPriceMin(), data.getPriceMax(), data.getOrderCount(), data.getTotalQty(), data.getDistributionType(), i12, baseIncrementPrecision, (128 & 128) != 0 ? null : null));
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th3) {
                th = th3;
                i13 = baseIncrementPrecision;
                Result.Companion companion3 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th));
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = null;
                }
                listEmptyList = (List) objM103844constructorimpl;
                bigDecimalM88644f = listEmptyList != null ? C40266c.m88644f(C40266c.f89505a, listEmptyList, 0, 2, null) : null;
                BaseTextView baseTextView2 = c43663jM96087a.f96436k;
                if (bigDecimalM88644f != null) {
                    i14 = i12;
                    strM92640e = C42180b.m92640e(bigDecimalM88644f, null, i14, false, false, false, 0, null, 125, null);
                    if (strM92640e == null) {
                    }
                    baseTextView2.setText(strM92640e);
                    c43663jM96087a.f96435j.setText(data.getQuoteCurrencyName());
                    int i16 = i13;
                    c43663jM96087a.f96448w.setText(C42180b.m92640e(data.getTotalQty(), null, i16, false, false, false, 0, null, 125, null));
                    c43663jM96087a.f96447v.setText(data.getBaseCurrencyName());
                    c43663jM96087a.f96428c.setText(C27017c.f54310a.m66516f(R$string.price_order, data.getQuoteCurrencyName()));
                    c43663jM96087a.f96429d.setText(context.getString(R$string.delegation_amount_stub, data.getBaseCurrencyName()));
                    C43411f c43411f = new C43411f();
                    c43663jM96087a.f96434i.setLayoutManager(new LinearLayoutManager(context));
                    c43663jM96087a.f96434i.setAdapter(c43411f);
                    if (data.getIsBuy()) {
                        zM22964s0 = data.getOrderHolderType().m22965t0();
                    } else {
                        zM22964s0 = data.getOrderHolderType().m22964s0();
                    }
                    ConstraintLayout segmentOrderListContainer = c43663jM96087a.f96431f;
                    Intrinsics.checkNotNullExpressionValue(segmentOrderListContainer, "segmentOrderListContainer");
                    C0296a.m1042d(segmentOrderListContainer, zM22964s0);
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    String string = context.getString(R$string.limit_price);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    BigDecimal marketPrice = data.getParentBehavior().getF20635f0().getMarketPrice(data.getIsBuy());
                    Intrinsics.checkNotNullExpressionValue(marketPrice, "getMarketPrice(...)");
                    c43411f.m95602j(listEmptyList, i14, i16, string, marketPrice, data.getIsBuy());
                    LinearLayout root = c43663jM96087a.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    return root;
                }
                i14 = i12;
                strM92640e = "--";
                baseTextView2.setText(strM92640e);
                c43663jM96087a.f96435j.setText(data.getQuoteCurrencyName());
                int i17 = i13;
                c43663jM96087a.f96448w.setText(C42180b.m92640e(data.getTotalQty(), null, i17, false, false, false, 0, null, 125, null));
                c43663jM96087a.f96447v.setText(data.getBaseCurrencyName());
                c43663jM96087a.f96428c.setText(C27017c.f54310a.m66516f(R$string.price_order, data.getQuoteCurrencyName()));
                c43663jM96087a.f96429d.setText(context.getString(R$string.delegation_amount_stub, data.getBaseCurrencyName()));
                C43411f c43411f2 = new C43411f();
                c43663jM96087a.f96434i.setLayoutManager(new LinearLayoutManager(context));
                c43663jM96087a.f96434i.setAdapter(c43411f2);
                if (data.getIsBuy()) {
                    zM22964s0 = data.getOrderHolderType().m22965t0();
                } else {
                    zM22964s0 = data.getOrderHolderType().m22964s0();
                }
                ConstraintLayout segmentOrderListContainer2 = c43663jM96087a.f96431f;
                Intrinsics.checkNotNullExpressionValue(segmentOrderListContainer2, "segmentOrderListContainer");
                C0296a.m1042d(segmentOrderListContainer2, zM22964s0);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                String string2 = context.getString(R$string.limit_price);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                BigDecimal marketPrice2 = data.getParentBehavior().getF20635f0().getMarketPrice(data.getIsBuy());
                Intrinsics.checkNotNullExpressionValue(marketPrice2, "getMarketPrice(...)");
                c43411f2.m95602j(listEmptyList, i14, i17, string2, marketPrice2, data.getIsBuy());
                LinearLayout root2 = c43663jM96087a.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                return root2;
            }
        } catch (Throwable th4) {
            th = th4;
            i12 = priceIncrementPrecision;
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        listEmptyList = (List) objM103844constructorimpl;
        bigDecimalM88644f = listEmptyList != null ? C40266c.m88644f(C40266c.f89505a, listEmptyList, 0, 2, null) : null;
        BaseTextView baseTextView3 = c43663jM96087a.f96436k;
        if (bigDecimalM88644f != null) {
            i14 = i12;
            strM92640e = C42180b.m92640e(bigDecimalM88644f, null, i14, false, false, false, 0, null, 125, null);
            if (strM92640e == null) {
            }
            baseTextView3.setText(strM92640e);
            c43663jM96087a.f96435j.setText(data.getQuoteCurrencyName());
            int i18 = i13;
            c43663jM96087a.f96448w.setText(C42180b.m92640e(data.getTotalQty(), null, i18, false, false, false, 0, null, 125, null));
            c43663jM96087a.f96447v.setText(data.getBaseCurrencyName());
            c43663jM96087a.f96428c.setText(C27017c.f54310a.m66516f(R$string.price_order, data.getQuoteCurrencyName()));
            c43663jM96087a.f96429d.setText(context.getString(R$string.delegation_amount_stub, data.getBaseCurrencyName()));
            C43411f c43411f3 = new C43411f();
            c43663jM96087a.f96434i.setLayoutManager(new LinearLayoutManager(context));
            c43663jM96087a.f96434i.setAdapter(c43411f3);
            if (data.getIsBuy()) {
                zM22964s0 = data.getOrderHolderType().m22965t0();
            } else {
                zM22964s0 = data.getOrderHolderType().m22964s0();
            }
            ConstraintLayout segmentOrderListContainer3 = c43663jM96087a.f96431f;
            Intrinsics.checkNotNullExpressionValue(segmentOrderListContainer3, "segmentOrderListContainer");
            C0296a.m1042d(segmentOrderListContainer3, zM22964s0);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String string3 = context.getString(R$string.limit_price);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BigDecimal marketPrice3 = data.getParentBehavior().getF20635f0().getMarketPrice(data.getIsBuy());
            Intrinsics.checkNotNullExpressionValue(marketPrice3, "getMarketPrice(...)");
            c43411f3.m95602j(listEmptyList, i14, i18, string3, marketPrice3, data.getIsBuy());
            LinearLayout root3 = c43663jM96087a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            return root3;
        }
        i14 = i12;
        strM92640e = "--";
        baseTextView3.setText(strM92640e);
        c43663jM96087a.f96435j.setText(data.getQuoteCurrencyName());
        int i19 = i13;
        c43663jM96087a.f96448w.setText(C42180b.m92640e(data.getTotalQty(), null, i19, false, false, false, 0, null, 125, null));
        c43663jM96087a.f96447v.setText(data.getBaseCurrencyName());
        c43663jM96087a.f96428c.setText(C27017c.f54310a.m66516f(R$string.price_order, data.getQuoteCurrencyName()));
        c43663jM96087a.f96429d.setText(context.getString(R$string.delegation_amount_stub, data.getBaseCurrencyName()));
        C43411f c43411f4 = new C43411f();
        c43663jM96087a.f96434i.setLayoutManager(new LinearLayoutManager(context));
        c43663jM96087a.f96434i.setAdapter(c43411f4);
        if (data.getIsBuy()) {
            zM22964s0 = data.getOrderHolderType().m22965t0();
        } else {
            zM22964s0 = data.getOrderHolderType().m22964s0();
        }
        ConstraintLayout segmentOrderListContainer4 = c43663jM96087a.f96431f;
        Intrinsics.checkNotNullExpressionValue(segmentOrderListContainer4, "segmentOrderListContainer");
        C0296a.m1042d(segmentOrderListContainer4, zM22964s0);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        String string4 = context.getString(R$string.limit_price);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        BigDecimal marketPrice4 = data.getParentBehavior().getF20635f0().getMarketPrice(data.getIsBuy());
        Intrinsics.checkNotNullExpressionValue(marketPrice4, "getMarketPrice(...)");
        c43411f4.m95602j(listEmptyList, i14, i19, string4, marketPrice4, data.getIsBuy());
        LinearLayout root4 = c43663jM96087a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
        return root4;
    }
}
