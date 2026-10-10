package com.kubi.credential.jetpack;

import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePasswordRequest;
import androidx.credentials.CreatePasswordResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.credential.exception.CreateCredentialException;
import com.kubi.credential.exception.GetCredentialException;
import com.kubi.credential.utils.ProtocolUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p230ef.AbstractC37150a;
import p230ef.AbstractC37151b;
import p230ef.AbstractC37156g;
import p230ef.AbstractC37157h;
import p230ef.C37152c;
import p230ef.C37153d;
import p230ef.C37154e;
import p230ef.C37155f;
import p230ef.C37158i;
import p230ef.C37159j;
import p230ef.C37160k;
import p230ef.C37161l;
import p230ef.C37162m;
import p230ef.C37163n;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.credential.jetpack.b */
/* JADX INFO: compiled from: JetpackConverter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m90084d2 = {"Lef/a;", "Landroidx/credentials/CreateCredentialRequest;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lef/a;)Landroidx/credentials/CreateCredentialRequest;", "Landroidx/credentials/CreateCredentialResponse;", "Lef/b;", "e", "(Landroidx/credentials/CreateCredentialResponse;)Lef/b;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Lcom/kubi/credential/exception/CreateCredentialException;", "d", "(Landroidx/credentials/exceptions/CreateCredentialException;)Lcom/kubi/credential/exception/CreateCredentialException;", "Lef/h;", "Landroidx/credentials/CredentialOption;", "b", "(Lef/h;)Landroidx/credentials/CredentialOption;", "Lef/i;", "Landroidx/credentials/GetCredentialRequest;", "c", "(Lef/i;)Landroidx/credentials/GetCredentialRequest;", "Landroidx/credentials/Credential;", "Lef/g;", "f", "(Landroidx/credentials/Credential;)Lef/g;", "Landroidx/credentials/GetCredentialResponse;", "Lef/j;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroidx/credentials/GetCredentialResponse;)Lef/j;", "Landroidx/credentials/exceptions/GetCredentialException;", "Lcom/kubi/credential/exception/GetCredentialException;", "g", "(Landroidx/credentials/exceptions/GetCredentialException;)Lcom/kubi/credential/exception/GetCredentialException;", "credential_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJetpackConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JetpackConverter.kt\ncom/kubi/credential/jetpack/JetpackConverterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1549#2:147\n1620#2,3:148\n*S KotlinDebug\n*F\n+ 1 JetpackConverter.kt\ncom/kubi/credential/jetpack/JetpackConverterKt\n*L\n100#1:147\n100#1:148,3\n*E\n"})
public final class C12470b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CreateCredentialRequest m23428a(@NotNull AbstractC37150a abstractC37150a) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(abstractC37150a, "<this>");
        if (abstractC37150a instanceof C37154e) {
            C37154e c37154e = (C37154e) abstractC37150a;
            return new CreatePublicKeyCredentialRequest(c37154e.getRequestJson(), c37154e.getClientDataHash(), abstractC37150a.getPreferImmediatelyAvailableCredentials(), abstractC37150a.getOrigin(), abstractC37150a.getIsAutoSelectAllowed());
        }
        if (!(abstractC37150a instanceof C37152c)) {
            throw new ClassNotFoundException(abstractC37150a.getClass().getCanonicalName() + " is not support");
        }
        C37152c c37152c = (C37152c) abstractC37150a;
        return new CreatePasswordRequest(c37152c.getId(), c37152c.getPassword(), abstractC37150a.getOrigin(), c37152c.getPreferDefaultProvider(), abstractC37150a.getPreferImmediatelyAvailableCredentials(), abstractC37150a.getIsAutoSelectAllowed());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final CredentialOption m23429b(@NotNull AbstractC37157h abstractC37157h) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(abstractC37157h, "<this>");
        if (abstractC37157h instanceof C37161l) {
            C37161l c37161l = (C37161l) abstractC37157h;
            return new GetPublicKeyCredentialOption(c37161l.getRequestJson(), c37161l.getClientDataHash(), abstractC37157h.m83125a());
        }
        if (abstractC37157h instanceof C37160k) {
            C37160k c37160k = (C37160k) abstractC37157h;
            return new GetPasswordOption(c37160k.m83132b(), c37160k.getIsAutoSelectAllowed(), abstractC37157h.m83125a());
        }
        throw new ClassNotFoundException(abstractC37157h.getClass().getCanonicalName() + " is not support");
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final GetCredentialRequest m23430c(@NotNull C37158i c37158i) {
        Intrinsics.checkNotNullParameter(c37158i, "<this>");
        List<AbstractC37157h> listM83126a = c37158i.m83126a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM83126a, 10));
        Iterator<T> it = listM83126a.iterator();
        while (it.hasNext()) {
            arrayList.add(m23429b((AbstractC37157h) it.next()));
        }
        return new GetCredentialRequest(arrayList, c37158i.getOrigin(), c37158i.getPreferIdentityDocUi(), c37158i.getPreferUiBrandingComponentName(), c37158i.getPreferImmediatelyAvailableCredentials());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final CreateCredentialException m23431d(@NotNull androidx.credentials.exceptions.CreateCredentialException createCredentialException) {
        Intrinsics.checkNotNullParameter(createCredentialException, "<this>");
        return new CreateCredentialException(createCredentialException.getType(), createCredentialException.getErrorMessage(), createCredentialException);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final AbstractC37151b m23432e(@NotNull CreateCredentialResponse createCredentialResponse) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(createCredentialResponse, "<this>");
        if (createCredentialResponse instanceof CreatePublicKeyCredentialResponse) {
            return new C37155f(ProtocolUtils.m23468f(((CreatePublicKeyCredentialResponse) createCredentialResponse).getRegistrationResponseJson()));
        }
        if (createCredentialResponse instanceof CreatePasswordResponse) {
            return new C37153d();
        }
        throw new ClassNotFoundException(createCredentialResponse.getClass().getCanonicalName() + " is not support");
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final AbstractC37156g m23433f(@NotNull Credential credential) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(credential, "<this>");
        if (credential instanceof PublicKeyCredential) {
            return new C37163n(ProtocolUtils.m23466d(((PublicKeyCredential) credential).getAuthenticationResponseJson()));
        }
        if (credential instanceof PasswordCredential) {
            PasswordCredential passwordCredential = (PasswordCredential) credential;
            return new C37162m(passwordCredential.getId(), passwordCredential.getPassword());
        }
        throw new ClassNotFoundException(credential.getClass().getCanonicalName() + " is not support");
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final GetCredentialException m23434g(@NotNull androidx.credentials.exceptions.GetCredentialException getCredentialException) {
        Intrinsics.checkNotNullParameter(getCredentialException, "<this>");
        return new GetCredentialException(getCredentialException.getType(), getCredentialException.getErrorMessage(), getCredentialException);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final C37159j m23435h(@NotNull GetCredentialResponse getCredentialResponse) {
        Intrinsics.checkNotNullParameter(getCredentialResponse, "<this>");
        return new C37159j(m23433f(getCredentialResponse.getCredential()));
    }
}
