package lt;

import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lt.e */
/* JADX INFO: compiled from: PaymentDialogHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/otc/utils/PaymentDialogHelper;", "", "<init>", "()V", "showBottomDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "title", "content", "startText", "endText", "confirmCallback", "Lkotlin/Function0;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42300e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42300e f93799a = new C42300e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m92839e(C42300e c42300e, FragmentManager fragmentManager, String str, String str2, String str3, String str4, String str5, Function0 function0, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str4 = null;
        }
        if ((i11 & 32) != 0) {
            str5 = null;
        }
        if ((i11 & 64) != 0) {
            function0 = null;
        }
        c42300e.m92843d(fragmentManager, str, str2, str3, str4, str5, function0);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m92840f(String str, String str2, String str3, String str4, final Function0 function0, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_title);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_start);
        if (textView3 != null) {
            if (str3 != null && str3.length() != 0) {
                textView3.setText(str3);
                C27046k.m66685H(textView3);
            }
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: lt.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42300e.m92841g(dialogFragmentHelper);
                }
            }, 1, null);
        }
        TextView textView4 = (TextView) viewHolder.getView(R$id.tv_end);
        if (textView4 != null) {
            if (str4 != null && str4.length() != 0) {
                textView4.setText(str4);
            }
            C27046k.m66711z(textView4, 0L, new Function0() { // from class: lt.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42300e.m92842h(function0, dialogFragmentHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m92842h(Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        if (function0 != null) {
            function0.invoke();
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final void m92843d(@NotNull FragmentManager fragmentManager, @NotNull String tag, @NotNull final String title, @NotNull final String content, @Nullable final String str, @Nullable final String str2, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_bottom_title_content, true).m54237f4(new Function2() { // from class: lt.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C42300e.m92840f(title, content, str, str2, function0, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, tag);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m92841g(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
