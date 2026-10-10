package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.al */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class C7817al implements InterfaceC7816ak {

    /* JADX INFO: renamed from: a */
    private static final C7817al f12111a = new C7817al(null);

    /* JADX INFO: renamed from: b */
    private final Object f12112b;

    /* JADX INFO: renamed from: b */
    public static InterfaceC7816ak m13304b(Object obj) {
        if (obj != null) {
            return new C7817al(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC7819an
    /* JADX INFO: renamed from: a */
    public final Object mo13217a() {
        return this.f12112b;
    }

    private C7817al(Object obj) {
        this.f12112b = obj;
    }
}
