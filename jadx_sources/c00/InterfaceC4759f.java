package c00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeOperationLocationInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c00.f */
/* JADX INFO: compiled from: KCHybridBridgeOperationCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lc00/f;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeOperationLocationInfo;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4759f {
    /* JADX INFO: renamed from: a */
    void mo4805a(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4806b(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super KCHybridBridgeOperationLocationInfo, ? super ProtocolException, Unit> callback);
}
