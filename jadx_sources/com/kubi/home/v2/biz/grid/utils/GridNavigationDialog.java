package com.kubi.home.v2.biz.grid.utils;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5258a;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GridNavigationDialog.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ&\u0010\n\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tJ\"\u0010\f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJH\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/utils/GridNavigationDialog;", "", "<init>", "()V", "TAG", "", "alertCleanAll", "", "onOK", "Lkotlin/Function0;", "alertResetHome", "onCancel", "alertSave", "pop", "msg", "", "leftBtnStr", "rightBtnStr", "statusImg", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GridNavigationDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GridNavigationDialog f26422a = new GridNavigationDialog();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30655h(GridNavigationDialog gridNavigationDialog, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        gridNavigationDialog.m30663g(function0, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m30656k(GridNavigationDialog gridNavigationDialog, int i11, int i12, int i13, int i14, Function0 function0, Function0 function1, int i15, Object obj) {
        if ((i15 & 32) != 0) {
            function1 = null;
        }
        gridNavigationDialog.m30665j(i11, i12, i13, i14, function0, function1);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m30658m(int i11, int i12, int i13, final Function0 function0, final FragmentActivity fragmentActivity, int i14, final Function0 function1, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        View view = viewHolder.getView(R$id.ivClose);
        if (view != null) {
            C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationDialog.m30659n(helper);
                }
            });
        }
        viewHolder.setImageResource(R$id.ivStatus, i11);
        viewHolder.setText(R$id.tvMsg, C27017c.f54310a.m66516f(i12, new Object[0]));
        TextView textView = (TextView) viewHolder.getView(R$id.tv_left_btn);
        if (textView != null) {
            textView.setText(i13);
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationDialog.m30660o(helper, function0, fragmentActivity);
                }
            }, 1, null);
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_right_btn);
        if (textView2 != null) {
            textView2.setText(i14);
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNavigationDialog.m30661p(helper, fragmentActivity, function1);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m30662f(@NotNull Function0<Unit> onOK) {
        Intrinsics.checkNotNullParameter(onOK, "onOK");
        m30656k(this, R$string.homepage_tip_msg_remove_all, R$string.cancel, R$string.newcoin_dialog_ok, R$drawable.ic2_common_info, onOK, null, 32, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m30663g(@NotNull Function0<Unit> onOK, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(onOK, "onOK");
        m30665j(R$string.homepage_tip_msg_reset, R$string.cancel, R$string.newcoin_dialog_ok, R$drawable.ic2_common_info, onOK, function0);
    }

    /* JADX INFO: renamed from: i */
    public final void m30664i(@NotNull Function0<Unit> onOK, @NotNull Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(onOK, "onOK");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        m30665j(R$string.homepage_tip_msg_save_changes, R$string.homepage_btn_no, R$string.save, R$drawable.ic2_common_warning, onOK, onCancel);
    }

    /* JADX INFO: renamed from: j */
    public final void m30665j(final int i11, final int i12, final int i13, final int i14, final Function0<Unit> function0, final Function0<Unit> function1) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.biz.grid.utils.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNavigationDialog.m30657l(i14, i11, i12, function1, i13, function0);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m30657l(final int i11, final int i12, final int i13, final Function0 function0, final int i14, final Function0 function1) {
        FragmentActivity fragmentActivity;
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) activityM6125h;
        } else {
            fragmentActivity = null;
        }
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        if (fragmentActivity2 != null && !fragmentActivity2.isFinishing()) {
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.home_dialog_grid_navi_confirm, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.home.v2.biz.grid.utils.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GridNavigationDialog.m30658m(i11, i12, i13, function0, fragmentActivity2, i14, function1, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            FragmentManager supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(supportFragmentManager, "GridNavigationDialog");
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m30659n(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30660o(DialogFragmentHelper dialogFragmentHelper, Function0 function0, FragmentActivity fragmentActivity) {
        dialogFragmentHelper.dismiss();
        if (function0 != null) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new GridNavigationDialog$pop$1$1$2$1$1(function0, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30661p(DialogFragmentHelper dialogFragmentHelper, FragmentActivity fragmentActivity, Function0 function0) {
        dialogFragmentHelper.dismiss();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new GridNavigationDialog$pop$1$1$3$1$1(function0, null), 3, null);
        return Unit.INSTANCE;
    }
}
