package com.kubi.quotefacade.helper;

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5258a;
import com.cpiz.android.bubbleview.BubbleLinearLayout;
import com.cpiz.android.bubbleview.BubbleStyle;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.quotefacade.R$drawable;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.R$layout;
import com.kubi.quotefacade.R$mipmap;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.resources.widget.BubbleEasyPopup;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import cv.C36544a;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p241ev.C37266a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: AlphaLongPressHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002JL\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014J.\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/AlphaLongPressHelper;", "", "<init>", "()V", "mPop", "Lcom/zyyoona7/popup/EasyPopup;", "pop", "showPopWhenLongPress", "", "alphaType", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "item", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", ViewProps.POSITION, "", "itemView", "Landroid/view/View;", "onDismiss", "Lkotlin/Function0;", "onFinish", "initPopView", "popup", "isPopShowing", "", "release", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaLongPressHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaLongPressHelper.kt\ncom/kubi/quotefacade/helper/AlphaLongPressHelper\n+ 2 QuoteIssue.kt\ncom/kubi/quotefacade/exception/QuoteIssueKt\n*L\n1#1,114:1\n45#2,7:115\n*S KotlinDebug\n*F\n+ 1 AlphaLongPressHelper.kt\ncom/kubi/quotefacade/helper/AlphaLongPressHelper\n*L\n40#1:115,7\n*E\n"})
public final class AlphaLongPressHelper {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f41918b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @Nullable
    public C43724b f41919a;

    /* JADX INFO: compiled from: AlphaLongPressHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/AlphaLongPressHelper$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m51755o(AlphaLongPressHelper alphaLongPressHelper, String str, AlphaItemEntity alphaItemEntity, Function0 function0, RecyclerView recyclerView, final Function0 function1, int i11, View view) {
        C43724b c43724bM51760m = alphaLongPressHelper.m51760m();
        if (c43724bM51760m == null) {
            return Unit.INSTANCE;
        }
        alphaLongPressHelper.m51757f(c43724bM51760m, str, alphaItemEntity, function0);
        c43724bM51760m.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.quotefacade.helper.e
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                AlphaLongPressHelper.m51756p(function1);
            }
        });
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            boolean z11 = linearLayoutManager.findFirstCompletelyVisibleItemPosition() == i11 || linearLayoutManager.findFirstVisibleItemPosition() == i11;
            ((BubbleLinearLayout) c43724bM51760m.m96332z(R$id.layoutBubble)).setArrowDirection(z11 ? BubbleStyle.ArrowDirection.Up : BubbleStyle.ArrowDirection.Down);
            c43724bM51760m.m96320e0(view, z11 ? 2 : 1, 0, 0, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m51753k(AlphaLongPressHelper alphaLongPressHelper, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        alphaLongPressHelper.m51759j(z11);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m51754l(AlphaLongPressHelper alphaLongPressHelper, boolean z11) {
        C43724b c43724b = alphaLongPressHelper.f41919a;
        if (c43724b == null) {
            return Unit.INSTANCE;
        }
        if (c43724b.m96299I() && z11) {
            c43724b.m96315Y(null);
        }
        c43724b.m96331y();
        if (z11) {
            alphaLongPressHelper.f41919a = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m51757f(final C43724b c43724b, String str, final AlphaItemEntity alphaItemEntity, final Function0<Unit> function0) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.helper.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaLongPressHelper.m51751g(c43724b, alphaItemEntity, function0);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final boolean m51758i() {
        C43724b c43724b = this.f41919a;
        return C27025c.m66566d(c43724b != null ? Boolean.valueOf(c43724b.m96299I()) : null);
    }

    /* JADX INFO: renamed from: j */
    public final void m51759j(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.helper.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaLongPressHelper.m51754l(this.f41953b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final C43724b m51760m() {
        if (this.f41919a == null) {
            try {
                Activity activityM6125h = C5258a.m6125h();
                Intrinsics.checkNotNullExpressionValue(activityM6125h, "getTopActivity(...)");
                this.f41919a = new BubbleEasyPopup(activityM6125h).m96307Q(R$layout.popwindow_layout_favriote_action).m96316Z(true).m96322p();
            } catch (Throwable th2) {
                C37266a.m83411b(th2, "AlphaLongPressHelper");
            }
        }
        return this.f41919a;
    }

    /* JADX INFO: renamed from: n */
    public final void m51761n(@NotNull final String alphaType, @Nullable final RecyclerView recyclerView, @NotNull final AlphaItemEntity item, final int i11, @NotNull final View itemView, @NotNull final Function0<Unit> onDismiss, @NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(alphaType, "alphaType");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        C27100x0.m66923d(new Function0() { // from class: com.kubi.quotefacade.helper.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaLongPressHelper.m51755o(this.f41957b, alphaType, item, onFinish, recyclerView, onDismiss, i11, itemView);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m51751g(final C43724b c43724b, AlphaItemEntity alphaItemEntity, final Function0 function0) {
        int i11;
        if (c43724b.m96292A() == null) {
            return Unit.INSTANCE;
        }
        BaseViewHolder baseViewHolder = new BaseViewHolder(c43724b.m96292A());
        int i12 = R$id.llFavor;
        baseViewHolder.setGone(i12, true);
        baseViewHolder.setGone(R$id.llReminder, false);
        baseViewHolder.setGone(R$id.llPin, false);
        int i13 = R$id.ivFavor;
        if (C36544a.m81808a(alphaItemEntity)) {
            i11 = R$mipmap.ic_favor;
        } else {
            i11 = R$drawable.ic_unfav_white;
        }
        baseViewHolder.setImageResource(i13, i11);
        View view = baseViewHolder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66710y(view, 1000L, new Function0() { // from class: com.kubi.quotefacade.helper.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlphaLongPressHelper.m51752h(function0, c43724b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m51752h(Function0 function0, C43724b c43724b) {
        function0.invoke();
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m51756p(Function0 function0) {
        function0.invoke();
    }
}
