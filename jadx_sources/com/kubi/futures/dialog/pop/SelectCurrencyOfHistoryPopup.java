package com.kubi.futures.dialog.pop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.dialog.pop.SelectCurrencyOfHistoryPopup;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n30.C42735k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p203di.C36703k;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import qe0.C43724b;
import ro.C44128b;

/* JADX INFO: compiled from: SelectCurrencyOfHistoryPopup.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u001b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0001H\u0015J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\bH\u0003J\b\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/dialog/pop/SelectCurrencyOfHistoryPopup;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "currencyList", "", "Lcom/kubi/futures/history/filter/CurrencyClickFilter$FilterChooseCoin;", FirebaseAnalytics.Param.CURRENCY, "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "saveShowAllItemVisibleState", "", "Ljava/lang/Integer;", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseViewChooseSymbolBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseViewChooseSymbolBinding;", "binding$delegate", "Lkotlin/Lazy;", "displayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "adapter", "com/kubi/futures/dialog/pop/SelectCurrencyOfHistoryPopup$adapter$1", "Lcom/kubi/futures/dialog/pop/SelectCurrencyOfHistoryPopup$adapter$1;", "initViews", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "popup", "doSearch", "toString", "hideTvChooseVisible", "restoreTvChooseVisible", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SelectCurrencyOfHistoryPopup extends C43724b {

    /* JADX INFO: renamed from: D */
    @NotNull
    public final List<C36703k.FilterChooseCoin> f22873D;

    /* JADX INFO: renamed from: E */
    @Nullable
    public final String f22874E;

    /* JADX INFO: renamed from: F */
    @NotNull
    public final Function1<String, Unit> f22875F;

    /* JADX INFO: renamed from: G */
    @Nullable
    public Integer f22876G;

    /* JADX INFO: renamed from: H */
    @NotNull
    public final Lazy f22877H;

    /* JADX INFO: renamed from: I */
    @NotNull
    public final ArrayList<C36703k.FilterChooseCoin> f22878I;

    /* JADX INFO: renamed from: J */
    @NotNull
    public final SelectCurrencyOfHistoryPopup$adapter$1 f22879J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectCurrencyOfHistoryPopup(@NotNull Context context, @NotNull List<C36703k.FilterChooseCoin> currencyList, @Nullable String str, @NotNull Function1<? super String, Unit> action) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currencyList, "currencyList");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f22873D = currencyList;
        this.f22874E = str;
        this.f22875F = action;
        this.f22877H = LazyKt.lazy(new Function0() { // from class: xh.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCurrencyOfHistoryPopup.m25301w0(this.f103781b);
            }
        });
        ArrayList<C36703k.FilterChooseCoin> arrayList = new ArrayList<>();
        this.f22878I = arrayList;
        this.f22879J = new SelectCurrencyOfHistoryPopup$adapter$1(this, R$layout.btradebase_item_filter_with_icon, arrayList);
        m96317a0(-1);
        m96307Q(R$layout.btradebase_view_choose_symbol);
    }

    /* JADX INFO: renamed from: A0 */
    public static final boolean m25281A0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m25282B0(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup, List list) {
        selectCurrencyOfHistoryPopup.f22878I.clear();
        selectCurrencyOfHistoryPopup.f22878I.addAll(list);
        selectCurrencyOfHistoryPopup.f22879J.replaceData(selectCurrencyOfHistoryPopup.f22878I);
        selectCurrencyOfHistoryPopup.m25305D0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F0 */
    public static final Unit m25284F0(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup) {
        selectCurrencyOfHistoryPopup.f22875F.invoke(null);
        selectCurrencyOfHistoryPopup.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z0 */
    public static final boolean m25303z0(String str, C36703k.FilterChooseCoin it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strM82199d = it.getName();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = strM82199d.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String upperCase2 = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        return StringsKt.contains$default((CharSequence) upperCase, (CharSequence) upperCase2, false, 2, (Object) null);
    }

    /* JADX INFO: renamed from: C0 */
    public final C42735k m25304C0() {
        return (C42735k) this.f22877H.getValue();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m25305D0() {
        if (this.f22876G == null) {
            this.f22876G = Integer.valueOf(m25304C0().f94644d.getVisibility());
            m25304C0().f94644d.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m25307K0() {
        Integer num = this.f22876G;
        if (num != null) {
            m25304C0().f94644d.setVisibility(num.intValue());
            this.f22876G = null;
        }
    }

    @Override // qe0.C43724b, qe0.AbstractC43723a
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: i0 */
    public void mo25306H(@NotNull View view, @NotNull C43724b popup) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(popup, "popup");
        super.mo25306H(view, popup);
        View viewShadow = m25304C0().f94645e;
        Intrinsics.checkNotNullExpressionValue(viewShadow, "viewShadow");
        C27046k.m66711z(viewShadow, 0L, new Function0() { // from class: xh.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCurrencyOfHistoryPopup.m25283E0(this.f103786b);
            }
        }, 1, null);
        BaseTextView tvChoose = m25304C0().f94644d;
        Intrinsics.checkNotNullExpressionValue(tvChoose, "tvChoose");
        C27046k.m66711z(tvChoose, 0L, new Function0() { // from class: xh.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectCurrencyOfHistoryPopup.m25284F0(this.f103788b);
            }
        }, 1, null);
        m25304C0().f94644d.setTextColor(view.getContext().getResources().getColor(this.f22874E != null ? R$color.c_text : R$color.primary));
        AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(m25304C0().f94642b);
        final Function1 function1 = new Function1() { // from class: xh.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectCurrencyOfHistoryPopup.m25285G0(this.f103789b, (CharSequence) obj);
            }
        };
        Consumer<? super CharSequence> consumer = new Consumer() { // from class: xh.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectCurrencyOfHistoryPopup.m25286H0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: xh.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectCurrencyOfHistoryPopup.m25287I0((Throwable) obj);
            }
        };
        abstractC46099aM784d.subscribe(consumer, new Consumer() { // from class: xh.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectCurrencyOfHistoryPopup.m25288J0(function2, obj);
            }
        });
        m25304C0().f94643c.setAdapter(this.f22879J);
        this.f22879J.setEmptyView(R$layout.view_empty, m25304C0().f94643c);
    }

    /* JADX INFO: renamed from: E0 */
    public static final Unit m25283E0(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup) {
        selectCurrencyOfHistoryPopup.m96331y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G0 */
    public static final Unit m25285G0(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup, CharSequence charSequence) {
        selectCurrencyOfHistoryPopup.m25309x0(charSequence.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m25286H0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m25287I0(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m25288J0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w0 */
    public static final C42735k m25301w0(SelectCurrencyOfHistoryPopup selectCurrencyOfHistoryPopup) {
        return C42735k.m93642a(selectCurrencyOfHistoryPopup.m96292A());
    }

    /* JADX INFO: renamed from: y0 */
    public static final void m25302y0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: x0 */
    public final void m25309x0(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.f22878I.clear();
            this.f22878I.addAll(this.f22873D);
            this.f22879J.replaceData(this.f22878I);
            m25307K0();
            return;
        }
        Observable observableFromIterable = Observable.fromIterable(this.f22873D);
        final Function1 function1 = new Function1() { // from class: xh.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SelectCurrencyOfHistoryPopup.m25303z0(str, (C36703k.FilterChooseCoin) obj));
            }
        };
        Observable observable = observableFromIterable.filter(new Predicate() { // from class: xh.v
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return SelectCurrencyOfHistoryPopup.m25281A0(function1, obj);
            }
        }).toList().toObservable();
        final Function1 function2 = new Function1() { // from class: xh.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelectCurrencyOfHistoryPopup.m25282B0(this.f103796b, (List) obj);
            }
        };
        observable.subscribe(new Consumer() { // from class: xh.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SelectCurrencyOfHistoryPopup.m25302y0(function2, obj);
            }
        });
    }
}
