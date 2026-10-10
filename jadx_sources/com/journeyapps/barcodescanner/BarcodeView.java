package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.C9149R;
import java.util.HashMap;
import java.util.List;
import p037b9.C4509c;
import p037b9.C4510d;
import p037b9.C4512f;
import p037b9.C4513g;
import p037b9.C4514h;
import p037b9.C4521o;
import p037b9.InterfaceC4507a;
import p037b9.InterfaceC4511e;

/* JADX INFO: loaded from: classes56.dex */
public class BarcodeView extends CameraPreview {

    /* JADX INFO: renamed from: C */
    public DecodeMode f13267C;

    /* JADX INFO: renamed from: D */
    public InterfaceC4507a f13268D;

    /* JADX INFO: renamed from: E */
    public C4513g f13269E;

    /* JADX INFO: renamed from: F */
    public InterfaceC4511e f13270F;

    /* JADX INFO: renamed from: G */
    public Handler f13271G;

    /* JADX INFO: renamed from: H */
    public final Handler.Callback f13272H;

    public enum DecodeMode {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.BarcodeView$a */
    public class C9287a implements Handler.Callback {
        public C9287a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == C9149R.id.zxing_decode_succeeded) {
                C4509c c4509c = (C4509c) message.obj;
                if (c4509c != null && BarcodeView.this.f13268D != null && BarcodeView.this.f13267C != DecodeMode.NONE) {
                    BarcodeView.this.f13268D.mo4317a(c4509c);
                    if (BarcodeView.this.f13267C == DecodeMode.SINGLE) {
                        BarcodeView.this.m14311M();
                    }
                }
                return true;
            }
            if (i11 == C9149R.id.zxing_decode_failed) {
                return true;
            }
            if (i11 != C9149R.id.zxing_possible_result_points) {
                return false;
            }
            List<ResultPoint> list = (List) message.obj;
            if (BarcodeView.this.f13268D != null && BarcodeView.this.f13267C != DecodeMode.NONE) {
                BarcodeView.this.f13268D.mo4318b(list);
            }
            return true;
        }
    }

    public BarcodeView(Context context) {
        super(context);
        this.f13267C = DecodeMode.NONE;
        this.f13268D = null;
        this.f13272H = new C9287a();
        m14308J();
    }

    /* JADX INFO: renamed from: G */
    public final C4510d m14305G() {
        if (this.f13270F == null) {
            this.f13270F = m14306H();
        }
        C4512f c4512f = new C4512f();
        HashMap map = new HashMap();
        map.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, c4512f);
        C4510d c4510dMo4328a = this.f13270F.mo4328a(map);
        c4512f.m4329a(c4510dMo4328a);
        return c4510dMo4328a;
    }

    /* JADX INFO: renamed from: H */
    public InterfaceC4511e m14306H() {
        return new C4514h();
    }

    /* JADX INFO: renamed from: I */
    public void m14307I(InterfaceC4507a interfaceC4507a) {
        this.f13267C = DecodeMode.SINGLE;
        this.f13268D = interfaceC4507a;
        m14309K();
    }

    /* JADX INFO: renamed from: J */
    public final void m14308J() {
        this.f13270F = new C4514h();
        this.f13271G = new Handler(this.f13272H);
    }

    /* JADX INFO: renamed from: L */
    public final void m14310L() {
        C4513g c4513g = this.f13269E;
        if (c4513g != null) {
            c4513g.m4341l();
            this.f13269E = null;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m14311M() {
        this.f13267C = DecodeMode.NONE;
        this.f13268D = null;
        m14310L();
    }

    public InterfaceC4511e getDecoderFactory() {
        return this.f13270F;
    }

    /* JADX INFO: renamed from: K */
    public final void m14309K() {
        m14310L();
        if (this.f13267C != DecodeMode.NONE && m14337t()) {
            C4513g c4513g = new C4513g(getCameraInstance(), m14305G(), this.f13271G);
            this.f13269E = c4513g;
            c4513g.m4338i(getPreviewFramingRect());
            this.f13269E.m4340k();
        }
    }

    public void setDecoderFactory(InterfaceC4511e interfaceC4511e) {
        C4521o.m4363a();
        this.f13270F = interfaceC4511e;
        C4513g c4513g = this.f13269E;
        if (c4513g != null) {
            c4513g.m4339j(m14305G());
        }
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    /* JADX INFO: renamed from: u */
    public void mo14312u() {
        m14310L();
        super.mo14312u();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    /* JADX INFO: renamed from: x */
    public void mo14313x() {
        super.mo14313x();
        m14309K();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13267C = DecodeMode.NONE;
        this.f13268D = null;
        this.f13272H = new C9287a();
        m14308J();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f13267C = DecodeMode.NONE;
        this.f13268D = null;
        this.f13272H = new C9287a();
        m14308J();
    }
}
