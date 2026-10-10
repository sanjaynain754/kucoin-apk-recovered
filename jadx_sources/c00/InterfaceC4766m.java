package c00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.hybrid.protocol.KCHybridBridgeShareGalleryDataEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c00.m */
/* JADX INFO: compiled from: KCHybridBridgeShareCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J£\u0001\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u001c\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00062\u001c\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lc00/m;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", "category", "utmSource", "rcode", "", BridgeParamKeyKt.SHARE_KEY_NEEDQRCODE, "onlyDarkMode", BridgeParamKeyKt.SHARE_KEY_PIC, "qrCodeUrl", "title", "content", BridgeParamKeyKt.SHARE_KEY_LINKURL, "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;", "data", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "b", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeShareGalleryDataEntity;Lkotlin/jvm/functions/Function2;)V", "imgData", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4766m {
    /* JADX INFO: renamed from: a */
    void mo4818a(@NotNull Context ctx, @Nullable Object obj, @NotNull String imgData, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4819b(@NotNull Context ctx, @Nullable Object obj, @NotNull String category, @NotNull String utmSource, @NotNull String rcode, boolean needQrCode, boolean onlyDarkMode, @Nullable String pic, @Nullable String qrCodeUrl, @Nullable String title, @Nullable String content, @Nullable String linkUrl, @Nullable KCHybridBridgeShareGalleryDataEntity data, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
