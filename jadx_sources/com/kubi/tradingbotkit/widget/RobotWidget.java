package com.kubi.tradingbotkit.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.host.HostManager;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ReloadRefreshView;
import com.kubi.resources.widget.TrendChartView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.widget.entity.RobotWidgetEntity;
import com.kubi.tradingbotkit.widget.entity.TaskProfitRateCurve;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l50.C42091r;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p208dr.InterfaceC36952a;
import p429lf.C42180b;
import p50.InterfaceC43390a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: RobotWidget.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001f\u001a\u00020\u001eH\u0014J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0016J\u001a\u0010#\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u001a\u0010&\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u0017H\u0002J\u0017\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010)J\u0017\u0010*\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010)J\u0012\u0010+\u001a\u00020,2\b\u0010$\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020/2\b\u0010$\u001a\u0004\u0018\u00010\rH\u0002J\b\u00100\u001a\u00020!H\u0014J\b\u00101\u001a\u00020!H\u0014J\u0016\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u001eH\u0002J\u0010\u00106\u001a\u00020!2\u0006\u00107\u001a\u000208H\u0014J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020!H\u0002J\u0018\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u001eH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0017X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/RobotWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/tradingbotkit/widget/RobotWidgetContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitHomeWidgetBinding;", "getBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitHomeWidgetBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "currentRobots", "", "Lcom/kubi/tradingbotkit/widget/entity/RobotWidgetEntity;", "lastExposedTaskId", "", "Ljava/lang/Long;", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/tradingbotkit/widget/RobotWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "pageId", "", "getPageId", "()Ljava/lang/String;", "blockId", "getBlockId", "futureStrategyTypes", "", "", "getLayout", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "trackPageClick", "model", "locationId", "trackPageExpose", "getStrategyName", "gridType", "(Ljava/lang/Integer;)Ljava/lang/String;", "getStrategyNameTrackEn", "getSymbolDisplay", "Lcom/kubi/tradingbotkit/widget/RobotWidget$SymbolDisplay;", "bindItem", "itemView", "Landroid/view/View;", "bindFlowEvent", "bindUIState", "setData", "robots", "exposeBannerItem", ViewProps.POSITION, "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContentOrReload", "showReload", "", "jumpToRobotHome", "jumpToRobotDetail", "taskId", "templateType", "SymbolDisplay", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRobotWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RobotWidget.kt\ncom/kubi/tradingbotkit/widget/RobotWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 6 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 7 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,354:1\n143#2,20:355\n1#3:375\n1#3:402\n1563#4:376\n1634#4,3:377\n774#4:380\n865#4,2:381\n1563#4:383\n1634#4,3:384\n774#4:387\n865#4,2:388\n1617#4,9:392\n1869#4:401\n1870#4:403\n1626#4:404\n17#5,2:390\n153#6,7:405\n93#7,4:412\n*S KotlinDebug\n*F\n+ 1 RobotWidget.kt\ncom/kubi/tradingbotkit/widget/RobotWidget\n*L\n51#1:355,20\n263#1:402\n161#1:376\n161#1:377,3\n165#1:380\n165#1:381,2\n174#1:383\n174#1:384,3\n176#1:387\n176#1:388,2\n263#1:392,9\n263#1:401\n263#1:403\n263#1:404\n223#1:390,2\n271#1:405,7\n310#1:412,4\n*E\n"})
public final class RobotWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f52498d0 = {Reflection.property1(new PropertyReference1Impl(RobotWidget.class, "binding", "getBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitHomeWidgetBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public Long f52501Z;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f52499X = C45681e.m100799e(this, new Function1<RobotWidget, C42091r>() { // from class: com.kubi.tradingbotkit.widget.RobotWidget$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42091r invoke(@NotNull RobotWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42091r.m92335a(fragment.requireView());
        }
    }, new Function1<C42091r, Unit>() { // from class: com.kubi.tradingbotkit.widget.RobotWidget$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C42091r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42091r c42091r) {
            invoke(c42091r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public List<RobotWidgetEntity> f52500Y = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final String f52502a0 = HomeCardViewHolderProxy.PAGE_ID;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final String f52503b0 = "widget";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Set<Integer> f52504c0 = SetsKt.setOf((Object[]) new Integer[]{3, 9, 12, 13});

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.widget.RobotWidget$a, reason: from toString */
    /* JADX INFO: compiled from: RobotWidget.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/tradingbotkit/widget/RobotWidget$SymbolDisplay;", "", "name", "", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class SymbolDisplay {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final String tag;

        public SymbolDisplay(@NotNull String name, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.name = name;
            this.tag = tag;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SymbolDisplay)) {
                return false;
            }
            SymbolDisplay symbolDisplay = (SymbolDisplay) other;
            return Intrinsics.areEqual(this.name, symbolDisplay.name) && Intrinsics.areEqual(this.tag, symbolDisplay.tag);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.tag.hashCode();
        }

        @NotNull
        public String toString() {
            return "SymbolDisplay(name=" + this.name + ", tag=" + this.tag + ')';
        }

        public /* synthetic */ SymbolDisplay(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "" : str2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.widget.RobotWidget$b */
    /* JADX INFO: compiled from: RobotWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradingbotkit/widget/RobotWidget$initView$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26247b extends ViewPager.SimpleOnPageChangeListener {
        public C26247b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            RobotWidget.this.m64339w3(position);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A3 */
    public final SymbolDisplay m64340A3(RobotWidgetEntity robotWidgetEntity) {
        Integer templateType;
        int i11 = 2;
        String str = "--";
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (robotWidgetEntity == null || (templateType = robotWidgetEntity.getTemplateType()) == null) {
            return new SymbolDisplay(str, objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        }
        List<String> symbols = robotWidgetEntity.getSymbols();
        if (symbols == null) {
            symbols = CollectionsKt.emptyList();
        }
        if (!this.f52504c0.contains(templateType)) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(symbols, 10));
            Iterator<T> it = symbols.iterator();
            while (it.hasNext()) {
                SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B((String) it.next());
                arrayList.add(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!StringsKt.isBlank((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            return new SymbolDisplay(C27041f.m66669i(C42828b.m93915p(CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, new Function1() { // from class: com.kubi.tradingbotkit.widget.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RobotWidget.m64323C3((String) obj2);
                }
            }, 30, null)), "--"), objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0);
        }
        IKuMexService iKuMexService = IKuMexService.f28731a.get();
        String str2 = (String) CollectionsKt.firstOrNull((List) symbols);
        String string = str2 != null ? StringsKt.trim((CharSequence) iKuMexService.mo33289s(str2)).toString() : null;
        if (string == null) {
            string = "";
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(symbols, 10));
        Iterator<T> it2 = symbols.iterator();
        while (it2.hasNext()) {
            arrayList3.add(iKuMexService.mo33264M((String) it2.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!StringsKt.isBlank((String) obj2)) {
                arrayList4.add(obj2);
            }
        }
        return new SymbolDisplay(C27041f.m66669i(C42828b.m93915p(CollectionsKt.joinToString$default(arrayList4, ", ", null, null, 0, null, new Function1() { // from class: com.kubi.tradingbotkit.widget.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return RobotWidget.m64322B3((String) obj3);
            }
        }, 30, null)), "--"), string);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m64343J3(RobotWidgetEntity robotWidgetEntity, String str) {
        Long taskId;
        C43852m.m96590b(this.f52502a0, this.f52503b0, str, TuplesKt.m90091to("grid_type", m64348z3(robotWidgetEntity != null ? robotWidgetEntity.getTemplateType() : null)), TuplesKt.m90091to("contentID", String.valueOf((robotWidgetEntity == null || (taskId = robotWidgetEntity.getTaskId()) == null) ? null : taskId.toString())));
    }

    /* JADX INFO: renamed from: K3 */
    public final void m64344K3(RobotWidgetEntity robotWidgetEntity, String str) {
        Long taskId;
        C43852m.m96594f(this.f52502a0, this.f52503b0, str, TuplesKt.m90091to("grid_type", m64348z3(robotWidgetEntity != null ? robotWidgetEntity.getTemplateType() : null)), TuplesKt.m90091to("contentID", String.valueOf((robotWidgetEntity == null || (taskId = robotWidgetEntity.getTaskId()) == null) ? null : taskId.toString())));
    }

    /* JADX INFO: renamed from: y3 */
    public final String m64347y3(Integer num) {
        if (num != null && num.intValue() == 0) {
            return C27017c.f54310a.m66516f(R$string.all, new Object[0]);
        }
        if (num != null && num.intValue() == 1) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_grid, new Object[0]);
        }
        if (num != null && num.intValue() == 2) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_aip, new Object[0]);
        }
        if (num != null && num.intValue() == 3) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_futures_grid, new Object[0]);
        }
        if (num != null && num.intValue() == 4) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_positions, new Object[0]);
        }
        if (num != null && num.intValue() == 5) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_infinity, new Object[0]);
        }
        if (num != null && num.intValue() == 7) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_martin_gale, new Object[0]);
        }
        if (num != null && num.intValue() == 8) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_ai, new Object[0]);
        }
        if (num != null && num.intValue() == 9) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_futures_win_two_way, new Object[0]);
        }
        if (num != null && num.intValue() == 10) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_margin_grid, new Object[0]);
        }
        if (num != null && num.intValue() == 11) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_spot_cta, new Object[0]);
        }
        if (num != null && num.intValue() == 12) {
            return C27017c.f54310a.m66516f(R$string.kc_tb_futures_martin_gale, new Object[0]);
        }
        return (num != null && num.intValue() == 13) ? C27017c.f54310a.m66516f(R$string.kc_tb_futures_cta, new Object[0]) : "";
    }

    /* JADX INFO: renamed from: B3 */
    public static final CharSequence m64322B3(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String strM93915p = C42828b.m93915p(symbol);
        return strM93915p == null ? "" : strM93915p;
    }

    /* JADX INFO: renamed from: C3 */
    public static final CharSequence m64323C3(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        String strM93915p = C42828b.m93915p(symbol);
        return strM93915p == null ? "" : strM93915p;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m64327I3(C42091r c42091r, RobotWidget robotWidget) {
        c42091r.f93254d.setLoading(true);
        robotWidget.sendIntent(new RobotWidgetContract$UiIntent.LoadData(false, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m64338v3(RobotWidgetEntity robotWidgetEntity, RobotWidget robotWidget) {
        Integer templateType;
        Long taskId;
        String string = (robotWidgetEntity == null || (taskId = robotWidgetEntity.getTaskId()) == null) ? null : taskId.toString();
        if (string == null) {
            string = "";
        }
        robotWidget.m64341E3(string, (robotWidgetEntity == null || (templateType = robotWidgetEntity.getTemplateType()) == null) ? 0 : templateType.intValue());
        robotWidget.m64343J3(robotWidgetEntity, "robotBanner");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m64339w3(int i11) {
        RobotWidgetEntity robotWidgetEntity = (RobotWidgetEntity) CollectionsKt.getOrNull(this.f52500Y, i11);
        if (robotWidgetEntity == null || Intrinsics.areEqual(this.f52501Z, robotWidgetEntity.getTaskId())) {
            return;
        }
        this.f52501Z = robotWidgetEntity.getTaskId();
        m64344K3(robotWidgetEntity, "robot");
    }

    /* JADX INFO: renamed from: E3 */
    public final void m64341E3(String str, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.j() + "/machine/copy/" + str + "?type=" + i11 + "&modal=quick_order&lang=" + MultiLanguageManager.f46811g.getLocale() + "&loading=2&needLogin=true&utm_source=HomeWidgetToRobotDetail", null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: F3 */
    public final void m64342F3() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, HostManager.a.j() + "?modal=daily_picks&lang=" + MultiLanguageManager.f46811g.getLocale() + "&loading=2&needLogin=true&utm_source=HomeWidgetToRobotHome", null, null, null, null, null, null, 126, null);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C26256g) {
            m64326H3(true);
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.btrading_bot_kit_home_widget;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<RobotWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(RobotWidgetVM.class);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m64345t3(View view, final RobotWidgetEntity robotWidgetEntity) {
        int color;
        int i11;
        List<Double> listEmptyList;
        List<TaskProfitRateCurve> profitRateCurves;
        String strM92642g;
        Integer copyNum;
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.tradingbotkit.widget.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RobotWidget.m64338v3(robotWidgetEntity, this);
            }
        }, 1, null);
        SymbolDisplay symbolDisplayM64340A3 = m64340A3(robotWidgetEntity);
        ((TextView) view.findViewById(R$id.tvSymbolName)).setText(symbolDisplayM64340A3.getName());
        TextView textView = (TextView) view.findViewById(R$id.tvSymbolTag);
        textView.setText(symbolDisplayM64340A3.getTag());
        boolean zIsBlank = StringsKt.isBlank(symbolDisplayM64340A3.getTag());
        Intrinsics.checkNotNull(textView);
        if (zIsBlank) {
            C27046k.m66700o(textView);
        } else {
            C27046k.m66685H(textView);
        }
        BigDecimal profitRate = robotWidgetEntity != null ? robotWidgetEntity.getProfitRate() : null;
        int iIntValue = (robotWidgetEntity == null || (copyNum = robotWidgetEntity.getCopyNum()) == null) ? 0 : copyNum.intValue();
        String strM64347y3 = m64347y3(robotWidgetEntity != null ? robotWidgetEntity.getTemplateType() : null);
        TrendChartView trendChartView = (TrendChartView) view.findViewById(R$id.chartView);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        Context context = view.getContext();
        boolean z11 = C27039d.m66656p(profitRate).compareTo(BigDecimal.ZERO) >= 0;
        Intrinsics.checkNotNull(context);
        int iM54281f = C22890g.m54281f(context, z11);
        if (zM33189n) {
            color = z11 ? ContextCompat.getColor(context, R$color.primary20) : ContextCompat.getColor(context, R$color.secondary20);
        } else {
            color = z11 ? ContextCompat.getColor(context, R$color.secondary20) : ContextCompat.getColor(context, R$color.primary20);
        }
        Object objM56186h = Router.f46192a.m56186h(InterfaceC43390a.class, SiteInfoManager.f47913a.m58109c());
        boolean zMo95566a = objM56186h != null ? ((InterfaceC43390a) objM56186h).mo95566a() : true;
        if (robotWidgetEntity != null) {
            BaseTextView baseTextView = (BaseTextView) view.findViewById(R$id.tvTitle);
            Intrinsics.checkNotNull(baseTextView);
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.widget.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RobotWidget.m64337u3(this.f52516b, robotWidgetEntity);
                }
            }, 1, null);
            BaseCardDataV2 f27909u = getF27909U();
            baseTextView.setText(f27909u != null ? f27909u.getTitle() : null);
            ViewExtKt.m66594y(baseTextView);
            BaseTextView baseTextView2 = (BaseTextView) view.findViewById(R$id.tvGrid);
            baseTextView2.setText(strM64347y3);
            Intrinsics.checkNotNull(baseTextView2);
            ViewExtKt.m66594y(baseTextView2);
            BaseTextView baseTextView3 = (BaseTextView) view.findViewById(R$id.tvRate);
            if (profitRate != null) {
                i11 = iM54281f;
                strM92642g = C42180b.m92642g(profitRate, null, null, 0, true, false, true, 23, null);
            } else {
                i11 = iM54281f;
                strM92642g = null;
            }
            baseTextView3.setText(C42180b.m92649n(strM92642g));
            baseTextView3.setTextColor(i11);
            Intrinsics.checkNotNull(baseTextView3);
            if (zMo95566a) {
                ViewExtKt.m66594y(baseTextView3);
            } else {
                ViewExtKt.m66577h(baseTextView3);
            }
            BaseTextView baseTextView4 = (BaseTextView) view.findViewById(R$id.tvPeopleCount);
            baseTextView4.setText(String.valueOf(iIntValue));
            Intrinsics.checkNotNull(baseTextView4);
            ViewExtKt.m66594y(baseTextView4);
        } else {
            i11 = iM54281f;
            View viewFindViewById = view.findViewById(R$id.tvRate);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            C27046k.m66703r(viewFindViewById);
        }
        if (robotWidgetEntity == null || (profitRateCurves = robotWidgetEntity.getProfitRateCurves()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = new ArrayList<>();
            Iterator<T> it = profitRateCurves.iterator();
            while (it.hasNext()) {
                BigDecimal profitRate2 = ((TaskProfitRateCurve) it.next()).getProfitRate();
                Double dValueOf = profitRate2 != null ? Double.valueOf(profitRate2.doubleValue()) : null;
                if (dValueOf != null) {
                    listEmptyList.add(dValueOf);
                }
            }
        }
        trendChartView.m54911a(listEmptyList, i11, color);
    }

    /* JADX INFO: renamed from: x3 */
    public final C42091r m64346x3() {
        return (C42091r) this.f52499X.getValue(this, f52498d0[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final String m64348z3(Integer num) {
        if (num != null && num.intValue() == 0) {
            return "ALL";
        }
        if (num != null && num.intValue() == 1) {
            return "SPOT_GRID";
        }
        if (num != null && num.intValue() == 2) {
            return "SPOT_AIP";
        }
        if (num != null && num.intValue() == 3) {
            return "CONTRACT_GRID";
        }
        if (num != null && num.intValue() == 4) {
            return "SPOT_POSITION";
        }
        if (num != null && num.intValue() == 5) {
            return "SPOT_INFINITY_GRID";
        }
        if (num != null && num.intValue() == 7) {
            return "SPOT_MARTIN_GALE";
        }
        if (num != null && num.intValue() == 8) {
            return "SPOT_SPOT_AI_GRID";
        }
        if (num != null && num.intValue() == 9) {
            return "FUTURES_WIN_TWO_WAY";
        }
        if (num != null && num.intValue() == 10) {
            return "MARGIN_MARGIN_GRID";
        }
        if (num != null && num.intValue() == 11) {
            return "SPOT_CTA";
        }
        if (num != null && num.intValue() == 12) {
            return "FUTURES_FUTURES_MARTIN_GALE";
        }
        return (num != null && num.intValue() == 13) ? "FUTURES_FUTURES_CTA" : "";
    }

    /* JADX INFO: renamed from: D3 */
    public static final void m64324D3(RobotWidget robotWidget, BGABanner bGABanner, View view, RobotWidgetEntity robotWidgetEntity, int i11) {
        Intrinsics.checkNotNull(view);
        robotWidget.m64345t3(view, robotWidgetEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public final void m64325G3(List<RobotWidgetEntity> list) {
        C42091r c42091rM64346x3 = m64346x3();
        if (c42091rM64346x3 == null) {
            return;
        }
        int iIntValue = 0;
        m64326H3(false);
        Integer num = null;
        if (list.isEmpty()) {
            this.f52500Y = CollectionsKt.emptyList();
            this.f52501Z = null;
            C12572a.m23695d("com.kubi.home.event.HomeEvent:removeHomeTradingRobotCard", null, 0L, 6, null);
            return;
        }
        this.f52500Y = list;
        this.f52501Z = null;
        c42091rM64346x3.f93252b.setData(R$layout.btrading_bot_kit_home_widget_item, list, (List<String>) null);
        Integer numValueOf = Integer.valueOf(c42091rM64346x3.f93252b.getCurrentItem());
        if (numValueOf.intValue() >= 0) {
            num = numValueOf;
        }
        if (num != null) {
            iIntValue = num.intValue();
        }
        m64339w3(iIntValue);
    }

    /* JADX INFO: renamed from: H3 */
    private final void m64326H3(boolean z11) {
        final C42091r c42091rM64346x3 = m64346x3();
        if (c42091rM64346x3 == null) {
            return;
        }
        c42091rM64346x3.f93253c.m54976c();
        c42091rM64346x3.f93254d.setLoading(false);
        if (z11) {
            BGABanner banner = c42091rM64346x3.f93252b;
            Intrinsics.checkNotNullExpressionValue(banner, "banner");
            C27046k.m66703r(banner);
            ReloadRefreshView reloadView = c42091rM64346x3.f93254d;
            Intrinsics.checkNotNullExpressionValue(reloadView, "reloadView");
            C27046k.m66685H(reloadView);
            ReloadRefreshView reloadView2 = c42091rM64346x3.f93254d;
            Intrinsics.checkNotNullExpressionValue(reloadView2, "reloadView");
            C27046k.m66711z(reloadView2, 0L, new Function0() { // from class: com.kubi.tradingbotkit.widget.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RobotWidget.m64327I3(c42091rM64346x3, this);
                }
            }, 1, null);
            return;
        }
        BGABanner banner2 = c42091rM64346x3.f93252b;
        Intrinsics.checkNotNullExpressionValue(banner2, "banner");
        C27046k.m66685H(banner2);
        ReloadRefreshView reloadView3 = c42091rM64346x3.f93254d;
        Intrinsics.checkNotNullExpressionValue(reloadView3, "reloadView");
        C27046k.m66700o(reloadView3);
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m64337u3(RobotWidget robotWidget, RobotWidgetEntity robotWidgetEntity) {
        robotWidget.m64342F3();
        robotWidget.m64343J3(robotWidgetEntity, "robotTitile");
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new RobotWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.tradingbotkit.widget.RobotWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new RobotWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C42091r c42091rM64346x3 = m64346x3();
        if (c42091rM64346x3 == null) {
            return;
        }
        c42091rM64346x3.f93252b.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.tradingbotkit.widget.a
            @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
            /* JADX INFO: renamed from: a */
            public final void mo17775a(BGABanner bGABanner, View view, Object obj, int i11) {
                RobotWidget.m64324D3(this.f52513a, bGABanner, view, (RobotWidgetEntity) obj, i11);
            }
        });
        c42091rM64346x3.f93252b.setOnPageChangeListener(new C26247b());
        c42091rM64346x3.f93253c.m54977e();
        sendIntent(new RobotWidgetContract$UiIntent.LoadData(false, 1, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        sendIntent(new RobotWidgetContract$UiIntent.LoadData(true));
    }
}
