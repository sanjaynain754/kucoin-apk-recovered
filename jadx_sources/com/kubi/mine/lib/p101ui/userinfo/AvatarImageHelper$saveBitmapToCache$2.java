package com.kubi.mine.lib.p101ui.userinfo;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.media3.datasource.cache.CacheDataSink;
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: compiled from: AvatarImageHelper.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.userinfo.AvatarImageHelper$saveBitmapToCache$2", m90122f = "AvatarImageHelper.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AvatarImageHelper$saveBitmapToCache$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fileName;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarImageHelper$saveBitmapToCache$2(Context context, String str, Bitmap bitmap, Continuation<? super AvatarImageHelper$saveBitmapToCache$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$fileName = str;
        this.$bitmap = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AvatarImageHelper$saveBitmapToCache$2(this.$context, this.$fileName, this.$bitmap, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((AvatarImageHelper$saveBitmapToCache$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            File file = new File(this.$context.getCacheDir(), this.$fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap bitmap = this.$bitmap;
            try {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                bitmap.compress(compressFormat, 100, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                C44128b.m97259c("AvatarImageHelper", "saveBitmapToCache filePath=" + file.getAbsolutePath());
                long jM42287a = AvatarImageHelper.f35370a.m42287a(this.$context, this.$fileName);
                if (jM42287a > CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        this.$bitmap.compress(compressFormat, 50, fileOutputStream2);
                        CloseableKt.closeFinally(fileOutputStream2, null);
                        C44128b.m97259c("AvatarImageHelper", "saveBitmapToCache file size too large: " + jM42287a + " bytes");
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(fileOutputStream2, th2);
                            throw th3;
                        }
                    }
                }
                return file.getAbsolutePath();
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(fileOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Exception e11) {
            C44128b.m97261e("AvatarImageHelper", "saveBitmapToCache error: " + e11.getMessage());
            return null;
        }
    }
}
