package com.kubi.margin.delegation.borrowing;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.margin.R$color;
import com.kubi.margin.R$drawable;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$string;
import com.kubi.margin.exception.MarginException;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.business.delegation.view.ChooseSymbolView;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p181cp.AbstractC36514a;
import p181cp.C36515b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: renamed from: com.kubi.margin.delegation.borrowing.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarginDelegationFilterViewExt.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00050\rJ0\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J,\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 J$\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 J2\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\rJ6\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00050\rH\u0002J:\u0010,\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00050\rH\u0002J\u0014\u0010.\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010/\u001a\u000200H\u0002R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt;", "", "<init>", "()V", "initDropMenuData", "", "mDropMenuView", "Lcom/kubi/resources/widget/drop/DropMenuView;", "ivFilter", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "setFilterData", "Lkotlin/Function1;", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "getDelegateTimeTypeMap", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "mPairPopup", "Lcom/zyyoona7/popup/EasyPopup;", "mCoinPopup", "mBizTypePopup", "chooseSymbol", "tvChoosePairs", "Landroid/widget/TextView;", "tradeType", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "update", "Lkotlin/Function0;", "chooseCoin", "tvChooseCoin", "chooseBizType", "tvChooseBizType", "default", "Lcom/kubi/margin/constant/LiquidationBizType;", "getBizTypePopup", "activity", "Landroidx/fragment/app/FragmentActivity;", "textView", "onSelectCallback", "getPairPopup", "Lcom/kubi/spot/business/delegation/view/ChooseSymbolView$FilterChooseData;", "aroundIconAndTintColor", TIMPushProvider.f75062n, "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginDelegationFilterViewExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginDelegationFilterViewExt.kt\ncom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,248:1\n1563#2:249\n1634#2,3:250\n1#3:253\n44#4,2:254\n44#4,2:256\n*S KotlinDebug\n*F\n+ 1 MarginDelegationFilterViewExt.kt\ncom/kubi/margin/delegation/borrowing/MarginDelegationFilterViewExt\n*L\n184#1:249\n184#1:250,3\n174#1:254,2\n220#1:256,2\n*E\n"})
public final class MarginDelegationFilterViewExt {

    /* JADX INFO: renamed from: a */
    @Nullable
    public C43724b f32896a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C43724b f32897b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public C43724b f32898c;

