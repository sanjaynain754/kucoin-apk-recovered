package p809yu;

import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.ChainItemEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p402kf.C41015b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: yu.h */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainFdvItemView;", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46575h implements InterfaceC46592y {
    @Override // p809yu.InterfaceC46592y
    /* JADX INFO: renamed from: a */
    public void mo102729a(@NotNull BaseViewHolder helper, @NotNull ChainItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setGone(R$id.tv_single_line, true);
        String fdv = item.getFdv();
        String strM89961h = "--";
        if (fdv != null && fdv.length() != 0) {
            try {
                String fdv2 = item.getFdv();
                strM89961h = fdv2 != null ? C41015b.m89961h(Double.parseDouble(fdv2)) : null;
            } catch (Exception unused) {
                C44128b.m97266j("ChainFdvItemView", "fdv parse number error");
            }
        }
        helper.setText(R$id.tv_single_line, strM89961h);
    }
}
