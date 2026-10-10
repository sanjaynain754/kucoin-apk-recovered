package com.kubi.sdk.pkg.bundle.i18n;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.pkg.task.ConditionalJsonResponse;
import com.kubi.sdk.pkg.task.HttpHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PackageRnI18nFetcher.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/i18n/PackageRnI18nFetcher;", "Lcom/kubi/sdk/pkg/bundle/i18n/a;", "<init>", "()V", "", "url", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;", "validator", "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPackageRnI18nFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageRnI18nFetcher.kt\ncom/kubi/sdk/pkg/bundle/i18n/PackageRnI18nFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class PackageRnI18nFetcher implements InterfaceC23947a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PackageRnI18nFetcher f47311a = new PackageRnI18nFetcher();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.sdk.pkg.bundle.i18n.InterfaceC23947a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo57549a(@NotNull String str, @NotNull RnI18nHttpValidator rnI18nHttpValidator, @NotNull Continuation<? super RnI18nHttpResult> continuation) {
        PackageRnI18nFetcher$fetch$1 packageRnI18nFetcher$fetch$1;
        if (continuation instanceof PackageRnI18nFetcher$fetch$1) {
            packageRnI18nFetcher$fetch$1 = (PackageRnI18nFetcher$fetch$1) continuation;
            int i11 = packageRnI18nFetcher$fetch$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                packageRnI18nFetcher$fetch$1.label = i11 - Integer.MIN_VALUE;
            } else {
                packageRnI18nFetcher$fetch$1 = new PackageRnI18nFetcher$fetch$1(this, continuation);
            }
        } else {
            packageRnI18nFetcher$fetch$1 = new PackageRnI18nFetcher$fetch$1(this, continuation);
        }
        Object objM57785k = packageRnI18nFetcher$fetch$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = packageRnI18nFetcher$fetch$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM57785k);
            String etag = rnI18nHttpValidator.getEtag();
            String lastModified = rnI18nHttpValidator.getLastModified();
            packageRnI18nFetcher$fetch$1.L$0 = rnI18nHttpValidator;
            packageRnI18nFetcher$fetch$1.label = 1;
            objM57785k = HttpHelperKt.m57785k(str, etag, lastModified, packageRnI18nFetcher$fetch$1);
            if (objM57785k == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rnI18nHttpValidator = (RnI18nHttpValidator) packageRnI18nFetcher$fetch$1.L$0;
            ResultKt.throwOnFailure(objM57785k);
        }
        ConditionalJsonResponse conditionalJsonResponse = (ConditionalJsonResponse) objM57785k;
        boolean notModified = conditionalJsonResponse.getNotModified();
        String body = conditionalJsonResponse.getBody();
        String etag2 = conditionalJsonResponse.getEtag();
        String str2 = null;
        if (etag2 == null) {
            etag2 = rnI18nHttpValidator.getEtag();
            if (!conditionalJsonResponse.getNotModified()) {
                etag2 = null;
            }
        }
        String lastModified2 = conditionalJsonResponse.getLastModified();
        if (lastModified2 == null) {
            String lastModified3 = rnI18nHttpValidator.getLastModified();
            if (conditionalJsonResponse.getNotModified()) {
                str2 = lastModified3;
            }
        } else {
            str2 = lastModified2;
        }
        return new RnI18nHttpResult(notModified, body, new RnI18nHttpValidator(etag2, str2));
    }
}
