package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.C9149R;
import com.google.zxing.client.android.DecodeFormatManager;
import com.google.zxing.client.android.DecodeHintManager;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p037b9.C4509c;
import p037b9.C4514h;
import p037b9.InterfaceC4507a;

/* JADX INFO: loaded from: classes56.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public BarcodeView f13310b;

    /* JADX INFO: renamed from: c */
    public ViewfinderView f13311c;

    /* JADX INFO: renamed from: d */
    public TextView f13312d;

    /* JADX INFO: renamed from: e */
    public ImageView f13313e;

    /* JADX INFO: renamed from: f */
    public InterfaceC9294a f13314f;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface InterfaceC9294a {
        /* JADX INFO: renamed from: i */
        void mo14359i();

        /* JADX INFO: renamed from: o */
        void mo14360o();
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    public class C9295b implements InterfaceC4507a {

        /* JADX INFO: renamed from: a */
        public InterfaceC4507a f13315a;

        public C9295b(InterfaceC4507a interfaceC4507a) {
            this.f13315a = interfaceC4507a;
        }

        @Override // p037b9.InterfaceC4507a
        /* JADX INFO: renamed from: a */
        public void mo4317a(C4509c c4509c) {
            this.f13315a.mo4317a(c4509c);
        }

        @Override // p037b9.InterfaceC4507a
        /* JADX INFO: renamed from: b */
        public void mo4318b(List<ResultPoint> list) {
            Iterator<ResultPoint> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f13311c.m14361a(it.next());
            }
            this.f13315a.mo4318b(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        m14351d();
    }

    /* JADX INFO: renamed from: d */
    public final void m14351d() {
        m14352e(null);
    }

    /* JADX INFO: renamed from: a */
    public static void m14348a(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(1);
        scaleAnimation.setInterpolator(new LinearInterpolator());
        scaleAnimation.setDuration(1200L);
        view.startAnimation(scaleAnimation);
    }

    /* JADX INFO: renamed from: c */
    public void m14350c(InterfaceC4507a interfaceC4507a) {
        this.f13310b.m14307I(new C9295b(interfaceC4507a));
    }

    /* JADX INFO: renamed from: g */
    public void m14354g() {
        this.f13310b.mo14312u();
        try {
            if (this.f13313e.getAnimation() != null) {
                this.f13313e.getAnimation().cancel();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C9149R.id.zxing_barcode_surface);
    }

    public TextView getStatusView() {
        return this.f13312d;
    }

    public ViewfinderView getViewFinder() {
        return this.f13311c;
    }

    /* JADX INFO: renamed from: h */
    public void m14355h() {
        this.f13310b.m14338v();
    }

    /* JADX INFO: renamed from: i */
    public void m14356i() {
        this.f13310b.m14340y();
        try {
            Animation animation = this.f13313e.getAnimation();
            if (animation == null) {
                m14348a(this.f13313e);
            } else {
                animation.start();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m14357j() {
        this.f13310b.setTorch(false);
        InterfaceC9294a interfaceC9294a = this.f13314f;
        if (interfaceC9294a != null) {
            interfaceC9294a.mo14360o();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14358k() {
        this.f13310b.setTorch(true);
        InterfaceC9294a interfaceC9294a = this.f13314f;
        if (interfaceC9294a != null) {
            interfaceC9294a.mo14359i();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 24) {
            m14358k();
            return true;
        }
        if (i11 == 25) {
            m14357j();
            return true;
        }
        if (i11 == 27 || i11 == 80) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    public void setStatusText(String str) {
        TextView textView = this.f13312d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(InterfaceC9294a interfaceC9294a) {
        this.f13314f = interfaceC9294a;
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14352e(attributeSet);
    }

    /* JADX INFO: renamed from: e */
    public final void m14352e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9149R.styleable.zxing_view);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C9149R.styleable.zxing_view_zxing_scanner_layout, C9149R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C9149R.id.zxing_barcode_surface);
        this.f13310b = barcodeView;
        if (barcodeView != null) {
            barcodeView.m14334q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(C9149R.id.zxing_viewfinder_view);
            this.f13311c = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f13310b);
                this.f13312d = (TextView) findViewById(C9149R.id.zxing_status_view);
                this.f13313e = (ImageView) findViewById(C9149R.id.capture_scan_line);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* JADX INFO: renamed from: f */
    public void m14353f(Intent intent) {
        int intExtra;
        Set<BarcodeFormat> decodeFormats = DecodeFormatManager.parseDecodeFormats(intent);
        Map<DecodeHintType, ?> decodeHints = DecodeHintManager.parseDecodeHints(intent);
        CameraSettings cameraSettings = new CameraSettings();
        if (intent.hasExtra(Intents.Scan.CAMERA_ID) && (intExtra = intent.getIntExtra(Intents.Scan.CAMERA_ID, -1)) >= 0) {
            cameraSettings.m14394i(intExtra);
        }
        String stringExtra = intent.getStringExtra(Intents.Scan.PROMPT_MESSAGE);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(Intents.Scan.SCAN_TYPE, 0);
        String stringExtra2 = intent.getStringExtra(Intents.Scan.CHARACTER_SET);
        new MultiFormatReader().setHints(decodeHints);
        this.f13310b.setCameraSettings(cameraSettings);
        this.f13310b.setDecoderFactory(new C4514h(decodeFormats, decodeHints, stringExtra2, intExtra2));
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m14352e(attributeSet);
    }
}
