package com.sumsub.sns.core.presentation;

import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.analytics.Screen;
import java.util.ArrayList;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28047a {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f57189a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static Screen m69058a(AbstractC28133l abstractC28133l) {
        Object obj;
        Screen screen;
        ArrayList arrayList = f57189a;
        int size = arrayList.size();
        int i11 = 0;
        do {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
        } while (((Function1) obj).invoke(abstractC28133l) == null);
        Function1 function1 = (Function1) obj;
        return (function1 == null || (screen = (Screen) function1.invoke(abstractC28133l)) == null) ? Screen.Other : screen;
    }
}
