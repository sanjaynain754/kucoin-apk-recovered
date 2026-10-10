package com.kubi.unify.account;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.R$color;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$id;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyConstant;
import com.kubi.unify.api.entity.UnifyAccountType;
import com.kubi.unify.entity.UnifyNotEmptyErrorEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import l10.C42025b;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AccountDialogHelper.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/unify/account/AccountDialogHelper;", "", "<init>", "()V", "showToggleSucceedDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "accountType", "", "fromType", "showToggleNotEmptyDialog", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"WrongConstant"})
@SourceDebugExtension({"SMAP\nAccountDialogHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountDialogHelper.kt\ncom/kubi/unify/account/AccountDialogHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1#2:153\n295#3,2:154\n1869#3,2:156\n*S KotlinDebug\n*F\n+ 1 AccountDialogHelper.kt\ncom/kubi/unify/account/AccountDialogHelper\n*L\n125#1:154,2\n95#1:156,2\n*E\n"})
public final class AccountDialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AccountDialogHelper f53098a = new AccountDialogHelper();

    /* JADX INFO: renamed from: g */
    public static final Unit m64894g(final List list, final String str, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        Context context = viewHolder.itemView.getContext();
        LinearLayout linearLayout = (LinearLayout) viewHolder.getView(R$id.errorLayout);
        linearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UnifyNotEmptyErrorEntity unifyNotEmptyErrorEntity = (UnifyNotEmptyErrorEntity) it.next();
            ShapeTextView shapeTextView = new ShapeTextView(context);
            shapeTextView.setText(C42180b.m92647l(unifyNotEmptyErrorEntity.getPreCheckDesc()));
            shapeTextView.setTextSize(16.0f);
            shapeTextView.setTextAlignment(5);
            shapeTextView.setTextColor(context.getResources().getColor(R$color.c_text));
            shapeTextView.setPadding(C27040e.m66658b(16), C27040e.m66658b(16), C27040e.m66658b(16), C27040e.m66658b(16));
            C27046k.m66694i(shapeTextView, C27025c.m66566d(unifyNotEmptyErrorEntity.isPassed()) ? R$drawable.ic2_success_filled_24 : R$drawable.ic2_close_filled_24, C27040e.m66658b(8), 0, 4, null);
            C27046k.m66702q(shapeTextView, context.getResources().getColor(C27025c.m66566d(unifyNotEmptyErrorEntity.isPassed()) ? R$color.primary : R$color.secondary));
            C42025b shapeDrawableBuilder = shapeTextView.getShapeDrawableBuilder();
            shapeDrawableBuilder.m92149k(C27040e.m66658b(12));
            shapeDrawableBuilder.m92152n(context.getResources().getColor(R$color.c_divider8));
            shapeDrawableBuilder.m92153o(C27040e.m66658b(1));
            shapeDrawableBuilder.m92143e();
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.bottomMargin = C27040e.m66658b(16);
            Unit unit = Unit.INSTANCE;
            linearLayout.addView(shapeTextView, marginLayoutParams);
        }
        View view = viewHolder.getView(R$id.btnGoHandle);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.unify.account.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountDialogHelper.m64895h(list, dialogFragmentHelper, str);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.close);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.unify.account.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountDialogHelper.m64896i(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m64895h(List list, DialogFragmentHelper dialogFragmentHelper, String str) {
        Object next;
        String preCheckType;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((UnifyNotEmptyErrorEntity) next).isPassed(), Boolean.FALSE));
        UnifyNotEmptyErrorEntity unifyNotEmptyErrorEntity = (UnifyNotEmptyErrorEntity) next;
        if (unifyNotEmptyErrorEntity != null && (preCheckType = unifyNotEmptyErrorEntity.getPreCheckType()) != null) {
            switch (preCheckType.hashCode()) {
                case -2033975059:
                    preCheckType.equals("LIABILITY");
                    break;
                case 84989:
                    if (preCheckType.equals("VIP")) {
                        InterfaceC37766r.a.m85190a(C37304a.f82764a, UnifyConstant.f53295a.m65230i(), null, null, null, null, null, null, 126, null);
                    }
                    break;
                case 75468590:
                    if (preCheckType.equals("ORDER")) {
                        if (Intrinsics.areEqual(str, SearchCategory$Companion.FUTURES)) {
                            InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, "order", null, null, null, null, null, 503, null);
                        } else if (!Intrinsics.areEqual(str, ViewProps.MARGIN)) {
                            InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, "order", null, null, null, 59, null);
                        } else {
                            InterfaceC37754f.a.m85135g(C37304a.f82764a, null, null, null, null, null, 31, null);
                        }
                    }
                    break;
                case 1530431785:
                    if (preCheckType.equals("POSITION")) {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, ViewProps.POSITION, null, null, null, null, null, 503, null);
                    }
                    break;
            }
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m64897k(String str, final String str2, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tvTitle;
        UnifyAccountType unifyAccountType = UnifyAccountType.UNIFIED;
        viewHolder.setText(i11, Intrinsics.areEqual(str, unifyAccountType.getValue()) ? R$string.unify_toggle_to_unify : R$string.unify_toggle_to_classic);
        viewHolder.setText(R$id.tvTitleDesc, Intrinsics.areEqual(str, unifyAccountType.getValue()) ? R$string.unify_toggle_to_unify_desc : R$string.unify_toggle_to_classic_desc);
        View view = viewHolder.getView(R$id.btnOk);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.unify.account.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountDialogHelper.m64898l(str2, dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m64898l(String str, DialogFragmentHelper dialogFragmentHelper) {
        if (Intrinsics.areEqual(str, SearchCategory$Companion.SPOT)) {
            InterfaceC37754f.a.m85140l(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        } else if (Intrinsics.areEqual(str, ViewProps.MARGIN)) {
            InterfaceC37754f.a.m85135g(C37304a.f82764a, null, null, null, null, null, 31, null);
        } else {
            InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m64899f(@NotNull String str, @Nullable String str2, @NotNull FragmentManager fragmentManager, @NotNull Continuation<? super Unit> continuation) {
        AccountDialogHelper$showToggleNotEmptyDialog$1 accountDialogHelper$showToggleNotEmptyDialog$1;
        final String str3;
        FragmentManager fragmentManager2;
        if (continuation instanceof AccountDialogHelper$showToggleNotEmptyDialog$1) {
            accountDialogHelper$showToggleNotEmptyDialog$1 = (AccountDialogHelper$showToggleNotEmptyDialog$1) continuation;
            int i11 = accountDialogHelper$showToggleNotEmptyDialog$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                accountDialogHelper$showToggleNotEmptyDialog$1.label = i11 - Integer.MIN_VALUE;
            } else {
                accountDialogHelper$showToggleNotEmptyDialog$1 = new AccountDialogHelper$showToggleNotEmptyDialog$1(this, continuation);
            }
        } else {
            accountDialogHelper$showToggleNotEmptyDialog$1 = new AccountDialogHelper$showToggleNotEmptyDialog$1(this, continuation);
        }
        Object objM91049g = accountDialogHelper$showToggleNotEmptyDialog$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = accountDialogHelper$showToggleNotEmptyDialog$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            AccountDialogHelper$showToggleNotEmptyDialog$result$1 accountDialogHelper$showToggleNotEmptyDialog$result$1 = new AccountDialogHelper$showToggleNotEmptyDialog$result$1(str2, null);
            accountDialogHelper$showToggleNotEmptyDialog$1.L$0 = str;
            accountDialogHelper$showToggleNotEmptyDialog$1.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            accountDialogHelper$showToggleNotEmptyDialog$1.L$2 = fragmentManager;
            accountDialogHelper$showToggleNotEmptyDialog$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, accountDialogHelper$showToggleNotEmptyDialog$result$1, accountDialogHelper$showToggleNotEmptyDialog$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str;
            fragmentManager2 = fragmentManager;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragmentManager2 = (FragmentManager) accountDialogHelper$showToggleNotEmptyDialog$1.L$2;
            str3 = (String) accountDialogHelper$showToggleNotEmptyDialog$1.L$0;
            ResultKt.throwOnFailure(objM91049g);
        }
        final List list = (List) objM91049g;
        if (list == null) {
            return Unit.INSTANCE;
        }
        DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.dialog_unify_not_empty_error, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.unify.account.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountDialogHelper.m64894g(list, str3, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager2, "showToggleNotEmptyDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final void m64900j(@NotNull FragmentManager childFragmentManager, @NotNull final String accountType, @NotNull final String fromType) {
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(fromType, "fromType");
        DialogFragmentHelper dialogFragmentHelperNewInstance$default = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.dialog_unify_congratulations, 4, 0, 0, false, false, false, false, false, 508, null);
        dialogFragmentHelperNewInstance$default.m54191p3();
        dialogFragmentHelperNewInstance$default.m54237f4(new Function2() { // from class: com.kubi.unify.account.a
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountDialogHelper.m64897k(accountType, fromType, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(childFragmentManager, "showToggleSucceedDialog");
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m64896i(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
