package jumio.core;

import com.jumio.sdk.consent.JumioConsentItem;
import java.util.Map;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.k0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40683k0 {
    /* JADX INFO: renamed from: a */
    public static final Map m89258a(JumioConsentItem jumioConsentItem, Long l11) {
        Intrinsics.checkNotNullParameter(jumioConsentItem, "<this>");
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m90091to("id", jumioConsentItem.getId()), TuplesKt.m90091to("displayType", jumioConsentItem.getType().name()));
        if (l11 != null) {
            mapMutableMapOf.put("timestamp", Long.valueOf(l11.longValue()));
        }
        return MapsKt.toMap(mapMutableMapOf);
    }
}
