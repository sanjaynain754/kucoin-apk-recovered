package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallEndReason;
import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39474f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f87635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUICallDefine.MediaType f87636b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUICallDefine.CallEndReason f87637c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87638d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39474f(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2) {
        super(1);
        this.f87635a = str;
        this.f87636b = mediaType;
        this.f87637c = callEndReason;
        this.f87638d = str2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallListener notify = (CallListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String str = this.f87635a;
        if (str == null) {
            str = "";
        }
        CallMediaType callMediaTypeM88239a = AbstractC39470b.m88239a(this.f87636b);
        if (callMediaTypeM88239a == null) {
            callMediaTypeM88239a = CallMediaType.Audio;
        }
        CallEndReason callEndReasonM88238a = AbstractC39470b.m88238a(this.f87637c);
        String str2 = this.f87638d;
        notify.onCallEnded(str, callMediaTypeM88239a, callEndReasonM88238a, str2 != null ? str2 : "");
        return Unit.INSTANCE;
    }
}
