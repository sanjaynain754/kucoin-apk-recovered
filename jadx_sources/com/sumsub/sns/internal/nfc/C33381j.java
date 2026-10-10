package com.sumsub.sns.internal.nfc;

import android.nfc.TagLostException;
import android.nfc.tech.IsoDep;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.C33296b;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PassportService;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.PACEInfo;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.nfc.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33381j {

    /* JADX INFO: renamed from: d */
    public static final Map f68079d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap f68080e;

    /* JADX INFO: renamed from: a */
    public final IsoDep f68081a;

    /* JADX INFO: renamed from: b */
    public final byte[] f68082b;

    /* JADX INFO: renamed from: c */
    public final C33372a f68083c;

    /* JADX WARN: Code duplicated, block: B:48:0x00da A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115 A[DONT_INVERT, PHI: r2 r10 r11
      0x0115: PHI (r2v19 ??) = (r2v15 ??), (r2v20 ??) binds: [B:58:0x0111, B:30:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r10v14 org.jmrtd.PassportService) = (r10v9 org.jmrtd.PassportService), (r10v15 org.jmrtd.PassportService) binds: [B:58:0x0111, B:30:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r11v5 kotlin.jvm.functions.Function1) = (r11v3 kotlin.jvm.functions.Function1), (r11v7 kotlin.jvm.functions.Function1) binds: [B:58:0x0111, B:30:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:70:0x0138 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x0146 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, PHI: r0 r3 r4
      0x0146: PHI (r0v31 java.lang.Object) = (r0v30 java.lang.Object), (r0v1 java.lang.Object) binds: [B:71:0x0143, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r3v8 org.jmrtd.PassportService) = (r3v6 org.jmrtd.PassportService), (r3v11 org.jmrtd.PassportService) binds: [B:71:0x0143, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r4v5 kotlin.jvm.functions.Function1) = (r4v2 kotlin.jvm.functions.Function1), (r4v6 kotlin.jvm.functions.Function1) binds: [B:71:0x0143, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x0165 A[DONT_INVERT, PHI: r2 r3 r4
      0x0165: PHI (r2v25 ??) = (r2v21 ??), (r2v23 ??), (r2v31 ??) binds: [B:69:0x0136, B:77:0x0162, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r3v12 org.jmrtd.PassportService) = (r3v6 org.jmrtd.PassportService), (r3v8 org.jmrtd.PassportService), (r3v15 org.jmrtd.PassportService) binds: [B:69:0x0136, B:77:0x0162, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0165: PHI (r4v7 kotlin.jvm.functions.Function1) = (r4v2 kotlin.jvm.functions.Function1), (r4v5 kotlin.jvm.functions.Function1), (r4v9 kotlin.jvm.functions.Function1) binds: [B:69:0x0136, B:77:0x0162, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x0167 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0190  */
    /* JADX WARN: Code duplicated, block: B:86:0x0198 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a5 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ab A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b8 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3 A[Catch: all -> 0x0042, NoClassDefFoundError -> 0x0045, TRY_LEAVE, TryCatch #2 {NoClassDefFoundError -> 0x0045, all -> 0x0042, blocks: (B:14:0x003d, B:84:0x0192, B:86:0x0198, B:88:0x01a5, B:90:0x01ab, B:92:0x01b8, B:21:0x0050, B:80:0x0167, B:94:0x01c3, B:24:0x005b, B:73:0x0146, B:76:0x0160, B:27:0x006a, B:70:0x0138, B:30:0x0077, B:62:0x0118, B:65:0x012f, B:33:0x0082, B:52:0x00ee, B:54:0x00fb, B:57:0x010f, B:36:0x008c, B:46:0x00d4, B:48:0x00da, B:39:0x0094, B:42:0x00cd), top: B:111:0x002c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.sumsub.sns.internal.nfc.j] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX INFO: renamed from: a */
    public final Object m71678a(Function1 function1, ContinuationImpl continuationImpl) {
        C33376e c33376e;
        Function1 function2;
        PassportService passportService;
        Function1 function3;
        PassportService passportService2;
        ?? BooleanValue;
        Object objM71682b;
        Function1 function4;
        Object objM90350b;
        Object objM90350b2;
        PassportService passportService3;
        Function1 function5;
        ?? BooleanValue2;
        Object objM90350b3;
        ArrayList arrayList;
        int size;
        List list;
        int i11;
        List list2;
        if (continuationImpl instanceof C33376e) {
            c33376e = (C33376e) continuationImpl;
            int i12 = c33376e.f68055g;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c33376e.f68055g = i12 - Integer.MIN_VALUE;
            } else {
                c33376e = new C33376e(this, continuationImpl);
            }
        } else {
            c33376e = new C33376e(this, continuationImpl);
        }
        C33376e c33376e2 = c33376e;
        Object objM71680a = c33376e2.f68053e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c33376e2.f68055g) {
                case 0:
                    ResultKt.throwOnFailure(objM71680a);
                    C33373b.m71674a("Starting NFC reading");
                    CardService cardService = CardService.getInstance(this.f68081a);
                    cardService.open();
                    C33373b.m71674a("CardService is opened");
                    PassportService passportService4 = new PassportService(cardService, 256, 223, false, false);
                    passportService4.open();
                    C33373b.m71674a("Passport service is opened");
                    function2 = function1;
                    c33376e2.f68049a = function2;
                    c33376e2.f68050b = passportService4;
                    c33376e2.f68055g = 1;
                    Object objM90350b4 = DelayKt.m90350b(50L, c33376e2);
                    if (objM90350b4 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90350b4 = Unit.INSTANCE;
                    }
                    if (objM90350b4 != coroutine_suspended) {
                        passportService = passportService4;
                        if (this.f68083c.f68046a) {
                            c33376e2.f68049a = function2;
                            c33376e2.f68050b = passportService;
                            c33376e2.f68055g = 2;
                            objM71682b = m71682b(passportService, c33376e2);
                            if (objM71682b == coroutine_suspended) {
                                function4 = function2;
                                objM71680a = objM71682b;
                                function3 = function4;
                                passportService2 = passportService;
                                BooleanValue = ((Boolean) objM71680a).booleanValue();
                                c33376e2.f68049a = function3;
                                c33376e2.f68050b = passportService2;
                                c33376e2.f68051c = BooleanValue;
                                c33376e2.f68055g = 3;
                                objM90350b = DelayKt.m90350b(50L, c33376e2);
                                if (objM90350b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objM90350b = Unit.INSTANCE;
                                }
                                if (objM90350b != coroutine_suspended) {
                                    passportService2.sendSelectApplet(BooleanValue != 0);
                                    c33376e2.f68049a = function3;
                                    c33376e2.f68050b = passportService2;
                                    c33376e2.f68051c = BooleanValue;
                                    c33376e2.f68055g = 4;
                                    objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                                    if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objM90350b2 = Unit.INSTANCE;
                                    }
                                    if (objM90350b2 == coroutine_suspended) {
                                        passportService3 = passportService2;
                                        function5 = function3;
                                        if (BooleanValue2 == 0) {
                                            BooleanValue2 = BooleanValue;
                                            c33376e2.f68049a = function5;
                                            c33376e2.f68050b = passportService3;
                                            c33376e2.f68055g = 5;
                                            objM71680a = m71680a(passportService3, c33376e2);
                                            if (objM71680a != coroutine_suspended) {
                                                BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                                c33376e2.f68049a = function5;
                                                c33376e2.f68050b = passportService3;
                                                c33376e2.f68052d = BooleanValue2;
                                                c33376e2.f68055g = 6;
                                                objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                                if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                    objM90350b3 = Unit.INSTANCE;
                                                }
                                                if (objM90350b3 == coroutine_suspended) {
                                                    if (BooleanValue2 != 0) {
                                                        C33373b.m71674a("Auth failed");
                                                        return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                                    }
                                                    C33373b.m71674a("Reading files");
                                                    arrayList = new ArrayList();
                                                    size = this.f68083c.f68047b.size();
                                                    list = this.f68083c.f68047b;
                                                    c33376e2.f68049a = arrayList;
                                                    c33376e2.f68050b = null;
                                                    c33376e2.f68051c = size;
                                                    c33376e2.f68055g = 7;
                                                    if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                                        i11 = size;
                                                        list2 = arrayList;
                                                        if (list2.isEmpty()) {
                                                            C33373b.m71674a("No files was read");
                                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                        }
                                                        if (list2.size() != i11) {
                                                            C33373b.m71674a("Not all files were read");
                                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                        }
                                                        C33373b.m71674a("NFC read success!");
                                                        return new C33383l(list2);
                                                    }
                                                }
                                            }
                                        } else {
                                            if (BooleanValue2 != 0) {
                                                C33373b.m71674a("Auth failed");
                                                return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                            }
                                            C33373b.m71674a("Reading files");
                                            arrayList = new ArrayList();
                                            size = this.f68083c.f68047b.size();
                                            list = this.f68083c.f68047b;
                                            c33376e2.f68049a = arrayList;
                                            c33376e2.f68050b = null;
                                            c33376e2.f68051c = size;
                                            c33376e2.f68055g = 7;
                                            if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                                i11 = size;
                                                list2 = arrayList;
                                                if (list2.isEmpty()) {
                                                    C33373b.m71674a("No files was read");
                                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                }
                                                if (list2.size() != i11) {
                                                    C33373b.m71674a("Not all files were read");
                                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                }
                                                C33373b.m71674a("NFC read success!");
                                                return new C33383l(list2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            function3 = function2;
                            passportService2 = passportService;
                            BooleanValue = 0;
                            c33376e2.f68049a = function3;
                            c33376e2.f68050b = passportService2;
                            c33376e2.f68051c = BooleanValue;
                            c33376e2.f68055g = 3;
                            objM90350b = DelayKt.m90350b(50L, c33376e2);
                            if (objM90350b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM90350b = Unit.INSTANCE;
                            }
                            if (objM90350b != coroutine_suspended) {
                                passportService2.sendSelectApplet(BooleanValue != 0);
                                c33376e2.f68049a = function3;
                                c33376e2.f68050b = passportService2;
                                c33376e2.f68051c = BooleanValue;
                                c33376e2.f68055g = 4;
                                objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                                if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objM90350b2 = Unit.INSTANCE;
                                }
                                if (objM90350b2 == coroutine_suspended) {
                                    passportService3 = passportService2;
                                    function5 = function3;
                                    if (BooleanValue2 == 0) {
                                        BooleanValue2 = BooleanValue;
                                        c33376e2.f68049a = function5;
                                        c33376e2.f68050b = passportService3;
                                        c33376e2.f68055g = 5;
                                        objM71680a = m71680a(passportService3, c33376e2);
                                        if (objM71680a != coroutine_suspended) {
                                            BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                            c33376e2.f68049a = function5;
                                            c33376e2.f68050b = passportService3;
                                            c33376e2.f68052d = BooleanValue2;
                                            c33376e2.f68055g = 6;
                                            objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                            if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                objM90350b3 = Unit.INSTANCE;
                                            }
                                            if (objM90350b3 == coroutine_suspended) {
                                                if (BooleanValue2 != 0) {
                                                    C33373b.m71674a("Auth failed");
                                                    return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                                }
                                                C33373b.m71674a("Reading files");
                                                arrayList = new ArrayList();
                                                size = this.f68083c.f68047b.size();
                                                list = this.f68083c.f68047b;
                                                c33376e2.f68049a = arrayList;
                                                c33376e2.f68050b = null;
                                                c33376e2.f68051c = size;
                                                c33376e2.f68055g = 7;
                                                if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                                    i11 = size;
                                                    list2 = arrayList;
                                                    if (list2.isEmpty()) {
                                                        C33373b.m71674a("No files was read");
                                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                    }
                                                    if (list2.size() != i11) {
                                                        C33373b.m71674a("Not all files were read");
                                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                    }
                                                    C33373b.m71674a("NFC read success!");
                                                    return new C33383l(list2);
                                                }
                                            }
                                        }
                                    } else {
                                        if (BooleanValue2 != 0) {
                                            C33373b.m71674a("Auth failed");
                                            return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                        }
                                        C33373b.m71674a("Reading files");
                                        arrayList = new ArrayList();
                                        size = this.f68083c.f68047b.size();
                                        list = this.f68083c.f68047b;
                                        c33376e2.f68049a = arrayList;
                                        c33376e2.f68050b = null;
                                        c33376e2.f68051c = size;
                                        c33376e2.f68055g = 7;
                                        if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                            i11 = size;
                                            list2 = arrayList;
                                            if (list2.isEmpty()) {
                                                C33373b.m71674a("No files was read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            if (list2.size() != i11) {
                                                C33373b.m71674a("Not all files were read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            C33373b.m71674a("NFC read success!");
                                            return new C33383l(list2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    passportService = c33376e2.f68050b;
                    Function1 function6 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    function2 = function6;
                    if (this.f68083c.f68046a) {
                        c33376e2.f68049a = function2;
                        c33376e2.f68050b = passportService;
                        c33376e2.f68055g = 2;
                        objM71682b = m71682b(passportService, c33376e2);
                        if (objM71682b == coroutine_suspended) {
                            function4 = function2;
                            objM71680a = objM71682b;
                            function3 = function4;
                            passportService2 = passportService;
                            BooleanValue = ((Boolean) objM71680a).booleanValue();
                            c33376e2.f68049a = function3;
                            c33376e2.f68050b = passportService2;
                            c33376e2.f68051c = BooleanValue;
                            c33376e2.f68055g = 3;
                            objM90350b = DelayKt.m90350b(50L, c33376e2);
                            if (objM90350b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM90350b = Unit.INSTANCE;
                            }
                            if (objM90350b != coroutine_suspended) {
                                passportService2.sendSelectApplet(BooleanValue != 0);
                                c33376e2.f68049a = function3;
                                c33376e2.f68050b = passportService2;
                                c33376e2.f68051c = BooleanValue;
                                c33376e2.f68055g = 4;
                                objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                                if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objM90350b2 = Unit.INSTANCE;
                                }
                                if (objM90350b2 == coroutine_suspended) {
                                    passportService3 = passportService2;
                                    function5 = function3;
                                    if (BooleanValue2 == 0) {
                                        BooleanValue2 = BooleanValue;
                                        c33376e2.f68049a = function5;
                                        c33376e2.f68050b = passportService3;
                                        c33376e2.f68055g = 5;
                                        objM71680a = m71680a(passportService3, c33376e2);
                                        if (objM71680a != coroutine_suspended) {
                                            BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                            c33376e2.f68049a = function5;
                                            c33376e2.f68050b = passportService3;
                                            c33376e2.f68052d = BooleanValue2;
                                            c33376e2.f68055g = 6;
                                            objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                            if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                                objM90350b3 = Unit.INSTANCE;
                                            }
                                            if (objM90350b3 == coroutine_suspended) {
                                                if (BooleanValue2 != 0) {
                                                    C33373b.m71674a("Auth failed");
                                                    return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                                }
                                                C33373b.m71674a("Reading files");
                                                arrayList = new ArrayList();
                                                size = this.f68083c.f68047b.size();
                                                list = this.f68083c.f68047b;
                                                c33376e2.f68049a = arrayList;
                                                c33376e2.f68050b = null;
                                                c33376e2.f68051c = size;
                                                c33376e2.f68055g = 7;
                                                if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                                    i11 = size;
                                                    list2 = arrayList;
                                                    if (list2.isEmpty()) {
                                                        C33373b.m71674a("No files was read");
                                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                    }
                                                    if (list2.size() != i11) {
                                                        C33373b.m71674a("Not all files were read");
                                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                    }
                                                    C33373b.m71674a("NFC read success!");
                                                    return new C33383l(list2);
                                                }
                                            }
                                        }
                                    } else {
                                        if (BooleanValue2 != 0) {
                                            C33373b.m71674a("Auth failed");
                                            return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                        }
                                        C33373b.m71674a("Reading files");
                                        arrayList = new ArrayList();
                                        size = this.f68083c.f68047b.size();
                                        list = this.f68083c.f68047b;
                                        c33376e2.f68049a = arrayList;
                                        c33376e2.f68050b = null;
                                        c33376e2.f68051c = size;
                                        c33376e2.f68055g = 7;
                                        if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                            i11 = size;
                                            list2 = arrayList;
                                            if (list2.isEmpty()) {
                                                C33373b.m71674a("No files was read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            if (list2.size() != i11) {
                                                C33373b.m71674a("Not all files were read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            C33373b.m71674a("NFC read success!");
                                            return new C33383l(list2);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        function3 = function2;
                        passportService2 = passportService;
                        BooleanValue = 0;
                        c33376e2.f68049a = function3;
                        c33376e2.f68050b = passportService2;
                        c33376e2.f68051c = BooleanValue;
                        c33376e2.f68055g = 3;
                        objM90350b = DelayKt.m90350b(50L, c33376e2);
                        if (objM90350b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objM90350b = Unit.INSTANCE;
                        }
                        if (objM90350b != coroutine_suspended) {
                            passportService2.sendSelectApplet(BooleanValue != 0);
                            c33376e2.f68049a = function3;
                            c33376e2.f68050b = passportService2;
                            c33376e2.f68051c = BooleanValue;
                            c33376e2.f68055g = 4;
                            objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                            if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM90350b2 = Unit.INSTANCE;
                            }
                            if (objM90350b2 == coroutine_suspended) {
                                passportService3 = passportService2;
                                function5 = function3;
                                if (BooleanValue2 == 0) {
                                    BooleanValue2 = BooleanValue;
                                    c33376e2.f68049a = function5;
                                    c33376e2.f68050b = passportService3;
                                    c33376e2.f68055g = 5;
                                    objM71680a = m71680a(passportService3, c33376e2);
                                    if (objM71680a != coroutine_suspended) {
                                        BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                        c33376e2.f68049a = function5;
                                        c33376e2.f68050b = passportService3;
                                        c33376e2.f68052d = BooleanValue2;
                                        c33376e2.f68055g = 6;
                                        objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                        if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                            objM90350b3 = Unit.INSTANCE;
                                        }
                                        if (objM90350b3 == coroutine_suspended) {
                                            if (BooleanValue2 != 0) {
                                                C33373b.m71674a("Auth failed");
                                                return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                            }
                                            C33373b.m71674a("Reading files");
                                            arrayList = new ArrayList();
                                            size = this.f68083c.f68047b.size();
                                            list = this.f68083c.f68047b;
                                            c33376e2.f68049a = arrayList;
                                            c33376e2.f68050b = null;
                                            c33376e2.f68051c = size;
                                            c33376e2.f68055g = 7;
                                            if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                                i11 = size;
                                                list2 = arrayList;
                                                if (list2.isEmpty()) {
                                                    C33373b.m71674a("No files was read");
                                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                }
                                                if (list2.size() != i11) {
                                                    C33373b.m71674a("Not all files were read");
                                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                                }
                                                C33373b.m71674a("NFC read success!");
                                                return new C33383l(list2);
                                            }
                                        }
                                    }
                                } else {
                                    if (BooleanValue2 != 0) {
                                        C33373b.m71674a("Auth failed");
                                        return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                    }
                                    C33373b.m71674a("Reading files");
                                    arrayList = new ArrayList();
                                    size = this.f68083c.f68047b.size();
                                    list = this.f68083c.f68047b;
                                    c33376e2.f68049a = arrayList;
                                    c33376e2.f68050b = null;
                                    c33376e2.f68051c = size;
                                    c33376e2.f68055g = 7;
                                    if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                        i11 = size;
                                        list2 = arrayList;
                                        if (list2.isEmpty()) {
                                            C33373b.m71674a("No files was read");
                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                        }
                                        if (list2.size() != i11) {
                                            C33373b.m71674a("Not all files were read");
                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                        }
                                        C33373b.m71674a("NFC read success!");
                                        return new C33383l(list2);
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    passportService = c33376e2.f68050b;
                    function4 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    function3 = function4;
                    passportService2 = passportService;
                    BooleanValue = ((Boolean) objM71680a).booleanValue();
                    c33376e2.f68049a = function3;
                    c33376e2.f68050b = passportService2;
                    c33376e2.f68051c = BooleanValue;
                    c33376e2.f68055g = 3;
                    objM90350b = DelayKt.m90350b(50L, c33376e2);
                    if (objM90350b != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90350b = Unit.INSTANCE;
                    }
                    if (objM90350b != coroutine_suspended) {
                        passportService2.sendSelectApplet(BooleanValue != 0);
                        c33376e2.f68049a = function3;
                        c33376e2.f68050b = passportService2;
                        c33376e2.f68051c = BooleanValue;
                        c33376e2.f68055g = 4;
                        objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                        if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objM90350b2 = Unit.INSTANCE;
                        }
                        if (objM90350b2 == coroutine_suspended) {
                            passportService3 = passportService2;
                            function5 = function3;
                            if (BooleanValue2 == 0) {
                                BooleanValue2 = BooleanValue;
                                c33376e2.f68049a = function5;
                                c33376e2.f68050b = passportService3;
                                c33376e2.f68055g = 5;
                                objM71680a = m71680a(passportService3, c33376e2);
                                if (objM71680a != coroutine_suspended) {
                                    BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                    c33376e2.f68049a = function5;
                                    c33376e2.f68050b = passportService3;
                                    c33376e2.f68052d = BooleanValue2;
                                    c33376e2.f68055g = 6;
                                    objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                    if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                        objM90350b3 = Unit.INSTANCE;
                                    }
                                    if (objM90350b3 == coroutine_suspended) {
                                        if (BooleanValue2 != 0) {
                                            C33373b.m71674a("Auth failed");
                                            return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                        }
                                        C33373b.m71674a("Reading files");
                                        arrayList = new ArrayList();
                                        size = this.f68083c.f68047b.size();
                                        list = this.f68083c.f68047b;
                                        c33376e2.f68049a = arrayList;
                                        c33376e2.f68050b = null;
                                        c33376e2.f68051c = size;
                                        c33376e2.f68055g = 7;
                                        if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                            i11 = size;
                                            list2 = arrayList;
                                            if (list2.isEmpty()) {
                                                C33373b.m71674a("No files was read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            if (list2.size() != i11) {
                                                C33373b.m71674a("Not all files were read");
                                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                            }
                                            C33373b.m71674a("NFC read success!");
                                            return new C33383l(list2);
                                        }
                                    }
                                }
                            } else {
                                if (BooleanValue2 != 0) {
                                    C33373b.m71674a("Auth failed");
                                    return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                }
                                C33373b.m71674a("Reading files");
                                arrayList = new ArrayList();
                                size = this.f68083c.f68047b.size();
                                list = this.f68083c.f68047b;
                                c33376e2.f68049a = arrayList;
                                c33376e2.f68050b = null;
                                c33376e2.f68051c = size;
                                c33376e2.f68055g = 7;
                                if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                    i11 = size;
                                    list2 = arrayList;
                                    if (list2.isEmpty()) {
                                        C33373b.m71674a("No files was read");
                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                    }
                                    if (list2.size() != i11) {
                                        C33373b.m71674a("Not all files were read");
                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                    }
                                    C33373b.m71674a("NFC read success!");
                                    return new C33383l(list2);
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    BooleanValue = c33376e2.f68051c;
                    passportService2 = c33376e2.f68050b;
                    function3 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    passportService2.sendSelectApplet(BooleanValue != 0);
                    c33376e2.f68049a = function3;
                    c33376e2.f68050b = passportService2;
                    c33376e2.f68051c = BooleanValue;
                    c33376e2.f68055g = 4;
                    objM90350b2 = DelayKt.m90350b(50L, c33376e2);
                    if (objM90350b2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90350b2 = Unit.INSTANCE;
                    }
                    if (objM90350b2 == coroutine_suspended) {
                        passportService3 = passportService2;
                        function5 = function3;
                        if (BooleanValue2 == 0) {
                            BooleanValue2 = BooleanValue;
                            c33376e2.f68049a = function5;
                            c33376e2.f68050b = passportService3;
                            c33376e2.f68055g = 5;
                            objM71680a = m71680a(passportService3, c33376e2);
                            if (objM71680a != coroutine_suspended) {
                                BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                                c33376e2.f68049a = function5;
                                c33376e2.f68050b = passportService3;
                                c33376e2.f68052d = BooleanValue2;
                                c33376e2.f68055g = 6;
                                objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                                if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objM90350b3 = Unit.INSTANCE;
                                }
                                if (objM90350b3 == coroutine_suspended) {
                                    if (BooleanValue2 != 0) {
                                        C33373b.m71674a("Auth failed");
                                        return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                    }
                                    C33373b.m71674a("Reading files");
                                    arrayList = new ArrayList();
                                    size = this.f68083c.f68047b.size();
                                    list = this.f68083c.f68047b;
                                    c33376e2.f68049a = arrayList;
                                    c33376e2.f68050b = null;
                                    c33376e2.f68051c = size;
                                    c33376e2.f68055g = 7;
                                    if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                        i11 = size;
                                        list2 = arrayList;
                                        if (list2.isEmpty()) {
                                            C33373b.m71674a("No files was read");
                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                        }
                                        if (list2.size() != i11) {
                                            C33373b.m71674a("Not all files were read");
                                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                        }
                                        C33373b.m71674a("NFC read success!");
                                        return new C33383l(list2);
                                    }
                                }
                            }
                        } else {
                            if (BooleanValue2 != 0) {
                                C33373b.m71674a("Auth failed");
                                return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                            }
                            C33373b.m71674a("Reading files");
                            arrayList = new ArrayList();
                            size = this.f68083c.f68047b.size();
                            list = this.f68083c.f68047b;
                            c33376e2.f68049a = arrayList;
                            c33376e2.f68050b = null;
                            c33376e2.f68051c = size;
                            c33376e2.f68055g = 7;
                            if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                i11 = size;
                                list2 = arrayList;
                                if (list2.isEmpty()) {
                                    C33373b.m71674a("No files was read");
                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                }
                                if (list2.size() != i11) {
                                    C33373b.m71674a("Not all files were read");
                                    return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                }
                                C33373b.m71674a("NFC read success!");
                                return new C33383l(list2);
                            }
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    int i13 = c33376e2.f68051c;
                    passportService3 = c33376e2.f68050b;
                    function5 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    BooleanValue2 = i13;
                    if (BooleanValue2 == 0) {
                        BooleanValue2 = BooleanValue;
                        c33376e2.f68049a = function5;
                        c33376e2.f68050b = passportService3;
                        c33376e2.f68055g = 5;
                        objM71680a = m71680a(passportService3, c33376e2);
                        if (objM71680a != coroutine_suspended) {
                            BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                            c33376e2.f68049a = function5;
                            c33376e2.f68050b = passportService3;
                            c33376e2.f68052d = BooleanValue2;
                            c33376e2.f68055g = 6;
                            objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                            if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM90350b3 = Unit.INSTANCE;
                            }
                            if (objM90350b3 == coroutine_suspended) {
                                if (BooleanValue2 != 0) {
                                    C33373b.m71674a("Auth failed");
                                    return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                                }
                                C33373b.m71674a("Reading files");
                                arrayList = new ArrayList();
                                size = this.f68083c.f68047b.size();
                                list = this.f68083c.f68047b;
                                c33376e2.f68049a = arrayList;
                                c33376e2.f68050b = null;
                                c33376e2.f68051c = size;
                                c33376e2.f68055g = 7;
                                if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                                    i11 = size;
                                    list2 = arrayList;
                                    if (list2.isEmpty()) {
                                        C33373b.m71674a("No files was read");
                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                    }
                                    if (list2.size() != i11) {
                                        C33373b.m71674a("Not all files were read");
                                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                                    }
                                    C33373b.m71674a("NFC read success!");
                                    return new C33383l(list2);
                                }
                            }
                        }
                    } else {
                        if (BooleanValue2 != 0) {
                            C33373b.m71674a("Auth failed");
                            return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                        }
                        C33373b.m71674a("Reading files");
                        arrayList = new ArrayList();
                        size = this.f68083c.f68047b.size();
                        list = this.f68083c.f68047b;
                        c33376e2.f68049a = arrayList;
                        c33376e2.f68050b = null;
                        c33376e2.f68051c = size;
                        c33376e2.f68055g = 7;
                        if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                            i11 = size;
                            list2 = arrayList;
                            if (list2.isEmpty()) {
                                C33373b.m71674a("No files was read");
                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                            }
                            if (list2.size() != i11) {
                                C33373b.m71674a("Not all files were read");
                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                            }
                            C33373b.m71674a("NFC read success!");
                            return new C33383l(list2);
                        }
                    }
                    return coroutine_suspended;
                case 5:
                    PassportService passportService5 = c33376e2.f68050b;
                    Function1 function7 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    function5 = function7;
                    passportService3 = passportService5;
                    BooleanValue2 = ((Boolean) objM71680a).booleanValue();
                    c33376e2.f68049a = function5;
                    c33376e2.f68050b = passportService3;
                    c33376e2.f68052d = BooleanValue2;
                    c33376e2.f68055g = 6;
                    objM90350b3 = DelayKt.m90350b(50L, c33376e2);
                    if (objM90350b3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objM90350b3 = Unit.INSTANCE;
                    }
                    if (objM90350b3 == coroutine_suspended) {
                        if (BooleanValue2 != 0) {
                            C33373b.m71674a("Auth failed");
                            return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                        }
                        C33373b.m71674a("Reading files");
                        arrayList = new ArrayList();
                        size = this.f68083c.f68047b.size();
                        list = this.f68083c.f68047b;
                        c33376e2.f68049a = arrayList;
                        c33376e2.f68050b = null;
                        c33376e2.f68051c = size;
                        c33376e2.f68055g = 7;
                        if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                            i11 = size;
                            list2 = arrayList;
                            if (list2.isEmpty()) {
                                C33373b.m71674a("No files was read");
                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                            }
                            if (list2.size() != i11) {
                                C33373b.m71674a("Not all files were read");
                                return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                            }
                            C33373b.m71674a("NFC read success!");
                            return new C33383l(list2);
                        }
                    }
                    return coroutine_suspended;
                case 6:
                    BooleanValue2 = c33376e2.f68052d;
                    passportService3 = c33376e2.f68050b;
                    function5 = (Function1) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    if (BooleanValue2 != 0) {
                        C33373b.m71674a("Auth failed");
                        return new C33382k(NfcResult$Failed$Reason.AUTH_FAILED);
                    }
                    C33373b.m71674a("Reading files");
                    arrayList = new ArrayList();
                    size = this.f68083c.f68047b.size();
                    list = this.f68083c.f68047b;
                    c33376e2.f68049a = arrayList;
                    c33376e2.f68050b = null;
                    c33376e2.f68051c = size;
                    c33376e2.f68055g = 7;
                    if (m71679a(passportService3, size, function5, list, arrayList, c33376e2) != coroutine_suspended) {
                        i11 = size;
                        list2 = arrayList;
                        if (list2.isEmpty()) {
                            C33373b.m71674a("No files was read");
                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                        }
                        if (list2.size() != i11) {
                            C33373b.m71674a("Not all files were read");
                            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                        }
                        C33373b.m71674a("NFC read success!");
                        return new C33383l(list2);
                    }
                    return coroutine_suspended;
                case 7:
                    i11 = c33376e2.f68051c;
                    list2 = (List) c33376e2.f68049a;
                    ResultKt.throwOnFailure(objM71680a);
                    if (list2.isEmpty()) {
                        C33373b.m71674a("No files was read");
                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                    }
                    if (list2.size() != i11) {
                        C33373b.m71674a("Not all files were read");
                        return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
                    }
                    C33373b.m71674a("NFC read success!");
                    return new C33383l(list2);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (NoClassDefFoundError e11) {
            if (C28468k0.f57988f) {
                throw new RuntimeException(e11);
            }
            C33272c.f67816e.f67810a.mo68955d("NfcReader", "Class not found", e11);
            C33296b c33296bM71618b = C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA}));
            String message = e11.getMessage();
            c33296bM71618b.mo68959w("NfcReader", message != null ? message : "Class not found", e11);
            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
        } catch (Throwable th2) {
            C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to auth or read", th2);
            if (m71676a(th2)) {
                C33373b.m71674a("Tag was lost");
                return new C33382k(NfcResult$Failed$Reason.TAG_WAS_LOST);
            }
            C33373b.m71674a("Generic read failure");
            return new C33382k(NfcResult$Failed$Reason.READ_FAILED);
        }
    }

    static {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.m90091to((short) 286, "COM"), TuplesKt.m90091to((short) 285, "SOD"), TuplesKt.m90091to((short) 257, "DG1"), TuplesKt.m90091to((short) 258, "DG2"), TuplesKt.m90091to((short) 259, "DG3"), TuplesKt.m90091to((short) 260, "DG4"), TuplesKt.m90091to((short) 261, "DG5"), TuplesKt.m90091to((short) 262, "DG6"), TuplesKt.m90091to((short) 263, "DG7"), TuplesKt.m90091to((short) 264, "DG8"), TuplesKt.m90091to((short) 265, "DG9"), TuplesKt.m90091to((short) 266, "DG10"), TuplesKt.m90091to((short) 267, "DG11"), TuplesKt.m90091to((short) 268, "DG12"), TuplesKt.m90091to((short) 269, "DG13"), TuplesKt.m90091to((short) 270, "DG14"), TuplesKt.m90091to((short) 271, "DG15"), TuplesKt.m90091to((short) 272, "DG16"));
        f68079d = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapMapOf.entrySet()) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        f68080e = linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m71682b(PassportService passportService, ContinuationImpl continuationImpl) {
        C33380i c33380i;
        C33381j c33381j;
        PassportService passportService2;
        Exception exc;
        if (continuationImpl instanceof C33380i) {
            c33380i = (C33380i) continuationImpl;
            int i11 = c33380i.f68078d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33380i.f68078d = i11 - Integer.MIN_VALUE;
            } else {
                c33380i = new C33380i(this, continuationImpl);
            }
        } else {
            c33380i = new C33380i(this, continuationImpl);
        }
        C33380i c33380i2 = c33380i;
        Object objM71681a = c33380i2.f68076b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33380i2.f68078d;
        boolean z11 = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71681a);
            C33373b.m71674a("Trying PACE");
            try {
                c33380i2.f68075a = passportService;
                c33380i2.f68078d = 1;
                c33381j = this;
                try {
                    objM71681a = c33381j.m71681a(passportService, (short) 284, "EF_CARD_ACCESS", 1, 300, (ContinuationImpl) c33380i2);
                    if (objM71681a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    passportService2 = passportService;
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to do PACE", exc);
                }
            } catch (Exception e12) {
                e = e12;
                exc = e;
                C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to do PACE", exc);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            passportService2 = c33380i2.f68075a;
            try {
                ResultKt.throwOnFailure(objM71681a);
                c33381j = this;
            } catch (Exception e13) {
                exc = e13;
                C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to do PACE", exc);
            }
        }
        CardAccessFile cardAccessFile = new CardAccessFile(new ByteArrayInputStream((byte[]) objM71681a));
        PACEKeySpec pACEKeySpec = new PACEKeySpec(c33381j.f68082b, (byte) 1);
        C33373b.m71674a("Got input stream for EF_CARD_ACCESS");
        Collection<PACEInfo> securityInfos = cardAccessFile.getSecurityInfos();
        C33373b.m71674a("Iteration securityInfos");
        for (PACEInfo pACEInfo : securityInfos) {
            C33373b.m71674a("Reading " + pACEInfo.getProtocolOIDString() + ", " + pACEInfo.getObjectIdentifier());
            if (pACEInfo instanceof PACEInfo) {
                C33373b.m71674a("Found PACEInfo, trying it");
                passportService2.doPACE(pACEKeySpec, pACEInfo.getObjectIdentifier(), PACEInfo.toParameterSpec(pACEInfo.getParameterId()), (BigInteger) null);
                C33373b.m71674a("PACE succeeded");
                z11 = true;
            }
        }
        C33373b.m71674a("paceSucceeded = " + z11);
        return Boxing.boxBoolean(z11);
    }

    public C33381j(IsoDep isoDep, byte[] bArr, C33372a c33372a) {
        this.f68081a = isoDep;
        this.f68082b = bArr;
        this.f68083c = c33372a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m71680a(PassportService passportService, ContinuationImpl continuationImpl) {
        C33379h c33379h;
        C33381j c33381j;
        PassportService passportService2;
        PassportService passportService3;
        if (continuationImpl instanceof C33379h) {
            c33379h = (C33379h) continuationImpl;
            int i11 = c33379h.f68074d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c33379h.f68074d = i11 - Integer.MIN_VALUE;
            } else {
                c33379h = new C33379h(this, continuationImpl);
            }
        } else {
            c33379h = new C33379h(this, continuationImpl);
        }
        C33379h c33379h2 = c33379h;
        Object objM71681a = c33379h2.f68072b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c33379h2.f68074d;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71681a);
            C33373b.m71674a("Trying BAC");
            try {
                c33379h2.f68071a = passportService;
                c33379h2.f68074d = 1;
                c33381j = this;
                passportService2 = passportService;
                try {
                    objM71681a = c33381j.m71681a(passportService2, (short) 286, "EF_COM", 1, 300, (ContinuationImpl) c33379h2);
                    if (objM71681a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    passportService3 = passportService2;
                } catch (Exception unused) {
                    passportService3 = passportService2;
                    passportService3.doBAC(new C33374c(c33381j.f68082b));
                    C33373b.m71674a("bacSucceeded = " + z11);
                    return Boxing.boxBoolean(z11);
                }
            } catch (Exception unused2) {
                c33381j = this;
                passportService2 = passportService;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            passportService3 = c33379h2.f68071a;
            try {
                ResultKt.throwOnFailure(objM71681a);
                c33381j = this;
                try {
                } catch (Exception unused3) {
                    try {
                        passportService3.doBAC(new C33374c(c33381j.f68082b));
                    } catch (Exception e11) {
                        C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to do BAC", e11);
                        z11 = false;
                    }
                }
            } catch (Exception unused4) {
                c33381j = this;
                passportService3.doBAC(new C33374c(c33381j.f68082b));
                C33373b.m71674a("bacSucceeded = " + z11);
                return Boxing.boxBoolean(z11);
            }
        }
        C33373b.m71674a("bacSucceeded = " + z11);
        return Boxing.boxBoolean(z11);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m71676a(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        if (th2 instanceof TagLostException) {
            return true;
        }
        return m71676a(th2.getCause());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x015b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0160 -> B:13:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m71679a(org.jmrtd.PassportService r17, int r18, p852kotlin.jvm.functions.Function1 r19, java.util.List r20, java.util.ArrayList r21, p852kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sumsub.sns.internal.nfc.C33381j.m71679a(org.jmrtd.PassportService, int, kotlin.jvm.functions.Function1, java.util.List, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71681a(final PassportService passportService, short s11, String str, int i11, int i12, ContinuationImpl continuationImpl) throws Exception {
        C33377f c33377f;
        if (continuationImpl instanceof C33377f) {
            c33377f = (C33377f) continuationImpl;
            int i13 = c33377f.f68060e;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33377f.f68060e = i13 - Integer.MIN_VALUE;
            } else {
                c33377f = new C33377f(this, continuationImpl);
            }
        } else {
            c33377f = new C33377f(this, continuationImpl);
        }
        Object objM71683a = c33377f.f68058c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = c33377f.f68060e;
        try {
            if (i14 == 0) {
                ResultKt.throwOnFailure(objM71683a);
                final short s12 = s11;
                Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.nfc.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C33381j.m71677a(passportService, s12);
                    }
                };
                c33377f.f68057b = str;
                c33377f.f68056a = s11;
                c33377f.f68060e = 1;
                objM71683a = AbstractC33386o.m71683a(i11, i12, function0, c33377f);
                if (objM71683a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s11 = c33377f.f68056a;
                str = c33377f.f68057b;
                ResultKt.throwOnFailure(objM71683a);
            }
            return (byte[]) objM71683a;
        } catch (Exception e11) {
            C33272c.f67816e.f67810a.mo68955d("NfcReader", "Failed to read file " + str + " (" + ((int) s11) + ") ", e11);
            throw e11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m71677a(PassportService passportService, short s11) {
        CardFileInputStream inputStream = passportService.getInputStream(s11, 223);
        try {
            byte[] bArr = new byte[inputStream.getLength()];
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readFully(bArr);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(dataInputStream, null);
                CloseableKt.closeFinally(inputStream, null);
                return bArr;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(dataInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                CloseableKt.closeFinally(inputStream, th4);
                throw th5;
            }
        }
    }
}
