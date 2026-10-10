package com.kubi.quotefacade.knb;

import com.kubi.event.api.C12572a;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.knb.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCFlutterPageDismissTransmit.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/quotefacade/knb/KCFlutterPageDismissTransmit;", "", "<init>", "()V", "onFlutterPageDismiss", "", "data", "", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCFlutterPageDismissTransmit {
    /* JADX INFO: renamed from: a */
    public final boolean m52216a(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C44128b.m97266j("KCFlutterBridgePageDismissCallImpl", "onPageDismiss=" + data);
        Object obj = data.get("key_chain_page_from_type");
        Object obj2 = data.get("key_chain_filter_data");
        if (Intrinsics.areEqual(obj, "favorite")) {
            C12572a.m23695d("chain_filter_data_back_favorite", obj2, 0L, 4, null);
            return true;
        }
        if (Intrinsics.areEqual(obj, "market")) {
            C12572a.m23695d("chain_filter_data_back_market", obj2, 0L, 4, null);
            return true;
        }
        if (!Intrinsics.areEqual(obj, "marketHot")) {
            return false;
        }
        C12572a.m23695d("chain_filter_data_back_market", obj2, 0L, 4, null);
        return true;
    }
}
