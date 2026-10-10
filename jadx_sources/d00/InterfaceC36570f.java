package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFileFileActionResult;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiFilePickFileResult;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.f */
/* JADX INFO: compiled from: KCJSApiFileModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001Je\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0081\u0001\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJy\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"Ld00/f;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "fileTypes", "", BridgeParamKeyKt.MAX_COUNT, "maxSize", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFilePickFileResult;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "", "isRemoteUrl", "fileUrl", "fileName", "", "headers", "allowShare", "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiFileFileActionResult;", "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)V", "url", "target", "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36570f {
    /* JADX INFO: renamed from: a */
    void mo31713a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @Nullable String fileTypes, @Nullable Long maxCount, @Nullable Long maxSize, @NotNull Function2<? super KCJSApiFilePickFileResult, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo31714b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, boolean isRemoteUrl, @NotNull String fileUrl, @Nullable String fileName, @Nullable Map<String, ? extends Object> headers, @Nullable Boolean allowShare, @NotNull Function2<? super KCJSApiFileFileActionResult, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo31715c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String url, @Nullable String fileName, @Nullable Map<String, ? extends Object> headers, @Nullable String target, @NotNull Function2<? super KCJSApiFileFileActionResult, ? super ProtocolException, Unit> callback);
}
