package com.kubi.sdk.site;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.site.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SiteUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/site/SiteUtils;", "", "<init>", "()V", "siteFileName", "", "baseName", "extension", "targetSite", "siteFileDirectoryName", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSiteUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteUtils.kt\ncom/kubi/sdk/site/SiteUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class SiteUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SiteUtils f47907a = new SiteUtils();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m58088c(SiteUtils siteUtils, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        return siteUtils.m58090b(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m58089a(@NotNull String baseName) {
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        if (!C24137e.m58087a(currentSiteType)) {
            return baseName;
        }
        return baseName + '_' + currentSiteType;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m58090b(@NotNull String baseName, @Nullable String str, @NotNull String targetSite) {
        Intrinsics.checkNotNullParameter(baseName, "baseName");
        Intrinsics.checkNotNullParameter(targetSite, "targetSite");
        if (targetSite.length() == 0) {
            targetSite = SiteType.INSTANCE.getCurrentSiteType();
        }
        if (C24137e.m58087a(targetSite)) {
            baseName = baseName + ".site_" + targetSite;
        }
        if (str == null || str.length() == 0) {
            return baseName;
        }
        return baseName + '.' + str;
    }
}
