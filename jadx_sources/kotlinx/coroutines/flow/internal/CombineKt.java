package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@¢\u0006\u0004\b\u000e\u0010\u000f\u001am\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016¨\u0006\u0018"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "Lkotlinx/coroutines/flow/e;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", ViewProps.TRANSFORM, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/f;[Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
public final class CombineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/internal/CombineKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,108:1\n84#2:109\n139#2:110\n*E\n"})
    public static final class C41641a<R> implements InterfaceC41634e<R> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41634e f91671b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41634e f91672c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function3 f91673d;

        public C41641a(InterfaceC41634e interfaceC41634e, InterfaceC41634e interfaceC41634e2, Function3 function3) {
            this.f91671b = interfaceC41634e;
            this.f91672c = interfaceC41634e2;
            this.f91673d = function3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objM91130f = C41713n0.m91130f(new CombineKt$zipImpl$1$1(this.f91671b, this.f91672c, interfaceC41635f, this.f91673d, null), continuation);
            return objM91130f == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91130f : Unit.INSTANCE;
        }
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R, T> Object m90958a(@NotNull InterfaceC41635f<? super R> interfaceC41635f, @NotNull InterfaceC41634e<? extends T>[] interfaceC41634eArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super InterfaceC41635f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objM90961a = FlowCoroutineKt.m90961a(new CombineKt$combineInternal$2(interfaceC41634eArr, function0, function3, interfaceC41635f, null), continuation);
        return objM90961a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90961a : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T1, T2, R> InterfaceC41634e<R> m90959b(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new C41641a(interfaceC41634e2, interfaceC41634e, function3);
    }
}
