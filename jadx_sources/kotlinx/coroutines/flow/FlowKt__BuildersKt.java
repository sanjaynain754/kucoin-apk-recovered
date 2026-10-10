package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.channels.InterfaceC41574m;
import org.jetbrains.annotations.NotNull;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aJ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0014\u0010\n\u001aJ\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0015\u0010\n¨\u0006\u0016"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/flow/e;", "e", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/e;", "value", "f", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;", "d", "()Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/channels/m;", "c", "b", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n132#2,2:109\n*E\n"})
    public static final class C41594a<T> implements InterfaceC41634e<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f91557b;

        public C41594a(Object obj) {
            this.f91557b = obj;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objEmit = interfaceC41635f.emit((Object) this.f91557b, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41634e<T> m90743a(@NotNull Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90744b(@BuilderInference @NotNull Function2<? super InterfaceC41574m<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new CallbackFlowBuilder(function2, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC41634e<T> m90745c(@BuilderInference @NotNull Function2<? super InterfaceC41574m<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C41632c(function2, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41634e<T> m90746d() {
        return C41633d.f91659b;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90747e(@BuilderInference @NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C41672q(function2);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41634e<T> m90748f(T t11) {
        return new C41594a(t11);
    }
}
