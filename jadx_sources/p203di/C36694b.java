package p203di;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.futures.history.filter.OrderAssetType;
import com.kubi.kumex.R$string;
import com.kubi.utils.C27017c;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: di.b */
/* JADX INFO: compiled from: AssetTypeClickFilterOfDelegation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/history/filter/AssetTypeClickFilterOfDelegation;", "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;)V", "assetTypes", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "buildTradeTypeList", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36694b extends AbstractC36711s {

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<C46203d1.a.TradeTypeIndex> f79590e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36694b(@NotNull AppCompatTextView clickView, @NotNull View anchorView) {
        super(clickView, anchorView);
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        C27017c c27017c = C27017c.f54310a;
        this.f79590e = CollectionsKt.mutableListOf(new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.kumex_self_balance, new Object[0]), OrderAssetType.SelfFunds.getTypeName(), false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.kumex_trial_balance, new Object[0]), OrderAssetType.TrialFund.getTypeName(), false));
    }

    @Override // p203di.AbstractC36711s
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C46203d1.a.TradeTypeIndex> mo65317d() {
        return this.f79590e;
    }
}
