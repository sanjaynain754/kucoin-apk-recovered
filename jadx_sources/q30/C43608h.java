package q30;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$id;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q30.h */
/* JADX INFO: compiled from: MarginDebtRadioDescDialog.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/tradebase/helper/MarginDebtRadioDescDialog;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "title", "", "content", "actionBtnText", "actionBtnClick", "Lkotlin/Function0;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43608h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43608h f96261a = new C43608h();

    /* JADX INFO: renamed from: e */
    public static final Unit m95966e(String str, String str2, String str3, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        viewHolder.setText(R$id.tvTitle, str);
        int i11 = R$id.empty_tips;
        viewHolder.setText(i11, str2);
        int i12 = R$id.buttonConfirm;
        viewHolder.setText(i12, str3);
        View view = viewHolder.getView(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: q30.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43608h.m95967f(helper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: q30.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43608h.m95968g(function0, helper);
            }
        }, 1, null);
        TextView textView = (TextView) viewHolder.getView(i11);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m95969d(@NotNull FragmentManager childFragmentManager, @NotNull final String title, @NotNull final String content, @NotNull final String actionBtnText, @NotNull final Function0<Unit> actionBtnClick) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionBtnText, "actionBtnText");
        Intrinsics.checkNotNullParameter(actionBtnClick, "actionBtnClick");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.btradebase_margin_debt_desc_dialog, true).m54237f4(new Function2() { // from class: q30.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C43608h.m95966e(title, content, actionBtnText, actionBtnClick, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, "MarginDebtRadioDescDialog");
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m95967f(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m95968g(Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        function0.invoke();
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
