package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d00.b */
/* JADX INFO: compiled from: KCJSApiAssetsModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\bg\u0018\u00002\u00020\u0001Jy\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014Jq\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u0015\u0010\u0016JG\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u0017\u0010\u0018Ja\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u001b\u0010\u0018JO\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH&¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0018JO\u0010!\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b!\u0010\"JG\u0010#\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b#\u0010\u0018JO\u0010%\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b%\u0010\"J[\u0010(\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b(\u0010)JG\u0010*\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000eH\u0016¢\u0006\u0004\b*\u0010\u0018¨\u0006+"}, m90084d2 = {"Ld00/b;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "sceneCode", FirebaseAnalytics.Param.CURRENCY, "fiatMoney", "defaultAccount", "defaultAccountAmount", "toAccountTag", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "f", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "e", "isHide", "i", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V", "j", "methodName", "d", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "c", "daysRange", "g", "pricingCrypto", "pricingFiat", "k", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "b", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36562b {

    /* JADX INFO: renamed from: d00.b$a */
    /* JADX INFO: compiled from: KCJSApiAssetsModule.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m81832a(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.getPnlCalcMethod"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: b */
        public static void m81833b(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.getPnlDaysRange"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: c */
        public static void m81834c(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.openPnlDietalDialog"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: d */
        public static void m81835d(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String methodName, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.setPnlCalcMethod"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: e */
        public static void m81836e(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String daysRange, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(daysRange, "daysRange");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.setPnlDaysRange"), null, false, 12, null));
        }

        /* JADX INFO: renamed from: f */
        public static void m81837f(@NotNull InterfaceC36562b interfaceC36562b, @NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String str, @Nullable String str2, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(null, new ProtocolException("-9003", new RuntimeException("协议标准化: Native未实现KCJSApiAssetsModule.setPricingCurrency"), null, false, 12, null));
        }
    }

    /* JADX INFO: renamed from: a */
    void mo4413a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4414b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4415c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super String, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo4416d(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String methodName, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo4417e(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo4418f(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @Nullable String toAccountTag, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo4419g(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String daysRange, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo4420h(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccount, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: i */
    void mo4421i(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean isHide, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo4422j(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: k */
    void mo4423k(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String pricingCrypto, @Nullable String pricingFiat, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: l */
    void mo4424l(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String sceneCode, @NotNull String currency, @NotNull String fiatMoney, @NotNull String defaultAccountAmount, @Nullable String toAccountTag, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
