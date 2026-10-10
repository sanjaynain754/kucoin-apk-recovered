package com.kubi.advert;

import androidx.credentials.provider.CredentialEntry;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.advert.v */
/* JADX INFO: compiled from: GcdDeferredRouteCoordinator.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0000\u001a2\u0010\t\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u000f"}, m90084d2 = {"parseGcdCampaignCode", "", "value", "", "gcdCampaignSkipReason", "isEligibleGcdConversion", "", "data", "", "gcdGateSkipReason", "campaign", "gcdOpen", "udlRouteSkipReason", "resolvedDirectDeepLink", "routeUrl", "AdvertLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGcdDeferredRouteCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GcdDeferredRouteCoordinator.kt\ncom/kubi/advert/GcdDeferredRouteCoordinatorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
public final class C9372v {
    /* JADX INFO: renamed from: c */
    public static final boolean m14823c(@Nullable Map<String, ? extends Object> map) {
        boolean zEquals;
        Object obj;
        String string;
        boolean z11 = (map == null || (obj = map.get("af_status")) == null || (string = obj.toString()) == null || !StringsKt.equals(string, "Non-organic", true)) ? false : true;
        Object obj2 = map != null ? map.get("is_first_launch") : null;
        if (obj2 instanceof Boolean) {
            zEquals = ((Boolean) obj2).booleanValue();
        } else {
            zEquals = obj2 instanceof String ? StringsKt.equals((String) obj2, CredentialEntry.TRUE_STRING, true) : false;
        }
        return z11 && zEquals;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m14821a(@Nullable Object obj) {
        String string;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null && !StringsKt.equals(string, "none", true) && !StringsKt.equals(string, "null", true)) {
                if (StringsKt.startsWith$default(string, "{", false, 2, (Object) null) || StringsKt.startsWith$default(string, "[", false, 2, (Object) null)) {
                    return "campaign_json";
                }
                return null;
            }
        }
        return "invalid_campaign";
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m14822b(@Nullable Map<String, ? extends Object> map, @Nullable Object obj, boolean z11) {
        Object obj2;
        String string;
        boolean zEquals;
        if (!z11) {
            return "cloud_off";
        }
        if (map == null || (obj2 = map.get("af_status")) == null || (string = obj2.toString()) == null || !StringsKt.equals(string, "Non-organic", true)) {
            return "organic";
        }
        Object obj3 = map != null ? map.get("is_first_launch") : null;
        if (obj3 instanceof Boolean) {
            zEquals = ((Boolean) obj3).booleanValue();
        } else {
            zEquals = obj3 instanceof String ? StringsKt.equals((String) obj3, CredentialEntry.TRUE_STRING, true) : false;
        }
        return !zEquals ? "not_first_launch" : m14821a(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m14825e(boolean z11, @Nullable String str) {
        if (z11 && str == null) {
            return "invalid_route";
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final String m14824d(@Nullable Object obj) {
        if (m14821a(obj) != null) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return StringsKt.trim((CharSequence) obj).toString();
    }
}
