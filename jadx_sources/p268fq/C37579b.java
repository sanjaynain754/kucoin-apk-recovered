package p268fq;

import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.R$color;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import org.jetbrains.annotations.NotNull;
import p042bq.InterfaceC4644a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: fq.b */
/* JADX INFO: compiled from: MartEx.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a \u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"LOG_TAG", "", "logginfo", "", "msg", "martApi", "Lcom/kubi/mart/api/MartApi;", "getMartApi", "()Lcom/kubi/mart/api/MartApi;", "getPairShowSymbol", "Lcom/kubi/utils/StyledText;", "Lcom/kubi/data/entity/TradeItemBean;", "leftFontSize", "", "rightFontSize", "MartLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37579b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC4644a f83544a = (InterfaceC4644a) RetrofitFlowExKt.m42820a(InterfaceC4644a.class);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4644a m84712a() {
        return f83544a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C27096v0 m84713b(@NotNull TradeItemBean tradeItemBean, int i11, int i12) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        C27096v0 c27096v0 = new C27096v0();
        String baseCurrencyName = tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName();
        C27017c c27017c = C27017c.f54310a;
        C27096v0 c27096v0M66903c = c27096v0.m66903c(baseCurrencyName, new ForegroundColorSpan(c27017c.m66512a(R$color.c_text)), new AbsoluteSizeSpan(i11, true)).m66903c('/' + tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName(), new ForegroundColorSpan(c27017c.m66512a(R$color.c_text40)), new AbsoluteSizeSpan(i12, true));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        return c27096v0M66903c;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C27096v0 m84714c(TradeItemBean tradeItemBean, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 15;
        }
        if ((i13 & 2) != 0) {
            i12 = 13;
        }
        return m84713b(tradeItemBean, i11, i12);
    }

    /* JADX INFO: renamed from: d */
    public static final void m84715d(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97266j("Log-Mart", msg);
        Log.i("Log-Mart", msg);
    }
}
