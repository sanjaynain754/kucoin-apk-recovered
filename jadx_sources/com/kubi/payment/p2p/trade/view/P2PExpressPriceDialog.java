package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.trade.view.P2PExpressPriceDialog;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: P2PExpressPriceDialog.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PExpressPriceDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "setupView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2PExpressPriceDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final Companion f40140q0 = new Companion(null);

    /* JADX INFO: compiled from: P2PExpressPriceDialog.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PExpressPriceDialog$Companion;", "", "<init>", "()V", "KEY_IS_BOTTOM_SHEET", "", "KEY_LAYOUT", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            P2PExpressPriceDialog p2PExpressPriceDialog = new P2PExpressPriceDialog();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isBottomSheet", true);
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.payment_dialog_p2p_express_price);
            p2PExpressPriceDialog.setArguments(bundle);
            p2PExpressPriceDialog.show(fragmentManager, "payment_dialog_p2p_express_price");
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        View view = viewHolder.getView(R$id.tvConfirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: gu.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return P2PExpressPriceDialog.m49396k4(this.f85640b);
            }
        }, 1, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        m54236e4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m49396k4(P2PExpressPriceDialog p2PExpressPriceDialog) {
        p2PExpressPriceDialog.dismiss();
        return Unit.INSTANCE;
    }
}
