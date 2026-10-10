package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.InterfaceC41565d;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001aR\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010%\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f¢\u0006\u0002\b$¢\u0006\u0004\b&\u0010'¨\u0006("}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/m0;", "scope", "Lkotlinx/coroutines/flow/SharingStarted;", "started", "", "replay", "Lkotlinx/coroutines/flow/r;", "f", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;I)Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/u;", "c", "(Lkotlinx/coroutines/flow/e;I)Lkotlinx/coroutines/flow/u;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lkotlinx/coroutines/flow/m;", "shared", "initialValue", "Lkotlinx/coroutines/x1;", "d", "(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/m;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/x1;", "Lkotlinx/coroutines/flow/w;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlinx/coroutines/flow/m;)Lkotlinx/coroutines/flow/r;", "Lkotlinx/coroutines/flow/n;", "b", "(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Lkotlinx/coroutines/flow/r;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/r;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
public final /* synthetic */ class FlowKt__ShareKt {
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC41678w<T> m90803h(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull SharingStarted sharingStarted, T t11) {
        C41676u c41676uM90798c = m90798c(interfaceC41634e, 1);
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(t11);
        return new C41671p(interfaceC41669nM91009a, m90799d(interfaceC41709m0, c41676uM90798c.context, c41676uM90798c.upstream, interfaceC41669nM91009a, sharingStarted, t11));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41673r<T> m90796a(@NotNull InterfaceC41668m<T> interfaceC41668m) {
        return new C41670o(interfaceC41668m, null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41678w<T> m90797b(@NotNull InterfaceC41669n<T> interfaceC41669n) {
        return new C41671p(interfaceC41669n, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX INFO: renamed from: c */
    public static final <T> C41676u<T> m90798c(InterfaceC41634e<? extends T> interfaceC41634e, int i11) {
        ChannelFlow channelFlow;
        InterfaceC41634e<T> interfaceC41634eMo90873j;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i11, InterfaceC41565d.INSTANCE.m90687a()) - i11;
        if (!(interfaceC41634e instanceof ChannelFlow) || (interfaceC41634eMo90873j = (channelFlow = (ChannelFlow) interfaceC41634e).mo90873j()) == null) {
            return new C41676u<>(interfaceC41634e, iCoerceAtLeast, BufferOverflow.SUSPEND, EmptyCoroutineContext.INSTANCE);
        }
        int i12 = channelFlow.capacity;
        if (i12 != -3 && i12 != -2 && i12 != 0) {
            iCoerceAtLeast = i12;
        } else if (channelFlow.onBufferOverflow == BufferOverflow.SUSPEND) {
            if (i12 == 0) {
                iCoerceAtLeast = 0;
            }
        } else if (i11 == 0) {
            iCoerceAtLeast = 1;
        } else {
            iCoerceAtLeast = 0;
        }
        return new C41676u<>(interfaceC41634eMo90873j, iCoerceAtLeast, channelFlow.onBufferOverflow, channelFlow.context);
    }

    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41775x1 m90799d(InterfaceC41709m0 interfaceC41709m0, CoroutineContext coroutineContext, InterfaceC41634e<? extends T> interfaceC41634e, InterfaceC41668m<T> interfaceC41668m, SharingStarted sharingStarted, T t11) {
        return C41686h.m91045c(interfaceC41709m0, coroutineContext, Intrinsics.areEqual(sharingStarted, SharingStarted.INSTANCE.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, interfaceC41634e, interfaceC41668m, t11, null));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41673r<T> m90800e(@NotNull InterfaceC41673r<? extends T> interfaceC41673r, @NotNull Function2<? super InterfaceC41635f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SubscribedSharedFlow(interfaceC41673r, function2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC41673r m90802g(InterfaceC41634e interfaceC41634e, InterfaceC41709m0 interfaceC41709m0, SharingStarted sharingStarted, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return C41636g.m90910d0(interfaceC41634e, interfaceC41709m0, sharingStarted, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41673r<T> m90801f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 interfaceC41709m0, @NotNull SharingStarted sharingStarted, int i11) {
        C41676u c41676uM90798c = m90798c(interfaceC41634e, i11);
        InterfaceC41668m interfaceC41668mM91000a = C41674s.m91000a(i11, c41676uM90798c.extraBufferCapacity, c41676uM90798c.onBufferOverflow);
        return new C41670o(interfaceC41668mM91000a, m90799d(interfaceC41709m0, c41676uM90798c.context, c41676uM90798c.upstream, interfaceC41668mM91000a, sharingStarted, C41674s.f91714a));
    }
}
