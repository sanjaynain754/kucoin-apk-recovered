package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33769l6 implements InterfaceC34036y8 {

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC34036y8> f70831i;

    @Override // com.tencent.bugly.proguard.InterfaceC34036y8
    /* JADX INFO: renamed from: a */
    public ArrayList<String> mo73003a(int i11, int i12) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                arrayList.addAll(interfaceC34036y8.mo73003a(i11, i12));
            }
        }
        return arrayList;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34036y8
    /* JADX INFO: renamed from: b */
    public void mo73007b(int i11) {
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73007b(i11);
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33996w8
    /* JADX INFO: renamed from: c */
    public void mo73008c(int i11) {
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73008c(i11);
            }
        }
    }

    public C33769l6(List<InterfaceC34036y8> list) {
        if (list == null) {
            this.f70831i = Collections.EMPTY_LIST;
        } else {
            this.f70831i = list;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33916s8
    /* JADX INFO: renamed from: b */
    public void mo73006b() {
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73006b();
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33996w8
    /* JADX INFO: renamed from: a */
    public void mo73004a(int i11, C33706i6 c33706i6) {
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73004a(i11, c33706i6);
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33916s8
    /* JADX INFO: renamed from: a */
    public void mo73005a(C33748k6 c33748k6) {
        for (InterfaceC34036y8 interfaceC34036y8 : this.f70831i) {
            if (interfaceC34036y8 != null) {
                interfaceC34036y8.mo73005a(c33748k6);
            }
        }
    }
}
