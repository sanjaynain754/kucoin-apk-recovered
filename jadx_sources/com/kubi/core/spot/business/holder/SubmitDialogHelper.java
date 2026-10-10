package com.kubi.core.spot.business.holder;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.core.spot.entity.AdvancedLimitItemEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.spot.entity.AdvancedLimitItemEntityKt;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.functions.Action;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubmitDialogHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/SubmitDialogHelper;", "", "<init>", "()V", "chooseAdvancedLimitTypeDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "currentLimitType", "", "onDismissAction", "Lio/reactivex/functions/Action;", "onItemClick", "Lkotlin/Function1;", "Lcom/kubi/core/spot/entity/AdvancedLimitItemEntity;", "getAdvancedLimitItemEntityList", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SubmitDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SubmitDialogHelper f21095a = new SubmitDialogHelper();

    /* JADX INFO: renamed from: e */
    public static final Unit m23243e(List list, Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) viewHolder.getView(R$id.recycler_view)).setAdapter(new SubmitDialogHelper$chooseAdvancedLimitTypeDialog$1$1(list, dialogFragmentHelper, function1, R$layout.trade_core_view_item_advanced_limit));
        viewHolder.getView(R$id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubmitDialogHelper.m23244f(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m23245g(Action action, DialogInterface dialogInterface) throws Exception {
        if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23246d(@NotNull FragmentManager childFragmentManager, @NotNull String currentLimitType, @Nullable final Action action, @NotNull final Function1<? super AdvancedLimitItemEntity, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(currentLimitType, "currentLimitType");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        final List<AdvancedLimitItemEntity> listM23247h = m23247h(currentLimitType);
        DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_dialog, true).m54237f4(new Function2() { // from class: com.kubi.core.spot.business.holder.g3
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SubmitDialogHelper.m23243e(listM23247h, onItemClick, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.core.spot.business.holder.h3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) throws Exception {
                SubmitDialogHelper.m23245g(action, dialogInterface);
            }
        }).show(childFragmentManager, "chooseAdvancedLimitTypeDialog");
    }

    /* JADX INFO: renamed from: h */
    public final List<AdvancedLimitItemEntity> m23247h(String str) {
        C27017c c27017c = C27017c.f54310a;
        return CollectionsKt.listOf((Object[]) new AdvancedLimitItemEntity[]{new AdvancedLimitItemEntity(c27017c.m66516f(R$string.kc_post_only_subheading, new Object[0]), c27017c.m66516f(R$string.kc_post_only_desc, new Object[0]), AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_POST_ONLY, Intrinsics.areEqual(AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_POST_ONLY, str)), new AdvancedLimitItemEntity(c27017c.m66516f(R$string.kc_fok_subheading, new Object[0]), c27017c.m66516f(R$string.kc_fok_desc, new Object[0]), AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK, Intrinsics.areEqual(AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_FOK, str)), new AdvancedLimitItemEntity(c27017c.m66516f(R$string.kc_ioc_title, new Object[0]), c27017c.m66516f(R$string.kc_ioc_desc, new Object[0]), AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC, Intrinsics.areEqual(AdvancedLimitItemEntityKt.TYPE_ADVANCED_LIMIT_IOC, str))});
    }

    /* JADX INFO: renamed from: f */
    public static final void m23244f(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }
}
