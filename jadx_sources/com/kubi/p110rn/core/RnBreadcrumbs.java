package com.kubi.p110rn.core;

import com.google.android.gms.common.internal.ImagesContract;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.RNConstantKt;
import com.kubi.sdk.pkg.bundle.LoadBundleConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RnBreadcrumbs.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ8\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/rn/core/RnBreadcrumbs;", "", "<init>", "()V", "bundleConfig", "", "param", "Lcom/kubi/rn/core/ReactInitParam;", "loadConfig", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "pageMount", Constants.BIZ, "", "entry", Constants.COMPONENT, "bundleVersion", "subPath", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RnBreadcrumbs {

    @NotNull
    public static final RnBreadcrumbs INSTANCE = new RnBreadcrumbs();

    public final void bundleConfig(@NotNull ReactInitParam param, @NotNull LoadBundleConfig loadConfig) {
        Intrinsics.checkNotNullParameter(param, "param");
        Intrinsics.checkNotNullParameter(loadConfig, "loadConfig");
        try {
            Result.Companion companion = Result.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rn_bundle_config biz=");
            sb2.append(param.getBiz());
            sb2.append(" entry=");
            sb2.append(param.getEntry());
            sb2.append(" component=");
            sb2.append(param.getComponent());
            sb2.append(" bundleVersion=");
            String strM57542i = loadConfig.m57542i();
            if (strM57542i == null) {
                strM57542i = "";
            }
            sb2.append(strM57542i);
            sb2.append(" source=");
            sb2.append(loadConfig.getFromRemote() ? "remote" : ImagesContract.LOCAL);
            C43840a.m96550d(sb2.toString(), RNConstantKt.RN_CATEGORY);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final void pageMount(@NotNull String biz, @NotNull String entry, @NotNull String component, @Nullable String bundleVersion, @NotNull String subPath, int pageMount) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(subPath, "subPath");
        try {
            Result.Companion companion = Result.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rn_page_mount biz=");
            sb2.append(biz);
            sb2.append(" entry=");
            sb2.append(entry);
            sb2.append(" component=");
            sb2.append(component);
            sb2.append(" bundleVersion=");
            if (bundleVersion == null) {
                bundleVersion = "";
            }
            sb2.append(bundleVersion);
            sb2.append(" subPath=");
            sb2.append(subPath);
            sb2.append(" pageMount=");
            sb2.append(pageMount);
            C43840a.m96550d(sb2.toString(), RNConstantKt.RN_CATEGORY);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    private RnBreadcrumbs() {
    }
}
