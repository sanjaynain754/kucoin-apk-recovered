package p809yu;

import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.f */
/* JADX INFO: compiled from: ChainListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainCreateTimeView;", "Lcom/kubi/quotefacade/adapter/IChainListItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46573f implements InterfaceC46592y {
    @Override // p809yu.InterfaceC46592y
    /* JADX INFO: renamed from: a */
    public void mo102729a(@NotNull BaseViewHolder helper, @NotNull ChainItemEntity item) {
        String strM92629b;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (C27039d.m66652l(item.getCreatedAt()) != 0) {
            Long createdAt = item.getCreatedAt();
            strM92629b = createdAt != null ? C42179a.m92629b(Math.multiplyExact(createdAt.longValue(), 1000L), null, false, null, false, 15, null) : null;
        } else {
            strM92629b = "--";
        }
        int i11 = R$id.tv_single_line;
        helper.setGone(i11, true);
        helper.setText(i11, strM92629b);
    }
}
