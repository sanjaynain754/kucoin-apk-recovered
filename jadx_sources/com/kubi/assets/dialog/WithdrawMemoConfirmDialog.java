package com.kubi.assets.dialog;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p637ta.C44911z4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: WithdrawMemoConfirmDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010$\u001a\u00020\fH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0018\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J\b\u0010(\u001a\u00020)H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u0014¨\u0006,"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawMemoConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentWithdrawMemoConfirmDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawMemoConfirmDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onConfirmCallback", "Lkotlin/Function0;", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function0;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function0;)V", "tip", "", "getTip", "()Ljava/lang/String;", "tip$delegate", "Lkotlin/Lazy;", "memo", "getMemo", "memo$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initUI", "initListener", "setClickSpan", "content", "isBottomSheet", "", "Companion", "MyClickableSpan", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawMemoConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawMemoConfirmDialog.kt\ncom/kubi/assets/dialog/WithdrawMemoConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,147:1\n143#2,20:148\n51#3,3:168\n*S KotlinDebug\n*F\n+ 1 WithdrawMemoConfirmDialog.kt\ncom/kubi/assets/dialog/WithdrawMemoConfirmDialog\n*L\n30#1:148,20\n72#1:168,3\n*E\n"})
public final class WithdrawMemoConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f16978r0;

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f16976v0 = {Reflection.property1(new PropertyReference1Impl(WithdrawMemoConfirmDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentWithdrawMemoConfirmDialogBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f16975u0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16977q0 = C45681e.m100799e(this, new Function1<WithdrawMemoConfirmDialog, C44911z4>() { // from class: com.kubi.assets.dialog.WithdrawMemoConfirmDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44911z4 invoke(@NotNull WithdrawMemoConfirmDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44911z4.m99346a(fragment.requireView());
        }
    }, new Function1<C44911z4, Unit>() { // from class: com.kubi.assets.dialog.WithdrawMemoConfirmDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44911z4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44911z4 c44911z4) {
            invoke(c44911z4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16979s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.u0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawMemoConfirmDialog.m16114z4(this.f17215b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f16980t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.v0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawMemoConfirmDialog.m16112w4(this.f17218b);
        }
    });

    /* JADX INFO: compiled from: WithdrawMemoConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawMemoConfirmDialog$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.WithdrawMemoConfirmDialog$a */
    /* JADX INFO: compiled from: WithdrawMemoConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawMemoConfirmDialog$MyClickableSpan;", "Landroid/text/style/ClickableSpan;", "activity", "Landroidx/fragment/app/FragmentActivity;", "color", "", "<init>", "(Landroidx/fragment/app/FragmentActivity;I)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getColor", "()I", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "onClick", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C9720a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        @NotNull
        public final FragmentActivity f16981b;

        /* JADX INFO: renamed from: c */
        public final int f16982c;

        public C9720a(@NotNull FragmentActivity activity, int i11) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f16981b = activity;
            this.f16982c = i11;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NotNull TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setColor(this.f16982c);
            ds2.setUnderlineText(false);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return false;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m16108s4(WithdrawMemoConfirmDialog withdrawMemoConfirmDialog) {
        C43852m.m96591c("B1withdrawPage", "memoConfirm", "3", null, 8, null);
        withdrawMemoConfirmDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m16109t4(WithdrawMemoConfirmDialog withdrawMemoConfirmDialog) {
        C43852m.m96591c("B1withdrawPage", "memoConfirm", "1", null, 8, null);
        withdrawMemoConfirmDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m16110u4(WithdrawMemoConfirmDialog withdrawMemoConfirmDialog) {
        C43852m.m96591c("B1withdrawPage", "memoConfirm", "2", null, 8, null);
        withdrawMemoConfirmDialog.dismissAllowingStateLoss();
        Function0<Unit> function0 = withdrawMemoConfirmDialog.f16978r0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    private final void m16111v4() {
        BaseTextView baseTextView;
        C43852m.m96595g("B1withdrawPage", "memoConfirm", "0", null, 8, null);
        if (!TextUtils.isEmpty(m16117q4())) {
            C44911z4 c44911z4M16115o4 = m16115o4();
            if (c44911z4M16115o4 == null || (baseTextView = c44911z4M16115o4.f101271e) == null) {
                return;
            }
            baseTextView.setText(m16117q4());
            return;
        }
        String strM16116p4 = m16116p4();
        if (strM16116p4 == null || TextUtils.isEmpty(strM16116p4)) {
            return;
        }
        String string = getString(R$string.asset_confirm_content, strM16116p4, strM16116p4);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m16113x4(string, strM16116p4);
    }

    /* JADX INFO: renamed from: x4 */
    private final void m16113x4(String str, String str2) {
        BaseTextView baseTextView;
        SpannableString spannableString = new SpannableString(str);
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) spannableString, str2, 0, true, 2, (Object) null);
        int length = str2.length();
        if (iLastIndexOf$default < 0) {
            length = str.length();
            iLastIndexOf$default = 0;
        }
        FragmentActivity activity = getActivity();
        spannableString.setSpan(activity != null ? new C9720a(activity, ContextCompat.getColor(activity, R$color.primary)) : null, iLastIndexOf$default, length + iLastIndexOf$default, 17);
        C44911z4 c44911z4M16115o4 = m16115o4();
        if (c44911z4M16115o4 == null || (baseTextView = c44911z4M16115o4.f101271e) == null) {
            return;
        }
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        baseTextView.setHighlightColor(0);
        baseTextView.setText(spannableString);
    }

    /* JADX INFO: renamed from: o4 */
    public final C44911z4 m16115o4() {
        return (C44911z4) this.f16977q0.getValue(this, f16976v0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kucoin_fragment_withdraw_memo_confirm_dialog, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16111v4();
        m16107r4();
    }

    @Nullable
    /* JADX INFO: renamed from: p4 */
    public final String m16116p4() {
        return (String) this.f16980t0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: q4 */
    public final String m16117q4() {
        return (String) this.f16979s0.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public final void m16118y4(@Nullable Function0<Unit> function0) {
        this.f16978r0 = function0;
    }

    /* JADX INFO: renamed from: r4 */
    private final void m16107r4() {
        RoundTextView roundTextView;
        RoundTextView roundTextView2;
        ImageView imageView;
        C44911z4 c44911z4M16115o4 = m16115o4();
        if (c44911z4M16115o4 != null && (imageView = c44911z4M16115o4.f101268b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.dialog.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawMemoConfirmDialog.m16108s4(this.f17201b);
                }
            }, 1, null);
        }
        C44911z4 c44911z4M16115o5 = m16115o4();
        if (c44911z4M16115o5 != null && (roundTextView2 = c44911z4M16115o5.f101273g) != null) {
            C27046k.m66711z(roundTextView2, 0L, new Function0() { // from class: com.kubi.assets.dialog.s0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawMemoConfirmDialog.m16109t4(this.f17209b);
                }
            }, 1, null);
        }
        C44911z4 c44911z4M16115o6 = m16115o4();
        if (c44911z4M16115o6 != null && (roundTextView = c44911z4M16115o6.f101270d) != null) {
            C27046k.m66711z(roundTextView, 0L, new Function0() { // from class: com.kubi.assets.dialog.t0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WithdrawMemoConfirmDialog.m16110u4(this.f17212b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public static final String m16112w4(WithdrawMemoConfirmDialog withdrawMemoConfirmDialog) {
        Bundle arguments = withdrawMemoConfirmDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: z4 */
    public static final String m16114z4(WithdrawMemoConfirmDialog withdrawMemoConfirmDialog) {
        Bundle arguments = withdrawMemoConfirmDialog.getArguments();
        if (arguments != null) {
            return arguments.getString("data");
        }
        return null;
    }
}
