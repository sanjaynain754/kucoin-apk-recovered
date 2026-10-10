package com.trtc.tuikit.common.system;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.actions.SearchIntents;
import com.kubi.sdk.util.ProviderAspect;
import dh0.C36686b;
import org.aspectj.lang.InterfaceC43175a;
import tc0.C44930a;

/* JADX INFO: loaded from: classes2.dex */
public class ContextProvider extends ContentProvider {

    /* JADX INFO: renamed from: b */
    public static Context f77477b;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC43175a.a f77478c;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Cursor m79398c(ContextProvider contextProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2, InterfaceC43175a interfaceC43175a) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79396a() {
        C36686b c36686b = new C36686b("ContextProvider.java", ContextProvider.class);
        f77478c = c36686b.m82128h("method-execution", c36686b.m82127g("1", SearchIntents.EXTRA_QUERY, "com.trtc.tuikit.common.system.ContextProvider", "android.net.Uri:[Ljava.lang.String;:java.lang.String:[Ljava.lang.String;:java.lang.String", "uri:projection:selection:selectionArgs:sortOrder", "", "android.database.Cursor"), 36);
    }

    /* JADX INFO: renamed from: b */
    public static Context m79397b() {
        return f77477b;
    }

    /* JADX INFO: renamed from: d */
    public static void m79399d(Context context) {
        if (f77477b != null || context == null) {
            return;
        }
        f77477b = context.getApplicationContext();
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return (Cursor) ProviderAspect.m58515b().m58516c(new C44930a(new Object[]{this, uri, strArr, str, strArr2, str2, C36686b.m82125e(f77478c, this, this, new Object[]{uri, strArr, str, strArr2, str2})}).linkClosureAndJoinPoint(69648));
    }

    static {
        m79396a();
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        m79399d(getContext());
        return false;
    }
}
