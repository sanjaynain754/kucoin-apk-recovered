package b00;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKLineConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineContractConfig;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKLineKlineThemeConfig;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.k */
/* JADX INFO: compiled from: KCFlutterBridgeKLineCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u001c\bg\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015JM\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00132\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u0018\u0010\u0019J]\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u001d\u0010\u001eJI\u0010\"\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001f2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\"\u0010#J5\u0010%\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b%\u0010&J=\u0010'\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b'\u0010\fJ=\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b(\u0010\fJS\u0010,\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001f2\b\u0010*\u001a\u0004\u0018\u00010\u001f2\b\u0010+\u001a\u0004\u0018\u00010\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b,\u0010-JY\u00100\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010.2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b0\u00101J_\u00106\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u00132\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b6\u00107JM\u00108\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b8\u00109JE\u0010:\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b:\u0010\u0010JE\u0010<\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b<\u0010\u0010JM\u0010?\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b?\u00109JE\u0010@\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b@\u0010\u0010JE\u0010A\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bA\u0010\u0010JM\u0010B\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bB\u00109JE\u0010D\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bD\u0010\u0010JU\u0010E\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bE\u0010FJ5\u0010G\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bG\u0010&J5\u0010H\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bH\u0010&JM\u0010I\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\bI\u00109¨\u0006J"}, m90084d2 = {"Lb00/k;", "", "Landroid/content/Context;", "ctx", "", "symbol", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineContractConfig;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "d", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "klineType", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKLineConfig;", "v", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "g", "(Landroid/content/Context;DLjava/lang/String;Lkotlin/jvm/functions/Function2;)V", FirebaseAnalytics.Param.PRICE, "isUp", "m", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "showHistoryOrder", "showActivityOrder", "isFrom", "t", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function2;)V", "", BaseActivity.THEME, "klineColorType", "r", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineThemeConfig;", "k", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "u", "p", "mainMetrics", "subMetrics", "selectTime", "c", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "parameters", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "bizType", "side", "quickOrderPrice", "showPriceLine", "j", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "i", "accountQuery", "q", "targetPrice", "positionInfo", "b", "o", "n", "e", "modifyTpSlOrderInfo", "x", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_SS, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "w", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4428k {
    /* JADX INFO: renamed from: a */
    void mo4146a(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4147b(@NotNull Context ctx, @NotNull String targetPrice, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4148c(@NotNull Context ctx, @Nullable Long mainMetrics, @Nullable Long subMetrics, @Nullable String selectTime, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4149d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super KCFlutterBridgeKLineKlineContractConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4150e(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4151f(@NotNull Context ctx, @NotNull String bizType, @NotNull String modifyTpSlOrderInfo, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo4152g(@NotNull Context ctx, double offset, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo4153h(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Map<String, ? extends Object> parameters, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo4154i(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo4155j(@NotNull Context ctx, @NotNull String bizType, @NotNull String symbol, @NotNull String side, @NotNull String quickOrderPrice, @Nullable Boolean showPriceLine, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo4156k(@NotNull Context ctx, @NotNull Function2<? super KCFlutterBridgeKLineKlineThemeConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo4157l(@NotNull Context ctx, @NotNull String bizType, @NotNull String symbol, @NotNull String price, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: m */
    void mo4158m(@NotNull Context ctx, @NotNull String price, @NotNull String symbol, boolean isUp, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: n */
    void mo4159n(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: o */
    void mo4160o(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: p */
    void mo4161p(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: q */
    void mo4162q(@NotNull Context ctx, @NotNull String bizType, @NotNull String accountQuery, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: r */
    void mo4163r(@NotNull Context ctx, @Nullable Long theme, @Nullable Long klineColorType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: s */
    void mo4164s(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: t */
    void mo4165t(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, boolean showHistoryOrder, boolean showActivityOrder, boolean isFrom, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: u */
    void mo4166u(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: v */
    void mo4167v(@NotNull Context ctx, @NotNull String symbol, @NotNull String klineType, @NotNull Function2<? super KCFlutterBridgeKLineKLineConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: w */
    void mo4168w(@NotNull Context ctx, @NotNull String bizType, @NotNull String positionInfo, @NotNull String targetPrice, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: x */
    void mo4169x(@NotNull Context ctx, @NotNull String modifyTpSlOrderInfo, @NotNull String positionInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
