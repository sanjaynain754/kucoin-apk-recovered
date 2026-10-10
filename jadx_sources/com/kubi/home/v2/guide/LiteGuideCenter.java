package com.kubi.home.v2.guide;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import bw.C4719f0;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.R$string;
import com.kubi.host.HostManager;
import com.kubi.lite.api.ILiteService;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.config.LiteConfigManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import ir.C40167b;
import ir.InterfaceC40166a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import sj.C44510a;
import tz.C45079a;
import y70.C46392a;

/* JADX INFO: renamed from: com.kubi.home.v2.guide.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: LiteGuideCenter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J\b\u0010\u0013\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/home/v2/guide/LiteGuideCenter;", "", "<init>", "()V", "DIALOG_TAG", "", "LEARN_MORE_URL", "getLEARN_MORE_URL", "()Ljava/lang/String;", "LEARN_MORE_URL$delegate", "Lcom/kubi/network/api/utils/Link;", "showLiteBottomSheet", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onShowed", "Lkotlin/Function0;", "goLearnMore", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteGuideCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteGuideCenter.kt\ncom/kubi/home/v2/guide/LiteGuideCenter\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,105:1\n126#2,2:106\n136#2:108\n136#2:109\n126#2,2:110\n*S KotlinDebug\n*F\n+ 1 LiteGuideCenter.kt\ncom/kubi/home/v2/guide/LiteGuideCenter\n*L\n90#1:106,2\n51#1:108\n55#1:109\n93#1:110,2\n*E\n"})
public final class LiteGuideCenter {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty<Object>[] f26576b = {Reflection.property1(new PropertyReference1Impl(LiteGuideCenter.class, "LEARN_MORE_URL", "getLEARN_MORE_URL()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final LiteGuideCenter f26575a = new LiteGuideCenter();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC40166a f26577c = C40167b.m88525a(new Function0() { // from class: com.kubi.home.v2.guide.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteGuideCenter.m30929i();
        }
    });

    /* JADX INFO: renamed from: i */
    public static final String m30929i() {
        return HostManager.a.m() + "/support/preview/48142946141381?appNeedLang=true";
    }

    /* JADX INFO: renamed from: m */
    public static final void m30930m(final BaseFragment baseFragment, Function0 function0) {
        if (!ILiteService.f32003a.get().mo37530a()) {
            C44128b.m97266j("LiteGuideCenter", "checkAndShowLiteGuideDialog: lite is closed");
            return;
        }
        if (UserInfo.a.d() == UserInfo.LoginState.Login && !LiteConfigManager.f47070a.m57261e()) {
            C44128b.m97266j("LiteGuideCenter", "checkAndShowLiteGuideDialog: login and popupEnabled is false");
            return;
        }
        if (C46392a.m102322d(C45079a.f101482a.m99687a(), false)) {
            C44128b.m97266j("LiteGuideCenter", "checkAndShowLiteGuideDialog: entryLite");
            return;
        }
        C44510a c44510a = C44510a.f98560a;
        if (C46392a.m102322d(c44510a.m98478d(), false)) {
            C44128b.m97266j("LiteGuideCenter", "checkAndShowLiteGuideDialog: have show");
            return;
        }
        C27023a.m66557d("B1LitePromotionalPopup", "page", null, null, 12, null);
        final BaseDialogFragment baseDialogFragmentM54192r3 = DialogFragmentHelper.f43568p0.newInstance(R$layout.home_widget_lite_bottom_sheet, true).m54237f4(new Function2() { // from class: com.kubi.home.v2.guide.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LiteGuideCenter.m30931n(baseFragment, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.home.v2.guide.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LiteGuideCenter.m30935r(dialogInterface);
            }
        });
        if (!baseFragment.isShowing()) {
            C27100x0.m66923d(new Function0() { // from class: com.kubi.home.v2.guide.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LiteGuideCenter.m30936s(baseDialogFragmentM54192r3);
                }
            });
            return;
        }
        C46392a.m102328k(c44510a.m98478d(), true);
        C4719f0 c4719f0 = C4719f0.f4716a;
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c4719f0.m4771g(baseDialogFragmentM54192r3, childFragmentManager, "LiteGuideCenter", 20);
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m30931n(BaseFragment baseFragment, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        if (UserInfo.a.d() == UserInfo.LoginState.Login) {
            viewHolder.setText(R$id.tvContent, baseFragment.getString(R$string.lite_mode_dialog_detail));
        }
        View viewFindViewById = viewHolder.itemView.findViewById(R$id.tvBtnOk);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.home.v2.guide.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiteGuideCenter.m30932o(dialogFragmentHelper);
            }
        }, 1, null);
        View viewFindViewById2 = viewHolder.itemView.findViewById(R$id.tvBtnCancel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.home.v2.guide.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiteGuideCenter.m30933p(dialogFragmentHelper);
            }
        }, 1, null);
        View viewFindViewById3 = viewHolder.itemView.findViewById(R$id.tvMore);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        C27046k.m66711z(viewFindViewById3, 0L, new Function0() { // from class: com.kubi.home.v2.guide.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LiteGuideCenter.m30934q(dialogFragmentHelper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m30935r(DialogInterface dialogInterface) {
        C46392a.m102328k(C44510a.f98560a.m98478d(), true);
    }

    /* JADX INFO: renamed from: j */
    public final String m30937j() {
        return (String) f26577c.getValue(this, f26576b[0]);
    }

    /* JADX INFO: renamed from: k */
    public final void m30938k() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, m30937j(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m30939l(@NotNull final BaseFragment fragment, @NotNull View view, @NotNull final Function0<Unit> onShowed) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onShowed, "onShowed");
        C22912t.m54417o(view, new Runnable() { // from class: com.kubi.home.v2.guide.b
            @Override // java.lang.Runnable
            public final void run() {
                LiteGuideCenter.m30930m(fragment, onShowed);
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30932o(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        Bundle bundle = new Bundle();
        bundle.putString("flutterInitialRoute", "lite/home?showBackTip=true");
        AppMode.Companion companion = AppMode.INSTANCE;
        bundle.putString("from", companion.getCurrentBizMode(AppMode.Pro).name());
        companion.updateCurrentMode(AppMode.Lite);
        ILiteService.m37529d(ILiteService.f32003a.get(), bundle, false, false, 4, null);
        C27023a.m66555b("B1LitePromotionalPopup", "enterLiteVersion", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30933p(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        C27023a.m66555b("B1LitePromotionalPopup", "stayProVersion", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m30934q(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismissAllowingStateLoss();
        f26575a.m30938k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m30936s(BaseDialogFragment baseDialogFragment) {
        if (baseDialogFragment.isAdded()) {
            baseDialogFragment.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
