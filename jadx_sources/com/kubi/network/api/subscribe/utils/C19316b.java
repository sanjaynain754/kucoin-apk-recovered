package com.kubi.network.api.subscribe.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.network.restful.C19322c;
import com.tencent.bugly.proguard.C33844oi;
import hr.C38293f;
import hr.InterfaceC38288a;
import hr.InterfaceC38289b;
import hr.InterfaceC38291d;
import hr.InterfaceC38292e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kr.InterfaceC41975c;
import lr.C42294a;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.network.api.subscribe.utils.b */
/* JADX INFO: compiled from: RequestUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u00122\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017\"\b\b\u0000\u0010\u0016*\u00020\u0001*\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001a*\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ-\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u0013\u0010 \u001a\u00020\u0006*\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/utils/b;", "", "<init>", "()V", "Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "request", "", "type", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/kubi/network/api/subscribe/model/SubscribeRequest;Ljava/lang/String;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", "topic", "j", "(Ljava/lang/String;)Ljava/lang/String;", "k", "Lcom/kubi/network/restful/c;", "g", "(Lcom/kubi/network/restful/c;)Lcom/kubi/network/api/subscribe/model/SubscribeRequest;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkr/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/network/restful/c;)Lkr/c;", ExifInterface.GPS_DIRECTION_TRUE, "Lhr/f;", "c", "(Lcom/kubi/network/restful/c;)Lhr/f;", "Ljava/lang/reflect/Type;", "e", "(Lcom/kubi/network/restful/c;)Ljava/lang/reflect/Type;", "b", "d", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "(Lcom/kubi/network/restful/c;)Ljava/lang/String;", "Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "f", "(Lcom/kubi/network/restful/c;)Lcom/kubi/network/api/subscribe/model/PeriodRequest;", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestUtils.kt\ncom/kubi/network/api/subscribe/utils/RequestUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,165:1\n4098#2,11:166\n*S KotlinDebug\n*F\n+ 1 RequestUtils.kt\ncom/kubi/network/api/subscribe/utils/RequestUtils\n*L\n137#1:166,11\n*E\n"})
public final class C19316b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19316b f35839a = new C19316b();

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ SubscribeRequest m42747m(C19316b c19316b, SubscribeRequest subscribeRequest, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "unsubscribe";
        }
        return c19316b.m42759l(subscribeRequest, str);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final <A, B> InterfaceC41975c<A, B> m42748a(@NotNull C19322c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return m42755h(request);
    }

    @JvmName(name = "getPeriodCallFlow1")
    @Nullable
    /* JADX INFO: renamed from: c */
    public final <T> C38293f<T> m42750c(@NotNull C19322c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return m42749b(request);
    }

    @JvmName(name = "getPeriodCallType1")
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Type m42752e(@NotNull C19322c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Type typeM42751d = m42751d(request);
        if (typeM42751d == null) {
            return null;
        }
        Class<?> clsM92828c = C42294a.m92828c(typeM42751d);
        Intrinsics.checkNotNullExpressionValue(clsM92828c, "getRawType(returnType)");
        if (!Intrinsics.areEqual(clsM92828c, C38293f.class)) {
            throw new IllegalStateException("only support Period type");
        }
        if (typeM42751d instanceof ParameterizedType) {
            return C42294a.m92827b(0, (ParameterizedType) typeM42751d);
        }
        throw new IllegalStateException("Flow return type must be parameterized as PeriodFlow<Foo> or Period<? extends Foo>");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final SubscribeRequest m42754g(@NotNull C19322c request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new SubscribeRequest(null, m42756i(request), null, m42753f(request), 5, null);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final String m42757j(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) topic, C33844oi.f71346o, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = topic.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final String m42758k(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) topic, C33844oi.f71346o, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return null;
        }
        String strSubstring = topic.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SubscribeRequest m42759l(@NotNull SubscribeRequest request, @NotNull String type) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        return request.clone(type);
    }

    /* JADX INFO: renamed from: b */
    public final <T> C38293f<T> m42749b(C19322c c19322c) {
        Iterator<Map.Entry<Pair<Annotation[], Type>, Object>> it = c19322c.m42780b().entrySet().iterator();
        while (true) {
            C38293f<T> c38293f = null;
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<Pair<Annotation[], Type>, Object> next = it.next();
            Pair<Annotation[], Type> key = next.getKey();
            Object value = next.getValue();
            for (Annotation annotation : key.getFirst()) {
                if (annotation instanceof InterfaceC38289b) {
                    if (value instanceof C38293f) {
                        c38293f = (C38293f) value;
                    }
                    if (c38293f != null) {
                        return c38293f;
                    }
                    throw new IllegalArgumentException("request 必须派生自 PeriodFlow");
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Type m42751d(C19322c c19322c) {
        for (Map.Entry<Pair<Annotation[], Type>, Object> entry : c19322c.m42780b().entrySet()) {
            Pair<Annotation[], Type> key = entry.getKey();
            entry.getValue();
            for (Annotation annotation : key.getFirst()) {
                if (annotation instanceof InterfaceC38289b) {
                    return key.getSecond();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final PeriodRequest m42753f(C19322c c19322c) {
        Request request;
        Iterator<Map.Entry<Pair<Annotation[], Type>, Object>> it = c19322c.m42780b().entrySet().iterator();
        while (true) {
            C38293f c38293f = null;
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<Pair<Annotation[], Type>, Object> next = it.next();
            Pair<Annotation[], Type> key = next.getKey();
            Object value = next.getValue();
            for (Annotation annotation : key.getFirst()) {
                if (annotation instanceof InterfaceC38289b) {
                    if (value instanceof C38293f) {
                        c38293f = (C38293f) value;
                    }
                    if (c38293f != null && (request = c38293f.getRequest()) != null) {
                        InterfaceC38289b interfaceC38289b = (InterfaceC38289b) annotation;
                        return new PeriodRequest(null, request, interfaceC38289b.supportBackground(), interfaceC38289b.promptlyRequest(), interfaceC38289b.waitPeriodResult(), interfaceC38289b.connectedPeriod(), interfaceC38289b.disconnectPeriod(), 1, null);
                    }
                    throw new IllegalArgumentException("request 必须派生自 PeriodFlow");
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final <A, B> InterfaceC41975c<A, B> m42755h(C19322c c19322c) {
        Iterator<Map.Entry<Pair<Annotation[], Type>, Object>> it = c19322c.m42780b().entrySet().iterator();
        while (true) {
            InterfaceC41975c<A, B> interfaceC41975c = null;
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<Pair<Annotation[], Type>, Object> next = it.next();
            Pair<Annotation[], Type> key = next.getKey();
            Object value = next.getValue();
            for (Annotation annotation : key.getFirst()) {
                if (annotation instanceof InterfaceC38292e) {
                    if (value instanceof InterfaceC41975c) {
                        interfaceC41975c = (InterfaceC41975c) value;
                    }
                    if (interfaceC41975c != null) {
                        return interfaceC41975c;
                    }
                    throw new IllegalArgumentException("convert 必须派生自 IConverter");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061 A[EDGE_INSN: B:23:0x0061->B:27:0x006c BREAK  A[LOOP:1: B:15:0x0037->B:41:?, LOOP_LABEL: LOOP:1: B:15:0x0037->B:41:?]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:27:0x006c BREAK  A[LOOP:1: B:15:0x0037->B:41:?, LOOP_LABEL: LOOP:1: B:15:0x0037->B:41:?]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x003d, please report this as an issue */
    /* JADX INFO: renamed from: i */
    public final String m42756i(C19322c c19322c) {
        Iterator<Map.Entry<Pair<Annotation[], Type>, Object>> it;
        Object obj;
        Object value;
        int i11;
        Annotation[] methods = c19322c.getMethods();
        String str = null;
        if (methods != null) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : methods) {
                if (annotation instanceof InterfaceC38291d) {
                    arrayList.add(annotation);
                }
            }
            InterfaceC38291d interfaceC38291d = (InterfaceC38291d) CollectionsKt.firstOrNull((List) arrayList);
            if (interfaceC38291d == null || (obj = interfaceC38291d.topic()) == null) {
                it = c19322c.m42780b().entrySet().iterator();
                loop1: while (true) {
                    if (it.hasNext()) {
                        Map.Entry<Pair<Annotation[], Type>, Object> next = it.next();
                        Pair<Annotation[], Type> key = next.getKey();
                        value = next.getValue();
                        for (Annotation annotation2 : key.getFirst()) {
                            if (annotation2 instanceof InterfaceC38288a) {
                                if (value instanceof String) {
                                    obj = (String) value;
                                    break loop1;
                                }
                                obj = null;
                                break loop1;
                            }
                        }
                    } else {
                        obj = Unit.INSTANCE;
                        break;
                    }
                }
            }
        } else {
            it = c19322c.m42780b().entrySet().iterator();
            loop1: while (true) {
                if (it.hasNext()) {
                    Map.Entry<Pair<Annotation[], Type>, Object> next2 = it.next();
                    Pair<Annotation[], Type> key2 = next2.getKey();
                    value = next2.getValue();
                    while (i11 < r4) {
                        if (annotation2 instanceof InterfaceC38288a) {
                            if (value instanceof String) {
                                obj = (String) value;
                                break loop1;
                            }
                            obj = null;
                            break loop1;
                        }
                    }
                } else {
                    obj = Unit.INSTANCE;
                    break;
                }
            }
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("topic must not empty");
    }
}
