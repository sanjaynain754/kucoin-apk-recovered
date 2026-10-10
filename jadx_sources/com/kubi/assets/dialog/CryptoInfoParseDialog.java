package com.kubi.assets.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5267e0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.CryptoInfo;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import k00.C40842f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p637ta.C44885w;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: CryptoInfoParseDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010+\u001a\u00020\u0017H\u0016J\b\u0010,\u001a\u00020\u0017H\u0002J\b\u0010-\u001a\u00020\u0017H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006."}, m90084d2 = {"Lcom/kubi/assets/dialog/CryptoInfoParseDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/AssetDialogCryptoInfoBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetDialogCryptoInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "cryptoInfo", "Lcom/kubi/assets/entity/CryptoInfo;", "getCryptoInfo", "()Lcom/kubi/assets/entity/CryptoInfo;", "cryptoInfo$delegate", "Lkotlin/Lazy;", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "currency$delegate", "onConfirmCallback", "Lkotlin/Function0;", "", "getOnConfirmCallback", "()Lkotlin/jvm/functions/Function0;", "setOnConfirmCallback", "(Lkotlin/jvm/functions/Function0;)V", "onCancelCallback", "getOnCancelCallback", "setOnCancelCallback", "isBottomSheet", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "onStart", "init", "initListener", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCryptoInfoParseDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CryptoInfoParseDialog.kt\ncom/kubi/assets/dialog/CryptoInfoParseDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,142:1\n143#2,20:143\n*S KotlinDebug\n*F\n+ 1 CryptoInfoParseDialog.kt\ncom/kubi/assets/dialog/CryptoInfoParseDialog\n*L\n34#1:143,20\n*E\n"})
public final class CryptoInfoParseDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ KProperty<Object>[] f16926v0 = {Reflection.property1(new PropertyReference1Impl(CryptoInfoParseDialog.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetDialogCryptoInfoBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f16927q0 = C45681e.m100799e(this, new Function1<CryptoInfoParseDialog, C44885w>() { // from class: com.kubi.assets.dialog.CryptoInfoParseDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44885w invoke(@NotNull CryptoInfoParseDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44885w.m99294a(fragment.requireView());
        }
    }, new Function1<C44885w, Unit>() { // from class: com.kubi.assets.dialog.CryptoInfoParseDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C44885w it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44885w c44885w) {
            invoke(c44885w);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f16928r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoInfoParseDialog.m15987n4(this.f17119b);
        }
    });

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public final Lazy f16929s0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoInfoParseDialog.m15988o4(this.f17124b);
        }
    });

    /* JADX INFO: renamed from: t0 */
    @Nullable
    public Function0<Unit> f16930t0;

    /* JADX INFO: renamed from: u0 */
    @Nullable
    public Function0<Unit> f16931u0;

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: r4 */
    private final String m15989r4() {
        return (String) this.f16929s0.getValue();
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m15991t4(CryptoInfoParseDialog cryptoInfoParseDialog) {
        C43852m.m96591c("B1withdrawPage", "importLayer", "cancel", null, 8, null);
        cryptoInfoParseDialog.dismissAllowingStateLoss();
        Function0<Unit> function0 = cryptoInfoParseDialog.f16931u0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m15992u4(CryptoInfoParseDialog cryptoInfoParseDialog) {
        C43852m.m96591c("B1withdrawPage", "importLayer", "confirm", null, 8, null);
        cryptoInfoParseDialog.dismissAllowingStateLoss();
        Function0<Unit> function0 = cryptoInfoParseDialog.f16930t0;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.asset_dialog_crypto_info, (ViewGroup) null, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coin", m15989r4());
        CryptoInfo cryptoInfoM15994q4 = m15994q4();
        String chain = cryptoInfoM15994q4 != null ? cryptoInfoM15994q4.getChain() : null;
        if (chain != null && chain.length() != 0) {
            CryptoInfo cryptoInfoM15994q5 = m15994q4();
            jSONObject.put("chain", cryptoInfoM15994q5 != null ? cryptoInfoM15994q5.getChain() : null);
        }
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1withdrawPage", "importLayer", "1", jSONObject);
        init();
        m15990s4();
    }

    /* JADX INFO: renamed from: p4 */
    public final C44885w m15993p4() {
        return (C44885w) this.f16927q0.getValue(this, f16926v0[0]);
    }

    /* JADX INFO: renamed from: q4 */
    public final CryptoInfo m15994q4() {
        return (CryptoInfo) this.f16928r0.getValue();
    }

    /* JADX INFO: renamed from: v4 */
    public final void m15995v4(@Nullable Function0<Unit> function0) {
        this.f16931u0 = function0;
    }

    /* JADX INFO: renamed from: w4 */
    public final void m15996w4(@Nullable Function0<Unit> function0) {
        this.f16930t0 = function0;
    }

    private final void init() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        CoinAvatarView coinAvatarView;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String tag;
        BaseTextView baseTextView6;
        String str;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        ShapeTextView shapeTextView;
        CryptoInfo cryptoInfoM15994q4 = m15994q4();
        if (cryptoInfoM15994q4 != null) {
            C44885w c44885wM15993p4 = m15993p4();
            if (c44885wM15993p4 != null && (shapeTextView = c44885wM15993p4.f101026i) != null) {
                shapeTextView.setText(cryptoInfoM15994q4.getChain());
            }
            C44885w c44885wM15993p5 = m15993p4();
            if (c44885wM15993p5 != null && (baseTextView9 = c44885wM15993p5.f101022e) != null) {
                baseTextView9.setText(cryptoInfoM15994q4.getAddress());
            }
            C44885w c44885wM15993p6 = m15993p4();
            if (c44885wM15993p6 != null && (baseTextView8 = c44885wM15993p6.f101027j) != null) {
                baseTextView8.setText(m15989r4());
            }
            C44885w c44885wM15993p7 = m15993p4();
            if (c44885wM15993p7 != null && (baseTextView7 = c44885wM15993p7.f101024g) != null) {
                baseTextView7.setText(cryptoInfoM15994q4.getAmount());
            }
            C44885w c44885wM15993p8 = m15993p4();
            if (c44885wM15993p8 != null && (baseTextView6 = c44885wM15993p8.f101029l) != null) {
                String memo = cryptoInfoM15994q4.getMemo();
                if (memo != null && memo.length() != 0) {
                    str = "Memo";
                } else {
                    str = "Tag";
                }
                baseTextView6.setText(str);
            }
            C44885w c44885wM15993p9 = m15993p4();
            if (c44885wM15993p9 != null && (baseTextView5 = c44885wM15993p9.f101028k) != null) {
                String memo2 = cryptoInfoM15994q4.getMemo();
                if (memo2 != null && memo2.length() != 0) {
                    tag = cryptoInfoM15994q4.getMemo();
                } else {
                    tag = cryptoInfoM15994q4.getTag();
                }
                baseTextView5.setText(tag);
            }
            if (AssetExKt.m15115c(cryptoInfoM15994q4.getMemo(), cryptoInfoM15994q4.getMemo())) {
                C44885w c44885wM15993p10 = m15993p4();
                if (c44885wM15993p10 != null && (baseTextView4 = c44885wM15993p10.f101029l) != null) {
                    ViewExtKt.m66577h(baseTextView4);
                }
                C44885w c44885wM15993p11 = m15993p4();
                if (c44885wM15993p11 != null && (baseTextView3 = c44885wM15993p11.f101028k) != null) {
                    ViewExtKt.m66577h(baseTextView3);
                }
            }
            String amount = cryptoInfoM15994q4.getAmount();
            if (amount == null || amount.length() == 0) {
                C44885w c44885wM15993p12 = m15993p4();
                if (c44885wM15993p12 != null && (baseTextView2 = c44885wM15993p12.f101025h) != null) {
                    ViewExtKt.m66577h(baseTextView2);
                }
                C44885w c44885wM15993p13 = m15993p4();
                if (c44885wM15993p13 != null && (baseTextView = c44885wM15993p13.f101024g) != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
            }
            C44885w c44885wM15993p14 = m15993p4();
            String iconUrl = null;
            if (c44885wM15993p14 != null) {
                coinAvatarView = c44885wM15993p14.f101021d;
            } else {
                coinAvatarView = null;
            }
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(m15989r4()));
            if (coinInfoEntityM85613u != null) {
                iconUrl = coinInfoEntityM85613u.getIconUrl();
            }
            C24277v.m58542g(coinAvatarView, iconUrl);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public static final CryptoInfo m15987n4(CryptoInfoParseDialog cryptoInfoParseDialog) {
        Bundle arguments = cryptoInfoParseDialog.getArguments();
        if (arguments != null) {
            return (CryptoInfo) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: o4 */
    public static final String m15988o4(CryptoInfoParseDialog cryptoInfoParseDialog) {
        Bundle arguments = cryptoInfoParseDialog.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "coin");
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    private final void m15990s4() {
        C40842f c40842f;
        KcPrimaryButton kcPrimaryButton;
        C40842f c40842f2;
        KcSecondaryButton kcSecondaryButton;
        C44885w c44885wM15993p4 = m15993p4();
        if (c44885wM15993p4 != null && (c40842f2 = c44885wM15993p4.f101019b) != null && (kcSecondaryButton = c40842f2.f90752c) != null) {
            kcSecondaryButton.setText(getString(R$string.cancel));
            C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoInfoParseDialog.m15991t4(this.f17127b);
                }
            }, 1, null);
        }
        C44885w c44885wM15993p5 = m15993p4();
        if (c44885wM15993p5 != null && (c40842f = c44885wM15993p5.f101019b) != null && (kcPrimaryButton = c40842f.f90753d) != null) {
            kcPrimaryButton.setText(getString(R$string.confirm));
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.dialog.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoInfoParseDialog.m15992u4(this.f17135b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R$id.design_bottom_sheet)) != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
            bottomSheetBehaviorFrom.setPeekHeight(C5267e0.m6182d());
            bottomSheetBehaviorFrom.setState(3);
        }
    }
}
