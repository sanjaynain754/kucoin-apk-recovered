package com.kubi.home.main;

import android.view.View;
import com.bumptech.glide.C5313g;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$mipmap;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.round.widget.RoundImageView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import dj.C36716a;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p048c2.C4781a0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.main.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HomeImageAlertDialog.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/home/main/HomeImageAlertDialog;", "", "<init>", "()V", "instance", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "imageUrl", "", "jumpUrl", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "Lkotlin/Function0;", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HomeImageAlertDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeImageAlertDialog f25828a = new HomeImageAlertDialog();

    /* JADX INFO: renamed from: g */
    public static final Unit m29497g(Function0 function0, final String str, final String str2, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        function0.invoke();
        final RoundImageView roundImageView = (RoundImageView) viewHolder.getView(R$id.ivBg);
        if (roundImageView != null) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.main.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeImageAlertDialog.m29498h(roundImageView, str);
                }
            });
            C27046k.m66711z(roundImageView, 0L, new Function0() { // from class: com.kubi.home.main.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeImageAlertDialog.m29499i(str2, dialogFragmentHelper);
                }
            }, 1, null);
        }
        View view = viewHolder.getView(R$id.ivClose);
        if (view != null) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.home.main.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeImageAlertDialog.m29500j(dialogFragmentHelper);
                }
            }, 1, null);
        }
        View view2 = viewHolder.getView(R$id.container);
        if (view2 != null) {
            C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.home.main.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HomeImageAlertDialog.m29501k(dialogFragmentHelper);
                }
            }, 1, null);
        }
        C36716a.m82245h(HomeCardViewHolderProxy.PAGE_ID, "rewardshubDialog", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final DialogFragmentHelper m29502f(@NotNull final String imageUrl, @NotNull final String jumpUrl, @NotNull final Function0<Unit> onShow) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        return DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.home_dialog_image_alert, 6, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.home.main.s
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return HomeImageAlertDialog.m29497g(onShow, imageUrl, jumpUrl, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m29498h(RoundImageView roundImageView, String str) {
        C5313g c5313gMo92213o0 = ComponentCallbacks2C5309c.m6557u(roundImageView).mo6634v(str).mo92213o0(new C4781a0(C27040e.m66658b(16)));
        int i11 = R$mipmap.bg_error_free_style;
        c5313gMo92213o0.mo92188b0(i11).mo92208m(i11).mo92186a0(C27040e.m66658b(300), C27040e.m66658b(373)).m6594E0(roundImageView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m29499i(String str, DialogFragmentHelper dialogFragmentHelper) {
        RouteExKt.m56217H(str);
        dialogFragmentHelper.dismiss();
        C36716a.m82243f(HomeCardViewHolderProxy.PAGE_ID, "rewardshubDialog", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m29500j(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m29501k(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }
}
