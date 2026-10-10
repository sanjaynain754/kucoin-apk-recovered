package e00;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingCopyTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTraderTotalPnlEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingLeadTradingEntity;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingOptionShareInfo;
import com.kubi.sdk.protocol.p118rn.protocol.KCBridgeCopyTradingShareFooterInfo;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: e00.d */
/* JADX INFO: compiled from: KCBridgeCopyTradingCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001JE\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b!\u0010\"JE\u0010&\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b&\u0010'JE\u0010(\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b(\u0010'J5\u0010)\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\bH&¢\u0006\u0004\b)\u0010*¨\u0006+"}, m90084d2 = {"Le00/d;", "", "Landroid/content/Context;", "ctx", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingOptionShareInfo;", "optionShareInfo", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;", "footerInfo", "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "", TUIConstants.TUIChat.CALL_BACK, "g", "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingOptionShareInfo;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;", "copyTradingData", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTradingEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;", "leadTraderTotalPnlData", "b", "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTraderTotalPnlEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;", "copyTraderTotalPnlData", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderTotalPnlEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;", "copyTraderFollowOneTraderPnlData", "c", "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;", "leadTradingUserInfo", "e", "(Landroid/content/Context;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingLeadTradingEntity;Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeCopyTradingShareFooterInfo;Lkotlin/jvm/functions/Function2;)V", "", "subUid", "positionJson", "j", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "d", "f", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public interface InterfaceC37012d {
    /* JADX INFO: renamed from: a */
    void mo82837a(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTraderTotalPnlEntity copyTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: b */
    void mo82838b(@NotNull Context ctx, @NotNull KCBridgeCopyTradingLeadTraderTotalPnlEntity leadTraderTotalPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: c */
    void mo82839c(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTraderFollowOneTraderPnlEntity copyTraderFollowOneTraderPnlData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: d */
    void mo82840d(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: e */
    void mo82841e(@NotNull Context ctx, @NotNull KCBridgeCopyTradingLeadTradingEntity leadTradingUserInfo, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: f */
    void mo82842f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: g */
    void mo82843g(@NotNull Context ctx, @NotNull KCBridgeCopyTradingOptionShareInfo optionShareInfo, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: h */
    void mo82844h(@NotNull Context ctx, @NotNull KCBridgeCopyTradingCopyTradingEntity copyTradingData, @NotNull KCBridgeCopyTradingShareFooterInfo footerInfo, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);

    /* JADX INFO: renamed from: j */
    void mo82845j(@NotNull Context ctx, @NotNull String subUid, @NotNull String positionJson, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback);
}
