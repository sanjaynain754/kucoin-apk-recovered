package com.kubi.loan.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.loan.R$id;
import com.kubi.loan.R$layout;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.extensions.core.ViewExtKt;
import gf.C37890n;
import jo.C40460k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ChooseCoinView.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/loan/view/ChooseCoinView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bloanViewChooseCoinBinding", "Lcom/kubi/loan/databinding/BloanViewChooseCoinBinding;", "setCoin", "", "coin", "", "setPair", "symbol", "coinInfo", "Lcom/kubi/data/entity/CoinInfoEntity;", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChooseCoinView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public C40460k f32485b;

    public final void setCoin(@NotNull String coin) {
        Intrinsics.checkNotNullParameter(coin, "coin");
        setCoin(C37890n.f85269a.m85613u(coin));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseCoinView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LayoutInflater.from(context).inflate(R$layout.bloan_view_choose_coin, this);
        C40460k c40460kM89109a = C40460k.m89109a(findViewById(R$id.ll_coin_info));
        Intrinsics.checkNotNullExpressionValue(c40460kM89109a, "bind(...)");
        this.f32485b = c40460kM89109a;
    }

    public final void setCoin(@Nullable CoinInfoEntity coinInfo) {
        TextView tvName = this.f32485b.f89830f;
        Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
        ViewExtKt.m66594y(tvName);
        CoinAvatarView ivIcon = this.f32485b.f89827c;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        ViewExtKt.m66594y(ivIcon);
        C24277v.m58542g(this.f32485b.f89827c, coinInfo != null ? coinInfo.getIconUrl() : null);
        this.f32485b.f89829e.setText(coinInfo != null ? coinInfo.getCurrency() : null);
        this.f32485b.f89830f.setText(coinInfo != null ? coinInfo.getName() : null);
    }

    public final void setPair(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f32485b.f89829e.setText(symbol);
        TextView tvName = this.f32485b.f89830f;
        Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
        ViewExtKt.m66577h(tvName);
        CoinAvatarView ivIcon = this.f32485b.f89827c;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        ViewExtKt.m66577h(ivIcon);
    }
}
