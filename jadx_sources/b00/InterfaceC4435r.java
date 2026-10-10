package b00;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePaymentRecurringFrequencyInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: b00.r */
/* JADX INFO: compiled from: KCFlutterBridgePaymentCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b \bg\u0018\u00002\u00020\u0001J]\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u0018\u0010\u0014JG\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u001b\u0010\u001cJE\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b\u001f\u0010\u001cJ=\u0010 \u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b \u0010\u0014JE\u0010#\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b#\u0010$JO\u0010&\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b&\u0010'J5\u0010(\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b(\u0010\u0016J]\u0010-\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00122\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b-\u0010.Je\u00105\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00122\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b5\u00106J5\u00107\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b7\u0010\u0016J5\u00108\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b8\u0010\u0016J5\u00109\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b9\u0010\u0016J5\u0010:\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b:\u0010\u0016JE\u0010=\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b=\u0010\u001cJ5\u0010>\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b>\u0010\u0016J5\u0010?\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b?\u0010\u0016J5\u0010@\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH&¢\u0006\u0004\b@\u0010\u0016¨\u0006A"}, m90084d2 = {"Lb00/r;", "", "Landroid/content/Context;", "ctx", "", "frequency", "dayOfMonth", "dayOfWeek", "timeOfDay", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePaymentRecurringFrequencyInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "bizType", "", "o", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", BridgeParamKeyKt.SHARE_KEY_LINKURL, "f", "url", "title", "i", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "fiatAmount", "fiatCurrency", "e", "m", "", "allowedCardNetworks", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "isRecurring", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/util/List;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAMING_FORMAT_SS, "foxKingMerchants", "foxKingMarginAmount", "foxKingMarginCurrency", "goldMerchants", "q", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "orderId", "from", "fromName", TypedValues.TransitionType.S_TO, "toName", "canChat", "r", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "n", "j", "g", "c", "code", "msg", "k", "t", "p", "d", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4435r {
    /* JADX INFO: renamed from: a */
    void mo4194a(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4195b(@NotNull Context ctx, @NotNull String frequency, @NotNull String dayOfMonth, @NotNull String dayOfWeek, @NotNull String timeOfDay, @NotNull String timeZone, @NotNull Function2<? super KCFlutterBridgePaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4196c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4197d(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4198e(@NotNull Context ctx, @NotNull String fiatAmount, @NotNull String fiatCurrency, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4199f(@NotNull Context ctx, @NotNull String linkUrl, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo4200g(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo4201h(@NotNull Context ctx, @Nullable List<String> allowedCardNetworks, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo4202i(@NotNull Context ctx, @NotNull String url, @Nullable String title, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo4203j(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo4204k(@NotNull Context ctx, @NotNull String code, @NotNull String msg, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo4205l(@NotNull Context ctx, @Nullable List<String> allowedCardNetworks, @Nullable Boolean isRecurring, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: m */
    void mo4206m(@NotNull Context ctx, @NotNull String fiatCurrency, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: n */
    void mo4207n(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: o */
    void mo4208o(@NotNull Context ctx, @NotNull String bizType, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: p */
    void mo4209p(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: q */
    void mo4210q(@NotNull Context ctx, @Nullable Boolean foxKingMerchants, @Nullable String foxKingMarginAmount, @Nullable String foxKingMarginCurrency, @Nullable Boolean goldMerchants, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: r */
    void mo4211r(@NotNull Context ctx, @NotNull String orderId, @NotNull String from, @NotNull String fromName, @NotNull String to2, @NotNull String toName, boolean canChat, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: s */
    void mo4212s(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: t */
    void mo4213t(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
