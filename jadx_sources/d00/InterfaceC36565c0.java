package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesDisplayInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinFuturesSymbolInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotCoinInfo;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiSymbolsCoinSpotSymbolInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.c0 */
/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JO\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u000e\u0010\u000fJM\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u0014\u0010\u000fJM\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u0015\u0010\u0012JO\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u0017\u0010\u000fJM\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0012JO\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u001a\u0010\u000fJO\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u001d\u0010\u000fJM\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\tH&¢\u0006\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Ld00/c0;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "code", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotCoinInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "g", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotSymbolInfo;", "f", "b", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesCoinInfo;", "c", "i", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesSymbolInfo;", "d", "symbol", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesDisplayInfo;", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36565c0 {
    /* JADX INFO: renamed from: a */
    void mo81838a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinSpotCoinInfo>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo81839b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinSpotSymbolInfo>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo81840c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesCoinInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo81841d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesSymbolInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo81842e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinFuturesSymbolInfo>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo81843f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinSpotSymbolInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo81844g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String code, @NotNull Function2<? super KCJSApiSymbolsCoinSpotCoinInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo81845h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super KCJSApiSymbolsCoinFuturesDisplayInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo81846i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiSymbolsCoinFuturesCoinInfo>, ? super ProtocolException, Unit> callback);
}
