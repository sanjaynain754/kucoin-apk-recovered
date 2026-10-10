package kotlinx.coroutines;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements Function3<JobSupport, Object, Object, Object> {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        return jobSupport.m90382B0(obj, obj2);
    }
}
