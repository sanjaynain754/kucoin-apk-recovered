package com.kubi.assets.freeze;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.assets.R$layout;
import com.kubi.resources.dialog.BaseBottomDialog;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44804k3;
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
import w00.C45681e;

/* JADX INFO: compiled from: RwaAgreementSignDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\"H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/freeze/RwaAgreementSignDialog;", "Lcom/kubi/resources/dialog/BaseBottomDialog;", "<init>", "()V", "maxHeightRatio", "", "getMaxHeightRatio", "()F", "binding", "Lcom/kubi/assets/databinding/DialogRwaAgreementSignBinding;", "getBinding", "()Lcom/kubi/assets/databinding/DialogRwaAgreementSignBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "api", "Lcom/kubi/assets/freeze/AssetFreezeApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/freeze/AssetFreezeApi;", "api$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initView", "isBottomSheet", "", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRwaAgreementSignDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RwaAgreementSignDialog.kt\ncom/kubi/assets/freeze/RwaAgreementSignDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,112:1\n143#2,20:113\n*S KotlinDebug\n*F\n+ 1 RwaAgreementSignDialog.kt\ncom/kubi/assets/freeze/RwaAgreementSignDialog\n*L\n32#1:113,20\n*E\n"})
public final class RwaAgreementSignDialog extends BaseBottomDialog {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final InterfaceC24293a f17521s0 = C45681e.m100799e(this, new Function1<RwaAgreementSignDialog, C44804k3>() { // from class: com.kubi.assets.freeze.RwaAgreementSignDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44804k3 invoke(@NotNull RwaAgreementSignDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44804k3.m99128a(fragment.requireView());
        }
    }, new Function1<C44804k3, Unit>() { // from class: com.kubi.assets.freeze.RwaAgreementSignDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44804k3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44804k3 c44804k3) {
            invoke(c44804k3);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final Lazy f17522t0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.freeze.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RwaAgreementSignDialog.m16904r4();
        }
    });

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f17520v0 = {Reflection.property1(new PropertyReference1Impl(RwaAgreementSignDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/DialogRwaAgreementSignBinding;", 0))};

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public static final Companion f17519u0 = new Companion(null);

    /* JADX INFO: compiled from: RwaAgreementSignDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/assets/freeze/RwaAgreementSignDialog$Companion;", "", "<init>", "()V", "TITLE", "", "CONTENT", "ARTICLE_ID", "VERSION", "create", "Lcom/kubi/assets/freeze/RwaAgreementSignDialog;", "title", "content", "articleId", "version", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ RwaAgreementSignDialog create$default(Companion companion, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                str3 = "";
            }
            if ((i11 & 8) != 0) {
                str4 = "";
            }
            return companion.create(str, str2, str3, str4);
        }

        @NotNull
        public final RwaAgreementSignDialog create(@NotNull String title, @NotNull String content, @NotNull String articleId, @NotNull String version) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(version, "version");
            RwaAgreementSignDialog rwaAgreementSignDialog = new RwaAgreementSignDialog();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            bundleBundleOf.putString("title", title);
            bundleBundleOf.putString("content", content);
            bundleBundleOf.putString("articleId", articleId);
            bundleBundleOf.putString("version", version);
            rwaAgreementSignDialog.setArguments(bundleBundleOf);
            return rwaAgreementSignDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_rwa_agreement_sign, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    /* JADX INFO: renamed from: s4 */
    public final AssetFreezeApi m16908s4() {
        return (AssetFreezeApi) this.f17522t0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public final C44804k3 m16909t4() {
        return (C44804k3) this.f17521s0.getValue(this, f17520v0[0]);
    }

    private final void initView() {
        String strM56284y;
        String strM56284y2;
        final String strM56284y3;
        KcPrimaryButton kcPrimaryButton;
        KcSecondaryButton kcSecondaryButton;
        ImageView imageView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Bundle arguments = getArguments();
        String strM56284y4 = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "title");
        } else {
            strM56284y = null;
        }
        final String str = "";
        if (strM56284y == null) {
            strM56284y = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            strM56284y2 = RouteExKt.m56284y(arguments2, "content");
        } else {
            strM56284y2 = null;
        }
        if (strM56284y2 == null) {
            strM56284y2 = "";
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            strM56284y3 = RouteExKt.m56284y(arguments3, "articleId");
        } else {
            strM56284y3 = null;
        }
        if (strM56284y3 == null) {
            strM56284y3 = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            strM56284y4 = RouteExKt.m56284y(arguments4, "version");
        }
        if (strM56284y4 != null) {
            str = strM56284y4;
        }
        C44804k3 c44804k3M16909t4 = m16909t4();
        if (c44804k3M16909t4 != null && (baseTextView3 = c44804k3M16909t4.f100300g) != null) {
            baseTextView3.setText(strM56284y);
        }
        C44804k3 c44804k3M16909t5 = m16909t4();
        if (c44804k3M16909t5 != null && (baseTextView2 = c44804k3M16909t5.f100299f) != null) {
            baseTextView2.setText(Html.fromHtml(strM56284y2, 0));
        }
        C44804k3 c44804k3M16909t6 = m16909t4();
        if (c44804k3M16909t6 != null && (baseTextView = c44804k3M16909t6.f100299f) != null) {
            baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C44804k3 c44804k3M16909t7 = m16909t4();
        if (c44804k3M16909t7 != null && (imageView = c44804k3M16909t7.f100295b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.freeze.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RwaAgreementSignDialog.m16905u4(this.f17541b);
                }
            }, 1, null);
        }
        C44804k3 c44804k3M16909t8 = m16909t4();
        if (c44804k3M16909t8 != null && (kcSecondaryButton = c44804k3M16909t8.f100297d) != null) {
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.freeze.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RwaAgreementSignDialog.m16906v4(this.f17542b);
                }
            }, 1, null);
        }
        C44804k3 c44804k3M16909t9 = m16909t4();
        if (c44804k3M16909t9 != null && (kcPrimaryButton = c44804k3M16909t9.f100298e) != null) {
            C27046k.m66710y(kcPrimaryButton, 1000L, new Function0() { // from class: com.kubi.assets.freeze.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RwaAgreementSignDialog.m16907w4(this.f17543b, strM56284y3, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r4 */
    public static final AssetFreezeApi m16904r4() {
        return (AssetFreezeApi) C42597a.m93388d().create(AssetFreezeApi.class);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m16905u4(RwaAgreementSignDialog rwaAgreementSignDialog) {
        rwaAgreementSignDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m16906v4(RwaAgreementSignDialog rwaAgreementSignDialog) {
        rwaAgreementSignDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m16907w4(RwaAgreementSignDialog rwaAgreementSignDialog, String str, String str2) {
        LifecycleOwnerKt.getLifecycleScope(rwaAgreementSignDialog).launchWhenStarted(new RwaAgreementSignDialog$initView$3$1(rwaAgreementSignDialog, str, str2, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseBottomDialog
    /* JADX INFO: renamed from: k4 */
    public float getF16545s0() {
        return 0.9f;
    }
}
