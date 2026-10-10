package c40;

import a40.C0123f;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import b40.TradeTabSortData;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import com.kubi.tradefacade.R$string;
import com.kubi.tradefacade.tabs.data.TabBiz;
import com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment;
import com.kubi.tradefacade.utils.PopBubbleHelper;
import com.kubi.tradefacade.utils.StorageIds;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37758j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import w30.C45715b;
import y70.C46392a;
import z30.C46683a;

/* JADX INFO: renamed from: c40.l */
/* JADX INFO: compiled from: TabViewOrderController.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\f\u0010\"\u001a\u00020\u0015*\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000e¨\u0006#"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/helper/TabViewOrderController;", "", "<init>", "()V", "viewBinding", "Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeBinding;", "tabViewMap", "", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "Landroid/view/View;", "tabRbIdMap", "", "featureGuideContentRes", "getFeatureGuideContentRes", "()I", "featureGuideContentRes$delegate", "Lkotlin/Lazy;", "editGuideContentRes", "getEditGuideContentRes", "editGuideContentRes$delegate", "bindTabView", "", "binding", "isSupportSortTab", "", "applyTabOrder", "saveTabClickRecord", "checkedId", "actionSettingsLabelEvent", "context", "Landroid/content/Context;", "tryShowGuide", "showNewGuideOfSettings", "showNewGuideOfEditSetting", "hideTabSettingsPop", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabViewOrderController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabViewOrderController.kt\ncom/kubi/tradefacade/tabs/helper/TabViewOrderController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,244:1\n1617#2,9:245\n1869#2:254\n1870#2:257\n1626#2:258\n1869#2,2:259\n1#3:255\n1#3:256\n136#4:261\n136#4:262\n136#4:263\n126#4,2:264\n126#4,2:266\n*S KotlinDebug\n*F\n+ 1 TabViewOrderController.kt\ncom/kubi/tradefacade/tabs/helper/TabViewOrderController\n*L\n90#1:245,9\n90#1:254\n90#1:257\n90#1:258\n99#1:259,2\n90#1:256\n181#1:261\n205#1:262\n210#1:263\n236#1:264,2\n241#1:266,2\n*E\n"})
public final class C4834l {

    /* JADX INFO: renamed from: a */
    @Nullable
    public C45715b f4865a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Map<TabBiz, View> f4866b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Map<TabBiz, Integer> f4867c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f4868d = LazyKt.lazy(new Function0() { // from class: c40.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C4834l.m4938o());
        }
    });

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f4869e = LazyKt.lazy(new Function0() { // from class: c40.i
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(C4834l.m4937n());
        }
    });

    /* JADX INFO: renamed from: i */
    public static final Unit m4934i(TradeTabSortData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TabBiz biz = it.getBiz();
        if (Intrinsics.areEqual(biz, TabBiz.C25996b.f52000b)) {
            C46683a.f104520a.m102905d().mo63679c();
        } else if (Intrinsics.areEqual(biz, TabBiz.C25998d.f52004b)) {
            InterfaceC37758j.a.m85163l(C37304a.f82764a, null, null, null, null, null, null, null, 127, null);
        } else if (Intrinsics.areEqual(biz, TabBiz.C25997c.f52002b)) {
            Router.f46192a.m56184f("krn/router").m4038a(Constants.BIZ, "convert").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_convert_rn").m4038a("route", Uri.encode("ConvertPage?from=BTC&to=USDT")).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m4935l(C4834l c4834l, AppCompatImageView appCompatImageView, C45715b c45715b, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(appCompatImageView);
        c4834l.m4946r(appCompatImageView);
        Context context = c45715b.f103069i.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c4834l.m4941h(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m4936m(C4834l c4834l, AppCompatImageView appCompatImageView, C45715b c45715b, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNull(appCompatImageView);
        c4834l.m4946r(appCompatImageView);
        Context context = c45715b.f103069i.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        c4834l.m4941h(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final int m4937n() {
        return R$string.kc_trade_settings_edit_guide_desc;
    }

    /* JADX INFO: renamed from: o */
    public static final int m4938o() {
        return R$string.kc_trade_settings_guide_desc;
    }

    /* JADX INFO: renamed from: h */
    public final void m4941h(Context context) {
        AppCompatImageView appCompatImageView;
        List<TradeTabSortData> listM584g = C0123f.f448a.m584g(C0123f.a.b.f452a);
        if (listM584g.isEmpty()) {
            TradeTabSortSettingFragment.f52017W.launchPage(context);
            return;
        }
        C45715b c45715b = this.f4865a;
        if (c45715b == null || (appCompatImageView = c45715b.f103069i) == null) {
            return;
        }
        C4826d.m4924g(context, appCompatImageView, listM584g, new Function1() { // from class: c40.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4834l.m4934i((TradeTabSortData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m4942j() {
        C45715b c45715b;
        Object next;
        List<TradeTabSortData> listM584g = C0123f.f448a.m584g(C0123f.a.c.f453a);
        if (listM584g.isEmpty() || (c45715b = this.f4865a) == null) {
            return;
        }
        IntRange intRangeUntil = RangesKt.until(0, c45715b.f103076p.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            View childAt = c45715b.f103076p.getChildAt(((IntIterator) it).nextInt());
            Iterator<T> it2 = this.f4866b.entrySet().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.areEqual(((Map.Entry) next).getValue(), childAt));
            Map.Entry entry = (Map.Entry) next;
            TabBiz tabBiz = entry != null ? (TabBiz) entry.getKey() : null;
            if (tabBiz != null) {
                arrayList.add(tabBiz);
            }
        }
        if (!Intrinsics.areEqual(arrayList, listM584g)) {
            c45715b.f103076p.removeAllViews();
            Iterator<T> it3 = listM584g.iterator();
            while (it3.hasNext()) {
                View view = this.f4866b.get(((TradeTabSortData) it3.next()).getBiz());
                if (view != null) {
                    c45715b.f103076p.addView(view);
                }
            }
        }
        Integer num = this.f4867c.get(C0123f.f448a.m586i());
        if (num != null) {
            c45715b.f103076p.m54743f(num.intValue());
        }
        m4950x();
    }

    /* JADX INFO: renamed from: k */
    public final void m4943k(@Nullable final C45715b c45715b, boolean z11) {
        this.f4865a = c45715b;
        if (c45715b != null) {
            this.f4866b.clear();
            Map<TabBiz, View> map = this.f4866b;
            TabBiz.C26000f c26000f = TabBiz.C26000f.f52008b;
            map.put(c26000f, c45715b.f103074n);
            Map<TabBiz, View> map2 = this.f4866b;
            TabBiz.C25999e c25999e = TabBiz.C25999e.f52006b;
            map2.put(c25999e, c45715b.f103063c);
            Map<TabBiz, View> map3 = this.f4866b;
            TabBiz.C25995a c25995a = TabBiz.C25995a.f51998b;
            map3.put(c25995a, c45715b.f103072l);
            this.f4866b.put(TabBiz.C25996b.f52000b, c45715b.f103079s);
            this.f4866b.put(TabBiz.C25998d.f52004b, c45715b.f103062b);
            this.f4866b.put(TabBiz.C25997c.f52002b, c45715b.f103075o);
            this.f4867c.put(c26000f, Integer.valueOf(c45715b.f103074n.getId()));
            this.f4867c.put(c25999e, Integer.valueOf(c45715b.f103077q.getId()));
            this.f4867c.put(c25995a, Integer.valueOf(c45715b.f103072l.getId()));
            if (!z11) {
                AppCompatImageView ivPreShadowSettings = c45715b.f103068h;
                Intrinsics.checkNotNullExpressionValue(ivPreShadowSettings, "ivPreShadowSettings");
                ViewExtKt.m66577h(ivPreShadowSettings);
                AppCompatImageView ivTabSettings = c45715b.f103069i;
                Intrinsics.checkNotNullExpressionValue(ivTabSettings, "ivTabSettings");
                ViewExtKt.m66577h(ivTabSettings);
                return;
            }
            final AppCompatImageView appCompatImageView = c45715b.f103068h;
            Intrinsics.checkNotNull(appCompatImageView);
            ViewExtKt.m66594y(appCompatImageView);
            ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: c40.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4834l.m4935l(this.f4857b, appCompatImageView, c45715b, (View) obj);
                }
            });
            final AppCompatImageView appCompatImageView2 = c45715b.f103069i;
            Intrinsics.checkNotNull(appCompatImageView2);
            ViewExtKt.m66594y(appCompatImageView2);
            ViewExtKt.m66575f(appCompatImageView2, new Function1() { // from class: c40.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4834l.m4936m(this.f4860b, appCompatImageView2, c45715b, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m4944p() {
        return ((Number) this.f4869e.getValue()).intValue();
    }

    /* JADX INFO: renamed from: q */
    public final int m4945q() {
        return ((Number) this.f4868d.getValue()).intValue();
    }

    /* JADX INFO: renamed from: r */
    public final void m4946r(View view) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        C45715b c45715b = this.f4865a;
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = (c45715b == null || (appCompatImageView2 = c45715b.f103069i) == null) ? null : Boolean.valueOf(PopBubbleHelper.f52038a.m63664b(appCompatImageView2, StorageIds.f52040a.m63668b().getKey()));
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(boolValueOf2, bool)) {
            C46392a.m102328k(StorageIds.f52040a.m63668b(), true);
        }
        C45715b c45715b2 = this.f4865a;
        if (c45715b2 != null && (appCompatImageView = c45715b2.f103069i) != null) {
            boolValueOf = Boolean.valueOf(PopBubbleHelper.f52038a.m63664b(appCompatImageView, StorageIds.f52040a.m63669c().getKey()));
        }
        if (Intrinsics.areEqual(boolValueOf, bool)) {
            C46392a.m102328k(StorageIds.f52040a.m63669c(), true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4947s(int i11) {
        Map<TabBiz, Integer> map = this.f4867c;
        TabBiz.C26000f c26000f = TabBiz.C26000f.f52008b;
        Integer num = map.get(c26000f);
        if (num != null && i11 == num.intValue()) {
            C0123f.f448a.m587j(c26000f);
            return;
        }
        Map<TabBiz, Integer> map2 = this.f4867c;
        TabBiz.C25999e c25999e = TabBiz.C25999e.f52006b;
        Integer num2 = map2.get(c25999e);
        if (num2 != null && i11 == num2.intValue()) {
            C0123f.f448a.m587j(c25999e);
            return;
        }
        Map<TabBiz, Integer> map3 = this.f4867c;
        TabBiz.C25995a c25995a = TabBiz.C25995a.f51998b;
        Integer num3 = map3.get(c25995a);
        if (num3 != null && i11 == num3.intValue()) {
            C0123f.f448a.m587j(c25995a);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4948t() {
        C45715b c45715b;
        final AppCompatImageView appCompatImageView;
        StorageIds storageIds = StorageIds.f52040a;
        if (!C46392a.m102322d(storageIds.m63667a(), false) || C46392a.m102322d(storageIds.m63668b(), false) || C0123f.f448a.m584g(C0123f.a.b.f452a).isEmpty() || (c45715b = this.f4865a) == null || (appCompatImageView = c45715b.f103069i) == null) {
            return;
        }
        PopBubbleHelper.m63662e(PopBubbleHelper.f52038a, appCompatImageView, appCompatImageView.getContext().getString(m4944p()), 0, storageIds.m63668b().getKey(), false, 3000L, new Function0() { // from class: c40.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4834l.m4939u(this.f4863b, appCompatImageView);
            }
        }, 2, null);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4949v() {
        final AppCompatImageView appCompatImageView;
        StorageIds storageIds = StorageIds.f52040a;
        if (C46392a.m102322d(storageIds.m63669c(), false)) {
            return false;
        }
        C45715b c45715b = this.f4865a;
        if (c45715b == null || (appCompatImageView = c45715b.f103069i) == null) {
            return true;
        }
        PopBubbleHelper.m63662e(PopBubbleHelper.f52038a, appCompatImageView, appCompatImageView.getContext().getString(m4945q()), 0, storageIds.m63669c().getKey(), false, null, new Function0() { // from class: c40.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4834l.m4940w(this.f4855b, appCompatImageView);
            }
        }, 26, null);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m4939u(C4834l c4834l, AppCompatImageView appCompatImageView) {
        c4834l.m4946r(appCompatImageView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m4940w(C4834l c4834l, AppCompatImageView appCompatImageView) {
        c4834l.m4946r(appCompatImageView);
        c4834l.m4948t();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public final void m4950x() {
        if (!m4949v()) {
            m4948t();
        }
    }
}
