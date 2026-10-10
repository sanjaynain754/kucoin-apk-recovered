package com.kubi.home.rank.impl;

import android.graphics.drawable.Drawable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.home.R$color;
import com.kubi.home.rank.impl.cache.RankItem;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.rank.impl.b */
/* JADX INFO: compiled from: RankEx.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a=\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0000\u001a\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0016\u0010\u0018\u001a\u00020\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0000¨\u0006\u0019"}, m90084d2 = {"setRightDrawable", "", "Landroid/widget/TextView;", "drawable", "Landroid/graphics/drawable/Drawable;", "clearDrawable", "catchException", "block", "Lkotlin/Function0;", "errorBlock", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "e", "getPairShowSymbol", "Lcom/kubi/utils/StyledText;", "Lcom/kubi/data/entity/TradeItemBean;", "fontSize", "", "buildChangeRateSingle", "rankItem", "Lcom/kubi/home/rank/impl/cache/RankItem;", "buildChangeRateBlock", "getBaseCurrencyName", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C14768b {
    /* JADX INFO: renamed from: a */
    public static final void m29928a(@NotNull TextView textView, @NotNull RankItem rankItem) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rankItem, "rankItem");
        textView.setText(rankItem.getChangeRateString());
        textView.setBackground(rankItem.getChangeRateBg());
    }

    /* JADX INFO: renamed from: b */
    public static final void m29929b(@NotNull TextView textView, @NotNull RankItem rankItem) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(rankItem, "rankItem");
        textView.setText(rankItem.getChangeRateString());
        textView.setTextColor(rankItem.getChangeRateColor());
        textView.setBackground(rankItem.getChangeRateBgAlpha8());
    }

    /* JADX INFO: renamed from: c */
    public static final void m29930c(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C27096v0 m29931d(@NotNull TradeItemBean tradeItemBean, int i11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        C27096v0 c27096v0M66904d = new C27096v0().m66904d(tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName(), i11);
        Intrinsics.checkNotNullExpressionValue(c27096v0M66904d, "appendDip(...)");
        return c27096v0M66904d;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C27096v0 m29932e(@NotNull TradeItemBean tradeItemBean, int i11) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        C27096v0 c27096v0M66903c = new C27096v0().m66904d(tradeItemBean.getSymbolInfoEntity().getBaseCurrencyName(), i11).m66903c(" /" + tradeItemBean.getSymbolInfoEntity().getQuoteCurrencyName(), new ForegroundColorSpan(C27017c.f54310a.m66512a(R$color.emphasis40)), new AbsoluteSizeSpan(12, true));
        Intrinsics.checkNotNullExpressionValue(c27096v0M66903c, "append(...)");
        return c27096v0M66903c;
    }

    /* JADX INFO: renamed from: f */
    public static final void m29933f(@NotNull TextView textView, @NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}
