package com.kubi.payment.p106rn;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.blankj.utilcode.util.C5290q;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: IUnifyPaymentBridge.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.IUnifyPaymentBridge$getVideoThumbnailByte$2", m90122f = "IUnifyPaymentBridge.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IUnifyPaymentBridge$getVideoThumbnailByte$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super byte[]>, Object> {
    final /* synthetic */ String $fileUrl;
    final /* synthetic */ boolean $isRemoteUrl;
    final /* synthetic */ Long $quality;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IUnifyPaymentBridge$getVideoThumbnailByte$2(boolean z11, String str, Long l11, Continuation<? super IUnifyPaymentBridge$getVideoThumbnailByte$2> continuation) {
        super(2, continuation);
        this.$isRemoteUrl = z11;
        this.$fileUrl = str;
        this.$quality = l11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IUnifyPaymentBridge$getVideoThumbnailByte$2(this.$isRemoteUrl, this.$fileUrl, this.$quality, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super byte[]> continuation) {
        return ((IUnifyPaymentBridge$getVideoThumbnailByte$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        StringBuilder sb2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        byte[] bArrM6350a = null;
        try {
            if (this.$isRemoteUrl) {
                mediaMetadataRetriever.setDataSource(C27041f.m66668h(this.$fileUrl), MapsKt.emptyMap());
            } else {
                mediaMetadataRetriever.setDataSource(C27041f.m66668h(this.$fileUrl));
            }
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
            if (frameAtTime != null) {
                Long l11 = this.$quality;
                bArrM6350a = C5290q.m6350a(frameAtTime, Bitmap.CompressFormat.PNG, C27039d.m66651k(l11 != null ? Boxing.boxInt((int) l11.longValue()) : null, 100));
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("getVideoThumbnailByte MediaMetadataRetriever release error: ");
                sb2.append(e.getMessage());
                String string = sb2.toString();
            }
        } catch (Exception e12) {
            C44128b.m97265i("getVideoThumbnailByte error: " + e12.getMessage());
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e13) {
                e = e13;
                sb2 = new StringBuilder();
                sb2.append("getVideoThumbnailByte MediaMetadataRetriever release error: ");
                sb2.append(e.getMessage());
                String string2 = sb2.toString();
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e14) {
                C44128b.m97265i("getVideoThumbnailByte MediaMetadataRetriever release error: " + e14.getMessage());
            }
        }
        return bArrM6350a;
    }
}
