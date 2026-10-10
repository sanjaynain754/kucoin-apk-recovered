package com.kubi.spot.kline.flutter;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.config.KlineBSConfig;
import com.kubi.flutter.proto.kline.AlertClickType;
import com.kubi.flutter.proto.kline.MainIndexType;
import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.proto.kline.PaintFromType;
import com.kubi.flutter.proto.kline.SubIndexType;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.flutter.widget.R$id;
import com.kubi.flutter.widget.kline.IKLineContainer;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineContainer;
import com.kubi.flutter.widget.kline.KLineConverter;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor;
import com.kubi.flutter.widget.kline.view.KlinePageBaseFragment;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.IKlineFragment;
import com.kubi.spot.business.delegation.DelegationBothFragment;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import java.lang.reflect.Type;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotFlutterKlineFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020&J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020&J\u0010\u0010*\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020+J\u000e\u0010,\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020-R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006/"}, m90084d2 = {"Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "jumpTradeDelegateRecord", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "onDataFirstLoaded", "checkSymbol", "symbol", "", "precision", "", "checkType", "type", "checkMain", "status", "checkNoMain", "checkDrawTool", "toolBarType", "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;", "hideOrShowChart", "isMain", "", "checkHistory", "isChecked", "checkActive", "initDrawTool", "Lcom/kubi/flutter/proto/kline/PaintFromType;", "deleteAllDraw", "Lcom/kubi/flutter/proto/kline/AlertClickType;", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotFlutterKlineFragment.kt\ncom/kubi/spot/kline/flutter/SpotFlutterKlineFragment\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,167:1\n35#2,4:168\n39#2:174\n35#2,4:175\n39#2:181\n44#3,2:172\n44#3,2:179\n*S KotlinDebug\n*F\n+ 1 SpotFlutterKlineFragment.kt\ncom/kubi/spot/kline/flutter/SpotFlutterKlineFragment\n*L\n74#1:168,4\n74#1:174\n75#1:175,4\n75#1:181\n74#1:172,2\n75#1:179,2\n*E\n"})
public final class SpotFlutterKlineFragment extends KlinePageBaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f50664Y = new Companion(null);

    /* JADX INFO: compiled from: SpotFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/kline/flutter/SpotFlutterKlineFragment;", "symbol", "", "mainType", "", "precision", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ SpotFlutterKlineFragment newInstance$default(Companion companion, String str, int i11, int i12, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i11 = C37878b0.f85252a.m85523d();
            }
            return companion.newInstance(str, i11, i12);
        }

        @NotNull
        public final SpotFlutterKlineFragment newInstance(@NotNull String symbol, int mainType, int precision) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            SpotFlutterKlineFragment spotFlutterKlineFragment = new SpotFlutterKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putInt("data_2", mainType);
            bundle.putInt("data_3", precision);
            spotFlutterKlineFragment.setArguments(bundle);
            return spotFlutterKlineFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineFragment$b */
    /* JADX INFO: compiled from: SpotFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/kline/flutter/SpotFlutterKlineFragment$onViewCreated$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "onJumpOrder", "", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25376b implements IKLineContainer.a {
        public C25376b() {
        }

        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        /* JADX INFO: renamed from: a */
        public void mo24268a(OrderItem orderItem) {
            Intrinsics.checkNotNullParameter(orderItem, "orderItem");
            SpotFlutterKlineFragment.this.m62022A3(orderItem);
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineFragment$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C25377c extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineFragment$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C25378d extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.flutter.SpotFlutterKlineFragment$a */
    /* JADX INFO: compiled from: SpotFlutterKlineFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25375a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderItem.OrderSide.values().length];
            try {
                iArr[OrderItem.OrderSide.BUY_LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderItem.OrderSide.SELL_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m62021z3(SpotFlutterKlineFragment spotFlutterKlineFragment, PaintFromType paintFromType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paintFromType = PaintFromType.NoPaint;
        }
        spotFlutterKlineFragment.m62031y3(paintFromType);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public IKLineDataInteractor mo24400l3() {
        return new KLineMarketDataInteractor();
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    /* JADX INFO: renamed from: m3 */
    public void mo24401m3() {
        TracePageHelper.m42467b("load_k_spot");
        C43841b.m96557d("spot_k_line_page_load", "page_load_end", null, 4, null);
        C43841b.m96557d("B5markets_spot", "data_load_finish", null, 4, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        KLineContainer kLineContainer = (KLineContainer) findViewById(R$id.klineChart);
        if (kLineContainer == null) {
            return;
        }
        kLineContainer.mo24148e(new C25376b());
    }

    /* JADX INFO: renamed from: r3 */
    public final void m62024r3(@NotNull ToolBarClick.ToolBarItemType toolBarType) {
        Intrinsics.checkNotNullParameter(toolBarType, "toolBarType");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24234z(toolBarType);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m62028v3(int i11) {
        KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(i11);
        boolean z11 = i11 == 0;
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24211A(kLineTypeM24353a, z11);
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final void m62029w3(@NotNull AlertClickType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24213C(type);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m62030x3(boolean z11) {
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
            f22497u2.m24232w(CollectionsKt.listOf(SubIndexType.VOL));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m62031y3(@NotNull PaintFromType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24215E(type);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m62022A3(OrderItem orderItem) {
        int i11;
        String str;
        OrderItem.OrderSide side = orderItem.getSide();
        if (side == null) {
            i11 = -1;
        } else {
            i11 = C25375a.$EnumSwitchMapping$0[side.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                str = "";
            } else {
                str = "sell";
            }
        } else {
            str = "buy";
        }
        Bundle bundleM66717a = new C27051h().m66724h("symbol", orderItem.getSymbol()).m66720d("index", 2).m66724h("side", str).m66724h("fromSymbol", orderItem.getSymbol()).m66717a();
        Context context = getContext();
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, DelegationBothFragment.class, bundleM66717a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: k3 */
    public KLineViewController.InitParam mo24399k3() {
        Integer numValueOf;
        String string;
        Integer numValueOf2;
        boolean z11;
        boolean z12;
        Object objM20457a;
        Object objM20457a2;
        Boolean boolIsSpotEnable;
        Bundle arguments = getArguments();
        Boolean boolIsSpotEnable2 = null;
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data_2"));
        } else {
            numValueOf = null;
        }
        C37878b0 c37878b0 = C37878b0.f85252a;
        int iM66651k = C27039d.m66651k(numValueOf, c37878b0.m85523d());
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            string = arguments2.getString("symbol");
        } else {
            string = null;
        }
        String strM66668h = C27041f.m66668h(string);
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            numValueOf2 = Integer.valueOf(arguments3.getInt("data_3"));
        } else {
            numValueOf2 = null;
        }
        int iM66651k2 = C27039d.m66651k(numValueOf2, 2);
        KLineConverter kLineConverter = KLineConverter.f22477a;
        KLineType kLineTypeM24353a = kLineConverter.m24353a(iM66651k);
        List<MainIndexType> listM24354b = kLineConverter.m24354b(c37878b0.m85525f());
        List<SubIndexType> listM24356d = kLineConverter.m24356d(c37878b0.m85526g());
        if (iM66651k == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (IUserService.a.get().c()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C25377c().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a2 = RemoteConfig.m20457a("kline_b_s_active", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a2 = null;
            }
            KlineBSConfig klineBSConfig = (KlineBSConfig) objM20457a2;
            if (klineBSConfig != null) {
                boolIsSpotEnable = klineBSConfig.isSpotEnable();
            } else {
                boolIsSpotEnable = null;
            }
            if (C27025c.m66567e(boolIsSpotEnable, true)) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        try {
            RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
            Type type2 = new C25378d().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kline_b_s", type2);
        } catch (Throwable th3) {
            C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KlineBSConfig klineBSConfig2 = (KlineBSConfig) objM20457a;
        if (klineBSConfig2 != null) {
            boolIsSpotEnable2 = klineBSConfig2.isSpotEnable();
        }
        return new KLineViewController.InitParam(strM66668h, iM66651k2, kLineTypeM24353a, "market", listM24354b, listM24356d, z11, null, null, "TRADE", false, false, C27025c.m66567e(boolIsSpotEnable2, true), z12, 3456, null);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m62023q3(boolean z11) {
        m24402n3(z11);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m62025s3(boolean z11) {
        m24403o3(z11);
    }

    /* JADX INFO: renamed from: t3 */
    public final void m62026t3(int i11) {
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24230u(KLineConverter.f22477a.m24354b(i11));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m62027u3(int i11) {
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24232w(KLineConverter.f22477a.m24356d(i11));
        }
    }
}
