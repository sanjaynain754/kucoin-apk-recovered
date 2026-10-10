package com.kubi.futures.share;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.futures.share.ModifyDisplayShareDialog;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.utils.Persistence;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import dm.C36741c1;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ModifyDisplayShareDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/futures/share/ModifyDisplayShareDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "getParams", "()Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "params$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;", "getBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "dismissAllowingStateLoss", "onStart", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nModifyDisplayShareDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyDisplayShareDialog.kt\ncom/kubi/futures/share/ModifyDisplayShareDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,159:1\n143#2,20:160\n*S KotlinDebug\n*F\n+ 1 ModifyDisplayShareDialog.kt\ncom/kubi/futures/share/ModifyDisplayShareDialog\n*L\n55#1:160,20\n*E\n"})
public final class ModifyDisplayShareDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f23597q0 = LazyKt.lazy(new Function0() { // from class: gi.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModifyDisplayShareDialog.m26522z4(this.f85330b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f23598r0 = C45681e.m100799e(this, new Function1<ModifyDisplayShareDialog, C36741c1>() { // from class: com.kubi.futures.share.ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36741c1 invoke(@NotNull ModifyDisplayShareDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36741c1.m82333a(fragment.requireView());
        }
    }, new Function1<C36741c1, Unit>() { // from class: com.kubi.futures.share.ModifyDisplayShareDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36741c1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36741c1 c36741c1) {
            invoke(c36741c1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f23595t0 = {Reflection.property1(new PropertyReference1Impl(ModifyDisplayShareDialog.class, "binding", "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogSelectShareDisplayInfoBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f23594s0 = new Companion(null);

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final String f23596u0 = "ModifyDisplayShareDialog";

    /* JADX INFO: compiled from: ModifyDisplayShareDialog.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/futures/share/ModifyDisplayShareDialog$Companion;", "", "<init>", "()V", "Key", "", "getKey", "()Ljava/lang/String;", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", "param", "Lcom/kubi/futures/share/BasePositionShare$ShareParam;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull BasePositionShare.ShareParam param) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(param, "param");
            ModifyDisplayShareDialog modifyDisplayShareDialog = new ModifyDisplayShareDialog();
            modifyDisplayShareDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("data", param), TuplesKt.m90091to("type", 5)));
            modifyDisplayShareDialog.show(manager, "ModifyDisplayShareDialog");
        }

        @NotNull
        public final String getKey() {
            return ModifyDisplayShareDialog.f23596u0;
        }
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m26516t4(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m26517u4(C36741c1 c36741c1, ModifyDisplayShareDialog modifyDisplayShareDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Persistence persistence = Persistence.f30799a;
        persistence.m36519f("contract_share_show_user", c36741c1.f79804d.isChecked());
        persistence.m36519f("contract_share_show_pnl", c36741c1.f79803c.isChecked());
        modifyDisplayShareDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m26518v4(C36741c1 c36741c1, CompoundButton compoundButton, boolean z11) {
        Group userInfo = c36741c1.f79805e.f80351z;
        Intrinsics.checkNotNullExpressionValue(userInfo, "userInfo");
        C27046k.m66684G(userInfo, z11);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m26519w4(C36741c1 c36741c1, CompoundButton compoundButton, boolean z11) {
        AppCompatTextView pnl = c36741c1.f79805e.f80341p;
        Intrinsics.checkNotNullExpressionValue(pnl, "pnl");
        C27046k.m66684G(pnl, z11);
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m26520x4(ModifyDisplayShareDialog modifyDisplayShareDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        modifyDisplayShareDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public static final Unit m26521y4(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_select_share_display_info, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BasePositionShare.ShareParam shareParamM26524s4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C36741c1 c36741c1M26523r4 = m26523r4();
        if (c36741c1M26523r4 == null || (shareParamM26524s4 = m26524s4()) == null) {
            return;
        }
        c36741c1M26523r4.f79805e.f80346u.setText(shareParamM26524s4.formatSymbol());
        c36741c1M26523r4.f79805e.f80345t.setText(shareParamM26524s4.formatSide());
        c36741c1M26523r4.f79805e.f80332g.setText(shareParamM26524s4.formatLeverage());
        c36741c1M26523r4.f79805e.f80341p.setText(shareParamM26524s4.formatPnl());
        AppCompatTextView appCompatTextView = c36741c1M26523r4.f79805e.f80340o;
        appCompatTextView.setText(shareParamM26524s4.formatRoi());
        Intrinsics.checkNotNull(appCompatTextView);
        CharSequence roi = shareParamM26524s4.formatRoi();
        C27046k.m66684G(appCompatTextView, !(roi == null || roi.length() == 0));
        AppCompatTextView appCompatTextView2 = c36741c1M26523r4.f79805e.f80338m;
        appCompatTextView2.setText(C27041f.m66668h(shareParamM26524s4.formatOpenPrice()));
        Intrinsics.checkNotNull(appCompatTextView2);
        String openPrice = shareParamM26524s4.formatOpenPrice();
        C27046k.m66684G(appCompatTextView2, !(openPrice == null || openPrice.length() == 0));
        AppCompatTextView appCompatTextView3 = c36741c1M26523r4.f79805e.f80339n;
        appCompatTextView3.setText(getString(R$string.kumex_pnl_avg_open_price));
        Intrinsics.checkNotNull(appCompatTextView3);
        String openPrice2 = shareParamM26524s4.formatOpenPrice();
        C27046k.m66684G(appCompatTextView3, !(openPrice2 == null || openPrice2.length() == 0));
        AppCompatTextView appCompatTextView4 = c36741c1M26523r4.f79805e.f80336k;
        appCompatTextView4.setText(C27041f.m66668h(shareParamM26524s4.formatLatestPrice()));
        Intrinsics.checkNotNull(appCompatTextView4);
        String latestPrice = shareParamM26524s4.formatLatestPrice();
        C27046k.m66684G(appCompatTextView4, !(latestPrice == null || latestPrice.length() == 0));
        AppCompatTextView appCompatTextView5 = c36741c1M26523r4.f79805e.f80337l;
        appCompatTextView5.setText(getString(shareParamM26524s4.getIsPnl() ? R$string.kumex_pnl_avg_close_price : R$string.last_price));
        Intrinsics.checkNotNull(appCompatTextView5);
        String latestPrice2 = shareParamM26524s4.formatLatestPrice();
        C27046k.m66684G(appCompatTextView5, !(latestPrice2 == null || latestPrice2.length() == 0));
        ShapeTextView label = c36741c1M26523r4.f79805e.f80331f;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        C27046k.m66684G(label, shareParamM26524s4.getIsTrial());
        View line1 = c36741c1M26523r4.f79805e.f80334i;
        Intrinsics.checkNotNullExpressionValue(line1, "line1");
        C27046k.m66684G(line1, shareParamM26524s4.getIsTrial());
        if (shareParamM26524s4.getIsTrial()) {
            c36741c1M26523r4.f79805e.f80331f.setText(C27092t0.m66896a(shareParamM26524s4.getPrizeType()));
        }
        c36741c1M26523r4.f79805e.f80349x.setText(shareParamM26524s4.formatTimeDisplay());
        c36741c1M26523r4.f79805e.f80329d.setBackgroundResource(shareParamM26524s4.getBackgroundRes());
        c36741c1M26523r4.f79805e.f80347v.setText(shareParamM26524s4.getHeadName());
        c36741c1M26523r4.f79805e.f80348w.setText(shareParamM26524s4.getNickName());
        BaseTextView baseTextView = c36741c1M26523r4.f79805e.f80350y;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("VIP Lv.%s", Arrays.copyOf(new Object[]{Integer.valueOf(UserInfo.c().getFeeLevel())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
        BaseTextView baseTextView2 = c36741c1M26523r4.f79805e.f80342q;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        baseTextView2.setText(shareParamM26524s4.formatReferralCode(contextRequireContext));
        c36741c1M26523r4.f79805e.f80343r.setImageBitmap(shareParamM26524s4.getShareCodeBitmap());
        Group userInfo = c36741c1M26523r4.f79805e.f80351z;
        Intrinsics.checkNotNullExpressionValue(userInfo, "userInfo");
        C27046k.m66684G(userInfo, shareParamM26524s4.getShowUserInfo());
        AppCompatTextView pnl = c36741c1M26523r4.f79805e.f80341p;
        Intrinsics.checkNotNullExpressionValue(pnl, "pnl");
        C27046k.m66684G(pnl, shareParamM26524s4.getShowPnl());
        int iM6180b = C5267e0.m6180b() - C27029c.m66603f(this, 48);
        ConstraintLayout root = c36741c1M26523r4.f79805e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.m66569A(root, iM6180b, (int) ((iM6180b * 1686) / 1125.0f));
        c36741c1M26523r4.f79804d.setChecked(shareParamM26524s4.getShowUserInfo());
        c36741c1M26523r4.f79803c.setChecked(shareParamM26524s4.getShowPnl());
        boolean z11 = !shareParamM26524s4.getIsPnl() || shareParamM26524s4.hasLeverage();
        AppCompatTextView leverage = c36741c1M26523r4.f79805e.f80332g;
        Intrinsics.checkNotNullExpressionValue(leverage, "leverage");
        C27046k.m66684G(leverage, z11);
        View line = c36741c1M26523r4.f79805e.f80333h;
        Intrinsics.checkNotNullExpressionValue(line, "line");
        C27046k.m66684G(line, z11);
        c36741c1M26523r4.f79804d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gi.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                ModifyDisplayShareDialog.m26518v4(c36741c1M26523r4, compoundButton, z12);
            }
        });
        c36741c1M26523r4.f79803c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gi.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                ModifyDisplayShareDialog.m26519w4(c36741c1M26523r4, compoundButton, z12);
            }
        });
        LinearLayoutCompat root2 = c36741c1M26523r4.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        ViewExtKt.m66575f(root2, new Function1() { // from class: gi.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyDisplayShareDialog.m26520x4(this.f85333b, (View) obj);
            }
        });
        ConstraintLayout root3 = c36741c1M26523r4.f79805e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        ViewExtKt.m66575f(root3, new Function1() { // from class: gi.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyDisplayShareDialog.m26521y4((View) obj);
            }
        });
        LinearLayoutCompat bottomSheet = c36741c1M26523r4.f79802b;
        Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
        ViewExtKt.m66575f(bottomSheet, new Function1() { // from class: gi.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyDisplayShareDialog.m26516t4((View) obj);
            }
        });
        KcPrimaryButton tvOk = c36741c1M26523r4.f79807g;
        Intrinsics.checkNotNullExpressionValue(tvOk, "tvOk");
        ViewExtKt.m66575f(tvOk, new Function1() { // from class: gi.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModifyDisplayShareDialog.m26517u4(c36741c1M26523r4, this, (View) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r4 */
    public final C36741c1 m26523r4() {
        return (C36741c1) this.f23598r0.getValue(this, f23595t0[0]);
    }

    /* JADX INFO: renamed from: s4 */
    public final BasePositionShare.ShareParam m26524s4() {
        return (BasePositionShare.ShareParam) this.f23597q0.getValue();
    }

    /* JADX INFO: renamed from: z4 */
    public static final BasePositionShare.ShareParam m26522z4(ModifyDisplayShareDialog modifyDisplayShareDialog) {
        Bundle arguments = modifyDisplayShareDialog.getArguments();
        if (arguments != null) {
            return (BasePositionShare.ShareParam) arguments.getParcelable("data");
        }
        return null;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        BasePositionShare.ShareParam shareParamM26524s4 = m26524s4();
        if (shareParamM26524s4 != null) {
            Persistence persistence = Persistence.f30799a;
            shareParamM26524s4.setShowUserInfo(persistence.m36516a("contract_share_show_user", true));
            shareParamM26524s4.setShowPnl(persistence.m36516a("contract_share_show_pnl", true));
            getParentFragmentManager().setFragmentResult(f23596u0, BundleKt.bundleOf(TuplesKt.m90091to("data", shareParamM26524s4)));
        }
        super.dismissAllowingStateLoss();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.7f);
        }
    }
}
