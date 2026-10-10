package com.kubi.spot.kline.lite;

import android.os.Bundle;
import android.view.View;
import com.kubi.flutter.proto.kline.CandleItem;
import com.kubi.flutter.proto.kline.CandleList;
import com.kubi.flutter.proto.kline.SelectPadConfig;
import com.kubi.flutter.proto.kline.SelectPadConfigKt$Dsl;
import com.kubi.flutter.proto.kline.SelectPadItemType;
import com.kubi.flutter.proto.kline.SelectPadViewMode;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KLineViewController;
import com.kubi.flutter.widget.kline.view.KlinePageBaseFragment;
import com.kubi.sdk.IKlineFragment;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import java.math.BigDecimal;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiteFlutterKlineFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u000212B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020'H\u0002J\u0015\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0.H\u0000¢\u0006\u0002\b0R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0004\n\u0002\u0010,¨\u00063"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;", "Lcom/kubi/flutter/widget/kline/view/KlinePageBaseFragment;", "Lcom/kubi/sdk/IKlineFragment;", "<init>", "()V", "isKuCoinSource", "", "()Z", "isKuCoinSource$delegate", "Lkotlin/Lazy;", "precision", "", "getPrecision", "()I", "precision$delegate", "isLine", "kLineInteractor", "Lcom/kubi/spot/kline/lite/LiteKLineInteractor;", "getKLineInteractor", "()Lcom/kubi/spot/kline/lite/LiteKLineInteractor;", "kLineInteractor$delegate", "initParam", "Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "getInitParam", "()Lcom/kubi/flutter/widget/kline/KLineViewController$InitParam;", "interactor", "Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "getInteractor", "()Lcom/kubi/flutter/widget/kline/IKLineDataInteractor;", "onDataFirstLoaded", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "checkType", "type", "buildSelectPadConfig", "Lcom/kubi/flutter/proto/kline/SelectPadConfig;", "previous", "Lcom/kubi/flutter/proto/kline/CandleItem;", "firstClose", "", "Ljava/lang/Double;", "priceFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;", "priceFlow$SpotLib_googleRelease", "Companion", "PriceItem", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiteFlutterKlineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n+ 2 SelectPadConfigKt.kt\ncom/kubi/flutter/proto/kline/SelectPadConfigKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,216:1\n8#2:217\n1#3:218\n49#4:219\n51#4:223\n46#5:220\n51#5:222\n105#6:221\n*S KotlinDebug\n*F\n+ 1 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n*L\n145#1:217\n145#1:218\n167#1:219\n167#1:223\n167#1:220\n167#1:222\n167#1:221\n*E\n"})
public final class LiteFlutterKlineFragment extends KlinePageBaseFragment implements IKlineFragment {

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public static final Companion f50710e0 = new Companion(null);

