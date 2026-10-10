package com.kubi.abtest;

import com.kubi.sdk.site.SiteType;
import com.kubi.user.config.UserInfo;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.abtest.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCABTestService.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/abtest/DefaultKCABTestIdentityProvider;", "Lcom/kubi/abtest/KCABTestIdentityProvider;", "<init>", "()V", "getIdentity", "Lcom/kubi/abtest/KCABTestIdentity;", "ABTest_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultKCABTestIdentityProvider implements KCABTestIdentityProvider {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DefaultKCABTestIdentityProvider f14849a = new DefaultKCABTestIdentityProvider();

    @Override // com.kubi.abtest.KCABTestIdentityProvider
    @NotNull
    /* JADX INFO: renamed from: a */
    public KCABTestIdentity mo14640a() {
        SensorsDataAPI sensorsDataAPISharedInstance = SensorsDataAPI.sharedInstance();
        String currentSiteType = SiteType.INSTANCE.getCurrentSiteType();
        String distinctId = sensorsDataAPISharedInstance.getDistinctId();
        Intrinsics.checkNotNullExpressionValue(distinctId, "getDistinctId(...)");
        return new KCABTestIdentity(currentSiteType, distinctId, UserInfo.a.n());
    }
}
