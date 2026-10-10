package com.kubi.kweb.helper;

import com.kubi.kweb.api.IWebApi;
import com.kubi.kweb.exception.KWebException;
import com.kubi.sdk.base.entity.BaseEntity;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import x00.C45977b;
import zm.C46895a;

/* JADX INFO: compiled from: WhiteListHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kweb/helper/WhiteListHelper;", "", "<init>", "()V", "fetchWhiteList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWhiteListHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhiteListHelper.kt\ncom/kubi/kweb/helper/WhiteListHelper\n+ 2 KWebIssue.kt\ncom/kubi/kweb/exception/KWebIssueKt\n*L\n1#1,33:1\n44#2,2:34\n*S KotlinDebug\n*F\n+ 1 WhiteListHelper.kt\ncom/kubi/kweb/helper/WhiteListHelper\n*L\n23#1:34,2\n*E\n"})
public final class WhiteListHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WhiteListHelper f31028a = new WhiteListHelper();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m36737a(@NotNull Continuation<? super Unit> continuation) {
        WhiteListHelper$fetchWhiteList$1 whiteListHelper$fetchWhiteList$1;
        if (continuation instanceof WhiteListHelper$fetchWhiteList$1) {
            whiteListHelper$fetchWhiteList$1 = (WhiteListHelper$fetchWhiteList$1) continuation;
            int i11 = whiteListHelper$fetchWhiteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                whiteListHelper$fetchWhiteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                whiteListHelper$fetchWhiteList$1 = new WhiteListHelper$fetchWhiteList$1(this, continuation);
            }
        } else {
            whiteListHelper$fetchWhiteList$1 = new WhiteListHelper$fetchWhiteList$1(this, continuation);
        }
        Object whiteUrlList = whiteListHelper$fetchWhiteList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = whiteListHelper$fetchWhiteList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(whiteUrlList);
                IWebApi iWebApi = (IWebApi) C42597a.m93386b().create(IWebApi.class);
                whiteListHelper$fetchWhiteList$1.label = 1;
                whiteUrlList = iWebApi.getWhiteUrlList(whiteListHelper$fetchWhiteList$1);
                if (whiteUrlList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(whiteUrlList);
            }
            C45977b.f103426a.m101429o((List) C46895a.m103288a((BaseEntity) whiteUrlList));
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C43840a.m96549c("fetchWhiteList err", null, 2, null);
            } else {
                C43846g.m96568c(new KWebException(e11, "fetchWhiteList err", false, null, 8, null), null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
