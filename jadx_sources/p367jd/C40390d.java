package p367jd;

import af.C0296a;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.base.p076ui.ImportInfoDisplayData;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.SuffixTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: jd.d */
/* JADX INFO: compiled from: ImportTipDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, m90084d2 = {"showImportDialog", "", "Lcom/kubi/sdk/BaseFragment;", "data", "Lcom/kubi/core/base/ui/ImportInfoDisplayData;", "allowShowRule", "Lkotlin/Function0;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40390d {
    /* JADX INFO: renamed from: d */
    public static final void m89009d(@NotNull BaseFragment baseFragment, @NotNull final ImportInfoDisplayData data, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!baseFragment.isAdded() || !baseFragment.isShowing()) {
            C44128b.m97258b("showImportDialog -> showImportDialog fail, dialog not ready. tag: " + data.getDialogTag());
            return;
        }
        if (function0 == null || function0.invoke().booleanValue()) {
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.bkucoin_import_info_dialog_tips, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: jd.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C40390d.m89010e(data, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, data.getDialogTag());
            return;
        }
        C44128b.m97258b("showImportDialog -> showImportDialog fail, allowShowRule result is false. tag: " + data.getDialogTag());
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m89010e(final ImportInfoDisplayData importInfoDisplayData, final BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tvTitle, importInfoDisplayData.getTitle());
        int i11 = R$id.tvTipsContent;
        viewHolder.setText(i11, importInfoDisplayData.getContent());
        int i12 = R$id.tvIKnow;
        viewHolder.setText(i12, importInfoDisplayData.getConfirmStr());
        CheckBox checkBox = (CheckBox) viewHolder.getView(R$id.rbNotAgain);
        checkBox.setChecked(false);
        Intrinsics.checkNotNull(checkBox);
        C0296a.m1042d(checkBox, importInfoDisplayData.getSupportNotShowAnyMore());
        viewHolder.setOnClickListener(i12, new View.OnClickListener() { // from class: jd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C40390d.m89011f(viewHolder, importInfoDisplayData, dialogFragmentHelper, view);
            }
        });
        SuffixTextView suffixTextView = (SuffixTextView) viewHolder.getView(i11);
        String moreJumpUrl = importInfoDisplayData.getMoreJumpUrl();
        if (moreJumpUrl == null || moreJumpUrl.length() == 0) {
            suffixTextView.m54794k(false);
        } else {
            suffixTextView.m54794k(true);
            Intrinsics.checkNotNull(suffixTextView);
            C27046k.m66711z(suffixTextView, 0L, new Function0() { // from class: jd.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C40390d.m89012g(importInfoDisplayData);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final void m89011f(BaseViewHolder baseViewHolder, ImportInfoDisplayData importInfoDisplayData, DialogFragmentHelper dialogFragmentHelper, View view) {
        boolean zIsChecked = ((CheckBox) baseViewHolder.getView(R$id.rbNotAgain)).isChecked();
        Function1<Boolean, Unit> confirmCallback = importInfoDisplayData.getConfirmCallback();
        if (confirmCallback != null) {
            confirmCallback.invoke(Boolean.valueOf(zIsChecked));
        }
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m89012g(ImportInfoDisplayData importInfoDisplayData) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, importInfoDisplayData.getMoreJumpUrl(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }
}
