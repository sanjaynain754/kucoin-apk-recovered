package p341ig;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ig.b */
/* JADX INFO: compiled from: ScreenshotDetector.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR/\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001f¨\u0006!"}, m90084d2 = {"Lig/b;", "", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "", TUIConstants.TUIChat.CALL_BACK, "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "g", "()V", CmcdData.Factory.STREAMING_FORMAT_HLS, "Landroid/net/Uri;", "uri", "f", "(Landroid/net/Uri;)V", "", "d", "(Landroid/net/Uri;)Ljava/util/List;", "b", "c", "Landroid/content/ContentResolver;", "Landroid/database/ContentObserver;", "e", "(Landroid/content/ContentResolver;)Landroid/database/ContentObserver;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "Lkotlin/jvm/functions/Function1;", "Landroid/database/ContentObserver;", "contentObserver", "kc_screenshot_callback_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nScreenshotDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotDetector.kt\ncom/kubi/flutter/screenshot_callback/ScreenshotDetector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
public final class C38532b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<String, Unit> callback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ContentObserver contentObserver;

    /* JADX INFO: renamed from: ig.b$a */
    /* JADX INFO: compiled from: ScreenshotDetector.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"ig/b$a", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "(ZLandroid/net/Uri;)V", "kc_screenshot_callback_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nScreenshotDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenshotDetector.kt\ncom/kubi/flutter/screenshot_callback/ScreenshotDetector$registerObserver$contentObserver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            super.onChange(selfChange, uri);
            if (uri != null) {
                C38532b.this.m87172f(uri);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C38532b(@NotNull Context context, @NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.callback = callback;
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m87168b(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_data");
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex);
                Intrinsics.checkNotNull(string);
                if (StringsKt.contains((CharSequence) string, (CharSequence) "screenshot", true)) {
                    arrayList.add(string);
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorQuery, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m87169c(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.context.getContentResolver().query(uri, new String[]{"_display_name", "relative_path"}, null, null, null);
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("relative_path");
            int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(columnIndex2);
                String string2 = cursorQuery.getString(columnIndex);
                Intrinsics.checkNotNull(string);
                boolean zContains = StringsKt.contains((CharSequence) string, (CharSequence) "screenshot", true);
                Intrinsics.checkNotNull(string2);
                if (StringsKt.contains((CharSequence) string2, (CharSequence) "screenshot", true) | zContains) {
                    arrayList.add(string);
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(cursorQuery, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m87170d(Uri uri) {
        try {
            return Build.VERSION.SDK_INT >= 29 ? m87169c(uri) : m87168b(uri);
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: e */
    public final ContentObserver m87171e(ContentResolver contentResolver) {
        a aVar = new a(new Handler(Looper.getMainLooper()));
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: g */
    public final void m87173g() {
        if (this.contentObserver == null) {
            ContentResolver contentResolver = this.context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            this.contentObserver = m87171e(contentResolver);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m87174h() {
        ContentObserver contentObserver = this.contentObserver;
        if (contentObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.contentObserver = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m87172f(Uri uri) {
        List<String> listM87170d = m87170d(uri);
        if (!listM87170d.isEmpty()) {
            this.callback.invoke((String) CollectionsKt.last((List) listM87170d));
        }
    }
}
