package p203di;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.IBrokerConfig;
import com.kubi.kumex.entity.TradeTypeFilterData;
import com.kubi.utils.C27017c;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761xh.C46203d1;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: di.u */
/* JADX INFO: compiled from: TradeTypeClickFilterOfTrade.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/futures/history/filter/TradeTypeClickFilterOfTrade;", "Lcom/kubi/futures/history/filter/TradeTypeClickFilter;", "clickView", "Landroidx/appcompat/widget/AppCompatTextView;", "anchorView", "Landroid/view/View;", "accountFilter", "Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Lcom/kubi/futures/history/filter/AccountTypeClickFilterOfDelegation;)V", "buildTradeTypeList", "", "Lcom/kubi/futures/dialog/pop/SelectTradeTypeOfHistoryPopup$TradeTypeAdapter$TradeTypeIndex;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTypeClickFilterOfTrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTypeClickFilterOfTrade.kt\ncom/kubi/futures/history/filter/TradeTypeClickFilterOfTrade\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n1563#2:30\n1634#2,3:31\n*S KotlinDebug\n*F\n+ 1 TradeTypeClickFilterOfTrade.kt\ncom/kubi/futures/history/filter/TradeTypeClickFilterOfTrade\n*L\n23#1:30\n23#1:31,3\n*E\n"})
public final class C36713u extends AbstractC36711s {

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C36693a f79629e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36713u(@NotNull AppCompatTextView clickView, @NotNull View anchorView, @Nullable C36693a c36693a) {
        super(clickView, anchorView);
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        this.f79629e = c36693a;
    }

    @Override // p203di.AbstractC36711s
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<C46203d1.a.TradeTypeIndex> mo65317d() {
        IBrokerConfig iBrokerConfigM20201d;
        C36693a c36693a = this.f79629e;
        if (c36693a == null || (iBrokerConfigM20201d = c36693a.m82164r()) == null) {
            iBrokerConfigM20201d = BrokerConfig.f19211a.m20201d();
        }
        List<TradeTypeFilterData> listMo20235W = iBrokerConfigM20201d.mo20235W();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo20235W, 10));
        for (TradeTypeFilterData tradeTypeFilterData : listMo20235W) {
            arrayList.add(new C46203d1.a.TradeTypeIndex(C27017c.f54310a.m66516f(tradeTypeFilterData.getTypeStringRes(), new Object[0]), tradeTypeFilterData.getType(), false));
        }
        return arrayList;
    }
}
