package com.kubi.kucoin.main.helper;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kubi.facade.lib.R$id;
import com.kubi.facade.lib.R$layout;
import com.kubi.kucoin.main.helper.ModeDialogHelper;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.rorbin.badgeview.QBadgeView;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import cr.C36522b;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import nl.C42851a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import zw.C46932c;

/* JADX INFO: compiled from: ModeDialogHelper.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00070\u0010J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/ModeDialogHelper;", "", "<init>", "()V", "TAG", "", "alertModeChooseDialog", "", "fm", "Landroidx/fragment/app/FragmentManager;", "selectedIndex", "", "list", "", "Lcom/kubi/sdk/widget/dialog/SelectEntity;", "onSelected", "Lkotlin/Function1;", "bindWeb3ModeRedDot", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDialogInstence", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModeDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeDialogHelper.kt\ncom/kubi/kucoin/main/helper/ModeDialogHelper\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,120:1\n142#2,8:121\n*S KotlinDebug\n*F\n+ 1 ModeDialogHelper.kt\ncom/kubi/kucoin/main/helper/ModeDialogHelper\n*L\n108#1:121,8\n*E\n"})
public final class ModeDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ModeDialogHelper f27996a = new ModeDialogHelper();

    /* JADX INFO: renamed from: h */
    public static final Unit m32439h(List list, Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper dialogHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogHelper, "dialogHelper");
        ((RecyclerView) viewHolder.getView(R$id.recyclerView)).setAdapter(new ModeDialogHelper$alertModeChooseDialog$1$1$1(list, function1, dialogHelper, R$layout.view_bottom_sheet_style_two_item));
        View view = viewHolder.getView(R$id.layoutDialogRoot);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: ml.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ModeDialogHelper.m32440i(dialogHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m32441j(DialogFragmentHelper dialogFragmentHelper, BaseViewHolder it) {
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(it, "it");
        Dialog dialog = dialogFragmentHelper.getDialog();
        if (dialog == null) {
            return Unit.INSTANCE;
        }
        try {
            FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet);
            BottomSheetBehavior bottomSheetBehaviorFrom = frameLayout != null ? BottomSheetBehavior.from(frameLayout) : null;
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setState(3);
            }
            int iM6182d = C5267e0.m6182d() - C27040e.m66658b(64);
            if (C5275i0.m6237b((RecyclerView) dialog.findViewById(R$id.recyclerView)) > iM6182d - C27040e.m66658b(72)) {
                Window window = dialog.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    attributes.height = iM6182d;
                }
                if (bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setMaxHeight(iM6182d);
                }
                if (bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setPeekHeight(iM6182d);
                }
            }
        } catch (Exception e11) {
            C44128b.m97263g("ModeDialogHelper", e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m32442f(@NotNull final FragmentManager fm2, int i11, @NotNull final List<SelectEntity> list, @NotNull final Function1<? super SelectEntity, Unit> onSelected) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        C27100x0.m66923d(new Function0() { // from class: ml.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModeDialogHelper.m32438g(list, fm2, onSelected);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m32443k(BaseViewHolder baseViewHolder, SelectEntity selectEntity) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.title);
        View view = baseViewHolder.itemView;
        int i11 = R$id.tag_web3_mode_red_dot;
        Object tag = view.getTag(i11);
        QBadgeView qBadgeViewM103404a = tag instanceof QBadgeView ? (QBadgeView) tag : null;
        if (qBadgeViewM103404a == null) {
            qBadgeViewM103404a = C46932c.m103404a(new QBadgeView(baseViewHolder.itemView.getContext()));
            qBadgeViewM103404a.mo55431h(8388629);
            qBadgeViewM103404a.mo55426c(1.0f, 0.0f, true);
            qBadgeViewM103404a.mo55429f(textView);
            baseViewHolder.itemView.setTag(i11, qBadgeViewM103404a);
        }
        boolean z11 = Intrinsics.areEqual(selectEntity.getValue(), "Web3") && C42851a.f94919a.m93994k();
        Intrinsics.checkNotNull(textView);
        textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), z11 ? C27040e.m66658b(12) : 0, textView.getPaddingBottom());
        qBadgeViewM103404a.mo55425b(z11 ? -1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final DialogFragmentHelper m32444l() {
        return C36522b.f79371a.m81777g().getValue() > DeviceLevel.MIDDLE.getValue() ? DialogFragmentHelper.f43568p0.newInstance(R$layout.mode_choose_dialog, true) : ModeDialog.f27995q0.newInstance(R$layout.mode_choose_dialog);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m32438g(List list, FragmentManager fragmentManager, final Function1 function1) {
        if (list.isEmpty()) {
            return Unit.INSTANCE;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        C27023a.m66557d("B1ModeSwitchPopup", "page", null, null, 12, null);
        final DialogFragmentHelper dialogFragmentHelperM54237f4 = f27996a.m32444l().m54237f4(new Function2() { // from class: ml.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ModeDialogHelper.m32439h(arrayList, function1, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        dialogFragmentHelperM54237f4.m54238g4(new Function1() { // from class: ml.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModeDialogHelper.m32441j(dialogFragmentHelperM54237f4, (BaseViewHolder) obj);
            }
        });
        dialogFragmentHelperM54237f4.show(fragmentManager, "ModeDialogHelper");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m32440i(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
