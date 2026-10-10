package uc0;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast$Callback;
import com.trtc.tuikit.common.system.ContextProvider;

/* JADX INFO: renamed from: uc0.c */
/* JADX INFO: compiled from: ToastUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C45154c {

    /* JADX INFO: renamed from: b */
    public static Toast f101603b;

    /* JADX INFO: renamed from: a */
    public static final Handler f101602a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static boolean f101604c = true;

    /* JADX INFO: renamed from: uc0.c$a */
    /* JADX INFO: compiled from: ToastUtil.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f101605b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f101606c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f101607d;

        /* JADX INFO: renamed from: uc0.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ToastUtil.java */
        public class C47029a extends Toast$Callback {
            public C47029a() {
            }

            public void onToastHidden() {
                super.onToastHidden();
                Toast unused = C45154c.f101603b = null;
            }
        }

        public a(String str, boolean z11, int i11) {
            this.f101605b = str;
            this.f101606c = z11;
            this.f101607d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            if (C45154c.f101603b != null) {
                C45154c.f101603b.cancel();
                Toast unused = C45154c.f101603b = null;
            }
            Toast unused2 = C45154c.f101603b = Toast.makeText(ContextProvider.m79397b(), this.f101605b, this.f101606c ? 1 : 0);
            C45154c.f101603b.setGravity(this.f101607d, 0, 0);
            View view = C45154c.f101603b.getView();
            if (view != null && (textView = (TextView) view.findViewById(R.id.message)) != null) {
                textView.setGravity(17);
            }
            if (C45153b.m99803c() >= 30) {
                C45154c.f101603b.addCallback(new C47029a());
            }
            C45154c.f101603b.show();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m99812d(String str) {
        m99811c(str, false, 80);
    }

    /* JADX INFO: renamed from: c */
    public static void m99811c(String str, boolean z11, int i11) {
        if (f101604c) {
            f101602a.post(new a(str, z11, i11));
        }
    }
}
