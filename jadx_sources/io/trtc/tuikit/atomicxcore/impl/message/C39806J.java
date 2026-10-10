package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageBody;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.J */
/* JADX INFO: loaded from: classes61.dex */
public final class C39806J extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f88452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39806J(String str) {
        super(1);
        this.f88452a = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MessageBody messageBodyCopy = (MessageBody) obj;
        Intrinsics.checkNotNullParameter(messageBodyCopy, "messageBodyCopy");
        return MessageBody.copy$default(messageBodyCopy, null, null, null, null, 0, 0, 0, null, null, null, null, 0, 0, null, 0, 0, 0, this.f88452a, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 2147352575, null);
    }
}
