package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallEndReason;
import io.trtc.tuikit.atomicxcore.api.call.CallListener;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39473e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f87631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUICallDefine.MediaType f87632b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUICallDefine.CallEndReason f87633c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f87634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39473e(String str, TUICallDefine.MediaType mediaType, TUICallDefine.CallEndReason callEndReason, String str2) {
        super(1);
        this.f87631a = str;
        this.f87632b = mediaType;
        this.f87633c = callEndReason;
        this.f87634d = str2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallListener notify = (CallListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        String str = this.f87631a;
        if (str == null) {
            str = "";
        }
        CallMediaType callMediaTypeM88239a = AbstractC39470b.m88239a(this.f87632b);
        if (callMediaTypeM88239a == null) {
            callMediaTypeM88239a = CallMediaType.Audio;
        }
        CallEndReason callEndReasonM88238a = AbstractC39470b.m88238a(this.f87633c);
        String str2 = this.f87634d;
        notify.onCallEnded(str, callMediaTypeM88239a, callEndReasonM88238a, str2 != null ? str2 : "");
        return Unit.INSTANCE;
    }
}
