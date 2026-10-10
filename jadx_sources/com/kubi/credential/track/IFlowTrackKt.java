package com.kubi.credential.track;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: IFlowTrack.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/credential/track/g;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/credential/track/g;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "credential_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class IFlowTrackKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.kubi.credential.track.g, com.kubi.credential.track.g<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.kubi.credential.track.g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.kubi.credential.track.g] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <T> Object m23447a(@NotNull InterfaceC12480g<T> interfaceC12480g, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        IFlowTrackKt$withTrack$1 iFlowTrackKt$withTrack$1;
        if (continuation instanceof IFlowTrackKt$withTrack$1) {
            iFlowTrackKt$withTrack$1 = (IFlowTrackKt$withTrack$1) continuation;
            int i11 = iFlowTrackKt$withTrack$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iFlowTrackKt$withTrack$1.label = i11 - Integer.MIN_VALUE;
            } else {
                iFlowTrackKt$withTrack$1 = new IFlowTrackKt$withTrack$1(continuation);
            }
        } else {
            iFlowTrackKt$withTrack$1 = new IFlowTrackKt$withTrack$1(continuation);
        }
        Object objInvoke = iFlowTrackKt$withTrack$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = iFlowTrackKt$withTrack$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                interfaceC12480g.mo23450b();
                iFlowTrackKt$withTrack$1.L$0 = interfaceC12480g;
                iFlowTrackKt$withTrack$1.label = 1;
                objInvoke = function1.invoke(iFlowTrackKt$withTrack$1);
                interfaceC12480g = interfaceC12480g;
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z11 = (InterfaceC12480g<T>) ((InterfaceC12480g) iFlowTrackKt$withTrack$1.L$0);
                ResultKt.throwOnFailure(objInvoke);
                interfaceC12480g = z11;
            }
            ((InterfaceC12480g) interfaceC12480g).mo23451c(objInvoke);
            return objInvoke;
        } catch (Throwable th2) {
            interfaceC12480g.mo23449a(th2);
            throw th2;
        }
    }
}
