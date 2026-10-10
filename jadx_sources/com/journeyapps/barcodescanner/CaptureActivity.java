package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.google.zxing.client.android.C9149R;

/* JADX INFO: loaded from: classes56.dex */
public class CaptureActivity extends Activity {

    /* JADX INFO: renamed from: b */
    public C9297a f13308b;

    /* JADX INFO: renamed from: c */
    public DecoratedBarcodeView f13309c;

    /* JADX INFO: renamed from: a */
    public DecoratedBarcodeView m14347a() {
        setContentView(C9149R.layout.zxing_capture);
        return (DecoratedBarcodeView) findViewById(C9149R.id.zxing_barcode_scanner);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.f13309c.onKeyDown(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.f13308b.m14380q(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13309c = m14347a();
        C9297a c9297a = new C9297a(this, this.f13309c);
        this.f13308b = c9297a;
        c9297a.m14376m(getIntent(), bundle);
        this.f13308b.m14372h();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f13308b.m14378o();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f13308b.m14379p();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f13308b.m14381r();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f13308b.m14382s(bundle);
    }
}
