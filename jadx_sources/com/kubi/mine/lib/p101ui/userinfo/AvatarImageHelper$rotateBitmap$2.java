package com.kubi.mine.lib.p101ui.userinfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: AvatarImageHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarImageHelper$rotateBitmap$2", m90122f = "AvatarImageHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AvatarImageHelper$rotateBitmap$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imagePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageHelper$rotateBitmap$2(String str, Continuation<? super AvatarImageHelper$rotateBitmap$2> continuation) {
        super(2, continuation);
        this.$imagePath = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarImageHelper$rotateBitmap$2(this.$imagePath, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((AvatarImageHelper$rotateBitmap$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.$imagePath);
            if (bitmapDecodeFile == null) {
                return null;
            }
            int attributeInt = new ExifInterface(this.$imagePath).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
            Matrix matrix = new Matrix();
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    if (attributeInt == 8) {
                        matrix.postRotate(270.0f);
                    }
                } else {
                    matrix.postRotate(90.0f);
                }
            } else {
                matrix.postRotate(180.0f);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            bitmapDecodeFile.recycle();
            C44128b.m97259c("AvatarImageHelper", "rotateBitmap orientation=" + attributeInt);
            return bitmapCreateBitmap;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
