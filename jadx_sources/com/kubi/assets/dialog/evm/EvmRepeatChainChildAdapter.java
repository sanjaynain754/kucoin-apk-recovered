package com.kubi.assets.dialog.evm;

import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EvmRepeatAddressItemEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p637ta.C44754e1;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EvmRepeatChainAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainChildAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/EvmRepeatAddressItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEvmRepeatChainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmRepeatChainAdapter.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainChildAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class EvmRepeatChainChildAdapter extends BaseQuickAdapter<EvmRepeatAddressItemEntity, BaseViewHolder> {
    public EvmRepeatChainChildAdapter() {
        super(R$layout.asset_item_evm_repeat_chain_child, new ArrayList());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull EvmRepeatAddressItemEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C44754e1 c44754e1M99022a = C44754e1.m99022a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c44754e1M99022a, "bind(...)");
        c44754e1M99022a.f99796d.setText(C27041f.m66668h(item.getCurrency()));
        c44754e1M99022a.f99795c.setText(C27041f.m66668h(item.getChainName()));
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(item.getCurrency()));
        String str = null;
        String iconUrl = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null;
        if (iconUrl == null || iconUrl.length() == 0) {
            c44754e1M99022a.f99794b.setImageResource(R$drawable.asset_general_net_icon);
        } else {
            C24277v.m58542g(c44754e1M99022a.f99794b, iconUrl);
        }
        BaseTextView baseTextView = c44754e1M99022a.f99796d;
        String currency = item.getCurrency();
        if (currency != null) {
            if (currency.length() == 0) {
                currency = C27017c.f54310a.m66516f(R$string.kc_withdaraw_evm_repeat_dialog_general, new Object[0]);
            }
            str = currency;
        }
        baseTextView.setText(str);
    }
}
