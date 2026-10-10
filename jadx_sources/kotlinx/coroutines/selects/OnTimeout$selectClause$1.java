package kotlinx.coroutines.selects;

import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: OnTimeout.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements Function3<OnTimeout, InterfaceC41754i<?>, Object, Unit> {
    public static final OnTimeout$selectClause$1 INSTANCE = new OnTimeout$selectClause$1();

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(OnTimeout onTimeout, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        invoke2(onTimeout, interfaceC41754i, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OnTimeout onTimeout, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        onTimeout.m91266d(interfaceC41754i, obj);
    }

    public OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }
}
