package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39475g extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f87639a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUICallDefine.MediaType f87640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUICallDefine.CallObserverExtraInfo f87641c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39475g(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallObserverExtraInfo callObserverExtraInfo) {
        super(1);
        this.f87639a = str;
        this.f87640b = mediaType;
        this.f87641c = callObserverExtraInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallListener notify = (CallListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String str = this.f87639a;
        if (str == null) {
            str = "";
        }
        CallMediaType callMediaTypeM88239a = AbstractC39470b.m88239a(this.f87640b);
        if (callMediaTypeM88239a == null) {
            callMediaTypeM88239a = CallMediaType.Audio;
        }
        TUICallDefine.CallObserverExtraInfo callObserverExtraInfo = this.f87641c;
        String str2 = callObserverExtraInfo != null ? callObserverExtraInfo.userData : null;
        notify.onCallReceived(str, callMediaTypeM88239a, str2 != null ? str2 : "");
        return Unit.INSTANCE;
    }
}