    /* JADX INFO: renamed from: C */
    public static final void m38139C(TextView textView, MarginDelegationFilterViewExt marginDelegationFilterViewExt) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (textView != null) {
                marginDelegationFilterViewExt.m38168n(textView, false);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m38161v(MarginDelegationFilterViewExt marginDelegationFilterViewExt, TextView textView) {
        marginDelegationFilterViewExt.m38168n(textView, true);
        C43724b c43724b = marginDelegationFilterViewExt.f32896a;
        if (c43724b != null) {
            c43724b.mo54253b0(textView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m38141E(C43724b c43724b, Function1 function1, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c43724b.m96331y();
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m38157p(MarginDelegationFilterViewExt marginDelegationFilterViewExt, TextView textView) {
        C43724b c43724b = marginDelegationFilterViewExt.f32898c;
        if (c43724b != null) {
            c43724b.mo54253b0(textView);
        }
        marginDelegationFilterViewExt.m38168n(textView, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m38158r(TextView textView, BaseFragment baseFragment, Function0 function0, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.all;
        if (Intrinsics.areEqual(name, c27017c.m66516f(i11, new Object[0]))) {
            textView.setText(c27017c.m66516f(i11, new Object[0]));
            textView.setTag(textView.getText());
            textView.setTextColor(baseFragment.getColorRes(R$color.c_text40));
        } else {
            textView.setText(it.getName());
            textView.setTag(it.getCode());
            textView.setTextColor(baseFragment.getColorRes(R$color.brandGreen));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m38159s(MarginDelegationFilterViewExt marginDelegationFilterViewExt, TextView textView) {
        C43724b c43724b = marginDelegationFilterViewExt.f32897b;
        if (c43724b != null) {
            c43724b.mo54253b0(textView);
        }
        marginDelegationFilterViewExt.m38168n(textView, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m38160u(TextView textView, BaseFragment baseFragment, Function0 function0, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.getName();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.all;
        if (Intrinsics.areEqual(name, c27017c.m66516f(i11, new Object[0]))) {
            textView.setText(c27017c.m66516f(i11, new Object[0]));
            textView.setTag(textView.getText());
            textView.setTextColor(baseFragment.getColorRes(R$color.c_text40));
        } else {
            textView.setText(it.getName());
            textView.setTag(it.getCode());
            textView.setTextColor(baseFragment.getColorRes(R$color.brandGreen));
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m38163y(C43724b c43724b, Function1 function1, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c43724b.m96331y();
        function1.invoke(C36515b.m81760b(it.getCode()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final void m38164z(MarginDelegationFilterViewExt marginDelegationFilterViewExt, TextView textView) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            marginDelegationFilterViewExt.m38168n(textView, false);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap<String, String> m38165A(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("THREE_MONTH", context.getString(R$string.three_month));
        linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
        linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: F */
    public final void m38167F(@NotNull DropMenuView mDropMenuView, @NotNull final BaseTextView ivFilter, @Nullable final Context context, @NotNull final Function1<? super List<? extends FilterType.InterfaceC23033b>, Unit> setFilterData) {
        Intrinsics.checkNotNullParameter(mDropMenuView, "mDropMenuView");
        Intrinsics.checkNotNullParameter(ivFilter, "ivFilter");
        Intrinsics.checkNotNullParameter(setFilterData, "setFilterData");
        if (context == null) {
            return;
        }
        final C23034a c23034a = new C23034a();
        mDropMenuView.setNew(Boolean.TRUE);
        mDropMenuView.setUesAnim(false);
        c23034a.m55161e(new TextView(context), mDropMenuView, false);
        c23034a.m55166j(new Consumer() { // from class: com.kubi.margin.delegation.borrowing.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginDelegationFilterViewExt.m38142G(ivFilter, context, (Boolean) obj);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C23034a.a(C27017c.f54310a.m66516f(R$string.time, new Object[0]), FilterType.f44543a.convert2Filter(m38165A(context), false)));
        c23034a.m55164h(arrayList, new Consumer() { // from class: com.kubi.margin.delegation.borrowing.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginDelegationFilterViewExt.m38143H(setFilterData, c23034a, context, ivFilter, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m38168n(TextView textView, boolean z11) {
        if (z11) {
            C27046k.m66694i(textView, R$drawable.ic_triangle_top_12, C5275i0.m6236a(5.0f), 0, 4, null);
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C27046k.m66702q(textView, C27046k.m66699n(context, R$color.brandGreen));
            return;
        }
        C27046k.m66694i(textView, R$drawable.ic_triangle_bottom_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context2, R$color.c_text40));
    }

    /* JADX INFO: renamed from: o */
    public final void m38169o(@NotNull final TextView tvChooseBizType, @NotNull BaseFragment fragment, @NotNull AbstractC36514a abstractC36514a, @NotNull Function1<? super AbstractC36514a, Unit> update) {
        Intrinsics.checkNotNullParameter(tvChooseBizType, "tvChooseBizType");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(abstractC36514a, "default");
        Intrinsics.checkNotNullParameter(update, "update");
        if (this.f32898c == null) {
            this.f32898c = m38172w(fragment.getActivity(), tvChooseBizType, abstractC36514a, update);
        }
        C27046k.m66711z(tvChooseBizType, 0L, new Function0() { // from class: com.kubi.margin.delegation.borrowing.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationFilterViewExt.m38157p(this.f32884b, tvChooseBizType);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m38170q(@NotNull final TextView tvChooseCoin, @NotNull final BaseFragment fragment, @NotNull final Function0<Unit> update) {
        Intrinsics.checkNotNullParameter(tvChooseCoin, "tvChooseCoin");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(update, "update");
        if (this.f32897b == null) {
            this.f32897b = m38166B(fragment.getActivity(), tvChooseCoin, "margin_coin_choose", new Function1() { // from class: com.kubi.margin.delegation.borrowing.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationFilterViewExt.m38158r(tvChooseCoin, fragment, update, (ChooseSymbolView.FilterChooseData) obj);
                }
            });
        }
        C27046k.m66711z(tvChooseCoin, 0L, new Function0() { // from class: com.kubi.margin.delegation.borrowing.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationFilterViewExt.m38159s(this.f32889b, tvChooseCoin);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m38171t(@NotNull final TextView tvChoosePairs, int i11, @NotNull final BaseFragment fragment, @NotNull final Function0<Unit> update) {
        Intrinsics.checkNotNullParameter(tvChoosePairs, "tvChoosePairs");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(update, "update");
        if (this.f32896a == null) {
            this.f32896a = m38166B(fragment.getActivity(), tvChoosePairs, i11 == 1 ? "MARGIN_TRADE" : "MARGIN_ISOLATED_TRADE", new Function1() { // from class: com.kubi.margin.delegation.borrowing.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDelegationFilterViewExt.m38160u(tvChoosePairs, fragment, update, (ChooseSymbolView.FilterChooseData) obj);
                }
            });
        }
        C27046k.m66711z(tvChoosePairs, 0L, new Function0() { // from class: com.kubi.margin.delegation.borrowing.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationFilterViewExt.m38161v(this.f32882b, tvChoosePairs);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m38140D(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m38142G(BaseTextView baseTextView, Context context, Boolean bool) {
        if (bool.booleanValue()) {
            C27046k.m66702q(baseTextView, ContextCompat.getColor(context, R$color.primary));
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m38143H(Function1 function1, C23034a c23034a, Context context, BaseTextView baseTextView, List list) {
        int color;
        Intrinsics.checkNotNull(list);
        function1.invoke(list);
        if (c23034a.m55163g()) {
            color = ContextCompat.getColor(context, R$color.primary);
        } else {
            color = ContextCompat.getColor(context, R$color.c_icon);
        }
        C27046k.m66702q(baseTextView, color);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m38162x(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public final C43724b m38166B(FragmentActivity fragmentActivity, final TextView textView, String str, final Function1<? super ChooseSymbolView.FilterChooseData, Unit> function1) {
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.spot_popview_choose_symbol).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.margin.delegation.borrowing.r
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MarginDelegationFilterViewExt.m38139C(textView, this);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.margin.delegation.borrowing.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationFilterViewExt.m38140D(c43724bM96322p);
            }
        }, 1, null);
        ChooseSymbolView chooseSymbolView = (ChooseSymbolView) c43724bM96322p.m96292A().findViewById(R$id.chooseSymbolView);
        chooseSymbolView.m60997r(C27041f.m66669i(str, "TRADE"));
        chooseSymbolView.getLayoutParams().height = (int) (((double) (C5267e0.m6182d() - C5275i0.m6236a(120.0f))) * 0.6d);
        chooseSymbolView.setOnSelectCallback(new Function1() { // from class: com.kubi.margin.delegation.borrowing.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginDelegationFilterViewExt.m38141E(c43724bM96322p, function1, (ChooseSymbolView.FilterChooseData) obj);
            }
        });
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: w */
    public final C43724b m38172w(FragmentActivity fragmentActivity, final TextView textView, AbstractC36514a abstractC36514a, final Function1<? super AbstractC36514a, Unit> function1) {
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.spot_popview_choose_symbol).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.margin.delegation.borrowing.i
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                MarginDelegationFilterViewExt.m38164z(this.f32870b, textView);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.margin.delegation.borrowing.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDelegationFilterViewExt.m38162x(c43724bM96322p);
            }
        }, 1, null);
        ChooseSymbolView chooseSymbolView = (ChooseSymbolView) c43724bM96322p.m96292A().findViewById(R$id.chooseSymbolView);
        List<AbstractC36514a> listM81759a = C36515b.m81759a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81759a, 10));
        for (AbstractC36514a abstractC36514a2 : listM81759a) {
            arrayList.add(new ChooseSymbolView.FilterChooseData(C27017c.f54310a.m66516f(abstractC36514a2.getF79340a(), new Object[0]), abstractC36514a2.getF79341b(), null, null, Intrinsics.areEqual(abstractC36514a2, abstractC36514a), null, 44, null));
        }
        chooseSymbolView.m60996C(arrayList, false, false);
        chooseSymbolView.getLayoutParams().height = (int) (((double) (C5267e0.m6182d() - C5275i0.m6236a(120.0f))) * 0.6d);
        chooseSymbolView.setOnSelectCallback(new Function1() { // from class: com.kubi.margin.delegation.borrowing.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginDelegationFilterViewExt.m38163y(c43724bM96322p, function1, (ChooseSymbolView.FilterChooseData) obj);
            }
        });
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }
}
