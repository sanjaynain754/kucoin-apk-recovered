package com.kubi.quotefacade.alpha.list;

import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.utils.extensions.C27039d;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.quotefacade.alpha.list.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IAlphaListItemView.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/list/AlphaCreateTimeView;", "Lcom/kubi/quotefacade/alpha/list/IAlphaListItemView;", "<init>", "()V", "render", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIAlphaListItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IAlphaListItemView.kt\ncom/kubi/quotefacade/alpha/list/AlphaCreateTimeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"})
public final class AlphaCreateTimeView implements IAlphaListItemView {
    @Override // com.kubi.quotefacade.alpha.list.IAlphaListItemView
    /* JADX INFO: renamed from: a */
    public void mo50661a(@NotNull BaseViewHolder helper, @NotNull AlphaItemEntity item) {
        String strM92629b;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (C27039d.m66652l(item.getTokenCreationAt()) != 0) {
            Long tokenCreationAt = item.getTokenCreationAt();
            strM92629b = tokenCreationAt != null ? C42179a.m92629b(Math.multiplyExact(tokenCreationAt.longValue(), 1000L), null, false, null, false, 15, null) : null;
        } else {
            strM92629b = "--";
        }
        int i11 = R$id.tvSingleLine;
        helper.setGone(i11, true);
        helper.setText(i11, strM92629b);
    }
}
