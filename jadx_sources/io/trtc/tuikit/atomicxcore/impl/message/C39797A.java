package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C39797A extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88437a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39797A(String str) {
        super(1);
        this.f88437a = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MessageBody messageBodyCopy = (MessageBody) obj;
        Intrinsics.checkNotNullParameter(messageBodyCopy, "messageBodyCopy");
        return MessageBody.copy$default(messageBodyCopy, null, null, null, null, 0, 0, 0, null, this.f88437a, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 2147483391, null);
    }
}
