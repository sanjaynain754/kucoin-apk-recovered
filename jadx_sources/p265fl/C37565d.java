package p265fl;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5261b0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.feature.widget.appwidget.WidgetRefreshService;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.MutableTriple;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: fl.d */
/* JADX INFO: compiled from: FloatingManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\"\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020$0#0\u001aj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020$0#`\u001cJ\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u0006H\u0003J\u001c\u0010;\u001a\u0002082\b\b\u0002\u0010<\u001a\u00020\u00062\b\b\u0002\u0010=\u001a\u00020\u0006H\u0007J\u0012\u0010>\u001a\u0002082\b\b\u0002\u0010?\u001a\u00020\u0006H\u0007J\u0012\u0010@\u001a\u0002082\b\b\u0002\u0010A\u001a\u00020\u0006H\u0007J\b\u0010B\u001a\u000208H\u0002J\u0006\u0010C\u001a\u000208J\u0006\u0010D\u001a\u00020\u0006J\u000e\u0010E\u001a\u0002082\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020\fJ\u0016\u0010I\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cJ\u000e\u0010J\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001bJ\u0006\u0010K\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001ej\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b`\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b4\u00105¨\u0006L"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/floating/FloatingManager;", "", "<init>", "()V", "FLOATING_MANAGER_KEY", "Lcom/kubi/utils/storage/StorageId;", "", "getFLOATING_MANAGER_KEY", "()Lcom/kubi/utils/storage/StorageId;", "FLOATING_LOCK_SWITCH_KEY", "getFLOATING_LOCK_SWITCH_KEY", "FLOATING_REFRESH_TIME", "", "getFLOATING_REFRESH_TIME", "FLOATING_DISPLAY_MODE", "isUpGreen", "()Z", "setUpGreen", "(Z)V", "isCn", "setCn", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "subscribe", "Lio/reactivex/disposables/Disposable;", "symbolsSet", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "nameMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getNameMap", "()Ljava/util/HashMap;", "timeData", "Lkotlin/Pair;", "", "mSmoothScroller", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "lastPoint", "Landroid/graphics/Point;", "getLastPoint", "()Landroid/graphics/Point;", "lastPoint$delegate", "Lkotlin/Lazy;", "mLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getMLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "mLayoutParams$delegate", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "windowManager$delegate", "subWs", "", "symbol", "isSub", "toggleWindowView", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "isManual", "changeDisplayMode", "isList", "checkIsLock", "isLock", "bindViewData", "onDataReceived", "checkNotPermission", "toOpenSetting", "widgetSettingFragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "symbolsSize", "getSymbols", "containSymbol", "hasShow", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nFloatingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingManager.kt\ncom/kubi/kucoin/feature/widget/floating/FloatingManager\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n136#2:388\n135#2,2:389\n135#2,2:400\n135#2,2:402\n136#2:404\n1563#3:391\n1634#3,3:392\n1563#3:395\n1634#3,2:396\n1636#3:399\n1#4:398\n*S KotlinDebug\n*F\n+ 1 FloatingManager.kt\ncom/kubi/kucoin/feature/widget/floating/FloatingManager\n*L\n180#1:388\n217#1:389,2\n385#1:400,2\n191#1:402,2\n220#1:404\n318#1:391\n318#1:392,3\n334#1:395\n334#1:396,2\n334#1:399\n*E\n"})
public final class C37565d {

    /* JADX INFO: renamed from: h */
    @Nullable
    public static View f83524h;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37565d f83517a = new C37565d();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f83518b = new StorageId<>("CATE_KV_MARKET_MONITOR", "floating_switch_key", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<Boolean> f83519c = new StorageId<>("CATE_KV_MARKET_MONITOR", "floating_lock_switch_key", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<Integer> f83520d = new StorageId<>("CATE_KV_MARKET_MONITOR", "floating_refresh_time", null, false, 12, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<Boolean> f83521e = new StorageId<>("CATE_KV_MARKET_MONITOR", "floating_display_mode", null, false, 12, null);

    /* JADX INFO: renamed from: f */
    public static boolean f83522f = DayNightThemeManager.f28592a.m33189n();

    /* JADX INFO: renamed from: g */
    public static boolean f83523g = MultiLanguageManager.m56979h();

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final ArrayList<String> f83525i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final HashMap<String, String> f83526j = new HashMap<>();

    /* JADX INFO: renamed from: k */
    @NotNull
    public static LinearSmoothScroller f83527k = new a(BaseApplication.INSTANCE.get());

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Lazy f83528l = LazyKt.lazy(new Function0() { // from class: fl.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37565d.m84595k();
        }
    });

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Lazy f83529m = LazyKt.lazy(new Function0() { // from class: fl.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37565d.m84596l();
        }
    });

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Lazy f83530n = LazyKt.lazy(new Function0() { // from class: fl.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C37565d.m84597q();
        }
    });

    /* JADX INFO: renamed from: fl.d$a */
    /* JADX INFO: compiled from: FloatingManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/feature/widget/floating/FloatingManager$mSmoothScroller$1", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "getVerticalSnapPreference", "", "calculateSpeedPerPixel", "", "displayMetrics", "Landroid/util/DisplayMetrics;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return 3.0f / displayMetrics.density;
        }

        public a(Application application) {
            super(application);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final Point m84595k() {
        return FloatingWindowConfigManager.f34272a.m40731h();
    }

    /* JADX INFO: renamed from: l */
    public static final WindowManager.LayoutParams m84596l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        return layoutParams;
    }

    /* JADX INFO: renamed from: q */
    public static final WindowManager m84597q() {
        Object systemService = BaseApplication.INSTANCE.get().getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m84598d() {
        return !Settings.canDrawOverlays(BaseApplication.INSTANCE.get());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84599e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return f83525i.contains(symbol);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<Boolean> m84600f() {
        return f83518b;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<Integer> m84601g() {
        return f83520d;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> m84602h() {
        return f83526j;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final ArrayList<String> m84603i() {
        return f83525i;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m84604j() {
        return (f83525i.isEmpty() || m84598d() || !C46392a.m102322d(f83518b, false) || f83524h == null) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final int m84606n() {
        return f83525i.size();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final ArrayList<Pair<String, Long>> m84607o() {
        ArrayList<Pair<String, Long>> arrayList = new ArrayList<>();
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$string.second_stub;
        arrayList.add(new Pair<>(c27017c.m66516f(i11, "15"), 15L));
        arrayList.add(new Pair<>(c27017c.m66516f(i11, "20"), 20L));
        arrayList.add(new Pair<>(c27017c.m66516f(i11, "30"), 30L));
        arrayList.add(new Pair<>(c27017c.m66516f(i11, OtcAd.TRADE_TIME_SIXTY), 60L));
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m84608p(@NotNull OldBaseFragment widgetSettingFragment) {
        Intrinsics.checkNotNullParameter(widgetSettingFragment, "widgetSettingFragment");
        try {
            if (C5261b0.m6149j()) {
                Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
                intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, widgetSettingFragment.requireContext().getPackageName());
                intent.setFlags(268435456);
                widgetSettingFragment.startActivity(intent);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent2.setData(Uri.parse("package:" + widgetSettingFragment.requireContext().getPackageName()));
            widgetSettingFragment.startActivityForResult(intent2, 0);
        } catch (Exception unused) {
            ToastCompat.m66437C(R$string.permission_apply);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m84605m() {
        RecyclerView.Adapter adapter;
        BaseQuickAdapter baseQuickAdapter;
        Object objPrevious;
        BigDecimal bigDecimal;
        Integer num;
        int iM66651k;
        int i11;
        BigDecimal bigDecimal2;
        int i12;
        RecyclerView recyclerView;
        if (m84604j()) {
            View view = f83524h;
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(R$id.recycler_view)) != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter instanceof BaseQuickAdapter) {
                baseQuickAdapter = (BaseQuickAdapter) adapter;
            } else {
                baseQuickAdapter = null;
            }
            if (baseQuickAdapter != null) {
                List<TradeItemBean> tradeLists = WidgetRefreshService.f27799g.getTradeLists();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tradeLists, 10));
                for (TradeItemBean tradeItemBean : tradeLists) {
                    List data = baseQuickAdapter.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    ListIterator listIterator = data.listIterator(data.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                        } else {
                            objPrevious = null;
                            break;
                        }
                    } while (!Intrinsics.areEqual(tradeItemBean.getSymbol(), ((MutableTriple) objPrevious).getSecond()));
                    MutableTriple mutableTriple = (MutableTriple) objPrevious;
                    if (mutableTriple != null) {
                        bigDecimal = (BigDecimal) mutableTriple.getFirst();
                    } else {
                        bigDecimal = null;
                    }
                    BigDecimal bigDecimalM89922G = C41014a.m89922G(bigDecimal, null, 1, null);
                    if (new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())).compareTo(bigDecimalM89922G) > 0) {
                        Resources resources = BaseApplication.INSTANCE.get().getResources();
                        if (f83522f) {
                            i12 = R$color.primary;
                        } else {
                            i12 = R$color.secondary;
                        }
                        iM66651k = resources.getColor(i12);
                    } else if (new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())).compareTo(bigDecimalM89922G) < 0) {
                        Resources resources2 = BaseApplication.INSTANCE.get().getResources();
                        if (f83522f) {
                            i11 = R$color.secondary;
                        } else {
                            i11 = R$color.primary;
                        }
                        iM66651k = resources2.getColor(i11);
                    } else {
                        if (mutableTriple != null) {
                            num = (Integer) mutableTriple.getThird();
                        } else {
                            num = null;
                        }
                        iM66651k = C27039d.m66651k(num, -1);
                    }
                    if (tradeItemBean.getLastDealPrice() == 0.0d) {
                        bigDecimal2 = null;
                    } else {
                        bigDecimal2 = new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice()));
                    }
                    arrayList.add(new MutableTriple(bigDecimal2, tradeItemBean.getSymbol(), Integer.valueOf(iM66651k)));
                }
                baseQuickAdapter.replaceData(arrayList);
            }
        }
    }
}
