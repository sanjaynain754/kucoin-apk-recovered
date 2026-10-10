package com.kubi.sdk.pkg.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: WhiteCheckTool.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0016\u001a\u00020\u0004*\u00020\u000f2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00040\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/WhiteCheckTool;", "", "<init>", "()V", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Z", "Landroid/view/View;", "checkCurView", "Lcom/kubi/sdk/pkg/util/WhiteCheckTool$a;", "d", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "color", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V", "bitmap", "c", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "isNetworkAvailable", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WhiteCheckTool {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isNetworkAvailable;

    /* JADX INFO: renamed from: com.kubi.sdk.pkg.util.WhiteCheckTool$a */
    /* JADX INFO: compiled from: WhiteCheckTool.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/pkg/util/WhiteCheckTool$a;", "", "", "majorColor", "", "rate", "<init>", "(IF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getMajorColor", "b", "F", "()F", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class C23981a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int majorColor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final float rate;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C23981a)) {
                return false;
            }
            C23981a c23981a = (C23981a) other;
            return this.majorColor == c23981a.majorColor && Float.compare(this.rate, c23981a.rate) == 0;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getRate() {
            return this.rate;
        }

        public int hashCode() {
            return (Integer.hashCode(this.majorColor) * 31) + Float.hashCode(this.rate);
        }

        @NotNull
        public String toString() {
            return "color=#" + Util.toHexString(this.majorColor) + '(' + this.rate + "%)";
        }

        public C23981a(int i11, float f11) {
            this.majorColor = i11;
            this.rate = f11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m57857d(@NotNull View view, @NotNull Continuation<? super C23981a> continuation) {
        WhiteCheckTool$checkWhitePageRate$1 whiteCheckTool$checkWhitePageRate$1;
        Bitmap bitmap;
        if (continuation instanceof WhiteCheckTool$checkWhitePageRate$1) {
            whiteCheckTool$checkWhitePageRate$1 = (WhiteCheckTool$checkWhitePageRate$1) continuation;
            int i11 = whiteCheckTool$checkWhitePageRate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                whiteCheckTool$checkWhitePageRate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                whiteCheckTool$checkWhitePageRate$1 = new WhiteCheckTool$checkWhitePageRate$1(this, continuation);
            }
        } else {
            whiteCheckTool$checkWhitePageRate$1 = new WhiteCheckTool$checkWhitePageRate$1(this, continuation);
        }
        Object objM57856c = whiteCheckTool$checkWhitePageRate$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = whiteCheckTool$checkWhitePageRate$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM57856c);
                float f11 = 1.0f / 8;
                Bitmap bitmap2 = Bitmap.createBitmap(view.getWidth() / 8, view.getHeight() / 8, Bitmap.Config.RGB_565);
                try {
                    Rect rect = new Rect();
                    view.getLocalVisibleRect(rect);
                    Canvas canvas = new Canvas(bitmap2);
                    canvas.scale(f11, f11);
                    canvas.translate(-rect.left, -rect.top);
                    view.draw(canvas);
                    Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                    whiteCheckTool$checkWhitePageRate$1.L$0 = bitmap2;
                    whiteCheckTool$checkWhitePageRate$1.label = 1;
                    objM57856c = m57856c(bitmap2, whiteCheckTool$checkWhitePageRate$1);
                    if (objM57856c == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = bitmap2;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = bitmap2;
                    bitmap.recycle();
                    throw th;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap = (Bitmap) whiteCheckTool$checkWhitePageRate$1.L$0;
                try {
                    ResultKt.throwOnFailure(objM57856c);
                } catch (Throwable th3) {
                    th = th3;
                    bitmap.recycle();
                    throw th;
                }
            }
            C23981a c23981a = (C23981a) objM57856c;
            bitmap.recycle();
            return c23981a;
        } catch (Throwable th4) {
            C44128b.m97262f("WebWhiteTool", "checkWhitePageRate has some error", th4);
            return null;
        }
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsNetworkAvailable() {
        return this.isNetworkAvailable;
    }

    /* JADX INFO: renamed from: c */
    public final Object m57856c(Bitmap bitmap, Continuation<? super C23981a> continuation) {
        return C41686h.m91049g(C42911a.m94119a(), new WhiteCheckTool$calculateRate$2(this, bitmap, null), continuation);
    }

    /* JADX INFO: renamed from: e */
    public final void m57858e(Bitmap bitmap, Function1<? super Integer, Unit> function1) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        for (int i11 = 0; i11 < height; i11++) {
            for (int i12 = 0; i12 < width; i12++) {
                function1.invoke(Integer.valueOf(bitmap.getPixel(i12, i11)));
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m57859f(@NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94119a(), new WhiteCheckTool$initNetworkAailable$2(this, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
