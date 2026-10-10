package com.kubi.kumex.flutter;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import b00.InterfaceC4428k;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.event.api.C12572a;
import com.kubi.flutter.widget.kline.C12803q;
import com.kubi.flutter.widget.kline.KLineSetting;
import com.kubi.futures.trade.position.KlinePositionPushManager;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.constant.KlineQuickOrder;
import com.kubi.kumex.constant.KlineQuickOrderPrice;
import com.kubi.kumex.constant.KlineScrollOffset;
import com.kubi.kumex.constant.KlineUpdatePrice;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.kline.KuMexKlineLandscapeActivity;
import com.kubi.margin.api.IMarginService;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKLineConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineContractConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineThemeConfig;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradebase.business.klineSettings.KLineSettingConfig;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import fm.C37567b;
import fm.C37569d;
import g00.InterfaceC37754f;
import gf.C37902z;
import java.math.BigDecimal;
import java.util.Map;
import ki.C41050b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36976p;
import p402kf.C41014a;
import p429lf.C42180b;
import p481ny.C42899b;
import p599rk.C44110b;
import p599rk.C44111c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import th.InterfaceC44980d;
import uk.C45259d;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCallImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J6\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010J>\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J>\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JG\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0002\u0010%JV\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JR\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020-0,2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J6\u0010.\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J6\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JQ\u00100\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u00010#2\b\u00102\u001a\u0004\u0018\u00010#2\b\u00103\u001a\u0004\u0018\u00010\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0002\u00104J.\u00105\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JF\u00107\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JF\u0010A\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010C\u001a\u00020 2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J]\u0010D\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\b\u0010G\u001a\u0004\u0018\u00010 2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0002\u0010HJF\u0010I\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J>\u0010J\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JF\u0010K\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u001a\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020QH\u0002J\u000e\u0010R\u001a\u00020\u0005*\u0004\u0018\u00010MH\u0002J>\u0010S\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u0010T\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J>\u0010U\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J>\u0010V\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010W\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J>\u0010X\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JF\u0010Y\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J.\u0010Z\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J.\u0010[\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016JN\u0010\\\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u00108\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u001c\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006^"}, m90084d2 = {"Lcom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineCall;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "limitCloseDialogTag", "reversePositionDialogTag", "getContract", "", "ctx", "Landroid/content/Context;", "symbol", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineContractConfig;", "Lcom/kubi/sdk/protocol/ProtocolException;", "getFuturesTradeUnit", "getKlineConfig", "klineType", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKLineConfig;", "klineScrollOffset", "Lcom/kubi/kumex/constant/KlineScrollOffset;", "getKlineScrollOffset", "()Lcom/kubi/kumex/constant/KlineScrollOffset;", "setKlineScrollOffset", "(Lcom/kubi/kumex/constant/KlineScrollOffset;)V", "updateKlineScrollOffset", TypedValues.CycleType.S_WAVE_OFFSET, "", "", "updateKlineThemeConfig", BaseActivity.THEME, "", "klineColorType", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "jump2HorizontalKlinePage", "showHistoryOrder", "showActivityOrder", "isFrom", "jumpBsOrder", "parameters", "", "", "klineContainsCoinInfoTab", "klineScrollToCoinInfoTab", "klineUpdateMetrics", "mainMetrics", "subMetrics", "selectTime", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "requestKlineThemeConfig", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineThemeConfig;", "showClassicSetTpslPanel", "bizType", "positionInfo", "targetPrice", "klineUpdatePrice", "Lcom/kubi/kumex/constant/KlineUpdatePrice;", "getKlineUpdatePrice", "()Lcom/kubi/kumex/constant/KlineUpdatePrice;", "setKlineUpdatePrice", "(Lcom/kubi/kumex/constant/KlineUpdatePrice;)V", "updateKlinePrice", FirebaseAnalytics.Param.PRICE, "isUp", "showQuickOrderDialog", "side", "quickOrderPrice", "showPriceLine", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "updateQuickOrderPrice", "isQuickOrderEnabled", "calculateDragPnl", "getPositionOpenLeverage", "Ljava/math/BigDecimal;", ViewProps.POSITION, "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "formatForFlutter", "getAccountType", "accountQuery", "showClosePositionPanel", "showModifyTpslPanel", "modifyTpSlOrderInfo", "showReversePositionPanel", "showSetTpslPanel", "startKlinePositionTask", "stopKlinePositionTask", "submitKlineModifyTpSlOrder", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeKLineCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,1058:1\n1#2:1059\n149#3:1060\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeKLineCallImpl.kt\ncom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl\n*L\n560#1:1060\n*E\n"})
public final class KCFlutterBridgeKLineCallImpl implements InterfaceC4428k {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f29025f = new Companion(null);

