package com.kubi.sdk.site;

import java.util.Locale;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.sdk.site.e */
/* JADX INFO: compiled from: SiteType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0007\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00018\u0002X\u0083T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"THAILAND", "", "TURKEY", "GLOBAL", "EUROPE", "EUROPE_STAGING", "AUSTRALIA", "DEMO", "HONGKONG", "isShared", "", "LSiteConfig_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24137e {
    /* JADX INFO: renamed from: a */
    public static final boolean m58087a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Set of2 = SetsKt.setOf((Object[]) new String[]{SiteType.THAILAND_NAME, SiteType.TURKEY_NAME});
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return !of2.contains(lowerCase);
    }
}
