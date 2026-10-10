package com.kubi.mart.sidebar.spot.helper;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5258a;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.R$drawable;
import com.kubi.mart.R$id;
import com.kubi.mart.R$layout;
import com.kubi.mart.R$mipmap;
import com.kubi.mart.exception.MartException;
import com.kubi.mvi.common.MviExKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p268fq.C37578a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: ListItemLongPressHelper.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002JD\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012J4\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper;", "", "<init>", "()V", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "pop", "showPopWhenLongPress", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "item", "Lcom/kubi/data/entity/TradeItemBean;", ViewProps.POSITION, "", "itemView", "Landroid/view/View;", "onDismiss", "Lkotlin/Function0;", "onFinish", "initPopView", "popup", "isPopShowing", "", "release", "Companion", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nListItemLongPressHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItemLongPressHelper.kt\ncom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper\n+ 2 MartIssue.kt\ncom/kubi/mart/exception/MartIssueKt\n*L\n1#1,123:1\n38#2,2:124\n*S KotlinDebug\n*F\n+ 1 ListItemLongPressHelper.kt\ncom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper\n*L\n47#1:124,2\n*E\n"})
public final class ListItemLongPressHelper {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f34737b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public C43724b f34738a;

    /* JADX INFO: compiled from: ListItemLongPressHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper$Companion;", "", "<init>", "()V", "TAG", "", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41460p(ListItemLongPressHelper listItemLongPressHelper, TradeItemBean tradeItemBean, Function0 function0, Function0 function1, RecyclerView recyclerView, int i11, View view) {
        C43724b c43724bM41464n = listItemLongPressHelper.m41464n();
        if (c43724bM41464n == null) {
            return Unit.INSTANCE;
        }
        listItemLongPressHelper.m41461f(c43724bM41464n, tradeItemBean, function0, function1);
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            boolean z11 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == i11 || linearLayoutManager.findFirstVisibleItemPosition() == i11;
            ((BubbleLinearLayout) c43724bM41464n.m96332z(R$id.bbLayout)).setArrowDirection(z11 ? BubbleStyle.ArrowDirection.Up : BubbleStyle.ArrowDirection.Down);
            c43724bM41464n.m96320e0(view, z11 ? 2 : 1, 0, 0, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m41457i(C43724b c43724b, IQuoteFacadeService iQuoteFacadeService, TradeItemBean tradeItemBean, Function0 function0) {
        MviExKt.m42518n(new ListItemLongPressHelper$initPopView$1$2$1(tradeItemBean, function0, null));
        c43724b.m96331y();
        C43852m.m96591c(C37578a.f83542a.m84710a(), "sideMarketFavorite", null, new JSONObject().put("sidemarketfav", iQuoteFacadeService.mo50681F(tradeItemBean)), 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m41458l(ListItemLongPressHelper listItemLongPressHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        listItemLongPressHelper.m41463k(z11);
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m41459m(ListItemLongPressHelper listItemLongPressHelper, boolean z11) {
        C43724b c43724b = listItemLongPressHelper.f34738a;
        if (c43724b == null) {
            return Unit.INSTANCE;
        }
        if (c43724b.m96299I() && z11) {
            c43724b.m96315Y(null);
        }
        c43724b.m96331y();
        if (z11) {
            listItemLongPressHelper.f34738a = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m41461f(final C43724b c43724b, final TradeItemBean tradeItemBean, final Function0<Unit> function0, final Function0<Unit> function1) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListItemLongPressHelper.m41455g(c43724b, tradeItemBean, function0, function1);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final boolean m41462j() {
        C43724b c43724b = this.f34738a;
        return C27025c.m66566d(c43724b != null ? Boolean.valueOf(c43724b.m96299I()) : null);
    }

    /* JADX INFO: renamed from: k */
    public final void m41463k(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListItemLongPressHelper.m41459m(this.f34758b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final C43724b m41464n() {
        if (this.f34738a == null) {
            try {
                Activity activityM6125h = C5258a.m6125h();
                Intrinsics.checkNotNullExpressionValue(activityM6125h, "getTopActivity(...)");
                this.f34738a = new BubbleEasyPopup(activityM6125h).m96307Q(R$layout.mart_layout_popup_favor).m96316Z(true).m96322p();
            } catch (Throwable th2) {
                C43846g.m96568c(new MartException(th2, "ListItemLongPressHelper", false, null, 8, null), null, 2, null);
            }
        }
        return this.f34738a;
    }

    /* JADX INFO: renamed from: o */
    public final void m41465o(@Nullable final RecyclerView recyclerView, @NotNull final TradeItemBean item, final int i11, @NotNull final View itemView, @NotNull final Function0<Unit> onDismiss, @NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListItemLongPressHelper.m41460p(this.f34760b, item, onDismiss, onFinish, recyclerView, i11, itemView);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m41455g(final C43724b c43724b, final TradeItemBean tradeItemBean, final Function0 function0, final Function0 function1) {
        int i11;
        if (c43724b.m96292A() == null) {
            return Unit.INSTANCE;
        }
        final IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
        ImageView imageView = (ImageView) c43724b.m96332z(R$id.ivFavor);
        if (imageView != null) {
            if (iQuoteFacadeService.mo50681F(tradeItemBean)) {
                i11 = R$mipmap.ic_favor;
            } else {
                i11 = R$drawable.ic_unfav_white;
            }
            imageView.setImageResource(i11);
        }
        c43724b.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.mart.sidebar.spot.helper.f
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ListItemLongPressHelper.m41456h(function0);
            }
        });
        View viewM96332z = c43724b.m96332z(R$id.llFavor);
        if (viewM96332z != null) {
            C27046k.m66711z(viewM96332z, 0L, new Function0() { // from class: com.kubi.mart.sidebar.spot.helper.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ListItemLongPressHelper.m41457i(c43724b, iQuoteFacadeService, tradeItemBean, function1);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m41456h(Function0 function0) {
        function0.invoke();
    }
}
