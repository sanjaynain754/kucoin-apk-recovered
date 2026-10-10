package p809yu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$string;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import cv.ChainSafeEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yu.n */
/* JADX INFO: compiled from: ChainSafelyAlertDialogHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/quotefacade/adapter/ChainSafelyAlertDialogHelper;", "", "<init>", "()V", "showChainSafelyDialog", "", "bindView", "Landroid/view/View;", "safeEntityList", "", "Lcom/kubi/quotefacade/entity/ChainSafeEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46581n {
    /* JADX INFO: renamed from: c */
    public static final void m102735c(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: b */
    public final void m102736b(@NotNull View bindView, @NotNull List<ChainSafeEntity> safeEntityList) {
        RecyclerView recyclerView;
        LayoutInflater layoutInflater;
        Intrinsics.checkNotNullParameter(bindView, "bindView");
        Intrinsics.checkNotNullParameter(safeEntityList, "safeEntityList");
        Context context = bindView.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            Activity activityM54412j = C22912t.m54412j(bindView);
            View viewInflate = (activityM54412j == null || (layoutInflater = activityM54412j.getLayoutInflater()) == null) ? null : layoutInflater.inflate(R$layout.safely_dialog_view, (ViewGroup) null);
            if (viewInflate != null && (recyclerView = (RecyclerView) viewInflate.findViewById(R$id.recycler_view)) != null) {
                recyclerView.setAdapter(new C46584q(safeEntityList));
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.quote_chain_safe_dialog_title).m54149F4(viewInflate, new DialogFragmentHelper.InterfaceC22882b() { // from class: yu.m
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    C46581n.m102735c(baseViewHolder, dialogFragmentHelper);
                }
            }).m54162S4(R$string.confirm, null).m54172c5(supportFragmentManager);
        }
    }
}
