package com.kubi.assets.jsapi;

import android.content.Context;
import c00.InterfaceC4754a;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.sdk.protocol.ProtocolException;
import com.tencent.qcloud.tuicore.TUIConstants;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: KCHybridBridgeAssetsImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J@\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\f2\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00050\u000bH\u0016¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/assets/jsapi/KCHybridBridgeAssetsImpl;", "Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeAssetsCall;", "<init>", "()V", "getHideAssetsEyeStatus", "", "ctx", "Landroid/content/Context;", "obj", "Ljava/lang/Object;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function2;", "", "Lcom/kubi/sdk/protocol/ProtocolException;", "setHideAssetsEyeStatus", "isHide", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHybridBridgeAssetsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHybridBridgeAssetsImpl.kt\ncom/kubi/assets/jsapi/KCHybridBridgeAssetsImpl\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,53:1\n135#2,2:54\n126#2,2:56\n*S KotlinDebug\n*F\n+ 1 KCHybridBridgeAssetsImpl.kt\ncom/kubi/assets/jsapi/KCHybridBridgeAssetsImpl\n*L\n30#1:54,2\n45#1:56,2\n*E\n"})
public final class KCHybridBridgeAssetsImpl implements InterfaceC4754a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f17837a = new Companion(null);

    /* JADX INFO: compiled from: KCHybridBridgeAssetsImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/jsapi/KCHybridBridgeAssetsImpl$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // c00.InterfaceC4754a
    /* JADX INFO: renamed from: a */
    public void mo4789a(@NotNull Context ctx, @Nullable Object obj, boolean z11, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
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

    @Override // c00.InterfaceC4754a
    /* JADX INFO: renamed from: b */
    public void mo4790b(@NotNull Context ctx, @Nullable Object obj, @NotNull Function2<? super Boolean, ? super ProtocolException, Unit> callback) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callback.invoke(Boolean.valueOf(C46392a.m102322d(C42153h.f93593a.m92500D(), false)), null);
        } catch (Exception e11) {
            callback.invoke(null, new ProtocolException("Failed to get hide assets eye status", e11, null, false, 12, null));
        }
    }
}
