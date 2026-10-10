package com.kubi.assets.autoearn;

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
import p637ta.C44857s;
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

/* JADX INFO: compiled from: AutoEarnOpenConfirmDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenConfirmDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenConfirmBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onOpenClicked", "Lkotlin/Function0;", "", "getOnOpenClicked", "()Lkotlin/jvm/functions/Function0;", "setOnOpenClicked", "(Lkotlin/jvm/functions/Function0;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "setOnOpenClick", "click", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAutoEarnOpenConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoEarnOpenConfirmDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,83:1\n143#2,20:84\n*S KotlinDebug\n*F\n+ 1 AutoEarnOpenConfirmDialog.kt\ncom/kubi/assets/autoearn/AutoEarnOpenConfirmDialog\n*L\n37#1:84,20\n*E\n"})
public final class AutoEarnOpenConfirmDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16552q0 = C45681e.m100799e(this, new Function1<AutoEarnOpenConfirmDialog, C44857s>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenConfirmDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44857s invoke(@NotNull AutoEarnOpenConfirmDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44857s.m99238a(fragment.requireView());
        }
    }, new Function1<C44857s, Unit>() { // from class: com.kubi.assets.autoearn.AutoEarnOpenConfirmDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44857s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44857s c44857s) {
            invoke(c44857s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @Nullable
    public Function0<Unit> f16553r0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f16551t0 = {Reflection.property1(new PropertyReference1Impl(AutoEarnOpenConfirmDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogAutoEarnOpenConfirmBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f16550s0 = new Companion(null);

    /* JADX INFO: compiled from: AutoEarnOpenConfirmDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/autoearn/AutoEarnOpenConfirmDialog$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/assets/autoearn/AutoEarnOpenConfirmDialog;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final AutoEarnOpenConfirmDialog create() {
            AutoEarnOpenConfirmDialog autoEarnOpenConfirmDialog = new AutoEarnOpenConfirmDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("type", 4);
            bundle.putBoolean("isAnimationEnabled", true);
            autoEarnOpenConfirmDialog.setArguments(bundle);
            return autoEarnOpenConfirmDialog;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m15383r4(AutoEarnOpenConfirmDialog autoEarnOpenConfirmDialog) {
        Function0<Unit> function0 = autoEarnOpenConfirmDialog.f16553r0;
        if (function0 != null) {
            function0.invoke();
        }
        autoEarnOpenConfirmDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m15384s4(BaseTextView baseTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium));
        ds2.setColor(ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final void m15385t4(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, AutoEarnOpenDialog.f16556x0.getAUTO_EARN_PROTOCOL_URL(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: n4 */
    public final C44857s m15386n4() {
        return (C44857s) this.f16552q0.getValue(this, f16551t0[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: o4 */
    public final AutoEarnOpenConfirmDialog m15387o4(@NotNull Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        this.f16553r0 = click;
        return this;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_auto_earn_open_confirm, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m15388p4();
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m15382q4(AutoEarnOpenConfirmDialog autoEarnOpenConfirmDialog) {
        autoEarnOpenConfirmDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m15388p4() {
        C44857s c44857sM15386n4 = m15386n4();
        if (c44857sM15386n4 != null) {
            ImageView ivClose = c44857sM15386n4.f100757d;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.assets.autoearn.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenConfirmDialog.m15382q4(this.f16580b);
                }
            }, 1, null);
            KcPrimaryButton btnOpen = c44857sM15386n4.f100756c;
            Intrinsics.checkNotNullExpressionValue(btnOpen, "btnOpen");
            C27046k.m66711z(btnOpen, 0L, new Function0() { // from class: com.kubi.assets.autoearn.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AutoEarnOpenConfirmDialog.m15383r4(this.f16581b);
                }
            }, 1, null);
            final BaseTextView baseTextView = c44857sM15386n4.f100760g;
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            Intrinsics.checkNotNull(baseTextView);
            highlightTextHelper.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.autoearn.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoEarnOpenConfirmDialog.m15384s4(baseTextView, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.autoearn.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoEarnOpenConfirmDialog.m15385t4(view);
                }
            })));
        }
    }
}
