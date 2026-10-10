package com.kubi.assets.holdearn;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.assets.R$layout;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44737c0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: compiled from: HoldEarnOpenConfirmDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenConfirmBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onOpenClicked", "Lkotlin/Function0;", "", "getOnOpenClicked", "()Lkotlin/jvm/functions/Function0;", "setOnOpenClicked", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "setOnOpenClick", "click", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHoldEarnOpenConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoldEarnOpenConfirmDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,85:1\n143#2,20:86\n*S KotlinDebug\n*F\n+ 1 HoldEarnOpenConfirmDialog.kt\ncom/kubi/assets/holdearn/HoldEarnOpenConfirmDialog\n*L\n39#1:86,20\n*E\n"})
public final class HoldEarnOpenConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f17722q0 = C45681e.m100799e(this, new Function1<HoldEarnOpenConfirmDialog, C44737c0>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenConfirmDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44737c0 invoke(@NotNull HoldEarnOpenConfirmDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44737c0.m98984a(fragment.requireView());
        }
    }, new Function1<C44737c0, Unit>() { // from class: com.kubi.assets.holdearn.HoldEarnOpenConfirmDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44737c0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44737c0 c44737c0) {
            invoke(c44737c0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f17723r0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f17721t0 = {Reflection.property1(new PropertyReference1Impl(HoldEarnOpenConfirmDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogHoldEarnOpenConfirmBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f17720s0 = new Companion(null);

    /* JADX INFO: compiled from: HoldEarnOpenConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/holdearn/HoldEarnOpenConfirmDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/holdearn/HoldEarnOpenConfirmDialog;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final HoldEarnOpenConfirmDialog create() {
            HoldEarnOpenConfirmDialog holdEarnOpenConfirmDialog = new HoldEarnOpenConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            holdEarnOpenConfirmDialog.setArguments(bundle);
            return holdEarnOpenConfirmDialog;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m17337r4(HoldEarnOpenConfirmDialog holdEarnOpenConfirmDialog) {
        Function0<Unit> function0 = holdEarnOpenConfirmDialog.f17723r0;
        if (function0 != null) {
            function0.invoke();
        }
        holdEarnOpenConfirmDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final Unit m17338s4(BaseTextView baseTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final void m17339t4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HoldEarnOpenDialog.f17726y0.getPROTOCOL_URL(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: n4 */
    public final C44737c0 m17340n4() {
        return (C44737c0) this.f17722q0.getValue(this, f17721t0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: o4 */
    public final HoldEarnOpenConfirmDialog m17341o4(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.f17723r0 = click;
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_hold_earn_open_confirm, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m17335p4();
    }

    /* JADX INFO: renamed from: p4 */
    private final void m17335p4() {
        C44737c0 c44737c0M17340n4 = m17340n4();
        if (c44737c0M17340n4 != null) {
            ImageView ivClose = c44737c0M17340n4.f99659d;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.holdearn.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenConfirmDialog.m17336q4(this.f17750b);
                }
            }, 1, null);
            KcPrimaryButton btnOpen = c44737c0M17340n4.f99658c;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.holdearn.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HoldEarnOpenConfirmDialog.m17337r4(this.f17751b);
                }
            }, 1, null);
            final BaseTextView baseTextView = c44737c0M17340n4.f99662g;
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(baseTextView);
            highlightTextHelper.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.holdearn.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HoldEarnOpenConfirmDialog.m17338s4(baseTextView, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.holdearn.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HoldEarnOpenConfirmDialog.m17339t4(view);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m17336q4(HoldEarnOpenConfirmDialog holdEarnOpenConfirmDialog) {
        holdEarnOpenConfirmDialog.dismiss();
        return Unit.INSTANCE;
    }
}
