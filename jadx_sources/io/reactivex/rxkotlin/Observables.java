package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.functions.Function5;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.functions.Function8;
import p852kotlin.jvm.functions.Function9;

/* JADX INFO: compiled from: Observables.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90082bv = {1, 0, 2}, m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0084\u0001\u0010\u0003\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u0005 \b**\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Jw\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\bJ°\u0001\u0010\u0003\u001an\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e \b*6\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0007J\u0091\u0001\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042 \b\u0004\u0010\f\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000b0\u0011H\u0087\bJ«\u0001\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042&\b\u0004\u0010\f\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u000b0\u0014H\u0087\bJÅ\u0001\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042,\b\u0004\u0010\f\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u000b0\u0017H\u0087\bJß\u0001\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000422\b\u0004\u0010\f\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u000b0\u001aH\u0087\bJù\u0001\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u000428\b\u0004\u0010\f\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000b0\u001dH\u0087\bJ\u0093\u0002\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042>\b\u0004\u0010\f\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u000b0 H\u0087\bJ\u00ad\u0002\u0010\u0003\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010!\"\u0004\b\t\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u00042D\b\u0004\u0010\f\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u000b0#H\u0087\bJ\u0084\u0001\u0010$\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u0005 \b**\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007 \b*\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Jw\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000b0\rH\u0087\bJ°\u0001\u0010$\u001an\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e \b*6\u00120\u0012.\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f \b*\u0016\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0018\u00010\u000e0\u000e\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0007J\u0091\u0001\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042 \b\u0004\u0010\f\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u000b0\u0011H\u0087\bJ«\u0001\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042&\b\u0004\u0010\f\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u000b0\u0014H\u0087\bJÅ\u0001\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042,\b\u0004\u0010\f\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u000b0\u0017H\u0087\bJß\u0001\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u000422\b\u0004\u0010\f\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u000b0\u001aH\u0087\bJù\u0001\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u000428\b\u0004\u0010\f\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u000b0\u001dH\u0087\bJ\u0093\u0002\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042>\b\u0004\u0010\f\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u000b0 H\u0087\bJ\u00ad\u0002\u0010$\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u0001H\u000bH\u000b\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u000f\"\u0004\b\u0003\u0010\u0012\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0018\"\u0004\b\u0006\u0010\u001b\"\u0004\b\u0007\u0010\u001e\"\u0004\b\b\u0010!\"\u0004\b\t\u0010\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u00042D\b\u0004\u0010\f\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u000b0#H\u0087\b¨\u0006%"}, m90084d2 = {"Lio/reactivex/rxkotlin/Observables;", "", "()V", "combineLatest", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "T1", "T2", "kotlin.jvm.PlatformType", "source1", "source2", "R", "combineFunction", "Lkotlin/Function2;", "Lkotlin/Triple;", "T3", "source3", "Lkotlin/Function3;", "T4", "source4", "Lkotlin/Function4;", "T5", "source5", "Lkotlin/Function5;", "T6", "source6", "Lkotlin/Function6;", "T7", "source7", "Lkotlin/Function7;", "T8", "source8", "Lkotlin/Function8;", "T9", "source9", "Lkotlin/Function9;", "zip", "rxkotlin"}, m90085k = 1, m90086mv = {1, 1, 11})
public final class Observables {
    public static final Observables INSTANCE = new Observables();

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t11, T2 t12) {
                return (R) combineFunction.invoke(t11, t12);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t11, T2 t12) {
                return (R) combineFunction.invoke(t11, t12);
            }
        });
    }

    private Observables() {
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2> Observable<Pair<T1, T2>> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2) {
        return Observable.combineLatest(source1, source2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T1, T2> apply(T1 t11, T2 t12) {
                return TuplesKt.m90091to(t11, t12);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2> Observable<Pair<T1, T2>> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2) {
        return Observable.zip(source1, source2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables.zip.2
            @Override // io.reactivex.functions.BiFunction
            @NotNull
            public final Pair<T1, T2> apply(T1 t11, T2 t12) {
                return TuplesKt.m90091to(t11, t12);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull final Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t11, T2 t12, T3 t13) {
                return (R) combineFunction.invoke(t11, t12, t13);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull final Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.3
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t11, T2 t12, T3 t13) {
                return (R) combineFunction.invoke(t11, t12, t13);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3) {
        return Observable.combineLatest(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T1, T2, T3> apply(T1 t11, T2 t12, T3 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3) {
        return Observable.zip(source1, source2, source3, new io.reactivex.functions.Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>>() { // from class: io.reactivex.rxkotlin.Observables.zip.4
            @Override // io.reactivex.functions.Function3
            @NotNull
            public final Triple<T1, T2, T3> apply(T1 t11, T2 t12, T3 t13) {
                return new Triple<>(t11, t12, t13);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14) {
                return (R) combineFunction.invoke(t11, t12, t13, t14);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, new io.reactivex.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.5
            @Override // io.reactivex.functions.Function4
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14) {
                return (R) combineFunction.invoke(t11, t12, t13, t14);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, source5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, source5, new io.reactivex.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.6
            @Override // io.reactivex.functions.Function5
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, source5, source6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, source5, source6, new io.reactivex.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.7
            @Override // io.reactivex.functions.Function6
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.8
            @Override // io.reactivex.functions.Function7
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.9
            @Override // io.reactivex.functions.Function8
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull Observable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        return Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Observables.combineLatest.10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18, T9 t19) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18, t19);
            }
        });
    }

    @SchedulerSupport("none")
    @CheckReturnValue
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull Observable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        return Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxkotlin.Observables.zip.10
            @Override // io.reactivex.functions.Function9
            public final R apply(T1 t11, T2 t12, T3 t13, T4 t14, T5 t15, T6 t16, T7 t17, T8 t18, T9 t19) {
                return (R) combineFunction.invoke(t11, t12, t13, t14, t15, t16, t17, t18, t19);
            }
        });
    }
}
