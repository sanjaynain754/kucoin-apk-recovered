package com.kubi.assets.alpha;

import android.content.Context;
import android.widget.ImageView;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AlphaChainInfo;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaNetworkAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0005j\b\u0012\u0004\u0012\u00020\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\r"}, m90084d2 = {"Lcom/kubi/assets/alpha/AlphaNetworkAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AlphaChainInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "convert", "", "helper", "item", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AlphaNetworkAdapter extends BaseQuickAdapter<AlphaChainInfo, BaseViewHolder> {
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AlphaChainInfo alphaChainInfo) {
        ImageView imageView = baseViewHolder != null ? (ImageView) baseViewHolder.getView(R$id.ivIcon) : null;
        if ((alphaChainInfo != null ? alphaChainInfo.getDisplayChain() : null) != null) {
            if (imageView != null) {
                imageView.clearColorFilter();
            }
            Context context = this.mContext;
            String chainIcon = alphaChainInfo.getChainIcon();
            if (chainIcon == null) {
                chainIcon = "";
            }
            C24277v.m58540e(context, chainIcon, imageView);
            if (baseViewHolder != null) {
                baseViewHolder.setText(R$id.tvChainName, alphaChainInfo.getDisplayChain());
            }
            if (baseViewHolder != null) {
                baseViewHolder.setGone(R$id.ivSelected, alphaChainInfo.isSelected());
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setImageResource(R$drawable.ic2_allnetwork_24);
        }
        if (imageView != null) {
            Context mContext = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            C27046k.m66701p(imageView, C27046k.m66699n(mContext, R$color.c_text));
        }
        if (baseViewHolder != null) {
            baseViewHolder.setText(R$id.tvChainName, this.mContext.getString(R$string.asset_alpha_all_network));
        }
        if (baseViewHolder != null) {
            int i11 = R$id.ivSelected;
            boolean z11 = false;
            if (alphaChainInfo != null && !alphaChainInfo.isSelected()) {
                z11 = true;
            }
            baseViewHolder.setGone(i11, !z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaNetworkAdapter(@NotNull ArrayList<AlphaChainInfo> data) {
        super(R$layout.asset_item_alpha_network, data);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
