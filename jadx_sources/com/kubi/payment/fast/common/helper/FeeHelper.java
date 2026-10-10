package com.kubi.payment.fast.common.helper;

import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastFeeModel;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fast.common.helper.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FeeHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/fast/common/helper/FeeHelper;", "", "<init>", "()V", "showFeeDialog", "", "feeData", "Lcom/kubi/otc/entity/FastFeeModel;", "feeCurrency", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FeeHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FeeHelper f38580a = new FeeHelper();

    /* JADX INFO: renamed from: c */
    public static final void m46376c(FastFeeModel fastFeeModel, String str, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        String fee;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        String strM66669i = C27041f.m66669i((fastFeeModel == null || (fee = fastFeeModel.getFee()) == null) ? null : C41014a.m89945s(fee, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null), "0.00");
        boolean z11 = true;
        boolean z12 = ((fastFeeModel != null ? fastFeeModel.getMinFee() : null) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        boolean z13 = ((fastFeeModel != null ? fastFeeModel.getMaxFee() : null) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        BaseViewHolder text = helper.setText(R$id.tv_fee_rate, C27041f.m66669i(fastFeeModel != null ? fastFeeModel.getFeeMsg() : null, "0.00%")).setText(R$id.tv_fee, strM66669i).setText(R$id.tv_fee_unit, str);
        int i11 = R$id.tv_min_fee;
        StringBuilder sb2 = new StringBuilder();
        C27017c c27017c = C27017c.f54310a;
        sb2.append(c27017c.m66516f(R$string.fiat_low_fee, new Object[0]));
        sb2.append(' ');
        sb2.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A(fastFeeModel != null ? fastFeeModel.getMinFee() : null)).toPlainString(), "0.00"));
        sb2.append(' ');
        sb2.append(str);
        BaseViewHolder text2 = text.setText(i11, sb2.toString());
        int i12 = R$id.tv_max_fee;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c27017c.m66516f(R$string.fiat_high_fee, new Object[0]));
        sb3.append(' ');
        sb3.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A(fastFeeModel != null ? fastFeeModel.getMaxFee() : null)).toPlainString(), "0.00"));
        sb3.append(' ');
        sb3.append(str);
        BaseViewHolder gone = text2.setText(i12, sb3.toString()).setGone(i11, z12).setGone(i12, z13);
        int i13 = R$id.view_line;
        if (!z12 && !z13) {
            z11 = false;
        }
        gone.setGone(i13, z11);
    }

    /* JADX INFO: renamed from: b */
    public final void m46377b(@Nullable final FastFeeModel fastFeeModel, @Nullable final String str, @NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fiat_fee_detail).m54148E4(R$layout.botc_view_fast_fee, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.payment.fast.common.helper.a
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                FeeHelper.m46376c(fastFeeModel, str, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.i_already_know, null).show(fragmentManager, "payment_dialog_fee");
    }
}
