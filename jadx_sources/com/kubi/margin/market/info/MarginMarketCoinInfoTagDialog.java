package com.kubi.margin.market.info;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.R$style;
import com.kubi.margin.entity.Tag;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p206dp.C36903b;
import p698vp.C45615e;
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

/* JADX INFO: compiled from: MarginMarketCoinInfoTagDialog.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "bmarginDialogCoinInfoTagBinding", "Lcom/kubi/margin/databinding/BmarginDialogCoinInfoTagBinding;", "getBmarginDialogCoinInfoTagBinding", "()Lcom/kubi/margin/databinding/BmarginDialogCoinInfoTagBinding;", "bmarginDialogCoinInfoTagBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mTag", "Lcom/kubi/margin/entity/Tag;", "getMTag", "()Lcom/kubi/margin/entity/Tag;", "mTag$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginMarketCoinInfoTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketCoinInfoTagDialog.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,101:1\n143#2,20:102\n*S KotlinDebug\n*F\n+ 1 MarginMarketCoinInfoTagDialog.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog\n*L\n31#1:102,20\n*E\n"})
public final class MarginMarketCoinInfoTagDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f33310Z = C45681e.m100799e(this, new Function1<MarginMarketCoinInfoTagDialog, C36903b>() { // from class: com.kubi.margin.market.info.MarginMarketCoinInfoTagDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36903b invoke(@NotNull MarginMarketCoinInfoTagDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36903b.m82675a(fragment.requireView());
        }
    }, new Function1<C36903b, Unit>() { // from class: com.kubi.margin.market.info.MarginMarketCoinInfoTagDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36903b it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36903b c36903b) {
            invoke(c36903b);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f33311a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.market.info.y
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginMarketCoinInfoTagDialog.m39079A3(this.f33349b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f33309c0 = {Reflection.property1(new PropertyReference1Impl(MarginMarketCoinInfoTagDialog.class, "bmarginDialogCoinInfoTagBinding", "getBmarginDialogCoinInfoTagBinding()Lcom/kubi/margin/databinding/BmarginDialogCoinInfoTagBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f33308b0 = new Companion(null);

    /* JADX INFO: compiled from: MarginMarketCoinInfoTagDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog;", "tag", "Lcom/kubi/margin/entity/Tag;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarginMarketCoinInfoTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketCoinInfoTagDialog.kt\ncom/kubi/margin/market/info/MarginMarketCoinInfoTagDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarginMarketCoinInfoTagDialog newInstance(@NotNull Tag tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialog = new MarginMarketCoinInfoTagDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", tag);
            marginMarketCoinInfoTagDialog.setArguments(bundle);
            return marginMarketCoinInfoTagDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.market.info.MarginMarketCoinInfoTagDialog$a */
    /* JADX INFO: compiled from: MarginMarketCoinInfoTagDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/margin/market/info/MarginMarketCoinInfoTagDialog$onViewCreated$1$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC17859a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C36903b f33312b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MarginMarketCoinInfoTagDialog f33313c;

        public ViewTreeObserverOnGlobalLayoutListenerC17859a(C36903b c36903b, MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialog) {
            this.f33312b = c36903b;
            this.f33313c = marginMarketCoinInfoTagDialog;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int height = this.f33312b.f81585d.getHeight() + C27029c.m66603f(this.f33313c, 120);
            if (height > (C5267e0.m6182d() / 3) * 2) {
                ConstraintLayout clRoot = this.f33312b.f81583b;
                Intrinsics.checkNotNullExpressionValue(clRoot, "clRoot");
                ViewExtKt.m66578i(clRoot, (C5267e0.m6182d() / 3) * 2);
            } else if (height < C5267e0.m6182d() / 3) {
                ConstraintLayout clRoot2 = this.f33312b.f81583b;
                Intrinsics.checkNotNullExpressionValue(clRoot2, "clRoot");
                ViewExtKt.m66578i(clRoot2, C5267e0.m6182d() / 3);
            } else {
                ConstraintLayout clRoot3 = this.f33312b.f81583b;
                Intrinsics.checkNotNullExpressionValue(clRoot3, "clRoot");
                ViewExtKt.m66578i(clRoot3, height);
            }
            this.f33312b.f81585d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m39081C3(MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialog) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(C45615e.m100706g("discover/plate", false));
        Tag tagM39086z3 = marginMarketCoinInfoTagDialog.m39086z3();
        c4400aM56184f.m4038a("tagId", C27041f.m66668h(tagM39086z3 != null ? tagM39086z3.getTagId() : null)).m4048k();
        marginMarketCoinInfoTagDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bmargin_dialog_coin_info_tag, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36903b c36903bM39085y3 = m39085y3();
        if (c36903bM39085y3 != null) {
            AppCompatImageView close = c36903bM39085y3.f81584c;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            BaseTextView tvCancel = c36903bM39085y3.f81587f;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66681D(new View[]{close, tvCancel}, new Function0() { // from class: com.kubi.margin.market.info.z
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketCoinInfoTagDialog.m39080B3(this.f33350b);
                }
            });
            BaseTextView baseTextView = c36903bM39085y3.f81586e;
            int i11 = R$string.tag_more_title;
            Tag tagM39086z3 = m39086z3();
            baseTextView.setText(getString(i11, tagM39086z3 != null ? tagM39086z3.getTitle() : null));
            BaseTextView baseTextView2 = c36903bM39085y3.f81585d;
            Tag tagM39086z4 = m39086z3();
            baseTextView2.setText(tagM39086z4 != null ? tagM39086z4.getDescription() : null);
            c36903bM39085y3.f81585d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17859a(c36903bM39085y3, this));
            BaseTextView tvMore = c36903bM39085y3.f81588g;
            Intrinsics.checkNotNullExpressionValue(tvMore, "tvMore");
            C27046k.m66711z(tvMore, 0L, new Function0() { // from class: com.kubi.margin.market.info.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarginMarketCoinInfoTagDialog.m39081C3(this.f33318b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final C36903b m39085y3() {
        return (C36903b) this.f33310Z.getValue(this, f33309c0[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final Tag m39086z3() {
        return (Tag) this.f33311a0.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Tag m39079A3(MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialog) {
        Bundle arguments = marginMarketCoinInfoTagDialog.getArguments();
        if (arguments != null) {
            return (Tag) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m39080B3(MarginMarketCoinInfoTagDialog marginMarketCoinInfoTagDialog) {
        marginMarketCoinInfoTagDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                window = dialog.getWindow();
            } else {
                window = null;
            }
            if (window != null) {
                Dialog dialog2 = getDialog();
                Intrinsics.checkNotNull(dialog2);
                Window window4 = dialog2.getWindow();
                Intrinsics.checkNotNull(window4);
                WindowManager.LayoutParams attributes = window4.getAttributes();
                attributes.width = C5267e0.m6183e();
                attributes.windowAnimations = R$style.style_bottom_dialog;
                attributes.height = -2;
                attributes.gravity = 80;
                Dialog dialog3 = getDialog();
                if (dialog3 != null && (window3 = dialog3.getWindow()) != null) {
                    window3.setAttributes(attributes);
                }
                Dialog dialog4 = getDialog();
                if (dialog4 != null && (window2 = dialog4.getWindow()) != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
            }
        }
    }
}
