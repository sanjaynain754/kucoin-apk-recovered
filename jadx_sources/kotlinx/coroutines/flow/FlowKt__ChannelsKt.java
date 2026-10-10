package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.AppsFlyerProperties;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.C41570i;
import kotlinx.coroutines.channels.InterfaceC41567f;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.flow.internal.C41650d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\r\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/channels/o;", AppsFlyerProperties.CHANNEL, "", "c", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/channels/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "consume", "d", "(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/channels/o;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/e;", "f", "(Lkotlinx/coroutines/channels/o;)Lkotlinx/coroutines/flow/e;", "b", "Lkotlinx/coroutines/m0;", "scope", "e", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;)Lkotlinx/coroutines/channels/o;", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ChannelsKt {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m90751c(@NotNull InterfaceC41635f<? super T> interfaceC41635f, @NotNull InterfaceC41576o<? extends T> interfaceC41576o, @NotNull Continuation<? super Unit> continuation) {
        Object objM90752d = m90752d(interfaceC41635f, interfaceC41576o, true, continuation);
        return objM90752d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90752d : Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90750b(@NotNull InterfaceC41576o<? extends T> interfaceC41576o) {
        return new C41631b(interfaceC41576o, true, null, 0, null, 28, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m90752d(InterfaceC41635f<? super T> interfaceC41635f, InterfaceC41576o<? extends T> interfaceC41576o, boolean z11, Continuation<? super Unit> continuation) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        InterfaceC41567f<? extends T> it;
        InterfaceC41567f<? extends T> interfaceC41567f;
        InterfaceC41635f<? super T> interfaceC41635f2;
        Object objMo90631a;
        if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
            flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
            int i11 = flowKt__ChannelsKt$emitAllImpl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__ChannelsKt$emitAllImpl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
            }
        } else {
            flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        }
        Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__ChannelsKt$emitAllImpl$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                C41636g.m90880D(interfaceC41635f);
                it = interfaceC41576o.iterator();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC41635f;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC41576o;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z11;
                flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                objMo90631a = it.mo90631a(flowKt__ChannelsKt$emitAllImpl$1);
                if (objMo90631a == coroutine_suspended) {
                    interfaceC41635f2 = interfaceC41635f;
                    interfaceC41567f = it;
                    obj = objMo90631a;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z11) {
                            C41570i.m90706a(interfaceC41576o, null);
                        }
                        return Unit.INSTANCE;
                    }
                    T next = interfaceC41567f.next();
                    flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC41635f2;
                    flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC41576o;
                    flowKt__ChannelsKt$emitAllImpl$1.L$2 = interfaceC41567f;
                    flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z11;
                    flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                z11 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                interfaceC41567f = (InterfaceC41567f) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                interfaceC41576o = (InterfaceC41576o) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                interfaceC41635f2 = (InterfaceC41635f) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z11) {
                        C41570i.m90706a(interfaceC41576o, null);
                    }
                    return Unit.INSTANCE;
                }
                T next2 = interfaceC41567f.next();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC41635f2;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC41576o;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = interfaceC41567f;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z11;
                flowKt__ChannelsKt$emitAllImpl$1.label = 2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                interfaceC41567f = (InterfaceC41567f) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                interfaceC41576o = (InterfaceC41576o) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                interfaceC41635f2 = (InterfaceC41635f) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            it = interfaceC41567f;
            interfaceC41635f = interfaceC41635f2;
            flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC41635f;
            flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC41576o;
            flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
            flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z11;
            flowKt__ChannelsKt$emitAllImpl$1.label = 1;
            objMo90631a = it.mo90631a(flowKt__ChannelsKt$emitAllImpl$1);
            if (objMo90631a == coroutine_suspended) {
                interfaceC41635f2 = interfaceC41635f;
                interfaceC41567f = it;
                obj = objMo90631a;
                if (!((Boolean) obj).booleanValue()) {
                    if (z11) {
                        C41570i.m90706a(interfaceC41576o, null);
                    }
                    return Unit.INSTANCE;
                }
                T next3 = interfaceC41567f.next();
                flowKt__ChannelsKt$emitAllImpl$1.L$0 = interfaceC41635f2;
                flowKt__ChannelsKt$emitAllImpl$1.L$1 = interfaceC41576o;
                flowKt__ChannelsKt$emitAllImpl$1.L$2 = interfaceC41567f;
                flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z11;
                flowKt__ChannelsKt$emitAllImpl$1.label = 2;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z11) {
                    C41570i.m90706a(interfaceC41576o, th2);
                }
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41634e<T> m90754f(@NotNull InterfaceC41576o<? extends T> interfaceC41576o) {
        return new C41631b(interfaceC41576o, false, null, 0, null, 28, null);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41576o<T> m90753e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull InterfaceC41709m0 interfaceC41709m0) {
        return C41650d.m90979b(interfaceC41634e).mo90874m(interfaceC41709m0);
    }
}
