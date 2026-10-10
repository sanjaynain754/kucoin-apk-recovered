package c00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: c00.r */
/* JADX INFO: compiled from: KCHybridBridgeWebviewCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JÃ\u0001\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u00062\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010 \u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u00062\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b \u0010\u001eJg\u0010&\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010!\u001a\u0004\u0018\u00010\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u00180\u0016H&¢\u0006\u0004\b&\u0010'¨\u0006("}, m90084d2 = {"Lc00/r;", "", "Landroid/content/Context;", "ctx", "Ljava/lang/Object;", "obj", "", ViewProps.VISIBLE, "statusBarTransparent", "leftVisible", "rightVisible", "", "title", "titleColor", "background", "statusBarIsLightMode", "leftIcon", "leftTint", "leadIcon", "trailIcon", "rightIcon", "rightTint", "Lkotlin/Function2;", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Ljava/lang/Object;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "appPopAnimated", "exit", "(Landroid/content/Context;Ljava/lang/Object;ZLkotlin/jvm/functions/Function2;)V", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "b", "pageType", "", "dclTime", "currentProjectName", "currentProjectVersion", "c", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC4771r {
    /* JADX INFO: renamed from: a */
    void mo4835a(@NotNull Context ctx, @Nullable Object obj, boolean visible, boolean statusBarTransparent, boolean leftVisible, boolean rightVisible, @Nullable String title, @Nullable String titleColor, @Nullable String background, @Nullable Boolean statusBarIsLightMode, @Nullable String leftIcon, @Nullable String leftTint, @Nullable String leadIcon, @Nullable String trailIcon, @Nullable String rightIcon, @Nullable String rightTint, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo4836b(@NotNull Context ctx, @Nullable Object obj, boolean enable, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo4837c(@NotNull Context ctx, @Nullable Object obj, @Nullable String pageType, @Nullable Double dclTime, @Nullable String currentProjectName, @Nullable String currentProjectVersion, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    void exit(@NotNull Context ctx, @Nullable Object obj, boolean appPopAnimated, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
