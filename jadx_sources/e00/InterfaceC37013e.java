package e00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeMarketVisitorFavoriteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: e00.e */
/* JADX INFO: compiled from: KCBridgeMarketCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0011\u0010\u0010J;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0012\u0010\u000bJ=\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0014\u0010\u0010J=\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0015\u0010\u0010J;\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0016\u0010\u000bJ=\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0017\u0010\u0010J=\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m90084d2 = {"Le00/e;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeMarketVisitorFavoriteEntity;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "f", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "", "tokenChain", "", "i", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "e", "symbol", "d", "b", "g", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37013e {
    /* JADX INFO: renamed from: a */
    void mo52221a(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo52222b(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo52223c(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo52224d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo52225e(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo52226f(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo52227g(@NotNull Context ctx, @NotNull Function2<? super List<KCBridgeMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo52228h(@NotNull Context ctx, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo52229i(@NotNull Context ctx, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
