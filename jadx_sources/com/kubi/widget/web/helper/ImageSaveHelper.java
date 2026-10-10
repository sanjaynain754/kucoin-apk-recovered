package com.kubi.widget.web.helper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.kubi.resources.MenuItem;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.utils.ToastCompat;
import com.kubi.widget.web.R$drawable;
import com.kubi.widget.web.R$string;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Maybe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ImageSaveHelper.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0006\u0010\u0015\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/widget/web/helper/ImageSaveHelper;", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "<init>", "(Lcom/kubi/sdk/BaseActivity;)V", "downloadDisposable", "Lio/reactivex/disposables/Disposable;", "setupLongClickListener", "", "webView", "Landroid/webkit/WebView;", "showSaveImageDialog", "imageUrl", "", "saveImageToAlbum", "downloadAndSaveImage", "downloadImage", "Landroid/graphics/Bitmap;", "saveBitmapToAlbum", "bitmap", "onDestroy", "Companion", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageSaveHelper {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f55147c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseActivity f55148a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Disposable f55149b;

    /* JADX INFO: compiled from: ImageSaveHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/widget/web/helper/ImageSaveHelper$Companion;", "", "<init>", "()V", "TAG", "", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public ImageSaveHelper(@NotNull BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f55148a = activity;
    }

    /* JADX INFO: renamed from: k */
    public static final void m67249k(ImageSaveHelper imageSaveHelper) {
        ToastCompat.m66441G(imageSaveHelper.f55148a.getString(R$string.web_save_image_failed), new Object[0]);
        C44128b.m97261e("ImageSaveHelper", "Download image error: download null");
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m67251m(ImageSaveHelper imageSaveHelper, Bitmap bitmap) throws Throwable {
        if (bitmap != null) {
            imageSaveHelper.m67261s(bitmap);
        } else {
            ToastCompat.m66441G(imageSaveHelper.f55148a.getString(R$string.web_save_image_failed), new Object[0]);
            C44128b.m97261e("ImageSaveHelper", "Download image failed: bitmap is null");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m67253o(ImageSaveHelper imageSaveHelper, Throwable th2) {
        ToastCompat.m66441G(imageSaveHelper.f55148a.getString(R$string.web_save_image_failed), new Object[0]);
        C44128b.m97262f("ImageSaveHelper", "Download image error: " + th2.getMessage(), th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m67255v(ImageSaveHelper imageSaveHelper, View view) {
        String extra;
        WebView webView = view instanceof WebView ? (WebView) view : null;
        WebView.HitTestResult hitTestResult = webView != null ? webView.getHitTestResult() : null;
        Integer numValueOf = hitTestResult != null ? Integer.valueOf(hitTestResult.getType()) : null;
        if (((numValueOf == null || numValueOf.intValue() != 5) && (numValueOf == null || numValueOf.intValue() != 8)) || (extra = hitTestResult.getExtra()) == null || extra.length() == 0) {
            return false;
        }
        C44128b.m97259c("ImageSaveHelper", "Long press on image: " + extra);
        imageSaveHelper.m67264w(extra);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m67258j(final String str) {
        ToastCompat.m66441G(this.f55148a.getString(R$string.web_save_image_downloading), new Object[0]);
        Disposable disposable = this.f55149b;
        if (disposable != null) {
            disposable.dispose();
        }
        Maybe maybeObserveOn = Maybe.fromCallable(new Callable() { // from class: com.kubi.widget.web.helper.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ImageSaveHelper.m67250l(this.f55172b, str);
            }
        }).subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.widget.web.helper.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageSaveHelper.m67251m(this.f55174b, (Bitmap) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.widget.web.helper.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ImageSaveHelper.m67252n(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.widget.web.helper.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageSaveHelper.m67253o(this.f55176b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = maybeObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.widget.web.helper.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ImageSaveHelper.m67254p(function2, obj);
            }
        }, new Action() { // from class: com.kubi.widget.web.helper.k
            @Override // io.reactivex.functions.Action
            public final void run() {
                ImageSaveHelper.m67249k(this.f55178b);
            }
        });
        this.f55149b = disposableSubscribe;
        if (disposableSubscribe != null) {
            DisposableKt.addTo(disposableSubscribe, this.f55148a.getDestroyDisposable());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0043: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:68), block:B:14:0x0043 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX INFO: renamed from: q */
    public final Bitmap m67259q(String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            try {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
                Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                str = (HttpURLConnection) uRLConnection;
                try {
                    str.setConnectTimeout(10000);
                    str.setReadTimeout(10000);
                    str.setDoInput(true);
                    str.connect();
                    if (str.getResponseCode() != 200) {
                        C44128b.m97261e("ImageSaveHelper", "Download image failed, response code: " + str.getResponseCode());
                        str.disconnect();
                        return null;
                    }
                    inputStream = str.getInputStream();
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        str.disconnect();
                        return bitmapDecodeStream;
                    } catch (Exception e11) {
                        e = e11;
                        C44128b.m97262f("ImageSaveHelper", "Download image exception: " + e.getMessage(), e);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (str != 0) {
                            str.disconnect();
                        }
                        return null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (str != 0) {
                        str.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream3 = inputStream2;
            }
        } catch (Exception e13) {
            e = e13;
            str = 0;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m67260r() {
        Disposable disposable = this.f55149b;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f55149b = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m67261s(Bitmap bitmap) throws Throwable {
        try {
            String str = "kucoin_" + System.currentTimeMillis() + ".jpg";
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/jpeg");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/KuCoin");
                contentValues.put("is_pending", (Integer) 1);
            }
            ContentResolver contentResolver = this.f55148a.getContentResolver();
            Uri uriInsert = contentResolver.insert(i11 >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                throw new Exception("Failed to create MediaStore entry");
            }
            OutputStream outputStream = null;
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                try {
                    if (outputStreamOpenOutputStream == null) {
                        throw new Exception("Failed to open output stream");
                    }
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStreamOpenOutputStream);
                    outputStreamOpenOutputStream.flush();
                    if (i11 >= 29) {
                        contentValues.clear();
                        contentValues.put("is_pending", (Integer) 0);
                        contentResolver.update(uriInsert, contentValues, null, null);
                    }
                    ToastCompat.m66441G(this.f55148a.getString(R$string.web_save_image_success), new Object[0]);
                    C44128b.m97259c("ImageSaveHelper", "Image saved successfully to MediaStore: " + uriInsert);
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStreamOpenOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            ToastCompat.m66441G(this.f55148a.getString(R$string.web_save_image_failed), new Object[0]);
            C44128b.m97262f("ImageSaveHelper", "Save bitmap exception: " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m67264w(final String str) {
        int i11 = R$drawable.ic2_appdownload_24;
        String string = this.f55148a.getString(R$string.web_save_image_to_album);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final List listListOf = CollectionsKt.listOf(new MenuItem(0, i11, string, new BiConsumer() { // from class: com.kubi.widget.web.helper.d
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImageSaveHelper.m67256x(this.f55169b, str, (Integer) obj, (BaseQuickAdapter) obj2);
            }
        }, null, false, 48, null));
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.dialog_bottom_menu_layout, true).m54237f4(new Function2() { // from class: com.kubi.widget.web.helper.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ImageSaveHelper.m67257y(listListOf, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager supportFragmentManager = this.f55148a.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(supportFragmentManager, "save_image_dialog");
    }

    /* JADX INFO: renamed from: l */
    public static final Bitmap m67250l(ImageSaveHelper imageSaveHelper, String str) {
        return imageSaveHelper.m67259q(str);
    }

    /* JADX INFO: renamed from: n */
    public static final void m67252n(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p */
    public static final void m67254p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final void m67256x(ImageSaveHelper imageSaveHelper, String str, Integer num, BaseQuickAdapter baseQuickAdapter) {
        imageSaveHelper.m67262t(str);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m67257y(List list, BaseViewHolder viewHolder, DialogFragmentHelper dialog) {
        LinearLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 1);
        ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.gravity = 1;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(new ImageSaveHelper$showSaveImageDialog$1$1$2(list, dialog, R$layout.item_grid_menu_view));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public final void m67262t(String str) {
        m67258j(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m67263u(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.kubi.widget.web.helper.c
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ImageSaveHelper.m67255v(this.f55168b, view);
            }
        });
    }
}
