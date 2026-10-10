package jumio.core;

import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.ExposureLevel;
import com.jumio.commons.camera.LensDistance;
import com.jumio.commons.camera.WhiteBalance;
import com.jumio.core.processor.ProcessorImage;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jumio.core.AbstractC40620Y;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.Y */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40620Y {
    /* JADX INFO: renamed from: a */
    public static final CaptureSettings m89245a(LensDistance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new CaptureSettings(null, null, it, 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final CaptureSettings m89244a(ExposureLevel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new CaptureSettings(it, null, null, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public static final CaptureSettings m89246a(WhiteBalance it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new CaptureSettings(null, it, null, 5, null);
    }

    /* JADX INFO: renamed from: a */
    public static C40610W m89248a(C40605V config, String id2) {
        C40625Z c40625z;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(id2, "id");
        String strReplace$default = StringsKt.replace$default(id2, C33820nf.f71144W, "", false, 4, (Object) null);
        ArrayList nonce = new ArrayList();
        int i11 = 0;
        for (int i12 = 0; i12 < strReplace$default.length(); i12++) {
            Integer intOrNull = StringsKt.toIntOrNull(String.valueOf(strReplace$default.charAt(i12)), 16);
            if (intOrNull != null) {
                nonce.add(intOrNull);
            }
        }
        C40625Z c40625z2 = config.f90137f;
        C40661f3 c40661f3 = new C40661f3(c40625z2.f90189a, Math.min(LensDistance.getEntries().size() - 2, c40625z2.f90190b));
        C40625Z c40625z3 = config.f90136e;
        C40661f3 c40661f4 = new C40661f3(c40625z3.f90189a, Math.min(ExposureLevel.getEntries().size() - 2, c40625z3.f90190b));
        C40625Z c40625z4 = config.f90138g;
        List<C40661f3> bounds = CollectionsKt.listOf((Object[]) new C40661f3[]{c40661f3, c40661f4, new C40661f3(c40625z4.f90189a, Math.min(WhiteBalance.getEntries().size() - 2, c40625z4.f90190b))});
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        int size = bounds.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(0);
        }
        int i14 = 0;
        for (Object obj : nonce) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i16 = i14 % size;
            arrayList.set(i16, Integer.valueOf(((Number) arrayList.get(i16)).intValue() + ((Number) obj).intValue()));
            i14 = i15;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(bounds, 10));
        for (C40661f3 c40661f5 : bounds) {
            arrayList2.add(Integer.valueOf((c40661f5.f90268b - c40661f5.f90267a) + 1));
        }
        List<Pair> listZip = CollectionsKt.zip(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip, 10));
        for (Pair pair : listZip) {
            arrayList3.add(Integer.valueOf(((Number) pair.component1()).intValue() % ((Number) pair.component2()).intValue()));
        }
        List<Pair> listZip2 = CollectionsKt.zip(bounds, arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listZip2, 10));
        for (Pair pair2 : listZip2) {
            arrayList4.add(Integer.valueOf(((C40661f3) pair2.component1()).f90267a + ((Number) pair2.component2()).intValue()));
        }
        int size2 = nonce.size() / 3;
        List listSubList = nonce.subList(0, size2);
        int i17 = size2 * 2;
        List listSubList2 = nonce.subList(size2, i17);
        List listSubList3 = nonce.subList(i17, nonce.size());
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) m89247a(((Number) arrayList4.get(0)).intValue(), listSubList, LensDistance.getEntries(), new Function1() { // from class: lg0.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC40620Y.m89245a((LensDistance) obj2);
            }
        }), (Iterable) m89247a(((Number) arrayList4.get(1)).intValue(), listSubList2, ExposureLevel.getEntries(), new Function1() { // from class: lg0.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC40620Y.m89244a((ExposureLevel) obj2);
            }
        })), (Iterable) m89247a(((Number) arrayList4.get(2)).intValue(), listSubList3, WhiteBalance.getEntries(), new Function1() { // from class: lg0.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC40620Y.m89246a((WhiteBalance) obj2);
            }
        }));
        List numbers = CollectionsKt.toList(CollectionsKt.getIndices(listPlus));
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        List listM89255a = AbstractC40666g3.m89255a(numbers.size(), new C40661f3(0, numbers.size() - 1), nonce);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM89255a, 10));
        Iterator it = listM89255a.iterator();
        while (it.hasNext()) {
            arrayList5.add(Integer.valueOf(((Number) numbers.get(((Number) it.next()).intValue())).intValue()));
        }
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
        for (Object obj2 : arrayList5) {
            int i18 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CaptureSettings captureSettings = (CaptureSettings) listPlus.get(((Number) obj2).intValue());
            if (captureSettings.getLevel() != ExposureLevel.AUTO) {
                c40625z = config.f90136e;
            } else if (captureSettings.getDistance() != LensDistance.AUTO) {
                c40625z = config.f90137f;
            } else if (captureSettings.getWhiteBalance() != WhiteBalance.AUTO) {
                c40625z = config.f90138g;
            } else {
                c40625z = new C40625Z(0, 0, 0.0f, 0.0f, 0L);
            }
            arrayList6.add(new ProcessorImage.ChallengeImage(config.f90135d + '_' + i11, captureSettings, c40625z.f90191c, c40625z.f90192d, c40625z.f90193e, false, 32, null));
            i11 = i18;
        }
        return new C40610W(config.f90133b, config.f90134c, config.f90135d, arrayList6);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m89247a(int i11, List list, EnumEntries enumEntries, Function1 function1) {
        List listM89255a = AbstractC40666g3.m89255a(i11, new C40661f3(0, enumEntries.size() - 3), list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM89255a.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List listDrop = CollectionsKt.drop(enumEntries, 2);
            ArrayList arrayList2 = new ArrayList();
            int i12 = 0;
            for (Object obj : listDrop) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (i12 == iIntValue) {
                    arrayList2.add(obj);
                }
                i12 = i13;
            }
            Enum r11 = (Enum) CollectionsKt.firstOrNull((List) arrayList2);
            CaptureSettings captureSettings = r11 != null ? (CaptureSettings) function1.invoke(r11) : null;
            if (captureSettings != null) {
                arrayList.add(captureSettings);
            }
        }
        return arrayList;
    }
}
