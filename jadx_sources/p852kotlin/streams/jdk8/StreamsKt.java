package p852kotlin.streams.jdk8;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Streams.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\b0\u0001*\u00020\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\tH\u0007¨\u0006\r"}, m90084d2 = {"asSequence", "Lkotlin/sequences/Sequence;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/stream/Stream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "", "Ljava/util/stream/DoubleStream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, m90085k = 2, m90086mv = {2, 2, 0}, m90087pn = "kotlin.streams", m90088xi = 48)
@JvmName(name = "StreamsKt")
public final class StreamsKt {
    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Sequence<T> asSequence(@NotNull final Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        return new Sequence<T>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            @Override // p852kotlin.sequences.Sequence
            public Iterator<T> iterator() {
                Iterator<T> it = stream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> List<T> toList(@NotNull Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "<this>");
        Object objCollect = stream.collect(Collectors.toList());
        Intrinsics.checkNotNullExpressionValue(objCollect, "collect(...)");
        return (List) objCollect;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Integer> asSequence(@NotNull final IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        return new Sequence<Integer>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            @Override // p852kotlin.sequences.Sequence
            public Iterator<Integer> iterator() {
                Iterator<Integer> it = intStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final <T> Stream<T> asStream(@NotNull final Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                return StreamsKt.asStream$lambda$4(sequence);
            }
        }, 16, false);
        Intrinsics.checkNotNullExpressionValue(stream, "stream(...)");
        return stream;
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Integer> toList(@NotNull IntStream intStream) {
        Intrinsics.checkNotNullParameter(intStream, "<this>");
        int[] array = intStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Long> asSequence(@NotNull final LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        return new Sequence<Long>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            @Override // p852kotlin.sequences.Sequence
            public Iterator<Long> iterator() {
                Iterator<Long> it = longStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator asStream$lambda$4(Sequence sequence) {
        return Spliterators.spliteratorUnknownSize(sequence.iterator(), 16);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Long> toList(@NotNull LongStream longStream) {
        Intrinsics.checkNotNullParameter(longStream, "<this>");
        long[] array = longStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final Sequence<Double> asSequence(@NotNull final DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        return new Sequence<Double>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            @Override // p852kotlin.sequences.Sequence
            public Iterator<Double> iterator() {
                Iterator<Double> it = doubleStream.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                return it;
            }
        };
    }

    @SinceKotlin(version = "1.2")
    @NotNull
    public static final List<Double> toList(@NotNull DoubleStream doubleStream) {
        Intrinsics.checkNotNullParameter(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return ArraysKt.asList(array);
    }
}
