package com.kubi.mine.lib.p101ui.userinfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AvatarImageHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarImageHelper$createRotatedBitmapIfNeeded$2", m90122f = "AvatarImageHelper.kt", m90123i = {1}, m90124l = {88, 90}, m90125m = "invokeSuspend", m90126n = {"needRotate"}, m90127s = {"Z$0"})
public final class AvatarImageHelper$createRotatedBitmapIfNeeded$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $imagePath;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageHelper$createRotatedBitmapIfNeeded$2(String str, Continuation<? super AvatarImageHelper$createRotatedBitmapIfNeeded$2> continuation) {
        super(2, continuation);
        this.$imagePath = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarImageHelper$createRotatedBitmapIfNeeded$2(this.$imagePath, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((AvatarImageHelper$createRotatedBitmapIfNeeded$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
            return (Bitmap) obj;
        }
        ResultKt.throwOnFailure(obj);
        AvatarImageHelper avatarImageHelper = AvatarImageHelper.f35370a;
        String str = this.$imagePath;
        this.label = 1;
        obj = avatarImageHelper.m42289c(str, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            AvatarImageHelper avatarImageHelper2 = AvatarImageHelper.f35370a;
            String str2 = this.$imagePath;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            obj = avatarImageHelper2.m42290d(str2, this);
        } else {
            return BitmapFactory.decodeFile(this.$imagePath);
        }
    }
}
