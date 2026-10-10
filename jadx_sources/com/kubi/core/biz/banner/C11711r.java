package com.kubi.core.biz.banner;

import com.kubi.resources.widget.MarqueeTextView;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: renamed from: com.kubi.core.biz.banner.r */
/* JADX INFO: compiled from: SpotDisplayBanner.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0007\u001a\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0001\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0001\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"SPOT_BANNER_CATEGORY", "", "BANNER_CLOSE_FOREVER_VALUE", "", "getContentList", "", "Lcom/kubi/resources/widget/MarqueeTextView$IString;", "Lcom/kubi/core/biz/banner/SpotDisplayBanner;", "closeAndSave", "", "isAllowDisplay", "", "isGapOverDays", "oldTimeMillis", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C11711r {
    /* JADX INFO: renamed from: d */
    public static final boolean m21308d(long j11, long j12) {
        return j11 - j12 > 86400000;
    }

    /* JADX INFO: renamed from: a */
    public static final void m21305a(@Nullable String str) {
        if (str != null) {
            C46396e.m102356m("SPOT_BANNER_CATEGORY_1", str, System.currentTimeMillis());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<MarqueeTextView.InterfaceC22932e> m21306b(@NotNull SpotDisplayBanner spotDisplayBanner) {
        Intrinsics.checkNotNullParameter(spotDisplayBanner, "<this>");
        if (spotDisplayBanner instanceof SpotDisplayBanner.Common) {
            return CollectionsKt.listOf(((SpotDisplayBanner.Common) spotDisplayBanner).getContentItem());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m21307c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        long jM102349f = C46396e.m102349f("SPOT_BANNER_CATEGORY_1", str, 0L);
        if (jM102349f == 0) {
            return true;
        }
        if (jM102349f == -1) {
            return false;
        }
        return m21308d(System.currentTimeMillis(), jM102349f);
    }
}
