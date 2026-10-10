package j50;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import k50.C40911a;
import k50.C40917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.b1 */
/* JADX INFO: compiled from: ViewBindExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\t\u001a7\u0010\n\u001a\u00020\u0001*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"bindClickShowShortTrendDialog", "", "Landroid/widget/TextView;", "bindClickShowCurCostDialog", "bindClickShowGridProfitDialog", "bindClickShowRealisedPnlDialog", "bindClickShowFloatAmountDialog", "bindShowLiqDialog", "bindClickToRobotRunning", "Landroid/view/View;", "bindClickToRobotDetail", "symbolCode", "", "runningStatus", "type", "", "taskId", "", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40285b1 {
    /* JADX INFO: renamed from: I */
    public static final Unit m88726I() {
        C40911a.m89599c("/tabpage/running", null, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m88720C(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88721D(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: F */
    public static final void m88723F(@NotNull View view, @Nullable final String str, @Nullable final String str2, @Nullable final Integer num, @Nullable final Long l11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C27046k.m66711z(view, 0L, new Function0() { // from class: j50.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88724G(str, str2, num, l11);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m88724G(String str, String str2, Integer num, Long l11) {
        C40911a.m89599c("/running/detail/" + l11, "&symbol=" + str + "&mode=" + str2 + "&type=" + num, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final void m88725H(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C27046k.m66711z(view, 0L, new Function0() { // from class: j50.w0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88726I();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: J */
    public static final void m88727J(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88728K(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: L */
    public static final void m88729L(BaseViewHolder viewHolder, DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        BaseTextView baseTextView = (BaseTextView) viewHolder.getView(R$id.viewMoreTv);
        Intrinsics.checkNotNull(baseTextView);
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: j50.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88730M();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m88730M() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C40917g.m89614o(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m88748q(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88749r(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public static final void m88751t(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88752u(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w */
    public static final void m88754w(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88755x(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z */
    public static final void m88757z(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        C27046k.m66711z(textView, 0L, new Function0() { // from class: j50.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40285b1.m88718A(textView);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m88718A(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.realised_pnl)).m54156M4(textView.getContext().getString(R$string.kc_tb_grid_win_two_way_unpnl_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.x0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88719B(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m88721D(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.kc_tb_grid_short_trend)).m54156M4(textView.getContext().getString(R$string.kc_tb_grid_futures_ai_trend_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88722E(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m88728K(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.bkumex_position_estimated_liq_price)).m54148E4(R$layout.btrading_bot_kit_dialog_content_liq_price, new DialogFragmentHelper.InterfaceC22882b() { // from class: j50.p0
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                C40285b1.m88729L(baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88731N(dialogInterface, i11);
            }
        }).show(childFragmentManager, "LiqPrice");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m88749r(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.kc_tb_grid_current_cost)).m54156M4(textView.getContext().getString(R$string.kc_tb_grid_futures_ai_cost_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.a1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88750s(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m88752u(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.kc_tb_grid_float_amount)).m54156M4(textView.getContext().getString(R$string.kc_tb_grid_alert_float_pnl)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.y0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88753v(dialogInterface, i11);
            }
        }).show(childFragmentManager, "FloatAmount");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m88755x(TextView textView) {
        FragmentManager childFragmentManager = ViewKt.findFragment(textView).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(textView.getContext().getString(R$string.kc_tb_grid_income)).m54156M4(textView.getContext().getString(R$string.kc_tb_grid_alert_profit_tip)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.o0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40285b1.m88756y(dialogInterface, i11);
            }
        }).show(childFragmentManager, "GridProfit");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final void m88719B(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: E */
    public static final void m88722E(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: N */
    public static final void m88731N(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: s */
    public static final void m88750s(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: v */
    public static final void m88753v(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: y */
    public static final void m88756y(DialogInterface dialogInterface, int i11) {
    }
}
