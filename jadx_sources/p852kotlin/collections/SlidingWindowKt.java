package p852kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequenceScope;
import p852kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001aH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\r\"\u0004\b\u0000\u0010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000f"}, m90084d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedSequence", "Lkotlin/sequences/Sequence;", "", ExifInterface.GPS_DIRECTION_TRUE, "partialWindows", "", "reuseBuffer", "windowedIterator", "", "iterator", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1 */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    /* JADX INFO: loaded from: classes61.dex */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/sequences/SequenceScope;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m90122f = "SlidingWindow.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, m90124l = {34, 40, 49, 55, 58}, m90125m = "invokeSuspend", m90126n = {"$this$iterator", "buffer", "e", "bufferInitialCapacity", ViewProps.GAP, "skip", "$this$iterator", "buffer", "bufferInitialCapacity", ViewProps.GAP, "skip", "$this$iterator", "buffer", "e", "bufferInitialCapacity", ViewProps.GAP, "$this$iterator", "buffer", "bufferInitialCapacity", ViewProps.GAP, "$this$iterator", "buffer", "bufferInitialCapacity", ViewProps.GAP}, m90127s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
    public static final class C411091<T> extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C411091(int i11, int i12, Iterator<? extends T> it, boolean z11, boolean z12, Continuation<? super C411091> continuation) {
            super(2, continuation);
            this.$size = i11;
            this.$step = i12;
            this.$iterator = it;
            this.$reuseBuffer = z11;
            this.$partialWindows = z12;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C411091 c411091 = new C411091(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
            c411091.L$0 = obj;
            return c411091;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C411091) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:66:0x015a  */
        /* JADX WARN: Code duplicated, block: B:68:0x015e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0160  */
        /* JADX WARN: Code duplicated, block: B:74:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0186  */
        /* JADX WARN: Code duplicated, block: B:88:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x008e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x008b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x007f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:17:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:60:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:73:0x017a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p852kotlin.collections.SlidingWindowKt.C411091.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void checkWindowSizeStep(int i11, int i12) {
        String str;
        if (i11 <= 0 || i12 <= 0) {
            if (i11 != i12) {
                str = "Both size " + i11 + " and step " + i12 + " must be greater than zero.";
            } else {
                str = "size " + i11 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> windowedIterator(@NotNull Iterator<? extends T> iterator, int i11, int i12, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? EmptyIterator.INSTANCE : SequencesKt.iterator(new C411091(i11, i12, iterator, z12, z11, null));
    }

    @NotNull
    public static final <T> Sequence<List<T>> windowedSequence(@NotNull final Sequence<? extends T> sequence, final int i11, final int i12, final boolean z11, final boolean z12) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        checkWindowSizeStep(i11, i12);
        return new Sequence<List<? extends T>>() { // from class: kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            @Override // p852kotlin.sequences.Sequence
            public Iterator<List<? extends T>> iterator() {
                return SlidingWindowKt.windowedIterator(sequence.iterator(), i11, i12, z11, z12);
            }
        };
    }
}
