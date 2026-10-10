package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.kubi.sdk.util.PermissionAspect;
import dh0.C36686b;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import p514ou.C43330a;
import xb0.C46125a;
import xb0.C46126b;

/* JADX INFO: loaded from: classes23.dex */
public class RxPermissionsFragment extends Fragment {

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ InterfaceC43175a.a f68479W;

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ InterfaceC43175a.a f68480X;

    /* JADX INFO: renamed from: U */
    public Map<String, PublishSubject<C46125a>> f68481U = new HashMap();

    /* JADX INFO: renamed from: V */
    public boolean f68482V;

    /* JADX INFO: renamed from: i3 */
    public void m72138i3(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            m72137h3("onRequestPermissionsResult  " + strArr[i11]);
            PublishSubject<C46125a> publishSubject = this.f68481U.get(strArr[i11]);
            if (publishSubject == null) {
                Log.e(C46126b.f103593b, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f68481U.remove(strArr[i11]);
            publishSubject.onNext(new C46125a(strArr[i11], iArr[i11] == 0, zArr[i11]));
            publishSubject.onComplete();
        }
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("RxPermissionsFragment.java", RxPermissionsFragment.class);
        f68479W = c36686b.m82128h("method-call", c36686b.m82127g("11", "requestPermissions", "com.tbruyelle.rxpermissions2.RxPermissionsFragment", "[Ljava.lang.String;:int", "permissions:requestCode", "", "void"), 37);
        f68480X = c36686b.m82128h("method-execution", c36686b.m82127g("1", "onRequestPermissionsResult", "com.tbruyelle.rxpermissions2.RxPermissionsFragment", "int:[Ljava.lang.String;:[I", "requestCode:permissions:grantResults", "", "void"), 42);
    }

    /* JADX INFO: renamed from: d3 */
    public boolean m72133d3(@NonNull String str) {
        return this.f68481U.containsKey(str);
    }

    /* JADX INFO: renamed from: e3 */
    public PublishSubject<C46125a> m72134e3(@NonNull String str) {
        return this.f68481U.get(str);
    }

    /* JADX INFO: renamed from: h3 */
    public void m72137h3(String str) {
        if (this.f68482V) {
            Log.d(C46126b.f103593b, str);
        }
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: j3 */
    public void m72139j3(@NonNull String[] strArr) {
        C43330a.m95368b().m95371e(C36686b.m82124d(f68479W, this, this, strArr, C43179b.m94790c(42)));
        requestPermissions(strArr, 42);
    }

    /* JADX INFO: renamed from: k3 */
    public void m72140k3(@NonNull String str, @NonNull PublishSubject<C46125a> publishSubject) {
        this.f68481U.put(str, publishSubject);
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        InterfaceC43175a interfaceC43175aM82125e = C36686b.m82125e(f68480X, this, this, new Object[]{C43179b.m94790c(i11), strArr, iArr});
        PermissionAspect.m58339c().m58340d(interfaceC43175aM82125e);
        C43330a.m95368b().m95370d(interfaceC43175aM82125e);
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i12 = 0; i12 < strArr.length; i12++) {
            zArr[i12] = shouldShowRequestPermissionRationale(strArr[i12]);
        }
        m72138i3(strArr, iArr, zArr);
    }

    static {
        ajc$preClinit();
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: f3 */
    public boolean m72135f3(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if (activity.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @TargetApi(23)
    /* JADX INFO: renamed from: g3 */
    public boolean m72136g3(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
