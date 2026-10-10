package com.kubi.assets.freeze;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$color;
import com.kubi.assets.R$font;
import com.kubi.assets.R$layout;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.resources.ColorClickSpan;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44749d4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
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

/* JADX INFO: compiled from: FreezeWithdrawDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020%H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/freeze/FreezeWithdrawDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/KucoinAssetWithdrawFreezeDialogBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinAssetWithdrawFreezeDialogBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "tip", "", "getTip", "()Ljava/lang/String;", "tip$delegate", "Lkotlin/Lazy;", "url", "getUrl", "url$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setupViews", "jumpViewMore", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFreezeWithdrawDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreezeWithdrawDialog.kt\ncom/kubi/assets/freeze/FreezeWithdrawDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,125:1\n143#2,20:126\n*S KotlinDebug\n*F\n+ 1 FreezeWithdrawDialog.kt\ncom/kubi/assets/freeze/FreezeWithdrawDialog\n*L\n53#1:126,20\n*E\n"})
public final class FreezeWithdrawDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    public final float f17515s0 = 0.75f;

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final InterfaceC24293a f17516t0 = C45681e.m100799e(this, new Function1<FreezeWithdrawDialog, C44749d4>() { // from class: com.kubi.assets.freeze.FreezeWithdrawDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44749d4 invoke(@NotNull FreezeWithdrawDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44749d4.m99012a(fragment.requireView());
        }
    }, new Function1<C44749d4, Unit>() { // from class: com.kubi.assets.freeze.FreezeWithdrawDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44749d4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44749d4 c44749d4) {
            invoke(c44749d4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public final Lazy f17517u0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.freeze.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FreezeWithdrawDialog.m16883H4(this.f17539b);
        }
    });

    /* JADX INFO: renamed from: v0 */
    @NotNull
    public final Lazy f17518v0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.freeze.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FreezeWithdrawDialog.m16884I4(this.f17540b);
        }
    });

    /* JADX INFO: renamed from: x0 */
    public static final /* synthetic */ KProperty<Object>[] f17514x0 = {Reflection.property1(new PropertyReference1Impl(FreezeWithdrawDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinAssetWithdrawFreezeDialogBinding;", 0))};

    /* JADX INFO: renamed from: w0 */
    @NotNull
    public static final Companion f17513w0 = new Companion(null);

    /* JADX INFO: compiled from: FreezeWithdrawDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/assets/freeze/FreezeWithdrawDialog$Companion;", "", "<init>", "()V", "TAG", "", "CODE", "URL", "TIP", "create", "Lcom/kubi/assets/freeze/FreezeWithdrawDialog;", "code", "url", "tip", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ FreezeWithdrawDialog create$default(Companion companion, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                str3 = "";
            }
            return companion.create(str, str2, str3);
        }

        @NotNull
        public final FreezeWithdrawDialog create(@NotNull String code, @NotNull String url, @NotNull String tip) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tip, "tip");
            FreezeWithdrawDialog freezeWithdrawDialog = new FreezeWithdrawDialog();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("code", code);
            bundleBundleOf.putString("url", url);
            bundleBundleOf.putString("tip", tip);
            freezeWithdrawDialog.setArguments(bundleBundleOf);
            return freezeWithdrawDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m16879D4(AlignTopTextView alignTopTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(alignTopTextView.getContext(), R$font.regular));
        ds2.setColor(ContextCompat.getColor(alignTopTextView.getContext(), R$color.brandGreen));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m16881F4(AlignTopTextView alignTopTextView, TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        ds2.setTypeface(ResourcesCompat.getFont(alignTopTextView.getContext(), R$font.regular));
        ds2.setColor(ContextCompat.getColor(alignTopTextView.getContext(), R$color.brandGreen));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m16882G4(FreezeWithdrawDialog freezeWithdrawDialog, View view) {
        AssetsHelper.f18684a.m19154H(freezeWithdrawDialog.getActivity());
    }

    /* JADX INFO: renamed from: w4 */
    private final String m16894w4() {
        return (String) this.f17517u0.getValue();
    }

    /* JADX INFO: renamed from: x4 */
    private final String m16895x4() {
        return (String) this.f17518v0.getValue();
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4, reason: from getter */
    public float getF17515s0() {
        return this.f17515s0;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.kucoin_asset_withdraw_freeze_dialog, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m16896z4();
    }

    /* JADX INFO: renamed from: v4 */
    public final C44749d4 m16897v4() {
        return (C44749d4) this.f17516t0.getValue(this, f17514x0[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m16898y4() {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (m16895x4().length() == 0) {
                AssetsHelper.f18684a.m19154H(getActivity());
            } else {
                Result.m103844constructorimpl(Boolean.valueOf(Router.f46192a.m56184f(m16895x4()).m4048k()));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m16876A4(FreezeWithdrawDialog freezeWithdrawDialog) {
        freezeWithdrawDialog.m16898y4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m16877B4(FreezeWithdrawDialog freezeWithdrawDialog) {
        freezeWithdrawDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m16878C4(FreezeWithdrawDialog freezeWithdrawDialog) {
        freezeWithdrawDialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m16880E4(FreezeWithdrawDialog freezeWithdrawDialog, View view) {
        freezeWithdrawDialog.m16898y4();
    }

    /* JADX INFO: renamed from: H4 */
    public static final String m16883H4(FreezeWithdrawDialog freezeWithdrawDialog) {
        String strM56239b0;
        Bundle arguments = freezeWithdrawDialog.getArguments();
        if (arguments != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments, "tip");
        } else {
            strM56239b0 = null;
        }
        return C27041f.m66668h(strM56239b0);
    }

    /* JADX INFO: renamed from: I4 */
    public static final String m16884I4(FreezeWithdrawDialog freezeWithdrawDialog) {
        String strM56239b0;
        Bundle arguments = freezeWithdrawDialog.getArguments();
        if (arguments != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments, "url");
        } else {
            strM56239b0 = null;
        }
        return C27041f.m66668h(strM56239b0);
    }

    /* JADX INFO: renamed from: z4 */
    private final void m16896z4() {
        final AlignTopTextView alignTopTextView;
        final AlignTopTextView alignTopTextView2;
        AlignTopTextView alignTopTextView3;
        C44749d4 c44749d4M16897v4 = m16897v4();
        if (c44749d4M16897v4 != null && (alignTopTextView3 = c44749d4M16897v4.f99750g) != null) {
            alignTopTextView3.setText(m16894w4());
        }
        C44749d4 c44749d4M16897v5 = m16897v4();
        if (c44749d4M16897v5 != null && (alignTopTextView2 = c44749d4M16897v5.f99750g) != null) {
            alignTopTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(alignTopTextView2, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.freeze.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreezeWithdrawDialog.m16879D4(alignTopTextView2, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.freeze.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FreezeWithdrawDialog.m16880E4(this.f17533b, view);
                }
            })));
        }
        C44749d4 c44749d4M16897v6 = m16897v4();
        if (c44749d4M16897v6 != null && (alignTopTextView = c44749d4M16897v6.f99748e) != null) {
            alignTopTextView.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper.f43497a.m54120f(alignTopTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ColorClickSpan(new Function1() { // from class: com.kubi.assets.freeze.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FreezeWithdrawDialog.m16881F4(alignTopTextView, (TextPaint) obj);
                }
            }, new View.OnClickListener() { // from class: com.kubi.assets.freeze.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FreezeWithdrawDialog.m16882G4(this.f17535b, view);
                }
            })));
        }
        C44749d4 c44749d4M16897v7 = m16897v4();
        if (c44749d4M16897v7 != null) {
            ImageView ivCancel = c44749d4M16897v7.f99745b;
            Intrinsics.checkNotNullExpressionValue(ivCancel, "ivCancel");
            C27046k.m66711z(ivCancel, 0L, new Function0() { // from class: com.kubi.assets.freeze.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FreezeWithdrawDialog.m16877B4(this.f17536b);
                }
            }, 1, null);
            KcPrimaryButton tvDetermine = c44749d4M16897v7.f99749f;
            Intrinsics.checkNotNullExpressionValue(tvDetermine, "tvDetermine");
            C27046k.m66711z(tvDetermine, 0L, new Function0() { // from class: com.kubi.assets.freeze.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FreezeWithdrawDialog.m16878C4(this.f17537b);
                }
            }, 1, null);
            KcSecondaryButton tvViewDetail = c44749d4M16897v7.f99752i;
            Intrinsics.checkNotNullExpressionValue(tvViewDetail, "tvViewDetail");
            C27046k.m66711z(tvViewDetail, 0L, new Function0() { // from class: com.kubi.assets.freeze.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FreezeWithdrawDialog.m16876A4(this.f17538b);
                }
            }, 1, null);
        }
    }
}
