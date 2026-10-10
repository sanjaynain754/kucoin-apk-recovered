package com.sumsub.sns.internal.features.data.model.common;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.P */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29039P implements android.os.Parcelable.Creator {
    public C29039P() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
            r14 = this;
            com.sumsub.sns.internal.features.data.model.common.T r0 = new com.sumsub.sns.internal.features.data.model.common.T
            java.io.Serializable r1 = r15.readSerializable()
            java.io.File r1 = (java.io.File) r1
            java.io.Serializable r2 = r15.readSerializable()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r15.readString()
            java.lang.String r4 = r15.readString()
            int r5 = r15.readInt()
            r6 = 0
            if (r5 != 0) goto L1f
            r5 = r6
            goto L27
        L1f:
            java.lang.String r5 = r15.readString()
            com.sumsub.sns.internal.features.data.model.common.IdentitySide r5 = com.sumsub.sns.internal.features.data.model.common.IdentitySide.valueOf(r5)
        L27:
            int r7 = r15.readInt()
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L32
            r7 = r6
            r6 = r9
            goto L34
        L32:
            r7 = r6
            r6 = r8
        L34:
            int r10 = r15.readInt()
            if (r10 != 0) goto L3c
            r10 = r7
            goto L49
        L3c:
            int r10 = r15.readInt()
            if (r10 == 0) goto L44
            r10 = r9
            goto L45
        L44:
            r10 = r8
        L45:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
        L49:
            int r11 = r15.readInt()
            if (r11 != 0) goto L51
            r11 = r7
            goto L57
        L51:
            android.os.Parcelable$Creator<com.sumsub.sns.internal.features.data.model.common.S> r11 = com.sumsub.sns.internal.features.data.model.common.C29050S.CREATOR
            java.lang.Object r11 = r11.createFromParcel(r15)
        L57:
            com.sumsub.sns.internal.features.data.model.common.S r11 = (com.sumsub.sns.internal.features.data.model.common.C29050S) r11
            int r12 = r15.readInt()
            if (r12 == 0) goto L61
            r12 = r9
            goto L63
        L61:
            r12 = r9
            r9 = r8
        L63:
            int r13 = r15.readInt()
            if (r13 != 0) goto L6e
            r8 = r10
            r10 = r7
            r7 = r8
        L6c:
            r8 = r11
            goto L7c
        L6e:
            int r15 = r15.readInt()
            if (r15 == 0) goto L75
            r8 = r12
        L75:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r8)
            r7 = r10
            r10 = r15
            goto L6c
        L7c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.sumsub.sns.internal.features.data.model.common.T[] r1 = new com.sumsub.sns.internal.features.data.model.common.C29054T[r1]
            return r1
    }
}
