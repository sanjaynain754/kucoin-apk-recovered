package com.kubi.assets.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.WithdrawChainQuotaEntity;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawTaxDialog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawTaxDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "<init>", "()V", "data", "Lcom/kubi/assets/entity/WithdrawChainQuotaEntity;", "getData", "()Lcom/kubi/assets/entity/WithdrawChainQuotaEntity;", "data$delegate", "Lkotlin/Lazy;", "fee", "", "getFee", "()Ljava/lang/String;", "fee$delegate", "setupView", "", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "dialogFragmentHelper", "getTax", "getOnChainFee", "Ljava/math/BigDecimal;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WithdrawTaxDialog extends DialogFragmentHelper implements DialogFragmentHelper.InterfaceC22882b {

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public static final Companion f17013s0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final Lazy f17014q0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.p1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawTaxDialog.m16187m4(this.f17146b);
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public final Lazy f17015r0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.q1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WithdrawTaxDialog.m16188n4(this.f17199b);
        }
    });

    /* JADX INFO: compiled from: WithdrawTaxDialog.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/dialog/WithdrawTaxDialog$Companion;", "", "<init>", "()V", TIMPushProvider.f75062n, "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "data", "Lcom/kubi/assets/entity/WithdrawChainQuotaEntity;", "fee", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void show(@NotNull FragmentManager fragmentManager, @Nullable WithdrawChainQuotaEntity data, @Nullable String fee) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            WithdrawTaxDialog withdrawTaxDialog = new WithdrawTaxDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, R$layout.asset_dialog_withdraw_tax);
            bundle.putParcelable("data", data);
            bundle.putString("data_1", fee);
            bundle.putInt("type", 4);
            withdrawTaxDialog.setArguments(bundle);
            withdrawTaxDialog.show(fragmentManager, "WithdrawTaxDialog");
        }
    }

    /* JADX INFO: renamed from: p4 */
    private final String m16189p4() {
        return (String) this.f17015r0.getValue();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
    /* JADX INFO: renamed from: b3 */
    public void mo16191b3(@NotNull BaseViewHolder viewHolder, @NotNull DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tvContent;
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o4 = m16192o4();
        viewHolder.setText(i11, C27041f.m66668h(withdrawChainQuotaEntityM16192o4 != null ? withdrawChainQuotaEntityM16192o4.getTaxDescription() : null));
        int i12 = R$id.tvFee;
        BigDecimal bigDecimalM16193q4 = m16193q4();
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o5 = m16192o4();
        String strM89946t = C41014a.m89946t(bigDecimalM16193q4, null, C27039d.m66651k(withdrawChainQuotaEntityM16192o5 != null ? withdrawChainQuotaEntityM16192o5.getPrecision() : null, 8), false, false, false, false, false, null, 0, 509, null);
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o6 = m16192o4();
        viewHolder.setText(i12, C42828b.m93906g(strM89946t, C27041f.m66668h(withdrawChainQuotaEntityM16192o6 != null ? withdrawChainQuotaEntityM16192o6.getCurrency() : null), true, false, 4, null));
        viewHolder.setText(R$id.tvTax, m16194r4());
        View view = viewHolder.getView(R$id.tvConfirm);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.dialog.o1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WithdrawTaxDialog.m16190s4(this.f17144b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: o4 */
    public final WithdrawChainQuotaEntity m16192o4() {
        return (WithdrawChainQuotaEntity) this.f17014q0.getValue();
    }

    public WithdrawTaxDialog() {
        m54236e4(this);
    }

    /* JADX INFO: renamed from: m4 */
    public static final WithdrawChainQuotaEntity m16187m4(WithdrawTaxDialog withdrawTaxDialog) {
        Bundle arguments = withdrawTaxDialog.getArguments();
        if (arguments != null) {
            return (WithdrawChainQuotaEntity) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: n4 */
    public static final String m16188n4(WithdrawTaxDialog withdrawTaxDialog) {
        Bundle arguments = withdrawTaxDialog.getArguments();
        if (arguments != null) {
            return RouteExKt.m56284y(arguments, "data_1");
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m16190s4(WithdrawTaxDialog withdrawTaxDialog) {
        withdrawTaxDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public final BigDecimal m16193q4() {
        String taxTotalRate;
        Integer precision = null;
        BigDecimal bigDecimalM66535e = DowngradeExKt.m66535e(m16189p4(), null, 1, null);
        BigDecimal bigDecimal = BigDecimal.ONE;
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o4 = m16192o4();
        if (withdrawChainQuotaEntityM16192o4 != null) {
            taxTotalRate = withdrawChainQuotaEntityM16192o4.getTaxTotalRate();
        } else {
            taxTotalRate = null;
        }
        BigDecimal bigDecimalAdd = bigDecimal.add(DowngradeExKt.m66535e(taxTotalRate, null, 1, null));
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o5 = m16192o4();
        if (withdrawChainQuotaEntityM16192o5 != null) {
            precision = withdrawChainQuotaEntityM16192o5.getPrecision();
        }
        BigDecimal bigDecimalDivide = bigDecimalM66535e.divide(bigDecimalAdd, C27039d.m66651k(precision, 8), RoundingMode.DOWN);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    /* JADX INFO: renamed from: r4 */
    public final String m16194r4() {
        String taxTotalRate;
        boolean z11;
        String strM89937k;
        String taxTotalRate2;
        BigDecimal bigDecimalM66535e;
        int i11;
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o4 = m16192o4();
        String currency = null;
        if (withdrawChainQuotaEntityM16192o4 != null) {
            taxTotalRate = withdrawChainQuotaEntityM16192o4.getTaxTotalRate();
        } else {
            taxTotalRate = null;
        }
        if (DowngradeExKt.m66538h(taxTotalRate, 0.0d, 1, null) > 0.001d) {
            z11 = true;
        } else {
            z11 = false;
        }
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o5 = m16192o4();
        if (withdrawChainQuotaEntityM16192o5 != null && (taxTotalRate2 = withdrawChainQuotaEntityM16192o5.getTaxTotalRate()) != null && (bigDecimalM66535e = DowngradeExKt.m66535e(taxTotalRate2, null, 1, null)) != null) {
            if (z11) {
                i11 = 2;
            } else {
                i11 = 20;
            }
            strM89937k = C41014a.m89937k(bigDecimalM66535e, null, i11, false, false, z11, 5, null);
        } else {
            strM89937k = null;
        }
        String strM66669i = C27041f.m66669i(strM89937k, "--");
        BigDecimal bigDecimalSubtract = DowngradeExKt.m66535e(m16189p4(), null, 1, null).subtract(m16193q4());
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM66669i);
        sb2.append('(');
        String plainString = C6447a.m11724a(bigDecimalSubtract).toPlainString();
        WithdrawChainQuotaEntity withdrawChainQuotaEntityM16192o6 = m16192o4();
        if (withdrawChainQuotaEntityM16192o6 != null) {
            currency = withdrawChainQuotaEntityM16192o6.getCurrency();
        }
        sb2.append(C42828b.m93906g(plainString, C27041f.m66668h(currency), true, false, 4, null));
        sb2.append(')');
        return sb2.toString();
    }
}
