package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.AbstractC0110a;
import p251f4.InterfaceC37351b;
import p392k4.C40889d;
import p632t5.AbstractC44692b;
import p651u3.C45106i;
import p747x3.C45999a;
import p749x5.InterfaceC46070d;
import p749x5.InterfaceC46071e;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class ImageView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public SVGLength f12985b;

    /* JADX INFO: renamed from: c */
    public SVGLength f12986c;

    /* JADX INFO: renamed from: d */
    public SVGLength f12987d;

    /* JADX INFO: renamed from: e */
    public SVGLength f12988e;

    /* JADX INFO: renamed from: f */
    public String f12989f;

    /* JADX INFO: renamed from: g */
    public int f12990g;

    /* JADX INFO: renamed from: h */
    public int f12991h;

    /* JADX INFO: renamed from: i */
    public String f12992i;

    /* JADX INFO: renamed from: j */
    public int f12993j;

    /* JADX INFO: renamed from: k */
    public final AtomicBoolean f12994k;

    /* JADX INFO: renamed from: com.horcrux.svg.ImageView$a */
    public class C9191a extends AbstractC44692b {
        public C9191a() {
        }

        @Override // p632t5.AbstractC44692b
        /* JADX INFO: renamed from: a */
        public void mo14068a(Bitmap bitmap) {
            ImageView imageView = ImageView.this;
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(imageView.mContext, imageView.getId());
            int surfaceId = UIManagerHelper.getSurfaceId(ImageView.this);
            int id2 = ImageView.this.getId();
            ImageView imageView2 = ImageView.this;
            eventDispatcherForReactTag.dispatchEvent(new SvgLoadEvent(surfaceId, id2, imageView2.mContext, imageView2.f12989f, bitmap.getWidth(), bitmap.getHeight()));
            ImageView.this.f12994k.set(false);
            SvgView svgView = ImageView.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }

        @Override // p251f4.AbstractC37350a
        public void onFailureImpl(InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> interfaceC37351b) {
            ImageView.this.f12994k.set(false);
            C45999a.m101491L(ReactConstants.TAG, interfaceC37351b.mo8590c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f12994k.get()) {
            return;
        }
        ImagePipeline imagePipelineM89525a = C40889d.m89525a();
        ImageRequest imageRequestFromUri = ImageRequest.fromUri(new ImageSource(this.mContext, this.f12989f).getUri());
        if (imagePipelineM89525a.m9231u(imageRequestFromUri)) {
            m14067p(imagePipelineM89525a, imageRequestFromUri, canvas, paint, f11 * this.mOpacity);
        } else {
            m14061j(imagePipelineM89525a, imageRequestFromUri);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        this.mPath = path;
        path.addRect(m14060i(), Path.Direction.CW);
        return this.mPath;
    }

    /* JADX INFO: renamed from: h */
    public final void m14059h(Canvas canvas, Paint paint, Bitmap bitmap, float f11) {
        if (this.f12990g == 0 || this.f12991h == 0) {
            this.f12990g = bitmap.getWidth();
            this.f12991h = bitmap.getHeight();
        }
        RectF rectFM14060i = m14060i();
        RectF rectF = new RectF(0.0f, 0.0f, this.f12990g, this.f12991h);
        C9251t.m14287a(rectF, rectFM14060i, this.f12992i, this.f12993j).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f11 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    /* JADX INFO: renamed from: i */
    public final RectF m14060i() {
        double dRelativeOnWidth = relativeOnWidth(this.f12985b);
        double dRelativeOnHeight = relativeOnHeight(this.f12986c);
        double dRelativeOnWidth2 = relativeOnWidth(this.f12987d);
        double dRelativeOnHeight2 = relativeOnHeight(this.f12988e);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f12990g * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f12991h * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    /* JADX INFO: renamed from: j */
    public final void m14061j(ImagePipeline imagePipeline, ImageRequest imageRequest) {
        this.f12994k.set(true);
        imagePipeline.m9222k(imageRequest, this.mContext).mo8589b(new C9191a(), C45106i.m99726g());
    }

    /* JADX INFO: renamed from: l */
    public void m14063l(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f12989f = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f12990g = readableMap.getInt("width");
                this.f12991h = readableMap.getInt("height");
            } else {
                this.f12990g = 0;
                this.f12991h = 0;
            }
            if (Uri.parse(this.f12989f).getScheme() == null) {
                ResourceDrawableIdHelper.getInstance().getResourceDrawableUri(this.mContext, this.f12989f);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14067p(ImagePipeline imagePipeline, ImageRequest imageRequest, Canvas canvas, Paint paint, float f11) {
        InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> interfaceC37351bM9225o = imagePipeline.m9225o(imageRequest, this.mContext);
        try {
            try {
                AbstractC0110a<InterfaceC46071e> result = interfaceC37351bM9225o.getResult();
                try {
                    if (result == null) {
                        interfaceC37351bM9225o.close();
                        return;
                    }
                    try {
                        InterfaceC46071e interfaceC46071eM565l = result.m565l();
                        if (!(interfaceC46071eM565l instanceof InterfaceC46070d)) {
                            AbstractC0110a.m555j(result);
                            interfaceC37351bM9225o.close();
                            return;
                        }
                        Bitmap bitmapMo101544K = ((InterfaceC46070d) interfaceC46071eM565l).mo101544K();
                        if (bitmapMo101544K == null) {
                            AbstractC0110a.m555j(result);
                            interfaceC37351bM9225o.close();
                        } else {
                            m14059h(canvas, paint, bitmapMo101544K, f11);
                            AbstractC0110a.m555j(result);
                            interfaceC37351bM9225o.close();
                        }
                    } catch (Exception e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (Throwable th2) {
                    AbstractC0110a.m555j(result);
                    throw th2;
                }
            } catch (Exception e12) {
                throw new IllegalStateException(e12);
            }
        } catch (Throwable th3) {
            interfaceC37351bM9225o.close();
            throw th3;
        }
    }

    public void setAlign(String str) {
        this.f12992i = str;
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f12993j = i11;
        invalidate();
    }

    public ImageView(ReactContext reactContext) {
        super(reactContext);
        this.f12994k = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: k */
    public void m14062k(Dynamic dynamic) {
        this.f12988e = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m14064m(Dynamic dynamic) {
        this.f12987d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public void m14065n(Dynamic dynamic) {
        this.f12985b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m14066o(Dynamic dynamic) {
        this.f12986c = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
