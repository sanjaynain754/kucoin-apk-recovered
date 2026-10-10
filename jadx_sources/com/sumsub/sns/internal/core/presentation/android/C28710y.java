package com.sumsub.sns.internal.core.presentation.android;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.analytics.C28368g;
import com.sumsub.sns.internal.core.analytics.NavigationAction;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28710y implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final ActivityResultRegistry f58383a;

    /* JADX INFO: renamed from: b */
    public final String f58384b;

    /* JADX INFO: renamed from: c */
    public final String[] f58385c;

    /* JADX INFO: renamed from: d */
    public final Function2 f58386d;

    /* JADX INFO: renamed from: e */
    public final String f58387e;

    /* JADX INFO: renamed from: f */
    public ActivityResultLauncher f58388f;

    /* JADX INFO: renamed from: g */
    public ActivityResultLauncher f58389g;

    /* JADX INFO: renamed from: h */
    public String f58390h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f58391i = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static final void m69534a(C28710y c28710y, Uri uri) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(c28710y), "PickerLifecycleObserver.getSingleContent.callback requestId=" + c28710y.f58390h, null, 4, null);
        String str = c28710y.f58390h;
        if (str != null) {
            Function2 function2 = c28710y.f58386d;
            if (function2 != null) {
                function2.invoke(str, uri);
            }
            c28710y.f58390h = null;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "PickerLifecycleObserver.onCreate: requestId=" + this.f58390h, null, 4, null);
        this.f58388f = this.f58383a.register("singlePicker_" + this.f58384b, new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: com.sumsub.sns.internal.core.presentation.android.r0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C28710y.m69534a(this.f58353a, (Uri) obj);
            }
        });
        this.f58389g = this.f58383a.register("multiplePicker_" + this.f58384b, new ActivityResultContracts.OpenMultipleDocuments(), new ActivityResultCallback() { // from class: com.sumsub.sns.internal.core.presentation.android.s0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                C28710y.m69535a(this.f58356a, (List) obj);
            }
        });
        Iterator it = this.f58391i.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public C28710y(ActivityResultRegistry activityResultRegistry, String str, String[] strArr, Function2 function2, String str2) {
        this.f58383a = activityResultRegistry;
        this.f58384b = str;
        this.f58385c = strArr;
        this.f58386d = function2;
        this.f58387e = str2;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
        ActivityResultLauncher activityResultLauncher = this.f58388f;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        ActivityResultLauncher activityResultLauncher2 = this.f58389g;
        if (activityResultLauncher2 != null) {
            activityResultLauncher2.unregister();
        }
        Iterator it = this.f58391i.iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69535a(C28710y c28710y, List list) {
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(c28710y), "PickerLifecycleObserver.getMultipleContent.callback requestId=" + c28710y.f58390h, null, 4, null);
        if (c28710y.f58390h != null) {
            c28710y.f58390h = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69536a(String str) {
        Screen screen;
        Logger.DefaultImpls.v$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "PickerLifecycleObserver.selectFile: " + str, null, 4, null);
        C28368g c28368g = new C28368g();
        String[] strArr = this.f58385c;
        if (strArr != null) {
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (!StringsKt.contains$default((CharSequence) strArr[i11], (CharSequence) "image", false, 2, (Object) null)) {
                        screen = Screen.SystemDocumentPicker;
                        break;
                    }
                    i11++;
                } else {
                    screen = Screen.SystemImagePicker;
                    break;
                }
            }
        } else {
            screen = Screen.SystemDocumentPicker;
            break;
        }
        C28368g c28368gM69265a = c28368g.m69265a(screen, this.f58387e, null);
        c28368gM69265a.f57846b.add(NavigationAction.Opened);
        c28368gM69265a.f57847c = MapsKt.emptyMap();
        c28368gM69265a.m69267a(false);
        this.f58390h = str;
        try {
            ActivityResultLauncher activityResultLauncher = this.f58388f;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(this.f58385c);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(AbstractC33294e.m71624a(this), "PickerLifecycleObserver.selectMultipleFile: " + str, e11);
            return false;
        }
    }
}
