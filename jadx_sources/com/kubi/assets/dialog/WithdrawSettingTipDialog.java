package com.kubi.assets.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44895x2;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawSettingTipDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020!J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010#\u001a\u00020!J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010$\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020!R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawSettingTipDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "title", "", "message", "tip", "positiveBtnClick", "Lkotlin/Function0;", "", "negativeBtnClick", "binding", "Lcom/kubi/assets/databinding/AssetWithdrawSettingTipDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetWithdrawSettingTipDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setPositiveBtnClick", "click", "setNegativeBtnClick", "setTitle", "titleId", "", "setMessage", "messageId", "setTipText", "tipId", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawSettingTipDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawSettingTipDialog.kt\ncom/kubi/assets/dialog/WithdrawSettingTipDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,103:1\n143#2,20:104\n*S KotlinDebug\n*F\n+ 1 WithdrawSettingTipDialog.kt\ncom/kubi/assets/dialog/WithdrawSettingTipDialog\n*L\n37#1:104,20\n*E\n"})
public final class WithdrawSettingTipDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public String f17007q0;

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public String f17008r0;

    /* JADX INFO: renamed from: s0 */
    @Nullable
    public String f17009s0;

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function0<Unit> f17010t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function0<Unit> f17011u0;

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final InterfaceC24293a f17012v0 = C45681e.m100799e(this, new Function1<WithdrawSettingTipDialog, C44895x2>() { // from class: com.kubi.assets.dialog.WithdrawSettingTipDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44895x2 invoke(@NotNull WithdrawSettingTipDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44895x2.m99314a(fragment.requireView());
        }
    }, new Function1<C44895x2, Unit>() { // from class: com.kubi.assets.dialog.WithdrawSettingTipDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44895x2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44895x2 c44895x2) {
            invoke(c44895x2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f17006x0 = {Reflection.property1(new PropertyReference1Impl(WithdrawSettingTipDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetWithdrawSettingTipDialogBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f17005w0 = new Companion(null);

    /* JADX INFO: compiled from: WithdrawSettingTipDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawSettingTipDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/dialog/WithdrawSettingTipDialog;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WithdrawSettingTipDialog create() {
            WithdrawSettingTipDialog withdrawSettingTipDialog = new WithdrawSettingTipDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            withdrawSettingTipDialog.setArguments(bundle);
            return withdrawSettingTipDialog;
        }
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m16176m4(WithdrawSettingTipDialog withdrawSettingTipDialog, View view) {
        Function0<Unit> function0 = withdrawSettingTipDialog.f17010t0;
        if (function0 != null) {
            function0.invoke();
        }
        withdrawSettingTipDialog.dismiss();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m16177n4(WithdrawSettingTipDialog withdrawSettingTipDialog, View view) {
        Function0<Unit> function0 = withdrawSettingTipDialog.f17011u0;
        if (function0 != null) {
            function0.invoke();
        }
        withdrawSettingTipDialog.dismiss();
    }

    /* JADX INFO: renamed from: l4 */
    public final C44895x2 m16178l4() {
        return (C44895x2) this.f17012v0.getValue(this, f17006x0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: o4 */
    public final WithdrawSettingTipDialog m16179o4(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f17008r0 = message;
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return getLayoutInflater().inflate(R$layout.asset_withdraw_setting_tip_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44895x2 c44895x2M16178l4 = m16178l4();
        if (c44895x2M16178l4 != null) {
            c44895x2M16178l4.f101130j.setText(this.f17007q0);
            c44895x2M16178l4.f101126f.setText(this.f17008r0);
            c44895x2M16178l4.f101129i.setText(this.f17009s0);
            c44895x2M16178l4.f101128h.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.m1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WithdrawSettingTipDialog.m16176m4(this.f17137b, view2);
                }
            });
            c44895x2M16178l4.f101127g.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WithdrawSettingTipDialog.m16177n4(this.f17141b, view2);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p4 */
    public final WithdrawSettingTipDialog m16180p4(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.f17011u0 = click;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: q4 */
    public final WithdrawSettingTipDialog m16181q4(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.f17010t0 = click;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: r4 */
    public final WithdrawSettingTipDialog m16182r4(@NotNull String tip) {
        Intrinsics.checkNotNullParameter(tip, "tip");
        this.f17009s0 = tip;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: s4 */
    public final WithdrawSettingTipDialog m16183s4(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f17007q0 = title;
        return this;
    }
}
