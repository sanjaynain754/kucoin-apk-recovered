package com.kubi.sdk.site.migration;

import com.kubi.sdk.site.exception.SiteException;
import mr.C42597a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteMigrationService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/sdk/site/migration/SiteTransferUserResponse;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.migration.SiteMigrationService$needMigrationLoader$1", m90122f = "SiteMigrationService.kt", m90123i = {}, m90124l = {119}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nSiteMigrationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService$needMigrationLoader$1\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,191:1\n45#2,3:192\n*S KotlinDebug\n*F\n+ 1 SiteMigrationService.kt\ncom/kubi/sdk/site/migration/SiteMigrationService$needMigrationLoader$1\n*L\n123#1:192,3\n*E\n"})
public final class SiteMigrationService$needMigrationLoader$1 extends SuspendLambda implements Function1<Continuation<? super SiteTransferUserResponse>, Object> {
    int label;

    public SiteMigrationService$needMigrationLoader$1(Continuation<? super SiteMigrationService$needMigrationLoader$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SiteMigrationService$needMigrationLoader$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super SiteTransferUserResponse> continuation) {
        return ((SiteMigrationService$needMigrationLoader$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ISiteMigrationAPI iSiteMigrationAPI = (ISiteMigrationAPI) C42597a.m93388d().create(ISiteMigrationAPI.class);
                this.label = 1;
                obj = iSiteMigrationAPI.m58153b(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            SiteTransferUserResponse siteTransferUserResponse = (SiteTransferUserResponse) obj;
            C44128b.m97266j("SiteMigrationService", "loader transferSwitchMap=" + siteTransferUserResponse.getTransferSwitchMap() + " target=" + siteTransferUserResponse.getTargetSiteType());
            return siteTransferUserResponse;
        } catch (Exception e11) {
            C44128b.m97263g("SiteMigrationService", e11);
            C43846g.m96568c(new SiteException(e11, "SiteMigrationService", false, null, 8, null), null, 2, null);
            return null;
        }
    }
}
