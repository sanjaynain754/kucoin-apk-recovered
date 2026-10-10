package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Collection.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "", FirebaseAnalytics.Param.DESTINATION, "", "b", "(Lkotlinx/coroutines/flow/e;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "C", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectionKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectionKt$a */
    /* JADX INFO: compiled from: Collection.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41596a<T> implements InterfaceC41635f {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Collection f91559b;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C41596a(Collection collection) {
            this.f91559b = collection;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        public final Object emit(T t11, Continuation<? super Unit> continuation) {
            this.f91559b.add(t11);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T, C extends Collection<? super T>> Object m90759a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull C c11, @NotNull Continuation<? super C> continuation) {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        if (continuation instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) continuation;
            int i11 = flowKt__CollectionKt$toCollection$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuation);
            }
        } else {
            flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuation);
        }
        Object obj = flowKt__CollectionKt$toCollection$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__CollectionKt$toCollection$1.label;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) flowKt__CollectionKt$toCollection$1.L$0;
            ResultKt.throwOnFailure(obj);
            return collection;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41635f<? super Object> c41596a = new C41596a<>(c11);
        flowKt__CollectionKt$toCollection$1.L$0 = c11;
        flowKt__CollectionKt$toCollection$1.label = 1;
        return interfaceC41634e.collect(c41596a, flowKt__CollectionKt$toCollection$1) == coroutine_suspended ? coroutine_suspended : c11;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m90761c(InterfaceC41634e interfaceC41634e, List list, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = new ArrayList();
        }
        return C41636g.m90926l0(interfaceC41634e, list, continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90760b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull List<T> list, @NotNull Continuation<? super List<? extends T>> continuation) {
        return C41636g.m90924k0(interfaceC41634e, list, continuation);
    }
}
