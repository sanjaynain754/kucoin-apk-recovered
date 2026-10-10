package com.kubi.futures.dialog;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdvancedLimitDialogHelper.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u001a\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, m90084d2 = {"chooseAdvancedLimitTypeDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "currentLimitType", "Lcom/kubi/futures/dialog/TIF;", "onDismissAction", "Lio/reactivex/functions/Action;", "onItemClick", "Lkotlin/Function1;", "Lcom/kubi/futures/dialog/AdvancedLimitItemEntity;", "getAdvancedLimitItemEntityList", "", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdvancedLimitDialogHelperKt {
    /* JADX INFO: renamed from: d */
    public static final void m25043d(@NotNull FragmentManager childFragmentManager, @NotNull TIF currentLimitType, @Nullable final Action action, @NotNull final Function1<? super AdvancedLimitItemEntity, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(currentLimitType, "currentLimitType");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        final List<AdvancedLimitItemEntity> listM25047h = m25047h(currentLimitType);
        DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_dialog, true).m54237f4(new Function2() { // from class: com.kubi.futures.dialog.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedLimitDialogHelperKt.m25044e(listM25047h, onItemClick, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.futures.dialog.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) throws Exception {
                AdvancedLimitDialogHelperKt.m25046g(action, dialogInterface);
            }
        }).show(childFragmentManager, "chooseAdvancedLimitTypeDialog");
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m25044e(List list, Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) viewHolder.getView(R$id.recycler_view)).setAdapter(new AdvancedLimitDialogHelperKt$chooseAdvancedLimitTypeDialog$1$1(list, dialogFragmentHelper, function1, R$layout.bkumex_view_item_advanced_limit));
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.futures.dialog.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedLimitDialogHelperKt.m25045f(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m25046g(Action action, DialogInterface dialogInterface) throws Exception {
        if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final List<AdvancedLimitItemEntity> m25047h(TIF tif) {
        TIF tif2 = TIF.PostOnly;
        AdvancedLimitItemEntity advancedLimitItemEntity = new AdvancedLimitItemEntity(tif2, tif2 == tif);
        TIF tif3 = TIF.FOK;
        AdvancedLimitItemEntity advancedLimitItemEntity2 = new AdvancedLimitItemEntity(tif3, tif3 == tif);
        TIF tif4 = TIF.IOC;
        return CollectionsKt.listOf((Object[]) new AdvancedLimitItemEntity[]{advancedLimitItemEntity, advancedLimitItemEntity2, new AdvancedLimitItemEntity(tif4, tif4 == tif)});
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m25045f(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
