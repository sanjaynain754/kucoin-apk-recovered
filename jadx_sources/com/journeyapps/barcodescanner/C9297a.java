package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.android.BeepManager;
import com.google.zxing.client.android.C9149R;
import com.google.zxing.client.android.InactivityTimer;
import com.google.zxing.client.android.Intents;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p037b9.C4509c;
import p037b9.InterfaceC4507a;

/* JADX INFO: renamed from: com.journeyapps.barcodescanner.a */
/* JADX INFO: compiled from: CaptureManager.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9297a {

    /* JADX INFO: renamed from: m */
    public static final String f13331m = "a";

    /* JADX INFO: renamed from: n */
    public static int f13332n = 250;

    /* JADX INFO: renamed from: a */
    public Activity f13333a;

    /* JADX INFO: renamed from: b */
    public DecoratedBarcodeView f13334b;

    /* JADX INFO: renamed from: f */
    public InactivityTimer f13338f;

    /* JADX INFO: renamed from: g */
    public BeepManager f13339g;

    /* JADX INFO: renamed from: h */
    public Handler f13340h;

    /* JADX INFO: renamed from: k */
    public final CameraPreview.InterfaceC9293f f13343k;

    /* JADX INFO: renamed from: l */
    public boolean f13344l;

    /* JADX INFO: renamed from: c */
    public int f13335c = -1;

    /* JADX INFO: renamed from: d */
    public boolean f13336d = false;

    /* JADX INFO: renamed from: e */
    public boolean f13337e = false;

    /* JADX INFO: renamed from: i */
    public boolean f13341i = false;

    /* JADX INFO: renamed from: j */
    public InterfaceC4507a f13342j = new a();

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$a */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class a implements InterfaceC4507a {

        /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CaptureManager.java */
        public class RunnableC46977a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C4509c f13346b;

            public RunnableC46977a(C4509c c4509c) {
                this.f13346b = c4509c;
            }

            @Override // java.lang.Runnable
            public void run() {
                C9297a.this.m14384v(this.f13346b);
            }
        }

        public a() {
        }

        @Override // p037b9.InterfaceC4507a
        /* JADX INFO: renamed from: a */
        public void mo4317a(C4509c c4509c) {
            C9297a.this.f13334b.m14354g();
            C9297a.this.f13339g.playBeepSoundAndVibrate();
            C9297a.this.f13340h.post(new RunnableC46977a(c4509c));
        }

        @Override // p037b9.InterfaceC4507a
        /* JADX INFO: renamed from: b */
        public void mo4318b(List<ResultPoint> list) {
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$b */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class b implements CameraPreview.InterfaceC9293f {
        public b() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: b */
        public void mo14343b() {
            if (C9297a.this.f13341i) {
                Log.d(C9297a.f13331m, "Camera closed; finishing activity");
                C9297a.this.m14374j();
            }
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: c */
        public void mo14344c(Exception exc) {
            C9297a.this.m14373i();
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: a */
        public void mo14342a() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: d */
        public void mo14345d() {
        }

        @Override // com.journeyapps.barcodescanner.CameraPreview.InterfaceC9293f
        /* JADX INFO: renamed from: e */
        public void mo14346e() {
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$c */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(C9297a.f13331m, "Finishing due to inactivity");
            C9297a.this.m14374j();
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$d */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C9297a.this.m14385w();
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$e */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            C9297a.this.m14374j();
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$f */
    /* JADX INFO: compiled from: CaptureManager.java */
    public class f implements DialogInterface.OnCancelListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C9297a.this.m14374j();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m14378o() {
        this.f13337e = true;
        this.f13338f.cancel();
        this.f13340h.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: l */
    public static int m14369l() {
        return f13332n;
    }

    /* JADX INFO: renamed from: u */
    public static Intent m14370u(C4509c c4509c, String str) {
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.addFlags(524288);
        intent.putExtra(Intents.Scan.RESULT, c4509c.toString());
        intent.putExtra(Intents.Scan.RESULT_FORMAT, c4509c.m4320a().toString());
        byte[] bArrM4322c = c4509c.m4322c();
        if (bArrM4322c != null && bArrM4322c.length > 0) {
            intent.putExtra(Intents.Scan.RESULT_BYTES, bArrM4322c);
        }
        Map<ResultMetadataType, Object> mapM4323d = c4509c.m4323d();
        if (mapM4323d != null) {
            ResultMetadataType resultMetadataType = ResultMetadataType.UPC_EAN_EXTENSION;
            if (mapM4323d.containsKey(resultMetadataType)) {
                intent.putExtra(Intents.Scan.RESULT_UPC_EAN_EXTENSION, mapM4323d.get(resultMetadataType).toString());
            }
            Number number = (Number) mapM4323d.get(ResultMetadataType.ORIENTATION);
            if (number != null) {
                intent.putExtra(Intents.Scan.RESULT_ORIENTATION, number.intValue());
            }
            String str2 = (String) mapM4323d.get(ResultMetadataType.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra(Intents.Scan.RESULT_ERROR_CORRECTION_LEVEL, str2);
            }
            Iterable iterable = (Iterable) mapM4323d.get(ResultMetadataType.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    intent.putExtra(Intents.Scan.RESULT_BYTE_SEGMENTS_PREFIX + i11, (byte[]) it.next());
                    i11++;
                }
            }
        }
        if (str != null) {
            intent.putExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH, str);
        }
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public void m14371g() {
        if (this.f13334b.getBarcodeView().m14336s()) {
            m14374j();
        } else {
            this.f13341i = true;
        }
        this.f13334b.m14354g();
        this.f13338f.cancel();
    }

    /* JADX INFO: renamed from: h */
    public void m14372h() {
        this.f13334b.m14350c(this.f13342j);
    }

    /* JADX INFO: renamed from: i */
    public void m14373i() {
        if (this.f13333a.isFinishing() || this.f13337e || this.f13341i) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13333a);
        builder.setTitle(this.f13333a.getString(C9149R.string.zxing_app_name));
        builder.setMessage(this.f13333a.getString(C9149R.string.zxing_msg_camera_framework_bug));
        builder.setPositiveButton(C9149R.string.zxing_button_ok, new e());
        builder.setOnCancelListener(new f());
        builder.show();
    }

    /* JADX INFO: renamed from: j */
    public final void m14374j() {
        this.f13333a.finish();
    }

    /* JADX INFO: renamed from: k */
    public final String m14375k(C4509c c4509c) {
        if (!this.f13336d) {
            return null;
        }
        Bitmap bitmapM4321b = c4509c.m4321b();
        try {
            File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.f13333a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            bitmapM4321b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            return fileCreateTempFile.getAbsolutePath();
        } catch (IOException e11) {
            Log.w(f13331m, "Unable to create temporary file and store bitmap! " + e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m14376m(Intent intent, Bundle bundle) {
        this.f13333a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f13335c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra(Intents.Scan.ORIENTATION_LOCKED, true)) {
                m14377n();
            }
            if (Intents.Scan.ACTION.equals(intent.getAction())) {
                this.f13334b.m14353f(intent);
            }
            if (!intent.getBooleanExtra(Intents.Scan.BEEP_ENABLED, true)) {
                this.f13339g.setBeepEnabled(false);
            }
            if (intent.hasExtra(Intents.Scan.TIMEOUT)) {
                this.f13340h.postDelayed(new d(), intent.getLongExtra(Intents.Scan.TIMEOUT, 0L));
            }
            if (intent.getBooleanExtra(Intents.Scan.BARCODE_IMAGE_ENABLED, false)) {
                this.f13336d = true;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m14377n() {
        if (this.f13335c == -1) {
            int rotation = this.f13333a.getWindowManager().getDefaultDisplay().getRotation();
            int i11 = this.f13333a.getResources().getConfiguration().orientation;
            int i12 = 0;
            if (i11 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i12 = 8;
                }
            } else if (i11 == 1) {
                i12 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f13335c = i12;
        }
        this.f13333a.setRequestedOrientation(this.f13335c);
    }

    /* JADX INFO: renamed from: p */
    public void m14379p() {
        this.f13338f.cancel();
        this.f13334b.m14355h();
    }

    /* JADX INFO: renamed from: q */
    public void m14380q(int i11, String[] strArr, int[] iArr) {
        if (i11 == f13332n) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                m14373i();
            } else {
                this.f13334b.m14356i();
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m14382s(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f13335c);
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: t */
    public final void m14383t() {
        if (ContextCompat.checkSelfPermission(this.f13333a, "android.permission.CAMERA") == 0) {
            this.f13334b.m14356i();
        } else {
            if (this.f13344l) {
                return;
            }
            ActivityCompat.requestPermissions(this.f13333a, new String[]{"android.permission.CAMERA"}, f13332n);
            this.f13344l = true;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m14385w() {
        Intent intent = new Intent(Intents.Scan.ACTION);
        intent.putExtra(Intents.Scan.TIMEOUT, true);
        this.f13333a.setResult(0, intent);
        m14371g();
    }

    public C9297a(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f13343k = bVar;
        this.f13344l = false;
        this.f13333a = activity;
        this.f13334b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().m14326i(bVar);
        this.f13340h = new Handler();
        this.f13338f = new InactivityTimer(activity, new c());
        this.f13339g = new BeepManager(activity);
    }

    /* JADX INFO: renamed from: r */
    public void m14381r() {
        m14383t();
        this.f13338f.start();
    }

    /* JADX INFO: renamed from: v */
    public void m14384v(C4509c c4509c) {
        this.f13333a.setResult(-1, m14370u(c4509c, m14375k(c4509c)));
        m14371g();
    }
}
