package com.tencent.thumbplayer.tcmedia.adapter.p151a.p153b;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.core.common.TPNativeLibraryException;
import com.tencent.thumbplayer.tcmedia.core.common.TPThumbplayerCapabilityHelper;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.b.a */
/* JADX INFO: loaded from: classes62.dex */
public class C35238a {

    /* JADX INFO: renamed from: a */
    private static Set<String> f75646a = new HashSet();

    /* JADX INFO: renamed from: b */
    private static Set<String> f75647b = new HashSet();

    /* JADX INFO: renamed from: a */
    public static synchronized void m77560a(Context context) {
        TPLogUtil.m78800i("TPDrmCapability", "TPDrmCapability, init");
        TPLogUtil.m78800i("TPDrmCapability", "TPDrmCapability, get shared preferences.");
        SharedPreferences sharedPreferences = context.getSharedPreferences("TP_DRM_CAPABILITY", 0);
        try {
            f75646a = sharedPreferences.getStringSet("DRM_CAPABILITY_LIST", f75646a);
        } catch (ClassCastException e11) {
            TPLogUtil.m78798e("TPDrmCapability", e11);
        }
        f75646a.removeAll(f75647b);
        m77561a(sharedPreferences);
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m77565b(@TPCommonEnum.TP_DRM_TYPE int i11) {
        if (i11 == -1) {
            return;
        }
        f75647b.add(String.valueOf(i11));
        f75646a.removeAll(f75647b);
    }

    /* JADX INFO: renamed from: a */
    private static void m77561a(final SharedPreferences sharedPreferences) {
        C35435o.m78917a().m78924d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.adapter.a.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int[] dRMCapabilities = new int[0];
                try {
                    dRMCapabilities = TPThumbplayerCapabilityHelper.getDRMCapabilities();
                } catch (TPNativeLibraryException unused) {
                }
                TPLogUtil.m78800i("TPDrmCapability", "TPThumbPlayerCapabilityHelper, DRM capability:" + Arrays.toString(dRMCapabilities));
                if (dRMCapabilities.length == 0) {
                    return;
                }
                HashSet hashSet = new HashSet();
                for (int i11 : dRMCapabilities) {
                    hashSet.add(String.valueOf(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, i11)));
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putStringSet("DRM_CAPABILITY_LIST", hashSet);
                editorEdit.apply();
                synchronized (C35238a.class) {
                    Set unused2 = C35238a.f75646a = hashSet;
                    C35238a.f75646a.removeAll(C35238a.f75647b);
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m77562a(@TPCommonEnum.TP_DRM_TYPE int i11) {
        if (i11 == -1) {
            return false;
        }
        Iterator<String> it = f75646a.iterator();
        while (it.hasNext()) {
            if (C35422b.m78842a(it.next(), -1) == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized int[] m77563a() {
        int[] iArr;
        iArr = new int[f75646a.size()];
        Iterator<String> it = f75646a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            iArr[i11] = C35422b.m78842a(it.next(), -1);
            i11 = i12;
        }
        return iArr;
    }
}
