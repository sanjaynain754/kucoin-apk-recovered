package com.kubi.margin.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.entity.LeverBean;
import com.kubi.margin.view.MarginRiskView;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import f30.C37330a;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36946w0;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import q30.C43608h;

/* JADX INFO: compiled from: MarginRiskView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0011H\u0003R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/margin/view/MarginRiskView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "bmarginViewLeverRiskBinding", "Lcom/kubi/margin/databinding/BmarginViewLeverRiskBinding;", "riskGradeArray", "", "", "setRisk", "", "riskData", "Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "showDashboard", "", "showTipsDialog", "fragment", "Landroidx/fragment/app/Fragment;", "IRiskData", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarginRiskView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public C36946w0 f34258b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public List<Double> f34259c;

    /* JADX INFO: renamed from: com.kubi.margin.view.MarginRiskView$a */
    /* JADX INFO: compiled from: MarginRiskView.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\u000fH&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/view/MarginRiskView$IRiskData;", "", "fragment", "Landroidx/fragment/app/Fragment;", "status", "", "value", "", "riskGrade", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "transferableAmountDebtRatio", "Ljava/math/BigDecimal;", "flDebtRatio", "isIsolateMargin", "", "quoteCurrency", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC18593a {
        @NotNull
        /* JADX INFO: renamed from: H */
        Fragment mo40120H();

        @Nullable
        /* JADX INFO: renamed from: a */
        default String mo40651a() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        boolean mo40121b();

        @NotNull
        /* JADX INFO: renamed from: c */
        String mo40122c();

        @Nullable
        /* JADX INFO: renamed from: d */
        BigDecimal mo40123d();

        @Nullable
        /* JADX INFO: renamed from: e */
        SymbolInfoEntity mo40124e();

        @Nullable
        /* JADX INFO: renamed from: f */
        BigDecimal mo40125f();

        @NotNull
        String status();

        double value();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginRiskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34259c = CollectionsKt.arrayListOf(Double.valueOf(0.6d), Double.valueOf(0.9d));
        setOrientation(0);
        LayoutInflater.from(context).inflate(R$layout.bmargin_view_lever_risk, this);
        C36946w0 c36946w0M82761a = C36946w0.m82761a(findViewById(R$id.root_view));
        Intrinsics.checkNotNullExpressionValue(c36946w0M82761a, "bind(...)");
        this.f34258b = c36946w0M82761a;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m40705h() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m40706i(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView != null) {
            HighlightTextHelper.f43497a.m54116a(textView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.c_text)));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m40707j(InterfaceC18593a interfaceC18593a, DialogInterface dialogInterface, int i11) {
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
    /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00da  */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x0162  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:81:0x02d1  */
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: e */
    public final void m40708e(@NotNull final InterfaceC18593a riskData, boolean z11) {
        String textByRate;
        double dM66646f;
        Intrinsics.checkNotNullParameter(riskData, "riskData");
        LeverBean.Companion companion = LeverBean.f33019a;
        List<Double> riskGradeByString = companion.getRiskGradeByString(C27041f.m66668h(riskData.mo40122c()));
        List<Double> list = riskGradeByString;
        if (riskGradeByString == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Double.valueOf(0.6d));
            arrayList.add(Double.valueOf(0.9d));
            list = arrayList;
        }
        this.f34259c = list;
        this.f34258b.f82027e.setTextColor(getResources().getColor(companion.getColorByRate(riskData.value(), this.f34259c.get(0).doubleValue(), this.f34259c.get(1).doubleValue())));
        String strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(riskData.value())), null, null, 0, false, true, false, 47, null);
        ShowHideTextView showHideTextView = this.f34258b.f82027e;
        switch (riskData.status()) {
            case "LIABILITY":
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
            case "IN_AUTO_RENEW":
            case "FROZEN_RENEW":
            case "BANKRUPTCY":
                strM92642g = null;
            default:
                double dValue = riskData.value();
                if (0.0d <= dValue || dValue > 1.0d) {
                    strM92642g = null;
                }
                break;
        }
        showHideTextView.setText(C42180b.m92649n(strM92642g));
        this.f34258b.f82026d.setVisibility(riskData.value() == -2.0d ? 8 : 0);
        this.f34258b.f82026d.setBackground(C22890g.m54287l(getResources().getColor(companion.getColorByRate(riskData.value(), this.f34259c.get(0).doubleValue(), this.f34259c.get(1).doubleValue())), 4.0f));
        BaseTextView baseTextView = this.f34258b.f82026d;
        switch (riskData.status()) {
            case "LIABILITY":
                ShowHideTextView showHideTextView2 = this.f34258b.f82027e;
                Resources resources = getResources();
                int i11 = R$color.secondary;
                showHideTextView2.setTextColor(resources.getColor(i11));
                this.f34258b.f82026d.setBackground(C22890g.m54287l(getResources().getColor(i11), 4.0f));
                textByRate = getContext().getString(R$string.liability);
                break;
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                ShowHideTextView showHideTextView3 = this.f34258b.f82027e;
                Resources resources2 = getResources();
                int i12 = R$color.secondary;
                showHideTextView3.setTextColor(resources2.getColor(i12));
                this.f34258b.f82026d.setBackground(C22890g.m54287l(getResources().getColor(i12), 4.0f));
                textByRate = getContext().getString(R$string.margin_liq_ing);
                break;
            case "IN_AUTO_RENEW":
            case "FROZEN_RENEW":
                ShowHideTextView showHideTextView4 = this.f34258b.f82027e;
                Resources resources3 = getResources();
                int i13 = R$color.secondary;
                showHideTextView4.setTextColor(resources3.getColor(i13));
                this.f34258b.f82026d.setBackground(C22890g.m54287l(getResources().getColor(i13), 4.0f));
                textByRate = getContext().getString(R$string.margin_renew);
                break;
            case "BANKRUPTCY":
                ShowHideTextView showHideTextView5 = this.f34258b.f82027e;
                Resources resources4 = getResources();
                int i14 = R$color.secondary;
                showHideTextView5.setTextColor(resources4.getColor(i14));
                this.f34258b.f82026d.setBackground(C22890g.m54287l(getResources().getColor(i14), 4.0f));
                textByRate = getContext().getString(R$string.liability);
                break;
            default:
                textByRate = companion.getTextByRate(riskData.value(), this.f34259c.get(0).doubleValue(), this.f34259c.get(1).doubleValue());
                break;
        }
        baseTextView.setText(textByRate);
        DashBoardView dashboard = this.f34258b.f82024b;
        Intrinsics.checkNotNullExpressionValue(dashboard, "dashboard");
        C37330a.m83912d(dashboard, false);
        this.f34258b.f82024b.setData(CollectionsKt.arrayListOf(new Triple(Double.valueOf(0.0d), this.f34259c.get(0), Integer.valueOf(R$color.primary)), new Triple(this.f34259c.get(0), this.f34259c.get(1), Integer.valueOf(R$color.complementary)), new Triple(this.f34259c.get(1), Double.valueOf(1.0d), Integer.valueOf(R$color.secondary))));
        DashBoardView dashBoardView = this.f34258b.f82024b;
        switch (riskData.status()) {
            case "LIABILITY":
            case "IN_LIQUIDATION":
            case "FROZEN_FL":
                dM66646f = 1.0d;
                break;
            case "IN_AUTO_RENEW":
            case "FROZEN_RENEW":
                dM66646f = 0.0d;
                break;
            case "BANKRUPTCY":
                dM66646f = 1.0d;
                break;
            default:
                dM66646f = C27039d.m66646f(Double.valueOf(riskData.value()));
                break;
        }
        DashBoardView.m40665d(dashBoardView, dM66646f, false, 2, null);
        C27046k.m66711z(this, 0L, new Function0() { // from class: xp.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginRiskView.m40704f(this.f103897b, riskData);
            }
        }, 1, null);
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
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: g */
    public final void m40709g(Fragment fragment, final InterfaceC18593a interfaceC18593a) {
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
            AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(i11).m54155L4(c27096v0).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: xp.n
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    MarginRiskView.m40706i(baseViewHolder, dialogFragmentHelper);
                }
            }).m54163T4(fragment.getString(R$string.i_already_know), null);
            if ((interfaceC18593a.mo40124e() != null || !TextUtils.isEmpty(interfaceC18593a.mo40651a())) && (Intrinsics.areEqual(interfaceC18593a.status(), "LIABILITY") || Intrinsics.areEqual(interfaceC18593a.status(), "BANKRUPTCY"))) {
                alertDialogFragmentHelperM54163T4.m54160Q4(fragment.getString(R$string.go_transfer), new DialogInterface.OnClickListener() { // from class: xp.o
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        MarginRiskView.m40707j(interfaceC18593a, dialogInterface, i15);
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
        c43608h.m95969d(childFragmentManager, string2, strValueOf, string3, new Function0() { // from class: xp.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginRiskView.m40705h();
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m40704f(MarginRiskView marginRiskView, InterfaceC18593a interfaceC18593a) {
        marginRiskView.m40709g(interfaceC18593a.mo40120H(), interfaceC18593a);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarginRiskView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
