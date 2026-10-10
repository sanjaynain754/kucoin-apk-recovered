package com.google.android.play.core.integrity;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.b */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7752b extends AbstractC7769bq {

    /* JADX INFO: renamed from: a */
    private String f12006a;

    /* JADX INFO: renamed from: b */
    private AbstractC7799y f12007b;

    @Override // com.google.android.play.core.integrity.AbstractC7769bq
    /* JADX INFO: renamed from: a */
    public final AbstractC7769bq mo13239a(AbstractC7799y abstractC7799y) {
        this.f12007b = abstractC7799y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7769bq
    /* JADX INFO: renamed from: b */
    public final AbstractC7769bq mo13240b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12006a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC7769bq
    /* JADX INFO: renamed from: c */
    public final C7770br mo13241c() {
        AbstractC7799y abstractC7799y;
        String str = this.f12006a;
        if (str != null && (abstractC7799y = this.f12007b) != null) {
            return new C7770br(str, abstractC7799y);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12006a == null) {
            sb2.append(" token");
        }
        if (this.f12007b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
