package com.kubi.network.api.subscribe.adapter;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.network.api.subscribe.utils.C19318d;
import gr.C38001c;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: ProtobufSubscribeConverterFactory.kt */
/* JADX INFO: loaded from: classes63.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u001aB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/adapter/ProtobufSubscribeConvertAdapter;", "ResponseIn", "ResponseOut", "Lkr/c;", "", "topic", "Ljava/lang/reflect/Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/reflect/Type;)V", "value", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "message", "", "b", "(Lcom/kubi/network/api/subscribe/model/SubscribeMessage;)[B", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "Ljava/lang/reflect/Type;", "Lcom/kubi/network/api/subscribe/utils/d;", "c", "Lcom/kubi/network/api/subscribe/utils/d;", "topicMatcher", "d", "Companion", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ProtobufSubscribeConvertAdapter<ResponseIn, ResponseOut> implements InterfaceC41975c<ResponseIn, ResponseOut> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<Class<?>, Parser<?>> f35810e = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String topic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C19318d topicMatcher;

    /* JADX INFO: compiled from: ProtobufSubscribeConverterFactory.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R:\u0010\u0005\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006j\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/network/api/subscribe/adapter/ProtobufSubscribeConvertAdapter$Companion;", "", "()V", "TAG", "", "parserCache", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/google/protobuf/Parser;", "Lkotlin/collections/HashMap;", "getParserForClass", "clazz", "network-adapter-subscribe_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nProtobufSubscribeConverterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtobufSubscribeConverterFactory.kt\ncom/kubi/network/api/subscribe/adapter/ProtobufSubscribeConvertAdapter$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,143:1\n361#2,7:144\n*S KotlinDebug\n*F\n+ 1 ProtobufSubscribeConverterFactory.kt\ncom/kubi/network/api/subscribe/adapter/ProtobufSubscribeConvertAdapter$Companion\n*L\n136#1:144,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized Parser<?> getParserForClass(@NotNull Class<?> clazz) {
            Object obj;
            try {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                HashMap map = ProtobufSubscribeConvertAdapter.f35810e;
                obj = map.get(clazz);
                if (obj == null) {
                    Object objInvoke = clazz.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type com.google.protobuf.Parser<*>");
                    obj = (Parser) objInvoke;
                    map.put(clazz, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return (Parser) obj;
        }

        public Companion() {
        }
    }

    public ProtobufSubscribeConvertAdapter(@NotNull String topic, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(type, "type");
        this.topic = topic;
        this.type = type;
        this.topicMatcher = new C19318d(topic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kr.InterfaceC41975c
    @Nullable
    public ResponseOut convert(ResponseIn value) {
        ResponseOut responseout;
        if (value instanceof SubscribeMessage) {
            SubscribeMessage subscribeMessage = (SubscribeMessage) value;
            if (!subscribeMessage.isSocketMessage() || !this.topicMatcher.m42761a(subscribeMessage.getTopic())) {
                return null;
            }
            if (Intrinsics.areEqual(this.type, SubscribeMessage.class)) {
                return value;
            }
            byte[] bArrM42736b = m42736b(subscribeMessage);
            if (bArrM42736b == null || bArrM42736b.length == 0) {
                return null;
            }
            try {
                Type type = this.type;
                Class<?> cls = type instanceof Class ? (Class) type : null;
                if (cls == null || (responseout = (ResponseOut) INSTANCE.getParserForClass(cls).parseFrom(bArrM42736b)) == null) {
                    return null;
                }
                return responseout;
            } catch (Exception e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pb_parse_fail: topic=");
                sb2.append(this.topic);
                sb2.append(" type=");
                Type type2 = this.type;
                Class cls2 = type2 instanceof Class ? (Class) type2 : null;
                sb2.append(cls2 != null ? cls2.getSimpleName() : null);
                sb2.append(" dataSize=");
                sb2.append(bArrM42736b.length);
                sb2.append(" error=");
                sb2.append(e11.getClass().getSimpleName());
                sb2.append(" msg=");
                sb2.append(e11.getMessage());
                C44128b.m97262f("ProtobufSubscribe", sb2.toString(), e11);
                C38001c.f85602a.m85875a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m42736b(SubscribeMessage message) {
        Method method;
        Object objInvoke;
        Object extension = message.getExtension();
        if (extension instanceof MessageLite) {
            try {
                Object objInvoke2 = extension.getClass().getMethod("getData", new Class[0]).invoke(extension, new Object[0]);
                if (objInvoke2 != null) {
                    method = objInvoke2.getClass().getMethod("toByteArray", new Class[0]);
                } else {
                    method = null;
                }
                if (method != null) {
                    objInvoke = method.invoke(objInvoke2, new Object[0]);
                } else {
                    objInvoke = null;
                }
                if (!(objInvoke instanceof byte[])) {
                    return null;
                }
                return (byte[]) objInvoke;
            } catch (Exception e11) {
                C44128b.m97262f("ProtobufSubscribe", "pb_extract_bytes_fail: topic=" + message.getTopic() + " subject=" + message.getSubject() + " extensionType=" + extension.getClass().getSimpleName() + " error=" + e11.getClass().getSimpleName() + " msg=" + e11.getMessage(), e11);
                String data = message.getData();
                if (data == null) {
                    return null;
                }
                byte[] bytes = data.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                return bytes;
            }
        }
        String data2 = message.getData();
        if (data2 == null) {
            return null;
        }
        byte[] bytes2 = data2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        return bytes2;
    }
}
