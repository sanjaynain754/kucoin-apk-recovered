package kotlinx.coroutines.channels;

import kotlinx.coroutines.selects.InterfaceC41754i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class BufferedChannel$onReceive$1 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, InterfaceC41754i<?>, Object, Unit> {
    public static final BufferedChannel$onReceive$1 INSTANCE = new BufferedChannel$onReceive$1();

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BufferedChannel<?> bufferedChannel, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        invoke2(bufferedChannel, interfaceC41754i, obj);
        return Unit.INSTANCE;
    }

    public BufferedChannel$onReceive$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BufferedChannel<?> bufferedChannel, InterfaceC41754i<?> interfaceC41754i, Object obj) {
        bufferedChannel.m90589b1(interfaceC41754i, obj);
    }
}
