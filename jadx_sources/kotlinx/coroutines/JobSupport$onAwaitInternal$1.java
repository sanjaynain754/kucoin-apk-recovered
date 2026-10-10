package kotlinx.coroutines;

import kotlinx.coroutines.selects.InterfaceC41754i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3<JobSupport, InterfaceC41754i<?>, Object, Unit> {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1();

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(JobSupport jobSupport, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        invoke2(jobSupport, interfaceC41754i, obj);
        return Unit.INSTANCE;
    }

    public JobSupport$onAwaitInternal$1() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(JobSupport jobSupport, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        jobSupport.m90383C0(interfaceC41754i, obj);
    }
}
