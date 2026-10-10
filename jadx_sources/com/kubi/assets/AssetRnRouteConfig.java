package com.kubi.assets;

import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetRnRouteConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/assets/AssetRnRouteConfig;", "", "<init>", "()V", "legacyBundle", "Lcom/kubi/assets/AssetRnBundle;", "splitFlowBundle", "splitAccountBundle", "flow", "splitEnabled", "", JAnalysisConstants.Account.KEY_ACCOUNT, "AssetsCenterApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetRnRouteConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AssetRnRouteConfig f19197a = new AssetRnRouteConfig();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AssetRnBundle f19198b = new AssetRnBundle("asset_next", "kc_asset_next_rn");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AssetRnBundle f19199c = new AssetRnBundle("assets_flow_rn", "kc_asset_flow_rn");

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final AssetRnBundle f19200d = new AssetRnBundle("assets_account_next", "kc_asset_account_rn");

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AssetRnBundle m20184a(boolean z11) {
        return z11 ? f19200d : f19198b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final AssetRnBundle m20185b(boolean z11) {
        return z11 ? f19199c : f19198b;
    }
}
