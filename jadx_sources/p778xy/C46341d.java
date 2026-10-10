package p778xy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.ComponentCallbacks2C5314h;
import java.io.File;
import p280g2.C37790c;
import p329i2.InterfaceC38420l;
import p329i2.InterfaceC38425q;
import p419l2.C42032f;

/* JADX INFO: renamed from: xy.d */
/* JADX INFO: compiled from: GlideRequests.java */
/* JADX INFO: loaded from: classes12.dex */
public class C46341d extends ComponentCallbacks2C5314h {
    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    /* JADX INFO: renamed from: A */
    public void mo6616A(@NonNull C42032f c42032f) {
        if (c42032f instanceof C46339b) {
            super.mo6616A(c42032f);
        } else {
            super.mo6616A(new C46339b().mo6606a(c42032f));
        }
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public <ResourceType> C46340c<ResourceType> mo6620b(@NonNull Class<ResourceType> cls) {
        return new C46340c<>(this.f6714b, this, cls, this.f6715c);
    }

    public C46341d(@NonNull ComponentCallbacks2C5309c componentCallbacks2C5309c, @NonNull InterfaceC38420l interfaceC38420l, @NonNull InterfaceC38425q interfaceC38425q, @NonNull Context context) {
        super(componentCallbacks2C5309c, interfaceC38420l, interfaceC38425q, context);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C46340c<Bitmap> mo6621d() {
        return (C46340c) super.mo6621d();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public C46340c<Drawable> mo6622j() {
        return (C46340c) super.mo6622j();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C46340c<File> mo6623k() {
        return (C46340c) super.mo6623k();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public C46340c<C37790c> mo6624l() {
        return (C46340c) super.mo6624l();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public C46340c<File> mo6627o() {
        return (C46340c) super.mo6627o();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C46340c<Drawable> mo6631s(@Nullable File file) {
        return (C46340c) super.mo6631s(file);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C46340c<Drawable> mo6632t(@Nullable @DrawableRes @RawRes Integer num) {
        return (C46340c) super.mo6632t(num);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public C46340c<Drawable> mo6633u(@Nullable Object obj) {
        return (C46340c) super.mo6633u(obj);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C5314h
    @NonNull
    @CheckResult
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public C46340c<Drawable> mo6634v(@Nullable String str) {
        return (C46340c) super.mo6634v(str);
    }
}
