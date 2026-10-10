package com.kubi.mine.lib.p101ui.userinfo;

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
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarCropActivity$initCropImageView$1", m90122f = "AvatarCropActivity.kt", m90123i = {0}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {"imagePath"}, m90127s = {"L$0"})
public final class AvatarCropActivity$initCropImageView$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AvatarCropActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCropActivity$initCropImageView$1(AvatarCropActivity avatarCropActivity, Continuation<? super AvatarCropActivity$initCropImageView$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarCropActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarCropActivity$initCropImageView$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AvatarCropActivity$initCropImageView$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C37980a c37980aM42284W;
        CropImageView cropImageView;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String stringExtra = this.this$0.getIntent().getStringExtra("select_image_path");
            if (stringExtra != null) {
                AvatarImageHelper avatarImageHelper = AvatarImageHelper.f35370a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(stringExtra);
                this.label = 1;
                obj = avatarImageHelper.m42288b(stringExtra, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && (c37980aM42284W = this.this$0.m42284W()) != null && (cropImageView = c37980aM42284W.f85411d) != null) {
            cropImageView.setImageBitmap(bitmap);
        }
        return Unit.INSTANCE;
    }
}
