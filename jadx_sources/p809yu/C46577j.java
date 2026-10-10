package p809yu;

import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.utils.C27059l;
import cv.ChainSafeEntity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.j */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"parseChainSafeDataList", "", "Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46577j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<ChainSafeEntity> m102733a(@NotNull ChainItemEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = new ArrayList();
        C27059l c27059l = C27059l.f54343a;
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_foundry), Boolean.valueOf(item.getHasMintMethod()), Boolean.valueOf(!item.getHasMintMethod())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_lock), Boolean.valueOf(!item.getLpNotLocked()), Boolean.valueOf(!item.getLpNotLocked())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_fund), Boolean.valueOf(item.getHasNotRenounced()), Boolean.valueOf(!item.getHasNotRenounced())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_verify), Boolean.valueOf(!item.getHasNotOpenSource()), Boolean.valueOf(!item.getHasNotOpenSource())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_black), Boolean.valueOf(item.getInBlacklist()), Boolean.valueOf(!item.getInBlacklist())));
        arrayList.add(new ChainSafeEntity(c27059l.m66757a().getString(R$string.quote_chain_safe_dialog_freeze), Boolean.valueOf(item.getHoneypot()), Boolean.valueOf(!item.getHoneypot())));
        return arrayList;
    }
}
