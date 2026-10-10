package p203di;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.IBrokerConfig;
import com.kubi.kumex.R$string;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.utils.C27017c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import m30.C42422c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: di.t */
/* JADX INFO: compiled from: TradeTypeClickFilterOfDelegation.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfDelegation;", "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "accountFilter", "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;)V", "buildTradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36712t extends AbstractC36711s {

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C36693a f79628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36712t(@NotNull AppCompatTextView clickView, @NotNull View anchorView, @Nullable C36693a c36693a) {
        super(clickView, anchorView);
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f79628e = c36693a;
    }

    @Override // p203di.AbstractC36711s
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C46203d1.a.TradeTypeIndex> mo65317d() {
        IBrokerConfig iBrokerConfigM20201d;
        C27017c c27017c = C27017c.f54310a;
        List<C46203d1.a.TradeTypeIndex> listMutableListOf = CollectionsKt.mutableListOf(new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.all, new Object[0]), null, false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.limit_price, new Object[0]), TUIConstants.TUIContact.LIMIT, false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.market_price, new Object[0]), "market", false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.condition_price, new Object[0]), "limit_stop", false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.market_stop, new Object[0]), "market_stop", false), new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.kc_advanced_limit_order, new Object[0]), "advanced_limit", false));
        if (C42422c.f94040a.m93120c()) {
            listMutableListOf.add(new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.hide_order, new Object[0]), ViewProps.HIDDEN, false));
        }
        C36693a c36693a = this.f79628e;
        if (c36693a == null || (iBrokerConfigM20201d = c36693a.m82164r()) == null) {
            iBrokerConfigM20201d = BrokerConfig.f19211a.m20201d();
        }
        if (iBrokerConfigM20201d.mo20236X0().contains(OrderTradeType.Tso)) {
            listMutableListOf.add(new C46203d1.a.TradeTypeIndex(c27017c.m66516f(R$string.kumex_tso_order, new Object[0]), "trailing_stop", false));
        }
        return listMutableListOf;
    }
}
