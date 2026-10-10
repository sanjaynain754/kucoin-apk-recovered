package com.kubi.credential.jetpack;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.credentials.C2293x;
import androidx.credentials.CredentialProvider;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.model.CredentialType;
import com.kubi.credential.utils.C12483b;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.credential.jetpack.c */
/* JADX INFO: compiled from: JetpackSupportHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\b\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/kubi/credential/model/CredentialType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/util/List;", "b", "c", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C12471c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12471c f21328a = new C12471c();

    /* JADX INFO: renamed from: com.kubi.credential.jetpack.c$a */
    /* JADX INFO: compiled from: JetpackSupportHelper.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @RequiresApi(19)
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/kubi/credential/model/CredentialType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/util/List;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<CredentialType> m23437a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context).m23439a() ? CollectionsKt.mutableListOf(CredentialType.PASSWORD, CredentialType.FEDERATE_CREDENTIAL) : CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.kubi.credential.jetpack.c$b */
    /* JADX INFO: compiled from: JetpackSupportHelper.kt */
    @RequiresApi(28)
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/kubi/credential/model/CredentialType;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/util/List;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class b {
        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<CredentialType> m23438a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context).m23439a() ? CollectionsKt.mutableListOf(CredentialType.PASSWORD, CredentialType.PASSKEYS, CredentialType.FEDERATE_CREDENTIAL) : CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.kubi.credential.jetpack.c$c */
    /* JADX INFO: compiled from: JetpackSupportHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0007\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c$c;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "Landroid/content/Context;", "b", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: com.kubi.credential.jetpack.c$c$a */
        /* JADX INFO: compiled from: JetpackSupportHelper.kt */
        /* JADX INFO: loaded from: classes9.dex */
        @RequiresApi(19)
        @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0004\u0018\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c$c$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)Z", "Landroidx/credentials/CredentialProvider;", "d", "(Landroid/content/Context;)Landroidx/credentials/CredentialProvider;", "", "", "classNames", "b", "(Ljava/util/List;Landroid/content/Context;)Landroidx/credentials/CredentialProvider;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/util/List;", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class a {
            /* JADX INFO: renamed from: c */
            public final boolean m23442c(@NotNull Context context) throws PackageManager.NameNotFoundException {
                Intrinsics.checkNotNullParameter(context, "context");
                CredentialProvider credentialProviderM23443d = m23443d(context);
                return credentialProviderM23443d != null && credentialProviderM23443d.isAvailableOnDevice();
            }

            /* JADX INFO: renamed from: a */
            public final List<String> m23440a(Context context) throws PackageManager.NameNotFoundException {
                String string;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
                ArrayList arrayList = new ArrayList();
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                if (serviceInfoArr != null) {
                    Intrinsics.checkNotNullExpressionValue(serviceInfoArr, "packageInfo.services");
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        Bundle bundle = serviceInfo.metaData;
                        if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                            arrayList.add(string);
                        }
                    }
                }
                return CollectionsKt.toList(arrayList);
            }

            /* JADX INFO: renamed from: b */
            public final CredentialProvider m23441b(List<String> classNames, Context context) {
                CredentialProvider credentialProvider;
                Iterator<String> it = classNames.iterator();
                CredentialProvider credentialProvider2 = null;
                while (it.hasNext()) {
                    try {
                        Object objNewInstance = Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                        if (objNewInstance instanceof CredentialProvider) {
                            credentialProvider = (CredentialProvider) objNewInstance;
                        } else {
                            credentialProvider = null;
                        }
                        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
                            if (credentialProvider2 != null) {
                                C44128b.m97261e("CredentialSupportUtils", "Only one active OEM CredentialProvider allowed");
                                return null;
                            }
                            credentialProvider2 = credentialProvider;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return credentialProvider2;
            }

            /* JADX INFO: renamed from: d */
            public final CredentialProvider m23443d(Context context) throws PackageManager.NameNotFoundException {
                List<String> listM23440a = m23440a(context);
                if (listM23440a.isEmpty()) {
                    return null;
                }
                return m23441b(listM23440a, context);
            }
        }

        /* JADX INFO: renamed from: com.kubi.credential.jetpack.c$c$b */
        /* JADX INFO: compiled from: JetpackSupportHelper.kt */
        @RequiresApi(28)
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/credential/jetpack/c$c$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Z", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class b {
            /* JADX INFO: renamed from: a */
            public final boolean m23444a(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                Object systemService = context.getSystemService(URLCredentialContract.FeedEntry.TABLE_NAME);
                return (C12472d.m23445a(systemService) ? C2293x.m2789a(systemService) : null) != null || new a().m23442c(context);
            }
        }

        public c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23439a() {
            try {
                Result.Companion companion = Result.INSTANCE;
                return C12483b.m23471a() >= 34 ? new b().m23444a(this.context) : new a().m23442c(this.context);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Object objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                Boolean bool = Boolean.FALSE;
                if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                    objM103844constructorimpl = bool;
                }
                return ((Boolean) objM103844constructorimpl).booleanValue();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<CredentialType> m23436a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C12483b.m23471a() >= 28 ? new b().m23438a(context) : new a().m23437a(context);
    }
}
