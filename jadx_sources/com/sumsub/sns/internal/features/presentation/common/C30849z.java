package com.sumsub.sns.internal.features.presentation.common;

import android.content.Context;
import android.net.Uri;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.common.z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30849z extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62305a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC30808G f62306b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f62307c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f62308d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Uri f62309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30849z(AbstractC30808G abstractC30808G, Context context, String str, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f62306b = abstractC30808G;
        this.f62307c = context;
        this.f62308d = str;
        this.f62309e = uri;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30849z(this.f62306b, this.f62307c, this.f62308d, this.f62309e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30849z) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (com.sumsub.sns.internal.features.presentation.utils.C32635M.m71222a(r15, r5, r14) == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String scheme;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62305a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f62306b.showProgress(true);
            Context context = this.f62307c;
            String str = this.f62308d;
            Uri uri = this.f62309e;
            this.f62305a = 1;
            obj = AbstractC28458h.m69331a(context, uri, str, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            Uri uri2 = (Uri) obj;
            C30316a.m70183b(this.f62306b.f62237b, "SNSImageDocumentsAwareViewModel", "onGalleryImagePicked: temp file uri - " + uri2);
            if (uri2 == null) {
                return Unit.INSTANCE;
            }
            String path = uri2.getPath();
            if (path != null && path.length() != 0 && (scheme = uri2.getScheme()) != null && StringsKt.startsWith$default(scheme, "file", false, 2, (Object) null)) {
                File file = new File(StringsKt.replace$default(uri2.toString(), "file://", "", false, 4, (Object) null));
                C29054T c29054t = new C29054T(file, file, null, null, this.f62306b.f62236a.f66620l.m71283a(), null, null, 748);
                C32635M c32635m = this.f62306b.f62236a;
                this.f62305a = 2;
                c32635m.getClass();
            } else {
                return Unit.INSTANCE;
            }
        } catch (Throwable th2) {
            C30316a c30316a = this.f62306b.f62237b;
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            c30316a.getClass();
            C33272c.f67816e.f67810a.mo68956e("SNSImageDocumentsAwareViewModel", message, th2);
        }
    }
}
