package jumio.core;

import com.jumio.core.extraction.ExtractionClient;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.core.j1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40679j1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90297a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExtractionClient f90299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40679j1(ExtractionClient extractionClient, Continuation continuation) {
        super(2, continuation);
        this.f90299c = extractionClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40679j1 c40679j1 = new C40679j1(this.f90299c, continuation);
        c40679j1.f90298b = obj;
        return c40679j1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40679j1 c40679j1 = new C40679j1(this.f90299c, (Continuation) obj2);
        c40679j1.f90298b = (InterfaceC41709m0) obj;
        return c40679j1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #0 {all -> 0x0013, blocks: (B:5:0x000f, B:17:0x0033, B:14:0x0026), top: B:22:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f90298b
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r4.f90297a
            r3 = 1
            if (r2 == 0) goto L1d
            if (r2 != r3) goto L15
            p852kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L13
            goto L33
        L13:
            r5 = move-exception
            goto L36
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            p852kotlin.ResultKt.throwOnFailure(r5)
        L20:
            boolean r5 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r5 == 0) goto L40
            com.jumio.core.extraction.ExtractionClient r5 = r4.f90299c     // Catch: java.lang.Throwable -> L13
            r4.f90298b = r0     // Catch: java.lang.Throwable -> L13
            r4.f90297a = r3     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = com.jumio.core.extraction.ExtractionClient.access$extract(r5, r4)     // Catch: java.lang.Throwable -> L13
            if (r5 != r1) goto L33
            return r1
        L33:
            kotlin.Unit r5 = (p852kotlin.Unit) r5     // Catch: java.lang.Throwable -> L13
            goto L20
        L36:
            com.jumio.commons.log.Log.printStackTrace(r5)
            com.jumio.core.extraction.ExtractionClient r5 = r4.f90299c
            r2 = 0
            r5.setResult(r2)
            goto L20
        L40:
            kotlin.Unit r5 = p852kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.core.C40679j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
