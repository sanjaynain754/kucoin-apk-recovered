package p229ed;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p827zc.C46755e;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ed.b */
/* JADX INFO: compiled from: CancelOrderBatchExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\t"}, m90084d2 = {"showCancelAllOrdersDialog", "", "Landroidx/fragment/app/Fragment;", "orderType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "rightBtnClick", "Landroid/content/DialogInterface$OnClickListener;", "cancelAllOrderTipMsgStr", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37134b {
    /* JADX INFO: renamed from: b */
    public static final String m83059b(Fragment fragment, OrderLevelType orderLevelType) {
        boolean zMo22539c = C46755e.m103018c(fragment, null, 1, null).getF104580e().mo22539c();
        boolean zAreEqual = Intrinsics.areEqual(orderLevelType, OrderLevelType.Normal.INSTANCE);
        if (zMo22539c && zAreEqual) {
            String string = fragment.getString(R$string.unify_cancel_all_todo_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (zMo22539c && !zAreEqual) {
            String string2 = fragment.getString(R$string.unify_cancel_all_limit_order);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (zMo22539c || !zAreEqual) {
            String string3 = fragment.getString(R$string.cancel_all_limit_order);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        String string4 = fragment.getString(R$string.cancel_all_todo_order);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    /* JADX INFO: renamed from: c */
    public static final void m83060c(@NotNull Fragment fragment, @Nullable OrderLevelType orderLevelType, @NotNull final DialogInterface.OnClickListener rightBtnClick) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(rightBtnClick, "rightBtnClick");
        if (fragment.getActivity() != null) {
            FragmentActivity activity = fragment.getActivity();
            if (C27025c.m66566d(activity != null ? Boolean.valueOf(activity.isFinishing()) : null)) {
                return;
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.onekey_cancel_all).m54156M4(m83059b(fragment, orderLevelType)).m54161R4(0).m54162S4(R$string.confirm, new DialogInterface.OnClickListener() { // from class: ed.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    C37134b.m83061d(rightBtnClick, dialogInterface, i11);
                }
            }).m54159P4(R$string.cancel, null).m54172c5(fragment.getChildFragmentManager());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m83061d(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i11) {
        onClickListener.onClick(dialogInterface, i11);
    }
}
