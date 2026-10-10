package p852kotlin.sequences;

import androidx.exifinterface.media.ExifInterface;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.RestrictsSuspension;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "1.3")
@RestrictsSuspension
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦@¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦@¢\u0006\u0002\u0010\fJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u001c\u0010\t\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lkotlin/sequences/SequenceScope;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "yield", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "iterator", "", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "elements", "", "(Ljava/lang/Iterable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", JPushConstants.Operation.KEY_SEQUENCE, "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SequenceScope<T> {
    @Nullable
    public abstract Object yield(T t11, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public final Object yieldAll(@NotNull Iterable<? extends T> iterable, @NotNull Continuation<? super Unit> continuation) {
        Object objYieldAll;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objYieldAll = yieldAll(iterable.iterator(), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objYieldAll : Unit.INSTANCE;
    }

    @Nullable
    public abstract Object yieldAll(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public final Object yieldAll(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        Object objYieldAll = yieldAll(sequence.iterator(), continuation);
        return objYieldAll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objYieldAll : Unit.INSTANCE;
    }
}
