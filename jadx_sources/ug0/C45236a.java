package ug0;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.C41790a1;
import kotlinx.serialization.internal.C41794b0;
import kotlinx.serialization.internal.C41799c0;
import kotlinx.serialization.internal.C41800c1;
import kotlinx.serialization.internal.C41802c3;
import kotlinx.serialization.internal.C41804d0;
import kotlinx.serialization.internal.C41813f;
import kotlinx.serialization.internal.C41815f1;
import kotlinx.serialization.internal.C41817f3;
import kotlinx.serialization.internal.C41820g1;
import kotlinx.serialization.internal.C41822g3;
import kotlinx.serialization.internal.C41823h;
import kotlinx.serialization.internal.C41828i;
import kotlinx.serialization.internal.C41830i1;
import kotlinx.serialization.internal.C41832i3;
import kotlinx.serialization.internal.C41837j3;
import kotlinx.serialization.internal.C41838k;
import kotlinx.serialization.internal.C41839k0;
import kotlinx.serialization.internal.C41843l;
import kotlinx.serialization.internal.C41844l0;
import kotlinx.serialization.internal.C41847l3;
import kotlinx.serialization.internal.C41852m3;
import kotlinx.serialization.internal.C41862o3;
import kotlinx.serialization.internal.C41866p2;
import kotlinx.serialization.internal.C41867p3;
import kotlinx.serialization.internal.C41868q;
import kotlinx.serialization.internal.C41872q3;
import kotlinx.serialization.internal.C41873r;
import kotlinx.serialization.internal.C41875r1;
import kotlinx.serialization.internal.C41877r3;
import kotlinx.serialization.internal.C41880s1;
import kotlinx.serialization.internal.C41887u0;
import kotlinx.serialization.internal.C41889u2;
import kotlinx.serialization.internal.C41891v0;
import kotlinx.serialization.internal.C41893v2;
import kotlinx.serialization.internal.C41897w2;
import kotlinx.serialization.internal.C41900x1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Triple;
import p852kotlin.UByte;
import p852kotlin.UByteArray;
import p852kotlin.UInt;
import p852kotlin.UIntArray;
import p852kotlin.ULong;
import p852kotlin.ULongArray;
import p852kotlin.UShort;
import p852kotlin.UShortArray;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.BooleanCompanionObject;
import p852kotlin.jvm.internal.ByteCompanionObject;
import p852kotlin.jvm.internal.CharCompanionObject;
import p852kotlin.jvm.internal.DoubleCompanionObject;
import p852kotlin.jvm.internal.FloatCompanionObject;
import p852kotlin.jvm.internal.IntCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.LongCompanionObject;
import p852kotlin.jvm.internal.ShortCompanionObject;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.time.Duration;
import p852kotlin.uuid.ExperimentalUuidApi;
import p852kotlin.uuid.Uuid;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: ug0.a */
/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000À\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001aG\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001aG\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\t\u0010\u0007\u001aa\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u0002\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0002*\u00020\u001a¢\u0006\u0004\b\u0015\u0010\u001c\u001a\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H\u0007¢\u0006\u0004\b \u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\"0\u0002*\u00020!¢\u0006\u0004\b\u0015\u0010#\u001a\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002¢\u0006\u0004\b%\u0010\u0019\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0002H\u0007¢\u0006\u0004\b'\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020)0\u0002*\u00020(¢\u0006\u0004\b\u0015\u0010*\u001a\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0002¢\u0006\u0004\b,\u0010\u0019\u001a\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0002H\u0007¢\u0006\u0004\b.\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002000\u0002*\u00020/¢\u0006\u0004\b\u0015\u00101\u001a\u0013\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0002¢\u0006\u0004\b3\u0010\u0019\u001a\u0015\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0002H\u0007¢\u0006\u0004\b5\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002070\u0002*\u000206¢\u0006\u0004\b\u0015\u00108\u001a\u0013\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0002¢\u0006\u0004\b:\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020<0\u0002*\u00020;¢\u0006\u0004\b\u0015\u0010=\u001a\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0002¢\u0006\u0004\b?\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020A0\u0002*\u00020@¢\u0006\u0004\b\u0015\u0010B\u001a\u0013\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u0002¢\u0006\u0004\bD\u0010\u0019\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020E0\u0002*\u00020E¢\u0006\u0004\b\u0015\u0010F\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020H0\u0002*\u00020G¢\u0006\u0004\b\u0015\u0010I\u001aM\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010P0\u0002\"\b\b\u0000\u0010K*\u00020J\"\n\b\u0001\u0010L*\u0004\u0018\u00018\u00002\f\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\bQ\u0010R\u001a-\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000S0\u0002\"\u0004\b\u0000\u0010K2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bT\u0010U\u001a-\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000V0\u0002\"\u0004\b\u0000\u0010K2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bW\u0010U\u001aG\u0010Y\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010X0\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\bY\u0010\u0007\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020[0\u0002*\u00020Z¢\u0006\u0004\b\u0015\u0010\\\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020^0\u0002*\u00020]¢\u0006\u0004\b\u0015\u0010_\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020a0\u0002*\u00020`¢\u0006\u0004\b\u0015\u0010b\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020d0\u0002*\u00020c¢\u0006\u0004\b\u0015\u0010e\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020g0\u0002*\u00020f¢\u0006\u0004\b\u0015\u0010h\u001a\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020j0\u0002*\u00020iH\u0007¢\u0006\u0004\b\u0015\u0010k\u001a\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u0002H\u0007¢\u0006\u0004\bm\u0010\u0019\"3\u0010q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\b\b\u0000\u0010K*\u00020J*\b\u0012\u0004\u0012\u00028\u00000\u00028F¢\u0006\f\u0012\u0004\bo\u0010p\u001a\u0004\bn\u0010U¨\u0006r"}, m90084d2 = {"K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ltg0/d;", "keySerializer", "valueSerializer", "Lkotlin/Pair;", "m", "(Ltg0/d;Ltg0/d;)Ltg0/d;", "", "j", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "aSerializer", "bSerializer", "cSerializer", "Lkotlin/Triple;", "p", "(Ltg0/d;Ltg0/d;Ltg0/d;)Ltg0/d;", "Lkotlin/Char$Companion;", "", "serializer", "(Lkotlin/jvm/internal/CharCompanionObject;)Ltg0/d;", "", "d", "()Ltg0/d;", "Lkotlin/Byte$Companion;", "", "(Lkotlin/jvm/internal/ByteCompanionObject;)Ltg0/d;", "", "c", "Lkotlin/UByteArray;", "q", "Lkotlin/Short$Companion;", "", "(Lkotlin/jvm/internal/ShortCompanionObject;)Ltg0/d;", "", "o", "Lkotlin/UShortArray;", "t", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/IntCompanionObject;)Ltg0/d;", "", "g", "Lkotlin/UIntArray;", "r", "Lkotlin/Long$Companion;", "", "(Lkotlin/jvm/internal/LongCompanionObject;)Ltg0/d;", "", "i", "Lkotlin/ULongArray;", CmcdData.Factory.STREAMING_FORMAT_SS, "Lkotlin/Float$Companion;", "", "(Lkotlin/jvm/internal/FloatCompanionObject;)Ltg0/d;", "", "f", "Lkotlin/Double$Companion;", "", "(Lkotlin/jvm/internal/DoubleCompanionObject;)Ltg0/d;", "", "e", "Lkotlin/Boolean$Companion;", "", "(Lkotlin/jvm/internal/BooleanCompanionObject;)Ltg0/d;", "", "b", "", "(Lkotlin/Unit;)Ltg0/d;", "Lkotlin/String$Companion;", "", "(Lkotlin/jvm/internal/StringCompanionObject;)Ltg0/d;", "", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_EAST, "Lkotlin/reflect/KClass;", "kClass", "elementSerializer", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/reflect/KClass;Ltg0/d;)Ltg0/d;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ltg0/d;)Ltg0/d;", "", "n", "", "k", "Lkotlin/UInt$Companion;", "Lkotlin/UInt;", "(Lkotlin/UInt$Companion;)Ltg0/d;", "Lkotlin/ULong$Companion;", "Lkotlin/ULong;", "(Lkotlin/ULong$Companion;)Ltg0/d;", "Lkotlin/UByte$Companion;", "Lkotlin/UByte;", "(Lkotlin/UByte$Companion;)Ltg0/d;", "Lkotlin/UShort$Companion;", "Lkotlin/UShort;", "(Lkotlin/UShort$Companion;)Ltg0/d;", "Lkotlin/time/Duration$Companion;", "Lkotlin/time/Duration;", "(Lkotlin/time/Duration$Companion;)Ltg0/d;", "Lkotlin/uuid/Uuid$Companion;", "Lkotlin/uuid/Uuid;", "(Lkotlin/uuid/Uuid$Companion;)Ltg0/d;", "", CmcdData.Factory.STREAM_TYPE_LIVE, "u", "getNullable$annotations", "(Ltg0/d;)V", "nullable", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C45236a {
    @NotNull
    public static final InterfaceC44951d<Character> serializer(@NotNull CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return C41873r.f92016a;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T, E extends T> InterfaceC44951d<E[]> m99949a(@NotNull KClass<T> kClass, @NotNull InterfaceC44951d<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C41866p2(kClass, elementSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC44951d<boolean[]> m99950b() {
        return C41823h.f91937c;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC44951d<byte[]> m99951c() {
        return C41838k.f91974c;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC44951d<char[]> m99952d() {
        return C41868q.f92006c;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC44951d<double[]> m99953e() {
        return C41794b0.f91898c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC44951d<float[]> m99954f() {
        return C41839k0.f91975c;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final InterfaceC44951d<int[]> m99955g() {
        return C41887u0.f92038c;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC44951d<List<T>> m99956h(@NotNull InterfaceC44951d<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C41813f(elementSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final InterfaceC44951d<long[]> m99957i() {
        return C41815f1.f91925c;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final <K, V> InterfaceC44951d<Map.Entry<K, V>> m99958j(@NotNull InterfaceC44951d<K> keySerializer, @NotNull InterfaceC44951d<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C41830i1(keySerializer, valueSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final <K, V> InterfaceC44951d<Map<K, V>> m99959k(@NotNull InterfaceC44951d<K> keySerializer, @NotNull InterfaceC44951d<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C41790a1(keySerializer, valueSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final InterfaceC44951d m99960l() {
        return C41875r1.f92019a;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final <K, V> InterfaceC44951d<Pair<K, V>> m99961m(@NotNull InterfaceC44951d<K> keySerializer, @NotNull InterfaceC44951d<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new C41900x1(keySerializer, valueSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final <T> InterfaceC44951d<Set<T>> m99962n(@NotNull InterfaceC44951d<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C41800c1(elementSerializer);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final InterfaceC44951d<short[]> m99963o() {
        return C41889u2.f92040c;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final <A, B, C> InterfaceC44951d<Triple<A, B, C>> m99964p(@NotNull InterfaceC44951d<A> aSerializer, @NotNull InterfaceC44951d<B> bSerializer, @NotNull InterfaceC44951d<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new C41802c3(aSerializer, bSerializer, cSerializer);
    }

    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: q */
    public static final InterfaceC44951d<UByteArray> m99965q() {
        return C41817f3.f91927c;
    }

    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: r */
    public static final InterfaceC44951d<UIntArray> m99966r() {
        return C41832i3.f91962c;
    }

    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final InterfaceC44951d<ULongArray> m99967s() {
        return C41847l3.f91985c;
    }

    @NotNull
    public static final InterfaceC44951d<Byte> serializer(@NotNull ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return C41843l.f91980a;
    }

    @ExperimentalUnsignedTypes
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final InterfaceC44951d<UShortArray> m99968t() {
        return C41862o3.f91997c;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public static final <T> InterfaceC44951d<T> m99969u(@NotNull InterfaceC44951d<T> interfaceC44951d) {
        Intrinsics.checkNotNullParameter(interfaceC44951d, "<this>");
        return interfaceC44951d.getDescriptor().mo91523b() ? interfaceC44951d : new C41880s1(interfaceC44951d);
    }

    @NotNull
    public static final InterfaceC44951d<Short> serializer(@NotNull ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return C41893v2.f92046a;
    }

    @NotNull
    public static final InterfaceC44951d<Integer> serializer(@NotNull IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return C41891v0.f92041a;
    }

    @NotNull
    public static final InterfaceC44951d<Long> serializer(@NotNull LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return C41820g1.f91932a;
    }

    @NotNull
    public static final InterfaceC44951d<Float> serializer(@NotNull FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return C41844l0.f91982a;
    }

    @NotNull
    public static final InterfaceC44951d<Double> serializer(@NotNull DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return C41799c0.f91901a;
    }

    @NotNull
    public static final InterfaceC44951d<Boolean> serializer(@NotNull BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return C41828i.f91957a;
    }

    @NotNull
    public static final InterfaceC44951d<Unit> serializer(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return C41872q3.f92014b;
    }

    @NotNull
    public static final InterfaceC44951d<String> serializer(@NotNull StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return C41897w2.f92051a;
    }

    @NotNull
    public static final InterfaceC44951d<UInt> serializer(@NotNull UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41837j3.f91972a;
    }

    @NotNull
    public static final InterfaceC44951d<ULong> serializer(@NotNull ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41852m3.f91988a;
    }

    @NotNull
    public static final InterfaceC44951d<UByte> serializer(@NotNull UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41822g3.f91935a;
    }

    @NotNull
    public static final InterfaceC44951d<UShort> serializer(@NotNull UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41867p3.f92004a;
    }

    @NotNull
    public static final InterfaceC44951d<Duration> serializer(@NotNull Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41804d0.f91908a;
    }

    @ExperimentalUuidApi
    @NotNull
    public static final InterfaceC44951d<Uuid> serializer(@NotNull Uuid.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return C41877r3.f92021a;
    }
}
