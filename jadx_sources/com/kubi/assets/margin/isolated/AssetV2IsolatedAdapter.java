package com.kubi.assets.margin.isolated;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetV2IsolatedAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/AssetV2IsolatedAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/margin/api/entity/MarginPosition;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "<init>", "(Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;)V", "getFragment", "()Lcom/kubi/assets/margin/isolated/AssetV2IsolatedFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetV2IsolatedAdapter extends BaseQuickAdapter<MarginPosition, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetV2IsolatedFragment f18034i;

    /* JADX INFO: renamed from: j */
    public boolean f18035j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2IsolatedAdapter(@NotNull AssetV2IsolatedFragment fragment) {
        super(R$layout.item_asset_isolated_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18034i = fragment;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m17907i(MarginPosition marginPosition) {
        InterfaceC37749a.a.m85109d(C37304a.f82764a, C27041f.m66668h(marginPosition.getTag()), 5L, null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final MarginPosition entity) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2IsolatedAdapter.m17907i(entity);
            }
        }, 1, null);
        TextView textView = (TextView) helper.getView(R$id.tvType);
        Intrinsics.checkNotNull(textView);
        ViewExtKt.m66577h(textView);
        Boolean boolIsShowDirection = entity.isShowDirection();
        if (boolIsShowDirection != null) {
            boolean zBooleanValue = boolIsShowDirection.booleanValue();
            ViewExtKt.m66594y(textView);
            textView.setText(zBooleanValue ? R$string.multi : R$string.empty);
            Context contextRequireContext = this.f18034i.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            textView.setBackground(C22890g.m54283h(zBooleanValue, contextRequireContext));
            Context contextRequireContext2 = this.f18034i.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            textView.setTextColor(C22890g.m54281f(contextRequireContext2, zBooleanValue));
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(entity.getTag()));
        helper.setText(R$id.tvSymbol, C27041f.m66669i(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null, "- -"));
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        IMarginService.m37899R(assetsDepend.m19183d(), (ViewGroup) helper.getView(R$id.margin_risk_view), this.f18034i, C27041f.m66668h(entity.getStatus()), C27039d.m66647g(entity.calculatorLiabilityRate()), C27041f.m66668h(entity.getRiskGrade()), symbolInfoEntityM85601B, assetsDepend.m19183d().mo37963u0(true, C27041f.m66668h(entity.getTag())), assetsDepend.m19183d().mo37962u(true, C27041f.m66668h(entity.getTag())), true, null, false, 1536, null);
        ((IsolatedPositionView) helper.getView(R$id.positionView)).m17999c(this.f18034i, entity);
        ShowHideTextView.m54778d(helper.itemView, this.f18035j);
    }

    /* JADX INFO: renamed from: j */
    public final void m17909j(boolean z11) {
        this.f18035j = z11;
    }
}
