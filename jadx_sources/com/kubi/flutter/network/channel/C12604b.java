package com.kubi.flutter.network.channel;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.flutter.network.channel.b */
/* JADX INFO: compiled from: NetworkChannel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/flutter/network/channel/b;", "", "<init>", "()V", "Lcom/kubi/flutter/network/channel/a;", "arguments", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/flutter/network/channel/a;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Lcom/kubi/flutter/network/channel/a;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C12604b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Object m23808a(@NotNull C12603a arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return CollectionsKt.listOf(arguments.getChannel(), arguments.getArguments());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final C12603a m23809b(@NotNull Object arguments) throws Exception {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        List list = arguments instanceof List ? (List) arguments : null;
        if (list == null) {
            throw new Exception("arguments must be a List");
        }
        if (list.size() != 2) {
            throw new Exception("arguments length must be 2");
        }
        Object obj = list.get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        return new C12603a((String) obj, list.get(1));
    }
}
