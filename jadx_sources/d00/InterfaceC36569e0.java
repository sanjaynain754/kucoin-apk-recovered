package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeAlphaCurrencyInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeIsolatedMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginConfig;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeMarginCurrency;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiTradeSymbolOfflineInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d00.e0 */
/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJg\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u0014\u0010\u0015J{\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00192\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u001d\u0010\u000eJW\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\"\u0010#JM\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b%\u0010\u000eJO\u0010'\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b'\u0010(JM\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b)\u0010\u000eJM\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b+\u0010\u000eJG\u0010-\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b-\u0010\u000eJO\u0010/\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b/\u0010(JO\u00100\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b0\u0010(JM\u00102\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\f\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u00010$\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b2\u0010\u000eJO\u00103\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u000101\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b3\u0010(¨\u00064"}, m90084d2 = {"Ld00/e0;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "e", "orderId", "symbol", "bussinesType", "content", "g", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "level1", "level2", "level3", "", "data", "j", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "k", "", "currencySeq", "quoteCurrency", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeAlphaCurrencyInfo;", "n", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;JZLkotlin/jvm/functions/Function2;)V", "", "b", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeIsolatedMarginConfig;", "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginCurrency;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeMarginConfig;", "m", FirebaseAnalytics.Param.CURRENCY, "o", "f", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeSymbolOfflineInfo;", "i", "d", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36569e0 {

    /* JADX INFO: renamed from: d00.e0$a */
    /* JADX INFO: compiled from: KCJSApiTradeModule.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m81859a(@NotNull InterfaceC36569e0 interfaceC36569e0, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeSymbolOfflineInfo>, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiTradeModule.fetchSymbolOfflineInfoList"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: b */
        public static void m81860b(@NotNull InterfaceC36569e0 interfaceC36569e0, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiTradeSymbolOfflineInfo, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiTradeModule.getSymbolOfflineInfo"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: c */
        public static void m81861c(@NotNull InterfaceC36569e0 interfaceC36569e0, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiTradeModule.isUtaGray"), null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: a */
    void mo31581a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeIsolatedMarginConfig>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo31582b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeAlphaCurrencyInfo>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo31583c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiTradeIsolatedMarginConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo31584d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiTradeSymbolOfflineInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo31585e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo31586f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String currency, @NotNull Function2<? super KCJSApiTradeMarginCurrency, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo31587g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String orderId, @NotNull String symbol, @NotNull String bussinesType, @NotNull String content, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo31588h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo31589i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeSymbolOfflineInfo>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo31590j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String level1, @Nullable String level2, @Nullable String level3, @Nullable Map<String, ? extends Object> data, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo31591k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo31592l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiTradeMarginCurrency>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: m */
    void mo31593m(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super KCJSApiTradeMarginConfig, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: n */
    void mo31594n(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, long currencySeq, boolean quoteCurrency, @NotNull Function2<? super KCJSApiTradeAlphaCurrencyInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: o */
    void mo31595o(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String currency, @NotNull Function2<? super KCJSApiTradeMarginCurrency, ? super ProtocolException, Unit> callback);
}
