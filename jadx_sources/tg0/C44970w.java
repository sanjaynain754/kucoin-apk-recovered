package tg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import kotlinx.serialization.internal.C41791a2;
import kotlinx.serialization.internal.C41858o;
import kotlinx.serialization.internal.InterfaceC41881s2;
import kotlinx.serialization.internal.InterfaceC41908z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KClassifier;
import p852kotlin.reflect.KType;
import ug0.C45236a;
import yg0.C46495b;

/* JADX INFO: renamed from: tg0.w */
/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aC\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r\"(\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0017\u0010\u0014\"\"\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u0014\"\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u0014¨\u0006!"}, m90084d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Ltg0/d;", "m", "(Lkotlin/reflect/KClass;Z)Ltg0/d;", "", "Lkotlin/reflect/KType;", "types", "Lkotlin/Result;", "n", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "Lkotlinx/serialization/internal/s2;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlinx/serialization/internal/s2;", "getSERIALIZERS_CACHE", "()Lkotlinx/serialization/internal/s2;", "getSERIALIZERS_CACHE$annotations", "()V", "SERIALIZERS_CACHE", "b", "getSERIALIZERS_CACHE_NULLABLE$annotations", "SERIALIZERS_CACHE_NULLABLE", "Lkotlinx/serialization/internal/z1;", "c", "Lkotlinx/serialization/internal/z1;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "d", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "kotlinx-serialization-core"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSerializersCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,79:1\n78#1:81\n78#1:82\n78#2:80\n78#2:83\n78#2:84\n*S KotlinDebug\n*F\n+ 1 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n*L\n22#1:81\n28#1:82\n54#1:80\n28#1:83\n45#1:84\n*E\n"})
public final class C44970w {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC41881s2<? extends Object> f101362a = C41858o.m91658a(new Function1() { // from class: tg0.q
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C44970w.m99432k((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC41881s2<Object> f101363b = C41858o.m91658a(new Function1() { // from class: tg0.r
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C44970w.m99433l((KClass) obj);
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC41908z1<? extends Object> f101364c = C41858o.m91659b(new Function2() { // from class: tg0.s
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C44970w.m99428g((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final InterfaceC41908z1<Object> f101365d = C41858o.m91659b(new Function2() { // from class: tg0.t
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C44970w.m99430i((KClass) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: h */
    public static final KClassifier m99429h(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: renamed from: j */
    public static final KClassifier m99431j(List list) {
        return ((KType) list.get(0)).getClassifier();
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC44951d m99428g(KClass clazz, final List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<InterfaceC44951d<Object>> listM99441f = C44971x.m99441f(C46495b.m102577a(), types, true);
        Intrinsics.checkNotNull(listM99441f);
        return C44971x.m99437b(clazz, listM99441f, new Function0() { // from class: tg0.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44970w.m99429h(types);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC44951d m99430i(KClass clazz, final List types) {
        InterfaceC44951d interfaceC44951dM99969u;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<InterfaceC44951d<Object>> listM99441f = C44971x.m99441f(C46495b.m102577a(), types, true);
        Intrinsics.checkNotNull(listM99441f);
        InterfaceC44951d<? extends Object> interfaceC44951dM99437b = C44971x.m99437b(clazz, listM99441f, new Function0() { // from class: tg0.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44970w.m99431j(types);
            }
        });
        if (interfaceC44951dM99437b == null || (interfaceC44951dM99969u = C45236a.m99969u(interfaceC44951dM99437b)) == null) {
            return null;
        }
        return interfaceC44951dM99969u;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC44951d m99432k(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC44951d interfaceC44951dM99438c = C44971x.m99438c(it);
        if (interfaceC44951dM99438c != null) {
            return interfaceC44951dM99438c;
        }
        if (C41791a2.m91457l(it)) {
            return new C44955h(it);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC44951d m99433l(KClass it) {
        InterfaceC44951d interfaceC44951dM99969u;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC44951d interfaceC44951dM99438c = C44971x.m99438c(it);
        if (interfaceC44951dM99438c == null) {
            interfaceC44951dM99438c = C41791a2.m91457l(it) ? new C44955h(it) : null;
        }
        if (interfaceC44951dM99438c == null || (interfaceC44951dM99969u = C45236a.m99969u(interfaceC44951dM99438c)) == null) {
            return null;
        }
        return interfaceC44951dM99969u;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static final InterfaceC44951d<Object> m99434m(@NotNull KClass<Object> clazz, boolean z11) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (z11) {
            return f101363b.mo91714a(clazz);
        }
        InterfaceC44951d<? extends Object> interfaceC44951dMo91714a = f101362a.mo91714a(clazz);
        if (interfaceC44951dMo91714a != null) {
            return interfaceC44951dMo91714a;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final Object m99435n(@NotNull KClass<Object> clazz, @NotNull List<? extends KType> types, boolean z11) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        return !z11 ? f101364c.mo91720a(clazz, types) : f101365d.mo91720a(clazz, types);
    }
}