    /* JADX INFO: renamed from: a0 */
    public boolean f50713a0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public CandleItem f50715c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public Double f50716d0;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50711Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.lite.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LiteFlutterKlineFragment.m62108A3(this.f50730b));
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50712Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.lite.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(LiteFlutterKlineFragment.m62110C3(this.f50731b));
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f50714b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.kline.lite.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiteFlutterKlineFragment.m62109B3(this.f50732b);
        }
    });

    /* JADX INFO: compiled from: LiteFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fJ\n\u0010\u000f\u001a\u00020\u0010*\u00020\fJ\n\u0010\u0011\u001a\u00020\u0010*\u00020\fJ\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment;", "symbol", "", "isKuCoin", "", "isLine", "lineType", "", "candleType", "precision", "toLiteLineType", "Lcom/kubi/flutter/widget/kline/KLineType;", "toLiteCandleType", "getTrackParam", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ LiteFlutterKlineFragment newInstance$default(Companion companion, String str, boolean z11, boolean z12, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                z12 = C37878b0.f85252a.m85528i();
            }
            boolean z13 = z12;
            if ((i14 & 8) != 0) {
                i11 = C37878b0.f85252a.m85524e();
            }
            int i15 = i11;
            if ((i14 & 16) != 0) {
                i12 = C37878b0.f85252a.m85522c();
            }
            int i16 = i12;
            if ((i14 & 32) != 0) {
                i13 = 2;
            }
            return companion.newInstance(str, z11, z13, i15, i16, i13);
        }

        /* JADX INFO: renamed from: a */
        public final String m62123a(boolean z11) {
            if (z11) {
                int iM85524e = C37878b0.f85252a.m85524e();
                if (iM85524e == 0) {
                    return "1H";
                }
                if (iM85524e == 1) {
                    return "24H";
                }
                if (iM85524e == 2) {
                    return "1W";
                }
                if (iM85524e != 3) {
                    return iM85524e != 4 ? "3Y" : "1Y";
                }
                return "1M";
            }
            int iM85522c = C37878b0.f85252a.m85522c();
            if (iM85522c == 0) {
                return "1m";
            }
            if (iM85522c == 1) {
                return "5m";
            }
            if (iM85522c == 2) {
                return "15m";
            }
            if (iM85522c == 3) {
                return "1H";
            }
            if (iM85522c != 4) {
                return iM85522c != 5 ? "1W" : "1D";
            }
            return "8H";
        }

        @NotNull
        public final LiteFlutterKlineFragment newInstance(@NotNull String symbol, boolean isKuCoin, boolean isLine, int lineType, int candleType, int precision) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            LiteFlutterKlineFragment liteFlutterKlineFragment = new LiteFlutterKlineFragment();
            Bundle bundle = new Bundle();
            bundle.putString("symbol", symbol);
            bundle.putBoolean("data", isKuCoin);
            bundle.putBoolean("data_1", isLine);
            bundle.putInt("data_2", lineType);
            bundle.putInt("data_3", candleType);
            bundle.putInt("data_4", precision);
            liteFlutterKlineFragment.setArguments(bundle);
            return liteFlutterKlineFragment;
        }

        @NotNull
        public final KLineType toLiteCandleType(int i11) {
            if (i11 == 0) {
                return LiteKLineType.f50733a.m62139f();
            }
            if (i11 == 1) {
                return LiteKLineType.f50733a.m62136c();
            }
            if (i11 == 2) {
                return LiteKLineType.f50733a.m62135b();
            }
            if (i11 == 3) {
                return LiteKLineType.f50733a.m62138e();
            }
            if (i11 != 4) {
                return i11 != 5 ? LiteKLineType.f50733a.m62140g() : LiteKLineType.f50733a.m62137d();
            }
            return LiteKLineType.f50733a.m62134a();
        }

        @NotNull
        public final KLineType toLiteLineType(int i11) {
            if (i11 == 0) {
                return LiteKLineType.f50733a.m62142i();
            }
            if (i11 == 1) {
                return LiteKLineType.f50733a.m62141h();
            }
            if (i11 == 2) {
                return LiteKLineType.f50733a.m62144k();
            }
            if (i11 != 3) {
                return i11 != 4 ? LiteKLineType.f50733a.m62146m() : LiteKLineType.f50733a.m62145l();
            }
            return LiteKLineType.f50733a.m62143j();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteFlutterKlineFragment$a */
    /* JADX INFO: compiled from: LiteFlutterKlineFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/spot/kline/lite/LiteFlutterKlineFragment$PriceItem;", "", "close", "", "changeRate", "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "getClose", "()Ljava/lang/String;", "getChangeRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25427a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f50717a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Double f50718b;

        public C25427a(@NotNull String close, @Nullable Double d11) {
            Intrinsics.checkNotNullParameter(close, "close");
            this.f50717a = close;
            this.f50718b = d11;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Double getF50718b() {
            return this.f50718b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF50717a() {
            return this.f50717a;
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final LiteKLineInteractor m62109B3(LiteFlutterKlineFragment liteFlutterKlineFragment) {
        return new LiteKLineInteractor(liteFlutterKlineFragment.m62122z3());
    }

    private final int getPrecision() {
        return ((Number) this.f50712Z.getValue()).intValue();
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: k3 */
    public KLineViewController.InitParam mo24399k3() {
        Bundle arguments = getArguments();
        Boolean boolValueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("data_1")) : null;
        C37878b0 c37878b0 = C37878b0.f85252a;
        this.f50713a0 = C27025c.m66567e(boolValueOf, c37878b0.m85528i());
        Bundle arguments2 = getArguments();
        int iM66651k = C27039d.m66651k(arguments2 != null ? Integer.valueOf(arguments2.getInt("data_2")) : null, c37878b0.m85524e());
        Bundle arguments3 = getArguments();
        KLineType liteLineType = this.f50713a0 ? f50710e0.toLiteLineType(iM66651k) : f50710e0.toLiteCandleType(C27039d.m66651k(arguments3 != null ? Integer.valueOf(arguments3.getInt("data_3")) : null, c37878b0.m85522c()));
        Bundle arguments4 = getArguments();
        return new KLineViewController.InitParam(C27041f.m66668h(arguments4 != null ? arguments4.getString("symbol") : null), getPrecision(), liteLineType, "lite", CollectionsKt.emptyList(), CollectionsKt.emptyList(), this.f50713a0, m62119w3(), null, null, false, false, false, false, 16128, null);
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    /* JADX INFO: renamed from: m3 */
    public void mo24401m3() {
        C37878b0 c37878b0 = C37878b0.f85252a;
        C43852m.m96594f("B5CoinPage", c37878b0.m85528i() ? "BrokenLine" : "Candle", "1", TuplesKt.m90091to("data", f50710e0.m62123a(c37878b0.m85528i())));
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    /* JADX INFO: renamed from: w3 */
    public final SelectPadConfig m62119w3() {
        SelectPadConfigKt$Dsl.Companion companion = SelectPadConfigKt$Dsl.f22180b;
        SelectPadConfig.C12708c c12708cNewBuilder = SelectPadConfig.newBuilder();
        Intrinsics.checkNotNullExpressionValue(c12708cNewBuilder, "newBuilder(...)");
        SelectPadConfigKt$Dsl selectPadConfigKt$Dsl_create = companion._create(c12708cNewBuilder);
        selectPadConfigKt$Dsl_create.m24028d(this.f50713a0 ? SelectPadViewMode.NONE_PAD : SelectPadViewMode.TOP_PAD);
        selectPadConfigKt$Dsl_create.m24026b(selectPadConfigKt$Dsl_create.m24027c(), CollectionsKt.listOf((Object[]) new SelectPadItemType[]{SelectPadItemType.OPEN_DATA, SelectPadItemType.HIGH_DATA, SelectPadItemType.LOW_DATA, SelectPadItemType.CLOSE_DATA, SelectPadItemType.CHANGE_RATIO_DATA, SelectPadItemType.AMPLITUDE_DATA}));
        return selectPadConfigKt$Dsl_create.m24025a();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m62120x3(boolean z11, int i11) {
        Companion companion = f50710e0;
        KLineType liteLineType = z11 ? companion.toLiteLineType(i11) : companion.toLiteCandleType(i11);
        KLineViewController f22497u = getF22497U();
        if (f22497u != null) {
            f22497u.m24211A(liteLineType, z11);
        }
        if (this.f50713a0 != z11) {
            this.f50713a0 = z11;
            KLineViewController f22497u2 = getF22497U();
            if (f22497u2 != null) {
                f22497u2.m24231v(m62119w3());
            }
        }
    }

    /* JADX INFO: renamed from: y3 */
    public final LiteKLineInteractor m62121y3() {
        return (LiteKLineInteractor) this.f50714b0.getValue();
    }

    /* JADX INFO: renamed from: z3 */
    public final boolean m62122z3() {
        return ((Boolean) this.f50711Y.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final boolean m62108A3(LiteFlutterKlineFragment liteFlutterKlineFragment) {
        Boolean boolValueOf;
        Bundle arguments = liteFlutterKlineFragment.getArguments();
        if (arguments != null) {
            boolValueOf = Boolean.valueOf(arguments.getBoolean("data"));
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: C3 */
    public static final int m62110C3(LiteFlutterKlineFragment liteFlutterKlineFragment) {
        Integer numValueOf;
        Bundle arguments = liteFlutterKlineFragment.getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data_4"));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, 3);
    }

    @NotNull
    /* JADX INFO: renamed from: D3 */
    public final InterfaceC41634e<C25427a> m62118D3() {
        final InterfaceC41634e interfaceC41634eM90900X = C41636g.m90900X(m62121y3().m62129E());
        return new InterfaceC41634e<C25427a>() { // from class: com.kubi.spot.kline.lite.LiteFlutterKlineFragment$priceFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LiteFlutterKlineFragment.kt\ncom/kubi/spot/kline/lite/LiteFlutterKlineFragment\n*L\n1#1,49:1\n50#2:50\n168#3,41:51\n*E\n"})
            public static final class C254282<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f50721b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ LiteFlutterKlineFragment f50722c;

                /* JADX INFO: renamed from: com.kubi.spot.kline.lite.LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.spot.kline.lite.LiteFlutterKlineFragment$priceFlow$$inlined$map$1$2", m90122f = "LiteFlutterKlineFragment.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C254282.this.emit(null, this);
                    }
                }

                public C254282(InterfaceC41635f interfaceC41635f, LiteFlutterKlineFragment liteFlutterKlineFragment) {
                    this.f50721b = interfaceC41635f;
                    this.f50722c = liteFlutterKlineFragment;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    CandleItem candleItem;
                    Double dBoxDouble;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f50721b;
                        CandleList candleList = (CandleList) obj;
                        LiteFlutterKlineFragment.C25427a c25427a = null;
                        dBoxDouble = null;
                        dBoxDouble = null;
                        dBoxDouble = null;
                        Double dBoxDouble2 = null;
                        if (candleList.getItemsCount() != 0) {
                            List<CandleItem> itemsList = candleList.getItemsList();
                            List<CandleItem> itemsList2 = candleList.getItemsList();
                            Intrinsics.checkNotNullExpressionValue(itemsList2, "getItemsList(...)");
                            CandleItem candleItem2 = (CandleItem) CollectionsKt.last((List) itemsList2);
                            if (C37878b0.f85252a.m85528i()) {
                                if (candleList.getUpdateType() == CandleList.UpdateType.UPDATE_BY_PULL) {
                                    Intrinsics.checkNotNull(itemsList);
                                    double close = ((CandleItem) CollectionsKt.first((List) itemsList)).getClose();
                                    this.f50722c.f50716d0 = Boxing.boxDouble(close);
                                    dBoxDouble = Boxing.boxDouble(close);
                                } else {
                                    dBoxDouble = this.f50722c.f50716d0;
                                }
                                if (dBoxDouble != null && !Intrinsics.areEqual(dBoxDouble, 0.0d)) {
                                    dBoxDouble2 = Boxing.boxDouble((candleItem2.getClose() - dBoxDouble.doubleValue()) / dBoxDouble.doubleValue());
                                }
                            } else {
                                if (candleList.getUpdateType() != CandleList.UpdateType.UPDATE_BY_PULL) {
                                    candleItem = this.f50722c.f50715c0;
                                } else if (itemsList.size() > 1) {
                                    candleItem = itemsList.get(itemsList.size() - 2);
                                    this.f50722c.f50715c0 = candleItem;
                                } else {
                                    candleItem = null;
                                }
                                if (candleItem == null) {
                                    if (candleItem2.getOpen() != 0.0d) {
                                        dBoxDouble2 = Boxing.boxDouble((candleItem2.getClose() - candleItem2.getOpen()) / candleItem2.getOpen());
                                    }
                                } else if (candleItem.getClose() != 0.0d) {
                                    dBoxDouble2 = Boxing.boxDouble((candleItem2.getClose() - candleItem.getClose()) / candleItem.getClose());
                                } else if (candleItem2.getOpen() != 0.0d) {
                                    dBoxDouble2 = Boxing.boxDouble((candleItem2.getClose() - candleItem2.getOpen()) / candleItem2.getOpen());
                                }
                            }
                            c25427a = new LiteFlutterKlineFragment.C25427a(C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(new BigDecimal(String.valueOf(candleItem2.getClose())), "USDT"), null, null, 0, false, false, true, false, 95, null), "--"), dBoxDouble2);
                        }
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(c25427a, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super LiteFlutterKlineFragment.C25427a> interfaceC41635f, Continuation continuation) {
                Object objCollect = interfaceC41634eM90900X.collect(new C254282(interfaceC41635f, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.kubi.flutter.widget.kline.view.KlinePageBaseFragment
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public IKLineDataInteractor mo24400l3() {
        return m62121y3();
    }
}
