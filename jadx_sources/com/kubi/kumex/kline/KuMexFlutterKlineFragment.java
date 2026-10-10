package com.kubi.kumex.kline;

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
import com.kubi.flutter.widget.kline.interactor.KumexKLineInteractor;
import com.kubi.flutter.widget.kline.view.KlinePageBaseFragment;
import com.kubi.monitor.helper.TracePageHelper;
import com.kubi.sdk.IKlineFragment;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.user.api.IUserService;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27030d;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37752d;
import gf.C37878b0;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43841b;
import p569qq.C43846g;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuMexFlutterKlineFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eJ \u0010\u001f\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0018J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020*J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u00061"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", "priceType", "", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDataFirstLoaded", "checkType", "type", "", "checkMain", "status", "checkNoMain", "hideOrShowChart", "isMain", "", "setPriceType", "symbol", "precision", "getSubIndexTypesByPriceType", "", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "list", "checkDrawTool", "toolBarType", "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;", "initDrawTool", "Lcom/kubi/flutter/proto/kline/PaintFromType;", "deleteAllDraw", "Lcom/kubi/flutter/proto/kline/AlertClickType;", "checkHistory", "isChecked", "checkActive", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuMexFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuMexFlutterKlineFragment.kt\ncom/kubi/kumex/kline/KuMexFlutterKlineFragment\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,214:1\n35#2,4:215\n39#2:221\n35#2,4:222\n39#2:228\n44#3,2:219\n44#3,2:226\n*S KotlinDebug\n*F\n+ 1 KuMexFlutterKlineFragment.kt\ncom/kubi/kumex/kline/KuMexFlutterKlineFragment\n*L\n84#1:215,4\n84#1:221\n85#1:222,4\n85#1:228\n84#1:219,2\n85#1:226,2\n*E\n"})
public final class KuMexFlutterKlineFragment extends KlinePageBaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f29307Z = new Companion(null);

    /* JADX INFO: renamed from: Y */
    @NotNull
    public String f29308Y = "TP";

    /* JADX INFO: compiled from: KuMexFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/kubi/kumex/kline/KuMexFlutterKlineFragment;", "symbol", "precision", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuMexFlutterKlineFragment newInstance(@NotNull String symbol, int precision) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            KuMexFlutterKlineFragment kuMexFlutterKlineFragment = new KuMexFlutterKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putInt("data_3", precision);
            kuMexFlutterKlineFragment.setArguments(bundle);
            return kuMexFlutterKlineFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexFlutterKlineFragment$a */
    /* JADX INFO: compiled from: KuMexFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/kline/KuMexFlutterKlineFragment$onViewCreated$1", "Lcom/kubi/flutter/widget/kline/IKLineContainer$EventListener;", "onJumpOrder", "", "orderItem", "Lcom/kubi/flutter/proto/kline/OrderItem;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16122a implements IKLineContainer.a {
        @Override // com.kubi.flutter.widget.kline.IKLineContainer.a
        /* JADX INFO: renamed from: a */
        public void mo24268a(OrderItem orderItem) {
            long jMin;
            long time;
            Intrinsics.checkNotNullParameter(orderItem, "orderItem");
            KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(C37878b0.f85252a.m85523d());
            int period = kLineTypeM24353a.getPeriod();
            KLineType.Companion companion = KLineType.f22375e;
            if (period >= companion.getONE_DAY().getPeriod()) {
                time = orderItem.getTime() * ((long) 1000);
                jMin = Math.min(System.currentTimeMillis(), (((long) (kLineTypeM24353a.getPeriod() * 1000)) + time) - 1);
            } else {
                long time2 = TimeUtils.m66431r(C27030d.m66607a(orderItem.getTime() * ((long) 1000), "yyyy-MM-dd")).getTime();
                jMin = Math.min(System.currentTimeMillis(), (((long) (companion.getONE_DAY().getPeriod() * 1000)) + time2) - 1);
                time = time2;
            }
            InterfaceC37752d.a.m85125d(C37304a.f82764a, orderItem.getSymbol(), 1L, Long.valueOf(time), Long.valueOf(jMin), null, null, null, 112, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexFlutterKlineFragment$b */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16123b extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: com.kubi.kumex.kline.KuMexFlutterKlineFragment$c */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C16124c extends TypeToken<KlineBSConfig> {
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m34095z3(KuMexFlutterKlineFragment kuMexFlutterKlineFragment, PaintFromType paintFromType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paintFromType = PaintFromType.NoPaint;
        }
        kuMexFlutterKlineFragment.m34106y3(paintFromType);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m34096A3(@NotNull String priceType, @NotNull String symbol, int i11) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f29308Y = priceType;
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            KLineViewController.m24210y(f22497u, symbol, i11, KLineConverter.f22477a.m24353a(C37878b0.f85252a.m85523d()), null, 8, null);
        }
        List<? extends SubIndexType> mutableList = CollectionsKt.toMutableList((Collection) KLineConverter.f22477a.m24356d(C37878b0.f85252a.m85526g()));
        KLineViewController f22497u2 = getF22497U();
        if (f22497u2 != null) {
            f22497u2.m24232w(m34104w3(mutableList));
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: k3 */
    public KLineViewController.InitParam mo24399k3() {
        String strM102677L;
        boolean z11;
        Object objM20457a;
        Object objM20457a2;
        C37878b0 c37878b0 = C37878b0.f85252a;
        int iM85523d = c37878b0.m85523d();
        Bundle arguments = getArguments();
        if (arguments == null || (strM102677L = arguments.getString("symbol")) == null) {
            strM102677L = C46527h0.f104291a.m102677L();
        }
        String str = strM102677L;
        Bundle arguments2 = getArguments();
        int iM66651k = C27039d.m66651k(arguments2 != null ? Integer.valueOf(arguments2.getInt("data_3")) : null, C46527h0.f104291a.m102678N(str));
        KLineConverter kLineConverter = KLineConverter.f22477a;
        KLineType kLineTypeM24353a = kLineConverter.m24353a(iM85523d);
        List<MainIndexType> listM24354b = kLineConverter.m24354b(c37878b0.m85525f());
        List<SubIndexType> listM24356d = kLineConverter.m24356d(c37878b0.m85526g());
        boolean z12 = iM85523d == 0;
        if (IUserService.a.get().c()) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C16123b().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a2 = RemoteConfig.m20457a("kline_b_s_active", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a2 = null;
            }
            KlineBSConfig klineBSConfig = (KlineBSConfig) objM20457a2;
            if (C27025c.m66567e(klineBSConfig != null ? klineBSConfig.isFutureEnable() : null, true)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        try {
            RemoteConfig remoteConfig2 = RemoteConfig.f19636a;
            Type type2 = new C16124c().getType();
            Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("kline_b_s", type2);
        } catch (Throwable th3) {
            C43846g.m96568c(new KCConfigException(th3, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        KlineBSConfig klineBSConfig2 = (KlineBSConfig) objM20457a;
        return new KLineViewController.InitParam(str, iM66651k, kLineTypeM24353a, SearchCategory$Companion.FUTURES, listM24354b, listM24356d, z12, null, null, null, false, false, C27025c.m66567e(klineBSConfig2 != null ? klineBSConfig2.isFutureEnable() : null, true), z11, Utf8.MASK_2BYTES, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public IKLineDataInteractor mo24400l3() {
        return new KumexKLineInteractor();
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    /* JADX INFO: renamed from: m3 */
    public void mo24401m3() {
        TracePageHelper.m42467b("load_k_contract");
        C43841b.m96557d("kumex_k_line_page_load", "page_load_end", null, 4, null);
        C43841b.m96557d("B5markets_futures", "data_load_finish", null, 4, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        KLineContainer kLineContainer = (KLineContainer) findViewById(R$id.klineChart);
        if (kLineContainer == null) {
            return;
        }
        kLineContainer.mo24148e(new C16122a());
    }

    /* JADX INFO: renamed from: q3 */
    public final void m34098q3(@NotNull ToolBarClick.ToolBarItemType toolBarType) {
        Intrinsics.checkNotNullParameter(toolBarType, "toolBarType");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24234z(toolBarType);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m34102u3(int i11) {
        KLineType kLineTypeM24353a = KLineConverter.f22477a.m24353a(i11);
        boolean z11 = i11 == 0;
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24211A(kLineTypeM24353a, z11);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final void m34103v3(@NotNull AlertClickType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24213C(type);
        }
    }

    /* JADX INFO: renamed from: x3 */
    public final void m34105x3(boolean z11) {
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
            f22497u2.m24232w(m34104w3(CollectionsKt.listOf(SubIndexType.VOL)));
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final void m34106y3(@NotNull PaintFromType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24215E(type);
        }
    }

    /* JADX INFO: renamed from: p3 */
    public final void m34097p3(boolean z11) {
        m24402n3(z11);
    }

    /* JADX INFO: renamed from: r3 */
    public final void m34099r3(boolean z11) {
        m24403o3(z11);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m34100s3(int i11) {
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24230u(KLineConverter.f22477a.m24354b(i11));
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final void m34101t3(int i11) {
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24232w(m34104w3(KLineConverter.f22477a.m24356d(i11)));
        }
    }

    /* JADX INFO: renamed from: w3 */
    public final List<SubIndexType> m34104w3(List<? extends SubIndexType> list) {
        List<SubIndexType> mutableList = CollectionsKt.toMutableList((Collection) list);
        if (Intrinsics.areEqual(this.f29308Y, "TP")) {
            return mutableList;
        }
        mutableList.remove(SubIndexType.VOL);
        return mutableList;
    }
}
