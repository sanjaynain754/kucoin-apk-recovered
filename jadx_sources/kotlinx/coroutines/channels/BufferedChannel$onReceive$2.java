package kotlinx.coroutines.channels;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements Function3<BufferedChannel<?>, Object, Object, Object> {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2();

    public BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        return bufferedChannel.m90578V0(obj, obj2);
    }
}
