package com.kubi.tradebase.business.kyc;

import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradebase.business.kyc.g, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KycRepository.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fR#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/tradebase/business/kyc/KycRepository;", "", "<init>", "()V", "api", "Lcom/kubi/tradebase/business/kyc/IKycInformation;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/tradebase/business/kyc/IKycInformation;", "api$delegate", "Lkotlin/Lazy;", "getKycInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/tradebase/business/kyc/NoticeDetailEntity;", "status", "", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f51553a = LazyKt.lazy(new Function0() { // from class: com.kubi.tradebase.business.kyc.f
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return KycRepository.m63201b();
        }
    });

    /* JADX INFO: renamed from: c */
    public final IKycInformation m63202c() {
        return (IKycInformation) this.f51553a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<NoticeDetailEntity> m63203d(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return m63202c().m63185a(status);
    }

    /* JADX INFO: renamed from: b */
    public static final IKycInformation m63201b() {
        return (IKycInformation) C42597a.m93387c().create(IKycInformation.class);
    }
}
