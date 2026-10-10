package com.kubi.assets.overview;

import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.DynamicsEntity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetDynamicsBarAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/DynamicsEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/overview/AssetOverviewFragment;", "<init>", "(Lcom/kubi/assets/overview/AssetOverviewFragment;)V", "getFragment", "()Lcom/kubi/assets/overview/AssetOverviewFragment;", "convert", "", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetDynamicsBarAdapter extends BaseQuickAdapter<DynamicsEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetOverviewFragment f18176i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDynamicsBarAdapter(@NotNull AssetOverviewFragment fragment) {
        super(R$layout.asset_item_dynamics_bar);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18176i = fragment;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull DynamicsEntity entity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        int i11 = R$id.tvState;
        helper.setTextColor(i11, this.f18176i.getColorRes(entity.getStatusColor()));
        helper.setText(R$id.tvTitle, C27041f.m66668h(entity.getPhrases())).setText(i11, C27041f.m66668h(entity.getStatusPhrases()));
    }
}
