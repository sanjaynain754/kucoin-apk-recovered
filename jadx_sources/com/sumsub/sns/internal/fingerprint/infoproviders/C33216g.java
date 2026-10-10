package com.sumsub.sns.internal.fingerprint.infoproviders;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import com.sumsub.sns.internal.fingerprint.tools.threading.safe.AbstractC33266c;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.infoproviders.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33216g {

    /* JADX INFO: renamed from: a */
    public final DevicePolicyManager f67762a;

    /* JADX INFO: renamed from: b */
    public final KeyguardManager f67763b;

    /* JADX INFO: renamed from: a */
    public final String m71580a() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33216g.m71577a(this.f67756b);
            }
        });
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = "";
        }
        return (String) objM71616a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m71581b() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C33216g.m71578b(this.f67757b));
            }
        });
        Boolean bool = Boolean.FALSE;
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = bool;
        }
        return ((Boolean) objM71616a).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final List m71582c() {
        Object objM71616a = AbstractC33266c.m71616a(new Function0() { // from class: com.sumsub.sns.internal.fingerprint.infoproviders.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C33216g.m71579d();
            }
        });
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m103850isFailureimpl(objM71616a)) {
            objM71616a = listEmptyList;
        }
        return (List) objM71616a;
    }

    public C33216g(DevicePolicyManager devicePolicyManager, KeyguardManager keyguardManager) {
        this.f67762a = devicePolicyManager;
        this.f67763b = keyguardManager;
    }

    /* JADX INFO: renamed from: d */
    public static final List m71579d() {
        String name;
        Provider[] providers = Security.getProviders();
        ArrayList arrayList = new ArrayList(providers.length);
        for (Provider provider : providers) {
            String str = "";
            if (provider == null || (name = provider.getName()) == null) {
                name = "";
            }
            String info = provider.getInfo();
            if (info != null) {
                str = info;
            }
            arrayList.add(new Pair(name, str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static final String m71577a(C33216g c33216g) {
        DevicePolicyManager devicePolicyManager = c33216g.f67762a;
        int storageEncryptionStatus = devicePolicyManager != null ? devicePolicyManager.getStorageEncryptionStatus() : 0;
        if (storageEncryptionStatus == 0) {
            return "unsupported";
        }
        if (storageEncryptionStatus == 1) {
            return "inactive";
        }
        if (storageEncryptionStatus == 2) {
            return "activating";
        }
        if (storageEncryptionStatus == 3) {
            return "active";
        }
        if (storageEncryptionStatus != 5) {
            return "";
        }
        return "active_per_user";
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m71578b(C33216g c33216g) {
        KeyguardManager keyguardManager = c33216g.f67763b;
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardSecure();
        }
        return false;
    }
}
