package com.kubi.core.biz.order.record.history;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.config.exception.KCConfigException;
import com.kubi.core.biz.order.record.history.ChooseSymbolView;
import com.kubi.core.biz.order.record.history.CoreDelegationHistoryFilterViewHelper;
import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.DropMenuView;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: CoreDelegationHistoryFilterViewHelper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eJ6\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u000eJ6\u0010\u0015\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u000eJB\u0010\u0017\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u000eJ\u001a\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010\u0018\u001a\u00020\u0013JL\u0010\u001c\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00132\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J6\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002J&\u0010/\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`1J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00140#2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00140#2\u0006\u00104\u001a\u00020\u0013J(\u00105\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`1H\u0002J(\u00106\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`1H\u0002J0\u00107\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`12\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J(\u00108\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`1H\u0002J(\u00109\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b00j\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b`1H\u0002J\f\u0010:\u001a\u00020\u0010*\u00020\tH\u0002¨\u0006;"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper;", "", "<init>", "()V", "getPairPopup", "Lcom/zyyoona7/popup/EasyPopup;", "activity", "Landroidx/fragment/app/FragmentActivity;", "textView", "Landroid/widget/TextView;", "tradeType", "", "symbol", "onSelectCallback", "Lkotlin/Function1;", "Lcom/kubi/core/biz/order/record/history/ChooseSymbolView$FilterChooseData;", "", "getTradeModeAccountPopup", JAnalysisConstants.Account.KEY_ACCOUNT, "Lcom/kubi/core/biz/order/record/history/DelegationTradeAccount;", "Lcom/kubi/resources/widget/drop/FilterType$Filter;", "getSidePopup", "side", "getTypePopup", "accountType", "filterName", "getOrderTypeMap", "", "getFilterPopup", "ivFilter", "Landroid/widget/ImageView;", "timeType", "filterStatus", "callBack", "Lio/reactivex/functions/Consumer;", "", "Lcom/kubi/resources/widget/drop/FilterType$IFilter;", "getIconFilterColor", "", "context", "Landroid/content/Context;", "hasFilter", "", "buildFilterData", "Ljava/util/ArrayList;", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "Lkotlin/collections/ArrayList;", "getSideMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSideData", "getTradeAccountModeData", "check", "getTradeAccountModeMap", "getDelegateTimeTypeMap", "getDelegateStatusTypeMap", "getDefaultDelegateStatusTypeMap", "getUnifiedDelegateStatusTypeMap", "aroundIconAndTintColor", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoreDelegationHistoryFilterViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreDelegationHistoryFilterViewHelper.kt\ncom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,406:1\n1563#2:407\n1634#2,3:408\n1#3:411\n11228#4:412\n11563#4,3:413\n11228#4:416\n11563#4,3:417\n44#5,2:420\n44#5,2:422\n44#5,2:424\n44#5,2:426\n*S KotlinDebug\n*F\n+ 1 CoreDelegationHistoryFilterViewHelper.kt\ncom/kubi/core/biz/order/record/history/CoreDelegationHistoryFilterViewHelper\n*L\n218#1:407\n218#1:408,3\n354#1:412\n354#1:413,3\n360#1:416\n360#1:417,3\n56#1:420,2\n88#1:422,2\n145#1:424,2\n200#1:426,2\n*E\n"})
public final class CoreDelegationHistoryFilterViewHelper {
    /* JADX INFO: renamed from: B */
    public static final void m22184B(TextView textView, CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (textView != null) {
                coreDelegationHistoryFilterViewHelper.m22221n(textView);
            }
            if (textView != null) {
                textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
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
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m22187H(TextView textView, CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (textView != null) {
                coreDelegationHistoryFilterViewHelper.m22221n(textView);
            }
            if (textView != null) {
                textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
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
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m22189M(TextView textView, CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (textView != null) {
                coreDelegationHistoryFilterViewHelper.m22221n(textView);
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
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m22192Q(TextView textView, CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper) {
        Object objM103844constructorimpl;
        Unit unit;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (textView != null) {
                coreDelegationHistoryFilterViewHelper.m22221n(textView);
            }
            if (textView != null) {
                textView.setTextColor(C27017c.f54310a.m66512a(R$color.c_text40));
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
            C43846g.m96568c(new KCConfigException(thM103847exceptionOrNullimpl, "DelegationHistoryFilterViewHelper", false, null, 8, null), null, 2, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m22186D(C43724b c43724b, Function1 function1, ChooseSymbolView.FilterChooseData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c43724b.m96331y();
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C43724b m22191P(CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper, FragmentActivity fragmentActivity, DelegationTradeAccount delegationTradeAccount, TextView textView, String str, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            delegationTradeAccount = DelegationTradeAccount.a.f20619a;
        }
        DelegationTradeAccount delegationTradeAccount2 = delegationTradeAccount;
        if ((i11 & 8) != 0) {
            str = "";
        }
        return coreDelegationHistoryFilterViewHelper.m22219O(fragmentActivity, delegationTradeAccount2, textView, str, function1);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ C43724b m22209v(CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper, FragmentActivity fragmentActivity, ImageView imageView, String str, String str2, DelegationTradeAccount delegationTradeAccount, Consumer consumer, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            delegationTradeAccount = DelegationTradeAccount.a.f20619a;
        }
        return coreDelegationHistoryFilterViewHelper.m22226u(fragmentActivity, imageView, str, str2, delegationTradeAccount, consumer);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final C43724b m22212A(@Nullable FragmentActivity fragmentActivity, @Nullable final TextView textView, @Nullable String str, @Nullable String str2, @NotNull final Function1<? super ChooseSymbolView.FilterChooseData, Unit> onSelectCallback) {
        Intrinsics.checkNotNullParameter(onSelectCallback, "onSelectCallback");
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.trade_core_popview_choose_symbol).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: ud.a0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                CoreDelegationHistoryFilterViewHelper.m22184B(textView, this);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: ud.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDelegationHistoryFilterViewHelper.m22185C(c43724bM96322p);
            }
        }, 1, null);
        ChooseSymbolView chooseSymbolView = (ChooseSymbolView) c43724bM96322p.m96292A().findViewById(R$id.chooseSymbolView);
        chooseSymbolView.m22171r(C27041f.m66669i(str, "TRADE"), str2);
        chooseSymbolView.getLayoutParams().height = (int) (((double) (C5267e0.m6182d() - C5275i0.m6236a(120.0f))) * 0.6d);
        chooseSymbolView.setOnSelectCallback(new Function1() { // from class: ud.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoreDelegationHistoryFilterViewHelper.m22186D(c43724bM96322p, onSelectCallback, (ChooseSymbolView.FilterChooseData) obj);
            }
        });
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: E */
    public final List<FilterType.C23032a> m22213E(String str) {
        FilterType.C23032a[] c23032aArrConvert2Filter$default = FilterType.Companion.convert2Filter$default(FilterType.f44543a, m22214F(), false, 2, null);
        ArrayList arrayList = new ArrayList(c23032aArrConvert2Filter$default.length);
        for (FilterType.C23032a c23032a : c23032aArrConvert2Filter$default) {
            String f44545b = c23032a.getF44545b();
            Locale locale = Locale.ROOT;
            String lowerCase = f44545b.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = C27041f.m66668h(str).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            c23032a.mo55155c(Intrinsics.areEqual(lowerCase, lowerCase2));
            arrayList.add(c23032a);
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LinkedHashMap<String, String> m22214F() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        C27017c c27017c = C27017c.f54310a;
        linkedHashMap.put("buy", c27017c.m66516f(R$string.buy_in, new Object[0]));
        linkedHashMap.put("sell", c27017c.m66516f(R$string.sell_out, new Object[0]));
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final C43724b m22215G(@Nullable FragmentActivity fragmentActivity, @NotNull String side, @Nullable final TextView textView, @NotNull Function1<? super FilterType.C23032a, Unit> onSelectCallback) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(onSelectCallback, "onSelectCallback");
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.trade_core_popview_filter).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: ud.y
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                CoreDelegationHistoryFilterViewHelper.m22187H(textView, this);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: ud.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDelegationHistoryFilterViewHelper.m22188I(c43724bM96322p);
            }
        }, 1, null);
        RecyclerView recyclerView = (RecyclerView) c43724bM96322p.m96292A().findViewById(R$id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity));
        recyclerView.setAdapter(new CoreDelegationHistoryFilterViewHelper$getSidePopup$2$1(c43724bM96322p, onSelectCallback, R$layout.trade_core_item_filter, m22213E(side)));
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final List<FilterType.C23032a> m22216J(@NotNull DelegationTradeAccount check) {
        Intrinsics.checkNotNullParameter(check, "check");
        FilterType.C23032a[] c23032aArrConvert2Filter = FilterType.f44543a.convert2Filter(m22217K(), false);
        ArrayList arrayList = new ArrayList(c23032aArrConvert2Filter.length);
        for (FilterType.C23032a c23032a : c23032aArrConvert2Filter) {
            c23032a.mo55155c(Intrinsics.areEqual(c23032a.getF44545b(), check.getName()));
            arrayList.add(c23032a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: K */
    public final LinkedHashMap<String, String> m22217K() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        C27017c c27017c = C27017c.f54310a;
        linkedHashMap.put("unified", c27017c.m66516f(R$string.uta_account_uta, new Object[0]));
        linkedHashMap.put("classic", c27017c.m66516f(R$string.uta_account_spot, new Object[0]));
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final C43724b m22218L(@Nullable FragmentActivity fragmentActivity, @NotNull DelegationTradeAccount account, @Nullable final TextView textView, @NotNull Function1<? super FilterType.C23032a, Unit> onSelectCallback) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(onSelectCallback, "onSelectCallback");
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.trade_core_popview_filter).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: ud.p
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                CoreDelegationHistoryFilterViewHelper.m22189M(textView, this);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: ud.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDelegationHistoryFilterViewHelper.m22190N(c43724bM96322p);
            }
        }, 1, null);
        RecyclerView recyclerView = (RecyclerView) c43724bM96322p.m96292A().findViewById(R$id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity));
        recyclerView.setAdapter(new C12033x91e94797(c43724bM96322p, onSelectCallback, R$layout.trade_core_item_filter, m22216J(account)));
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final C43724b m22219O(@Nullable FragmentActivity fragmentActivity, @NotNull DelegationTradeAccount accountType, @Nullable final TextView textView, @NotNull String filterName, @NotNull Function1<? super FilterType.C23032a, Unit> onSelectCallback) {
        Object next;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(filterName, "filterName");
        Intrinsics.checkNotNullParameter(onSelectCallback, "onSelectCallback");
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.trade_core_popview_filter).m96317a0(C5267e0.m6183e()).m96315Y(new PopupWindow.OnDismissListener() { // from class: ud.w
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                CoreDelegationHistoryFilterViewHelper.m22192Q(textView, this);
            }
        }).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: ud.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDelegationHistoryFilterViewHelper.m22193R(c43724bM96322p);
            }
        }, 1, null);
        RecyclerView recyclerView = (RecyclerView) c43724bM96322p.m96292A().findViewById(R$id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity));
        int i11 = R$layout.trade_core_item_filter;
        List<FilterType.C23032a> mutableList = ArraysKt.toMutableList(FilterType.f44543a.convert2Filter(m22228z(accountType), false));
        mutableList.add(0, new FilterType.C23032a(C27017c.f54310a.m66516f(R$string.all, new Object[0]), ""));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        for (FilterType.C23032a c23032a : mutableList) {
            String f44545b = c23032a.getF44545b();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = f44545b.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            c23032a.mo55155c(Intrinsics.areEqual(filterName, lowerCase));
            arrayList.add(c23032a);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((FilterType.C23032a) next).getF44546c());
        if (((FilterType.C23032a) next) == null) {
            FilterType.C23032a c23032a2 = (FilterType.C23032a) CollectionsKt.firstOrNull((List) arrayList);
            if (c23032a2 != null) {
                c23032a2.mo55155c(true);
                onSelectCallback.invoke(c23032a2);
            }
            Unit unit = Unit.INSTANCE;
        }
        recyclerView.setAdapter(new CoreDelegationHistoryFilterViewHelper$getTypePopup$2$1(c43724bM96322p, onSelectCallback, i11, arrayList));
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: S */
    public final LinkedHashMap<String, String> m22220S() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        C27017c c27017c = C27017c.f54310a;
        linkedHashMap.put("DONE", c27017c.m66516f(R$string.completed, new Object[0]));
        linkedHashMap.put("TRIGGERED", c27017c.m66516f(R$string.unified_triggered_order, new Object[0]));
        linkedHashMap.put(OrderDetailInfo.ORDER_STATUS_CANCELED, c27017c.m66516f(R$string.canceled_order, new Object[0]));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: n */
    public final void m22221n(TextView textView) {
        C27046k.m66694i(textView, R$drawable.ic_triangle_bottom_12, C5275i0.m6236a(5.0f), 0, 4, null);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C27046k.m66702q(textView, C27046k.m66699n(context, R$color.c_icon60));
    }

    /* JADX INFO: renamed from: o */
    public final ArrayList<C23034a.a> m22222o(String str, String str2, DelegationTradeAccount delegationTradeAccount) {
        ArrayList<C23034a.a> arrayList = new ArrayList<>();
        String strM66516f = C27017c.f54310a.m66516f(R$string.time, new Object[0]);
        FilterType.C23032a[] c23032aArrConvert2Filter = FilterType.f44543a.convert2Filter(m22225t(), false);
        for (FilterType.C23032a c23032a : c23032aArrConvert2Filter) {
            c23032a.mo55155c(Intrinsics.areEqual(c23032a.getF44545b(), str));
        }
        arrayList.add(new C23034a.a(strM66516f, c23032aArrConvert2Filter, new Consumer() { // from class: ud.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoreDelegationHistoryFilterViewHelper.m22207p((Integer) obj);
            }
        }, Boolean.FALSE));
        String strM66516f2 = C27017c.f54310a.m66516f(R$string.status, new Object[0]);
        FilterType.C23032a c23032a2 = null;
        FilterType.C23032a[] c23032aArrConvert2Filter$default = FilterType.Companion.convert2Filter$default(FilterType.f44543a, m22224s(delegationTradeAccount), false, 2, null);
        for (FilterType.C23032a c23032a3 : c23032aArrConvert2Filter$default) {
            c23032a3.mo55155c(Intrinsics.areEqual(c23032a3.getF44545b(), str2));
        }
        for (FilterType.C23032a c23032a4 : c23032aArrConvert2Filter$default) {
            if (c23032a4.getF44546c()) {
                c23032a2 = c23032a4;
                break;
            }
        }
        if (c23032a2 == null) {
            FilterType.C23032a c23032a5 = (FilterType.C23032a) ArraysKt.firstOrNull(c23032aArrConvert2Filter$default);
            if (c23032a5 != null) {
                c23032a5.getF44546c();
            }
            Unit unit = Unit.INSTANCE;
        }
        Unit unit2 = Unit.INSTANCE;
        arrayList.add(new C23034a.a(strM66516f2, c23032aArrConvert2Filter$default, new Consumer() { // from class: ud.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoreDelegationHistoryFilterViewHelper.m22208q((Integer) obj);
            }
        }, Boolean.FALSE));
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    public final LinkedHashMap<String, String> m22223r() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        C27017c c27017c = C27017c.f54310a;
        linkedHashMap.put("DONE", c27017c.m66516f(R$string.completed, new Object[0]));
        linkedHashMap.put(OrderDetailInfo.ORDER_STATUS_CANCELED, c27017c.m66516f(R$string.canceled_order, new Object[0]));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap<String, String> m22224s(DelegationTradeAccount delegationTradeAccount) {
        return Intrinsics.areEqual(delegationTradeAccount, DelegationTradeAccount.b.f20621a) ? m22220S() : m22223r();
    }

    /* JADX INFO: renamed from: t */
    public final LinkedHashMap<String, String> m22225t() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        C27017c c27017c = C27017c.f54310a;
        linkedHashMap.put("THREE_MONTH", c27017c.m66516f(R$string.three_month, new Object[0]));
        linkedHashMap.put("ONE_MONTH", c27017c.m66516f(R$string.one_month, new Object[0]));
        linkedHashMap.put("ONE_WEEK", c27017c.m66516f(R$string.one_week, new Object[0]));
        return linkedHashMap;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final C43724b m22226u(@Nullable FragmentActivity fragmentActivity, @Nullable final ImageView imageView, @Nullable String str, @Nullable String str2, @NotNull DelegationTradeAccount accountType, @NotNull final Consumer<List<FilterType.InterfaceC23033b>> callBack) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        final C43724b c43724bM96322p = C43724b.m96333g0().m96308R(fragmentActivity, R$layout.spot_popview_menu_filter).m96317a0(C5267e0.m6183e()).m96316Z(true).m96322p();
        View viewFindViewById = c43724bM96322p.m96292A().findViewById(R$id.maskView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: ud.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoreDelegationHistoryFilterViewHelper.m22210w(c43724bM96322p);
            }
        }, 1, null);
        final DropMenuView dropMenuView = (DropMenuView) c43724bM96322p.m96292A().findViewById(R$id.menuView);
        dropMenuView.m55141d();
        dropMenuView.setNew(Boolean.TRUE);
        dropMenuView.m55140c(fragmentActivity, m22222o(str, str2, accountType), new Consumer() { // from class: ud.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                CoreDelegationHistoryFilterViewHelper.m22211x(this.f101661b, dropMenuView, imageView, c43724bM96322p, callBack, (List) obj);
            }
        });
        dropMenuView.m55147j();
        Intrinsics.checkNotNull(c43724bM96322p);
        return c43724bM96322p;
    }

    /* JADX INFO: renamed from: y */
    public final int m22227y(Context context, boolean z11) {
        return z11 ? ContextCompat.getColor(context, R$color.primary) : ContextCompat.getColor(context, R$color.c_icon);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final Map<String, String> m22228z(@NotNull DelegationTradeAccount accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (Intrinsics.areEqual(accountType, DelegationTradeAccount.a.f20619a)) {
            return DelegationEntity.INSTANCE.getOrderTypeMap(false);
        }
        if (Intrinsics.areEqual(accountType, DelegationTradeAccount.b.f20621a)) {
            return DelegationEntity.INSTANCE.getUnifiedOrderTypeMap();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m22185C(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m22188I(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m22190N(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public static final Unit m22193R(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final void m22207p(Integer num) {
        C43852m.m96591c("B5orderList", "filterTime", String.valueOf(num.intValue() + 1), null, 8, null);
    }

    /* JADX INFO: renamed from: q */
    public static final void m22208q(Integer num) {
        C43852m.m96591c("B5orderList", "filterStatus", String.valueOf(num.intValue() + 1), null, 8, null);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m22210w(C43724b c43724b) {
        c43724b.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m22211x(CoreDelegationHistoryFilterViewHelper coreDelegationHistoryFilterViewHelper, DropMenuView dropMenuView, ImageView imageView, C43724b c43724b, Consumer consumer, List list) throws Exception {
        Context context = dropMenuView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM22227y = coreDelegationHistoryFilterViewHelper.m22227y(context, dropMenuView.m55143f());
        if (imageView != null) {
            C27046k.m66701p(imageView, iM22227y);
        }
        c43724b.m96331y();
        consumer.accept(list);
    }
}
