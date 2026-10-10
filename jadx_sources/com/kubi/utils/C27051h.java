package com.kubi.utils;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.kubi.utils.h */
/* JADX INFO: compiled from: BundleHelper.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27051h {

    /* JADX INFO: renamed from: a */
    public final Bundle f54337a = new Bundle();

    /* JADX INFO: renamed from: a */
    public Bundle m66717a() {
        return this.f54337a;
    }

    /* JADX INFO: renamed from: c */
    public C27051h m66719c(String str, boolean z11) {
        this.f54337a.putBoolean(str, z11);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C27051h m66720d(String str, int i11) {
        this.f54337a.putInt(str, i11);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C27051h m66721e(String str, Parcelable parcelable) {
        this.f54337a.putParcelable(str, parcelable);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C27051h m66722f(String str, ArrayList<? extends Parcelable> arrayList) {
        this.f54337a.putParcelableArrayList(str, arrayList);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C27051h m66723g(String str, Serializable serializable) {
        this.f54337a.putSerializable(str, serializable);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C27051h m66724h(String str, String str2) {
        this.f54337a.putString(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C27051h m66725i(String str, List<String> list) {
        this.f54337a.putStringArrayList(str, (list == null || list.size() <= 0) ? null : new ArrayList<>(list));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public <T extends Fragment> T m66718b(T t11) {
        t11.setArguments(m66717a());
        return t11;
    }
}
