package com.kubi.quotefacade.favorites;

import android.os.Bundle;
import com.kubi.quotefacade.helper.C22218w1;
import com.kubi.router.utils.RouteExKt;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.quotefacade.favorites.s0 */
/* JADX INFO: compiled from: QuoteExtension.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0004"}, m90084d2 = {"needShowQuoteFloatGuideView", "", "Landroid/os/Bundle;", "isHoldShowSubType", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C22098s0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m51728a(@Nullable Bundle bundle) {
        return (bundle != null ? RouteExKt.m56260m(bundle, "holdingSubTabCount") : 0) > 1;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m51729b(@Nullable Bundle bundle) {
        if (C22218w1.m52123c(bundle)) {
            return false;
        }
        return !C46392a.m102322d(new StorageId("mmkv.default", "ll_float_guide", null, false, 12, null), false);
    }
}
