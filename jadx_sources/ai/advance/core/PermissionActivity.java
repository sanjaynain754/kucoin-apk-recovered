package ai.advance.core;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes23.dex */
public abstract class PermissionActivity extends AppCompatActivity {
    /* JADX INFO: renamed from: H */
    public abstract String[] mo813H();

    /* JADX INFO: renamed from: I */
    public abstract void mo814I();

    /* JADX INFO: renamed from: J */
    public abstract void mo815J();

    /* JADX INFO: renamed from: G */
    public boolean m1254G() {
        for (String str : mo813H()) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: K */
    public void mo1255K() {
        if (m1254G()) {
            mo814I();
        } else {
            ActivityCompat.requestPermissions(this, mo813H(), 1991);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 1991) {
            if (m1254G()) {
                mo814I();
            } else {
                mo815J();
            }
        }
    }
}
