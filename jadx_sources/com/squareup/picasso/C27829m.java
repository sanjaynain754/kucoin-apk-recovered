package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.squareup.picasso.m */
/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27829m implements InterfaceC27820d {

    /* JADX INFO: renamed from: a */
    public final LruCache<String, b> f56776a;

    /* JADX INFO: renamed from: com.squareup.picasso.m$a */
    /* JADX INFO: compiled from: LruCache.java */
    public class a extends LruCache<String, b> {
        public a(int i11) {
            super(i11);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f56779b;
        }
    }

    public C27829m(@NonNull Context context) {
        this(C27841y.m68936b(context));
    }

    /* JADX INFO: renamed from: com.squareup.picasso.m$b */
    /* JADX INFO: compiled from: LruCache.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Bitmap f56778a;

        /* JADX INFO: renamed from: b */
        public final int f56779b;

        public b(Bitmap bitmap, int i11) {
            this.f56778a = bitmap;
            this.f56779b = i11;
        }
    }

    public C27829m(int i11) {
        this.f56776a = new a(i11);
    }

    @Override // com.squareup.picasso.InterfaceC27820d
    /* JADX INFO: renamed from: a */
    public int mo68847a() {
        return this.f56776a.maxSize();
    }

    @Override // com.squareup.picasso.InterfaceC27820d
    /* JADX INFO: renamed from: b */
    public void mo68848b(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int iM68943i = C27841y.m68943i(bitmap);
        if (iM68943i > mo68847a()) {
            this.f56776a.remove(str);
        } else {
            this.f56776a.put(str, new b(bitmap, iM68943i));
        }
    }

    @Override // com.squareup.picasso.InterfaceC27820d
    @Nullable
    public Bitmap get(@NonNull String str) {
        b bVar = this.f56776a.get(str);
        if (bVar != null) {
            return bVar.f56778a;
        }
        return null;
    }

    @Override // com.squareup.picasso.InterfaceC27820d
    public int size() {
        return this.f56776a.size();
    }
}
