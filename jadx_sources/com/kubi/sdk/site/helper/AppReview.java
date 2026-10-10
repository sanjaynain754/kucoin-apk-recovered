package com.kubi.sdk.site.helper;

import com.kubi.sdk.site.exception.SiteException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AppReview.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/helper/AppReview;", "", "<init>", "()V", "TAG", "", "FETCH_APP_REVIEW_TIMEOUT", "", "SITE_GUIDE_KEY", "fetchAppReview", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAppReview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppReview.kt\ncom/kubi/sdk/site/helper/AppReview\n+ 2 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,34:1\n45#2,3:35\n*S KotlinDebug\n*F\n+ 1 AppReview.kt\ncom/kubi/sdk/site/helper/AppReview\n*L\n28#1:35,3\n*E\n"})
public final class AppReview {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppReview f47908a = new AppReview();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m58091a(@NotNull Continuation<? super Boolean> continuation) throws Exception {
        AppReview$fetchAppReview$1 appReview$fetchAppReview$1;
        if (continuation instanceof AppReview$fetchAppReview$1) {
            appReview$fetchAppReview$1 = (AppReview$fetchAppReview$1) continuation;
            int i11 = appReview$fetchAppReview$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appReview$fetchAppReview$1.label = i11 - Integer.MIN_VALUE;
            } else {
                appReview$fetchAppReview$1 = new AppReview$fetchAppReview$1(this, continuation);
            }
        } else {
            appReview$fetchAppReview$1 = new AppReview$fetchAppReview$1(this, continuation);
        }
        Object objM90469d = appReview$fetchAppReview$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = appReview$fetchAppReview$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90469d);
                AppReview$fetchAppReview$2 appReview$fetchAppReview$2 = new AppReview$fetchAppReview$2(null);
                appReview$fetchAppReview$1.label = 1;
                objM90469d = TimeoutKt.m90469d(2000L, appReview$fetchAppReview$2, appReview$fetchAppReview$1);
                if (objM90469d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90469d);
            }
            Boolean bool = (Boolean) objM90469d;
            return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
        } catch (Exception e11) {
            if (e11 instanceof CancellationException) {
                throw e11;
            }
            C44128b.m97263g("AppReview", e11);
            C43846g.m96568c(new SiteException(e11, "AppReview", false, null, 8, null), null, 2, null);
            C44128b.m97261e("AppReview", "load app review error: " + e11.getMessage());
            return Boxing.boxBoolean(false);
        }
    }
}
