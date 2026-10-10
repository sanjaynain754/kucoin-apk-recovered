package p307hb;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetsLog;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.profit.loss.analysis.lib.PnlMethod;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import e00.InterfaceC37009a;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: renamed from: hb.a */
/* JADX INFO: compiled from: KCBridgeAssetsCallImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J6\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016J.\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0016¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/assets/rn/KCBridgeAssetsCallImpl;", "Lcom/kubi/sdk/protocol/rn/protocol/KCBridgeAssetsCall;", "<init>", "()V", "getHideAssetsEyeStatus", "", "ctx", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "getPnlCalcMethod", "getPnlClaudeConfigOpen", "getPnlMethodNewTipDismissed", "setHideAssetsEyeStatus", "isHide", "setPnlCalcMethod", FirebaseAnalytics.Param.METHOD, "", "setPnlMethodNewTipDismissed", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBridgeAssetsCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBridgeAssetsCallImpl.kt\ncom/kubi/assets/rn/KCBridgeAssetsCallImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,141:1\n135#2,2:142\n32#2:144\n135#2,2:145\n126#2,2:147\n23#2,2:149\n126#2,2:151\n*S KotlinDebug\n*F\n+ 1 KCBridgeAssetsCallImpl.kt\ncom/kubi/assets/rn/KCBridgeAssetsCallImpl\n*L\n36#1:142,2\n48#1:144\n78#1:145,2\n99#1:147,2\n117#1:149,2\n134#1:151,2\n*E\n"})
public final class C38156a implements InterfaceC37009a {
    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: a */
    public void mo82830a(@NotNull Context ctx, @NotNull String method, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            AssetsLog assetsLog = AssetsLog.Common;
            assetsLog.m15236i("setPnlCalcMethod: received method=" + method);
            PnlMethod pnlMethodValueOf = PnlMethod.valueOf(method);
            C46392a.m102333p(C42153h.f93593a.m92497A(), pnlMethodValueOf.name());
            assetsLog.m15236i("setPnlCalcMethod: saved successfully, method=" + pnlMethodValueOf.name());
            callback.invoke(Boolean.TRUE, null);
        } catch (IllegalArgumentException e11) {
            AssetsLog.Common.m15234e("setPnlCalcMethod: invalid method=" + method + ", " + e11.getMessage());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid pnl calc method: ");
            sb2.append(method);
            sb2.append(", must be SIMPLE or TIME");
            callback.invoke(null, new ProtocolException(sb2.toString(), e11, null, false, 12, null));
        } catch (Exception e12) {
            AssetsLog.Common.m15234e("setPnlCalcMethod error: " + e12.getMessage());
            callback.invoke(null, new ProtocolException("Failed to set pnl calc method", e12, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: b */
    public void mo82831b(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(Boolean.valueOf(C46392a.m102322d(C42153h.f93593a.m92500D(), false)), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to get hide assets eye status", e11, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: c */
    public void mo82832c(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            boolean zM19571n = AssetRemoteConfig.f18903a.m19571n();
            AssetsLog.Common.m15236i("getPnlClaudeConfigOpen: isOpen=" + zM19571n);
            callback.invoke(Boolean.valueOf(zM19571n), null);
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("getPnlClaudeConfigOpen error: " + e11.getMessage());
            callback.invoke(null, new ProtocolException("Failed to get pnl claude config open status", e11, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: d */
    public void mo82833d(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(Boolean.valueOf(C46392a.m102322d(C42153h.f93593a.m92498B(), false)), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to get pnl method new tip dismissed status", e11, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: e */
    public void mo82834e(@NotNull Context ctx, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C46392a.m102328k(C42153h.f93593a.m92500D(), z11);
            AssetsProfitLossAnalysisManager.f40608a.m49943e(z11);
            callback.invoke(Boolean.valueOf(z11), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to set hide assets eye status", e11, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: f */
    public void mo82835f(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            String strM102326h = C46392a.m102326h(C42153h.f93593a.m92497A(), "SIMPLE");
            boolean zAreEqual = Intrinsics.areEqual(strM102326h, "TIME");
            AssetsLog.Common.m15236i("getPnlCalcMethod: storedMethod=" + strM102326h + ", isTime=" + zAreEqual);
            callback.invoke(Boolean.valueOf(zAreEqual), null);
        } catch (Exception e11) {
            AssetsLog.Common.m15234e("getPnlCalcMethod error: " + e11.getMessage());
            callback.invoke(null, new ProtocolException("Failed to get pnl calc method", e11, null, false, 12, null));
        }
    }

    @Override // e00.InterfaceC37009a
    /* JADX INFO: renamed from: g */
    public void mo82836g(@NotNull Context ctx, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            C46392a.m102328k(C42153h.f93593a.m92498B(), true);
            callback.invoke(Boolean.TRUE, null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to set pnl method new tip dismissed status", e11, null, false, 12, null));
        }
    }
}
