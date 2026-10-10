package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.C9149R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
public class ViewfinderView extends View {

    /* JADX INFO: renamed from: n */
    public static final int[] f13317n = {0, 64, 128, 192, 255, 192, 128, 64};

    /* JADX INFO: renamed from: b */
    public final Paint f13318b;

    /* JADX INFO: renamed from: c */
    public Bitmap f13319c;

    /* JADX INFO: renamed from: d */
    public final int f13320d;

    /* JADX INFO: renamed from: e */
    public final int f13321e;

    /* JADX INFO: renamed from: f */
    public final int f13322f;

    /* JADX INFO: renamed from: g */
    public final int f13323g;

    /* JADX INFO: renamed from: h */
    public int f13324h;

    /* JADX INFO: renamed from: i */
    public List<ResultPoint> f13325i;

    /* JADX INFO: renamed from: j */
    public List<ResultPoint> f13326j;

    /* JADX INFO: renamed from: k */
    public CameraPreview f13327k;

    /* JADX INFO: renamed from: l */
    public Rect f13328l;

    /* JADX INFO: renamed from: m */
    public Rect f13329m;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    public class C9296a implements CameraPreview.InterfaceC9293f {
        public C9296a() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: a */
        public void mo14342a() {
            ViewfinderView.this.m14362b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: b */
        public void mo14343b() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: d */
        public void mo14345d() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: e */
        public void mo14346e() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: c */
        public void mo14344c(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14361a(ResultPoint resultPoint) {
        if (this.f13325i.size() < 20) {
            this.f13325i.add(resultPoint);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14362b() {
        CameraPreview cameraPreview = this.f13327k;
        if (cameraPreview == null) {
            return;
        }
        Rect framingRect = cameraPreview.getFramingRect();
        Rect previewFramingRect = this.f13327k.getPreviewFramingRect();
        if (framingRect == null || previewFramingRect == null) {
            return;
        }
        this.f13328l = framingRect;
        this.f13329m = previewFramingRect;
    }

    public void setCameraPreview(CameraPreview cameraPreview) {
        this.f13327k = cameraPreview;
        cameraPreview.m14326i(new C9296a());
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13318b = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9149R.styleable.zxing_finder);
        this.f13320d = typedArrayObtainStyledAttributes.getColor(C9149R.styleable.zxing_finder_zxing_viewfinder_mask, resources.getColor(C9149R.color.zxing_viewfinder_mask));
        this.f13321e = typedArrayObtainStyledAttributes.getColor(C9149R.styleable.zxing_finder_zxing_result_view, resources.getColor(C9149R.color.zxing_result_view));
        this.f13322f = typedArrayObtainStyledAttributes.getColor(C9149R.styleable.zxing_finder_zxing_viewfinder_laser, resources.getColor(C9149R.color.zxing_viewfinder_laser));
        this.f13323g = typedArrayObtainStyledAttributes.getColor(C9149R.styleable.zxing_finder_zxing_possible_result_points, resources.getColor(C9149R.color.zxing_possible_result_points));
        typedArrayObtainStyledAttributes.recycle();
        this.f13324h = 0;
        this.f13325i = new ArrayList(20);
        this.f13326j = new ArrayList(20);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect;
        int i11;
        m14362b();
        Rect rect2 = this.f13328l;
        if (rect2 != null && (rect = this.f13329m) != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Paint paint = this.f13318b;
            if (this.f13319c != null) {
                i11 = this.f13321e;
            } else {
                i11 = this.f13320d;
            }
            paint.setColor(i11);
            float f11 = width;
            canvas.drawRect(0.0f, 0.0f, f11, rect2.top, this.f13318b);
            canvas.drawRect(0.0f, rect2.top, rect2.left, rect2.bottom + 1, this.f13318b);
            canvas.drawRect(rect2.right + 1, rect2.top, f11, rect2.bottom + 1, this.f13318b);
            canvas.drawRect(0.0f, rect2.bottom + 1, f11, height, this.f13318b);
            if (this.f13319c != null) {
                this.f13318b.setAlpha(160);
                canvas.drawBitmap(this.f13319c, (Rect) null, rect2, this.f13318b);
                return;
            }
            this.f13318b.setColor(this.f13322f);
            Paint paint2 = this.f13318b;
            int[] iArr = f13317n;
            paint2.setAlpha(iArr[this.f13324h]);
            this.f13324h = (this.f13324h + 1) % iArr.length;
            int iHeight = (rect2.height() / 2) + rect2.top;
            canvas.drawRect(rect2.left + 2, iHeight - 1, rect2.right - 1, iHeight + 2, this.f13318b);
            float fWidth = rect2.width() / rect.width();
            float fHeight = rect2.height() / rect.height();
            int i12 = rect2.left;
            int i13 = rect2.top;
            if (!this.f13326j.isEmpty()) {
                this.f13318b.setAlpha(80);
                this.f13318b.setColor(this.f13323g);
                for (ResultPoint resultPoint : this.f13326j) {
                    canvas.drawCircle(((int) (resultPoint.getX() * fWidth)) + i12, ((int) (resultPoint.getY() * fHeight)) + i13, 3.0f, this.f13318b);
                }
                this.f13326j.clear();
            }
            if (!this.f13325i.isEmpty()) {
                this.f13318b.setAlpha(160);
                this.f13318b.setColor(this.f13323g);
                for (ResultPoint resultPoint2 : this.f13325i) {
                    canvas.drawCircle(((int) (resultPoint2.getX() * fWidth)) + i12, ((int) (resultPoint2.getY() * fHeight)) + i13, 6.0f, this.f13318b);
                }
                List<ResultPoint> list = this.f13325i;
                List<ResultPoint> list2 = this.f13326j;
                this.f13325i = list2;
                this.f13326j = list;
                list2.clear();
            }
            postInvalidateDelayed(80L, rect2.left - 6, rect2.top - 6, rect2.right + 6, rect2.bottom + 6);
        }
    }
}
