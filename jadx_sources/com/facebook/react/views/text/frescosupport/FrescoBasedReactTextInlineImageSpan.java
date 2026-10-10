package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import p584r4.C43921a;
import p584r4.C43922b;
import p652u4.C45121a;

/* JADX INFO: loaded from: classes45.dex */
class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {

    @Nullable
    private final Object mCallerContext;

    @Nullable
    private Drawable mDrawable;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private final C45121a<C43921a> mDraweeHolder;
    private ReadableMap mHeaders;
    private int mHeight;
    private String mResizeMode;

    @Nullable
    private TextView mTextView;
    private int mTintColor;
    private Uri mUri;
    private int mWidth;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
        if (this.mDrawable == null) {
            ReactNetworkImageRequest reactNetworkImageRequestFromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.m9851x(this.mUri), this.mHeaders);
            ((C43921a) this.mDraweeHolder.m99732g()).m96777t(getResizeMode(this.mResizeMode));
            this.mDraweeHolder.m99741p(this.mDraweeControllerBuilder.m8640z().mo8617a(this.mDraweeHolder.m99731f()).m8611B(this.mCallerContext).m8613D(reactNetworkImageRequestFromBuilderWithHeaders).build());
            this.mDraweeControllerBuilder.m8640z();
            Drawable drawableM99733h = this.mDraweeHolder.m99733h();
            this.mDrawable = drawableM99733h;
            drawableM99733h.setBounds(0, 0, this.mWidth, this.mHeight);
            int i16 = this.mTintColor;
            if (i16 != 0) {
                this.mDrawable.setColorFilter(i16, PorterDuff.Mode.SRC_IN);
            }
            this.mDrawable.setCallback(this.mTextView);
        }
        canvas.save();
        canvas.translate(f11, ((i14 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.mDrawable.getBounds().bottom - this.mDrawable.getBounds().top) / 2));
        this.mDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    @Nullable
    public Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public int getHeight() {
        return this.mHeight;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i13 = -this.mHeight;
            fontMetricsInt.ascent = i13;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i13;
            fontMetricsInt.bottom = 0;
        }
        return this.mWidth;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onAttachedToWindow() {
        this.mDraweeHolder.m99736k();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onDetachedFromWindow() {
        this.mDraweeHolder.m99737l();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onFinishTemporaryDetach() {
        this.mDraweeHolder.m99736k();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void onStartTemporaryDetach() {
        this.mDraweeHolder.m99737l();
    }

    @Override // com.facebook.react.views.text.internal.span.TextInlineImageSpan
    public void setTextView(TextView textView) {
        this.mTextView = textView;
    }

    public FrescoBasedReactTextInlineImageSpan(Resources resources, int i11, int i12, int i13, @Nullable Uri uri, ReadableMap readableMap, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj, String str) {
        this.mDraweeHolder = new C45121a<>(C43922b.m96784u(resources).m96796a());
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
        this.mTintColor = i13;
        this.mUri = uri == null ? Uri.EMPTY : uri;
        this.mHeaders = readableMap;
        this.mWidth = (int) PixelUtil.toPixelFromDIP(i12);
        this.mHeight = (int) PixelUtil.toPixelFromDIP(i11);
        this.mResizeMode = str;
    }

    private InterfaceC5597q getResizeMode(String str) {
        return ImageResizeMode.toScaleType(str);
    }
}
