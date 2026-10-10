package com.kubi.advert;

import com.appsflyer.deeplink.DeepLinkResult;
import com.tencent.bugly.proguard.C33864ph;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.r */
/* JADX INFO: compiled from: AppsFlyerUtil.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, m90084d2 = {"udlResolveTrackingResult", "", "status", "Lcom/appsflyer/deeplink/DeepLinkResult$Status;", "routeUrl", "shouldReportUdlResolve", "", "AdvertLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9366r {

    /* JADX INFO: renamed from: com.kubi.advert.r$a */
    /* JADX INFO: compiled from: AppsFlyerUtil.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m14802a(@NotNull DeepLinkResult.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return status != DeepLinkResult.Status.NOT_FOUND;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m14803b(@NotNull DeepLinkResult.Status status, @Nullable String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = a.$EnumSwitchMapping$0[status.ordinal()];
        if (i11 == 1) {
            return C33864ph.f71456b;
        }
        if (i11 == 2) {
            return "skip";
        }
        if (i11 == 3) {
            return str == null ? "skip" : "ok";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m14804c(DeepLinkResult.Status status, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return m14803b(status, str);
    }
}
