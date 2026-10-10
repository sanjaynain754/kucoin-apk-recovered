package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.a */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7725a extends AbstractC7741ap {

    /* JADX INFO: renamed from: a */
    private String f11953a;

    /* JADX INFO: renamed from: b */
    private AbstractC7799y f11954b;

    @Override // com.google.android.play.core.integrity.AbstractC7741ap
    /* JADX INFO: renamed from: a */
    public final AbstractC7741ap mo13214a(AbstractC7799y abstractC7799y) {
        this.f11954b = abstractC7799y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7741ap
    /* JADX INFO: renamed from: b */
    public final AbstractC7741ap mo13215b(String str) {
        this.f11953a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7741ap
    /* JADX INFO: renamed from: c */
    public final C7742aq mo13216c() {
        AbstractC7799y abstractC7799y;
        String str = this.f11953a;
        if (str != null && (abstractC7799y = this.f11954b) != null) {
            return new C7742aq(str, abstractC7799y);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11953a == null) {
            sb2.append(" token");
        }
        if (this.f11954b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
