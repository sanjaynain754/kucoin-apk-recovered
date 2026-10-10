package com.kubi.kucoin.manager;

import com.facebook.react.animated.InterpolationAnimatedNode;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: KCSocketTopicDescriptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00192\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0012\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020&H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R(\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R:\u0010\u001b\u001a(\b\u0001\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kucoin/manager/KCSocketTopicDescriptor;", "Entity", "", "topicPrefix", "", "getTopicPrefix", "()Ljava/lang/String;", "topicParams", "getTopicParams", "setTopicParams", "(Ljava/lang/String;)V", "protobufTopicPrefix", "getProtobufTopicPrefix", "_", "protobufTopicParams", "getProtobufTopicParams", "setProtobufTopicParams", "wsClientType", "Lcom/kubi/kucoin/manager/WsClientType;", "getWsClientType", "()Lcom/kubi/kucoin/manager/WsClientType;", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, TUIConstants.TIMPush.NOTIFICATION.ENTITY, "(Ljava/lang/Object;)Ljava/lang/String;", "createFlow", "Lkotlinx/coroutines/flow/Flow;", "topic", "httpFallback", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "getHttpFallback", "()Lkotlin/jvm/functions/Function1;", "getTopic", "protobufTopic", "getProtobufTopic", "resolvedTopic", "dataFormat", "Lcom/kubi/kucoin/manager/KCSocketDataFormat;", "resolvedTopicPrefix", "resolvedTopicParams", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCSocketTopicDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCSocketTopicDescriptor.kt\ncom/kubi/kucoin/manager/KCSocketTopicDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public interface KCSocketTopicDescriptor<Entity> {
    @Nullable
    /* JADX INFO: renamed from: a */
    String mo32499a();

    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<Entity> mo32500b(@NotNull String str);

    @NotNull
    /* JADX INFO: renamed from: d */
    String mo32501d(@NotNull Entity entity);

    @NotNull
    /* JADX INFO: renamed from: e */
    String mo32502e();

    @Nullable
    /* JADX INFO: renamed from: f */
    default Function1<Continuation<? super Map<String, ? extends Entity>>, Object> m32604f() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    default String m32603c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo32502e());
        String strMo32499a = mo32499a();
        if (strMo32499a == null) {
            strMo32499a = "";
        }
        sb2.append(strMo32499a);
        return sb2.toString();
    }
}
