package com.kubi.assets.dialog.evm;

import com.kubi.assets.R$layout;
import com.kubi.assets.entity.EvmChainEntity;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p637ta.C44738c1;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EvmChainListAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmChainListAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/EvmChainEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EvmChainListAdapter extends BaseQuickAdapter<EvmChainEntity, BaseViewHolder> {
    public EvmChainListAdapter() {
        super(R$layout.asset_item_evm_chain, new ArrayList());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull EvmChainEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C44738c1 c44738c1M98986a = C44738c1.m98986a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c44738c1M98986a, "bind(...)");
        c44738c1M98986a.f99666b.setText(C27041f.m66668h(item.getChainName()));
    }
}
