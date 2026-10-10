package com.kubi.futures.dialog;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36818p0;
import fm.C37569d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p429lf.C42180b;
import p729wl.C45875l0;
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
import p852kotlin.text.Typography;
import th.InterfaceC44980d;
import w00.C45681e;

/* JADX INFO: compiled from: PositionRiskRatioDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/dialog/PositionRiskRatioDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "getPosition", "()Lcom/kubi/kumex/data/trade/model/PositionEntity;", "position$delegate", "Lkotlin/Lazy;", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDialogPositionCrossRiskRatioBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDialogPositionCrossRiskRatioBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initType", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setContents", "setCurrentValue", "setModifyValue", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "formatModifyValue", "", "value", "Ljava/math/BigDecimal;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionRiskRatioDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionRiskRatioDialog.kt\ncom/kubi/futures/dialog/PositionRiskRatioDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,178:1\n143#2,20:179\n*S KotlinDebug\n*F\n+ 1 PositionRiskRatioDialog.kt\ncom/kubi/futures/dialog/PositionRiskRatioDialog\n*L\n67#1:179,20\n*E\n"})
public final class PositionRiskRatioDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f22799q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.dialog.c1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PositionRiskRatioDialog.m25206r4(this.f22830b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final InterfaceC24293a f22800r0 = C45681e.m100799e(this, new Function1<PositionRiskRatioDialog, C36818p0>() { // from class: com.kubi.futures.dialog.PositionRiskRatioDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36818p0 invoke(@NotNull PositionRiskRatioDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36818p0.m82497a(fragment.requireView());
        }
    }, new Function1<C36818p0, Unit>() { // from class: com.kubi.futures.dialog.PositionRiskRatioDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C36818p0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36818p0 c36818p0) {
            invoke(c36818p0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ KProperty<Object>[] f22798t0 = {Reflection.property1(new PropertyReference1Impl(PositionRiskRatioDialog.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionCrossRiskRatioBinding;", 0))};

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f22797s0 = new Companion(null);

    /* JADX INFO: compiled from: PositionRiskRatioDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/dialog/PositionRiskRatioDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "manager", "Landroidx/fragment/app/FragmentManager;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager manager, @NotNull PositionEntity position) {
            Intrinsics.checkNotNullParameter(manager, "manager");
            Intrinsics.checkNotNullParameter(position, "position");
            if (!C37569d.m84649A(position)) {
                C13080f1.m25280b(manager);
                return;
            }
            PositionRiskRatioDialog positionRiskRatioDialog = new PositionRiskRatioDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", position);
            positionRiskRatioDialog.setArguments(bundle);
            positionRiskRatioDialog.show(manager, "CrossRiskRatioDialog");
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.dialog.PositionRiskRatioDialog$a */
    /* JADX INFO: compiled from: PositionRiskRatioDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/futures/dialog/PositionRiskRatioDialog$setContents$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13050a extends ClickableSpan {
        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            Router.f46192a.m56184f(C45875l0.f103336a.m101344l0()).m4048k();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(false);
            ds2.setColor(C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: n4 */
    private final PositionEntity m25203n4() {
        return (PositionEntity) this.f22799q0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: N3 */
    public int mo24511N3() {
        return 8;
    }

    /* JADX INFO: renamed from: m4 */
    public final String m25207m4(BigDecimal bigDecimal) {
        String strM92642g;
        return (bigDecimal == null || (strM92642g = C42180b.m92642g(bigDecimal, null, RoundingMode.UP, 0, false, false, true, 21, null)) == null) ? C37569d.m84684y() : strM92642g;
    }

    /* JADX INFO: renamed from: o4 */
    public final C36818p0 m25208o4() {
        return (C36818p0) this.f22800r0.getValue(this, f22798t0[0]);
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.bkumex_dialog_position_cross_risk_ratio, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AppCompatImageView appCompatImageView;
        KcPrimaryButton kcPrimaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (m25203n4() == null) {
            dismissAllowingStateLoss();
            return;
        }
        InterfaceC44980d interfaceC44980dM20288g = RepositoryServiceLocator.f19236a.m20288g();
        PositionEntity positionEntityM25203n4 = m25203n4();
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(interfaceC44980dM20288g, C27041f.m66668h(positionEntityM25203n4 != null ? positionEntityM25203n4.getSymbol() : null), false, 2, null);
        if (contractEntityM99529O == null) {
            dismissAllowingStateLoss();
            return;
        }
        m25209s4();
        m25210t4();
        m25211u4(contractEntityM99529O);
        C36818p0 c36818p0M25208o4 = m25208o4();
        if (c36818p0M25208o4 != null && (kcPrimaryButton = c36818p0M25208o4.f80767c) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.futures.dialog.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionRiskRatioDialog.m25204p4(this.f22835b);
                }
            }, 1, null);
        }
        C36818p0 c36818p0M25208o5 = m25208o4();
        if (c36818p0M25208o5 == null || (appCompatImageView = c36818p0M25208o5.f80766b) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.futures.dialog.e1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionRiskRatioDialog.m25205q4(this.f22838b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: p4 */
    public static final Unit m25204p4(PositionRiskRatioDialog positionRiskRatioDialog) {
        positionRiskRatioDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m25205q4(PositionRiskRatioDialog positionRiskRatioDialog) {
        positionRiskRatioDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final PositionEntity m25206r4(PositionRiskRatioDialog positionRiskRatioDialog) {
        Bundle arguments = positionRiskRatioDialog.getArguments();
        if (arguments != null) {
            return (PositionEntity) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public final void m25209s4() {
        C36818p0 c36818p0M25208o4 = m25208o4();
        if (c36818p0M25208o4 == null) {
            return;
        }
        c36818p0M25208o4.f80784t.setText(getString(R$string.kumex_position_risk_ratio_tips));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        BaseTextView notice = c36818p0M25208o4.f80784t;
        Intrinsics.checkNotNullExpressionValue(notice, "notice");
        highlightTextHelper.m54120f(notice, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text))));
        c36818p0M25208o4.f80774j.setMovementMethod(LinkMovementMethod.getInstance());
        c36818p0M25208o4.f80774j.setHighlightColor(0);
        c36818p0M25208o4.f80774j.setText(new C27096v0().append(getString(R$string.kumex_cross_risk_rate_desc)).m66903c(getString(R$string.learn_more) + Typography.greater, new C13050a()));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m25210t4() {
        CharSequence charSequenceM84684y;
        CharSequence charSequenceM84684y2;
        C36818p0 c36818p0M25208o4 = m25208o4();
        if (c36818p0M25208o4 == null) {
            return;
        }
        c36818p0M25208o4.f80769e.setText(getString(R$string.kumex_init_margin_rate) + "(IMR)");
        c36818p0M25208o4.f80772h.setText(getString(R$string.kumex_maintenance_margin_rate) + "(MMR)");
        BaseTextView baseTextView = c36818p0M25208o4.f80770f;
        PositionEntity positionEntityM25203n4 = m25203n4();
        if (positionEntityM25203n4 == null || (charSequenceM84684y = C37569d.m84662c(positionEntityM25203n4)) == null) {
            charSequenceM84684y = C37569d.m84684y();
        }
        baseTextView.setText(charSequenceM84684y);
        BaseTextView baseTextView2 = c36818p0M25208o4.f80773i;
        PositionEntity positionEntityM25203n5 = m25203n4();
        if (positionEntityM25203n5 == null || (charSequenceM84684y2 = C37569d.m84665f(positionEntityM25203n5)) == null) {
            charSequenceM84684y2 = C37569d.m84684y();
        }
        baseTextView2.setText(charSequenceM84684y2);
    }

    /* JADX INFO: renamed from: u4 */
    public final void m25211u4(ContractEntity contractEntity) {
        BigDecimal adjustCrossIMR;
        C36818p0 c36818p0M25208o4 = m25208o4();
        if (c36818p0M25208o4 == null) {
            return;
        }
        if (C27039d.m66652l(contractEntity.getAdjustActiveTime()) > 0) {
            Group modifyGroup = c36818p0M25208o4.f80776l;
            Intrinsics.checkNotNullExpressionValue(modifyGroup, "modifyGroup");
            C27046k.m66685H(modifyGroup);
            c36818p0M25208o4.f80783s.setText(C42179a.m92633f(C27039d.m66652l(contractEntity.getAdjustActiveTime()), null, false, false, null, 15, null));
            c36818p0M25208o4.f80777m.setText(getString(R$string.kumex_init_margin_rate) + "(IMR)");
            c36818p0M25208o4.f80780p.setText(getString(R$string.kumex_maintenance_margin_rate) + "(MMR)");
            BaseTextView baseTextView = c36818p0M25208o4.f80778n;
            PositionEntity positionEntityM25203n4 = m25203n4();
            BigDecimal adjustCrossMMR = null;
            if (positionEntityM25203n4 != null) {
                adjustCrossIMR = positionEntityM25203n4.getAdjustCrossIMR();
            } else {
                adjustCrossIMR = null;
            }
            baseTextView.setText(m25207m4(adjustCrossIMR));
            BaseTextView baseTextView2 = c36818p0M25208o4.f80781q;
            PositionEntity positionEntityM25203n5 = m25203n4();
            if (positionEntityM25203n5 != null) {
                adjustCrossMMR = positionEntityM25203n5.getAdjustCrossMMR();
            }
            baseTextView2.setText(m25207m4(adjustCrossMMR));
            return;
        }
        Group modifyGroup2 = c36818p0M25208o4.f80776l;
        Intrinsics.checkNotNullExpressionValue(modifyGroup2, "modifyGroup");
        ViewExtKt.m66577h(modifyGroup2);
    }
}
