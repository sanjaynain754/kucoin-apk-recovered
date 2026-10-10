package com.kubi.mine.lib.manger;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.mine.R$string;
import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import com.kubi.mine.lib.entity.Remark;
import com.kubi.mine.lib.view.MaxHeightNestedScrollView;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p538pq.C43522b;
import p694vk.AbstractC45585n0;
import p694vk.C45591t;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.mine.lib.manger.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AppUpgradeDialogMangerV2.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/mine/lib/manger/AppUpgradeDialogMangerV2;", "", "<init>", "()V", "creadDialog", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "appUpgradeType", "Lcom/kubi/kucoin/UpgradeType;", "upgradeInfo", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "creadDialog$MineLib_googleRelease", "upgradeDialogTrackExClick", "", "clickType", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AppUpgradeDialogMangerV2 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppUpgradeDialogMangerV2 f35102a = new AppUpgradeDialogMangerV2();

    /* JADX INFO: renamed from: e */
    public static final Unit m41747e(final AppUpgradeEntityV2 appUpgradeEntityV2, final AbstractC45585n0 abstractC45585n0, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        BaseApplication.Companion companion = BaseApplication.INSTANCE;
        Resources resources = companion.get().getResources();
        ((MaxHeightNestedScrollView) viewHolder.getView(R$id.scrollViewLayout)).setMaxScrollViewHeight((int) C27025c.m66565c(companion.get(), 200));
        TextView textView = (TextView) viewHolder.getView(R$id.tv_title);
        Remark remark = appUpgradeEntityV2.getRemark();
        if (remark == null || (string = remark.getTitle()) == null) {
            string = resources.getString(R$string.dialog_appupgrade_title_tiptext);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView.setText(string);
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_version);
        Remark remark2 = appUpgradeEntityV2.getRemark();
        textView2.setText(remark2 != null ? remark2.getVersion() : null);
        int i11 = R$id.tv_upgradeText;
        TextView textView3 = (TextView) viewHolder.getView(i11);
        Remark remark3 = appUpgradeEntityV2.getRemark();
        if (remark3 == null || (string2 = remark3.getContent()) == null) {
            string2 = resources.getString(R$string.dialog_appupgrade_content_text);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        textView3.setText(string2);
        if (StringsKt.equals("ja_JP", MultiLanguageManager.f46811g.getLocalString(), false)) {
            ((TextView) viewHolder.getView(i11)).setLineSpacing(C27025c.m66564b(companion.get(), 2.0f), 1.0f);
        } else {
            ((TextView) viewHolder.getView(i11)).setLineSpacing(C27025c.m66565c(companion.get(), 5), 1.0f);
        }
        dialogFragmentHelper.m54191p3();
        if (appUpgradeEntityV2.getUpgradeType() == 1) {
            viewHolder.getView(R$id.but_close).setVisibility(8);
        } else {
            viewHolder.getView(R$id.but_close).setVisibility(0);
        }
        View view = viewHolder.getView(R$id.but_close);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.mine.lib.manger.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpgradeDialogMangerV2.m41748f(appUpgradeEntityV2, abstractC45585n0, dialogFragmentHelper);
            }
        }, 1, null);
        View view2 = viewHolder.getView(R$id.but_upgrade);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.mine.lib.manger.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpgradeDialogMangerV2.m41749g(appUpgradeEntityV2, dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m41748f(AppUpgradeEntityV2 appUpgradeEntityV2, AbstractC45585n0 abstractC45585n0, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        f35102a.m41751h(appUpgradeEntityV2, 2);
        C45591t.f102713a.m100681a("appUpgradeDialog-Dialog_onClick-close " + abstractC45585n0);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m41749g(AppUpgradeEntityV2 appUpgradeEntityV2, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        C43522b.f96058a.m95773d(appUpgradeEntityV2);
        f35102a.m41751h(appUpgradeEntityV2, 1);
        if (appUpgradeEntityV2.getUpgradeType() != 1) {
            dialogFragmentHelper.dismiss();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final DialogFragmentHelper m41750d(@NotNull final AbstractC45585n0 appUpgradeType, @NotNull final AppUpgradeEntityV2 upgradeInfo) {
        Intrinsics.checkNotNullParameter(appUpgradeType, "appUpgradeType");
        Intrinsics.checkNotNullParameter(upgradeInfo, "upgradeInfo");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.kucoin_dialog_appupgrade_new, 4, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.mine.lib.manger.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppUpgradeDialogMangerV2.m41747e(upgradeInfo, appUpgradeType, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m41751h(AppUpgradeEntityV2 appUpgradeEntityV2, int i11) throws JSONException {
        String strValueOf = String.valueOf(C27039d.m66650j(Integer.valueOf(i11)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", appUpgradeEntityV2.getUpgradeType());
        jSONObject.put("token_id", appUpgradeEntityV2.getPopupId());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "upgrade", strValueOf, jSONObject);
    }
}
