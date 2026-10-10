package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33641f4;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.c */
/* JADX INFO: loaded from: classes64.dex */
public class C35423c {

    /* JADX INFO: renamed from: a */
    private C35421a f76575a;

    /* JADX INFO: renamed from: b */
    private C35421a f76576b;

    /* JADX INFO: renamed from: c */
    private ArrayList<String> f76577c;

    /* JADX INFO: renamed from: d */
    private String f76578d;

    /* JADX INFO: renamed from: a */
    public synchronized Object m78850a() {
        Object objM78812b;
        try {
            ArrayList arrayList = (ArrayList) this.f76576b.m78812b(this.f76578d);
            ArrayList arrayList2 = null;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str = (String) arrayList.get(i11);
                    if (!TextUtils.isEmpty(str) && (objM78812b = this.f76575a.m78812b(str)) != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(objM78812b);
                    }
                }
                this.f76575a.m78806a();
                this.f76576b.m78806a();
                this.f76577c.clear();
                return arrayList2;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized Object m78853b(String str) {
        return this.f76575a.m78812b(str);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m78855c() {
        this.f76575a.m78806a();
        this.f76576b.m78806a();
        this.f76577c.clear();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78851a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f76575a.m78813c(str);
        this.f76577c.remove(str);
        this.f76576b.m78813c(this.f76578d);
        if (!this.f76577c.isEmpty()) {
            this.f76576b.m78807a(this.f76578d, this.f76577c);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized ArrayList<String> m78854b() {
        return (ArrayList) this.f76577c.clone();
    }

    public C35423c(Context context, String str) {
        this.f76575a = null;
        this.f76576b = null;
        this.f76577c = null;
        this.f76578d = null;
        this.f76575a = C35421a.m78803a(context, str);
        String str2 = str + C33641f4.f69838y;
        this.f76578d = str2;
        C35421a c35421aM78803a = C35421a.m78803a(context, str2);
        this.f76576b = c35421aM78803a;
        ArrayList<String> arrayList = (ArrayList) c35421aM78803a.m78812b(this.f76578d);
        this.f76577c = arrayList;
        if (arrayList == null) {
            this.f76577c = new ArrayList<>();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78852a(String str, Serializable serializable) {
        if (serializable != null) {
            if (!TextUtils.isEmpty(str)) {
                this.f76575a.m78813c(str);
                this.f76575a.m78807a(str, serializable);
                this.f76577c.remove(str);
                this.f76577c.add(str);
                this.f76576b.m78813c(this.f76578d);
                this.f76576b.m78807a(this.f76578d, this.f76577c);
            }
        }
    }
}
