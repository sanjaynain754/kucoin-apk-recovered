package com.kubi.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.kubi.sdk.res.R$mipmap;
import p419l2.C42032f;
import p419l2.InterfaceC42031e;
import p445m2.InterfaceC42399j;
import p680v1.AbstractC45352c;
import p778xy.C46338a;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.v */
/* JADX INFO: compiled from: GlideUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class C24277v {

    /* JADX INFO: renamed from: com.kubi.sdk.util.v$a */
    /* JADX INFO: compiled from: GlideUtils.java */
    /* JADX INFO: loaded from: classes43.dex */
    public class a implements InterfaceC42031e<Bitmap> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b f48277b;

        public a(b bVar) {
            this.f48277b = bVar;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20017b(Bitmap bitmap, Object obj, InterfaceC42399j<Bitmap> interfaceC42399j, DataSource dataSource, boolean z11) {
            b bVar = this.f48277b;
            if (bVar == null) {
                return false;
            }
            bVar.mo29703a(true, null);
            return false;
        }

        @Override // p419l2.InterfaceC42031e
        /* JADX INFO: renamed from: d */
        public boolean mo20018d(@Nullable GlideException glideException, Object obj, InterfaceC42399j<Bitmap> interfaceC42399j, boolean z11) {
            b bVar = this.f48277b;
            if (bVar != null) {
                bVar.mo29703a(false, glideException);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.v$b */
    /* JADX INFO: compiled from: GlideUtils.java */
    /* JADX INFO: loaded from: classes43.dex */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo29703a(boolean z11, @Nullable GlideException glideException);
    }

    /* JADX INFO: renamed from: g */
    public static void m58542g(ImageView imageView, String str) {
        m58543h(null, imageView, str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m58537b(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof FragmentActivity) {
            return m58536a((Activity) context);
        }
        if (context instanceof Activity) {
            return m58536a((Activity) context);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m58543h(@Nullable Fragment fragment, ImageView imageView, String str) {
        if (fragment == null || !fragment.isAdded()) {
            C46338a.m102151a(imageView.getContext()).mo6634v(str).mo92186a0(200, 200).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(imageView);
        } else {
            C46338a.m102153c(fragment).mo6634v(str).mo92186a0(200, 200).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m58536a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m58538c(Context context, String str, ImageView imageView, @DrawableRes int i11, boolean z11, boolean z12, b bVar) {
        if (m58537b(context)) {
            AbstractC45352c abstractC45352c = AbstractC45352c.f101958e;
            if (z12) {
                abstractC45352c = AbstractC45352c.f101955b;
            }
            C46338a.m102151a(context).mo6621d().mo6601L0(str).mo92207l0(z11).mo92200i(abstractC45352c).mo6608s0(new a(bVar)).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(i11).mo92208m(i11)).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m58539d(Context context, @DrawableRes int i11, ImageView imageView) {
        if (m58537b(context)) {
            C46338a.m102151a(context).mo6632t(Integer.valueOf(i11)).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m58540e(Context context, String str, ImageView imageView) {
        if (m58537b(context)) {
            try {
                C46338a.m102151a(context).mo6634v(str).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(imageView);
            } catch (IllegalArgumentException e11) {
                C44128b.m97264h(e11);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m58541f(ImageView imageView, String str, @DrawableRes int i11) {
        C46338a.m102151a(imageView.getContext()).mo6634v(str).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(i11)).m6594E0(imageView);
    }
}
