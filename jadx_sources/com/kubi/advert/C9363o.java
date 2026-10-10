package com.kubi.advert;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerProperties;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.advert.o */
/* JADX INFO: compiled from: AppsFlyerTrackingState.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0005"}, m90084d2 = {"gcdDiagnosticCandidateKey", "", "data", "", "", "AdvertLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C9363o {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m14800b(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = data.get("media_source");
        Object obj2 = data.get("campaign");
        Object obj3 = data.get(AppsFlyerProperties.CHANNEL);
        if (obj3 == null) {
            obj3 = data.get(AFInAppEventParameterName.AF_CHANNEL);
        }
        return CollectionsKt.joinToString$default(CollectionsKt.listOf(obj, obj2, obj3), "\u001f", null, null, 0, null, new Function1() { // from class: com.kubi.advert.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                return C9363o.m14801c(obj4);
            }
        }, 30, null);
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m14801c(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }
}
