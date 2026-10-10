package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import og0.C43047b0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001aq\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\u0013\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a`\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/flow/e;", "b", "(Ljava/lang/Iterable;)Lkotlinx/coroutines/flow/e;", "", "flows", "c", "([Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;", "R", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", ViewProps.TRANSFORM, "d", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "", "I", "getDEFAULT_CONCURRENCY", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
public final /* synthetic */ class FlowKt__MergeKt {

    /* JADX INFO: renamed from: a */
    public static final int f91590a = C43047b0.m94539b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T, R> InterfaceC41634e<R> m90786a(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return C41636g.m90930n0(interfaceC41634e, new FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90787b(@NotNull Iterable<? extends InterfaceC41634e<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T, R> InterfaceC41634e<R> m90789d(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @BuilderInference @NotNull Function3<? super InterfaceC41635f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new ChannelFlowTransformLatest(function3, interfaceC41634e, null, 0, null, 28, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC41634e<T> m90788c(@NotNull InterfaceC41634e<? extends T>... interfaceC41634eArr) {
        return C41636g.m90893Q(ArraysKt.asIterable(interfaceC41634eArr));
    }
}
