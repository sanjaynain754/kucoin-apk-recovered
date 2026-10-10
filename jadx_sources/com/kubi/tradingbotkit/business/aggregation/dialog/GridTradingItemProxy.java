package com.kubi.tradingbotkit.business.aggregation.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.business.aggregation.dialog.GridTradingItemProxy;
import com.kubi.tradingbotkit.model.GridTradingItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import l50.C42089q;
import n50.C42756a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048c2.C4781a0;
import p419l2.C42032f;
import p429lf.C42180b;
import p481ny.C42899b;
import p628t1.InterfaceC44616h;
import p778xy.C46338a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import zw.C46933d;

/* JADX INFO: compiled from: GridTradingItemProxy.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\"\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/aggregation/dialog/GridTradingItemProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/tradingbotkit/model/GridTradingItemModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "btradingBotKitGridTradingListItemBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitGridTradingListItemBinding;", "createView", "Landroid/view/View;", "bindView", "", "d", "loadIconByGlide", "iconUrl", "", "imageView", "Landroid/widget/ImageView;", "roundedCorner", "", "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridTradingItemProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridTradingItemProxy.kt\ncom/kubi/tradingbotkit/business/aggregation/dialog/GridTradingItemProxy\n+ 2 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,117:1\n45#2,4:118\n*S KotlinDebug\n*F\n+ 1 GridTradingItemProxy.kt\ncom/kubi/tradingbotkit/business/aggregation/dialog/GridTradingItemProxy\n*L\n107#1:118,4\n*E\n"})
public final class GridTradingItemProxy extends ViewHolderProxy<GridTradingItemModel> {
    public static final float CORNER_SIZE = 6.0f;

    @Nullable
    private C42089q btradingBotKitGridTradingListItemBinding;

    @Nullable
    private final ItemCallBack<GridTradingItemModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<GridTradingItemModel> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridTradingItemProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<GridTradingItemModel> itemCallBack, @Nullable ItemCallBack<GridTradingItemModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2$lambda$1(GridTradingItemProxy gridTradingItemProxy, GridTradingItemModel gridTradingItemModel, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ItemCallBack<GridTradingItemModel> shortCall = gridTradingItemProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, gridTradingItemProxy.getHolder().getAdapterPosition(), gridTradingItemModel);
        }
        return Unit.INSTANCE;
    }

    private final void loadIconByGlide(String iconUrl, ImageView imageView, float roundedCorner) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Context contextM66513b = C27017c.f54310a.m66513b();
            objM103844constructorimpl = Result.m103844constructorimpl(C46338a.m102151a(contextM66513b).mo6634v(iconUrl).mo6606a(C42032f.m92235s0(new C4781a0(C46933d.m103407a(contextM66513b, roundedCorner))).mo92188b0(R$mipmap.ic_placeholder).mo92217q0(new InterfaceC44616h[0])).m6594E0(imageView));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            imageView.setImageResource(R$mipmap.ic_placeholder);
            String simpleName = GridTradingItemProxy.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                return;
            }
            C42756a.m93685b(thM103847exceptionOrNullimpl, simpleName);
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final GridTradingItemModel d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        super.bindView(d11);
        C42089q c42089q = this.btradingBotKitGridTradingListItemBinding;
        if (c42089q != null) {
            c42089q.f93233j.setText(d11.getName());
            Boolean canSelect = d11.getCanSelect();
            Boolean bool = Boolean.FALSE;
            c42089q.f93230g.setImageResource(Intrinsics.areEqual(canSelect, bool) ? R$drawable.ic_arrow_right_24 : R$mipmap.kucoin_icon_trading_bot_select);
            ConstraintLayout constraintLayout = c42089q.f93231h;
            Boolean isSelected = d11.getIsSelected();
            Boolean bool2 = Boolean.TRUE;
            constraintLayout.setSelected(Intrinsics.areEqual(isSelected, bool2));
            if (Intrinsics.areEqual(d11.getIsSelected(), bool2) || Intrinsics.areEqual(d11.getCanSelect(), bool)) {
                ImageView ivGridSelect = c42089q.f93230g;
                Intrinsics.checkNotNullExpressionValue(ivGridSelect, "ivGridSelect");
                ViewExtKt.m66594y(ivGridSelect);
            } else {
                ImageView ivGridSelect2 = c42089q.f93230g;
                Intrinsics.checkNotNullExpressionValue(ivGridSelect2, "ivGridSelect");
                C27046k.m66703r(ivGridSelect2);
            }
            c42089q.f93232i.setText(d11.getSubTitle());
            String icon = d11.getIcon();
            ImageView ivGridIcon = c42089q.f93228e;
            Intrinsics.checkNotNullExpressionValue(ivGridIcon, "ivGridIcon");
            loadIconByGlide(icon, ivGridIcon, 6.0f);
            String labelIcon = d11.getLabelIcon();
            ImageView ivGridLiteLabel = c42089q.f93229f;
            Intrinsics.checkNotNullExpressionValue(ivGridLiteLabel, "ivGridLiteLabel");
            loadIconByGlide(labelIcon, ivGridLiteLabel, 1.0f);
            c42089q.f93229f.setVisibility(d11.getLabelIconVisible());
            if (d11.getTotalRunNumber() == null || 0 >= C27039d.m66652l(d11.getTotalRunNumber())) {
                AppCompatTextView gridTradingUserNumber = c42089q.f93226c;
                Intrinsics.checkNotNullExpressionValue(gridTradingUserNumber, "gridTradingUserNumber");
                C27046k.m66703r(gridTradingUserNumber);
                AppCompatTextView gridTradingUserNumberText = c42089q.f93227d;
                Intrinsics.checkNotNullExpressionValue(gridTradingUserNumberText, "gridTradingUserNumberText");
                C27046k.m66703r(gridTradingUserNumberText);
            } else {
                AppCompatTextView gridTradingUserNumber2 = c42089q.f93226c;
                Intrinsics.checkNotNullExpressionValue(gridTradingUserNumber2, "gridTradingUserNumber");
                ViewExtKt.m66594y(gridTradingUserNumber2);
                AppCompatTextView gridTradingUserNumberText2 = c42089q.f93227d;
                Intrinsics.checkNotNullExpressionValue(gridTradingUserNumberText2, "gridTradingUserNumberText");
                ViewExtKt.m66594y(gridTradingUserNumberText2);
                AppCompatTextView appCompatTextView = c42089q.f93226c;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66652l(d11.getTotalRunNumber()));
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                appCompatTextView.setText(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null));
            }
            ConstraintLayout root = c42089q.f93231h;
            Intrinsics.checkNotNullExpressionValue(root, "root");
            ViewExtKt.m66575f(root, new Function1() { // from class: i40.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GridTradingItemProxy.bindView$lambda$2$lambda$1(this.f86263b, d11, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<GridTradingItemModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<GridTradingItemModel> getShortCall() {
        return this.shortCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.btrading_bot_kit_grid_trading_list_item, getParent(), false);
        this.btradingBotKitGridTradingListItemBinding = C42089q.m92331a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
