package com.kubi.mine.lib.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CropImageView.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.view.CropImageView$cropSquareBitmap$2", m90122f = "CropImageView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCropImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropImageView.kt\ncom/kubi/mine/lib/view/CropImageView$cropSquareBitmap$2\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,215:1\n90#2,6:216\n*S KotlinDebug\n*F\n+ 1 CropImageView.kt\ncom/kubi/mine/lib/view/CropImageView$cropSquareBitmap$2\n*L\n159#1:216,6\n*E\n"})
public final class CropImageView$cropSquareBitmap$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    int label;
    final /* synthetic */ CropImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropImageView$cropSquareBitmap$2(CropImageView cropImageView, Continuation<? super CropImageView$cropSquareBitmap$2> continuation) {
        super(2, continuation);
        this.this$0 = cropImageView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CropImageView$cropSquareBitmap$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((CropImageView$cropSquareBitmap$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = this.this$0.f35426b;
            if (bitmap == null || (i11 = (int) (this.this$0.f35432h * 2)) <= 0) {
                return null;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Matrix matrix = new Matrix();
            matrix.postScale(this.this$0.f35435k, this.this$0.f35435k);
            matrix.postTranslate(this.this$0.f35438n - (this.this$0.f35433i - this.this$0.f35432h), this.this$0.f35439o - (this.this$0.f35434j - this.this$0.f35432h));
            canvas.drawBitmap(bitmap, matrix, this.this$0.f35427c);
            return bitmapCreateBitmap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
