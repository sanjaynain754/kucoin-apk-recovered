package com.reactnativecommunity.imageeditor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
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

/* JADX INFO: compiled from: ImageEditorModuleImpl.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {2, 0, 0})
@DebugMetadata(m90121c = "com.reactnativecommunity.imageeditor.ImageEditorModuleImpl$cropImage$1", m90122f = "ImageEditorModuleImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ImageEditorModuleImpl$cropImage$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $format;
    final /* synthetic */ HashMap<String, Object> $headers;
    final /* synthetic */ int $height;
    final /* synthetic */ boolean $includeBase64;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ int $quality;
    final /* synthetic */ int $targetHeight;
    final /* synthetic */ int $targetWidth;
    final /* synthetic */ String $uri;
    final /* synthetic */ int $width;

    /* JADX INFO: renamed from: $x */
    final /* synthetic */ int f55866$x;

    /* JADX INFO: renamed from: $y */
    final /* synthetic */ int f55867$y;
    int label;
    final /* synthetic */ ImageEditorModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEditorModuleImpl$cropImage$1(int i11, int i12, ImageEditorModuleImpl imageEditorModuleImpl, String str, int i13, int i14, int i15, int i16, HashMap<String, Object> map, String str2, int i17, Promise promise, boolean z11, Continuation<? super ImageEditorModuleImpl$cropImage$1> continuation) {
        super(2, continuation);
        this.$targetWidth = i11;
        this.$targetHeight = i12;
        this.this$0 = imageEditorModuleImpl;
        this.$uri = str;
        this.f55866$x = i13;
        this.f55867$y = i14;
        this.$width = i15;
        this.$height = i16;
        this.$headers = map;
        this.$format = str2;
        this.$quality = i17;
        this.$promise = promise;
        this.$includeBase64 = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageEditorModuleImpl$cropImage$1(this.$targetWidth, this.$targetHeight, this.this$0, this.$uri, this.f55866$x, this.f55867$y, this.$width, this.$height, this.$headers, this.$format, this.$quality, this.$promise, this.$includeBase64, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((ImageEditorModuleImpl$cropImage$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i12 = this.$targetWidth;
                Bitmap bitmapM68119m = (i12 <= 0 || (i11 = this.$targetHeight) <= 0) ? this.this$0.m68119m(options, this.$uri, this.f55866$x, this.f55867$y, this.$width, this.$height, this.$headers) : this.this$0.m68117k(options, this.$uri, this.f55866$x, this.f55867$y, this.$width, this.$height, i12, i11, this.$headers);
                if (bitmapM68119m != null) {
                    ImageEditorModuleImpl.Companion companion = ImageEditorModuleImpl.INSTANCE;
                    String strM68130h = companion.m68130h(options, this.$format);
                    File fileM68124b = companion.m68124b(this.this$0.reactContext, strM68130h);
                    companion.m68134l(bitmapM68119m, strM68130h, fileM68124b, this.$quality);
                    if (Intrinsics.areEqual(strM68130h, "image/jpeg")) {
                        ReactApplicationContext reactApplicationContext = this.this$0.reactContext;
                        Uri uri = Uri.parse(this.$uri);
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        companion.m68123a(reactApplicationContext, uri, fileM68124b);
                    }
                    this.$promise.resolve(companion.m68132j(fileM68124b, bitmapM68119m, strM68130h, this.$includeBase64));
                    return Unit.INSTANCE;
                }
                throw new IOException("Cannot decode bitmap: " + this.$uri);
            } catch (Exception e11) {
                this.$promise.reject(e11);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
