package com.kubi.copytrading.assets.lead;

import android.content.Context;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$drawable;
import com.kubi.copytrading.R$font;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.assets.LeadTradingPositionEntity;
import com.kubi.copytrading.assets.LeadTradingPositionFundsType;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.C22890g;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetLeadTradingAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetLeadTradingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetLeadTradingAdapter.kt\ncom/kubi/copytrading/assets/lead/AssetLeadTradingAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class AssetLeadTradingAdapter extends BaseQuickAdapter<LeadTradingPositionEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f19864i;

    public AssetLeadTradingAdapter() {
        super(R$layout.item_asset_lead_trading);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m20760i() {
        CopyTradingConfig.f19710a.m20588B("myLeading");
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull LeadTradingPositionEntity item) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        StringBuilder sb2;
        String strM92640e;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = getData().size() > 1 && helper.getBindingAdapterPosition() - getHeaderLayoutCount() < getData().size() - 1;
        View view = helper.getView(R$id.dividerView);
        Intrinsics.checkNotNull(view);
        if (z11) {
            C27046k.m66685H(view);
        } else {
            C27046k.m66700o(view);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            IKuMexService iKuMexService = IKuMexService.f28731a.get();
            String symbol = item.getSymbol();
            if (symbol == null) {
                symbol = "";
            }
            Object obj = iKuMexService.mo33286o(symbol).get("settleCurrency");
            objM103844constructorimpl = Result.m103844constructorimpl(obj != null ? obj.toString() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String strM66669i = C27041f.m66669i((String) objM103844constructorimpl, "--");
        try {
            Object obj2 = IKuMexService.f28731a.get().mo33269S(strM66669i).get("properties");
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            Object obj3 = map != null ? map.get("shortDisplayPrecision") : null;
            Number number = obj3 instanceof Number ? (Number) obj3 : null;
            objM103844constructorimpl2 = Result.m103844constructorimpl(number != null ? Integer.valueOf(number.intValue()) : null);
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl2)) {
            objM103844constructorimpl2 = null;
        }
        int iM66651k = C27039d.m66651k((Integer) objM103844constructorimpl2, 4);
        Context context = helper.itemView.getContext();
        helper.setText(R$id.tvSymbol, item.displaySymbolPlain());
        int i11 = R$id.tvDirection;
        BaseTextView baseTextView = (BaseTextView) helper.getView(i11);
        if (item.getPosition() == null) {
            helper.setText(i11, "--");
            baseTextView.setBackgroundResource(0);
            helper.setTextColor(i11, C27017c.f54310a.m66512a(R$color.c_text40));
        } else {
            boolean z12 = C41014a.m89922G(item.getPosition(), null, 1, null).compareTo(BigDecimal.ZERO) >= 0;
            helper.setText(i11, context.getString(z12 ? R$string.multi : R$string.empty));
            baseTextView.setBackgroundResource(z12 ? R$drawable.cptd_shape_lead_dir_long_bg : R$drawable.cptd_shape_lead_dir_short_bg);
            Intrinsics.checkNotNull(context);
            helper.setTextColor(i11, C22890g.m54281f(context, z12));
        }
        String string = context.getString(Intrinsics.areEqual(item.getMarginMode(), "CROSS") ? R$string.kumex_cross_position : R$string.kumex_isolate_position);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i12 = R$id.modeLeverage;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(' ');
        BigDecimal leverage = item.getLeverage();
        sb3.append(C27041f.m66669i(leverage != null ? C42180b.m92640e(leverage, null, 4, false, false, false, 0, null, 125, null) : null, C33820nf.f71144W));
        sb3.append('x');
        helper.setText(i12, sb3.toString());
        boolean z13 = item.getFundsTypeEnum() == LeadTradingPositionFundsType.LEAD_TRIAL;
        View view2 = helper.getView(R$id.tvLeadTrialTag);
        Intrinsics.checkNotNull(view2);
        if (z13) {
            C27046k.m66685H(view2);
        } else {
            C27046k.m66700o(view2);
        }
        helper.setText(R$id.tvPnlLabel, context.getString(R$string.copytd_position_pnl, strM66669i));
        helper.setText(R$id.tvInvestLabel, context.getString(R$string.margin) + '(' + strM66669i + ')');
        StringBuilder sb4 = new StringBuilder();
        sb4.append('(');
        BigDecimal pnlRatio = item.getPnlRatio();
        sb4.append(C42180b.m92649n(pnlRatio != null ? C42180b.m92642g(pnlRatio, null, null, 0, true, false, false, 55, null) : null));
        sb4.append(')');
        String string2 = sb4.toString();
        Intrinsics.checkNotNull(context);
        int iM54282g = C22890g.m54282g(context, C41014a.m89922G(item.getPnl(), null, 1, null), 0, 2, null);
        C27096v0 c27096v0 = new C27096v0();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C27039d.m66644d(item.getPnl()));
        BigDecimal pnl = item.getPnl();
        if (pnl != null) {
            sb2 = sb5;
            strM92640e = C42180b.m92640e(pnl, null, iM66651k, false, false, false, 2, null, 93, null);
        } else {
            sb2 = sb5;
            strM92640e = null;
        }
        sb2.append(C27041f.m66669i(strM92640e, "--"));
        sb2.append(' ');
        C27096v0 c27096v0M66903c = c27096v0.append(sb2.toString()).m66903c(string2, C22912t.m54408f(R$font.regular, iM54282g), new AbsoluteSizeSpan(12, true));
        int i13 = R$id.tvPnlValue;
        helper.setText(i13, c27096v0M66903c);
        helper.setTextColor(i13, iM54282g);
        int i14 = R$id.tvInvestValue;
        BigDecimal posMargin = item.getPosMargin();
        helper.setText(i14, C27041f.m66669i(posMargin != null ? C42180b.m92640e(posMargin, RoundingMode.UP, iM66651k, false, false, false, 2, null, 92, null) : null, "--"));
        ShowHideTextView.m54778d(helper.itemView, this.f19864i);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.copytrading.assets.lead.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetLeadTradingAdapter.m20760i();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m20762j(boolean z11) {
        this.f19864i = z11;
    }
}
