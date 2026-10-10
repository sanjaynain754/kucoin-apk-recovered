package com.kubi.futures.trade.welfare.airdrop;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236em.C37213a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AirDropDialogManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/airdrop/AirDropDialogManager;", "", "<init>", "()V", "trial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "AIRDROP_ACTIVE_SUCCESS_KEY", "", "showActiveSuccessDialog", "", "fragment", "Lcom/kubi/kumex/trade/FuturesFragment;", "valueString", "trialCode", "checkNeedAirdrop", "Lcom/kubi/sdk/BaseFragment;", "isFragmentShow", "", "clearData", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AirDropDialogManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AirDropDialogManager f24559a = new AirDropDialogManager();

    /* JADX INFO: renamed from: b */
    @Nullable
    public static FuturesWelfareTrialItemEntity f24560b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static AirdropBonusEntity f24561c;

    /* JADX INFO: renamed from: i */
    public final void m28347i() {
        f24560b = null;
        f24561c = null;
    }

    /* JADX INFO: renamed from: l */
    public static final void m28342l(final FuturesFragment futuresFragment, String str, final String str2, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.dialogDesc);
        textView.setText(futuresFragment.getString(R$string.kumex_airdrop_active_ok_desc, str));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, futuresFragment.getColorRes(R$color.c_text))));
        TextView textView2 = (TextView) viewHolder.getView(R$id.introduce);
        textView2.setText(new C27096v0().m66908h(futuresFragment.getString(R$string.kumex_airdrop_active_ok_introduce)));
        Intrinsics.checkNotNull(textView2);
        C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.airdrop.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AirDropDialogManager.m28343m(dialogFragmentHelper, futuresFragment, str2);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m28346h(@NotNull BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (UserInfo.a.n() && BrokerConfig.f19211a.m20201d().mo20229O()) {
            if (f24560b == null || f24561c == null) {
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragment), C42911a.m94120b().plus(C37213a.m83254d()), null, new AirDropDialogManager$checkNeedAirdrop$2(fragment, null), 2, null);
                return;
            }
            View view = fragment.getView();
            if (view != null) {
                GuideHelper.f29155a.m33889u(view, f24561c, f24560b);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m28349k(@NotNull final FuturesFragment fragment, @NotNull final String valueString, @NotNull final String trialCode) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(valueString, "valueString");
        Intrinsics.checkNotNullParameter(trialCode, "trialCode");
        C43852m.m96595g("B6futures", "AirDropPositionSuccess", null, null, 12, null);
        AlertDialogFragmentHelper alertDialogFragmentHelperM54159P4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(0).m54151H4(false).m54148E4(R$layout.bkumex_dialog_future_airdrop_success, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.futures.trade.welfare.airdrop.m
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                AirDropDialogManager.m28342l(fragment, valueString, trialCode, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.kumex_trial_dialog_deal_ok_review_position, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.airdrop.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AirDropDialogManager.m28344n(fragment, dialogInterface, i11);
            }
        }).m54159P4(R$string.already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.futures.trade.welfare.airdrop.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                AirDropDialogManager.m28345o(dialogInterface, i11);
            }
        });
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54159P4.show(childFragmentManager, "AIRDROP_ACTIVE_SUCCESS_KEY");
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m28343m(DialogFragmentHelper dialogFragmentHelper, FuturesFragment futuresFragment, String str) {
        dialogFragmentHelper.dismiss();
        AirdropRuleDialog.Companion companion = AirdropRuleDialog.f24579u0;
        FragmentManager childFragmentManager = futuresFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m28344n(FuturesFragment futuresFragment, DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
        futuresFragment.m36203z8();
    }

    /* JADX INFO: renamed from: o */
    public static final void m28345o(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m28348j(BaseFragment baseFragment) {
        Boolean boolValueOf;
        if (baseFragment.isShowing()) {
            View view = baseFragment.getView();
            if (view != null) {
                boolValueOf = Boolean.valueOf(view.getGlobalVisibleRect(new Rect()));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
