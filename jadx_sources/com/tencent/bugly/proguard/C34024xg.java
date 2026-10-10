package com.tencent.bugly.proguard;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34024xg implements Comparable {

    /* JADX INFO: renamed from: b */
    public String f72528b;

    /* JADX INFO: renamed from: c */
    public long f72529c;

    /* JADX INFO: renamed from: d */
    public long f72530d;

    /* JADX INFO: renamed from: e */
    public long f72531e;

    /* JADX INFO: renamed from: f */
    public long f72532f;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return (!(obj instanceof C34024xg) || this.f72529c >= ((C34024xg) obj).f72529c) ? 1 : -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("\nmTimeStamp = ");
        sb2.append(this.f72529c);
        sb2.append(",\nmWalkStackTimeCost = ");
        sb2.append(this.f72530d);
        sb2.append(",\nmSuspendTimeCost = ");
        sb2.append(this.f72531e);
        sb2.append(",\nmRequestDelay = ");
        sb2.append(this.f72532f);
        sb2.append(",\nmStacks = \n");
        sb2.append(this.f72528b);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        return sb2.toString();
    }
}
