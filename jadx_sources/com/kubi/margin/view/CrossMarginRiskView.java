package com.kubi.margin.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.LeverBean;
import com.kubi.margin.view.CrossMarginRiskView;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import q30.C43608h;

/* JADX INFO: compiled from: CrossMarginRiskView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/margin/view/CrossMarginRiskView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boardView", "Lcom/kubi/margin/view/DashBoardView;", "textView", "Lcom/kubi/resources/widget/DashTextView;", "riskGradeArray", "", "", "setRisk", "", "riskData", "Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "getPercent", "", "getDangerLevelAndColor", "Lkotlin/Pair;", "", "showTipsDialog", "fragment", "Landroidx/fragment/app/Fragment;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CrossMarginRiskView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final DashBoardView f34221b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final DashTextView f34222c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public List<Double> f34223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossMarginRiskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34223d = CollectionsKt.arrayListOf(Double.valueOf(0.6d), Double.valueOf(0.9d));
        setOrientation(0);
        DashBoardView dashBoardView = new DashBoardView(context);
        this.f34221b = dashBoardView;
        DashTextView dashTextView = new DashTextView(context);
        this.f34222c = dashTextView;
        dashTextView.setNeedDash(true);
        dashTextView.setDashColor(C27017c.f54310a.m66512a(R$color.c_text40));
        dashTextView.setTextSize(12.0f);
        addView(dashBoardView, new LinearLayout.LayoutParams(C27029c.m66601d(this, 20), C27029c.m66601d(this, 20)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C27029c.m66601d(this, 4));
        addView(dashTextView, layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m40658i() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m40659j(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m40660k(MarginRiskView.InterfaceC18593a interfaceC18593a, DialogInterface dialogInterface, int i11) {
        String strM66668h;
        TransferJumper.Companion companion = TransferJumper.f21427a;
        if (interfaceC18593a.mo40121b()) {
            SymbolInfoEntity symbolInfoEntityMo40124e = interfaceC18593a.mo40124e();
            strM66668h = C27041f.m66668h(symbolInfoEntityMo40124e != null ? symbolInfoEntityMo40124e.getQuoteCurrency() : null);
        } else {
            strM66668h = C27041f.m66668h(interfaceC18593a.mo40651a());
        }
        String str = strM66668h;
        SymbolInfoEntity symbolInfoEntityMo40124e2 = interfaceC18593a.mo40124e();
        TransferJumper.Companion.jumpToTransfer$default(companion, str, null, C27041f.m66668h(symbolInfoEntityMo40124e2 != null ? symbolInfoEntityMo40124e2.getSymbol() : null), "TRADE", interfaceC18593a.mo40121b() ? SharedPositionInfo.MARGIN_MODE_ISOLATED : "MARGIN", false, null, 98, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:39:0x0143  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0183  */
    /* JADX WARN: Code duplicated, block: B:56:0x0186  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x009d, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public final void m40663h(Fragment fragment, final MarginRiskView.InterfaceC18593a interfaceC18593a) {
        String string;
        C27096v0 c27096v0;
        String strM92642g;
        String strM92642g2;
        int i11;
        C43852m.m96591c(interfaceC18593a.mo40121b() ? "B4tradingIsolated" : "B4tradingCross", "orderManagement", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING, null, 8, null);
        if (interfaceC18593a.mo40121b()) {
            int i12 = R$string.margin_single_symbol_account;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            SymbolInfoEntity symbolInfoEntityMo40124e = interfaceC18593a.mo40124e();
            sb2.append(C27041f.m66668h(symbolInfoEntityMo40124e != null ? symbolInfoEntityMo40124e.getShowSymbol() : null));
            string = fragment.getString(i12, sb2.toString());
        } else {
            string = fragment.getString(R$string.margin_whole_account);
        }
        Intrinsics.checkNotNull(string);
        switch (interfaceC18593a.status()) {
            case "LIABILITY":
                c27096v0 = new C27096v0().append(fragment.getString(R$string.margin_dialog_liability_tips, string));
                Intrinsics.checkNotNull(c27096v0);
                break;
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                c27096v0 = new C27096v0().append(fragment.getString(R$string.margin_dialog_liquidation_tips, string));
                Intrinsics.checkNotNull(c27096v0);
                break;
            case "BANKRUPTCY":
                c27096v0 = new C27096v0().append(fragment.getString(R$string.margin_dialog_liability_tips, string));
                Intrinsics.checkNotNull(c27096v0);
                break;
            default:
                c27096v0 = new C27096v0();
                c27096v0.append(fragment.getString(R$string.kc_margin_riskrate_description) + '\n');
                c27096v0.append(fragment.getString(R$string.kc_margin_pledge_rate_description) + '\n');
                StringBuilder sb3 = new StringBuilder();
                int i13 = R$string.kc_margin_pledge_rate_description2;
                BigDecimal bigDecimalMo40125f = interfaceC18593a.mo40125f();
                if (bigDecimalMo40125f != null) {
                    strM92642g = C42180b.m92642g(bigDecimalMo40125f, null, null, 0, false, false, false, 63, null);
                } else {
                    strM92642g = null;
                }
                sb3.append(fragment.getString(i13, C42180b.m92649n(strM92642g)));
                sb3.append('\n');
                c27096v0.append(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                int i14 = R$string.kc_margin_riskrate_description2;
                BigDecimal bigDecimalMo40123d = interfaceC18593a.mo40123d();
                if (bigDecimalMo40123d != null) {
                    strM92642g2 = C42180b.m92642g(bigDecimalMo40123d, null, null, 0, false, false, false, 63, null);
                } else {
                    strM92642g2 = null;
                }
                sb4.append(fragment.getString(i14, C42180b.m92649n(strM92642g2)));
                sb4.append('\n');
                c27096v0.append(sb4.toString());
                break;
        }
        switch (interfaceC18593a.status()) {
            case "LIABILITY":
                i11 = R$string.liability;
                break;
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                i11 = R$string.margin_liq_ing;
                break;
            case "BANKRUPTCY":
                i11 = R$string.liability;
                break;
            default:
                i11 = R$string.debt_ratio;
                break;
        }
        if (i11 != R$string.debt_ratio) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54155L4(c27096v0).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: xp.c
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    CrossMarginRiskView.m40659j(baseViewHolder, dialogFragmentHelper);
                }
            }).m54163T4(fragment.getString(R$string.i_already_know), null);
            if (interfaceC18593a.mo40124e() == null && TextUtils.isEmpty(interfaceC18593a.mo40651a())) {
                return;
            }
            if (Intrinsics.areEqual(interfaceC18593a.status(), "LIABILITY") || Intrinsics.areEqual(interfaceC18593a.status(), "BANKRUPTCY")) {
                alertDialogFragmentHelperM54163T4.m54160Q4(fragment.getString(R$string.go_transfer), new DialogInterface.OnClickListener() { // from class: xp.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        CrossMarginRiskView.m40660k(interfaceC18593a, dialogInterface, i15);
                    }
                });
            }
            alertDialogFragmentHelperM54163T4.m54172c5(fragment.getChildFragmentManager());
            return;
        }
        C43608h c43608h = C43608h.f96261a;
        String string2 = fragment.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String strValueOf = String.valueOf(c27096v0);
        String string3 = fragment.getString(R$string.i_already_know);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        c43608h.m95969d(childFragmentManager, string2, strValueOf, string3, new Function0() { // from class: xp.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginRiskView.m40658i();
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x0126  */
    /* JADX WARN: Code duplicated, block: B:31:0x0133  */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00eb. Please report as an issue. */
    public final void setRisk(@NotNull final MarginRiskView.InterfaceC18593a riskData) {
        double d11;
        Intrinsics.checkNotNullParameter(riskData, "riskData");
        List<Double> riskGradeByString = LeverBean.f33019a.getRiskGradeByString(C27041f.m66668h(riskData.mo40122c()));
        List<Double> list = riskGradeByString;
        if (riskGradeByString == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Double.valueOf(0.6d));
            arrayList.add(Double.valueOf(0.9d));
            list = arrayList;
        }
        this.f34223d = list;
        Pair<String, Integer> pairM40661e = m40661e(riskData);
        String strM40662f = m40662f(riskData);
        if (riskData.value() == -2.0d) {
            this.f34222c.setText(strM40662f);
            this.f34222c.setTextColor(pairM40661e.getSecond().intValue());
        } else {
            this.f34222c.setText(pairM40661e.getFirst() + ' ' + strM40662f);
            this.f34222c.setTextColor(pairM40661e.getSecond().intValue());
        }
        double dM66646f = 0.0d;
        this.f34221b.setData(CollectionsKt.arrayListOf(new Triple(Double.valueOf(0.0d), this.f34223d.get(0), Integer.valueOf(R$color.primary)), new Triple(this.f34223d.get(0), this.f34223d.get(1), Integer.valueOf(R$color.complementary)), new Triple(this.f34223d.get(1), Double.valueOf(1.0d), Integer.valueOf(R$color.secondary))));
        DashBoardView dashBoardView = this.f34221b;
        switch (riskData.status()) {
            case "LIABILITY":
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                d11 = 1.0d;
                break;
            case "IN_AUTO_RENEW":
            case "FROZEN_RENEW":
                dM66646f = C27039d.m66646f(Double.valueOf(riskData.value()));
                d11 = dM66646f;
                break;
            case "BANKRUPTCY":
                d11 = 1.0d;
                break;
            default:
                dM66646f = C27039d.m66646f(Double.valueOf(riskData.value()));
                d11 = dM66646f;
                break;
        }
        DashBoardView.m40665d(dashBoardView, d11, false, 2, null);
        C27046k.m66711z(this, 0L, new Function0() { // from class: xp.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CrossMarginRiskView.m40657g(this.f103885b, riskData);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m40657g(CrossMarginRiskView crossMarginRiskView, MarginRiskView.InterfaceC18593a interfaceC18593a) {
        crossMarginRiskView.m40663h(interfaceC18593a.mo40120H(), interfaceC18593a);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r0.equals("IN_AUTO_RENEW") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        return new p852kotlin.Pair<>(getContext().getString(com.kubi.margin.R$string.margin_renew), java.lang.Integer.valueOf(getResources().getColor(com.kubi.margin.R$color.secondary)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r0.equals("FROZEN_FL") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0.equals("IN_LIQUIDATION") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        return new p852kotlin.Pair<>(getContext().getString(com.kubi.margin.R$string.margin_liq_ing), java.lang.Integer.valueOf(getResources().getColor(com.kubi.margin.R$color.secondary)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r0.equals("LIABILITY") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f1, code lost:
    
        return new p852kotlin.Pair<>(getContext().getString(com.kubi.margin.R$string.liability), java.lang.Integer.valueOf(getResources().getColor(com.kubi.margin.R$color.secondary)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0.equals("BANKRUPTCY") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0.equals("FROZEN_RENEW") == false) goto L26;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<String, Integer> m40661e(MarginRiskView.InterfaceC18593a interfaceC18593a) {
        String strStatus = interfaceC18593a.status();
        switch (strStatus.hashCode()) {
            case -2033975059:
                break;
            case -1060904193:
                break;
            case -1050123579:
                break;
            case -311845065:
                break;
            case 321192974:
                break;
            case 1461662585:
                break;
            default:
                LeverBean.Companion companion = LeverBean.f33019a;
                return new Pair<>(companion.getTextByRate(interfaceC18593a.value(), this.f34223d.get(0).doubleValue(), this.f34223d.get(1).doubleValue()), Integer.valueOf(getResources().getColor(companion.getColorByRate(interfaceC18593a.value(), this.f34223d.get(0).doubleValue(), this.f34223d.get(1).doubleValue()))));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public final String m40662f(MarginRiskView.InterfaceC18593a interfaceC18593a) {
        double dValue;
        String strStatus = interfaceC18593a.status();
        String strM92642g = null;
        switch (strStatus.hashCode()) {
            case -2033975059:
                if (!strStatus.equals("LIABILITY")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue && dValue <= 1.0d) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            case -1060904193:
                if (!strStatus.equals("IN_LIQUIDATION")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            case -1050123579:
                if (!strStatus.equals("FROZEN_FL")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            case -311845065:
                if (!strStatus.equals("IN_AUTO_RENEW")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            case 321192974:
                if (!strStatus.equals("FROZEN_RENEW")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            case 1461662585:
                if (!strStatus.equals("BANKRUPTCY")) {
                    dValue = interfaceC18593a.value();
                    if (0.0d <= dValue) {
                        strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                    }
                }
                break;
            default:
                dValue = interfaceC18593a.value();
                if (0.0d <= dValue) {
                    strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(interfaceC18593a.value())), null, null, 0, false, true, false, 47, null);
                }
                break;
        }
        return C42180b.m92649n(strM92642g);
    }
}
