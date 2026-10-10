package te0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import androidx.webkit.internal.AssetHelper;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import dev.fluttercommunity.plus.share.ShareSuccessManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.FilesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: te0.d */
/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u0017\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\r2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00105R\u001b\u00109\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00106\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m90084d2 = {"Lte0/d;", "", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "manager", "<init>", "(Landroid/content/Context;Landroid/app/Activity;Ldev/fluttercommunity/plus/share/ShareSuccessManager;)V", "", "o", "(Landroid/app/Activity;)V", "", "text", "subject", "", "withResult", "p", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "paths", "mimeTypes", "q", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "f", "()Landroid/content/Context;", "Landroid/content/Intent;", "intent", "r", "(Landroid/content/Intent;Z)V", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "k", "(Ljava/util/List;)Ljava/util/ArrayList;", "n", "(Ljava/util/List;)Ljava/lang/String;", "mimeType", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/io/File;", "file", "e", "(Ljava/io/File;)Z", "c", "()V", "d", "(Ljava/io/File;)Ljava/io/File;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/Context;", "b", "Landroid/app/Activity;", "Ldev/fluttercommunity/plus/share/ShareSuccessManager;", "Lkotlin/Lazy;", "i", "()Ljava/lang/String;", "providerAuthority", "", "g", "()I", "immutabilityIntentFlags", "j", "()Ljava/io/File;", "shareCacheFolder", "share_plus_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\ndev/fluttercommunity/plus/share/Share\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,249:1\n1855#2:250\n1855#2,2:251\n1856#2:253\n1855#2,2:254\n13579#3,2:256\n*S KotlinDebug\n*F\n+ 1 Share.kt\ndev/fluttercommunity/plus/share/Share\n*L\n142#1:250\n144#1:251,2\n142#1:253\n175#1:254,2\n233#1:256,2\n*E\n"})
public final class C44938d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Activity activity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ShareSuccessManager manager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy providerAuthority;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy immutabilityIntentFlags;

    /* JADX INFO: renamed from: e */
    public final boolean m99373e(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Intrinsics.checkNotNull(canonicalPath);
            String canonicalPath2 = m99378j().getCanonicalPath();
            Intrinsics.checkNotNullExpressionValue(canonicalPath2, "getCanonicalPath(...)");
            return StringsKt.startsWith$default(canonicalPath, canonicalPath2, false, 2, (Object) null);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m99380n(List<String> mimeTypes) {
        int i11 = 1;
        if (mimeTypes != null ? mimeTypes.isEmpty() : true) {
            return "*/*";
        }
        Intrinsics.checkNotNull(mimeTypes);
        if (mimeTypes.size() == 1) {
            return (String) CollectionsKt.first((List) mimeTypes);
        }
        String str = (String) CollectionsKt.first((List) mimeTypes);
        int lastIndex = CollectionsKt.getLastIndex(mimeTypes);
        if (1 <= lastIndex) {
            while (true) {
                if (!Intrinsics.areEqual(str, mimeTypes.get(i11))) {
                    if (!Intrinsics.areEqual(m99376h(str), m99376h(mimeTypes.get(i11)))) {
                        return "*/*";
                    }
                    str = m99376h(mimeTypes.get(i11)) + "/*";
                }
                if (i11 != lastIndex) {
                    i11++;
                }
            }
        }
        return str;
    }

    public C44938d(@NotNull Context context, @Nullable Activity activity, @NotNull ShareSuccessManager manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.context = context;
        this.activity = activity;
        this.manager = manager;
        this.providerAuthority = LazyKt.lazy(new Function0() { // from class: te0.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44938d.m99370m(this.f101328b);
            }
        });
        this.immutabilityIntentFlags = LazyKt.lazy(new Function0() { // from class: te0.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C44938d.m99369l());
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final int m99369l() {
        return 33554432;
    }

    /* JADX INFO: renamed from: m */
    public static final String m99370m(C44938d c44938d) {
        return c44938d.m99374f().getPackageName() + ".flutter.share_provider";
    }

    /* JADX INFO: renamed from: f */
    public final Context m99374f() {
        Activity activity = this.activity;
        if (activity == null) {
            return this.context;
        }
        Intrinsics.checkNotNull(activity);
        return activity;
    }

    /* JADX INFO: renamed from: g */
    public final int m99375g() {
        return ((Number) this.immutabilityIntentFlags.getValue()).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final String m99376h(String mimeType) {
        if (mimeType == null || !StringsKt.contains$default((CharSequence) mimeType, (CharSequence) "/", false, 2, (Object) null)) {
            return ProxyConfig.MATCH_ALL_SCHEMES;
        }
        String strSubstring = mimeType.substring(0, StringsKt.indexOf$default((CharSequence) mimeType, "/", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: i */
    public final String m99377i() {
        return (String) this.providerAuthority.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final File m99378j() {
        return new File(m99374f().getCacheDir(), "share_plus");
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList<Uri> m99379k(List<String> paths) throws IOException {
        ArrayList<Uri> arrayList = new ArrayList<>(paths.size());
        Iterator<T> it = paths.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (m99373e(file)) {
                throw new IOException("Shared file can not be located in '" + m99378j().getCanonicalPath() + '\'');
            }
            arrayList.add(FileProvider.getUriForFile(m99374f(), m99377i(), m99372d(file)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final void m99381o(@Nullable Activity activity) {
        this.activity = activity;
    }

    /* JADX INFO: renamed from: r */
    public final void m99384r(Intent intent, boolean withResult) {
        Activity activity = this.activity;
        if (activity == null) {
            intent.addFlags(268435456);
            if (withResult) {
                this.manager.m82051c();
            }
            this.context.startActivity(intent);
            return;
        }
        if (withResult) {
            Intrinsics.checkNotNull(activity);
            activity.startActivityForResult(intent, 22643);
        } else {
            Intrinsics.checkNotNull(activity);
            activity.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99371c() {
        File fileM99378j = m99378j();
        File[] fileArrListFiles = fileM99378j.listFiles();
        if (fileM99378j.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
            fileM99378j.delete();
        }
    }

    /* JADX INFO: renamed from: d */
    public final File m99372d(File file) throws IOException {
        File fileM99378j = m99378j();
        if (!fileM99378j.exists()) {
            fileM99378j.mkdirs();
        }
        File file2 = new File(fileM99378j, file.getName());
        FilesKt.copyTo$default(file, file2, true, 0, 4, null);
        return file2;
    }

    /* JADX INFO: renamed from: p */
    public final void m99382p(@NotNull String text, @Nullable String subject, boolean withResult) {
        Intent intentCreateChooser;
        Intrinsics.checkNotNullParameter(text, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, subject);
        if (withResult) {
            intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) SharePlusPendingIntent.class), 134217728 | m99375g()).getIntentSender());
        } else {
            intentCreateChooser = Intent.createChooser(intent, null);
        }
        Intrinsics.checkNotNull(intentCreateChooser);
        m99384r(intentCreateChooser, withResult);
    }

    /* JADX INFO: renamed from: q */
    public final void m99383q(@NotNull List<String> paths, @Nullable List<String> mimeTypes, @Nullable String text, @Nullable String subject, boolean withResult) throws IOException {
        Intent intentCreateChooser;
        String str;
        Intrinsics.checkNotNullParameter(paths, "paths");
        m99371c();
        ArrayList<Uri> arrayListM99379k = m99379k(paths);
        Intent intent = new Intent();
        if (arrayListM99379k.isEmpty() && text != null && !StringsKt.isBlank(text)) {
            m99382p(text, subject, withResult);
            return;
        }
        if (arrayListM99379k.size() == 1) {
            if (mimeTypes != null && !mimeTypes.isEmpty()) {
                str = (String) CollectionsKt.first((List) mimeTypes);
            } else {
                str = "*/*";
            }
            intent.setAction("android.intent.action.SEND");
            intent.setType(str);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) CollectionsKt.first((List) arrayListM99379k));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.setType(m99380n(mimeTypes));
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListM99379k);
        }
        if (text != null) {
            intent.putExtra("android.intent.extra.TEXT", text);
        }
        if (subject != null) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, subject);
        }
        intent.addFlags(1);
        if (withResult) {
            intentCreateChooser = Intent.createChooser(intent, null, PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, (Class<?>) SharePlusPendingIntent.class), 134217728 | m99375g()).getIntentSender());
        } else {
            intentCreateChooser = Intent.createChooser(intent, null);
        }
        List<ResolveInfo> listQueryIntentActivities = m99374f().getPackageManager().queryIntentActivities(intentCreateChooser, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str2 = ((ResolveInfo) it.next()).activityInfo.packageName;
            Iterator<T> it2 = arrayListM99379k.iterator();
            while (it2.hasNext()) {
                m99374f().grantUriPermission(str2, (Uri) it2.next(), 3);
            }
        }
        Intrinsics.checkNotNull(intentCreateChooser);
        m99384r(intentCreateChooser, withResult);
    }
}
