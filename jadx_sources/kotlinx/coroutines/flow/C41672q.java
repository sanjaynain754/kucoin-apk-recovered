package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.q */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR;\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lkotlinx/coroutines/flow/q;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/AbstractFlow;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "collector", "f", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41672q<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> block;

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo90740f(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull Continuation<? super Unit> continuation) {
        Object objInvoke = this.block.invoke(interfaceC41635f, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41672q(@NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.block = function2;
    }
}
