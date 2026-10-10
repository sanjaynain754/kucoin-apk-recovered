package c00;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c00.i */
/* JADX INFO: compiled from: KCHybridBridgePhoneCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001JG\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH'¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH'¢\u0006\u0004\b\u000f\u0010\u000eJ?\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lc00/i;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", NotificationCompat.CATEGORY_SERVICE, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "c", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4762i {
    /* JADX INFO: renamed from: a */
    void mo4810a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    @Deprecated(message = "旧协议废弃")
    /* JADX INFO: renamed from: b */
    void mo4811b(@NotNull Context ctx, @Nullable Object obj, @NotNull String service, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    @Deprecated(message = "旧协议废弃")
    /* JADX INFO: renamed from: c */
    void mo4812c(@NotNull Context ctx, @Nullable Object obj, @NotNull String service, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
