package com.kubi.otc.entity;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@androidx.annotation.Keep
@kotlin.Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f\u00128\b\u0002\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f\u00128\b\u0002\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\rJ\u000e\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000207J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ)\u0010?\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fHÆ\u0003J9\u0010@\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000fHÆ\u0003J9\u0010A\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000fHÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\r0\u0011HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J¤\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f28\b\u0002\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f28\b\u0002\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020\u0003J\u0013\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\rHÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR1\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&RA\u0010\u0010\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&RA\u0010\u0012\u001a2\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u00010\fj\u0018\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011\u0018\u0001`\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-¨\u0006S"}, m90084d2 = {"Lcom/kubi/otc/entity/OtcUserInfo;", "Landroid/os/Parcelable;", "kycLevel", "", "bindPhone", "", "bindTradePassword", "createdAt", "", "kyc", "merchant", "userKycDayLimitConfigs", "Ljava/util/HashMap;", "", "Lcom/kubi/otc/entity/LimitDays;", "Lkotlin/collections/HashMap;", "payTypeCodeMap", "", "payTypeIdMap", "availableLegals", "signedPact", "kycArea", "kycName", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getKycLevel", "()I", "getBindPhone", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBindTradePassword", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKyc", "()Z", "getMerchant", "getUserKycDayLimitConfigs", "()Ljava/util/HashMap;", "getPayTypeCodeMap", "getPayTypeIdMap", "getAvailableLegals", "()Ljava/util/List;", "getSignedPact", "getKycArea", "()Ljava/lang/String;", "getKycName", "isUS", "isCA", "isHighKycLevel", "isRealLowKycLevel", "isSupportLegal", "legal", "isSupportPayWay", "item", "Lcom/kubi/otc/entity/OtcInfoEntity;", "getSupportPayWay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/OtcUserInfo;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOtcBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcUserInfo\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,710:1\n216#2,2:711\n*S KotlinDebug\n*F\n+ 1 OtcBean.kt\ncom/kubi/otc/entity/OtcUserInfo\n*L\n264#1:711,2\n*E\n"})
public final class OtcUserInfo implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.kubi.otc.entity.OtcUserInfo> CREATOR = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> availableLegals;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean bindPhone;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean bindTradePassword;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long createdAt;
    private final boolean kyc;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String kycArea;
    private final int kycLevel;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String kycName;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean merchant;

    @org.jetbrains.annotations.Nullable
    private final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> payTypeCodeMap;

    @org.jetbrains.annotations.Nullable
    private final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> payTypeIdMap;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean signedPact;

    @org.jetbrains.annotations.Nullable
    private final java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> userKycDayLimitConfigs;

    /* JADX INFO: compiled from: OtcBean.kt */
    @kotlin.Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.kubi.otc.entity.OtcUserInfo> {
        public Creator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.kubi.otc.entity.OtcUserInfo createFromParcel(android.os.Parcel r17) {
                r16 = this;
                r0 = r17
                java.lang.String r1 = "parcel"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r3 = r0.readInt()
                int r1 = r0.readInt()
                r4 = 1
                r5 = 0
                if (r1 != 0) goto L15
                r1 = r5
                goto L22
            L15:
                int r1 = r0.readInt()
                if (r1 == 0) goto L1d
                r1 = r4
                goto L1e
            L1d:
                r1 = 0
            L1e:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L22:
                int r6 = r0.readInt()
                if (r6 != 0) goto L2a
                r6 = r5
                goto L37
            L2a:
                int r6 = r0.readInt()
                if (r6 == 0) goto L32
                r6 = r4
                goto L33
            L32:
                r6 = 0
            L33:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            L37:
                int r7 = r0.readInt()
                if (r7 != 0) goto L3f
                r7 = r5
                goto L47
            L3f:
                long r7 = r0.readLong()
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
            L47:
                int r8 = r0.readInt()
                if (r8 == 0) goto L52
                r8 = r5
                r5 = r6
                r6 = r7
                r7 = r4
                goto L56
            L52:
                r8 = r5
                r5 = r6
                r6 = r7
                r7 = 0
            L56:
                int r9 = r0.readInt()
                if (r9 != 0) goto L5e
                r9 = r8
                goto L6b
            L5e:
                int r9 = r0.readInt()
                if (r9 == 0) goto L66
                r9 = r4
                goto L67
            L66:
                r9 = 0
            L67:
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            L6b:
                int r10 = r0.readInt()
                if (r10 != 0) goto L73
                r11 = r8
                goto L8f
            L73:
                int r10 = r0.readInt()
                java.util.HashMap r11 = new java.util.HashMap
                r11.<init>(r10)
                r12 = 0
            L7d:
                if (r12 == r10) goto L8f
                java.lang.String r13 = r0.readString()
                android.os.Parcelable$Creator<com.kubi.otc.entity.LimitDays> r14 = com.kubi.otc.entity.LimitDays.CREATOR
                java.lang.Object r14 = r14.createFromParcel(r0)
                r11.put(r13, r14)
                int r12 = r12 + 1
                goto L7d
            L8f:
                int r10 = r0.readInt()
                if (r10 != 0) goto L97
                r10 = r8
                goto Lb2
            L97:
                int r10 = r0.readInt()
                java.util.HashMap r12 = new java.util.HashMap
                r12.<init>(r10)
                r13 = 0
            La1:
                if (r13 == r10) goto Lb1
                java.lang.String r14 = r0.readString()
                java.util.ArrayList r15 = r0.createStringArrayList()
                r12.put(r14, r15)
                int r13 = r13 + 1
                goto La1
            Lb1:
                r10 = r12
            Lb2:
                int r12 = r0.readInt()
                if (r12 != 0) goto Lba
                r13 = r8
                goto Ld4
            Lba:
                int r12 = r0.readInt()
                java.util.HashMap r13 = new java.util.HashMap
                r13.<init>(r12)
                r14 = 0
            Lc4:
                if (r14 == r12) goto Ld4
                java.lang.String r15 = r0.readString()
                java.util.ArrayList r2 = r0.createStringArrayList()
                r13.put(r15, r2)
                int r14 = r14 + 1
                goto Lc4
            Ld4:
                java.util.ArrayList r12 = r0.createStringArrayList()
                int r2 = r0.readInt()
                if (r2 != 0) goto Le0
                r2 = r8
                goto Led
            Le0:
                int r2 = r0.readInt()
                if (r2 == 0) goto Le8
                r2 = r4
                goto Le9
            Le8:
                r2 = 0
            Le9:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            Led:
                java.lang.String r14 = r0.readString()
                java.lang.String r15 = r0.readString()
                r8 = r9
                r9 = r11
                r11 = r13
                r13 = r2
                com.kubi.otc.entity.OtcUserInfo r2 = new com.kubi.otc.entity.OtcUserInfo
                r4 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r2
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.kubi.otc.entity.OtcUserInfo createFromParcel(android.os.Parcel r1) {
                r0 = this;
                com.kubi.otc.entity.OtcUserInfo r1 = r0.createFromParcel(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.kubi.otc.entity.OtcUserInfo[] newArray(int r1) {
                r0 = this;
                com.kubi.otc.entity.OtcUserInfo[] r1 = new com.kubi.otc.entity.OtcUserInfo[r1]
                return r1
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.kubi.otc.entity.OtcUserInfo[] newArray(int r1) {
                r0 = this;
                com.kubi.otc.entity.OtcUserInfo[] r1 = r0.newArray(r1)
                return r1
        }
    }

    static {
            com.kubi.otc.entity.OtcUserInfo$Creator r0 = new com.kubi.otc.entity.OtcUserInfo$Creator
            r0.<init>()
            com.kubi.otc.entity.OtcUserInfo.CREATOR = r0
            return
    }

    public OtcUserInfo() {
            r16 = this;
            r14 = 8191(0x1fff, float:1.1478E-41)
            r15 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public OtcUserInfo(int r2, @org.jetbrains.annotations.Nullable java.lang.Boolean r3, @org.jetbrains.annotations.Nullable java.lang.Boolean r4, @org.jetbrains.annotations.Nullable java.lang.Long r5, boolean r6, @org.jetbrains.annotations.Nullable java.lang.Boolean r7, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r8, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r9, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r10, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r11, @org.jetbrains.annotations.Nullable java.lang.Boolean r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.Nullable java.lang.String r14) {
            r1 = this;
            java.lang.String r0 = "availableLegals"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r1.<init>()
            r1.kycLevel = r2
            r1.bindPhone = r3
            r1.bindTradePassword = r4
            r1.createdAt = r5
            r1.kyc = r6
            r1.merchant = r7
            r1.userKycDayLimitConfigs = r8
            r1.payTypeCodeMap = r9
            r1.payTypeIdMap = r10
            r1.availableLegals = r11
            r1.signedPact = r12
            r1.kycArea = r13
            r1.kycName = r14
            return
    }

    public /* synthetic */ OtcUserInfo(int r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Long r17, boolean r18, java.lang.Boolean r19, java.util.HashMap r20, java.util.HashMap r21, java.util.HashMap r22, java.util.List r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            r13 = this;
            r0 = r27
            r1 = r0 & 1
            if (r1 == 0) goto L7
            r14 = -1
        L7:
            r1 = r0 & 2
            if (r1 == 0) goto Le
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto Lf
        Le:
            r1 = r15
        Lf:
            r2 = r0 & 4
            if (r2 == 0) goto L16
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L18
        L16:
            r2 = r16
        L18:
            r3 = r0 & 8
            if (r3 == 0) goto L23
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L25
        L23:
            r3 = r17
        L25:
            r4 = r0 & 16
            if (r4 == 0) goto L2b
            r4 = 0
            goto L2d
        L2b:
            r4 = r18
        L2d:
            r5 = r0 & 32
            if (r5 == 0) goto L34
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L36
        L34:
            r5 = r19
        L36:
            r6 = r0 & 64
            if (r6 == 0) goto L40
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            goto L42
        L40:
            r6 = r20
        L42:
            r7 = r0 & 128(0x80, float:1.8E-43)
            r8 = 0
            if (r7 == 0) goto L49
            r7 = r8
            goto L4b
        L49:
            r7 = r21
        L4b:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L51
            r9 = r8
            goto L53
        L51:
            r9 = r22
        L53:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L5d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            goto L5f
        L5d:
            r10 = r23
        L5f:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L66
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            goto L68
        L66:
            r11 = r24
        L68:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L6f
            java.lang.String r12 = ""
            goto L71
        L6f:
            r12 = r25
        L71:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L91
            r28 = r8
        L77:
            r15 = r13
            r16 = r14
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            goto L94
        L91:
            r28 = r26
            goto L77
        L94:
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
    }

    public static /* synthetic */ com.kubi.otc.entity.OtcUserInfo copy$default(com.kubi.otc.entity.OtcUserInfo r12, int r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Long r16, boolean r17, java.lang.Boolean r18, java.util.HashMap r19, java.util.HashMap r20, java.util.HashMap r21, java.util.List r22, java.lang.Boolean r23, java.lang.String r24, java.lang.String r25, int r26, java.lang.Object r27) {
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L8
            int r13 = r12.kycLevel
        L8:
            r1 = r0 & 2
            if (r1 == 0) goto Lf
            java.lang.Boolean r1 = r12.bindPhone
            goto L10
        Lf:
            r1 = r14
        L10:
            r2 = r0 & 4
            if (r2 == 0) goto L17
            java.lang.Boolean r2 = r12.bindTradePassword
            goto L18
        L17:
            r2 = r15
        L18:
            r3 = r0 & 8
            if (r3 == 0) goto L1f
            java.lang.Long r3 = r12.createdAt
            goto L21
        L1f:
            r3 = r16
        L21:
            r4 = r0 & 16
            if (r4 == 0) goto L28
            boolean r4 = r12.kyc
            goto L2a
        L28:
            r4 = r17
        L2a:
            r5 = r0 & 32
            if (r5 == 0) goto L31
            java.lang.Boolean r5 = r12.merchant
            goto L33
        L31:
            r5 = r18
        L33:
            r6 = r0 & 64
            if (r6 == 0) goto L3a
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r6 = r12.userKycDayLimitConfigs
            goto L3c
        L3a:
            r6 = r19
        L3c:
            r7 = r0 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L43
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r7 = r12.payTypeCodeMap
            goto L45
        L43:
            r7 = r20
        L45:
            r8 = r0 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L4c
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r8 = r12.payTypeIdMap
            goto L4e
        L4c:
            r8 = r21
        L4e:
            r9 = r0 & 512(0x200, float:7.17E-43)
            if (r9 == 0) goto L55
            java.util.List<java.lang.String> r9 = r12.availableLegals
            goto L57
        L55:
            r9 = r22
        L57:
            r10 = r0 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L5e
            java.lang.Boolean r10 = r12.signedPact
            goto L60
        L5e:
            r10 = r23
        L60:
            r11 = r0 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L67
            java.lang.String r11 = r12.kycArea
            goto L69
        L67:
            r11 = r24
        L69:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L8a
            java.lang.String r0 = r12.kycName
            r27 = r0
        L71:
            r14 = r12
            r15 = r13
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            goto L8d
        L8a:
            r27 = r25
            goto L71
        L8d:
            com.kubi.otc.entity.OtcUserInfo r12 = r14.copy(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r12
    }

    public final int component1() {
            r1 = this;
            int r0 = r1.kycLevel
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component10() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.availableLegals
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component11() {
            r1 = this;
            java.lang.Boolean r0 = r1.signedPact
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
            r1 = this;
            java.lang.String r0 = r1.kycArea
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
            r1 = this;
            java.lang.String r0 = r1.kycName
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component2() {
            r1 = this;
            java.lang.Boolean r0 = r1.bindPhone
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component3() {
            r1 = this;
            java.lang.Boolean r0 = r1.bindTradePassword
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component4() {
            r1 = this;
            java.lang.Long r0 = r1.createdAt
            return r0
    }

    public final boolean component5() {
            r1 = this;
            boolean r0 = r1.kyc
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component6() {
            r1 = this;
            java.lang.Boolean r0 = r1.merchant
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> component7() {
            r1 = this;
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r0 = r1.userKycDayLimitConfigs
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> component8() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.payTypeCodeMap
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> component9() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.payTypeIdMap
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final com.kubi.otc.entity.OtcUserInfo copy(int r16, @org.jetbrains.annotations.Nullable java.lang.Boolean r17, @org.jetbrains.annotations.Nullable java.lang.Boolean r18, @org.jetbrains.annotations.Nullable java.lang.Long r19, boolean r20, @org.jetbrains.annotations.Nullable java.lang.Boolean r21, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r22, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r23, @org.jetbrains.annotations.Nullable java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r24, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r25, @org.jetbrains.annotations.Nullable java.lang.Boolean r26, @org.jetbrains.annotations.Nullable java.lang.String r27, @org.jetbrains.annotations.Nullable java.lang.String r28) {
            r15 = this;
            java.lang.String r0 = "availableLegals"
            r11 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            com.kubi.otc.entity.OtcUserInfo r1 = new com.kubi.otc.entity.OtcUserInfo
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r26
            r13 = r27
            r14 = r28
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.kubi.otc.entity.OtcUserInfo
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.kubi.otc.entity.OtcUserInfo r5 = (com.kubi.otc.entity.OtcUserInfo) r5
            int r1 = r4.kycLevel
            int r3 = r5.kycLevel
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Boolean r1 = r4.bindPhone
            java.lang.Boolean r3 = r5.bindPhone
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.Boolean r1 = r4.bindTradePassword
            java.lang.Boolean r3 = r5.bindTradePassword
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.Long r1 = r4.createdAt
            java.lang.Long r3 = r5.createdAt
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            boolean r1 = r4.kyc
            boolean r3 = r5.kyc
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.lang.Boolean r1 = r4.merchant
            java.lang.Boolean r3 = r5.merchant
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r1 = r4.userKycDayLimitConfigs
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r3 = r5.userKycDayLimitConfigs
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r4.payTypeCodeMap
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r3 = r5.payTypeCodeMap
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r4.payTypeIdMap
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r3 = r5.payTypeIdMap
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            java.util.List<java.lang.String> r1 = r4.availableLegals
            java.util.List<java.lang.String> r3 = r5.availableLegals
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L72
            return r2
        L72:
            java.lang.Boolean r1 = r4.signedPact
            java.lang.Boolean r3 = r5.signedPact
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L7d
            return r2
        L7d:
            java.lang.String r1 = r4.kycArea
            java.lang.String r3 = r5.kycArea
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L88
            return r2
        L88:
            java.lang.String r1 = r4.kycName
            java.lang.String r5 = r5.kycName
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L93
            return r2
        L93:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getAvailableLegals() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.availableLegals
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getBindPhone() {
            r1 = this;
            java.lang.Boolean r0 = r1.bindPhone
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getBindTradePassword() {
            r1 = this;
            java.lang.Boolean r0 = r1.bindTradePassword
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getCreatedAt() {
            r1 = this;
            java.lang.Long r0 = r1.createdAt
            return r0
    }

    public final boolean getKyc() {
            r1 = this;
            boolean r0 = r1.kyc
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKycArea() {
            r1 = this;
            java.lang.String r0 = r1.kycArea
            return r0
    }

    public final int getKycLevel() {
            r1 = this;
            int r0 = r1.kycLevel
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKycName() {
            r1 = this;
            java.lang.String r0 = r1.kycName
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getMerchant() {
            r1 = this;
            java.lang.Boolean r0 = r1.merchant
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> getPayTypeCodeMap() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.payTypeCodeMap
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> getPayTypeIdMap() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = r1.payTypeIdMap
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSignedPact() {
            r1 = this;
            java.lang.Boolean r0 = r1.signedPact
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSupportPayWay() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r4.payTypeCodeMap
            if (r1 == 0) goto L3a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2c
            goto L11
        L2c:
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = com.kubi.utils.extensions.C27024b.m66560c(r2)
            r0.addAll(r2)
            goto L11
        L3a:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> getUserKycDayLimitConfigs() {
            r1 = this;
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r0 = r1.userKycDayLimitConfigs
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.kycLevel
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.bindPhone
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = r2
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.bindTradePassword
            if (r1 != 0) goto L1c
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Long r1 = r3.createdAt
            if (r1 != 0) goto L29
            r1 = r2
            goto L2d
        L29:
            int r1 = r1.hashCode()
        L2d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r3.kyc
            int r1 = java.lang.Boolean.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.merchant
            if (r1 != 0) goto L3f
            r1 = r2
            goto L43
        L3f:
            int r1 = r1.hashCode()
        L43:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r1 = r3.userKycDayLimitConfigs
            if (r1 != 0) goto L4c
            r1 = r2
            goto L50
        L4c:
            int r1 = r1.hashCode()
        L50:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r3.payTypeCodeMap
            if (r1 != 0) goto L59
            r1 = r2
            goto L5d
        L59:
            int r1 = r1.hashCode()
        L5d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r3.payTypeIdMap
            if (r1 != 0) goto L66
            r1 = r2
            goto L6a
        L66:
            int r1 = r1.hashCode()
        L6a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r3.availableLegals
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.signedPact
            if (r1 != 0) goto L7c
            r1 = r2
            goto L80
        L7c:
            int r1 = r1.hashCode()
        L80:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.kycArea
            if (r1 != 0) goto L89
            r1 = r2
            goto L8d
        L89:
            int r1 = r1.hashCode()
        L8d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.kycName
            if (r1 != 0) goto L95
            goto L99
        L95:
            int r2 = r1.hashCode()
        L99:
            int r0 = r0 + r2
            return r0
    }

    public final boolean isCA() {
            r2 = this;
            java.lang.String r0 = r2.kycArea
            java.lang.String r1 = "CA"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    public final boolean isHighKycLevel() {
            r2 = this;
            int r0 = r2.kycLevel
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final boolean isRealLowKycLevel() {
            r2 = this;
            int r0 = r2.kycLevel
            r1 = 1
            if (r0 != r1) goto La
            boolean r0 = r2.kyc
            if (r0 == 0) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public final boolean isSupportLegal(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "legal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List<java.lang.String> r0 = r1.availableLegals
            boolean r2 = r0.contains(r2)
            return r2
    }

    public final boolean isSupportPayWay(@org.jetbrains.annotations.NotNull com.kubi.otc.entity.OtcInfoEntity r5) {
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List r0 = r4.getSupportPayWay()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r2 = r5.getAdPayTypes()
            java.util.List r2 = com.kubi.utils.extensions.C27024b.m66560c(r2)
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r2.next()
            com.kubi.otc.entity.AdPayType r3 = (com.kubi.otc.entity.AdPayType) r3
            java.lang.String r3 = r3.getPayTypeCode()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r3 == 0) goto L25
            r5 = 1
            return r5
        L3d:
            r5 = 0
            return r5
    }

    public final boolean isUS() {
            r2 = this;
            java.lang.String r0 = r2.kycArea
            java.lang.String r1 = "US"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OtcUserInfo(kycLevel="
            r0.append(r1)
            int r1 = r2.kycLevel
            r0.append(r1)
            java.lang.String r1 = ", bindPhone="
            r0.append(r1)
            java.lang.Boolean r1 = r2.bindPhone
            r0.append(r1)
            java.lang.String r1 = ", bindTradePassword="
            r0.append(r1)
            java.lang.Boolean r1 = r2.bindTradePassword
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            r0.append(r1)
            java.lang.Long r1 = r2.createdAt
            r0.append(r1)
            java.lang.String r1 = ", kyc="
            r0.append(r1)
            boolean r1 = r2.kyc
            r0.append(r1)
            java.lang.String r1 = ", merchant="
            r0.append(r1)
            java.lang.Boolean r1 = r2.merchant
            r0.append(r1)
            java.lang.String r1 = ", userKycDayLimitConfigs="
            r0.append(r1)
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r1 = r2.userKycDayLimitConfigs
            r0.append(r1)
            java.lang.String r1 = ", payTypeCodeMap="
            r0.append(r1)
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r2.payTypeCodeMap
            r0.append(r1)
            java.lang.String r1 = ", payTypeIdMap="
            r0.append(r1)
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r1 = r2.payTypeIdMap
            r0.append(r1)
            java.lang.String r1 = ", availableLegals="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r2.availableLegals
            r0.append(r1)
            java.lang.String r1 = ", signedPact="
            r0.append(r1)
            java.lang.Boolean r1 = r2.signedPact
            r0.append(r1)
            java.lang.String r1 = ", kycArea="
            r0.append(r1)
            java.lang.String r1 = r2.kycArea
            r0.append(r1)
            java.lang.String r1 = ", kycName="
            r0.append(r1)
            java.lang.String r1 = r2.kycName
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r6, int r7) {
            r5 = this;
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.kycLevel
            r6.writeInt(r0)
            java.lang.Boolean r0 = r5.bindPhone
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            r6.writeInt(r2)
            goto L1e
        L14:
            r6.writeInt(r1)
            boolean r0 = r0.booleanValue()
            r6.writeInt(r0)
        L1e:
            java.lang.Boolean r0 = r5.bindTradePassword
            if (r0 != 0) goto L26
            r6.writeInt(r2)
            goto L30
        L26:
            r6.writeInt(r1)
            boolean r0 = r0.booleanValue()
            r6.writeInt(r0)
        L30:
            java.lang.Long r0 = r5.createdAt
            if (r0 != 0) goto L38
            r6.writeInt(r2)
            goto L42
        L38:
            r6.writeInt(r1)
            long r3 = r0.longValue()
            r6.writeLong(r3)
        L42:
            boolean r0 = r5.kyc
            r6.writeInt(r0)
            java.lang.Boolean r0 = r5.merchant
            if (r0 != 0) goto L4f
            r6.writeInt(r2)
            goto L59
        L4f:
            r6.writeInt(r1)
            boolean r0 = r0.booleanValue()
            r6.writeInt(r0)
        L59:
            java.util.HashMap<java.lang.String, com.kubi.otc.entity.LimitDays> r0 = r5.userKycDayLimitConfigs
            if (r0 != 0) goto L61
            r6.writeInt(r2)
            goto L92
        L61:
            r6.writeInt(r1)
            int r3 = r0.size()
            r6.writeInt(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L92
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r6.writeString(r4)
            java.lang.Object r3 = r3.getValue()
            com.kubi.otc.entity.LimitDays r3 = (com.kubi.otc.entity.LimitDays) r3
            r3.writeToParcel(r6, r7)
            goto L73
        L92:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r7 = r5.payTypeCodeMap
            if (r7 != 0) goto L9a
            r6.writeInt(r2)
            goto Lcb
        L9a:
            r6.writeInt(r1)
            int r0 = r7.size()
            r6.writeInt(r0)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Lac:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcb
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r6.writeString(r3)
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r6.writeStringList(r0)
            goto Lac
        Lcb:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r7 = r5.payTypeIdMap
            if (r7 != 0) goto Ld3
            r6.writeInt(r2)
            goto L104
        Ld3:
            r6.writeInt(r1)
            int r0 = r7.size()
            r6.writeInt(r0)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        Le5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L104
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r6.writeString(r3)
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r6.writeStringList(r0)
            goto Le5
        L104:
            java.util.List<java.lang.String> r7 = r5.availableLegals
            r6.writeStringList(r7)
            java.lang.Boolean r7 = r5.signedPact
            if (r7 != 0) goto L111
            r6.writeInt(r2)
            goto L11b
        L111:
            r6.writeInt(r1)
            boolean r7 = r7.booleanValue()
            r6.writeInt(r7)
        L11b:
            java.lang.String r7 = r5.kycArea
            r6.writeString(r7)
            java.lang.String r7 = r5.kycName
            r6.writeString(r7)
            return
    }
}
