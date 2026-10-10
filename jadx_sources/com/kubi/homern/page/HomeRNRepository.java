package com.kubi.homern.page;

import com.kubi.config.exception.KCConfigException;
import com.kubi.homern.beans.VipLevelUpDialogInfo;
import com.kubi.network.retrofit.exception.ApiException;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.http.GET;
import ro.C44128b;

/* JADX INFO: compiled from: HomeRNRepository.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNRepository;", "", "<init>", "()V", "TAG", "", "fetchLevelUpDialogInfo", "Lcom/kubi/homern/beans/VipLevelUpDialogInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeRNApi", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeRNRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRNRepository.kt\ncom/kubi/homern/page/HomeRNRepository\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,39:1\n44#2,2:40\n*S KotlinDebug\n*F\n+ 1 HomeRNRepository.kt\ncom/kubi/homern/page/HomeRNRepository\n*L\n24#1:40,2\n*E\n"})
public final class HomeRNRepository {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final HomeRNRepository f26955a = new HomeRNRepository();

    /* JADX INFO: renamed from: com.kubi.homern.page.HomeRNRepository$a */
    /* JADX INFO: compiled from: HomeRNRepository.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H§@¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/homern/page/HomeRNRepository$HomeRNApi;", "", "fetchVipDialogInfo", "", "Lcom/kubi/homern/beans/VipLevelUpDialogInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC15154a {
        @GET("vip/prize/pop-up")
        @Nullable
        /* JADX INFO: renamed from: a */
        Object m31250a(@NotNull Continuation<? super List<VipLevelUpDialogInfo>> continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m31249a(@NotNull Continuation<? super VipLevelUpDialogInfo> continuation) {
        HomeRNRepository$fetchLevelUpDialogInfo$1 homeRNRepository$fetchLevelUpDialogInfo$1;
        if (continuation instanceof HomeRNRepository$fetchLevelUpDialogInfo$1) {
            homeRNRepository$fetchLevelUpDialogInfo$1 = (HomeRNRepository$fetchLevelUpDialogInfo$1) continuation;
            int i11 = homeRNRepository$fetchLevelUpDialogInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeRNRepository$fetchLevelUpDialogInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                homeRNRepository$fetchLevelUpDialogInfo$1 = new HomeRNRepository$fetchLevelUpDialogInfo$1(this, continuation);
            }
        } else {
            homeRNRepository$fetchLevelUpDialogInfo$1 = new HomeRNRepository$fetchLevelUpDialogInfo$1(this, continuation);
        }
        Object objM31250a = homeRNRepository$fetchLevelUpDialogInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = homeRNRepository$fetchLevelUpDialogInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM31250a);
                InterfaceC15154a interfaceC15154a = (InterfaceC15154a) C42597a.m93388d().create(InterfaceC15154a.class);
                homeRNRepository$fetchLevelUpDialogInfo$1.label = 1;
                objM31250a = interfaceC15154a.m31250a(homeRNRepository$fetchLevelUpDialogInfo$1);
                if (objM31250a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM31250a);
            }
            List list = (List) objM31250a;
            if (list != null) {
                return (VipLevelUpDialogInfo) CollectionsKt.getOrNull(list, 0);
            }
            return null;
        } catch (ApiException e11) {
            C44128b.m97259c("HomeRNRepository", "[fetchLevelUpDialogInfo] error: " + e11.code + ' ' + e11.getMessage());
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "HomeRNRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }
}
