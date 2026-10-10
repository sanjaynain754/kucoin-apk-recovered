package p40;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33954u6;
import java.math.BigDecimal;
import l50.C42063d;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p40.d */
/* JADX INFO: compiled from: UnavailableCouponsBinding.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/adapter/UnavailableCouponsBinding;", "", "<init>", "()V", "bind", "", C33954u6.f72238i, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "d", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43384d {
    /* JADX INFO: renamed from: a */
    public final void m95558a(@NotNull RecyclerView.ViewHolder holder, @NotNull AllCouponsItemModel d11) {
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(d11, "d");
        C42063d c42063dM92277a = C42063d.m92277a(holder.itemView);
        Intrinsics.checkNotNullExpressionValue(c42063dM92277a, "bind(...)");
        c42063dM92277a.f92584g.setText(d11.getDiscountTitle());
        AppCompatTextView appCompatTextView = c42063dM92277a.f92583f;
        BigDecimal discountPercentageShowBd = d11.getDiscountPercentageShowBd();
        appCompatTextView.setText(C42180b.m92647l((discountPercentageShowBd == null || (bigDecimalMultiply = discountPercentageShowBd.multiply(new BigDecimal(C33556b3.f68995S))) == null) ? null : C42180b.m92640e(bigDecimalMultiply, null, 2, false, false, false, 0, null, 121, null)));
        c42063dM92277a.f92582e.setText(d11.getDiscountExpireDate());
        c42063dM92277a.f92585h.setText(d11.getUnUsableReasonShow());
    }
}
