package com.sumsub.sns.internal.core.presentation.android.location;

import com.sumsub.sns.internal.features.domain.utils.C30317b;
import com.tencent.bugly.proguard.C33627eb;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28676l {

    /* JADX INFO: renamed from: e */
    public static final long f58306e;

    /* JADX INFO: renamed from: f */
    public static final long f58307f;

    /* JADX INFO: renamed from: a */
    public final C30317b f58308a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f58309b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41678w f58310c;

    /* JADX INFO: renamed from: d */
    public InterfaceC41769w f58311d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m69489a(ContinuationImpl continuationImpl) {
        C28674j c28674j;
        if (continuationImpl instanceof C28674j) {
            c28674j = (C28674j) continuationImpl;
            int i11 = c28674j.f58303c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28674j.f58303c = i11 - Integer.MIN_VALUE;
            } else {
                c28674j = new C28674j(this, continuationImpl);
            }
        } else {
            c28674j = new C28674j(this, continuationImpl);
        }
        Object objM90470e = c28674j.f58301a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28674j.f58303c;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM90470e);
                InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                this.f58311d = interfaceC41769wM91388c;
                this.f58309b.setValue(new C28671g(f58306e));
                m69490a("acquireLocation: started");
                long j11 = f58307f;
                C28675k c28675k = new C28675k(interfaceC41769wM91388c, null);
                c28674j.f58303c = 1;
                objM90470e = TimeoutKt.m90470e(j11, c28675k, c28674j);
                if (objM90470e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM90470e);
            }
            Object obj = (InterfaceC28670f) objM90470e;
            if (obj == null) {
                m69490a("acquireLocation: timed out");
            }
            if (obj == null) {
                obj = C28668d.f58298a;
            }
            this.f58311d = null;
            this.f58309b.setValue(C28672h.f58300a);
            return obj;
        } catch (Throwable th2) {
            this.f58311d = null;
            this.f58309b.setValue(C28672h.f58300a);
            throw th2;
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f58306e = DurationKt.toDuration(10, DurationUnit.MINUTES);
        f58307f = DurationKt.toDuration(30, DurationUnit.SECONDS);
    }

    public C28676l(C30317b c30317b) {
        this.f58308a = c30317b;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(C28672h.f58300a);
        this.f58309b = interfaceC41669nM91009a;
        this.f58310c = C41636g.m90907c(interfaceC41669nM91009a);
    }

    /* JADX INFO: renamed from: a */
    public final void m69490a(String str) {
        C30317b.m70184a(this.f58308a, "LocationAcquisitionController" + C33627eb.f69716f + str);
    }
}
