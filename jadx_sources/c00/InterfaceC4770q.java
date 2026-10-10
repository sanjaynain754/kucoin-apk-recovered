package c00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeUserCenterUserInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c00.q */
/* JADX INFO: compiled from: KCHybridBridgeUserCenterCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J]\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u0013\u0010\u0012JS\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u0019\u0010\u0012JI\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u001b\u0010\u001cJO\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u001e\u0010\u0017J?\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\u001f\u0010\u0012J?\u0010 \u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b \u0010\u0012JI\u0010\"\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00102\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b$\u0010\u0012J?\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\r\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nH&¢\u0006\u0004\b%\u0010\u0012¨\u0006&"}, m90084d2 = {"Lc00/q;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "url", "bizType", "h5Type", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "b", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "k", FirebaseAnalytics.Param.CURRENCY, "language", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeUserCenterUserInfo;", "f", "spmId", "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "businessData", "j", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "jumpToLogin", "i", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "e", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4770q {
    /* JADX INFO: renamed from: a */
    void m4823a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void m4824b(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void m4825c(@NotNull Context ctx, @Nullable Object obj, @Nullable String spmId, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void m4826d(@NotNull Context ctx, @Nullable Object obj, @Nullable String url, @Nullable String bizType, @Nullable String h5Type, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void m4827e(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void m4828f(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super KCHybridBridgeUserCenterUserInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void m4829g(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void m4830h(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void m4831i(@NotNull Context ctx, @Nullable Object obj, @Nullable Boolean jumpToLogin, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void m4832j(@NotNull Context ctx, @Nullable Object obj, @NotNull String bizType, @NotNull String businessData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void m4833k(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void m4834l(@NotNull Context ctx, @Nullable Object obj, @Nullable String currency, @Nullable String language, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
