package com.kubi.futures.trade.welfare.distribution;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.futures.event.InputPanelCouponEvent;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.kumex.data.platform.model.CoinEntity;
import com.kubi.kumex.data.platform.model.PropertyEntity;
import com.kubi.kumex.utils.C17056l0;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.GravityDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36799m;
import java.math.BigDecimal;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p836zl.C46894j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
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
import th.InterfaceC44980d;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: DistributionRetentionDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010$\u001a\u00020\"H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionRetentionDialog;", "Lcom/kubi/resources/dialog/GravityDialogFragment;", "<init>", "()V", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "getEntity", "()Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "entity$delegate", "Lkotlin/Lazy;", "resId", "", "getResId", "()Ljava/lang/Integer;", "resId$delegate", "isFromAirdrop", "", "()Ljava/lang/Boolean;", "isFromAirdrop$delegate", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogDistributionRetentionBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogDistributionRetentionBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "quit", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDistributionRetentionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionRetentionDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionRetentionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,167:1\n143#2,20:168\n20#3:188\n135#4,2:189\n*S KotlinDebug\n*F\n+ 1 DistributionRetentionDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionRetentionDialog\n*L\n75#1:168,20\n103#1:188\n155#1:189,2\n*E\n"})
public final class DistributionRetentionDialog extends GravityDialogFragment {

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f24707c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionRetentionDialog.m28557F3(this.f24761b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f24708d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionRetentionDialog.m28562P3(this.f24763b);
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f24709e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DistributionRetentionDialog.m28558K3(this.f24765b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final InterfaceC24293a f24710f0 = C45681e.m100799e(this, new Function1<DistributionRetentionDialog, C36799m>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionRetentionDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36799m invoke(@NotNull DistributionRetentionDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36799m.m82459a(fragment.requireView());
        }
    }, new Function1<C36799m, Unit>() { // from class: com.kubi.futures.trade.welfare.distribution.DistributionRetentionDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36799m it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36799m c36799m) {
            invoke(c36799m);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f24706h0 = {Reflection.property1(new PropertyReference1Impl(DistributionRetentionDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogDistributionRetentionBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f24705g0 = new Companion(null);

    /* JADX INFO: compiled from: DistributionRetentionDialog.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/DistributionRetentionDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;", "resId", "", "isFromAirdrop", "", "CONTENT_RES_ID", "", "IS_FROM_AIRDROP", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void show$default(Companion companion, FragmentManager fragmentManager, DistributionRetentionEntity distributionRetentionEntity, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 8) != 0) {
                z11 = false;
            }
            companion.show(fragmentManager, distributionRetentionEntity, i11, z11);
        }

        public final void show(@NotNull FragmentManager manager, @NotNull DistributionRetentionEntity entity, int resId, boolean isFromAirdrop) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(entity, "entity");
            DistributionRetentionDialog distributionRetentionDialog = new DistributionRetentionDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", entity);
            bundle.putInt("CONTENT_RES_ID", resId);
            bundle.putBoolean("IS_FROM_AIRDROP", isFromAirdrop);
            distributionRetentionDialog.setArguments(bundle);
            distributionRetentionDialog.show(manager, "DistributionRetentionDialog");
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final DistributionRetentionEntity m28564G3() {
        return (DistributionRetentionEntity) this.f24707c0.getValue();
    }

    /* JADX INFO: renamed from: H3 */
    public final Integer m28565H3() {
        return (Integer) this.f24708d0.getValue();
    }

    /* JADX INFO: renamed from: I3 */
    public final C36799m m28566I3() {
        return (C36799m) this.f24710f0.getValue(this, f24706h0[0]);
    }

    /* JADX INFO: renamed from: J3 */
    public final Boolean m28567J3() {
        return (Boolean) this.f24709e0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m54250y3(-1);
        return inflater.inflate(R$layout.bkumex_dialog_distribution_retention, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BigDecimal withdrawAmount;
        BigDecimal amount;
        PropertyEntity properties;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36799m c36799mM28566I3 = m28566I3();
        if (c36799mM28566I3 == null) {
            return;
        }
        if (C27025c.m66566d(m28567J3())) {
            C43852m.m96595g("B6futures", "AirDropPositionAbandon", null, null, 12, null);
        }
        KcPrimaryButton quit = c36799mM28566I3.f80508e;
        Intrinsics.checkNotNullExpressionValue(quit, "quit");
        C27046k.m66711z(quit, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionRetentionDialog.m28559L3(this.f24767b);
            }
        }, 1, null);
        AppCompatImageView ivClose = c36799mM28566I3.f80507d;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        C27046k.m66711z(ivClose, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionRetentionDialog.m28560M3(this.f24769b);
            }
        }, 1, null);
        KcPrimaryButton confirm = c36799mM28566I3.f80505b;
        Intrinsics.checkNotNullExpressionValue(confirm, "confirm");
        C27046k.m66711z(confirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.distribution.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DistributionRetentionDialog.m28561N3(this.f24771b);
            }
        }, 1, null);
        DistributionRetentionEntity distributionRetentionEntityM28564G3 = m28564G3();
        String strM92640e = null;
        String strM66668h = C27041f.m66668h(distributionRetentionEntityM28564G3 != null ? distributionRetentionEntityM28564G3.getCurrency() : null);
        CoinEntity coinEntityM99528E = InterfaceC44980d.m99528E(RepositoryServiceLocator.f19236a.m20288g(), strM66668h, false, 2, null);
        int iM66651k = C27039d.m66651k((coinEntityM99528E == null || (properties = coinEntityM99528E.getProperties()) == null) ? null : properties.getShortDisplayPrecision(), 4);
        BaseTextView baseTextView = c36799mM28566I3.f80506c;
        Integer numM28565H3 = m28565H3();
        Intrinsics.checkNotNull(numM28565H3);
        int iIntValue = numM28565H3.intValue();
        DistributionRetentionEntity distributionRetentionEntityM28564G4 = m28564G3();
        int i11 = iIntValue;
        String strM93906g = C42828b.m93906g((distributionRetentionEntityM28564G4 == null || (amount = distributionRetentionEntityM28564G4.getAmount()) == null) ? null : C42180b.m92640e(amount, null, iM66651k, true, true, false, 0, null, 113, null), strM66668h, true, false, 4, null);
        DistributionRetentionEntity distributionRetentionEntityM28564G5 = m28564G3();
        String strValueOf = String.valueOf(C27039d.m66650j(distributionRetentionEntityM28564G5 != null ? distributionRetentionEntityM28564G5.getWithDrawNumber() : null));
        DistributionRetentionEntity distributionRetentionEntityM28564G6 = m28564G3();
        if (distributionRetentionEntityM28564G6 != null && (withdrawAmount = distributionRetentionEntityM28564G6.getWithdrawAmount()) != null) {
            i11 = i11;
            strM92640e = C42180b.m92640e(withdrawAmount, null, iM66651k, true, true, false, 0, null, 113, null);
        }
        baseTextView.setText(getString(i11, strM93906g, strValueOf, strM92640e));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView desc = c36799mM28566I3.f80506c;
        Intrinsics.checkNotNullExpressionValue(desc, "desc");
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        int i12 = R$color.c_text;
        Pair pair = new Pair(textTagEnum, new ForegroundColorSpan(c27017c.m66512a(i12)));
        int i13 = R$font.medium;
        TypefaceSpan typefaceSpanM36545b = C17056l0.m36545b(i13);
        if (typefaceSpanM36545b == null) {
            typefaceSpanM36545b = new TypefaceSpan("sans-serif-medium");
        }
        Pair pair2 = new Pair(textTagEnum, typefaceSpanM36545b);
        HighlightTextHelper.TextTagEnum textTagEnum2 = HighlightTextHelper.TextTagEnum.SPAN1;
        Pair pair3 = new Pair(textTagEnum2, new ForegroundColorSpan(c27017c.m66512a(i12)));
        TypefaceSpan typefaceSpanM36545b2 = C17056l0.m36545b(i13);
        if (typefaceSpanM36545b2 == null) {
            typefaceSpanM36545b2 = new TypefaceSpan("sans-serif-medium");
        }
        Pair pair4 = new Pair(textTagEnum2, typefaceSpanM36545b2);
        HighlightTextHelper.TextTagEnum textTagEnum3 = HighlightTextHelper.TextTagEnum.SPAN2;
        Pair pair5 = new Pair(textTagEnum3, new ForegroundColorSpan(c27017c.m66512a(i12)));
        TypefaceSpan typefaceSpanM36545b3 = C17056l0.m36545b(i13);
        if (typefaceSpanM36545b3 == null) {
            typefaceSpanM36545b3 = new TypefaceSpan("sans-serif-medium");
        }
        Pair pair6 = new Pair(textTagEnum3, typefaceSpanM36545b3);
        HighlightTextHelper.TextTagEnum textTagEnum4 = HighlightTextHelper.TextTagEnum.SPAN3;
        Pair pair7 = new Pair(textTagEnum4, new ForegroundColorSpan(c27017c.m66512a(i12)));
        TypefaceSpan typefaceSpanM36545b4 = C17056l0.m36545b(i13);
        if (typefaceSpanM36545b4 == null) {
            typefaceSpanM36545b4 = new TypefaceSpan("sans-serif-medium");
        }
        highlightTextHelper.m54120f(desc, pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(textTagEnum4, typefaceSpanM36545b4));
    }

    /* JADX INFO: renamed from: F3 */
    public static final DistributionRetentionEntity m28557F3(DistributionRetentionDialog distributionRetentionDialog) {
        Bundle arguments = distributionRetentionDialog.getArguments();
        if (arguments != null) {
            return (DistributionRetentionEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Boolean m28558K3(DistributionRetentionDialog distributionRetentionDialog) {
        Bundle arguments = distributionRetentionDialog.getArguments();
        if (arguments != null) {
            return Boolean.valueOf(RouteExKt.m56252i(arguments, "IS_FROM_AIRDROP", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m28559L3(DistributionRetentionDialog distributionRetentionDialog) {
        distributionRetentionDialog.m28568O3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m28560M3(DistributionRetentionDialog distributionRetentionDialog) {
        distributionRetentionDialog.m28568O3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m28561N3(DistributionRetentionDialog distributionRetentionDialog) {
        distributionRetentionDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Integer m28562P3(DistributionRetentionDialog distributionRetentionDialog) {
        Bundle arguments = distributionRetentionDialog.getArguments();
        if (arguments != null) {
            return Integer.valueOf(RouteExKt.m56260m(arguments, "CONTENT_RES_ID"));
        }
        return null;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m28568O3() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        dismissAllowingStateLoss();
        if (C27025c.m66566d(m28567J3())) {
            C46894j c46894j = C46894j.f104736a;
            InputPanelCouponEvent.Companion companion = InputPanelCouponEvent.f23041c;
            if (!C46392a.m102322d(c46894j.m103272k(companion.getCouponId()), false)) {
                String name = InputPanelCouponEvent.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String string = getString(R$string.kumex_airdrop_trade_tips);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C12572a.m23695d(name, new InputPanelCouponEvent(string, companion.getCouponId()), 0L, 4, null);
            }
        }
    }
}
