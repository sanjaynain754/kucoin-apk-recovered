package com.kubi.kyc.ui.kycv2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42917g;
import p205dn.C36884d;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImagePreviewFragment.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.ui.kycv2.ImagePreviewFragment$loadImage$1", m90122f = "ImagePreviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nImagePreviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewFragment$loadImage$1\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,337:1\n19#2,2:338\n*S KotlinDebug\n*F\n+ 1 ImagePreviewFragment.kt\ncom/kubi/kyc/ui/kycv2/ImagePreviewFragment$loadImage$1\n*L\n254#1:338,2\n*E\n"})
public final class ImagePreviewFragment$loadImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ImagePreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePreviewFragment$loadImage$1(ImagePreviewFragment imagePreviewFragment, Continuation<? super ImagePreviewFragment$loadImage$1> continuation) {
        super(2, continuation);
        this.this$0 = imagePreviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImagePreviewFragment$loadImage$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImagePreviewFragment$loadImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final void m37149f(ImagePreviewFragment imagePreviewFragment, Bitmap bitmap) {
        C36884d c36884dM37142B3;
        UploadImageView3 uploadImageView3;
        if (imagePreviewFragment.getContext() != null && (c36884dM37142B3 = imagePreviewFragment.m37142B3()) != null && (uploadImageView3 = c36884dM37142B3.f81447c) != null) {
            uploadImageView3.m37194c(bitmap);
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.this$0.f31419W);
            if (bitmapDecodeFile == null) {
                return Unit.INSTANCE;
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 16, 16, bitmapDecodeFile.getWidth() - 32, bitmapDecodeFile.getHeight() - 32);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            final ImagePreviewFragment imagePreviewFragment = this.this$0;
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kyc.ui.kycv2.h
                @Override // java.lang.Runnable
                public final void run() {
                    ImagePreviewFragment$loadImage$1.m37149f(imagePreviewFragment, bitmapCreateBitmap);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
