package d00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiShareGalleryDataEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: d00.y */
/* JADX INFO: compiled from: KCJSApiShareModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J«\u0001\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015H&¢\u0006\u0004\b\u0019\u0010\u001aJO\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ[\u0010 \u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u001e2\u001c\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Ld00/y;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "source", "category", "utmSource", "rcode", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;", "data", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiShareGalleryDataEntity;Lkotlin/jvm/functions/Function2;)V", "imgData", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "options", "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC36590y {
    /* JADX INFO: renamed from: a */
    void mo59668a(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String imgData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo59669b(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull Map<String, ? extends Object> options, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo59670c(@NotNull Context ctx, @Nullable Object obj, @NotNull String source, @NotNull String category, @NotNull String utmSource, @NotNull String rcode, boolean needQrCode, boolean onlyDarkMode, @Nullable String pic, @Nullable String qrCodeUrl, @Nullable String title, @Nullable String content, @Nullable String linkUrl, @Nullable KCJSApiShareGalleryDataEntity data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
