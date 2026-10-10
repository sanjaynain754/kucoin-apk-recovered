package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.internal.C41657k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Collect.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aS\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000021\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/coroutines/flow/e;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "scope", "Lkotlinx/coroutines/x1;", "d", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/x1;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "b", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/f;", "flow", "c", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__CollectKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m90755a(@NotNull InterfaceC41634e<?> interfaceC41634e, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = interfaceC41634e.collect(C41657k.f91699b, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41775x1 m90758d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 interfaceC41709m0) {
        return C41696j.m91104d(interfaceC41709m0, null, null, new FlowKt__CollectKt$launchIn$1(interfaceC41634e, null), 3, null);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m90756b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objM90923k = C41636g.m90923k(C41637h.m90945b(C41636g.m90892P(interfaceC41634e, function2), 0, null, 2, null), continuation);
        if (objM90923k == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM90923k;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90757c(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Continuation<? super Unit> continuation) {
        C41636g.m90880D(interfaceC41635f);
        Object objCollect = interfaceC41634e.collect(interfaceC41635f, continuation);
        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objCollect;
        }
        return Unit.INSTANCE;
    }
}
