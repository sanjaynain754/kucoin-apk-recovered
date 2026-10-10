package i60;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: i60.a */
/* JADX INFO: compiled from: BUnifyTopicConstant.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0015j\b\u0012\u0004\u0012\u00020\u0007`\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/unify/api/BUnifyTopicConstant;", "", "<init>", "()V", "UNIFY_CORE_RESTFUL_INTERVAL", "", "TOPIC_INDEX_PRICE", "", "TOPIC_MARK_PRICE", "SUBJECT_MARK_PRICE", "TOPIC_CONTRACT_MARKET_LATEST_PRICE", "SUBJECT_CONTRACT_MARKET_LATEST_PRICE", "TOPIC_ACCOUNT_BALANCE_CHANGE", "TOPIC_LEVERAGE", "TOPIC_CURRENCY_LEVERAGE", "TOPIC_POSITIONS", "TOPIC_ORDERS", "TOPIC_ACCOUNT_TYPE_CHANGED", "TOPIC_COMPOSE_DATA", "TOPIC_MARGIN_MODE", "getUnifyPrivateTopic", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38458a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38458a f86300a = new C38458a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayList<String> m86731a() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("/unifiedAccount/innerWallet");
        arrayList.add("/unifiedAccount/innerLeverage");
        arrayList.add("/unifiedAccount/innerPositionAll");
        arrayList.add("/unifiedAccount/innerOrderAll");
        arrayList.add("/unifiedAccount/innerAccountType");
        arrayList.add("/unifiedAccount/innerUserEquityDetail");
        arrayList.add("/unifiedAccount/innerCurrencyLeverage");
        arrayList.add("/unifiedAccount/innerMarginMode");
        return arrayList;
    }
}
