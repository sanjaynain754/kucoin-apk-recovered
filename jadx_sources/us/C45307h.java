package us;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.R$string;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: us.h */
/* JADX INFO: compiled from: WelfareDialog.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J0\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/utils/WelfareDialog;", "", "<init>", "()V", "alertDeposit", "", "fm", "Landroidx/fragment/app/FragmentManager;", "alertToTrade", "spotTitleAmount", "", "spotContentAmount", "futuresTitleAmount", "futuresContentAmount", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45307h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45307h f101869a = new C45307h();

    /* JADX INFO: renamed from: l */
    public static final Unit m100173l(String str, String str2, String str3, String str4, BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Context context = holder.itemView.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        holder.setImageResource(R$id.ivIcon1, R$mipmap.operation_newcomer_spot);
        TextView textView = (TextView) holder.getView(R$id.tvTitle1);
        if (textView != null) {
            textView.setText(context.getString(R$string.home_welfare_sheet_spot_title, str));
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text)));
        }
        TextView textView2 = (TextView) holder.getView(R$id.tvTips1);
        if (textView2 != null) {
            textView2.setText(context.getString(R$string.home_welfare_sheet_spot_content, str2));
            HighlightTextHelper.f43497a.m54116a(textView2, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.primary)));
        }
        holder.setImageResource(R$id.ivIcon2, R$mipmap.operation_newcomer_future);
        TextView textView3 = (TextView) holder.getView(R$id.tvTitle2);
        if (textView3 != null) {
            textView3.setText(context.getString(R$string.home_welfare_sheet_futures_title, str3));
            HighlightTextHelper.f43497a.m54116a(textView3, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text)));
        }
        TextView textView4 = (TextView) holder.getView(R$id.tvTips2);
        if (textView4 != null) {
            textView4.setText(context.getString(R$string.home_welfare_sheet_futures_content, str4));
            HighlightTextHelper.f43497a.m54116a(textView4, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.primary)));
        }
        View view = holder.getView(R$id.layout1);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: us.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45307h.m100174m(dialog);
                }
            }, 1, null);
        }
        View view2 = holder.getView(R$id.layout2);
        if (view2 != null) {
            C27046k.m66711z(view2, 0L, new Function0() { // from class: us.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45307h.m100175n(dialog);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m100168g(@NotNull FragmentManager fm2) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.operation_dialog_newcomer_deposit_trade, true).m54237f4(new Function2() { // from class: us.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C45307h.m100169h((BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fm2, "alertDeposit");
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m100169h(BaseViewHolder holder, final DialogFragmentHelper dialog) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        holder.setImageResource(R$id.ivIcon1, R$mipmap.operation_newcomer_buy);
        holder.setText(R$id.tvTitle1, R$string.home_welfare_sheet_buy_title);
        holder.setText(R$id.tvTips1, R$string.home_welfare_sheet_buy_content);
        holder.setImageResource(R$id.ivIcon2, R$mipmap.operation_newcomer_transfer);
        holder.setText(R$id.tvTitle2, R$string.home_welfare_sheet_deposit_title);
        holder.setText(R$id.tvTips2, R$string.home_welfare_sheet_deposit_content);
        View view = holder.getView(R$id.layout1);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: us.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45307h.m100170i(dialog);
                }
            }, 1, null);
        }
        View view2 = holder.getView(R$id.layout2);
        if (view2 != null) {
            C27046k.m66711z(view2, 0L, new Function0() { // from class: us.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C45307h.m100171j(dialog);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m100170i(DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m100171j(DialogFragmentHelper dialogFragmentHelper) {
        InterfaceC37749a.a.m85110e(C37304a.f82764a, null, 1L, null, null, null, null, 61, null);
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m100172k(@NotNull FragmentManager fm2, @NotNull final String spotTitleAmount, @NotNull final String spotContentAmount, @NotNull final String futuresTitleAmount, @NotNull final String futuresContentAmount) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(spotTitleAmount, "spotTitleAmount");
        Intrinsics.checkNotNullParameter(spotContentAmount, "spotContentAmount");
        Intrinsics.checkNotNullParameter(futuresTitleAmount, "futuresTitleAmount");
        Intrinsics.checkNotNullParameter(futuresContentAmount, "futuresContentAmount");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.operation_dialog_newcomer_deposit_trade, true).m54237f4(new Function2() { // from class: us.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C45307h.m100173l(spotTitleAmount, spotContentAmount, futuresTitleAmount, futuresContentAmount, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fm2, "alertToTrade");
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m100174m(DialogFragmentHelper dialogFragmentHelper) {
        Router.f46192a.m56184f("trade").m4048k();
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m100175n(DialogFragmentHelper dialogFragmentHelper) {
        Router.f46192a.m56184f("kumex/trade").m4048k();
        dialogFragmentHelper.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
