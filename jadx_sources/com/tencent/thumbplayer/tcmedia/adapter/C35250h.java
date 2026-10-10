package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.h */
/* JADX INFO: loaded from: classes62.dex */
public class C35250h {

    /* JADX INFO: renamed from: a */
    private String f75783a;

    /* JADX INFO: renamed from: b */
    private int f75784b;

    /* JADX INFO: renamed from: c */
    private ParcelFileDescriptor f75785c;

    /* JADX INFO: renamed from: d */
    private AssetFileDescriptor f75786d;

    /* JADX INFO: renamed from: e */
    private Map<String, String> f75787e = new HashMap();

    /* JADX INFO: renamed from: f */
    private ITPMediaAsset f75788f;

    /* JADX INFO: renamed from: g */
    private C35243e f75789g;

    /* JADX INFO: renamed from: a */
    public String m77800a() {
        return this.f75783a;
    }

    /* JADX INFO: renamed from: a */
    public void m77801a(AssetFileDescriptor assetFileDescriptor) {
        this.f75783a = null;
        this.f75784b = 4;
        this.f75787e.clear();
        this.f75785c = null;
        this.f75786d = assetFileDescriptor;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m77807b() {
        return this.f75787e;
    }

    /* JADX INFO: renamed from: c */
    public ParcelFileDescriptor m77808c() {
        return this.f75785c;
    }

    /* JADX INFO: renamed from: d */
    public AssetFileDescriptor m77809d() {
        return this.f75786d;
    }

    /* JADX INFO: renamed from: e */
    public ITPMediaAsset m77810e() {
        return this.f75788f;
    }

    /* JADX INFO: renamed from: f */
    public C35243e m77811f() {
        return this.f75789g;
    }

    /* JADX INFO: renamed from: g */
    public int m77812g() {
        return this.f75784b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m77813h() {
        return (TextUtils.isEmpty(this.f75783a) && this.f75785c == null && this.f75786d == null && this.f75788f == null && this.f75789g == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public void m77802a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f75783a = null;
        this.f75784b = 1;
        this.f75787e.clear();
        this.f75785c = parcelFileDescriptor;
        this.f75786d = null;
    }

    /* JADX INFO: renamed from: a */
    public void m77803a(C35243e c35243e) {
        this.f75783a = null;
        this.f75784b = 3;
        this.f75785c = null;
        this.f75786d = null;
        this.f75789g = c35243e;
    }

    /* JADX INFO: renamed from: a */
    public void m77804a(ITPMediaAsset iTPMediaAsset) {
        this.f75783a = null;
        this.f75784b = 2;
        this.f75787e.clear();
        this.f75785c = null;
        this.f75786d = null;
        this.f75788f = iTPMediaAsset;
    }

    /* JADX INFO: renamed from: a */
    public void m77805a(String str) {
        this.f75783a = str;
        this.f75784b = 0;
        this.f75785c = null;
        this.f75786d = null;
    }

    /* JADX INFO: renamed from: a */
    public void m77806a(Map<String, String> map) {
        this.f75787e.clear();
        Map<String, String> map2 = this.f75787e;
        if (map == null) {
            map = new HashMap<>(0);
        }
        map2.putAll(map);
    }
}
