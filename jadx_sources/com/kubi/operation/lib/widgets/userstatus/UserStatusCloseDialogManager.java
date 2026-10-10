package com.kubi.operation.lib.widgets.userstatus;

import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.entity.CommonCardInfo;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p701vs.C45624a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.operation.lib.widgets.userstatus.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: UserStatusCloseDialogManager.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072#\b\u0002\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusCloseDialogManager;", "", "<init>", "()V", "createDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "data", "Lcom/kubi/operation/lib/entity/CommonCardInfo;", "onClose", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "neverShowAgain", "", "createDialog$OperationLib_googleRelease", "getExposeParams", "Lorg/json/JSONObject;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/widget/CheckBox;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserStatusCloseDialogManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UserStatusCloseDialogManager f37033a = new UserStatusCloseDialogManager();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final DialogFragmentHelper m43906e(@NotNull final CommonCardInfo data, @NotNull final Function1<? super Boolean, Unit> onClose) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.operation_dialog_user_status_close, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.operation.lib.widgets.userstatus.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UserStatusCloseDialogManager.m43907f(data, onClose, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m43907f(final CommonCardInfo commonCardInfo, final Function1 function1, BaseViewHolder viewHolder, final DialogFragmentHelper dialog) throws JSONException {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        final C45624a c45624aM100733a = C45624a.m100733a(viewHolder.itemView);
        Intrinsics.checkNotNullExpressionValue(c45624aM100733a, "bind(...)");
        dialog.m54191p3();
        AppCompatImageView ivClose = c45624aM100733a.f102762e;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusCloseDialogManager.m43908g(dialog, commonCardInfo, c45624aM100733a);
            }
        }, 1, null);
        KcSecondaryButton btnCancel = c45624aM100733a.f102759b;
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        C27046k.m66711z(btnCancel, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusCloseDialogManager.m43909h(dialog, commonCardInfo, c45624aM100733a);
            }
        }, 1, null);
        KcPrimaryButton btnClose = c45624aM100733a.f102760c;
        Intrinsics.checkNotNullExpressionValue(btnClose, "btnClose");
        C27046k.m66711z(btnClose, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusCloseDialogManager.m43910i(function1, c45624aM100733a, dialog, commonCardInfo);
            }
        }, 1, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", commonCardInfo.getBizId());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "guideCardCloseConfirmPop", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m43910i(Function1 function1, C45624a c45624a, DialogFragmentHelper dialogFragmentHelper, CommonCardInfo commonCardInfo) {
        function1.invoke(Boolean.valueOf(c45624a.f102761d.isChecked()));
        dialogFragmentHelper.dismiss();
        UserStatusCloseDialogManager userStatusCloseDialogManager = f37033a;
        AppCompatCheckBox cbNeverShowAgain = c45624a.f102761d;
        Intrinsics.checkNotNullExpressionValue(cbNeverShowAgain, "cbNeverShowAgain");
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "guideCardCloseConfirmPop", "closeBtn", userStatusCloseDialogManager.m43911j(commonCardInfo, cbNeverShowAgain));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public final JSONObject m43911j(CommonCardInfo commonCardInfo, CheckBox checkBox) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", commonCardInfo.getBizId());
        jSONObject.put("is_never_close", checkBox.isChecked() ? "1" : "0");
        jSONObject.put("norm_version", "1");
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m43908g(DialogFragmentHelper dialogFragmentHelper, CommonCardInfo commonCardInfo, C45624a c45624a) {
        dialogFragmentHelper.dismiss();
        UserStatusCloseDialogManager userStatusCloseDialogManager = f37033a;
        AppCompatCheckBox cbNeverShowAgain = c45624a.f102761d;
        Intrinsics.checkNotNullExpressionValue(cbNeverShowAgain, "cbNeverShowAgain");
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "guideCardCloseConfirmPop", "closeIcon", userStatusCloseDialogManager.m43911j(commonCardInfo, cbNeverShowAgain));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m43909h(DialogFragmentHelper dialogFragmentHelper, CommonCardInfo commonCardInfo, C45624a c45624a) {
        dialogFragmentHelper.dismiss();
        UserStatusCloseDialogManager userStatusCloseDialogManager = f37033a;
        AppCompatCheckBox cbNeverShowAgain = c45624a.f102761d;
        Intrinsics.checkNotNullExpressionValue(cbNeverShowAgain, "cbNeverShowAgain");
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "guideCardCloseConfirmPop", "cancelBtn", userStatusCloseDialogManager.m43911j(commonCardInfo, cbNeverShowAgain));
        return Unit.INSTANCE;
    }
}
