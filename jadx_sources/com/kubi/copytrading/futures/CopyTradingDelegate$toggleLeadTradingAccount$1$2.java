package com.kubi.copytrading.futures;

import android.view.View;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTradingDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/copytrading/futures/CopyTradingDelegate$toggleLeadTradingAccount$1$2", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "item", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CopyTradingDelegate$toggleLeadTradingAccount$1$2 extends BaseQuickAdapter<String, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DialogFragmentHelper f19898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingDelegate$toggleLeadTradingAccount$1$2(List<String> list, DialogFragmentHelper dialogFragmentHelper, int i11) {
        super(i11, list);
        this.f19898i = dialogFragmentHelper;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m20856i(boolean z11, BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
        FutureCopyTradingConfig futureCopyTradingConfig = FutureCopyTradingConfig.f19902a;
        if (futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount() == z11) {
            return Unit.INSTANCE;
        }
        FutureCopyTradingConfig.m20870f(futureCopyTradingConfig, baseViewHolder.getAdapterPosition() == 0, false, 2, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, String item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.text, item);
        final boolean z11 = helper.getAdapterPosition() == 0;
        CopyTradingUserAvatarView copyTradingUserAvatarView = (CopyTradingUserAvatarView) helper.getView(R$id.iv_icon);
        if (z11) {
            copyTradingUserAvatarView.m20958b(UserInfo.c().getAvatar(), UserInfo.c().getShowHeadText());
        } else {
            CopyTradingConfig copyTradingConfig = CopyTradingConfig.f19710a;
            LeadUserEntity leadUserEntityM20602s = copyTradingConfig.m20602s();
            String avatar = leadUserEntityM20602s != null ? leadUserEntityM20602s.getAvatar() : null;
            LeadUserEntity leadUserEntityM20602s2 = copyTradingConfig.m20602s();
            copyTradingUserAvatarView.m20958b(avatar, leadUserEntityM20602s2 != null ? leadUserEntityM20602s2.getNickName() : null);
        }
        int i11 = R$id.image;
        FutureCopyTradingConfig futureCopyTradingConfig = FutureCopyTradingConfig.f19902a;
        helper.setVisible(i11, futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount() == z11);
        helper.itemView.setSelected(futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount() == z11);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final DialogFragmentHelper dialogFragmentHelper = this.f19898i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.copytrading.futures.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingDelegate$toggleLeadTradingAccount$1$2.m20856i(z11, helper, dialogFragmentHelper);
            }
        }, 1, null);
    }
}
