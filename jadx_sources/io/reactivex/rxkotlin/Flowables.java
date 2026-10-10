package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.functions.Function8;
import p852kotlin.jvm.functions.Function9;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Flowables.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Ja\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\bJv\u0010\u0003\u001a4\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0007J{\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042 \b\u0004\u0010\f\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000b0\u0011H\u0087\bJ\u0095\u0001\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042&\b\u0004\u0010\f\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u000b0\u0014H\u0087\bJ¯\u0001\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042,\b\u0004\u0010\f\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u000b0\u0017H\u0087\bJÉ\u0001\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000422\b\u0004\u0010\f\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u000b0\u001aH\u0087\bJã\u0001\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u000428\b\u0004\u0010\f\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000b0\u001dH\u0087\bJý\u0001\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042>\b\u0004\u0010\f\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u000b0 H\u0087\bJ\u0097\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010!\"\u0004\b\t\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u00042D\b\u0004\u0010\f\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u000b0#H\u0087\bJA\u0010$\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H%H%0\u0004\"\u0004\b\u0000\u0010%2\u0006\u0010&\u001a\u00020'2\u001a\b\u0004\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H%0*\u0012\u0004\u0012\u00020+0)H\u0087\bJV\u0010,\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u00050\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Ja\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\bJv\u0010,\u001a4\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0007J{\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042 \b\u0004\u0010\f\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000b0\u0011H\u0087\bJ\u0095\u0001\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042&\b\u0004\u0010\f\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u000b0\u0014H\u0087\bJ¯\u0001\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042,\b\u0004\u0010\f\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u000b0\u0017H\u0087\bJÉ\u0001\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000422\b\u0004\u0010\f\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u000b0\u001aH\u0087\bJã\u0001\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u000428\b\u0004\u0010\f\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000b0\u001dH\u0087\bJý\u0001\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042>\b\u0004\u0010\f\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u000b0 H\u0087\bJ\u0097\u0002\u0010,\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b0\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010!\"\u0004\b\t\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u00042D\b\u0004\u0010\f\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u000b0#H\u0087\b¨\u0006-"}, m90084d2 = {"Lio/reactivex/rxkotlin/Flowables;", "", "()V", "combineLatest", "Lio/reactivex/Flowable;", "Lkotlin/Pair;", "T1", "T2", "kotlin.jvm.PlatformType", "source1", "source2", "R", "combineFunction", "Lkotlin/Function2;", "Lkotlin/Triple;", "T3", "source3", "Lkotlin/Function3;", "T4", "source4", "Lkotlin/Function4;", "T5", "source5", "Lkotlin/Function5;", "T6", "source6", "Lkotlin/Function6;", "T7", "source7", "Lkotlin/Function7;", "T8", "source8", "Lkotlin/Function8;", "T9", "source9", "Lkotlin/Function9;", "create", ExifInterface.GPS_DIRECTION_TRUE, "mode", "Lio/reactivex/BackpressureStrategy;", "source", "Lkotlin/Function1;", "Lio/reactivex/FlowableEmitter;", "", "zip", "rxkotlin"}, m90085k = 1, m90086mv = {1, 1, 11})
public final class Flowables {
    public static final Flowables INSTANCE = new Flowables();

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t11, T2 t12) {
                return (R) combineFunction.invoke(t11, t12);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t11, T2 t12) {
                return (R) combineFunction.invoke(t11, t12);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <T> Flowable<T> create(@NotNull BackpressureStrategy mode, @NotNull final Function1<? super FlowableEmitter<T>, Unit> source) {
        Flowable<T> flowableCreate = Flowable.create(new FlowableOnSubscribe<T>() { // from class: io.reactivex.rxkotlin.Flowables.create.1
            @Override // io.reactivex.FlowableOnSubscribe
            public final void subscribe(@NotNull FlowableEmitter<T> flowableEmitter) {
                source.invoke(flowableEmitter);
            }
        }, mode);
        if (flowableCreate == null) {
            Intrinsics.throwNpe();
        }
        return flowableCreate;
    }

    private Flowables() {
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2> Flowable<Pair<T1, T2>> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2) {
        Flowable<Pair<T1, T2>> flowableCombineLatest = Flowable.combineLatest(source1, source2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T1, T2> apply(T1 t11, T2 t12) {
                return TuplesKt.m90091to(t11, t12);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2> Flowable<Pair<T1, T2>> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2) {
        Flowable<Pair<T1, T2>> flowableZip = Flowable.zip(source1, source2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Flowables.zip.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T1, T2> apply(T1 t11, T2 t12) {
                return TuplesKt.m90091to(t11, t12);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull final Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t11, T2 t12, T3 t13) {
                return (R) combineFunction.invoke(t11, t12, t13);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull final Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t11, T2 t12, T3 t13) {
                return (R) combineFunction.invoke(t11, t12, t13);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3> Flowable<Triple<T1, T2, T3>> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3) {
        Flowable<Triple<T1, T2, T3>> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T1, T2, T3> apply(T1 t11, T2 t12, T3 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3> Flowable<Triple<T1, T2, T3>> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3) {
        Flowable<Triple<T1, T2, T3>> flowableZip = Flowable.zip(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Flowables.zip.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T1, T2, T3> apply(T1 t11, T2 t12, T3 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14) {
                return (R) combineFunction.invoke(t11, t12, t13, t14);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14) {
                return (R) combineFunction.invoke(t11, t12, t13, t14);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, source5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, source5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, source5, source6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, source5, source6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull Flowable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull Flowable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> combineLatest(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull Flowable<T8> source8, @NotNull Flowable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        Flowable<R> flowableCombineLatest = Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Flowables.combineLatest.10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18, T9 t19) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18, t19);
            }
        });
        if (flowableCombineLatest == null) {
            Intrinsics.throwNpe();
        }
        return flowableCombineLatest;
    }

    @NotNull
    @SchedulerSupport("none")
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> zip(@NotNull Flowable<T1> source1, @NotNull Flowable<T2> source2, @NotNull Flowable<T3> source3, @NotNull Flowable<T4> source4, @NotNull Flowable<T5> source5, @NotNull Flowable<T6> source6, @NotNull Flowable<T7> source7, @NotNull Flowable<T8> source8, @NotNull Flowable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        Flowable<R> flowableZip = Flowable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Flowables.zip.10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18, T9 t19) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18, t19);
            }
        });
        if (flowableZip == null) {
            Intrinsics.throwNpe();
        }
        return flowableZip;
    }
}
