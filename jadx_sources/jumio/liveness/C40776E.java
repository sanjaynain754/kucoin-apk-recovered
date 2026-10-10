package jumio.liveness;

import com.jumio.core.cdn.CDNEncryptedEntry;
import com.jumio.core.cdn.CDNFeatureModel;
import com.jumio.core.data.ScanMode;
import com.jumio.core.models.LivenessScanPartModel;
import com.jumio.liveness.LivenessPlugin;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.E */
/* JADX INFO: loaded from: classes61.dex */
public final class C40776E extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f90578a;

    /* JADX INFO: renamed from: b */
    public Object f90579b;

    /* JADX INFO: renamed from: c */
    public Object f90580c;

    /* JADX INFO: renamed from: d */
    public int f90581d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f90582e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C40780I f90583f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SuspendLambda f90584g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C40776E(C40780I c40780i, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f90583f = c40780i;
        this.f90584g = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40776E c40776e = new C40776E(this.f90583f, this.f90584g, continuation);
        c40776e.f90582e = obj;
        return c40776e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40776E) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r2.invoke(r10) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (jumio.liveness.C40780I.m89280a(r2, r11, (p852kotlin.jvm.functions.Function1) r3, r10) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (r2.invoke(r10) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        if (jumio.liveness.C40780I.m89280a(r5, r3, (p852kotlin.jvm.functions.Function1) r6, r10) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014e, code lost:
    
        if (r2.invoke(r10) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v15, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CDNFeatureModel cDNFeatureModel;
        Exception e11;
        CDNEncryptedEntry cDNEncryptedEntry;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.f90582e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90581d;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CDNFeatureModel cDNFeatureModel2 = (CDNFeatureModel) this.f90583f.getF14541a().getF13603d().get(CDNFeatureModel.class);
            CDNEncryptedEntry cDNEncryptedEntry2 = cDNFeatureModel2.get(LivenessPlugin.LIVENESS_ASSETS);
            if (!C41713n0.m91132h(interfaceC41709m0)) {
                return Unit.INSTANCE;
            }
            if (cDNEncryptedEntry2 == null) {
                C40780I c40780i = this.f90583f;
                ((LivenessScanPartModel) c40780i.getScanPartModel()).setMode(ScanMode.FACE_MANUAL);
                ((LivenessScanPartModel) c40780i.getScanPartModel()).setLivenessEnabled(false);
                c40780i.initExtractionAndOverlay();
                ?? r11 = this.f90584g;
                this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.f90578a = SpillingKt.nullOutSpilledVariable(cDNFeatureModel2);
                this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry2);
                this.f90581d = 1;
            } else if (!cDNFeatureModel2.has(LivenessPlugin.LIVENESS_ASSETS)) {
                C40780I c40780i2 = this.f90583f;
                ?? r12 = this.f90584g;
                this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.f90578a = SpillingKt.nullOutSpilledVariable(cDNFeatureModel2);
                this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry2);
                this.f90581d = 2;
            } else if (((LivenessScanPartModel) this.f90583f.getScanPartModel()).getF14263o()) {
                ?? r13 = this.f90584g;
                this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.f90578a = SpillingKt.nullOutSpilledVariable(cDNFeatureModel2);
                this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry2);
                this.f90581d = 5;
            } else {
                try {
                    cDNEncryptedEntry2.load(this.f90583f.getF14541a().getF13601b(), this.f90583f.getF14528v().getModelInitTimeoutInMs());
                    ?? r14 = this.f90584g;
                    this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.f90578a = cDNFeatureModel2;
                    this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry2);
                    this.f90581d = 3;
                } catch (Exception e12) {
                    cDNFeatureModel = cDNFeatureModel2;
                    e11 = e12;
                    cDNEncryptedEntry = cDNEncryptedEntry2;
                    C40780I c40780i3 = this.f90583f;
                    ?? r15 = this.f90584g;
                    this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.f90578a = SpillingKt.nullOutSpilledVariable(cDNFeatureModel);
                    this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry);
                    this.f90580c = SpillingKt.nullOutSpilledVariable(e11);
                    this.f90581d = 4;
                }
            }
        } else if (i11 == 1 || i11 == 2) {
            ResultKt.throwOnFailure(obj);
        } else if (i11 != 3) {
            if (i11 == 4) {
            } else if (i11 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            cDNEncryptedEntry = (CDNEncryptedEntry) this.f90579b;
            cDNFeatureModel = (CDNFeatureModel) this.f90578a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e13) {
                e11 = e13;
                C40780I c40780i4 = this.f90583f;
                ?? r16 = this.f90584g;
                this.f90582e = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.f90578a = SpillingKt.nullOutSpilledVariable(cDNFeatureModel);
                this.f90579b = SpillingKt.nullOutSpilledVariable(cDNEncryptedEntry);
                this.f90580c = SpillingKt.nullOutSpilledVariable(e11);
                this.f90581d = 4;
            }
        }
        return Unit.INSTANCE;
    }
}
