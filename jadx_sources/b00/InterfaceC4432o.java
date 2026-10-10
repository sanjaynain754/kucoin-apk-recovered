package b00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.command.impl.CheckIsFavorCommand;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.o */
/* JADX INFO: compiled from: KCFlutterBridgeMarketCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\n\u0010\u000bJM\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0012\u0010\u000bJE\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u001b\u0010\u001aJ=\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u001c\u0010\u001aJ=\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u001d\u0010\u001aJQ\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052(\u0010\t\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b\u001f\u0010 JI\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00062\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b#\u0010\u0014J5\u0010$\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0004H&¢\u0006\u0004\b$\u0010\u000b¨\u0006%"}, m90084d2 = {"Lb00/o;", "", "Landroid/content/Context;", "ctx", "Lkotlin/Function2;", "", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "j", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", InterfaceC33826o0.f71244p, "chain", "redirectType", "", "i", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CheckIsFavorCommand.KEY_IS_FAV, "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "symbol", "d", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "b", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "e", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "coin", "klineType", "k", "f", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4432o {
    /* JADX INFO: renamed from: a */
    void mo4180a(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4181b(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4182c(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4183d(@NotNull Context ctx, @NotNull String symbol, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4184e(@NotNull Context ctx, @Nullable List<String> symbol, @NotNull Function2<? super Map<String, ? extends Object>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4185f(@NotNull Context ctx, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo4186g(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @Nullable Boolean isFav, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo4187h(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo4188i(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @NotNull String redirectType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo4189j(@NotNull Context ctx, @NotNull Function2<? super List<String>, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo4190k(@NotNull Context ctx, @Nullable String coin, @Nullable String klineType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo4191l(@NotNull Context ctx, @NotNull String token, @NotNull String chain, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
