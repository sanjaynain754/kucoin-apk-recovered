package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiMarketVisitorFavoriteEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.m */
/* JADX INFO: compiled from: KCJSApiMarketModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JM\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u000e\u0010\u000fJO\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0012\u0010\u0013JO\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0014\u0010\u0013JM\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0015\u0010\u000fJO\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0017\u0010\u0013JO\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0018\u0010\u0013JM\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u0019\u0010\u000fJO\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u001a\u0010\u0013JO\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH&¢\u0006\u0004\b\u001b\u0010\u0013Ja\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\t2(\u0010\r\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\u001f\u0010\u000f¨\u0006 "}, m90084d2 = {"Ld00/m;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiMarketVisitorFavoriteEntity;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "i", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "tokenChain", "", "f", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "j", CmcdData.Factory.STREAMING_FORMAT_HLS, "symbol", "e", "b", "c", "g", "k", "", "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36578m {
    /* JADX INFO: renamed from: a */
    void mo52135a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo52136b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo52137c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo52138d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull List<String> symbol, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo52139e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo52140f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo52141g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo52142h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo52143i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super List<KCJSApiMarketVisitorFavoriteEntity>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo52144j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String tokenChain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo52145k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
