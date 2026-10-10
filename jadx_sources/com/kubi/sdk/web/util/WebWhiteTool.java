package com.kubi.sdk.web.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
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

/* JADX INFO: compiled from: WebWhiteTool.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0018\u001a\u00020\u0004*\u00020\u000e2!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00040\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/sdk/web/util/WebWhiteTool;", "", "<init>", "()V", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "()Z", "Landroid/webkit/WebView;", "Lcom/kubi/sdk/web/util/WebWhiteTool$a;", "d", "(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "c", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "color", TUIConstants.TIMPush.NOTIFICATION.ACTION, "e", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V", "b", "Z", "isNetworkAvailable", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WebWhiteTool {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WebWhiteTool f48551a = new WebWhiteTool();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isNetworkAvailable;

    /* JADX INFO: renamed from: com.kubi.sdk.web.util.WebWhiteTool$a */
    /* JADX INFO: compiled from: WebWhiteTool.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/web/util/WebWhiteTool$a;", "", "", "majorColor", "", "rate", "<init>", "(IF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getMajorColor", "b", "F", "()F", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class C24325a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int majorColor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final float rate;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C24325a)) {
                return false;
            }
            C24325a c24325a = (C24325a) other;
            return this.majorColor == c24325a.majorColor && Float.compare(this.rate, c24325a.rate) == 0;
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

        public C24325a(int i11, float f11) {
            this.majorColor = i11;
            this.rate = f11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m58853d(@NotNull WebView webView, @NotNull Continuation<? super C24325a> continuation) throws Throwable {
        WebWhiteTool$checkWhitePageRate$1 webWhiteTool$checkWhitePageRate$1;
        Bitmap bitmap;
        if (continuation instanceof WebWhiteTool$checkWhitePageRate$1) {
            webWhiteTool$checkWhitePageRate$1 = (WebWhiteTool$checkWhitePageRate$1) continuation;
            int i11 = webWhiteTool$checkWhitePageRate$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                webWhiteTool$checkWhitePageRate$1.label = i11 - Integer.MIN_VALUE;
            } else {
                webWhiteTool$checkWhitePageRate$1 = new WebWhiteTool$checkWhitePageRate$1(this, continuation);
            }
        } else {
            webWhiteTool$checkWhitePageRate$1 = new WebWhiteTool$checkWhitePageRate$1(this, continuation);
        }
        Object objM58852c = webWhiteTool$checkWhitePageRate$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = webWhiteTool$checkWhitePageRate$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM58852c);
            float f11 = 1.0f / 8;
            try {
                Bitmap bitmap2 = Bitmap.createBitmap(webView.getWidth() / 8, webView.getHeight() / 8, Bitmap.Config.RGB_565);
                try {
                    Rect rect = new Rect();
                    webView.getLocalVisibleRect(rect);
                    Canvas canvas = new Canvas(bitmap2);
                    canvas.scale(f11, f11);
                    canvas.translate(-rect.left, -rect.top);
                    webView.draw(canvas);
                    Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                    webWhiteTool$checkWhitePageRate$1.L$0 = bitmap2;
                    webWhiteTool$checkWhitePageRate$1.label = 1;
                    objM58852c = m58852c(bitmap2, webWhiteTool$checkWhitePageRate$1);
                    if (objM58852c == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = bitmap2;
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = bitmap2;
                    bitmap.recycle();
                    throw th;
                }
            } catch (Exception e11) {
                C44128b.m97263g("WebWhiteTool", e11);
                return null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) webWhiteTool$checkWhitePageRate$1.L$0;
            try {
                ResultKt.throwOnFailure(objM58852c);
            } catch (Throwable th3) {
                th = th3;
                bitmap.recycle();
                throw th;
            }
        }
        C24325a c24325a = (C24325a) objM58852c;
        bitmap.recycle();
        return c24325a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m58856g() {
        return isNetworkAvailable;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m58852c(@NotNull Bitmap bitmap, @NotNull Continuation<? super C24325a> continuation) {
        return C41686h.m91049g(C41782z0.m91391a(), new WebWhiteTool$calculateRate$2(bitmap, null), continuation);
    }

    /* JADX INFO: renamed from: e */
    public final void m58854e(Bitmap bitmap, Function1<? super Integer, Unit> function1) {
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
    public final Object m58855f(@NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94119a(), new WebWhiteTool$initNetworkAailable$2(null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
