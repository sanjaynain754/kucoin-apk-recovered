package com.kubi.mine.lib.p101ui.userinfo;

import android.content.Intent;
import android.graphics.Bitmap;
import com.kubi.mine.lib.view.CropImageView;
import gq.C37980a;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AvatarCropActivity.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarCropActivity$initButtons$2$1", m90122f = "AvatarCropActivity.kt", m90123i = {1}, m90124l = {52, 54}, m90125m = "invokeSuspend", m90126n = {"croppedImage"}, m90127s = {"L$0"})
public final class AvatarCropActivity$initButtons$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AvatarCropActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCropActivity$initButtons$2$1(AvatarCropActivity avatarCropActivity, Continuation<? super AvatarCropActivity$initButtons$2$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarCropActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarCropActivity$initButtons$2$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AvatarCropActivity$initButtons$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            str = (String) obj;
            Intent intent = new Intent();
            intent.putExtra("cropped_image_path", str);
            this.this$0.setResult(-1, intent);
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C37980a c37980aM42284W = this.this$0.m42284W();
        if (c37980aM42284W != null && (cropImageView = c37980aM42284W.f85411d) != null) {
            this.label = 1;
            obj = cropImageView.m42351p(this);
        } else {
            bitmap = null;
            if (bitmap != null) {
                AvatarImageHelper avatarImageHelper = AvatarImageHelper.f35370a;
                AvatarCropActivity avatarCropActivity = this.this$0;
                this.L$0 = SpillingKt.nullOutSpilledVariable(bitmap);
                this.label = 2;
                obj = avatarImageHelper.m42291e(avatarCropActivity, bitmap, "avatar_cache.jpg", this);
            } else {
                str = "";
            }
            Intent intent2 = new Intent();
            intent2.putExtra("cropped_image_path", str);
            this.this$0.setResult(-1, intent2);
            this.this$0.finish();
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
        bitmap = (Bitmap) obj;
        if (bitmap != null) {
            AvatarImageHelper avatarImageHelper2 = AvatarImageHelper.f35370a;
            AvatarCropActivity avatarCropActivity2 = this.this$0;
            this.L$0 = SpillingKt.nullOutSpilledVariable(bitmap);
            this.label = 2;
            obj = avatarImageHelper2.m42291e(avatarCropActivity2, bitmap, "avatar_cache.jpg", this);
        } else {
            str = "";
        }
        Intent intent3 = new Intent();
        intent3.putExtra("cropped_image_path", str);
        this.this$0.setResult(-1, intent3);
        this.this$0.finish();
        return Unit.INSTANCE;
    }
}