    /* JADX INFO: renamed from: g */
    @Nullable
    public static Function2<? super Boolean, ? super ProtocolException, Unit> f29026g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f29027a = "KCFlutterBridgeKLineCallImpl";

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f29028b = "LimitCloseDialog";

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f29029c = "ReversePositionDialog";

    /* JADX INFO: renamed from: d */
    @NotNull
    public KlineScrollOffset f29030d = new KlineScrollOffset(0.0d, "");

    /* JADX INFO: renamed from: e */
    @NotNull
    public KlineUpdatePrice f29031e = new KlineUpdatePrice("", "", true);

    /* JADX INFO: compiled from: KCFlutterBridgeKLineCallImpl.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\bR&\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kumex/flutter/KCFlutterBridgeKLineCallImpl$Companion;", "", "<init>", "()V", "quickOrderCallback", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", "notifyQuickOrderDismissed", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void notifyQuickOrderDismissed() {
            Function2 function2 = KCFlutterBridgeKLineCallImpl.f29026g;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, null);
            }
            KCFlutterBridgeKLineCallImpl.f29026g = null;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.flutter.KCFlutterBridgeKLineCallImpl$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C15967a extends TypeToken<PositionEntity> {
    }

    /* JADX INFO: renamed from: G */
    public static final Unit m33712G(final Function2 function2, final Long l11, final Long l12, final FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.runOnUiThread(new Runnable() { // from class: com.kubi.kumex.flutter.d
            @Override // java.lang.Runnable
            public final void run() {
                KCFlutterBridgeKLineCallImpl.m33713H(l11, activity, l12, function2);
            }
        });
        function2.invoke(Boolean.TRUE, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final void m33713H(Long l11, FragmentActivity fragmentActivity, Long l12, Function2 function2) {
        try {
            if (l11 == null) {
                C27063n.m66770h(1 - ((int) (l12 != null ? l12.longValue() : 0L)), KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN);
                InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, Boolean.FALSE, null, null, null, 59, null);
            } else {
                DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
                FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                dayNightThemeManager.m33176a(supportFragmentManager);
            }
        } catch (Exception e11) {
            Boolean bool = Boolean.FALSE;
            String message = e11.getMessage();
            if (message == null) {
                message = "flutter theme change error ";
            }
            function2.invoke(bool, new ProtocolException(message, null, null, false, 14, null));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getF29027a() {
        return this.f29027a;
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: a */
    public void mo4146a(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C44128b.m97266j(this.f29027a, "stopKlinePositionTask");
            KlinePositionPushManager.f24259a.m27774c();
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            C44128b.m97261e(this.f29027a, "stopKlinePositionTask error: " + e11.getMessage());
            Boolean bool = Boolean.FALSE;
            String message = e11.getMessage();
            if (message == null) {
                message = "stopKlinePositionTask error";
            }
            callback.invoke(bool, new ProtocolException(message, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: b */
    public void mo4147b(@NotNull Context ctx, @NotNull String targetPrice, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) throws Throwable {
        Object objM103844constructorimpl;
        BigDecimal decimal;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            if (StringsKt.isBlank(positionInfo)) {
                callback.invoke(null, new ProtocolException("positionInfo is empty", null, null, false, 14, null));
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                C27099x c27099x = C27099x.f54458a;
                objM103844constructorimpl = Result.m103844constructorimpl((PositionEntity) C27099x.m66914d(positionInfo, new C15967a().getType()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            PositionEntity positionEntity = (PositionEntity) objM103844constructorimpl;
            if (positionEntity == null) {
                callback.invoke(null, new ProtocolException("positionInfo parse failed", null, null, false, 14, null));
                return;
            }
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(targetPrice);
            if (bigDecimalOrNull != null && bigDecimalOrNull.compareTo(BigDecimal.ZERO) > 0) {
                ContractEntity contractEntityM84661b = C37569d.m84661b(positionEntity);
                if (contractEntityM84661b == null) {
                    callback.invoke(null, new ProtocolException("contract not found", null, null, false, 14, null));
                    return;
                }
                BigDecimal bigDecimalM33716E = m33716E(positionEntity, contractEntityM84661b);
                C45259d c45259d = C45259d.f101800a;
                boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntityM84661b.isInverse()));
                boolean zM84685z = C37569d.m84685z(positionEntity);
                BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
                C44110b c44110bM100049d = c45259d.m100049d(zM66566d, zM84685z, avgEntryPrice != null ? C44111c.m97192c(avgEntryPrice) : null, bigDecimalM33716E != null ? C44111c.m97192c(bigDecimalM33716E) : null, C44111c.m97192c(bigDecimalOrNull));
                BigDecimal bigDecimalDivide = (c44110bM100049d == null || (decimal = c44110bM100049d.getDecimal()) == null) ? null : decimal.divide(new BigDecimal(C33556b3.f68995S));
                boolean zM66566d2 = C27025c.m66566d(Boolean.valueOf(contractEntityM84661b.isInverse()));
                BigDecimal multiplier = contractEntityM84661b.getMultiplier();
                C44110b c44110bM97191b = C44111c.m97191b(multiplier != null ? C44111c.m97192c(multiplier) : null, null, 1, null);
                BigDecimal avgEntryPrice2 = positionEntity.getAvgEntryPrice();
                C44110b c44110bM97192c = avgEntryPrice2 != null ? C44111c.m97192c(avgEntryPrice2) : null;
                C44110b c44110bM97192c2 = C44111c.m97192c(bigDecimalOrNull);
                BigDecimal currentQty = positionEntity.getCurrentQty();
                C44110b c44110bM100047b = c45259d.m100047b(zM66566d2, c44110bM97191b, c44110bM97192c, c44110bM97192c2, currentQty != null ? C44111c.m97192c(currentQty) : null);
                String strM66919i = C27099x.m66919i(MapsKt.hashMapOf(TuplesKt.m90091to("estimatedPnlRate", C42180b.m92642g(C41014a.m89922G(bigDecimalDivide, null, 1, null), null, null, 0, false, false, false, 63, null)), TuplesKt.m90091to("estimatedPnl", C42180b.m92640e(C41014a.m89922G(c44110bM100047b != null ? c44110bM100047b.getDecimal() : null, null, 1, null), null, C37567b.m84613c(contractEntityM84661b), false, false, false, 0, null, 125, null))), false, 2, null);
                C44128b.m97266j(this.f29027a, "calculateDragPnl result=" + strM66919i);
                callback.invoke(strM66919i, null);
                return;
            }
            callback.invoke(null, new ProtocolException("targetPrice is invalid", null, null, false, 14, null));
        } catch (Exception e11) {
            C44128b.m97261e(this.f29027a, "calculateDragPnl error: " + e11.getMessage());
            String message = e11.getMessage();
            if (message == null) {
                message = "calculateDragPnl error";
            }
            callback.invoke(null, new ProtocolException(message, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: c */
    public void mo4148c(@NotNull Context ctx, @Nullable Long l11, @Nullable Long l12, @Nullable String str, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C44128b.m97266j(this.f29027a, "klineUpdateMetrics mainMetrics: " + l11 + ", subMetrics: " + l12 + ", selectTime: " + str);
            if (l11 != null) {
                int iLongValue = (int) l11.longValue();
                C37902z.f85281a.m85674q(iLongValue);
                C44128b.m97266j(this.f29027a, "klineUpdateMetrics: updated mainMetrics=" + iLongValue);
            }
            if (l12 != null) {
                int iLongValue2 = (int) l12.longValue();
                C37902z.f85281a.m85676s(iLongValue2);
                C44128b.m97266j(this.f29027a, "klineUpdateMetrics: updated subMetrics=" + iLongValue2);
            }
            if (str != null && !StringsKt.isBlank(str)) {
                C37902z.f85281a.m85675r(str);
                C44128b.m97266j(this.f29027a, "klineUpdateMetrics: updated selectTime=" + str);
            }
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            C44128b.m97266j(this.f29027a, "klineUpdateMetrics error: " + e11.getMessage());
            Boolean bool = Boolean.FALSE;
            String message = e11.getMessage();
            if (message == null) {
                message = "klineUpdateMetrics error";
            }
            callback.invoke(bool, new ProtocolException(message, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: d */
    public void mo4149d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super KCFlutterBridgeKLineKlineContractConfig, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ContractEntity contractEntityM99529O = InterfaceC44980d.m99529O(RepositoryServiceLocator.f19236a.m20288g(), symbol, false, 2, null);
        C44128b.m97266j(this.f29027a, "contract=" + contractEntityM99529O);
        KCFlutterBridgeKLineKlineContractConfig kCFlutterBridgeKLineKlineContractConfig = new KCFlutterBridgeKLineKlineContractConfig(C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84618h(contractEntityM99529O)) : null), C27025c.m66566d(contractEntityM99529O != null ? Boolean.valueOf(C37567b.m84626p(contractEntityM99529O)) : null), C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84624n(contractEntityM99529O)) : null), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getMultiplier() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getBaseCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getQuoteCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getTickSize() : null)), IKuMexService.f28731a.get().mo33264M(symbol), "prep", contractEntityM99529O != null ? contractEntityM99529O.getFirstOpenDate() : 0L, C27025c.m66566d(contractEntityM99529O != null ? Boolean.valueOf(contractEntityM99529O.isInverse()) : null), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getDisplayBaseCurrency() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getIndexSymbol() : null)), C27041f.m66668h(String.valueOf(contractEntityM99529O != null ? contractEntityM99529O.getSettleCurrency() : null)), C41050b.f91264a.m90022e(), Long.valueOf(C27039d.m66650j(contractEntityM99529O != null ? Integer.valueOf(C37567b.m84623m(contractEntityM99529O)) : null)));
        C44128b.m97266j(this.f29027a, "result=" + kCFlutterBridgeKLineKlineContractConfig);
        callback.invoke(kCFlutterBridgeKLineKlineContractConfig, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: e */
    public void mo4150e(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$showSetTpslPanel$1(positionInfo, callback, this, targetPrice, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: f */
    public void mo4151f(@NotNull Context ctx, @NotNull String bizType, @NotNull String modifyTpSlOrderInfo, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(modifyTpSlOrderInfo, "modifyTpSlOrderInfo");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$submitKlineModifyTpSlOrder$1(modifyTpSlOrderInfo, callback, positionInfo, this, targetPrice, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: g */
    public void mo4152g(@NotNull Context ctx, double d11, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KlineScrollOffset klineScrollOffset = this.f29030d;
        klineScrollOffset.setSymbol(symbol);
        klineScrollOffset.setOffset(d11);
        C12572a.m23695d("kline_scroll_offset_key", klineScrollOffset, 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: h */
    public void mo4153h(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Map<String, ? extends Object> parameters, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$jumpBsOrder$1(klineType, symbol, callback, parameters, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: i */
    public void mo4154i(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: j */
    public void mo4155j(@NotNull Context ctx, @NotNull String bizType, @NotNull String symbol, @NotNull String side, @NotNull String quickOrderPrice, @Nullable Boolean bool, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(quickOrderPrice, "quickOrderPrice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        f29026g = callback;
        C12572a.m23695d("kline_quick_order_key", new KlineQuickOrder(bizType, symbol, side, quickOrderPrice, bool), 0L, 4, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: k */
    public void mo4156k(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeKLineKlineThemeConfig, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(new KCFlutterBridgeKLineKlineThemeConfig(DayNightThemeManager.f28592a.m33183h(), 1 - C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null)), null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: l */
    public void mo4157l(@NotNull Context ctx, @NotNull String bizType, @NotNull String symbol, @NotNull String price, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C12572a.m23695d("kline_quick_order_price_update_key", new KlineQuickOrderPrice(symbol, price), 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: m */
    public void mo4158m(@NotNull Context ctx, @NotNull String price, @NotNull String symbol, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KlineUpdatePrice klineUpdatePrice = this.f29031e;
        klineUpdatePrice.setSymbol(symbol);
        klineUpdatePrice.setPrice(price);
        klineUpdatePrice.setUp(z11);
        C12572a.m23695d("kline_update_price_key", klineUpdatePrice, 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: n */
    public void mo4159n(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$showReversePositionPanel$1(positionInfo, callback, this, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: o */
    public void mo4160o(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$showClosePositionPanel$1(positionInfo, callback, this, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: p */
    public void mo4161p(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C44128b.m97266j("klineScrollToCoinInfoTab", "symbol = " + symbol);
        C12572a.m23695d("JUMP_COIN_INFO_TAB", symbol, 0L, 4, null);
        callback.invoke(Boolean.TRUE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: q */
    public void mo4162q(@NotNull Context ctx, @NotNull String bizType, @NotNull String accountQuery, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(accountQuery, "accountQuery");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(IUnifyAccountService.f53155a.get().mo64979C() ? "unified" : "classic", null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: r */
    public void mo4163r(@NotNull Context ctx, @Nullable final Long l11, @Nullable final Long l12, @NotNull final Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C42899b.m94073c(new Function1() { // from class: com.kubi.kumex.flutter.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KCFlutterBridgeKLineCallImpl.m33712G(callback, l11, l12, (FragmentActivity) obj);
            }
        });
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: s */
    public void mo4164s(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C44128b.m97266j(this.f29027a, "startKlinePositionTask");
            KlinePositionPushManager.f24259a.m27773b();
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            C44128b.m97261e(this.f29027a, "startKlinePositionTask error: " + e11.getMessage());
            Boolean bool = Boolean.FALSE;
            String message = e11.getMessage();
            if (message == null) {
                message = "startKlinePositionTask error";
            }
            callback.invoke(bool, new ProtocolException(message, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: t */
    public void mo4165t(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, boolean z11, boolean z12, boolean z13, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C37902z.f85281a.m85668k();
        int iHashCode = klineType.hashCode();
        if (iHashCode != -1081309778) {
            if (iHashCode != -503567600) {
                if (iHashCode == 3537154 && klineType.equals(SearchCategory$Companion.SPOT)) {
                    ISpotService.f49646a.get().mo60007t(ctx, symbol, z11, z12, z13, klineType);
                    callback.invoke(Boolean.TRUE, null);
                    return;
                }
            } else if (klineType.equals(SearchCategory$Companion.FUTURES)) {
                Intent intent = new Intent(ctx, (Class<?>) KuMexKlineLandscapeActivity.class);
                intent.putExtra("symbol", symbol);
                intent.putExtra("data", 4);
                C12803q.m24369a(intent, symbol, klineType);
                intent.putExtra("data_4", new KLineSettingConfig(z11, z12));
                intent.setFlags(268435456);
                ctx.startActivity(intent);
                callback.invoke(Boolean.TRUE, null);
                return;
            }
        } else if (klineType.equals(ViewProps.MARGIN)) {
            IMarginService.f32724a.get().mo37967w0(ctx, symbol, z11, z12, z13, klineType);
            callback.invoke(Boolean.TRUE, null);
            return;
        }
        callback.invoke(Boolean.FALSE, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: u */
    public void mo4166u(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            boolean zM82792a = C36976p.f82091a.m82792a();
            C44128b.m97266j(this.f29027a, "klineContainsCoinInfoTab: " + zM82792a);
            callback.invoke(Boolean.valueOf(zM82792a), null);
        } catch (Exception e11) {
            C44128b.m97266j(this.f29027a, "klineContainsCoinInfoTab error: " + e11.getMessage());
            callback.invoke(Boolean.FALSE, new ProtocolException(OtcAd.KYC_NOT_PASS, e11, null, false, 12, null));
        }
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: v */
    public void mo4167v(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Function2<? super KCFlutterBridgeKLineKLineConfig, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(klineType, "klineType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KCFlutterBridgeKLineKLineConfig kCFlutterBridgeKLineKLineConfig = new KCFlutterBridgeKLineKLineConfig(KLineSetting.f22480a.m24362b());
        C44128b.m97266j(this.f29027a, "result=" + kCFlutterBridgeKLineKLineConfig);
        callback.invoke(kCFlutterBridgeKLineKLineConfig, null);
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: w */
    public void mo4168w(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bizType, "bizType");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$showClassicSetTpslPanel$1(positionInfo, callback, this, null));
    }

    @Override // b00.InterfaceC4428k
    /* JADX INFO: renamed from: x */
    public void mo4169x(@NotNull Context ctx, @NotNull String modifyTpSlOrderInfo, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(modifyTpSlOrderInfo, "modifyTpSlOrderInfo");
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MviExKt.m42518n(new KCFlutterBridgeKLineCallImpl$showModifyTpslPanel$1(modifyTpSlOrderInfo, callback, positionInfo, this, null));
    }

    /* JADX INFO: renamed from: E */
    public final BigDecimal m33716E(PositionEntity positionEntity, ContractEntity contractEntity) throws Throwable {
        C44110b c44110bM97192c;
        C44110b c44110bM97192c2;
        C44110b c44110bM97192c3;
        C44110b c44110bM97192c4;
        if (C37569d.m84649A(positionEntity)) {
            return positionEntity.getRealLeverage();
        }
        C45259d c45259d = C45259d.f101800a;
        boolean zM66566d = C27025c.m66566d(Boolean.valueOf(contractEntity.isInverse()));
        BigDecimal multiplier = contractEntity.getMultiplier();
        if (multiplier != null) {
            c44110bM97192c = C44111c.m97192c(multiplier);
        } else {
            c44110bM97192c = null;
        }
        C44110b c44110bM97191b = C44111c.m97191b(c44110bM97192c, null, 1, null);
        BigDecimal avgEntryPrice = positionEntity.getAvgEntryPrice();
        if (avgEntryPrice != null) {
            c44110bM97192c2 = C44111c.m97192c(avgEntryPrice);
        } else {
            c44110bM97192c2 = null;
        }
        BigDecimal currentQty = positionEntity.getCurrentQty();
        if (currentQty != null) {
            c44110bM97192c3 = C44111c.m97192c(currentQty);
        } else {
            c44110bM97192c3 = null;
        }
        BigDecimal posInit = positionEntity.getPosInit();
        if (posInit != null) {
            c44110bM97192c4 = C44111c.m97192c(posInit);
        } else {
            c44110bM97192c4 = null;
        }
        C44110b c44110bM100046a = c45259d.m100046a(zM66566d, c44110bM97191b, c44110bM97192c3, c44110bM97192c2, c44110bM97192c4);
        if (c44110bM100046a == null) {
            return null;
        }
        return c44110bM100046a.getDecimal();
    }
}
