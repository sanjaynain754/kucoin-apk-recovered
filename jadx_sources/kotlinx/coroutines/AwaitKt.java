package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a<\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@¢\u0006\u0004\b\f\u0010\t¨\u0006\r"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/r0;", "deferreds", "", "b", "([Lkotlinx/coroutines/r0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/x1;", "", "c", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n37#2:122\n36#2,3:123\n13402#3,2:126\n1863#4,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n36#1:122\n36#1:123,3\n47#1:126,2\n58#1:128,2\n*E\n"})
public final class AwaitKt {
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90346b(@NotNull InterfaceC41729r0<? extends T>[] interfaceC41729r0Arr, @NotNull Continuation<? super List<? extends T>> continuation) {
        return interfaceC41729r0Arr.length == 0 ? CollectionsKt.emptyList() : new C41583e(interfaceC41729r0Arr).m90720c(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m90347c(@NotNull Collection<? extends InterfaceC41775x1> collection, @NotNull Continuation<? super Unit> continuation) {
        AwaitKt$joinAll$3 awaitKt$joinAll$3;
        Iterator it;
        if (continuation instanceof AwaitKt$joinAll$3) {
            awaitKt$joinAll$3 = (AwaitKt$joinAll$3) continuation;
            int i11 = awaitKt$joinAll$3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$3.label = i11 - Integer.MIN_VALUE;
            } else {
                awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
            }
        } else {
            awaitKt$joinAll$3 = new AwaitKt$joinAll$3(continuation);
        }
        Object obj = awaitKt$joinAll$3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = awaitKt$joinAll$3.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            it = collection.iterator();
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) awaitKt$joinAll$3.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) it.next();
            awaitKt$joinAll$3.L$0 = it;
            awaitKt$joinAll$3.label = 1;
            if (interfaceC41775x1.mo90385E(awaitKt$joinAll$3) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m90345a(@NotNull Collection<? extends InterfaceC41729r0<? extends T>> collection, @NotNull Continuation<? super List<? extends T>> continuation) {
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        return new C41583e((InterfaceC41729r0[]) collection.toArray(new InterfaceC41729r0[0])).m90720c(continuation);
    }
}
