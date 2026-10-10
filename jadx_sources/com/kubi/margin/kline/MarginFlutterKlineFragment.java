package com.kubi.margin.kline;

import android.os.Bundle;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.config.KlineBSConfig;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.PaintFromType;
import com.kubi.flutter.proto.kline.SelectPadConfig;
import com.kubi.flutter.proto.kline.SelectPadConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SelectPadItemType;
import com.kubi.flutter.proto.kline.SelectPadViewMode;
import com.kubi.flutter.proto.kline.SubIndexType;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.flutter.widget.R$id;
import com.kubi.flutter.widget.kline.IKLineContainer;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineContainer;
import com.kubi.flutter.widget.kline.KLineConverter;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.flutter.widget.kline.interactor.KLineIndexDataInteractor;
import com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor;
import com.kubi.flutter.widget.kline.view.KlinePageBaseFragment;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.sdk.IKlineFragment;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37878b0;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MarginFlutterKlineFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0006J\u0010\u0010'\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020(J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020*R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", "isIndex", "", "()Z", "isIndex$delegate", "Lkotlin/Lazy;", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDataFirstLoaded", "checkType", "type", "", "checkMain", "status", "checkNoMain", "checkDrawTool", "toolBarType", "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;", "hideChart", "isMain", "checkHistory", "isChecked", "checkActive", "initDrawTool", "Lcom/kubi/flutter/proto/kline/PaintFromType;", "deleteAllDraw", "Lcom/kubi/flutter/proto/kline/AlertClickType;", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginFlutterKlineFragment.kt\ncom/kubi/margin/kline/MarginFlutterKlineFragment\n+ 2 SelectPadConfigKt.kt\ncom/kubi/flutter/proto/kline/SelectPadConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,214:1\n8#2:215\n1#3:216\n35#4,4:217\n39#4:223\n35#4,4:224\n39#4:230\n44#5,2:221\n44#5,2:228\n*S KotlinDebug\n*F\n+ 1 MarginFlutterKlineFragment.kt\ncom/kubi/margin/kline/MarginFlutterKlineFragment\n*L\n89#1:215\n89#1:216\n117#1:217,4\n117#1:223\n118#1:224,4\n118#1:230\n117#1:221,2\n118#1:228,2\n*E\n"})
public final class MarginFlutterKlineFragment extends KlinePageBaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f33086Z = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f33087Y = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.kline.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginFlutterKlineFragment.m38488A3(this.f33120b));
        }
    });

    /* JADX INFO: compiled from: MarginFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t¨\u0006\r"}, m90084d2 = {"Lcom/kubi/margin/kline/MarginFlutterKlineFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/margin/kline/MarginFlutterKlineFragment;", "symbol", "", "precision", "", "isIndex", "", "tradeType", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ MarginFlutterKlineFragment newInstance$default(Companion companion, String str, int i11, boolean z11, int i12, int i13, Object obj) {
            if ((i13 & 4) != 0) {
                z11 = false;
            }
            return companion.newInstance(str, i11, z11, i12);
        }

        @NotNull
        public final MarginFlutterKlineFragment newInstance(@NotNull String symbol, int precision, boolean isIndex, int tradeType) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            MarginFlutterKlineFragment marginFlutterKlineFragment = new MarginFlutterKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putInt("data_3", precision);
            bundle.putBoolean("data_4", isIndex);
            bundle.putInt("tradeType", tradeType);
            marginFlutterKlineFragment.setArguments(bundle);
            return marginFlutterKlineFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineFragment$a */
    /* JADX INFO: compiled from: MarginFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/kline/MarginFlutterKlineFragment$onViewCreated$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "onJumpOrder", "", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17683a implements IKLineContainer.a {

        /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineFragment$a$a */
        /* JADX INFO: compiled from: MarginFlutterKlineFragment.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[OrderItem.BizType.values().length];
                try {
                    iArr[OrderItem.BizType.BIZ_CROSS_MARGIN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderItem.BizType.BIZ_ISOLATED_MARGIN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[OrderItem.OrderSide.values().length];
                try {
                    iArr2[OrderItem.OrderSide.BUY_LONG.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[OrderItem.OrderSide.SELL_SHORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        /* JADX INFO: renamed from: a */
        public void mo24268a(OrderItem orderItem) {
            String str;
            Intrinsics.checkNotNullParameter(orderItem, "orderItem");
            OrderItem.BizType bizType = orderItem.getBizType();
            int i11 = bizType == null ? -1 : a.$EnumSwitchMapping$0[bizType.ordinal()];
            char c11 = (i11 == 1 || i11 != 2) ? (char) 1 : (char) 2;
            OrderItem.OrderSide side = orderItem.getSide();
            int i12 = side != null ? a.$EnumSwitchMapping$1[side.ordinal()] : -1;
            if (i12 != 1) {
                str = i12 != 2 ? "" : "sell";
            } else {
                str = "buy";
            }
            InterfaceC37756h.a.m85146d(C37304a.f82764a, c11 == 2 ? "isolated" : "cross", 2L, orderItem.getSymbol(), orderItem.getSymbol(), str, null, null, null, 224, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C17684b extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineFragment$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C17685c extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: M1 */
    private final boolean m38489M1() {
        return ((Boolean) this.f33087Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m38491z3(MarginFlutterKlineFragment marginFlutterKlineFragment, PaintFromType paintFromType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paintFromType = PaintFromType.NoPaint;
        }
        marginFlutterKlineFragment.m38500y3(paintFromType);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: k3 */
    public KLineViewController.InitParam mo24399k3() {
        String str;
        boolean z11;
        Object objM20457a;
        Object objM20457a2;
        C37878b0 c37878b0 = C37878b0.f85252a;
        int iM85523d = c37878b0.m85523d();
        if (m38489M1()) {
            Bundle arguments = getArguments();
            String strM66668h = C27041f.m66668h(arguments != null ? arguments.getString("symbol") : null);
            Bundle arguments2 = getArguments();
            int iM66651k = C27039d.m66651k(arguments2 != null ? Integer.valueOf(arguments2.getInt("data_3")) : null, 2);
            KLineConverter kLineConverter = KLineConverter.f22477a;
            KLineType kLineTypeM24353a = kLineConverter.m24353a(iM85523d);
            List<MainIndexType> listM24354b = kLineConverter.m24354b(c37878b0.m85525f());
            List<SubIndexType> listM24355c = kLineConverter.m24355c(c37878b0.m85526g());
            boolean z12 = iM85523d == 0;
            SelectPadConfigKt$Dsl.Companion companion = SelectPadConfigKt$Dsl.f22180b;
            SelectPadConfig.C12708c c12708cNewBuilder = SelectPadConfig.newBuilder();
            Intrinsics.checkNotNullExpressionValue(c12708cNewBuilder, "newBuilder(...)");
            SelectPadConfigKt$Dsl selectPadConfigKt$Dsl_create = companion._create(c12708cNewBuilder);
            selectPadConfigKt$Dsl_create.m24028d(SelectPadViewMode.FLOAT_PAD);
            selectPadConfigKt$Dsl_create.m24026b(selectPadConfigKt$Dsl_create.m24027c(), CollectionsKt.listOf((Object[]) new SelectPadItemType[]{SelectPadItemType.TIME_DATA, SelectPadItemType.OPEN_DATA, SelectPadItemType.HIGH_DATA, SelectPadItemType.LOW_DATA, SelectPadItemType.CLOSE_DATA, SelectPadItemType.CHANGE_AMOUNT_DATA, SelectPadItemType.CHANGE_RATIO_DATA}));
            return new KLineViewController.InitParam(strM66668h, iM66651k, kLineTypeM24353a, "spot-index", listM24354b, listM24355c, z12, selectPadConfigKt$Dsl_create.m24025a(), null, null, false, false, false, false, 16128, null);
        }
        Bundle arguments3 = getArguments();
        String strM66668h2 = C27041f.m66668h(arguments3 != null ? arguments3.getString("symbol") : null);
        Bundle arguments4 = getArguments();
        int iM66651k2 = C27039d.m66651k(arguments4 != null ? Integer.valueOf(arguments4.getInt("data_3")) : null, 2);
        KLineConverter kLineConverter2 = KLineConverter.f22477a;
        KLineType kLineTypeM24353a2 = kLineConverter2.m24353a(iM85523d);
        List<MainIndexType> listM24354b2 = kLineConverter2.m24354b(c37878b0.m85525f());
        List<SubIndexType> listM24356d = kLineConverter2.m24356d(c37878b0.m85526g());
        boolean z13 = iM85523d == 0;
        Bundle arguments5 = getArguments();
        int iM66651k3 = C27039d.m66651k(arguments5 != null ? Integer.valueOf(arguments5.getInt("tradeType")) : null, -1);
        if (iM66651k3 != 1) {
            str = iM66651k3 != 2 ? "" : "MARGIN_ISOLATED_TRADE";
        } else {
            str = "MARGIN_TRADE";
        }
        String str2 = str;
        if (IUserService.a.get().c()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C17684b().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a2 = RemoteConfig.m20457a("kline_b_s_active", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a2 = null;
            }
            KlineBSConfig klineBSConfig = (KlineBSConfig) objM20457a2;
            if (C27025c.m66567e(klineBSConfig != null ? klineBSConfig.isMarginEnable() : null, true)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        try {
            RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
            Type type2 = new C17685c().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kline_b_s", type2);
        } catch (Throwable th3) {
            C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KlineBSConfig klineBSConfig2 = (KlineBSConfig) objM20457a;
        return new KLineViewController.InitParam(strM66668h2, iM66651k2, kLineTypeM24353a2, ViewProps.MARGIN, listM24354b2, listM24356d, z13, null, null, str2, false, false, C27025c.m66567e(klineBSConfig2 != null ? klineBSConfig2.isMarginEnable() : null, true), z11, 3456, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        KLineContainer kLineContainer = (KLineContainer) findViewById(R$id.klineChart);
        if (kLineContainer == null) {
            return;
        }
        kLineContainer.mo24148e(new C17683a());
    }

    /* JADX INFO: renamed from: r3 */
    public final void m38493r3(@NotNull ToolBarClick.ToolBarItemType toolBarType) {
        Intrinsics.checkNotNullParameter(toolBarType, "toolBarType");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24234z(toolBarType);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m38497v3(int i11) {
        KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(i11);
        boolean z11 = i11 == 0;
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24211A(kLineTypeM24353a, z11);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m38498w3(@NotNull AlertClickType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24213C(type);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m38499x3(boolean z11) {
        if (z11) {
            KLineViewController f22497u = getF22497U();
            if (f22497u != null) {
                f22497u.m24230u(CollectionsKt.emptyList());
                return;
            }
            return;
        }
        KLineViewController f22497u2 = getF22497U();
        if (f22497u2 != null) {
            f22497u2.m24232w(m38489M1() ? CollectionsKt.emptyList() : CollectionsKt.listOf(SubIndexType.VOL));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m38500y3(@NotNull PaintFromType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24215E(type);
        }
    }

    public MarginFlutterKlineFragment() {
        setNeedLoadingView(false);
    }

    /* JADX INFO: renamed from: A3 */
    public static final boolean m38488A3(MarginFlutterKlineFragment marginFlutterKlineFragment) {
        Bundle arguments = marginFlutterKlineFragment.getArguments();
        if (arguments == null) {
            return false;
        }
        return arguments.getBoolean("data_4", false);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public IKLineDataInteractor mo24400l3() {
        if (m38489M1()) {
            return new KLineIndexDataInteractor();
        }
        return new KLineMarketDataInteractor();
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    /* JADX INFO: renamed from: m3 */
    public void mo24401m3() {
        if (!m38489M1()) {
            TracePageHelper.m42467b("load_k_lever");
            C43841b.m96557d("margin_k_line_page_load", "page_load_end", null, 4, null);
        }
    }

    /* JADX INFO: renamed from: q3 */
    public final void m38492q3(boolean z11) {
        m24402n3(z11);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m38494s3(boolean z11) {
        m24403o3(z11);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m38495t3(int i11) {
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24230u(KLineConverter.f22477a.m24354b(i11));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m38496u3(int i11) {
        List<SubIndexType> listM24356d;
        if (m38489M1()) {
            listM24356d = KLineConverter.f22477a.m24355c(i11);
        } else {
            listM24356d = KLineConverter.f22477a.m24356d(i11);
        }
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24232w(listM24356d);
        }
    }
}
