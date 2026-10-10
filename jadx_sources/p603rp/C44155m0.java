package p603rp;

import android.net.Uri;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.trade.submit.MarginSubmitFragment;
import com.kubi.sdk.BaseFragment;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import p568qp.C43839s;
import p768xo.InterfaceC46306g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: rp.m0 */
/* JADX INFO: compiled from: IsolateMarginMenuItemsProvider.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/margin/trade/menu/IsolateMarginMenuItemsProvider;", "Lcom/kubi/margin/trade/menu/BaseMarginMoreItemsProvider;", "baseFragment", "Lcom/kubi/sdk/BaseFragment;", "tradeSubmitFragment", "Lcom/kubi/margin/trade/submit/MarginSubmitFragment;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "currentSymbol", "Lcom/kubi/data/entity/TradeItemBean;", "tradeModel", "Lcom/kubi/margin/trade/helper/MarginTradeModel;", "<init>", "(Lcom/kubi/sdk/BaseFragment;Lcom/kubi/margin/trade/submit/MarginSubmitFragment;Lio/reactivex/disposables/CompositeDisposable;Lcom/kubi/data/entity/TradeItemBean;Lcom/kubi/margin/trade/helper/MarginTradeModel;)V", "getPositionType", "", "getRiskUrl", "getTrackPageId", "tradeType", "", "getMarginType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44155m0 extends AbstractC44151k0 {
    @Override // p603rp.AbstractC44151k0
    /* JADX INFO: renamed from: b1 */
    public int mo97371b1() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44155m0(@NotNull BaseFragment baseFragment, @NotNull MarginSubmitFragment tradeSubmitFragment, @NotNull CompositeDisposable destroyDisposable, @NotNull TradeItemBean currentSymbol, @NotNull C43839s tradeModel) {
        super(baseFragment, tradeSubmitFragment, destroyDisposable, currentSymbol, tradeModel);
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Intrinsics.checkNotNullParameter(tradeSubmitFragment, "tradeSubmitFragment");
        Intrinsics.checkNotNullParameter(destroyDisposable, "destroyDisposable");
        Intrinsics.checkNotNullParameter(currentSymbol, "currentSymbol");
        Intrinsics.checkNotNullParameter(tradeModel, "tradeModel");
    }

    @Override // p603rp.AbstractC44151k0
    @NotNull
    /* JADX INFO: renamed from: F0 */
    public String mo97346F0() {
        return "isolated";
    }

    @Override // p603rp.AbstractC44151k0
    @NotNull
    /* JADX INFO: renamed from: L0 */
    public String mo97350L0() {
        String strDecode = Uri.decode(InterfaceC46306g.f103880g);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        return strDecode;
    }

    @Override // p603rp.AbstractC44151k0
    @NotNull
    /* JADX INFO: renamed from: S0 */
    public String mo97359S0() {
        return "B4tradingIsolated";
    }

    @Override // p603rp.AbstractC44151k0
    @NotNull
    /* JADX INFO: renamed from: w0 */
    public String mo97377w0() {
        return "1";
    }
}
