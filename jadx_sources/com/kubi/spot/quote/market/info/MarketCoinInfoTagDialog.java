package com.kubi.spot.quote.market.info;

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
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.R$style;
import com.kubi.spot.entity.Tag;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f30.C37346q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
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
import t20.C44632c;
import w00.C45681e;

/* JADX INFO: compiled from: MarketCoinInfoTagDialog.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog;", "Lcom/kubi/resources/dialog/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/kubi/spot/databinding/BkucoinDialogCoinInfoTagBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BkucoinDialogCoinInfoTagBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mTag", "Lcom/kubi/spot/entity/Tag;", "getMTag", "()Lcom/kubi/spot/entity/Tag;", "mTag$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketCoinInfoTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoTagDialog.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n143#2,20:92\n1#3:112\n*S KotlinDebug\n*F\n+ 1 MarketCoinInfoTagDialog.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog\n*L\n31#1:92,20\n*E\n"})
public final class MarketCoinInfoTagDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f50962Z = C45681e.m100799e(this, new Function1<MarketCoinInfoTagDialog, C44632c>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoTagDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44632c invoke(@NotNull MarketCoinInfoTagDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44632c.m98742a(fragment.requireView());
        }
    }, new Function1<C44632c, Unit>() { // from class: com.kubi.spot.quote.market.info.MarketCoinInfoTagDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44632c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44632c c44632c) {
            invoke(c44632c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f50963a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.quote.market.info.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketCoinInfoTagDialog.m62598B3(this.f50973b);
        }
    });

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f50961c0 = {Reflection.property1(new PropertyReference1Impl(MarketCoinInfoTagDialog.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BkucoinDialogCoinInfoTagBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f50960b0 = new Companion(null);

    /* JADX INFO: compiled from: MarketCoinInfoTagDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog;", "tag", "Lcom/kubi/spot/entity/Tag;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nMarketCoinInfoTagDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCoinInfoTagDialog.kt\ncom/kubi/spot/quote/market/info/MarketCoinInfoTagDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final MarketCoinInfoTagDialog newInstance(@NotNull Tag tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            MarketCoinInfoTagDialog marketCoinInfoTagDialog = new MarketCoinInfoTagDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", tag);
            marketCoinInfoTagDialog.setArguments(bundle);
            return marketCoinInfoTagDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.quote.market.info.MarketCoinInfoTagDialog$a */
    /* JADX INFO: compiled from: MarketCoinInfoTagDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/spot/quote/market/info/MarketCoinInfoTagDialog$onViewCreated$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC25608a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC25608a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ConstraintLayout constraintLayout;
            ConstraintLayout constraintLayout2;
            BaseTextView baseTextView;
            ViewTreeObserver viewTreeObserver;
            ConstraintLayout constraintLayout3;
            BaseTextView baseTextView2;
            C44632c c44632cM62606z3 = MarketCoinInfoTagDialog.this.m62606z3();
            int iM66650j = C27039d.m66650j((c44632cM62606z3 == null || (baseTextView2 = c44632cM62606z3.f98997d) == null) ? null : Integer.valueOf(baseTextView2.getHeight())) + C27029c.m66603f(MarketCoinInfoTagDialog.this, 120);
            if (iM66650j > (C5267e0.m6182d() / 3) * 2) {
                C44632c c44632cM62606z4 = MarketCoinInfoTagDialog.this.m62606z3();
                if (c44632cM62606z4 != null && (constraintLayout3 = c44632cM62606z4.f98995b) != null) {
                    ViewExtKt.m66578i(constraintLayout3, (C5267e0.m6182d() / 3) * 2);
                }
            } else if (iM66650j < C5267e0.m6182d() / 3) {
                C44632c c44632cM62606z5 = MarketCoinInfoTagDialog.this.m62606z3();
                if (c44632cM62606z5 != null && (constraintLayout2 = c44632cM62606z5.f98995b) != null) {
                    ViewExtKt.m66578i(constraintLayout2, C5267e0.m6182d() / 3);
                }
            } else {
                C44632c c44632cM62606z6 = MarketCoinInfoTagDialog.this.m62606z3();
                if (c44632cM62606z6 != null && (constraintLayout = c44632cM62606z6.f98995b) != null) {
                    ViewExtKt.m66578i(constraintLayout, iM66650j);
                }
            }
            C44632c c44632cM62606z7 = MarketCoinInfoTagDialog.this.m62606z3();
            if (c44632cM62606z7 == null || (baseTextView = c44632cM62606z7.f98997d) == null || (viewTreeObserver = baseTextView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m62600D3(MarketCoinInfoTagDialog marketCoinInfoTagDialog) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(C37346q.m83938h("discover/plate", false));
        Tag tagM62605A3 = marketCoinInfoTagDialog.m62605A3();
        c4400aM56184f.m4038a("tagId", C27041f.m66668h(tagM62605A3 != null ? tagM62605A3.getTagId() : null)).m4048k();
        marketCoinInfoTagDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A3 */
    public final Tag m62605A3() {
        return (Tag) this.f50963a0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkucoin_dialog_coin_info_tag, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ViewTreeObserver viewTreeObserver;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C44632c c44632cM62606z3 = m62606z3();
        if (c44632cM62606z3 != null) {
            AppCompatImageView close = c44632cM62606z3.f98996c;
            Intrinsics.checkNotNullExpressionValue(close, "close");
            BaseTextView tvCancel = c44632cM62606z3.f98999f;
            Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
            C27046k.m66681D(new View[]{close, tvCancel}, new Function0() { // from class: com.kubi.spot.quote.market.info.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MarketCoinInfoTagDialog.m62599C3(this.f50967b);
                }
            });
        }
        C44632c c44632cM62606z4 = m62606z3();
        if (c44632cM62606z4 != null && (baseTextView4 = c44632cM62606z4.f98998e) != null) {
            int i11 = R$string.tag_more_title;
            Tag tagM62605A3 = m62605A3();
            baseTextView4.setText(getString(i11, tagM62605A3 != null ? tagM62605A3.getTitle() : null));
        }
        C44632c c44632cM62606z5 = m62606z3();
        if (c44632cM62606z5 != null && (baseTextView3 = c44632cM62606z5.f98997d) != null) {
            Tag tagM62605A4 = m62605A3();
            baseTextView3.setText(tagM62605A4 != null ? tagM62605A4.getDescription() : null);
        }
        C44632c c44632cM62606z6 = m62606z3();
        if (c44632cM62606z6 != null && (baseTextView2 = c44632cM62606z6.f98997d) != null && (viewTreeObserver = baseTextView2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC25608a());
        }
        C44632c c44632cM62606z7 = m62606z3();
        if (c44632cM62606z7 == null || (baseTextView = c44632cM62606z7.f99000g) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.spot.quote.market.info.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarketCoinInfoTagDialog.m62600D3(this.f50970b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: z3 */
    public final C44632c m62606z3() {
        return (C44632c) this.f50962Z.getValue(this, f50961c0[0]);
    }

    /* JADX INFO: renamed from: B3 */
    public static final Tag m62598B3(MarketCoinInfoTagDialog marketCoinInfoTagDialog) {
        Bundle arguments = marketCoinInfoTagDialog.getArguments();
        if (arguments != null) {
            return (Tag) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m62599C3(MarketCoinInfoTagDialog marketCoinInfoTagDialog) {
        marketCoinInfoTagDialog.dismissAllowingStateLoss();
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
