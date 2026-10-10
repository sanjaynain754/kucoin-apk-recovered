package com.kubi.otc.fiat.withdraw;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.otc.R$id;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.entity.FiatWithdrawAccountsParams;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import defpackage.displayAccountStatus;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatWithdrawAccountsDialogFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", JAnalysisConstants.Account.KEY_ACCOUNT, "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 extends BaseQuickAdapter<FiatWithdrawAccountInfo, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ FiatWithdrawAccountsDialogFragment f37455i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, int i11) {
        super(i11);
        this.f37455i = fiatWithdrawAccountsDialogFragment;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m44458n(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1, FiatWithdrawAccountInfo fiatWithdrawAccountInfo) {
        fiatWithdrawAccountsDialogFragment.f37451u0 = fiatWithdrawAccountInfo != null ? fiatWithdrawAccountInfo.getPayoutAccountId() : null;
        fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(final BaseViewHolder helper, final FiatWithdrawAccountInfo account) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(account, "account");
        final FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment = this.f37455i;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P4 = fiatWithdrawAccountsDialogFragment.m44449P4();
        String subName = account.getSubName(mContext, fiatWithdrawAccountsParamsM44449P4 != null ? fiatWithdrawAccountsParamsM44449P4.getPaymentMethodCode() : null);
        int i11 = R$id.tv_account_name;
        Context mContext2 = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
        FiatWithdrawAccountsParams fiatWithdrawAccountsParamsM44449P5 = fiatWithdrawAccountsDialogFragment.m44449P4();
        helper.setText(i11, account.getName(mContext2, fiatWithdrawAccountsParamsM44449P5 != null ? fiatWithdrawAccountsParamsM44449P5.getPaymentMethodCode() : null));
        int i12 = R$id.tv_account_sub_name;
        helper.setText(i12, subName);
        boolean z11 = false;
        helper.setGone(i12, subName.length() > 0);
        int i13 = R$id.iv_delete_account;
        helper.setGone(i13, fiatWithdrawAccountsDialogFragment.f37450t0);
        int i14 = R$id.iv_select_account;
        if (!fiatWithdrawAccountsDialogFragment.f37450t0 && Intrinsics.areEqual(fiatWithdrawAccountsDialogFragment.f37451u0, account.getPayoutAccountId())) {
            z11 = true;
        }
        helper.setGone(i14, z11);
        ImageView imageView = (ImageView) helper.getView(R$id.iv_account_icon);
        if (imageView != null) {
            String strM66668h = C27041f.m66668h(account.getIconUrl());
            if (strM66668h.length() == 0) {
                C27046k.m66700o(imageView);
            } else {
                C24277v.m58540e(this.mContext, strM66668h, imageView);
                C27046k.m66685H(imageView);
            }
        }
        View view = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.m44456l(fiatWithdrawAccountsDialogFragment, account, this, helper);
            }
        }, 1, null);
        TextView textView = (TextView) helper.getView(R$id.tv_tag);
        if (textView != null) {
            if (fiatWithdrawAccountsDialogFragment.m44451S4()) {
                C27046k.m66700o(textView);
            } else {
                displayAccountStatus.m4788a(textView, account.getStatus());
                C27046k.m66685H(textView);
            }
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.m44459o(fiatWithdrawAccountsDialogFragment, account, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m44456l(final FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo, final FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1, final BaseViewHolder baseViewHolder) {
        if (fiatWithdrawAccountsDialogFragment.f37450t0) {
            fiatWithdrawAccountsDialogFragment.m44447G4(fiatWithdrawAccountInfo, new Action() { // from class: com.kubi.otc.fiat.withdraw.x0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.m44457m(this.f37642b, baseViewHolder, fiatWithdrawAccountsDialogFragment);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final void m44457m(final FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1, BaseViewHolder baseViewHolder, final FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment) {
        boolean z11;
        fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.remove(baseViewHolder.getAdapterPosition());
        AbsFiatWithdrawInputFragment absFiatWithdrawInputFragmentM44450Q4 = fiatWithdrawAccountsDialogFragment.m44450Q4();
        if (absFiatWithdrawInputFragmentM44450Q4 != null) {
            absFiatWithdrawInputFragmentM44450Q4.m44409e4(new Function1() { // from class: com.kubi.otc.fiat.withdraw.y0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.m44458n(fiatWithdrawAccountsDialogFragment, fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1, (FiatWithdrawAccountInfo) obj);
                }
            });
        }
        BaseViewHolder baseViewHolder2 = fiatWithdrawAccountsDialogFragment.f37452v0;
        if (baseViewHolder2 != null) {
            if (fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.getData().size() >= 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            baseViewHolder2.setGone(R$id.tv_account_limit_tip, z11);
            baseViewHolder2.setGone(R$id.iv_add, !z11);
            baseViewHolder2.setGone(R$id.tv_add_account, !z11);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m44459o(FiatWithdrawAccountsDialogFragment fiatWithdrawAccountsDialogFragment, FiatWithdrawAccountInfo fiatWithdrawAccountInfo, FiatWithdrawAccountsDialogFragment$accountsAdapter$2$1 fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1) throws Exception {
        if (!fiatWithdrawAccountsDialogFragment.f37450t0) {
            fiatWithdrawAccountsDialogFragment.f37451u0 = fiatWithdrawAccountInfo.getPayoutAccountId();
            fiatWithdrawAccountsDialogFragment$accountsAdapter$2$1.notifyDataSetChanged();
            Consumer consumer = fiatWithdrawAccountsDialogFragment.f37453w0;
            if (consumer != null) {
                consumer.accept(fiatWithdrawAccountInfo);
            }
            fiatWithdrawAccountsDialogFragment.dismiss();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
