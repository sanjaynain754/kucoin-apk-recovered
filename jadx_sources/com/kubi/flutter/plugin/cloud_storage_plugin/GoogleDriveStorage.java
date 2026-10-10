package com.kubi.flutter.plugin.cloud_storage_plugin;

import android.content.Context;
import android.content.Intent;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GoogleDriveStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001d*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Lcom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "", "c", "(Landroid/content/Context;)Z", "Landroid/content/Intent;", "j", "(Landroid/content/Context;)Landroid/content/Intent;", "data", "Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;", "e", "(Landroid/content/Context;Landroid/content/Intent;)Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;", "helper", "", "key", "value", "i", "(Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", JAnalysisConstants.Account.KEY_ACCOUNT, "d", "(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Lcom/kubi/flutter/plugin/cloud_storage_plugin/c;", "", "Lcom/google/api/services/drive/model/File;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Ljava/util/List;Ljava/lang/String;)Lcom/google/api/services/drive/model/File;", "g", "(Ljava/util/List;)Lcom/google/api/services/drive/model/File;", "cloud_storage_plugin_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleDriveStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleDriveStorage.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n295#2,2:128\n295#2,2:130\n*S KotlinDebug\n*F\n+ 1 GoogleDriveStorage.kt\ncom/kubi/flutter/plugin/cloud_storage_plugin/GoogleDriveStorage\n*L\n120#1:128,2\n124#1:130,2\n*E\n"})
public final class GoogleDriveStorage {
    /* JADX INFO: renamed from: c */
    public final boolean m23878c(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(ctx.getApplicationContext()) == 0;
        } catch (Throwable th2) {
            C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C12632c m23879d(Context ctx, GoogleSignInAccount account) {
        GoogleAccountCredential googleAccountCredentialUsingOAuth2 = GoogleAccountCredential.usingOAuth2(ctx, SetsKt.setOf("https://www.googleapis.com/auth/drive.appdata"));
        googleAccountCredentialUsingOAuth2.setSelectedAccount(account.getAccount());
        Drive driveBuild = new Drive.Builder(new NetHttpTransport(), new GsonFactory(), googleAccountCredentialUsingOAuth2).setApplicationName(ctx.getPackageName()).build();
        Intrinsics.checkNotNull(driveBuild);
        return new C12632c(driveBuild);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C12632c m23880e(@NotNull Context ctx, @Nullable Intent data) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(data);
            Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
            GoogleSignInAccount result = signedInAccountFromIntent.getResult(ApiException.class);
            Intrinsics.checkNotNull(result);
            return m23879d(ctx, result);
        } catch (Throwable th2) {
            C12631b.f22061a.m23888a(th2, "CloudStoragePlugin");
            return null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Intent m23885j(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        GoogleSignInOptions googleSignInOptionsBuild = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(new Scope("https://www.googleapis.com/auth/drive.appdata"), new Scope[0]).requestEmail().build();
        Intrinsics.checkNotNullExpressionValue(googleSignInOptionsBuild, "build(...)");
        Intent signInIntent = GoogleSignIn.getClient(ctx, googleSignInOptionsBuild).getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
        return signInIntent;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m23881f(@NotNull C12632c c12632c, @NotNull String str, @NotNull Continuation<? super String> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new GoogleDriveStorage$getCloudStorageByDrive$2(c12632c, this, str, null), continuation);
    }

    /* JADX INFO: renamed from: g */
    public final File m23882g(List<File> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            File file = (File) next;
            if (Intrinsics.areEqual(file.getName(), "KCStorageBackups") && Intrinsics.areEqual(file.getMimeType(), "application/vnd.google-apps.folder")) {
                return (File) next;
            }
        }
        next = null;
        return (File) next;
    }

    /* JADX INFO: renamed from: h */
    public final File m23883h(List<File> list, String str) {
        Object next;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            File file = (File) next;
            if (Intrinsics.areEqual(file.getName(), str + ".json") && Intrinsics.areEqual(file.getMimeType(), "application/json")) {
                return (File) next;
            }
        }
        next = null;
        return (File) next;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m23884i(@NotNull C12632c c12632c, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new GoogleDriveStorage$setCloudStorageByDrive$2(c12632c, this, str, str2, null), continuation);
    }
}
