package p809yu;

import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.ChainItemEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.i */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainHoldersItemView;", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46576i implements InterfaceC46592y {
    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    @Override // p809yu.InterfaceC46592y
    /* JADX INFO: renamed from: a */
    public void mo102729a(@NotNull BaseViewHolder helper, @NotNull ChainItemEntity item) {
        String strM89929c;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_single_line;
        helper.setGone(i11, true);
        if (item.getHolders() == null) {
            strM89929c = "--";
        } else {
            Integer holders = item.getHolders();
            if (holders != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(holders.intValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                if (bigDecimalValueOf != null) {
                    strM89929c = C41014a.m89929c(bigDecimalValueOf, false, false, 3, null);
                } else {
                    strM89929c = null;
                }
            } else {
                strM89929c = null;
            }
        }
        helper.setText(i11, strM89929c);
    }
}
