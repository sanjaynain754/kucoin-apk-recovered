package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.BuilderInference;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.InlineMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0087\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0089\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0004\b\t\u0010\u000e\u001a\u0087\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0098\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0002\b\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u009f\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u001b\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0015¢\u0006\u0004\b\u001d\u0010\u001e\u001a¹\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0010\"\u0004\b\u0003\u0010\u001b\"\u0004\b\u0004\u0010\u001f\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0!¢\u0006\u0004\b\"\u0010#\u001a#\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&0%\"\u0004\b\u0000\u0010$H\u0002¢\u0006\u0004\b'\u0010(\u001ag\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0004\b*\u0010\u000e¨\u0006+"}, m90084d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/flow/e;", "flow", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "Lkotlin/coroutines/Continuation;", "", ViewProps.TRANSFORM, "g", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;", "flow2", "T3", "flow3", "Lkotlin/Function4;", "c", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function5;", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/ExtensionFunctionType;", "f", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;", "T4", "flow4", "d", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;", "T5", "flow5", "Lkotlin/Function6;", "e", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/flow/e;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lkotlin/jvm/functions/Function0;", "other", "i", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n268#1,3:330\n268#1,3:333\n257#1:336\n259#1:338\n268#1,3:339\n257#1:342\n259#1:344\n268#1,3:345\n257#1:348\n259#1:350\n268#1,3:351\n105#2:329\n105#2:337\n105#2:343\n105#2:349\n105#2:354\n105#2:355\n105#2:360\n37#3:356\n36#3,3:357\n37#3:361\n36#3,3:362\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n71#1:330,3\n99#1:333,3\n115#1:336\n115#1:338\n134#1:339,3\n152#1:342\n152#1:344\n173#1:345,3\n193#1:348\n193#1:350\n216#1:351,3\n28#1:329\n115#1:337\n152#1:343\n193#1:349\n233#1:354\n257#1:355\n284#1:360\n283#1:356\n283#1:357,3\n302#1:361\n302#1:362,3\n*E\n"})
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$a */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"kotlinx/coroutines/flow/FlowKt__ZipKt$a", "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/f;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n29#2,2:109\n*E\n"})
    public static final class C41618a<R> implements InterfaceC41634e<R> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41634e f91617b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC41634e f91618c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function3 f91619d;

        public C41618a(InterfaceC41634e interfaceC41634e, InterfaceC41634e interfaceC41634e2, Function3 function3) {
            this.f91617b = interfaceC41634e;
            this.f91618c = interfaceC41634e2;
            this.f91619d = function3;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41634e
        public Object collect(InterfaceC41635f<? super R> interfaceC41635f, Continuation<? super Unit> continuation) {
            Object objM90958a = CombineKt.m90958a(interfaceC41635f, new InterfaceC41634e[]{this.f91617b, this.f91618c}, FlowKt__ZipKt.m90816h(), new FlowKt__ZipKt$combine$1$1(this.f91619d, null), continuation);
            return objM90958a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90958a : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$b */
    /* JADX INFO: compiled from: Zip.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class C41619b implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final C41619b f91620b = new C41619b();

        @Override // p852kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T1, T2, T3, R> InterfaceC41634e<R> m90811c(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull InterfaceC41634e<? extends T3> interfaceC41634e3, @BuilderInference @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        final InterfaceC41634e[] interfaceC41634eArr = {interfaceC41634e, interfaceC41634e2, interfaceC41634e3};
        return new InterfaceC41634e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2 */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Lkotlin/Array;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
            @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", m90122f = "Zip.kt", m90123i = {}, m90124l = {259, 258}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n116#2,5:259\n*E\n"})
            public static final class C416202 extends SuspendLambda implements Function3<InterfaceC41635f<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function4 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C416202(Continuation continuation, Function4 function4) {
                    super(3, continuation);
                    this.$transform$inlined = function4;
                }

                @Override // p852kotlin.jvm.functions.Function3
                public final Object invoke(InterfaceC41635f<? super R> interfaceC41635f, Object[] objArr, Continuation<? super Unit> continuation) {
                    C416202 c416202 = new C416202(continuation, this.$transform$inlined);
                    c416202.L$0 = interfaceC41635f;
                    c416202.L$1 = objArr;
                    return c416202.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L15;
                 */
                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    InterfaceC41635f interfaceC41635f;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC41635f = (InterfaceC41635f) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    interfaceC41635f = (InterfaceC41635f) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Function4 function4 = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.L$0 = interfaceC41635f;
                    this.label = 1;
                    InlineMarker.mark(6);
                    obj = function4.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                    this.L$0 = null;
                    this.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
                Object objM90958a = CombineKt.m90958a(interfaceC41635f, interfaceC41634eArr, FlowKt__ZipKt.m90816h(), new C416202(null, function4), continuation);
                return objM90958a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90958a : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T1, T2, T3, T4, R> InterfaceC41634e<R> m90812d(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull InterfaceC41634e<? extends T3> interfaceC41634e3, @NotNull InterfaceC41634e<? extends T4> interfaceC41634e4, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        final InterfaceC41634e[] interfaceC41634eArr = {interfaceC41634e, interfaceC41634e2, interfaceC41634e3, interfaceC41634e4};
        return new InterfaceC41634e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Lkotlin/Array;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
            @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", m90122f = "Zip.kt", m90123i = {}, m90124l = {259, 258}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n153#2,6:259\n*E\n"})
            public static final class C416212 extends SuspendLambda implements Function3<InterfaceC41635f<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function5 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C416212(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.$transform$inlined = function5;
                }

                @Override // p852kotlin.jvm.functions.Function3
                public final Object invoke(InterfaceC41635f<? super R> interfaceC41635f, Object[] objArr, Continuation<? super Unit> continuation) {
                    C416212 c416212 = new C416212(continuation, this.$transform$inlined);
                    c416212.L$0 = interfaceC41635f;
                    c416212.L$1 = objArr;
                    return c416212.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
                
                    if (r1.emit(r11, r10) == r0) goto L15;
                 */
                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    InterfaceC41635f interfaceC41635f;
                    C416212 c416212;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC41635f = (InterfaceC41635f) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            c416212 = this;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    interfaceC41635f = (InterfaceC41635f) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Function5 function5 = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.L$0 = interfaceC41635f;
                    this.label = 1;
                    InlineMarker.mark(6);
                    c416212 = this;
                    obj = function5.invoke(obj2, obj3, obj4, obj5, c416212);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                    c416212.L$0 = null;
                    c416212.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
                Object objM90958a = CombineKt.m90958a(interfaceC41635f, interfaceC41634eArr, FlowKt__ZipKt.m90816h(), new C416212(null, function5), continuation);
                return objM90958a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90958a : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T1, T2, T3, T4, T5, R> InterfaceC41634e<R> m90813e(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull InterfaceC41634e<? extends T3> interfaceC41634e3, @NotNull InterfaceC41634e<? extends T4> interfaceC41634e4, @NotNull InterfaceC41634e<? extends T5> interfaceC41634e5, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        final InterfaceC41634e[] interfaceC41634eArr = {interfaceC41634e, interfaceC41634e2, interfaceC41634e3, interfaceC41634e4, interfaceC41634e5};
        return new InterfaceC41634e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 */
            /* JADX INFO: compiled from: Zip.kt */
            @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m90084d2 = {"R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/f;", "", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Lkotlin/Array;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
            @DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m90122f = "Zip.kt", m90123i = {}, m90124l = {259, 258}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n194#2,7:259\n*E\n"})
            public static final class C416222 extends SuspendLambda implements Function3<InterfaceC41635f<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function6 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C416222(Continuation continuation, Function6 function6) {
                    super(3, continuation);
                    this.$transform$inlined = function6;
                }

                @Override // p852kotlin.jvm.functions.Function3
                public final Object invoke(InterfaceC41635f<? super R> interfaceC41635f, Object[] objArr, Continuation<? super Unit> continuation) {
                    C416222 c416222 = new C416222(continuation, this.$transform$inlined);
                    c416222.L$0 = interfaceC41635f;
                    c416222.L$1 = objArr;
                    return c416222.invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
                
                    if (r1.emit(r12, r11) == r0) goto L15;
                 */
                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    InterfaceC41635f interfaceC41635f;
                    C416222 c416222;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.label;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            interfaceC41635f = (InterfaceC41635f) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            c416222 = this;
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    interfaceC41635f = (InterfaceC41635f) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    Function6 function6 = this.$transform$inlined;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.L$0 = interfaceC41635f;
                    this.label = 1;
                    InlineMarker.mark(6);
                    c416222 = this;
                    obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, c416222);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                    c416222.L$0 = null;
                    c416222.label = 2;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f interfaceC41635f, Continuation continuation) {
                Object objM90958a = CombineKt.m90958a(interfaceC41635f, interfaceC41634eArr, FlowKt__ZipKt.m90816h(), new C416222(null, function6), continuation);
                return objM90958a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM90958a : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T1, T2, T3, R> InterfaceC41634e<R> m90814f(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull InterfaceC41634e<? extends T3> interfaceC41634e3, @BuilderInference @NotNull Function5<? super InterfaceC41635f<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return C41636g.m90887K(new C41623xd7c321e8(new InterfaceC41634e[]{interfaceC41634e, interfaceC41634e2, interfaceC41634e3}, null, function5));
    }

    @JvmName(name = "flowCombine")
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T1, T2, R> InterfaceC41634e<R> m90815g(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new C41618a(interfaceC41634e, interfaceC41634e2, function3);
    }

    /* JADX INFO: renamed from: h */
    public static final <T> Function0<T[]> m90816h() {
        return C41619b.f91620b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T1, T2, R> InterfaceC41634e<R> m90810b(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return C41636g.m90888L(interfaceC41634e, interfaceC41634e2, function3);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final <T1, T2, R> InterfaceC41634e<R> m90817i(@NotNull InterfaceC41634e<? extends T1> interfaceC41634e, @NotNull InterfaceC41634e<? extends T2> interfaceC41634e2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return CombineKt.m90959b(interfaceC41634e, interfaceC41634e2, function3);
    }
}
