package com.kubi.mine.lib.p101ui.userinfo;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mine.lib.exception.MineException;
import kotlinx.coroutines.InterfaceC41709m0;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AvatarImageHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarImageHelper$isNeedRotateBitmap$2", m90122f = "AvatarImageHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAvatarImageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarImageHelper.kt\ncom/kubi/mine/lib/ui/userinfo/AvatarImageHelper$isNeedRotateBitmap$2\n+ 2 MineIssue.kt\ncom/kubi/mine/lib/exception/MineIssueKt\n*L\n1#1,141:1\n44#2,2:142\n*S KotlinDebug\n*F\n+ 1 AvatarImageHelper.kt\ncom/kubi/mine/lib/ui/userinfo/AvatarImageHelper$isNeedRotateBitmap$2\n*L\n47#1:142,2\n*E\n"})
public final class AvatarImageHelper$isNeedRotateBitmap$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $imagePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageHelper$isNeedRotateBitmap$2(String str, Continuation<? super AvatarImageHelper$isNeedRotateBitmap$2> continuation) {
        super(2, continuation);
        this.$imagePath = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarImageHelper$isNeedRotateBitmap$2(this.$imagePath, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((AvatarImageHelper$isNeedRotateBitmap$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z11 = false;
            try {
                boolean z12 = true;
                int attributeInt = new ExifInterface(this.$imagePath).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                if (attributeInt != 3 && attributeInt != 6 && attributeInt != 8) {
                    z12 = false;
                }
                C44128b.m97259c("AvatarImageHelper", "isNeedRotateBitmap orientation=" + attributeInt + " needRotate=" + z12);
                z11 = z12;
            } catch (Exception e11) {
                C43846g.m96568c(new MineException(e11, "AvatarImageHelper", false, null, 8, null), null, 2, null);
            }
            return Boxing.boxBoolean(z11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
