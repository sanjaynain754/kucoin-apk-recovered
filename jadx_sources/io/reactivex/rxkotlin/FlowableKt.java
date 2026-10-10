package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TypeCastException;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.FunctionReference;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.markers.KMappedMarker;
import p852kotlin.ranges.IntProgression;
import p852kotlin.reflect.KDeclarationContainer;
import p852kotlin.sequences.Sequence;
import p852kotlin.sequences.SequencesKt;
import sh0.InterfaceC44416b;

/* JADX INFO: compiled from: flowable.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000Ç\u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000*\u00019\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005H\u0007¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\u0003\u0010\r\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001*\u00020\u0011H\u0007¢\u0006\u0004\b\u0003\u0010\u0013\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001*\u00020\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0016\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0017H\u0007¢\u0006\u0004\b\u0003\u0010\u0019\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b\u0003\u0010\u001d\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u001eH\u0007¢\u0006\u0004\b\u0003\u0010\u001f\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0004\b\u0003\u0010!\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b\u0003\u0010#\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b\u0003\u0010%\u001a1\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b&\u0010#\u001a1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\"H\u0007¢\u0006\u0004\b'\u0010#\u001aP\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010*\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010$0)H\u0087\b¢\u0006\u0004\b+\u0010,\u001ae\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00101\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b¢\u0006\u0004\b2\u00103\u001ae\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\"2)\b\u0004\u00104\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000-¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0004\u0012\u00028\u00010)H\u0087\b¢\u0006\u0004\b5\u00103\u001a*\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b6\u00107\u001a*\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u001a*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¢\u0006\u0004\b8\u00107\u001a)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009\"\b\b\u0000\u0010\u001b*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000 H\u0002¢\u0006\u0004\b:\u0010;\u001aM\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007¢\u0006\u0004\b2\u0010>\u001ak\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020B0\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a\"\b\b\u0001\u0010(*\u00020\u001a\"\b\b\u0002\u0010?*\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007¢\u0006\u0004\b2\u0010C\u001aM\u0010E\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bE\u00107\u001aM\u0010F\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bF\u00107\u001aM\u0010G\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bG\u00107\u001a/\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007¢\u0006\u0004\bH\u00107\u001aÎ\u0001\u0010N\u001a\u0096\u0001\u0012D\u0012B\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D* \u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010M0L D*J\u0012D\u0012B\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D* \u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010M0L\u0018\u00010K0K\"\b\b\u0000\u0010I*\u00020\u001a\"\b\b\u0001\u0010J*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001H\u0007¢\u0006\u0004\bN\u0010O\u001a¿\u0002\u0010R\u001a\u0087\u0002\u0012|\u0012z\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P D*<\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P\u0018\u00010M0L D*\u0082\u0001\u0012|\u0012z\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P D*<\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0012(\u0012&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00018\u0001\u0018\u00010Q0P\u0018\u00010M0L\u0018\u00010K0K\"\b\b\u0000\u0010I*\u00020\u001a\"\b\b\u0001\u0010J*\u00020\u001a*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=0\u0001H\u0007¢\u0006\u0004\bR\u0010O\u001aM\u0010F\u001a&\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000 D*\u0012\u0012\f\u0012\n D*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u001b*\u00020\u001a*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S0\"H\u0007¢\u0006\u0004\bF\u0010#¨\u0006T"}, m90084d2 = {"", "Lio/reactivex/Flowable;", "", "toFlowable", "([Z)Lio/reactivex/Flowable;", "", "", "([B)Lio/reactivex/Flowable;", "", "", "([C)Lio/reactivex/Flowable;", "", "", "([S)Lio/reactivex/Flowable;", "", "", "([I)Lio/reactivex/Flowable;", "", "", "([J)Lio/reactivex/Flowable;", "", "", "([F)Lio/reactivex/Flowable;", "", "", "([D)Lio/reactivex/Flowable;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "Lkotlin/ranges/IntProgression;", "(Lkotlin/ranges/IntProgression;)Lio/reactivex/Flowable;", "", "(Ljava/util/Iterator;)Lio/reactivex/Flowable;", "", "(Ljava/lang/Iterable;)Lio/reactivex/Flowable;", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Lio/reactivex/Flowable;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", TtmlNode.TAG_BODY, "flatMapSequence", "(Lio/reactivex/Flowable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "", "Lkotlin/ParameterName;", "name", "args", "combineFunction", "combineLatest", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Flowable;", "zipFunction", "zip", "cast", "(Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "ofType", "io/reactivex/rxkotlin/FlowableKt$toIterable$1", "toIterable", "(Ljava/util/Iterator;)Lio/reactivex/rxkotlin/FlowableKt$toIterable$1;", "flowable", "Lkotlin/Pair;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "U", "flowable1", "flowable2", "Lkotlin/Triple;", "(Lio/reactivex/Flowable;Lio/reactivex/Flowable;Lio/reactivex/Flowable;)Lio/reactivex/Flowable;", "kotlin.jvm.PlatformType", "mergeAll", "concatAll", "switchLatest", "switchOnNext", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lio/reactivex/Single;", "", "", "toMap", "(Lio/reactivex/Flowable;)Lio/reactivex/Single;", "", "", "toMultimap", "Lsh0/b;", "rxkotlin"}, m90085k = 2, m90086mv = {1, 4, 0})
public final class FlowableKt {

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$2 */
    /* JADX INFO: compiled from: flowable.kt */
    @Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0015\u0010\u0005\u001a\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n¢\u0006\u0004\b\u000b\u0010\f"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m90085k = 3, m90086mv = {1, 1, 11})
    public static final class C392412<R, T> extends FunctionReference implements Function2<T, R, Pair<? extends T, ? extends R>> {
        public static final C392412 INSTANCE = new C392412();

        public C392412() {
            super(2);
        }

        @Override // p852kotlin.jvm.internal.CallableReference, p852kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // p852kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Pair.class);
        }

        @Override // p852kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // p852kotlin.jvm.functions.Function2
        @NotNull
        public final Pair<T, R> invoke(@NotNull T t11, @NotNull R r11) {
            return new Pair<>(t11, r11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T, U] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$combineLatest$3 */
    /* JADX INFO: compiled from: flowable.kt */
    @Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0004\b\u000e\u0010\u000f"}, m90084d2 = {"<anonymous>", "Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "R", "U", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "p3", "third", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m90085k = 3, m90086mv = {1, 1, 11})
    public static final class C392423<R, T, U> extends FunctionReference implements Function3<T, R, U, Triple<? extends T, ? extends R, ? extends U>> {
        public static final C392423 INSTANCE = new C392423();

        public C392423() {
            super(3);
        }

        @Override // p852kotlin.jvm.internal.CallableReference, p852kotlin.reflect.KCallable
        public final String getName() {
            return "<init>";
        }

        @Override // p852kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Triple.class);
        }

        @Override // p852kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        @Override // p852kotlin.jvm.functions.Function3
        @NotNull
        public final Triple<T, R, U> invoke(@NotNull T t11, @NotNull R r11, @NotNull U u11) {
            return new Triple<>(t11, r11, u11);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: io.reactivex.rxkotlin.FlowableKt$toIterable$1 */
    /* JADX INFO: compiled from: flowable.kt */
    @Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, m90084d2 = {"io/reactivex/rxkotlin/FlowableKt$toIterable$1", "", "iterator", "", "rxkotlin"}, m90085k = 1, m90086mv = {1, 1, 11})
    public static final class C392471<T> implements Iterable<T>, KMappedMarker {
        final /* synthetic */ Iterator receiver$0;

        public C392471(Iterator<? extends T> it) {
            this.receiver$0 = it;
        }

        @Override // java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return this.receiver$0;
        }
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    private static final <R> Flowable<R> cast(@NotNull Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "cast(R::class.java)");
        return flowable2;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> combineLatest(@NotNull Iterable<? extends Flowable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.combineLatest.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                Function1 function2 = function1;
                List listAsList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t11 : listAsList) {
                    if (t11 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t11);
                }
                return (R) function2.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return flowableCombineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Flowable<Flowable<T>> flowable) {
        return (Flowable<T>) flowable.concatMap(new Function<T, InterfaceC44416b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.concatAll.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<T> apply(@NotNull Flowable<T> flowable2) {
                return flowable2;
            }
        });
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    private static final <R> Flowable<R> ofType(@NotNull Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "ofType(R::class.java)");
        return flowable2;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Boolean> toFlowable(@NotNull boolean[] zArr) {
        return toFlowable(ArraysKt.asIterable(zArr));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(@NotNull Flowable<T> flowable, @NotNull Flowable<R> flowable2) {
        final C392412 c392412 = C392412.INSTANCE;
        Object obj = c392412;
        if (c392412 != null) {
            obj = new BiFunction() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_BiFunction$0
                @Override // io.reactivex.functions.BiFunction
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj2, @NonNull Object obj3) {
                    return c392412.invoke(obj2, obj3);
                }
            };
        }
        Flowable<Pair<T, R>> flowableCombineLatest = Flowable.combineLatest(flowable, flowable2, (BiFunction) obj);
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return flowableCombineLatest;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(@NotNull Iterable<? extends InterfaceC44416b<T>> iterable) {
        return Flowable.concat(iterable);
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> flatMapSequence(@NotNull Flowable<T> flowable, @NotNull final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Flowable<R> flowableFlatMap = flowable.flatMap(new Function<T, InterfaceC44416b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.flatMapSequence.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<R> apply(@NotNull T t11) {
                return FlowableKt.toFlowable((Sequence) function1.invoke(t11));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableFlatMap, "flatMap { body(it).toFlowable() }");
        return flowableFlatMap;
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAll(@NotNull Flowable<Flowable<T>> flowable) {
        return (Flowable<T>) flowable.flatMap(new Function<T, InterfaceC44416b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.mergeAll.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<T> apply(@NotNull Flowable<T> flowable2) {
                return flowable2;
            }
        });
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchLatest(@NotNull Flowable<Flowable<T>> flowable) {
        return (Flowable<T>) flowable.switchMap(new Function<T, InterfaceC44416b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt.switchLatest.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Flowable<T> apply(@NotNull Flowable<T> flowable2) {
                return flowable2;
            }
        });
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Byte> toFlowable(@NotNull byte[] bArr) {
        return toFlowable(ArraysKt.asIterable(bArr));
    }

    private static final <T> C392471 toIterable(@NotNull Iterator<? extends T> it) {
        return new C392471(it);
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(@NotNull Flowable<Pair<A, B>> flowable) {
        return (Single<Map<A, B>>) flowable.toMap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt.toMap.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt.toMap.2
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
    }

    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(@NotNull Flowable<Pair<A, B>> flowable) {
        return (Single<Map<A, Collection<B>>>) flowable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt.toMultimap.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt.toMultimap.2
            @Override // io.reactivex.functions.Function
            @NotNull
            public final Object apply(@NotNull Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> zip(@NotNull Iterable<? extends Flowable<T>> iterable, @NotNull final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> flowableZip = Flowable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt.zip.1
            @Override // io.reactivex.functions.Function
            @NotNull
            public final R apply(@NotNull Object[] objArr) {
                Function1 function2 = function1;
                List listAsList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listAsList, 10));
                for (T t11 : listAsList) {
                    if (t11 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t11);
                }
                return (R) function2.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowableZip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(@NotNull Flowable<T> flowable, @NotNull Flowable<R> flowable2, @NotNull Flowable<U> flowable3) {
        final C392423 c392423 = C392423.INSTANCE;
        Object obj = c392423;
        if (c392423 != null) {
            obj = new io.reactivex.functions.Function3() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_Function3$0
                @Override // io.reactivex.functions.Function3
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj2, @NonNull Object obj3, @NonNull Object obj4) {
                    return c392423.invoke(obj2, obj3, obj4);
                }
            };
        }
        Flowable<Triple<T, R, U>> flowableCombineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, (io.reactivex.functions.Function3) obj);
        Intrinsics.checkExpressionValueIsNotNull(flowableCombineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> merge(@NotNull Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> flowableMerge = Flowable.merge(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(flowableMerge, "Flowable.merge(this.toFlowable())");
        return flowableMerge;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeDelayError(@NotNull Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> flowableMergeDelayError = Flowable.mergeDelayError(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(flowableMergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return flowableMergeDelayError;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchOnNext(@NotNull Flowable<Flowable<T>> flowable) {
        Flowable<T> flowableSwitchOnNext = Flowable.switchOnNext(flowable);
        Intrinsics.checkExpressionValueIsNotNull(flowableSwitchOnNext, "Flowable.switchOnNext(this)");
        return flowableSwitchOnNext;
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Character> toFlowable(@NotNull char[] cArr) {
        return toFlowable(ArraysKt.asIterable(cArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Short> toFlowable(@NotNull short[] sArr) {
        return toFlowable(ArraysKt.asIterable(sArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Integer> toFlowable(@NotNull int[] iArr) {
        return toFlowable(ArraysKt.asIterable(iArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Long> toFlowable(@NotNull long[] jArr) {
        return toFlowable(ArraysKt.asIterable(jArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Float> toFlowable(@NotNull float[] fArr) {
        return toFlowable(ArraysKt.asIterable(fArr));
    }

    @CheckReturnValue
    @NotNull
    public static final Flowable<Double> toFlowable(@NotNull double[] dArr) {
        return toFlowable(ArraysKt.asIterable(dArr));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull T[] tArr) {
        Flowable<T> flowableFromArray = Flowable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(flowableFromArray, "Flowable.fromArray(*this)");
        return flowableFromArray;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(@NotNull IntProgression intProgression) {
        if (intProgression.getStep() != 1 || ((long) intProgression.getLast()) - ((long) intProgression.getFirst()) >= Integer.MAX_VALUE) {
            Flowable<Integer> flowableFromIterable = Flowable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
            return flowableFromIterable;
        }
        Flowable<Integer> flowableRange = Flowable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(flowableRange, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return flowableRange;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Iterator<? extends T> it) {
        return toFlowable(toIterable(it));
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(@NotNull Iterable<? extends T> iterable) {
        Flowable<T> flowableFromIterable = Flowable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(flowableFromIterable, "Flowable.fromIterable(this)");
        return flowableFromIterable;
    }

    @NotNull
    public static final <T> Flowable<T> toFlowable(@NotNull Sequence<? extends T> sequence) {
        return toFlowable(SequencesKt.asIterable(sequence));
    }
}
