package p037b9;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.tencent.bugly.proguard.InterfaceC33953u5;

/* JADX INFO: renamed from: b9.l */
/* JADX INFO: compiled from: RotationListener.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4518l {

    /* JADX INFO: renamed from: a */
    public int f3944a;

    /* JADX INFO: renamed from: b */
    public WindowManager f3945b;

    /* JADX INFO: renamed from: c */
    public OrientationEventListener f3946c;

    /* JADX INFO: renamed from: d */
    public InterfaceC4517k f3947d;

    /* JADX INFO: renamed from: b9.l$a */
    /* JADX INFO: compiled from: RotationListener.java */
    public class a extends OrientationEventListener {
        public a(Context context, int i11) {
            super(context, i11);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i11) {
            int rotation;
            WindowManager windowManager = C4518l.this.f3945b;
            InterfaceC4517k interfaceC4517k = C4518l.this.f3947d;
            if (C4518l.this.f3945b == null || interfaceC4517k == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == C4518l.this.f3944a) {
                return;
            }
            C4518l.this.f3944a = rotation;
            interfaceC4517k.onRotationChanged(rotation);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m4349f() {
        OrientationEventListener orientationEventListener = this.f3946c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f3946c = null;
        this.f3945b = null;
        this.f3947d = null;
    }

    /* JADX INFO: renamed from: e */
    public void m4348e(Context context, InterfaceC4517k interfaceC4517k) {
        m4349f();
        Context applicationContext = context.getApplicationContext();
        this.f3947d = interfaceC4517k;
        this.f3945b = (WindowManager) applicationContext.getSystemService(InterfaceC33953u5.f72199F);
        a aVar = new a(applicationContext, 3);
        this.f3946c = aVar;
        aVar.enable();
        this.f3944a = this.f3945b.getDefaultDisplay().getRotation();
    }
}
